# CLAUDE.md

TDT4250 (Model-Driven Development) final project, NTNU, autumn 2026, group 6. A DSL for the **game
modes** of *Rango Unchained* (a libGDX Bubble Trouble clone). An edition is written in `.rango`,
validated, and generated into `rango-game/`. Read `README.md` for the full architecture before
non-trivial work. It is also graded, so keep it in sync with the code.

## Goal and scope

The goal is to model **one variability aspect, game modes**, using MDE. Model game modes in their
entirety: everything that makes one mode differ from another belongs in the metamodel and must reach
the game. This includes the campaign and its levels. Anything that does not vary between game modes stays out of the DSL. This includes
rendering, sound, animation, menus beyond the mode list, multiplayer, and the user and score system.
If a request drifts outside game modes, point it out and ask before doing it.

## Domain glossary

- **Edition**: one instance of the application (a product). It contains one or more game modes and
  the building blocks they share. Each `.rango` file describes one edition.
- **Game mode**: a way to play the game.
  - *Campaign* contains several different levels.
  - *Endless* contains waves of enemies.
  - Other modes are defined by their rules, arena, spawning, and win/lose conditions.
- **Level**: one stage of a campaign.
- **Wave**: a group of enemies spawned together. Waves can loop and escalate in endless play.
- **Arena**: the place in the game where the battle is fought: the background, the player start,
  and the obstacles.
- **Pop**: hitting an enemy (with the tongue). Popping can split the enemy into fragments, and scores
  points.
- **Power-up**: an item that can drop when an enemy is popped and that applies effects to the
  player.
- **Drop table**: the drop chance and power-up weights for one enemy type. Drop rates depend on
  **which enemy is popped** and **which game mode** you are in. A mode's own tables replace the
  edition's defaults.

## How to work

- **Ask when unsure.** Use AskUserQuestion before guessing about domain semantics, game behaviour,
  naming, or scope. Always ask before you:
  - change the structure of `gamemode.ecore` (classes, containment, references, multiplicities),
  - rename DSL keywords or change the meaning of the three example editions,
  - add a dependency, plug-in, or build step,
  - touch game code outside `rango-game/core/.../Modes/` and its small existing hooks.
- **Challenge the request.** If a request makes the metamodel worse (redundancy, enum-in-disguise,
  artificial constraints), say so and propose the better model before implementing.
- **Minimal, but best.** Find the smallest change that fully solves the problem end-to-end. Don't add
  speculative abstraction, options nobody asked for, or "while I'm here" refactors. Prefer deriving a
  value over storing it, and reusing a derived feature over recomputing it in a template.
- **State assumptions** in one line when you proceed without asking.
- Never commit, push, or regenerate the game into `rango-game/` unless asked.

## Code style

- Match the surrounding file: tabs in plug-in code, Java 21 (records, pattern matching, `var` where
  the file uses it), Xtend for templates and the formatter.
- Minimal comments. Comment only *why* or a non-obvious domain rule, never *what*. Keep existing
  Javadoc on public API short. The only required comment in generated files is the
  "Generated from X. Do not edit" header.
- No dead code, no commented-out code, no unused imports, no `TODO`s left behind.
- Names follow the domain vocabulary of the metamodel (`EnemyType`, `SplitRule`, `DropTable`...),
  and the same name is used across Ecore, grammar, generator, and runtime.

## The end-to-end rule (most important)

The grade rewards a **consistent chain**. A concept that exists in one layer but not the others costs
points. When you add or change a metamodel concept, carry it through every layer, in this order:

1. `gamemode.ecore`: type, multiplicity, containment vs. reference, abstract/inheritance, and OCL
   invariants for single-object rules.
2. Regenerate the model code from `gamemode.genmodel`. Hand-written EMF code is `@generated NOT`.
   Derived features go in `GamemodeDerivations`, cross-object constraints in `GamemodeConstraints`
   (with a stable diagnostic code).
3. `RangoMode.xtext`: domain-readable syntax, then run `GenerateRangoMode.mwe2`.
4. Editor: scoping, validation, quick fixes (by issue code), hovers, outline/labels, content assist,
   templates, and the formatter, as far as each one applies to the concept.
5. Generator (`RangoModeGenerator`, `ModeClassTemplate`, `ArenaTemplate`) and, if needed, the
   hand-written runtime in `rango-game/core/.../Modes/`.
6. At least one example in `no.ntnu.tdt4250.rango.gamemode.examples/` uses it. The coverage test
   requires all three examples together to use every concrete class, feature, and enum literal.
7. Tests: one test per constraint, each breaking exactly that rule on a valid fixture. Add generator
   tests for the new output.
8. `README.md` (metamodel, constraints, derived features, generated files) and `docs/metamodel.puml`
   / `.png`.

If a step does not apply, say why. Don't silently skip it.

## Eclipse modeling practices

**Metamodel**
- Use containment for ownership (deleting the owner deletes the child) and plain references for
  sharing. Use `eOpposite` only when both directions are actually navigated.
- Give every attribute a type and every feature explicit bounds. Use `0..1` vs `1` deliberately.
- Model variation as subclasses of an abstract class when the variants carry different data or
  behaviour. Use an enum only for a closed set of labels without behaviour.
- Never store what can be derived. Use `derived`, `transient`, `volatile` features instead.
- Constraints must be real domain rules ("a mode must be winnable"), not artificial ones. Use OCL for
  single-object invariants and Java for rules spanning several objects.
- Don't change the `nsURI` or rename classes without asking. It breaks every `.rango` file and the
  `.aird`.

**Xtext**
- The grammar imports the Ecore model (`import`, never `generate`), so constraints and derived
  features apply in the editor.
- Cross-references use `[Type|QualifiedName]`. Restrict them in the `ScopeProvider`, not in
  validation.
- After any grammar change, rerun MWE2 and update the formatter, templates, and content assist.

**Generator**
- Templates read the model through relations and derived features, not just names and labels.
- Output must be deterministic, carry the "do not edit" header, and land in the game's own layout.
  The generator removes stale files and refuses invalid models.
- Put domain logic in derived features or the runtime. Templates only map the model to code.

**Generated code**
- Never hand-edit `src-gen/`, `xtend-gen/`, `plugin.xml_gen`, or `rango-game/core/src/generated/`.
  Change the source (Ecore, grammar, template) and regenerate.

**Tycho/OSGi**
- When adding files or packages, update `META-INF/MANIFEST.MF` (`Require-Bundle`,
  `Export-Package`) and `build.properties` (`bin.includes`: icons, templates, `plugin.xml`, model).
  A missing entry builds in Eclipse but fails in Maven.
- New plug-ins go into the root `pom.xml` modules and `feature.xml`.
- Keep the target platform (`.target`) pinned.

## Build and verify

```sh
./mvnw verify                              # plug-ins, MWE2 regeneration, all tests
./mvnw verify -Pgame -Dedition=arcade      # also generate into rango-game and build the game
cd rango-game && ./gradlew lwjgl3:run      # play
```

- Run `./mvnw verify` after every change to the plug-ins. Report failures with their output. Never
  claim it passes without running it.
- Editor behaviour (runtime Eclipse) and gameplay cannot be verified from the terminal. Say so, and
  list what the user should check by hand.

## Grading rubric (TDT4250 H2026)

Every change should move a criterion toward BEST. These descriptions are condensed from the
official rubric.

| Weight | Criterion | What BEST requires |
| --- | --- | --- |
| 30% | Metamodel / DSL concepts | Articulated use of inheritance, abstract classes, composition, and references. Perfectly consistent. Realistic domain constraints. All instances are valid in the domain. The examples use the **entire** metamodel consistently. |
| 40% | Exploitation of model instances | The generator uses **all** classes **and relations**. Model changes have a large impact on behaviour and appearance. Generated output spans the application, including config files and resources, not just a few files. |
| 15% | Concrete syntax | A domain-customized grammar covering **all** concepts. Non-trivial editor features. Models written in the editor feed the generator directly, with no manual fixes. |
| 15% | Setup, build, docs | Easy to understand and use. All projects in the repo. Automated build for **every** component. Good naming and organization. |

What loses points:
- concepts stored as attribute bundles instead of classes,
- redundant or inconsistent information,
- missing multiplicities or types,
- artificial constraints,
- invalid examples or examples that differ only in names,
- a generator that only reads names or labels, or ignores relations,
- a default (uncustomized) grammar,
- a build that only works inside Eclipse,
- an unclear README.

## Delivery requirements

- [ ] Metamodel with both containment and plain references, and constraints (OCL and/or Java).
- [ ] At least three **structurally different** example instances (`classic`, `survival`, `arcade`).
- [ ] Model-to-behaviour mapping: code generation and resources (not just getters and setters).
- [ ] Concrete syntax and editor (Xtext).
- [ ] Packaging as Eclipse plug-ins: feature and p2 update site.
- [ ] `README.md` at the root: full documentation and how to use the generator.
- [ ] `LICENSE.md` at the root.
- [ ] Report: IEEE template, max 4 pages, covering idea, motivation, and solution, plus each member's
  focus and estimated hours.
- Must be based on EMF/Ecore. Alternatives must be agreed with the course staff.
