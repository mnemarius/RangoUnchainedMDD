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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'easy'", "'medium'", "'hard'", "'enemy.speed'", "'enemy.points'", "'player.health'", "'player.speed'", "'drop.chance'", "'wave.delay'", "'everything'", "'enemies'", "'player'", "'left'", "'right'", "'edition'", "'difficulty'", "'{'", "'}'", "'*'", "'enemy'", "'on'", "'pop'", "':'", "'contact'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'poison'", "'every'", "'powerup'", "'gives'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'lose'", "'when'", "'description'", "'gravity'", "'win'", "'or'", "'level'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'looping'"
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
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

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


    // $ANTLR start "entryRuleEndCondition"
    // InternalRangoMode.g:862:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:863:1: ( ruleEndCondition EOF )
            // InternalRangoMode.g:864:1: ruleEndCondition EOF
            {
             before(grammarAccess.getEndConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionRule()); 
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
    // $ANTLR end "entryRuleEndCondition"


    // $ANTLR start "ruleEndCondition"
    // InternalRangoMode.g:871:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:875:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalRangoMode.g:876:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalRangoMode.g:876:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalRangoMode.g:877:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:878:3: ( rule__EndCondition__Alternatives )
            // InternalRangoMode.g:878:4: rule__EndCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndCondition"


    // $ANTLR start "entryRuleCleared"
    // InternalRangoMode.g:887:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:888:1: ( ruleCleared EOF )
            // InternalRangoMode.g:889:1: ruleCleared EOF
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
    // InternalRangoMode.g:896:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:900:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:901:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:901:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:902:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:903:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:903:4: rule__Cleared__Group__0
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


    // $ANTLR start "entryRuleTimeReached"
    // InternalRangoMode.g:912:1: entryRuleTimeReached : ruleTimeReached EOF ;
    public final void entryRuleTimeReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:913:1: ( ruleTimeReached EOF )
            // InternalRangoMode.g:914:1: ruleTimeReached EOF
            {
             before(grammarAccess.getTimeReachedRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeReached();

            state._fsp--;

             after(grammarAccess.getTimeReachedRule()); 
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
    // $ANTLR end "entryRuleTimeReached"


    // $ANTLR start "ruleTimeReached"
    // InternalRangoMode.g:921:1: ruleTimeReached : ( ( rule__TimeReached__Group__0 ) ) ;
    public final void ruleTimeReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:925:2: ( ( ( rule__TimeReached__Group__0 ) ) )
            // InternalRangoMode.g:926:2: ( ( rule__TimeReached__Group__0 ) )
            {
            // InternalRangoMode.g:926:2: ( ( rule__TimeReached__Group__0 ) )
            // InternalRangoMode.g:927:3: ( rule__TimeReached__Group__0 )
            {
             before(grammarAccess.getTimeReachedAccess().getGroup()); 
            // InternalRangoMode.g:928:3: ( rule__TimeReached__Group__0 )
            // InternalRangoMode.g:928:4: rule__TimeReached__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeReached__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeReachedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeReached"


    // $ANTLR start "entryRuleScoreReached"
    // InternalRangoMode.g:937:1: entryRuleScoreReached : ruleScoreReached EOF ;
    public final void entryRuleScoreReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:938:1: ( ruleScoreReached EOF )
            // InternalRangoMode.g:939:1: ruleScoreReached EOF
            {
             before(grammarAccess.getScoreReachedRule()); 
            pushFollow(FOLLOW_1);
            ruleScoreReached();

            state._fsp--;

             after(grammarAccess.getScoreReachedRule()); 
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
    // $ANTLR end "entryRuleScoreReached"


    // $ANTLR start "ruleScoreReached"
    // InternalRangoMode.g:946:1: ruleScoreReached : ( ( rule__ScoreReached__Group__0 ) ) ;
    public final void ruleScoreReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:950:2: ( ( ( rule__ScoreReached__Group__0 ) ) )
            // InternalRangoMode.g:951:2: ( ( rule__ScoreReached__Group__0 ) )
            {
            // InternalRangoMode.g:951:2: ( ( rule__ScoreReached__Group__0 ) )
            // InternalRangoMode.g:952:3: ( rule__ScoreReached__Group__0 )
            {
             before(grammarAccess.getScoreReachedAccess().getGroup()); 
            // InternalRangoMode.g:953:3: ( rule__ScoreReached__Group__0 )
            // InternalRangoMode.g:953:4: rule__ScoreReached__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScoreReached__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreReachedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScoreReached"


    // $ANTLR start "entryRuleEnemiesPopped"
    // InternalRangoMode.g:962:1: entryRuleEnemiesPopped : ruleEnemiesPopped EOF ;
    public final void entryRuleEnemiesPopped() throws RecognitionException {
        try {
            // InternalRangoMode.g:963:1: ( ruleEnemiesPopped EOF )
            // InternalRangoMode.g:964:1: ruleEnemiesPopped EOF
            {
             before(grammarAccess.getEnemiesPoppedRule()); 
            pushFollow(FOLLOW_1);
            ruleEnemiesPopped();

            state._fsp--;

             after(grammarAccess.getEnemiesPoppedRule()); 
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
    // $ANTLR end "entryRuleEnemiesPopped"


    // $ANTLR start "ruleEnemiesPopped"
    // InternalRangoMode.g:971:1: ruleEnemiesPopped : ( ( rule__EnemiesPopped__Group__0 ) ) ;
    public final void ruleEnemiesPopped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:975:2: ( ( ( rule__EnemiesPopped__Group__0 ) ) )
            // InternalRangoMode.g:976:2: ( ( rule__EnemiesPopped__Group__0 ) )
            {
            // InternalRangoMode.g:976:2: ( ( rule__EnemiesPopped__Group__0 ) )
            // InternalRangoMode.g:977:3: ( rule__EnemiesPopped__Group__0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getGroup()); 
            // InternalRangoMode.g:978:3: ( rule__EnemiesPopped__Group__0 )
            // InternalRangoMode.g:978:4: rule__EnemiesPopped__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesPopped__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnemiesPoppedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnemiesPopped"


    // $ANTLR start "entryRuleWavesSurvived"
    // InternalRangoMode.g:987:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:988:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:989:1: ruleWavesSurvived EOF
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
    // InternalRangoMode.g:996:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1000:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:1001:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:1001:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:1002:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:1003:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:1003:4: rule__WavesSurvived__Group__0
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


    // $ANTLR start "entryRuleHealthDepleted"
    // InternalRangoMode.g:1012:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:1013:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:1014:1: ruleHealthDepleted EOF
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
    // InternalRangoMode.g:1021:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1025:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:1026:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:1026:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:1027:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:1028:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:1028:4: rule__HealthDepleted__Group__0
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


    // $ANTLR start "entryRuleEnemiesAlive"
    // InternalRangoMode.g:1037:1: entryRuleEnemiesAlive : ruleEnemiesAlive EOF ;
    public final void entryRuleEnemiesAlive() throws RecognitionException {
        try {
            // InternalRangoMode.g:1038:1: ( ruleEnemiesAlive EOF )
            // InternalRangoMode.g:1039:1: ruleEnemiesAlive EOF
            {
             before(grammarAccess.getEnemiesAliveRule()); 
            pushFollow(FOLLOW_1);
            ruleEnemiesAlive();

            state._fsp--;

             after(grammarAccess.getEnemiesAliveRule()); 
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
    // $ANTLR end "entryRuleEnemiesAlive"


    // $ANTLR start "ruleEnemiesAlive"
    // InternalRangoMode.g:1046:1: ruleEnemiesAlive : ( ( rule__EnemiesAlive__Group__0 ) ) ;
    public final void ruleEnemiesAlive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1050:2: ( ( ( rule__EnemiesAlive__Group__0 ) ) )
            // InternalRangoMode.g:1051:2: ( ( rule__EnemiesAlive__Group__0 ) )
            {
            // InternalRangoMode.g:1051:2: ( ( rule__EnemiesAlive__Group__0 ) )
            // InternalRangoMode.g:1052:3: ( rule__EnemiesAlive__Group__0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getGroup()); 
            // InternalRangoMode.g:1053:3: ( rule__EnemiesAlive__Group__0 )
            // InternalRangoMode.g:1053:4: rule__EnemiesAlive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesAlive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnemiesAliveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnemiesAlive"


    // $ANTLR start "entryRuleDecimal"
    // InternalRangoMode.g:1062:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:1063:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:1064:1: ruleDecimal EOF
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
    // InternalRangoMode.g:1071:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1075:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:1076:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:1076:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:1077:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:1078:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:1078:4: rule__Decimal__Group__0
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
    // InternalRangoMode.g:1087:1: ruleDifficultyTier : ( ( rule__DifficultyTier__Alternatives ) ) ;
    public final void ruleDifficultyTier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1091:1: ( ( ( rule__DifficultyTier__Alternatives ) ) )
            // InternalRangoMode.g:1092:2: ( ( rule__DifficultyTier__Alternatives ) )
            {
            // InternalRangoMode.g:1092:2: ( ( rule__DifficultyTier__Alternatives ) )
            // InternalRangoMode.g:1093:3: ( rule__DifficultyTier__Alternatives )
            {
             before(grammarAccess.getDifficultyTierAccess().getAlternatives()); 
            // InternalRangoMode.g:1094:3: ( rule__DifficultyTier__Alternatives )
            // InternalRangoMode.g:1094:4: rule__DifficultyTier__Alternatives
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
    // InternalRangoMode.g:1103:1: ruleModifierTarget : ( ( rule__ModifierTarget__Alternatives ) ) ;
    public final void ruleModifierTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1107:1: ( ( ( rule__ModifierTarget__Alternatives ) ) )
            // InternalRangoMode.g:1108:2: ( ( rule__ModifierTarget__Alternatives ) )
            {
            // InternalRangoMode.g:1108:2: ( ( rule__ModifierTarget__Alternatives ) )
            // InternalRangoMode.g:1109:3: ( rule__ModifierTarget__Alternatives )
            {
             before(grammarAccess.getModifierTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1110:3: ( rule__ModifierTarget__Alternatives )
            // InternalRangoMode.g:1110:4: rule__ModifierTarget__Alternatives
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
    // InternalRangoMode.g:1119:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1123:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1124:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1124:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1125:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1126:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1126:4: rule__Target__Alternatives
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
    // InternalRangoMode.g:1135:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1139:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1140:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1140:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1141:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1142:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1142:4: rule__Direction__Alternatives
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
    // InternalRangoMode.g:1150:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__DifficultiesAssignment_3_4 ) ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1154:1: ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__DifficultiesAssignment_3_4 ) ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) )
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
            case 93:
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
                    // InternalRangoMode.g:1155:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1155:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1156:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1157:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    // InternalRangoMode.g:1157:4: rule__Edition__EnemyTypesAssignment_3_0
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
                    // InternalRangoMode.g:1161:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1161:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1162:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1163:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1163:4: rule__Edition__PowerUpsAssignment_3_1
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
                    // InternalRangoMode.g:1167:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1167:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    // InternalRangoMode.g:1168:3: ( rule__Edition__PlayersAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_2()); 
                    // InternalRangoMode.g:1169:3: ( rule__Edition__PlayersAssignment_3_2 )
                    // InternalRangoMode.g:1169:4: rule__Edition__PlayersAssignment_3_2
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
                    // InternalRangoMode.g:1173:2: ( ruleDrops )
                    {
                    // InternalRangoMode.g:1173:2: ( ruleDrops )
                    // InternalRangoMode.g:1174:3: ruleDrops
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
                    // InternalRangoMode.g:1179:2: ( ( rule__Edition__DifficultiesAssignment_3_4 ) )
                    {
                    // InternalRangoMode.g:1179:2: ( ( rule__Edition__DifficultiesAssignment_3_4 ) )
                    // InternalRangoMode.g:1180:3: ( rule__Edition__DifficultiesAssignment_3_4 )
                    {
                     before(grammarAccess.getEditionAccess().getDifficultiesAssignment_3_4()); 
                    // InternalRangoMode.g:1181:3: ( rule__Edition__DifficultiesAssignment_3_4 )
                    // InternalRangoMode.g:1181:4: rule__Edition__DifficultiesAssignment_3_4
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
                    // InternalRangoMode.g:1185:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    {
                    // InternalRangoMode.g:1185:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    // InternalRangoMode.g:1186:3: ( rule__Edition__ModesAssignment_3_5 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_5()); 
                    // InternalRangoMode.g:1187:3: ( rule__Edition__ModesAssignment_3_5 )
                    // InternalRangoMode.g:1187:4: rule__Edition__ModesAssignment_3_5
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
    // InternalRangoMode.g:1195:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1199:1: ( ( ruleVanish ) | ( ruleSplit ) )
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
                    // InternalRangoMode.g:1200:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1200:2: ( ruleVanish )
                    // InternalRangoMode.g:1201:3: ruleVanish
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
                    // InternalRangoMode.g:1206:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1206:2: ( ruleSplit )
                    // InternalRangoMode.g:1207:3: ruleSplit
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
    // InternalRangoMode.g:1216:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1220:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
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
                    // InternalRangoMode.g:1221:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1221:2: ( ruleDamage )
                    // InternalRangoMode.g:1222:3: ruleDamage
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
                    // InternalRangoMode.g:1227:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1227:2: ( ruleHeal )
                    // InternalRangoMode.g:1228:3: ruleHeal
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
                    // InternalRangoMode.g:1233:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1233:2: ( ruleShield )
                    // InternalRangoMode.g:1234:3: ruleShield
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
                    // InternalRangoMode.g:1239:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1239:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1240:3: ruleSpeedChange
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
                    // InternalRangoMode.g:1245:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1245:2: ( rulePoison )
                    // InternalRangoMode.g:1246:3: rulePoison
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


    // $ANTLR start "rule__GameMode__Alternatives_8"
    // InternalRangoMode.g:1255:1: rule__GameMode__Alternatives_8 : ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) );
    public final void rule__GameMode__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1259:1: ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==74) ) {
                alt5=1;
            }
            else if ( (LA5_0==68) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1260:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    {
                    // InternalRangoMode.g:1260:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    // InternalRangoMode.g:1261:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_0()); 
                    // InternalRangoMode.g:1262:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    // InternalRangoMode.g:1262:4: rule__GameMode__LevelsAssignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__LevelsAssignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1266:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    {
                    // InternalRangoMode.g:1266:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    // InternalRangoMode.g:1267:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    {
                    // InternalRangoMode.g:1267:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) )
                    // InternalRangoMode.g:1268:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1269:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    // InternalRangoMode.g:1269:5: rule__GameMode__LevelsAssignment_8_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__GameMode__LevelsAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 

                    }

                    // InternalRangoMode.g:1272:3: ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    // InternalRangoMode.g:1273:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1274:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==68) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRangoMode.g:1274:5: rule__GameMode__LevelsAssignment_8_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__GameMode__LevelsAssignment_8_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 

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
    // $ANTLR end "rule__GameMode__Alternatives_8"


    // $ANTLR start "rule__Obstacle__Alternatives"
    // InternalRangoMode.g:1283:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1287:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt6=1;
                }
                break;
            case 83:
                {
                alt6=2;
                }
                break;
            case 86:
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
                    // InternalRangoMode.g:1288:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1288:2: ( ruleBlock )
                    // InternalRangoMode.g:1289:3: ruleBlock
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
                    // InternalRangoMode.g:1294:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1294:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1295:3: ruleJumpPad
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
                    // InternalRangoMode.g:1300:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1300:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1301:3: ruleTeleporter
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
    // InternalRangoMode.g:1310:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1314:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==87) ) {
                alt7=1;
            }
            else if ( (LA7_0==88) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1315:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1315:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1316:3: ruleFixedLayout
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
                    // InternalRangoMode.g:1321:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1321:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1322:3: ruleWaveSchedule
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


    // $ANTLR start "rule__EndCondition__Alternatives"
    // InternalRangoMode.g:1331:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1335:1: ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:1336:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1336:2: ( ruleCleared )
                    // InternalRangoMode.g:1337:3: ruleCleared
                    {
                     before(grammarAccess.getEndConditionAccess().getClearedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCleared();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getClearedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1342:2: ( ruleTimeReached )
                    {
                    // InternalRangoMode.g:1342:2: ( ruleTimeReached )
                    // InternalRangoMode.g:1343:3: ruleTimeReached
                    {
                     before(grammarAccess.getEndConditionAccess().getTimeReachedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeReached();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getTimeReachedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1348:2: ( ruleScoreReached )
                    {
                    // InternalRangoMode.g:1348:2: ( ruleScoreReached )
                    // InternalRangoMode.g:1349:3: ruleScoreReached
                    {
                     before(grammarAccess.getEndConditionAccess().getScoreReachedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScoreReached();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getScoreReachedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1354:2: ( ruleEnemiesPopped )
                    {
                    // InternalRangoMode.g:1354:2: ( ruleEnemiesPopped )
                    // InternalRangoMode.g:1355:3: ruleEnemiesPopped
                    {
                     before(grammarAccess.getEndConditionAccess().getEnemiesPoppedParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnemiesPopped();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getEnemiesPoppedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1360:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1360:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1361:3: ruleWavesSurvived
                    {
                     before(grammarAccess.getEndConditionAccess().getWavesSurvivedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWavesSurvived();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getWavesSurvivedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:1366:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1366:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1367:3: ruleHealthDepleted
                    {
                     before(grammarAccess.getEndConditionAccess().getHealthDepletedParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHealthDepleted();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getHealthDepletedParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRangoMode.g:1372:2: ( ruleEnemiesAlive )
                    {
                    // InternalRangoMode.g:1372:2: ( ruleEnemiesAlive )
                    // InternalRangoMode.g:1373:3: ruleEnemiesAlive
                    {
                     before(grammarAccess.getEndConditionAccess().getEnemiesAliveParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEnemiesAlive();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getEnemiesAliveParserRuleCall_6()); 

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
    // $ANTLR end "rule__EndCondition__Alternatives"


    // $ANTLR start "rule__DifficultyTier__Alternatives"
    // InternalRangoMode.g:1382:1: rule__DifficultyTier__Alternatives : ( ( ( 'easy' ) ) | ( ( 'medium' ) ) | ( ( 'hard' ) ) );
    public final void rule__DifficultyTier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1386:1: ( ( ( 'easy' ) ) | ( ( 'medium' ) ) | ( ( 'hard' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:1387:2: ( ( 'easy' ) )
                    {
                    // InternalRangoMode.g:1387:2: ( ( 'easy' ) )
                    // InternalRangoMode.g:1388:3: ( 'easy' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1389:3: ( 'easy' )
                    // InternalRangoMode.g:1389:4: 'easy'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1393:2: ( ( 'medium' ) )
                    {
                    // InternalRangoMode.g:1393:2: ( ( 'medium' ) )
                    // InternalRangoMode.g:1394:3: ( 'medium' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1395:3: ( 'medium' )
                    // InternalRangoMode.g:1395:4: 'medium'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1399:2: ( ( 'hard' ) )
                    {
                    // InternalRangoMode.g:1399:2: ( ( 'hard' ) )
                    // InternalRangoMode.g:1400:3: ( 'hard' )
                    {
                     before(grammarAccess.getDifficultyTierAccess().getHARDEnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1401:3: ( 'hard' )
                    // InternalRangoMode.g:1401:4: 'hard'
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
    // InternalRangoMode.g:1409:1: rule__ModifierTarget__Alternatives : ( ( ( 'enemy.speed' ) ) | ( ( 'enemy.points' ) ) | ( ( 'player.health' ) ) | ( ( 'player.speed' ) ) | ( ( 'drop.chance' ) ) | ( ( 'wave.delay' ) ) );
    public final void rule__ModifierTarget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1413:1: ( ( ( 'enemy.speed' ) ) | ( ( 'enemy.points' ) ) | ( ( 'player.health' ) ) | ( ( 'player.speed' ) ) | ( ( 'drop.chance' ) ) | ( ( 'wave.delay' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            case 18:
                {
                alt10=5;
                }
                break;
            case 19:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRangoMode.g:1414:2: ( ( 'enemy.speed' ) )
                    {
                    // InternalRangoMode.g:1414:2: ( ( 'enemy.speed' ) )
                    // InternalRangoMode.g:1415:3: ( 'enemy.speed' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1416:3: ( 'enemy.speed' )
                    // InternalRangoMode.g:1416:4: 'enemy.speed'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1420:2: ( ( 'enemy.points' ) )
                    {
                    // InternalRangoMode.g:1420:2: ( ( 'enemy.points' ) )
                    // InternalRangoMode.g:1421:3: ( 'enemy.points' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1422:3: ( 'enemy.points' )
                    // InternalRangoMode.g:1422:4: 'enemy.points'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1426:2: ( ( 'player.health' ) )
                    {
                    // InternalRangoMode.g:1426:2: ( ( 'player.health' ) )
                    // InternalRangoMode.g:1427:3: ( 'player.health' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1428:3: ( 'player.health' )
                    // InternalRangoMode.g:1428:4: 'player.health'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1432:2: ( ( 'player.speed' ) )
                    {
                    // InternalRangoMode.g:1432:2: ( ( 'player.speed' ) )
                    // InternalRangoMode.g:1433:3: ( 'player.speed' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3()); 
                    // InternalRangoMode.g:1434:3: ( 'player.speed' )
                    // InternalRangoMode.g:1434:4: 'player.speed'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1438:2: ( ( 'drop.chance' ) )
                    {
                    // InternalRangoMode.g:1438:2: ( ( 'drop.chance' ) )
                    // InternalRangoMode.g:1439:3: ( 'drop.chance' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4()); 
                    // InternalRangoMode.g:1440:3: ( 'drop.chance' )
                    // InternalRangoMode.g:1440:4: 'drop.chance'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:1444:2: ( ( 'wave.delay' ) )
                    {
                    // InternalRangoMode.g:1444:2: ( ( 'wave.delay' ) )
                    // InternalRangoMode.g:1445:3: ( 'wave.delay' )
                    {
                     before(grammarAccess.getModifierTargetAccess().getWAVE_DELAYEnumLiteralDeclaration_5()); 
                    // InternalRangoMode.g:1446:3: ( 'wave.delay' )
                    // InternalRangoMode.g:1446:4: 'wave.delay'
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
    // InternalRangoMode.g:1454:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1458:1: ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRangoMode.g:1459:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1459:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1460:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1461:3: ( 'everything' )
                    // InternalRangoMode.g:1461:4: 'everything'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1465:2: ( ( 'enemies' ) )
                    {
                    // InternalRangoMode.g:1465:2: ( ( 'enemies' ) )
                    // InternalRangoMode.g:1466:3: ( 'enemies' )
                    {
                     before(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1467:3: ( 'enemies' )
                    // InternalRangoMode.g:1467:4: 'enemies'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1471:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1471:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1472:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1473:3: ( 'player' )
                    // InternalRangoMode.g:1473:4: 'player'
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
    // InternalRangoMode.g:1481:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1485:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRangoMode.g:1486:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1486:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1487:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1488:3: ( 'left' )
                    // InternalRangoMode.g:1488:4: 'left'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1492:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1492:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1493:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1494:3: ( 'right' )
                    // InternalRangoMode.g:1494:4: 'right'
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
    // InternalRangoMode.g:1502:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1506:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1507:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
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
    // InternalRangoMode.g:1514:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1518:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1519:1: ( 'edition' )
            {
            // InternalRangoMode.g:1519:1: ( 'edition' )
            // InternalRangoMode.g:1520:2: 'edition'
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
    // InternalRangoMode.g:1529:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1533:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1534:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
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
    // InternalRangoMode.g:1541:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1545:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1546:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1546:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1547:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1548:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1548:3: rule__Edition__NameAssignment_1
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
    // InternalRangoMode.g:1556:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1560:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1561:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
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
    // InternalRangoMode.g:1568:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1572:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1573:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1573:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1574:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1575:2: ( rule__Edition__TitleAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRangoMode.g:1575:3: rule__Edition__TitleAssignment_2
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
    // InternalRangoMode.g:1583:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1587:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1588:2: rule__Edition__Group__3__Impl
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
    // InternalRangoMode.g:1594:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1598:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1599:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1599:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1600:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1601:2: ( rule__Edition__Alternatives_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||LA14_0==26||LA14_0==30||LA14_0==53||LA14_0==61||LA14_0==93) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRangoMode.g:1601:3: rule__Edition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Edition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRangoMode.g:1610:1: rule__Difficulty__Group__0 : rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1 ;
    public final void rule__Difficulty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1614:1: ( rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1 )
            // InternalRangoMode.g:1615:2: rule__Difficulty__Group__0__Impl rule__Difficulty__Group__1
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
    // InternalRangoMode.g:1622:1: rule__Difficulty__Group__0__Impl : ( 'difficulty' ) ;
    public final void rule__Difficulty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1626:1: ( ( 'difficulty' ) )
            // InternalRangoMode.g:1627:1: ( 'difficulty' )
            {
            // InternalRangoMode.g:1627:1: ( 'difficulty' )
            // InternalRangoMode.g:1628:2: 'difficulty'
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
    // InternalRangoMode.g:1637:1: rule__Difficulty__Group__1 : rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2 ;
    public final void rule__Difficulty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1641:1: ( rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2 )
            // InternalRangoMode.g:1642:2: rule__Difficulty__Group__1__Impl rule__Difficulty__Group__2
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
    // InternalRangoMode.g:1649:1: rule__Difficulty__Group__1__Impl : ( ( rule__Difficulty__TierAssignment_1 ) ) ;
    public final void rule__Difficulty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1653:1: ( ( ( rule__Difficulty__TierAssignment_1 ) ) )
            // InternalRangoMode.g:1654:1: ( ( rule__Difficulty__TierAssignment_1 ) )
            {
            // InternalRangoMode.g:1654:1: ( ( rule__Difficulty__TierAssignment_1 ) )
            // InternalRangoMode.g:1655:2: ( rule__Difficulty__TierAssignment_1 )
            {
             before(grammarAccess.getDifficultyAccess().getTierAssignment_1()); 
            // InternalRangoMode.g:1656:2: ( rule__Difficulty__TierAssignment_1 )
            // InternalRangoMode.g:1656:3: rule__Difficulty__TierAssignment_1
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
    // InternalRangoMode.g:1664:1: rule__Difficulty__Group__2 : rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3 ;
    public final void rule__Difficulty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1668:1: ( rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3 )
            // InternalRangoMode.g:1669:2: rule__Difficulty__Group__2__Impl rule__Difficulty__Group__3
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
    // InternalRangoMode.g:1676:1: rule__Difficulty__Group__2__Impl : ( '{' ) ;
    public final void rule__Difficulty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1680:1: ( ( '{' ) )
            // InternalRangoMode.g:1681:1: ( '{' )
            {
            // InternalRangoMode.g:1681:1: ( '{' )
            // InternalRangoMode.g:1682:2: '{'
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
    // InternalRangoMode.g:1691:1: rule__Difficulty__Group__3 : rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4 ;
    public final void rule__Difficulty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1695:1: ( rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4 )
            // InternalRangoMode.g:1696:2: rule__Difficulty__Group__3__Impl rule__Difficulty__Group__4
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
    // InternalRangoMode.g:1703:1: rule__Difficulty__Group__3__Impl : ( ( rule__Difficulty__ModifiersAssignment_3 )* ) ;
    public final void rule__Difficulty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1707:1: ( ( ( rule__Difficulty__ModifiersAssignment_3 )* ) )
            // InternalRangoMode.g:1708:1: ( ( rule__Difficulty__ModifiersAssignment_3 )* )
            {
            // InternalRangoMode.g:1708:1: ( ( rule__Difficulty__ModifiersAssignment_3 )* )
            // InternalRangoMode.g:1709:2: ( rule__Difficulty__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getDifficultyAccess().getModifiersAssignment_3()); 
            // InternalRangoMode.g:1710:2: ( rule__Difficulty__ModifiersAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=14 && LA15_0<=19)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRangoMode.g:1710:3: rule__Difficulty__ModifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Difficulty__ModifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRangoMode.g:1718:1: rule__Difficulty__Group__4 : rule__Difficulty__Group__4__Impl ;
    public final void rule__Difficulty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1722:1: ( rule__Difficulty__Group__4__Impl )
            // InternalRangoMode.g:1723:2: rule__Difficulty__Group__4__Impl
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
    // InternalRangoMode.g:1729:1: rule__Difficulty__Group__4__Impl : ( '}' ) ;
    public final void rule__Difficulty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1733:1: ( ( '}' ) )
            // InternalRangoMode.g:1734:1: ( '}' )
            {
            // InternalRangoMode.g:1734:1: ( '}' )
            // InternalRangoMode.g:1735:2: '}'
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
    // InternalRangoMode.g:1745:1: rule__Modifier__Group__0 : rule__Modifier__Group__0__Impl rule__Modifier__Group__1 ;
    public final void rule__Modifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1749:1: ( rule__Modifier__Group__0__Impl rule__Modifier__Group__1 )
            // InternalRangoMode.g:1750:2: rule__Modifier__Group__0__Impl rule__Modifier__Group__1
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
    // InternalRangoMode.g:1757:1: rule__Modifier__Group__0__Impl : ( ( rule__Modifier__TargetAssignment_0 ) ) ;
    public final void rule__Modifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1761:1: ( ( ( rule__Modifier__TargetAssignment_0 ) ) )
            // InternalRangoMode.g:1762:1: ( ( rule__Modifier__TargetAssignment_0 ) )
            {
            // InternalRangoMode.g:1762:1: ( ( rule__Modifier__TargetAssignment_0 ) )
            // InternalRangoMode.g:1763:2: ( rule__Modifier__TargetAssignment_0 )
            {
             before(grammarAccess.getModifierAccess().getTargetAssignment_0()); 
            // InternalRangoMode.g:1764:2: ( rule__Modifier__TargetAssignment_0 )
            // InternalRangoMode.g:1764:3: rule__Modifier__TargetAssignment_0
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
    // InternalRangoMode.g:1772:1: rule__Modifier__Group__1 : rule__Modifier__Group__1__Impl rule__Modifier__Group__2 ;
    public final void rule__Modifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1776:1: ( rule__Modifier__Group__1__Impl rule__Modifier__Group__2 )
            // InternalRangoMode.g:1777:2: rule__Modifier__Group__1__Impl rule__Modifier__Group__2
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
    // InternalRangoMode.g:1784:1: rule__Modifier__Group__1__Impl : ( '*' ) ;
    public final void rule__Modifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1788:1: ( ( '*' ) )
            // InternalRangoMode.g:1789:1: ( '*' )
            {
            // InternalRangoMode.g:1789:1: ( '*' )
            // InternalRangoMode.g:1790:2: '*'
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
    // InternalRangoMode.g:1799:1: rule__Modifier__Group__2 : rule__Modifier__Group__2__Impl ;
    public final void rule__Modifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1803:1: ( rule__Modifier__Group__2__Impl )
            // InternalRangoMode.g:1804:2: rule__Modifier__Group__2__Impl
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
    // InternalRangoMode.g:1810:1: rule__Modifier__Group__2__Impl : ( ( rule__Modifier__FactorAssignment_2 ) ) ;
    public final void rule__Modifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1814:1: ( ( ( rule__Modifier__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:1815:1: ( ( rule__Modifier__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:1815:1: ( ( rule__Modifier__FactorAssignment_2 ) )
            // InternalRangoMode.g:1816:2: ( rule__Modifier__FactorAssignment_2 )
            {
             before(grammarAccess.getModifierAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:1817:2: ( rule__Modifier__FactorAssignment_2 )
            // InternalRangoMode.g:1817:3: rule__Modifier__FactorAssignment_2
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
    // InternalRangoMode.g:1826:1: rule__EnemyType__Group__0 : rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 ;
    public final void rule__EnemyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1830:1: ( rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 )
            // InternalRangoMode.g:1831:2: rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1
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
    // InternalRangoMode.g:1838:1: rule__EnemyType__Group__0__Impl : ( 'enemy' ) ;
    public final void rule__EnemyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1842:1: ( ( 'enemy' ) )
            // InternalRangoMode.g:1843:1: ( 'enemy' )
            {
            // InternalRangoMode.g:1843:1: ( 'enemy' )
            // InternalRangoMode.g:1844:2: 'enemy'
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
    // InternalRangoMode.g:1853:1: rule__EnemyType__Group__1 : rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 ;
    public final void rule__EnemyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1857:1: ( rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 )
            // InternalRangoMode.g:1858:2: rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2
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
    // InternalRangoMode.g:1865:1: rule__EnemyType__Group__1__Impl : ( ( rule__EnemyType__NameAssignment_1 ) ) ;
    public final void rule__EnemyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1869:1: ( ( ( rule__EnemyType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1870:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1870:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            // InternalRangoMode.g:1871:2: ( rule__EnemyType__NameAssignment_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1872:2: ( rule__EnemyType__NameAssignment_1 )
            // InternalRangoMode.g:1872:3: rule__EnemyType__NameAssignment_1
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
    // InternalRangoMode.g:1880:1: rule__EnemyType__Group__2 : rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 ;
    public final void rule__EnemyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1884:1: ( rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 )
            // InternalRangoMode.g:1885:2: rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3
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
    // InternalRangoMode.g:1892:1: rule__EnemyType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnemyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1896:1: ( ( '{' ) )
            // InternalRangoMode.g:1897:1: ( '{' )
            {
            // InternalRangoMode.g:1897:1: ( '{' )
            // InternalRangoMode.g:1898:2: '{'
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
    // InternalRangoMode.g:1907:1: rule__EnemyType__Group__3 : rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 ;
    public final void rule__EnemyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1911:1: ( rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 )
            // InternalRangoMode.g:1912:2: rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4
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
    // InternalRangoMode.g:1919:1: rule__EnemyType__Group__3__Impl : ( ( rule__EnemyType__UnorderedGroup_3 ) ) ;
    public final void rule__EnemyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1923:1: ( ( ( rule__EnemyType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1924:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1924:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1925:2: ( rule__EnemyType__UnorderedGroup_3 )
            {
             before(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1926:2: ( rule__EnemyType__UnorderedGroup_3 )
            // InternalRangoMode.g:1926:3: rule__EnemyType__UnorderedGroup_3
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
    // InternalRangoMode.g:1934:1: rule__EnemyType__Group__4 : rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 ;
    public final void rule__EnemyType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1938:1: ( rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 )
            // InternalRangoMode.g:1939:2: rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5
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
    // InternalRangoMode.g:1946:1: rule__EnemyType__Group__4__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1950:1: ( ( 'on' ) )
            // InternalRangoMode.g:1951:1: ( 'on' )
            {
            // InternalRangoMode.g:1951:1: ( 'on' )
            // InternalRangoMode.g:1952:2: 'on'
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
    // InternalRangoMode.g:1961:1: rule__EnemyType__Group__5 : rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 ;
    public final void rule__EnemyType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1965:1: ( rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 )
            // InternalRangoMode.g:1966:2: rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6
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
    // InternalRangoMode.g:1973:1: rule__EnemyType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__EnemyType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1977:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1978:1: ( 'pop' )
            {
            // InternalRangoMode.g:1978:1: ( 'pop' )
            // InternalRangoMode.g:1979:2: 'pop'
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
    // InternalRangoMode.g:1988:1: rule__EnemyType__Group__6 : rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 ;
    public final void rule__EnemyType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1992:1: ( rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 )
            // InternalRangoMode.g:1993:2: rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7
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
    // InternalRangoMode.g:2000:1: rule__EnemyType__Group__6__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2004:1: ( ( ':' ) )
            // InternalRangoMode.g:2005:1: ( ':' )
            {
            // InternalRangoMode.g:2005:1: ( ':' )
            // InternalRangoMode.g:2006:2: ':'
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
    // InternalRangoMode.g:2015:1: rule__EnemyType__Group__7 : rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 ;
    public final void rule__EnemyType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2019:1: ( rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 )
            // InternalRangoMode.g:2020:2: rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8
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
    // InternalRangoMode.g:2027:1: rule__EnemyType__Group__7__Impl : ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) ;
    public final void rule__EnemyType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2031:1: ( ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:2032:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:2032:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:2033:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:2034:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:2034:3: rule__EnemyType__SplitRuleAssignment_7
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
    // InternalRangoMode.g:2042:1: rule__EnemyType__Group__8 : rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 ;
    public final void rule__EnemyType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2046:1: ( rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 )
            // InternalRangoMode.g:2047:2: rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9
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
    // InternalRangoMode.g:2054:1: rule__EnemyType__Group__8__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2058:1: ( ( 'on' ) )
            // InternalRangoMode.g:2059:1: ( 'on' )
            {
            // InternalRangoMode.g:2059:1: ( 'on' )
            // InternalRangoMode.g:2060:2: 'on'
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
    // InternalRangoMode.g:2069:1: rule__EnemyType__Group__9 : rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 ;
    public final void rule__EnemyType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2073:1: ( rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 )
            // InternalRangoMode.g:2074:2: rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10
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
    // InternalRangoMode.g:2081:1: rule__EnemyType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__EnemyType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2085:1: ( ( 'contact' ) )
            // InternalRangoMode.g:2086:1: ( 'contact' )
            {
            // InternalRangoMode.g:2086:1: ( 'contact' )
            // InternalRangoMode.g:2087:2: 'contact'
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
    // InternalRangoMode.g:2096:1: rule__EnemyType__Group__10 : rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 ;
    public final void rule__EnemyType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2100:1: ( rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 )
            // InternalRangoMode.g:2101:2: rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11
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
    // InternalRangoMode.g:2108:1: rule__EnemyType__Group__10__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2112:1: ( ( ':' ) )
            // InternalRangoMode.g:2113:1: ( ':' )
            {
            // InternalRangoMode.g:2113:1: ( ':' )
            // InternalRangoMode.g:2114:2: ':'
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
    // InternalRangoMode.g:2123:1: rule__EnemyType__Group__11 : rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 ;
    public final void rule__EnemyType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2127:1: ( rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 )
            // InternalRangoMode.g:2128:2: rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12
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
    // InternalRangoMode.g:2135:1: rule__EnemyType__Group__11__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__EnemyType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2139:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:2140:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:2140:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:2141:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:2142:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:2142:3: rule__EnemyType__ContactEffectsAssignment_11
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
    // InternalRangoMode.g:2150:1: rule__EnemyType__Group__12 : rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 ;
    public final void rule__EnemyType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2154:1: ( rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 )
            // InternalRangoMode.g:2155:2: rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13
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
    // InternalRangoMode.g:2162:1: rule__EnemyType__Group__12__Impl : ( ( rule__EnemyType__Group_12__0 )* ) ;
    public final void rule__EnemyType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2166:1: ( ( ( rule__EnemyType__Group_12__0 )* ) )
            // InternalRangoMode.g:2167:1: ( ( rule__EnemyType__Group_12__0 )* )
            {
            // InternalRangoMode.g:2167:1: ( ( rule__EnemyType__Group_12__0 )* )
            // InternalRangoMode.g:2168:2: ( rule__EnemyType__Group_12__0 )*
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:2169:2: ( rule__EnemyType__Group_12__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRangoMode.g:2169:3: rule__EnemyType__Group_12__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EnemyType__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRangoMode.g:2177:1: rule__EnemyType__Group__13 : rule__EnemyType__Group__13__Impl ;
    public final void rule__EnemyType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2181:1: ( rule__EnemyType__Group__13__Impl )
            // InternalRangoMode.g:2182:2: rule__EnemyType__Group__13__Impl
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
    // InternalRangoMode.g:2188:1: rule__EnemyType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnemyType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2192:1: ( ( '}' ) )
            // InternalRangoMode.g:2193:1: ( '}' )
            {
            // InternalRangoMode.g:2193:1: ( '}' )
            // InternalRangoMode.g:2194:2: '}'
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
    // InternalRangoMode.g:2204:1: rule__EnemyType__Group_3_0__0 : rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 ;
    public final void rule__EnemyType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2208:1: ( rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 )
            // InternalRangoMode.g:2209:2: rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1
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
    // InternalRangoMode.g:2216:1: rule__EnemyType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__EnemyType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2220:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:2221:1: ( 'sprite' )
            {
            // InternalRangoMode.g:2221:1: ( 'sprite' )
            // InternalRangoMode.g:2222:2: 'sprite'
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
    // InternalRangoMode.g:2231:1: rule__EnemyType__Group_3_0__1 : rule__EnemyType__Group_3_0__1__Impl ;
    public final void rule__EnemyType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2235:1: ( rule__EnemyType__Group_3_0__1__Impl )
            // InternalRangoMode.g:2236:2: rule__EnemyType__Group_3_0__1__Impl
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
    // InternalRangoMode.g:2242:1: rule__EnemyType__Group_3_0__1__Impl : ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__EnemyType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2246:1: ( ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:2247:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:2247:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:2248:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:2249:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:2249:3: rule__EnemyType__SpriteAssignment_3_0_1
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
    // InternalRangoMode.g:2258:1: rule__EnemyType__Group_3_1__0 : rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 ;
    public final void rule__EnemyType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2262:1: ( rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 )
            // InternalRangoMode.g:2263:2: rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1
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
    // InternalRangoMode.g:2270:1: rule__EnemyType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__EnemyType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2274:1: ( ( 'scale' ) )
            // InternalRangoMode.g:2275:1: ( 'scale' )
            {
            // InternalRangoMode.g:2275:1: ( 'scale' )
            // InternalRangoMode.g:2276:2: 'scale'
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
    // InternalRangoMode.g:2285:1: rule__EnemyType__Group_3_1__1 : rule__EnemyType__Group_3_1__1__Impl ;
    public final void rule__EnemyType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2289:1: ( rule__EnemyType__Group_3_1__1__Impl )
            // InternalRangoMode.g:2290:2: rule__EnemyType__Group_3_1__1__Impl
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
    // InternalRangoMode.g:2296:1: rule__EnemyType__Group_3_1__1__Impl : ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__EnemyType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2300:1: ( ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:2301:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:2301:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:2302:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:2303:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:2303:3: rule__EnemyType__ScaleAssignment_3_1_1
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
    // InternalRangoMode.g:2312:1: rule__EnemyType__Group_3_2__0 : rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 ;
    public final void rule__EnemyType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2316:1: ( rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 )
            // InternalRangoMode.g:2317:2: rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1
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
    // InternalRangoMode.g:2324:1: rule__EnemyType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__EnemyType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2328:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:2329:1: ( 'bounce' )
            {
            // InternalRangoMode.g:2329:1: ( 'bounce' )
            // InternalRangoMode.g:2330:2: 'bounce'
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
    // InternalRangoMode.g:2339:1: rule__EnemyType__Group_3_2__1 : rule__EnemyType__Group_3_2__1__Impl ;
    public final void rule__EnemyType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2343:1: ( rule__EnemyType__Group_3_2__1__Impl )
            // InternalRangoMode.g:2344:2: rule__EnemyType__Group_3_2__1__Impl
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
    // InternalRangoMode.g:2350:1: rule__EnemyType__Group_3_2__1__Impl : ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__EnemyType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2354:1: ( ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:2355:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:2355:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:2356:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:2357:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:2357:3: rule__EnemyType__BounceAssignment_3_2_1
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
    // InternalRangoMode.g:2366:1: rule__EnemyType__Group_3_3__0 : rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 ;
    public final void rule__EnemyType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2370:1: ( rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 )
            // InternalRangoMode.g:2371:2: rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1
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
    // InternalRangoMode.g:2378:1: rule__EnemyType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__EnemyType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2382:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2383:1: ( 'speed' )
            {
            // InternalRangoMode.g:2383:1: ( 'speed' )
            // InternalRangoMode.g:2384:2: 'speed'
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
    // InternalRangoMode.g:2393:1: rule__EnemyType__Group_3_3__1 : rule__EnemyType__Group_3_3__1__Impl ;
    public final void rule__EnemyType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2397:1: ( rule__EnemyType__Group_3_3__1__Impl )
            // InternalRangoMode.g:2398:2: rule__EnemyType__Group_3_3__1__Impl
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
    // InternalRangoMode.g:2404:1: rule__EnemyType__Group_3_3__1__Impl : ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__EnemyType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2408:1: ( ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:2409:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:2409:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:2410:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:2411:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:2411:3: rule__EnemyType__SpeedAssignment_3_3_1
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
    // InternalRangoMode.g:2420:1: rule__EnemyType__Group_3_4__0 : rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 ;
    public final void rule__EnemyType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2424:1: ( rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 )
            // InternalRangoMode.g:2425:2: rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1
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
    // InternalRangoMode.g:2432:1: rule__EnemyType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__EnemyType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2436:1: ( ( 'points' ) )
            // InternalRangoMode.g:2437:1: ( 'points' )
            {
            // InternalRangoMode.g:2437:1: ( 'points' )
            // InternalRangoMode.g:2438:2: 'points'
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
    // InternalRangoMode.g:2447:1: rule__EnemyType__Group_3_4__1 : rule__EnemyType__Group_3_4__1__Impl ;
    public final void rule__EnemyType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2451:1: ( rule__EnemyType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2452:2: rule__EnemyType__Group_3_4__1__Impl
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
    // InternalRangoMode.g:2458:1: rule__EnemyType__Group_3_4__1__Impl : ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__EnemyType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2462:1: ( ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2463:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2463:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2464:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2465:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2465:3: rule__EnemyType__PointsAssignment_3_4_1
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
    // InternalRangoMode.g:2474:1: rule__EnemyType__Group_12__0 : rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 ;
    public final void rule__EnemyType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2478:1: ( rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 )
            // InternalRangoMode.g:2479:2: rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1
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
    // InternalRangoMode.g:2486:1: rule__EnemyType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__EnemyType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2490:1: ( ( ',' ) )
            // InternalRangoMode.g:2491:1: ( ',' )
            {
            // InternalRangoMode.g:2491:1: ( ',' )
            // InternalRangoMode.g:2492:2: ','
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
    // InternalRangoMode.g:2501:1: rule__EnemyType__Group_12__1 : rule__EnemyType__Group_12__1__Impl ;
    public final void rule__EnemyType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2505:1: ( rule__EnemyType__Group_12__1__Impl )
            // InternalRangoMode.g:2506:2: rule__EnemyType__Group_12__1__Impl
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
    // InternalRangoMode.g:2512:1: rule__EnemyType__Group_12__1__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__EnemyType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2516:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2517:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2517:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2518:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2519:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2519:3: rule__EnemyType__ContactEffectsAssignment_12_1
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
    // InternalRangoMode.g:2528:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2532:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2533:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
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
    // InternalRangoMode.g:2540:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2544:1: ( ( () ) )
            // InternalRangoMode.g:2545:1: ( () )
            {
            // InternalRangoMode.g:2545:1: ( () )
            // InternalRangoMode.g:2546:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2547:2: ()
            // InternalRangoMode.g:2547:3: 
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
    // InternalRangoMode.g:2555:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2559:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2560:2: rule__Vanish__Group__1__Impl
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
    // InternalRangoMode.g:2566:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2570:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2571:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2571:1: ( 'vanish' )
            // InternalRangoMode.g:2572:2: 'vanish'
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
    // InternalRangoMode.g:2582:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2586:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2587:2: rule__Split__Group__0__Impl rule__Split__Group__1
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
    // InternalRangoMode.g:2594:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2598:1: ( ( 'split' ) )
            // InternalRangoMode.g:2599:1: ( 'split' )
            {
            // InternalRangoMode.g:2599:1: ( 'split' )
            // InternalRangoMode.g:2600:2: 'split'
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
    // InternalRangoMode.g:2609:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2613:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2614:2: rule__Split__Group__1__Impl rule__Split__Group__2
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
    // InternalRangoMode.g:2621:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2625:1: ( ( 'into' ) )
            // InternalRangoMode.g:2626:1: ( 'into' )
            {
            // InternalRangoMode.g:2626:1: ( 'into' )
            // InternalRangoMode.g:2627:2: 'into'
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
    // InternalRangoMode.g:2636:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2640:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2641:2: rule__Split__Group__2__Impl rule__Split__Group__3
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
    // InternalRangoMode.g:2648:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2652:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2653:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2653:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2654:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2655:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2655:3: rule__Split__FragmentsAssignment_2
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
    // InternalRangoMode.g:2663:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2667:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2668:2: rule__Split__Group__3__Impl rule__Split__Group__4
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
    // InternalRangoMode.g:2675:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2679:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2680:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2680:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2681:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2682:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:2682:3: rule__Split__FragmentTypeAssignment_3
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
    // InternalRangoMode.g:2690:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2694:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2695:2: rule__Split__Group__4__Impl
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
    // InternalRangoMode.g:2701:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2705:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2706:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2706:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2707:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2708:2: ( rule__Split__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:2708:3: rule__Split__Group_4__0
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
    // InternalRangoMode.g:2717:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2721:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2722:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
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
    // InternalRangoMode.g:2729:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2733:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2734:1: ( 'launched' )
            {
            // InternalRangoMode.g:2734:1: ( 'launched' )
            // InternalRangoMode.g:2735:2: 'launched'
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
    // InternalRangoMode.g:2744:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2748:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2749:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
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
    // InternalRangoMode.g:2756:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2760:1: ( ( 'at' ) )
            // InternalRangoMode.g:2761:1: ( 'at' )
            {
            // InternalRangoMode.g:2761:1: ( 'at' )
            // InternalRangoMode.g:2762:2: 'at'
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
    // InternalRangoMode.g:2771:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2775:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2776:2: rule__Split__Group_4__2__Impl
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
    // InternalRangoMode.g:2782:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2786:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2787:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2787:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2788:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2789:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2789:3: rule__Split__LaunchSpeedAssignment_4_2
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
    // InternalRangoMode.g:2798:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2802:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2803:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
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
    // InternalRangoMode.g:2810:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2814:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2815:1: ( 'damage' )
            {
            // InternalRangoMode.g:2815:1: ( 'damage' )
            // InternalRangoMode.g:2816:2: 'damage'
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
    // InternalRangoMode.g:2825:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2829:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2830:2: rule__Damage__Group__1__Impl
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
    // InternalRangoMode.g:2836:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2840:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2841:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2841:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2842:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2843:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2843:3: rule__Damage__AmountAssignment_1
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
    // InternalRangoMode.g:2852:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2856:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2857:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
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
    // InternalRangoMode.g:2864:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2868:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2869:1: ( 'heal' )
            {
            // InternalRangoMode.g:2869:1: ( 'heal' )
            // InternalRangoMode.g:2870:2: 'heal'
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
    // InternalRangoMode.g:2879:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2883:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2884:2: rule__Heal__Group__1__Impl
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
    // InternalRangoMode.g:2890:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2894:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2895:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2895:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2896:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2897:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2897:3: rule__Heal__AmountAssignment_1
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
    // InternalRangoMode.g:2906:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2910:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2911:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
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
    // InternalRangoMode.g:2918:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2922:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2923:1: ( 'shield' )
            {
            // InternalRangoMode.g:2923:1: ( 'shield' )
            // InternalRangoMode.g:2924:2: 'shield'
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
    // InternalRangoMode.g:2933:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2937:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2938:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
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
    // InternalRangoMode.g:2945:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2949:1: ( ( 'for' ) )
            // InternalRangoMode.g:2950:1: ( 'for' )
            {
            // InternalRangoMode.g:2950:1: ( 'for' )
            // InternalRangoMode.g:2951:2: 'for'
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
    // InternalRangoMode.g:2960:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2964:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2965:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
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
    // InternalRangoMode.g:2972:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2976:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2977:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2977:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2978:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2979:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2979:3: rule__Shield__DurationAssignment_2
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
    // InternalRangoMode.g:2987:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2991:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2992:2: rule__Shield__Group__3__Impl
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
    // InternalRangoMode.g:2998:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3002:1: ( ( 's' ) )
            // InternalRangoMode.g:3003:1: ( 's' )
            {
            // InternalRangoMode.g:3003:1: ( 's' )
            // InternalRangoMode.g:3004:2: 's'
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
    // InternalRangoMode.g:3014:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3018:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:3019:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
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
    // InternalRangoMode.g:3026:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3030:1: ( ( 'speed' ) )
            // InternalRangoMode.g:3031:1: ( 'speed' )
            {
            // InternalRangoMode.g:3031:1: ( 'speed' )
            // InternalRangoMode.g:3032:2: 'speed'
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
    // InternalRangoMode.g:3041:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3045:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:3046:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
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
    // InternalRangoMode.g:3053:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3057:1: ( ( '*' ) )
            // InternalRangoMode.g:3058:1: ( '*' )
            {
            // InternalRangoMode.g:3058:1: ( '*' )
            // InternalRangoMode.g:3059:2: '*'
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
    // InternalRangoMode.g:3068:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3072:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:3073:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
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
    // InternalRangoMode.g:3080:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3084:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:3085:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:3085:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:3086:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:3087:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:3087:3: rule__SpeedChange__FactorAssignment_2
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
    // InternalRangoMode.g:3095:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3099:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:3100:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
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
    // InternalRangoMode.g:3107:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3111:1: ( ( 'for' ) )
            // InternalRangoMode.g:3112:1: ( 'for' )
            {
            // InternalRangoMode.g:3112:1: ( 'for' )
            // InternalRangoMode.g:3113:2: 'for'
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
    // InternalRangoMode.g:3122:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3126:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:3127:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
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
    // InternalRangoMode.g:3134:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3138:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:3139:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:3139:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:3140:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:3141:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:3141:3: rule__SpeedChange__DurationAssignment_4
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
    // InternalRangoMode.g:3149:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3153:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:3154:2: rule__SpeedChange__Group__5__Impl
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
    // InternalRangoMode.g:3160:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3164:1: ( ( 's' ) )
            // InternalRangoMode.g:3165:1: ( 's' )
            {
            // InternalRangoMode.g:3165:1: ( 's' )
            // InternalRangoMode.g:3166:2: 's'
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
    // InternalRangoMode.g:3176:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3180:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:3181:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
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
    // InternalRangoMode.g:3188:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3192:1: ( ( 'poison' ) )
            // InternalRangoMode.g:3193:1: ( 'poison' )
            {
            // InternalRangoMode.g:3193:1: ( 'poison' )
            // InternalRangoMode.g:3194:2: 'poison'
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
    // InternalRangoMode.g:3203:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3207:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:3208:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
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
    // InternalRangoMode.g:3215:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3219:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:3220:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:3220:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:3221:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:3222:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:3222:3: rule__Poison__AmountAssignment_1
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
    // InternalRangoMode.g:3230:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3234:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:3235:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
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
    // InternalRangoMode.g:3242:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3246:1: ( ( 'every' ) )
            // InternalRangoMode.g:3247:1: ( 'every' )
            {
            // InternalRangoMode.g:3247:1: ( 'every' )
            // InternalRangoMode.g:3248:2: 'every'
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
    // InternalRangoMode.g:3257:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3261:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:3262:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
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
    // InternalRangoMode.g:3269:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3273:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:3274:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:3274:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:3275:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:3276:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:3276:3: rule__Poison__IntervalAssignment_3
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
    // InternalRangoMode.g:3284:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3288:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:3289:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
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
    // InternalRangoMode.g:3296:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3300:1: ( ( 's' ) )
            // InternalRangoMode.g:3301:1: ( 's' )
            {
            // InternalRangoMode.g:3301:1: ( 's' )
            // InternalRangoMode.g:3302:2: 's'
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
    // InternalRangoMode.g:3311:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3315:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:3316:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
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
    // InternalRangoMode.g:3323:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3327:1: ( ( 'for' ) )
            // InternalRangoMode.g:3328:1: ( 'for' )
            {
            // InternalRangoMode.g:3328:1: ( 'for' )
            // InternalRangoMode.g:3329:2: 'for'
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
    // InternalRangoMode.g:3338:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3342:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:3343:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
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
    // InternalRangoMode.g:3350:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3354:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:3355:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:3355:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:3356:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:3357:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:3357:3: rule__Poison__DurationAssignment_6
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
    // InternalRangoMode.g:3365:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3369:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:3370:2: rule__Poison__Group__7__Impl
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
    // InternalRangoMode.g:3376:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3380:1: ( ( 's' ) )
            // InternalRangoMode.g:3381:1: ( 's' )
            {
            // InternalRangoMode.g:3381:1: ( 's' )
            // InternalRangoMode.g:3382:2: 's'
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
    // InternalRangoMode.g:3392:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3396:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:3397:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
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
    // InternalRangoMode.g:3404:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3408:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:3409:1: ( 'powerup' )
            {
            // InternalRangoMode.g:3409:1: ( 'powerup' )
            // InternalRangoMode.g:3410:2: 'powerup'
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
    // InternalRangoMode.g:3419:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3423:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3424:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
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
    // InternalRangoMode.g:3431:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3435:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3436:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3436:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3437:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3438:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3438:3: rule__PowerUp__NameAssignment_1
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
    // InternalRangoMode.g:3446:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3450:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3451:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
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
    // InternalRangoMode.g:3458:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3462:1: ( ( '{' ) )
            // InternalRangoMode.g:3463:1: ( '{' )
            {
            // InternalRangoMode.g:3463:1: ( '{' )
            // InternalRangoMode.g:3464:2: '{'
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
    // InternalRangoMode.g:3473:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3477:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3478:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
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
    // InternalRangoMode.g:3485:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3489:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3490:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3490:1: ( 'sprite' )
            // InternalRangoMode.g:3491:2: 'sprite'
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
    // InternalRangoMode.g:3500:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3504:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3505:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
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
    // InternalRangoMode.g:3512:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3516:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3517:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3517:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3518:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3519:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3519:3: rule__PowerUp__SpriteAssignment_4
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
    // InternalRangoMode.g:3527:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3531:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3532:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
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
    // InternalRangoMode.g:3539:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3543:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3544:1: ( 'gives' )
            {
            // InternalRangoMode.g:3544:1: ( 'gives' )
            // InternalRangoMode.g:3545:2: 'gives'
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
    // InternalRangoMode.g:3554:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3558:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3559:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
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
    // InternalRangoMode.g:3566:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3570:1: ( ( ':' ) )
            // InternalRangoMode.g:3571:1: ( ':' )
            {
            // InternalRangoMode.g:3571:1: ( ':' )
            // InternalRangoMode.g:3572:2: ':'
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
    // InternalRangoMode.g:3581:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3585:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3586:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
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
    // InternalRangoMode.g:3593:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3597:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3598:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3598:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3599:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3600:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3600:3: rule__PowerUp__EffectsAssignment_7
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
    // InternalRangoMode.g:3608:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3612:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3613:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
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
    // InternalRangoMode.g:3620:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3624:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3625:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3625:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3626:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3627:2: ( rule__PowerUp__Group_8__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRangoMode.g:3627:3: rule__PowerUp__Group_8__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PowerUp__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRangoMode.g:3635:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3639:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3640:2: rule__PowerUp__Group__9__Impl
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
    // InternalRangoMode.g:3646:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3650:1: ( ( '}' ) )
            // InternalRangoMode.g:3651:1: ( '}' )
            {
            // InternalRangoMode.g:3651:1: ( '}' )
            // InternalRangoMode.g:3652:2: '}'
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
    // InternalRangoMode.g:3662:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3666:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3667:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
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
    // InternalRangoMode.g:3674:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3678:1: ( ( ',' ) )
            // InternalRangoMode.g:3679:1: ( ',' )
            {
            // InternalRangoMode.g:3679:1: ( ',' )
            // InternalRangoMode.g:3680:2: ','
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
    // InternalRangoMode.g:3689:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3693:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3694:2: rule__PowerUp__Group_8__1__Impl
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
    // InternalRangoMode.g:3700:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3704:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3705:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3705:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3706:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3707:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3707:3: rule__PowerUp__EffectsAssignment_8_1
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
    // InternalRangoMode.g:3716:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3720:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3721:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
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
    // InternalRangoMode.g:3728:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3732:1: ( ( 'player' ) )
            // InternalRangoMode.g:3733:1: ( 'player' )
            {
            // InternalRangoMode.g:3733:1: ( 'player' )
            // InternalRangoMode.g:3734:2: 'player'
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
    // InternalRangoMode.g:3743:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3747:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3748:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
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
    // InternalRangoMode.g:3755:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3759:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3760:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3760:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3761:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3762:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3762:3: rule__PlayerProfile__NameAssignment_1
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
    // InternalRangoMode.g:3770:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3774:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3775:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
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
    // InternalRangoMode.g:3782:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3786:1: ( ( '{' ) )
            // InternalRangoMode.g:3787:1: ( '{' )
            {
            // InternalRangoMode.g:3787:1: ( '{' )
            // InternalRangoMode.g:3788:2: '{'
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
    // InternalRangoMode.g:3797:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3801:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3802:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
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
    // InternalRangoMode.g:3809:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3813:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3814:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3814:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3815:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3816:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3816:3: rule__PlayerProfile__UnorderedGroup_3
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
    // InternalRangoMode.g:3824:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3828:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3829:2: rule__PlayerProfile__Group__4__Impl
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
    // InternalRangoMode.g:3835:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3839:1: ( ( '}' ) )
            // InternalRangoMode.g:3840:1: ( '}' )
            {
            // InternalRangoMode.g:3840:1: ( '}' )
            // InternalRangoMode.g:3841:2: '}'
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
    // InternalRangoMode.g:3851:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3855:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3856:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
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
    // InternalRangoMode.g:3863:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3867:1: ( ( 'character' ) )
            // InternalRangoMode.g:3868:1: ( 'character' )
            {
            // InternalRangoMode.g:3868:1: ( 'character' )
            // InternalRangoMode.g:3869:2: 'character'
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
    // InternalRangoMode.g:3878:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3882:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3883:2: rule__PlayerProfile__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3889:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3893:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3894:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3894:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3895:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3896:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3896:3: rule__PlayerProfile__CharacterAssignment_3_0_1
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
    // InternalRangoMode.g:3905:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3909:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3910:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
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
    // InternalRangoMode.g:3917:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3921:1: ( ( 'health' ) )
            // InternalRangoMode.g:3922:1: ( 'health' )
            {
            // InternalRangoMode.g:3922:1: ( 'health' )
            // InternalRangoMode.g:3923:2: 'health'
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
    // InternalRangoMode.g:3932:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3936:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3937:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
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
    // InternalRangoMode.g:3944:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3948:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3949:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3949:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:3950:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:3951:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:3951:3: rule__PlayerProfile__HealthAssignment_3_1_1
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
    // InternalRangoMode.g:3959:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3963:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:3964:2: rule__PlayerProfile__Group_3_1__2__Impl
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
    // InternalRangoMode.g:3970:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3974:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:3975:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:3975:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:3976:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:3977:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==57) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRangoMode.g:3977:3: rule__PlayerProfile__Group_3_1_2__0
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
    // InternalRangoMode.g:3986:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3990:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:3991:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
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
    // InternalRangoMode.g:3998:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4002:1: ( ( 'max' ) )
            // InternalRangoMode.g:4003:1: ( 'max' )
            {
            // InternalRangoMode.g:4003:1: ( 'max' )
            // InternalRangoMode.g:4004:2: 'max'
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
    // InternalRangoMode.g:4013:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4017:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:4018:2: rule__PlayerProfile__Group_3_1_2__1__Impl
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
    // InternalRangoMode.g:4024:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4028:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:4029:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:4029:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:4030:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:4031:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:4031:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
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
    // InternalRangoMode.g:4040:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4044:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:4045:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
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
    // InternalRangoMode.g:4052:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4056:1: ( ( 'speed' ) )
            // InternalRangoMode.g:4057:1: ( 'speed' )
            {
            // InternalRangoMode.g:4057:1: ( 'speed' )
            // InternalRangoMode.g:4058:2: 'speed'
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
    // InternalRangoMode.g:4067:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4071:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:4072:2: rule__PlayerProfile__Group_3_2__1__Impl
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
    // InternalRangoMode.g:4078:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4082:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:4083:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:4083:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:4084:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:4085:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:4085:3: rule__PlayerProfile__SpeedAssignment_3_2_1
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
    // InternalRangoMode.g:4094:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4098:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:4099:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
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
    // InternalRangoMode.g:4106:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4110:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:4111:1: ( 'tongue' )
            {
            // InternalRangoMode.g:4111:1: ( 'tongue' )
            // InternalRangoMode.g:4112:2: 'tongue'
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
    // InternalRangoMode.g:4121:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4125:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:4126:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
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
    // InternalRangoMode.g:4133:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4137:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:4138:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:4138:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:4139:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:4140:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:4140:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
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
    // InternalRangoMode.g:4148:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4152:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:4153:2: rule__PlayerProfile__Group_3_3__2__Impl
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
    // InternalRangoMode.g:4159:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4163:1: ( ( 's' ) )
            // InternalRangoMode.g:4164:1: ( 's' )
            {
            // InternalRangoMode.g:4164:1: ( 's' )
            // InternalRangoMode.g:4165:2: 's'
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
    // InternalRangoMode.g:4175:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4179:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:4180:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
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
    // InternalRangoMode.g:4187:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4191:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:4192:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:4192:1: ( 'cooldown' )
            // InternalRangoMode.g:4193:2: 'cooldown'
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
    // InternalRangoMode.g:4202:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4206:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:4207:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
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
    // InternalRangoMode.g:4214:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4218:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:4219:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:4219:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:4220:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:4221:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:4221:3: rule__PlayerProfile__CooldownAssignment_3_4_1
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
    // InternalRangoMode.g:4229:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4233:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:4234:2: rule__PlayerProfile__Group_3_4__2__Impl
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
    // InternalRangoMode.g:4240:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4244:1: ( ( 's' ) )
            // InternalRangoMode.g:4245:1: ( 's' )
            {
            // InternalRangoMode.g:4245:1: ( 's' )
            // InternalRangoMode.g:4246:2: 's'
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
    // InternalRangoMode.g:4256:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4260:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:4261:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
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
    // InternalRangoMode.g:4268:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4272:1: ( ( 'grace' ) )
            // InternalRangoMode.g:4273:1: ( 'grace' )
            {
            // InternalRangoMode.g:4273:1: ( 'grace' )
            // InternalRangoMode.g:4274:2: 'grace'
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
    // InternalRangoMode.g:4283:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4287:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:4288:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
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
    // InternalRangoMode.g:4295:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4299:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:4300:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:4300:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:4301:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:4302:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:4302:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
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
    // InternalRangoMode.g:4310:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4314:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:4315:2: rule__PlayerProfile__Group_3_5__2__Impl
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
    // InternalRangoMode.g:4321:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4325:1: ( ( 's' ) )
            // InternalRangoMode.g:4326:1: ( 's' )
            {
            // InternalRangoMode.g:4326:1: ( 's' )
            // InternalRangoMode.g:4327:2: 's'
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
    // InternalRangoMode.g:4337:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4341:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:4342:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
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
    // InternalRangoMode.g:4349:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4353:1: ( ( 'mode' ) )
            // InternalRangoMode.g:4354:1: ( 'mode' )
            {
            // InternalRangoMode.g:4354:1: ( 'mode' )
            // InternalRangoMode.g:4355:2: 'mode'
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
    // InternalRangoMode.g:4364:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4368:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:4369:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
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
    // InternalRangoMode.g:4376:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4380:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4381:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4381:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4382:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4383:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4383:3: rule__GameMode__NameAssignment_1
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
    // InternalRangoMode.g:4391:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4395:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4396:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
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
    // InternalRangoMode.g:4403:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4407:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4408:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4408:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4409:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4410:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4410:3: rule__GameMode__TitleAssignment_2
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
    // InternalRangoMode.g:4418:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4422:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4423:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
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
    // InternalRangoMode.g:4430:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4434:1: ( ( '{' ) )
            // InternalRangoMode.g:4435:1: ( '{' )
            {
            // InternalRangoMode.g:4435:1: ( '{' )
            // InternalRangoMode.g:4436:2: '{'
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
    // InternalRangoMode.g:4445:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4449:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4450:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
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
    // InternalRangoMode.g:4457:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4461:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4462:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4462:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4463:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4464:2: ( rule__GameMode__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==64) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:4464:3: rule__GameMode__Group_4__0
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
    // InternalRangoMode.g:4472:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4476:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4477:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
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
    // InternalRangoMode.g:4484:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4488:1: ( ( 'player' ) )
            // InternalRangoMode.g:4489:1: ( 'player' )
            {
            // InternalRangoMode.g:4489:1: ( 'player' )
            // InternalRangoMode.g:4490:2: 'player'
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
    // InternalRangoMode.g:4499:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4503:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4504:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
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
    // InternalRangoMode.g:4511:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4515:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4516:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4516:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4517:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4518:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4518:3: rule__GameMode__PlayerAssignment_6
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
    // InternalRangoMode.g:4526:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4530:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4531:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
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
    // InternalRangoMode.g:4538:1: rule__GameMode__Group__7__Impl : ( ( rule__GameMode__UnorderedGroup_7 ) ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4542:1: ( ( ( rule__GameMode__UnorderedGroup_7 ) ) )
            // InternalRangoMode.g:4543:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            {
            // InternalRangoMode.g:4543:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            // InternalRangoMode.g:4544:2: ( rule__GameMode__UnorderedGroup_7 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 
            // InternalRangoMode.g:4545:2: ( rule__GameMode__UnorderedGroup_7 )
            // InternalRangoMode.g:4545:3: rule__GameMode__UnorderedGroup_7
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
    // InternalRangoMode.g:4553:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4557:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4558:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4565:1: rule__GameMode__Group__8__Impl : ( ( rule__GameMode__Alternatives_8 ) ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4569:1: ( ( ( rule__GameMode__Alternatives_8 ) ) )
            // InternalRangoMode.g:4570:1: ( ( rule__GameMode__Alternatives_8 ) )
            {
            // InternalRangoMode.g:4570:1: ( ( rule__GameMode__Alternatives_8 ) )
            // InternalRangoMode.g:4571:2: ( rule__GameMode__Alternatives_8 )
            {
             before(grammarAccess.getGameModeAccess().getAlternatives_8()); 
            // InternalRangoMode.g:4572:2: ( rule__GameMode__Alternatives_8 )
            // InternalRangoMode.g:4572:3: rule__GameMode__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getAlternatives_8()); 

            }


            }

        }
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
    // InternalRangoMode.g:4580:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4584:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4585:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4592:1: rule__GameMode__Group__9__Impl : ( ( ruleDrops )? ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4596:1: ( ( ( ruleDrops )? ) )
            // InternalRangoMode.g:4597:1: ( ( ruleDrops )? )
            {
            // InternalRangoMode.g:4597:1: ( ( ruleDrops )? )
            // InternalRangoMode.g:4598:2: ( ruleDrops )?
            {
             before(grammarAccess.getGameModeAccess().getDropsParserRuleCall_9()); 
            // InternalRangoMode.g:4599:2: ( ruleDrops )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==93) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:4599:3: ruleDrops
                    {
                    pushFollow(FOLLOW_2);
                    ruleDrops();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getDropsParserRuleCall_9()); 

            }


            }

        }
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
    // InternalRangoMode.g:4607:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl rule__GameMode__Group__11 ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4611:1: ( rule__GameMode__Group__10__Impl rule__GameMode__Group__11 )
            // InternalRangoMode.g:4612:2: rule__GameMode__Group__10__Impl rule__GameMode__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__GameMode__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__11();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:4619:1: rule__GameMode__Group__10__Impl : ( ( rule__GameMode__Group_10__0 )? ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4623:1: ( ( ( rule__GameMode__Group_10__0 )? ) )
            // InternalRangoMode.g:4624:1: ( ( rule__GameMode__Group_10__0 )? )
            {
            // InternalRangoMode.g:4624:1: ( ( rule__GameMode__Group_10__0 )? )
            // InternalRangoMode.g:4625:2: ( rule__GameMode__Group_10__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_10()); 
            // InternalRangoMode.g:4626:2: ( rule__GameMode__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:4626:3: rule__GameMode__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getGroup_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__GameMode__Group__11"
    // InternalRangoMode.g:4634:1: rule__GameMode__Group__11 : rule__GameMode__Group__11__Impl rule__GameMode__Group__12 ;
    public final void rule__GameMode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4638:1: ( rule__GameMode__Group__11__Impl rule__GameMode__Group__12 )
            // InternalRangoMode.g:4639:2: rule__GameMode__Group__11__Impl rule__GameMode__Group__12
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__11"


    // $ANTLR start "rule__GameMode__Group__11__Impl"
    // InternalRangoMode.g:4646:1: rule__GameMode__Group__11__Impl : ( 'lose' ) ;
    public final void rule__GameMode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4650:1: ( ( 'lose' ) )
            // InternalRangoMode.g:4651:1: ( 'lose' )
            {
            // InternalRangoMode.g:4651:1: ( 'lose' )
            // InternalRangoMode.g:4652:2: 'lose'
            {
             before(grammarAccess.getGameModeAccess().getLoseKeyword_11()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getLoseKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__11__Impl"


    // $ANTLR start "rule__GameMode__Group__12"
    // InternalRangoMode.g:4661:1: rule__GameMode__Group__12 : rule__GameMode__Group__12__Impl rule__GameMode__Group__13 ;
    public final void rule__GameMode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4665:1: ( rule__GameMode__Group__12__Impl rule__GameMode__Group__13 )
            // InternalRangoMode.g:4666:2: rule__GameMode__Group__12__Impl rule__GameMode__Group__13
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__12"


    // $ANTLR start "rule__GameMode__Group__12__Impl"
    // InternalRangoMode.g:4673:1: rule__GameMode__Group__12__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4677:1: ( ( 'when' ) )
            // InternalRangoMode.g:4678:1: ( 'when' )
            {
            // InternalRangoMode.g:4678:1: ( 'when' )
            // InternalRangoMode.g:4679:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_12()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__12__Impl"


    // $ANTLR start "rule__GameMode__Group__13"
    // InternalRangoMode.g:4688:1: rule__GameMode__Group__13 : rule__GameMode__Group__13__Impl rule__GameMode__Group__14 ;
    public final void rule__GameMode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4692:1: ( rule__GameMode__Group__13__Impl rule__GameMode__Group__14 )
            // InternalRangoMode.g:4693:2: rule__GameMode__Group__13__Impl rule__GameMode__Group__14
            {
            pushFollow(FOLLOW_41);
            rule__GameMode__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__13"


    // $ANTLR start "rule__GameMode__Group__13__Impl"
    // InternalRangoMode.g:4700:1: rule__GameMode__Group__13__Impl : ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) ;
    public final void rule__GameMode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4704:1: ( ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) )
            // InternalRangoMode.g:4705:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            {
            // InternalRangoMode.g:4705:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            // InternalRangoMode.g:4706:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_13()); 
            // InternalRangoMode.g:4707:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            // InternalRangoMode.g:4707:3: rule__GameMode__LoseConditionsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__13__Impl"


    // $ANTLR start "rule__GameMode__Group__14"
    // InternalRangoMode.g:4715:1: rule__GameMode__Group__14 : rule__GameMode__Group__14__Impl rule__GameMode__Group__15 ;
    public final void rule__GameMode__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4719:1: ( rule__GameMode__Group__14__Impl rule__GameMode__Group__15 )
            // InternalRangoMode.g:4720:2: rule__GameMode__Group__14__Impl rule__GameMode__Group__15
            {
            pushFollow(FOLLOW_41);
            rule__GameMode__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__14"


    // $ANTLR start "rule__GameMode__Group__14__Impl"
    // InternalRangoMode.g:4727:1: rule__GameMode__Group__14__Impl : ( ( rule__GameMode__Group_14__0 )* ) ;
    public final void rule__GameMode__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4731:1: ( ( ( rule__GameMode__Group_14__0 )* ) )
            // InternalRangoMode.g:4732:1: ( ( rule__GameMode__Group_14__0 )* )
            {
            // InternalRangoMode.g:4732:1: ( ( rule__GameMode__Group_14__0 )* )
            // InternalRangoMode.g:4733:2: ( rule__GameMode__Group_14__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_14()); 
            // InternalRangoMode.g:4734:2: ( rule__GameMode__Group_14__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==67) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRangoMode.g:4734:3: rule__GameMode__Group_14__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__GameMode__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__14__Impl"


    // $ANTLR start "rule__GameMode__Group__15"
    // InternalRangoMode.g:4742:1: rule__GameMode__Group__15 : rule__GameMode__Group__15__Impl ;
    public final void rule__GameMode__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4746:1: ( rule__GameMode__Group__15__Impl )
            // InternalRangoMode.g:4747:2: rule__GameMode__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__15"


    // $ANTLR start "rule__GameMode__Group__15__Impl"
    // InternalRangoMode.g:4753:1: rule__GameMode__Group__15__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4757:1: ( ( '}' ) )
            // InternalRangoMode.g:4758:1: ( '}' )
            {
            // InternalRangoMode.g:4758:1: ( '}' )
            // InternalRangoMode.g:4759:2: '}'
            {
             before(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__15__Impl"


    // $ANTLR start "rule__GameMode__Group_4__0"
    // InternalRangoMode.g:4769:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4773:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4774:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
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
    // InternalRangoMode.g:4781:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4785:1: ( ( 'description' ) )
            // InternalRangoMode.g:4786:1: ( 'description' )
            {
            // InternalRangoMode.g:4786:1: ( 'description' )
            // InternalRangoMode.g:4787:2: 'description'
            {
             before(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalRangoMode.g:4796:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4800:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4801:2: rule__GameMode__Group_4__1__Impl
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
    // InternalRangoMode.g:4807:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4811:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4812:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4812:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4813:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4814:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4814:3: rule__GameMode__DescriptionAssignment_4_1
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
    // InternalRangoMode.g:4823:1: rule__GameMode__Group_7_0__0 : rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 ;
    public final void rule__GameMode__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4827:1: ( rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 )
            // InternalRangoMode.g:4828:2: rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1
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
    // InternalRangoMode.g:4835:1: rule__GameMode__Group_7_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4839:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:4840:1: ( 'gravity' )
            {
            // InternalRangoMode.g:4840:1: ( 'gravity' )
            // InternalRangoMode.g:4841:2: 'gravity'
            {
             before(grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalRangoMode.g:4850:1: rule__GameMode__Group_7_0__1 : rule__GameMode__Group_7_0__1__Impl ;
    public final void rule__GameMode__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4854:1: ( rule__GameMode__Group_7_0__1__Impl )
            // InternalRangoMode.g:4855:2: rule__GameMode__Group_7_0__1__Impl
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
    // InternalRangoMode.g:4861:1: rule__GameMode__Group_7_0__1__Impl : ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) ;
    public final void rule__GameMode__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4865:1: ( ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) )
            // InternalRangoMode.g:4866:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            {
            // InternalRangoMode.g:4866:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            // InternalRangoMode.g:4867:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 
            // InternalRangoMode.g:4868:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            // InternalRangoMode.g:4868:3: rule__GameMode__GravityAssignment_7_0_1
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


    // $ANTLR start "rule__GameMode__Group_10__0"
    // InternalRangoMode.g:4877:1: rule__GameMode__Group_10__0 : rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 ;
    public final void rule__GameMode__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4881:1: ( rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 )
            // InternalRangoMode.g:4882:2: rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__0"


    // $ANTLR start "rule__GameMode__Group_10__0__Impl"
    // InternalRangoMode.g:4889:1: rule__GameMode__Group_10__0__Impl : ( 'win' ) ;
    public final void rule__GameMode__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4893:1: ( ( 'win' ) )
            // InternalRangoMode.g:4894:1: ( 'win' )
            {
            // InternalRangoMode.g:4894:1: ( 'win' )
            // InternalRangoMode.g:4895:2: 'win'
            {
             before(grammarAccess.getGameModeAccess().getWinKeyword_10_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWinKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__0__Impl"


    // $ANTLR start "rule__GameMode__Group_10__1"
    // InternalRangoMode.g:4904:1: rule__GameMode__Group_10__1 : rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 ;
    public final void rule__GameMode__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4908:1: ( rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 )
            // InternalRangoMode.g:4909:2: rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__1"


    // $ANTLR start "rule__GameMode__Group_10__1__Impl"
    // InternalRangoMode.g:4916:1: rule__GameMode__Group_10__1__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4920:1: ( ( 'when' ) )
            // InternalRangoMode.g:4921:1: ( 'when' )
            {
            // InternalRangoMode.g:4921:1: ( 'when' )
            // InternalRangoMode.g:4922:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_10_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__1__Impl"


    // $ANTLR start "rule__GameMode__Group_10__2"
    // InternalRangoMode.g:4931:1: rule__GameMode__Group_10__2 : rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 ;
    public final void rule__GameMode__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4935:1: ( rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 )
            // InternalRangoMode.g:4936:2: rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3
            {
            pushFollow(FOLLOW_43);
            rule__GameMode__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__2"


    // $ANTLR start "rule__GameMode__Group_10__2__Impl"
    // InternalRangoMode.g:4943:1: rule__GameMode__Group_10__2__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) ;
    public final void rule__GameMode__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4947:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) )
            // InternalRangoMode.g:4948:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            {
            // InternalRangoMode.g:4948:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            // InternalRangoMode.g:4949:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_2()); 
            // InternalRangoMode.g:4950:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            // InternalRangoMode.g:4950:3: rule__GameMode__WinConditionsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__2__Impl"


    // $ANTLR start "rule__GameMode__Group_10__3"
    // InternalRangoMode.g:4958:1: rule__GameMode__Group_10__3 : rule__GameMode__Group_10__3__Impl ;
    public final void rule__GameMode__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4962:1: ( rule__GameMode__Group_10__3__Impl )
            // InternalRangoMode.g:4963:2: rule__GameMode__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__3"


    // $ANTLR start "rule__GameMode__Group_10__3__Impl"
    // InternalRangoMode.g:4969:1: rule__GameMode__Group_10__3__Impl : ( ( rule__GameMode__Group_10_3__0 )* ) ;
    public final void rule__GameMode__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4973:1: ( ( ( rule__GameMode__Group_10_3__0 )* ) )
            // InternalRangoMode.g:4974:1: ( ( rule__GameMode__Group_10_3__0 )* )
            {
            // InternalRangoMode.g:4974:1: ( ( rule__GameMode__Group_10_3__0 )* )
            // InternalRangoMode.g:4975:2: ( rule__GameMode__Group_10_3__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_10_3()); 
            // InternalRangoMode.g:4976:2: ( rule__GameMode__Group_10_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==67) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRangoMode.g:4976:3: rule__GameMode__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__GameMode__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10__3__Impl"


    // $ANTLR start "rule__GameMode__Group_10_3__0"
    // InternalRangoMode.g:4985:1: rule__GameMode__Group_10_3__0 : rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 ;
    public final void rule__GameMode__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4989:1: ( rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 )
            // InternalRangoMode.g:4990:2: rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_3__0"


    // $ANTLR start "rule__GameMode__Group_10_3__0__Impl"
    // InternalRangoMode.g:4997:1: rule__GameMode__Group_10_3__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5001:1: ( ( 'or' ) )
            // InternalRangoMode.g:5002:1: ( 'or' )
            {
            // InternalRangoMode.g:5002:1: ( 'or' )
            // InternalRangoMode.g:5003:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_10_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_3__0__Impl"


    // $ANTLR start "rule__GameMode__Group_10_3__1"
    // InternalRangoMode.g:5012:1: rule__GameMode__Group_10_3__1 : rule__GameMode__Group_10_3__1__Impl ;
    public final void rule__GameMode__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5016:1: ( rule__GameMode__Group_10_3__1__Impl )
            // InternalRangoMode.g:5017:2: rule__GameMode__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_3__1"


    // $ANTLR start "rule__GameMode__Group_10_3__1__Impl"
    // InternalRangoMode.g:5023:1: rule__GameMode__Group_10_3__1__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) ;
    public final void rule__GameMode__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5027:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) )
            // InternalRangoMode.g:5028:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            {
            // InternalRangoMode.g:5028:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            // InternalRangoMode.g:5029:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_3_1()); 
            // InternalRangoMode.g:5030:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            // InternalRangoMode.g:5030:3: rule__GameMode__WinConditionsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_3__1__Impl"


    // $ANTLR start "rule__GameMode__Group_14__0"
    // InternalRangoMode.g:5039:1: rule__GameMode__Group_14__0 : rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 ;
    public final void rule__GameMode__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5043:1: ( rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 )
            // InternalRangoMode.g:5044:2: rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__0"


    // $ANTLR start "rule__GameMode__Group_14__0__Impl"
    // InternalRangoMode.g:5051:1: rule__GameMode__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5055:1: ( ( 'or' ) )
            // InternalRangoMode.g:5056:1: ( 'or' )
            {
            // InternalRangoMode.g:5056:1: ( 'or' )
            // InternalRangoMode.g:5057:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_14_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__0__Impl"


    // $ANTLR start "rule__GameMode__Group_14__1"
    // InternalRangoMode.g:5066:1: rule__GameMode__Group_14__1 : rule__GameMode__Group_14__1__Impl ;
    public final void rule__GameMode__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5070:1: ( rule__GameMode__Group_14__1__Impl )
            // InternalRangoMode.g:5071:2: rule__GameMode__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__1"


    // $ANTLR start "rule__GameMode__Group_14__1__Impl"
    // InternalRangoMode.g:5077:1: rule__GameMode__Group_14__1__Impl : ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) ;
    public final void rule__GameMode__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5081:1: ( ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) )
            // InternalRangoMode.g:5082:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            {
            // InternalRangoMode.g:5082:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            // InternalRangoMode.g:5083:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14_1()); 
            // InternalRangoMode.g:5084:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            // InternalRangoMode.g:5084:3: rule__GameMode__LoseConditionsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__1__Impl"


    // $ANTLR start "rule__SingleLevel__Group__0"
    // InternalRangoMode.g:5093:1: rule__SingleLevel__Group__0 : rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 ;
    public final void rule__SingleLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5097:1: ( rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 )
            // InternalRangoMode.g:5098:2: rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalRangoMode.g:5105:1: rule__SingleLevel__Group__0__Impl : ( ( rule__SingleLevel__ArenaAssignment_0 ) ) ;
    public final void rule__SingleLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5109:1: ( ( ( rule__SingleLevel__ArenaAssignment_0 ) ) )
            // InternalRangoMode.g:5110:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            {
            // InternalRangoMode.g:5110:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            // InternalRangoMode.g:5111:2: ( rule__SingleLevel__ArenaAssignment_0 )
            {
             before(grammarAccess.getSingleLevelAccess().getArenaAssignment_0()); 
            // InternalRangoMode.g:5112:2: ( rule__SingleLevel__ArenaAssignment_0 )
            // InternalRangoMode.g:5112:3: rule__SingleLevel__ArenaAssignment_0
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
    // InternalRangoMode.g:5120:1: rule__SingleLevel__Group__1 : rule__SingleLevel__Group__1__Impl ;
    public final void rule__SingleLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5124:1: ( rule__SingleLevel__Group__1__Impl )
            // InternalRangoMode.g:5125:2: rule__SingleLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleLevel__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:5131:1: rule__SingleLevel__Group__1__Impl : ( ( rule__SingleLevel__SpawningAssignment_1 ) ) ;
    public final void rule__SingleLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5135:1: ( ( ( rule__SingleLevel__SpawningAssignment_1 ) ) )
            // InternalRangoMode.g:5136:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            {
            // InternalRangoMode.g:5136:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            // InternalRangoMode.g:5137:2: ( rule__SingleLevel__SpawningAssignment_1 )
            {
             before(grammarAccess.getSingleLevelAccess().getSpawningAssignment_1()); 
            // InternalRangoMode.g:5138:2: ( rule__SingleLevel__SpawningAssignment_1 )
            // InternalRangoMode.g:5138:3: rule__SingleLevel__SpawningAssignment_1
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


    // $ANTLR start "rule__Level__Group__0"
    // InternalRangoMode.g:5147:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5151:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRangoMode.g:5152:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:5159:1: rule__Level__Group__0__Impl : ( 'level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5163:1: ( ( 'level' ) )
            // InternalRangoMode.g:5164:1: ( 'level' )
            {
            // InternalRangoMode.g:5164:1: ( 'level' )
            // InternalRangoMode.g:5165:2: 'level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalRangoMode.g:5174:1: rule__Level__Group__1 : rule__Level__Group__1__Impl rule__Level__Group__2 ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5178:1: ( rule__Level__Group__1__Impl rule__Level__Group__2 )
            // InternalRangoMode.g:5179:2: rule__Level__Group__1__Impl rule__Level__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:5186:1: rule__Level__Group__1__Impl : ( ( rule__Level__TitleAssignment_1 )? ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5190:1: ( ( ( rule__Level__TitleAssignment_1 )? ) )
            // InternalRangoMode.g:5191:1: ( ( rule__Level__TitleAssignment_1 )? )
            {
            // InternalRangoMode.g:5191:1: ( ( rule__Level__TitleAssignment_1 )? )
            // InternalRangoMode.g:5192:2: ( rule__Level__TitleAssignment_1 )?
            {
             before(grammarAccess.getLevelAccess().getTitleAssignment_1()); 
            // InternalRangoMode.g:5193:2: ( rule__Level__TitleAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:5193:3: rule__Level__TitleAssignment_1
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
    // InternalRangoMode.g:5201:1: rule__Level__Group__2 : rule__Level__Group__2__Impl rule__Level__Group__3 ;
    public final void rule__Level__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5205:1: ( rule__Level__Group__2__Impl rule__Level__Group__3 )
            // InternalRangoMode.g:5206:2: rule__Level__Group__2__Impl rule__Level__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5213:1: rule__Level__Group__2__Impl : ( '{' ) ;
    public final void rule__Level__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5217:1: ( ( '{' ) )
            // InternalRangoMode.g:5218:1: ( '{' )
            {
            // InternalRangoMode.g:5218:1: ( '{' )
            // InternalRangoMode.g:5219:2: '{'
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
    // InternalRangoMode.g:5228:1: rule__Level__Group__3 : rule__Level__Group__3__Impl rule__Level__Group__4 ;
    public final void rule__Level__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5232:1: ( rule__Level__Group__3__Impl rule__Level__Group__4 )
            // InternalRangoMode.g:5233:2: rule__Level__Group__3__Impl rule__Level__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalRangoMode.g:5240:1: rule__Level__Group__3__Impl : ( ( rule__Level__ArenaAssignment_3 ) ) ;
    public final void rule__Level__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5244:1: ( ( ( rule__Level__ArenaAssignment_3 ) ) )
            // InternalRangoMode.g:5245:1: ( ( rule__Level__ArenaAssignment_3 ) )
            {
            // InternalRangoMode.g:5245:1: ( ( rule__Level__ArenaAssignment_3 ) )
            // InternalRangoMode.g:5246:2: ( rule__Level__ArenaAssignment_3 )
            {
             before(grammarAccess.getLevelAccess().getArenaAssignment_3()); 
            // InternalRangoMode.g:5247:2: ( rule__Level__ArenaAssignment_3 )
            // InternalRangoMode.g:5247:3: rule__Level__ArenaAssignment_3
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
    // InternalRangoMode.g:5255:1: rule__Level__Group__4 : rule__Level__Group__4__Impl rule__Level__Group__5 ;
    public final void rule__Level__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5259:1: ( rule__Level__Group__4__Impl rule__Level__Group__5 )
            // InternalRangoMode.g:5260:2: rule__Level__Group__4__Impl rule__Level__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:5267:1: rule__Level__Group__4__Impl : ( ( rule__Level__SpawningAssignment_4 ) ) ;
    public final void rule__Level__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5271:1: ( ( ( rule__Level__SpawningAssignment_4 ) ) )
            // InternalRangoMode.g:5272:1: ( ( rule__Level__SpawningAssignment_4 ) )
            {
            // InternalRangoMode.g:5272:1: ( ( rule__Level__SpawningAssignment_4 ) )
            // InternalRangoMode.g:5273:2: ( rule__Level__SpawningAssignment_4 )
            {
             before(grammarAccess.getLevelAccess().getSpawningAssignment_4()); 
            // InternalRangoMode.g:5274:2: ( rule__Level__SpawningAssignment_4 )
            // InternalRangoMode.g:5274:3: rule__Level__SpawningAssignment_4
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
    // InternalRangoMode.g:5282:1: rule__Level__Group__5 : rule__Level__Group__5__Impl ;
    public final void rule__Level__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5286:1: ( rule__Level__Group__5__Impl )
            // InternalRangoMode.g:5287:2: rule__Level__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:5293:1: rule__Level__Group__5__Impl : ( '}' ) ;
    public final void rule__Level__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5297:1: ( ( '}' ) )
            // InternalRangoMode.g:5298:1: ( '}' )
            {
            // InternalRangoMode.g:5298:1: ( '}' )
            // InternalRangoMode.g:5299:2: '}'
            {
             before(grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SpeedBonus__Group__0"
    // InternalRangoMode.g:5309:1: rule__SpeedBonus__Group__0 : rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 ;
    public final void rule__SpeedBonus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5313:1: ( rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 )
            // InternalRangoMode.g:5314:2: rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1
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
    // InternalRangoMode.g:5321:1: rule__SpeedBonus__Group__0__Impl : ( () ) ;
    public final void rule__SpeedBonus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5325:1: ( ( () ) )
            // InternalRangoMode.g:5326:1: ( () )
            {
            // InternalRangoMode.g:5326:1: ( () )
            // InternalRangoMode.g:5327:2: ()
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 
            // InternalRangoMode.g:5328:2: ()
            // InternalRangoMode.g:5328:3: 
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
    // InternalRangoMode.g:5336:1: rule__SpeedBonus__Group__1 : rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 ;
    public final void rule__SpeedBonus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5340:1: ( rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 )
            // InternalRangoMode.g:5341:2: rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalRangoMode.g:5348:1: rule__SpeedBonus__Group__1__Impl : ( 'speed' ) ;
    public final void rule__SpeedBonus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5352:1: ( ( 'speed' ) )
            // InternalRangoMode.g:5353:1: ( 'speed' )
            {
            // InternalRangoMode.g:5353:1: ( 'speed' )
            // InternalRangoMode.g:5354:2: 'speed'
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
    // InternalRangoMode.g:5363:1: rule__SpeedBonus__Group__2 : rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 ;
    public final void rule__SpeedBonus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5367:1: ( rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 )
            // InternalRangoMode.g:5368:2: rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5375:1: rule__SpeedBonus__Group__2__Impl : ( 'bonus' ) ;
    public final void rule__SpeedBonus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5379:1: ( ( 'bonus' ) )
            // InternalRangoMode.g:5380:1: ( 'bonus' )
            {
            // InternalRangoMode.g:5380:1: ( 'bonus' )
            // InternalRangoMode.g:5381:2: 'bonus'
            {
             before(grammarAccess.getSpeedBonusAccess().getBonusKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:5390:1: rule__SpeedBonus__Group__3 : rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 ;
    public final void rule__SpeedBonus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5394:1: ( rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 )
            // InternalRangoMode.g:5395:2: rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5402:1: rule__SpeedBonus__Group__3__Impl : ( ( rule__SpeedBonus__Group_3__0 )? ) ;
    public final void rule__SpeedBonus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5406:1: ( ( ( rule__SpeedBonus__Group_3__0 )? ) )
            // InternalRangoMode.g:5407:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            {
            // InternalRangoMode.g:5407:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            // InternalRangoMode.g:5408:2: ( rule__SpeedBonus__Group_3__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_3()); 
            // InternalRangoMode.g:5409:2: ( rule__SpeedBonus__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:5409:3: rule__SpeedBonus__Group_3__0
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
    // InternalRangoMode.g:5417:1: rule__SpeedBonus__Group__4 : rule__SpeedBonus__Group__4__Impl ;
    public final void rule__SpeedBonus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5421:1: ( rule__SpeedBonus__Group__4__Impl )
            // InternalRangoMode.g:5422:2: rule__SpeedBonus__Group__4__Impl
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
    // InternalRangoMode.g:5428:1: rule__SpeedBonus__Group__4__Impl : ( ( rule__SpeedBonus__Group_4__0 )? ) ;
    public final void rule__SpeedBonus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5432:1: ( ( ( rule__SpeedBonus__Group_4__0 )? ) )
            // InternalRangoMode.g:5433:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            {
            // InternalRangoMode.g:5433:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            // InternalRangoMode.g:5434:2: ( rule__SpeedBonus__Group_4__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_4()); 
            // InternalRangoMode.g:5435:2: ( rule__SpeedBonus__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:5435:3: rule__SpeedBonus__Group_4__0
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
    // InternalRangoMode.g:5444:1: rule__SpeedBonus__Group_3__0 : rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 ;
    public final void rule__SpeedBonus__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5448:1: ( rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 )
            // InternalRangoMode.g:5449:2: rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5456:1: rule__SpeedBonus__Group_3__0__Impl : ( 'up' ) ;
    public final void rule__SpeedBonus__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5460:1: ( ( 'up' ) )
            // InternalRangoMode.g:5461:1: ( 'up' )
            {
            // InternalRangoMode.g:5461:1: ( 'up' )
            // InternalRangoMode.g:5462:2: 'up'
            {
             before(grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:5471:1: rule__SpeedBonus__Group_3__1 : rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 ;
    public final void rule__SpeedBonus__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5475:1: ( rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 )
            // InternalRangoMode.g:5476:2: rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2
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
    // InternalRangoMode.g:5483:1: rule__SpeedBonus__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__SpeedBonus__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5487:1: ( ( 'to' ) )
            // InternalRangoMode.g:5488:1: ( 'to' )
            {
            // InternalRangoMode.g:5488:1: ( 'to' )
            // InternalRangoMode.g:5489:2: 'to'
            {
             before(grammarAccess.getSpeedBonusAccess().getToKeyword_3_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:5498:1: rule__SpeedBonus__Group_3__2 : rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 ;
    public final void rule__SpeedBonus__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5502:1: ( rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 )
            // InternalRangoMode.g:5503:2: rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalRangoMode.g:5510:1: rule__SpeedBonus__Group_3__2__Impl : ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) ;
    public final void rule__SpeedBonus__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5514:1: ( ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) )
            // InternalRangoMode.g:5515:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            {
            // InternalRangoMode.g:5515:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            // InternalRangoMode.g:5516:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 
            // InternalRangoMode.g:5517:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            // InternalRangoMode.g:5517:3: rule__SpeedBonus__MaxFactorAssignment_3_2
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
    // InternalRangoMode.g:5525:1: rule__SpeedBonus__Group_3__3 : rule__SpeedBonus__Group_3__3__Impl ;
    public final void rule__SpeedBonus__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5529:1: ( rule__SpeedBonus__Group_3__3__Impl )
            // InternalRangoMode.g:5530:2: rule__SpeedBonus__Group_3__3__Impl
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
    // InternalRangoMode.g:5536:1: rule__SpeedBonus__Group_3__3__Impl : ( 'times' ) ;
    public final void rule__SpeedBonus__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5540:1: ( ( 'times' ) )
            // InternalRangoMode.g:5541:1: ( 'times' )
            {
            // InternalRangoMode.g:5541:1: ( 'times' )
            // InternalRangoMode.g:5542:2: 'times'
            {
             before(grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalRangoMode.g:5552:1: rule__SpeedBonus__Group_4__0 : rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 ;
    public final void rule__SpeedBonus__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5556:1: ( rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 )
            // InternalRangoMode.g:5557:2: rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1
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
    // InternalRangoMode.g:5564:1: rule__SpeedBonus__Group_4__0__Impl : ( 'over' ) ;
    public final void rule__SpeedBonus__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5568:1: ( ( 'over' ) )
            // InternalRangoMode.g:5569:1: ( 'over' )
            {
            // InternalRangoMode.g:5569:1: ( 'over' )
            // InternalRangoMode.g:5570:2: 'over'
            {
             before(grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:5579:1: rule__SpeedBonus__Group_4__1 : rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 ;
    public final void rule__SpeedBonus__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5583:1: ( rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 )
            // InternalRangoMode.g:5584:2: rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2
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
    // InternalRangoMode.g:5591:1: rule__SpeedBonus__Group_4__1__Impl : ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) ;
    public final void rule__SpeedBonus__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5595:1: ( ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) )
            // InternalRangoMode.g:5596:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            {
            // InternalRangoMode.g:5596:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            // InternalRangoMode.g:5597:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 
            // InternalRangoMode.g:5598:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            // InternalRangoMode.g:5598:3: rule__SpeedBonus__DurationAssignment_4_1
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
    // InternalRangoMode.g:5606:1: rule__SpeedBonus__Group_4__2 : rule__SpeedBonus__Group_4__2__Impl ;
    public final void rule__SpeedBonus__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5610:1: ( rule__SpeedBonus__Group_4__2__Impl )
            // InternalRangoMode.g:5611:2: rule__SpeedBonus__Group_4__2__Impl
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
    // InternalRangoMode.g:5617:1: rule__SpeedBonus__Group_4__2__Impl : ( 's' ) ;
    public final void rule__SpeedBonus__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5621:1: ( ( 's' ) )
            // InternalRangoMode.g:5622:1: ( 's' )
            {
            // InternalRangoMode.g:5622:1: ( 's' )
            // InternalRangoMode.g:5623:2: 's'
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
    // InternalRangoMode.g:5633:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5637:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5638:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
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
    // InternalRangoMode.g:5645:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5649:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5650:1: ( 'arena' )
            {
            // InternalRangoMode.g:5650:1: ( 'arena' )
            // InternalRangoMode.g:5651:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:5660:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5664:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5665:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5672:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5676:1: ( ( '{' ) )
            // InternalRangoMode.g:5677:1: ( '{' )
            {
            // InternalRangoMode.g:5677:1: ( '{' )
            // InternalRangoMode.g:5678:2: '{'
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
    // InternalRangoMode.g:5687:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5691:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5692:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
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
    // InternalRangoMode.g:5699:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5703:1: ( ( 'background' ) )
            // InternalRangoMode.g:5704:1: ( 'background' )
            {
            // InternalRangoMode.g:5704:1: ( 'background' )
            // InternalRangoMode.g:5705:2: 'background'
            {
             before(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:5714:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5718:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5719:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5726:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5730:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5731:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5731:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5732:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5733:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5733:3: rule__Arena__BackgroundAssignment_3
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
    // InternalRangoMode.g:5741:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5745:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5746:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5753:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__Group_4__0 )? ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5757:1: ( ( ( rule__Arena__Group_4__0 )? ) )
            // InternalRangoMode.g:5758:1: ( ( rule__Arena__Group_4__0 )? )
            {
            // InternalRangoMode.g:5758:1: ( ( rule__Arena__Group_4__0 )? )
            // InternalRangoMode.g:5759:2: ( rule__Arena__Group_4__0 )?
            {
             before(grammarAccess.getArenaAccess().getGroup_4()); 
            // InternalRangoMode.g:5760:2: ( rule__Arena__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:5760:3: rule__Arena__Group_4__0
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
    // InternalRangoMode.g:5768:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5772:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5773:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5780:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5784:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5785:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5785:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5786:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5787:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==80||LA30_0==83||LA30_0==86) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRangoMode.g:5787:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalRangoMode.g:5795:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5799:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5800:2: rule__Arena__Group__6__Impl
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
    // InternalRangoMode.g:5806:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5810:1: ( ( '}' ) )
            // InternalRangoMode.g:5811:1: ( '}' )
            {
            // InternalRangoMode.g:5811:1: ( '}' )
            // InternalRangoMode.g:5812:2: '}'
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
    // InternalRangoMode.g:5822:1: rule__Arena__Group_4__0 : rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 ;
    public final void rule__Arena__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5826:1: ( rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 )
            // InternalRangoMode.g:5827:2: rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:5834:1: rule__Arena__Group_4__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5838:1: ( ( 'player' ) )
            // InternalRangoMode.g:5839:1: ( 'player' )
            {
            // InternalRangoMode.g:5839:1: ( 'player' )
            // InternalRangoMode.g:5840:2: 'player'
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
    // InternalRangoMode.g:5849:1: rule__Arena__Group_4__1 : rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 ;
    public final void rule__Arena__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5853:1: ( rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 )
            // InternalRangoMode.g:5854:2: rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2
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
    // InternalRangoMode.g:5861:1: rule__Arena__Group_4__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5865:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5866:1: ( 'starts' )
            {
            // InternalRangoMode.g:5866:1: ( 'starts' )
            // InternalRangoMode.g:5867:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:5876:1: rule__Arena__Group_4__2 : rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 ;
    public final void rule__Arena__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5880:1: ( rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 )
            // InternalRangoMode.g:5881:2: rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3
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
    // InternalRangoMode.g:5888:1: rule__Arena__Group_4__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5892:1: ( ( 'at' ) )
            // InternalRangoMode.g:5893:1: ( 'at' )
            {
            // InternalRangoMode.g:5893:1: ( 'at' )
            // InternalRangoMode.g:5894:2: 'at'
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
    // InternalRangoMode.g:5903:1: rule__Arena__Group_4__3 : rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 ;
    public final void rule__Arena__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5907:1: ( rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 )
            // InternalRangoMode.g:5908:2: rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:5915:1: rule__Arena__Group_4__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) ;
    public final void rule__Arena__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5919:1: ( ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) )
            // InternalRangoMode.g:5920:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            {
            // InternalRangoMode.g:5920:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            // InternalRangoMode.g:5921:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_3()); 
            // InternalRangoMode.g:5922:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            // InternalRangoMode.g:5922:3: rule__Arena__PlayerStartAssignment_4_3
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
    // InternalRangoMode.g:5930:1: rule__Arena__Group_4__4 : rule__Arena__Group_4__4__Impl ;
    public final void rule__Arena__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5934:1: ( rule__Arena__Group_4__4__Impl )
            // InternalRangoMode.g:5935:2: rule__Arena__Group_4__4__Impl
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
    // InternalRangoMode.g:5941:1: rule__Arena__Group_4__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5945:1: ( ( '%' ) )
            // InternalRangoMode.g:5946:1: ( '%' )
            {
            // InternalRangoMode.g:5946:1: ( '%' )
            // InternalRangoMode.g:5947:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_4()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:5957:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5961:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5962:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:5969:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5973:1: ( ( 'at' ) )
            // InternalRangoMode.g:5974:1: ( 'at' )
            {
            // InternalRangoMode.g:5974:1: ( 'at' )
            // InternalRangoMode.g:5975:2: 'at'
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
    // InternalRangoMode.g:5984:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5988:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5989:2: rule__At__Group__1__Impl rule__At__Group__2
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
    // InternalRangoMode.g:5996:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6000:1: ( ( '(' ) )
            // InternalRangoMode.g:6001:1: ( '(' )
            {
            // InternalRangoMode.g:6001:1: ( '(' )
            // InternalRangoMode.g:6002:2: '('
            {
             before(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6011:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6015:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:6016:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:6023:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6027:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:6028:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:6028:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:6029:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:6030:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:6030:3: rule__At__XAssignment_2
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
    // InternalRangoMode.g:6038:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6042:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:6043:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_57);
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
    // InternalRangoMode.g:6050:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6054:1: ( ( '%' ) )
            // InternalRangoMode.g:6055:1: ( '%' )
            {
            // InternalRangoMode.g:6055:1: ( '%' )
            // InternalRangoMode.g:6056:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6065:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6069:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:6070:2: rule__At__Group__4__Impl rule__At__Group__5
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
    // InternalRangoMode.g:6077:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6081:1: ( ( ',' ) )
            // InternalRangoMode.g:6082:1: ( ',' )
            {
            // InternalRangoMode.g:6082:1: ( ',' )
            // InternalRangoMode.g:6083:2: ','
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
    // InternalRangoMode.g:6092:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6096:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:6097:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:6104:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6108:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:6109:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:6109:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:6110:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:6111:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:6111:3: rule__At__YAssignment_5
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
    // InternalRangoMode.g:6119:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6123:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:6124:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_58);
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
    // InternalRangoMode.g:6131:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6135:1: ( ( '%' ) )
            // InternalRangoMode.g:6136:1: ( '%' )
            {
            // InternalRangoMode.g:6136:1: ( '%' )
            // InternalRangoMode.g:6137:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6146:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6150:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:6151:2: rule__At__Group__7__Impl
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
    // InternalRangoMode.g:6157:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6161:1: ( ( ')' ) )
            // InternalRangoMode.g:6162:1: ( ')' )
            {
            // InternalRangoMode.g:6162:1: ( ')' )
            // InternalRangoMode.g:6163:2: ')'
            {
             before(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6173:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6177:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:6178:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRangoMode.g:6185:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6189:1: ( ( 'block' ) )
            // InternalRangoMode.g:6190:1: ( 'block' )
            {
            // InternalRangoMode.g:6190:1: ( 'block' )
            // InternalRangoMode.g:6191:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:6200:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6204:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:6205:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRangoMode.g:6212:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6216:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6217:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6217:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:6218:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6219:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:6219:3: rule__Block__NameAssignment_1
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
    // InternalRangoMode.g:6227:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6231:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:6232:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:6239:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6243:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6244:1: ( ruleAt )
            {
            // InternalRangoMode.g:6244:1: ( ruleAt )
            // InternalRangoMode.g:6245:2: ruleAt
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
    // InternalRangoMode.g:6254:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6258:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:6259:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalRangoMode.g:6266:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6270:1: ( ( 'size' ) )
            // InternalRangoMode.g:6271:1: ( 'size' )
            {
            // InternalRangoMode.g:6271:1: ( 'size' )
            // InternalRangoMode.g:6272:2: 'size'
            {
             before(grammarAccess.getBlockAccess().getSizeKeyword_3()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:6281:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6285:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:6286:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:6293:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6297:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:6298:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:6298:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:6299:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:6300:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:6300:3: rule__Block__WidthAssignment_4
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
    // InternalRangoMode.g:6308:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6312:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:6313:2: rule__Block__Group__5__Impl rule__Block__Group__6
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
    // InternalRangoMode.g:6320:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6324:1: ( ( 'by' ) )
            // InternalRangoMode.g:6325:1: ( 'by' )
            {
            // InternalRangoMode.g:6325:1: ( 'by' )
            // InternalRangoMode.g:6326:2: 'by'
            {
             before(grammarAccess.getBlockAccess().getByKeyword_5()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:6335:1: rule__Block__Group__6 : rule__Block__Group__6__Impl ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6339:1: ( rule__Block__Group__6__Impl )
            // InternalRangoMode.g:6340:2: rule__Block__Group__6__Impl
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
    // InternalRangoMode.g:6346:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6350:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:6351:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:6351:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:6352:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:6353:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:6353:3: rule__Block__HeightAssignment_6
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
    // InternalRangoMode.g:6362:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6366:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:6367:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
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
    // InternalRangoMode.g:6374:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6378:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6379:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6379:1: ( 'jumppad' )
            // InternalRangoMode.g:6380:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRangoMode.g:6389:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6393:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6394:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
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
    // InternalRangoMode.g:6401:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6405:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6406:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6406:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6407:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6408:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6408:3: rule__JumpPad__NameAssignment_1
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
    // InternalRangoMode.g:6416:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6420:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6421:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalRangoMode.g:6428:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6432:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6433:1: ( ruleAt )
            {
            // InternalRangoMode.g:6433:1: ( ruleAt )
            // InternalRangoMode.g:6434:2: ruleAt
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
    // InternalRangoMode.g:6443:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6447:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6448:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
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
    // InternalRangoMode.g:6455:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6459:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6460:1: ( 'launch' )
            {
            // InternalRangoMode.g:6460:1: ( 'launch' )
            // InternalRangoMode.g:6461:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRangoMode.g:6470:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6474:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6475:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
            {
            pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6482:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6486:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6487:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6487:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6488:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6489:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6489:3: rule__JumpPad__LaunchAssignment_4
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
    // InternalRangoMode.g:6497:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6501:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6502:2: rule__JumpPad__Group__5__Impl
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
    // InternalRangoMode.g:6508:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6512:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6513:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6513:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6514:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6515:2: ( rule__JumpPad__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==85) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRangoMode.g:6515:3: rule__JumpPad__Group_5__0
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
    // InternalRangoMode.g:6524:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6528:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6529:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalRangoMode.g:6536:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6540:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6541:1: ( 'affects' )
            {
            // InternalRangoMode.g:6541:1: ( 'affects' )
            // InternalRangoMode.g:6542:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRangoMode.g:6551:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6555:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6556:2: rule__JumpPad__Group_5__1__Impl
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
    // InternalRangoMode.g:6562:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6566:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6567:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6567:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6568:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6569:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6569:3: rule__JumpPad__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6578:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6582:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6583:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
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
    // InternalRangoMode.g:6590:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6594:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6595:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6595:1: ( 'teleporter' )
            // InternalRangoMode.g:6596:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRangoMode.g:6605:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6609:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6610:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
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
    // InternalRangoMode.g:6617:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6621:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6622:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6622:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6623:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6624:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6624:3: rule__Teleporter__NameAssignment_1
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
    // InternalRangoMode.g:6632:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6636:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6637:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:6644:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6648:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6649:1: ( ruleAt )
            {
            // InternalRangoMode.g:6649:1: ( ruleAt )
            // InternalRangoMode.g:6650:2: ruleAt
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
    // InternalRangoMode.g:6659:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6663:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6664:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
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
    // InternalRangoMode.g:6671:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6675:1: ( ( 'to' ) )
            // InternalRangoMode.g:6676:1: ( 'to' )
            {
            // InternalRangoMode.g:6676:1: ( 'to' )
            // InternalRangoMode.g:6677:2: 'to'
            {
             before(grammarAccess.getTeleporterAccess().getToKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:6686:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6690:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6691:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
            {
            pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6698:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6702:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6703:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6703:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6704:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6705:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6705:3: rule__Teleporter__TargetAssignment_4
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
    // InternalRangoMode.g:6713:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6717:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6718:2: rule__Teleporter__Group__5__Impl
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
    // InternalRangoMode.g:6724:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6728:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6729:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6729:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6730:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6731:2: ( rule__Teleporter__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==85) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:6731:3: rule__Teleporter__Group_5__0
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
    // InternalRangoMode.g:6740:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6744:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6745:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalRangoMode.g:6752:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6756:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6757:1: ( 'affects' )
            {
            // InternalRangoMode.g:6757:1: ( 'affects' )
            // InternalRangoMode.g:6758:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRangoMode.g:6767:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6771:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6772:2: rule__Teleporter__Group_5__1__Impl
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
    // InternalRangoMode.g:6778:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6782:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6783:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6783:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6784:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6785:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6785:3: rule__Teleporter__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6794:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6798:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6799:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
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
    // InternalRangoMode.g:6806:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6810:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6811:1: ( 'layout' )
            {
            // InternalRangoMode.g:6811:1: ( 'layout' )
            // InternalRangoMode.g:6812:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRangoMode.g:6821:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6825:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6826:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
            {
            pushFollow(FOLLOW_64);
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
    // InternalRangoMode.g:6833:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6837:1: ( ( '{' ) )
            // InternalRangoMode.g:6838:1: ( '{' )
            {
            // InternalRangoMode.g:6838:1: ( '{' )
            // InternalRangoMode.g:6839:2: '{'
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
    // InternalRangoMode.g:6848:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6852:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6853:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
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
    // InternalRangoMode.g:6860:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6864:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6865:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6865:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6866:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6866:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6867:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6868:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6868:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_65);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6871:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6872:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6873:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_ID)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRangoMode.g:6873:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__FixedLayout__SpawnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalRangoMode.g:6882:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6886:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6887:2: rule__FixedLayout__Group__3__Impl
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
    // InternalRangoMode.g:6893:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6897:1: ( ( '}' ) )
            // InternalRangoMode.g:6898:1: ( '}' )
            {
            // InternalRangoMode.g:6898:1: ( '}' )
            // InternalRangoMode.g:6899:2: '}'
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
    // InternalRangoMode.g:6909:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6913:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:6914:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalRangoMode.g:6921:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6925:1: ( ( 'waves' ) )
            // InternalRangoMode.g:6926:1: ( 'waves' )
            {
            // InternalRangoMode.g:6926:1: ( 'waves' )
            // InternalRangoMode.g:6927:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:6936:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6940:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:6941:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
            {
            pushFollow(FOLLOW_66);
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
    // InternalRangoMode.g:6948:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6952:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:6953:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:6953:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:6954:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:6955:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==105) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:6955:3: rule__WaveSchedule__Group_1__0
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
    // InternalRangoMode.g:6963:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6967:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:6968:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
            {
            pushFollow(FOLLOW_67);
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
    // InternalRangoMode.g:6975:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6979:1: ( ( '{' ) )
            // InternalRangoMode.g:6980:1: ( '{' )
            {
            // InternalRangoMode.g:6980:1: ( '{' )
            // InternalRangoMode.g:6981:2: '{'
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
    // InternalRangoMode.g:6990:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6994:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:6995:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
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
    // InternalRangoMode.g:7002:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7006:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:7007:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7007:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:7008:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:7008:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:7009:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:7010:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:7010:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_68);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:7013:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:7014:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:7015:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==90) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRangoMode.g:7015:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__WaveSchedule__WavesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalRangoMode.g:7024:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7028:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:7029:2: rule__WaveSchedule__Group__4__Impl
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
    // InternalRangoMode.g:7035:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7039:1: ( ( '}' ) )
            // InternalRangoMode.g:7040:1: ( '}' )
            {
            // InternalRangoMode.g:7040:1: ( '}' )
            // InternalRangoMode.g:7041:2: '}'
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
    // InternalRangoMode.g:7051:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7055:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:7056:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalRangoMode.g:7063:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7067:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:7068:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:7068:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:7069:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:7070:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:7070:3: rule__WaveSchedule__LoopAssignment_1_0
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
    // InternalRangoMode.g:7078:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7082:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:7083:2: rule__WaveSchedule__Group_1__1__Impl
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
    // InternalRangoMode.g:7089:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7093:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:7094:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:7094:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:7095:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:7096:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==89) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:7096:3: rule__WaveSchedule__Group_1_1__0
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
    // InternalRangoMode.g:7105:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7109:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:7110:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:7117:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7121:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:7122:1: ( 'escalate' )
            {
            // InternalRangoMode.g:7122:1: ( 'escalate' )
            // InternalRangoMode.g:7123:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRangoMode.g:7132:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7136:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:7137:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
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
    // InternalRangoMode.g:7144:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7148:1: ( ( 'by' ) )
            // InternalRangoMode.g:7149:1: ( 'by' )
            {
            // InternalRangoMode.g:7149:1: ( 'by' )
            // InternalRangoMode.g:7150:2: 'by'
            {
             before(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:7159:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7163:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:7164:2: rule__WaveSchedule__Group_1_1__2__Impl
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
    // InternalRangoMode.g:7170:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7174:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:7175:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:7175:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:7176:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:7177:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:7177:3: rule__WaveSchedule__EscalationAssignment_1_1_2
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
    // InternalRangoMode.g:7186:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7190:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:7191:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalRangoMode.g:7198:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7202:1: ( ( 'wave' ) )
            // InternalRangoMode.g:7203:1: ( 'wave' )
            {
            // InternalRangoMode.g:7203:1: ( 'wave' )
            // InternalRangoMode.g:7204:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:7213:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7217:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:7218:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
            {
            pushFollow(FOLLOW_70);
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
    // InternalRangoMode.g:7225:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7229:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:7230:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:7230:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:7231:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:7232:2: ( rule__Wave__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==91) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:7232:3: rule__Wave__Group_1__0
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
    // InternalRangoMode.g:7240:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7244:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:7245:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
            {
            pushFollow(FOLLOW_64);
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
    // InternalRangoMode.g:7252:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7256:1: ( ( '{' ) )
            // InternalRangoMode.g:7257:1: ( '{' )
            {
            // InternalRangoMode.g:7257:1: ( '{' )
            // InternalRangoMode.g:7258:2: '{'
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
    // InternalRangoMode.g:7267:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7271:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:7272:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
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
    // InternalRangoMode.g:7279:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7283:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:7284:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7284:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:7285:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:7285:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:7286:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7287:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:7287:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_65);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:7290:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:7291:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7292:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_INT && LA38_0<=RULE_ID)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRangoMode.g:7292:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__Wave__SpawnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalRangoMode.g:7301:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7305:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:7306:2: rule__Wave__Group__4__Impl
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
    // InternalRangoMode.g:7312:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7316:1: ( ( '}' ) )
            // InternalRangoMode.g:7317:1: ( '}' )
            {
            // InternalRangoMode.g:7317:1: ( '}' )
            // InternalRangoMode.g:7318:2: '}'
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
    // InternalRangoMode.g:7328:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7332:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:7333:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
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
    // InternalRangoMode.g:7340:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7344:1: ( ( 'after' ) )
            // InternalRangoMode.g:7345:1: ( 'after' )
            {
            // InternalRangoMode.g:7345:1: ( 'after' )
            // InternalRangoMode.g:7346:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:7355:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7359:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:7360:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
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
    // InternalRangoMode.g:7367:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7371:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:7372:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7372:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:7373:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:7374:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:7374:3: rule__Wave__DelayAssignment_1_1
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
    // InternalRangoMode.g:7382:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7386:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7387:2: rule__Wave__Group_1__2__Impl
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
    // InternalRangoMode.g:7393:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7397:1: ( ( 's' ) )
            // InternalRangoMode.g:7398:1: ( 's' )
            {
            // InternalRangoMode.g:7398:1: ( 's' )
            // InternalRangoMode.g:7399:2: 's'
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
    // InternalRangoMode.g:7409:1: rule__EnemySpawn__Group__0 : rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 ;
    public final void rule__EnemySpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7413:1: ( rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 )
            // InternalRangoMode.g:7414:2: rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalRangoMode.g:7421:1: rule__EnemySpawn__Group__0__Impl : ( ( rule__EnemySpawn__Group_0__0 )? ) ;
    public final void rule__EnemySpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7425:1: ( ( ( rule__EnemySpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7426:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7426:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            // InternalRangoMode.g:7427:2: ( rule__EnemySpawn__Group_0__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7428:2: ( rule__EnemySpawn__Group_0__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRangoMode.g:7428:3: rule__EnemySpawn__Group_0__0
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
    // InternalRangoMode.g:7436:1: rule__EnemySpawn__Group__1 : rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 ;
    public final void rule__EnemySpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7440:1: ( rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 )
            // InternalRangoMode.g:7441:2: rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:7448:1: rule__EnemySpawn__Group__1__Impl : ( ( rule__EnemySpawn__TypeAssignment_1 ) ) ;
    public final void rule__EnemySpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7452:1: ( ( ( rule__EnemySpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7453:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7453:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7454:2: ( rule__EnemySpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7455:2: ( rule__EnemySpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7455:3: rule__EnemySpawn__TypeAssignment_1
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
    // InternalRangoMode.g:7463:1: rule__EnemySpawn__Group__2 : rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 ;
    public final void rule__EnemySpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7467:1: ( rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 )
            // InternalRangoMode.g:7468:2: rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3
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
    // InternalRangoMode.g:7475:1: rule__EnemySpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__EnemySpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7479:1: ( ( 'size' ) )
            // InternalRangoMode.g:7480:1: ( 'size' )
            {
            // InternalRangoMode.g:7480:1: ( 'size' )
            // InternalRangoMode.g:7481:2: 'size'
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:7490:1: rule__EnemySpawn__Group__3 : rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 ;
    public final void rule__EnemySpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7494:1: ( rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 )
            // InternalRangoMode.g:7495:2: rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4
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
    // InternalRangoMode.g:7502:1: rule__EnemySpawn__Group__3__Impl : ( ( rule__EnemySpawn__SizeAssignment_3 ) ) ;
    public final void rule__EnemySpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7506:1: ( ( ( rule__EnemySpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7507:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7507:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7508:2: ( rule__EnemySpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7509:2: ( rule__EnemySpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7509:3: rule__EnemySpawn__SizeAssignment_3
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
    // InternalRangoMode.g:7517:1: rule__EnemySpawn__Group__4 : rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 ;
    public final void rule__EnemySpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7521:1: ( rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 )
            // InternalRangoMode.g:7522:2: rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5
            {
            pushFollow(FOLLOW_71);
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
    // InternalRangoMode.g:7529:1: rule__EnemySpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__EnemySpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7533:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7534:1: ( ruleAt )
            {
            // InternalRangoMode.g:7534:1: ( ruleAt )
            // InternalRangoMode.g:7535:2: ruleAt
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
    // InternalRangoMode.g:7544:1: rule__EnemySpawn__Group__5 : rule__EnemySpawn__Group__5__Impl ;
    public final void rule__EnemySpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7548:1: ( rule__EnemySpawn__Group__5__Impl )
            // InternalRangoMode.g:7549:2: rule__EnemySpawn__Group__5__Impl
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
    // InternalRangoMode.g:7555:1: rule__EnemySpawn__Group__5__Impl : ( ( rule__EnemySpawn__Group_5__0 )? ) ;
    public final void rule__EnemySpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7559:1: ( ( ( rule__EnemySpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7560:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7560:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            // InternalRangoMode.g:7561:2: ( rule__EnemySpawn__Group_5__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7562:2: ( rule__EnemySpawn__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==92) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:7562:3: rule__EnemySpawn__Group_5__0
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
    // InternalRangoMode.g:7571:1: rule__EnemySpawn__Group_0__0 : rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 ;
    public final void rule__EnemySpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7575:1: ( rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 )
            // InternalRangoMode.g:7576:2: rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1
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
    // InternalRangoMode.g:7583:1: rule__EnemySpawn__Group_0__0__Impl : ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) ;
    public final void rule__EnemySpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7587:1: ( ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7588:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7588:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7589:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7590:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7590:3: rule__EnemySpawn__CountAssignment_0_0
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
    // InternalRangoMode.g:7598:1: rule__EnemySpawn__Group_0__1 : rule__EnemySpawn__Group_0__1__Impl ;
    public final void rule__EnemySpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7602:1: ( rule__EnemySpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7603:2: rule__EnemySpawn__Group_0__1__Impl
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
    // InternalRangoMode.g:7609:1: rule__EnemySpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__EnemySpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7613:1: ( ( '*' ) )
            // InternalRangoMode.g:7614:1: ( '*' )
            {
            // InternalRangoMode.g:7614:1: ( '*' )
            // InternalRangoMode.g:7615:2: '*'
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
    // InternalRangoMode.g:7625:1: rule__EnemySpawn__Group_5__0 : rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 ;
    public final void rule__EnemySpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7629:1: ( rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 )
            // InternalRangoMode.g:7630:2: rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRangoMode.g:7637:1: rule__EnemySpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__EnemySpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7641:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7642:1: ( 'moving' )
            {
            // InternalRangoMode.g:7642:1: ( 'moving' )
            // InternalRangoMode.g:7643:2: 'moving'
            {
             before(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalRangoMode.g:7652:1: rule__EnemySpawn__Group_5__1 : rule__EnemySpawn__Group_5__1__Impl ;
    public final void rule__EnemySpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7656:1: ( rule__EnemySpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7657:2: rule__EnemySpawn__Group_5__1__Impl
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
    // InternalRangoMode.g:7663:1: rule__EnemySpawn__Group_5__1__Impl : ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__EnemySpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7667:1: ( ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7668:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7668:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7669:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7670:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7670:3: rule__EnemySpawn__DirectionAssignment_5_1
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
    // InternalRangoMode.g:7679:1: rule__Drops__Group__0 : rule__Drops__Group__0__Impl rule__Drops__Group__1 ;
    public final void rule__Drops__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7683:1: ( rule__Drops__Group__0__Impl rule__Drops__Group__1 )
            // InternalRangoMode.g:7684:2: rule__Drops__Group__0__Impl rule__Drops__Group__1
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
    // InternalRangoMode.g:7691:1: rule__Drops__Group__0__Impl : ( 'drops' ) ;
    public final void rule__Drops__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7695:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7696:1: ( 'drops' )
            {
            // InternalRangoMode.g:7696:1: ( 'drops' )
            // InternalRangoMode.g:7697:2: 'drops'
            {
             before(grammarAccess.getDropsAccess().getDropsKeyword_0()); 
            match(input,93,FOLLOW_2); 
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
    // InternalRangoMode.g:7706:1: rule__Drops__Group__1 : rule__Drops__Group__1__Impl rule__Drops__Group__2 ;
    public final void rule__Drops__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7710:1: ( rule__Drops__Group__1__Impl rule__Drops__Group__2 )
            // InternalRangoMode.g:7711:2: rule__Drops__Group__1__Impl rule__Drops__Group__2
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
    // InternalRangoMode.g:7718:1: rule__Drops__Group__1__Impl : ( '{' ) ;
    public final void rule__Drops__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7722:1: ( ( '{' ) )
            // InternalRangoMode.g:7723:1: ( '{' )
            {
            // InternalRangoMode.g:7723:1: ( '{' )
            // InternalRangoMode.g:7724:2: '{'
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
    // InternalRangoMode.g:7733:1: rule__Drops__Group__2 : rule__Drops__Group__2__Impl rule__Drops__Group__3 ;
    public final void rule__Drops__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7737:1: ( rule__Drops__Group__2__Impl rule__Drops__Group__3 )
            // InternalRangoMode.g:7738:2: rule__Drops__Group__2__Impl rule__Drops__Group__3
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
    // InternalRangoMode.g:7745:1: rule__Drops__Group__2__Impl : ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) ;
    public final void rule__Drops__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7749:1: ( ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) )
            // InternalRangoMode.g:7750:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:7750:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            // InternalRangoMode.g:7751:2: ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* )
            {
            // InternalRangoMode.g:7751:2: ( ( rule__Drops__DropsAssignment_2 ) )
            // InternalRangoMode.g:7752:3: ( rule__Drops__DropsAssignment_2 )
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7753:3: ( rule__Drops__DropsAssignment_2 )
            // InternalRangoMode.g:7753:4: rule__Drops__DropsAssignment_2
            {
            pushFollow(FOLLOW_73);
            rule__Drops__DropsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }

            // InternalRangoMode.g:7756:2: ( ( rule__Drops__DropsAssignment_2 )* )
            // InternalRangoMode.g:7757:3: ( rule__Drops__DropsAssignment_2 )*
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7758:3: ( rule__Drops__DropsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRangoMode.g:7758:4: rule__Drops__DropsAssignment_2
            	    {
            	    pushFollow(FOLLOW_73);
            	    rule__Drops__DropsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalRangoMode.g:7767:1: rule__Drops__Group__3 : rule__Drops__Group__3__Impl ;
    public final void rule__Drops__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7771:1: ( rule__Drops__Group__3__Impl )
            // InternalRangoMode.g:7772:2: rule__Drops__Group__3__Impl
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
    // InternalRangoMode.g:7778:1: rule__Drops__Group__3__Impl : ( '}' ) ;
    public final void rule__Drops__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7782:1: ( ( '}' ) )
            // InternalRangoMode.g:7783:1: ( '}' )
            {
            // InternalRangoMode.g:7783:1: ( '}' )
            // InternalRangoMode.g:7784:2: '}'
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
    // InternalRangoMode.g:7794:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7798:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7799:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
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
    // InternalRangoMode.g:7806:1: rule__DropTable__Group__0__Impl : ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7810:1: ( ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) )
            // InternalRangoMode.g:7811:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            {
            // InternalRangoMode.g:7811:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            // InternalRangoMode.g:7812:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 
            // InternalRangoMode.g:7813:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            // InternalRangoMode.g:7813:3: rule__DropTable__EnemyTypeAssignment_0
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
    // InternalRangoMode.g:7821:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7825:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7826:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:7833:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7837:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7838:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7838:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7839:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7840:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7840:3: rule__DropTable__ChanceAssignment_1
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
    // InternalRangoMode.g:7848:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7852:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7853:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
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
    // InternalRangoMode.g:7860:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7864:1: ( ( '%' ) )
            // InternalRangoMode.g:7865:1: ( '%' )
            {
            // InternalRangoMode.g:7865:1: ( '%' )
            // InternalRangoMode.g:7866:2: '%'
            {
             before(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:7875:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7879:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7880:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
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
    // InternalRangoMode.g:7887:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7891:1: ( ( '{' ) )
            // InternalRangoMode.g:7892:1: ( '{' )
            {
            // InternalRangoMode.g:7892:1: ( '{' )
            // InternalRangoMode.g:7893:2: '{'
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
    // InternalRangoMode.g:7902:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7906:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7907:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
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
    // InternalRangoMode.g:7914:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7918:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:7919:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:7919:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:7920:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:7921:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:7921:3: rule__DropTable__EntriesAssignment_4
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
    // InternalRangoMode.g:7929:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7933:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:7934:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
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
    // InternalRangoMode.g:7941:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7945:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:7946:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:7946:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:7947:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:7948:2: ( rule__DropTable__Group_5__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==40) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRangoMode.g:7948:3: rule__DropTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DropTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalRangoMode.g:7956:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7960:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:7961:2: rule__DropTable__Group__6__Impl
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
    // InternalRangoMode.g:7967:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7971:1: ( ( '}' ) )
            // InternalRangoMode.g:7972:1: ( '}' )
            {
            // InternalRangoMode.g:7972:1: ( '}' )
            // InternalRangoMode.g:7973:2: '}'
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
    // InternalRangoMode.g:7983:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7987:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:7988:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
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
    // InternalRangoMode.g:7995:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7999:1: ( ( ',' ) )
            // InternalRangoMode.g:8000:1: ( ',' )
            {
            // InternalRangoMode.g:8000:1: ( ',' )
            // InternalRangoMode.g:8001:2: ','
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
    // InternalRangoMode.g:8010:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8014:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:8015:2: rule__DropTable__Group_5__1__Impl
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
    // InternalRangoMode.g:8021:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8025:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:8026:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:8026:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:8027:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:8028:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:8028:3: rule__DropTable__EntriesAssignment_5_1
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
    // InternalRangoMode.g:8037:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8041:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:8042:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_74);
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
    // InternalRangoMode.g:8049:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8053:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:8054:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:8054:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:8055:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:8056:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:8056:3: rule__Drop__PowerUpAssignment_0
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
    // InternalRangoMode.g:8064:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8068:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:8069:2: rule__Drop__Group__1__Impl
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
    // InternalRangoMode.g:8075:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8079:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:8080:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:8080:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:8081:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:8082:2: ( rule__Drop__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==94) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRangoMode.g:8082:3: rule__Drop__Group_1__0
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
    // InternalRangoMode.g:8091:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8095:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:8096:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
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
    // InternalRangoMode.g:8103:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8107:1: ( ( 'weight' ) )
            // InternalRangoMode.g:8108:1: ( 'weight' )
            {
            // InternalRangoMode.g:8108:1: ( 'weight' )
            // InternalRangoMode.g:8109:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,94,FOLLOW_2); 
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
    // InternalRangoMode.g:8118:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8122:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:8123:2: rule__Drop__Group_1__1__Impl
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
    // InternalRangoMode.g:8129:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8133:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:8134:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:8134:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:8135:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:8136:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:8136:3: rule__Drop__WeightAssignment_1_1
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


    // $ANTLR start "rule__Cleared__Group__0"
    // InternalRangoMode.g:8145:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8149:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:8150:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
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
    // InternalRangoMode.g:8157:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8161:1: ( ( () ) )
            // InternalRangoMode.g:8162:1: ( () )
            {
            // InternalRangoMode.g:8162:1: ( () )
            // InternalRangoMode.g:8163:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:8164:2: ()
            // InternalRangoMode.g:8164:3: 
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
    // InternalRangoMode.g:8172:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8176:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:8177:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
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
    // InternalRangoMode.g:8184:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8188:1: ( ( 'all' ) )
            // InternalRangoMode.g:8189:1: ( 'all' )
            {
            // InternalRangoMode.g:8189:1: ( 'all' )
            // InternalRangoMode.g:8190:2: 'all'
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
    // InternalRangoMode.g:8199:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8203:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:8204:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
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
    // InternalRangoMode.g:8211:1: rule__Cleared__Group__2__Impl : ( 'enemies' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8215:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8216:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8216:1: ( 'enemies' )
            // InternalRangoMode.g:8217:2: 'enemies'
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
    // InternalRangoMode.g:8226:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8230:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:8231:2: rule__Cleared__Group__3__Impl
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
    // InternalRangoMode.g:8237:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8241:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:8242:1: ( 'cleared' )
            {
            // InternalRangoMode.g:8242:1: ( 'cleared' )
            // InternalRangoMode.g:8243:2: 'cleared'
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


    // $ANTLR start "rule__TimeReached__Group__0"
    // InternalRangoMode.g:8253:1: rule__TimeReached__Group__0 : rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 ;
    public final void rule__TimeReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8257:1: ( rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 )
            // InternalRangoMode.g:8258:2: rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__TimeReached__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeReached__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__0"


    // $ANTLR start "rule__TimeReached__Group__0__Impl"
    // InternalRangoMode.g:8265:1: rule__TimeReached__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8269:1: ( ( 'time' ) )
            // InternalRangoMode.g:8270:1: ( 'time' )
            {
            // InternalRangoMode.g:8270:1: ( 'time' )
            // InternalRangoMode.g:8271:2: 'time'
            {
             before(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__0__Impl"


    // $ANTLR start "rule__TimeReached__Group__1"
    // InternalRangoMode.g:8280:1: rule__TimeReached__Group__1 : rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 ;
    public final void rule__TimeReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8284:1: ( rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 )
            // InternalRangoMode.g:8285:2: rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TimeReached__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeReached__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__1"


    // $ANTLR start "rule__TimeReached__Group__1__Impl"
    // InternalRangoMode.g:8292:1: rule__TimeReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8296:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8297:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8297:1: ( 'reaches' )
            // InternalRangoMode.g:8298:2: 'reaches'
            {
             before(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__1__Impl"


    // $ANTLR start "rule__TimeReached__Group__2"
    // InternalRangoMode.g:8307:1: rule__TimeReached__Group__2 : rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 ;
    public final void rule__TimeReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8311:1: ( rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 )
            // InternalRangoMode.g:8312:2: rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__TimeReached__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeReached__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__2"


    // $ANTLR start "rule__TimeReached__Group__2__Impl"
    // InternalRangoMode.g:8319:1: rule__TimeReached__Group__2__Impl : ( ( rule__TimeReached__SecondsAssignment_2 ) ) ;
    public final void rule__TimeReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8323:1: ( ( ( rule__TimeReached__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8324:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8324:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8325:2: ( rule__TimeReached__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8326:2: ( rule__TimeReached__SecondsAssignment_2 )
            // InternalRangoMode.g:8326:3: rule__TimeReached__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeReached__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__2__Impl"


    // $ANTLR start "rule__TimeReached__Group__3"
    // InternalRangoMode.g:8334:1: rule__TimeReached__Group__3 : rule__TimeReached__Group__3__Impl ;
    public final void rule__TimeReached__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8338:1: ( rule__TimeReached__Group__3__Impl )
            // InternalRangoMode.g:8339:2: rule__TimeReached__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeReached__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__3"


    // $ANTLR start "rule__TimeReached__Group__3__Impl"
    // InternalRangoMode.g:8345:1: rule__TimeReached__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeReached__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8349:1: ( ( 's' ) )
            // InternalRangoMode.g:8350:1: ( 's' )
            {
            // InternalRangoMode.g:8350:1: ( 's' )
            // InternalRangoMode.g:8351:2: 's'
            {
             before(grammarAccess.getTimeReachedAccess().getSKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTimeReachedAccess().getSKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__Group__3__Impl"


    // $ANTLR start "rule__ScoreReached__Group__0"
    // InternalRangoMode.g:8361:1: rule__ScoreReached__Group__0 : rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 ;
    public final void rule__ScoreReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8365:1: ( rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 )
            // InternalRangoMode.g:8366:2: rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__ScoreReached__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreReached__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__0"


    // $ANTLR start "rule__ScoreReached__Group__0__Impl"
    // InternalRangoMode.g:8373:1: rule__ScoreReached__Group__0__Impl : ( 'score' ) ;
    public final void rule__ScoreReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8377:1: ( ( 'score' ) )
            // InternalRangoMode.g:8378:1: ( 'score' )
            {
            // InternalRangoMode.g:8378:1: ( 'score' )
            // InternalRangoMode.g:8379:2: 'score'
            {
             before(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__0__Impl"


    // $ANTLR start "rule__ScoreReached__Group__1"
    // InternalRangoMode.g:8388:1: rule__ScoreReached__Group__1 : rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 ;
    public final void rule__ScoreReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8392:1: ( rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 )
            // InternalRangoMode.g:8393:2: rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ScoreReached__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreReached__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__1"


    // $ANTLR start "rule__ScoreReached__Group__1__Impl"
    // InternalRangoMode.g:8400:1: rule__ScoreReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__ScoreReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8404:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8405:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8405:1: ( 'reaches' )
            // InternalRangoMode.g:8406:2: 'reaches'
            {
             before(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__1__Impl"


    // $ANTLR start "rule__ScoreReached__Group__2"
    // InternalRangoMode.g:8415:1: rule__ScoreReached__Group__2 : rule__ScoreReached__Group__2__Impl ;
    public final void rule__ScoreReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8419:1: ( rule__ScoreReached__Group__2__Impl )
            // InternalRangoMode.g:8420:2: rule__ScoreReached__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScoreReached__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__2"


    // $ANTLR start "rule__ScoreReached__Group__2__Impl"
    // InternalRangoMode.g:8426:1: rule__ScoreReached__Group__2__Impl : ( ( rule__ScoreReached__PointsAssignment_2 ) ) ;
    public final void rule__ScoreReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8430:1: ( ( ( rule__ScoreReached__PointsAssignment_2 ) ) )
            // InternalRangoMode.g:8431:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            {
            // InternalRangoMode.g:8431:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            // InternalRangoMode.g:8432:2: ( rule__ScoreReached__PointsAssignment_2 )
            {
             before(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 
            // InternalRangoMode.g:8433:2: ( rule__ScoreReached__PointsAssignment_2 )
            // InternalRangoMode.g:8433:3: rule__ScoreReached__PointsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScoreReached__PointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__Group__2__Impl"


    // $ANTLR start "rule__EnemiesPopped__Group__0"
    // InternalRangoMode.g:8442:1: rule__EnemiesPopped__Group__0 : rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 ;
    public final void rule__EnemiesPopped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8446:1: ( rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 )
            // InternalRangoMode.g:8447:2: rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1
            {
            pushFollow(FOLLOW_76);
            rule__EnemiesPopped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemiesPopped__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__0"


    // $ANTLR start "rule__EnemiesPopped__Group__0__Impl"
    // InternalRangoMode.g:8454:1: rule__EnemiesPopped__Group__0__Impl : ( ( rule__EnemiesPopped__CountAssignment_0 ) ) ;
    public final void rule__EnemiesPopped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8458:1: ( ( ( rule__EnemiesPopped__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8459:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8459:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            // InternalRangoMode.g:8460:2: ( rule__EnemiesPopped__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8461:2: ( rule__EnemiesPopped__CountAssignment_0 )
            // InternalRangoMode.g:8461:3: rule__EnemiesPopped__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesPopped__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnemiesPoppedAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__0__Impl"


    // $ANTLR start "rule__EnemiesPopped__Group__1"
    // InternalRangoMode.g:8469:1: rule__EnemiesPopped__Group__1 : rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 ;
    public final void rule__EnemiesPopped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8473:1: ( rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 )
            // InternalRangoMode.g:8474:2: rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2
            {
            pushFollow(FOLLOW_79);
            rule__EnemiesPopped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemiesPopped__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__1"


    // $ANTLR start "rule__EnemiesPopped__Group__1__Impl"
    // InternalRangoMode.g:8481:1: rule__EnemiesPopped__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesPopped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8485:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8486:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8486:1: ( 'enemies' )
            // InternalRangoMode.g:8487:2: 'enemies'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getEnemiesKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnemiesPoppedAccess().getEnemiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__1__Impl"


    // $ANTLR start "rule__EnemiesPopped__Group__2"
    // InternalRangoMode.g:8496:1: rule__EnemiesPopped__Group__2 : rule__EnemiesPopped__Group__2__Impl ;
    public final void rule__EnemiesPopped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8500:1: ( rule__EnemiesPopped__Group__2__Impl )
            // InternalRangoMode.g:8501:2: rule__EnemiesPopped__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesPopped__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__2"


    // $ANTLR start "rule__EnemiesPopped__Group__2__Impl"
    // InternalRangoMode.g:8507:1: rule__EnemiesPopped__Group__2__Impl : ( 'popped' ) ;
    public final void rule__EnemiesPopped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8511:1: ( ( 'popped' ) )
            // InternalRangoMode.g:8512:1: ( 'popped' )
            {
            // InternalRangoMode.g:8512:1: ( 'popped' )
            // InternalRangoMode.g:8513:2: 'popped'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__Group__2__Impl"


    // $ANTLR start "rule__WavesSurvived__Group__0"
    // InternalRangoMode.g:8523:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8527:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8528:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
            {
            pushFollow(FOLLOW_80);
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
    // InternalRangoMode.g:8535:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8539:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8540:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8540:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8541:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8542:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8542:3: rule__WavesSurvived__CountAssignment_0
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
    // InternalRangoMode.g:8550:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8554:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8555:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
            {
            pushFollow(FOLLOW_81);
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
    // InternalRangoMode.g:8562:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8566:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8567:1: ( 'waves' )
            {
            // InternalRangoMode.g:8567:1: ( 'waves' )
            // InternalRangoMode.g:8568:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:8577:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8581:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8582:2: rule__WavesSurvived__Group__2__Impl
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
    // InternalRangoMode.g:8588:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8592:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8593:1: ( 'survived' )
            {
            // InternalRangoMode.g:8593:1: ( 'survived' )
            // InternalRangoMode.g:8594:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,101,FOLLOW_2); 
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
    // InternalRangoMode.g:8604:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8608:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8609:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
            {
            pushFollow(FOLLOW_82);
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
    // InternalRangoMode.g:8616:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8620:1: ( ( () ) )
            // InternalRangoMode.g:8621:1: ( () )
            {
            // InternalRangoMode.g:8621:1: ( () )
            // InternalRangoMode.g:8622:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8623:2: ()
            // InternalRangoMode.g:8623:3: 
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
    // InternalRangoMode.g:8631:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8635:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8636:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
            {
            pushFollow(FOLLOW_83);
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
    // InternalRangoMode.g:8643:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8647:1: ( ( 'health' ) )
            // InternalRangoMode.g:8648:1: ( 'health' )
            {
            // InternalRangoMode.g:8648:1: ( 'health' )
            // InternalRangoMode.g:8649:2: 'health'
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
    // InternalRangoMode.g:8658:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8662:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8663:2: rule__HealthDepleted__Group__2__Impl
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
    // InternalRangoMode.g:8669:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8673:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8674:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8674:1: ( 'depleted' )
            // InternalRangoMode.g:8675:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,102,FOLLOW_2); 
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


    // $ANTLR start "rule__EnemiesAlive__Group__0"
    // InternalRangoMode.g:8685:1: rule__EnemiesAlive__Group__0 : rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 ;
    public final void rule__EnemiesAlive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8689:1: ( rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 )
            // InternalRangoMode.g:8690:2: rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1
            {
            pushFollow(FOLLOW_76);
            rule__EnemiesAlive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemiesAlive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__0"


    // $ANTLR start "rule__EnemiesAlive__Group__0__Impl"
    // InternalRangoMode.g:8697:1: rule__EnemiesAlive__Group__0__Impl : ( ( rule__EnemiesAlive__CountAssignment_0 ) ) ;
    public final void rule__EnemiesAlive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8701:1: ( ( ( rule__EnemiesAlive__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8702:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8702:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            // InternalRangoMode.g:8703:2: ( rule__EnemiesAlive__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8704:2: ( rule__EnemiesAlive__CountAssignment_0 )
            // InternalRangoMode.g:8704:3: rule__EnemiesAlive__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesAlive__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnemiesAliveAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__0__Impl"


    // $ANTLR start "rule__EnemiesAlive__Group__1"
    // InternalRangoMode.g:8712:1: rule__EnemiesAlive__Group__1 : rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 ;
    public final void rule__EnemiesAlive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8716:1: ( rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 )
            // InternalRangoMode.g:8717:2: rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2
            {
            pushFollow(FOLLOW_84);
            rule__EnemiesAlive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnemiesAlive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__1"


    // $ANTLR start "rule__EnemiesAlive__Group__1__Impl"
    // InternalRangoMode.g:8724:1: rule__EnemiesAlive__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesAlive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8728:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8729:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8729:1: ( 'enemies' )
            // InternalRangoMode.g:8730:2: 'enemies'
            {
             before(grammarAccess.getEnemiesAliveAccess().getEnemiesKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnemiesAliveAccess().getEnemiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__1__Impl"


    // $ANTLR start "rule__EnemiesAlive__Group__2"
    // InternalRangoMode.g:8739:1: rule__EnemiesAlive__Group__2 : rule__EnemiesAlive__Group__2__Impl ;
    public final void rule__EnemiesAlive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8743:1: ( rule__EnemiesAlive__Group__2__Impl )
            // InternalRangoMode.g:8744:2: rule__EnemiesAlive__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnemiesAlive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__2"


    // $ANTLR start "rule__EnemiesAlive__Group__2__Impl"
    // InternalRangoMode.g:8750:1: rule__EnemiesAlive__Group__2__Impl : ( 'alive' ) ;
    public final void rule__EnemiesAlive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8754:1: ( ( 'alive' ) )
            // InternalRangoMode.g:8755:1: ( 'alive' )
            {
            // InternalRangoMode.g:8755:1: ( 'alive' )
            // InternalRangoMode.g:8756:2: 'alive'
            {
             before(grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__Group__2__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalRangoMode.g:8766:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8770:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8771:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_85);
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
    // InternalRangoMode.g:8778:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8782:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8783:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8783:1: ( RULE_INT )
            // InternalRangoMode.g:8784:2: RULE_INT
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
    // InternalRangoMode.g:8793:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8797:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8798:2: rule__Decimal__Group__1__Impl
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
    // InternalRangoMode.g:8804:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8808:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8809:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8809:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8810:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8811:2: ( rule__Decimal__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==104) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:8811:3: rule__Decimal__Group_1__0
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
    // InternalRangoMode.g:8820:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8824:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8825:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
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
    // InternalRangoMode.g:8832:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8836:1: ( ( '.' ) )
            // InternalRangoMode.g:8837:1: ( '.' )
            {
            // InternalRangoMode.g:8837:1: ( '.' )
            // InternalRangoMode.g:8838:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,104,FOLLOW_2); 
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
    // InternalRangoMode.g:8847:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8851:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8852:2: rule__Decimal__Group_1__1__Impl
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
    // InternalRangoMode.g:8858:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8862:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8863:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8863:1: ( RULE_INT )
            // InternalRangoMode.g:8864:2: RULE_INT
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
    // InternalRangoMode.g:8874:1: rule__EnemyType__UnorderedGroup_3 : rule__EnemyType__UnorderedGroup_3__0 {...}?;
    public final void rule__EnemyType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8879:1: ( rule__EnemyType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8880:2: rule__EnemyType__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8888:1: rule__EnemyType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__EnemyType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8893:1: ( ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8894:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8894:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            int alt45=5;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt45=2;
            }
            else if ( LA45_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt45=3;
            }
            else if ( LA45_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt45=4;
            }
            else if ( LA45_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt45=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:8895:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8895:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8896:4: {...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8896:105: ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8897:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8903:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8904:6: ( rule__EnemyType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8905:6: ( rule__EnemyType__Group_3_0__0 )
                    // InternalRangoMode.g:8905:7: rule__EnemyType__Group_3_0__0
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
                    // InternalRangoMode.g:8910:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8910:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8911:4: {...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8911:105: ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8912:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8918:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    // InternalRangoMode.g:8919:6: ( rule__EnemyType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8920:6: ( rule__EnemyType__Group_3_1__0 )
                    // InternalRangoMode.g:8920:7: rule__EnemyType__Group_3_1__0
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
                    // InternalRangoMode.g:8925:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8925:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8926:4: {...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8926:105: ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8927:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8933:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    // InternalRangoMode.g:8934:6: ( rule__EnemyType__Group_3_2__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8935:6: ( rule__EnemyType__Group_3_2__0 )
                    // InternalRangoMode.g:8935:7: rule__EnemyType__Group_3_2__0
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
                    // InternalRangoMode.g:8940:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8940:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8941:4: {...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8941:105: ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8942:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8948:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    // InternalRangoMode.g:8949:6: ( rule__EnemyType__Group_3_3__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8950:6: ( rule__EnemyType__Group_3_3__0 )
                    // InternalRangoMode.g:8950:7: rule__EnemyType__Group_3_3__0
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
                    // InternalRangoMode.g:8955:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8955:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8956:4: {...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8956:105: ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8957:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8963:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    // InternalRangoMode.g:8964:6: ( rule__EnemyType__Group_3_4__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8965:6: ( rule__EnemyType__Group_3_4__0 )
                    // InternalRangoMode.g:8965:7: rule__EnemyType__Group_3_4__0
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
    // InternalRangoMode.g:8978:1: rule__EnemyType__UnorderedGroup_3__0 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8982:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8983:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8984:2: ( rule__EnemyType__UnorderedGroup_3__1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:8984:2: rule__EnemyType__UnorderedGroup_3__1
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
    // InternalRangoMode.g:8990:1: rule__EnemyType__UnorderedGroup_3__1 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8994:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8995:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8996:2: ( rule__EnemyType__UnorderedGroup_3__2 )?
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
                    // InternalRangoMode.g:8996:2: rule__EnemyType__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9002:1: rule__EnemyType__UnorderedGroup_3__2 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9006:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9007:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9008:2: ( rule__EnemyType__UnorderedGroup_3__3 )?
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
                    // InternalRangoMode.g:9008:2: rule__EnemyType__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9014:1: rule__EnemyType__UnorderedGroup_3__3 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9018:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9019:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9020:2: ( rule__EnemyType__UnorderedGroup_3__4 )?
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
                    // InternalRangoMode.g:9020:2: rule__EnemyType__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9026:1: rule__EnemyType__UnorderedGroup_3__4 : rule__EnemyType__UnorderedGroup_3__Impl ;
    public final void rule__EnemyType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9030:1: ( rule__EnemyType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9031:2: rule__EnemyType__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9038:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:9043:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:9044:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:9052:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9057:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:9058:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9058:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt50=6;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else if ( LA50_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt50=3;
            }
            else if ( LA50_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt50=4;
            }
            else if ( LA50_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt50=5;
            }
            else if ( LA50_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt50=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:9059:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9059:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:9060:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:9060:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:9061:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9067:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:9068:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:9069:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:9069:7: rule__PlayerProfile__Group_3_0__0
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
                    // InternalRangoMode.g:9074:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9074:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:9075:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:9075:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:9076:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9082:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:9083:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:9084:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:9084:7: rule__PlayerProfile__Group_3_1__0
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
                    // InternalRangoMode.g:9089:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9089:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:9090:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:9090:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:9091:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9097:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:9098:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:9099:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:9099:7: rule__PlayerProfile__Group_3_2__0
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
                    // InternalRangoMode.g:9104:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9104:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:9105:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:9105:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:9106:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9112:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:9113:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9114:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:9114:7: rule__PlayerProfile__Group_3_3__0
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
                    // InternalRangoMode.g:9119:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9119:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9120:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9120:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9121:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9127:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:9128:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9129:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:9129:7: rule__PlayerProfile__Group_3_4__0
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
                    // InternalRangoMode.g:9134:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9134:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:9135:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:9135:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:9136:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9142:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:9143:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:9144:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:9144:7: rule__PlayerProfile__Group_3_5__0
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
    // InternalRangoMode.g:9157:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9161:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9162:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_87);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9163:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            else if ( LA51_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt51=1;
            }
            else if ( LA51_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt51=1;
            }
            else if ( LA51_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRangoMode.g:9163:2: rule__PlayerProfile__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9169:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9173:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9174:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_87);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9175:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
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
                    // InternalRangoMode.g:9175:2: rule__PlayerProfile__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9181:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9185:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9186:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_87);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9187:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
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
                    // InternalRangoMode.g:9187:2: rule__PlayerProfile__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9193:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9197:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9198:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_87);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9199:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
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
                    // InternalRangoMode.g:9199:2: rule__PlayerProfile__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9205:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9209:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:9210:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_87);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9211:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
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
                    // InternalRangoMode.g:9211:2: rule__PlayerProfile__UnorderedGroup_3__5
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
    // InternalRangoMode.g:9217:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9221:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9222:2: rule__PlayerProfile__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9229:1: rule__GameMode__UnorderedGroup_7 : ( rule__GameMode__UnorderedGroup_7__0 )? ;
    public final void rule__GameMode__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
        	
        try {
            // InternalRangoMode.g:9234:1: ( ( rule__GameMode__UnorderedGroup_7__0 )? )
            // InternalRangoMode.g:9235:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            {
            // InternalRangoMode.g:9235:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRangoMode.g:9235:2: rule__GameMode__UnorderedGroup_7__0
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
    // InternalRangoMode.g:9243:1: rule__GameMode__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9248:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) )
            // InternalRangoMode.g:9249:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            {
            // InternalRangoMode.g:9249:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalRangoMode.g:9250:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9250:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    // InternalRangoMode.g:9251:4: {...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalRangoMode.g:9251:104: ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    // InternalRangoMode.g:9252:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9258:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    // InternalRangoMode.g:9259:6: ( rule__GameMode__Group_7_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_7_0()); 
                    // InternalRangoMode.g:9260:6: ( rule__GameMode__Group_7_0__0 )
                    // InternalRangoMode.g:9260:7: rule__GameMode__Group_7_0__0
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
                    // InternalRangoMode.g:9265:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    {
                    // InternalRangoMode.g:9265:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    // InternalRangoMode.g:9266:4: {...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalRangoMode.g:9266:104: ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    // InternalRangoMode.g:9267:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9273:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    // InternalRangoMode.g:9274:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 
                    // InternalRangoMode.g:9275:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    // InternalRangoMode.g:9275:7: rule__GameMode__SpeedBonusAssignment_7_1
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
    // InternalRangoMode.g:9288:1: rule__GameMode__UnorderedGroup_7__0 : rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? ;
    public final void rule__GameMode__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9292:1: ( rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? )
            // InternalRangoMode.g:9293:2: rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_88);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalRangoMode.g:9294:2: ( rule__GameMode__UnorderedGroup_7__1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRangoMode.g:9294:2: rule__GameMode__UnorderedGroup_7__1
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
    // InternalRangoMode.g:9300:1: rule__GameMode__UnorderedGroup_7__1 : rule__GameMode__UnorderedGroup_7__Impl ;
    public final void rule__GameMode__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9304:1: ( rule__GameMode__UnorderedGroup_7__Impl )
            // InternalRangoMode.g:9305:2: rule__GameMode__UnorderedGroup_7__Impl
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
    // InternalRangoMode.g:9312:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9316:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9317:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9317:2: ( RULE_ID )
            // InternalRangoMode.g:9318:3: RULE_ID
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
    // InternalRangoMode.g:9327:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9331:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9332:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9332:2: ( RULE_STRING )
            // InternalRangoMode.g:9333:3: RULE_STRING
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
    // InternalRangoMode.g:9342:1: rule__Edition__EnemyTypesAssignment_3_0 : ( ruleEnemyType ) ;
    public final void rule__Edition__EnemyTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9346:1: ( ( ruleEnemyType ) )
            // InternalRangoMode.g:9347:2: ( ruleEnemyType )
            {
            // InternalRangoMode.g:9347:2: ( ruleEnemyType )
            // InternalRangoMode.g:9348:3: ruleEnemyType
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
    // InternalRangoMode.g:9357:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9361:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:9362:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:9362:2: ( rulePowerUp )
            // InternalRangoMode.g:9363:3: rulePowerUp
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
    // InternalRangoMode.g:9372:1: rule__Edition__PlayersAssignment_3_2 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9376:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9377:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9377:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9378:3: rulePlayerProfile
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
    // InternalRangoMode.g:9387:1: rule__Edition__DifficultiesAssignment_3_4 : ( ruleDifficulty ) ;
    public final void rule__Edition__DifficultiesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9391:1: ( ( ruleDifficulty ) )
            // InternalRangoMode.g:9392:2: ( ruleDifficulty )
            {
            // InternalRangoMode.g:9392:2: ( ruleDifficulty )
            // InternalRangoMode.g:9393:3: ruleDifficulty
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
    // InternalRangoMode.g:9402:1: rule__Edition__ModesAssignment_3_5 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9406:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9407:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9407:2: ( ruleGameMode )
            // InternalRangoMode.g:9408:3: ruleGameMode
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
    // InternalRangoMode.g:9417:1: rule__Difficulty__TierAssignment_1 : ( ruleDifficultyTier ) ;
    public final void rule__Difficulty__TierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9421:1: ( ( ruleDifficultyTier ) )
            // InternalRangoMode.g:9422:2: ( ruleDifficultyTier )
            {
            // InternalRangoMode.g:9422:2: ( ruleDifficultyTier )
            // InternalRangoMode.g:9423:3: ruleDifficultyTier
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
    // InternalRangoMode.g:9432:1: rule__Difficulty__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__Difficulty__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9436:1: ( ( ruleModifier ) )
            // InternalRangoMode.g:9437:2: ( ruleModifier )
            {
            // InternalRangoMode.g:9437:2: ( ruleModifier )
            // InternalRangoMode.g:9438:3: ruleModifier
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
    // InternalRangoMode.g:9447:1: rule__Modifier__TargetAssignment_0 : ( ruleModifierTarget ) ;
    public final void rule__Modifier__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9451:1: ( ( ruleModifierTarget ) )
            // InternalRangoMode.g:9452:2: ( ruleModifierTarget )
            {
            // InternalRangoMode.g:9452:2: ( ruleModifierTarget )
            // InternalRangoMode.g:9453:3: ruleModifierTarget
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
    // InternalRangoMode.g:9462:1: rule__Modifier__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Modifier__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9466:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9467:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9467:2: ( ruleDecimal )
            // InternalRangoMode.g:9468:3: ruleDecimal
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
    // InternalRangoMode.g:9477:1: rule__EnemyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnemyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9481:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9482:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9482:2: ( RULE_ID )
            // InternalRangoMode.g:9483:3: RULE_ID
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
    // InternalRangoMode.g:9492:1: rule__EnemyType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__EnemyType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9496:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9497:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9497:2: ( RULE_STRING )
            // InternalRangoMode.g:9498:3: RULE_STRING
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
    // InternalRangoMode.g:9507:1: rule__EnemyType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9511:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9512:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9512:2: ( ruleDecimal )
            // InternalRangoMode.g:9513:3: ruleDecimal
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
    // InternalRangoMode.g:9522:1: rule__EnemyType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9526:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9527:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9527:2: ( ruleDecimal )
            // InternalRangoMode.g:9528:3: ruleDecimal
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
    // InternalRangoMode.g:9537:1: rule__EnemyType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9541:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9542:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9542:2: ( ruleDecimal )
            // InternalRangoMode.g:9543:3: ruleDecimal
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
    // InternalRangoMode.g:9552:1: rule__EnemyType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__EnemyType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9556:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9557:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9557:2: ( RULE_INT )
            // InternalRangoMode.g:9558:3: RULE_INT
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
    // InternalRangoMode.g:9567:1: rule__EnemyType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__EnemyType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9571:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9572:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9572:2: ( ruleSplitRule )
            // InternalRangoMode.g:9573:3: ruleSplitRule
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
    // InternalRangoMode.g:9582:1: rule__EnemyType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9586:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9587:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9587:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9588:3: rulePlayerEffect
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
    // InternalRangoMode.g:9597:1: rule__EnemyType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9601:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9602:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9602:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9603:3: rulePlayerEffect
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
    // InternalRangoMode.g:9612:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9616:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9617:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9617:2: ( RULE_INT )
            // InternalRangoMode.g:9618:3: RULE_INT
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
    // InternalRangoMode.g:9627:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9631:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9632:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9632:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9633:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9634:3: ( RULE_ID )
            // InternalRangoMode.g:9635:4: RULE_ID
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
    // InternalRangoMode.g:9646:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9650:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9651:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9651:2: ( ruleDecimal )
            // InternalRangoMode.g:9652:3: ruleDecimal
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
    // InternalRangoMode.g:9661:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9665:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9666:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9666:2: ( RULE_INT )
            // InternalRangoMode.g:9667:3: RULE_INT
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
    // InternalRangoMode.g:9676:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9680:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9681:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9681:2: ( RULE_INT )
            // InternalRangoMode.g:9682:3: RULE_INT
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
    // InternalRangoMode.g:9691:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9695:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9696:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9696:2: ( ruleDecimal )
            // InternalRangoMode.g:9697:3: ruleDecimal
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
    // InternalRangoMode.g:9706:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9710:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9711:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9711:2: ( ruleDecimal )
            // InternalRangoMode.g:9712:3: ruleDecimal
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
    // InternalRangoMode.g:9721:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9725:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9726:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9726:2: ( ruleDecimal )
            // InternalRangoMode.g:9727:3: ruleDecimal
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
    // InternalRangoMode.g:9736:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9740:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9741:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9741:2: ( RULE_INT )
            // InternalRangoMode.g:9742:3: RULE_INT
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
    // InternalRangoMode.g:9751:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9755:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9756:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9756:2: ( ruleDecimal )
            // InternalRangoMode.g:9757:3: ruleDecimal
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
    // InternalRangoMode.g:9766:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9770:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9771:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9771:2: ( ruleDecimal )
            // InternalRangoMode.g:9772:3: ruleDecimal
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
    // InternalRangoMode.g:9781:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9785:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9786:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9786:2: ( RULE_ID )
            // InternalRangoMode.g:9787:3: RULE_ID
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
    // InternalRangoMode.g:9796:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9800:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9801:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9801:2: ( RULE_STRING )
            // InternalRangoMode.g:9802:3: RULE_STRING
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
    // InternalRangoMode.g:9811:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9815:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9816:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9816:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9817:3: rulePlayerEffect
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
    // InternalRangoMode.g:9826:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9830:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9831:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9831:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9832:3: rulePlayerEffect
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
    // InternalRangoMode.g:9841:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9845:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9846:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9846:2: ( RULE_ID )
            // InternalRangoMode.g:9847:3: RULE_ID
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
    // InternalRangoMode.g:9856:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9860:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9861:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9861:2: ( RULE_STRING )
            // InternalRangoMode.g:9862:3: RULE_STRING
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
    // InternalRangoMode.g:9871:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9875:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9876:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9876:2: ( RULE_INT )
            // InternalRangoMode.g:9877:3: RULE_INT
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
    // InternalRangoMode.g:9886:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9890:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9891:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9891:2: ( RULE_INT )
            // InternalRangoMode.g:9892:3: RULE_INT
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
    // InternalRangoMode.g:9901:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9905:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9906:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9906:2: ( ruleDecimal )
            // InternalRangoMode.g:9907:3: ruleDecimal
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
    // InternalRangoMode.g:9916:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9920:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9921:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9921:2: ( ruleDecimal )
            // InternalRangoMode.g:9922:3: ruleDecimal
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
    // InternalRangoMode.g:9931:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9935:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9936:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9936:2: ( ruleDecimal )
            // InternalRangoMode.g:9937:3: ruleDecimal
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
    // InternalRangoMode.g:9946:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9950:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9951:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9951:2: ( ruleDecimal )
            // InternalRangoMode.g:9952:3: ruleDecimal
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
    // InternalRangoMode.g:9961:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9965:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9966:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9966:2: ( RULE_ID )
            // InternalRangoMode.g:9967:3: RULE_ID
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
    // InternalRangoMode.g:9976:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9980:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9981:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9981:2: ( RULE_STRING )
            // InternalRangoMode.g:9982:3: RULE_STRING
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
    // InternalRangoMode.g:9991:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9995:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9996:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9996:2: ( RULE_STRING )
            // InternalRangoMode.g:9997:3: RULE_STRING
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
    // InternalRangoMode.g:10006:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10010:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10011:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10011:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10012:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:10013:3: ( RULE_ID )
            // InternalRangoMode.g:10014:4: RULE_ID
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
    // InternalRangoMode.g:10025:1: rule__GameMode__GravityAssignment_7_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10029:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10030:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10030:2: ( ruleDecimal )
            // InternalRangoMode.g:10031:3: ruleDecimal
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
    // InternalRangoMode.g:10040:1: rule__GameMode__SpeedBonusAssignment_7_1 : ( ruleSpeedBonus ) ;
    public final void rule__GameMode__SpeedBonusAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10044:1: ( ( ruleSpeedBonus ) )
            // InternalRangoMode.g:10045:2: ( ruleSpeedBonus )
            {
            // InternalRangoMode.g:10045:2: ( ruleSpeedBonus )
            // InternalRangoMode.g:10046:3: ruleSpeedBonus
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


    // $ANTLR start "rule__GameMode__LevelsAssignment_8_0"
    // InternalRangoMode.g:10055:1: rule__GameMode__LevelsAssignment_8_0 : ( ruleSingleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10059:1: ( ( ruleSingleLevel ) )
            // InternalRangoMode.g:10060:2: ( ruleSingleLevel )
            {
            // InternalRangoMode.g:10060:2: ( ruleSingleLevel )
            // InternalRangoMode.g:10061:3: ruleSingleLevel
            {
             before(grammarAccess.getGameModeAccess().getLevelsSingleLevelParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleLevel();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLevelsSingleLevelParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LevelsAssignment_8_0"


    // $ANTLR start "rule__GameMode__LevelsAssignment_8_1"
    // InternalRangoMode.g:10070:1: rule__GameMode__LevelsAssignment_8_1 : ( ruleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10074:1: ( ( ruleLevel ) )
            // InternalRangoMode.g:10075:2: ( ruleLevel )
            {
            // InternalRangoMode.g:10075:2: ( ruleLevel )
            // InternalRangoMode.g:10076:3: ruleLevel
            {
             before(grammarAccess.getGameModeAccess().getLevelsLevelParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLevelsLevelParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LevelsAssignment_8_1"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_10_2"
    // InternalRangoMode.g:10085:1: rule__GameMode__WinConditionsAssignment_10_2 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10089:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10090:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10090:2: ( ruleEndCondition )
            // InternalRangoMode.g:10091:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_10_2"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_10_3_1"
    // InternalRangoMode.g:10100:1: rule__GameMode__WinConditionsAssignment_10_3_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10104:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10105:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10105:2: ( ruleEndCondition )
            // InternalRangoMode.g:10106:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_10_3_1"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_13"
    // InternalRangoMode.g:10115:1: rule__GameMode__LoseConditionsAssignment_13 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10119:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10120:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10120:2: ( ruleEndCondition )
            // InternalRangoMode.g:10121:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_13"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_14_1"
    // InternalRangoMode.g:10130:1: rule__GameMode__LoseConditionsAssignment_14_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10134:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10135:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10135:2: ( ruleEndCondition )
            // InternalRangoMode.g:10136:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_14_1"


    // $ANTLR start "rule__SingleLevel__ArenaAssignment_0"
    // InternalRangoMode.g:10145:1: rule__SingleLevel__ArenaAssignment_0 : ( ruleArena ) ;
    public final void rule__SingleLevel__ArenaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10149:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10150:2: ( ruleArena )
            {
            // InternalRangoMode.g:10150:2: ( ruleArena )
            // InternalRangoMode.g:10151:3: ruleArena
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
    // InternalRangoMode.g:10160:1: rule__SingleLevel__SpawningAssignment_1 : ( ruleSpawnStrategy ) ;
    public final void rule__SingleLevel__SpawningAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10164:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10165:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10165:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10166:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:10175:1: rule__Level__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Level__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10179:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10180:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10180:2: ( RULE_STRING )
            // InternalRangoMode.g:10181:3: RULE_STRING
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
    // InternalRangoMode.g:10190:1: rule__Level__ArenaAssignment_3 : ( ruleArena ) ;
    public final void rule__Level__ArenaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10194:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10195:2: ( ruleArena )
            {
            // InternalRangoMode.g:10195:2: ( ruleArena )
            // InternalRangoMode.g:10196:3: ruleArena
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
    // InternalRangoMode.g:10205:1: rule__Level__SpawningAssignment_4 : ( ruleSpawnStrategy ) ;
    public final void rule__Level__SpawningAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10209:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10210:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10210:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10211:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:10220:1: rule__SpeedBonus__MaxFactorAssignment_3_2 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__MaxFactorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10224:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10225:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10225:2: ( ruleDecimal )
            // InternalRangoMode.g:10226:3: ruleDecimal
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
    // InternalRangoMode.g:10235:1: rule__SpeedBonus__DurationAssignment_4_1 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10239:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10240:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10240:2: ( ruleDecimal )
            // InternalRangoMode.g:10241:3: ruleDecimal
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
    // InternalRangoMode.g:10250:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10254:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10255:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10255:2: ( RULE_STRING )
            // InternalRangoMode.g:10256:3: RULE_STRING
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
    // InternalRangoMode.g:10265:1: rule__Arena__PlayerStartAssignment_4_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10269:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10270:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10270:2: ( ruleDecimal )
            // InternalRangoMode.g:10271:3: ruleDecimal
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
    // InternalRangoMode.g:10280:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10284:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:10285:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:10285:2: ( ruleObstacle )
            // InternalRangoMode.g:10286:3: ruleObstacle
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
    // InternalRangoMode.g:10295:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10299:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10300:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10300:2: ( ruleDecimal )
            // InternalRangoMode.g:10301:3: ruleDecimal
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
    // InternalRangoMode.g:10310:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10314:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10315:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10315:2: ( ruleDecimal )
            // InternalRangoMode.g:10316:3: ruleDecimal
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
    // InternalRangoMode.g:10325:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10329:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10330:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10330:2: ( RULE_ID )
            // InternalRangoMode.g:10331:3: RULE_ID
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
    // InternalRangoMode.g:10340:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10344:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10345:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10345:2: ( RULE_INT )
            // InternalRangoMode.g:10346:3: RULE_INT
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
    // InternalRangoMode.g:10355:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10359:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10360:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10360:2: ( RULE_INT )
            // InternalRangoMode.g:10361:3: RULE_INT
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
    // InternalRangoMode.g:10370:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10374:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10375:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10375:2: ( RULE_ID )
            // InternalRangoMode.g:10376:3: RULE_ID
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
    // InternalRangoMode.g:10385:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10389:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10390:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10390:2: ( ruleDecimal )
            // InternalRangoMode.g:10391:3: ruleDecimal
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
    // InternalRangoMode.g:10400:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10404:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10405:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10405:2: ( ruleTarget )
            // InternalRangoMode.g:10406:3: ruleTarget
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
    // InternalRangoMode.g:10415:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10419:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10420:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10420:2: ( RULE_ID )
            // InternalRangoMode.g:10421:3: RULE_ID
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
    // InternalRangoMode.g:10430:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10434:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10435:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10435:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10436:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:10437:3: ( RULE_ID )
            // InternalRangoMode.g:10438:4: RULE_ID
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
    // InternalRangoMode.g:10449:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10453:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10454:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10454:2: ( ruleTarget )
            // InternalRangoMode.g:10455:3: ruleTarget
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
    // InternalRangoMode.g:10464:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleEnemySpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10468:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10469:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10469:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10470:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10479:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10483:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10484:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10484:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10485:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10486:3: ( 'looping' )
            // InternalRangoMode.g:10487:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,105,FOLLOW_2); 
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
    // InternalRangoMode.g:10498:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10502:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10503:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10503:2: ( RULE_INT )
            // InternalRangoMode.g:10504:3: RULE_INT
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
    // InternalRangoMode.g:10513:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10517:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10518:2: ( ruleWave )
            {
            // InternalRangoMode.g:10518:2: ( ruleWave )
            // InternalRangoMode.g:10519:3: ruleWave
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
    // InternalRangoMode.g:10528:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10532:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10533:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10533:2: ( ruleDecimal )
            // InternalRangoMode.g:10534:3: ruleDecimal
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
    // InternalRangoMode.g:10543:1: rule__Wave__SpawnsAssignment_3 : ( ruleEnemySpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10547:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10548:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10548:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10549:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10558:1: rule__EnemySpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10562:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10563:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10563:2: ( RULE_INT )
            // InternalRangoMode.g:10564:3: RULE_INT
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
    // InternalRangoMode.g:10573:1: rule__EnemySpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnemySpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10577:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10578:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10578:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10579:3: ( RULE_ID )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10580:3: ( RULE_ID )
            // InternalRangoMode.g:10581:4: RULE_ID
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
    // InternalRangoMode.g:10592:1: rule__EnemySpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10596:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10597:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10597:2: ( RULE_INT )
            // InternalRangoMode.g:10598:3: RULE_INT
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
    // InternalRangoMode.g:10607:1: rule__EnemySpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__EnemySpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10611:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10612:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10612:2: ( ruleDirection )
            // InternalRangoMode.g:10613:3: ruleDirection
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
    // InternalRangoMode.g:10622:1: rule__Drops__DropsAssignment_2 : ( ruleDropTable ) ;
    public final void rule__Drops__DropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10626:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10627:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10627:2: ( ruleDropTable )
            // InternalRangoMode.g:10628:3: ruleDropTable
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
    // InternalRangoMode.g:10637:1: rule__DropTable__EnemyTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DropTable__EnemyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10641:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10642:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10642:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10643:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 
            // InternalRangoMode.g:10644:3: ( RULE_ID )
            // InternalRangoMode.g:10645:4: RULE_ID
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
    // InternalRangoMode.g:10656:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10660:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10661:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10661:2: ( ruleDecimal )
            // InternalRangoMode.g:10662:3: ruleDecimal
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
    // InternalRangoMode.g:10671:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10675:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10676:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10676:2: ( ruleDrop )
            // InternalRangoMode.g:10677:3: ruleDrop
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
    // InternalRangoMode.g:10686:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10690:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10691:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10691:2: ( ruleDrop )
            // InternalRangoMode.g:10692:3: ruleDrop
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
    // InternalRangoMode.g:10701:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10705:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10706:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10706:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10707:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:10708:3: ( RULE_ID )
            // InternalRangoMode.g:10709:4: RULE_ID
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
    // InternalRangoMode.g:10720:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10724:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10725:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10725:2: ( RULE_INT )
            // InternalRangoMode.g:10726:3: RULE_INT
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


    // $ANTLR start "rule__TimeReached__SecondsAssignment_2"
    // InternalRangoMode.g:10735:1: rule__TimeReached__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeReached__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10739:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10740:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10740:2: ( ruleDecimal )
            // InternalRangoMode.g:10741:3: ruleDecimal
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsDecimalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getTimeReachedAccess().getSecondsDecimalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeReached__SecondsAssignment_2"


    // $ANTLR start "rule__ScoreReached__PointsAssignment_2"
    // InternalRangoMode.g:10750:1: rule__ScoreReached__PointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ScoreReached__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10754:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10755:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10755:2: ( RULE_INT )
            // InternalRangoMode.g:10756:3: RULE_INT
            {
             before(grammarAccess.getScoreReachedAccess().getPointsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScoreReachedAccess().getPointsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScoreReached__PointsAssignment_2"


    // $ANTLR start "rule__EnemiesPopped__CountAssignment_0"
    // InternalRangoMode.g:10765:1: rule__EnemiesPopped__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesPopped__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10769:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10770:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10770:2: ( RULE_INT )
            // InternalRangoMode.g:10771:3: RULE_INT
            {
             before(grammarAccess.getEnemiesPoppedAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnemiesPoppedAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesPopped__CountAssignment_0"


    // $ANTLR start "rule__WavesSurvived__CountAssignment_0"
    // InternalRangoMode.g:10780:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10784:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10785:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10785:2: ( RULE_INT )
            // InternalRangoMode.g:10786:3: RULE_INT
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


    // $ANTLR start "rule__EnemiesAlive__CountAssignment_0"
    // InternalRangoMode.g:10795:1: rule__EnemiesAlive__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesAlive__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10799:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10800:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10800:2: ( RULE_INT )
            // InternalRangoMode.g:10801:3: RULE_INT
            {
             before(grammarAccess.getEnemiesAliveAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnemiesAliveAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnemiesAlive__CountAssignment_0"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\25\2\uffff\1\144\2\uffff";
    static final String dfa_3s = "\1\143\3\uffff\1\130\2\uffff\1\147\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\1\uffff\1\4\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\63\uffff\1\5\46\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\102\uffff\1\6",
            "",
            "",
            "\1\10\2\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1331:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2020000044400040L,0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2020000044400002L,0x0000000020000000L});
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
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L,0x0000000020000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000010L,0x0000000A80000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000240L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000010400000L,0x0000000000490000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000490000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000008000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x1D80004000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000002L});

}
