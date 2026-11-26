package no.ntnu.tdt4250.rango.gamemode.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import no.ntnu.tdt4250.rango.gamemode.dsl.services.RangoModeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRangoModeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'easy'", "'medium'", "'hard'", "'enemy.speed'", "'enemy.points'", "'player.health'", "'player.speed'", "'drop.chance'", "'wave.delay'", "'everything'", "'enemies'", "'player'", "'left'", "'right'", "'edition'", "'difficulty'", "'{'", "'}'", "'*'", "'enemy'", "'on'", "'pop'", "':'", "'contact'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'poison'", "'every'", "'powerup'", "'gives'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'description'", "'gravity'", "'level'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'lose'", "'when'", "'win'", "'or'", "'all'", "'cleared'", "'time'", "'reaches'", "'survived'", "'depleted'", "'.'", "'looping'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRangoModeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRangoModeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRangoModeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRangoMode.g"; }


    	private RangoModeGrammarAccess grammarAccess;

    	public void setGrammarAccess(RangoModeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEdition"
    // InternalRangoMode.g:53:1: entryRuleEdition : ruleEdition EOF ;
    public final void entryRuleEdition() throws RecognitionException {
        try {
            // InternalRangoMode.g:54:1: ( ruleEdition EOF )
            // InternalRangoMode.g:55:1: ruleEdition EOF
            {
             before(grammarAccess.getEditionRule()); 
            pushFollow(FOLLOW_1);
            ruleEdition();

            state._fsp--;

             after(grammarAccess.getEditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdition"


    // $ANTLR start "ruleEdition"
    // InternalRangoMode.g:62:1: ruleEdition : ( ( rule__Edition__Group__0 ) ) ;
    public final void ruleEdition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:66:2: ( ( ( rule__Edition__Group__0 ) ) )
            // InternalRangoMode.g:67:2: ( ( rule__Edition__Group__0 ) )
            {
            // InternalRangoMode.g:67:2: ( ( rule__Edition__Group__0 ) )
            // InternalRangoMode.g:68:3: ( rule__Edition__Group__0 )
            {
             before(grammarAccess.getEditionAccess().getGroup()); 
            // InternalRangoMode.g:69:3: ( rule__Edition__Group__0 )
            // InternalRangoMode.g:69:4: rule__Edition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdition"


    // $ANTLR start "entryRuleDifficulty"
    // InternalRangoMode.g:78:1: entryRuleDifficulty : ruleDifficulty EOF ;
    public final void entryRuleDifficulty() throws RecognitionException {
        try {
            // InternalRangoMode.g:79:1: ( ruleDifficulty EOF )
            // InternalRangoMode.g:80:1: ruleDifficulty EOF
            {
             before(grammarAccess.getDifficultyRule()); 
            pushFollow(FOLLOW_1);
            ruleDifficulty();

            state._fsp--;

             after(grammarAccess.getDifficultyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDifficulty"


    // $ANTLR start "ruleDifficulty"
    // InternalRangoMode.g:87:1: ruleDifficulty : ( ( rule__Difficulty__Group__0 ) ) ;
    public final void ruleDifficulty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:91:2: ( ( ( rule__Difficulty__Group__0 ) ) )
            // InternalRangoMode.g:92:2: ( ( rule__Difficulty__Group__0 ) )
            {
            // InternalRangoMode.g:92:2: ( ( rule__Difficulty__Group__0 ) )
            // InternalRangoMode.g:93:3: ( rule__Difficulty__Group__0 )
            {
             before(grammarAccess.getDifficultyAccess().getGroup()); 
            // InternalRangoMode.g:94:3: ( rule__Difficulty__Group__0 )
            // InternalRangoMode.g:94:4: rule__Difficulty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDifficulty"


    // $ANTLR start "entryRuleModifier"
    // InternalRangoMode.g:103:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalRangoMode.g:104:1: ( ruleModifier EOF )
            // InternalRangoMode.g:105:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalRangoMode.g:112:1: ruleModifier : ( ( rule__Modifier__Group__0 ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:116:2: ( ( ( rule__Modifier__Group__0 ) ) )
            // InternalRangoMode.g:117:2: ( ( rule__Modifier__Group__0 ) )
            {
            // InternalRangoMode.g:117:2: ( ( rule__Modifier__Group__0 ) )
            // InternalRangoMode.g:118:3: ( rule__Modifier__Group__0 )
            {
             before(grammarAccess.getModifierAccess().getGroup()); 
            // InternalRangoMode.g:119:3: ( rule__Modifier__Group__0 )
            // InternalRangoMode.g:119:4: rule__Modifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleEnemyType"
    // InternalRangoMode.g:128:1: entryRuleEnemyType : ruleEnemyType EOF ;
    public final void entryRuleEnemyType() throws RecognitionException {
        try {
            // InternalRangoMode.g:129:1: ( ruleEnemyType EOF )
            // InternalRangoMode.g:130:1: ruleEnemyType EOF
            {
             before(grammarAccess.getEnemyTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnemyType();

            state._fsp--;

             after(grammarAccess.getEnemyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnemyType"


    // $ANTLR start "ruleEnemyType"
    // InternalRangoMode.g:137:1: ruleEnemyType : ( ( rule__EnemyType__Group__0 ) ) ;
    public final void ruleEnemyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:141:2: ( ( ( rule__EnemyType__Group__0 ) ) )
            // InternalRangoMode.g:142:2: ( ( rule__EnemyType__Group__0 ) )
            {
            // InternalRangoMode.g:142:2: ( ( rule__EnemyType__Group__0 ) )
            // InternalRangoMode.g:143:3: ( rule__EnemyType__Group__0 )
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup()); 
            // InternalRangoMode.g:144:3: ( rule__EnemyType__Group__0 )
            // InternalRangoMode.g:144:4: rule__EnemyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnemyType"


    // $ANTLR start "entryRuleSplitRule"
    // InternalRangoMode.g:153:1: entryRuleSplitRule : ruleSplitRule EOF ;
    public final void entryRuleSplitRule() throws RecognitionException {
        try {
            // InternalRangoMode.g:154:1: ( ruleSplitRule EOF )
            // InternalRangoMode.g:155:1: ruleSplitRule EOF
            {
             before(grammarAccess.getSplitRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSplitRule();

            state._fsp--;

             after(grammarAccess.getSplitRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSplitRule"


    // $ANTLR start "ruleSplitRule"
    // InternalRangoMode.g:162:1: ruleSplitRule : ( ( rule__SplitRule__Alternatives ) ) ;
    public final void ruleSplitRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:166:2: ( ( ( rule__SplitRule__Alternatives ) ) )
            // InternalRangoMode.g:167:2: ( ( rule__SplitRule__Alternatives ) )
            {
            // InternalRangoMode.g:167:2: ( ( rule__SplitRule__Alternatives ) )
            // InternalRangoMode.g:168:3: ( rule__SplitRule__Alternatives )
            {
             before(grammarAccess.getSplitRuleAccess().getAlternatives()); 
            // InternalRangoMode.g:169:3: ( rule__SplitRule__Alternatives )
            // InternalRangoMode.g:169:4: rule__SplitRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SplitRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSplitRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSplitRule"


    // $ANTLR start "entryRuleVanish"
    // InternalRangoMode.g:178:1: entryRuleVanish : ruleVanish EOF ;
    public final void entryRuleVanish() throws RecognitionException {
        try {
            // InternalRangoMode.g:179:1: ( ruleVanish EOF )
            // InternalRangoMode.g:180:1: ruleVanish EOF
            {
             before(grammarAccess.getVanishRule()); 
            pushFollow(FOLLOW_1);
            ruleVanish();

            state._fsp--;

             after(grammarAccess.getVanishRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVanish"


    // $ANTLR start "ruleVanish"
    // InternalRangoMode.g:187:1: ruleVanish : ( ( rule__Vanish__Group__0 ) ) ;
    public final void ruleVanish() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:191:2: ( ( ( rule__Vanish__Group__0 ) ) )
            // InternalRangoMode.g:192:2: ( ( rule__Vanish__Group__0 ) )
            {
            // InternalRangoMode.g:192:2: ( ( rule__Vanish__Group__0 ) )
            // InternalRangoMode.g:193:3: ( rule__Vanish__Group__0 )
            {
             before(grammarAccess.getVanishAccess().getGroup()); 
            // InternalRangoMode.g:194:3: ( rule__Vanish__Group__0 )
            // InternalRangoMode.g:194:4: rule__Vanish__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vanish__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVanishAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVanish"


    // $ANTLR start "entryRuleSplit"
    // InternalRangoMode.g:203:1: entryRuleSplit : ruleSplit EOF ;
    public final void entryRuleSplit() throws RecognitionException {
        try {
            // InternalRangoMode.g:204:1: ( ruleSplit EOF )
            // InternalRangoMode.g:205:1: ruleSplit EOF
            {
             before(grammarAccess.getSplitRule()); 
            pushFollow(FOLLOW_1);
            ruleSplit();

            state._fsp--;

             after(grammarAccess.getSplitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSplit"


    // $ANTLR start "ruleSplit"
    // InternalRangoMode.g:212:1: ruleSplit : ( ( rule__Split__Group__0 ) ) ;
    public final void ruleSplit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:216:2: ( ( ( rule__Split__Group__0 ) ) )
            // InternalRangoMode.g:217:2: ( ( rule__Split__Group__0 ) )
            {
            // InternalRangoMode.g:217:2: ( ( rule__Split__Group__0 ) )
            // InternalRangoMode.g:218:3: ( rule__Split__Group__0 )
            {
             before(grammarAccess.getSplitAccess().getGroup()); 
            // InternalRangoMode.g:219:3: ( rule__Split__Group__0 )
            // InternalRangoMode.g:219:4: rule__Split__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Split__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSplit"


    // $ANTLR start "entryRulePlayerEffect"
    // InternalRangoMode.g:228:1: entryRulePlayerEffect : rulePlayerEffect EOF ;
    public final void entryRulePlayerEffect() throws RecognitionException {
        try {
            // InternalRangoMode.g:229:1: ( rulePlayerEffect EOF )
            // InternalRangoMode.g:230:1: rulePlayerEffect EOF
            {
             before(grammarAccess.getPlayerEffectRule()); 
            pushFollow(FOLLOW_1);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getPlayerEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayerEffect"


    // $ANTLR start "rulePlayerEffect"
    // InternalRangoMode.g:237:1: rulePlayerEffect : ( ( rule__PlayerEffect__Alternatives ) ) ;
    public final void rulePlayerEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:241:2: ( ( ( rule__PlayerEffect__Alternatives ) ) )
            // InternalRangoMode.g:242:2: ( ( rule__PlayerEffect__Alternatives ) )
            {
            // InternalRangoMode.g:242:2: ( ( rule__PlayerEffect__Alternatives ) )
            // InternalRangoMode.g:243:3: ( rule__PlayerEffect__Alternatives )
            {
             before(grammarAccess.getPlayerEffectAccess().getAlternatives()); 
            // InternalRangoMode.g:244:3: ( rule__PlayerEffect__Alternatives )
            // InternalRangoMode.g:244:4: rule__PlayerEffect__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlayerEffect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlayerEffectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerEffect"


    // $ANTLR start "entryRuleDamage"
    // InternalRangoMode.g:253:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalRangoMode.g:254:1: ( ruleDamage EOF )
            // InternalRangoMode.g:255:1: ruleDamage EOF
            {
             before(grammarAccess.getDamageRule()); 
            pushFollow(FOLLOW_1);
            ruleDamage();

            state._fsp--;

             after(grammarAccess.getDamageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDamage"


    // $ANTLR start "ruleDamage"
    // InternalRangoMode.g:262:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:266:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalRangoMode.g:267:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalRangoMode.g:267:2: ( ( rule__Damage__Group__0 ) )
            // InternalRangoMode.g:268:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalRangoMode.g:269:3: ( rule__Damage__Group__0 )
            // InternalRangoMode.g:269:4: rule__Damage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Damage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDamageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDamage"


    // $ANTLR start "entryRuleHeal"
    // InternalRangoMode.g:278:1: entryRuleHeal : ruleHeal EOF ;
    public final void entryRuleHeal() throws RecognitionException {
        try {
            // InternalRangoMode.g:279:1: ( ruleHeal EOF )
            // InternalRangoMode.g:280:1: ruleHeal EOF
            {
             before(grammarAccess.getHealRule()); 
            pushFollow(FOLLOW_1);
            ruleHeal();

            state._fsp--;

             after(grammarAccess.getHealRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeal"


    // $ANTLR start "ruleHeal"
    // InternalRangoMode.g:287:1: ruleHeal : ( ( rule__Heal__Group__0 ) ) ;
    public final void ruleHeal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:291:2: ( ( ( rule__Heal__Group__0 ) ) )
            // InternalRangoMode.g:292:2: ( ( rule__Heal__Group__0 ) )
            {
            // InternalRangoMode.g:292:2: ( ( rule__Heal__Group__0 ) )
            // InternalRangoMode.g:293:3: ( rule__Heal__Group__0 )
            {
             before(grammarAccess.getHealAccess().getGroup()); 
            // InternalRangoMode.g:294:3: ( rule__Heal__Group__0 )
            // InternalRangoMode.g:294:4: rule__Heal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Heal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeal"


    // $ANTLR start "entryRuleShield"
    // InternalRangoMode.g:303:1: entryRuleShield : ruleShield EOF ;
    public final void entryRuleShield() throws RecognitionException {
        try {
            // InternalRangoMode.g:304:1: ( ruleShield EOF )
            // InternalRangoMode.g:305:1: ruleShield EOF
            {
             before(grammarAccess.getShieldRule()); 
            pushFollow(FOLLOW_1);
            ruleShield();

            state._fsp--;

             after(grammarAccess.getShieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShield"


    // $ANTLR start "ruleShield"
    // InternalRangoMode.g:312:1: ruleShield : ( ( rule__Shield__Group__0 ) ) ;
    public final void ruleShield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:316:2: ( ( ( rule__Shield__Group__0 ) ) )
            // InternalRangoMode.g:317:2: ( ( rule__Shield__Group__0 ) )
            {
            // InternalRangoMode.g:317:2: ( ( rule__Shield__Group__0 ) )
            // InternalRangoMode.g:318:3: ( rule__Shield__Group__0 )
            {
             before(grammarAccess.getShieldAccess().getGroup()); 
            // InternalRangoMode.g:319:3: ( rule__Shield__Group__0 )
            // InternalRangoMode.g:319:4: rule__Shield__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShield"


    // $ANTLR start "entryRuleSpeedChange"
    // InternalRangoMode.g:328:1: entryRuleSpeedChange : ruleSpeedChange EOF ;
    public final void entryRuleSpeedChange() throws RecognitionException {
        try {
            // InternalRangoMode.g:329:1: ( ruleSpeedChange EOF )
            // InternalRangoMode.g:330:1: ruleSpeedChange EOF
            {
             before(grammarAccess.getSpeedChangeRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeedChange();

            state._fsp--;

             after(grammarAccess.getSpeedChangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpeedChange"


    // $ANTLR start "ruleSpeedChange"
    // InternalRangoMode.g:337:1: ruleSpeedChange : ( ( rule__SpeedChange__Group__0 ) ) ;
    public final void ruleSpeedChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:341:2: ( ( ( rule__SpeedChange__Group__0 ) ) )
            // InternalRangoMode.g:342:2: ( ( rule__SpeedChange__Group__0 ) )
            {
            // InternalRangoMode.g:342:2: ( ( rule__SpeedChange__Group__0 ) )
            // InternalRangoMode.g:343:3: ( rule__SpeedChange__Group__0 )
            {
             before(grammarAccess.getSpeedChangeAccess().getGroup()); 
            // InternalRangoMode.g:344:3: ( rule__SpeedChange__Group__0 )
            // InternalRangoMode.g:344:4: rule__SpeedChange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedChangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeedChange"


    // $ANTLR start "entryRulePoison"
    // InternalRangoMode.g:353:1: entryRulePoison : rulePoison EOF ;
    public final void entryRulePoison() throws RecognitionException {
        try {
            // InternalRangoMode.g:354:1: ( rulePoison EOF )
            // InternalRangoMode.g:355:1: rulePoison EOF
            {
             before(grammarAccess.getPoisonRule()); 
            pushFollow(FOLLOW_1);
            rulePoison();

            state._fsp--;

             after(grammarAccess.getPoisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoison"


    // $ANTLR start "rulePoison"
    // InternalRangoMode.g:362:1: rulePoison : ( ( rule__Poison__Group__0 ) ) ;
    public final void rulePoison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:366:2: ( ( ( rule__Poison__Group__0 ) ) )
            // InternalRangoMode.g:367:2: ( ( rule__Poison__Group__0 ) )
            {
            // InternalRangoMode.g:367:2: ( ( rule__Poison__Group__0 ) )
            // InternalRangoMode.g:368:3: ( rule__Poison__Group__0 )
            {
             before(grammarAccess.getPoisonAccess().getGroup()); 
            // InternalRangoMode.g:369:3: ( rule__Poison__Group__0 )
            // InternalRangoMode.g:369:4: rule__Poison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Poison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoison"


    // $ANTLR start "entryRulePowerUp"
    // InternalRangoMode.g:378:1: entryRulePowerUp : rulePowerUp EOF ;
    public final void entryRulePowerUp() throws RecognitionException {
        try {
            // InternalRangoMode.g:379:1: ( rulePowerUp EOF )
            // InternalRangoMode.g:380:1: rulePowerUp EOF
            {
             before(grammarAccess.getPowerUpRule()); 
            pushFollow(FOLLOW_1);
            rulePowerUp();

            state._fsp--;

             after(grammarAccess.getPowerUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePowerUp"


    // $ANTLR start "rulePowerUp"
    // InternalRangoMode.g:387:1: rulePowerUp : ( ( rule__PowerUp__Group__0 ) ) ;
    public final void rulePowerUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:391:2: ( ( ( rule__PowerUp__Group__0 ) ) )
            // InternalRangoMode.g:392:2: ( ( rule__PowerUp__Group__0 ) )
            {
            // InternalRangoMode.g:392:2: ( ( rule__PowerUp__Group__0 ) )
            // InternalRangoMode.g:393:3: ( rule__PowerUp__Group__0 )
            {
             before(grammarAccess.getPowerUpAccess().getGroup()); 
            // InternalRangoMode.g:394:3: ( rule__PowerUp__Group__0 )
            // InternalRangoMode.g:394:4: rule__PowerUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePowerUp"


    // $ANTLR start "entryRulePlayerProfile"
    // InternalRangoMode.g:403:1: entryRulePlayerProfile : rulePlayerProfile EOF ;
    public final void entryRulePlayerProfile() throws RecognitionException {
        try {
            // InternalRangoMode.g:404:1: ( rulePlayerProfile EOF )
            // InternalRangoMode.g:405:1: rulePlayerProfile EOF
            {
             before(grammarAccess.getPlayerProfileRule()); 
            pushFollow(FOLLOW_1);
            rulePlayerProfile();

            state._fsp--;

             after(grammarAccess.getPlayerProfileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayerProfile"


    // $ANTLR start "rulePlayerProfile"
    // InternalRangoMode.g:412:1: rulePlayerProfile : ( ( rule__PlayerProfile__Group__0 ) ) ;
    public final void rulePlayerProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:416:2: ( ( ( rule__PlayerProfile__Group__0 ) ) )
            // InternalRangoMode.g:417:2: ( ( rule__PlayerProfile__Group__0 ) )
            {
            // InternalRangoMode.g:417:2: ( ( rule__PlayerProfile__Group__0 ) )
            // InternalRangoMode.g:418:3: ( rule__PlayerProfile__Group__0 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup()); 
            // InternalRangoMode.g:419:3: ( rule__PlayerProfile__Group__0 )
            // InternalRangoMode.g:419:4: rule__PlayerProfile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerProfile"


    // $ANTLR start "entryRuleGameMode"
    // InternalRangoMode.g:428:1: entryRuleGameMode : ruleGameMode EOF ;
    public final void entryRuleGameMode() throws RecognitionException {
        try {
            // InternalRangoMode.g:429:1: ( ruleGameMode EOF )
            // InternalRangoMode.g:430:1: ruleGameMode EOF
            {
             before(grammarAccess.getGameModeRule()); 
            pushFollow(FOLLOW_1);
            ruleGameMode();

            state._fsp--;

             after(grammarAccess.getGameModeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameMode"


    // $ANTLR start "ruleGameMode"
    // InternalRangoMode.g:437:1: ruleGameMode : ( ( rule__GameMode__Group__0 ) ) ;
    public final void ruleGameMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:441:2: ( ( ( rule__GameMode__Group__0 ) ) )
            // InternalRangoMode.g:442:2: ( ( rule__GameMode__Group__0 ) )
            {
            // InternalRangoMode.g:442:2: ( ( rule__GameMode__Group__0 ) )
            // InternalRangoMode.g:443:3: ( rule__GameMode__Group__0 )
            {
             before(grammarAccess.getGameModeAccess().getGroup()); 
            // InternalRangoMode.g:444:3: ( rule__GameMode__Group__0 )
            // InternalRangoMode.g:444:4: rule__GameMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameMode"


    // $ANTLR start "entryRuleSingleLevel"
    // InternalRangoMode.g:453:1: entryRuleSingleLevel : ruleSingleLevel EOF ;
    public final void entryRuleSingleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:454:1: ( ruleSingleLevel EOF )
            // InternalRangoMode.g:455:1: ruleSingleLevel EOF
            {
             before(grammarAccess.getSingleLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleLevel();

            state._fsp--;

             after(grammarAccess.getSingleLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleLevel"


    // $ANTLR start "ruleSingleLevel"
    // InternalRangoMode.g:462:1: ruleSingleLevel : ( ( rule__SingleLevel__Group__0 ) ) ;
    public final void ruleSingleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:466:2: ( ( ( rule__SingleLevel__Group__0 ) ) )
            // InternalRangoMode.g:467:2: ( ( rule__SingleLevel__Group__0 ) )
            {
            // InternalRangoMode.g:467:2: ( ( rule__SingleLevel__Group__0 ) )
            // InternalRangoMode.g:468:3: ( rule__SingleLevel__Group__0 )
            {
             before(grammarAccess.getSingleLevelAccess().getGroup()); 
            // InternalRangoMode.g:469:3: ( rule__SingleLevel__Group__0 )
            // InternalRangoMode.g:469:4: rule__SingleLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleLevel"


    // $ANTLR start "entryRuleLevel"
    // InternalRangoMode.g:478:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:479:1: ( ruleLevel EOF )
            // InternalRangoMode.g:480:1: ruleLevel EOF
            {
             before(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalRangoMode.g:487:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:491:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalRangoMode.g:492:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalRangoMode.g:492:2: ( ( rule__Level__Group__0 ) )
            // InternalRangoMode.g:493:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalRangoMode.g:494:3: ( rule__Level__Group__0 )
            // InternalRangoMode.g:494:4: rule__Level__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleSpeedBonus"
    // InternalRangoMode.g:503:1: entryRuleSpeedBonus : ruleSpeedBonus EOF ;
    public final void entryRuleSpeedBonus() throws RecognitionException {
        try {
            // InternalRangoMode.g:504:1: ( ruleSpeedBonus EOF )
            // InternalRangoMode.g:505:1: ruleSpeedBonus EOF
            {
             before(grammarAccess.getSpeedBonusRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeedBonus();

            state._fsp--;

             after(grammarAccess.getSpeedBonusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpeedBonus"


    // $ANTLR start "ruleSpeedBonus"
    // InternalRangoMode.g:512:1: ruleSpeedBonus : ( ( rule__SpeedBonus__Group__0 ) ) ;
    public final void ruleSpeedBonus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:516:2: ( ( ( rule__SpeedBonus__Group__0 ) ) )
            // InternalRangoMode.g:517:2: ( ( rule__SpeedBonus__Group__0 ) )
            {
            // InternalRangoMode.g:517:2: ( ( rule__SpeedBonus__Group__0 ) )
            // InternalRangoMode.g:518:3: ( rule__SpeedBonus__Group__0 )
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup()); 
            // InternalRangoMode.g:519:3: ( rule__SpeedBonus__Group__0 )
            // InternalRangoMode.g:519:4: rule__SpeedBonus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedBonusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeedBonus"


    // $ANTLR start "entryRuleArena"
    // InternalRangoMode.g:528:1: entryRuleArena : ruleArena EOF ;
    public final void entryRuleArena() throws RecognitionException {
        try {
            // InternalRangoMode.g:529:1: ( ruleArena EOF )
            // InternalRangoMode.g:530:1: ruleArena EOF
            {
             before(grammarAccess.getArenaRule()); 
            pushFollow(FOLLOW_1);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getArenaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArena"


    // $ANTLR start "ruleArena"
    // InternalRangoMode.g:537:1: ruleArena : ( ( rule__Arena__Group__0 ) ) ;
    public final void ruleArena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:541:2: ( ( ( rule__Arena__Group__0 ) ) )
            // InternalRangoMode.g:542:2: ( ( rule__Arena__Group__0 ) )
            {
            // InternalRangoMode.g:542:2: ( ( rule__Arena__Group__0 ) )
            // InternalRangoMode.g:543:3: ( rule__Arena__Group__0 )
            {
             before(grammarAccess.getArenaAccess().getGroup()); 
            // InternalRangoMode.g:544:3: ( rule__Arena__Group__0 )
            // InternalRangoMode.g:544:4: rule__Arena__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArena"


    // $ANTLR start "ruleAt"
    // InternalRangoMode.g:554:1: ruleAt : ( ( rule__At__Group__0 ) ) ;
    public final void ruleAt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:558:2: ( ( ( rule__At__Group__0 ) ) )
            // InternalRangoMode.g:559:2: ( ( rule__At__Group__0 ) )
            {
            // InternalRangoMode.g:559:2: ( ( rule__At__Group__0 ) )
            // InternalRangoMode.g:560:3: ( rule__At__Group__0 )
            {
             before(grammarAccess.getAtAccess().getGroup()); 
            // InternalRangoMode.g:561:3: ( rule__At__Group__0 )
            // InternalRangoMode.g:561:4: rule__At__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__At__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAt"


    // $ANTLR start "entryRuleObstacle"
    // InternalRangoMode.g:570:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalRangoMode.g:571:1: ( ruleObstacle EOF )
            // InternalRangoMode.g:572:1: ruleObstacle EOF
            {
             before(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacle();

            state._fsp--;

             after(grammarAccess.getObstacleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalRangoMode.g:579:1: ruleObstacle : ( ( rule__Obstacle__Alternatives ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:583:2: ( ( ( rule__Obstacle__Alternatives ) ) )
            // InternalRangoMode.g:584:2: ( ( rule__Obstacle__Alternatives ) )
            {
            // InternalRangoMode.g:584:2: ( ( rule__Obstacle__Alternatives ) )
            // InternalRangoMode.g:585:3: ( rule__Obstacle__Alternatives )
            {
             before(grammarAccess.getObstacleAccess().getAlternatives()); 
            // InternalRangoMode.g:586:3: ( rule__Obstacle__Alternatives )
            // InternalRangoMode.g:586:4: rule__Obstacle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleBlock"
    // InternalRangoMode.g:595:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRangoMode.g:596:1: ( ruleBlock EOF )
            // InternalRangoMode.g:597:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRangoMode.g:604:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:608:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRangoMode.g:609:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRangoMode.g:609:2: ( ( rule__Block__Group__0 ) )
            // InternalRangoMode.g:610:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRangoMode.g:611:3: ( rule__Block__Group__0 )
            // InternalRangoMode.g:611:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleJumpPad"
    // InternalRangoMode.g:620:1: entryRuleJumpPad : ruleJumpPad EOF ;
    public final void entryRuleJumpPad() throws RecognitionException {
        try {
            // InternalRangoMode.g:621:1: ( ruleJumpPad EOF )
            // InternalRangoMode.g:622:1: ruleJumpPad EOF
            {
             before(grammarAccess.getJumpPadRule()); 
            pushFollow(FOLLOW_1);
            ruleJumpPad();

            state._fsp--;

             after(grammarAccess.getJumpPadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJumpPad"


    // $ANTLR start "ruleJumpPad"
    // InternalRangoMode.g:629:1: ruleJumpPad : ( ( rule__JumpPad__Group__0 ) ) ;
    public final void ruleJumpPad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:633:2: ( ( ( rule__JumpPad__Group__0 ) ) )
            // InternalRangoMode.g:634:2: ( ( rule__JumpPad__Group__0 ) )
            {
            // InternalRangoMode.g:634:2: ( ( rule__JumpPad__Group__0 ) )
            // InternalRangoMode.g:635:3: ( rule__JumpPad__Group__0 )
            {
             before(grammarAccess.getJumpPadAccess().getGroup()); 
            // InternalRangoMode.g:636:3: ( rule__JumpPad__Group__0 )
            // InternalRangoMode.g:636:4: rule__JumpPad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJumpPadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJumpPad"


    // $ANTLR start "entryRuleTeleporter"
    // InternalRangoMode.g:645:1: entryRuleTeleporter : ruleTeleporter EOF ;
    public final void entryRuleTeleporter() throws RecognitionException {
        try {
            // InternalRangoMode.g:646:1: ( ruleTeleporter EOF )
            // InternalRangoMode.g:647:1: ruleTeleporter EOF
            {
             before(grammarAccess.getTeleporterRule()); 
            pushFollow(FOLLOW_1);
            ruleTeleporter();

            state._fsp--;

             after(grammarAccess.getTeleporterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeleporter"


    // $ANTLR start "ruleTeleporter"
    // InternalRangoMode.g:654:1: ruleTeleporter : ( ( rule__Teleporter__Group__0 ) ) ;
    public final void ruleTeleporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:658:2: ( ( ( rule__Teleporter__Group__0 ) ) )
            // InternalRangoMode.g:659:2: ( ( rule__Teleporter__Group__0 ) )
            {
            // InternalRangoMode.g:659:2: ( ( rule__Teleporter__Group__0 ) )
            // InternalRangoMode.g:660:3: ( rule__Teleporter__Group__0 )
            {
             before(grammarAccess.getTeleporterAccess().getGroup()); 
            // InternalRangoMode.g:661:3: ( rule__Teleporter__Group__0 )
            // InternalRangoMode.g:661:4: rule__Teleporter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeleporterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeleporter"


    // $ANTLR start "entryRuleSpawnStrategy"
    // InternalRangoMode.g:670:1: entryRuleSpawnStrategy : ruleSpawnStrategy EOF ;
    public final void entryRuleSpawnStrategy() throws RecognitionException {
        try {
            // InternalRangoMode.g:671:1: ( ruleSpawnStrategy EOF )
            // InternalRangoMode.g:672:1: ruleSpawnStrategy EOF
            {
             before(grammarAccess.getSpawnStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleSpawnStrategy();

            state._fsp--;

             after(grammarAccess.getSpawnStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpawnStrategy"


    // $ANTLR start "ruleSpawnStrategy"
    // InternalRangoMode.g:679:1: ruleSpawnStrategy : ( ( rule__SpawnStrategy__Alternatives ) ) ;
    public final void ruleSpawnStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:683:2: ( ( ( rule__SpawnStrategy__Alternatives ) ) )
            // InternalRangoMode.g:684:2: ( ( rule__SpawnStrategy__Alternatives ) )
            {
            // InternalRangoMode.g:684:2: ( ( rule__SpawnStrategy__Alternatives ) )
            // InternalRangoMode.g:685:3: ( rule__SpawnStrategy__Alternatives )
            {
             before(grammarAccess.getSpawnStrategyAccess().getAlternatives()); 
            // InternalRangoMode.g:686:3: ( rule__SpawnStrategy__Alternatives )
            // InternalRangoMode.g:686:4: rule__SpawnStrategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SpawnStrategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpawnStrategyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpawnStrategy"


    // $ANTLR start "entryRuleFixedLayout"
    // InternalRangoMode.g:695:1: entryRuleFixedLayout : ruleFixedLayout EOF ;
    public final void entryRuleFixedLayout() throws RecognitionException {
        try {
            // InternalRangoMode.g:696:1: ( ruleFixedLayout EOF )
            // InternalRangoMode.g:697:1: ruleFixedLayout EOF
            {
             before(grammarAccess.getFixedLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleFixedLayout();

            state._fsp--;

             after(grammarAccess.getFixedLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixedLayout"


    // $ANTLR start "ruleFixedLayout"
    // InternalRangoMode.g:704:1: ruleFixedLayout : ( ( rule__FixedLayout__Group__0 ) ) ;
    public final void ruleFixedLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:708:2: ( ( ( rule__FixedLayout__Group__0 ) ) )
            // InternalRangoMode.g:709:2: ( ( rule__FixedLayout__Group__0 ) )
            {
            // InternalRangoMode.g:709:2: ( ( rule__FixedLayout__Group__0 ) )
            // InternalRangoMode.g:710:3: ( rule__FixedLayout__Group__0 )
            {
             before(grammarAccess.getFixedLayoutAccess().getGroup()); 
            // InternalRangoMode.g:711:3: ( rule__FixedLayout__Group__0 )
            // InternalRangoMode.g:711:4: rule__FixedLayout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FixedLayout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixedLayout"


    // $ANTLR start "entryRuleWaveSchedule"
    // InternalRangoMode.g:720:1: entryRuleWaveSchedule : ruleWaveSchedule EOF ;
    public final void entryRuleWaveSchedule() throws RecognitionException {
        try {
            // InternalRangoMode.g:721:1: ( ruleWaveSchedule EOF )
            // InternalRangoMode.g:722:1: ruleWaveSchedule EOF
            {
             before(grammarAccess.getWaveScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleWaveSchedule();

            state._fsp--;

             after(grammarAccess.getWaveScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWaveSchedule"


    // $ANTLR start "ruleWaveSchedule"
    // InternalRangoMode.g:729:1: ruleWaveSchedule : ( ( rule__WaveSchedule__Group__0 ) ) ;
    public final void ruleWaveSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:733:2: ( ( ( rule__WaveSchedule__Group__0 ) ) )
            // InternalRangoMode.g:734:2: ( ( rule__WaveSchedule__Group__0 ) )
            {
            // InternalRangoMode.g:734:2: ( ( rule__WaveSchedule__Group__0 ) )
            // InternalRangoMode.g:735:3: ( rule__WaveSchedule__Group__0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup()); 
            // InternalRangoMode.g:736:3: ( rule__WaveSchedule__Group__0 )
            // InternalRangoMode.g:736:4: rule__WaveSchedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaveSchedule"


    // $ANTLR start "entryRuleWave"
    // InternalRangoMode.g:745:1: entryRuleWave : ruleWave EOF ;
    public final void entryRuleWave() throws RecognitionException {
        try {
            // InternalRangoMode.g:746:1: ( ruleWave EOF )
            // InternalRangoMode.g:747:1: ruleWave EOF
            {
             before(grammarAccess.getWaveRule()); 
            pushFollow(FOLLOW_1);
            ruleWave();

            state._fsp--;

             after(grammarAccess.getWaveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWave"


    // $ANTLR start "ruleWave"
    // InternalRangoMode.g:754:1: ruleWave : ( ( rule__Wave__Group__0 ) ) ;
    public final void ruleWave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:758:2: ( ( ( rule__Wave__Group__0 ) ) )
            // InternalRangoMode.g:759:2: ( ( rule__Wave__Group__0 ) )
            {
            // InternalRangoMode.g:759:2: ( ( rule__Wave__Group__0 ) )
            // InternalRangoMode.g:760:3: ( rule__Wave__Group__0 )
            {
             before(grammarAccess.getWaveAccess().getGroup()); 
            // InternalRangoMode.g:761:3: ( rule__Wave__Group__0 )
            // InternalRangoMode.g:761:4: rule__Wave__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wave__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWave"


    // $ANTLR start "entryRuleEnemySpawn"
    // InternalRangoMode.g:770:1: entryRuleEnemySpawn : ruleEnemySpawn EOF ;
    public final void entryRuleEnemySpawn() throws RecognitionException {
        try {
            // InternalRangoMode.g:771:1: ( ruleEnemySpawn EOF )
            // InternalRangoMode.g:772:1: ruleEnemySpawn EOF
            {
             before(grammarAccess.getEnemySpawnRule()); 
            pushFollow(FOLLOW_1);
            ruleEnemySpawn();

            state._fsp--;

             after(grammarAccess.getEnemySpawnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnemySpawn"


    // $ANTLR start "ruleEnemySpawn"
    // InternalRangoMode.g:779:1: ruleEnemySpawn : ( ( rule__EnemySpawn__Group__0 ) ) ;
    public final void ruleEnemySpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:783:2: ( ( ( rule__EnemySpawn__Group__0 ) ) )
            // InternalRangoMode.g:784:2: ( ( rule__EnemySpawn__Group__0 ) )
            {
            // InternalRangoMode.g:784:2: ( ( rule__EnemySpawn__Group__0 ) )
            // InternalRangoMode.g:785:3: ( rule__EnemySpawn__Group__0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup()); 
            // InternalRangoMode.g:786:3: ( rule__EnemySpawn__Group__0 )
            // InternalRangoMode.g:786:4: rule__EnemySpawn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnemySpawnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnemySpawn"


    // $ANTLR start "ruleDrops"
    // InternalRangoMode.g:796:1: ruleDrops : ( ( rule__Drops__Group__0 ) ) ;
    public final void ruleDrops() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:800:2: ( ( ( rule__Drops__Group__0 ) ) )
            // InternalRangoMode.g:801:2: ( ( rule__Drops__Group__0 ) )
            {
            // InternalRangoMode.g:801:2: ( ( rule__Drops__Group__0 ) )
            // InternalRangoMode.g:802:3: ( rule__Drops__Group__0 )
            {
             before(grammarAccess.getDropsAccess().getGroup()); 
            // InternalRangoMode.g:803:3: ( rule__Drops__Group__0 )
            // InternalRangoMode.g:803:4: rule__Drops__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drops__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrops"


    // $ANTLR start "entryRuleDropTable"
    // InternalRangoMode.g:812:1: entryRuleDropTable : ruleDropTable EOF ;
    public final void entryRuleDropTable() throws RecognitionException {
        try {
            // InternalRangoMode.g:813:1: ( ruleDropTable EOF )
            // InternalRangoMode.g:814:1: ruleDropTable EOF
            {
             before(grammarAccess.getDropTableRule()); 
            pushFollow(FOLLOW_1);
            ruleDropTable();

            state._fsp--;

             after(grammarAccess.getDropTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDropTable"


    // $ANTLR start "ruleDropTable"
    // InternalRangoMode.g:821:1: ruleDropTable : ( ( rule__DropTable__Group__0 ) ) ;
    public final void ruleDropTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:825:2: ( ( ( rule__DropTable__Group__0 ) ) )
            // InternalRangoMode.g:826:2: ( ( rule__DropTable__Group__0 ) )
            {
            // InternalRangoMode.g:826:2: ( ( rule__DropTable__Group__0 ) )
            // InternalRangoMode.g:827:3: ( rule__DropTable__Group__0 )
            {
             before(grammarAccess.getDropTableAccess().getGroup()); 
            // InternalRangoMode.g:828:3: ( rule__DropTable__Group__0 )
            // InternalRangoMode.g:828:4: rule__DropTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropTable"


    // $ANTLR start "entryRuleDrop"
    // InternalRangoMode.g:837:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalRangoMode.g:838:1: ( ruleDrop EOF )
            // InternalRangoMode.g:839:1: ruleDrop EOF
            {
             before(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            ruleDrop();

            state._fsp--;

             after(grammarAccess.getDropRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalRangoMode.g:846:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:850:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalRangoMode.g:851:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalRangoMode.g:851:2: ( ( rule__Drop__Group__0 ) )
            // InternalRangoMode.g:852:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalRangoMode.g:853:3: ( rule__Drop__Group__0 )
            // InternalRangoMode.g:853:4: rule__Drop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrop"


    // $ANTLR start "ruleEndConditions"
    // InternalRangoMode.g:863:1: ruleEndConditions : ( ( rule__EndConditions__Group__0 ) ) ;
    public final void ruleEndConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:867:2: ( ( ( rule__EndConditions__Group__0 ) ) )
            // InternalRangoMode.g:868:2: ( ( rule__EndConditions__Group__0 ) )
            {
            // InternalRangoMode.g:868:2: ( ( rule__EndConditions__Group__0 ) )
            // InternalRangoMode.g:869:3: ( rule__EndConditions__Group__0 )
            {
             before(grammarAccess.getEndConditionsAccess().getGroup()); 
            // InternalRangoMode.g:870:3: ( rule__EndConditions__Group__0 )
            // InternalRangoMode.g:870:4: rule__EndConditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndConditions"


    // $ANTLR start "entryRuleWinCondition"
    // InternalRangoMode.g:879:1: entryRuleWinCondition : ruleWinCondition EOF ;
    public final void entryRuleWinCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:880:1: ( ruleWinCondition EOF )
            // InternalRangoMode.g:881:1: ruleWinCondition EOF
            {
             before(grammarAccess.getWinConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getWinConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWinCondition"


    // $ANTLR start "ruleWinCondition"
    // InternalRangoMode.g:888:1: ruleWinCondition : ( ( rule__WinCondition__Alternatives ) ) ;
    public final void ruleWinCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:892:2: ( ( ( rule__WinCondition__Alternatives ) ) )
            // InternalRangoMode.g:893:2: ( ( rule__WinCondition__Alternatives ) )
            {
            // InternalRangoMode.g:893:2: ( ( rule__WinCondition__Alternatives ) )
            // InternalRangoMode.g:894:3: ( rule__WinCondition__Alternatives )
            {
             before(grammarAccess.getWinConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:895:3: ( rule__WinCondition__Alternatives )
            // InternalRangoMode.g:895:4: rule__WinCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WinCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWinConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWinCondition"


    // $ANTLR start "entryRuleCleared"
    // InternalRangoMode.g:904:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:905:1: ( ruleCleared EOF )
            // InternalRangoMode.g:906:1: ruleCleared EOF
            {
             before(grammarAccess.getClearedRule()); 
            pushFollow(FOLLOW_1);
            ruleCleared();

            state._fsp--;

             after(grammarAccess.getClearedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCleared"


    // $ANTLR start "ruleCleared"
    // InternalRangoMode.g:913:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:917:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:918:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:918:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:919:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:920:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:920:4: rule__Cleared__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cleared__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCleared"


    // $ANTLR start "entryRuleTimeSurvived"
    // InternalRangoMode.g:929:1: entryRuleTimeSurvived : ruleTimeSurvived EOF ;
    public final void entryRuleTimeSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:930:1: ( ruleTimeSurvived EOF )
            // InternalRangoMode.g:931:1: ruleTimeSurvived EOF
            {
             before(grammarAccess.getTimeSurvivedRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSurvived();

            state._fsp--;

             after(grammarAccess.getTimeSurvivedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSurvived"


    // $ANTLR start "ruleTimeSurvived"
    // InternalRangoMode.g:938:1: ruleTimeSurvived : ( ( rule__TimeSurvived__Group__0 ) ) ;
    public final void ruleTimeSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:942:2: ( ( ( rule__TimeSurvived__Group__0 ) ) )
            // InternalRangoMode.g:943:2: ( ( rule__TimeSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:943:2: ( ( rule__TimeSurvived__Group__0 ) )
            // InternalRangoMode.g:944:3: ( rule__TimeSurvived__Group__0 )
            {
             before(grammarAccess.getTimeSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:945:3: ( rule__TimeSurvived__Group__0 )
            // InternalRangoMode.g:945:4: rule__TimeSurvived__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSurvived__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSurvivedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSurvived"


    // $ANTLR start "entryRuleWavesSurvived"
    // InternalRangoMode.g:954:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:955:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:956:1: ruleWavesSurvived EOF
            {
             before(grammarAccess.getWavesSurvivedRule()); 
            pushFollow(FOLLOW_1);
            ruleWavesSurvived();

            state._fsp--;

             after(grammarAccess.getWavesSurvivedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWavesSurvived"


    // $ANTLR start "ruleWavesSurvived"
    // InternalRangoMode.g:963:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:967:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:968:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:968:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:969:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:970:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:970:4: rule__WavesSurvived__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WavesSurvived__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWavesSurvivedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWavesSurvived"


    // $ANTLR start "entryRuleLoseCondition"
    // InternalRangoMode.g:979:1: entryRuleLoseCondition : ruleLoseCondition EOF ;
    public final void entryRuleLoseCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:980:1: ( ruleLoseCondition EOF )
            // InternalRangoMode.g:981:1: ruleLoseCondition EOF
            {
             before(grammarAccess.getLoseConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleLoseCondition();

            state._fsp--;

             after(grammarAccess.getLoseConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoseCondition"


    // $ANTLR start "ruleLoseCondition"
    // InternalRangoMode.g:988:1: ruleLoseCondition : ( ( rule__LoseCondition__Alternatives ) ) ;
    public final void ruleLoseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:992:2: ( ( ( rule__LoseCondition__Alternatives ) ) )
            // InternalRangoMode.g:993:2: ( ( rule__LoseCondition__Alternatives ) )
            {
            // InternalRangoMode.g:993:2: ( ( rule__LoseCondition__Alternatives ) )
            // InternalRangoMode.g:994:3: ( rule__LoseCondition__Alternatives )
            {
             before(grammarAccess.getLoseConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:995:3: ( rule__LoseCondition__Alternatives )
            // InternalRangoMode.g:995:4: rule__LoseCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LoseCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoseConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoseCondition"


    // $ANTLR start "entryRuleHealthDepleted"
    // InternalRangoMode.g:1004:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:1005:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:1006:1: ruleHealthDepleted EOF
            {
             before(grammarAccess.getHealthDepletedRule()); 
            pushFollow(FOLLOW_1);
            ruleHealthDepleted();

            state._fsp--;

             after(grammarAccess.getHealthDepletedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHealthDepleted"


    // $ANTLR start "ruleHealthDepleted"
    // InternalRangoMode.g:1013:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1017:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:1018:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:1018:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:1019:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:1020:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:1020:4: rule__HealthDepleted__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HealthDepleted__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHealthDepletedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHealthDepleted"


    // $ANTLR start "entryRuleTimeLimit"
    // InternalRangoMode.g:1029:1: entryRuleTimeLimit : ruleTimeLimit EOF ;
    public final void entryRuleTimeLimit() throws RecognitionException {
        try {
            // InternalRangoMode.g:1030:1: ( ruleTimeLimit EOF )
            // InternalRangoMode.g:1031:1: ruleTimeLimit EOF
            {
             before(grammarAccess.getTimeLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeLimit();

            state._fsp--;

             after(grammarAccess.getTimeLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeLimit"


    // $ANTLR start "ruleTimeLimit"
    // InternalRangoMode.g:1038:1: ruleTimeLimit : ( ( rule__TimeLimit__Group__0 ) ) ;
    public final void ruleTimeLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1042:2: ( ( ( rule__TimeLimit__Group__0 ) ) )
            // InternalRangoMode.g:1043:2: ( ( rule__TimeLimit__Group__0 ) )
            {
            // InternalRangoMode.g:1043:2: ( ( rule__TimeLimit__Group__0 ) )
            // InternalRangoMode.g:1044:3: ( rule__TimeLimit__Group__0 )
            {
             before(grammarAccess.getTimeLimitAccess().getGroup()); 
            // InternalRangoMode.g:1045:3: ( rule__TimeLimit__Group__0 )
            // InternalRangoMode.g:1045:4: rule__TimeLimit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeLimit"


    // $ANTLR start "entryRuleDecimal"
    // InternalRangoMode.g:1054:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:1055:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:1056:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalRangoMode.g:1063:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1067:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:1068:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:1068:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:1069:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:1070:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:1070:4: rule__Decimal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "ruleDifficultyTier"
    // InternalRangoMode.g:1079:1: ruleDifficultyTier : ( ( rule__DifficultyTier__Alternatives ) ) ;
    public final void ruleDifficultyTier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1083:1: ( ( ( rule__DifficultyTier__Alternatives ) ) )
            // InternalRangoMode.g:1084:2: ( ( rule__DifficultyTier__Alternatives ) )
            {
            // InternalRangoMode.g:1084:2: ( ( rule__DifficultyTier__Alternatives ) )
            // InternalRangoMode.g:1085:3: ( rule__DifficultyTier__Alternatives )
            {
             before(grammarAccess.getDifficultyTierAccess().getAlternatives()); 
            // InternalRangoMode.g:1086:3: ( rule__DifficultyTier__Alternatives )
            // InternalRangoMode.g:1086:4: rule__DifficultyTier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DifficultyTier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyTierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDifficultyTier"


    // $ANTLR start "ruleModifierTarget"
    // InternalRangoMode.g:1095:1: ruleModifierTarget : ( ( rule__ModifierTarget__Alternatives ) ) ;
    public final void ruleModifierTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1099:1: ( ( ( rule__ModifierTarget__Alternatives ) ) )
            // InternalRangoMode.g:1100:2: ( ( rule__ModifierTarget__Alternatives ) )
            {
            // InternalRangoMode.g:1100:2: ( ( rule__ModifierTarget__Alternatives ) )
            // InternalRangoMode.g:1101:3: ( rule__ModifierTarget__Alternatives )
            {
             before(grammarAccess.getModifierTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1102:3: ( rule__ModifierTarget__Alternatives )
            // InternalRangoMode.g:1102:4: rule__ModifierTarget__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModifierTarget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierTarget"


    // $ANTLR start "ruleTarget"
    // InternalRangoMode.g:1111:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1115:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1116:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1116:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1117:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1118:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1118:4: rule__Target__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Target__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "ruleDirection"
    // InternalRangoMode.g:1127:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1131:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1132:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1132:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1133:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1134:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1134:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Edition__Alternatives_3"
    // InternalRangoMode.g:1142:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__DifficultiesAssignment_3_4 ) ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1146:1: ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__DifficultiesAssignment_3_4 ) ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 53:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 89:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 61:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRangoMode.g:1147:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1147:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1148:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1149:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    // InternalRangoMode.g:1149:4: rule__Edition__EnemyTypesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__EnemyTypesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1153:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1153:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1154:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1155:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1155:4: rule__Edition__PowerUpsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__PowerUpsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1159:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1159:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    // InternalRangoMode.g:1160:3: ( rule__Edition__PlayersAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_2()); 
                    // InternalRangoMode.g:1161:3: ( rule__Edition__PlayersAssignment_3_2 )
                    // InternalRangoMode.g:1161:4: rule__Edition__PlayersAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__PlayersAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getPlayersAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1165:2: ( ruleDrops )
                    {
                    // InternalRangoMode.g:1165:2: ( ruleDrops )
                    // InternalRangoMode.g:1166:3: ruleDrops
                    {
                     before(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDrops();

                    state._fsp--;

                     after(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1171:2: ( ( rule__Edition__DifficultiesAssignment_3_4 ) )
                    {
                    // InternalRangoMode.g:1171:2: ( ( rule__Edition__DifficultiesAssignment_3_4 ) )
                    // InternalRangoMode.g:1172:3: ( rule__Edition__DifficultiesAssignment_3_4 )
                    {
                     before(grammarAccess.getEditionAccess().getDifficultiesAssignment_3_4()); 
                    // InternalRangoMode.g:1173:3: ( rule__Edition__DifficultiesAssignment_3_4 )
                    // InternalRangoMode.g:1173:4: rule__Edition__DifficultiesAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__DifficultiesAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getDifficultiesAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:1177:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    {
                    // InternalRangoMode.g:1177:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    // InternalRangoMode.g:1178:3: ( rule__Edition__ModesAssignment_3_5 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_5()); 
                    // InternalRangoMode.g:1179:3: ( rule__Edition__ModesAssignment_3_5 )
                    // InternalRangoMode.g:1179:4: rule__Edition__ModesAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__ModesAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getModesAssignment_3_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Alternatives_3"


    // $ANTLR start "rule__SplitRule__Alternatives"
    // InternalRangoMode.g:1187:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1191:1: ( ( ruleVanish ) | ( ruleSplit ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRangoMode.g:1192:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1192:2: ( ruleVanish )
                    // InternalRangoMode.g:1193:3: ruleVanish
                    {
                     before(grammarAccess.getSplitRuleAccess().getVanishParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVanish();

                    state._fsp--;

                     after(grammarAccess.getSplitRuleAccess().getVanishParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1198:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1198:2: ( ruleSplit )
                    // InternalRangoMode.g:1199:3: ruleSplit
                    {
                     before(grammarAccess.getSplitRuleAccess().getSplitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSplit();

                    state._fsp--;

                     after(grammarAccess.getSplitRuleAccess().getSplitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplitRule__Alternatives"


    // $ANTLR start "rule__PlayerEffect__Alternatives"
    // InternalRangoMode.g:1208:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1212:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case 47:
                {
                alt3=2;
                }
                break;
            case 48:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            case 51:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRangoMode.g:1213:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1213:2: ( ruleDamage )
                    // InternalRangoMode.g:1214:3: ruleDamage
                    {
                     before(grammarAccess.getPlayerEffectAccess().getDamageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDamage();

                    state._fsp--;

                     after(grammarAccess.getPlayerEffectAccess().getDamageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1219:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1219:2: ( ruleHeal )
                    // InternalRangoMode.g:1220:3: ruleHeal
                    {
                     before(grammarAccess.getPlayerEffectAccess().getHealParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHeal();

                    state._fsp--;

                     after(grammarAccess.getPlayerEffectAccess().getHealParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1225:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1225:2: ( ruleShield )
                    // InternalRangoMode.g:1226:3: ruleShield
                    {
                     before(grammarAccess.getPlayerEffectAccess().getShieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleShield();

                    state._fsp--;

                     after(grammarAccess.getPlayerEffectAccess().getShieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1231:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1231:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1232:3: ruleSpeedChange
                    {
                     before(grammarAccess.getPlayerEffectAccess().getSpeedChangeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSpeedChange();

                    state._fsp--;

                     after(grammarAccess.getPlayerEffectAccess().getSpeedChangeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1237:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1237:2: ( rulePoison )
                    // InternalRangoMode.g:1238:3: rulePoison
                    {
                     before(grammarAccess.getPlayerEffectAccess().getPoisonParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePoison();

                    state._fsp--;

                     after(grammarAccess.getPlayerEffectAccess().getPoisonParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerEffect__Alternatives"


    // $ANTLR start "rule__GameMode__Alternatives_9"
    // InternalRangoMode.g:1247:1: rule__GameMode__Alternatives_9 : ( ( ( rule__GameMode__LevelsAssignment_9_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_9_1 ) ) ( ( rule__GameMode__LevelsAssignment_9_1 )* ) ) );
    public final void rule__GameMode__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1251:1: ( ( ( rule__GameMode__LevelsAssignment_9_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_9_1 ) ) ( ( rule__GameMode__LevelsAssignment_9_1 )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==70) ) {
                alt5=1;
            }
            else if ( (LA5_0==64) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1252:2: ( ( rule__GameMode__LevelsAssignment_9_0 ) )
                    {
                    // InternalRangoMode.g:1252:2: ( ( rule__GameMode__LevelsAssignment_9_0 ) )
                    // InternalRangoMode.g:1253:3: ( rule__GameMode__LevelsAssignment_9_0 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_9_0()); 
                    // InternalRangoMode.g:1254:3: ( rule__GameMode__LevelsAssignment_9_0 )
                    // InternalRangoMode.g:1254:4: rule__GameMode__LevelsAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__LevelsAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1258:2: ( ( ( rule__GameMode__LevelsAssignment_9_1 ) ) ( ( rule__GameMode__LevelsAssignment_9_1 )* ) )
                    {
                    // InternalRangoMode.g:1258:2: ( ( ( rule__GameMode__LevelsAssignment_9_1 ) ) ( ( rule__GameMode__LevelsAssignment_9_1 )* ) )
                    // InternalRangoMode.g:1259:3: ( ( rule__GameMode__LevelsAssignment_9_1 ) ) ( ( rule__GameMode__LevelsAssignment_9_1 )* )
                    {
                    // InternalRangoMode.g:1259:3: ( ( rule__GameMode__LevelsAssignment_9_1 ) )
                    // InternalRangoMode.g:1260:4: ( rule__GameMode__LevelsAssignment_9_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_9_1()); 
                    // InternalRangoMode.g:1261:4: ( rule__GameMode__LevelsAssignment_9_1 )
                    // InternalRangoMode.g:1261:5: rule__GameMode__LevelsAssignment_9_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__GameMode__LevelsAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_9_1()); 

                    }

                    // InternalRangoMode.g:1264:3: ( ( rule__GameMode__LevelsAssignment_9_1 )* )
                    // InternalRangoMode.g:1265:4: ( rule__GameMode__LevelsAssignment_9_1 )*
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_9_1()); 
                    // InternalRangoMode.g:1266:4: ( rule__GameMode__LevelsAssignment_9_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==64) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRangoMode.g:1266:5: rule__GameMode__LevelsAssignment_9_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__GameMode__LevelsAssignment_9_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_9_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Alternatives_9"


    // $ANTLR start "rule__Obstacle__Alternatives"
    // InternalRangoMode.g:1275:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1279:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt6=1;
                }
                break;
            case 79:
                {
                alt6=2;
                }
                break;
            case 82:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:1280:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1280:2: ( ruleBlock )
                    // InternalRangoMode.g:1281:3: ruleBlock
                    {
                     before(grammarAccess.getObstacleAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getObstacleAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1286:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1286:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1287:3: ruleJumpPad
                    {
                     before(grammarAccess.getObstacleAccess().getJumpPadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJumpPad();

                    state._fsp--;

                     after(grammarAccess.getObstacleAccess().getJumpPadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1292:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1292:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1293:3: ruleTeleporter
                    {
                     before(grammarAccess.getObstacleAccess().getTeleporterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTeleporter();

                    state._fsp--;

                     after(grammarAccess.getObstacleAccess().getTeleporterParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Alternatives"


    // $ANTLR start "rule__SpawnStrategy__Alternatives"
    // InternalRangoMode.g:1302:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1306:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==83) ) {
                alt7=1;
            }
            else if ( (LA7_0==84) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1307:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1307:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1308:3: ruleFixedLayout
                    {
                     before(grammarAccess.getSpawnStrategyAccess().getFixedLayoutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFixedLayout();

                    state._fsp--;

                     after(grammarAccess.getSpawnStrategyAccess().getFixedLayoutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1313:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1313:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1314:3: ruleWaveSchedule
                    {
                     before(grammarAccess.getSpawnStrategyAccess().getWaveScheduleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWaveSchedule();

                    state._fsp--;

                     after(grammarAccess.getSpawnStrategyAccess().getWaveScheduleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpawnStrategy__Alternatives"


    // $ANTLR start "rule__WinCondition__Alternatives"
    // InternalRangoMode.g:1323:1: rule__WinCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeSurvived ) | ( ruleWavesSurvived ) );
    public final void rule__WinCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1327:1: ( ( ruleCleared ) | ( ruleTimeSurvived ) | ( ruleWavesSurvived ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt8=1;
                }
                break;
            case 97:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:1328:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1328:2: ( ruleCleared )
                    // InternalRangoMode.g:1329:3: ruleCleared
                    {
                     before(grammarAccess.getWinConditionAccess().getClearedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCleared();

                    state._fsp--;

                     after(grammarAccess.getWinConditionAccess().getClearedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1334:2: ( ruleTimeSurvived )
                    {
                    // InternalRangoMode.g:1334:2: ( ruleTimeSurvived )
                    // InternalRangoMode.g:1335:3: ruleTimeSurvived
                    {
                     before(grammarAccess.getWinConditionAccess().getTimeSurvivedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeSurvived();

                    state._fsp--;

                     after(grammarAccess.getWinConditionAccess().getTimeSurvivedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1340:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1340:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1341:3: ruleWavesSurvived
                    {
                     before(grammarAccess.getWinConditionAccess().getWavesSurvivedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWavesSurvived();

                    state._fsp--;

                     after(grammarAccess.getWinConditionAccess().getWavesSurvivedParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinCondition__Alternatives"


    // $ANTLR start "rule__LoseCondition__Alternatives"
    // InternalRangoMode.g:1350:1: rule__LoseCondition__Alternatives : ( ( ruleHealthDepleted ) | ( ruleTimeLimit ) );
    public final void rule__LoseCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1354:1: ( ( ruleHealthDepleted ) | ( ruleTimeLimit ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==56) ) {
                alt9=1;
            }
            else if ( (LA9_0==97) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:1355:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1355:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1356:3: ruleHealthDepleted
                    {
                     before(grammarAccess.getLoseConditionAccess().getHealthDepletedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHealthDepleted();

                    state._fsp--;

                     after(grammarAccess.getLoseConditionAccess().getHealthDepletedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1361:2: ( ruleTimeLimit )
                    {
                    // InternalRangoMode.g:1361:2: ( ruleTimeLimit )
                    // InternalRangoMode.g:1362:3: ruleTimeLimit
                    {
                     before(grammarAccess.getLoseConditionAccess().getTimeLimitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeLimit();

                    state._fsp--;

                     after(grammarAccess.getLoseConditionAccess().getTimeLimitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoseCondition__Alternatives"


    // $ANTLR start "rule__DifficultyTier__Alternatives"
    // InternalRangoMode.g:1371:1: rule__DifficultyTier__Alternatives : ( ( ( 'easy' ) ) | ( ( 'medium' ) ) | ( ( 'hard' ) ) );
    public final void rule__DifficultyTier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1375:1: ( ( ( 'easy' ) ) | ( ( 'medium' ) ) | ( ( 'hard' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRangoMode.g:1376:2: ( ( 'easy' ) )
                    {
                    // InternalRangoMode.g:1376:2: ( ( 'easy' ) )
                    // InternalRangoMode.g:1377:3: ( 'easy' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1378:3: ( 'easy' )
                    // InternalRangoMode.g:1378:4: 'easy'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1382:2: ( ( 'medium' ) )
                    {
                    // InternalRangoMode.g:1382:2: ( ( 'medium' ) )
                    // InternalRangoMode.g:1383:3: ( 'medium' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1384:3: ( 'medium' )
                    // InternalRangoMode.g:1384:4: 'medium'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1388:2: ( ( 'hard' ) )
                    {
                    // InternalRangoMode.g:1388:2: ( ( 'hard' ) )
                    // InternalRangoMode.g:1389:3: ( 'hard' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getHARDEnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1390:3: ( 'hard' )
                    // InternalRangoMode.g:1390:4: 'hard'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyTierAccess().getHARDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifficultyTier__Alternatives"


    // $ANTLR start "rule__ModifierTarget__Alternatives"
    // InternalRangoMode.g:1398:1: rule__ModifierTarget__Alternatives : ( ( ( 'enemy.speed' ) ) | ( ( 'enemy.points' ) ) | ( ( 'player.health' ) ) | ( ( 'player.speed' ) ) | ( ( 'drop.chance' ) ) | ( ( 'wave.delay' ) ) );
    public final void rule__ModifierTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1402:1: ( ( ( 'enemy.speed' ) ) | ( ( 'enemy.points' ) ) | ( ( 'player.health' ) ) | ( ( 'player.speed' ) ) | ( ( 'drop.chance' ) ) | ( ( 'wave.delay' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt11=1;
                }
                break;
            case 15:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
                }
                break;
            case 17:
                {
                alt11=4;
                }
                break;
            case 18:
                {
                alt11=5;
                }
                break;
            case 19:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRangoMode.g:1403:2: ( ( 'enemy.speed' ) )
                    {
                    // InternalRangoMode.g:1403:2: ( ( 'enemy.speed' ) )
                    // InternalRangoMode.g:1404:3: ( 'enemy.speed' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1405:3: ( 'enemy.speed' )
                    // InternalRangoMode.g:1405:4: 'enemy.speed'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1409:2: ( ( 'enemy.points' ) )
                    {
                    // InternalRangoMode.g:1409:2: ( ( 'enemy.points' ) )
                    // InternalRangoMode.g:1410:3: ( 'enemy.points' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1411:3: ( 'enemy.points' )
                    // InternalRangoMode.g:1411:4: 'enemy.points'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1415:2: ( ( 'player.health' ) )
                    {
                    // InternalRangoMode.g:1415:2: ( ( 'player.health' ) )
                    // InternalRangoMode.g:1416:3: ( 'player.health' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1417:3: ( 'player.health' )
                    // InternalRangoMode.g:1417:4: 'player.health'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1421:2: ( ( 'player.speed' ) )
                    {
                    // InternalRangoMode.g:1421:2: ( ( 'player.speed' ) )
                    // InternalRangoMode.g:1422:3: ( 'player.speed' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3()); 
                    // InternalRangoMode.g:1423:3: ( 'player.speed' )
                    // InternalRangoMode.g:1423:4: 'player.speed'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1427:2: ( ( 'drop.chance' ) )
                    {
                    // InternalRangoMode.g:1427:2: ( ( 'drop.chance' ) )
                    // InternalRangoMode.g:1428:3: ( 'drop.chance' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4()); 
                    // InternalRangoMode.g:1429:3: ( 'drop.chance' )
                    // InternalRangoMode.g:1429:4: 'drop.chance'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:1433:2: ( ( 'wave.delay' ) )
                    {
                    // InternalRangoMode.g:1433:2: ( ( 'wave.delay' ) )
                    // InternalRangoMode.g:1434:3: ( 'wave.delay' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getWAVE_DELAYEnumLiteralDeclaration_5()); 
                    // InternalRangoMode.g:1435:3: ( 'wave.delay' )
                    // InternalRangoMode.g:1435:4: 'wave.delay'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getWAVE_DELAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierTarget__Alternatives"


    // $ANTLR start "rule__Target__Alternatives"
    // InternalRangoMode.g:1443:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1447:1: ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRangoMode.g:1448:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1448:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1449:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1450:3: ( 'everything' )
                    // InternalRangoMode.g:1450:4: 'everything'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1454:2: ( ( 'enemies' ) )
                    {
                    // InternalRangoMode.g:1454:2: ( ( 'enemies' ) )
                    // InternalRangoMode.g:1455:3: ( 'enemies' )
                    {
                     before(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1456:3: ( 'enemies' )
                    // InternalRangoMode.g:1456:4: 'enemies'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1460:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1460:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1461:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1462:3: ( 'player' )
                    // InternalRangoMode.g:1462:4: 'player'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalRangoMode.g:1470:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1474:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRangoMode.g:1475:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1475:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1476:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1477:3: ( 'left' )
                    // InternalRangoMode.g:1477:4: 'left'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1481:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1481:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1482:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1483:3: ( 'right' )
                    // InternalRangoMode.g:1483:4: 'right'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Edition__Group__0"
    // InternalRangoMode.g:1491:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1495:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1496:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Edition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__0"


    // $ANTLR start "rule__Edition__Group__0__Impl"
    // InternalRangoMode.g:1503:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1507:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1508:1: ( 'edition' )
            {
            // InternalRangoMode.g:1508:1: ( 'edition' )
            // InternalRangoMode.g:1509:2: 'edition'
            {
             before(grammarAccess.getEditionAccess().getEditionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEditionAccess().getEditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__0__Impl"


    // $ANTLR start "rule__Edition__Group__1"
    // InternalRangoMode.g:1518:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1522:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1523:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Edition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__1"


    // $ANTLR start "rule__Edition__Group__1__Impl"
    // InternalRangoMode.g:1530:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1534:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1535:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1535:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1536:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1537:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1537:3: rule__Edition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Edition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__1__Impl"


    // $ANTLR start "rule__Edition__Group__2"
    // InternalRangoMode.g:1545:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1549:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1550:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Edition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__2"


    // $ANTLR start "rule__Edition__Group__2__Impl"
    // InternalRangoMode.g:1557:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1561:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1562:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1562:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1563:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1564:2: ( rule__Edition__TitleAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRangoMode.g:1564:3: rule__Edition__TitleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__TitleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditionAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__2__Impl"


    // $ANTLR start "rule__Edition__Group__3"
    // InternalRangoMode.g:1572:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1576:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1577:2: rule__Edition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__3"


    // $ANTLR start "rule__Edition__Group__3__Impl"
    // InternalRangoMode.g:1583:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1587:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1588:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1588:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1589:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1590:2: ( rule__Edition__Alternatives_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22||LA15_0==26||LA15_0==30||LA15_0==53||LA15_0==61||LA15_0==89) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRangoMode.g:1590:3: rule__Edition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Edition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEditionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__Group__3__Impl"


    // $ANTLR start "rule__Difficulty__Group__0"
    // InternalRangoMode.g:1599:1: rule__Difficulty__Group__0 : rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1 ;
    public final void rule__Difficulty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1603:1: ( rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1 )
            // InternalRangoMode.g:1604:2: rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Difficulty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__0"


    // $ANTLR start "rule__Difficulty__Group__0__Impl"
    // InternalRangoMode.g:1611:1: rule__Difficulty__Group__0__Impl : ( 'difficulty' ) ;
    public final void rule__Difficulty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1615:1: ( ( 'difficulty' ) )
            // InternalRangoMode.g:1616:1: ( 'difficulty' )
            {
            // InternalRangoMode.g:1616:1: ( 'difficulty' )
            // InternalRangoMode.g:1617:2: 'difficulty'
            {
             before(grammarAccess.getDifficultyAccess().getDifficultyKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDifficultyAccess().getDifficultyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__0__Impl"


    // $ANTLR start "rule__Difficulty__Group__1"
    // InternalRangoMode.g:1626:1: rule__Difficulty__Group__1 : rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2 ;
    public final void rule__Difficulty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1630:1: ( rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2 )
            // InternalRangoMode.g:1631:2: rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Difficulty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__1"


    // $ANTLR start "rule__Difficulty__Group__1__Impl"
    // InternalRangoMode.g:1638:1: rule__Difficulty__Group__1__Impl : ( ( rule__Difficulty__TierAssignment_1 ) ) ;
    public final void rule__Difficulty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1642:1: ( ( ( rule__Difficulty__TierAssignment_1 ) ) )
            // InternalRangoMode.g:1643:1: ( ( rule__Difficulty__TierAssignment_1 ) )
            {
            // InternalRangoMode.g:1643:1: ( ( rule__Difficulty__TierAssignment_1 ) )
            // InternalRangoMode.g:1644:2: ( rule__Difficulty__TierAssignment_1 )
            {
             before(grammarAccess.getDifficultyAccess().getTierAssignment_1()); 
            // InternalRangoMode.g:1645:2: ( rule__Difficulty__TierAssignment_1 )
            // InternalRangoMode.g:1645:3: rule__Difficulty__TierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Difficulty__TierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyAccess().getTierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__1__Impl"


    // $ANTLR start "rule__Difficulty__Group__2"
    // InternalRangoMode.g:1653:1: rule__Difficulty__Group__2 : rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3 ;
    public final void rule__Difficulty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1657:1: ( rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3 )
            // InternalRangoMode.g:1658:2: rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Difficulty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__2"


    // $ANTLR start "rule__Difficulty__Group__2__Impl"
    // InternalRangoMode.g:1665:1: rule__Difficulty__Group__2__Impl : ( '{' ) ;
    public final void rule__Difficulty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1669:1: ( ( '{' ) )
            // InternalRangoMode.g:1670:1: ( '{' )
            {
            // InternalRangoMode.g:1670:1: ( '{' )
            // InternalRangoMode.g:1671:2: '{'
            {
             before(grammarAccess.getDifficultyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDifficultyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__2__Impl"


    // $ANTLR start "rule__Difficulty__Group__3"
    // InternalRangoMode.g:1680:1: rule__Difficulty__Group__3 : rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4 ;
    public final void rule__Difficulty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1684:1: ( rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4 )
            // InternalRangoMode.g:1685:2: rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Difficulty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__3"


    // $ANTLR start "rule__Difficulty__Group__3__Impl"
    // InternalRangoMode.g:1692:1: rule__Difficulty__Group__3__Impl : ( ( rule__Difficulty__ModifiersAssignment_3 )* ) ;
    public final void rule__Difficulty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1696:1: ( ( ( rule__Difficulty__ModifiersAssignment_3 )* ) )
            // InternalRangoMode.g:1697:1: ( ( rule__Difficulty__ModifiersAssignment_3 )* )
            {
            // InternalRangoMode.g:1697:1: ( ( rule__Difficulty__ModifiersAssignment_3 )* )
            // InternalRangoMode.g:1698:2: ( rule__Difficulty__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getDifficultyAccess().getModifiersAssignment_3()); 
            // InternalRangoMode.g:1699:2: ( rule__Difficulty__ModifiersAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=14 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRangoMode.g:1699:3: rule__Difficulty__ModifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Difficulty__ModifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDifficultyAccess().getModifiersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__3__Impl"


    // $ANTLR start "rule__Difficulty__Group__4"
    // InternalRangoMode.g:1707:1: rule__Difficulty__Group__4 : rule__Difficulty__Group__4__Impl ;
    public final void rule__Difficulty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1711:1: ( rule__Difficulty__Group__4__Impl )
            // InternalRangoMode.g:1712:2: rule__Difficulty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Difficulty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__4"


    // $ANTLR start "rule__Difficulty__Group__4__Impl"
    // InternalRangoMode.g:1718:1: rule__Difficulty__Group__4__Impl : ( '}' ) ;
    public final void rule__Difficulty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1722:1: ( ( '}' ) )
            // InternalRangoMode.g:1723:1: ( '}' )
            {
            // InternalRangoMode.g:1723:1: ( '}' )
            // InternalRangoMode.g:1724:2: '}'
            {
             before(grammarAccess.getDifficultyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDifficultyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__Group__4__Impl"


    // $ANTLR start "rule__Modifier__Group__0"
    // InternalRangoMode.g:1734:1: rule__Modifier__Group__0 : rule__Modifier__Group__0__Impl rule__Modifier__Group__1 ;
    public final void rule__Modifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1738:1: ( rule__Modifier__Group__0__Impl rule__Modifier__Group__1 )
            // InternalRangoMode.g:1739:2: rule__Modifier__Group__0__Impl rule__Modifier__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Modifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__0"


    // $ANTLR start "rule__Modifier__Group__0__Impl"
    // InternalRangoMode.g:1746:1: rule__Modifier__Group__0__Impl : ( ( rule__Modifier__TargetAssignment_0 ) ) ;
    public final void rule__Modifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1750:1: ( ( ( rule__Modifier__TargetAssignment_0 ) ) )
            // InternalRangoMode.g:1751:1: ( ( rule__Modifier__TargetAssignment_0 ) )
            {
            // InternalRangoMode.g:1751:1: ( ( rule__Modifier__TargetAssignment_0 ) )
            // InternalRangoMode.g:1752:2: ( rule__Modifier__TargetAssignment_0 )
            {
             before(grammarAccess.getModifierAccess().getTargetAssignment_0()); 
            // InternalRangoMode.g:1753:2: ( rule__Modifier__TargetAssignment_0 )
            // InternalRangoMode.g:1753:3: rule__Modifier__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__0__Impl"


    // $ANTLR start "rule__Modifier__Group__1"
    // InternalRangoMode.g:1761:1: rule__Modifier__Group__1 : rule__Modifier__Group__1__Impl rule__Modifier__Group__2 ;
    public final void rule__Modifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1765:1: ( rule__Modifier__Group__1__Impl rule__Modifier__Group__2 )
            // InternalRangoMode.g:1766:2: rule__Modifier__Group__1__Impl rule__Modifier__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Modifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__1"


    // $ANTLR start "rule__Modifier__Group__1__Impl"
    // InternalRangoMode.g:1773:1: rule__Modifier__Group__1__Impl : ( '*' ) ;
    public final void rule__Modifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1777:1: ( ( '*' ) )
            // InternalRangoMode.g:1778:1: ( '*' )
            {
            // InternalRangoMode.g:1778:1: ( '*' )
            // InternalRangoMode.g:1779:2: '*'
            {
             before(grammarAccess.getModifierAccess().getAsteriskKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModifierAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__1__Impl"


    // $ANTLR start "rule__Modifier__Group__2"
    // InternalRangoMode.g:1788:1: rule__Modifier__Group__2 : rule__Modifier__Group__2__Impl ;
    public final void rule__Modifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1792:1: ( rule__Modifier__Group__2__Impl )
            // InternalRangoMode.g:1793:2: rule__Modifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__2"


    // $ANTLR start "rule__Modifier__Group__2__Impl"
    // InternalRangoMode.g:1799:1: rule__Modifier__Group__2__Impl : ( ( rule__Modifier__FactorAssignment_2 ) ) ;
    public final void rule__Modifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1803:1: ( ( ( rule__Modifier__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:1804:1: ( ( rule__Modifier__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:1804:1: ( ( rule__Modifier__FactorAssignment_2 ) )
            // InternalRangoMode.g:1805:2: ( rule__Modifier__FactorAssignment_2 )
            {
             before(grammarAccess.getModifierAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:1806:2: ( rule__Modifier__FactorAssignment_2 )
            // InternalRangoMode.g:1806:3: rule__Modifier__FactorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__FactorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getFactorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Group__2__Impl"


    // $ANTLR start "rule__EnemyType__Group__0"
    // InternalRangoMode.g:1815:1: rule__EnemyType__Group__0 : rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 ;
    public final void rule__EnemyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1819:1: ( rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 )
            // InternalRangoMode.g:1820:2: rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EnemyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__0"


    // $ANTLR start "rule__EnemyType__Group__0__Impl"
    // InternalRangoMode.g:1827:1: rule__EnemyType__Group__0__Impl : ( 'enemy' ) ;
    public final void rule__EnemyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1831:1: ( ( 'enemy' ) )
            // InternalRangoMode.g:1832:1: ( 'enemy' )
            {
            // InternalRangoMode.g:1832:1: ( 'enemy' )
            // InternalRangoMode.g:1833:2: 'enemy'
            {
             before(grammarAccess.getEnemyTypeAccess().getEnemyKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getEnemyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__0__Impl"


    // $ANTLR start "rule__EnemyType__Group__1"
    // InternalRangoMode.g:1842:1: rule__EnemyType__Group__1 : rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 ;
    public final void rule__EnemyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1846:1: ( rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 )
            // InternalRangoMode.g:1847:2: rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EnemyType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__1"


    // $ANTLR start "rule__EnemyType__Group__1__Impl"
    // InternalRangoMode.g:1854:1: rule__EnemyType__Group__1__Impl : ( ( rule__EnemyType__NameAssignment_1 ) ) ;
    public final void rule__EnemyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1858:1: ( ( ( rule__EnemyType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1859:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1859:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            // InternalRangoMode.g:1860:2: ( rule__EnemyType__NameAssignment_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1861:2: ( rule__EnemyType__NameAssignment_1 )
            // InternalRangoMode.g:1861:3: rule__EnemyType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__1__Impl"


    // $ANTLR start "rule__EnemyType__Group__2"
    // InternalRangoMode.g:1869:1: rule__EnemyType__Group__2 : rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 ;
    public final void rule__EnemyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1873:1: ( rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 )
            // InternalRangoMode.g:1874:2: rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EnemyType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__2"


    // $ANTLR start "rule__EnemyType__Group__2__Impl"
    // InternalRangoMode.g:1881:1: rule__EnemyType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnemyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1885:1: ( ( '{' ) )
            // InternalRangoMode.g:1886:1: ( '{' )
            {
            // InternalRangoMode.g:1886:1: ( '{' )
            // InternalRangoMode.g:1887:2: '{'
            {
             before(grammarAccess.getEnemyTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__2__Impl"


    // $ANTLR start "rule__EnemyType__Group__3"
    // InternalRangoMode.g:1896:1: rule__EnemyType__Group__3 : rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 ;
    public final void rule__EnemyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1900:1: ( rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 )
            // InternalRangoMode.g:1901:2: rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__EnemyType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__3"


    // $ANTLR start "rule__EnemyType__Group__3__Impl"
    // InternalRangoMode.g:1908:1: rule__EnemyType__Group__3__Impl : ( ( rule__EnemyType__UnorderedGroup_3 ) ) ;
    public final void rule__EnemyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1912:1: ( ( ( rule__EnemyType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1913:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1913:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1914:2: ( rule__EnemyType__UnorderedGroup_3 )
            {
             before(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1915:2: ( rule__EnemyType__UnorderedGroup_3 )
            // InternalRangoMode.g:1915:3: rule__EnemyType__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__3__Impl"


    // $ANTLR start "rule__EnemyType__Group__4"
    // InternalRangoMode.g:1923:1: rule__EnemyType__Group__4 : rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 ;
    public final void rule__EnemyType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1927:1: ( rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 )
            // InternalRangoMode.g:1928:2: rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EnemyType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__4"


    // $ANTLR start "rule__EnemyType__Group__4__Impl"
    // InternalRangoMode.g:1935:1: rule__EnemyType__Group__4__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1939:1: ( ( 'on' ) )
            // InternalRangoMode.g:1940:1: ( 'on' )
            {
            // InternalRangoMode.g:1940:1: ( 'on' )
            // InternalRangoMode.g:1941:2: 'on'
            {
             before(grammarAccess.getEnemyTypeAccess().getOnKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__4__Impl"


    // $ANTLR start "rule__EnemyType__Group__5"
    // InternalRangoMode.g:1950:1: rule__EnemyType__Group__5 : rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 ;
    public final void rule__EnemyType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1954:1: ( rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 )
            // InternalRangoMode.g:1955:2: rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__EnemyType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__5"


    // $ANTLR start "rule__EnemyType__Group__5__Impl"
    // InternalRangoMode.g:1962:1: rule__EnemyType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__EnemyType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1966:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1967:1: ( 'pop' )
            {
            // InternalRangoMode.g:1967:1: ( 'pop' )
            // InternalRangoMode.g:1968:2: 'pop'
            {
             before(grammarAccess.getEnemyTypeAccess().getPopKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getPopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__5__Impl"


    // $ANTLR start "rule__EnemyType__Group__6"
    // InternalRangoMode.g:1977:1: rule__EnemyType__Group__6 : rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 ;
    public final void rule__EnemyType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1981:1: ( rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 )
            // InternalRangoMode.g:1982:2: rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__EnemyType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__6"


    // $ANTLR start "rule__EnemyType__Group__6__Impl"
    // InternalRangoMode.g:1989:1: rule__EnemyType__Group__6__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1993:1: ( ( ':' ) )
            // InternalRangoMode.g:1994:1: ( ':' )
            {
            // InternalRangoMode.g:1994:1: ( ':' )
            // InternalRangoMode.g:1995:2: ':'
            {
             before(grammarAccess.getEnemyTypeAccess().getColonKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__6__Impl"


    // $ANTLR start "rule__EnemyType__Group__7"
    // InternalRangoMode.g:2004:1: rule__EnemyType__Group__7 : rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 ;
    public final void rule__EnemyType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2008:1: ( rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 )
            // InternalRangoMode.g:2009:2: rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__EnemyType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__7"


    // $ANTLR start "rule__EnemyType__Group__7__Impl"
    // InternalRangoMode.g:2016:1: rule__EnemyType__Group__7__Impl : ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) ;
    public final void rule__EnemyType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2020:1: ( ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:2021:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:2021:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:2022:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:2023:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:2023:3: rule__EnemyType__SplitRuleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__SplitRuleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__7__Impl"


    // $ANTLR start "rule__EnemyType__Group__8"
    // InternalRangoMode.g:2031:1: rule__EnemyType__Group__8 : rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 ;
    public final void rule__EnemyType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2035:1: ( rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 )
            // InternalRangoMode.g:2036:2: rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__EnemyType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__8"


    // $ANTLR start "rule__EnemyType__Group__8__Impl"
    // InternalRangoMode.g:2043:1: rule__EnemyType__Group__8__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2047:1: ( ( 'on' ) )
            // InternalRangoMode.g:2048:1: ( 'on' )
            {
            // InternalRangoMode.g:2048:1: ( 'on' )
            // InternalRangoMode.g:2049:2: 'on'
            {
             before(grammarAccess.getEnemyTypeAccess().getOnKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getOnKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__8__Impl"


    // $ANTLR start "rule__EnemyType__Group__9"
    // InternalRangoMode.g:2058:1: rule__EnemyType__Group__9 : rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 ;
    public final void rule__EnemyType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2062:1: ( rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 )
            // InternalRangoMode.g:2063:2: rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__EnemyType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__9"


    // $ANTLR start "rule__EnemyType__Group__9__Impl"
    // InternalRangoMode.g:2070:1: rule__EnemyType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__EnemyType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2074:1: ( ( 'contact' ) )
            // InternalRangoMode.g:2075:1: ( 'contact' )
            {
            // InternalRangoMode.g:2075:1: ( 'contact' )
            // InternalRangoMode.g:2076:2: 'contact'
            {
             before(grammarAccess.getEnemyTypeAccess().getContactKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getContactKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__9__Impl"


    // $ANTLR start "rule__EnemyType__Group__10"
    // InternalRangoMode.g:2085:1: rule__EnemyType__Group__10 : rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 ;
    public final void rule__EnemyType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2089:1: ( rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 )
            // InternalRangoMode.g:2090:2: rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__EnemyType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__10"


    // $ANTLR start "rule__EnemyType__Group__10__Impl"
    // InternalRangoMode.g:2097:1: rule__EnemyType__Group__10__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2101:1: ( ( ':' ) )
            // InternalRangoMode.g:2102:1: ( ':' )
            {
            // InternalRangoMode.g:2102:1: ( ':' )
            // InternalRangoMode.g:2103:2: ':'
            {
             before(grammarAccess.getEnemyTypeAccess().getColonKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__10__Impl"


    // $ANTLR start "rule__EnemyType__Group__11"
    // InternalRangoMode.g:2112:1: rule__EnemyType__Group__11 : rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 ;
    public final void rule__EnemyType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2116:1: ( rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 )
            // InternalRangoMode.g:2117:2: rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__EnemyType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__11"


    // $ANTLR start "rule__EnemyType__Group__11__Impl"
    // InternalRangoMode.g:2124:1: rule__EnemyType__Group__11__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__EnemyType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2128:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:2129:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:2129:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:2130:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:2131:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:2131:3: rule__EnemyType__ContactEffectsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__ContactEffectsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__11__Impl"


    // $ANTLR start "rule__EnemyType__Group__12"
    // InternalRangoMode.g:2139:1: rule__EnemyType__Group__12 : rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 ;
    public final void rule__EnemyType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2143:1: ( rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 )
            // InternalRangoMode.g:2144:2: rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__EnemyType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__12"


    // $ANTLR start "rule__EnemyType__Group__12__Impl"
    // InternalRangoMode.g:2151:1: rule__EnemyType__Group__12__Impl : ( ( rule__EnemyType__Group_12__0 )* ) ;
    public final void rule__EnemyType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2155:1: ( ( ( rule__EnemyType__Group_12__0 )* ) )
            // InternalRangoMode.g:2156:1: ( ( rule__EnemyType__Group_12__0 )* )
            {
            // InternalRangoMode.g:2156:1: ( ( rule__EnemyType__Group_12__0 )* )
            // InternalRangoMode.g:2157:2: ( rule__EnemyType__Group_12__0 )*
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:2158:2: ( rule__EnemyType__Group_12__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRangoMode.g:2158:3: rule__EnemyType__Group_12__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EnemyType__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEnemyTypeAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__12__Impl"


    // $ANTLR start "rule__EnemyType__Group__13"
    // InternalRangoMode.g:2166:1: rule__EnemyType__Group__13 : rule__EnemyType__Group__13__Impl ;
    public final void rule__EnemyType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2170:1: ( rule__EnemyType__Group__13__Impl )
            // InternalRangoMode.g:2171:2: rule__EnemyType__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__13"


    // $ANTLR start "rule__EnemyType__Group__13__Impl"
    // InternalRangoMode.g:2177:1: rule__EnemyType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnemyType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2181:1: ( ( '}' ) )
            // InternalRangoMode.g:2182:1: ( '}' )
            {
            // InternalRangoMode.g:2182:1: ( '}' )
            // InternalRangoMode.g:2183:2: '}'
            {
             before(grammarAccess.getEnemyTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group__13__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_0__0"
    // InternalRangoMode.g:2193:1: rule__EnemyType__Group_3_0__0 : rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 ;
    public final void rule__EnemyType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2197:1: ( rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 )
            // InternalRangoMode.g:2198:2: rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1
            {
            pushFollow(FOLLOW_22);
            rule__EnemyType__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_0__0"


    // $ANTLR start "rule__EnemyType__Group_3_0__0__Impl"
    // InternalRangoMode.g:2205:1: rule__EnemyType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__EnemyType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2209:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:2210:1: ( 'sprite' )
            {
            // InternalRangoMode.g:2210:1: ( 'sprite' )
            // InternalRangoMode.g:2211:2: 'sprite'
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteKeyword_3_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getSpriteKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_0__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_0__1"
    // InternalRangoMode.g:2220:1: rule__EnemyType__Group_3_0__1 : rule__EnemyType__Group_3_0__1__Impl ;
    public final void rule__EnemyType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2224:1: ( rule__EnemyType__Group_3_0__1__Impl )
            // InternalRangoMode.g:2225:2: rule__EnemyType__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_0__1"


    // $ANTLR start "rule__EnemyType__Group_3_0__1__Impl"
    // InternalRangoMode.g:2231:1: rule__EnemyType__Group_3_0__1__Impl : ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__EnemyType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2235:1: ( ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:2236:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:2236:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:2237:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:2238:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:2238:3: rule__EnemyType__SpriteAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__SpriteAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_0__1__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_1__0"
    // InternalRangoMode.g:2247:1: rule__EnemyType__Group_3_1__0 : rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 ;
    public final void rule__EnemyType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2251:1: ( rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 )
            // InternalRangoMode.g:2252:2: rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__EnemyType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_1__0"


    // $ANTLR start "rule__EnemyType__Group_3_1__0__Impl"
    // InternalRangoMode.g:2259:1: rule__EnemyType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__EnemyType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2263:1: ( ( 'scale' ) )
            // InternalRangoMode.g:2264:1: ( 'scale' )
            {
            // InternalRangoMode.g:2264:1: ( 'scale' )
            // InternalRangoMode.g:2265:2: 'scale'
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleKeyword_3_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getScaleKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_1__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_1__1"
    // InternalRangoMode.g:2274:1: rule__EnemyType__Group_3_1__1 : rule__EnemyType__Group_3_1__1__Impl ;
    public final void rule__EnemyType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2278:1: ( rule__EnemyType__Group_3_1__1__Impl )
            // InternalRangoMode.g:2279:2: rule__EnemyType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_1__1"


    // $ANTLR start "rule__EnemyType__Group_3_1__1__Impl"
    // InternalRangoMode.g:2285:1: rule__EnemyType__Group_3_1__1__Impl : ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__EnemyType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2289:1: ( ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:2290:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:2290:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:2291:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:2292:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:2292:3: rule__EnemyType__ScaleAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__ScaleAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_2__0"
    // InternalRangoMode.g:2301:1: rule__EnemyType__Group_3_2__0 : rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 ;
    public final void rule__EnemyType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2305:1: ( rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 )
            // InternalRangoMode.g:2306:2: rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__EnemyType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_2__0"


    // $ANTLR start "rule__EnemyType__Group_3_2__0__Impl"
    // InternalRangoMode.g:2313:1: rule__EnemyType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__EnemyType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2317:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:2318:1: ( 'bounce' )
            {
            // InternalRangoMode.g:2318:1: ( 'bounce' )
            // InternalRangoMode.g:2319:2: 'bounce'
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceKeyword_3_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getBounceKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_2__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_2__1"
    // InternalRangoMode.g:2328:1: rule__EnemyType__Group_3_2__1 : rule__EnemyType__Group_3_2__1__Impl ;
    public final void rule__EnemyType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2332:1: ( rule__EnemyType__Group_3_2__1__Impl )
            // InternalRangoMode.g:2333:2: rule__EnemyType__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_2__1"


    // $ANTLR start "rule__EnemyType__Group_3_2__1__Impl"
    // InternalRangoMode.g:2339:1: rule__EnemyType__Group_3_2__1__Impl : ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__EnemyType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2343:1: ( ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:2344:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:2344:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:2345:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:2346:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:2346:3: rule__EnemyType__BounceAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__BounceAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_2__1__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_3__0"
    // InternalRangoMode.g:2355:1: rule__EnemyType__Group_3_3__0 : rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 ;
    public final void rule__EnemyType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2359:1: ( rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 )
            // InternalRangoMode.g:2360:2: rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__EnemyType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_3__0"


    // $ANTLR start "rule__EnemyType__Group_3_3__0__Impl"
    // InternalRangoMode.g:2367:1: rule__EnemyType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__EnemyType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2371:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2372:1: ( 'speed' )
            {
            // InternalRangoMode.g:2372:1: ( 'speed' )
            // InternalRangoMode.g:2373:2: 'speed'
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getSpeedKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_3__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_3__1"
    // InternalRangoMode.g:2382:1: rule__EnemyType__Group_3_3__1 : rule__EnemyType__Group_3_3__1__Impl ;
    public final void rule__EnemyType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2386:1: ( rule__EnemyType__Group_3_3__1__Impl )
            // InternalRangoMode.g:2387:2: rule__EnemyType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_3__1"


    // $ANTLR start "rule__EnemyType__Group_3_3__1__Impl"
    // InternalRangoMode.g:2393:1: rule__EnemyType__Group_3_3__1__Impl : ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__EnemyType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2397:1: ( ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:2398:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:2398:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:2399:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:2400:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:2400:3: rule__EnemyType__SpeedAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__SpeedAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_3__1__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_4__0"
    // InternalRangoMode.g:2409:1: rule__EnemyType__Group_3_4__0 : rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 ;
    public final void rule__EnemyType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2413:1: ( rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 )
            // InternalRangoMode.g:2414:2: rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EnemyType__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_4__0"


    // $ANTLR start "rule__EnemyType__Group_3_4__0__Impl"
    // InternalRangoMode.g:2421:1: rule__EnemyType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__EnemyType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2425:1: ( ( 'points' ) )
            // InternalRangoMode.g:2426:1: ( 'points' )
            {
            // InternalRangoMode.g:2426:1: ( 'points' )
            // InternalRangoMode.g:2427:2: 'points'
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsKeyword_3_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getPointsKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_4__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_3_4__1"
    // InternalRangoMode.g:2436:1: rule__EnemyType__Group_3_4__1 : rule__EnemyType__Group_3_4__1__Impl ;
    public final void rule__EnemyType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2440:1: ( rule__EnemyType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2441:2: rule__EnemyType__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_4__1"


    // $ANTLR start "rule__EnemyType__Group_3_4__1__Impl"
    // InternalRangoMode.g:2447:1: rule__EnemyType__Group_3_4__1__Impl : ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__EnemyType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2451:1: ( ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2452:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2452:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2453:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2454:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2454:3: rule__EnemyType__PointsAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__PointsAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_3_4__1__Impl"


    // $ANTLR start "rule__EnemyType__Group_12__0"
    // InternalRangoMode.g:2463:1: rule__EnemyType__Group_12__0 : rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 ;
    public final void rule__EnemyType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2467:1: ( rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 )
            // InternalRangoMode.g:2468:2: rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__EnemyType__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_12__0"


    // $ANTLR start "rule__EnemyType__Group_12__0__Impl"
    // InternalRangoMode.g:2475:1: rule__EnemyType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__EnemyType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2479:1: ( ( ',' ) )
            // InternalRangoMode.g:2480:1: ( ',' )
            {
            // InternalRangoMode.g:2480:1: ( ',' )
            // InternalRangoMode.g:2481:2: ','
            {
             before(grammarAccess.getEnemyTypeAccess().getCommaKeyword_12_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_12__0__Impl"


    // $ANTLR start "rule__EnemyType__Group_12__1"
    // InternalRangoMode.g:2490:1: rule__EnemyType__Group_12__1 : rule__EnemyType__Group_12__1__Impl ;
    public final void rule__EnemyType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2494:1: ( rule__EnemyType__Group_12__1__Impl )
            // InternalRangoMode.g:2495:2: rule__EnemyType__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_12__1"


    // $ANTLR start "rule__EnemyType__Group_12__1__Impl"
    // InternalRangoMode.g:2501:1: rule__EnemyType__Group_12__1__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__EnemyType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2505:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2506:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2506:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2507:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2508:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2508:3: rule__EnemyType__ContactEffectsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__ContactEffectsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__Group_12__1__Impl"


    // $ANTLR start "rule__Vanish__Group__0"
    // InternalRangoMode.g:2517:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2521:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2522:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Vanish__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vanish__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vanish__Group__0"


    // $ANTLR start "rule__Vanish__Group__0__Impl"
    // InternalRangoMode.g:2529:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2533:1: ( ( () ) )
            // InternalRangoMode.g:2534:1: ( () )
            {
            // InternalRangoMode.g:2534:1: ( () )
            // InternalRangoMode.g:2535:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2536:2: ()
            // InternalRangoMode.g:2536:3: 
            {
            }

             after(grammarAccess.getVanishAccess().getVanishAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vanish__Group__0__Impl"


    // $ANTLR start "rule__Vanish__Group__1"
    // InternalRangoMode.g:2544:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2548:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2549:2: rule__Vanish__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vanish__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vanish__Group__1"


    // $ANTLR start "rule__Vanish__Group__1__Impl"
    // InternalRangoMode.g:2555:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2559:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2560:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2560:1: ( 'vanish' )
            // InternalRangoMode.g:2561:2: 'vanish'
            {
             before(grammarAccess.getVanishAccess().getVanishKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVanishAccess().getVanishKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vanish__Group__1__Impl"


    // $ANTLR start "rule__Split__Group__0"
    // InternalRangoMode.g:2571:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2575:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2576:2: rule__Split__Group__0__Impl rule__Split__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Split__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__0"


    // $ANTLR start "rule__Split__Group__0__Impl"
    // InternalRangoMode.g:2583:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2587:1: ( ( 'split' ) )
            // InternalRangoMode.g:2588:1: ( 'split' )
            {
            // InternalRangoMode.g:2588:1: ( 'split' )
            // InternalRangoMode.g:2589:2: 'split'
            {
             before(grammarAccess.getSplitAccess().getSplitKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getSplitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__0__Impl"


    // $ANTLR start "rule__Split__Group__1"
    // InternalRangoMode.g:2598:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2602:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2603:2: rule__Split__Group__1__Impl rule__Split__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Split__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__1"


    // $ANTLR start "rule__Split__Group__1__Impl"
    // InternalRangoMode.g:2610:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2614:1: ( ( 'into' ) )
            // InternalRangoMode.g:2615:1: ( 'into' )
            {
            // InternalRangoMode.g:2615:1: ( 'into' )
            // InternalRangoMode.g:2616:2: 'into'
            {
             before(grammarAccess.getSplitAccess().getIntoKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getIntoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__1__Impl"


    // $ANTLR start "rule__Split__Group__2"
    // InternalRangoMode.g:2625:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2629:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2630:2: rule__Split__Group__2__Impl rule__Split__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Split__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__2"


    // $ANTLR start "rule__Split__Group__2__Impl"
    // InternalRangoMode.g:2637:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2641:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2642:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2642:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2643:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2644:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2644:3: rule__Split__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Split__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__2__Impl"


    // $ANTLR start "rule__Split__Group__3"
    // InternalRangoMode.g:2652:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2656:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2657:2: rule__Split__Group__3__Impl rule__Split__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Split__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__3"


    // $ANTLR start "rule__Split__Group__3__Impl"
    // InternalRangoMode.g:2664:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2668:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2669:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2669:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2670:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2671:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:2671:3: rule__Split__FragmentTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Split__FragmentTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__3__Impl"


    // $ANTLR start "rule__Split__Group__4"
    // InternalRangoMode.g:2679:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2683:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2684:2: rule__Split__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Split__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__4"


    // $ANTLR start "rule__Split__Group__4__Impl"
    // InternalRangoMode.g:2690:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2694:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2695:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2695:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2696:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2697:2: ( rule__Split__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:2697:3: rule__Split__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Split__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplitAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group__4__Impl"


    // $ANTLR start "rule__Split__Group_4__0"
    // InternalRangoMode.g:2706:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2710:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2711:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Split__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__0"


    // $ANTLR start "rule__Split__Group_4__0__Impl"
    // InternalRangoMode.g:2718:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2722:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2723:1: ( 'launched' )
            {
            // InternalRangoMode.g:2723:1: ( 'launched' )
            // InternalRangoMode.g:2724:2: 'launched'
            {
             before(grammarAccess.getSplitAccess().getLaunchedKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getLaunchedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__0__Impl"


    // $ANTLR start "rule__Split__Group_4__1"
    // InternalRangoMode.g:2733:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2737:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2738:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Split__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Split__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__1"


    // $ANTLR start "rule__Split__Group_4__1__Impl"
    // InternalRangoMode.g:2745:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2749:1: ( ( 'at' ) )
            // InternalRangoMode.g:2750:1: ( 'at' )
            {
            // InternalRangoMode.g:2750:1: ( 'at' )
            // InternalRangoMode.g:2751:2: 'at'
            {
             before(grammarAccess.getSplitAccess().getAtKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getAtKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__1__Impl"


    // $ANTLR start "rule__Split__Group_4__2"
    // InternalRangoMode.g:2760:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2764:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2765:2: rule__Split__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Split__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__2"


    // $ANTLR start "rule__Split__Group_4__2__Impl"
    // InternalRangoMode.g:2771:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2775:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2776:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2776:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2777:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2778:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2778:3: rule__Split__LaunchSpeedAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Split__LaunchSpeedAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__Group_4__2__Impl"


    // $ANTLR start "rule__Damage__Group__0"
    // InternalRangoMode.g:2787:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2791:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2792:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Damage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Damage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__0"


    // $ANTLR start "rule__Damage__Group__0__Impl"
    // InternalRangoMode.g:2799:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2803:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2804:1: ( 'damage' )
            {
            // InternalRangoMode.g:2804:1: ( 'damage' )
            // InternalRangoMode.g:2805:2: 'damage'
            {
             before(grammarAccess.getDamageAccess().getDamageKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDamageAccess().getDamageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__0__Impl"


    // $ANTLR start "rule__Damage__Group__1"
    // InternalRangoMode.g:2814:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2818:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2819:2: rule__Damage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Damage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__1"


    // $ANTLR start "rule__Damage__Group__1__Impl"
    // InternalRangoMode.g:2825:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2829:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2830:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2830:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2831:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2832:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2832:3: rule__Damage__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Damage__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDamageAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__1__Impl"


    // $ANTLR start "rule__Heal__Group__0"
    // InternalRangoMode.g:2841:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2845:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2846:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Heal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heal__Group__0"


    // $ANTLR start "rule__Heal__Group__0__Impl"
    // InternalRangoMode.g:2853:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2857:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2858:1: ( 'heal' )
            {
            // InternalRangoMode.g:2858:1: ( 'heal' )
            // InternalRangoMode.g:2859:2: 'heal'
            {
             before(grammarAccess.getHealAccess().getHealKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getHealAccess().getHealKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heal__Group__0__Impl"


    // $ANTLR start "rule__Heal__Group__1"
    // InternalRangoMode.g:2868:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2872:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2873:2: rule__Heal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heal__Group__1"


    // $ANTLR start "rule__Heal__Group__1__Impl"
    // InternalRangoMode.g:2879:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2883:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2884:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2884:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2885:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2886:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2886:3: rule__Heal__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Heal__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHealAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heal__Group__1__Impl"


    // $ANTLR start "rule__Shield__Group__0"
    // InternalRangoMode.g:2895:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2899:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2900:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Shield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__0"


    // $ANTLR start "rule__Shield__Group__0__Impl"
    // InternalRangoMode.g:2907:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2911:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2912:1: ( 'shield' )
            {
            // InternalRangoMode.g:2912:1: ( 'shield' )
            // InternalRangoMode.g:2913:2: 'shield'
            {
             before(grammarAccess.getShieldAccess().getShieldKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getShieldAccess().getShieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__0__Impl"


    // $ANTLR start "rule__Shield__Group__1"
    // InternalRangoMode.g:2922:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2926:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2927:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Shield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shield__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__1"


    // $ANTLR start "rule__Shield__Group__1__Impl"
    // InternalRangoMode.g:2934:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2938:1: ( ( 'for' ) )
            // InternalRangoMode.g:2939:1: ( 'for' )
            {
            // InternalRangoMode.g:2939:1: ( 'for' )
            // InternalRangoMode.g:2940:2: 'for'
            {
             before(grammarAccess.getShieldAccess().getForKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getShieldAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__1__Impl"


    // $ANTLR start "rule__Shield__Group__2"
    // InternalRangoMode.g:2949:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2953:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2954:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Shield__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shield__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__2"


    // $ANTLR start "rule__Shield__Group__2__Impl"
    // InternalRangoMode.g:2961:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2965:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2966:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2966:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2967:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2968:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2968:3: rule__Shield__DurationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Shield__DurationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShieldAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__2__Impl"


    // $ANTLR start "rule__Shield__Group__3"
    // InternalRangoMode.g:2976:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2980:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2981:2: rule__Shield__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shield__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__3"


    // $ANTLR start "rule__Shield__Group__3__Impl"
    // InternalRangoMode.g:2987:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2991:1: ( ( 's' ) )
            // InternalRangoMode.g:2992:1: ( 's' )
            {
            // InternalRangoMode.g:2992:1: ( 's' )
            // InternalRangoMode.g:2993:2: 's'
            {
             before(grammarAccess.getShieldAccess().getSKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getShieldAccess().getSKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__Group__3__Impl"


    // $ANTLR start "rule__SpeedChange__Group__0"
    // InternalRangoMode.g:3003:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3007:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:3008:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SpeedChange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__0"


    // $ANTLR start "rule__SpeedChange__Group__0__Impl"
    // InternalRangoMode.g:3015:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3019:1: ( ( 'speed' ) )
            // InternalRangoMode.g:3020:1: ( 'speed' )
            {
            // InternalRangoMode.g:3020:1: ( 'speed' )
            // InternalRangoMode.g:3021:2: 'speed'
            {
             before(grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__0__Impl"


    // $ANTLR start "rule__SpeedChange__Group__1"
    // InternalRangoMode.g:3030:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3034:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:3035:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SpeedChange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__1"


    // $ANTLR start "rule__SpeedChange__Group__1__Impl"
    // InternalRangoMode.g:3042:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3046:1: ( ( '*' ) )
            // InternalRangoMode.g:3047:1: ( '*' )
            {
            // InternalRangoMode.g:3047:1: ( '*' )
            // InternalRangoMode.g:3048:2: '*'
            {
             before(grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__1__Impl"


    // $ANTLR start "rule__SpeedChange__Group__2"
    // InternalRangoMode.g:3057:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3061:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:3062:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SpeedChange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__2"


    // $ANTLR start "rule__SpeedChange__Group__2__Impl"
    // InternalRangoMode.g:3069:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3073:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:3074:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:3074:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:3075:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:3076:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:3076:3: rule__SpeedChange__FactorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpeedChange__FactorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__2__Impl"


    // $ANTLR start "rule__SpeedChange__Group__3"
    // InternalRangoMode.g:3084:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3088:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:3089:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SpeedChange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__3"


    // $ANTLR start "rule__SpeedChange__Group__3__Impl"
    // InternalRangoMode.g:3096:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3100:1: ( ( 'for' ) )
            // InternalRangoMode.g:3101:1: ( 'for' )
            {
            // InternalRangoMode.g:3101:1: ( 'for' )
            // InternalRangoMode.g:3102:2: 'for'
            {
             before(grammarAccess.getSpeedChangeAccess().getForKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSpeedChangeAccess().getForKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__3__Impl"


    // $ANTLR start "rule__SpeedChange__Group__4"
    // InternalRangoMode.g:3111:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3115:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:3116:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__SpeedChange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__4"


    // $ANTLR start "rule__SpeedChange__Group__4__Impl"
    // InternalRangoMode.g:3123:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3127:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:3128:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:3128:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:3129:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:3130:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:3130:3: rule__SpeedChange__DurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SpeedChange__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__4__Impl"


    // $ANTLR start "rule__SpeedChange__Group__5"
    // InternalRangoMode.g:3138:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3142:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:3143:2: rule__SpeedChange__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpeedChange__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__5"


    // $ANTLR start "rule__SpeedChange__Group__5__Impl"
    // InternalRangoMode.g:3149:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3153:1: ( ( 's' ) )
            // InternalRangoMode.g:3154:1: ( 's' )
            {
            // InternalRangoMode.g:3154:1: ( 's' )
            // InternalRangoMode.g:3155:2: 's'
            {
             before(grammarAccess.getSpeedChangeAccess().getSKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSpeedChangeAccess().getSKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__Group__5__Impl"


    // $ANTLR start "rule__Poison__Group__0"
    // InternalRangoMode.g:3165:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3169:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:3170:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Poison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__0"


    // $ANTLR start "rule__Poison__Group__0__Impl"
    // InternalRangoMode.g:3177:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3181:1: ( ( 'poison' ) )
            // InternalRangoMode.g:3182:1: ( 'poison' )
            {
            // InternalRangoMode.g:3182:1: ( 'poison' )
            // InternalRangoMode.g:3183:2: 'poison'
            {
             before(grammarAccess.getPoisonAccess().getPoisonKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getPoisonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__0__Impl"


    // $ANTLR start "rule__Poison__Group__1"
    // InternalRangoMode.g:3192:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3196:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:3197:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Poison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__1"


    // $ANTLR start "rule__Poison__Group__1__Impl"
    // InternalRangoMode.g:3204:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3208:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:3209:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:3209:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:3210:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:3211:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:3211:3: rule__Poison__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Poison__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__1__Impl"


    // $ANTLR start "rule__Poison__Group__2"
    // InternalRangoMode.g:3219:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3223:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:3224:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Poison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__2"


    // $ANTLR start "rule__Poison__Group__2__Impl"
    // InternalRangoMode.g:3231:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3235:1: ( ( 'every' ) )
            // InternalRangoMode.g:3236:1: ( 'every' )
            {
            // InternalRangoMode.g:3236:1: ( 'every' )
            // InternalRangoMode.g:3237:2: 'every'
            {
             before(grammarAccess.getPoisonAccess().getEveryKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getEveryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__2__Impl"


    // $ANTLR start "rule__Poison__Group__3"
    // InternalRangoMode.g:3246:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3250:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:3251:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Poison__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__3"


    // $ANTLR start "rule__Poison__Group__3__Impl"
    // InternalRangoMode.g:3258:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3262:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:3263:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:3263:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:3264:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:3265:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:3265:3: rule__Poison__IntervalAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Poison__IntervalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__3__Impl"


    // $ANTLR start "rule__Poison__Group__4"
    // InternalRangoMode.g:3273:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3277:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:3278:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Poison__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__4"


    // $ANTLR start "rule__Poison__Group__4__Impl"
    // InternalRangoMode.g:3285:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3289:1: ( ( 's' ) )
            // InternalRangoMode.g:3290:1: ( 's' )
            {
            // InternalRangoMode.g:3290:1: ( 's' )
            // InternalRangoMode.g:3291:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getSKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__4__Impl"


    // $ANTLR start "rule__Poison__Group__5"
    // InternalRangoMode.g:3300:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3304:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:3305:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Poison__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__5"


    // $ANTLR start "rule__Poison__Group__5__Impl"
    // InternalRangoMode.g:3312:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3316:1: ( ( 'for' ) )
            // InternalRangoMode.g:3317:1: ( 'for' )
            {
            // InternalRangoMode.g:3317:1: ( 'for' )
            // InternalRangoMode.g:3318:2: 'for'
            {
             before(grammarAccess.getPoisonAccess().getForKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__5__Impl"


    // $ANTLR start "rule__Poison__Group__6"
    // InternalRangoMode.g:3327:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3331:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:3332:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Poison__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poison__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__6"


    // $ANTLR start "rule__Poison__Group__6__Impl"
    // InternalRangoMode.g:3339:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3343:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:3344:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:3344:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:3345:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:3346:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:3346:3: rule__Poison__DurationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Poison__DurationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__6__Impl"


    // $ANTLR start "rule__Poison__Group__7"
    // InternalRangoMode.g:3354:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3358:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:3359:2: rule__Poison__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poison__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__7"


    // $ANTLR start "rule__Poison__Group__7__Impl"
    // InternalRangoMode.g:3365:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3369:1: ( ( 's' ) )
            // InternalRangoMode.g:3370:1: ( 's' )
            {
            // InternalRangoMode.g:3370:1: ( 's' )
            // InternalRangoMode.g:3371:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_7()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getSKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__Group__7__Impl"


    // $ANTLR start "rule__PowerUp__Group__0"
    // InternalRangoMode.g:3381:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3385:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:3386:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PowerUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__0"


    // $ANTLR start "rule__PowerUp__Group__0__Impl"
    // InternalRangoMode.g:3393:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3397:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:3398:1: ( 'powerup' )
            {
            // InternalRangoMode.g:3398:1: ( 'powerup' )
            // InternalRangoMode.g:3399:2: 'powerup'
            {
             before(grammarAccess.getPowerUpAccess().getPowerupKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getPowerupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__0__Impl"


    // $ANTLR start "rule__PowerUp__Group__1"
    // InternalRangoMode.g:3408:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3412:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3413:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PowerUp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__1"


    // $ANTLR start "rule__PowerUp__Group__1__Impl"
    // InternalRangoMode.g:3420:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3424:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3425:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3425:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3426:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3427:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3427:3: rule__PowerUp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__1__Impl"


    // $ANTLR start "rule__PowerUp__Group__2"
    // InternalRangoMode.g:3435:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3439:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3440:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__PowerUp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__2"


    // $ANTLR start "rule__PowerUp__Group__2__Impl"
    // InternalRangoMode.g:3447:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3451:1: ( ( '{' ) )
            // InternalRangoMode.g:3452:1: ( '{' )
            {
            // InternalRangoMode.g:3452:1: ( '{' )
            // InternalRangoMode.g:3453:2: '{'
            {
             before(grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__2__Impl"


    // $ANTLR start "rule__PowerUp__Group__3"
    // InternalRangoMode.g:3462:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3466:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3467:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__PowerUp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__3"


    // $ANTLR start "rule__PowerUp__Group__3__Impl"
    // InternalRangoMode.g:3474:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3478:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3479:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3479:1: ( 'sprite' )
            // InternalRangoMode.g:3480:2: 'sprite'
            {
             before(grammarAccess.getPowerUpAccess().getSpriteKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getSpriteKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__3__Impl"


    // $ANTLR start "rule__PowerUp__Group__4"
    // InternalRangoMode.g:3489:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3493:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3494:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__PowerUp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__4"


    // $ANTLR start "rule__PowerUp__Group__4__Impl"
    // InternalRangoMode.g:3501:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3505:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3506:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3506:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3507:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3508:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3508:3: rule__PowerUp__SpriteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__SpriteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__4__Impl"


    // $ANTLR start "rule__PowerUp__Group__5"
    // InternalRangoMode.g:3516:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3520:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3521:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__PowerUp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__5"


    // $ANTLR start "rule__PowerUp__Group__5__Impl"
    // InternalRangoMode.g:3528:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3532:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3533:1: ( 'gives' )
            {
            // InternalRangoMode.g:3533:1: ( 'gives' )
            // InternalRangoMode.g:3534:2: 'gives'
            {
             before(grammarAccess.getPowerUpAccess().getGivesKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getGivesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__5__Impl"


    // $ANTLR start "rule__PowerUp__Group__6"
    // InternalRangoMode.g:3543:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3547:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3548:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__PowerUp__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__6"


    // $ANTLR start "rule__PowerUp__Group__6__Impl"
    // InternalRangoMode.g:3555:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3559:1: ( ( ':' ) )
            // InternalRangoMode.g:3560:1: ( ':' )
            {
            // InternalRangoMode.g:3560:1: ( ':' )
            // InternalRangoMode.g:3561:2: ':'
            {
             before(grammarAccess.getPowerUpAccess().getColonKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__6__Impl"


    // $ANTLR start "rule__PowerUp__Group__7"
    // InternalRangoMode.g:3570:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3574:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3575:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__PowerUp__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__7"


    // $ANTLR start "rule__PowerUp__Group__7__Impl"
    // InternalRangoMode.g:3582:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3586:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3587:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3587:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3588:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3589:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3589:3: rule__PowerUp__EffectsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__EffectsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__7__Impl"


    // $ANTLR start "rule__PowerUp__Group__8"
    // InternalRangoMode.g:3597:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3601:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3602:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__PowerUp__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__8"


    // $ANTLR start "rule__PowerUp__Group__8__Impl"
    // InternalRangoMode.g:3609:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3613:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3614:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3614:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3615:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3616:2: ( rule__PowerUp__Group_8__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRangoMode.g:3616:3: rule__PowerUp__Group_8__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PowerUp__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPowerUpAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__8__Impl"


    // $ANTLR start "rule__PowerUp__Group__9"
    // InternalRangoMode.g:3624:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3628:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3629:2: rule__PowerUp__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__9"


    // $ANTLR start "rule__PowerUp__Group__9__Impl"
    // InternalRangoMode.g:3635:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3639:1: ( ( '}' ) )
            // InternalRangoMode.g:3640:1: ( '}' )
            {
            // InternalRangoMode.g:3640:1: ( '}' )
            // InternalRangoMode.g:3641:2: '}'
            {
             before(grammarAccess.getPowerUpAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group__9__Impl"


    // $ANTLR start "rule__PowerUp__Group_8__0"
    // InternalRangoMode.g:3651:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3655:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3656:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__PowerUp__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerUp__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group_8__0"


    // $ANTLR start "rule__PowerUp__Group_8__0__Impl"
    // InternalRangoMode.g:3663:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3667:1: ( ( ',' ) )
            // InternalRangoMode.g:3668:1: ( ',' )
            {
            // InternalRangoMode.g:3668:1: ( ',' )
            // InternalRangoMode.g:3669:2: ','
            {
             before(grammarAccess.getPowerUpAccess().getCommaKeyword_8_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group_8__0__Impl"


    // $ANTLR start "rule__PowerUp__Group_8__1"
    // InternalRangoMode.g:3678:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3682:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3683:2: rule__PowerUp__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group_8__1"


    // $ANTLR start "rule__PowerUp__Group_8__1__Impl"
    // InternalRangoMode.g:3689:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3693:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3694:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3694:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3695:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3696:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3696:3: rule__PowerUp__EffectsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerUp__EffectsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__Group_8__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__0"
    // InternalRangoMode.g:3705:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3709:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3710:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PlayerProfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__0"


    // $ANTLR start "rule__PlayerProfile__Group__0__Impl"
    // InternalRangoMode.g:3717:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3721:1: ( ( 'player' ) )
            // InternalRangoMode.g:3722:1: ( 'player' )
            {
            // InternalRangoMode.g:3722:1: ( 'player' )
            // InternalRangoMode.g:3723:2: 'player'
            {
             before(grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__1"
    // InternalRangoMode.g:3732:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3736:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3737:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PlayerProfile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__1"


    // $ANTLR start "rule__PlayerProfile__Group__1__Impl"
    // InternalRangoMode.g:3744:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3748:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3749:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3749:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3750:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3751:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3751:3: rule__PlayerProfile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__2"
    // InternalRangoMode.g:3759:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3763:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3764:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__PlayerProfile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__2"


    // $ANTLR start "rule__PlayerProfile__Group__2__Impl"
    // InternalRangoMode.g:3771:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3775:1: ( ( '{' ) )
            // InternalRangoMode.g:3776:1: ( '{' )
            {
            // InternalRangoMode.g:3776:1: ( '{' )
            // InternalRangoMode.g:3777:2: '{'
            {
             before(grammarAccess.getPlayerProfileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__2__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__3"
    // InternalRangoMode.g:3786:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3790:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3791:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__PlayerProfile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__3"


    // $ANTLR start "rule__PlayerProfile__Group__3__Impl"
    // InternalRangoMode.g:3798:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3802:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3803:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3803:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3804:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3805:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3805:3: rule__PlayerProfile__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__3__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__4"
    // InternalRangoMode.g:3813:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3817:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3818:2: rule__PlayerProfile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__4"


    // $ANTLR start "rule__PlayerProfile__Group__4__Impl"
    // InternalRangoMode.g:3824:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3828:1: ( ( '}' ) )
            // InternalRangoMode.g:3829:1: ( '}' )
            {
            // InternalRangoMode.g:3829:1: ( '}' )
            // InternalRangoMode.g:3830:2: '}'
            {
             before(grammarAccess.getPlayerProfileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group__4__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_0__0"
    // InternalRangoMode.g:3840:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3844:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3845:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
            {
            pushFollow(FOLLOW_22);
            rule__PlayerProfile__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_0__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_0__0__Impl"
    // InternalRangoMode.g:3852:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3856:1: ( ( 'character' ) )
            // InternalRangoMode.g:3857:1: ( 'character' )
            {
            // InternalRangoMode.g:3857:1: ( 'character' )
            // InternalRangoMode.g:3858:2: 'character'
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_0__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_0__1"
    // InternalRangoMode.g:3867:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3871:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3872:2: rule__PlayerProfile__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_0__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_0__1__Impl"
    // InternalRangoMode.g:3878:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3882:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3883:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3883:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3884:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3885:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3885:3: rule__PlayerProfile__CharacterAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__CharacterAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_0__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__0"
    // InternalRangoMode.g:3894:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3898:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3899:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__0__Impl"
    // InternalRangoMode.g:3906:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3910:1: ( ( 'health' ) )
            // InternalRangoMode.g:3911:1: ( 'health' )
            {
            // InternalRangoMode.g:3911:1: ( 'health' )
            // InternalRangoMode.g:3912:2: 'health'
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__1"
    // InternalRangoMode.g:3921:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3925:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3926:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
            {
            pushFollow(FOLLOW_34);
            rule__PlayerProfile__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__1__Impl"
    // InternalRangoMode.g:3933:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3937:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3938:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3938:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:3939:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:3940:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:3940:3: rule__PlayerProfile__HealthAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__HealthAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__2"
    // InternalRangoMode.g:3948:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3952:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:3953:2: rule__PlayerProfile__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__2"


    // $ANTLR start "rule__PlayerProfile__Group_3_1__2__Impl"
    // InternalRangoMode.g:3959:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3963:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:3964:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:3964:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:3965:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:3966:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:3966:3: rule__PlayerProfile__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1__2__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_1_2__0"
    // InternalRangoMode.g:3975:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3979:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:3980:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1_2__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_1_2__0__Impl"
    // InternalRangoMode.g:3987:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3991:1: ( ( 'max' ) )
            // InternalRangoMode.g:3992:1: ( 'max' )
            {
            // InternalRangoMode.g:3992:1: ( 'max' )
            // InternalRangoMode.g:3993:2: 'max'
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_1_2__1"
    // InternalRangoMode.g:4002:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4006:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:4007:2: rule__PlayerProfile__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1_2__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_1_2__1__Impl"
    // InternalRangoMode.g:4013:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4017:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:4018:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:4018:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:4019:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:4020:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:4020:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__MaxHealthAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_2__0"
    // InternalRangoMode.g:4029:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4033:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:4034:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_2__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_2__0__Impl"
    // InternalRangoMode.g:4041:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4045:1: ( ( 'speed' ) )
            // InternalRangoMode.g:4046:1: ( 'speed' )
            {
            // InternalRangoMode.g:4046:1: ( 'speed' )
            // InternalRangoMode.g:4047:2: 'speed'
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_2__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_2__1"
    // InternalRangoMode.g:4056:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4060:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:4061:2: rule__PlayerProfile__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_2__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_2__1__Impl"
    // InternalRangoMode.g:4067:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4071:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:4072:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:4072:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:4073:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:4074:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:4074:3: rule__PlayerProfile__SpeedAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__SpeedAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_2__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__0"
    // InternalRangoMode.g:4083:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4087:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:4088:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__0__Impl"
    // InternalRangoMode.g:4095:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4099:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:4100:1: ( 'tongue' )
            {
            // InternalRangoMode.g:4100:1: ( 'tongue' )
            // InternalRangoMode.g:4101:2: 'tongue'
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__1"
    // InternalRangoMode.g:4110:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4114:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:4115:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
            {
            pushFollow(FOLLOW_28);
            rule__PlayerProfile__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__1__Impl"
    // InternalRangoMode.g:4122:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4126:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:4127:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:4127:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:4128:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:4129:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:4129:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__TongueTimeAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__2"
    // InternalRangoMode.g:4137:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4141:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:4142:2: rule__PlayerProfile__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__2"


    // $ANTLR start "rule__PlayerProfile__Group_3_3__2__Impl"
    // InternalRangoMode.g:4148:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4152:1: ( ( 's' ) )
            // InternalRangoMode.g:4153:1: ( 's' )
            {
            // InternalRangoMode.g:4153:1: ( 's' )
            // InternalRangoMode.g:4154:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_3__2__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__0"
    // InternalRangoMode.g:4164:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4168:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:4169:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__0__Impl"
    // InternalRangoMode.g:4176:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4180:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:4181:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:4181:1: ( 'cooldown' )
            // InternalRangoMode.g:4182:2: 'cooldown'
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__1"
    // InternalRangoMode.g:4191:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4195:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:4196:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
            {
            pushFollow(FOLLOW_28);
            rule__PlayerProfile__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__1__Impl"
    // InternalRangoMode.g:4203:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4207:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:4208:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:4208:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:4209:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:4210:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:4210:3: rule__PlayerProfile__CooldownAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__CooldownAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__2"
    // InternalRangoMode.g:4218:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4222:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:4223:2: rule__PlayerProfile__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__2"


    // $ANTLR start "rule__PlayerProfile__Group_3_4__2__Impl"
    // InternalRangoMode.g:4229:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4233:1: ( ( 's' ) )
            // InternalRangoMode.g:4234:1: ( 's' )
            {
            // InternalRangoMode.g:4234:1: ( 's' )
            // InternalRangoMode.g:4235:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_4__2__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__0"
    // InternalRangoMode.g:4245:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4249:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:4250:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
            {
            pushFollow(FOLLOW_12);
            rule__PlayerProfile__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__0"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__0__Impl"
    // InternalRangoMode.g:4257:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4261:1: ( ( 'grace' ) )
            // InternalRangoMode.g:4262:1: ( 'grace' )
            {
            // InternalRangoMode.g:4262:1: ( 'grace' )
            // InternalRangoMode.g:4263:2: 'grace'
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__0__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__1"
    // InternalRangoMode.g:4272:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4276:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:4277:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
            {
            pushFollow(FOLLOW_28);
            rule__PlayerProfile__Group_3_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__1"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__1__Impl"
    // InternalRangoMode.g:4284:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4288:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:4289:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:4289:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:4290:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:4291:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:4291:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__GraceTimeAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__2"
    // InternalRangoMode.g:4299:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4303:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:4304:2: rule__PlayerProfile__Group_3_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__Group_3_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__2"


    // $ANTLR start "rule__PlayerProfile__Group_3_5__2__Impl"
    // InternalRangoMode.g:4310:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4314:1: ( ( 's' ) )
            // InternalRangoMode.g:4315:1: ( 's' )
            {
            // InternalRangoMode.g:4315:1: ( 's' )
            // InternalRangoMode.g:4316:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__Group_3_5__2__Impl"


    // $ANTLR start "rule__GameMode__Group__0"
    // InternalRangoMode.g:4326:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4330:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:4331:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GameMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__0"


    // $ANTLR start "rule__GameMode__Group__0__Impl"
    // InternalRangoMode.g:4338:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4342:1: ( ( 'mode' ) )
            // InternalRangoMode.g:4343:1: ( 'mode' )
            {
            // InternalRangoMode.g:4343:1: ( 'mode' )
            // InternalRangoMode.g:4344:2: 'mode'
            {
             before(grammarAccess.getGameModeAccess().getModeKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__0__Impl"


    // $ANTLR start "rule__GameMode__Group__1"
    // InternalRangoMode.g:4353:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4357:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:4358:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__GameMode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__1"


    // $ANTLR start "rule__GameMode__Group__1__Impl"
    // InternalRangoMode.g:4365:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4369:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4370:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4370:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4371:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4372:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4372:3: rule__GameMode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__1__Impl"


    // $ANTLR start "rule__GameMode__Group__2"
    // InternalRangoMode.g:4380:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4384:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4385:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__GameMode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__2"


    // $ANTLR start "rule__GameMode__Group__2__Impl"
    // InternalRangoMode.g:4392:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4396:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4397:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4397:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4398:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4399:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4399:3: rule__GameMode__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__2__Impl"


    // $ANTLR start "rule__GameMode__Group__3"
    // InternalRangoMode.g:4407:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4411:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4412:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__GameMode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__3"


    // $ANTLR start "rule__GameMode__Group__3__Impl"
    // InternalRangoMode.g:4419:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4423:1: ( ( '{' ) )
            // InternalRangoMode.g:4424:1: ( '{' )
            {
            // InternalRangoMode.g:4424:1: ( '{' )
            // InternalRangoMode.g:4425:2: '{'
            {
             before(grammarAccess.getGameModeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__3__Impl"


    // $ANTLR start "rule__GameMode__Group__4"
    // InternalRangoMode.g:4434:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4438:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4439:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__GameMode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__4"


    // $ANTLR start "rule__GameMode__Group__4__Impl"
    // InternalRangoMode.g:4446:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4450:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4451:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4451:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4452:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4453:2: ( rule__GameMode__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:4453:3: rule__GameMode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__4__Impl"


    // $ANTLR start "rule__GameMode__Group__5"
    // InternalRangoMode.g:4461:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4465:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4466:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__GameMode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__5"


    // $ANTLR start "rule__GameMode__Group__5__Impl"
    // InternalRangoMode.g:4473:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4477:1: ( ( 'player' ) )
            // InternalRangoMode.g:4478:1: ( 'player' )
            {
            // InternalRangoMode.g:4478:1: ( 'player' )
            // InternalRangoMode.g:4479:2: 'player'
            {
             before(grammarAccess.getGameModeAccess().getPlayerKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getPlayerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__5__Impl"


    // $ANTLR start "rule__GameMode__Group__6"
    // InternalRangoMode.g:4488:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4492:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4493:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__GameMode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__6"


    // $ANTLR start "rule__GameMode__Group__6__Impl"
    // InternalRangoMode.g:4500:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4504:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4505:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4505:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4506:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4507:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4507:3: rule__GameMode__PlayerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__PlayerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__6__Impl"


    // $ANTLR start "rule__GameMode__Group__7"
    // InternalRangoMode.g:4515:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4519:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4520:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__GameMode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__7"


    // $ANTLR start "rule__GameMode__Group__7__Impl"
    // InternalRangoMode.g:4527:1: rule__GameMode__Group__7__Impl : ( ( rule__GameMode__UnorderedGroup_7 ) ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4531:1: ( ( ( rule__GameMode__UnorderedGroup_7 ) ) )
            // InternalRangoMode.g:4532:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            {
            // InternalRangoMode.g:4532:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            // InternalRangoMode.g:4533:2: ( rule__GameMode__UnorderedGroup_7 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 
            // InternalRangoMode.g:4534:2: ( rule__GameMode__UnorderedGroup_7 )
            // InternalRangoMode.g:4534:3: rule__GameMode__UnorderedGroup_7
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__UnorderedGroup_7();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__7__Impl"


    // $ANTLR start "rule__GameMode__Group__8"
    // InternalRangoMode.g:4542:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4546:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4547:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__GameMode__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__8"


    // $ANTLR start "rule__GameMode__Group__8__Impl"
    // InternalRangoMode.g:4554:1: rule__GameMode__Group__8__Impl : ( ( ruleDrops )? ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4558:1: ( ( ( ruleDrops )? ) )
            // InternalRangoMode.g:4559:1: ( ( ruleDrops )? )
            {
            // InternalRangoMode.g:4559:1: ( ( ruleDrops )? )
            // InternalRangoMode.g:4560:2: ( ruleDrops )?
            {
             before(grammarAccess.getGameModeAccess().getDropsParserRuleCall_8()); 
            // InternalRangoMode.g:4561:2: ( ruleDrops )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==89) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:4561:3: ruleDrops
                    {
                    pushFollow(FOLLOW_2);
                    ruleDrops();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getDropsParserRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__8__Impl"


    // $ANTLR start "rule__GameMode__Group__9"
    // InternalRangoMode.g:4569:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4573:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4574:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__GameMode__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__9"


    // $ANTLR start "rule__GameMode__Group__9__Impl"
    // InternalRangoMode.g:4581:1: rule__GameMode__Group__9__Impl : ( ( rule__GameMode__Alternatives_9 ) ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4585:1: ( ( ( rule__GameMode__Alternatives_9 ) ) )
            // InternalRangoMode.g:4586:1: ( ( rule__GameMode__Alternatives_9 ) )
            {
            // InternalRangoMode.g:4586:1: ( ( rule__GameMode__Alternatives_9 ) )
            // InternalRangoMode.g:4587:2: ( rule__GameMode__Alternatives_9 )
            {
             before(grammarAccess.getGameModeAccess().getAlternatives_9()); 
            // InternalRangoMode.g:4588:2: ( rule__GameMode__Alternatives_9 )
            // InternalRangoMode.g:4588:3: rule__GameMode__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__9__Impl"


    // $ANTLR start "rule__GameMode__Group__10"
    // InternalRangoMode.g:4596:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4600:1: ( rule__GameMode__Group__10__Impl )
            // InternalRangoMode.g:4601:2: rule__GameMode__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__10"


    // $ANTLR start "rule__GameMode__Group__10__Impl"
    // InternalRangoMode.g:4607:1: rule__GameMode__Group__10__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4611:1: ( ( '}' ) )
            // InternalRangoMode.g:4612:1: ( '}' )
            {
            // InternalRangoMode.g:4612:1: ( '}' )
            // InternalRangoMode.g:4613:2: '}'
            {
             before(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__10__Impl"


    // $ANTLR start "rule__GameMode__Group_4__0"
    // InternalRangoMode.g:4623:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4627:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4628:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__GameMode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_4__0"


    // $ANTLR start "rule__GameMode__Group_4__0__Impl"
    // InternalRangoMode.g:4635:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4639:1: ( ( 'description' ) )
            // InternalRangoMode.g:4640:1: ( 'description' )
            {
            // InternalRangoMode.g:4640:1: ( 'description' )
            // InternalRangoMode.g:4641:2: 'description'
            {
             before(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_4__0__Impl"


    // $ANTLR start "rule__GameMode__Group_4__1"
    // InternalRangoMode.g:4650:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4654:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4655:2: rule__GameMode__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_4__1"


    // $ANTLR start "rule__GameMode__Group_4__1__Impl"
    // InternalRangoMode.g:4661:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4665:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4666:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4666:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4667:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4668:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4668:3: rule__GameMode__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_4__1__Impl"


    // $ANTLR start "rule__GameMode__Group_7_0__0"
    // InternalRangoMode.g:4677:1: rule__GameMode__Group_7_0__0 : rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 ;
    public final void rule__GameMode__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4681:1: ( rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 )
            // InternalRangoMode.g:4682:2: rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1
            {
            pushFollow(FOLLOW_12);
            rule__GameMode__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_7_0__0"


    // $ANTLR start "rule__GameMode__Group_7_0__0__Impl"
    // InternalRangoMode.g:4689:1: rule__GameMode__Group_7_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4693:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:4694:1: ( 'gravity' )
            {
            // InternalRangoMode.g:4694:1: ( 'gravity' )
            // InternalRangoMode.g:4695:2: 'gravity'
            {
             before(grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_7_0__0__Impl"


    // $ANTLR start "rule__GameMode__Group_7_0__1"
    // InternalRangoMode.g:4704:1: rule__GameMode__Group_7_0__1 : rule__GameMode__Group_7_0__1__Impl ;
    public final void rule__GameMode__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4708:1: ( rule__GameMode__Group_7_0__1__Impl )
            // InternalRangoMode.g:4709:2: rule__GameMode__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_7_0__1"


    // $ANTLR start "rule__GameMode__Group_7_0__1__Impl"
    // InternalRangoMode.g:4715:1: rule__GameMode__Group_7_0__1__Impl : ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) ;
    public final void rule__GameMode__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4719:1: ( ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) )
            // InternalRangoMode.g:4720:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            {
            // InternalRangoMode.g:4720:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            // InternalRangoMode.g:4721:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 
            // InternalRangoMode.g:4722:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            // InternalRangoMode.g:4722:3: rule__GameMode__GravityAssignment_7_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__GravityAssignment_7_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_7_0__1__Impl"


    // $ANTLR start "rule__SingleLevel__Group__0"
    // InternalRangoMode.g:4731:1: rule__SingleLevel__Group__0 : rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 ;
    public final void rule__SingleLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4735:1: ( rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 )
            // InternalRangoMode.g:4736:2: rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__SingleLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__0"


    // $ANTLR start "rule__SingleLevel__Group__0__Impl"
    // InternalRangoMode.g:4743:1: rule__SingleLevel__Group__0__Impl : ( ( rule__SingleLevel__ArenaAssignment_0 ) ) ;
    public final void rule__SingleLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4747:1: ( ( ( rule__SingleLevel__ArenaAssignment_0 ) ) )
            // InternalRangoMode.g:4748:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            {
            // InternalRangoMode.g:4748:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            // InternalRangoMode.g:4749:2: ( rule__SingleLevel__ArenaAssignment_0 )
            {
             before(grammarAccess.getSingleLevelAccess().getArenaAssignment_0()); 
            // InternalRangoMode.g:4750:2: ( rule__SingleLevel__ArenaAssignment_0 )
            // InternalRangoMode.g:4750:3: rule__SingleLevel__ArenaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleLevel__ArenaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleLevelAccess().getArenaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__0__Impl"


    // $ANTLR start "rule__SingleLevel__Group__1"
    // InternalRangoMode.g:4758:1: rule__SingleLevel__Group__1 : rule__SingleLevel__Group__1__Impl rule__SingleLevel__Group__2 ;
    public final void rule__SingleLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4762:1: ( rule__SingleLevel__Group__1__Impl rule__SingleLevel__Group__2 )
            // InternalRangoMode.g:4763:2: rule__SingleLevel__Group__1__Impl rule__SingleLevel__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__SingleLevel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleLevel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__1"


    // $ANTLR start "rule__SingleLevel__Group__1__Impl"
    // InternalRangoMode.g:4770:1: rule__SingleLevel__Group__1__Impl : ( ( rule__SingleLevel__SpawningAssignment_1 ) ) ;
    public final void rule__SingleLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4774:1: ( ( ( rule__SingleLevel__SpawningAssignment_1 ) ) )
            // InternalRangoMode.g:4775:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            {
            // InternalRangoMode.g:4775:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            // InternalRangoMode.g:4776:2: ( rule__SingleLevel__SpawningAssignment_1 )
            {
             before(grammarAccess.getSingleLevelAccess().getSpawningAssignment_1()); 
            // InternalRangoMode.g:4777:2: ( rule__SingleLevel__SpawningAssignment_1 )
            // InternalRangoMode.g:4777:3: rule__SingleLevel__SpawningAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleLevel__SpawningAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleLevelAccess().getSpawningAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__1__Impl"


    // $ANTLR start "rule__SingleLevel__Group__2"
    // InternalRangoMode.g:4785:1: rule__SingleLevel__Group__2 : rule__SingleLevel__Group__2__Impl ;
    public final void rule__SingleLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4789:1: ( rule__SingleLevel__Group__2__Impl )
            // InternalRangoMode.g:4790:2: rule__SingleLevel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleLevel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__2"


    // $ANTLR start "rule__SingleLevel__Group__2__Impl"
    // InternalRangoMode.g:4796:1: rule__SingleLevel__Group__2__Impl : ( ruleEndConditions ) ;
    public final void rule__SingleLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4800:1: ( ( ruleEndConditions ) )
            // InternalRangoMode.g:4801:1: ( ruleEndConditions )
            {
            // InternalRangoMode.g:4801:1: ( ruleEndConditions )
            // InternalRangoMode.g:4802:2: ruleEndConditions
            {
             before(grammarAccess.getSingleLevelAccess().getEndConditionsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleEndConditions();

            state._fsp--;

             after(grammarAccess.getSingleLevelAccess().getEndConditionsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__Group__2__Impl"


    // $ANTLR start "rule__Level__Group__0"
    // InternalRangoMode.g:4812:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4816:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRangoMode.g:4817:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Level__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__0"


    // $ANTLR start "rule__Level__Group__0__Impl"
    // InternalRangoMode.g:4824:1: rule__Level__Group__0__Impl : ( 'level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4828:1: ( ( 'level' ) )
            // InternalRangoMode.g:4829:1: ( 'level' )
            {
            // InternalRangoMode.g:4829:1: ( 'level' )
            // InternalRangoMode.g:4830:2: 'level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__0__Impl"


    // $ANTLR start "rule__Level__Group__1"
    // InternalRangoMode.g:4839:1: rule__Level__Group__1 : rule__Level__Group__1__Impl rule__Level__Group__2 ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4843:1: ( rule__Level__Group__1__Impl rule__Level__Group__2 )
            // InternalRangoMode.g:4844:2: rule__Level__Group__1__Impl rule__Level__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Level__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__1"


    // $ANTLR start "rule__Level__Group__1__Impl"
    // InternalRangoMode.g:4851:1: rule__Level__Group__1__Impl : ( ( rule__Level__TitleAssignment_1 )? ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4855:1: ( ( ( rule__Level__TitleAssignment_1 )? ) )
            // InternalRangoMode.g:4856:1: ( ( rule__Level__TitleAssignment_1 )? )
            {
            // InternalRangoMode.g:4856:1: ( ( rule__Level__TitleAssignment_1 )? )
            // InternalRangoMode.g:4857:2: ( rule__Level__TitleAssignment_1 )?
            {
             before(grammarAccess.getLevelAccess().getTitleAssignment_1()); 
            // InternalRangoMode.g:4858:2: ( rule__Level__TitleAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:4858:3: rule__Level__TitleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Level__TitleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLevelAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__1__Impl"


    // $ANTLR start "rule__Level__Group__2"
    // InternalRangoMode.g:4866:1: rule__Level__Group__2 : rule__Level__Group__2__Impl rule__Level__Group__3 ;
    public final void rule__Level__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4870:1: ( rule__Level__Group__2__Impl rule__Level__Group__3 )
            // InternalRangoMode.g:4871:2: rule__Level__Group__2__Impl rule__Level__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Level__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__2"


    // $ANTLR start "rule__Level__Group__2__Impl"
    // InternalRangoMode.g:4878:1: rule__Level__Group__2__Impl : ( '{' ) ;
    public final void rule__Level__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4882:1: ( ( '{' ) )
            // InternalRangoMode.g:4883:1: ( '{' )
            {
            // InternalRangoMode.g:4883:1: ( '{' )
            // InternalRangoMode.g:4884:2: '{'
            {
             before(grammarAccess.getLevelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__2__Impl"


    // $ANTLR start "rule__Level__Group__3"
    // InternalRangoMode.g:4893:1: rule__Level__Group__3 : rule__Level__Group__3__Impl rule__Level__Group__4 ;
    public final void rule__Level__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4897:1: ( rule__Level__Group__3__Impl rule__Level__Group__4 )
            // InternalRangoMode.g:4898:2: rule__Level__Group__3__Impl rule__Level__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Level__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__3"


    // $ANTLR start "rule__Level__Group__3__Impl"
    // InternalRangoMode.g:4905:1: rule__Level__Group__3__Impl : ( ( rule__Level__ArenaAssignment_3 ) ) ;
    public final void rule__Level__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4909:1: ( ( ( rule__Level__ArenaAssignment_3 ) ) )
            // InternalRangoMode.g:4910:1: ( ( rule__Level__ArenaAssignment_3 ) )
            {
            // InternalRangoMode.g:4910:1: ( ( rule__Level__ArenaAssignment_3 ) )
            // InternalRangoMode.g:4911:2: ( rule__Level__ArenaAssignment_3 )
            {
             before(grammarAccess.getLevelAccess().getArenaAssignment_3()); 
            // InternalRangoMode.g:4912:2: ( rule__Level__ArenaAssignment_3 )
            // InternalRangoMode.g:4912:3: rule__Level__ArenaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Level__ArenaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getArenaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__3__Impl"


    // $ANTLR start "rule__Level__Group__4"
    // InternalRangoMode.g:4920:1: rule__Level__Group__4 : rule__Level__Group__4__Impl rule__Level__Group__5 ;
    public final void rule__Level__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4924:1: ( rule__Level__Group__4__Impl rule__Level__Group__5 )
            // InternalRangoMode.g:4925:2: rule__Level__Group__4__Impl rule__Level__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Level__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__4"


    // $ANTLR start "rule__Level__Group__4__Impl"
    // InternalRangoMode.g:4932:1: rule__Level__Group__4__Impl : ( ( rule__Level__SpawningAssignment_4 ) ) ;
    public final void rule__Level__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4936:1: ( ( ( rule__Level__SpawningAssignment_4 ) ) )
            // InternalRangoMode.g:4937:1: ( ( rule__Level__SpawningAssignment_4 ) )
            {
            // InternalRangoMode.g:4937:1: ( ( rule__Level__SpawningAssignment_4 ) )
            // InternalRangoMode.g:4938:2: ( rule__Level__SpawningAssignment_4 )
            {
             before(grammarAccess.getLevelAccess().getSpawningAssignment_4()); 
            // InternalRangoMode.g:4939:2: ( rule__Level__SpawningAssignment_4 )
            // InternalRangoMode.g:4939:3: rule__Level__SpawningAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Level__SpawningAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getSpawningAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__4__Impl"


    // $ANTLR start "rule__Level__Group__5"
    // InternalRangoMode.g:4947:1: rule__Level__Group__5 : rule__Level__Group__5__Impl rule__Level__Group__6 ;
    public final void rule__Level__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4951:1: ( rule__Level__Group__5__Impl rule__Level__Group__6 )
            // InternalRangoMode.g:4952:2: rule__Level__Group__5__Impl rule__Level__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Level__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__5"


    // $ANTLR start "rule__Level__Group__5__Impl"
    // InternalRangoMode.g:4959:1: rule__Level__Group__5__Impl : ( ruleEndConditions ) ;
    public final void rule__Level__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4963:1: ( ( ruleEndConditions ) )
            // InternalRangoMode.g:4964:1: ( ruleEndConditions )
            {
            // InternalRangoMode.g:4964:1: ( ruleEndConditions )
            // InternalRangoMode.g:4965:2: ruleEndConditions
            {
             before(grammarAccess.getLevelAccess().getEndConditionsParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleEndConditions();

            state._fsp--;

             after(grammarAccess.getLevelAccess().getEndConditionsParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__5__Impl"


    // $ANTLR start "rule__Level__Group__6"
    // InternalRangoMode.g:4974:1: rule__Level__Group__6 : rule__Level__Group__6__Impl ;
    public final void rule__Level__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4978:1: ( rule__Level__Group__6__Impl )
            // InternalRangoMode.g:4979:2: rule__Level__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__6"


    // $ANTLR start "rule__Level__Group__6__Impl"
    // InternalRangoMode.g:4985:1: rule__Level__Group__6__Impl : ( '}' ) ;
    public final void rule__Level__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4989:1: ( ( '}' ) )
            // InternalRangoMode.g:4990:1: ( '}' )
            {
            // InternalRangoMode.g:4990:1: ( '}' )
            // InternalRangoMode.g:4991:2: '}'
            {
             before(grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Group__6__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__0"
    // InternalRangoMode.g:5001:1: rule__SpeedBonus__Group__0 : rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 ;
    public final void rule__SpeedBonus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5005:1: ( rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 )
            // InternalRangoMode.g:5006:2: rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__SpeedBonus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__0"


    // $ANTLR start "rule__SpeedBonus__Group__0__Impl"
    // InternalRangoMode.g:5013:1: rule__SpeedBonus__Group__0__Impl : ( () ) ;
    public final void rule__SpeedBonus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5017:1: ( ( () ) )
            // InternalRangoMode.g:5018:1: ( () )
            {
            // InternalRangoMode.g:5018:1: ( () )
            // InternalRangoMode.g:5019:2: ()
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 
            // InternalRangoMode.g:5020:2: ()
            // InternalRangoMode.g:5020:3: 
            {
            }

             after(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__0__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__1"
    // InternalRangoMode.g:5028:1: rule__SpeedBonus__Group__1 : rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 ;
    public final void rule__SpeedBonus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5032:1: ( rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 )
            // InternalRangoMode.g:5033:2: rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__SpeedBonus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__1"


    // $ANTLR start "rule__SpeedBonus__Group__1__Impl"
    // InternalRangoMode.g:5040:1: rule__SpeedBonus__Group__1__Impl : ( 'speed' ) ;
    public final void rule__SpeedBonus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5044:1: ( ( 'speed' ) )
            // InternalRangoMode.g:5045:1: ( 'speed' )
            {
            // InternalRangoMode.g:5045:1: ( 'speed' )
            // InternalRangoMode.g:5046:2: 'speed'
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__1__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__2"
    // InternalRangoMode.g:5055:1: rule__SpeedBonus__Group__2 : rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 ;
    public final void rule__SpeedBonus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5059:1: ( rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 )
            // InternalRangoMode.g:5060:2: rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__SpeedBonus__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__2"


    // $ANTLR start "rule__SpeedBonus__Group__2__Impl"
    // InternalRangoMode.g:5067:1: rule__SpeedBonus__Group__2__Impl : ( 'bonus' ) ;
    public final void rule__SpeedBonus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5071:1: ( ( 'bonus' ) )
            // InternalRangoMode.g:5072:1: ( 'bonus' )
            {
            // InternalRangoMode.g:5072:1: ( 'bonus' )
            // InternalRangoMode.g:5073:2: 'bonus'
            {
             before(grammarAccess.getSpeedBonusAccess().getBonusKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getBonusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__2__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__3"
    // InternalRangoMode.g:5082:1: rule__SpeedBonus__Group__3 : rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 ;
    public final void rule__SpeedBonus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5086:1: ( rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 )
            // InternalRangoMode.g:5087:2: rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__SpeedBonus__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__3"


    // $ANTLR start "rule__SpeedBonus__Group__3__Impl"
    // InternalRangoMode.g:5094:1: rule__SpeedBonus__Group__3__Impl : ( ( rule__SpeedBonus__Group_3__0 )? ) ;
    public final void rule__SpeedBonus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5098:1: ( ( ( rule__SpeedBonus__Group_3__0 )? ) )
            // InternalRangoMode.g:5099:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            {
            // InternalRangoMode.g:5099:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            // InternalRangoMode.g:5100:2: ( rule__SpeedBonus__Group_3__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_3()); 
            // InternalRangoMode.g:5101:2: ( rule__SpeedBonus__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==66) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:5101:3: rule__SpeedBonus__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpeedBonus__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpeedBonusAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__3__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__4"
    // InternalRangoMode.g:5109:1: rule__SpeedBonus__Group__4 : rule__SpeedBonus__Group__4__Impl ;
    public final void rule__SpeedBonus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5113:1: ( rule__SpeedBonus__Group__4__Impl )
            // InternalRangoMode.g:5114:2: rule__SpeedBonus__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__4"


    // $ANTLR start "rule__SpeedBonus__Group__4__Impl"
    // InternalRangoMode.g:5120:1: rule__SpeedBonus__Group__4__Impl : ( ( rule__SpeedBonus__Group_4__0 )? ) ;
    public final void rule__SpeedBonus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5124:1: ( ( ( rule__SpeedBonus__Group_4__0 )? ) )
            // InternalRangoMode.g:5125:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            {
            // InternalRangoMode.g:5125:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            // InternalRangoMode.g:5126:2: ( rule__SpeedBonus__Group_4__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_4()); 
            // InternalRangoMode.g:5127:2: ( rule__SpeedBonus__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:5127:3: rule__SpeedBonus__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpeedBonus__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpeedBonusAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group__4__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_3__0"
    // InternalRangoMode.g:5136:1: rule__SpeedBonus__Group_3__0 : rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 ;
    public final void rule__SpeedBonus__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5140:1: ( rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 )
            // InternalRangoMode.g:5141:2: rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__SpeedBonus__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__0"


    // $ANTLR start "rule__SpeedBonus__Group_3__0__Impl"
    // InternalRangoMode.g:5148:1: rule__SpeedBonus__Group_3__0__Impl : ( 'up' ) ;
    public final void rule__SpeedBonus__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5152:1: ( ( 'up' ) )
            // InternalRangoMode.g:5153:1: ( 'up' )
            {
            // InternalRangoMode.g:5153:1: ( 'up' )
            // InternalRangoMode.g:5154:2: 'up'
            {
             before(grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__0__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_3__1"
    // InternalRangoMode.g:5163:1: rule__SpeedBonus__Group_3__1 : rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 ;
    public final void rule__SpeedBonus__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5167:1: ( rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 )
            // InternalRangoMode.g:5168:2: rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__SpeedBonus__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__1"


    // $ANTLR start "rule__SpeedBonus__Group_3__1__Impl"
    // InternalRangoMode.g:5175:1: rule__SpeedBonus__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__SpeedBonus__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5179:1: ( ( 'to' ) )
            // InternalRangoMode.g:5180:1: ( 'to' )
            {
            // InternalRangoMode.g:5180:1: ( 'to' )
            // InternalRangoMode.g:5181:2: 'to'
            {
             before(grammarAccess.getSpeedBonusAccess().getToKeyword_3_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getToKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__1__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_3__2"
    // InternalRangoMode.g:5190:1: rule__SpeedBonus__Group_3__2 : rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 ;
    public final void rule__SpeedBonus__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5194:1: ( rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 )
            // InternalRangoMode.g:5195:2: rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3
            {
            pushFollow(FOLLOW_45);
            rule__SpeedBonus__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__2"


    // $ANTLR start "rule__SpeedBonus__Group_3__2__Impl"
    // InternalRangoMode.g:5202:1: rule__SpeedBonus__Group_3__2__Impl : ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) ;
    public final void rule__SpeedBonus__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5206:1: ( ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) )
            // InternalRangoMode.g:5207:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            {
            // InternalRangoMode.g:5207:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            // InternalRangoMode.g:5208:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 
            // InternalRangoMode.g:5209:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            // InternalRangoMode.g:5209:3: rule__SpeedBonus__MaxFactorAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__MaxFactorAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__2__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_3__3"
    // InternalRangoMode.g:5217:1: rule__SpeedBonus__Group_3__3 : rule__SpeedBonus__Group_3__3__Impl ;
    public final void rule__SpeedBonus__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5221:1: ( rule__SpeedBonus__Group_3__3__Impl )
            // InternalRangoMode.g:5222:2: rule__SpeedBonus__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__3"


    // $ANTLR start "rule__SpeedBonus__Group_3__3__Impl"
    // InternalRangoMode.g:5228:1: rule__SpeedBonus__Group_3__3__Impl : ( 'times' ) ;
    public final void rule__SpeedBonus__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5232:1: ( ( 'times' ) )
            // InternalRangoMode.g:5233:1: ( 'times' )
            {
            // InternalRangoMode.g:5233:1: ( 'times' )
            // InternalRangoMode.g:5234:2: 'times'
            {
             before(grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_3__3__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_4__0"
    // InternalRangoMode.g:5244:1: rule__SpeedBonus__Group_4__0 : rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 ;
    public final void rule__SpeedBonus__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5248:1: ( rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 )
            // InternalRangoMode.g:5249:2: rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__SpeedBonus__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__0"


    // $ANTLR start "rule__SpeedBonus__Group_4__0__Impl"
    // InternalRangoMode.g:5256:1: rule__SpeedBonus__Group_4__0__Impl : ( 'over' ) ;
    public final void rule__SpeedBonus__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5260:1: ( ( 'over' ) )
            // InternalRangoMode.g:5261:1: ( 'over' )
            {
            // InternalRangoMode.g:5261:1: ( 'over' )
            // InternalRangoMode.g:5262:2: 'over'
            {
             before(grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__0__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_4__1"
    // InternalRangoMode.g:5271:1: rule__SpeedBonus__Group_4__1 : rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 ;
    public final void rule__SpeedBonus__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5275:1: ( rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 )
            // InternalRangoMode.g:5276:2: rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__SpeedBonus__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__1"


    // $ANTLR start "rule__SpeedBonus__Group_4__1__Impl"
    // InternalRangoMode.g:5283:1: rule__SpeedBonus__Group_4__1__Impl : ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) ;
    public final void rule__SpeedBonus__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5287:1: ( ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) )
            // InternalRangoMode.g:5288:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            {
            // InternalRangoMode.g:5288:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            // InternalRangoMode.g:5289:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 
            // InternalRangoMode.g:5290:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            // InternalRangoMode.g:5290:3: rule__SpeedBonus__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__DurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__1__Impl"


    // $ANTLR start "rule__SpeedBonus__Group_4__2"
    // InternalRangoMode.g:5298:1: rule__SpeedBonus__Group_4__2 : rule__SpeedBonus__Group_4__2__Impl ;
    public final void rule__SpeedBonus__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5302:1: ( rule__SpeedBonus__Group_4__2__Impl )
            // InternalRangoMode.g:5303:2: rule__SpeedBonus__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpeedBonus__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__2"


    // $ANTLR start "rule__SpeedBonus__Group_4__2__Impl"
    // InternalRangoMode.g:5309:1: rule__SpeedBonus__Group_4__2__Impl : ( 's' ) ;
    public final void rule__SpeedBonus__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5313:1: ( ( 's' ) )
            // InternalRangoMode.g:5314:1: ( 's' )
            {
            // InternalRangoMode.g:5314:1: ( 's' )
            // InternalRangoMode.g:5315:2: 's'
            {
             before(grammarAccess.getSpeedBonusAccess().getSKeyword_4_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSpeedBonusAccess().getSKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__Group_4__2__Impl"


    // $ANTLR start "rule__Arena__Group__0"
    // InternalRangoMode.g:5325:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5329:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5330:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Arena__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__0"


    // $ANTLR start "rule__Arena__Group__0__Impl"
    // InternalRangoMode.g:5337:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5341:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5342:1: ( 'arena' )
            {
            // InternalRangoMode.g:5342:1: ( 'arena' )
            // InternalRangoMode.g:5343:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getArenaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__0__Impl"


    // $ANTLR start "rule__Arena__Group__1"
    // InternalRangoMode.g:5352:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5356:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5357:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Arena__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__1"


    // $ANTLR start "rule__Arena__Group__1__Impl"
    // InternalRangoMode.g:5364:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5368:1: ( ( '{' ) )
            // InternalRangoMode.g:5369:1: ( '{' )
            {
            // InternalRangoMode.g:5369:1: ( '{' )
            // InternalRangoMode.g:5370:2: '{'
            {
             before(grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__1__Impl"


    // $ANTLR start "rule__Arena__Group__2"
    // InternalRangoMode.g:5379:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5383:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5384:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Arena__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__2"


    // $ANTLR start "rule__Arena__Group__2__Impl"
    // InternalRangoMode.g:5391:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5395:1: ( ( 'background' ) )
            // InternalRangoMode.g:5396:1: ( 'background' )
            {
            // InternalRangoMode.g:5396:1: ( 'background' )
            // InternalRangoMode.g:5397:2: 'background'
            {
             before(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__2__Impl"


    // $ANTLR start "rule__Arena__Group__3"
    // InternalRangoMode.g:5406:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5410:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5411:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__Arena__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__3"


    // $ANTLR start "rule__Arena__Group__3__Impl"
    // InternalRangoMode.g:5418:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5422:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5423:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5423:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5424:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5425:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5425:3: rule__Arena__BackgroundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Arena__BackgroundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__3__Impl"


    // $ANTLR start "rule__Arena__Group__4"
    // InternalRangoMode.g:5433:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5437:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5438:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__Arena__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__4"


    // $ANTLR start "rule__Arena__Group__4__Impl"
    // InternalRangoMode.g:5445:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__Group_4__0 )? ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5449:1: ( ( ( rule__Arena__Group_4__0 )? ) )
            // InternalRangoMode.g:5450:1: ( ( rule__Arena__Group_4__0 )? )
            {
            // InternalRangoMode.g:5450:1: ( ( rule__Arena__Group_4__0 )? )
            // InternalRangoMode.g:5451:2: ( rule__Arena__Group_4__0 )?
            {
             before(grammarAccess.getArenaAccess().getGroup_4()); 
            // InternalRangoMode.g:5452:2: ( rule__Arena__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:5452:3: rule__Arena__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArenaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__4__Impl"


    // $ANTLR start "rule__Arena__Group__5"
    // InternalRangoMode.g:5460:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5464:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5465:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__Arena__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__5"


    // $ANTLR start "rule__Arena__Group__5__Impl"
    // InternalRangoMode.g:5472:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5476:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5477:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5477:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5478:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5479:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==76||LA28_0==79||LA28_0==82) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRangoMode.g:5479:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__5__Impl"


    // $ANTLR start "rule__Arena__Group__6"
    // InternalRangoMode.g:5487:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5491:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5492:2: rule__Arena__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__6"


    // $ANTLR start "rule__Arena__Group__6__Impl"
    // InternalRangoMode.g:5498:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5502:1: ( ( '}' ) )
            // InternalRangoMode.g:5503:1: ( '}' )
            {
            // InternalRangoMode.g:5503:1: ( '}' )
            // InternalRangoMode.g:5504:2: '}'
            {
             before(grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__6__Impl"


    // $ANTLR start "rule__Arena__Group_4__0"
    // InternalRangoMode.g:5514:1: rule__Arena__Group_4__0 : rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 ;
    public final void rule__Arena__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5518:1: ( rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 )
            // InternalRangoMode.g:5519:2: rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1
            {
            pushFollow(FOLLOW_49);
            rule__Arena__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__0"


    // $ANTLR start "rule__Arena__Group_4__0__Impl"
    // InternalRangoMode.g:5526:1: rule__Arena__Group_4__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5530:1: ( ( 'player' ) )
            // InternalRangoMode.g:5531:1: ( 'player' )
            {
            // InternalRangoMode.g:5531:1: ( 'player' )
            // InternalRangoMode.g:5532:2: 'player'
            {
             before(grammarAccess.getArenaAccess().getPlayerKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getPlayerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__0__Impl"


    // $ANTLR start "rule__Arena__Group_4__1"
    // InternalRangoMode.g:5541:1: rule__Arena__Group_4__1 : rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 ;
    public final void rule__Arena__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5545:1: ( rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 )
            // InternalRangoMode.g:5546:2: rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__Arena__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__1"


    // $ANTLR start "rule__Arena__Group_4__1__Impl"
    // InternalRangoMode.g:5553:1: rule__Arena__Group_4__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5557:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5558:1: ( 'starts' )
            {
            // InternalRangoMode.g:5558:1: ( 'starts' )
            // InternalRangoMode.g:5559:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getStartsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__1__Impl"


    // $ANTLR start "rule__Arena__Group_4__2"
    // InternalRangoMode.g:5568:1: rule__Arena__Group_4__2 : rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 ;
    public final void rule__Arena__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5572:1: ( rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 )
            // InternalRangoMode.g:5573:2: rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Arena__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__2"


    // $ANTLR start "rule__Arena__Group_4__2__Impl"
    // InternalRangoMode.g:5580:1: rule__Arena__Group_4__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5584:1: ( ( 'at' ) )
            // InternalRangoMode.g:5585:1: ( 'at' )
            {
            // InternalRangoMode.g:5585:1: ( 'at' )
            // InternalRangoMode.g:5586:2: 'at'
            {
             before(grammarAccess.getArenaAccess().getAtKeyword_4_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getAtKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__2__Impl"


    // $ANTLR start "rule__Arena__Group_4__3"
    // InternalRangoMode.g:5595:1: rule__Arena__Group_4__3 : rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 ;
    public final void rule__Arena__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5599:1: ( rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 )
            // InternalRangoMode.g:5600:2: rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4
            {
            pushFollow(FOLLOW_50);
            rule__Arena__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__3"


    // $ANTLR start "rule__Arena__Group_4__3__Impl"
    // InternalRangoMode.g:5607:1: rule__Arena__Group_4__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) ;
    public final void rule__Arena__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5611:1: ( ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) )
            // InternalRangoMode.g:5612:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            {
            // InternalRangoMode.g:5612:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            // InternalRangoMode.g:5613:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_3()); 
            // InternalRangoMode.g:5614:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            // InternalRangoMode.g:5614:3: rule__Arena__PlayerStartAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Arena__PlayerStartAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__3__Impl"


    // $ANTLR start "rule__Arena__Group_4__4"
    // InternalRangoMode.g:5622:1: rule__Arena__Group_4__4 : rule__Arena__Group_4__4__Impl ;
    public final void rule__Arena__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5626:1: ( rule__Arena__Group_4__4__Impl )
            // InternalRangoMode.g:5627:2: rule__Arena__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__4"


    // $ANTLR start "rule__Arena__Group_4__4__Impl"
    // InternalRangoMode.g:5633:1: rule__Arena__Group_4__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5637:1: ( ( '%' ) )
            // InternalRangoMode.g:5638:1: ( '%' )
            {
            // InternalRangoMode.g:5638:1: ( '%' )
            // InternalRangoMode.g:5639:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_4()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getPercentSignKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4__4__Impl"


    // $ANTLR start "rule__At__Group__0"
    // InternalRangoMode.g:5649:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5653:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5654:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__At__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__0"


    // $ANTLR start "rule__At__Group__0__Impl"
    // InternalRangoMode.g:5661:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5665:1: ( ( 'at' ) )
            // InternalRangoMode.g:5666:1: ( 'at' )
            {
            // InternalRangoMode.g:5666:1: ( 'at' )
            // InternalRangoMode.g:5667:2: 'at'
            {
             before(grammarAccess.getAtAccess().getAtKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__0__Impl"


    // $ANTLR start "rule__At__Group__1"
    // InternalRangoMode.g:5676:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5680:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5681:2: rule__At__Group__1__Impl rule__At__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__At__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__1"


    // $ANTLR start "rule__At__Group__1__Impl"
    // InternalRangoMode.g:5688:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5692:1: ( ( '(' ) )
            // InternalRangoMode.g:5693:1: ( '(' )
            {
            // InternalRangoMode.g:5693:1: ( '(' )
            // InternalRangoMode.g:5694:2: '('
            {
             before(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__1__Impl"


    // $ANTLR start "rule__At__Group__2"
    // InternalRangoMode.g:5703:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5707:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:5708:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__At__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__2"


    // $ANTLR start "rule__At__Group__2__Impl"
    // InternalRangoMode.g:5715:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5719:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:5720:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:5720:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:5721:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:5722:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:5722:3: rule__At__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__At__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__2__Impl"


    // $ANTLR start "rule__At__Group__3"
    // InternalRangoMode.g:5730:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5734:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:5735:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__At__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__3"


    // $ANTLR start "rule__At__Group__3__Impl"
    // InternalRangoMode.g:5742:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5746:1: ( ( '%' ) )
            // InternalRangoMode.g:5747:1: ( '%' )
            {
            // InternalRangoMode.g:5747:1: ( '%' )
            // InternalRangoMode.g:5748:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__3__Impl"


    // $ANTLR start "rule__At__Group__4"
    // InternalRangoMode.g:5757:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5761:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:5762:2: rule__At__Group__4__Impl rule__At__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__At__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__4"


    // $ANTLR start "rule__At__Group__4__Impl"
    // InternalRangoMode.g:5769:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5773:1: ( ( ',' ) )
            // InternalRangoMode.g:5774:1: ( ',' )
            {
            // InternalRangoMode.g:5774:1: ( ',' )
            // InternalRangoMode.g:5775:2: ','
            {
             before(grammarAccess.getAtAccess().getCommaKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__4__Impl"


    // $ANTLR start "rule__At__Group__5"
    // InternalRangoMode.g:5784:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5788:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:5789:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__At__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__5"


    // $ANTLR start "rule__At__Group__5__Impl"
    // InternalRangoMode.g:5796:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5800:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:5801:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:5801:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:5802:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:5803:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:5803:3: rule__At__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__At__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAtAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__5__Impl"


    // $ANTLR start "rule__At__Group__6"
    // InternalRangoMode.g:5811:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5815:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:5816:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__At__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__6"


    // $ANTLR start "rule__At__Group__6__Impl"
    // InternalRangoMode.g:5823:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5827:1: ( ( '%' ) )
            // InternalRangoMode.g:5828:1: ( '%' )
            {
            // InternalRangoMode.g:5828:1: ( '%' )
            // InternalRangoMode.g:5829:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__6__Impl"


    // $ANTLR start "rule__At__Group__7"
    // InternalRangoMode.g:5838:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5842:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:5843:2: rule__At__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__7"


    // $ANTLR start "rule__At__Group__7__Impl"
    // InternalRangoMode.g:5849:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5853:1: ( ( ')' ) )
            // InternalRangoMode.g:5854:1: ( ')' )
            {
            // InternalRangoMode.g:5854:1: ( ')' )
            // InternalRangoMode.g:5855:2: ')'
            {
             before(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__Group__7__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalRangoMode.g:5865:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5869:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:5870:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalRangoMode.g:5877:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5881:1: ( ( 'block' ) )
            // InternalRangoMode.g:5882:1: ( 'block' )
            {
            // InternalRangoMode.g:5882:1: ( 'block' )
            // InternalRangoMode.g:5883:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalRangoMode.g:5892:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5896:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:5897:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalRangoMode.g:5904:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5908:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:5909:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:5909:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:5910:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:5911:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:5911:3: rule__Block__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalRangoMode.g:5919:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5923:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:5924:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalRangoMode.g:5931:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5935:1: ( ( ruleAt ) )
            // InternalRangoMode.g:5936:1: ( ruleAt )
            {
            // InternalRangoMode.g:5936:1: ( ruleAt )
            // InternalRangoMode.g:5937:2: ruleAt
            {
             before(grammarAccess.getBlockAccess().getAtParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getAtParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalRangoMode.g:5946:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5950:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:5951:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalRangoMode.g:5958:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5962:1: ( ( 'size' ) )
            // InternalRangoMode.g:5963:1: ( 'size' )
            {
            // InternalRangoMode.g:5963:1: ( 'size' )
            // InternalRangoMode.g:5964:2: 'size'
            {
             before(grammarAccess.getBlockAccess().getSizeKeyword_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getSizeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalRangoMode.g:5973:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5977:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:5978:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__Block__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalRangoMode.g:5985:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5989:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:5990:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:5990:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:5991:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:5992:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:5992:3: rule__Block__WidthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Block__WidthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getWidthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__5"
    // InternalRangoMode.g:6000:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6004:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:6005:2: rule__Block__Group__5__Impl rule__Block__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Block__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__5"


    // $ANTLR start "rule__Block__Group__5__Impl"
    // InternalRangoMode.g:6012:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6016:1: ( ( 'by' ) )
            // InternalRangoMode.g:6017:1: ( 'by' )
            {
            // InternalRangoMode.g:6017:1: ( 'by' )
            // InternalRangoMode.g:6018:2: 'by'
            {
             before(grammarAccess.getBlockAccess().getByKeyword_5()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getByKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__5__Impl"


    // $ANTLR start "rule__Block__Group__6"
    // InternalRangoMode.g:6027:1: rule__Block__Group__6 : rule__Block__Group__6__Impl ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6031:1: ( rule__Block__Group__6__Impl )
            // InternalRangoMode.g:6032:2: rule__Block__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__6"


    // $ANTLR start "rule__Block__Group__6__Impl"
    // InternalRangoMode.g:6038:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6042:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:6043:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:6043:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:6044:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:6045:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:6045:3: rule__Block__HeightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Block__HeightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getHeightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__6__Impl"


    // $ANTLR start "rule__JumpPad__Group__0"
    // InternalRangoMode.g:6054:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6058:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:6059:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__JumpPad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__0"


    // $ANTLR start "rule__JumpPad__Group__0__Impl"
    // InternalRangoMode.g:6066:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6070:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6071:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6071:1: ( 'jumppad' )
            // InternalRangoMode.g:6072:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__0__Impl"


    // $ANTLR start "rule__JumpPad__Group__1"
    // InternalRangoMode.g:6081:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6085:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6086:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__JumpPad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__1"


    // $ANTLR start "rule__JumpPad__Group__1__Impl"
    // InternalRangoMode.g:6093:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6097:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6098:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6098:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6099:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6100:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6100:3: rule__JumpPad__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__1__Impl"


    // $ANTLR start "rule__JumpPad__Group__2"
    // InternalRangoMode.g:6108:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6112:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6113:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
            {
            pushFollow(FOLLOW_56);
            rule__JumpPad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__2"


    // $ANTLR start "rule__JumpPad__Group__2__Impl"
    // InternalRangoMode.g:6120:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6124:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6125:1: ( ruleAt )
            {
            // InternalRangoMode.g:6125:1: ( ruleAt )
            // InternalRangoMode.g:6126:2: ruleAt
            {
             before(grammarAccess.getJumpPadAccess().getAtParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getJumpPadAccess().getAtParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__2__Impl"


    // $ANTLR start "rule__JumpPad__Group__3"
    // InternalRangoMode.g:6135:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6139:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6140:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__JumpPad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__3"


    // $ANTLR start "rule__JumpPad__Group__3__Impl"
    // InternalRangoMode.g:6147:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6151:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6152:1: ( 'launch' )
            {
            // InternalRangoMode.g:6152:1: ( 'launch' )
            // InternalRangoMode.g:6153:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__3__Impl"


    // $ANTLR start "rule__JumpPad__Group__4"
    // InternalRangoMode.g:6162:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6166:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6167:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
            {
            pushFollow(FOLLOW_57);
            rule__JumpPad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__4"


    // $ANTLR start "rule__JumpPad__Group__4__Impl"
    // InternalRangoMode.g:6174:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6178:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6179:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6179:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6180:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6181:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6181:3: rule__JumpPad__LaunchAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__LaunchAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__4__Impl"


    // $ANTLR start "rule__JumpPad__Group__5"
    // InternalRangoMode.g:6189:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6193:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6194:2: rule__JumpPad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__5"


    // $ANTLR start "rule__JumpPad__Group__5__Impl"
    // InternalRangoMode.g:6200:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6204:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6205:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6205:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6206:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6207:2: ( rule__JumpPad__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==81) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:6207:3: rule__JumpPad__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JumpPad__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJumpPadAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group__5__Impl"


    // $ANTLR start "rule__JumpPad__Group_5__0"
    // InternalRangoMode.g:6216:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6220:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6221:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
            {
            pushFollow(FOLLOW_58);
            rule__JumpPad__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JumpPad__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group_5__0"


    // $ANTLR start "rule__JumpPad__Group_5__0__Impl"
    // InternalRangoMode.g:6228:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6232:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6233:1: ( 'affects' )
            {
            // InternalRangoMode.g:6233:1: ( 'affects' )
            // InternalRangoMode.g:6234:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group_5__0__Impl"


    // $ANTLR start "rule__JumpPad__Group_5__1"
    // InternalRangoMode.g:6243:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6247:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6248:2: rule__JumpPad__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group_5__1"


    // $ANTLR start "rule__JumpPad__Group_5__1__Impl"
    // InternalRangoMode.g:6254:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6258:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6259:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6259:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6260:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6261:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6261:3: rule__JumpPad__AffectsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__JumpPad__AffectsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__Group_5__1__Impl"


    // $ANTLR start "rule__Teleporter__Group__0"
    // InternalRangoMode.g:6270:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6274:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6275:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Teleporter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__0"


    // $ANTLR start "rule__Teleporter__Group__0__Impl"
    // InternalRangoMode.g:6282:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6286:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6287:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6287:1: ( 'teleporter' )
            // InternalRangoMode.g:6288:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__0__Impl"


    // $ANTLR start "rule__Teleporter__Group__1"
    // InternalRangoMode.g:6297:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6301:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6302:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Teleporter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__1"


    // $ANTLR start "rule__Teleporter__Group__1__Impl"
    // InternalRangoMode.g:6309:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6313:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6314:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6314:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6315:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6316:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6316:3: rule__Teleporter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__1__Impl"


    // $ANTLR start "rule__Teleporter__Group__2"
    // InternalRangoMode.g:6324:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6328:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6329:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Teleporter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__2"


    // $ANTLR start "rule__Teleporter__Group__2__Impl"
    // InternalRangoMode.g:6336:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6340:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6341:1: ( ruleAt )
            {
            // InternalRangoMode.g:6341:1: ( ruleAt )
            // InternalRangoMode.g:6342:2: ruleAt
            {
             before(grammarAccess.getTeleporterAccess().getAtParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getTeleporterAccess().getAtParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__2__Impl"


    // $ANTLR start "rule__Teleporter__Group__3"
    // InternalRangoMode.g:6351:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6355:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6356:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Teleporter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__3"


    // $ANTLR start "rule__Teleporter__Group__3__Impl"
    // InternalRangoMode.g:6363:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6367:1: ( ( 'to' ) )
            // InternalRangoMode.g:6368:1: ( 'to' )
            {
            // InternalRangoMode.g:6368:1: ( 'to' )
            // InternalRangoMode.g:6369:2: 'to'
            {
             before(grammarAccess.getTeleporterAccess().getToKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTeleporterAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__3__Impl"


    // $ANTLR start "rule__Teleporter__Group__4"
    // InternalRangoMode.g:6378:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6382:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6383:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
            {
            pushFollow(FOLLOW_57);
            rule__Teleporter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__4"


    // $ANTLR start "rule__Teleporter__Group__4__Impl"
    // InternalRangoMode.g:6390:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6394:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6395:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6395:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6396:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6397:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6397:3: rule__Teleporter__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__4__Impl"


    // $ANTLR start "rule__Teleporter__Group__5"
    // InternalRangoMode.g:6405:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6409:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6410:2: rule__Teleporter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__5"


    // $ANTLR start "rule__Teleporter__Group__5__Impl"
    // InternalRangoMode.g:6416:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6420:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6421:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6421:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6422:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6423:2: ( rule__Teleporter__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==81) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRangoMode.g:6423:3: rule__Teleporter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teleporter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeleporterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group__5__Impl"


    // $ANTLR start "rule__Teleporter__Group_5__0"
    // InternalRangoMode.g:6432:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6436:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6437:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
            {
            pushFollow(FOLLOW_58);
            rule__Teleporter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teleporter__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group_5__0"


    // $ANTLR start "rule__Teleporter__Group_5__0__Impl"
    // InternalRangoMode.g:6444:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6448:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6449:1: ( 'affects' )
            {
            // InternalRangoMode.g:6449:1: ( 'affects' )
            // InternalRangoMode.g:6450:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group_5__0__Impl"


    // $ANTLR start "rule__Teleporter__Group_5__1"
    // InternalRangoMode.g:6459:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6463:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6464:2: rule__Teleporter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group_5__1"


    // $ANTLR start "rule__Teleporter__Group_5__1__Impl"
    // InternalRangoMode.g:6470:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6474:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6475:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6475:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6476:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6477:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6477:3: rule__Teleporter__AffectsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Teleporter__AffectsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__Group_5__1__Impl"


    // $ANTLR start "rule__FixedLayout__Group__0"
    // InternalRangoMode.g:6486:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6490:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6491:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FixedLayout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedLayout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__0"


    // $ANTLR start "rule__FixedLayout__Group__0__Impl"
    // InternalRangoMode.g:6498:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6502:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6503:1: ( 'layout' )
            {
            // InternalRangoMode.g:6503:1: ( 'layout' )
            // InternalRangoMode.g:6504:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__0__Impl"


    // $ANTLR start "rule__FixedLayout__Group__1"
    // InternalRangoMode.g:6513:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6517:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6518:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
            {
            pushFollow(FOLLOW_59);
            rule__FixedLayout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedLayout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__1"


    // $ANTLR start "rule__FixedLayout__Group__1__Impl"
    // InternalRangoMode.g:6525:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6529:1: ( ( '{' ) )
            // InternalRangoMode.g:6530:1: ( '{' )
            {
            // InternalRangoMode.g:6530:1: ( '{' )
            // InternalRangoMode.g:6531:2: '{'
            {
             before(grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__1__Impl"


    // $ANTLR start "rule__FixedLayout__Group__2"
    // InternalRangoMode.g:6540:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6544:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6545:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__FixedLayout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedLayout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__2"


    // $ANTLR start "rule__FixedLayout__Group__2__Impl"
    // InternalRangoMode.g:6552:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6556:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6557:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6557:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6558:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6558:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6559:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6560:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6560:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_60);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6563:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6564:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6565:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_ID)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRangoMode.g:6565:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__FixedLayout__SpawnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__2__Impl"


    // $ANTLR start "rule__FixedLayout__Group__3"
    // InternalRangoMode.g:6574:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6578:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6579:2: rule__FixedLayout__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FixedLayout__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__3"


    // $ANTLR start "rule__FixedLayout__Group__3__Impl"
    // InternalRangoMode.g:6585:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6589:1: ( ( '}' ) )
            // InternalRangoMode.g:6590:1: ( '}' )
            {
            // InternalRangoMode.g:6590:1: ( '}' )
            // InternalRangoMode.g:6591:2: '}'
            {
             before(grammarAccess.getFixedLayoutAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFixedLayoutAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__Group__3__Impl"


    // $ANTLR start "rule__WaveSchedule__Group__0"
    // InternalRangoMode.g:6601:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6605:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:6606:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__WaveSchedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__0"


    // $ANTLR start "rule__WaveSchedule__Group__0__Impl"
    // InternalRangoMode.g:6613:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6617:1: ( ( 'waves' ) )
            // InternalRangoMode.g:6618:1: ( 'waves' )
            {
            // InternalRangoMode.g:6618:1: ( 'waves' )
            // InternalRangoMode.g:6619:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__0__Impl"


    // $ANTLR start "rule__WaveSchedule__Group__1"
    // InternalRangoMode.g:6628:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6632:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:6633:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
            {
            pushFollow(FOLLOW_61);
            rule__WaveSchedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__1"


    // $ANTLR start "rule__WaveSchedule__Group__1__Impl"
    // InternalRangoMode.g:6640:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6644:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:6645:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:6645:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:6646:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:6647:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==102) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:6647:3: rule__WaveSchedule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WaveSchedule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWaveScheduleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__1__Impl"


    // $ANTLR start "rule__WaveSchedule__Group__2"
    // InternalRangoMode.g:6655:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6659:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:6660:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
            {
            pushFollow(FOLLOW_62);
            rule__WaveSchedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__2"


    // $ANTLR start "rule__WaveSchedule__Group__2__Impl"
    // InternalRangoMode.g:6667:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6671:1: ( ( '{' ) )
            // InternalRangoMode.g:6672:1: ( '{' )
            {
            // InternalRangoMode.g:6672:1: ( '{' )
            // InternalRangoMode.g:6673:2: '{'
            {
             before(grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__2__Impl"


    // $ANTLR start "rule__WaveSchedule__Group__3"
    // InternalRangoMode.g:6682:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6686:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:6687:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__WaveSchedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__3"


    // $ANTLR start "rule__WaveSchedule__Group__3__Impl"
    // InternalRangoMode.g:6694:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6698:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:6699:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6699:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:6700:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:6700:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:6701:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6702:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:6702:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_63);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:6705:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:6706:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6707:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==86) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRangoMode.g:6707:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_63);
            	    rule__WaveSchedule__WavesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__3__Impl"


    // $ANTLR start "rule__WaveSchedule__Group__4"
    // InternalRangoMode.g:6716:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6720:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:6721:2: rule__WaveSchedule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__4"


    // $ANTLR start "rule__WaveSchedule__Group__4__Impl"
    // InternalRangoMode.g:6727:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6731:1: ( ( '}' ) )
            // InternalRangoMode.g:6732:1: ( '}' )
            {
            // InternalRangoMode.g:6732:1: ( '}' )
            // InternalRangoMode.g:6733:2: '}'
            {
             before(grammarAccess.getWaveScheduleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group__4__Impl"


    // $ANTLR start "rule__WaveSchedule__Group_1__0"
    // InternalRangoMode.g:6743:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6747:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:6748:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
            {
            pushFollow(FOLLOW_64);
            rule__WaveSchedule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1__0"


    // $ANTLR start "rule__WaveSchedule__Group_1__0__Impl"
    // InternalRangoMode.g:6755:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6759:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:6760:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:6760:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:6761:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:6762:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:6762:3: rule__WaveSchedule__LoopAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__LoopAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1__0__Impl"


    // $ANTLR start "rule__WaveSchedule__Group_1__1"
    // InternalRangoMode.g:6770:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6774:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:6775:2: rule__WaveSchedule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1__1"


    // $ANTLR start "rule__WaveSchedule__Group_1__1__Impl"
    // InternalRangoMode.g:6781:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6785:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:6786:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:6786:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:6787:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:6788:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==85) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:6788:3: rule__WaveSchedule__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WaveSchedule__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1__1__Impl"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__0"
    // InternalRangoMode.g:6797:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6801:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:6802:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_55);
            rule__WaveSchedule__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__0"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__0__Impl"
    // InternalRangoMode.g:6809:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6813:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:6814:1: ( 'escalate' )
            {
            // InternalRangoMode.g:6814:1: ( 'escalate' )
            // InternalRangoMode.g:6815:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__0__Impl"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__1"
    // InternalRangoMode.g:6824:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6828:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:6829:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__WaveSchedule__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__1"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__1__Impl"
    // InternalRangoMode.g:6836:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6840:1: ( ( 'by' ) )
            // InternalRangoMode.g:6841:1: ( 'by' )
            {
            // InternalRangoMode.g:6841:1: ( 'by' )
            // InternalRangoMode.g:6842:2: 'by'
            {
             before(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__1__Impl"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__2"
    // InternalRangoMode.g:6851:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6855:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:6856:2: rule__WaveSchedule__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__2"


    // $ANTLR start "rule__WaveSchedule__Group_1_1__2__Impl"
    // InternalRangoMode.g:6862:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6866:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:6867:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:6867:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:6868:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:6869:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:6869:3: rule__WaveSchedule__EscalationAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__WaveSchedule__EscalationAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__Group_1_1__2__Impl"


    // $ANTLR start "rule__Wave__Group__0"
    // InternalRangoMode.g:6878:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6882:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:6883:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__Wave__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__0"


    // $ANTLR start "rule__Wave__Group__0__Impl"
    // InternalRangoMode.g:6890:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6894:1: ( ( 'wave' ) )
            // InternalRangoMode.g:6895:1: ( 'wave' )
            {
            // InternalRangoMode.g:6895:1: ( 'wave' )
            // InternalRangoMode.g:6896:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getWaveAccess().getWaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__0__Impl"


    // $ANTLR start "rule__Wave__Group__1"
    // InternalRangoMode.g:6905:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6909:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:6910:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
            {
            pushFollow(FOLLOW_65);
            rule__Wave__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__1"


    // $ANTLR start "rule__Wave__Group__1__Impl"
    // InternalRangoMode.g:6917:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6921:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:6922:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:6922:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:6923:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:6924:2: ( rule__Wave__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==87) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRangoMode.g:6924:3: rule__Wave__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wave__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWaveAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__1__Impl"


    // $ANTLR start "rule__Wave__Group__2"
    // InternalRangoMode.g:6932:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6936:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:6937:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
            {
            pushFollow(FOLLOW_59);
            rule__Wave__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__2"


    // $ANTLR start "rule__Wave__Group__2__Impl"
    // InternalRangoMode.g:6944:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6948:1: ( ( '{' ) )
            // InternalRangoMode.g:6949:1: ( '{' )
            {
            // InternalRangoMode.g:6949:1: ( '{' )
            // InternalRangoMode.g:6950:2: '{'
            {
             before(grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__2__Impl"


    // $ANTLR start "rule__Wave__Group__3"
    // InternalRangoMode.g:6959:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6963:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:6964:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Wave__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__3"


    // $ANTLR start "rule__Wave__Group__3__Impl"
    // InternalRangoMode.g:6971:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6975:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:6976:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6976:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:6977:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:6977:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:6978:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:6979:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:6979:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_60);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:6982:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:6983:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:6984:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_ID)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRangoMode.g:6984:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__Wave__SpawnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__3__Impl"


    // $ANTLR start "rule__Wave__Group__4"
    // InternalRangoMode.g:6993:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6997:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:6998:2: rule__Wave__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wave__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__4"


    // $ANTLR start "rule__Wave__Group__4__Impl"
    // InternalRangoMode.g:7004:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7008:1: ( ( '}' ) )
            // InternalRangoMode.g:7009:1: ( '}' )
            {
            // InternalRangoMode.g:7009:1: ( '}' )
            // InternalRangoMode.g:7010:2: '}'
            {
             before(grammarAccess.getWaveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWaveAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group__4__Impl"


    // $ANTLR start "rule__Wave__Group_1__0"
    // InternalRangoMode.g:7020:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7024:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:7025:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Wave__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__0"


    // $ANTLR start "rule__Wave__Group_1__0__Impl"
    // InternalRangoMode.g:7032:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7036:1: ( ( 'after' ) )
            // InternalRangoMode.g:7037:1: ( 'after' )
            {
            // InternalRangoMode.g:7037:1: ( 'after' )
            // InternalRangoMode.g:7038:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__0__Impl"


    // $ANTLR start "rule__Wave__Group_1__1"
    // InternalRangoMode.g:7047:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7051:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:7052:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__Wave__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wave__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__1"


    // $ANTLR start "rule__Wave__Group_1__1__Impl"
    // InternalRangoMode.g:7059:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7063:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:7064:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7064:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:7065:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:7066:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:7066:3: rule__Wave__DelayAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Wave__DelayAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__1__Impl"


    // $ANTLR start "rule__Wave__Group_1__2"
    // InternalRangoMode.g:7074:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7078:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7079:2: rule__Wave__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wave__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__2"


    // $ANTLR start "rule__Wave__Group_1__2__Impl"
    // InternalRangoMode.g:7085:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7089:1: ( ( 's' ) )
            // InternalRangoMode.g:7090:1: ( 's' )
            {
            // InternalRangoMode.g:7090:1: ( 's' )
            // InternalRangoMode.g:7091:2: 's'
            {
             before(grammarAccess.getWaveAccess().getSKeyword_1_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getWaveAccess().getSKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__Group_1__2__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__0"
    // InternalRangoMode.g:7101:1: rule__EnemySpawn__Group__0 : rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 ;
    public final void rule__EnemySpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7105:1: ( rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 )
            // InternalRangoMode.g:7106:2: rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__EnemySpawn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__0"


    // $ANTLR start "rule__EnemySpawn__Group__0__Impl"
    // InternalRangoMode.g:7113:1: rule__EnemySpawn__Group__0__Impl : ( ( rule__EnemySpawn__Group_0__0 )? ) ;
    public final void rule__EnemySpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7117:1: ( ( ( rule__EnemySpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7118:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7118:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            // InternalRangoMode.g:7119:2: ( rule__EnemySpawn__Group_0__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7120:2: ( rule__EnemySpawn__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:7120:3: rule__EnemySpawn__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemySpawn__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnemySpawnAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__0__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__1"
    // InternalRangoMode.g:7128:1: rule__EnemySpawn__Group__1 : rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 ;
    public final void rule__EnemySpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7132:1: ( rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 )
            // InternalRangoMode.g:7133:2: rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__EnemySpawn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__1"


    // $ANTLR start "rule__EnemySpawn__Group__1__Impl"
    // InternalRangoMode.g:7140:1: rule__EnemySpawn__Group__1__Impl : ( ( rule__EnemySpawn__TypeAssignment_1 ) ) ;
    public final void rule__EnemySpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7144:1: ( ( ( rule__EnemySpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7145:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7145:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7146:2: ( rule__EnemySpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7147:2: ( rule__EnemySpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7147:3: rule__EnemySpawn__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__1__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__2"
    // InternalRangoMode.g:7155:1: rule__EnemySpawn__Group__2 : rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 ;
    public final void rule__EnemySpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7159:1: ( rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 )
            // InternalRangoMode.g:7160:2: rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EnemySpawn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__2"


    // $ANTLR start "rule__EnemySpawn__Group__2__Impl"
    // InternalRangoMode.g:7167:1: rule__EnemySpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__EnemySpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7171:1: ( ( 'size' ) )
            // InternalRangoMode.g:7172:1: ( 'size' )
            {
            // InternalRangoMode.g:7172:1: ( 'size' )
            // InternalRangoMode.g:7173:2: 'size'
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__2__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__3"
    // InternalRangoMode.g:7182:1: rule__EnemySpawn__Group__3 : rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 ;
    public final void rule__EnemySpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7186:1: ( rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 )
            // InternalRangoMode.g:7187:2: rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EnemySpawn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__3"


    // $ANTLR start "rule__EnemySpawn__Group__3__Impl"
    // InternalRangoMode.g:7194:1: rule__EnemySpawn__Group__3__Impl : ( ( rule__EnemySpawn__SizeAssignment_3 ) ) ;
    public final void rule__EnemySpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7198:1: ( ( ( rule__EnemySpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7199:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7199:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7200:2: ( rule__EnemySpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7201:2: ( rule__EnemySpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7201:3: rule__EnemySpawn__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__3__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__4"
    // InternalRangoMode.g:7209:1: rule__EnemySpawn__Group__4 : rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 ;
    public final void rule__EnemySpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7213:1: ( rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 )
            // InternalRangoMode.g:7214:2: rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5
            {
            pushFollow(FOLLOW_66);
            rule__EnemySpawn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__4"


    // $ANTLR start "rule__EnemySpawn__Group__4__Impl"
    // InternalRangoMode.g:7221:1: rule__EnemySpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__EnemySpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7225:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7226:1: ( ruleAt )
            {
            // InternalRangoMode.g:7226:1: ( ruleAt )
            // InternalRangoMode.g:7227:2: ruleAt
            {
             before(grammarAccess.getEnemySpawnAccess().getAtParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getEnemySpawnAccess().getAtParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__4__Impl"


    // $ANTLR start "rule__EnemySpawn__Group__5"
    // InternalRangoMode.g:7236:1: rule__EnemySpawn__Group__5 : rule__EnemySpawn__Group__5__Impl ;
    public final void rule__EnemySpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7240:1: ( rule__EnemySpawn__Group__5__Impl )
            // InternalRangoMode.g:7241:2: rule__EnemySpawn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__5"


    // $ANTLR start "rule__EnemySpawn__Group__5__Impl"
    // InternalRangoMode.g:7247:1: rule__EnemySpawn__Group__5__Impl : ( ( rule__EnemySpawn__Group_5__0 )? ) ;
    public final void rule__EnemySpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7251:1: ( ( ( rule__EnemySpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7252:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7252:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            // InternalRangoMode.g:7253:2: ( rule__EnemySpawn__Group_5__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7254:2: ( rule__EnemySpawn__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==88) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRangoMode.g:7254:3: rule__EnemySpawn__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemySpawn__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnemySpawnAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group__5__Impl"


    // $ANTLR start "rule__EnemySpawn__Group_0__0"
    // InternalRangoMode.g:7263:1: rule__EnemySpawn__Group_0__0 : rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 ;
    public final void rule__EnemySpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7267:1: ( rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 )
            // InternalRangoMode.g:7268:2: rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__EnemySpawn__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_0__0"


    // $ANTLR start "rule__EnemySpawn__Group_0__0__Impl"
    // InternalRangoMode.g:7275:1: rule__EnemySpawn__Group_0__0__Impl : ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) ;
    public final void rule__EnemySpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7279:1: ( ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7280:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7280:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7281:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7282:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7282:3: rule__EnemySpawn__CountAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__CountAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_0__0__Impl"


    // $ANTLR start "rule__EnemySpawn__Group_0__1"
    // InternalRangoMode.g:7290:1: rule__EnemySpawn__Group_0__1 : rule__EnemySpawn__Group_0__1__Impl ;
    public final void rule__EnemySpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7294:1: ( rule__EnemySpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7295:2: rule__EnemySpawn__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_0__1"


    // $ANTLR start "rule__EnemySpawn__Group_0__1__Impl"
    // InternalRangoMode.g:7301:1: rule__EnemySpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__EnemySpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7305:1: ( ( '*' ) )
            // InternalRangoMode.g:7306:1: ( '*' )
            {
            // InternalRangoMode.g:7306:1: ( '*' )
            // InternalRangoMode.g:7307:2: '*'
            {
             before(grammarAccess.getEnemySpawnAccess().getAsteriskKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getAsteriskKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_0__1__Impl"


    // $ANTLR start "rule__EnemySpawn__Group_5__0"
    // InternalRangoMode.g:7317:1: rule__EnemySpawn__Group_5__0 : rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 ;
    public final void rule__EnemySpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7321:1: ( rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 )
            // InternalRangoMode.g:7322:2: rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1
            {
            pushFollow(FOLLOW_67);
            rule__EnemySpawn__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_5__0"


    // $ANTLR start "rule__EnemySpawn__Group_5__0__Impl"
    // InternalRangoMode.g:7329:1: rule__EnemySpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__EnemySpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7333:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7334:1: ( 'moving' )
            {
            // InternalRangoMode.g:7334:1: ( 'moving' )
            // InternalRangoMode.g:7335:2: 'moving'
            {
             before(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_5__0__Impl"


    // $ANTLR start "rule__EnemySpawn__Group_5__1"
    // InternalRangoMode.g:7344:1: rule__EnemySpawn__Group_5__1 : rule__EnemySpawn__Group_5__1__Impl ;
    public final void rule__EnemySpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7348:1: ( rule__EnemySpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7349:2: rule__EnemySpawn__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_5__1"


    // $ANTLR start "rule__EnemySpawn__Group_5__1__Impl"
    // InternalRangoMode.g:7355:1: rule__EnemySpawn__Group_5__1__Impl : ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__EnemySpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7359:1: ( ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7360:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7360:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7361:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7362:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7362:3: rule__EnemySpawn__DirectionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EnemySpawn__DirectionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__Group_5__1__Impl"


    // $ANTLR start "rule__Drops__Group__0"
    // InternalRangoMode.g:7371:1: rule__Drops__Group__0 : rule__Drops__Group__0__Impl rule__Drops__Group__1 ;
    public final void rule__Drops__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7375:1: ( rule__Drops__Group__0__Impl rule__Drops__Group__1 )
            // InternalRangoMode.g:7376:2: rule__Drops__Group__0__Impl rule__Drops__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Drops__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drops__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__0"


    // $ANTLR start "rule__Drops__Group__0__Impl"
    // InternalRangoMode.g:7383:1: rule__Drops__Group__0__Impl : ( 'drops' ) ;
    public final void rule__Drops__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7387:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7388:1: ( 'drops' )
            {
            // InternalRangoMode.g:7388:1: ( 'drops' )
            // InternalRangoMode.g:7389:2: 'drops'
            {
             before(grammarAccess.getDropsAccess().getDropsKeyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getDropsAccess().getDropsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__0__Impl"


    // $ANTLR start "rule__Drops__Group__1"
    // InternalRangoMode.g:7398:1: rule__Drops__Group__1 : rule__Drops__Group__1__Impl rule__Drops__Group__2 ;
    public final void rule__Drops__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7402:1: ( rule__Drops__Group__1__Impl rule__Drops__Group__2 )
            // InternalRangoMode.g:7403:2: rule__Drops__Group__1__Impl rule__Drops__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Drops__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drops__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__1"


    // $ANTLR start "rule__Drops__Group__1__Impl"
    // InternalRangoMode.g:7410:1: rule__Drops__Group__1__Impl : ( '{' ) ;
    public final void rule__Drops__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7414:1: ( ( '{' ) )
            // InternalRangoMode.g:7415:1: ( '{' )
            {
            // InternalRangoMode.g:7415:1: ( '{' )
            // InternalRangoMode.g:7416:2: '{'
            {
             before(grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__1__Impl"


    // $ANTLR start "rule__Drops__Group__2"
    // InternalRangoMode.g:7425:1: rule__Drops__Group__2 : rule__Drops__Group__2__Impl rule__Drops__Group__3 ;
    public final void rule__Drops__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7429:1: ( rule__Drops__Group__2__Impl rule__Drops__Group__3 )
            // InternalRangoMode.g:7430:2: rule__Drops__Group__2__Impl rule__Drops__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Drops__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drops__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__2"


    // $ANTLR start "rule__Drops__Group__2__Impl"
    // InternalRangoMode.g:7437:1: rule__Drops__Group__2__Impl : ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) ;
    public final void rule__Drops__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7441:1: ( ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) )
            // InternalRangoMode.g:7442:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:7442:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            // InternalRangoMode.g:7443:2: ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* )
            {
            // InternalRangoMode.g:7443:2: ( ( rule__Drops__DropsAssignment_2 ) )
            // InternalRangoMode.g:7444:3: ( rule__Drops__DropsAssignment_2 )
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7445:3: ( rule__Drops__DropsAssignment_2 )
            // InternalRangoMode.g:7445:4: rule__Drops__DropsAssignment_2
            {
            pushFollow(FOLLOW_68);
            rule__Drops__DropsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }

            // InternalRangoMode.g:7448:2: ( ( rule__Drops__DropsAssignment_2 )* )
            // InternalRangoMode.g:7449:3: ( rule__Drops__DropsAssignment_2 )*
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7450:3: ( rule__Drops__DropsAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRangoMode.g:7450:4: rule__Drops__DropsAssignment_2
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__Drops__DropsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__2__Impl"


    // $ANTLR start "rule__Drops__Group__3"
    // InternalRangoMode.g:7459:1: rule__Drops__Group__3 : rule__Drops__Group__3__Impl ;
    public final void rule__Drops__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7463:1: ( rule__Drops__Group__3__Impl )
            // InternalRangoMode.g:7464:2: rule__Drops__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drops__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__3"


    // $ANTLR start "rule__Drops__Group__3__Impl"
    // InternalRangoMode.g:7470:1: rule__Drops__Group__3__Impl : ( '}' ) ;
    public final void rule__Drops__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7474:1: ( ( '}' ) )
            // InternalRangoMode.g:7475:1: ( '}' )
            {
            // InternalRangoMode.g:7475:1: ( '}' )
            // InternalRangoMode.g:7476:2: '}'
            {
             before(grammarAccess.getDropsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDropsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__Group__3__Impl"


    // $ANTLR start "rule__DropTable__Group__0"
    // InternalRangoMode.g:7486:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7490:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7491:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DropTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__0"


    // $ANTLR start "rule__DropTable__Group__0__Impl"
    // InternalRangoMode.g:7498:1: rule__DropTable__Group__0__Impl : ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7502:1: ( ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) )
            // InternalRangoMode.g:7503:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            {
            // InternalRangoMode.g:7503:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            // InternalRangoMode.g:7504:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 
            // InternalRangoMode.g:7505:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            // InternalRangoMode.g:7505:3: rule__DropTable__EnemyTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__EnemyTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__0__Impl"


    // $ANTLR start "rule__DropTable__Group__1"
    // InternalRangoMode.g:7513:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7517:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7518:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__DropTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__1"


    // $ANTLR start "rule__DropTable__Group__1__Impl"
    // InternalRangoMode.g:7525:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7529:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7530:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7530:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7531:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7532:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7532:3: rule__DropTable__ChanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__ChanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__1__Impl"


    // $ANTLR start "rule__DropTable__Group__2"
    // InternalRangoMode.g:7540:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7544:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7545:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DropTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__2"


    // $ANTLR start "rule__DropTable__Group__2__Impl"
    // InternalRangoMode.g:7552:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7556:1: ( ( '%' ) )
            // InternalRangoMode.g:7557:1: ( '%' )
            {
            // InternalRangoMode.g:7557:1: ( '%' )
            // InternalRangoMode.g:7558:2: '%'
            {
             before(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__2__Impl"


    // $ANTLR start "rule__DropTable__Group__3"
    // InternalRangoMode.g:7567:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7571:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7572:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DropTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__3"


    // $ANTLR start "rule__DropTable__Group__3__Impl"
    // InternalRangoMode.g:7579:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7583:1: ( ( '{' ) )
            // InternalRangoMode.g:7584:1: ( '{' )
            {
            // InternalRangoMode.g:7584:1: ( '{' )
            // InternalRangoMode.g:7585:2: '{'
            {
             before(grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__3__Impl"


    // $ANTLR start "rule__DropTable__Group__4"
    // InternalRangoMode.g:7594:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7598:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7599:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__DropTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__4"


    // $ANTLR start "rule__DropTable__Group__4__Impl"
    // InternalRangoMode.g:7606:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7610:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:7611:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:7611:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:7612:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:7613:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:7613:3: rule__DropTable__EntriesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__EntriesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__4__Impl"


    // $ANTLR start "rule__DropTable__Group__5"
    // InternalRangoMode.g:7621:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7625:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:7626:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__DropTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__5"


    // $ANTLR start "rule__DropTable__Group__5__Impl"
    // InternalRangoMode.g:7633:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7637:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:7638:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:7638:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:7639:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:7640:2: ( rule__DropTable__Group_5__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRangoMode.g:7640:3: rule__DropTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DropTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDropTableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__5__Impl"


    // $ANTLR start "rule__DropTable__Group__6"
    // InternalRangoMode.g:7648:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7652:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:7653:2: rule__DropTable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__6"


    // $ANTLR start "rule__DropTable__Group__6__Impl"
    // InternalRangoMode.g:7659:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7663:1: ( ( '}' ) )
            // InternalRangoMode.g:7664:1: ( '}' )
            {
            // InternalRangoMode.g:7664:1: ( '}' )
            // InternalRangoMode.g:7665:2: '}'
            {
             before(grammarAccess.getDropTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group__6__Impl"


    // $ANTLR start "rule__DropTable__Group_5__0"
    // InternalRangoMode.g:7675:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7679:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:7680:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__DropTable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTable__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group_5__0"


    // $ANTLR start "rule__DropTable__Group_5__0__Impl"
    // InternalRangoMode.g:7687:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7691:1: ( ( ',' ) )
            // InternalRangoMode.g:7692:1: ( ',' )
            {
            // InternalRangoMode.g:7692:1: ( ',' )
            // InternalRangoMode.g:7693:2: ','
            {
             before(grammarAccess.getDropTableAccess().getCommaKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group_5__0__Impl"


    // $ANTLR start "rule__DropTable__Group_5__1"
    // InternalRangoMode.g:7702:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7706:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:7707:2: rule__DropTable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group_5__1"


    // $ANTLR start "rule__DropTable__Group_5__1__Impl"
    // InternalRangoMode.g:7713:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7717:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:7718:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7718:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:7719:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:7720:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:7720:3: rule__DropTable__EntriesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DropTable__EntriesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__Group_5__1__Impl"


    // $ANTLR start "rule__Drop__Group__0"
    // InternalRangoMode.g:7729:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7733:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:7734:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_69);
            rule__Drop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__0"


    // $ANTLR start "rule__Drop__Group__0__Impl"
    // InternalRangoMode.g:7741:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7745:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:7746:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:7746:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:7747:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:7748:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:7748:3: rule__Drop__PowerUpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Drop__PowerUpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__0__Impl"


    // $ANTLR start "rule__Drop__Group__1"
    // InternalRangoMode.g:7756:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7760:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:7761:2: rule__Drop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__1"


    // $ANTLR start "rule__Drop__Group__1__Impl"
    // InternalRangoMode.g:7767:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7771:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:7772:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:7772:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:7773:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:7774:2: ( rule__Drop__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==90) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:7774:3: rule__Drop__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Drop__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDropAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group__1__Impl"


    // $ANTLR start "rule__Drop__Group_1__0"
    // InternalRangoMode.g:7783:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7787:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:7788:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Drop__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group_1__0"


    // $ANTLR start "rule__Drop__Group_1__0__Impl"
    // InternalRangoMode.g:7795:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7799:1: ( ( 'weight' ) )
            // InternalRangoMode.g:7800:1: ( 'weight' )
            {
            // InternalRangoMode.g:7800:1: ( 'weight' )
            // InternalRangoMode.g:7801:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group_1__0__Impl"


    // $ANTLR start "rule__Drop__Group_1__1"
    // InternalRangoMode.g:7810:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7814:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:7815:2: rule__Drop__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group_1__1"


    // $ANTLR start "rule__Drop__Group_1__1__Impl"
    // InternalRangoMode.g:7821:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7825:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:7826:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7826:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:7827:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:7828:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:7828:3: rule__Drop__WeightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Drop__WeightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__Group_1__1__Impl"


    // $ANTLR start "rule__EndConditions__Group__0"
    // InternalRangoMode.g:7837:1: rule__EndConditions__Group__0 : rule__EndConditions__Group__0__Impl rule__EndConditions__Group__1 ;
    public final void rule__EndConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7841:1: ( rule__EndConditions__Group__0__Impl rule__EndConditions__Group__1 )
            // InternalRangoMode.g:7842:2: rule__EndConditions__Group__0__Impl rule__EndConditions__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__EndConditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__0"


    // $ANTLR start "rule__EndConditions__Group__0__Impl"
    // InternalRangoMode.g:7849:1: rule__EndConditions__Group__0__Impl : ( ( rule__EndConditions__Group_0__0 )? ) ;
    public final void rule__EndConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7853:1: ( ( ( rule__EndConditions__Group_0__0 )? ) )
            // InternalRangoMode.g:7854:1: ( ( rule__EndConditions__Group_0__0 )? )
            {
            // InternalRangoMode.g:7854:1: ( ( rule__EndConditions__Group_0__0 )? )
            // InternalRangoMode.g:7855:2: ( rule__EndConditions__Group_0__0 )?
            {
             before(grammarAccess.getEndConditionsAccess().getGroup_0()); 
            // InternalRangoMode.g:7856:2: ( rule__EndConditions__Group_0__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==93) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:7856:3: rule__EndConditions__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndConditions__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndConditionsAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__0__Impl"


    // $ANTLR start "rule__EndConditions__Group__1"
    // InternalRangoMode.g:7864:1: rule__EndConditions__Group__1 : rule__EndConditions__Group__1__Impl rule__EndConditions__Group__2 ;
    public final void rule__EndConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7868:1: ( rule__EndConditions__Group__1__Impl rule__EndConditions__Group__2 )
            // InternalRangoMode.g:7869:2: rule__EndConditions__Group__1__Impl rule__EndConditions__Group__2
            {
            pushFollow(FOLLOW_70);
            rule__EndConditions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__1"


    // $ANTLR start "rule__EndConditions__Group__1__Impl"
    // InternalRangoMode.g:7876:1: rule__EndConditions__Group__1__Impl : ( 'lose' ) ;
    public final void rule__EndConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7880:1: ( ( 'lose' ) )
            // InternalRangoMode.g:7881:1: ( 'lose' )
            {
            // InternalRangoMode.g:7881:1: ( 'lose' )
            // InternalRangoMode.g:7882:2: 'lose'
            {
             before(grammarAccess.getEndConditionsAccess().getLoseKeyword_1()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getLoseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__1__Impl"


    // $ANTLR start "rule__EndConditions__Group__2"
    // InternalRangoMode.g:7891:1: rule__EndConditions__Group__2 : rule__EndConditions__Group__2__Impl rule__EndConditions__Group__3 ;
    public final void rule__EndConditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7895:1: ( rule__EndConditions__Group__2__Impl rule__EndConditions__Group__3 )
            // InternalRangoMode.g:7896:2: rule__EndConditions__Group__2__Impl rule__EndConditions__Group__3
            {
            pushFollow(FOLLOW_71);
            rule__EndConditions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__2"


    // $ANTLR start "rule__EndConditions__Group__2__Impl"
    // InternalRangoMode.g:7903:1: rule__EndConditions__Group__2__Impl : ( 'when' ) ;
    public final void rule__EndConditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7907:1: ( ( 'when' ) )
            // InternalRangoMode.g:7908:1: ( 'when' )
            {
            // InternalRangoMode.g:7908:1: ( 'when' )
            // InternalRangoMode.g:7909:2: 'when'
            {
             before(grammarAccess.getEndConditionsAccess().getWhenKeyword_2()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getWhenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__2__Impl"


    // $ANTLR start "rule__EndConditions__Group__3"
    // InternalRangoMode.g:7918:1: rule__EndConditions__Group__3 : rule__EndConditions__Group__3__Impl rule__EndConditions__Group__4 ;
    public final void rule__EndConditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7922:1: ( rule__EndConditions__Group__3__Impl rule__EndConditions__Group__4 )
            // InternalRangoMode.g:7923:2: rule__EndConditions__Group__3__Impl rule__EndConditions__Group__4
            {
            pushFollow(FOLLOW_72);
            rule__EndConditions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__3"


    // $ANTLR start "rule__EndConditions__Group__3__Impl"
    // InternalRangoMode.g:7930:1: rule__EndConditions__Group__3__Impl : ( ( rule__EndConditions__LoseAssignment_3 ) ) ;
    public final void rule__EndConditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7934:1: ( ( ( rule__EndConditions__LoseAssignment_3 ) ) )
            // InternalRangoMode.g:7935:1: ( ( rule__EndConditions__LoseAssignment_3 ) )
            {
            // InternalRangoMode.g:7935:1: ( ( rule__EndConditions__LoseAssignment_3 ) )
            // InternalRangoMode.g:7936:2: ( rule__EndConditions__LoseAssignment_3 )
            {
             before(grammarAccess.getEndConditionsAccess().getLoseAssignment_3()); 
            // InternalRangoMode.g:7937:2: ( rule__EndConditions__LoseAssignment_3 )
            // InternalRangoMode.g:7937:3: rule__EndConditions__LoseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__LoseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionsAccess().getLoseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__3__Impl"


    // $ANTLR start "rule__EndConditions__Group__4"
    // InternalRangoMode.g:7945:1: rule__EndConditions__Group__4 : rule__EndConditions__Group__4__Impl ;
    public final void rule__EndConditions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7949:1: ( rule__EndConditions__Group__4__Impl )
            // InternalRangoMode.g:7950:2: rule__EndConditions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__4"


    // $ANTLR start "rule__EndConditions__Group__4__Impl"
    // InternalRangoMode.g:7956:1: rule__EndConditions__Group__4__Impl : ( ( rule__EndConditions__Group_4__0 )* ) ;
    public final void rule__EndConditions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7960:1: ( ( ( rule__EndConditions__Group_4__0 )* ) )
            // InternalRangoMode.g:7961:1: ( ( rule__EndConditions__Group_4__0 )* )
            {
            // InternalRangoMode.g:7961:1: ( ( rule__EndConditions__Group_4__0 )* )
            // InternalRangoMode.g:7962:2: ( rule__EndConditions__Group_4__0 )*
            {
             before(grammarAccess.getEndConditionsAccess().getGroup_4()); 
            // InternalRangoMode.g:7963:2: ( rule__EndConditions__Group_4__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==94) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRangoMode.g:7963:3: rule__EndConditions__Group_4__0
            	    {
            	    pushFollow(FOLLOW_73);
            	    rule__EndConditions__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getEndConditionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group__4__Impl"


    // $ANTLR start "rule__EndConditions__Group_0__0"
    // InternalRangoMode.g:7972:1: rule__EndConditions__Group_0__0 : rule__EndConditions__Group_0__0__Impl rule__EndConditions__Group_0__1 ;
    public final void rule__EndConditions__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7976:1: ( rule__EndConditions__Group_0__0__Impl rule__EndConditions__Group_0__1 )
            // InternalRangoMode.g:7977:2: rule__EndConditions__Group_0__0__Impl rule__EndConditions__Group_0__1
            {
            pushFollow(FOLLOW_70);
            rule__EndConditions__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__0"


    // $ANTLR start "rule__EndConditions__Group_0__0__Impl"
    // InternalRangoMode.g:7984:1: rule__EndConditions__Group_0__0__Impl : ( 'win' ) ;
    public final void rule__EndConditions__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7988:1: ( ( 'win' ) )
            // InternalRangoMode.g:7989:1: ( 'win' )
            {
            // InternalRangoMode.g:7989:1: ( 'win' )
            // InternalRangoMode.g:7990:2: 'win'
            {
             before(grammarAccess.getEndConditionsAccess().getWinKeyword_0_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getWinKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__0__Impl"


    // $ANTLR start "rule__EndConditions__Group_0__1"
    // InternalRangoMode.g:7999:1: rule__EndConditions__Group_0__1 : rule__EndConditions__Group_0__1__Impl rule__EndConditions__Group_0__2 ;
    public final void rule__EndConditions__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8003:1: ( rule__EndConditions__Group_0__1__Impl rule__EndConditions__Group_0__2 )
            // InternalRangoMode.g:8004:2: rule__EndConditions__Group_0__1__Impl rule__EndConditions__Group_0__2
            {
            pushFollow(FOLLOW_74);
            rule__EndConditions__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__1"


    // $ANTLR start "rule__EndConditions__Group_0__1__Impl"
    // InternalRangoMode.g:8011:1: rule__EndConditions__Group_0__1__Impl : ( 'when' ) ;
    public final void rule__EndConditions__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8015:1: ( ( 'when' ) )
            // InternalRangoMode.g:8016:1: ( 'when' )
            {
            // InternalRangoMode.g:8016:1: ( 'when' )
            // InternalRangoMode.g:8017:2: 'when'
            {
             before(grammarAccess.getEndConditionsAccess().getWhenKeyword_0_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getWhenKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__1__Impl"


    // $ANTLR start "rule__EndConditions__Group_0__2"
    // InternalRangoMode.g:8026:1: rule__EndConditions__Group_0__2 : rule__EndConditions__Group_0__2__Impl rule__EndConditions__Group_0__3 ;
    public final void rule__EndConditions__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8030:1: ( rule__EndConditions__Group_0__2__Impl rule__EndConditions__Group_0__3 )
            // InternalRangoMode.g:8031:2: rule__EndConditions__Group_0__2__Impl rule__EndConditions__Group_0__3
            {
            pushFollow(FOLLOW_72);
            rule__EndConditions__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__2"


    // $ANTLR start "rule__EndConditions__Group_0__2__Impl"
    // InternalRangoMode.g:8038:1: rule__EndConditions__Group_0__2__Impl : ( ( rule__EndConditions__WinAssignment_0_2 ) ) ;
    public final void rule__EndConditions__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8042:1: ( ( ( rule__EndConditions__WinAssignment_0_2 ) ) )
            // InternalRangoMode.g:8043:1: ( ( rule__EndConditions__WinAssignment_0_2 ) )
            {
            // InternalRangoMode.g:8043:1: ( ( rule__EndConditions__WinAssignment_0_2 ) )
            // InternalRangoMode.g:8044:2: ( rule__EndConditions__WinAssignment_0_2 )
            {
             before(grammarAccess.getEndConditionsAccess().getWinAssignment_0_2()); 
            // InternalRangoMode.g:8045:2: ( rule__EndConditions__WinAssignment_0_2 )
            // InternalRangoMode.g:8045:3: rule__EndConditions__WinAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__WinAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionsAccess().getWinAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__2__Impl"


    // $ANTLR start "rule__EndConditions__Group_0__3"
    // InternalRangoMode.g:8053:1: rule__EndConditions__Group_0__3 : rule__EndConditions__Group_0__3__Impl ;
    public final void rule__EndConditions__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8057:1: ( rule__EndConditions__Group_0__3__Impl )
            // InternalRangoMode.g:8058:2: rule__EndConditions__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__3"


    // $ANTLR start "rule__EndConditions__Group_0__3__Impl"
    // InternalRangoMode.g:8064:1: rule__EndConditions__Group_0__3__Impl : ( ( rule__EndConditions__Group_0_3__0 )* ) ;
    public final void rule__EndConditions__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8068:1: ( ( ( rule__EndConditions__Group_0_3__0 )* ) )
            // InternalRangoMode.g:8069:1: ( ( rule__EndConditions__Group_0_3__0 )* )
            {
            // InternalRangoMode.g:8069:1: ( ( rule__EndConditions__Group_0_3__0 )* )
            // InternalRangoMode.g:8070:2: ( rule__EndConditions__Group_0_3__0 )*
            {
             before(grammarAccess.getEndConditionsAccess().getGroup_0_3()); 
            // InternalRangoMode.g:8071:2: ( rule__EndConditions__Group_0_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==94) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRangoMode.g:8071:3: rule__EndConditions__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_73);
            	    rule__EndConditions__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getEndConditionsAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0__3__Impl"


    // $ANTLR start "rule__EndConditions__Group_0_3__0"
    // InternalRangoMode.g:8080:1: rule__EndConditions__Group_0_3__0 : rule__EndConditions__Group_0_3__0__Impl rule__EndConditions__Group_0_3__1 ;
    public final void rule__EndConditions__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8084:1: ( rule__EndConditions__Group_0_3__0__Impl rule__EndConditions__Group_0_3__1 )
            // InternalRangoMode.g:8085:2: rule__EndConditions__Group_0_3__0__Impl rule__EndConditions__Group_0_3__1
            {
            pushFollow(FOLLOW_74);
            rule__EndConditions__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0_3__0"


    // $ANTLR start "rule__EndConditions__Group_0_3__0__Impl"
    // InternalRangoMode.g:8092:1: rule__EndConditions__Group_0_3__0__Impl : ( 'or' ) ;
    public final void rule__EndConditions__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8096:1: ( ( 'or' ) )
            // InternalRangoMode.g:8097:1: ( 'or' )
            {
            // InternalRangoMode.g:8097:1: ( 'or' )
            // InternalRangoMode.g:8098:2: 'or'
            {
             before(grammarAccess.getEndConditionsAccess().getOrKeyword_0_3_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getOrKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0_3__0__Impl"


    // $ANTLR start "rule__EndConditions__Group_0_3__1"
    // InternalRangoMode.g:8107:1: rule__EndConditions__Group_0_3__1 : rule__EndConditions__Group_0_3__1__Impl ;
    public final void rule__EndConditions__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8111:1: ( rule__EndConditions__Group_0_3__1__Impl )
            // InternalRangoMode.g:8112:2: rule__EndConditions__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0_3__1"


    // $ANTLR start "rule__EndConditions__Group_0_3__1__Impl"
    // InternalRangoMode.g:8118:1: rule__EndConditions__Group_0_3__1__Impl : ( ( rule__EndConditions__WinAssignment_0_3_1 ) ) ;
    public final void rule__EndConditions__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8122:1: ( ( ( rule__EndConditions__WinAssignment_0_3_1 ) ) )
            // InternalRangoMode.g:8123:1: ( ( rule__EndConditions__WinAssignment_0_3_1 ) )
            {
            // InternalRangoMode.g:8123:1: ( ( rule__EndConditions__WinAssignment_0_3_1 ) )
            // InternalRangoMode.g:8124:2: ( rule__EndConditions__WinAssignment_0_3_1 )
            {
             before(grammarAccess.getEndConditionsAccess().getWinAssignment_0_3_1()); 
            // InternalRangoMode.g:8125:2: ( rule__EndConditions__WinAssignment_0_3_1 )
            // InternalRangoMode.g:8125:3: rule__EndConditions__WinAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__WinAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionsAccess().getWinAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_0_3__1__Impl"


    // $ANTLR start "rule__EndConditions__Group_4__0"
    // InternalRangoMode.g:8134:1: rule__EndConditions__Group_4__0 : rule__EndConditions__Group_4__0__Impl rule__EndConditions__Group_4__1 ;
    public final void rule__EndConditions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8138:1: ( rule__EndConditions__Group_4__0__Impl rule__EndConditions__Group_4__1 )
            // InternalRangoMode.g:8139:2: rule__EndConditions__Group_4__0__Impl rule__EndConditions__Group_4__1
            {
            pushFollow(FOLLOW_71);
            rule__EndConditions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_4__0"


    // $ANTLR start "rule__EndConditions__Group_4__0__Impl"
    // InternalRangoMode.g:8146:1: rule__EndConditions__Group_4__0__Impl : ( 'or' ) ;
    public final void rule__EndConditions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8150:1: ( ( 'or' ) )
            // InternalRangoMode.g:8151:1: ( 'or' )
            {
            // InternalRangoMode.g:8151:1: ( 'or' )
            // InternalRangoMode.g:8152:2: 'or'
            {
             before(grammarAccess.getEndConditionsAccess().getOrKeyword_4_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getEndConditionsAccess().getOrKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_4__0__Impl"


    // $ANTLR start "rule__EndConditions__Group_4__1"
    // InternalRangoMode.g:8161:1: rule__EndConditions__Group_4__1 : rule__EndConditions__Group_4__1__Impl ;
    public final void rule__EndConditions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8165:1: ( rule__EndConditions__Group_4__1__Impl )
            // InternalRangoMode.g:8166:2: rule__EndConditions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_4__1"


    // $ANTLR start "rule__EndConditions__Group_4__1__Impl"
    // InternalRangoMode.g:8172:1: rule__EndConditions__Group_4__1__Impl : ( ( rule__EndConditions__LoseAssignment_4_1 ) ) ;
    public final void rule__EndConditions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8176:1: ( ( ( rule__EndConditions__LoseAssignment_4_1 ) ) )
            // InternalRangoMode.g:8177:1: ( ( rule__EndConditions__LoseAssignment_4_1 ) )
            {
            // InternalRangoMode.g:8177:1: ( ( rule__EndConditions__LoseAssignment_4_1 ) )
            // InternalRangoMode.g:8178:2: ( rule__EndConditions__LoseAssignment_4_1 )
            {
             before(grammarAccess.getEndConditionsAccess().getLoseAssignment_4_1()); 
            // InternalRangoMode.g:8179:2: ( rule__EndConditions__LoseAssignment_4_1 )
            // InternalRangoMode.g:8179:3: rule__EndConditions__LoseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EndConditions__LoseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionsAccess().getLoseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__Group_4__1__Impl"


    // $ANTLR start "rule__Cleared__Group__0"
    // InternalRangoMode.g:8188:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8192:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:8193:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
            {
            pushFollow(FOLLOW_75);
            rule__Cleared__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cleared__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__0"


    // $ANTLR start "rule__Cleared__Group__0__Impl"
    // InternalRangoMode.g:8200:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8204:1: ( ( () ) )
            // InternalRangoMode.g:8205:1: ( () )
            {
            // InternalRangoMode.g:8205:1: ( () )
            // InternalRangoMode.g:8206:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:8207:2: ()
            // InternalRangoMode.g:8207:3: 
            {
            }

             after(grammarAccess.getClearedAccess().getClearedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__0__Impl"


    // $ANTLR start "rule__Cleared__Group__1"
    // InternalRangoMode.g:8215:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8219:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:8220:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
            {
            pushFollow(FOLLOW_76);
            rule__Cleared__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cleared__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__1"


    // $ANTLR start "rule__Cleared__Group__1__Impl"
    // InternalRangoMode.g:8227:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8231:1: ( ( 'all' ) )
            // InternalRangoMode.g:8232:1: ( 'all' )
            {
            // InternalRangoMode.g:8232:1: ( 'all' )
            // InternalRangoMode.g:8233:2: 'all'
            {
             before(grammarAccess.getClearedAccess().getAllKeyword_1()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getClearedAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__1__Impl"


    // $ANTLR start "rule__Cleared__Group__2"
    // InternalRangoMode.g:8242:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8246:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:8247:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
            {
            pushFollow(FOLLOW_77);
            rule__Cleared__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cleared__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__2"


    // $ANTLR start "rule__Cleared__Group__2__Impl"
    // InternalRangoMode.g:8254:1: rule__Cleared__Group__2__Impl : ( 'enemies' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8258:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8259:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8259:1: ( 'enemies' )
            // InternalRangoMode.g:8260:2: 'enemies'
            {
             before(grammarAccess.getClearedAccess().getEnemiesKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClearedAccess().getEnemiesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__2__Impl"


    // $ANTLR start "rule__Cleared__Group__3"
    // InternalRangoMode.g:8269:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8273:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:8274:2: rule__Cleared__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cleared__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__3"


    // $ANTLR start "rule__Cleared__Group__3__Impl"
    // InternalRangoMode.g:8280:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8284:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:8285:1: ( 'cleared' )
            {
            // InternalRangoMode.g:8285:1: ( 'cleared' )
            // InternalRangoMode.g:8286:2: 'cleared'
            {
             before(grammarAccess.getClearedAccess().getClearedKeyword_3()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getClearedAccess().getClearedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cleared__Group__3__Impl"


    // $ANTLR start "rule__TimeSurvived__Group__0"
    // InternalRangoMode.g:8296:1: rule__TimeSurvived__Group__0 : rule__TimeSurvived__Group__0__Impl rule__TimeSurvived__Group__1 ;
    public final void rule__TimeSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8300:1: ( rule__TimeSurvived__Group__0__Impl rule__TimeSurvived__Group__1 )
            // InternalRangoMode.g:8301:2: rule__TimeSurvived__Group__0__Impl rule__TimeSurvived__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__TimeSurvived__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSurvived__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__0"


    // $ANTLR start "rule__TimeSurvived__Group__0__Impl"
    // InternalRangoMode.g:8308:1: rule__TimeSurvived__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8312:1: ( ( 'time' ) )
            // InternalRangoMode.g:8313:1: ( 'time' )
            {
            // InternalRangoMode.g:8313:1: ( 'time' )
            // InternalRangoMode.g:8314:2: 'time'
            {
             before(grammarAccess.getTimeSurvivedAccess().getTimeKeyword_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getTimeSurvivedAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__0__Impl"


    // $ANTLR start "rule__TimeSurvived__Group__1"
    // InternalRangoMode.g:8323:1: rule__TimeSurvived__Group__1 : rule__TimeSurvived__Group__1__Impl rule__TimeSurvived__Group__2 ;
    public final void rule__TimeSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8327:1: ( rule__TimeSurvived__Group__1__Impl rule__TimeSurvived__Group__2 )
            // InternalRangoMode.g:8328:2: rule__TimeSurvived__Group__1__Impl rule__TimeSurvived__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TimeSurvived__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSurvived__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__1"


    // $ANTLR start "rule__TimeSurvived__Group__1__Impl"
    // InternalRangoMode.g:8335:1: rule__TimeSurvived__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8339:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8340:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8340:1: ( 'reaches' )
            // InternalRangoMode.g:8341:2: 'reaches'
            {
             before(grammarAccess.getTimeSurvivedAccess().getReachesKeyword_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getTimeSurvivedAccess().getReachesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__1__Impl"


    // $ANTLR start "rule__TimeSurvived__Group__2"
    // InternalRangoMode.g:8350:1: rule__TimeSurvived__Group__2 : rule__TimeSurvived__Group__2__Impl rule__TimeSurvived__Group__3 ;
    public final void rule__TimeSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8354:1: ( rule__TimeSurvived__Group__2__Impl rule__TimeSurvived__Group__3 )
            // InternalRangoMode.g:8355:2: rule__TimeSurvived__Group__2__Impl rule__TimeSurvived__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__TimeSurvived__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSurvived__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__2"


    // $ANTLR start "rule__TimeSurvived__Group__2__Impl"
    // InternalRangoMode.g:8362:1: rule__TimeSurvived__Group__2__Impl : ( ( rule__TimeSurvived__SecondsAssignment_2 ) ) ;
    public final void rule__TimeSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8366:1: ( ( ( rule__TimeSurvived__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8367:1: ( ( rule__TimeSurvived__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8367:1: ( ( rule__TimeSurvived__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8368:2: ( rule__TimeSurvived__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeSurvivedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8369:2: ( rule__TimeSurvived__SecondsAssignment_2 )
            // InternalRangoMode.g:8369:3: rule__TimeSurvived__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeSurvived__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSurvivedAccess().getSecondsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__2__Impl"


    // $ANTLR start "rule__TimeSurvived__Group__3"
    // InternalRangoMode.g:8377:1: rule__TimeSurvived__Group__3 : rule__TimeSurvived__Group__3__Impl ;
    public final void rule__TimeSurvived__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8381:1: ( rule__TimeSurvived__Group__3__Impl )
            // InternalRangoMode.g:8382:2: rule__TimeSurvived__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSurvived__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__3"


    // $ANTLR start "rule__TimeSurvived__Group__3__Impl"
    // InternalRangoMode.g:8388:1: rule__TimeSurvived__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeSurvived__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8392:1: ( ( 's' ) )
            // InternalRangoMode.g:8393:1: ( 's' )
            {
            // InternalRangoMode.g:8393:1: ( 's' )
            // InternalRangoMode.g:8394:2: 's'
            {
             before(grammarAccess.getTimeSurvivedAccess().getSKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTimeSurvivedAccess().getSKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__Group__3__Impl"


    // $ANTLR start "rule__WavesSurvived__Group__0"
    // InternalRangoMode.g:8404:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8408:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8409:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
            {
            pushFollow(FOLLOW_79);
            rule__WavesSurvived__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WavesSurvived__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__0"


    // $ANTLR start "rule__WavesSurvived__Group__0__Impl"
    // InternalRangoMode.g:8416:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8420:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8421:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8421:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8422:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8423:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8423:3: rule__WavesSurvived__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WavesSurvived__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__0__Impl"


    // $ANTLR start "rule__WavesSurvived__Group__1"
    // InternalRangoMode.g:8431:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8435:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8436:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
            {
            pushFollow(FOLLOW_80);
            rule__WavesSurvived__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WavesSurvived__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__1"


    // $ANTLR start "rule__WavesSurvived__Group__1__Impl"
    // InternalRangoMode.g:8443:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8447:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8448:1: ( 'waves' )
            {
            // InternalRangoMode.g:8448:1: ( 'waves' )
            // InternalRangoMode.g:8449:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__1__Impl"


    // $ANTLR start "rule__WavesSurvived__Group__2"
    // InternalRangoMode.g:8458:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8462:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8463:2: rule__WavesSurvived__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WavesSurvived__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__2"


    // $ANTLR start "rule__WavesSurvived__Group__2__Impl"
    // InternalRangoMode.g:8469:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8473:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8474:1: ( 'survived' )
            {
            // InternalRangoMode.g:8474:1: ( 'survived' )
            // InternalRangoMode.g:8475:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__Group__2__Impl"


    // $ANTLR start "rule__HealthDepleted__Group__0"
    // InternalRangoMode.g:8485:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8489:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8490:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
            {
            pushFollow(FOLLOW_81);
            rule__HealthDepleted__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HealthDepleted__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__0"


    // $ANTLR start "rule__HealthDepleted__Group__0__Impl"
    // InternalRangoMode.g:8497:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8501:1: ( ( () ) )
            // InternalRangoMode.g:8502:1: ( () )
            {
            // InternalRangoMode.g:8502:1: ( () )
            // InternalRangoMode.g:8503:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8504:2: ()
            // InternalRangoMode.g:8504:3: 
            {
            }

             after(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__0__Impl"


    // $ANTLR start "rule__HealthDepleted__Group__1"
    // InternalRangoMode.g:8512:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8516:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8517:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
            {
            pushFollow(FOLLOW_82);
            rule__HealthDepleted__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HealthDepleted__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__1"


    // $ANTLR start "rule__HealthDepleted__Group__1__Impl"
    // InternalRangoMode.g:8524:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8528:1: ( ( 'health' ) )
            // InternalRangoMode.g:8529:1: ( 'health' )
            {
            // InternalRangoMode.g:8529:1: ( 'health' )
            // InternalRangoMode.g:8530:2: 'health'
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getHealthDepletedAccess().getHealthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__1__Impl"


    // $ANTLR start "rule__HealthDepleted__Group__2"
    // InternalRangoMode.g:8539:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8543:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8544:2: rule__HealthDepleted__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HealthDepleted__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__2"


    // $ANTLR start "rule__HealthDepleted__Group__2__Impl"
    // InternalRangoMode.g:8550:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8554:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8555:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8555:1: ( 'depleted' )
            // InternalRangoMode.g:8556:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthDepleted__Group__2__Impl"


    // $ANTLR start "rule__TimeLimit__Group__0"
    // InternalRangoMode.g:8566:1: rule__TimeLimit__Group__0 : rule__TimeLimit__Group__0__Impl rule__TimeLimit__Group__1 ;
    public final void rule__TimeLimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8570:1: ( rule__TimeLimit__Group__0__Impl rule__TimeLimit__Group__1 )
            // InternalRangoMode.g:8571:2: rule__TimeLimit__Group__0__Impl rule__TimeLimit__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__TimeLimit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__0"


    // $ANTLR start "rule__TimeLimit__Group__0__Impl"
    // InternalRangoMode.g:8578:1: rule__TimeLimit__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeLimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8582:1: ( ( 'time' ) )
            // InternalRangoMode.g:8583:1: ( 'time' )
            {
            // InternalRangoMode.g:8583:1: ( 'time' )
            // InternalRangoMode.g:8584:2: 'time'
            {
             before(grammarAccess.getTimeLimitAccess().getTimeKeyword_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getTimeLimitAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__0__Impl"


    // $ANTLR start "rule__TimeLimit__Group__1"
    // InternalRangoMode.g:8593:1: rule__TimeLimit__Group__1 : rule__TimeLimit__Group__1__Impl rule__TimeLimit__Group__2 ;
    public final void rule__TimeLimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8597:1: ( rule__TimeLimit__Group__1__Impl rule__TimeLimit__Group__2 )
            // InternalRangoMode.g:8598:2: rule__TimeLimit__Group__1__Impl rule__TimeLimit__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TimeLimit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__1"


    // $ANTLR start "rule__TimeLimit__Group__1__Impl"
    // InternalRangoMode.g:8605:1: rule__TimeLimit__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeLimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8609:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8610:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8610:1: ( 'reaches' )
            // InternalRangoMode.g:8611:2: 'reaches'
            {
             before(grammarAccess.getTimeLimitAccess().getReachesKeyword_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getTimeLimitAccess().getReachesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__1__Impl"


    // $ANTLR start "rule__TimeLimit__Group__2"
    // InternalRangoMode.g:8620:1: rule__TimeLimit__Group__2 : rule__TimeLimit__Group__2__Impl rule__TimeLimit__Group__3 ;
    public final void rule__TimeLimit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8624:1: ( rule__TimeLimit__Group__2__Impl rule__TimeLimit__Group__3 )
            // InternalRangoMode.g:8625:2: rule__TimeLimit__Group__2__Impl rule__TimeLimit__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__TimeLimit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLimit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__2"


    // $ANTLR start "rule__TimeLimit__Group__2__Impl"
    // InternalRangoMode.g:8632:1: rule__TimeLimit__Group__2__Impl : ( ( rule__TimeLimit__SecondsAssignment_2 ) ) ;
    public final void rule__TimeLimit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8636:1: ( ( ( rule__TimeLimit__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8637:1: ( ( rule__TimeLimit__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8637:1: ( ( rule__TimeLimit__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8638:2: ( rule__TimeLimit__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeLimitAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8639:2: ( rule__TimeLimit__SecondsAssignment_2 )
            // InternalRangoMode.g:8639:3: rule__TimeLimit__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimit__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeLimitAccess().getSecondsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__2__Impl"


    // $ANTLR start "rule__TimeLimit__Group__3"
    // InternalRangoMode.g:8647:1: rule__TimeLimit__Group__3 : rule__TimeLimit__Group__3__Impl ;
    public final void rule__TimeLimit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8651:1: ( rule__TimeLimit__Group__3__Impl )
            // InternalRangoMode.g:8652:2: rule__TimeLimit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLimit__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__3"


    // $ANTLR start "rule__TimeLimit__Group__3__Impl"
    // InternalRangoMode.g:8658:1: rule__TimeLimit__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeLimit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8662:1: ( ( 's' ) )
            // InternalRangoMode.g:8663:1: ( 's' )
            {
            // InternalRangoMode.g:8663:1: ( 's' )
            // InternalRangoMode.g:8664:2: 's'
            {
             before(grammarAccess.getTimeLimitAccess().getSKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTimeLimitAccess().getSKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__Group__3__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalRangoMode.g:8674:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8678:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8679:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_83);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // InternalRangoMode.g:8686:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8690:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8691:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8691:1: ( RULE_INT )
            // InternalRangoMode.g:8692:2: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // InternalRangoMode.g:8701:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8705:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8706:2: rule__Decimal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // InternalRangoMode.g:8712:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8716:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8717:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8717:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8718:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8719:2: ( rule__Decimal__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==101) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:8719:3: rule__Decimal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Decimal__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group_1__0"
    // InternalRangoMode.g:8728:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8732:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8733:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Decimal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_1__0"


    // $ANTLR start "rule__Decimal__Group_1__0__Impl"
    // InternalRangoMode.g:8740:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8744:1: ( ( '.' ) )
            // InternalRangoMode.g:8745:1: ( '.' )
            {
            // InternalRangoMode.g:8745:1: ( '.' )
            // InternalRangoMode.g:8746:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_1__0__Impl"


    // $ANTLR start "rule__Decimal__Group_1__1"
    // InternalRangoMode.g:8755:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8759:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8760:2: rule__Decimal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_1__1"


    // $ANTLR start "rule__Decimal__Group_1__1__Impl"
    // InternalRangoMode.g:8766:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8770:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8771:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8771:1: ( RULE_INT )
            // InternalRangoMode.g:8772:2: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_1__1__Impl"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3"
    // InternalRangoMode.g:8782:1: rule__EnemyType__UnorderedGroup_3 : rule__EnemyType__UnorderedGroup_3__0 {...}?;
    public final void rule__EnemyType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8787:1: ( rule__EnemyType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8788:2: rule__EnemyType__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__Impl"
    // InternalRangoMode.g:8796:1: rule__EnemyType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__EnemyType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8801:1: ( ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8802:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8802:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            int alt46=5;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt46=2;
            }
            else if ( LA46_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt46=3;
            }
            else if ( LA46_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt46=4;
            }
            else if ( LA46_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt46=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:8803:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8803:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8804:4: {...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8804:105: ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8805:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8811:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8812:6: ( rule__EnemyType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8813:6: ( rule__EnemyType__Group_3_0__0 )
                    // InternalRangoMode.g:8813:7: rule__EnemyType__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:8818:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8818:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8819:4: {...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8819:105: ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8820:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8826:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    // InternalRangoMode.g:8827:6: ( rule__EnemyType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8828:6: ( rule__EnemyType__Group_3_1__0 )
                    // InternalRangoMode.g:8828:7: rule__EnemyType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:8833:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8833:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8834:4: {...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8834:105: ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8835:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8841:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    // InternalRangoMode.g:8842:6: ( rule__EnemyType__Group_3_2__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8843:6: ( rule__EnemyType__Group_3_2__0 )
                    // InternalRangoMode.g:8843:7: rule__EnemyType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:8848:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8848:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8849:4: {...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8849:105: ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8850:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8856:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    // InternalRangoMode.g:8857:6: ( rule__EnemyType__Group_3_3__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8858:6: ( rule__EnemyType__Group_3_3__0 )
                    // InternalRangoMode.g:8858:7: rule__EnemyType__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:8863:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8863:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8864:4: {...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8864:105: ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8865:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8871:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    // InternalRangoMode.g:8872:6: ( rule__EnemyType__Group_3_4__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8873:6: ( rule__EnemyType__Group_3_4__0 )
                    // InternalRangoMode.g:8873:7: rule__EnemyType__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__0"
    // InternalRangoMode.g:8886:1: rule__EnemyType__UnorderedGroup_3__0 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8890:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8891:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_84);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8892:2: ( rule__EnemyType__UnorderedGroup_3__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRangoMode.g:8892:2: rule__EnemyType__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__0"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__1"
    // InternalRangoMode.g:8898:1: rule__EnemyType__UnorderedGroup_3__1 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8902:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8903:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_84);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8904:2: ( rule__EnemyType__UnorderedGroup_3__2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt48=1;
            }
            else if ( LA48_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt48=1;
            }
            else if ( LA48_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRangoMode.g:8904:2: rule__EnemyType__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__1"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__2"
    // InternalRangoMode.g:8910:1: rule__EnemyType__UnorderedGroup_3__2 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8914:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:8915:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_84);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8916:2: ( rule__EnemyType__UnorderedGroup_3__3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            else if ( LA49_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt49=1;
            }
            else if ( LA49_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRangoMode.g:8916:2: rule__EnemyType__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__2"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__3"
    // InternalRangoMode.g:8922:1: rule__EnemyType__UnorderedGroup_3__3 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8926:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:8927:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_84);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8928:2: ( rule__EnemyType__UnorderedGroup_3__4 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt50=1;
            }
            else if ( LA50_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt50=1;
            }
            else if ( LA50_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:8928:2: rule__EnemyType__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnemyType__UnorderedGroup_3__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__3"


    // $ANTLR start "rule__EnemyType__UnorderedGroup_3__4"
    // InternalRangoMode.g:8934:1: rule__EnemyType__UnorderedGroup_3__4 : rule__EnemyType__UnorderedGroup_3__Impl ;
    public final void rule__EnemyType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8938:1: ( rule__EnemyType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8939:2: rule__EnemyType__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__UnorderedGroup_3__4"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3"
    // InternalRangoMode.g:8946:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8951:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8952:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__Impl"
    // InternalRangoMode.g:8960:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8965:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:8966:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8966:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt51=6;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt51=2;
            }
            else if ( LA51_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt51=3;
            }
            else if ( LA51_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt51=4;
            }
            else if ( LA51_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt51=5;
            }
            else if ( LA51_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt51=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalRangoMode.g:8967:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8967:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8968:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8968:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8969:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8975:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:8976:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8977:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:8977:7: rule__PlayerProfile__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:8982:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8982:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8983:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8983:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8984:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8990:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:8991:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8992:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:8992:7: rule__PlayerProfile__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:8997:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8997:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8998:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8998:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8999:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9005:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:9006:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:9007:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:9007:7: rule__PlayerProfile__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:9012:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9012:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:9013:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:9013:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:9014:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9020:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:9021:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9022:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:9022:7: rule__PlayerProfile__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:9027:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9027:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9028:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9028:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9029:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9035:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:9036:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9037:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:9037:7: rule__PlayerProfile__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:9042:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9042:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:9043:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:9043:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:9044:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9050:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:9051:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:9052:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:9052:7: rule__PlayerProfile__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__Group_3_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__0"
    // InternalRangoMode.g:9065:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9069:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9070:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9071:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            else if ( LA52_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt52=1;
            }
            else if ( LA52_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt52=1;
            }
            else if ( LA52_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRangoMode.g:9071:2: rule__PlayerProfile__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__0"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__1"
    // InternalRangoMode.g:9077:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9081:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9082:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9083:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt53=1;
            }
            else if ( LA53_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt53=1;
            }
            else if ( LA53_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt53=1;
            }
            else if ( LA53_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRangoMode.g:9083:2: rule__PlayerProfile__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__1"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__2"
    // InternalRangoMode.g:9089:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9093:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9094:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9095:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt54=1;
            }
            else if ( LA54_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt54=1;
            }
            else if ( LA54_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt54=1;
            }
            else if ( LA54_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRangoMode.g:9095:2: rule__PlayerProfile__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__2"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__3"
    // InternalRangoMode.g:9101:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9105:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9106:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9107:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt55=1;
            }
            else if ( LA55_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt55=1;
            }
            else if ( LA55_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt55=1;
            }
            else if ( LA55_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt55=1;
            }
            else if ( LA55_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRangoMode.g:9107:2: rule__PlayerProfile__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__UnorderedGroup_3__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__3"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__4"
    // InternalRangoMode.g:9113:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9117:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:9118:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9119:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt56=1;
            }
            else if ( LA56_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt56=1;
            }
            else if ( LA56_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt56=1;
            }
            else if ( LA56_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt56=1;
            }
            else if ( LA56_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRangoMode.g:9119:2: rule__PlayerProfile__UnorderedGroup_3__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerProfile__UnorderedGroup_3__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__4"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3__5"
    // InternalRangoMode.g:9125:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9129:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9130:2: rule__PlayerProfile__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__UnorderedGroup_3__5"


    // $ANTLR start "rule__GameMode__UnorderedGroup_7"
    // InternalRangoMode.g:9137:1: rule__GameMode__UnorderedGroup_7 : ( rule__GameMode__UnorderedGroup_7__0 )? ;
    public final void rule__GameMode__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
        	
        try {
            // InternalRangoMode.g:9142:1: ( ( rule__GameMode__UnorderedGroup_7__0 )? )
            // InternalRangoMode.g:9143:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            {
            // InternalRangoMode.g:9143:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRangoMode.g:9143:2: rule__GameMode__UnorderedGroup_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__UnorderedGroup_7__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_7"


    // $ANTLR start "rule__GameMode__UnorderedGroup_7__Impl"
    // InternalRangoMode.g:9151:1: rule__GameMode__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9156:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) )
            // InternalRangoMode.g:9157:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            {
            // InternalRangoMode.g:9157:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalRangoMode.g:9158:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9158:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    // InternalRangoMode.g:9159:4: {...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalRangoMode.g:9159:104: ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    // InternalRangoMode.g:9160:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9166:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    // InternalRangoMode.g:9167:6: ( rule__GameMode__Group_7_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_7_0()); 
                    // InternalRangoMode.g:9168:6: ( rule__GameMode__Group_7_0__0 )
                    // InternalRangoMode.g:9168:7: rule__GameMode__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getGroup_7_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:9173:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    {
                    // InternalRangoMode.g:9173:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    // InternalRangoMode.g:9174:4: {...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalRangoMode.g:9174:104: ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    // InternalRangoMode.g:9175:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9181:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    // InternalRangoMode.g:9182:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 
                    // InternalRangoMode.g:9183:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    // InternalRangoMode.g:9183:7: rule__GameMode__SpeedBonusAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__SpeedBonusAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_7__Impl"


    // $ANTLR start "rule__GameMode__UnorderedGroup_7__0"
    // InternalRangoMode.g:9196:1: rule__GameMode__UnorderedGroup_7__0 : rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? ;
    public final void rule__GameMode__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9200:1: ( rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? )
            // InternalRangoMode.g:9201:2: rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_86);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalRangoMode.g:9202:2: ( rule__GameMode__UnorderedGroup_7__1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRangoMode.g:9202:2: rule__GameMode__UnorderedGroup_7__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__UnorderedGroup_7__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_7__0"


    // $ANTLR start "rule__GameMode__UnorderedGroup_7__1"
    // InternalRangoMode.g:9208:1: rule__GameMode__UnorderedGroup_7__1 : rule__GameMode__UnorderedGroup_7__Impl ;
    public final void rule__GameMode__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9212:1: ( rule__GameMode__UnorderedGroup_7__Impl )
            // InternalRangoMode.g:9213:2: rule__GameMode__UnorderedGroup_7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_7__1"


    // $ANTLR start "rule__Edition__NameAssignment_1"
    // InternalRangoMode.g:9220:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9224:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9225:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9225:2: ( RULE_ID )
            // InternalRangoMode.g:9226:3: RULE_ID
            {
             before(grammarAccess.getEditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__NameAssignment_1"


    // $ANTLR start "rule__Edition__TitleAssignment_2"
    // InternalRangoMode.g:9235:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9239:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9240:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9240:2: ( RULE_STRING )
            // InternalRangoMode.g:9241:3: RULE_STRING
            {
             before(grammarAccess.getEditionAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEditionAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__TitleAssignment_2"


    // $ANTLR start "rule__Edition__EnemyTypesAssignment_3_0"
    // InternalRangoMode.g:9250:1: rule__Edition__EnemyTypesAssignment_3_0 : ( ruleEnemyType ) ;
    public final void rule__Edition__EnemyTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9254:1: ( ( ruleEnemyType ) )
            // InternalRangoMode.g:9255:2: ( ruleEnemyType )
            {
            // InternalRangoMode.g:9255:2: ( ruleEnemyType )
            // InternalRangoMode.g:9256:3: ruleEnemyType
            {
             before(grammarAccess.getEditionAccess().getEnemyTypesEnemyTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnemyType();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getEnemyTypesEnemyTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__EnemyTypesAssignment_3_0"


    // $ANTLR start "rule__Edition__PowerUpsAssignment_3_1"
    // InternalRangoMode.g:9265:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9269:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:9270:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:9270:2: ( rulePowerUp )
            // InternalRangoMode.g:9271:3: rulePowerUp
            {
             before(grammarAccess.getEditionAccess().getPowerUpsPowerUpParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePowerUp();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getPowerUpsPowerUpParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__PowerUpsAssignment_3_1"


    // $ANTLR start "rule__Edition__PlayersAssignment_3_2"
    // InternalRangoMode.g:9280:1: rule__Edition__PlayersAssignment_3_2 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9284:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9285:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9285:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9286:3: rulePlayerProfile
            {
             before(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerProfile();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__PlayersAssignment_3_2"


    // $ANTLR start "rule__Edition__DifficultiesAssignment_3_4"
    // InternalRangoMode.g:9295:1: rule__Edition__DifficultiesAssignment_3_4 : ( ruleDifficulty ) ;
    public final void rule__Edition__DifficultiesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9299:1: ( ( ruleDifficulty ) )
            // InternalRangoMode.g:9300:2: ( ruleDifficulty )
            {
            // InternalRangoMode.g:9300:2: ( ruleDifficulty )
            // InternalRangoMode.g:9301:3: ruleDifficulty
            {
             before(grammarAccess.getEditionAccess().getDifficultiesDifficultyParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficulty();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getDifficultiesDifficultyParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__DifficultiesAssignment_3_4"


    // $ANTLR start "rule__Edition__ModesAssignment_3_5"
    // InternalRangoMode.g:9310:1: rule__Edition__ModesAssignment_3_5 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9314:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9315:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9315:2: ( ruleGameMode )
            // InternalRangoMode.g:9316:3: ruleGameMode
            {
             before(grammarAccess.getEditionAccess().getModesGameModeParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGameMode();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getModesGameModeParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__ModesAssignment_3_5"


    // $ANTLR start "rule__Difficulty__TierAssignment_1"
    // InternalRangoMode.g:9325:1: rule__Difficulty__TierAssignment_1 : ( ruleDifficultyTier ) ;
    public final void rule__Difficulty__TierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9329:1: ( ( ruleDifficultyTier ) )
            // InternalRangoMode.g:9330:2: ( ruleDifficultyTier )
            {
            // InternalRangoMode.g:9330:2: ( ruleDifficultyTier )
            // InternalRangoMode.g:9331:3: ruleDifficultyTier
            {
             before(grammarAccess.getDifficultyAccess().getTierDifficultyTierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficultyTier();

            state._fsp--;

             after(grammarAccess.getDifficultyAccess().getTierDifficultyTierEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__TierAssignment_1"


    // $ANTLR start "rule__Difficulty__ModifiersAssignment_3"
    // InternalRangoMode.g:9340:1: rule__Difficulty__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__Difficulty__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9344:1: ( ( ruleModifier ) )
            // InternalRangoMode.g:9345:2: ( ruleModifier )
            {
            // InternalRangoMode.g:9345:2: ( ruleModifier )
            // InternalRangoMode.g:9346:3: ruleModifier
            {
             before(grammarAccess.getDifficultyAccess().getModifiersModifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getDifficultyAccess().getModifiersModifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Difficulty__ModifiersAssignment_3"


    // $ANTLR start "rule__Modifier__TargetAssignment_0"
    // InternalRangoMode.g:9355:1: rule__Modifier__TargetAssignment_0 : ( ruleModifierTarget ) ;
    public final void rule__Modifier__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9359:1: ( ( ruleModifierTarget ) )
            // InternalRangoMode.g:9360:2: ( ruleModifierTarget )
            {
            // InternalRangoMode.g:9360:2: ( ruleModifierTarget )
            // InternalRangoMode.g:9361:3: ruleModifierTarget
            {
             before(grammarAccess.getModifierAccess().getTargetModifierTargetEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModifierTarget();

            state._fsp--;

             after(grammarAccess.getModifierAccess().getTargetModifierTargetEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__TargetAssignment_0"


    // $ANTLR start "rule__Modifier__FactorAssignment_2"
    // InternalRangoMode.g:9370:1: rule__Modifier__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Modifier__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9374:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9375:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9375:2: ( ruleDecimal )
            // InternalRangoMode.g:9376:3: ruleDecimal
            {
             before(grammarAccess.getModifierAccess().getFactorDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getModifierAccess().getFactorDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__FactorAssignment_2"


    // $ANTLR start "rule__EnemyType__NameAssignment_1"
    // InternalRangoMode.g:9385:1: rule__EnemyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnemyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9389:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9390:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9390:2: ( RULE_ID )
            // InternalRangoMode.g:9391:3: RULE_ID
            {
             before(grammarAccess.getEnemyTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__NameAssignment_1"


    // $ANTLR start "rule__EnemyType__SpriteAssignment_3_0_1"
    // InternalRangoMode.g:9400:1: rule__EnemyType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__EnemyType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9404:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9405:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9405:2: ( RULE_STRING )
            // InternalRangoMode.g:9406:3: RULE_STRING
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__SpriteAssignment_3_0_1"


    // $ANTLR start "rule__EnemyType__ScaleAssignment_3_1_1"
    // InternalRangoMode.g:9415:1: rule__EnemyType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9419:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9420:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9420:2: ( ruleDecimal )
            // InternalRangoMode.g:9421:3: ruleDecimal
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__ScaleAssignment_3_1_1"


    // $ANTLR start "rule__EnemyType__BounceAssignment_3_2_1"
    // InternalRangoMode.g:9430:1: rule__EnemyType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9434:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9435:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9435:2: ( ruleDecimal )
            // InternalRangoMode.g:9436:3: ruleDecimal
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__BounceAssignment_3_2_1"


    // $ANTLR start "rule__EnemyType__SpeedAssignment_3_3_1"
    // InternalRangoMode.g:9445:1: rule__EnemyType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9449:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9450:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9450:2: ( ruleDecimal )
            // InternalRangoMode.g:9451:3: ruleDecimal
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__SpeedAssignment_3_3_1"


    // $ANTLR start "rule__EnemyType__PointsAssignment_3_4_1"
    // InternalRangoMode.g:9460:1: rule__EnemyType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__EnemyType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9464:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9465:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9465:2: ( RULE_INT )
            // InternalRangoMode.g:9466:3: RULE_INT
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnemyTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__PointsAssignment_3_4_1"


    // $ANTLR start "rule__EnemyType__SplitRuleAssignment_7"
    // InternalRangoMode.g:9475:1: rule__EnemyType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__EnemyType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9479:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9480:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9480:2: ( ruleSplitRule )
            // InternalRangoMode.g:9481:3: ruleSplitRule
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSplitRule();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__SplitRuleAssignment_7"


    // $ANTLR start "rule__EnemyType__ContactEffectsAssignment_11"
    // InternalRangoMode.g:9490:1: rule__EnemyType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9494:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9495:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9495:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9496:3: rulePlayerEffect
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__ContactEffectsAssignment_11"


    // $ANTLR start "rule__EnemyType__ContactEffectsAssignment_12_1"
    // InternalRangoMode.g:9505:1: rule__EnemyType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9509:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9510:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9510:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9511:3: rulePlayerEffect
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemyType__ContactEffectsAssignment_12_1"


    // $ANTLR start "rule__Split__FragmentsAssignment_2"
    // InternalRangoMode.g:9520:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9524:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9525:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9525:2: ( RULE_INT )
            // InternalRangoMode.g:9526:3: RULE_INT
            {
             before(grammarAccess.getSplitAccess().getFragmentsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getFragmentsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__FragmentsAssignment_2"


    // $ANTLR start "rule__Split__FragmentTypeAssignment_3"
    // InternalRangoMode.g:9535:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9539:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9540:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9540:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9541:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9542:3: ( RULE_ID )
            // InternalRangoMode.g:9543:4: RULE_ID
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__FragmentTypeAssignment_3"


    // $ANTLR start "rule__Split__LaunchSpeedAssignment_4_2"
    // InternalRangoMode.g:9554:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9558:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9559:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9559:2: ( ruleDecimal )
            // InternalRangoMode.g:9560:3: ruleDecimal
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getSplitAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Split__LaunchSpeedAssignment_4_2"


    // $ANTLR start "rule__Damage__AmountAssignment_1"
    // InternalRangoMode.g:9569:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9573:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9574:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9574:2: ( RULE_INT )
            // InternalRangoMode.g:9575:3: RULE_INT
            {
             before(grammarAccess.getDamageAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDamageAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__AmountAssignment_1"


    // $ANTLR start "rule__Heal__AmountAssignment_1"
    // InternalRangoMode.g:9584:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9588:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9589:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9589:2: ( RULE_INT )
            // InternalRangoMode.g:9590:3: RULE_INT
            {
             before(grammarAccess.getHealAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHealAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heal__AmountAssignment_1"


    // $ANTLR start "rule__Shield__DurationAssignment_2"
    // InternalRangoMode.g:9599:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9603:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9604:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9604:2: ( ruleDecimal )
            // InternalRangoMode.g:9605:3: ruleDecimal
            {
             before(grammarAccess.getShieldAccess().getDurationDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getShieldAccess().getDurationDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shield__DurationAssignment_2"


    // $ANTLR start "rule__SpeedChange__FactorAssignment_2"
    // InternalRangoMode.g:9614:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9618:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9619:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9619:2: ( ruleDecimal )
            // InternalRangoMode.g:9620:3: ruleDecimal
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getSpeedChangeAccess().getFactorDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__FactorAssignment_2"


    // $ANTLR start "rule__SpeedChange__DurationAssignment_4"
    // InternalRangoMode.g:9629:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9633:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9634:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9634:2: ( ruleDecimal )
            // InternalRangoMode.g:9635:3: ruleDecimal
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationDecimalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getSpeedChangeAccess().getDurationDecimalParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedChange__DurationAssignment_4"


    // $ANTLR start "rule__Poison__AmountAssignment_1"
    // InternalRangoMode.g:9644:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9648:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9649:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9649:2: ( RULE_INT )
            // InternalRangoMode.g:9650:3: RULE_INT
            {
             before(grammarAccess.getPoisonAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPoisonAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__AmountAssignment_1"


    // $ANTLR start "rule__Poison__IntervalAssignment_3"
    // InternalRangoMode.g:9659:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9663:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9664:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9664:2: ( ruleDecimal )
            // InternalRangoMode.g:9665:3: ruleDecimal
            {
             before(grammarAccess.getPoisonAccess().getIntervalDecimalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPoisonAccess().getIntervalDecimalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__IntervalAssignment_3"


    // $ANTLR start "rule__Poison__DurationAssignment_6"
    // InternalRangoMode.g:9674:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9678:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9679:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9679:2: ( ruleDecimal )
            // InternalRangoMode.g:9680:3: ruleDecimal
            {
             before(grammarAccess.getPoisonAccess().getDurationDecimalParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPoisonAccess().getDurationDecimalParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poison__DurationAssignment_6"


    // $ANTLR start "rule__PowerUp__NameAssignment_1"
    // InternalRangoMode.g:9689:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9693:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9694:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9694:2: ( RULE_ID )
            // InternalRangoMode.g:9695:3: RULE_ID
            {
             before(grammarAccess.getPowerUpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__NameAssignment_1"


    // $ANTLR start "rule__PowerUp__SpriteAssignment_4"
    // InternalRangoMode.g:9704:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9708:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9709:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9709:2: ( RULE_STRING )
            // InternalRangoMode.g:9710:3: RULE_STRING
            {
             before(grammarAccess.getPowerUpAccess().getSpriteSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPowerUpAccess().getSpriteSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__SpriteAssignment_4"


    // $ANTLR start "rule__PowerUp__EffectsAssignment_7"
    // InternalRangoMode.g:9719:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9723:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9724:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9724:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9725:3: rulePlayerEffect
            {
             before(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__EffectsAssignment_7"


    // $ANTLR start "rule__PowerUp__EffectsAssignment_8_1"
    // InternalRangoMode.g:9734:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9738:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9739:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9739:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9740:3: rulePlayerEffect
            {
             before(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerUp__EffectsAssignment_8_1"


    // $ANTLR start "rule__PlayerProfile__NameAssignment_1"
    // InternalRangoMode.g:9749:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9753:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9754:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9754:2: ( RULE_ID )
            // InternalRangoMode.g:9755:3: RULE_ID
            {
             before(grammarAccess.getPlayerProfileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__NameAssignment_1"


    // $ANTLR start "rule__PlayerProfile__CharacterAssignment_3_0_1"
    // InternalRangoMode.g:9764:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9768:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9769:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9769:2: ( RULE_STRING )
            // InternalRangoMode.g:9770:3: RULE_STRING
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getCharacterSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__CharacterAssignment_3_0_1"


    // $ANTLR start "rule__PlayerProfile__HealthAssignment_3_1_1"
    // InternalRangoMode.g:9779:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9783:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9784:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9784:2: ( RULE_INT )
            // InternalRangoMode.g:9785:3: RULE_INT
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getHealthINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__HealthAssignment_3_1_1"


    // $ANTLR start "rule__PlayerProfile__MaxHealthAssignment_3_1_2_1"
    // InternalRangoMode.g:9794:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9798:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9799:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9799:2: ( RULE_INT )
            // InternalRangoMode.g:9800:3: RULE_INT
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthINTTerminalRuleCall_3_1_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPlayerProfileAccess().getMaxHealthINTTerminalRuleCall_3_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__MaxHealthAssignment_3_1_2_1"


    // $ANTLR start "rule__PlayerProfile__SpeedAssignment_3_2_1"
    // InternalRangoMode.g:9809:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9813:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9814:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9814:2: ( ruleDecimal )
            // InternalRangoMode.g:9815:3: ruleDecimal
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedDecimalParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPlayerProfileAccess().getSpeedDecimalParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__SpeedAssignment_3_2_1"


    // $ANTLR start "rule__PlayerProfile__TongueTimeAssignment_3_3_1"
    // InternalRangoMode.g:9824:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9828:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9829:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9829:2: ( ruleDecimal )
            // InternalRangoMode.g:9830:3: ruleDecimal
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeDecimalParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPlayerProfileAccess().getTongueTimeDecimalParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__TongueTimeAssignment_3_3_1"


    // $ANTLR start "rule__PlayerProfile__CooldownAssignment_3_4_1"
    // InternalRangoMode.g:9839:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9843:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9844:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9844:2: ( ruleDecimal )
            // InternalRangoMode.g:9845:3: ruleDecimal
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownDecimalParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPlayerProfileAccess().getCooldownDecimalParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__CooldownAssignment_3_4_1"


    // $ANTLR start "rule__PlayerProfile__GraceTimeAssignment_3_5_1"
    // InternalRangoMode.g:9854:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9858:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9859:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9859:2: ( ruleDecimal )
            // InternalRangoMode.g:9860:3: ruleDecimal
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeDecimalParserRuleCall_3_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getPlayerProfileAccess().getGraceTimeDecimalParserRuleCall_3_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerProfile__GraceTimeAssignment_3_5_1"


    // $ANTLR start "rule__GameMode__NameAssignment_1"
    // InternalRangoMode.g:9869:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9873:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9874:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9874:2: ( RULE_ID )
            // InternalRangoMode.g:9875:3: RULE_ID
            {
             before(grammarAccess.getGameModeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__NameAssignment_1"


    // $ANTLR start "rule__GameMode__TitleAssignment_2"
    // InternalRangoMode.g:9884:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9888:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9889:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9889:2: ( RULE_STRING )
            // InternalRangoMode.g:9890:3: RULE_STRING
            {
             before(grammarAccess.getGameModeAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__TitleAssignment_2"


    // $ANTLR start "rule__GameMode__DescriptionAssignment_4_1"
    // InternalRangoMode.g:9899:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9903:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9904:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9904:2: ( RULE_STRING )
            // InternalRangoMode.g:9905:3: RULE_STRING
            {
             before(grammarAccess.getGameModeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__DescriptionAssignment_4_1"


    // $ANTLR start "rule__GameMode__PlayerAssignment_6"
    // InternalRangoMode.g:9914:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9918:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9919:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9919:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9920:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:9921:3: ( RULE_ID )
            // InternalRangoMode.g:9922:4: RULE_ID
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getPlayerPlayerProfileIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__PlayerAssignment_6"


    // $ANTLR start "rule__GameMode__GravityAssignment_7_0_1"
    // InternalRangoMode.g:9933:1: rule__GameMode__GravityAssignment_7_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9937:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9938:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9938:2: ( ruleDecimal )
            // InternalRangoMode.g:9939:3: ruleDecimal
            {
             before(grammarAccess.getGameModeAccess().getGravityDecimalParserRuleCall_7_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getGravityDecimalParserRuleCall_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__GravityAssignment_7_0_1"


    // $ANTLR start "rule__GameMode__SpeedBonusAssignment_7_1"
    // InternalRangoMode.g:9948:1: rule__GameMode__SpeedBonusAssignment_7_1 : ( ruleSpeedBonus ) ;
    public final void rule__GameMode__SpeedBonusAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9952:1: ( ( ruleSpeedBonus ) )
            // InternalRangoMode.g:9953:2: ( ruleSpeedBonus )
            {
            // InternalRangoMode.g:9953:2: ( ruleSpeedBonus )
            // InternalRangoMode.g:9954:3: ruleSpeedBonus
            {
             before(grammarAccess.getGameModeAccess().getSpeedBonusSpeedBonusParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeedBonus();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getSpeedBonusSpeedBonusParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__SpeedBonusAssignment_7_1"


    // $ANTLR start "rule__GameMode__LevelsAssignment_9_0"
    // InternalRangoMode.g:9963:1: rule__GameMode__LevelsAssignment_9_0 : ( ruleSingleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9967:1: ( ( ruleSingleLevel ) )
            // InternalRangoMode.g:9968:2: ( ruleSingleLevel )
            {
            // InternalRangoMode.g:9968:2: ( ruleSingleLevel )
            // InternalRangoMode.g:9969:3: ruleSingleLevel
            {
             before(grammarAccess.getGameModeAccess().getLevelsSingleLevelParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleLevel();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLevelsSingleLevelParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LevelsAssignment_9_0"


    // $ANTLR start "rule__GameMode__LevelsAssignment_9_1"
    // InternalRangoMode.g:9978:1: rule__GameMode__LevelsAssignment_9_1 : ( ruleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9982:1: ( ( ruleLevel ) )
            // InternalRangoMode.g:9983:2: ( ruleLevel )
            {
            // InternalRangoMode.g:9983:2: ( ruleLevel )
            // InternalRangoMode.g:9984:3: ruleLevel
            {
             before(grammarAccess.getGameModeAccess().getLevelsLevelParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLevelsLevelParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LevelsAssignment_9_1"


    // $ANTLR start "rule__SingleLevel__ArenaAssignment_0"
    // InternalRangoMode.g:9993:1: rule__SingleLevel__ArenaAssignment_0 : ( ruleArena ) ;
    public final void rule__SingleLevel__ArenaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9997:1: ( ( ruleArena ) )
            // InternalRangoMode.g:9998:2: ( ruleArena )
            {
            // InternalRangoMode.g:9998:2: ( ruleArena )
            // InternalRangoMode.g:9999:3: ruleArena
            {
             before(grammarAccess.getSingleLevelAccess().getArenaArenaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getSingleLevelAccess().getArenaArenaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__ArenaAssignment_0"


    // $ANTLR start "rule__SingleLevel__SpawningAssignment_1"
    // InternalRangoMode.g:10008:1: rule__SingleLevel__SpawningAssignment_1 : ( ruleSpawnStrategy ) ;
    public final void rule__SingleLevel__SpawningAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10012:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10013:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10013:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10014:3: ruleSpawnStrategy
            {
             before(grammarAccess.getSingleLevelAccess().getSpawningSpawnStrategyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpawnStrategy();

            state._fsp--;

             after(grammarAccess.getSingleLevelAccess().getSpawningSpawnStrategyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleLevel__SpawningAssignment_1"


    // $ANTLR start "rule__Level__TitleAssignment_1"
    // InternalRangoMode.g:10023:1: rule__Level__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Level__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10027:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10028:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10028:2: ( RULE_STRING )
            // InternalRangoMode.g:10029:3: RULE_STRING
            {
             before(grammarAccess.getLevelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__TitleAssignment_1"


    // $ANTLR start "rule__Level__ArenaAssignment_3"
    // InternalRangoMode.g:10038:1: rule__Level__ArenaAssignment_3 : ( ruleArena ) ;
    public final void rule__Level__ArenaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10042:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10043:2: ( ruleArena )
            {
            // InternalRangoMode.g:10043:2: ( ruleArena )
            // InternalRangoMode.g:10044:3: ruleArena
            {
             before(grammarAccess.getLevelAccess().getArenaArenaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getLevelAccess().getArenaArenaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__ArenaAssignment_3"


    // $ANTLR start "rule__Level__SpawningAssignment_4"
    // InternalRangoMode.g:10053:1: rule__Level__SpawningAssignment_4 : ( ruleSpawnStrategy ) ;
    public final void rule__Level__SpawningAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10057:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10058:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10058:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10059:3: ruleSpawnStrategy
            {
             before(grammarAccess.getLevelAccess().getSpawningSpawnStrategyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSpawnStrategy();

            state._fsp--;

             after(grammarAccess.getLevelAccess().getSpawningSpawnStrategyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__SpawningAssignment_4"


    // $ANTLR start "rule__SpeedBonus__MaxFactorAssignment_3_2"
    // InternalRangoMode.g:10068:1: rule__SpeedBonus__MaxFactorAssignment_3_2 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__MaxFactorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10072:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10073:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10073:2: ( ruleDecimal )
            // InternalRangoMode.g:10074:3: ruleDecimal
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorDecimalParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getSpeedBonusAccess().getMaxFactorDecimalParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__MaxFactorAssignment_3_2"


    // $ANTLR start "rule__SpeedBonus__DurationAssignment_4_1"
    // InternalRangoMode.g:10083:1: rule__SpeedBonus__DurationAssignment_4_1 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10087:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10088:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10088:2: ( ruleDecimal )
            // InternalRangoMode.g:10089:3: ruleDecimal
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationDecimalParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getSpeedBonusAccess().getDurationDecimalParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedBonus__DurationAssignment_4_1"


    // $ANTLR start "rule__Arena__BackgroundAssignment_3"
    // InternalRangoMode.g:10098:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10102:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10103:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10103:2: ( RULE_STRING )
            // InternalRangoMode.g:10104:3: RULE_STRING
            {
             before(grammarAccess.getArenaAccess().getBackgroundSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getBackgroundSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__BackgroundAssignment_3"


    // $ANTLR start "rule__Arena__PlayerStartAssignment_4_3"
    // InternalRangoMode.g:10113:1: rule__Arena__PlayerStartAssignment_4_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10117:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10118:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10118:2: ( ruleDecimal )
            // InternalRangoMode.g:10119:3: ruleDecimal
            {
             before(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__PlayerStartAssignment_4_3"


    // $ANTLR start "rule__Arena__ObstaclesAssignment_5"
    // InternalRangoMode.g:10128:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10132:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:10133:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:10133:2: ( ruleObstacle )
            // InternalRangoMode.g:10134:3: ruleObstacle
            {
             before(grammarAccess.getArenaAccess().getObstaclesObstacleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObstacle();

            state._fsp--;

             after(grammarAccess.getArenaAccess().getObstaclesObstacleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__ObstaclesAssignment_5"


    // $ANTLR start "rule__At__XAssignment_2"
    // InternalRangoMode.g:10143:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10147:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10148:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10148:2: ( ruleDecimal )
            // InternalRangoMode.g:10149:3: ruleDecimal
            {
             before(grammarAccess.getAtAccess().getXDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getAtAccess().getXDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__XAssignment_2"


    // $ANTLR start "rule__At__YAssignment_5"
    // InternalRangoMode.g:10158:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10162:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10163:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10163:2: ( ruleDecimal )
            // InternalRangoMode.g:10164:3: ruleDecimal
            {
             before(grammarAccess.getAtAccess().getYDecimalParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getAtAccess().getYDecimalParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At__YAssignment_5"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // InternalRangoMode.g:10173:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10177:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10178:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10178:2: ( RULE_ID )
            // InternalRangoMode.g:10179:3: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__WidthAssignment_4"
    // InternalRangoMode.g:10188:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10192:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10193:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10193:2: ( RULE_INT )
            // InternalRangoMode.g:10194:3: RULE_INT
            {
             before(grammarAccess.getBlockAccess().getWidthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getWidthINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__WidthAssignment_4"


    // $ANTLR start "rule__Block__HeightAssignment_6"
    // InternalRangoMode.g:10203:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10207:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10208:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10208:2: ( RULE_INT )
            // InternalRangoMode.g:10209:3: RULE_INT
            {
             before(grammarAccess.getBlockAccess().getHeightINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getHeightINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__HeightAssignment_6"


    // $ANTLR start "rule__JumpPad__NameAssignment_1"
    // InternalRangoMode.g:10218:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10222:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10223:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10223:2: ( RULE_ID )
            // InternalRangoMode.g:10224:3: RULE_ID
            {
             before(grammarAccess.getJumpPadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJumpPadAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__NameAssignment_1"


    // $ANTLR start "rule__JumpPad__LaunchAssignment_4"
    // InternalRangoMode.g:10233:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10237:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10238:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10238:2: ( ruleDecimal )
            // InternalRangoMode.g:10239:3: ruleDecimal
            {
             before(grammarAccess.getJumpPadAccess().getLaunchDecimalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getJumpPadAccess().getLaunchDecimalParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__LaunchAssignment_4"


    // $ANTLR start "rule__JumpPad__AffectsAssignment_5_1"
    // InternalRangoMode.g:10248:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10252:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10253:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10253:2: ( ruleTarget )
            // InternalRangoMode.g:10254:3: ruleTarget
            {
             before(grammarAccess.getJumpPadAccess().getAffectsTargetEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getJumpPadAccess().getAffectsTargetEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JumpPad__AffectsAssignment_5_1"


    // $ANTLR start "rule__Teleporter__NameAssignment_1"
    // InternalRangoMode.g:10263:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10267:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10268:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10268:2: ( RULE_ID )
            // InternalRangoMode.g:10269:3: RULE_ID
            {
             before(grammarAccess.getTeleporterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeleporterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__NameAssignment_1"


    // $ANTLR start "rule__Teleporter__TargetAssignment_4"
    // InternalRangoMode.g:10278:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10282:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10283:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10283:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10284:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:10285:3: ( RULE_ID )
            // InternalRangoMode.g:10286:4: RULE_ID
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeleporterAccess().getTargetTeleporterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__TargetAssignment_4"


    // $ANTLR start "rule__Teleporter__AffectsAssignment_5_1"
    // InternalRangoMode.g:10297:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10301:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10302:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10302:2: ( ruleTarget )
            // InternalRangoMode.g:10303:3: ruleTarget
            {
             before(grammarAccess.getTeleporterAccess().getAffectsTargetEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTeleporterAccess().getAffectsTargetEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teleporter__AffectsAssignment_5_1"


    // $ANTLR start "rule__FixedLayout__SpawnsAssignment_2"
    // InternalRangoMode.g:10312:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleEnemySpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10316:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10317:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10317:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10318:3: ruleEnemySpawn
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsEnemySpawnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnemySpawn();

            state._fsp--;

             after(grammarAccess.getFixedLayoutAccess().getSpawnsEnemySpawnParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FixedLayout__SpawnsAssignment_2"


    // $ANTLR start "rule__WaveSchedule__LoopAssignment_1_0"
    // InternalRangoMode.g:10327:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10331:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10332:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10332:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10333:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10334:3: ( 'looping' )
            // InternalRangoMode.g:10335:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 

            }

             after(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__LoopAssignment_1_0"


    // $ANTLR start "rule__WaveSchedule__EscalationAssignment_1_1_2"
    // InternalRangoMode.g:10346:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10350:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10351:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10351:2: ( RULE_INT )
            // InternalRangoMode.g:10352:3: RULE_INT
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationINTTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWaveScheduleAccess().getEscalationINTTerminalRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__EscalationAssignment_1_1_2"


    // $ANTLR start "rule__WaveSchedule__WavesAssignment_3"
    // InternalRangoMode.g:10361:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10365:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10366:2: ( ruleWave )
            {
            // InternalRangoMode.g:10366:2: ( ruleWave )
            // InternalRangoMode.g:10367:3: ruleWave
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesWaveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWave();

            state._fsp--;

             after(grammarAccess.getWaveScheduleAccess().getWavesWaveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaveSchedule__WavesAssignment_3"


    // $ANTLR start "rule__Wave__DelayAssignment_1_1"
    // InternalRangoMode.g:10376:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10380:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10381:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10381:2: ( ruleDecimal )
            // InternalRangoMode.g:10382:3: ruleDecimal
            {
             before(grammarAccess.getWaveAccess().getDelayDecimalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getWaveAccess().getDelayDecimalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__DelayAssignment_1_1"


    // $ANTLR start "rule__Wave__SpawnsAssignment_3"
    // InternalRangoMode.g:10391:1: rule__Wave__SpawnsAssignment_3 : ( ruleEnemySpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10395:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10396:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10396:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10397:3: ruleEnemySpawn
            {
             before(grammarAccess.getWaveAccess().getSpawnsEnemySpawnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnemySpawn();

            state._fsp--;

             after(grammarAccess.getWaveAccess().getSpawnsEnemySpawnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wave__SpawnsAssignment_3"


    // $ANTLR start "rule__EnemySpawn__CountAssignment_0_0"
    // InternalRangoMode.g:10406:1: rule__EnemySpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10410:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10411:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10411:2: ( RULE_INT )
            // InternalRangoMode.g:10412:3: RULE_INT
            {
             before(grammarAccess.getEnemySpawnAccess().getCountINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getCountINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__CountAssignment_0_0"


    // $ANTLR start "rule__EnemySpawn__TypeAssignment_1"
    // InternalRangoMode.g:10421:1: rule__EnemySpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnemySpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10425:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10426:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10426:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10427:3: ( RULE_ID )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10428:3: ( RULE_ID )
            // InternalRangoMode.g:10429:4: RULE_ID
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__TypeAssignment_1"


    // $ANTLR start "rule__EnemySpawn__SizeAssignment_3"
    // InternalRangoMode.g:10440:1: rule__EnemySpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10444:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10445:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10445:2: ( RULE_INT )
            // InternalRangoMode.g:10446:3: RULE_INT
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnemySpawnAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__SizeAssignment_3"


    // $ANTLR start "rule__EnemySpawn__DirectionAssignment_5_1"
    // InternalRangoMode.g:10455:1: rule__EnemySpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__EnemySpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10459:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10460:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10460:2: ( ruleDirection )
            // InternalRangoMode.g:10461:3: ruleDirection
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getEnemySpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemySpawn__DirectionAssignment_5_1"


    // $ANTLR start "rule__Drops__DropsAssignment_2"
    // InternalRangoMode.g:10470:1: rule__Drops__DropsAssignment_2 : ( ruleDropTable ) ;
    public final void rule__Drops__DropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10474:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10475:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10475:2: ( ruleDropTable )
            // InternalRangoMode.g:10476:3: ruleDropTable
            {
             before(grammarAccess.getDropsAccess().getDropsDropTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDropTable();

            state._fsp--;

             after(grammarAccess.getDropsAccess().getDropsDropTableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drops__DropsAssignment_2"


    // $ANTLR start "rule__DropTable__EnemyTypeAssignment_0"
    // InternalRangoMode.g:10485:1: rule__DropTable__EnemyTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DropTable__EnemyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10489:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10490:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10490:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10491:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 
            // InternalRangoMode.g:10492:3: ( RULE_ID )
            // InternalRangoMode.g:10493:4: RULE_ID
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__EnemyTypeAssignment_0"


    // $ANTLR start "rule__DropTable__ChanceAssignment_1"
    // InternalRangoMode.g:10504:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10508:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10509:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10509:2: ( ruleDecimal )
            // InternalRangoMode.g:10510:3: ruleDecimal
            {
             before(grammarAccess.getDropTableAccess().getChanceDecimalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDropTableAccess().getChanceDecimalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__ChanceAssignment_1"


    // $ANTLR start "rule__DropTable__EntriesAssignment_4"
    // InternalRangoMode.g:10519:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10523:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10524:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10524:2: ( ruleDrop )
            // InternalRangoMode.g:10525:3: ruleDrop
            {
             before(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDrop();

            state._fsp--;

             after(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__EntriesAssignment_4"


    // $ANTLR start "rule__DropTable__EntriesAssignment_5_1"
    // InternalRangoMode.g:10534:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10538:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10539:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10539:2: ( ruleDrop )
            // InternalRangoMode.g:10540:3: ruleDrop
            {
             before(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDrop();

            state._fsp--;

             after(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTable__EntriesAssignment_5_1"


    // $ANTLR start "rule__Drop__PowerUpAssignment_0"
    // InternalRangoMode.g:10549:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10553:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10554:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10554:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10555:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:10556:3: ( RULE_ID )
            // InternalRangoMode.g:10557:4: RULE_ID
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getPowerUpPowerUpIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__PowerUpAssignment_0"


    // $ANTLR start "rule__Drop__WeightAssignment_1_1"
    // InternalRangoMode.g:10568:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10572:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10573:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10573:2: ( RULE_INT )
            // InternalRangoMode.g:10574:3: RULE_INT
            {
             before(grammarAccess.getDropAccess().getWeightINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getWeightINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drop__WeightAssignment_1_1"


    // $ANTLR start "rule__EndConditions__WinAssignment_0_2"
    // InternalRangoMode.g:10583:1: rule__EndConditions__WinAssignment_0_2 : ( ruleWinCondition ) ;
    public final void rule__EndConditions__WinAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10587:1: ( ( ruleWinCondition ) )
            // InternalRangoMode.g:10588:2: ( ruleWinCondition )
            {
            // InternalRangoMode.g:10588:2: ( ruleWinCondition )
            // InternalRangoMode.g:10589:3: ruleWinCondition
            {
             before(grammarAccess.getEndConditionsAccess().getWinWinConditionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionsAccess().getWinWinConditionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__WinAssignment_0_2"


    // $ANTLR start "rule__EndConditions__WinAssignment_0_3_1"
    // InternalRangoMode.g:10598:1: rule__EndConditions__WinAssignment_0_3_1 : ( ruleWinCondition ) ;
    public final void rule__EndConditions__WinAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10602:1: ( ( ruleWinCondition ) )
            // InternalRangoMode.g:10603:2: ( ruleWinCondition )
            {
            // InternalRangoMode.g:10603:2: ( ruleWinCondition )
            // InternalRangoMode.g:10604:3: ruleWinCondition
            {
             before(grammarAccess.getEndConditionsAccess().getWinWinConditionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWinCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionsAccess().getWinWinConditionParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__WinAssignment_0_3_1"


    // $ANTLR start "rule__EndConditions__LoseAssignment_3"
    // InternalRangoMode.g:10613:1: rule__EndConditions__LoseAssignment_3 : ( ruleLoseCondition ) ;
    public final void rule__EndConditions__LoseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10617:1: ( ( ruleLoseCondition ) )
            // InternalRangoMode.g:10618:2: ( ruleLoseCondition )
            {
            // InternalRangoMode.g:10618:2: ( ruleLoseCondition )
            // InternalRangoMode.g:10619:3: ruleLoseCondition
            {
             before(grammarAccess.getEndConditionsAccess().getLoseLoseConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLoseCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionsAccess().getLoseLoseConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__LoseAssignment_3"


    // $ANTLR start "rule__EndConditions__LoseAssignment_4_1"
    // InternalRangoMode.g:10628:1: rule__EndConditions__LoseAssignment_4_1 : ( ruleLoseCondition ) ;
    public final void rule__EndConditions__LoseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10632:1: ( ( ruleLoseCondition ) )
            // InternalRangoMode.g:10633:2: ( ruleLoseCondition )
            {
            // InternalRangoMode.g:10633:2: ( ruleLoseCondition )
            // InternalRangoMode.g:10634:3: ruleLoseCondition
            {
             before(grammarAccess.getEndConditionsAccess().getLoseLoseConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoseCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionsAccess().getLoseLoseConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndConditions__LoseAssignment_4_1"


    // $ANTLR start "rule__TimeSurvived__SecondsAssignment_2"
    // InternalRangoMode.g:10643:1: rule__TimeSurvived__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeSurvived__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10647:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10648:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10648:2: ( ruleDecimal )
            // InternalRangoMode.g:10649:3: ruleDecimal
            {
             before(grammarAccess.getTimeSurvivedAccess().getSecondsDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getTimeSurvivedAccess().getSecondsDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSurvived__SecondsAssignment_2"


    // $ANTLR start "rule__WavesSurvived__CountAssignment_0"
    // InternalRangoMode.g:10658:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10662:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10663:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10663:2: ( RULE_INT )
            // InternalRangoMode.g:10664:3: RULE_INT
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWavesSurvivedAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WavesSurvived__CountAssignment_0"


    // $ANTLR start "rule__TimeLimit__SecondsAssignment_2"
    // InternalRangoMode.g:10673:1: rule__TimeLimit__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeLimit__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10677:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10678:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10678:2: ( ruleDecimal )
            // InternalRangoMode.g:10679:3: ruleDecimal
            {
             before(grammarAccess.getTimeLimitAccess().getSecondsDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getTimeLimitAccess().getSecondsDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLimit__SecondsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2020000044400040L,0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2020000044400002L,0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000100FC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0009C04000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1D80004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000041L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000028000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000010400000L,0x0000000000049000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000049000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000008000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0100000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000010L,0x0000000280000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1D80004000000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x8000004000000002L});

}
