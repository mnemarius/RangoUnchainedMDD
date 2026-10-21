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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'everything'", "'enemies'", "'player'", "'left'", "'right'", "'edition'", "'enemy'", "'{'", "'on'", "'pop'", "':'", "'contact'", "'}'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'material'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'lose'", "'when'", "'description'", "'gravity'", "'win'", "'or'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'floor'", "'walls'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'of'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'looping'"
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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


    // $ANTLR start "entryRuleEnemyType"
    // InternalRangoMode.g:78:1: entryRuleEnemyType : ruleEnemyType EOF ;
    public final void entryRuleEnemyType() throws RecognitionException {
        try {
            // InternalRangoMode.g:79:1: ( ruleEnemyType EOF )
            // InternalRangoMode.g:80:1: ruleEnemyType EOF
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
    // InternalRangoMode.g:87:1: ruleEnemyType : ( ( rule__EnemyType__Group__0 ) ) ;
    public final void ruleEnemyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:91:2: ( ( ( rule__EnemyType__Group__0 ) ) )
            // InternalRangoMode.g:92:2: ( ( rule__EnemyType__Group__0 ) )
            {
            // InternalRangoMode.g:92:2: ( ( rule__EnemyType__Group__0 ) )
            // InternalRangoMode.g:93:3: ( rule__EnemyType__Group__0 )
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup()); 
            // InternalRangoMode.g:94:3: ( rule__EnemyType__Group__0 )
            // InternalRangoMode.g:94:4: rule__EnemyType__Group__0
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
    // InternalRangoMode.g:103:1: entryRuleSplitRule : ruleSplitRule EOF ;
    public final void entryRuleSplitRule() throws RecognitionException {
        try {
            // InternalRangoMode.g:104:1: ( ruleSplitRule EOF )
            // InternalRangoMode.g:105:1: ruleSplitRule EOF
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
    // InternalRangoMode.g:112:1: ruleSplitRule : ( ( rule__SplitRule__Alternatives ) ) ;
    public final void ruleSplitRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:116:2: ( ( ( rule__SplitRule__Alternatives ) ) )
            // InternalRangoMode.g:117:2: ( ( rule__SplitRule__Alternatives ) )
            {
            // InternalRangoMode.g:117:2: ( ( rule__SplitRule__Alternatives ) )
            // InternalRangoMode.g:118:3: ( rule__SplitRule__Alternatives )
            {
             before(grammarAccess.getSplitRuleAccess().getAlternatives()); 
            // InternalRangoMode.g:119:3: ( rule__SplitRule__Alternatives )
            // InternalRangoMode.g:119:4: rule__SplitRule__Alternatives
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
    // InternalRangoMode.g:128:1: entryRuleVanish : ruleVanish EOF ;
    public final void entryRuleVanish() throws RecognitionException {
        try {
            // InternalRangoMode.g:129:1: ( ruleVanish EOF )
            // InternalRangoMode.g:130:1: ruleVanish EOF
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
    // InternalRangoMode.g:137:1: ruleVanish : ( ( rule__Vanish__Group__0 ) ) ;
    public final void ruleVanish() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:141:2: ( ( ( rule__Vanish__Group__0 ) ) )
            // InternalRangoMode.g:142:2: ( ( rule__Vanish__Group__0 ) )
            {
            // InternalRangoMode.g:142:2: ( ( rule__Vanish__Group__0 ) )
            // InternalRangoMode.g:143:3: ( rule__Vanish__Group__0 )
            {
             before(grammarAccess.getVanishAccess().getGroup()); 
            // InternalRangoMode.g:144:3: ( rule__Vanish__Group__0 )
            // InternalRangoMode.g:144:4: rule__Vanish__Group__0
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
    // InternalRangoMode.g:153:1: entryRuleSplit : ruleSplit EOF ;
    public final void entryRuleSplit() throws RecognitionException {
        try {
            // InternalRangoMode.g:154:1: ( ruleSplit EOF )
            // InternalRangoMode.g:155:1: ruleSplit EOF
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
    // InternalRangoMode.g:162:1: ruleSplit : ( ( rule__Split__Group__0 ) ) ;
    public final void ruleSplit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:166:2: ( ( ( rule__Split__Group__0 ) ) )
            // InternalRangoMode.g:167:2: ( ( rule__Split__Group__0 ) )
            {
            // InternalRangoMode.g:167:2: ( ( rule__Split__Group__0 ) )
            // InternalRangoMode.g:168:3: ( rule__Split__Group__0 )
            {
             before(grammarAccess.getSplitAccess().getGroup()); 
            // InternalRangoMode.g:169:3: ( rule__Split__Group__0 )
            // InternalRangoMode.g:169:4: rule__Split__Group__0
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
    // InternalRangoMode.g:178:1: entryRulePlayerEffect : rulePlayerEffect EOF ;
    public final void entryRulePlayerEffect() throws RecognitionException {
        try {
            // InternalRangoMode.g:179:1: ( rulePlayerEffect EOF )
            // InternalRangoMode.g:180:1: rulePlayerEffect EOF
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
    // InternalRangoMode.g:187:1: rulePlayerEffect : ( ( rule__PlayerEffect__Alternatives ) ) ;
    public final void rulePlayerEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:191:2: ( ( ( rule__PlayerEffect__Alternatives ) ) )
            // InternalRangoMode.g:192:2: ( ( rule__PlayerEffect__Alternatives ) )
            {
            // InternalRangoMode.g:192:2: ( ( rule__PlayerEffect__Alternatives ) )
            // InternalRangoMode.g:193:3: ( rule__PlayerEffect__Alternatives )
            {
             before(grammarAccess.getPlayerEffectAccess().getAlternatives()); 
            // InternalRangoMode.g:194:3: ( rule__PlayerEffect__Alternatives )
            // InternalRangoMode.g:194:4: rule__PlayerEffect__Alternatives
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
    // InternalRangoMode.g:203:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalRangoMode.g:204:1: ( ruleDamage EOF )
            // InternalRangoMode.g:205:1: ruleDamage EOF
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
    // InternalRangoMode.g:212:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:216:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalRangoMode.g:217:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalRangoMode.g:217:2: ( ( rule__Damage__Group__0 ) )
            // InternalRangoMode.g:218:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalRangoMode.g:219:3: ( rule__Damage__Group__0 )
            // InternalRangoMode.g:219:4: rule__Damage__Group__0
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
    // InternalRangoMode.g:228:1: entryRuleHeal : ruleHeal EOF ;
    public final void entryRuleHeal() throws RecognitionException {
        try {
            // InternalRangoMode.g:229:1: ( ruleHeal EOF )
            // InternalRangoMode.g:230:1: ruleHeal EOF
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
    // InternalRangoMode.g:237:1: ruleHeal : ( ( rule__Heal__Group__0 ) ) ;
    public final void ruleHeal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:241:2: ( ( ( rule__Heal__Group__0 ) ) )
            // InternalRangoMode.g:242:2: ( ( rule__Heal__Group__0 ) )
            {
            // InternalRangoMode.g:242:2: ( ( rule__Heal__Group__0 ) )
            // InternalRangoMode.g:243:3: ( rule__Heal__Group__0 )
            {
             before(grammarAccess.getHealAccess().getGroup()); 
            // InternalRangoMode.g:244:3: ( rule__Heal__Group__0 )
            // InternalRangoMode.g:244:4: rule__Heal__Group__0
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
    // InternalRangoMode.g:253:1: entryRuleShield : ruleShield EOF ;
    public final void entryRuleShield() throws RecognitionException {
        try {
            // InternalRangoMode.g:254:1: ( ruleShield EOF )
            // InternalRangoMode.g:255:1: ruleShield EOF
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
    // InternalRangoMode.g:262:1: ruleShield : ( ( rule__Shield__Group__0 ) ) ;
    public final void ruleShield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:266:2: ( ( ( rule__Shield__Group__0 ) ) )
            // InternalRangoMode.g:267:2: ( ( rule__Shield__Group__0 ) )
            {
            // InternalRangoMode.g:267:2: ( ( rule__Shield__Group__0 ) )
            // InternalRangoMode.g:268:3: ( rule__Shield__Group__0 )
            {
             before(grammarAccess.getShieldAccess().getGroup()); 
            // InternalRangoMode.g:269:3: ( rule__Shield__Group__0 )
            // InternalRangoMode.g:269:4: rule__Shield__Group__0
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
    // InternalRangoMode.g:278:1: entryRuleSpeedChange : ruleSpeedChange EOF ;
    public final void entryRuleSpeedChange() throws RecognitionException {
        try {
            // InternalRangoMode.g:279:1: ( ruleSpeedChange EOF )
            // InternalRangoMode.g:280:1: ruleSpeedChange EOF
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
    // InternalRangoMode.g:287:1: ruleSpeedChange : ( ( rule__SpeedChange__Group__0 ) ) ;
    public final void ruleSpeedChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:291:2: ( ( ( rule__SpeedChange__Group__0 ) ) )
            // InternalRangoMode.g:292:2: ( ( rule__SpeedChange__Group__0 ) )
            {
            // InternalRangoMode.g:292:2: ( ( rule__SpeedChange__Group__0 ) )
            // InternalRangoMode.g:293:3: ( rule__SpeedChange__Group__0 )
            {
             before(grammarAccess.getSpeedChangeAccess().getGroup()); 
            // InternalRangoMode.g:294:3: ( rule__SpeedChange__Group__0 )
            // InternalRangoMode.g:294:4: rule__SpeedChange__Group__0
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
    // InternalRangoMode.g:303:1: entryRulePoison : rulePoison EOF ;
    public final void entryRulePoison() throws RecognitionException {
        try {
            // InternalRangoMode.g:304:1: ( rulePoison EOF )
            // InternalRangoMode.g:305:1: rulePoison EOF
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
    // InternalRangoMode.g:312:1: rulePoison : ( ( rule__Poison__Group__0 ) ) ;
    public final void rulePoison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:316:2: ( ( ( rule__Poison__Group__0 ) ) )
            // InternalRangoMode.g:317:2: ( ( rule__Poison__Group__0 ) )
            {
            // InternalRangoMode.g:317:2: ( ( rule__Poison__Group__0 ) )
            // InternalRangoMode.g:318:3: ( rule__Poison__Group__0 )
            {
             before(grammarAccess.getPoisonAccess().getGroup()); 
            // InternalRangoMode.g:319:3: ( rule__Poison__Group__0 )
            // InternalRangoMode.g:319:4: rule__Poison__Group__0
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
    // InternalRangoMode.g:328:1: entryRulePowerUp : rulePowerUp EOF ;
    public final void entryRulePowerUp() throws RecognitionException {
        try {
            // InternalRangoMode.g:329:1: ( rulePowerUp EOF )
            // InternalRangoMode.g:330:1: rulePowerUp EOF
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
    // InternalRangoMode.g:337:1: rulePowerUp : ( ( rule__PowerUp__Group__0 ) ) ;
    public final void rulePowerUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:341:2: ( ( ( rule__PowerUp__Group__0 ) ) )
            // InternalRangoMode.g:342:2: ( ( rule__PowerUp__Group__0 ) )
            {
            // InternalRangoMode.g:342:2: ( ( rule__PowerUp__Group__0 ) )
            // InternalRangoMode.g:343:3: ( rule__PowerUp__Group__0 )
            {
             before(grammarAccess.getPowerUpAccess().getGroup()); 
            // InternalRangoMode.g:344:3: ( rule__PowerUp__Group__0 )
            // InternalRangoMode.g:344:4: rule__PowerUp__Group__0
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


    // $ANTLR start "entryRuleMaterial"
    // InternalRangoMode.g:353:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalRangoMode.g:354:1: ( ruleMaterial EOF )
            // InternalRangoMode.g:355:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalRangoMode.g:362:1: ruleMaterial : ( ( rule__Material__Group__0 ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:366:2: ( ( ( rule__Material__Group__0 ) ) )
            // InternalRangoMode.g:367:2: ( ( rule__Material__Group__0 ) )
            {
            // InternalRangoMode.g:367:2: ( ( rule__Material__Group__0 ) )
            // InternalRangoMode.g:368:3: ( rule__Material__Group__0 )
            {
             before(grammarAccess.getMaterialAccess().getGroup()); 
            // InternalRangoMode.g:369:3: ( rule__Material__Group__0 )
            // InternalRangoMode.g:369:4: rule__Material__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Material__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRulePlayerProfile"
    // InternalRangoMode.g:378:1: entryRulePlayerProfile : rulePlayerProfile EOF ;
    public final void entryRulePlayerProfile() throws RecognitionException {
        try {
            // InternalRangoMode.g:379:1: ( rulePlayerProfile EOF )
            // InternalRangoMode.g:380:1: rulePlayerProfile EOF
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
    // InternalRangoMode.g:387:1: rulePlayerProfile : ( ( rule__PlayerProfile__Group__0 ) ) ;
    public final void rulePlayerProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:391:2: ( ( ( rule__PlayerProfile__Group__0 ) ) )
            // InternalRangoMode.g:392:2: ( ( rule__PlayerProfile__Group__0 ) )
            {
            // InternalRangoMode.g:392:2: ( ( rule__PlayerProfile__Group__0 ) )
            // InternalRangoMode.g:393:3: ( rule__PlayerProfile__Group__0 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup()); 
            // InternalRangoMode.g:394:3: ( rule__PlayerProfile__Group__0 )
            // InternalRangoMode.g:394:4: rule__PlayerProfile__Group__0
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
    // InternalRangoMode.g:403:1: entryRuleGameMode : ruleGameMode EOF ;
    public final void entryRuleGameMode() throws RecognitionException {
        try {
            // InternalRangoMode.g:404:1: ( ruleGameMode EOF )
            // InternalRangoMode.g:405:1: ruleGameMode EOF
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
    // InternalRangoMode.g:412:1: ruleGameMode : ( ( rule__GameMode__Group__0 ) ) ;
    public final void ruleGameMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:416:2: ( ( ( rule__GameMode__Group__0 ) ) )
            // InternalRangoMode.g:417:2: ( ( rule__GameMode__Group__0 ) )
            {
            // InternalRangoMode.g:417:2: ( ( rule__GameMode__Group__0 ) )
            // InternalRangoMode.g:418:3: ( rule__GameMode__Group__0 )
            {
             before(grammarAccess.getGameModeAccess().getGroup()); 
            // InternalRangoMode.g:419:3: ( rule__GameMode__Group__0 )
            // InternalRangoMode.g:419:4: rule__GameMode__Group__0
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


    // $ANTLR start "entryRuleSpeedBonus"
    // InternalRangoMode.g:428:1: entryRuleSpeedBonus : ruleSpeedBonus EOF ;
    public final void entryRuleSpeedBonus() throws RecognitionException {
        try {
            // InternalRangoMode.g:429:1: ( ruleSpeedBonus EOF )
            // InternalRangoMode.g:430:1: ruleSpeedBonus EOF
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
    // InternalRangoMode.g:437:1: ruleSpeedBonus : ( ( rule__SpeedBonus__Group__0 ) ) ;
    public final void ruleSpeedBonus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:441:2: ( ( ( rule__SpeedBonus__Group__0 ) ) )
            // InternalRangoMode.g:442:2: ( ( rule__SpeedBonus__Group__0 ) )
            {
            // InternalRangoMode.g:442:2: ( ( rule__SpeedBonus__Group__0 ) )
            // InternalRangoMode.g:443:3: ( rule__SpeedBonus__Group__0 )
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup()); 
            // InternalRangoMode.g:444:3: ( rule__SpeedBonus__Group__0 )
            // InternalRangoMode.g:444:4: rule__SpeedBonus__Group__0
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
    // InternalRangoMode.g:453:1: entryRuleArena : ruleArena EOF ;
    public final void entryRuleArena() throws RecognitionException {
        try {
            // InternalRangoMode.g:454:1: ( ruleArena EOF )
            // InternalRangoMode.g:455:1: ruleArena EOF
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
    // InternalRangoMode.g:462:1: ruleArena : ( ( rule__Arena__Group__0 ) ) ;
    public final void ruleArena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:466:2: ( ( ( rule__Arena__Group__0 ) ) )
            // InternalRangoMode.g:467:2: ( ( rule__Arena__Group__0 ) )
            {
            // InternalRangoMode.g:467:2: ( ( rule__Arena__Group__0 ) )
            // InternalRangoMode.g:468:3: ( rule__Arena__Group__0 )
            {
             before(grammarAccess.getArenaAccess().getGroup()); 
            // InternalRangoMode.g:469:3: ( rule__Arena__Group__0 )
            // InternalRangoMode.g:469:4: rule__Arena__Group__0
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
    // InternalRangoMode.g:479:1: ruleAt : ( ( rule__At__Group__0 ) ) ;
    public final void ruleAt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:483:2: ( ( ( rule__At__Group__0 ) ) )
            // InternalRangoMode.g:484:2: ( ( rule__At__Group__0 ) )
            {
            // InternalRangoMode.g:484:2: ( ( rule__At__Group__0 ) )
            // InternalRangoMode.g:485:3: ( rule__At__Group__0 )
            {
             before(grammarAccess.getAtAccess().getGroup()); 
            // InternalRangoMode.g:486:3: ( rule__At__Group__0 )
            // InternalRangoMode.g:486:4: rule__At__Group__0
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
    // InternalRangoMode.g:495:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalRangoMode.g:496:1: ( ruleObstacle EOF )
            // InternalRangoMode.g:497:1: ruleObstacle EOF
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
    // InternalRangoMode.g:504:1: ruleObstacle : ( ( rule__Obstacle__Alternatives ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:508:2: ( ( ( rule__Obstacle__Alternatives ) ) )
            // InternalRangoMode.g:509:2: ( ( rule__Obstacle__Alternatives ) )
            {
            // InternalRangoMode.g:509:2: ( ( rule__Obstacle__Alternatives ) )
            // InternalRangoMode.g:510:3: ( rule__Obstacle__Alternatives )
            {
             before(grammarAccess.getObstacleAccess().getAlternatives()); 
            // InternalRangoMode.g:511:3: ( rule__Obstacle__Alternatives )
            // InternalRangoMode.g:511:4: rule__Obstacle__Alternatives
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
    // InternalRangoMode.g:520:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRangoMode.g:521:1: ( ruleBlock EOF )
            // InternalRangoMode.g:522:1: ruleBlock EOF
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
    // InternalRangoMode.g:529:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:533:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRangoMode.g:534:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRangoMode.g:534:2: ( ( rule__Block__Group__0 ) )
            // InternalRangoMode.g:535:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRangoMode.g:536:3: ( rule__Block__Group__0 )
            // InternalRangoMode.g:536:4: rule__Block__Group__0
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
    // InternalRangoMode.g:545:1: entryRuleJumpPad : ruleJumpPad EOF ;
    public final void entryRuleJumpPad() throws RecognitionException {
        try {
            // InternalRangoMode.g:546:1: ( ruleJumpPad EOF )
            // InternalRangoMode.g:547:1: ruleJumpPad EOF
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
    // InternalRangoMode.g:554:1: ruleJumpPad : ( ( rule__JumpPad__Group__0 ) ) ;
    public final void ruleJumpPad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:558:2: ( ( ( rule__JumpPad__Group__0 ) ) )
            // InternalRangoMode.g:559:2: ( ( rule__JumpPad__Group__0 ) )
            {
            // InternalRangoMode.g:559:2: ( ( rule__JumpPad__Group__0 ) )
            // InternalRangoMode.g:560:3: ( rule__JumpPad__Group__0 )
            {
             before(grammarAccess.getJumpPadAccess().getGroup()); 
            // InternalRangoMode.g:561:3: ( rule__JumpPad__Group__0 )
            // InternalRangoMode.g:561:4: rule__JumpPad__Group__0
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
    // InternalRangoMode.g:570:1: entryRuleTeleporter : ruleTeleporter EOF ;
    public final void entryRuleTeleporter() throws RecognitionException {
        try {
            // InternalRangoMode.g:571:1: ( ruleTeleporter EOF )
            // InternalRangoMode.g:572:1: ruleTeleporter EOF
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
    // InternalRangoMode.g:579:1: ruleTeleporter : ( ( rule__Teleporter__Group__0 ) ) ;
    public final void ruleTeleporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:583:2: ( ( ( rule__Teleporter__Group__0 ) ) )
            // InternalRangoMode.g:584:2: ( ( rule__Teleporter__Group__0 ) )
            {
            // InternalRangoMode.g:584:2: ( ( rule__Teleporter__Group__0 ) )
            // InternalRangoMode.g:585:3: ( rule__Teleporter__Group__0 )
            {
             before(grammarAccess.getTeleporterAccess().getGroup()); 
            // InternalRangoMode.g:586:3: ( rule__Teleporter__Group__0 )
            // InternalRangoMode.g:586:4: rule__Teleporter__Group__0
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
    // InternalRangoMode.g:595:1: entryRuleSpawnStrategy : ruleSpawnStrategy EOF ;
    public final void entryRuleSpawnStrategy() throws RecognitionException {
        try {
            // InternalRangoMode.g:596:1: ( ruleSpawnStrategy EOF )
            // InternalRangoMode.g:597:1: ruleSpawnStrategy EOF
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
    // InternalRangoMode.g:604:1: ruleSpawnStrategy : ( ( rule__SpawnStrategy__Alternatives ) ) ;
    public final void ruleSpawnStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:608:2: ( ( ( rule__SpawnStrategy__Alternatives ) ) )
            // InternalRangoMode.g:609:2: ( ( rule__SpawnStrategy__Alternatives ) )
            {
            // InternalRangoMode.g:609:2: ( ( rule__SpawnStrategy__Alternatives ) )
            // InternalRangoMode.g:610:3: ( rule__SpawnStrategy__Alternatives )
            {
             before(grammarAccess.getSpawnStrategyAccess().getAlternatives()); 
            // InternalRangoMode.g:611:3: ( rule__SpawnStrategy__Alternatives )
            // InternalRangoMode.g:611:4: rule__SpawnStrategy__Alternatives
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
    // InternalRangoMode.g:620:1: entryRuleFixedLayout : ruleFixedLayout EOF ;
    public final void entryRuleFixedLayout() throws RecognitionException {
        try {
            // InternalRangoMode.g:621:1: ( ruleFixedLayout EOF )
            // InternalRangoMode.g:622:1: ruleFixedLayout EOF
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
    // InternalRangoMode.g:629:1: ruleFixedLayout : ( ( rule__FixedLayout__Group__0 ) ) ;
    public final void ruleFixedLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:633:2: ( ( ( rule__FixedLayout__Group__0 ) ) )
            // InternalRangoMode.g:634:2: ( ( rule__FixedLayout__Group__0 ) )
            {
            // InternalRangoMode.g:634:2: ( ( rule__FixedLayout__Group__0 ) )
            // InternalRangoMode.g:635:3: ( rule__FixedLayout__Group__0 )
            {
             before(grammarAccess.getFixedLayoutAccess().getGroup()); 
            // InternalRangoMode.g:636:3: ( rule__FixedLayout__Group__0 )
            // InternalRangoMode.g:636:4: rule__FixedLayout__Group__0
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
    // InternalRangoMode.g:645:1: entryRuleWaveSchedule : ruleWaveSchedule EOF ;
    public final void entryRuleWaveSchedule() throws RecognitionException {
        try {
            // InternalRangoMode.g:646:1: ( ruleWaveSchedule EOF )
            // InternalRangoMode.g:647:1: ruleWaveSchedule EOF
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
    // InternalRangoMode.g:654:1: ruleWaveSchedule : ( ( rule__WaveSchedule__Group__0 ) ) ;
    public final void ruleWaveSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:658:2: ( ( ( rule__WaveSchedule__Group__0 ) ) )
            // InternalRangoMode.g:659:2: ( ( rule__WaveSchedule__Group__0 ) )
            {
            // InternalRangoMode.g:659:2: ( ( rule__WaveSchedule__Group__0 ) )
            // InternalRangoMode.g:660:3: ( rule__WaveSchedule__Group__0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup()); 
            // InternalRangoMode.g:661:3: ( rule__WaveSchedule__Group__0 )
            // InternalRangoMode.g:661:4: rule__WaveSchedule__Group__0
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
    // InternalRangoMode.g:670:1: entryRuleWave : ruleWave EOF ;
    public final void entryRuleWave() throws RecognitionException {
        try {
            // InternalRangoMode.g:671:1: ( ruleWave EOF )
            // InternalRangoMode.g:672:1: ruleWave EOF
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
    // InternalRangoMode.g:679:1: ruleWave : ( ( rule__Wave__Group__0 ) ) ;
    public final void ruleWave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:683:2: ( ( ( rule__Wave__Group__0 ) ) )
            // InternalRangoMode.g:684:2: ( ( rule__Wave__Group__0 ) )
            {
            // InternalRangoMode.g:684:2: ( ( rule__Wave__Group__0 ) )
            // InternalRangoMode.g:685:3: ( rule__Wave__Group__0 )
            {
             before(grammarAccess.getWaveAccess().getGroup()); 
            // InternalRangoMode.g:686:3: ( rule__Wave__Group__0 )
            // InternalRangoMode.g:686:4: rule__Wave__Group__0
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
    // InternalRangoMode.g:695:1: entryRuleEnemySpawn : ruleEnemySpawn EOF ;
    public final void entryRuleEnemySpawn() throws RecognitionException {
        try {
            // InternalRangoMode.g:696:1: ( ruleEnemySpawn EOF )
            // InternalRangoMode.g:697:1: ruleEnemySpawn EOF
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
    // InternalRangoMode.g:704:1: ruleEnemySpawn : ( ( rule__EnemySpawn__Group__0 ) ) ;
    public final void ruleEnemySpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:708:2: ( ( ( rule__EnemySpawn__Group__0 ) ) )
            // InternalRangoMode.g:709:2: ( ( rule__EnemySpawn__Group__0 ) )
            {
            // InternalRangoMode.g:709:2: ( ( rule__EnemySpawn__Group__0 ) )
            // InternalRangoMode.g:710:3: ( rule__EnemySpawn__Group__0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup()); 
            // InternalRangoMode.g:711:3: ( rule__EnemySpawn__Group__0 )
            // InternalRangoMode.g:711:4: rule__EnemySpawn__Group__0
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
    // InternalRangoMode.g:721:1: ruleDrops : ( ( rule__Drops__Group__0 ) ) ;
    public final void ruleDrops() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:725:2: ( ( ( rule__Drops__Group__0 ) ) )
            // InternalRangoMode.g:726:2: ( ( rule__Drops__Group__0 ) )
            {
            // InternalRangoMode.g:726:2: ( ( rule__Drops__Group__0 ) )
            // InternalRangoMode.g:727:3: ( rule__Drops__Group__0 )
            {
             before(grammarAccess.getDropsAccess().getGroup()); 
            // InternalRangoMode.g:728:3: ( rule__Drops__Group__0 )
            // InternalRangoMode.g:728:4: rule__Drops__Group__0
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
    // InternalRangoMode.g:737:1: entryRuleDropTable : ruleDropTable EOF ;
    public final void entryRuleDropTable() throws RecognitionException {
        try {
            // InternalRangoMode.g:738:1: ( ruleDropTable EOF )
            // InternalRangoMode.g:739:1: ruleDropTable EOF
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
    // InternalRangoMode.g:746:1: ruleDropTable : ( ( rule__DropTable__Group__0 ) ) ;
    public final void ruleDropTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:750:2: ( ( ( rule__DropTable__Group__0 ) ) )
            // InternalRangoMode.g:751:2: ( ( rule__DropTable__Group__0 ) )
            {
            // InternalRangoMode.g:751:2: ( ( rule__DropTable__Group__0 ) )
            // InternalRangoMode.g:752:3: ( rule__DropTable__Group__0 )
            {
             before(grammarAccess.getDropTableAccess().getGroup()); 
            // InternalRangoMode.g:753:3: ( rule__DropTable__Group__0 )
            // InternalRangoMode.g:753:4: rule__DropTable__Group__0
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
    // InternalRangoMode.g:762:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalRangoMode.g:763:1: ( ruleDrop EOF )
            // InternalRangoMode.g:764:1: ruleDrop EOF
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
    // InternalRangoMode.g:771:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:775:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalRangoMode.g:776:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalRangoMode.g:776:2: ( ( rule__Drop__Group__0 ) )
            // InternalRangoMode.g:777:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalRangoMode.g:778:3: ( rule__Drop__Group__0 )
            // InternalRangoMode.g:778:4: rule__Drop__Group__0
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
    // InternalRangoMode.g:787:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:788:1: ( ruleEndCondition EOF )
            // InternalRangoMode.g:789:1: ruleEndCondition EOF
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
    // InternalRangoMode.g:796:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:800:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalRangoMode.g:801:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalRangoMode.g:801:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalRangoMode.g:802:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:803:3: ( rule__EndCondition__Alternatives )
            // InternalRangoMode.g:803:4: rule__EndCondition__Alternatives
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
    // InternalRangoMode.g:812:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:813:1: ( ruleCleared EOF )
            // InternalRangoMode.g:814:1: ruleCleared EOF
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
    // InternalRangoMode.g:821:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:825:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:826:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:826:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:827:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:828:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:828:4: rule__Cleared__Group__0
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
    // InternalRangoMode.g:837:1: entryRuleTimeReached : ruleTimeReached EOF ;
    public final void entryRuleTimeReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:838:1: ( ruleTimeReached EOF )
            // InternalRangoMode.g:839:1: ruleTimeReached EOF
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
    // InternalRangoMode.g:846:1: ruleTimeReached : ( ( rule__TimeReached__Group__0 ) ) ;
    public final void ruleTimeReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:850:2: ( ( ( rule__TimeReached__Group__0 ) ) )
            // InternalRangoMode.g:851:2: ( ( rule__TimeReached__Group__0 ) )
            {
            // InternalRangoMode.g:851:2: ( ( rule__TimeReached__Group__0 ) )
            // InternalRangoMode.g:852:3: ( rule__TimeReached__Group__0 )
            {
             before(grammarAccess.getTimeReachedAccess().getGroup()); 
            // InternalRangoMode.g:853:3: ( rule__TimeReached__Group__0 )
            // InternalRangoMode.g:853:4: rule__TimeReached__Group__0
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
    // InternalRangoMode.g:862:1: entryRuleScoreReached : ruleScoreReached EOF ;
    public final void entryRuleScoreReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:863:1: ( ruleScoreReached EOF )
            // InternalRangoMode.g:864:1: ruleScoreReached EOF
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
    // InternalRangoMode.g:871:1: ruleScoreReached : ( ( rule__ScoreReached__Group__0 ) ) ;
    public final void ruleScoreReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:875:2: ( ( ( rule__ScoreReached__Group__0 ) ) )
            // InternalRangoMode.g:876:2: ( ( rule__ScoreReached__Group__0 ) )
            {
            // InternalRangoMode.g:876:2: ( ( rule__ScoreReached__Group__0 ) )
            // InternalRangoMode.g:877:3: ( rule__ScoreReached__Group__0 )
            {
             before(grammarAccess.getScoreReachedAccess().getGroup()); 
            // InternalRangoMode.g:878:3: ( rule__ScoreReached__Group__0 )
            // InternalRangoMode.g:878:4: rule__ScoreReached__Group__0
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
    // InternalRangoMode.g:887:1: entryRuleEnemiesPopped : ruleEnemiesPopped EOF ;
    public final void entryRuleEnemiesPopped() throws RecognitionException {
        try {
            // InternalRangoMode.g:888:1: ( ruleEnemiesPopped EOF )
            // InternalRangoMode.g:889:1: ruleEnemiesPopped EOF
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
    // InternalRangoMode.g:896:1: ruleEnemiesPopped : ( ( rule__EnemiesPopped__Group__0 ) ) ;
    public final void ruleEnemiesPopped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:900:2: ( ( ( rule__EnemiesPopped__Group__0 ) ) )
            // InternalRangoMode.g:901:2: ( ( rule__EnemiesPopped__Group__0 ) )
            {
            // InternalRangoMode.g:901:2: ( ( rule__EnemiesPopped__Group__0 ) )
            // InternalRangoMode.g:902:3: ( rule__EnemiesPopped__Group__0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getGroup()); 
            // InternalRangoMode.g:903:3: ( rule__EnemiesPopped__Group__0 )
            // InternalRangoMode.g:903:4: rule__EnemiesPopped__Group__0
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
    // InternalRangoMode.g:912:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:913:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:914:1: ruleWavesSurvived EOF
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
    // InternalRangoMode.g:921:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:925:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:926:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:926:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:927:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:928:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:928:4: rule__WavesSurvived__Group__0
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
    // InternalRangoMode.g:937:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:938:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:939:1: ruleHealthDepleted EOF
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
    // InternalRangoMode.g:946:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:950:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:951:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:951:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:952:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:953:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:953:4: rule__HealthDepleted__Group__0
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
    // InternalRangoMode.g:962:1: entryRuleEnemiesAlive : ruleEnemiesAlive EOF ;
    public final void entryRuleEnemiesAlive() throws RecognitionException {
        try {
            // InternalRangoMode.g:963:1: ( ruleEnemiesAlive EOF )
            // InternalRangoMode.g:964:1: ruleEnemiesAlive EOF
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
    // InternalRangoMode.g:971:1: ruleEnemiesAlive : ( ( rule__EnemiesAlive__Group__0 ) ) ;
    public final void ruleEnemiesAlive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:975:2: ( ( ( rule__EnemiesAlive__Group__0 ) ) )
            // InternalRangoMode.g:976:2: ( ( rule__EnemiesAlive__Group__0 ) )
            {
            // InternalRangoMode.g:976:2: ( ( rule__EnemiesAlive__Group__0 ) )
            // InternalRangoMode.g:977:3: ( rule__EnemiesAlive__Group__0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getGroup()); 
            // InternalRangoMode.g:978:3: ( rule__EnemiesAlive__Group__0 )
            // InternalRangoMode.g:978:4: rule__EnemiesAlive__Group__0
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
    // InternalRangoMode.g:987:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:988:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:989:1: ruleDecimal EOF
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
    // InternalRangoMode.g:996:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1000:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:1001:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:1001:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:1002:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:1003:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:1003:4: rule__Decimal__Group__0
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


    // $ANTLR start "ruleTarget"
    // InternalRangoMode.g:1012:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1016:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1017:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1017:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1018:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1019:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1019:4: rule__Target__Alternatives
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
    // InternalRangoMode.g:1028:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1032:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1033:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1033:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1034:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1035:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1035:4: rule__Direction__Alternatives
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
    // InternalRangoMode.g:1043:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1047:1: ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 45:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case 86:
                {
                alt1=5;
                }
                break;
            case 52:
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
                    // InternalRangoMode.g:1048:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1048:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1049:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1050:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    // InternalRangoMode.g:1050:4: rule__Edition__EnemyTypesAssignment_3_0
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
                    // InternalRangoMode.g:1054:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1054:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1055:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1056:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1056:4: rule__Edition__PowerUpsAssignment_3_1
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
                    // InternalRangoMode.g:1060:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1060:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    // InternalRangoMode.g:1061:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getMaterialsAssignment_3_2()); 
                    // InternalRangoMode.g:1062:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    // InternalRangoMode.g:1062:4: rule__Edition__MaterialsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__MaterialsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getMaterialsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:1066:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    {
                    // InternalRangoMode.g:1066:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    // InternalRangoMode.g:1067:3: ( rule__Edition__PlayersAssignment_3_3 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_3()); 
                    // InternalRangoMode.g:1068:3: ( rule__Edition__PlayersAssignment_3_3 )
                    // InternalRangoMode.g:1068:4: rule__Edition__PlayersAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__PlayersAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getPlayersAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1072:2: ( ruleDrops )
                    {
                    // InternalRangoMode.g:1072:2: ( ruleDrops )
                    // InternalRangoMode.g:1073:3: ruleDrops
                    {
                     before(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDrops();

                    state._fsp--;

                     after(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:1078:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    {
                    // InternalRangoMode.g:1078:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    // InternalRangoMode.g:1079:3: ( rule__Edition__ModesAssignment_3_5 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_5()); 
                    // InternalRangoMode.g:1080:3: ( rule__Edition__ModesAssignment_3_5 )
                    // InternalRangoMode.g:1080:4: rule__Edition__ModesAssignment_3_5
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
    // InternalRangoMode.g:1088:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1092:1: ( ( ruleVanish ) | ( ruleSplit ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRangoMode.g:1093:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1093:2: ( ruleVanish )
                    // InternalRangoMode.g:1094:3: ruleVanish
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
                    // InternalRangoMode.g:1099:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1099:2: ( ruleSplit )
                    // InternalRangoMode.g:1100:3: ruleSplit
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
    // InternalRangoMode.g:1109:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1113:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 41:
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
                    // InternalRangoMode.g:1114:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1114:2: ( ruleDamage )
                    // InternalRangoMode.g:1115:3: ruleDamage
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
                    // InternalRangoMode.g:1120:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1120:2: ( ruleHeal )
                    // InternalRangoMode.g:1121:3: ruleHeal
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
                    // InternalRangoMode.g:1126:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1126:2: ( ruleShield )
                    // InternalRangoMode.g:1127:3: ruleShield
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
                    // InternalRangoMode.g:1132:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1132:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1133:3: ruleSpeedChange
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
                    // InternalRangoMode.g:1138:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1138:2: ( rulePoison )
                    // InternalRangoMode.g:1139:3: rulePoison
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


    // $ANTLR start "rule__Obstacle__Alternatives"
    // InternalRangoMode.g:1148:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1152:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt4=1;
                }
                break;
            case 76:
                {
                alt4=2;
                }
                break;
            case 79:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRangoMode.g:1153:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1153:2: ( ruleBlock )
                    // InternalRangoMode.g:1154:3: ruleBlock
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
                    // InternalRangoMode.g:1159:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1159:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1160:3: ruleJumpPad
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
                    // InternalRangoMode.g:1165:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1165:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1166:3: ruleTeleporter
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
    // InternalRangoMode.g:1175:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1179:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==80) ) {
                alt5=1;
            }
            else if ( (LA5_0==81) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1180:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1180:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1181:3: ruleFixedLayout
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
                    // InternalRangoMode.g:1186:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1186:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1187:3: ruleWaveSchedule
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
    // InternalRangoMode.g:1196:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1200:1: ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:1201:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1201:2: ( ruleCleared )
                    // InternalRangoMode.g:1202:3: ruleCleared
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
                    // InternalRangoMode.g:1207:2: ( ruleTimeReached )
                    {
                    // InternalRangoMode.g:1207:2: ( ruleTimeReached )
                    // InternalRangoMode.g:1208:3: ruleTimeReached
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
                    // InternalRangoMode.g:1213:2: ( ruleScoreReached )
                    {
                    // InternalRangoMode.g:1213:2: ( ruleScoreReached )
                    // InternalRangoMode.g:1214:3: ruleScoreReached
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
                    // InternalRangoMode.g:1219:2: ( ruleEnemiesPopped )
                    {
                    // InternalRangoMode.g:1219:2: ( ruleEnemiesPopped )
                    // InternalRangoMode.g:1220:3: ruleEnemiesPopped
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
                    // InternalRangoMode.g:1225:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1225:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1226:3: ruleWavesSurvived
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
                    // InternalRangoMode.g:1231:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1231:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1232:3: ruleHealthDepleted
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
                    // InternalRangoMode.g:1237:2: ( ruleEnemiesAlive )
                    {
                    // InternalRangoMode.g:1237:2: ( ruleEnemiesAlive )
                    // InternalRangoMode.g:1238:3: ruleEnemiesAlive
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


    // $ANTLR start "rule__Target__Alternatives"
    // InternalRangoMode.g:1247:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1251:1: ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1252:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1252:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1253:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1254:3: ( 'everything' )
                    // InternalRangoMode.g:1254:4: 'everything'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1258:2: ( ( 'enemies' ) )
                    {
                    // InternalRangoMode.g:1258:2: ( ( 'enemies' ) )
                    // InternalRangoMode.g:1259:3: ( 'enemies' )
                    {
                     before(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1260:3: ( 'enemies' )
                    // InternalRangoMode.g:1260:4: 'enemies'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1264:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1264:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1265:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1266:3: ( 'player' )
                    // InternalRangoMode.g:1266:4: 'player'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalRangoMode.g:1274:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1278:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:1279:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1279:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1280:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1281:3: ( 'left' )
                    // InternalRangoMode.g:1281:4: 'left'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1285:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1285:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1286:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1287:3: ( 'right' )
                    // InternalRangoMode.g:1287:4: 'right'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalRangoMode.g:1295:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1299:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1300:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:1307:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1311:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1312:1: ( 'edition' )
            {
            // InternalRangoMode.g:1312:1: ( 'edition' )
            // InternalRangoMode.g:1313:2: 'edition'
            {
             before(grammarAccess.getEditionAccess().getEditionKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRangoMode.g:1322:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1326:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1327:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:1334:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1338:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1339:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1339:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1340:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1341:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1341:3: rule__Edition__NameAssignment_1
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
    // InternalRangoMode.g:1349:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1353:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1354:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:1361:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1365:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1366:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1366:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1367:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1368:2: ( rule__Edition__TitleAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:1368:3: rule__Edition__TitleAssignment_2
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
    // InternalRangoMode.g:1376:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1380:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1381:2: rule__Edition__Group__3__Impl
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
    // InternalRangoMode.g:1387:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1391:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1392:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1392:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1393:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1394:2: ( rule__Edition__Alternatives_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13||LA10_0==17||LA10_0==43||LA10_0==45||LA10_0==52||LA10_0==86) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRangoMode.g:1394:3: rule__Edition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Edition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__EnemyType__Group__0"
    // InternalRangoMode.g:1403:1: rule__EnemyType__Group__0 : rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 ;
    public final void rule__EnemyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1407:1: ( rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 )
            // InternalRangoMode.g:1408:2: rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:1415:1: rule__EnemyType__Group__0__Impl : ( 'enemy' ) ;
    public final void rule__EnemyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1419:1: ( ( 'enemy' ) )
            // InternalRangoMode.g:1420:1: ( 'enemy' )
            {
            // InternalRangoMode.g:1420:1: ( 'enemy' )
            // InternalRangoMode.g:1421:2: 'enemy'
            {
             before(grammarAccess.getEnemyTypeAccess().getEnemyKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRangoMode.g:1430:1: rule__EnemyType__Group__1 : rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 ;
    public final void rule__EnemyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1434:1: ( rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 )
            // InternalRangoMode.g:1435:2: rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:1442:1: rule__EnemyType__Group__1__Impl : ( ( rule__EnemyType__NameAssignment_1 ) ) ;
    public final void rule__EnemyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1446:1: ( ( ( rule__EnemyType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1447:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1447:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            // InternalRangoMode.g:1448:2: ( rule__EnemyType__NameAssignment_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1449:2: ( rule__EnemyType__NameAssignment_1 )
            // InternalRangoMode.g:1449:3: rule__EnemyType__NameAssignment_1
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
    // InternalRangoMode.g:1457:1: rule__EnemyType__Group__2 : rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 ;
    public final void rule__EnemyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1461:1: ( rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 )
            // InternalRangoMode.g:1462:2: rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:1469:1: rule__EnemyType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnemyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1473:1: ( ( '{' ) )
            // InternalRangoMode.g:1474:1: ( '{' )
            {
            // InternalRangoMode.g:1474:1: ( '{' )
            // InternalRangoMode.g:1475:2: '{'
            {
             before(grammarAccess.getEnemyTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:1484:1: rule__EnemyType__Group__3 : rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 ;
    public final void rule__EnemyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1488:1: ( rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 )
            // InternalRangoMode.g:1489:2: rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRangoMode.g:1496:1: rule__EnemyType__Group__3__Impl : ( ( rule__EnemyType__UnorderedGroup_3 ) ) ;
    public final void rule__EnemyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1500:1: ( ( ( rule__EnemyType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1501:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1501:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1502:2: ( rule__EnemyType__UnorderedGroup_3 )
            {
             before(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1503:2: ( rule__EnemyType__UnorderedGroup_3 )
            // InternalRangoMode.g:1503:3: rule__EnemyType__UnorderedGroup_3
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
    // InternalRangoMode.g:1511:1: rule__EnemyType__Group__4 : rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 ;
    public final void rule__EnemyType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1515:1: ( rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 )
            // InternalRangoMode.g:1516:2: rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalRangoMode.g:1523:1: rule__EnemyType__Group__4__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1527:1: ( ( 'on' ) )
            // InternalRangoMode.g:1528:1: ( 'on' )
            {
            // InternalRangoMode.g:1528:1: ( 'on' )
            // InternalRangoMode.g:1529:2: 'on'
            {
             before(grammarAccess.getEnemyTypeAccess().getOnKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRangoMode.g:1538:1: rule__EnemyType__Group__5 : rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 ;
    public final void rule__EnemyType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1542:1: ( rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 )
            // InternalRangoMode.g:1543:2: rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalRangoMode.g:1550:1: rule__EnemyType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__EnemyType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1554:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1555:1: ( 'pop' )
            {
            // InternalRangoMode.g:1555:1: ( 'pop' )
            // InternalRangoMode.g:1556:2: 'pop'
            {
             before(grammarAccess.getEnemyTypeAccess().getPopKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:1565:1: rule__EnemyType__Group__6 : rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 ;
    public final void rule__EnemyType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1569:1: ( rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 )
            // InternalRangoMode.g:1570:2: rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalRangoMode.g:1577:1: rule__EnemyType__Group__6__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1581:1: ( ( ':' ) )
            // InternalRangoMode.g:1582:1: ( ':' )
            {
            // InternalRangoMode.g:1582:1: ( ':' )
            // InternalRangoMode.g:1583:2: ':'
            {
             before(grammarAccess.getEnemyTypeAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRangoMode.g:1592:1: rule__EnemyType__Group__7 : rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 ;
    public final void rule__EnemyType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1596:1: ( rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 )
            // InternalRangoMode.g:1597:2: rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalRangoMode.g:1604:1: rule__EnemyType__Group__7__Impl : ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) ;
    public final void rule__EnemyType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1608:1: ( ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:1609:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:1609:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:1610:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:1611:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:1611:3: rule__EnemyType__SplitRuleAssignment_7
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
    // InternalRangoMode.g:1619:1: rule__EnemyType__Group__8 : rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 ;
    public final void rule__EnemyType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1623:1: ( rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 )
            // InternalRangoMode.g:1624:2: rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalRangoMode.g:1631:1: rule__EnemyType__Group__8__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1635:1: ( ( 'on' ) )
            // InternalRangoMode.g:1636:1: ( 'on' )
            {
            // InternalRangoMode.g:1636:1: ( 'on' )
            // InternalRangoMode.g:1637:2: 'on'
            {
             before(grammarAccess.getEnemyTypeAccess().getOnKeyword_8()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRangoMode.g:1646:1: rule__EnemyType__Group__9 : rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 ;
    public final void rule__EnemyType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1650:1: ( rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 )
            // InternalRangoMode.g:1651:2: rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalRangoMode.g:1658:1: rule__EnemyType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__EnemyType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1662:1: ( ( 'contact' ) )
            // InternalRangoMode.g:1663:1: ( 'contact' )
            {
            // InternalRangoMode.g:1663:1: ( 'contact' )
            // InternalRangoMode.g:1664:2: 'contact'
            {
             before(grammarAccess.getEnemyTypeAccess().getContactKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRangoMode.g:1673:1: rule__EnemyType__Group__10 : rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 ;
    public final void rule__EnemyType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1677:1: ( rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 )
            // InternalRangoMode.g:1678:2: rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11
            {
            pushFollow(FOLLOW_13);
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
    // InternalRangoMode.g:1685:1: rule__EnemyType__Group__10__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1689:1: ( ( ':' ) )
            // InternalRangoMode.g:1690:1: ( ':' )
            {
            // InternalRangoMode.g:1690:1: ( ':' )
            // InternalRangoMode.g:1691:2: ':'
            {
             before(grammarAccess.getEnemyTypeAccess().getColonKeyword_10()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRangoMode.g:1700:1: rule__EnemyType__Group__11 : rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 ;
    public final void rule__EnemyType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1704:1: ( rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 )
            // InternalRangoMode.g:1705:2: rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:1712:1: rule__EnemyType__Group__11__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__EnemyType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1716:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:1717:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:1717:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:1718:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:1719:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:1719:3: rule__EnemyType__ContactEffectsAssignment_11
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
    // InternalRangoMode.g:1727:1: rule__EnemyType__Group__12 : rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 ;
    public final void rule__EnemyType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1731:1: ( rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 )
            // InternalRangoMode.g:1732:2: rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:1739:1: rule__EnemyType__Group__12__Impl : ( ( rule__EnemyType__Group_12__0 )* ) ;
    public final void rule__EnemyType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1743:1: ( ( ( rule__EnemyType__Group_12__0 )* ) )
            // InternalRangoMode.g:1744:1: ( ( rule__EnemyType__Group_12__0 )* )
            {
            // InternalRangoMode.g:1744:1: ( ( rule__EnemyType__Group_12__0 )* )
            // InternalRangoMode.g:1745:2: ( rule__EnemyType__Group_12__0 )*
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:1746:2: ( rule__EnemyType__Group_12__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRangoMode.g:1746:3: rule__EnemyType__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EnemyType__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRangoMode.g:1754:1: rule__EnemyType__Group__13 : rule__EnemyType__Group__13__Impl ;
    public final void rule__EnemyType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1758:1: ( rule__EnemyType__Group__13__Impl )
            // InternalRangoMode.g:1759:2: rule__EnemyType__Group__13__Impl
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
    // InternalRangoMode.g:1765:1: rule__EnemyType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnemyType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1769:1: ( ( '}' ) )
            // InternalRangoMode.g:1770:1: ( '}' )
            {
            // InternalRangoMode.g:1770:1: ( '}' )
            // InternalRangoMode.g:1771:2: '}'
            {
             before(grammarAccess.getEnemyTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:1781:1: rule__EnemyType__Group_3_0__0 : rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 ;
    public final void rule__EnemyType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1785:1: ( rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 )
            // InternalRangoMode.g:1786:2: rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:1793:1: rule__EnemyType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__EnemyType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1797:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:1798:1: ( 'sprite' )
            {
            // InternalRangoMode.g:1798:1: ( 'sprite' )
            // InternalRangoMode.g:1799:2: 'sprite'
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteKeyword_3_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRangoMode.g:1808:1: rule__EnemyType__Group_3_0__1 : rule__EnemyType__Group_3_0__1__Impl ;
    public final void rule__EnemyType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1812:1: ( rule__EnemyType__Group_3_0__1__Impl )
            // InternalRangoMode.g:1813:2: rule__EnemyType__Group_3_0__1__Impl
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
    // InternalRangoMode.g:1819:1: rule__EnemyType__Group_3_0__1__Impl : ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__EnemyType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1823:1: ( ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:1824:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:1824:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:1825:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:1826:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:1826:3: rule__EnemyType__SpriteAssignment_3_0_1
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
    // InternalRangoMode.g:1835:1: rule__EnemyType__Group_3_1__0 : rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 ;
    public final void rule__EnemyType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1839:1: ( rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 )
            // InternalRangoMode.g:1840:2: rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:1847:1: rule__EnemyType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__EnemyType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1851:1: ( ( 'scale' ) )
            // InternalRangoMode.g:1852:1: ( 'scale' )
            {
            // InternalRangoMode.g:1852:1: ( 'scale' )
            // InternalRangoMode.g:1853:2: 'scale'
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:1862:1: rule__EnemyType__Group_3_1__1 : rule__EnemyType__Group_3_1__1__Impl ;
    public final void rule__EnemyType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1866:1: ( rule__EnemyType__Group_3_1__1__Impl )
            // InternalRangoMode.g:1867:2: rule__EnemyType__Group_3_1__1__Impl
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
    // InternalRangoMode.g:1873:1: rule__EnemyType__Group_3_1__1__Impl : ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__EnemyType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1877:1: ( ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:1878:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:1878:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:1879:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:1880:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:1880:3: rule__EnemyType__ScaleAssignment_3_1_1
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
    // InternalRangoMode.g:1889:1: rule__EnemyType__Group_3_2__0 : rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 ;
    public final void rule__EnemyType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1893:1: ( rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 )
            // InternalRangoMode.g:1894:2: rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:1901:1: rule__EnemyType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__EnemyType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1905:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:1906:1: ( 'bounce' )
            {
            // InternalRangoMode.g:1906:1: ( 'bounce' )
            // InternalRangoMode.g:1907:2: 'bounce'
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceKeyword_3_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRangoMode.g:1916:1: rule__EnemyType__Group_3_2__1 : rule__EnemyType__Group_3_2__1__Impl ;
    public final void rule__EnemyType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1920:1: ( rule__EnemyType__Group_3_2__1__Impl )
            // InternalRangoMode.g:1921:2: rule__EnemyType__Group_3_2__1__Impl
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
    // InternalRangoMode.g:1927:1: rule__EnemyType__Group_3_2__1__Impl : ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__EnemyType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1931:1: ( ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:1932:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:1932:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:1933:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:1934:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:1934:3: rule__EnemyType__BounceAssignment_3_2_1
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
    // InternalRangoMode.g:1943:1: rule__EnemyType__Group_3_3__0 : rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 ;
    public final void rule__EnemyType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1947:1: ( rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 )
            // InternalRangoMode.g:1948:2: rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:1955:1: rule__EnemyType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__EnemyType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1959:1: ( ( 'speed' ) )
            // InternalRangoMode.g:1960:1: ( 'speed' )
            {
            // InternalRangoMode.g:1960:1: ( 'speed' )
            // InternalRangoMode.g:1961:2: 'speed'
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedKeyword_3_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRangoMode.g:1970:1: rule__EnemyType__Group_3_3__1 : rule__EnemyType__Group_3_3__1__Impl ;
    public final void rule__EnemyType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1974:1: ( rule__EnemyType__Group_3_3__1__Impl )
            // InternalRangoMode.g:1975:2: rule__EnemyType__Group_3_3__1__Impl
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
    // InternalRangoMode.g:1981:1: rule__EnemyType__Group_3_3__1__Impl : ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__EnemyType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1985:1: ( ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:1986:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:1986:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:1987:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:1988:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:1988:3: rule__EnemyType__SpeedAssignment_3_3_1
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
    // InternalRangoMode.g:1997:1: rule__EnemyType__Group_3_4__0 : rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 ;
    public final void rule__EnemyType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2001:1: ( rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 )
            // InternalRangoMode.g:2002:2: rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2009:1: rule__EnemyType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__EnemyType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2013:1: ( ( 'points' ) )
            // InternalRangoMode.g:2014:1: ( 'points' )
            {
            // InternalRangoMode.g:2014:1: ( 'points' )
            // InternalRangoMode.g:2015:2: 'points'
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsKeyword_3_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRangoMode.g:2024:1: rule__EnemyType__Group_3_4__1 : rule__EnemyType__Group_3_4__1__Impl ;
    public final void rule__EnemyType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2028:1: ( rule__EnemyType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2029:2: rule__EnemyType__Group_3_4__1__Impl
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
    // InternalRangoMode.g:2035:1: rule__EnemyType__Group_3_4__1__Impl : ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__EnemyType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2039:1: ( ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2040:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2040:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2041:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2042:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2042:3: rule__EnemyType__PointsAssignment_3_4_1
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
    // InternalRangoMode.g:2051:1: rule__EnemyType__Group_12__0 : rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 ;
    public final void rule__EnemyType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2055:1: ( rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 )
            // InternalRangoMode.g:2056:2: rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRangoMode.g:2063:1: rule__EnemyType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__EnemyType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2067:1: ( ( ',' ) )
            // InternalRangoMode.g:2068:1: ( ',' )
            {
            // InternalRangoMode.g:2068:1: ( ',' )
            // InternalRangoMode.g:2069:2: ','
            {
             before(grammarAccess.getEnemyTypeAccess().getCommaKeyword_12_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:2078:1: rule__EnemyType__Group_12__1 : rule__EnemyType__Group_12__1__Impl ;
    public final void rule__EnemyType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2082:1: ( rule__EnemyType__Group_12__1__Impl )
            // InternalRangoMode.g:2083:2: rule__EnemyType__Group_12__1__Impl
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
    // InternalRangoMode.g:2089:1: rule__EnemyType__Group_12__1__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__EnemyType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2093:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2094:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2094:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2095:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2096:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2096:3: rule__EnemyType__ContactEffectsAssignment_12_1
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
    // InternalRangoMode.g:2105:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2109:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2110:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2117:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2121:1: ( ( () ) )
            // InternalRangoMode.g:2122:1: ( () )
            {
            // InternalRangoMode.g:2122:1: ( () )
            // InternalRangoMode.g:2123:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2124:2: ()
            // InternalRangoMode.g:2124:3: 
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
    // InternalRangoMode.g:2132:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2136:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2137:2: rule__Vanish__Group__1__Impl
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
    // InternalRangoMode.g:2143:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2147:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2148:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2148:1: ( 'vanish' )
            // InternalRangoMode.g:2149:2: 'vanish'
            {
             before(grammarAccess.getVanishAccess().getVanishKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRangoMode.g:2159:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2163:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2164:2: rule__Split__Group__0__Impl rule__Split__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRangoMode.g:2171:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2175:1: ( ( 'split' ) )
            // InternalRangoMode.g:2176:1: ( 'split' )
            {
            // InternalRangoMode.g:2176:1: ( 'split' )
            // InternalRangoMode.g:2177:2: 'split'
            {
             before(grammarAccess.getSplitAccess().getSplitKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRangoMode.g:2186:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2190:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2191:2: rule__Split__Group__1__Impl rule__Split__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2198:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2202:1: ( ( 'into' ) )
            // InternalRangoMode.g:2203:1: ( 'into' )
            {
            // InternalRangoMode.g:2203:1: ( 'into' )
            // InternalRangoMode.g:2204:2: 'into'
            {
             before(grammarAccess.getSplitAccess().getIntoKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRangoMode.g:2213:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2217:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2218:2: rule__Split__Group__2__Impl rule__Split__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalRangoMode.g:2225:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2229:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2230:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2230:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2231:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2232:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2232:3: rule__Split__FragmentsAssignment_2
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
    // InternalRangoMode.g:2240:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2244:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2245:2: rule__Split__Group__3__Impl rule__Split__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalRangoMode.g:2252:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2256:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2257:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2257:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2258:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2259:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRangoMode.g:2259:3: rule__Split__FragmentTypeAssignment_3
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
    // InternalRangoMode.g:2267:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2271:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2272:2: rule__Split__Group__4__Impl
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
    // InternalRangoMode.g:2278:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2282:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2283:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2283:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2284:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2285:2: ( rule__Split__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRangoMode.g:2285:3: rule__Split__Group_4__0
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
    // InternalRangoMode.g:2294:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2298:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2299:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:2306:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2310:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2311:1: ( 'launched' )
            {
            // InternalRangoMode.g:2311:1: ( 'launched' )
            // InternalRangoMode.g:2312:2: 'launched'
            {
             before(grammarAccess.getSplitAccess().getLaunchedKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRangoMode.g:2321:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2325:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2326:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2333:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2337:1: ( ( 'at' ) )
            // InternalRangoMode.g:2338:1: ( 'at' )
            {
            // InternalRangoMode.g:2338:1: ( 'at' )
            // InternalRangoMode.g:2339:2: 'at'
            {
             before(grammarAccess.getSplitAccess().getAtKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRangoMode.g:2348:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2352:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2353:2: rule__Split__Group_4__2__Impl
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
    // InternalRangoMode.g:2359:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2363:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2364:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2364:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2365:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2366:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2366:3: rule__Split__LaunchSpeedAssignment_4_2
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
    // InternalRangoMode.g:2375:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2379:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2380:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2387:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2391:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2392:1: ( 'damage' )
            {
            // InternalRangoMode.g:2392:1: ( 'damage' )
            // InternalRangoMode.g:2393:2: 'damage'
            {
             before(grammarAccess.getDamageAccess().getDamageKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRangoMode.g:2402:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2406:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2407:2: rule__Damage__Group__1__Impl
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
    // InternalRangoMode.g:2413:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2417:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2418:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2418:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2419:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2420:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2420:3: rule__Damage__AmountAssignment_1
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
    // InternalRangoMode.g:2429:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2433:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2434:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2441:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2445:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2446:1: ( 'heal' )
            {
            // InternalRangoMode.g:2446:1: ( 'heal' )
            // InternalRangoMode.g:2447:2: 'heal'
            {
             before(grammarAccess.getHealAccess().getHealKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRangoMode.g:2456:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2460:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2461:2: rule__Heal__Group__1__Impl
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
    // InternalRangoMode.g:2467:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2471:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2472:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2472:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2473:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2474:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2474:3: rule__Heal__AmountAssignment_1
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
    // InternalRangoMode.g:2483:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2487:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2488:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:2495:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2499:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2500:1: ( 'shield' )
            {
            // InternalRangoMode.g:2500:1: ( 'shield' )
            // InternalRangoMode.g:2501:2: 'shield'
            {
             before(grammarAccess.getShieldAccess().getShieldKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRangoMode.g:2510:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2514:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2515:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2522:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2526:1: ( ( 'for' ) )
            // InternalRangoMode.g:2527:1: ( 'for' )
            {
            // InternalRangoMode.g:2527:1: ( 'for' )
            // InternalRangoMode.g:2528:2: 'for'
            {
             before(grammarAccess.getShieldAccess().getForKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRangoMode.g:2537:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2541:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2542:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2549:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2553:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2554:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2554:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2555:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2556:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2556:3: rule__Shield__DurationAssignment_2
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
    // InternalRangoMode.g:2564:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2568:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2569:2: rule__Shield__Group__3__Impl
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
    // InternalRangoMode.g:2575:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2579:1: ( ( 's' ) )
            // InternalRangoMode.g:2580:1: ( 's' )
            {
            // InternalRangoMode.g:2580:1: ( 's' )
            // InternalRangoMode.g:2581:2: 's'
            {
             before(grammarAccess.getShieldAccess().getSKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:2591:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2595:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:2596:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:2603:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2607:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2608:1: ( 'speed' )
            {
            // InternalRangoMode.g:2608:1: ( 'speed' )
            // InternalRangoMode.g:2609:2: 'speed'
            {
             before(grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRangoMode.g:2618:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2622:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:2623:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2630:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2634:1: ( ( '*' ) )
            // InternalRangoMode.g:2635:1: ( '*' )
            {
            // InternalRangoMode.g:2635:1: ( '*' )
            // InternalRangoMode.g:2636:2: '*'
            {
             before(grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRangoMode.g:2645:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2649:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:2650:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:2657:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2661:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:2662:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:2662:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:2663:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:2664:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:2664:3: rule__SpeedChange__FactorAssignment_2
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
    // InternalRangoMode.g:2672:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2676:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:2677:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2684:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2688:1: ( ( 'for' ) )
            // InternalRangoMode.g:2689:1: ( 'for' )
            {
            // InternalRangoMode.g:2689:1: ( 'for' )
            // InternalRangoMode.g:2690:2: 'for'
            {
             before(grammarAccess.getSpeedChangeAccess().getForKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRangoMode.g:2699:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2703:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:2704:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2711:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2715:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:2716:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:2716:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:2717:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:2718:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:2718:3: rule__SpeedChange__DurationAssignment_4
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
    // InternalRangoMode.g:2726:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2730:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:2731:2: rule__SpeedChange__Group__5__Impl
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
    // InternalRangoMode.g:2737:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2741:1: ( ( 's' ) )
            // InternalRangoMode.g:2742:1: ( 's' )
            {
            // InternalRangoMode.g:2742:1: ( 's' )
            // InternalRangoMode.g:2743:2: 's'
            {
             before(grammarAccess.getSpeedChangeAccess().getSKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:2753:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2757:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:2758:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2765:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2769:1: ( ( 'poison' ) )
            // InternalRangoMode.g:2770:1: ( 'poison' )
            {
            // InternalRangoMode.g:2770:1: ( 'poison' )
            // InternalRangoMode.g:2771:2: 'poison'
            {
             before(grammarAccess.getPoisonAccess().getPoisonKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:2780:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2784:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:2785:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRangoMode.g:2792:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2796:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2797:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2797:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:2798:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2799:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:2799:3: rule__Poison__AmountAssignment_1
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
    // InternalRangoMode.g:2807:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2811:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:2812:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2819:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2823:1: ( ( 'every' ) )
            // InternalRangoMode.g:2824:1: ( 'every' )
            {
            // InternalRangoMode.g:2824:1: ( 'every' )
            // InternalRangoMode.g:2825:2: 'every'
            {
             before(grammarAccess.getPoisonAccess().getEveryKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRangoMode.g:2834:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2838:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:2839:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2846:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2850:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:2851:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:2851:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:2852:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:2853:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:2853:3: rule__Poison__IntervalAssignment_3
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
    // InternalRangoMode.g:2861:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2865:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:2866:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:2873:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2877:1: ( ( 's' ) )
            // InternalRangoMode.g:2878:1: ( 's' )
            {
            // InternalRangoMode.g:2878:1: ( 's' )
            // InternalRangoMode.g:2879:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:2888:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2892:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:2893:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:2900:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2904:1: ( ( 'for' ) )
            // InternalRangoMode.g:2905:1: ( 'for' )
            {
            // InternalRangoMode.g:2905:1: ( 'for' )
            // InternalRangoMode.g:2906:2: 'for'
            {
             before(grammarAccess.getPoisonAccess().getForKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRangoMode.g:2915:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2919:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:2920:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2927:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2931:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:2932:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:2932:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:2933:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:2934:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:2934:3: rule__Poison__DurationAssignment_6
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
    // InternalRangoMode.g:2942:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2946:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:2947:2: rule__Poison__Group__7__Impl
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
    // InternalRangoMode.g:2953:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2957:1: ( ( 's' ) )
            // InternalRangoMode.g:2958:1: ( 's' )
            {
            // InternalRangoMode.g:2958:1: ( 's' )
            // InternalRangoMode.g:2959:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:2969:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2973:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:2974:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:2981:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2985:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:2986:1: ( 'powerup' )
            {
            // InternalRangoMode.g:2986:1: ( 'powerup' )
            // InternalRangoMode.g:2987:2: 'powerup'
            {
             before(grammarAccess.getPowerUpAccess().getPowerupKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRangoMode.g:2996:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3000:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3001:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:3008:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3012:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3013:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3013:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3014:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3015:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3015:3: rule__PowerUp__NameAssignment_1
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
    // InternalRangoMode.g:3023:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3027:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3028:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRangoMode.g:3035:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3039:1: ( ( '{' ) )
            // InternalRangoMode.g:3040:1: ( '{' )
            {
            // InternalRangoMode.g:3040:1: ( '{' )
            // InternalRangoMode.g:3041:2: '{'
            {
             before(grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:3050:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3054:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3055:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:3062:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3066:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3067:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3067:1: ( 'sprite' )
            // InternalRangoMode.g:3068:2: 'sprite'
            {
             before(grammarAccess.getPowerUpAccess().getSpriteKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRangoMode.g:3077:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3081:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3082:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalRangoMode.g:3089:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3093:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3094:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3094:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3095:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3096:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3096:3: rule__PowerUp__SpriteAssignment_4
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
    // InternalRangoMode.g:3104:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3108:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3109:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalRangoMode.g:3116:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3120:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3121:1: ( 'gives' )
            {
            // InternalRangoMode.g:3121:1: ( 'gives' )
            // InternalRangoMode.g:3122:2: 'gives'
            {
             before(grammarAccess.getPowerUpAccess().getGivesKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRangoMode.g:3131:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3135:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3136:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalRangoMode.g:3143:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3147:1: ( ( ':' ) )
            // InternalRangoMode.g:3148:1: ( ':' )
            {
            // InternalRangoMode.g:3148:1: ( ':' )
            // InternalRangoMode.g:3149:2: ':'
            {
             before(grammarAccess.getPowerUpAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRangoMode.g:3158:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3162:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3163:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:3170:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3174:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3175:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3175:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3176:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3177:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3177:3: rule__PowerUp__EffectsAssignment_7
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
    // InternalRangoMode.g:3185:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3189:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3190:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:3197:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3201:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3202:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3202:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3203:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3204:2: ( rule__PowerUp__Group_8__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRangoMode.g:3204:3: rule__PowerUp__Group_8__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PowerUp__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRangoMode.g:3212:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3216:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3217:2: rule__PowerUp__Group__9__Impl
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
    // InternalRangoMode.g:3223:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3227:1: ( ( '}' ) )
            // InternalRangoMode.g:3228:1: ( '}' )
            {
            // InternalRangoMode.g:3228:1: ( '}' )
            // InternalRangoMode.g:3229:2: '}'
            {
             before(grammarAccess.getPowerUpAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:3239:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3243:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3244:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRangoMode.g:3251:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3255:1: ( ( ',' ) )
            // InternalRangoMode.g:3256:1: ( ',' )
            {
            // InternalRangoMode.g:3256:1: ( ',' )
            // InternalRangoMode.g:3257:2: ','
            {
             before(grammarAccess.getPowerUpAccess().getCommaKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:3266:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3270:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3271:2: rule__PowerUp__Group_8__1__Impl
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
    // InternalRangoMode.g:3277:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3281:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3282:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3282:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3283:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3284:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3284:3: rule__PowerUp__EffectsAssignment_8_1
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


    // $ANTLR start "rule__Material__Group__0"
    // InternalRangoMode.g:3293:1: rule__Material__Group__0 : rule__Material__Group__0__Impl rule__Material__Group__1 ;
    public final void rule__Material__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3297:1: ( rule__Material__Group__0__Impl rule__Material__Group__1 )
            // InternalRangoMode.g:3298:2: rule__Material__Group__0__Impl rule__Material__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Material__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__0"


    // $ANTLR start "rule__Material__Group__0__Impl"
    // InternalRangoMode.g:3305:1: rule__Material__Group__0__Impl : ( 'material' ) ;
    public final void rule__Material__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3309:1: ( ( 'material' ) )
            // InternalRangoMode.g:3310:1: ( 'material' )
            {
            // InternalRangoMode.g:3310:1: ( 'material' )
            // InternalRangoMode.g:3311:2: 'material'
            {
             before(grammarAccess.getMaterialAccess().getMaterialKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getMaterialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__0__Impl"


    // $ANTLR start "rule__Material__Group__1"
    // InternalRangoMode.g:3320:1: rule__Material__Group__1 : rule__Material__Group__1__Impl rule__Material__Group__2 ;
    public final void rule__Material__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3324:1: ( rule__Material__Group__1__Impl rule__Material__Group__2 )
            // InternalRangoMode.g:3325:2: rule__Material__Group__1__Impl rule__Material__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Material__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__1"


    // $ANTLR start "rule__Material__Group__1__Impl"
    // InternalRangoMode.g:3332:1: rule__Material__Group__1__Impl : ( ( rule__Material__NameAssignment_1 ) ) ;
    public final void rule__Material__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3336:1: ( ( ( rule__Material__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3337:1: ( ( rule__Material__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3337:1: ( ( rule__Material__NameAssignment_1 ) )
            // InternalRangoMode.g:3338:2: ( rule__Material__NameAssignment_1 )
            {
             before(grammarAccess.getMaterialAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3339:2: ( rule__Material__NameAssignment_1 )
            // InternalRangoMode.g:3339:3: rule__Material__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Material__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__1__Impl"


    // $ANTLR start "rule__Material__Group__2"
    // InternalRangoMode.g:3347:1: rule__Material__Group__2 : rule__Material__Group__2__Impl rule__Material__Group__3 ;
    public final void rule__Material__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3351:1: ( rule__Material__Group__2__Impl rule__Material__Group__3 )
            // InternalRangoMode.g:3352:2: rule__Material__Group__2__Impl rule__Material__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Material__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__2"


    // $ANTLR start "rule__Material__Group__2__Impl"
    // InternalRangoMode.g:3359:1: rule__Material__Group__2__Impl : ( '{' ) ;
    public final void rule__Material__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3363:1: ( ( '{' ) )
            // InternalRangoMode.g:3364:1: ( '{' )
            {
            // InternalRangoMode.g:3364:1: ( '{' )
            // InternalRangoMode.g:3365:2: '{'
            {
             before(grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__2__Impl"


    // $ANTLR start "rule__Material__Group__3"
    // InternalRangoMode.g:3374:1: rule__Material__Group__3 : rule__Material__Group__3__Impl rule__Material__Group__4 ;
    public final void rule__Material__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3378:1: ( rule__Material__Group__3__Impl rule__Material__Group__4 )
            // InternalRangoMode.g:3379:2: rule__Material__Group__3__Impl rule__Material__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Material__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__3"


    // $ANTLR start "rule__Material__Group__3__Impl"
    // InternalRangoMode.g:3386:1: rule__Material__Group__3__Impl : ( ( rule__Material__UnorderedGroup_3 ) ) ;
    public final void rule__Material__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3390:1: ( ( ( rule__Material__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3391:1: ( ( rule__Material__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3391:1: ( ( rule__Material__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3392:2: ( rule__Material__UnorderedGroup_3 )
            {
             before(grammarAccess.getMaterialAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3393:2: ( rule__Material__UnorderedGroup_3 )
            // InternalRangoMode.g:3393:3: rule__Material__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Material__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__3__Impl"


    // $ANTLR start "rule__Material__Group__4"
    // InternalRangoMode.g:3401:1: rule__Material__Group__4 : rule__Material__Group__4__Impl ;
    public final void rule__Material__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3405:1: ( rule__Material__Group__4__Impl )
            // InternalRangoMode.g:3406:2: rule__Material__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Material__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__4"


    // $ANTLR start "rule__Material__Group__4__Impl"
    // InternalRangoMode.g:3412:1: rule__Material__Group__4__Impl : ( '}' ) ;
    public final void rule__Material__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3416:1: ( ( '}' ) )
            // InternalRangoMode.g:3417:1: ( '}' )
            {
            // InternalRangoMode.g:3417:1: ( '}' )
            // InternalRangoMode.g:3418:2: '}'
            {
             before(grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group__4__Impl"


    // $ANTLR start "rule__Material__Group_3_0__0"
    // InternalRangoMode.g:3428:1: rule__Material__Group_3_0__0 : rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 ;
    public final void rule__Material__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3432:1: ( rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 )
            // InternalRangoMode.g:3433:2: rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Material__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_0__0"


    // $ANTLR start "rule__Material__Group_3_0__0__Impl"
    // InternalRangoMode.g:3440:1: rule__Material__Group_3_0__0__Impl : ( 'bounce' ) ;
    public final void rule__Material__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3444:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:3445:1: ( 'bounce' )
            {
            // InternalRangoMode.g:3445:1: ( 'bounce' )
            // InternalRangoMode.g:3446:2: 'bounce'
            {
             before(grammarAccess.getMaterialAccess().getBounceKeyword_3_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getBounceKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_0__0__Impl"


    // $ANTLR start "rule__Material__Group_3_0__1"
    // InternalRangoMode.g:3455:1: rule__Material__Group_3_0__1 : rule__Material__Group_3_0__1__Impl ;
    public final void rule__Material__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3459:1: ( rule__Material__Group_3_0__1__Impl )
            // InternalRangoMode.g:3460:2: rule__Material__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Material__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_0__1"


    // $ANTLR start "rule__Material__Group_3_0__1__Impl"
    // InternalRangoMode.g:3466:1: rule__Material__Group_3_0__1__Impl : ( ( rule__Material__BounceAssignment_3_0_1 ) ) ;
    public final void rule__Material__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3470:1: ( ( ( rule__Material__BounceAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3471:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3471:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            // InternalRangoMode.g:3472:2: ( rule__Material__BounceAssignment_3_0_1 )
            {
             before(grammarAccess.getMaterialAccess().getBounceAssignment_3_0_1()); 
            // InternalRangoMode.g:3473:2: ( rule__Material__BounceAssignment_3_0_1 )
            // InternalRangoMode.g:3473:3: rule__Material__BounceAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Material__BounceAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getBounceAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_0__1__Impl"


    // $ANTLR start "rule__Material__Group_3_1__0"
    // InternalRangoMode.g:3482:1: rule__Material__Group_3_1__0 : rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 ;
    public final void rule__Material__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3486:1: ( rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 )
            // InternalRangoMode.g:3487:2: rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Material__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_1__0"


    // $ANTLR start "rule__Material__Group_3_1__0__Impl"
    // InternalRangoMode.g:3494:1: rule__Material__Group_3_1__0__Impl : ( 'sprite' ) ;
    public final void rule__Material__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3498:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3499:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3499:1: ( 'sprite' )
            // InternalRangoMode.g:3500:2: 'sprite'
            {
             before(grammarAccess.getMaterialAccess().getSpriteKeyword_3_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getSpriteKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_1__0__Impl"


    // $ANTLR start "rule__Material__Group_3_1__1"
    // InternalRangoMode.g:3509:1: rule__Material__Group_3_1__1 : rule__Material__Group_3_1__1__Impl ;
    public final void rule__Material__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3513:1: ( rule__Material__Group_3_1__1__Impl )
            // InternalRangoMode.g:3514:2: rule__Material__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Material__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_1__1"


    // $ANTLR start "rule__Material__Group_3_1__1__Impl"
    // InternalRangoMode.g:3520:1: rule__Material__Group_3_1__1__Impl : ( ( rule__Material__SpriteAssignment_3_1_1 ) ) ;
    public final void rule__Material__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3524:1: ( ( ( rule__Material__SpriteAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3525:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3525:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            // InternalRangoMode.g:3526:2: ( rule__Material__SpriteAssignment_3_1_1 )
            {
             before(grammarAccess.getMaterialAccess().getSpriteAssignment_3_1_1()); 
            // InternalRangoMode.g:3527:2: ( rule__Material__SpriteAssignment_3_1_1 )
            // InternalRangoMode.g:3527:3: rule__Material__SpriteAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Material__SpriteAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getSpriteAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Group_3_1__1__Impl"


    // $ANTLR start "rule__PlayerProfile__Group__0"
    // InternalRangoMode.g:3536:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3540:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3541:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:3548:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3552:1: ( ( 'player' ) )
            // InternalRangoMode.g:3553:1: ( 'player' )
            {
            // InternalRangoMode.g:3553:1: ( 'player' )
            // InternalRangoMode.g:3554:2: 'player'
            {
             before(grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalRangoMode.g:3563:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3567:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3568:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:3575:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3579:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3580:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3580:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3581:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3582:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3582:3: rule__PlayerProfile__NameAssignment_1
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
    // InternalRangoMode.g:3590:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3594:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3595:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:3602:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3606:1: ( ( '{' ) )
            // InternalRangoMode.g:3607:1: ( '{' )
            {
            // InternalRangoMode.g:3607:1: ( '{' )
            // InternalRangoMode.g:3608:2: '{'
            {
             before(grammarAccess.getPlayerProfileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:3617:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3621:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3622:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:3629:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3633:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3634:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3634:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3635:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3636:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3636:3: rule__PlayerProfile__UnorderedGroup_3
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
    // InternalRangoMode.g:3644:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3648:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3649:2: rule__PlayerProfile__Group__4__Impl
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
    // InternalRangoMode.g:3655:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3659:1: ( ( '}' ) )
            // InternalRangoMode.g:3660:1: ( '}' )
            {
            // InternalRangoMode.g:3660:1: ( '}' )
            // InternalRangoMode.g:3661:2: '}'
            {
             before(grammarAccess.getPlayerProfileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:3671:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3675:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3676:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:3683:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3687:1: ( ( 'character' ) )
            // InternalRangoMode.g:3688:1: ( 'character' )
            {
            // InternalRangoMode.g:3688:1: ( 'character' )
            // InternalRangoMode.g:3689:2: 'character'
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRangoMode.g:3698:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3702:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3703:2: rule__PlayerProfile__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3709:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3713:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3714:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3714:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3715:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3716:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3716:3: rule__PlayerProfile__CharacterAssignment_3_0_1
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
    // InternalRangoMode.g:3725:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3729:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3730:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3737:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3741:1: ( ( 'health' ) )
            // InternalRangoMode.g:3742:1: ( 'health' )
            {
            // InternalRangoMode.g:3742:1: ( 'health' )
            // InternalRangoMode.g:3743:2: 'health'
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRangoMode.g:3752:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3756:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3757:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalRangoMode.g:3764:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3768:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3769:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3769:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:3770:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:3771:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:3771:3: rule__PlayerProfile__HealthAssignment_3_1_1
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
    // InternalRangoMode.g:3779:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3783:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:3784:2: rule__PlayerProfile__Group_3_1__2__Impl
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
    // InternalRangoMode.g:3790:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3794:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:3795:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:3795:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:3796:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:3797:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:3797:3: rule__PlayerProfile__Group_3_1_2__0
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
    // InternalRangoMode.g:3806:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3810:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:3811:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3818:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3822:1: ( ( 'max' ) )
            // InternalRangoMode.g:3823:1: ( 'max' )
            {
            // InternalRangoMode.g:3823:1: ( 'max' )
            // InternalRangoMode.g:3824:2: 'max'
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRangoMode.g:3833:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3837:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:3838:2: rule__PlayerProfile__Group_3_1_2__1__Impl
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
    // InternalRangoMode.g:3844:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3848:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:3849:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:3849:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:3850:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:3851:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:3851:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
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
    // InternalRangoMode.g:3860:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3864:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:3865:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3872:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3876:1: ( ( 'speed' ) )
            // InternalRangoMode.g:3877:1: ( 'speed' )
            {
            // InternalRangoMode.g:3877:1: ( 'speed' )
            // InternalRangoMode.g:3878:2: 'speed'
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRangoMode.g:3887:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3891:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:3892:2: rule__PlayerProfile__Group_3_2__1__Impl
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
    // InternalRangoMode.g:3898:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3902:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:3903:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:3903:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:3904:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:3905:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:3905:3: rule__PlayerProfile__SpeedAssignment_3_2_1
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
    // InternalRangoMode.g:3914:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3918:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:3919:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3926:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3930:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:3931:1: ( 'tongue' )
            {
            // InternalRangoMode.g:3931:1: ( 'tongue' )
            // InternalRangoMode.g:3932:2: 'tongue'
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRangoMode.g:3941:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3945:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:3946:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:3953:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3957:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:3958:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:3958:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:3959:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:3960:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:3960:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
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
    // InternalRangoMode.g:3968:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3972:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:3973:2: rule__PlayerProfile__Group_3_3__2__Impl
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
    // InternalRangoMode.g:3979:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3983:1: ( ( 's' ) )
            // InternalRangoMode.g:3984:1: ( 's' )
            {
            // InternalRangoMode.g:3984:1: ( 's' )
            // InternalRangoMode.g:3985:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:3995:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3999:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:4000:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:4007:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4011:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:4012:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:4012:1: ( 'cooldown' )
            // InternalRangoMode.g:4013:2: 'cooldown'
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalRangoMode.g:4022:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4026:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:4027:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:4034:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4038:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:4039:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:4039:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:4040:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:4041:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:4041:3: rule__PlayerProfile__CooldownAssignment_3_4_1
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
    // InternalRangoMode.g:4049:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4053:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:4054:2: rule__PlayerProfile__Group_3_4__2__Impl
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
    // InternalRangoMode.g:4060:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4064:1: ( ( 's' ) )
            // InternalRangoMode.g:4065:1: ( 's' )
            {
            // InternalRangoMode.g:4065:1: ( 's' )
            // InternalRangoMode.g:4066:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:4076:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4080:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:4081:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:4088:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4092:1: ( ( 'grace' ) )
            // InternalRangoMode.g:4093:1: ( 'grace' )
            {
            // InternalRangoMode.g:4093:1: ( 'grace' )
            // InternalRangoMode.g:4094:2: 'grace'
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalRangoMode.g:4103:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4107:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:4108:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:4115:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4119:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:4120:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:4120:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:4121:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:4122:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:4122:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
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
    // InternalRangoMode.g:4130:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4134:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:4135:2: rule__PlayerProfile__Group_3_5__2__Impl
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
    // InternalRangoMode.g:4141:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4145:1: ( ( 's' ) )
            // InternalRangoMode.g:4146:1: ( 's' )
            {
            // InternalRangoMode.g:4146:1: ( 's' )
            // InternalRangoMode.g:4147:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:4157:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4161:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:4162:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:4169:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4173:1: ( ( 'mode' ) )
            // InternalRangoMode.g:4174:1: ( 'mode' )
            {
            // InternalRangoMode.g:4174:1: ( 'mode' )
            // InternalRangoMode.g:4175:2: 'mode'
            {
             before(grammarAccess.getGameModeAccess().getModeKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalRangoMode.g:4184:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4188:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:4189:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:4196:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4200:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4201:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4201:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4202:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4203:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4203:3: rule__GameMode__NameAssignment_1
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
    // InternalRangoMode.g:4211:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4215:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4216:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:4223:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4227:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4228:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4228:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4229:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4230:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4230:3: rule__GameMode__TitleAssignment_2
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
    // InternalRangoMode.g:4238:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4242:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4243:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalRangoMode.g:4250:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4254:1: ( ( '{' ) )
            // InternalRangoMode.g:4255:1: ( '{' )
            {
            // InternalRangoMode.g:4255:1: ( '{' )
            // InternalRangoMode.g:4256:2: '{'
            {
             before(grammarAccess.getGameModeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:4265:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4269:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4270:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalRangoMode.g:4277:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4281:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4282:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4282:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4283:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4284:2: ( rule__GameMode__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRangoMode.g:4284:3: rule__GameMode__Group_4__0
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
    // InternalRangoMode.g:4292:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4296:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4297:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:4304:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4308:1: ( ( 'player' ) )
            // InternalRangoMode.g:4309:1: ( 'player' )
            {
            // InternalRangoMode.g:4309:1: ( 'player' )
            // InternalRangoMode.g:4310:2: 'player'
            {
             before(grammarAccess.getGameModeAccess().getPlayerKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalRangoMode.g:4319:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4323:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4324:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:4331:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4335:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4336:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4336:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4337:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4338:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4338:3: rule__GameMode__PlayerAssignment_6
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
    // InternalRangoMode.g:4346:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4350:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4351:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalRangoMode.g:4358:1: rule__GameMode__Group__7__Impl : ( ( rule__GameMode__UnorderedGroup_7 ) ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4362:1: ( ( ( rule__GameMode__UnorderedGroup_7 ) ) )
            // InternalRangoMode.g:4363:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            {
            // InternalRangoMode.g:4363:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            // InternalRangoMode.g:4364:2: ( rule__GameMode__UnorderedGroup_7 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 
            // InternalRangoMode.g:4365:2: ( rule__GameMode__UnorderedGroup_7 )
            // InternalRangoMode.g:4365:3: rule__GameMode__UnorderedGroup_7
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
    // InternalRangoMode.g:4373:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4377:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4378:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
            {
            pushFollow(FOLLOW_35);
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
    // InternalRangoMode.g:4385:1: rule__GameMode__Group__8__Impl : ( ( rule__GameMode__ArenaAssignment_8 ) ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4389:1: ( ( ( rule__GameMode__ArenaAssignment_8 ) ) )
            // InternalRangoMode.g:4390:1: ( ( rule__GameMode__ArenaAssignment_8 ) )
            {
            // InternalRangoMode.g:4390:1: ( ( rule__GameMode__ArenaAssignment_8 ) )
            // InternalRangoMode.g:4391:2: ( rule__GameMode__ArenaAssignment_8 )
            {
             before(grammarAccess.getGameModeAccess().getArenaAssignment_8()); 
            // InternalRangoMode.g:4392:2: ( rule__GameMode__ArenaAssignment_8 )
            // InternalRangoMode.g:4392:3: rule__GameMode__ArenaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__ArenaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getArenaAssignment_8()); 

            }


            }

        }
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
    // InternalRangoMode.g:4400:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4404:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4405:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
            {
            pushFollow(FOLLOW_36);
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
    // InternalRangoMode.g:4412:1: rule__GameMode__Group__9__Impl : ( ( rule__GameMode__SpawningAssignment_9 ) ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4416:1: ( ( ( rule__GameMode__SpawningAssignment_9 ) ) )
            // InternalRangoMode.g:4417:1: ( ( rule__GameMode__SpawningAssignment_9 ) )
            {
            // InternalRangoMode.g:4417:1: ( ( rule__GameMode__SpawningAssignment_9 ) )
            // InternalRangoMode.g:4418:2: ( rule__GameMode__SpawningAssignment_9 )
            {
             before(grammarAccess.getGameModeAccess().getSpawningAssignment_9()); 
            // InternalRangoMode.g:4419:2: ( rule__GameMode__SpawningAssignment_9 )
            // InternalRangoMode.g:4419:3: rule__GameMode__SpawningAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__SpawningAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getSpawningAssignment_9()); 

            }


            }

        }
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
    // InternalRangoMode.g:4427:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl rule__GameMode__Group__11 ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4431:1: ( rule__GameMode__Group__10__Impl rule__GameMode__Group__11 )
            // InternalRangoMode.g:4432:2: rule__GameMode__Group__10__Impl rule__GameMode__Group__11
            {
            pushFollow(FOLLOW_36);
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
    // InternalRangoMode.g:4439:1: rule__GameMode__Group__10__Impl : ( ( ruleDrops )? ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4443:1: ( ( ( ruleDrops )? ) )
            // InternalRangoMode.g:4444:1: ( ( ruleDrops )? )
            {
            // InternalRangoMode.g:4444:1: ( ( ruleDrops )? )
            // InternalRangoMode.g:4445:2: ( ruleDrops )?
            {
             before(grammarAccess.getGameModeAccess().getDropsParserRuleCall_10()); 
            // InternalRangoMode.g:4446:2: ( ruleDrops )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==86) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:4446:3: ruleDrops
                    {
                    pushFollow(FOLLOW_2);
                    ruleDrops();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getDropsParserRuleCall_10()); 

            }


            }

        }
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
    // InternalRangoMode.g:4454:1: rule__GameMode__Group__11 : rule__GameMode__Group__11__Impl rule__GameMode__Group__12 ;
    public final void rule__GameMode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4458:1: ( rule__GameMode__Group__11__Impl rule__GameMode__Group__12 )
            // InternalRangoMode.g:4459:2: rule__GameMode__Group__11__Impl rule__GameMode__Group__12
            {
            pushFollow(FOLLOW_36);
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
    // InternalRangoMode.g:4466:1: rule__GameMode__Group__11__Impl : ( ( rule__GameMode__Group_11__0 )? ) ;
    public final void rule__GameMode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4470:1: ( ( ( rule__GameMode__Group_11__0 )? ) )
            // InternalRangoMode.g:4471:1: ( ( rule__GameMode__Group_11__0 )? )
            {
            // InternalRangoMode.g:4471:1: ( ( rule__GameMode__Group_11__0 )? )
            // InternalRangoMode.g:4472:2: ( rule__GameMode__Group_11__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_11()); 
            // InternalRangoMode.g:4473:2: ( rule__GameMode__Group_11__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==57) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:4473:3: rule__GameMode__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalRangoMode.g:4481:1: rule__GameMode__Group__12 : rule__GameMode__Group__12__Impl rule__GameMode__Group__13 ;
    public final void rule__GameMode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4485:1: ( rule__GameMode__Group__12__Impl rule__GameMode__Group__13 )
            // InternalRangoMode.g:4486:2: rule__GameMode__Group__12__Impl rule__GameMode__Group__13
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4493:1: rule__GameMode__Group__12__Impl : ( 'lose' ) ;
    public final void rule__GameMode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4497:1: ( ( 'lose' ) )
            // InternalRangoMode.g:4498:1: ( 'lose' )
            {
            // InternalRangoMode.g:4498:1: ( 'lose' )
            // InternalRangoMode.g:4499:2: 'lose'
            {
             before(grammarAccess.getGameModeAccess().getLoseKeyword_12()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getLoseKeyword_12()); 

            }


            }

        }
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
    // InternalRangoMode.g:4508:1: rule__GameMode__Group__13 : rule__GameMode__Group__13__Impl rule__GameMode__Group__14 ;
    public final void rule__GameMode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4512:1: ( rule__GameMode__Group__13__Impl rule__GameMode__Group__14 )
            // InternalRangoMode.g:4513:2: rule__GameMode__Group__13__Impl rule__GameMode__Group__14
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4520:1: rule__GameMode__Group__13__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4524:1: ( ( 'when' ) )
            // InternalRangoMode.g:4525:1: ( 'when' )
            {
            // InternalRangoMode.g:4525:1: ( 'when' )
            // InternalRangoMode.g:4526:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_13()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_13()); 

            }


            }

        }
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
    // InternalRangoMode.g:4535:1: rule__GameMode__Group__14 : rule__GameMode__Group__14__Impl rule__GameMode__Group__15 ;
    public final void rule__GameMode__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4539:1: ( rule__GameMode__Group__14__Impl rule__GameMode__Group__15 )
            // InternalRangoMode.g:4540:2: rule__GameMode__Group__14__Impl rule__GameMode__Group__15
            {
            pushFollow(FOLLOW_39);
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
    // InternalRangoMode.g:4547:1: rule__GameMode__Group__14__Impl : ( ( rule__GameMode__LoseConditionsAssignment_14 ) ) ;
    public final void rule__GameMode__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4551:1: ( ( ( rule__GameMode__LoseConditionsAssignment_14 ) ) )
            // InternalRangoMode.g:4552:1: ( ( rule__GameMode__LoseConditionsAssignment_14 ) )
            {
            // InternalRangoMode.g:4552:1: ( ( rule__GameMode__LoseConditionsAssignment_14 ) )
            // InternalRangoMode.g:4553:2: ( rule__GameMode__LoseConditionsAssignment_14 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14()); 
            // InternalRangoMode.g:4554:2: ( rule__GameMode__LoseConditionsAssignment_14 )
            // InternalRangoMode.g:4554:3: rule__GameMode__LoseConditionsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14()); 

            }


            }

        }
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
    // InternalRangoMode.g:4562:1: rule__GameMode__Group__15 : rule__GameMode__Group__15__Impl rule__GameMode__Group__16 ;
    public final void rule__GameMode__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4566:1: ( rule__GameMode__Group__15__Impl rule__GameMode__Group__16 )
            // InternalRangoMode.g:4567:2: rule__GameMode__Group__15__Impl rule__GameMode__Group__16
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__16();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:4574:1: rule__GameMode__Group__15__Impl : ( ( rule__GameMode__Group_15__0 )* ) ;
    public final void rule__GameMode__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4578:1: ( ( ( rule__GameMode__Group_15__0 )* ) )
            // InternalRangoMode.g:4579:1: ( ( rule__GameMode__Group_15__0 )* )
            {
            // InternalRangoMode.g:4579:1: ( ( rule__GameMode__Group_15__0 )* )
            // InternalRangoMode.g:4580:2: ( rule__GameMode__Group_15__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_15()); 
            // InternalRangoMode.g:4581:2: ( rule__GameMode__Group_15__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRangoMode.g:4581:3: rule__GameMode__Group_15__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__GameMode__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_15()); 

            }


            }

        }
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


    // $ANTLR start "rule__GameMode__Group__16"
    // InternalRangoMode.g:4589:1: rule__GameMode__Group__16 : rule__GameMode__Group__16__Impl ;
    public final void rule__GameMode__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4593:1: ( rule__GameMode__Group__16__Impl )
            // InternalRangoMode.g:4594:2: rule__GameMode__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__16"


    // $ANTLR start "rule__GameMode__Group__16__Impl"
    // InternalRangoMode.g:4600:1: rule__GameMode__Group__16__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4604:1: ( ( '}' ) )
            // InternalRangoMode.g:4605:1: ( '}' )
            {
            // InternalRangoMode.g:4605:1: ( '}' )
            // InternalRangoMode.g:4606:2: '}'
            {
             before(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_16()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__16__Impl"


    // $ANTLR start "rule__GameMode__Group_4__0"
    // InternalRangoMode.g:4616:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4620:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4621:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:4628:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4632:1: ( ( 'description' ) )
            // InternalRangoMode.g:4633:1: ( 'description' )
            {
            // InternalRangoMode.g:4633:1: ( 'description' )
            // InternalRangoMode.g:4634:2: 'description'
            {
             before(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalRangoMode.g:4643:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4647:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4648:2: rule__GameMode__Group_4__1__Impl
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
    // InternalRangoMode.g:4654:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4658:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4659:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4659:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4660:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4661:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4661:3: rule__GameMode__DescriptionAssignment_4_1
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
    // InternalRangoMode.g:4670:1: rule__GameMode__Group_7_0__0 : rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 ;
    public final void rule__GameMode__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4674:1: ( rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 )
            // InternalRangoMode.g:4675:2: rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:4682:1: rule__GameMode__Group_7_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4686:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:4687:1: ( 'gravity' )
            {
            // InternalRangoMode.g:4687:1: ( 'gravity' )
            // InternalRangoMode.g:4688:2: 'gravity'
            {
             before(grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalRangoMode.g:4697:1: rule__GameMode__Group_7_0__1 : rule__GameMode__Group_7_0__1__Impl ;
    public final void rule__GameMode__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4701:1: ( rule__GameMode__Group_7_0__1__Impl )
            // InternalRangoMode.g:4702:2: rule__GameMode__Group_7_0__1__Impl
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
    // InternalRangoMode.g:4708:1: rule__GameMode__Group_7_0__1__Impl : ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) ;
    public final void rule__GameMode__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4712:1: ( ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) )
            // InternalRangoMode.g:4713:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            {
            // InternalRangoMode.g:4713:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            // InternalRangoMode.g:4714:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 
            // InternalRangoMode.g:4715:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            // InternalRangoMode.g:4715:3: rule__GameMode__GravityAssignment_7_0_1
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


    // $ANTLR start "rule__GameMode__Group_11__0"
    // InternalRangoMode.g:4724:1: rule__GameMode__Group_11__0 : rule__GameMode__Group_11__0__Impl rule__GameMode__Group_11__1 ;
    public final void rule__GameMode__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4728:1: ( rule__GameMode__Group_11__0__Impl rule__GameMode__Group_11__1 )
            // InternalRangoMode.g:4729:2: rule__GameMode__Group_11__0__Impl rule__GameMode__Group_11__1
            {
            pushFollow(FOLLOW_37);
            rule__GameMode__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__0"


    // $ANTLR start "rule__GameMode__Group_11__0__Impl"
    // InternalRangoMode.g:4736:1: rule__GameMode__Group_11__0__Impl : ( 'win' ) ;
    public final void rule__GameMode__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4740:1: ( ( 'win' ) )
            // InternalRangoMode.g:4741:1: ( 'win' )
            {
            // InternalRangoMode.g:4741:1: ( 'win' )
            // InternalRangoMode.g:4742:2: 'win'
            {
             before(grammarAccess.getGameModeAccess().getWinKeyword_11_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWinKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__0__Impl"


    // $ANTLR start "rule__GameMode__Group_11__1"
    // InternalRangoMode.g:4751:1: rule__GameMode__Group_11__1 : rule__GameMode__Group_11__1__Impl rule__GameMode__Group_11__2 ;
    public final void rule__GameMode__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4755:1: ( rule__GameMode__Group_11__1__Impl rule__GameMode__Group_11__2 )
            // InternalRangoMode.g:4756:2: rule__GameMode__Group_11__1__Impl rule__GameMode__Group_11__2
            {
            pushFollow(FOLLOW_38);
            rule__GameMode__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__1"


    // $ANTLR start "rule__GameMode__Group_11__1__Impl"
    // InternalRangoMode.g:4763:1: rule__GameMode__Group_11__1__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4767:1: ( ( 'when' ) )
            // InternalRangoMode.g:4768:1: ( 'when' )
            {
            // InternalRangoMode.g:4768:1: ( 'when' )
            // InternalRangoMode.g:4769:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_11_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__1__Impl"


    // $ANTLR start "rule__GameMode__Group_11__2"
    // InternalRangoMode.g:4778:1: rule__GameMode__Group_11__2 : rule__GameMode__Group_11__2__Impl rule__GameMode__Group_11__3 ;
    public final void rule__GameMode__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4782:1: ( rule__GameMode__Group_11__2__Impl rule__GameMode__Group_11__3 )
            // InternalRangoMode.g:4783:2: rule__GameMode__Group_11__2__Impl rule__GameMode__Group_11__3
            {
            pushFollow(FOLLOW_41);
            rule__GameMode__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__2"


    // $ANTLR start "rule__GameMode__Group_11__2__Impl"
    // InternalRangoMode.g:4790:1: rule__GameMode__Group_11__2__Impl : ( ( rule__GameMode__WinConditionsAssignment_11_2 ) ) ;
    public final void rule__GameMode__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4794:1: ( ( ( rule__GameMode__WinConditionsAssignment_11_2 ) ) )
            // InternalRangoMode.g:4795:1: ( ( rule__GameMode__WinConditionsAssignment_11_2 ) )
            {
            // InternalRangoMode.g:4795:1: ( ( rule__GameMode__WinConditionsAssignment_11_2 ) )
            // InternalRangoMode.g:4796:2: ( rule__GameMode__WinConditionsAssignment_11_2 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_11_2()); 
            // InternalRangoMode.g:4797:2: ( rule__GameMode__WinConditionsAssignment_11_2 )
            // InternalRangoMode.g:4797:3: rule__GameMode__WinConditionsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__2__Impl"


    // $ANTLR start "rule__GameMode__Group_11__3"
    // InternalRangoMode.g:4805:1: rule__GameMode__Group_11__3 : rule__GameMode__Group_11__3__Impl ;
    public final void rule__GameMode__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4809:1: ( rule__GameMode__Group_11__3__Impl )
            // InternalRangoMode.g:4810:2: rule__GameMode__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__3"


    // $ANTLR start "rule__GameMode__Group_11__3__Impl"
    // InternalRangoMode.g:4816:1: rule__GameMode__Group_11__3__Impl : ( ( rule__GameMode__Group_11_3__0 )* ) ;
    public final void rule__GameMode__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4820:1: ( ( ( rule__GameMode__Group_11_3__0 )* ) )
            // InternalRangoMode.g:4821:1: ( ( rule__GameMode__Group_11_3__0 )* )
            {
            // InternalRangoMode.g:4821:1: ( ( rule__GameMode__Group_11_3__0 )* )
            // InternalRangoMode.g:4822:2: ( rule__GameMode__Group_11_3__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_11_3()); 
            // InternalRangoMode.g:4823:2: ( rule__GameMode__Group_11_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==58) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRangoMode.g:4823:3: rule__GameMode__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__GameMode__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11__3__Impl"


    // $ANTLR start "rule__GameMode__Group_11_3__0"
    // InternalRangoMode.g:4832:1: rule__GameMode__Group_11_3__0 : rule__GameMode__Group_11_3__0__Impl rule__GameMode__Group_11_3__1 ;
    public final void rule__GameMode__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4836:1: ( rule__GameMode__Group_11_3__0__Impl rule__GameMode__Group_11_3__1 )
            // InternalRangoMode.g:4837:2: rule__GameMode__Group_11_3__0__Impl rule__GameMode__Group_11_3__1
            {
            pushFollow(FOLLOW_38);
            rule__GameMode__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11_3__0"


    // $ANTLR start "rule__GameMode__Group_11_3__0__Impl"
    // InternalRangoMode.g:4844:1: rule__GameMode__Group_11_3__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4848:1: ( ( 'or' ) )
            // InternalRangoMode.g:4849:1: ( 'or' )
            {
            // InternalRangoMode.g:4849:1: ( 'or' )
            // InternalRangoMode.g:4850:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_11_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11_3__0__Impl"


    // $ANTLR start "rule__GameMode__Group_11_3__1"
    // InternalRangoMode.g:4859:1: rule__GameMode__Group_11_3__1 : rule__GameMode__Group_11_3__1__Impl ;
    public final void rule__GameMode__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4863:1: ( rule__GameMode__Group_11_3__1__Impl )
            // InternalRangoMode.g:4864:2: rule__GameMode__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11_3__1"


    // $ANTLR start "rule__GameMode__Group_11_3__1__Impl"
    // InternalRangoMode.g:4870:1: rule__GameMode__Group_11_3__1__Impl : ( ( rule__GameMode__WinConditionsAssignment_11_3_1 ) ) ;
    public final void rule__GameMode__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4874:1: ( ( ( rule__GameMode__WinConditionsAssignment_11_3_1 ) ) )
            // InternalRangoMode.g:4875:1: ( ( rule__GameMode__WinConditionsAssignment_11_3_1 ) )
            {
            // InternalRangoMode.g:4875:1: ( ( rule__GameMode__WinConditionsAssignment_11_3_1 ) )
            // InternalRangoMode.g:4876:2: ( rule__GameMode__WinConditionsAssignment_11_3_1 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_11_3_1()); 
            // InternalRangoMode.g:4877:2: ( rule__GameMode__WinConditionsAssignment_11_3_1 )
            // InternalRangoMode.g:4877:3: rule__GameMode__WinConditionsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_11_3__1__Impl"


    // $ANTLR start "rule__GameMode__Group_15__0"
    // InternalRangoMode.g:4886:1: rule__GameMode__Group_15__0 : rule__GameMode__Group_15__0__Impl rule__GameMode__Group_15__1 ;
    public final void rule__GameMode__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4890:1: ( rule__GameMode__Group_15__0__Impl rule__GameMode__Group_15__1 )
            // InternalRangoMode.g:4891:2: rule__GameMode__Group_15__0__Impl rule__GameMode__Group_15__1
            {
            pushFollow(FOLLOW_38);
            rule__GameMode__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_15__0"


    // $ANTLR start "rule__GameMode__Group_15__0__Impl"
    // InternalRangoMode.g:4898:1: rule__GameMode__Group_15__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4902:1: ( ( 'or' ) )
            // InternalRangoMode.g:4903:1: ( 'or' )
            {
            // InternalRangoMode.g:4903:1: ( 'or' )
            // InternalRangoMode.g:4904:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_15_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_15__0__Impl"


    // $ANTLR start "rule__GameMode__Group_15__1"
    // InternalRangoMode.g:4913:1: rule__GameMode__Group_15__1 : rule__GameMode__Group_15__1__Impl ;
    public final void rule__GameMode__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4917:1: ( rule__GameMode__Group_15__1__Impl )
            // InternalRangoMode.g:4918:2: rule__GameMode__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_15__1"


    // $ANTLR start "rule__GameMode__Group_15__1__Impl"
    // InternalRangoMode.g:4924:1: rule__GameMode__Group_15__1__Impl : ( ( rule__GameMode__LoseConditionsAssignment_15_1 ) ) ;
    public final void rule__GameMode__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4928:1: ( ( ( rule__GameMode__LoseConditionsAssignment_15_1 ) ) )
            // InternalRangoMode.g:4929:1: ( ( rule__GameMode__LoseConditionsAssignment_15_1 ) )
            {
            // InternalRangoMode.g:4929:1: ( ( rule__GameMode__LoseConditionsAssignment_15_1 ) )
            // InternalRangoMode.g:4930:2: ( rule__GameMode__LoseConditionsAssignment_15_1 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_15_1()); 
            // InternalRangoMode.g:4931:2: ( rule__GameMode__LoseConditionsAssignment_15_1 )
            // InternalRangoMode.g:4931:3: rule__GameMode__LoseConditionsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_15__1__Impl"


    // $ANTLR start "rule__SpeedBonus__Group__0"
    // InternalRangoMode.g:4940:1: rule__SpeedBonus__Group__0 : rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 ;
    public final void rule__SpeedBonus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4944:1: ( rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 )
            // InternalRangoMode.g:4945:2: rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:4952:1: rule__SpeedBonus__Group__0__Impl : ( () ) ;
    public final void rule__SpeedBonus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4956:1: ( ( () ) )
            // InternalRangoMode.g:4957:1: ( () )
            {
            // InternalRangoMode.g:4957:1: ( () )
            // InternalRangoMode.g:4958:2: ()
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 
            // InternalRangoMode.g:4959:2: ()
            // InternalRangoMode.g:4959:3: 
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
    // InternalRangoMode.g:4967:1: rule__SpeedBonus__Group__1 : rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 ;
    public final void rule__SpeedBonus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4971:1: ( rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 )
            // InternalRangoMode.g:4972:2: rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2
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
    // InternalRangoMode.g:4979:1: rule__SpeedBonus__Group__1__Impl : ( 'speed' ) ;
    public final void rule__SpeedBonus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4983:1: ( ( 'speed' ) )
            // InternalRangoMode.g:4984:1: ( 'speed' )
            {
            // InternalRangoMode.g:4984:1: ( 'speed' )
            // InternalRangoMode.g:4985:2: 'speed'
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRangoMode.g:4994:1: rule__SpeedBonus__Group__2 : rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 ;
    public final void rule__SpeedBonus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4998:1: ( rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 )
            // InternalRangoMode.g:4999:2: rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3
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
    // InternalRangoMode.g:5006:1: rule__SpeedBonus__Group__2__Impl : ( 'bonus' ) ;
    public final void rule__SpeedBonus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5010:1: ( ( 'bonus' ) )
            // InternalRangoMode.g:5011:1: ( 'bonus' )
            {
            // InternalRangoMode.g:5011:1: ( 'bonus' )
            // InternalRangoMode.g:5012:2: 'bonus'
            {
             before(grammarAccess.getSpeedBonusAccess().getBonusKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalRangoMode.g:5021:1: rule__SpeedBonus__Group__3 : rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 ;
    public final void rule__SpeedBonus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5025:1: ( rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 )
            // InternalRangoMode.g:5026:2: rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4
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
    // InternalRangoMode.g:5033:1: rule__SpeedBonus__Group__3__Impl : ( ( rule__SpeedBonus__Group_3__0 )? ) ;
    public final void rule__SpeedBonus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5037:1: ( ( ( rule__SpeedBonus__Group_3__0 )? ) )
            // InternalRangoMode.g:5038:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            {
            // InternalRangoMode.g:5038:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            // InternalRangoMode.g:5039:2: ( rule__SpeedBonus__Group_3__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_3()); 
            // InternalRangoMode.g:5040:2: ( rule__SpeedBonus__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==60) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:5040:3: rule__SpeedBonus__Group_3__0
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
    // InternalRangoMode.g:5048:1: rule__SpeedBonus__Group__4 : rule__SpeedBonus__Group__4__Impl ;
    public final void rule__SpeedBonus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5052:1: ( rule__SpeedBonus__Group__4__Impl )
            // InternalRangoMode.g:5053:2: rule__SpeedBonus__Group__4__Impl
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
    // InternalRangoMode.g:5059:1: rule__SpeedBonus__Group__4__Impl : ( ( rule__SpeedBonus__Group_4__0 )? ) ;
    public final void rule__SpeedBonus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5063:1: ( ( ( rule__SpeedBonus__Group_4__0 )? ) )
            // InternalRangoMode.g:5064:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            {
            // InternalRangoMode.g:5064:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            // InternalRangoMode.g:5065:2: ( rule__SpeedBonus__Group_4__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_4()); 
            // InternalRangoMode.g:5066:2: ( rule__SpeedBonus__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==63) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:5066:3: rule__SpeedBonus__Group_4__0
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
    // InternalRangoMode.g:5075:1: rule__SpeedBonus__Group_3__0 : rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 ;
    public final void rule__SpeedBonus__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5079:1: ( rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 )
            // InternalRangoMode.g:5080:2: rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1
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
    // InternalRangoMode.g:5087:1: rule__SpeedBonus__Group_3__0__Impl : ( 'up' ) ;
    public final void rule__SpeedBonus__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5091:1: ( ( 'up' ) )
            // InternalRangoMode.g:5092:1: ( 'up' )
            {
            // InternalRangoMode.g:5092:1: ( 'up' )
            // InternalRangoMode.g:5093:2: 'up'
            {
             before(grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalRangoMode.g:5102:1: rule__SpeedBonus__Group_3__1 : rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 ;
    public final void rule__SpeedBonus__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5106:1: ( rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 )
            // InternalRangoMode.g:5107:2: rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:5114:1: rule__SpeedBonus__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__SpeedBonus__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5118:1: ( ( 'to' ) )
            // InternalRangoMode.g:5119:1: ( 'to' )
            {
            // InternalRangoMode.g:5119:1: ( 'to' )
            // InternalRangoMode.g:5120:2: 'to'
            {
             before(grammarAccess.getSpeedBonusAccess().getToKeyword_3_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalRangoMode.g:5129:1: rule__SpeedBonus__Group_3__2 : rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 ;
    public final void rule__SpeedBonus__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5133:1: ( rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 )
            // InternalRangoMode.g:5134:2: rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3
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
    // InternalRangoMode.g:5141:1: rule__SpeedBonus__Group_3__2__Impl : ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) ;
    public final void rule__SpeedBonus__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5145:1: ( ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) )
            // InternalRangoMode.g:5146:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            {
            // InternalRangoMode.g:5146:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            // InternalRangoMode.g:5147:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 
            // InternalRangoMode.g:5148:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            // InternalRangoMode.g:5148:3: rule__SpeedBonus__MaxFactorAssignment_3_2
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
    // InternalRangoMode.g:5156:1: rule__SpeedBonus__Group_3__3 : rule__SpeedBonus__Group_3__3__Impl ;
    public final void rule__SpeedBonus__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5160:1: ( rule__SpeedBonus__Group_3__3__Impl )
            // InternalRangoMode.g:5161:2: rule__SpeedBonus__Group_3__3__Impl
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
    // InternalRangoMode.g:5167:1: rule__SpeedBonus__Group_3__3__Impl : ( 'times' ) ;
    public final void rule__SpeedBonus__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5171:1: ( ( 'times' ) )
            // InternalRangoMode.g:5172:1: ( 'times' )
            {
            // InternalRangoMode.g:5172:1: ( 'times' )
            // InternalRangoMode.g:5173:2: 'times'
            {
             before(grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalRangoMode.g:5183:1: rule__SpeedBonus__Group_4__0 : rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 ;
    public final void rule__SpeedBonus__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5187:1: ( rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 )
            // InternalRangoMode.g:5188:2: rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:5195:1: rule__SpeedBonus__Group_4__0__Impl : ( 'over' ) ;
    public final void rule__SpeedBonus__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5199:1: ( ( 'over' ) )
            // InternalRangoMode.g:5200:1: ( 'over' )
            {
            // InternalRangoMode.g:5200:1: ( 'over' )
            // InternalRangoMode.g:5201:2: 'over'
            {
             before(grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalRangoMode.g:5210:1: rule__SpeedBonus__Group_4__1 : rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 ;
    public final void rule__SpeedBonus__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5214:1: ( rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 )
            // InternalRangoMode.g:5215:2: rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:5222:1: rule__SpeedBonus__Group_4__1__Impl : ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) ;
    public final void rule__SpeedBonus__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5226:1: ( ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) )
            // InternalRangoMode.g:5227:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            {
            // InternalRangoMode.g:5227:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            // InternalRangoMode.g:5228:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 
            // InternalRangoMode.g:5229:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            // InternalRangoMode.g:5229:3: rule__SpeedBonus__DurationAssignment_4_1
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
    // InternalRangoMode.g:5237:1: rule__SpeedBonus__Group_4__2 : rule__SpeedBonus__Group_4__2__Impl ;
    public final void rule__SpeedBonus__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5241:1: ( rule__SpeedBonus__Group_4__2__Impl )
            // InternalRangoMode.g:5242:2: rule__SpeedBonus__Group_4__2__Impl
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
    // InternalRangoMode.g:5248:1: rule__SpeedBonus__Group_4__2__Impl : ( 's' ) ;
    public final void rule__SpeedBonus__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5252:1: ( ( 's' ) )
            // InternalRangoMode.g:5253:1: ( 's' )
            {
            // InternalRangoMode.g:5253:1: ( 's' )
            // InternalRangoMode.g:5254:2: 's'
            {
             before(grammarAccess.getSpeedBonusAccess().getSKeyword_4_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:5264:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5268:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5269:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:5276:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5280:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5281:1: ( 'arena' )
            {
            // InternalRangoMode.g:5281:1: ( 'arena' )
            // InternalRangoMode.g:5282:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalRangoMode.g:5291:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5295:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5296:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
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
    // InternalRangoMode.g:5303:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5307:1: ( ( '{' ) )
            // InternalRangoMode.g:5308:1: ( '{' )
            {
            // InternalRangoMode.g:5308:1: ( '{' )
            // InternalRangoMode.g:5309:2: '{'
            {
             before(grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:5318:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5322:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5323:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalRangoMode.g:5330:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5334:1: ( ( 'background' ) )
            // InternalRangoMode.g:5335:1: ( 'background' )
            {
            // InternalRangoMode.g:5335:1: ( 'background' )
            // InternalRangoMode.g:5336:2: 'background'
            {
             before(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalRangoMode.g:5345:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5349:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5350:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
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
    // InternalRangoMode.g:5357:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5361:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5362:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5362:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5363:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5364:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5364:3: rule__Arena__BackgroundAssignment_3
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
    // InternalRangoMode.g:5372:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5376:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5377:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5384:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__UnorderedGroup_4 ) ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5388:1: ( ( ( rule__Arena__UnorderedGroup_4 ) ) )
            // InternalRangoMode.g:5389:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            {
            // InternalRangoMode.g:5389:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            // InternalRangoMode.g:5390:2: ( rule__Arena__UnorderedGroup_4 )
            {
             before(grammarAccess.getArenaAccess().getUnorderedGroup_4()); 
            // InternalRangoMode.g:5391:2: ( rule__Arena__UnorderedGroup_4 )
            // InternalRangoMode.g:5391:3: rule__Arena__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__Arena__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getUnorderedGroup_4()); 

            }


            }

        }
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
    // InternalRangoMode.g:5399:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5403:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5404:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5411:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5415:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5416:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5416:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5417:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5418:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==72||LA23_0==76||LA23_0==79) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRangoMode.g:5418:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRangoMode.g:5426:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5430:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5431:2: rule__Arena__Group__6__Impl
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
    // InternalRangoMode.g:5437:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5441:1: ( ( '}' ) )
            // InternalRangoMode.g:5442:1: ( '}' )
            {
            // InternalRangoMode.g:5442:1: ( '}' )
            // InternalRangoMode.g:5443:2: '}'
            {
             before(grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Arena__Group_4_0__0"
    // InternalRangoMode.g:5453:1: rule__Arena__Group_4_0__0 : rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 ;
    public final void rule__Arena__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5457:1: ( rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 )
            // InternalRangoMode.g:5458:2: rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Arena__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_0__0"


    // $ANTLR start "rule__Arena__Group_4_0__0__Impl"
    // InternalRangoMode.g:5465:1: rule__Arena__Group_4_0__0__Impl : ( 'floor' ) ;
    public final void rule__Arena__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5469:1: ( ( 'floor' ) )
            // InternalRangoMode.g:5470:1: ( 'floor' )
            {
            // InternalRangoMode.g:5470:1: ( 'floor' )
            // InternalRangoMode.g:5471:2: 'floor'
            {
             before(grammarAccess.getArenaAccess().getFloorKeyword_4_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getFloorKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_0__0__Impl"


    // $ANTLR start "rule__Arena__Group_4_0__1"
    // InternalRangoMode.g:5480:1: rule__Arena__Group_4_0__1 : rule__Arena__Group_4_0__1__Impl ;
    public final void rule__Arena__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5484:1: ( rule__Arena__Group_4_0__1__Impl )
            // InternalRangoMode.g:5485:2: rule__Arena__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_0__1"


    // $ANTLR start "rule__Arena__Group_4_0__1__Impl"
    // InternalRangoMode.g:5491:1: rule__Arena__Group_4_0__1__Impl : ( ( rule__Arena__FloorAssignment_4_0_1 ) ) ;
    public final void rule__Arena__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5495:1: ( ( ( rule__Arena__FloorAssignment_4_0_1 ) ) )
            // InternalRangoMode.g:5496:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            {
            // InternalRangoMode.g:5496:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            // InternalRangoMode.g:5497:2: ( rule__Arena__FloorAssignment_4_0_1 )
            {
             before(grammarAccess.getArenaAccess().getFloorAssignment_4_0_1()); 
            // InternalRangoMode.g:5498:2: ( rule__Arena__FloorAssignment_4_0_1 )
            // InternalRangoMode.g:5498:3: rule__Arena__FloorAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Arena__FloorAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getFloorAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_0__1__Impl"


    // $ANTLR start "rule__Arena__Group_4_1__0"
    // InternalRangoMode.g:5507:1: rule__Arena__Group_4_1__0 : rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 ;
    public final void rule__Arena__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5511:1: ( rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 )
            // InternalRangoMode.g:5512:2: rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Arena__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_1__0"


    // $ANTLR start "rule__Arena__Group_4_1__0__Impl"
    // InternalRangoMode.g:5519:1: rule__Arena__Group_4_1__0__Impl : ( 'walls' ) ;
    public final void rule__Arena__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5523:1: ( ( 'walls' ) )
            // InternalRangoMode.g:5524:1: ( 'walls' )
            {
            // InternalRangoMode.g:5524:1: ( 'walls' )
            // InternalRangoMode.g:5525:2: 'walls'
            {
             before(grammarAccess.getArenaAccess().getWallsKeyword_4_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getWallsKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_1__0__Impl"


    // $ANTLR start "rule__Arena__Group_4_1__1"
    // InternalRangoMode.g:5534:1: rule__Arena__Group_4_1__1 : rule__Arena__Group_4_1__1__Impl ;
    public final void rule__Arena__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5538:1: ( rule__Arena__Group_4_1__1__Impl )
            // InternalRangoMode.g:5539:2: rule__Arena__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_1__1"


    // $ANTLR start "rule__Arena__Group_4_1__1__Impl"
    // InternalRangoMode.g:5545:1: rule__Arena__Group_4_1__1__Impl : ( ( rule__Arena__WallsAssignment_4_1_1 ) ) ;
    public final void rule__Arena__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5549:1: ( ( ( rule__Arena__WallsAssignment_4_1_1 ) ) )
            // InternalRangoMode.g:5550:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            {
            // InternalRangoMode.g:5550:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            // InternalRangoMode.g:5551:2: ( rule__Arena__WallsAssignment_4_1_1 )
            {
             before(grammarAccess.getArenaAccess().getWallsAssignment_4_1_1()); 
            // InternalRangoMode.g:5552:2: ( rule__Arena__WallsAssignment_4_1_1 )
            // InternalRangoMode.g:5552:3: rule__Arena__WallsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Arena__WallsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getWallsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_1__1__Impl"


    // $ANTLR start "rule__Arena__Group_4_2__0"
    // InternalRangoMode.g:5561:1: rule__Arena__Group_4_2__0 : rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 ;
    public final void rule__Arena__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5565:1: ( rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 )
            // InternalRangoMode.g:5566:2: rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1
            {
            pushFollow(FOLLOW_50);
            rule__Arena__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__0"


    // $ANTLR start "rule__Arena__Group_4_2__0__Impl"
    // InternalRangoMode.g:5573:1: rule__Arena__Group_4_2__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5577:1: ( ( 'player' ) )
            // InternalRangoMode.g:5578:1: ( 'player' )
            {
            // InternalRangoMode.g:5578:1: ( 'player' )
            // InternalRangoMode.g:5579:2: 'player'
            {
             before(grammarAccess.getArenaAccess().getPlayerKeyword_4_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getPlayerKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__0__Impl"


    // $ANTLR start "rule__Arena__Group_4_2__1"
    // InternalRangoMode.g:5588:1: rule__Arena__Group_4_2__1 : rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 ;
    public final void rule__Arena__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5592:1: ( rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 )
            // InternalRangoMode.g:5593:2: rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Arena__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__1"


    // $ANTLR start "rule__Arena__Group_4_2__1__Impl"
    // InternalRangoMode.g:5600:1: rule__Arena__Group_4_2__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5604:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5605:1: ( 'starts' )
            {
            // InternalRangoMode.g:5605:1: ( 'starts' )
            // InternalRangoMode.g:5606:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_2_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getStartsKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__1__Impl"


    // $ANTLR start "rule__Arena__Group_4_2__2"
    // InternalRangoMode.g:5615:1: rule__Arena__Group_4_2__2 : rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 ;
    public final void rule__Arena__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5619:1: ( rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 )
            // InternalRangoMode.g:5620:2: rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3
            {
            pushFollow(FOLLOW_17);
            rule__Arena__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__2"


    // $ANTLR start "rule__Arena__Group_4_2__2__Impl"
    // InternalRangoMode.g:5627:1: rule__Arena__Group_4_2__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5631:1: ( ( 'at' ) )
            // InternalRangoMode.g:5632:1: ( 'at' )
            {
            // InternalRangoMode.g:5632:1: ( 'at' )
            // InternalRangoMode.g:5633:2: 'at'
            {
             before(grammarAccess.getArenaAccess().getAtKeyword_4_2_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getAtKeyword_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__2__Impl"


    // $ANTLR start "rule__Arena__Group_4_2__3"
    // InternalRangoMode.g:5642:1: rule__Arena__Group_4_2__3 : rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 ;
    public final void rule__Arena__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5646:1: ( rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 )
            // InternalRangoMode.g:5647:2: rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4
            {
            pushFollow(FOLLOW_51);
            rule__Arena__Group_4_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__3"


    // $ANTLR start "rule__Arena__Group_4_2__3__Impl"
    // InternalRangoMode.g:5654:1: rule__Arena__Group_4_2__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) ;
    public final void rule__Arena__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5658:1: ( ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) )
            // InternalRangoMode.g:5659:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            {
            // InternalRangoMode.g:5659:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            // InternalRangoMode.g:5660:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_2_3()); 
            // InternalRangoMode.g:5661:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            // InternalRangoMode.g:5661:3: rule__Arena__PlayerStartAssignment_4_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Arena__PlayerStartAssignment_4_2_3();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__3__Impl"


    // $ANTLR start "rule__Arena__Group_4_2__4"
    // InternalRangoMode.g:5669:1: rule__Arena__Group_4_2__4 : rule__Arena__Group_4_2__4__Impl ;
    public final void rule__Arena__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5673:1: ( rule__Arena__Group_4_2__4__Impl )
            // InternalRangoMode.g:5674:2: rule__Arena__Group_4_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group_4_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__4"


    // $ANTLR start "rule__Arena__Group_4_2__4__Impl"
    // InternalRangoMode.g:5680:1: rule__Arena__Group_4_2__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5684:1: ( ( '%' ) )
            // InternalRangoMode.g:5685:1: ( '%' )
            {
            // InternalRangoMode.g:5685:1: ( '%' )
            // InternalRangoMode.g:5686:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group_4_2__4__Impl"


    // $ANTLR start "rule__At__Group__0"
    // InternalRangoMode.g:5696:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5700:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5701:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5708:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5712:1: ( ( 'at' ) )
            // InternalRangoMode.g:5713:1: ( 'at' )
            {
            // InternalRangoMode.g:5713:1: ( 'at' )
            // InternalRangoMode.g:5714:2: 'at'
            {
             before(grammarAccess.getAtAccess().getAtKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRangoMode.g:5723:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5727:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5728:2: rule__At__Group__1__Impl rule__At__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:5735:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5739:1: ( ( '(' ) )
            // InternalRangoMode.g:5740:1: ( '(' )
            {
            // InternalRangoMode.g:5740:1: ( '(' )
            // InternalRangoMode.g:5741:2: '('
            {
             before(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:5750:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5754:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:5755:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5762:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5766:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:5767:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:5767:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:5768:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:5769:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:5769:3: rule__At__XAssignment_2
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
    // InternalRangoMode.g:5777:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5781:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:5782:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalRangoMode.g:5789:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5793:1: ( ( '%' ) )
            // InternalRangoMode.g:5794:1: ( '%' )
            {
            // InternalRangoMode.g:5794:1: ( '%' )
            // InternalRangoMode.g:5795:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:5804:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5808:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:5809:2: rule__At__Group__4__Impl rule__At__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:5816:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5820:1: ( ( ',' ) )
            // InternalRangoMode.g:5821:1: ( ',' )
            {
            // InternalRangoMode.g:5821:1: ( ',' )
            // InternalRangoMode.g:5822:2: ','
            {
             before(grammarAccess.getAtAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:5831:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5835:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:5836:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5843:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5847:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:5848:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:5848:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:5849:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:5850:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:5850:3: rule__At__YAssignment_5
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
    // InternalRangoMode.g:5858:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5862:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:5863:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:5870:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5874:1: ( ( '%' ) )
            // InternalRangoMode.g:5875:1: ( '%' )
            {
            // InternalRangoMode.g:5875:1: ( '%' )
            // InternalRangoMode.g:5876:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:5885:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5889:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:5890:2: rule__At__Group__7__Impl
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
    // InternalRangoMode.g:5896:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5900:1: ( ( ')' ) )
            // InternalRangoMode.g:5901:1: ( ')' )
            {
            // InternalRangoMode.g:5901:1: ( ')' )
            // InternalRangoMode.g:5902:2: ')'
            {
             before(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:5912:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5916:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:5917:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:5924:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5928:1: ( ( 'block' ) )
            // InternalRangoMode.g:5929:1: ( 'block' )
            {
            // InternalRangoMode.g:5929:1: ( 'block' )
            // InternalRangoMode.g:5930:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalRangoMode.g:5939:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5943:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:5944:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:5951:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5955:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:5956:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:5956:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:5957:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:5958:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:5958:3: rule__Block__NameAssignment_1
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
    // InternalRangoMode.g:5966:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5970:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:5971:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:5978:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5982:1: ( ( ruleAt ) )
            // InternalRangoMode.g:5983:1: ( ruleAt )
            {
            // InternalRangoMode.g:5983:1: ( ruleAt )
            // InternalRangoMode.g:5984:2: ruleAt
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
    // InternalRangoMode.g:5993:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5997:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:5998:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:6005:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6009:1: ( ( 'size' ) )
            // InternalRangoMode.g:6010:1: ( 'size' )
            {
            // InternalRangoMode.g:6010:1: ( 'size' )
            // InternalRangoMode.g:6011:2: 'size'
            {
             before(grammarAccess.getBlockAccess().getSizeKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:6020:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6024:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:6025:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:6032:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6036:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:6037:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:6037:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:6038:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:6039:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:6039:3: rule__Block__WidthAssignment_4
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
    // InternalRangoMode.g:6047:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6051:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:6052:2: rule__Block__Group__5__Impl rule__Block__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:6059:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6063:1: ( ( 'by' ) )
            // InternalRangoMode.g:6064:1: ( 'by' )
            {
            // InternalRangoMode.g:6064:1: ( 'by' )
            // InternalRangoMode.g:6065:2: 'by'
            {
             before(grammarAccess.getBlockAccess().getByKeyword_5()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:6074:1: rule__Block__Group__6 : rule__Block__Group__6__Impl rule__Block__Group__7 ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6078:1: ( rule__Block__Group__6__Impl rule__Block__Group__7 )
            // InternalRangoMode.g:6079:2: rule__Block__Group__6__Impl rule__Block__Group__7
            {
            pushFollow(FOLLOW_57);
            rule__Block__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__7();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:6086:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6090:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:6091:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:6091:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:6092:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:6093:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:6093:3: rule__Block__HeightAssignment_6
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


    // $ANTLR start "rule__Block__Group__7"
    // InternalRangoMode.g:6101:1: rule__Block__Group__7 : rule__Block__Group__7__Impl ;
    public final void rule__Block__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6105:1: ( rule__Block__Group__7__Impl )
            // InternalRangoMode.g:6106:2: rule__Block__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__7"


    // $ANTLR start "rule__Block__Group__7__Impl"
    // InternalRangoMode.g:6112:1: rule__Block__Group__7__Impl : ( ( rule__Block__Group_7__0 )? ) ;
    public final void rule__Block__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6116:1: ( ( ( rule__Block__Group_7__0 )? ) )
            // InternalRangoMode.g:6117:1: ( ( rule__Block__Group_7__0 )? )
            {
            // InternalRangoMode.g:6117:1: ( ( rule__Block__Group_7__0 )? )
            // InternalRangoMode.g:6118:2: ( rule__Block__Group_7__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_7()); 
            // InternalRangoMode.g:6119:2: ( rule__Block__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==75) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:6119:3: rule__Block__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__7__Impl"


    // $ANTLR start "rule__Block__Group_7__0"
    // InternalRangoMode.g:6128:1: rule__Block__Group_7__0 : rule__Block__Group_7__0__Impl rule__Block__Group_7__1 ;
    public final void rule__Block__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6132:1: ( rule__Block__Group_7__0__Impl rule__Block__Group_7__1 )
            // InternalRangoMode.g:6133:2: rule__Block__Group_7__0__Impl rule__Block__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_7__0"


    // $ANTLR start "rule__Block__Group_7__0__Impl"
    // InternalRangoMode.g:6140:1: rule__Block__Group_7__0__Impl : ( 'of' ) ;
    public final void rule__Block__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6144:1: ( ( 'of' ) )
            // InternalRangoMode.g:6145:1: ( 'of' )
            {
            // InternalRangoMode.g:6145:1: ( 'of' )
            // InternalRangoMode.g:6146:2: 'of'
            {
             before(grammarAccess.getBlockAccess().getOfKeyword_7_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getOfKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_7__0__Impl"


    // $ANTLR start "rule__Block__Group_7__1"
    // InternalRangoMode.g:6155:1: rule__Block__Group_7__1 : rule__Block__Group_7__1__Impl ;
    public final void rule__Block__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6159:1: ( rule__Block__Group_7__1__Impl )
            // InternalRangoMode.g:6160:2: rule__Block__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_7__1"


    // $ANTLR start "rule__Block__Group_7__1__Impl"
    // InternalRangoMode.g:6166:1: rule__Block__Group_7__1__Impl : ( ( rule__Block__MaterialAssignment_7_1 ) ) ;
    public final void rule__Block__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6170:1: ( ( ( rule__Block__MaterialAssignment_7_1 ) ) )
            // InternalRangoMode.g:6171:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            {
            // InternalRangoMode.g:6171:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            // InternalRangoMode.g:6172:2: ( rule__Block__MaterialAssignment_7_1 )
            {
             before(grammarAccess.getBlockAccess().getMaterialAssignment_7_1()); 
            // InternalRangoMode.g:6173:2: ( rule__Block__MaterialAssignment_7_1 )
            // InternalRangoMode.g:6173:3: rule__Block__MaterialAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__MaterialAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getMaterialAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_7__1__Impl"


    // $ANTLR start "rule__JumpPad__Group__0"
    // InternalRangoMode.g:6182:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6186:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:6187:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:6194:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6198:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6199:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6199:1: ( 'jumppad' )
            // InternalRangoMode.g:6200:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:6209:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6213:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6214:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:6221:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6225:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6226:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6226:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6227:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6228:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6228:3: rule__JumpPad__NameAssignment_1
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
    // InternalRangoMode.g:6236:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6240:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6241:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
            {
            pushFollow(FOLLOW_58);
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
    // InternalRangoMode.g:6248:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6252:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6253:1: ( ruleAt )
            {
            // InternalRangoMode.g:6253:1: ( ruleAt )
            // InternalRangoMode.g:6254:2: ruleAt
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
    // InternalRangoMode.g:6263:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6267:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6268:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:6275:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6279:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6280:1: ( 'launch' )
            {
            // InternalRangoMode.g:6280:1: ( 'launch' )
            // InternalRangoMode.g:6281:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6290:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6294:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6295:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:6302:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6306:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6307:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6307:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6308:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6309:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6309:3: rule__JumpPad__LaunchAssignment_4
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
    // InternalRangoMode.g:6317:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6321:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6322:2: rule__JumpPad__Group__5__Impl
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
    // InternalRangoMode.g:6328:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6332:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6333:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6333:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6334:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6335:2: ( rule__JumpPad__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==78) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:6335:3: rule__JumpPad__Group_5__0
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
    // InternalRangoMode.g:6344:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6348:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6349:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:6356:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6360:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6361:1: ( 'affects' )
            {
            // InternalRangoMode.g:6361:1: ( 'affects' )
            // InternalRangoMode.g:6362:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6371:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6375:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6376:2: rule__JumpPad__Group_5__1__Impl
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
    // InternalRangoMode.g:6382:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6386:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6387:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6387:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6388:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6389:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6389:3: rule__JumpPad__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6398:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6402:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6403:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:6410:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6414:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6415:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6415:1: ( 'teleporter' )
            // InternalRangoMode.g:6416:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6425:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6429:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6430:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:6437:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6441:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6442:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6442:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6443:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6444:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6444:3: rule__Teleporter__NameAssignment_1
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
    // InternalRangoMode.g:6452:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6456:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6457:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
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
    // InternalRangoMode.g:6464:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6468:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6469:1: ( ruleAt )
            {
            // InternalRangoMode.g:6469:1: ( ruleAt )
            // InternalRangoMode.g:6470:2: ruleAt
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
    // InternalRangoMode.g:6479:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6483:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6484:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:6491:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6495:1: ( ( 'to' ) )
            // InternalRangoMode.g:6496:1: ( 'to' )
            {
            // InternalRangoMode.g:6496:1: ( 'to' )
            // InternalRangoMode.g:6497:2: 'to'
            {
             before(grammarAccess.getTeleporterAccess().getToKeyword_3()); 
            match(input,61,FOLLOW_2); 
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
    // InternalRangoMode.g:6506:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6510:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6511:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:6518:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6522:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6523:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6523:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6524:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6525:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6525:3: rule__Teleporter__TargetAssignment_4
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
    // InternalRangoMode.g:6533:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6537:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6538:2: rule__Teleporter__Group__5__Impl
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
    // InternalRangoMode.g:6544:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6548:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6549:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6549:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6550:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6551:2: ( rule__Teleporter__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==78) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:6551:3: rule__Teleporter__Group_5__0
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
    // InternalRangoMode.g:6560:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6564:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6565:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:6572:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6576:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6577:1: ( 'affects' )
            {
            // InternalRangoMode.g:6577:1: ( 'affects' )
            // InternalRangoMode.g:6578:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6587:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6591:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6592:2: rule__Teleporter__Group_5__1__Impl
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
    // InternalRangoMode.g:6598:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6602:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6603:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6603:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6604:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6605:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6605:3: rule__Teleporter__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6614:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6618:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6619:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:6626:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6630:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6631:1: ( 'layout' )
            {
            // InternalRangoMode.g:6631:1: ( 'layout' )
            // InternalRangoMode.g:6632:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:6641:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6645:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6646:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalRangoMode.g:6653:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6657:1: ( ( '{' ) )
            // InternalRangoMode.g:6658:1: ( '{' )
            {
            // InternalRangoMode.g:6658:1: ( '{' )
            // InternalRangoMode.g:6659:2: '{'
            {
             before(grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:6668:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6672:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6673:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:6680:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6684:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6685:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6685:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6686:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6686:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6687:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6688:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6688:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_62);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6691:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6692:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6693:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_ID)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRangoMode.g:6693:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__FixedLayout__SpawnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalRangoMode.g:6702:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6706:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6707:2: rule__FixedLayout__Group__3__Impl
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
    // InternalRangoMode.g:6713:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6717:1: ( ( '}' ) )
            // InternalRangoMode.g:6718:1: ( '}' )
            {
            // InternalRangoMode.g:6718:1: ( '}' )
            // InternalRangoMode.g:6719:2: '}'
            {
             before(grammarAccess.getFixedLayoutAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:6729:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6733:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:6734:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalRangoMode.g:6741:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6745:1: ( ( 'waves' ) )
            // InternalRangoMode.g:6746:1: ( 'waves' )
            {
            // InternalRangoMode.g:6746:1: ( 'waves' )
            // InternalRangoMode.g:6747:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:6756:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6760:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:6761:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
            {
            pushFollow(FOLLOW_63);
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
    // InternalRangoMode.g:6768:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6772:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:6773:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:6773:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:6774:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:6775:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==98) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:6775:3: rule__WaveSchedule__Group_1__0
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
    // InternalRangoMode.g:6783:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6787:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:6788:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
            {
            pushFollow(FOLLOW_64);
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
    // InternalRangoMode.g:6795:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6799:1: ( ( '{' ) )
            // InternalRangoMode.g:6800:1: ( '{' )
            {
            // InternalRangoMode.g:6800:1: ( '{' )
            // InternalRangoMode.g:6801:2: '{'
            {
             before(grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:6810:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6814:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:6815:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:6822:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6826:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:6827:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6827:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:6828:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:6828:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:6829:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6830:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:6830:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_65);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:6833:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:6834:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6835:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==83) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRangoMode.g:6835:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__WaveSchedule__WavesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalRangoMode.g:6844:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6848:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:6849:2: rule__WaveSchedule__Group__4__Impl
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
    // InternalRangoMode.g:6855:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6859:1: ( ( '}' ) )
            // InternalRangoMode.g:6860:1: ( '}' )
            {
            // InternalRangoMode.g:6860:1: ( '}' )
            // InternalRangoMode.g:6861:2: '}'
            {
             before(grammarAccess.getWaveScheduleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:6871:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6875:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:6876:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalRangoMode.g:6883:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6887:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:6888:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:6888:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:6889:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:6890:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:6890:3: rule__WaveSchedule__LoopAssignment_1_0
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
    // InternalRangoMode.g:6898:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6902:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:6903:2: rule__WaveSchedule__Group_1__1__Impl
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
    // InternalRangoMode.g:6909:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6913:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:6914:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:6914:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:6915:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:6916:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==82) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRangoMode.g:6916:3: rule__WaveSchedule__Group_1_1__0
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
    // InternalRangoMode.g:6925:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6929:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:6930:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:6937:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6941:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:6942:1: ( 'escalate' )
            {
            // InternalRangoMode.g:6942:1: ( 'escalate' )
            // InternalRangoMode.g:6943:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:6952:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6956:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:6957:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:6964:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6968:1: ( ( 'by' ) )
            // InternalRangoMode.g:6969:1: ( 'by' )
            {
            // InternalRangoMode.g:6969:1: ( 'by' )
            // InternalRangoMode.g:6970:2: 'by'
            {
             before(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:6979:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6983:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:6984:2: rule__WaveSchedule__Group_1_1__2__Impl
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
    // InternalRangoMode.g:6990:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6994:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:6995:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:6995:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:6996:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:6997:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:6997:3: rule__WaveSchedule__EscalationAssignment_1_1_2
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
    // InternalRangoMode.g:7006:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7010:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:7011:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalRangoMode.g:7018:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7022:1: ( ( 'wave' ) )
            // InternalRangoMode.g:7023:1: ( 'wave' )
            {
            // InternalRangoMode.g:7023:1: ( 'wave' )
            // InternalRangoMode.g:7024:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRangoMode.g:7033:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7037:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:7038:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
            {
            pushFollow(FOLLOW_67);
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
    // InternalRangoMode.g:7045:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7049:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:7050:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:7050:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:7051:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:7052:2: ( rule__Wave__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==84) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRangoMode.g:7052:3: rule__Wave__Group_1__0
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
    // InternalRangoMode.g:7060:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7064:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:7065:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalRangoMode.g:7072:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7076:1: ( ( '{' ) )
            // InternalRangoMode.g:7077:1: ( '{' )
            {
            // InternalRangoMode.g:7077:1: ( '{' )
            // InternalRangoMode.g:7078:2: '{'
            {
             before(grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:7087:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7091:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:7092:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:7099:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7103:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:7104:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7104:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:7105:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:7105:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:7106:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7107:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:7107:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_62);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:7110:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:7111:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7112:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_INT && LA32_0<=RULE_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRangoMode.g:7112:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_62);
            	    rule__Wave__SpawnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalRangoMode.g:7121:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7125:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:7126:2: rule__Wave__Group__4__Impl
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
    // InternalRangoMode.g:7132:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7136:1: ( ( '}' ) )
            // InternalRangoMode.g:7137:1: ( '}' )
            {
            // InternalRangoMode.g:7137:1: ( '}' )
            // InternalRangoMode.g:7138:2: '}'
            {
             before(grammarAccess.getWaveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:7148:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7152:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:7153:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:7160:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7164:1: ( ( 'after' ) )
            // InternalRangoMode.g:7165:1: ( 'after' )
            {
            // InternalRangoMode.g:7165:1: ( 'after' )
            // InternalRangoMode.g:7166:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRangoMode.g:7175:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7179:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:7180:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:7187:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7191:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:7192:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7192:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:7193:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:7194:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:7194:3: rule__Wave__DelayAssignment_1_1
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
    // InternalRangoMode.g:7202:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7206:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7207:2: rule__Wave__Group_1__2__Impl
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
    // InternalRangoMode.g:7213:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7217:1: ( ( 's' ) )
            // InternalRangoMode.g:7218:1: ( 's' )
            {
            // InternalRangoMode.g:7218:1: ( 's' )
            // InternalRangoMode.g:7219:2: 's'
            {
             before(grammarAccess.getWaveAccess().getSKeyword_1_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:7229:1: rule__EnemySpawn__Group__0 : rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 ;
    public final void rule__EnemySpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7233:1: ( rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 )
            // InternalRangoMode.g:7234:2: rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalRangoMode.g:7241:1: rule__EnemySpawn__Group__0__Impl : ( ( rule__EnemySpawn__Group_0__0 )? ) ;
    public final void rule__EnemySpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7245:1: ( ( ( rule__EnemySpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7246:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7246:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            // InternalRangoMode.g:7247:2: ( rule__EnemySpawn__Group_0__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7248:2: ( rule__EnemySpawn__Group_0__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRangoMode.g:7248:3: rule__EnemySpawn__Group_0__0
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
    // InternalRangoMode.g:7256:1: rule__EnemySpawn__Group__1 : rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 ;
    public final void rule__EnemySpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7260:1: ( rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 )
            // InternalRangoMode.g:7261:2: rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:7268:1: rule__EnemySpawn__Group__1__Impl : ( ( rule__EnemySpawn__TypeAssignment_1 ) ) ;
    public final void rule__EnemySpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7272:1: ( ( ( rule__EnemySpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7273:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7273:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7274:2: ( rule__EnemySpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7275:2: ( rule__EnemySpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7275:3: rule__EnemySpawn__TypeAssignment_1
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
    // InternalRangoMode.g:7283:1: rule__EnemySpawn__Group__2 : rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 ;
    public final void rule__EnemySpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7287:1: ( rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 )
            // InternalRangoMode.g:7288:2: rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:7295:1: rule__EnemySpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__EnemySpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7299:1: ( ( 'size' ) )
            // InternalRangoMode.g:7300:1: ( 'size' )
            {
            // InternalRangoMode.g:7300:1: ( 'size' )
            // InternalRangoMode.g:7301:2: 'size'
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:7310:1: rule__EnemySpawn__Group__3 : rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 ;
    public final void rule__EnemySpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7314:1: ( rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 )
            // InternalRangoMode.g:7315:2: rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:7322:1: rule__EnemySpawn__Group__3__Impl : ( ( rule__EnemySpawn__SizeAssignment_3 ) ) ;
    public final void rule__EnemySpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7326:1: ( ( ( rule__EnemySpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7327:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7327:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7328:2: ( rule__EnemySpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7329:2: ( rule__EnemySpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7329:3: rule__EnemySpawn__SizeAssignment_3
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
    // InternalRangoMode.g:7337:1: rule__EnemySpawn__Group__4 : rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 ;
    public final void rule__EnemySpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7341:1: ( rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 )
            // InternalRangoMode.g:7342:2: rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5
            {
            pushFollow(FOLLOW_68);
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
    // InternalRangoMode.g:7349:1: rule__EnemySpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__EnemySpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7353:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7354:1: ( ruleAt )
            {
            // InternalRangoMode.g:7354:1: ( ruleAt )
            // InternalRangoMode.g:7355:2: ruleAt
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
    // InternalRangoMode.g:7364:1: rule__EnemySpawn__Group__5 : rule__EnemySpawn__Group__5__Impl ;
    public final void rule__EnemySpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7368:1: ( rule__EnemySpawn__Group__5__Impl )
            // InternalRangoMode.g:7369:2: rule__EnemySpawn__Group__5__Impl
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
    // InternalRangoMode.g:7375:1: rule__EnemySpawn__Group__5__Impl : ( ( rule__EnemySpawn__Group_5__0 )? ) ;
    public final void rule__EnemySpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7379:1: ( ( ( rule__EnemySpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7380:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7380:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            // InternalRangoMode.g:7381:2: ( rule__EnemySpawn__Group_5__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7382:2: ( rule__EnemySpawn__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==85) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:7382:3: rule__EnemySpawn__Group_5__0
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
    // InternalRangoMode.g:7391:1: rule__EnemySpawn__Group_0__0 : rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 ;
    public final void rule__EnemySpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7395:1: ( rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 )
            // InternalRangoMode.g:7396:2: rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:7403:1: rule__EnemySpawn__Group_0__0__Impl : ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) ;
    public final void rule__EnemySpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7407:1: ( ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7408:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7408:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7409:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7410:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7410:3: rule__EnemySpawn__CountAssignment_0_0
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
    // InternalRangoMode.g:7418:1: rule__EnemySpawn__Group_0__1 : rule__EnemySpawn__Group_0__1__Impl ;
    public final void rule__EnemySpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7422:1: ( rule__EnemySpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7423:2: rule__EnemySpawn__Group_0__1__Impl
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
    // InternalRangoMode.g:7429:1: rule__EnemySpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__EnemySpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7433:1: ( ( '*' ) )
            // InternalRangoMode.g:7434:1: ( '*' )
            {
            // InternalRangoMode.g:7434:1: ( '*' )
            // InternalRangoMode.g:7435:2: '*'
            {
             before(grammarAccess.getEnemySpawnAccess().getAsteriskKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRangoMode.g:7445:1: rule__EnemySpawn__Group_5__0 : rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 ;
    public final void rule__EnemySpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7449:1: ( rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 )
            // InternalRangoMode.g:7450:2: rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalRangoMode.g:7457:1: rule__EnemySpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__EnemySpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7461:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7462:1: ( 'moving' )
            {
            // InternalRangoMode.g:7462:1: ( 'moving' )
            // InternalRangoMode.g:7463:2: 'moving'
            {
             before(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRangoMode.g:7472:1: rule__EnemySpawn__Group_5__1 : rule__EnemySpawn__Group_5__1__Impl ;
    public final void rule__EnemySpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7476:1: ( rule__EnemySpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7477:2: rule__EnemySpawn__Group_5__1__Impl
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
    // InternalRangoMode.g:7483:1: rule__EnemySpawn__Group_5__1__Impl : ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__EnemySpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7487:1: ( ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7488:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7488:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7489:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7490:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7490:3: rule__EnemySpawn__DirectionAssignment_5_1
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
    // InternalRangoMode.g:7499:1: rule__Drops__Group__0 : rule__Drops__Group__0__Impl rule__Drops__Group__1 ;
    public final void rule__Drops__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7503:1: ( rule__Drops__Group__0__Impl rule__Drops__Group__1 )
            // InternalRangoMode.g:7504:2: rule__Drops__Group__0__Impl rule__Drops__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:7511:1: rule__Drops__Group__0__Impl : ( 'drops' ) ;
    public final void rule__Drops__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7515:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7516:1: ( 'drops' )
            {
            // InternalRangoMode.g:7516:1: ( 'drops' )
            // InternalRangoMode.g:7517:2: 'drops'
            {
             before(grammarAccess.getDropsAccess().getDropsKeyword_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRangoMode.g:7526:1: rule__Drops__Group__1 : rule__Drops__Group__1__Impl rule__Drops__Group__2 ;
    public final void rule__Drops__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7530:1: ( rule__Drops__Group__1__Impl rule__Drops__Group__2 )
            // InternalRangoMode.g:7531:2: rule__Drops__Group__1__Impl rule__Drops__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:7538:1: rule__Drops__Group__1__Impl : ( '{' ) ;
    public final void rule__Drops__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7542:1: ( ( '{' ) )
            // InternalRangoMode.g:7543:1: ( '{' )
            {
            // InternalRangoMode.g:7543:1: ( '{' )
            // InternalRangoMode.g:7544:2: '{'
            {
             before(grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:7553:1: rule__Drops__Group__2 : rule__Drops__Group__2__Impl rule__Drops__Group__3 ;
    public final void rule__Drops__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7557:1: ( rule__Drops__Group__2__Impl rule__Drops__Group__3 )
            // InternalRangoMode.g:7558:2: rule__Drops__Group__2__Impl rule__Drops__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:7565:1: rule__Drops__Group__2__Impl : ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) ;
    public final void rule__Drops__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7569:1: ( ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) )
            // InternalRangoMode.g:7570:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:7570:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            // InternalRangoMode.g:7571:2: ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* )
            {
            // InternalRangoMode.g:7571:2: ( ( rule__Drops__DropsAssignment_2 ) )
            // InternalRangoMode.g:7572:3: ( rule__Drops__DropsAssignment_2 )
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7573:3: ( rule__Drops__DropsAssignment_2 )
            // InternalRangoMode.g:7573:4: rule__Drops__DropsAssignment_2
            {
            pushFollow(FOLLOW_70);
            rule__Drops__DropsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }

            // InternalRangoMode.g:7576:2: ( ( rule__Drops__DropsAssignment_2 )* )
            // InternalRangoMode.g:7577:3: ( rule__Drops__DropsAssignment_2 )*
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7578:3: ( rule__Drops__DropsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRangoMode.g:7578:4: rule__Drops__DropsAssignment_2
            	    {
            	    pushFollow(FOLLOW_70);
            	    rule__Drops__DropsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalRangoMode.g:7587:1: rule__Drops__Group__3 : rule__Drops__Group__3__Impl ;
    public final void rule__Drops__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7591:1: ( rule__Drops__Group__3__Impl )
            // InternalRangoMode.g:7592:2: rule__Drops__Group__3__Impl
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
    // InternalRangoMode.g:7598:1: rule__Drops__Group__3__Impl : ( '}' ) ;
    public final void rule__Drops__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7602:1: ( ( '}' ) )
            // InternalRangoMode.g:7603:1: ( '}' )
            {
            // InternalRangoMode.g:7603:1: ( '}' )
            // InternalRangoMode.g:7604:2: '}'
            {
             before(grammarAccess.getDropsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:7614:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7618:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7619:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:7626:1: rule__DropTable__Group__0__Impl : ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7630:1: ( ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) )
            // InternalRangoMode.g:7631:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            {
            // InternalRangoMode.g:7631:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            // InternalRangoMode.g:7632:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 
            // InternalRangoMode.g:7633:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            // InternalRangoMode.g:7633:3: rule__DropTable__EnemyTypeAssignment_0
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
    // InternalRangoMode.g:7641:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7645:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7646:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:7653:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7657:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7658:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7658:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7659:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7660:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7660:3: rule__DropTable__ChanceAssignment_1
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
    // InternalRangoMode.g:7668:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7672:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7673:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRangoMode.g:7680:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7684:1: ( ( '%' ) )
            // InternalRangoMode.g:7685:1: ( '%' )
            {
            // InternalRangoMode.g:7685:1: ( '%' )
            // InternalRangoMode.g:7686:2: '%'
            {
             before(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:7695:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7699:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7700:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:7707:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7711:1: ( ( '{' ) )
            // InternalRangoMode.g:7712:1: ( '{' )
            {
            // InternalRangoMode.g:7712:1: ( '{' )
            // InternalRangoMode.g:7713:2: '{'
            {
             before(grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:7722:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7726:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7727:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:7734:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7738:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:7739:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:7739:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:7740:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:7741:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:7741:3: rule__DropTable__EntriesAssignment_4
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
    // InternalRangoMode.g:7749:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7753:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:7754:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:7761:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7765:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:7766:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:7766:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:7767:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:7768:2: ( rule__DropTable__Group_5__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRangoMode.g:7768:3: rule__DropTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DropTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalRangoMode.g:7776:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7780:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:7781:2: rule__DropTable__Group__6__Impl
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
    // InternalRangoMode.g:7787:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7791:1: ( ( '}' ) )
            // InternalRangoMode.g:7792:1: ( '}' )
            {
            // InternalRangoMode.g:7792:1: ( '}' )
            // InternalRangoMode.g:7793:2: '}'
            {
             before(grammarAccess.getDropTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:7803:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7807:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:7808:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:7815:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7819:1: ( ( ',' ) )
            // InternalRangoMode.g:7820:1: ( ',' )
            {
            // InternalRangoMode.g:7820:1: ( ',' )
            // InternalRangoMode.g:7821:2: ','
            {
             before(grammarAccess.getDropTableAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:7830:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7834:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:7835:2: rule__DropTable__Group_5__1__Impl
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
    // InternalRangoMode.g:7841:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7845:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:7846:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7846:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:7847:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:7848:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:7848:3: rule__DropTable__EntriesAssignment_5_1
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
    // InternalRangoMode.g:7857:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7861:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:7862:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalRangoMode.g:7869:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7873:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:7874:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:7874:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:7875:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:7876:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:7876:3: rule__Drop__PowerUpAssignment_0
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
    // InternalRangoMode.g:7884:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7888:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:7889:2: rule__Drop__Group__1__Impl
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
    // InternalRangoMode.g:7895:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7899:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:7900:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:7900:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:7901:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:7902:2: ( rule__Drop__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==87) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:7902:3: rule__Drop__Group_1__0
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
    // InternalRangoMode.g:7911:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7915:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:7916:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:7923:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7927:1: ( ( 'weight' ) )
            // InternalRangoMode.g:7928:1: ( 'weight' )
            {
            // InternalRangoMode.g:7928:1: ( 'weight' )
            // InternalRangoMode.g:7929:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRangoMode.g:7938:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7942:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:7943:2: rule__Drop__Group_1__1__Impl
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
    // InternalRangoMode.g:7949:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7953:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:7954:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7954:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:7955:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:7956:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:7956:3: rule__Drop__WeightAssignment_1_1
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
    // InternalRangoMode.g:7965:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7969:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:7970:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRangoMode.g:7977:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7981:1: ( ( () ) )
            // InternalRangoMode.g:7982:1: ( () )
            {
            // InternalRangoMode.g:7982:1: ( () )
            // InternalRangoMode.g:7983:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:7984:2: ()
            // InternalRangoMode.g:7984:3: 
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
    // InternalRangoMode.g:7992:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7996:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:7997:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
            {
            pushFollow(FOLLOW_73);
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
    // InternalRangoMode.g:8004:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8008:1: ( ( 'all' ) )
            // InternalRangoMode.g:8009:1: ( 'all' )
            {
            // InternalRangoMode.g:8009:1: ( 'all' )
            // InternalRangoMode.g:8010:2: 'all'
            {
             before(grammarAccess.getClearedAccess().getAllKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:8019:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8023:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:8024:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
            {
            pushFollow(FOLLOW_74);
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
    // InternalRangoMode.g:8031:1: rule__Cleared__Group__2__Impl : ( 'enemies' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8035:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8036:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8036:1: ( 'enemies' )
            // InternalRangoMode.g:8037:2: 'enemies'
            {
             before(grammarAccess.getClearedAccess().getEnemiesKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalRangoMode.g:8046:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8050:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:8051:2: rule__Cleared__Group__3__Impl
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
    // InternalRangoMode.g:8057:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8061:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:8062:1: ( 'cleared' )
            {
            // InternalRangoMode.g:8062:1: ( 'cleared' )
            // InternalRangoMode.g:8063:2: 'cleared'
            {
             before(grammarAccess.getClearedAccess().getClearedKeyword_3()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRangoMode.g:8073:1: rule__TimeReached__Group__0 : rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 ;
    public final void rule__TimeReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8077:1: ( rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 )
            // InternalRangoMode.g:8078:2: rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1
            {
            pushFollow(FOLLOW_75);
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
    // InternalRangoMode.g:8085:1: rule__TimeReached__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8089:1: ( ( 'time' ) )
            // InternalRangoMode.g:8090:1: ( 'time' )
            {
            // InternalRangoMode.g:8090:1: ( 'time' )
            // InternalRangoMode.g:8091:2: 'time'
            {
             before(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:8100:1: rule__TimeReached__Group__1 : rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 ;
    public final void rule__TimeReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8104:1: ( rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 )
            // InternalRangoMode.g:8105:2: rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:8112:1: rule__TimeReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8116:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8117:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8117:1: ( 'reaches' )
            // InternalRangoMode.g:8118:2: 'reaches'
            {
             before(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:8127:1: rule__TimeReached__Group__2 : rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 ;
    public final void rule__TimeReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8131:1: ( rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 )
            // InternalRangoMode.g:8132:2: rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:8139:1: rule__TimeReached__Group__2__Impl : ( ( rule__TimeReached__SecondsAssignment_2 ) ) ;
    public final void rule__TimeReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8143:1: ( ( ( rule__TimeReached__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8144:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8144:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8145:2: ( rule__TimeReached__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8146:2: ( rule__TimeReached__SecondsAssignment_2 )
            // InternalRangoMode.g:8146:3: rule__TimeReached__SecondsAssignment_2
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
    // InternalRangoMode.g:8154:1: rule__TimeReached__Group__3 : rule__TimeReached__Group__3__Impl ;
    public final void rule__TimeReached__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8158:1: ( rule__TimeReached__Group__3__Impl )
            // InternalRangoMode.g:8159:2: rule__TimeReached__Group__3__Impl
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
    // InternalRangoMode.g:8165:1: rule__TimeReached__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeReached__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8169:1: ( ( 's' ) )
            // InternalRangoMode.g:8170:1: ( 's' )
            {
            // InternalRangoMode.g:8170:1: ( 's' )
            // InternalRangoMode.g:8171:2: 's'
            {
             before(grammarAccess.getTimeReachedAccess().getSKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:8181:1: rule__ScoreReached__Group__0 : rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 ;
    public final void rule__ScoreReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8185:1: ( rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 )
            // InternalRangoMode.g:8186:2: rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1
            {
            pushFollow(FOLLOW_75);
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
    // InternalRangoMode.g:8193:1: rule__ScoreReached__Group__0__Impl : ( 'score' ) ;
    public final void rule__ScoreReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8197:1: ( ( 'score' ) )
            // InternalRangoMode.g:8198:1: ( 'score' )
            {
            // InternalRangoMode.g:8198:1: ( 'score' )
            // InternalRangoMode.g:8199:2: 'score'
            {
             before(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalRangoMode.g:8208:1: rule__ScoreReached__Group__1 : rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 ;
    public final void rule__ScoreReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8212:1: ( rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 )
            // InternalRangoMode.g:8213:2: rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:8220:1: rule__ScoreReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__ScoreReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8224:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8225:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8225:1: ( 'reaches' )
            // InternalRangoMode.g:8226:2: 'reaches'
            {
             before(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:8235:1: rule__ScoreReached__Group__2 : rule__ScoreReached__Group__2__Impl ;
    public final void rule__ScoreReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8239:1: ( rule__ScoreReached__Group__2__Impl )
            // InternalRangoMode.g:8240:2: rule__ScoreReached__Group__2__Impl
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
    // InternalRangoMode.g:8246:1: rule__ScoreReached__Group__2__Impl : ( ( rule__ScoreReached__PointsAssignment_2 ) ) ;
    public final void rule__ScoreReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8250:1: ( ( ( rule__ScoreReached__PointsAssignment_2 ) ) )
            // InternalRangoMode.g:8251:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            {
            // InternalRangoMode.g:8251:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            // InternalRangoMode.g:8252:2: ( rule__ScoreReached__PointsAssignment_2 )
            {
             before(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 
            // InternalRangoMode.g:8253:2: ( rule__ScoreReached__PointsAssignment_2 )
            // InternalRangoMode.g:8253:3: rule__ScoreReached__PointsAssignment_2
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
    // InternalRangoMode.g:8262:1: rule__EnemiesPopped__Group__0 : rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 ;
    public final void rule__EnemiesPopped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8266:1: ( rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 )
            // InternalRangoMode.g:8267:2: rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1
            {
            pushFollow(FOLLOW_73);
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
    // InternalRangoMode.g:8274:1: rule__EnemiesPopped__Group__0__Impl : ( ( rule__EnemiesPopped__CountAssignment_0 ) ) ;
    public final void rule__EnemiesPopped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8278:1: ( ( ( rule__EnemiesPopped__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8279:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8279:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            // InternalRangoMode.g:8280:2: ( rule__EnemiesPopped__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8281:2: ( rule__EnemiesPopped__CountAssignment_0 )
            // InternalRangoMode.g:8281:3: rule__EnemiesPopped__CountAssignment_0
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
    // InternalRangoMode.g:8289:1: rule__EnemiesPopped__Group__1 : rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 ;
    public final void rule__EnemiesPopped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8293:1: ( rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 )
            // InternalRangoMode.g:8294:2: rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2
            {
            pushFollow(FOLLOW_76);
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
    // InternalRangoMode.g:8301:1: rule__EnemiesPopped__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesPopped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8305:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8306:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8306:1: ( 'enemies' )
            // InternalRangoMode.g:8307:2: 'enemies'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getEnemiesKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalRangoMode.g:8316:1: rule__EnemiesPopped__Group__2 : rule__EnemiesPopped__Group__2__Impl ;
    public final void rule__EnemiesPopped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8320:1: ( rule__EnemiesPopped__Group__2__Impl )
            // InternalRangoMode.g:8321:2: rule__EnemiesPopped__Group__2__Impl
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
    // InternalRangoMode.g:8327:1: rule__EnemiesPopped__Group__2__Impl : ( 'popped' ) ;
    public final void rule__EnemiesPopped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8331:1: ( ( 'popped' ) )
            // InternalRangoMode.g:8332:1: ( 'popped' )
            {
            // InternalRangoMode.g:8332:1: ( 'popped' )
            // InternalRangoMode.g:8333:2: 'popped'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2()); 
            match(input,93,FOLLOW_2); 
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
    // InternalRangoMode.g:8343:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8347:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8348:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
            {
            pushFollow(FOLLOW_77);
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
    // InternalRangoMode.g:8355:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8359:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8360:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8360:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8361:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8362:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8362:3: rule__WavesSurvived__CountAssignment_0
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
    // InternalRangoMode.g:8370:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8374:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8375:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
            {
            pushFollow(FOLLOW_78);
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
    // InternalRangoMode.g:8382:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8386:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8387:1: ( 'waves' )
            {
            // InternalRangoMode.g:8387:1: ( 'waves' )
            // InternalRangoMode.g:8388:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:8397:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8401:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8402:2: rule__WavesSurvived__Group__2__Impl
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
    // InternalRangoMode.g:8408:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8412:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8413:1: ( 'survived' )
            {
            // InternalRangoMode.g:8413:1: ( 'survived' )
            // InternalRangoMode.g:8414:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,94,FOLLOW_2); 
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
    // InternalRangoMode.g:8424:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8428:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8429:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
            {
            pushFollow(FOLLOW_79);
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
    // InternalRangoMode.g:8436:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8440:1: ( ( () ) )
            // InternalRangoMode.g:8441:1: ( () )
            {
            // InternalRangoMode.g:8441:1: ( () )
            // InternalRangoMode.g:8442:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8443:2: ()
            // InternalRangoMode.g:8443:3: 
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
    // InternalRangoMode.g:8451:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8455:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8456:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
            {
            pushFollow(FOLLOW_80);
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
    // InternalRangoMode.g:8463:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8467:1: ( ( 'health' ) )
            // InternalRangoMode.g:8468:1: ( 'health' )
            {
            // InternalRangoMode.g:8468:1: ( 'health' )
            // InternalRangoMode.g:8469:2: 'health'
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRangoMode.g:8478:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8482:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8483:2: rule__HealthDepleted__Group__2__Impl
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
    // InternalRangoMode.g:8489:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8493:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8494:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8494:1: ( 'depleted' )
            // InternalRangoMode.g:8495:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,95,FOLLOW_2); 
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
    // InternalRangoMode.g:8505:1: rule__EnemiesAlive__Group__0 : rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 ;
    public final void rule__EnemiesAlive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8509:1: ( rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 )
            // InternalRangoMode.g:8510:2: rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1
            {
            pushFollow(FOLLOW_73);
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
    // InternalRangoMode.g:8517:1: rule__EnemiesAlive__Group__0__Impl : ( ( rule__EnemiesAlive__CountAssignment_0 ) ) ;
    public final void rule__EnemiesAlive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8521:1: ( ( ( rule__EnemiesAlive__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8522:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8522:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            // InternalRangoMode.g:8523:2: ( rule__EnemiesAlive__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8524:2: ( rule__EnemiesAlive__CountAssignment_0 )
            // InternalRangoMode.g:8524:3: rule__EnemiesAlive__CountAssignment_0
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
    // InternalRangoMode.g:8532:1: rule__EnemiesAlive__Group__1 : rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 ;
    public final void rule__EnemiesAlive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8536:1: ( rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 )
            // InternalRangoMode.g:8537:2: rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2
            {
            pushFollow(FOLLOW_81);
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
    // InternalRangoMode.g:8544:1: rule__EnemiesAlive__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesAlive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8548:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8549:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8549:1: ( 'enemies' )
            // InternalRangoMode.g:8550:2: 'enemies'
            {
             before(grammarAccess.getEnemiesAliveAccess().getEnemiesKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalRangoMode.g:8559:1: rule__EnemiesAlive__Group__2 : rule__EnemiesAlive__Group__2__Impl ;
    public final void rule__EnemiesAlive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8563:1: ( rule__EnemiesAlive__Group__2__Impl )
            // InternalRangoMode.g:8564:2: rule__EnemiesAlive__Group__2__Impl
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
    // InternalRangoMode.g:8570:1: rule__EnemiesAlive__Group__2__Impl : ( 'alive' ) ;
    public final void rule__EnemiesAlive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8574:1: ( ( 'alive' ) )
            // InternalRangoMode.g:8575:1: ( 'alive' )
            {
            // InternalRangoMode.g:8575:1: ( 'alive' )
            // InternalRangoMode.g:8576:2: 'alive'
            {
             before(grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2()); 
            match(input,96,FOLLOW_2); 
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
    // InternalRangoMode.g:8586:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8590:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8591:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_82);
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
    // InternalRangoMode.g:8598:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8602:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8603:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8603:1: ( RULE_INT )
            // InternalRangoMode.g:8604:2: RULE_INT
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
    // InternalRangoMode.g:8613:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8617:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8618:2: rule__Decimal__Group__1__Impl
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
    // InternalRangoMode.g:8624:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8628:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8629:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8629:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8630:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8631:2: ( rule__Decimal__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==97) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRangoMode.g:8631:3: rule__Decimal__Group_1__0
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
    // InternalRangoMode.g:8640:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8644:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8645:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:8652:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8656:1: ( ( '.' ) )
            // InternalRangoMode.g:8657:1: ( '.' )
            {
            // InternalRangoMode.g:8657:1: ( '.' )
            // InternalRangoMode.g:8658:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,97,FOLLOW_2); 
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
    // InternalRangoMode.g:8667:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8671:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8672:2: rule__Decimal__Group_1__1__Impl
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
    // InternalRangoMode.g:8678:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8682:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8683:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8683:1: ( RULE_INT )
            // InternalRangoMode.g:8684:2: RULE_INT
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
    // InternalRangoMode.g:8694:1: rule__EnemyType__UnorderedGroup_3 : rule__EnemyType__UnorderedGroup_3__0 {...}?;
    public final void rule__EnemyType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8699:1: ( rule__EnemyType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8700:2: rule__EnemyType__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8708:1: rule__EnemyType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__EnemyType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8713:1: ( ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8714:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8714:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            int alt39=5;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt39=2;
            }
            else if ( LA39_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt39=3;
            }
            else if ( LA39_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt39=4;
            }
            else if ( LA39_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt39=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalRangoMode.g:8715:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8715:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8716:4: {...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8716:105: ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8717:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8723:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8724:6: ( rule__EnemyType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8725:6: ( rule__EnemyType__Group_3_0__0 )
                    // InternalRangoMode.g:8725:7: rule__EnemyType__Group_3_0__0
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
                    // InternalRangoMode.g:8730:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8730:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8731:4: {...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8731:105: ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8732:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8738:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    // InternalRangoMode.g:8739:6: ( rule__EnemyType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8740:6: ( rule__EnemyType__Group_3_1__0 )
                    // InternalRangoMode.g:8740:7: rule__EnemyType__Group_3_1__0
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
                    // InternalRangoMode.g:8745:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8745:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8746:4: {...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8746:105: ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8747:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8753:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    // InternalRangoMode.g:8754:6: ( rule__EnemyType__Group_3_2__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8755:6: ( rule__EnemyType__Group_3_2__0 )
                    // InternalRangoMode.g:8755:7: rule__EnemyType__Group_3_2__0
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
                    // InternalRangoMode.g:8760:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8760:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8761:4: {...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8761:105: ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8762:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8768:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    // InternalRangoMode.g:8769:6: ( rule__EnemyType__Group_3_3__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8770:6: ( rule__EnemyType__Group_3_3__0 )
                    // InternalRangoMode.g:8770:7: rule__EnemyType__Group_3_3__0
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
                    // InternalRangoMode.g:8775:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8775:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8776:4: {...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8776:105: ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8777:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8783:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    // InternalRangoMode.g:8784:6: ( rule__EnemyType__Group_3_4__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8785:6: ( rule__EnemyType__Group_3_4__0 )
                    // InternalRangoMode.g:8785:7: rule__EnemyType__Group_3_4__0
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
    // InternalRangoMode.g:8798:1: rule__EnemyType__UnorderedGroup_3__0 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8802:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8803:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8804:2: ( rule__EnemyType__UnorderedGroup_3__1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:8804:2: rule__EnemyType__UnorderedGroup_3__1
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
    // InternalRangoMode.g:8810:1: rule__EnemyType__UnorderedGroup_3__1 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8814:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8815:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8816:2: ( rule__EnemyType__UnorderedGroup_3__2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:8816:2: rule__EnemyType__UnorderedGroup_3__2
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
    // InternalRangoMode.g:8822:1: rule__EnemyType__UnorderedGroup_3__2 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8826:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:8827:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8828:2: ( rule__EnemyType__UnorderedGroup_3__3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:8828:2: rule__EnemyType__UnorderedGroup_3__3
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
    // InternalRangoMode.g:8834:1: rule__EnemyType__UnorderedGroup_3__3 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8838:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:8839:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8840:2: ( rule__EnemyType__UnorderedGroup_3__4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRangoMode.g:8840:2: rule__EnemyType__UnorderedGroup_3__4
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
    // InternalRangoMode.g:8846:1: rule__EnemyType__UnorderedGroup_3__4 : rule__EnemyType__UnorderedGroup_3__Impl ;
    public final void rule__EnemyType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8850:1: ( rule__EnemyType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8851:2: rule__EnemyType__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__Material__UnorderedGroup_3"
    // InternalRangoMode.g:8858:1: rule__Material__UnorderedGroup_3 : ( rule__Material__UnorderedGroup_3__0 )? ;
    public final void rule__Material__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8863:1: ( ( rule__Material__UnorderedGroup_3__0 )? )
            // InternalRangoMode.g:8864:2: ( rule__Material__UnorderedGroup_3__0 )?
            {
            // InternalRangoMode.g:8864:2: ( rule__Material__UnorderedGroup_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:8864:2: rule__Material__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Material__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__UnorderedGroup_3"


    // $ANTLR start "rule__Material__UnorderedGroup_3__Impl"
    // InternalRangoMode.g:8872:1: rule__Material__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__Material__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8877:1: ( ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) )
            // InternalRangoMode.g:8878:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8878:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:8879:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8879:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8880:4: {...}? => ( ( ( rule__Material__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8880:104: ( ( ( rule__Material__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8881:5: ( ( rule__Material__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8887:5: ( ( rule__Material__Group_3_0__0 ) )
                    // InternalRangoMode.g:8888:6: ( rule__Material__Group_3_0__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8889:6: ( rule__Material__Group_3_0__0 )
                    // InternalRangoMode.g:8889:7: rule__Material__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Material__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaterialAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:8894:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8894:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8895:4: {...}? => ( ( ( rule__Material__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8895:104: ( ( ( rule__Material__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8896:5: ( ( rule__Material__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8902:5: ( ( rule__Material__Group_3_1__0 ) )
                    // InternalRangoMode.g:8903:6: ( rule__Material__Group_3_1__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8904:6: ( rule__Material__Group_3_1__0 )
                    // InternalRangoMode.g:8904:7: rule__Material__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Material__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaterialAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Material__UnorderedGroup_3__0"
    // InternalRangoMode.g:8917:1: rule__Material__UnorderedGroup_3__0 : rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? ;
    public final void rule__Material__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8921:1: ( rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8922:2: rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_84);
            rule__Material__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8923:2: ( rule__Material__UnorderedGroup_3__1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:8923:2: rule__Material__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Material__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__Material__UnorderedGroup_3__0"


    // $ANTLR start "rule__Material__UnorderedGroup_3__1"
    // InternalRangoMode.g:8929:1: rule__Material__UnorderedGroup_3__1 : rule__Material__UnorderedGroup_3__Impl ;
    public final void rule__Material__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8933:1: ( rule__Material__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8934:2: rule__Material__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Material__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__UnorderedGroup_3__1"


    // $ANTLR start "rule__PlayerProfile__UnorderedGroup_3"
    // InternalRangoMode.g:8941:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8946:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8947:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8955:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8960:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:8961:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8961:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt47=6;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt47=2;
            }
            else if ( LA47_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt47=3;
            }
            else if ( LA47_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt47=4;
            }
            else if ( LA47_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt47=5;
            }
            else if ( LA47_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt47=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalRangoMode.g:8962:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8962:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8963:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8963:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8964:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8970:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:8971:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8972:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:8972:7: rule__PlayerProfile__Group_3_0__0
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
                    // InternalRangoMode.g:8977:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8977:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8978:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8978:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8979:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8985:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:8986:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8987:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:8987:7: rule__PlayerProfile__Group_3_1__0
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
                    // InternalRangoMode.g:8992:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8992:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8993:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8993:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8994:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9000:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:9001:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:9002:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:9002:7: rule__PlayerProfile__Group_3_2__0
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
                    // InternalRangoMode.g:9007:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9007:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:9008:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:9008:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:9009:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9015:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:9016:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9017:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:9017:7: rule__PlayerProfile__Group_3_3__0
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
                    // InternalRangoMode.g:9022:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9022:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9023:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9023:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9024:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9030:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:9031:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9032:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:9032:7: rule__PlayerProfile__Group_3_4__0
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
                    // InternalRangoMode.g:9037:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9037:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:9038:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:9038:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:9039:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9045:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:9046:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:9047:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:9047:7: rule__PlayerProfile__Group_3_5__0
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
    // InternalRangoMode.g:9060:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9064:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9065:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9066:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt48=1;
            }
            else if ( LA48_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt48=1;
            }
            else if ( LA48_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt48=1;
            }
            else if ( LA48_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRangoMode.g:9066:2: rule__PlayerProfile__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9072:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9076:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9077:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9078:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            else if ( LA49_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt49=1;
            }
            else if ( LA49_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt49=1;
            }
            else if ( LA49_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRangoMode.g:9078:2: rule__PlayerProfile__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9084:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9088:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9089:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9090:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt50=1;
            }
            else if ( LA50_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt50=1;
            }
            else if ( LA50_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt50=1;
            }
            else if ( LA50_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:9090:2: rule__PlayerProfile__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9096:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9100:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9101:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9102:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            else if ( LA51_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt51=1;
            }
            else if ( LA51_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt51=1;
            }
            else if ( LA51_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRangoMode.g:9102:2: rule__PlayerProfile__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9108:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9112:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:9113:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_85);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9114:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            else if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt52=1;
            }
            else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt52=1;
            }
            else if ( LA52_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRangoMode.g:9114:2: rule__PlayerProfile__UnorderedGroup_3__5
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
    // InternalRangoMode.g:9120:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9124:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9125:2: rule__PlayerProfile__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9132:1: rule__GameMode__UnorderedGroup_7 : ( rule__GameMode__UnorderedGroup_7__0 )? ;
    public final void rule__GameMode__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
        	
        try {
            // InternalRangoMode.g:9137:1: ( ( rule__GameMode__UnorderedGroup_7__0 )? )
            // InternalRangoMode.g:9138:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            {
            // InternalRangoMode.g:9138:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRangoMode.g:9138:2: rule__GameMode__UnorderedGroup_7__0
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
    // InternalRangoMode.g:9146:1: rule__GameMode__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9151:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) )
            // InternalRangoMode.g:9152:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            {
            // InternalRangoMode.g:9152:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalRangoMode.g:9153:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9153:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    // InternalRangoMode.g:9154:4: {...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalRangoMode.g:9154:104: ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    // InternalRangoMode.g:9155:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9161:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    // InternalRangoMode.g:9162:6: ( rule__GameMode__Group_7_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_7_0()); 
                    // InternalRangoMode.g:9163:6: ( rule__GameMode__Group_7_0__0 )
                    // InternalRangoMode.g:9163:7: rule__GameMode__Group_7_0__0
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
                    // InternalRangoMode.g:9168:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    {
                    // InternalRangoMode.g:9168:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    // InternalRangoMode.g:9169:4: {...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalRangoMode.g:9169:104: ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    // InternalRangoMode.g:9170:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9176:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    // InternalRangoMode.g:9177:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 
                    // InternalRangoMode.g:9178:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    // InternalRangoMode.g:9178:7: rule__GameMode__SpeedBonusAssignment_7_1
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
    // InternalRangoMode.g:9191:1: rule__GameMode__UnorderedGroup_7__0 : rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? ;
    public final void rule__GameMode__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9195:1: ( rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? )
            // InternalRangoMode.g:9196:2: rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_86);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalRangoMode.g:9197:2: ( rule__GameMode__UnorderedGroup_7__1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRangoMode.g:9197:2: rule__GameMode__UnorderedGroup_7__1
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
    // InternalRangoMode.g:9203:1: rule__GameMode__UnorderedGroup_7__1 : rule__GameMode__UnorderedGroup_7__Impl ;
    public final void rule__GameMode__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9207:1: ( rule__GameMode__UnorderedGroup_7__Impl )
            // InternalRangoMode.g:9208:2: rule__GameMode__UnorderedGroup_7__Impl
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


    // $ANTLR start "rule__Arena__UnorderedGroup_4"
    // InternalRangoMode.g:9215:1: rule__Arena__UnorderedGroup_4 : ( rule__Arena__UnorderedGroup_4__0 )? ;
    public final void rule__Arena__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getArenaAccess().getUnorderedGroup_4());
        	
        try {
            // InternalRangoMode.g:9220:1: ( ( rule__Arena__UnorderedGroup_4__0 )? )
            // InternalRangoMode.g:9221:2: ( rule__Arena__UnorderedGroup_4__0 )?
            {
            // InternalRangoMode.g:9221:2: ( rule__Arena__UnorderedGroup_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt56=1;
            }
            else if ( LA56_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRangoMode.g:9221:2: rule__Arena__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__UnorderedGroup_4__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__UnorderedGroup_4"


    // $ANTLR start "rule__Arena__UnorderedGroup_4__Impl"
    // InternalRangoMode.g:9229:1: rule__Arena__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Arena__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9234:1: ( ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) )
            // InternalRangoMode.g:9235:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9235:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt57=2;
            }
            else if ( LA57_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt57=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalRangoMode.g:9236:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9236:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    // InternalRangoMode.g:9237:4: {...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalRangoMode.g:9237:101: ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    // InternalRangoMode.g:9238:5: ( ( rule__Arena__Group_4_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9244:5: ( ( rule__Arena__Group_4_0__0 ) )
                    // InternalRangoMode.g:9245:6: ( rule__Arena__Group_4_0__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_0()); 
                    // InternalRangoMode.g:9246:6: ( rule__Arena__Group_4_0__0 )
                    // InternalRangoMode.g:9246:7: rule__Arena__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArenaAccess().getGroup_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:9251:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9251:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    // InternalRangoMode.g:9252:4: {...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalRangoMode.g:9252:101: ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    // InternalRangoMode.g:9253:5: ( ( rule__Arena__Group_4_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9259:5: ( ( rule__Arena__Group_4_1__0 ) )
                    // InternalRangoMode.g:9260:6: ( rule__Arena__Group_4_1__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_1()); 
                    // InternalRangoMode.g:9261:6: ( rule__Arena__Group_4_1__0 )
                    // InternalRangoMode.g:9261:7: rule__Arena__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArenaAccess().getGroup_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:9266:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9266:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    // InternalRangoMode.g:9267:4: {...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalRangoMode.g:9267:101: ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    // InternalRangoMode.g:9268:5: ( ( rule__Arena__Group_4_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9274:5: ( ( rule__Arena__Group_4_2__0 ) )
                    // InternalRangoMode.g:9275:6: ( rule__Arena__Group_4_2__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_2()); 
                    // InternalRangoMode.g:9276:6: ( rule__Arena__Group_4_2__0 )
                    // InternalRangoMode.g:9276:7: rule__Arena__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArenaAccess().getGroup_4_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Arena__UnorderedGroup_4__0"
    // InternalRangoMode.g:9289:1: rule__Arena__UnorderedGroup_4__0 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? ;
    public final void rule__Arena__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9293:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? )
            // InternalRangoMode.g:9294:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_87);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9295:2: ( rule__Arena__UnorderedGroup_4__1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt58=1;
            }
            else if ( LA58_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRangoMode.g:9295:2: rule__Arena__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__Arena__UnorderedGroup_4__0"


    // $ANTLR start "rule__Arena__UnorderedGroup_4__1"
    // InternalRangoMode.g:9301:1: rule__Arena__UnorderedGroup_4__1 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? ;
    public final void rule__Arena__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9305:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? )
            // InternalRangoMode.g:9306:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_87);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9307:2: ( rule__Arena__UnorderedGroup_4__2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt59=1;
            }
            else if ( LA59_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRangoMode.g:9307:2: rule__Arena__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arena__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__Arena__UnorderedGroup_4__1"


    // $ANTLR start "rule__Arena__UnorderedGroup_4__2"
    // InternalRangoMode.g:9313:1: rule__Arena__UnorderedGroup_4__2 : rule__Arena__UnorderedGroup_4__Impl ;
    public final void rule__Arena__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9317:1: ( rule__Arena__UnorderedGroup_4__Impl )
            // InternalRangoMode.g:9318:2: rule__Arena__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__UnorderedGroup_4__2"


    // $ANTLR start "rule__Edition__NameAssignment_1"
    // InternalRangoMode.g:9325:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9329:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9330:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9330:2: ( RULE_ID )
            // InternalRangoMode.g:9331:3: RULE_ID
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
    // InternalRangoMode.g:9340:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9344:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9345:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9345:2: ( RULE_STRING )
            // InternalRangoMode.g:9346:3: RULE_STRING
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
    // InternalRangoMode.g:9355:1: rule__Edition__EnemyTypesAssignment_3_0 : ( ruleEnemyType ) ;
    public final void rule__Edition__EnemyTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9359:1: ( ( ruleEnemyType ) )
            // InternalRangoMode.g:9360:2: ( ruleEnemyType )
            {
            // InternalRangoMode.g:9360:2: ( ruleEnemyType )
            // InternalRangoMode.g:9361:3: ruleEnemyType
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
    // InternalRangoMode.g:9370:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9374:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:9375:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:9375:2: ( rulePowerUp )
            // InternalRangoMode.g:9376:3: rulePowerUp
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


    // $ANTLR start "rule__Edition__MaterialsAssignment_3_2"
    // InternalRangoMode.g:9385:1: rule__Edition__MaterialsAssignment_3_2 : ( ruleMaterial ) ;
    public final void rule__Edition__MaterialsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9389:1: ( ( ruleMaterial ) )
            // InternalRangoMode.g:9390:2: ( ruleMaterial )
            {
            // InternalRangoMode.g:9390:2: ( ruleMaterial )
            // InternalRangoMode.g:9391:3: ruleMaterial
            {
             before(grammarAccess.getEditionAccess().getMaterialsMaterialParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getMaterialsMaterialParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__MaterialsAssignment_3_2"


    // $ANTLR start "rule__Edition__PlayersAssignment_3_3"
    // InternalRangoMode.g:9400:1: rule__Edition__PlayersAssignment_3_3 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9404:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9405:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9405:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9406:3: rulePlayerProfile
            {
             before(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerProfile();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__PlayersAssignment_3_3"


    // $ANTLR start "rule__Edition__ModesAssignment_3_5"
    // InternalRangoMode.g:9415:1: rule__Edition__ModesAssignment_3_5 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9419:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9420:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9420:2: ( ruleGameMode )
            // InternalRangoMode.g:9421:3: ruleGameMode
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


    // $ANTLR start "rule__EnemyType__NameAssignment_1"
    // InternalRangoMode.g:9430:1: rule__EnemyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnemyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9434:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9435:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9435:2: ( RULE_ID )
            // InternalRangoMode.g:9436:3: RULE_ID
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
    // InternalRangoMode.g:9445:1: rule__EnemyType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__EnemyType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9449:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9450:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9450:2: ( RULE_STRING )
            // InternalRangoMode.g:9451:3: RULE_STRING
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
    // InternalRangoMode.g:9460:1: rule__EnemyType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9464:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9465:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9465:2: ( ruleDecimal )
            // InternalRangoMode.g:9466:3: ruleDecimal
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
    // InternalRangoMode.g:9475:1: rule__EnemyType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9479:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9480:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9480:2: ( ruleDecimal )
            // InternalRangoMode.g:9481:3: ruleDecimal
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
    // InternalRangoMode.g:9490:1: rule__EnemyType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9494:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9495:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9495:2: ( ruleDecimal )
            // InternalRangoMode.g:9496:3: ruleDecimal
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
    // InternalRangoMode.g:9505:1: rule__EnemyType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__EnemyType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9509:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9510:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9510:2: ( RULE_INT )
            // InternalRangoMode.g:9511:3: RULE_INT
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
    // InternalRangoMode.g:9520:1: rule__EnemyType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__EnemyType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9524:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9525:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9525:2: ( ruleSplitRule )
            // InternalRangoMode.g:9526:3: ruleSplitRule
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
    // InternalRangoMode.g:9535:1: rule__EnemyType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9539:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9540:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9540:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9541:3: rulePlayerEffect
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
    // InternalRangoMode.g:9550:1: rule__EnemyType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9554:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9555:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9555:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9556:3: rulePlayerEffect
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
    // InternalRangoMode.g:9565:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9569:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9570:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9570:2: ( RULE_INT )
            // InternalRangoMode.g:9571:3: RULE_INT
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
    // InternalRangoMode.g:9580:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9584:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9585:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9585:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9586:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9587:3: ( RULE_ID )
            // InternalRangoMode.g:9588:4: RULE_ID
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
    // InternalRangoMode.g:9599:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9603:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9604:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9604:2: ( ruleDecimal )
            // InternalRangoMode.g:9605:3: ruleDecimal
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
    // InternalRangoMode.g:9614:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9618:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9619:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9619:2: ( RULE_INT )
            // InternalRangoMode.g:9620:3: RULE_INT
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
    // InternalRangoMode.g:9629:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9633:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9634:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9634:2: ( RULE_INT )
            // InternalRangoMode.g:9635:3: RULE_INT
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
    // InternalRangoMode.g:9644:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9648:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9649:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9649:2: ( ruleDecimal )
            // InternalRangoMode.g:9650:3: ruleDecimal
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
    // InternalRangoMode.g:9659:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9663:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9664:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9664:2: ( ruleDecimal )
            // InternalRangoMode.g:9665:3: ruleDecimal
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
    // InternalRangoMode.g:9674:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9678:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9679:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9679:2: ( ruleDecimal )
            // InternalRangoMode.g:9680:3: ruleDecimal
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
    // InternalRangoMode.g:9689:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9693:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9694:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9694:2: ( RULE_INT )
            // InternalRangoMode.g:9695:3: RULE_INT
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
    // InternalRangoMode.g:9704:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9708:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9709:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9709:2: ( ruleDecimal )
            // InternalRangoMode.g:9710:3: ruleDecimal
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
    // InternalRangoMode.g:9719:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9723:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9724:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9724:2: ( ruleDecimal )
            // InternalRangoMode.g:9725:3: ruleDecimal
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
    // InternalRangoMode.g:9734:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9738:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9739:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9739:2: ( RULE_ID )
            // InternalRangoMode.g:9740:3: RULE_ID
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
    // InternalRangoMode.g:9749:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9753:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9754:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9754:2: ( RULE_STRING )
            // InternalRangoMode.g:9755:3: RULE_STRING
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
    // InternalRangoMode.g:9764:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9768:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9769:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9769:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9770:3: rulePlayerEffect
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
    // InternalRangoMode.g:9779:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9783:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9784:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9784:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9785:3: rulePlayerEffect
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


    // $ANTLR start "rule__Material__NameAssignment_1"
    // InternalRangoMode.g:9794:1: rule__Material__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Material__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9798:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9799:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9799:2: ( RULE_ID )
            // InternalRangoMode.g:9800:3: RULE_ID
            {
             before(grammarAccess.getMaterialAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__NameAssignment_1"


    // $ANTLR start "rule__Material__BounceAssignment_3_0_1"
    // InternalRangoMode.g:9809:1: rule__Material__BounceAssignment_3_0_1 : ( ruleDecimal ) ;
    public final void rule__Material__BounceAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9813:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9814:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9814:2: ( ruleDecimal )
            // InternalRangoMode.g:9815:3: ruleDecimal
            {
             before(grammarAccess.getMaterialAccess().getBounceDecimalParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getMaterialAccess().getBounceDecimalParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__BounceAssignment_3_0_1"


    // $ANTLR start "rule__Material__SpriteAssignment_3_1_1"
    // InternalRangoMode.g:9824:1: rule__Material__SpriteAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Material__SpriteAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9828:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9829:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9829:2: ( RULE_STRING )
            // InternalRangoMode.g:9830:3: RULE_STRING
            {
             before(grammarAccess.getMaterialAccess().getSpriteSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getSpriteSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__SpriteAssignment_3_1_1"


    // $ANTLR start "rule__PlayerProfile__NameAssignment_1"
    // InternalRangoMode.g:9839:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9843:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9844:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9844:2: ( RULE_ID )
            // InternalRangoMode.g:9845:3: RULE_ID
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
    // InternalRangoMode.g:9854:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9858:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9859:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9859:2: ( RULE_STRING )
            // InternalRangoMode.g:9860:3: RULE_STRING
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
    // InternalRangoMode.g:9869:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9873:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9874:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9874:2: ( RULE_INT )
            // InternalRangoMode.g:9875:3: RULE_INT
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
    // InternalRangoMode.g:9884:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9888:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9889:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9889:2: ( RULE_INT )
            // InternalRangoMode.g:9890:3: RULE_INT
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
    // InternalRangoMode.g:9899:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9903:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9904:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9904:2: ( ruleDecimal )
            // InternalRangoMode.g:9905:3: ruleDecimal
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
    // InternalRangoMode.g:9914:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9918:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9919:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9919:2: ( ruleDecimal )
            // InternalRangoMode.g:9920:3: ruleDecimal
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
    // InternalRangoMode.g:9929:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9933:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9934:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9934:2: ( ruleDecimal )
            // InternalRangoMode.g:9935:3: ruleDecimal
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
    // InternalRangoMode.g:9944:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9948:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9949:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9949:2: ( ruleDecimal )
            // InternalRangoMode.g:9950:3: ruleDecimal
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
    // InternalRangoMode.g:9959:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9963:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9964:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9964:2: ( RULE_ID )
            // InternalRangoMode.g:9965:3: RULE_ID
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
    // InternalRangoMode.g:9974:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9978:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9979:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9979:2: ( RULE_STRING )
            // InternalRangoMode.g:9980:3: RULE_STRING
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
    // InternalRangoMode.g:9989:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9993:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9994:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9994:2: ( RULE_STRING )
            // InternalRangoMode.g:9995:3: RULE_STRING
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
    // InternalRangoMode.g:10004:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10008:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10009:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10009:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10010:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:10011:3: ( RULE_ID )
            // InternalRangoMode.g:10012:4: RULE_ID
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
    // InternalRangoMode.g:10023:1: rule__GameMode__GravityAssignment_7_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10027:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10028:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10028:2: ( ruleDecimal )
            // InternalRangoMode.g:10029:3: ruleDecimal
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
    // InternalRangoMode.g:10038:1: rule__GameMode__SpeedBonusAssignment_7_1 : ( ruleSpeedBonus ) ;
    public final void rule__GameMode__SpeedBonusAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10042:1: ( ( ruleSpeedBonus ) )
            // InternalRangoMode.g:10043:2: ( ruleSpeedBonus )
            {
            // InternalRangoMode.g:10043:2: ( ruleSpeedBonus )
            // InternalRangoMode.g:10044:3: ruleSpeedBonus
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


    // $ANTLR start "rule__GameMode__ArenaAssignment_8"
    // InternalRangoMode.g:10053:1: rule__GameMode__ArenaAssignment_8 : ( ruleArena ) ;
    public final void rule__GameMode__ArenaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10057:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10058:2: ( ruleArena )
            {
            // InternalRangoMode.g:10058:2: ( ruleArena )
            // InternalRangoMode.g:10059:3: ruleArena
            {
             before(grammarAccess.getGameModeAccess().getArenaArenaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getArenaArenaParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__ArenaAssignment_8"


    // $ANTLR start "rule__GameMode__SpawningAssignment_9"
    // InternalRangoMode.g:10068:1: rule__GameMode__SpawningAssignment_9 : ( ruleSpawnStrategy ) ;
    public final void rule__GameMode__SpawningAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10072:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10073:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10073:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10074:3: ruleSpawnStrategy
            {
             before(grammarAccess.getGameModeAccess().getSpawningSpawnStrategyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSpawnStrategy();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getSpawningSpawnStrategyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__SpawningAssignment_9"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_11_2"
    // InternalRangoMode.g:10083:1: rule__GameMode__WinConditionsAssignment_11_2 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10087:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10088:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10088:2: ( ruleEndCondition )
            // InternalRangoMode.g:10089:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_11_2"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_11_3_1"
    // InternalRangoMode.g:10098:1: rule__GameMode__WinConditionsAssignment_11_3_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10102:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10103:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10103:2: ( ruleEndCondition )
            // InternalRangoMode.g:10104:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_11_3_1"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_14"
    // InternalRangoMode.g:10113:1: rule__GameMode__LoseConditionsAssignment_14 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10117:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10118:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10118:2: ( ruleEndCondition )
            // InternalRangoMode.g:10119:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_14"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_15_1"
    // InternalRangoMode.g:10128:1: rule__GameMode__LoseConditionsAssignment_15_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10132:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10133:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10133:2: ( ruleEndCondition )
            // InternalRangoMode.g:10134:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_15_1"


    // $ANTLR start "rule__SpeedBonus__MaxFactorAssignment_3_2"
    // InternalRangoMode.g:10143:1: rule__SpeedBonus__MaxFactorAssignment_3_2 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__MaxFactorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10147:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10148:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10148:2: ( ruleDecimal )
            // InternalRangoMode.g:10149:3: ruleDecimal
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
    // InternalRangoMode.g:10158:1: rule__SpeedBonus__DurationAssignment_4_1 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10162:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10163:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10163:2: ( ruleDecimal )
            // InternalRangoMode.g:10164:3: ruleDecimal
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
    // InternalRangoMode.g:10173:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10177:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10178:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10178:2: ( RULE_STRING )
            // InternalRangoMode.g:10179:3: RULE_STRING
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


    // $ANTLR start "rule__Arena__FloorAssignment_4_0_1"
    // InternalRangoMode.g:10188:1: rule__Arena__FloorAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__FloorAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10192:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10193:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10193:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10194:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getFloorMaterialCrossReference_4_0_1_0()); 
            // InternalRangoMode.g:10195:3: ( RULE_ID )
            // InternalRangoMode.g:10196:4: RULE_ID
            {
             before(grammarAccess.getArenaAccess().getFloorMaterialIDTerminalRuleCall_4_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getFloorMaterialIDTerminalRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getArenaAccess().getFloorMaterialCrossReference_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__FloorAssignment_4_0_1"


    // $ANTLR start "rule__Arena__WallsAssignment_4_1_1"
    // InternalRangoMode.g:10207:1: rule__Arena__WallsAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__WallsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10211:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10212:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10212:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10213:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getWallsMaterialCrossReference_4_1_1_0()); 
            // InternalRangoMode.g:10214:3: ( RULE_ID )
            // InternalRangoMode.g:10215:4: RULE_ID
            {
             before(grammarAccess.getArenaAccess().getWallsMaterialIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getWallsMaterialIDTerminalRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getArenaAccess().getWallsMaterialCrossReference_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__WallsAssignment_4_1_1"


    // $ANTLR start "rule__Arena__PlayerStartAssignment_4_2_3"
    // InternalRangoMode.g:10226:1: rule__Arena__PlayerStartAssignment_4_2_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10230:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10231:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10231:2: ( ruleDecimal )
            // InternalRangoMode.g:10232:3: ruleDecimal
            {
             before(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__PlayerStartAssignment_4_2_3"


    // $ANTLR start "rule__Arena__ObstaclesAssignment_5"
    // InternalRangoMode.g:10241:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10245:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:10246:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:10246:2: ( ruleObstacle )
            // InternalRangoMode.g:10247:3: ruleObstacle
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
    // InternalRangoMode.g:10256:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10260:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10261:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10261:2: ( ruleDecimal )
            // InternalRangoMode.g:10262:3: ruleDecimal
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
    // InternalRangoMode.g:10271:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10275:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10276:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10276:2: ( ruleDecimal )
            // InternalRangoMode.g:10277:3: ruleDecimal
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
    // InternalRangoMode.g:10286:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10290:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10291:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10291:2: ( RULE_ID )
            // InternalRangoMode.g:10292:3: RULE_ID
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
    // InternalRangoMode.g:10301:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10305:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10306:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10306:2: ( RULE_INT )
            // InternalRangoMode.g:10307:3: RULE_INT
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
    // InternalRangoMode.g:10316:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10320:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10321:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10321:2: ( RULE_INT )
            // InternalRangoMode.g:10322:3: RULE_INT
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


    // $ANTLR start "rule__Block__MaterialAssignment_7_1"
    // InternalRangoMode.g:10331:1: rule__Block__MaterialAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Block__MaterialAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10335:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10336:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10336:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10337:3: ( RULE_ID )
            {
             before(grammarAccess.getBlockAccess().getMaterialMaterialCrossReference_7_1_0()); 
            // InternalRangoMode.g:10338:3: ( RULE_ID )
            // InternalRangoMode.g:10339:4: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getMaterialMaterialIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getMaterialMaterialIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBlockAccess().getMaterialMaterialCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__MaterialAssignment_7_1"


    // $ANTLR start "rule__JumpPad__NameAssignment_1"
    // InternalRangoMode.g:10350:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10354:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10355:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10355:2: ( RULE_ID )
            // InternalRangoMode.g:10356:3: RULE_ID
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
    // InternalRangoMode.g:10365:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10369:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10370:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10370:2: ( ruleDecimal )
            // InternalRangoMode.g:10371:3: ruleDecimal
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
    // InternalRangoMode.g:10380:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10384:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10385:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10385:2: ( ruleTarget )
            // InternalRangoMode.g:10386:3: ruleTarget
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
    // InternalRangoMode.g:10395:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10399:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10400:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10400:2: ( RULE_ID )
            // InternalRangoMode.g:10401:3: RULE_ID
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
    // InternalRangoMode.g:10410:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10414:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10415:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10415:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10416:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:10417:3: ( RULE_ID )
            // InternalRangoMode.g:10418:4: RULE_ID
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
    // InternalRangoMode.g:10429:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10433:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10434:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10434:2: ( ruleTarget )
            // InternalRangoMode.g:10435:3: ruleTarget
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
    // InternalRangoMode.g:10444:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleEnemySpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10448:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10449:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10449:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10450:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10459:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10463:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10464:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10464:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10465:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10466:3: ( 'looping' )
            // InternalRangoMode.g:10467:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,98,FOLLOW_2); 
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
    // InternalRangoMode.g:10478:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10482:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10483:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10483:2: ( RULE_INT )
            // InternalRangoMode.g:10484:3: RULE_INT
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
    // InternalRangoMode.g:10493:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10497:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10498:2: ( ruleWave )
            {
            // InternalRangoMode.g:10498:2: ( ruleWave )
            // InternalRangoMode.g:10499:3: ruleWave
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
    // InternalRangoMode.g:10508:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10512:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10513:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10513:2: ( ruleDecimal )
            // InternalRangoMode.g:10514:3: ruleDecimal
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
    // InternalRangoMode.g:10523:1: rule__Wave__SpawnsAssignment_3 : ( ruleEnemySpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10527:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10528:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10528:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10529:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10538:1: rule__EnemySpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10542:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10543:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10543:2: ( RULE_INT )
            // InternalRangoMode.g:10544:3: RULE_INT
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
    // InternalRangoMode.g:10553:1: rule__EnemySpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnemySpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10557:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10558:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10558:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10559:3: ( RULE_ID )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10560:3: ( RULE_ID )
            // InternalRangoMode.g:10561:4: RULE_ID
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
    // InternalRangoMode.g:10572:1: rule__EnemySpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10576:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10577:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10577:2: ( RULE_INT )
            // InternalRangoMode.g:10578:3: RULE_INT
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
    // InternalRangoMode.g:10587:1: rule__EnemySpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__EnemySpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10591:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10592:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10592:2: ( ruleDirection )
            // InternalRangoMode.g:10593:3: ruleDirection
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
    // InternalRangoMode.g:10602:1: rule__Drops__DropsAssignment_2 : ( ruleDropTable ) ;
    public final void rule__Drops__DropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10606:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10607:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10607:2: ( ruleDropTable )
            // InternalRangoMode.g:10608:3: ruleDropTable
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
    // InternalRangoMode.g:10617:1: rule__DropTable__EnemyTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DropTable__EnemyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10621:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10622:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10622:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10623:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 
            // InternalRangoMode.g:10624:3: ( RULE_ID )
            // InternalRangoMode.g:10625:4: RULE_ID
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
    // InternalRangoMode.g:10636:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10640:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10641:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10641:2: ( ruleDecimal )
            // InternalRangoMode.g:10642:3: ruleDecimal
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
    // InternalRangoMode.g:10651:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10655:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10656:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10656:2: ( ruleDrop )
            // InternalRangoMode.g:10657:3: ruleDrop
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
    // InternalRangoMode.g:10666:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10670:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10671:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10671:2: ( ruleDrop )
            // InternalRangoMode.g:10672:3: ruleDrop
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
    // InternalRangoMode.g:10681:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10685:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10686:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10686:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10687:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:10688:3: ( RULE_ID )
            // InternalRangoMode.g:10689:4: RULE_ID
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
    // InternalRangoMode.g:10700:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10704:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10705:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10705:2: ( RULE_INT )
            // InternalRangoMode.g:10706:3: RULE_INT
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
    // InternalRangoMode.g:10715:1: rule__TimeReached__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeReached__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10719:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10720:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10720:2: ( ruleDecimal )
            // InternalRangoMode.g:10721:3: ruleDecimal
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
    // InternalRangoMode.g:10730:1: rule__ScoreReached__PointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ScoreReached__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10734:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10735:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10735:2: ( RULE_INT )
            // InternalRangoMode.g:10736:3: RULE_INT
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
    // InternalRangoMode.g:10745:1: rule__EnemiesPopped__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesPopped__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10749:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10750:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10750:2: ( RULE_INT )
            // InternalRangoMode.g:10751:3: RULE_INT
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
    // InternalRangoMode.g:10760:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10764:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10765:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10765:2: ( RULE_INT )
            // InternalRangoMode.g:10766:3: RULE_INT
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
    // InternalRangoMode.g:10775:1: rule__EnemiesAlive__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesAlive__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10779:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10780:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10780:2: ( RULE_INT )
            // InternalRangoMode.g:10781:3: RULE_INT
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\14\2\uffff\1\135\2\uffff";
    static final String dfa_3s = "\1\134\3\uffff\1\121\2\uffff\1\140\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\1\uffff\1\4\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\52\uffff\1\5\50\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\104\uffff\1\6",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1196:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010280000022040L,0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010280000022002L,0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000023808000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000EC00008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0220000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000010L,0x0000000015000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002000L,0x000000000000000CL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000800000L,0x0000000000009100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000009100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000040000L,0x0000000400000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x000EC00008000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0100000008000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000002002L,0x000000000000000CL});

}
