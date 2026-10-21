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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'everything'", "'enemies'", "'player'", "'left'", "'right'", "'edition'", "'enemy'", "'{'", "'on'", "'pop'", "':'", "'contact'", "'}'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'material'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'lose'", "'when'", "'description'", "'gravity'", "'win'", "'or'", "'level'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'floor'", "'walls'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'of'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'looping'"
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


    // $ANTLR start "entryRuleSingleLevel"
    // InternalRangoMode.g:428:1: entryRuleSingleLevel : ruleSingleLevel EOF ;
    public final void entryRuleSingleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:429:1: ( ruleSingleLevel EOF )
            // InternalRangoMode.g:430:1: ruleSingleLevel EOF
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
    // InternalRangoMode.g:437:1: ruleSingleLevel : ( ( rule__SingleLevel__Group__0 ) ) ;
    public final void ruleSingleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:441:2: ( ( ( rule__SingleLevel__Group__0 ) ) )
            // InternalRangoMode.g:442:2: ( ( rule__SingleLevel__Group__0 ) )
            {
            // InternalRangoMode.g:442:2: ( ( rule__SingleLevel__Group__0 ) )
            // InternalRangoMode.g:443:3: ( rule__SingleLevel__Group__0 )
            {
             before(grammarAccess.getSingleLevelAccess().getGroup()); 
            // InternalRangoMode.g:444:3: ( rule__SingleLevel__Group__0 )
            // InternalRangoMode.g:444:4: rule__SingleLevel__Group__0
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
    // InternalRangoMode.g:453:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:454:1: ( ruleLevel EOF )
            // InternalRangoMode.g:455:1: ruleLevel EOF
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
    // InternalRangoMode.g:462:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:466:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalRangoMode.g:467:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalRangoMode.g:467:2: ( ( rule__Level__Group__0 ) )
            // InternalRangoMode.g:468:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalRangoMode.g:469:3: ( rule__Level__Group__0 )
            // InternalRangoMode.g:469:4: rule__Level__Group__0
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
    // InternalRangoMode.g:478:1: entryRuleSpeedBonus : ruleSpeedBonus EOF ;
    public final void entryRuleSpeedBonus() throws RecognitionException {
        try {
            // InternalRangoMode.g:479:1: ( ruleSpeedBonus EOF )
            // InternalRangoMode.g:480:1: ruleSpeedBonus EOF
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
    // InternalRangoMode.g:487:1: ruleSpeedBonus : ( ( rule__SpeedBonus__Group__0 ) ) ;
    public final void ruleSpeedBonus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:491:2: ( ( ( rule__SpeedBonus__Group__0 ) ) )
            // InternalRangoMode.g:492:2: ( ( rule__SpeedBonus__Group__0 ) )
            {
            // InternalRangoMode.g:492:2: ( ( rule__SpeedBonus__Group__0 ) )
            // InternalRangoMode.g:493:3: ( rule__SpeedBonus__Group__0 )
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup()); 
            // InternalRangoMode.g:494:3: ( rule__SpeedBonus__Group__0 )
            // InternalRangoMode.g:494:4: rule__SpeedBonus__Group__0
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
    // InternalRangoMode.g:503:1: entryRuleArena : ruleArena EOF ;
    public final void entryRuleArena() throws RecognitionException {
        try {
            // InternalRangoMode.g:504:1: ( ruleArena EOF )
            // InternalRangoMode.g:505:1: ruleArena EOF
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
    // InternalRangoMode.g:512:1: ruleArena : ( ( rule__Arena__Group__0 ) ) ;
    public final void ruleArena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:516:2: ( ( ( rule__Arena__Group__0 ) ) )
            // InternalRangoMode.g:517:2: ( ( rule__Arena__Group__0 ) )
            {
            // InternalRangoMode.g:517:2: ( ( rule__Arena__Group__0 ) )
            // InternalRangoMode.g:518:3: ( rule__Arena__Group__0 )
            {
             before(grammarAccess.getArenaAccess().getGroup()); 
            // InternalRangoMode.g:519:3: ( rule__Arena__Group__0 )
            // InternalRangoMode.g:519:4: rule__Arena__Group__0
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
    // InternalRangoMode.g:529:1: ruleAt : ( ( rule__At__Group__0 ) ) ;
    public final void ruleAt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:533:2: ( ( ( rule__At__Group__0 ) ) )
            // InternalRangoMode.g:534:2: ( ( rule__At__Group__0 ) )
            {
            // InternalRangoMode.g:534:2: ( ( rule__At__Group__0 ) )
            // InternalRangoMode.g:535:3: ( rule__At__Group__0 )
            {
             before(grammarAccess.getAtAccess().getGroup()); 
            // InternalRangoMode.g:536:3: ( rule__At__Group__0 )
            // InternalRangoMode.g:536:4: rule__At__Group__0
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
    // InternalRangoMode.g:545:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalRangoMode.g:546:1: ( ruleObstacle EOF )
            // InternalRangoMode.g:547:1: ruleObstacle EOF
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
    // InternalRangoMode.g:554:1: ruleObstacle : ( ( rule__Obstacle__Alternatives ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:558:2: ( ( ( rule__Obstacle__Alternatives ) ) )
            // InternalRangoMode.g:559:2: ( ( rule__Obstacle__Alternatives ) )
            {
            // InternalRangoMode.g:559:2: ( ( rule__Obstacle__Alternatives ) )
            // InternalRangoMode.g:560:3: ( rule__Obstacle__Alternatives )
            {
             before(grammarAccess.getObstacleAccess().getAlternatives()); 
            // InternalRangoMode.g:561:3: ( rule__Obstacle__Alternatives )
            // InternalRangoMode.g:561:4: rule__Obstacle__Alternatives
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
    // InternalRangoMode.g:570:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRangoMode.g:571:1: ( ruleBlock EOF )
            // InternalRangoMode.g:572:1: ruleBlock EOF
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
    // InternalRangoMode.g:579:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:583:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRangoMode.g:584:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRangoMode.g:584:2: ( ( rule__Block__Group__0 ) )
            // InternalRangoMode.g:585:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRangoMode.g:586:3: ( rule__Block__Group__0 )
            // InternalRangoMode.g:586:4: rule__Block__Group__0
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
    // InternalRangoMode.g:595:1: entryRuleJumpPad : ruleJumpPad EOF ;
    public final void entryRuleJumpPad() throws RecognitionException {
        try {
            // InternalRangoMode.g:596:1: ( ruleJumpPad EOF )
            // InternalRangoMode.g:597:1: ruleJumpPad EOF
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
    // InternalRangoMode.g:604:1: ruleJumpPad : ( ( rule__JumpPad__Group__0 ) ) ;
    public final void ruleJumpPad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:608:2: ( ( ( rule__JumpPad__Group__0 ) ) )
            // InternalRangoMode.g:609:2: ( ( rule__JumpPad__Group__0 ) )
            {
            // InternalRangoMode.g:609:2: ( ( rule__JumpPad__Group__0 ) )
            // InternalRangoMode.g:610:3: ( rule__JumpPad__Group__0 )
            {
             before(grammarAccess.getJumpPadAccess().getGroup()); 
            // InternalRangoMode.g:611:3: ( rule__JumpPad__Group__0 )
            // InternalRangoMode.g:611:4: rule__JumpPad__Group__0
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
    // InternalRangoMode.g:620:1: entryRuleTeleporter : ruleTeleporter EOF ;
    public final void entryRuleTeleporter() throws RecognitionException {
        try {
            // InternalRangoMode.g:621:1: ( ruleTeleporter EOF )
            // InternalRangoMode.g:622:1: ruleTeleporter EOF
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
    // InternalRangoMode.g:629:1: ruleTeleporter : ( ( rule__Teleporter__Group__0 ) ) ;
    public final void ruleTeleporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:633:2: ( ( ( rule__Teleporter__Group__0 ) ) )
            // InternalRangoMode.g:634:2: ( ( rule__Teleporter__Group__0 ) )
            {
            // InternalRangoMode.g:634:2: ( ( rule__Teleporter__Group__0 ) )
            // InternalRangoMode.g:635:3: ( rule__Teleporter__Group__0 )
            {
             before(grammarAccess.getTeleporterAccess().getGroup()); 
            // InternalRangoMode.g:636:3: ( rule__Teleporter__Group__0 )
            // InternalRangoMode.g:636:4: rule__Teleporter__Group__0
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
    // InternalRangoMode.g:645:1: entryRuleSpawnStrategy : ruleSpawnStrategy EOF ;
    public final void entryRuleSpawnStrategy() throws RecognitionException {
        try {
            // InternalRangoMode.g:646:1: ( ruleSpawnStrategy EOF )
            // InternalRangoMode.g:647:1: ruleSpawnStrategy EOF
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
    // InternalRangoMode.g:654:1: ruleSpawnStrategy : ( ( rule__SpawnStrategy__Alternatives ) ) ;
    public final void ruleSpawnStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:658:2: ( ( ( rule__SpawnStrategy__Alternatives ) ) )
            // InternalRangoMode.g:659:2: ( ( rule__SpawnStrategy__Alternatives ) )
            {
            // InternalRangoMode.g:659:2: ( ( rule__SpawnStrategy__Alternatives ) )
            // InternalRangoMode.g:660:3: ( rule__SpawnStrategy__Alternatives )
            {
             before(grammarAccess.getSpawnStrategyAccess().getAlternatives()); 
            // InternalRangoMode.g:661:3: ( rule__SpawnStrategy__Alternatives )
            // InternalRangoMode.g:661:4: rule__SpawnStrategy__Alternatives
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
    // InternalRangoMode.g:670:1: entryRuleFixedLayout : ruleFixedLayout EOF ;
    public final void entryRuleFixedLayout() throws RecognitionException {
        try {
            // InternalRangoMode.g:671:1: ( ruleFixedLayout EOF )
            // InternalRangoMode.g:672:1: ruleFixedLayout EOF
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
    // InternalRangoMode.g:679:1: ruleFixedLayout : ( ( rule__FixedLayout__Group__0 ) ) ;
    public final void ruleFixedLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:683:2: ( ( ( rule__FixedLayout__Group__0 ) ) )
            // InternalRangoMode.g:684:2: ( ( rule__FixedLayout__Group__0 ) )
            {
            // InternalRangoMode.g:684:2: ( ( rule__FixedLayout__Group__0 ) )
            // InternalRangoMode.g:685:3: ( rule__FixedLayout__Group__0 )
            {
             before(grammarAccess.getFixedLayoutAccess().getGroup()); 
            // InternalRangoMode.g:686:3: ( rule__FixedLayout__Group__0 )
            // InternalRangoMode.g:686:4: rule__FixedLayout__Group__0
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
    // InternalRangoMode.g:695:1: entryRuleWaveSchedule : ruleWaveSchedule EOF ;
    public final void entryRuleWaveSchedule() throws RecognitionException {
        try {
            // InternalRangoMode.g:696:1: ( ruleWaveSchedule EOF )
            // InternalRangoMode.g:697:1: ruleWaveSchedule EOF
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
    // InternalRangoMode.g:704:1: ruleWaveSchedule : ( ( rule__WaveSchedule__Group__0 ) ) ;
    public final void ruleWaveSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:708:2: ( ( ( rule__WaveSchedule__Group__0 ) ) )
            // InternalRangoMode.g:709:2: ( ( rule__WaveSchedule__Group__0 ) )
            {
            // InternalRangoMode.g:709:2: ( ( rule__WaveSchedule__Group__0 ) )
            // InternalRangoMode.g:710:3: ( rule__WaveSchedule__Group__0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup()); 
            // InternalRangoMode.g:711:3: ( rule__WaveSchedule__Group__0 )
            // InternalRangoMode.g:711:4: rule__WaveSchedule__Group__0
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
    // InternalRangoMode.g:720:1: entryRuleWave : ruleWave EOF ;
    public final void entryRuleWave() throws RecognitionException {
        try {
            // InternalRangoMode.g:721:1: ( ruleWave EOF )
            // InternalRangoMode.g:722:1: ruleWave EOF
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
    // InternalRangoMode.g:729:1: ruleWave : ( ( rule__Wave__Group__0 ) ) ;
    public final void ruleWave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:733:2: ( ( ( rule__Wave__Group__0 ) ) )
            // InternalRangoMode.g:734:2: ( ( rule__Wave__Group__0 ) )
            {
            // InternalRangoMode.g:734:2: ( ( rule__Wave__Group__0 ) )
            // InternalRangoMode.g:735:3: ( rule__Wave__Group__0 )
            {
             before(grammarAccess.getWaveAccess().getGroup()); 
            // InternalRangoMode.g:736:3: ( rule__Wave__Group__0 )
            // InternalRangoMode.g:736:4: rule__Wave__Group__0
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
    // InternalRangoMode.g:745:1: entryRuleEnemySpawn : ruleEnemySpawn EOF ;
    public final void entryRuleEnemySpawn() throws RecognitionException {
        try {
            // InternalRangoMode.g:746:1: ( ruleEnemySpawn EOF )
            // InternalRangoMode.g:747:1: ruleEnemySpawn EOF
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
    // InternalRangoMode.g:754:1: ruleEnemySpawn : ( ( rule__EnemySpawn__Group__0 ) ) ;
    public final void ruleEnemySpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:758:2: ( ( ( rule__EnemySpawn__Group__0 ) ) )
            // InternalRangoMode.g:759:2: ( ( rule__EnemySpawn__Group__0 ) )
            {
            // InternalRangoMode.g:759:2: ( ( rule__EnemySpawn__Group__0 ) )
            // InternalRangoMode.g:760:3: ( rule__EnemySpawn__Group__0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup()); 
            // InternalRangoMode.g:761:3: ( rule__EnemySpawn__Group__0 )
            // InternalRangoMode.g:761:4: rule__EnemySpawn__Group__0
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
    // InternalRangoMode.g:771:1: ruleDrops : ( ( rule__Drops__Group__0 ) ) ;
    public final void ruleDrops() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:775:2: ( ( ( rule__Drops__Group__0 ) ) )
            // InternalRangoMode.g:776:2: ( ( rule__Drops__Group__0 ) )
            {
            // InternalRangoMode.g:776:2: ( ( rule__Drops__Group__0 ) )
            // InternalRangoMode.g:777:3: ( rule__Drops__Group__0 )
            {
             before(grammarAccess.getDropsAccess().getGroup()); 
            // InternalRangoMode.g:778:3: ( rule__Drops__Group__0 )
            // InternalRangoMode.g:778:4: rule__Drops__Group__0
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
    // InternalRangoMode.g:787:1: entryRuleDropTable : ruleDropTable EOF ;
    public final void entryRuleDropTable() throws RecognitionException {
        try {
            // InternalRangoMode.g:788:1: ( ruleDropTable EOF )
            // InternalRangoMode.g:789:1: ruleDropTable EOF
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
    // InternalRangoMode.g:796:1: ruleDropTable : ( ( rule__DropTable__Group__0 ) ) ;
    public final void ruleDropTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:800:2: ( ( ( rule__DropTable__Group__0 ) ) )
            // InternalRangoMode.g:801:2: ( ( rule__DropTable__Group__0 ) )
            {
            // InternalRangoMode.g:801:2: ( ( rule__DropTable__Group__0 ) )
            // InternalRangoMode.g:802:3: ( rule__DropTable__Group__0 )
            {
             before(grammarAccess.getDropTableAccess().getGroup()); 
            // InternalRangoMode.g:803:3: ( rule__DropTable__Group__0 )
            // InternalRangoMode.g:803:4: rule__DropTable__Group__0
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
    // InternalRangoMode.g:812:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalRangoMode.g:813:1: ( ruleDrop EOF )
            // InternalRangoMode.g:814:1: ruleDrop EOF
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
    // InternalRangoMode.g:821:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:825:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalRangoMode.g:826:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalRangoMode.g:826:2: ( ( rule__Drop__Group__0 ) )
            // InternalRangoMode.g:827:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalRangoMode.g:828:3: ( rule__Drop__Group__0 )
            // InternalRangoMode.g:828:4: rule__Drop__Group__0
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
    // InternalRangoMode.g:837:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:838:1: ( ruleEndCondition EOF )
            // InternalRangoMode.g:839:1: ruleEndCondition EOF
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
    // InternalRangoMode.g:846:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:850:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalRangoMode.g:851:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalRangoMode.g:851:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalRangoMode.g:852:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:853:3: ( rule__EndCondition__Alternatives )
            // InternalRangoMode.g:853:4: rule__EndCondition__Alternatives
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
    // InternalRangoMode.g:862:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:863:1: ( ruleCleared EOF )
            // InternalRangoMode.g:864:1: ruleCleared EOF
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
    // InternalRangoMode.g:871:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:875:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:876:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:876:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:877:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:878:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:878:4: rule__Cleared__Group__0
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
    // InternalRangoMode.g:887:1: entryRuleTimeReached : ruleTimeReached EOF ;
    public final void entryRuleTimeReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:888:1: ( ruleTimeReached EOF )
            // InternalRangoMode.g:889:1: ruleTimeReached EOF
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
    // InternalRangoMode.g:896:1: ruleTimeReached : ( ( rule__TimeReached__Group__0 ) ) ;
    public final void ruleTimeReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:900:2: ( ( ( rule__TimeReached__Group__0 ) ) )
            // InternalRangoMode.g:901:2: ( ( rule__TimeReached__Group__0 ) )
            {
            // InternalRangoMode.g:901:2: ( ( rule__TimeReached__Group__0 ) )
            // InternalRangoMode.g:902:3: ( rule__TimeReached__Group__0 )
            {
             before(grammarAccess.getTimeReachedAccess().getGroup()); 
            // InternalRangoMode.g:903:3: ( rule__TimeReached__Group__0 )
            // InternalRangoMode.g:903:4: rule__TimeReached__Group__0
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
    // InternalRangoMode.g:912:1: entryRuleScoreReached : ruleScoreReached EOF ;
    public final void entryRuleScoreReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:913:1: ( ruleScoreReached EOF )
            // InternalRangoMode.g:914:1: ruleScoreReached EOF
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
    // InternalRangoMode.g:921:1: ruleScoreReached : ( ( rule__ScoreReached__Group__0 ) ) ;
    public final void ruleScoreReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:925:2: ( ( ( rule__ScoreReached__Group__0 ) ) )
            // InternalRangoMode.g:926:2: ( ( rule__ScoreReached__Group__0 ) )
            {
            // InternalRangoMode.g:926:2: ( ( rule__ScoreReached__Group__0 ) )
            // InternalRangoMode.g:927:3: ( rule__ScoreReached__Group__0 )
            {
             before(grammarAccess.getScoreReachedAccess().getGroup()); 
            // InternalRangoMode.g:928:3: ( rule__ScoreReached__Group__0 )
            // InternalRangoMode.g:928:4: rule__ScoreReached__Group__0
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
    // InternalRangoMode.g:937:1: entryRuleEnemiesPopped : ruleEnemiesPopped EOF ;
    public final void entryRuleEnemiesPopped() throws RecognitionException {
        try {
            // InternalRangoMode.g:938:1: ( ruleEnemiesPopped EOF )
            // InternalRangoMode.g:939:1: ruleEnemiesPopped EOF
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
    // InternalRangoMode.g:946:1: ruleEnemiesPopped : ( ( rule__EnemiesPopped__Group__0 ) ) ;
    public final void ruleEnemiesPopped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:950:2: ( ( ( rule__EnemiesPopped__Group__0 ) ) )
            // InternalRangoMode.g:951:2: ( ( rule__EnemiesPopped__Group__0 ) )
            {
            // InternalRangoMode.g:951:2: ( ( rule__EnemiesPopped__Group__0 ) )
            // InternalRangoMode.g:952:3: ( rule__EnemiesPopped__Group__0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getGroup()); 
            // InternalRangoMode.g:953:3: ( rule__EnemiesPopped__Group__0 )
            // InternalRangoMode.g:953:4: rule__EnemiesPopped__Group__0
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
    // InternalRangoMode.g:962:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:963:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:964:1: ruleWavesSurvived EOF
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
    // InternalRangoMode.g:971:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:975:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:976:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:976:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:977:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:978:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:978:4: rule__WavesSurvived__Group__0
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
    // InternalRangoMode.g:987:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:988:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:989:1: ruleHealthDepleted EOF
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
    // InternalRangoMode.g:996:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1000:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:1001:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:1001:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:1002:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:1003:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:1003:4: rule__HealthDepleted__Group__0
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
    // InternalRangoMode.g:1012:1: entryRuleEnemiesAlive : ruleEnemiesAlive EOF ;
    public final void entryRuleEnemiesAlive() throws RecognitionException {
        try {
            // InternalRangoMode.g:1013:1: ( ruleEnemiesAlive EOF )
            // InternalRangoMode.g:1014:1: ruleEnemiesAlive EOF
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
    // InternalRangoMode.g:1021:1: ruleEnemiesAlive : ( ( rule__EnemiesAlive__Group__0 ) ) ;
    public final void ruleEnemiesAlive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1025:2: ( ( ( rule__EnemiesAlive__Group__0 ) ) )
            // InternalRangoMode.g:1026:2: ( ( rule__EnemiesAlive__Group__0 ) )
            {
            // InternalRangoMode.g:1026:2: ( ( rule__EnemiesAlive__Group__0 ) )
            // InternalRangoMode.g:1027:3: ( rule__EnemiesAlive__Group__0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getGroup()); 
            // InternalRangoMode.g:1028:3: ( rule__EnemiesAlive__Group__0 )
            // InternalRangoMode.g:1028:4: rule__EnemiesAlive__Group__0
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
    // InternalRangoMode.g:1037:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:1038:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:1039:1: ruleDecimal EOF
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
    // InternalRangoMode.g:1046:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1050:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:1051:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:1051:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:1052:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:1053:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:1053:4: rule__Decimal__Group__0
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
    // InternalRangoMode.g:1062:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1066:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1067:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1067:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1068:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1069:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1069:4: rule__Target__Alternatives
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
    // InternalRangoMode.g:1078:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1082:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1083:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1083:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1084:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1085:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1085:4: rule__Direction__Alternatives
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
    // InternalRangoMode.g:1093:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1097:1: ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_5 ) ) )
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
            case 87:
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
                    // InternalRangoMode.g:1098:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1098:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1099:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1100:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    // InternalRangoMode.g:1100:4: rule__Edition__EnemyTypesAssignment_3_0
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
                    // InternalRangoMode.g:1104:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1104:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1105:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1106:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1106:4: rule__Edition__PowerUpsAssignment_3_1
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
                    // InternalRangoMode.g:1110:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1110:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    // InternalRangoMode.g:1111:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getMaterialsAssignment_3_2()); 
                    // InternalRangoMode.g:1112:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    // InternalRangoMode.g:1112:4: rule__Edition__MaterialsAssignment_3_2
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
                    // InternalRangoMode.g:1116:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    {
                    // InternalRangoMode.g:1116:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    // InternalRangoMode.g:1117:3: ( rule__Edition__PlayersAssignment_3_3 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_3()); 
                    // InternalRangoMode.g:1118:3: ( rule__Edition__PlayersAssignment_3_3 )
                    // InternalRangoMode.g:1118:4: rule__Edition__PlayersAssignment_3_3
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
                    // InternalRangoMode.g:1122:2: ( ruleDrops )
                    {
                    // InternalRangoMode.g:1122:2: ( ruleDrops )
                    // InternalRangoMode.g:1123:3: ruleDrops
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
                    // InternalRangoMode.g:1128:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    {
                    // InternalRangoMode.g:1128:2: ( ( rule__Edition__ModesAssignment_3_5 ) )
                    // InternalRangoMode.g:1129:3: ( rule__Edition__ModesAssignment_3_5 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_5()); 
                    // InternalRangoMode.g:1130:3: ( rule__Edition__ModesAssignment_3_5 )
                    // InternalRangoMode.g:1130:4: rule__Edition__ModesAssignment_3_5
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
    // InternalRangoMode.g:1138:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1142:1: ( ( ruleVanish ) | ( ruleSplit ) )
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
                    // InternalRangoMode.g:1143:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1143:2: ( ruleVanish )
                    // InternalRangoMode.g:1144:3: ruleVanish
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
                    // InternalRangoMode.g:1149:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1149:2: ( ruleSplit )
                    // InternalRangoMode.g:1150:3: ruleSplit
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
    // InternalRangoMode.g:1159:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1163:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
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
                    // InternalRangoMode.g:1164:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1164:2: ( ruleDamage )
                    // InternalRangoMode.g:1165:3: ruleDamage
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
                    // InternalRangoMode.g:1170:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1170:2: ( ruleHeal )
                    // InternalRangoMode.g:1171:3: ruleHeal
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
                    // InternalRangoMode.g:1176:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1176:2: ( ruleShield )
                    // InternalRangoMode.g:1177:3: ruleShield
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
                    // InternalRangoMode.g:1182:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1182:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1183:3: ruleSpeedChange
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
                    // InternalRangoMode.g:1188:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1188:2: ( rulePoison )
                    // InternalRangoMode.g:1189:3: rulePoison
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
    // InternalRangoMode.g:1198:1: rule__GameMode__Alternatives_8 : ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) );
    public final void rule__GameMode__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1202:1: ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            else if ( (LA5_0==59) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1203:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    {
                    // InternalRangoMode.g:1203:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    // InternalRangoMode.g:1204:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_0()); 
                    // InternalRangoMode.g:1205:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    // InternalRangoMode.g:1205:4: rule__GameMode__LevelsAssignment_8_0
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
                    // InternalRangoMode.g:1209:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    {
                    // InternalRangoMode.g:1209:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    // InternalRangoMode.g:1210:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    {
                    // InternalRangoMode.g:1210:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) )
                    // InternalRangoMode.g:1211:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1212:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    // InternalRangoMode.g:1212:5: rule__GameMode__LevelsAssignment_8_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__GameMode__LevelsAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 

                    }

                    // InternalRangoMode.g:1215:3: ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    // InternalRangoMode.g:1216:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1217:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==59) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRangoMode.g:1217:5: rule__GameMode__LevelsAssignment_8_1
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
    // InternalRangoMode.g:1226:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1230:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt6=1;
                }
                break;
            case 77:
                {
                alt6=2;
                }
                break;
            case 80:
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
                    // InternalRangoMode.g:1231:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1231:2: ( ruleBlock )
                    // InternalRangoMode.g:1232:3: ruleBlock
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
                    // InternalRangoMode.g:1237:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1237:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1238:3: ruleJumpPad
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
                    // InternalRangoMode.g:1243:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1243:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1244:3: ruleTeleporter
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
    // InternalRangoMode.g:1253:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1257:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==81) ) {
                alt7=1;
            }
            else if ( (LA7_0==82) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1258:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1258:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1259:3: ruleFixedLayout
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
                    // InternalRangoMode.g:1264:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1264:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1265:3: ruleWaveSchedule
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
    // InternalRangoMode.g:1274:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1278:1: ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:1279:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1279:2: ( ruleCleared )
                    // InternalRangoMode.g:1280:3: ruleCleared
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
                    // InternalRangoMode.g:1285:2: ( ruleTimeReached )
                    {
                    // InternalRangoMode.g:1285:2: ( ruleTimeReached )
                    // InternalRangoMode.g:1286:3: ruleTimeReached
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
                    // InternalRangoMode.g:1291:2: ( ruleScoreReached )
                    {
                    // InternalRangoMode.g:1291:2: ( ruleScoreReached )
                    // InternalRangoMode.g:1292:3: ruleScoreReached
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
                    // InternalRangoMode.g:1297:2: ( ruleEnemiesPopped )
                    {
                    // InternalRangoMode.g:1297:2: ( ruleEnemiesPopped )
                    // InternalRangoMode.g:1298:3: ruleEnemiesPopped
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
                    // InternalRangoMode.g:1303:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1303:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1304:3: ruleWavesSurvived
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
                    // InternalRangoMode.g:1309:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1309:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1310:3: ruleHealthDepleted
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
                    // InternalRangoMode.g:1315:2: ( ruleEnemiesAlive )
                    {
                    // InternalRangoMode.g:1315:2: ( ruleEnemiesAlive )
                    // InternalRangoMode.g:1316:3: ruleEnemiesAlive
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
    // InternalRangoMode.g:1325:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1329:1: ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) )
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
                    // InternalRangoMode.g:1330:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1330:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1331:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1332:3: ( 'everything' )
                    // InternalRangoMode.g:1332:4: 'everything'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1336:2: ( ( 'enemies' ) )
                    {
                    // InternalRangoMode.g:1336:2: ( ( 'enemies' ) )
                    // InternalRangoMode.g:1337:3: ( 'enemies' )
                    {
                     before(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1338:3: ( 'enemies' )
                    // InternalRangoMode.g:1338:4: 'enemies'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1342:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1342:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1343:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1344:3: ( 'player' )
                    // InternalRangoMode.g:1344:4: 'player'
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
    // InternalRangoMode.g:1352:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1356:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRangoMode.g:1357:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1357:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1358:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1359:3: ( 'left' )
                    // InternalRangoMode.g:1359:4: 'left'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1363:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1363:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1364:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1365:3: ( 'right' )
                    // InternalRangoMode.g:1365:4: 'right'
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
    // InternalRangoMode.g:1373:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1377:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1378:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
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
    // InternalRangoMode.g:1385:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1389:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1390:1: ( 'edition' )
            {
            // InternalRangoMode.g:1390:1: ( 'edition' )
            // InternalRangoMode.g:1391:2: 'edition'
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
    // InternalRangoMode.g:1400:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1404:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1405:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
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
    // InternalRangoMode.g:1412:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1416:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1417:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1417:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1418:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1419:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1419:3: rule__Edition__NameAssignment_1
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
    // InternalRangoMode.g:1427:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1431:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1432:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
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
    // InternalRangoMode.g:1439:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1443:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1444:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1444:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1445:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1446:2: ( rule__Edition__TitleAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRangoMode.g:1446:3: rule__Edition__TitleAssignment_2
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
    // InternalRangoMode.g:1454:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1458:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1459:2: rule__Edition__Group__3__Impl
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
    // InternalRangoMode.g:1465:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1469:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1470:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1470:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1471:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1472:2: ( rule__Edition__Alternatives_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13||LA12_0==17||LA12_0==43||LA12_0==45||LA12_0==52||LA12_0==87) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRangoMode.g:1472:3: rule__Edition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Edition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRangoMode.g:1481:1: rule__EnemyType__Group__0 : rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 ;
    public final void rule__EnemyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1485:1: ( rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 )
            // InternalRangoMode.g:1486:2: rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1
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
    // InternalRangoMode.g:1493:1: rule__EnemyType__Group__0__Impl : ( 'enemy' ) ;
    public final void rule__EnemyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1497:1: ( ( 'enemy' ) )
            // InternalRangoMode.g:1498:1: ( 'enemy' )
            {
            // InternalRangoMode.g:1498:1: ( 'enemy' )
            // InternalRangoMode.g:1499:2: 'enemy'
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
    // InternalRangoMode.g:1508:1: rule__EnemyType__Group__1 : rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 ;
    public final void rule__EnemyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1512:1: ( rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 )
            // InternalRangoMode.g:1513:2: rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:1520:1: rule__EnemyType__Group__1__Impl : ( ( rule__EnemyType__NameAssignment_1 ) ) ;
    public final void rule__EnemyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1524:1: ( ( ( rule__EnemyType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1525:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1525:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            // InternalRangoMode.g:1526:2: ( rule__EnemyType__NameAssignment_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1527:2: ( rule__EnemyType__NameAssignment_1 )
            // InternalRangoMode.g:1527:3: rule__EnemyType__NameAssignment_1
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
    // InternalRangoMode.g:1535:1: rule__EnemyType__Group__2 : rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 ;
    public final void rule__EnemyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1539:1: ( rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 )
            // InternalRangoMode.g:1540:2: rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalRangoMode.g:1547:1: rule__EnemyType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnemyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1551:1: ( ( '{' ) )
            // InternalRangoMode.g:1552:1: ( '{' )
            {
            // InternalRangoMode.g:1552:1: ( '{' )
            // InternalRangoMode.g:1553:2: '{'
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
    // InternalRangoMode.g:1562:1: rule__EnemyType__Group__3 : rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 ;
    public final void rule__EnemyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1566:1: ( rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 )
            // InternalRangoMode.g:1567:2: rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalRangoMode.g:1574:1: rule__EnemyType__Group__3__Impl : ( ( rule__EnemyType__UnorderedGroup_3 ) ) ;
    public final void rule__EnemyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1578:1: ( ( ( rule__EnemyType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1579:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1579:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1580:2: ( rule__EnemyType__UnorderedGroup_3 )
            {
             before(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1581:2: ( rule__EnemyType__UnorderedGroup_3 )
            // InternalRangoMode.g:1581:3: rule__EnemyType__UnorderedGroup_3
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
    // InternalRangoMode.g:1589:1: rule__EnemyType__Group__4 : rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 ;
    public final void rule__EnemyType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1593:1: ( rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 )
            // InternalRangoMode.g:1594:2: rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalRangoMode.g:1601:1: rule__EnemyType__Group__4__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1605:1: ( ( 'on' ) )
            // InternalRangoMode.g:1606:1: ( 'on' )
            {
            // InternalRangoMode.g:1606:1: ( 'on' )
            // InternalRangoMode.g:1607:2: 'on'
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
    // InternalRangoMode.g:1616:1: rule__EnemyType__Group__5 : rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 ;
    public final void rule__EnemyType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1620:1: ( rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 )
            // InternalRangoMode.g:1621:2: rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalRangoMode.g:1628:1: rule__EnemyType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__EnemyType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1632:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1633:1: ( 'pop' )
            {
            // InternalRangoMode.g:1633:1: ( 'pop' )
            // InternalRangoMode.g:1634:2: 'pop'
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
    // InternalRangoMode.g:1643:1: rule__EnemyType__Group__6 : rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 ;
    public final void rule__EnemyType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1647:1: ( rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 )
            // InternalRangoMode.g:1648:2: rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalRangoMode.g:1655:1: rule__EnemyType__Group__6__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1659:1: ( ( ':' ) )
            // InternalRangoMode.g:1660:1: ( ':' )
            {
            // InternalRangoMode.g:1660:1: ( ':' )
            // InternalRangoMode.g:1661:2: ':'
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
    // InternalRangoMode.g:1670:1: rule__EnemyType__Group__7 : rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 ;
    public final void rule__EnemyType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1674:1: ( rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 )
            // InternalRangoMode.g:1675:2: rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalRangoMode.g:1682:1: rule__EnemyType__Group__7__Impl : ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) ;
    public final void rule__EnemyType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1686:1: ( ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:1687:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:1687:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:1688:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:1689:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:1689:3: rule__EnemyType__SplitRuleAssignment_7
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
    // InternalRangoMode.g:1697:1: rule__EnemyType__Group__8 : rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 ;
    public final void rule__EnemyType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1701:1: ( rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 )
            // InternalRangoMode.g:1702:2: rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalRangoMode.g:1709:1: rule__EnemyType__Group__8__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1713:1: ( ( 'on' ) )
            // InternalRangoMode.g:1714:1: ( 'on' )
            {
            // InternalRangoMode.g:1714:1: ( 'on' )
            // InternalRangoMode.g:1715:2: 'on'
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
    // InternalRangoMode.g:1724:1: rule__EnemyType__Group__9 : rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 ;
    public final void rule__EnemyType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1728:1: ( rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 )
            // InternalRangoMode.g:1729:2: rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalRangoMode.g:1736:1: rule__EnemyType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__EnemyType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1740:1: ( ( 'contact' ) )
            // InternalRangoMode.g:1741:1: ( 'contact' )
            {
            // InternalRangoMode.g:1741:1: ( 'contact' )
            // InternalRangoMode.g:1742:2: 'contact'
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
    // InternalRangoMode.g:1751:1: rule__EnemyType__Group__10 : rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 ;
    public final void rule__EnemyType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1755:1: ( rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 )
            // InternalRangoMode.g:1756:2: rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:1763:1: rule__EnemyType__Group__10__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1767:1: ( ( ':' ) )
            // InternalRangoMode.g:1768:1: ( ':' )
            {
            // InternalRangoMode.g:1768:1: ( ':' )
            // InternalRangoMode.g:1769:2: ':'
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
    // InternalRangoMode.g:1778:1: rule__EnemyType__Group__11 : rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 ;
    public final void rule__EnemyType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1782:1: ( rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 )
            // InternalRangoMode.g:1783:2: rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:1790:1: rule__EnemyType__Group__11__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__EnemyType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1794:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:1795:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:1795:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:1796:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:1797:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:1797:3: rule__EnemyType__ContactEffectsAssignment_11
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
    // InternalRangoMode.g:1805:1: rule__EnemyType__Group__12 : rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 ;
    public final void rule__EnemyType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1809:1: ( rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 )
            // InternalRangoMode.g:1810:2: rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:1817:1: rule__EnemyType__Group__12__Impl : ( ( rule__EnemyType__Group_12__0 )* ) ;
    public final void rule__EnemyType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1821:1: ( ( ( rule__EnemyType__Group_12__0 )* ) )
            // InternalRangoMode.g:1822:1: ( ( rule__EnemyType__Group_12__0 )* )
            {
            // InternalRangoMode.g:1822:1: ( ( rule__EnemyType__Group_12__0 )* )
            // InternalRangoMode.g:1823:2: ( rule__EnemyType__Group_12__0 )*
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:1824:2: ( rule__EnemyType__Group_12__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRangoMode.g:1824:3: rule__EnemyType__Group_12__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__EnemyType__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRangoMode.g:1832:1: rule__EnemyType__Group__13 : rule__EnemyType__Group__13__Impl ;
    public final void rule__EnemyType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1836:1: ( rule__EnemyType__Group__13__Impl )
            // InternalRangoMode.g:1837:2: rule__EnemyType__Group__13__Impl
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
    // InternalRangoMode.g:1843:1: rule__EnemyType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnemyType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1847:1: ( ( '}' ) )
            // InternalRangoMode.g:1848:1: ( '}' )
            {
            // InternalRangoMode.g:1848:1: ( '}' )
            // InternalRangoMode.g:1849:2: '}'
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
    // InternalRangoMode.g:1859:1: rule__EnemyType__Group_3_0__0 : rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 ;
    public final void rule__EnemyType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1863:1: ( rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 )
            // InternalRangoMode.g:1864:2: rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:1871:1: rule__EnemyType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__EnemyType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1875:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:1876:1: ( 'sprite' )
            {
            // InternalRangoMode.g:1876:1: ( 'sprite' )
            // InternalRangoMode.g:1877:2: 'sprite'
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
    // InternalRangoMode.g:1886:1: rule__EnemyType__Group_3_0__1 : rule__EnemyType__Group_3_0__1__Impl ;
    public final void rule__EnemyType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1890:1: ( rule__EnemyType__Group_3_0__1__Impl )
            // InternalRangoMode.g:1891:2: rule__EnemyType__Group_3_0__1__Impl
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
    // InternalRangoMode.g:1897:1: rule__EnemyType__Group_3_0__1__Impl : ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__EnemyType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1901:1: ( ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:1902:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:1902:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:1903:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:1904:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:1904:3: rule__EnemyType__SpriteAssignment_3_0_1
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
    // InternalRangoMode.g:1913:1: rule__EnemyType__Group_3_1__0 : rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 ;
    public final void rule__EnemyType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1917:1: ( rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 )
            // InternalRangoMode.g:1918:2: rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:1925:1: rule__EnemyType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__EnemyType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1929:1: ( ( 'scale' ) )
            // InternalRangoMode.g:1930:1: ( 'scale' )
            {
            // InternalRangoMode.g:1930:1: ( 'scale' )
            // InternalRangoMode.g:1931:2: 'scale'
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
    // InternalRangoMode.g:1940:1: rule__EnemyType__Group_3_1__1 : rule__EnemyType__Group_3_1__1__Impl ;
    public final void rule__EnemyType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1944:1: ( rule__EnemyType__Group_3_1__1__Impl )
            // InternalRangoMode.g:1945:2: rule__EnemyType__Group_3_1__1__Impl
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
    // InternalRangoMode.g:1951:1: rule__EnemyType__Group_3_1__1__Impl : ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__EnemyType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1955:1: ( ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:1956:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:1956:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:1957:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:1958:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:1958:3: rule__EnemyType__ScaleAssignment_3_1_1
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
    // InternalRangoMode.g:1967:1: rule__EnemyType__Group_3_2__0 : rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 ;
    public final void rule__EnemyType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1971:1: ( rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 )
            // InternalRangoMode.g:1972:2: rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:1979:1: rule__EnemyType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__EnemyType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1983:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:1984:1: ( 'bounce' )
            {
            // InternalRangoMode.g:1984:1: ( 'bounce' )
            // InternalRangoMode.g:1985:2: 'bounce'
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
    // InternalRangoMode.g:1994:1: rule__EnemyType__Group_3_2__1 : rule__EnemyType__Group_3_2__1__Impl ;
    public final void rule__EnemyType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1998:1: ( rule__EnemyType__Group_3_2__1__Impl )
            // InternalRangoMode.g:1999:2: rule__EnemyType__Group_3_2__1__Impl
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
    // InternalRangoMode.g:2005:1: rule__EnemyType__Group_3_2__1__Impl : ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__EnemyType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2009:1: ( ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:2010:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:2010:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:2011:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:2012:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:2012:3: rule__EnemyType__BounceAssignment_3_2_1
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
    // InternalRangoMode.g:2021:1: rule__EnemyType__Group_3_3__0 : rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 ;
    public final void rule__EnemyType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2025:1: ( rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 )
            // InternalRangoMode.g:2026:2: rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2033:1: rule__EnemyType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__EnemyType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2037:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2038:1: ( 'speed' )
            {
            // InternalRangoMode.g:2038:1: ( 'speed' )
            // InternalRangoMode.g:2039:2: 'speed'
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
    // InternalRangoMode.g:2048:1: rule__EnemyType__Group_3_3__1 : rule__EnemyType__Group_3_3__1__Impl ;
    public final void rule__EnemyType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2052:1: ( rule__EnemyType__Group_3_3__1__Impl )
            // InternalRangoMode.g:2053:2: rule__EnemyType__Group_3_3__1__Impl
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
    // InternalRangoMode.g:2059:1: rule__EnemyType__Group_3_3__1__Impl : ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__EnemyType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2063:1: ( ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:2064:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:2064:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:2065:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:2066:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:2066:3: rule__EnemyType__SpeedAssignment_3_3_1
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
    // InternalRangoMode.g:2075:1: rule__EnemyType__Group_3_4__0 : rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 ;
    public final void rule__EnemyType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2079:1: ( rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 )
            // InternalRangoMode.g:2080:2: rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2087:1: rule__EnemyType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__EnemyType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2091:1: ( ( 'points' ) )
            // InternalRangoMode.g:2092:1: ( 'points' )
            {
            // InternalRangoMode.g:2092:1: ( 'points' )
            // InternalRangoMode.g:2093:2: 'points'
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
    // InternalRangoMode.g:2102:1: rule__EnemyType__Group_3_4__1 : rule__EnemyType__Group_3_4__1__Impl ;
    public final void rule__EnemyType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2106:1: ( rule__EnemyType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2107:2: rule__EnemyType__Group_3_4__1__Impl
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
    // InternalRangoMode.g:2113:1: rule__EnemyType__Group_3_4__1__Impl : ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__EnemyType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2117:1: ( ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2118:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2118:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2119:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2120:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2120:3: rule__EnemyType__PointsAssignment_3_4_1
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
    // InternalRangoMode.g:2129:1: rule__EnemyType__Group_12__0 : rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 ;
    public final void rule__EnemyType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2133:1: ( rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 )
            // InternalRangoMode.g:2134:2: rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:2141:1: rule__EnemyType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__EnemyType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2145:1: ( ( ',' ) )
            // InternalRangoMode.g:2146:1: ( ',' )
            {
            // InternalRangoMode.g:2146:1: ( ',' )
            // InternalRangoMode.g:2147:2: ','
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
    // InternalRangoMode.g:2156:1: rule__EnemyType__Group_12__1 : rule__EnemyType__Group_12__1__Impl ;
    public final void rule__EnemyType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2160:1: ( rule__EnemyType__Group_12__1__Impl )
            // InternalRangoMode.g:2161:2: rule__EnemyType__Group_12__1__Impl
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
    // InternalRangoMode.g:2167:1: rule__EnemyType__Group_12__1__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__EnemyType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2171:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2172:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2172:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2173:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2174:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2174:3: rule__EnemyType__ContactEffectsAssignment_12_1
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
    // InternalRangoMode.g:2183:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2187:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2188:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRangoMode.g:2195:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2199:1: ( ( () ) )
            // InternalRangoMode.g:2200:1: ( () )
            {
            // InternalRangoMode.g:2200:1: ( () )
            // InternalRangoMode.g:2201:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2202:2: ()
            // InternalRangoMode.g:2202:3: 
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
    // InternalRangoMode.g:2210:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2214:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2215:2: rule__Vanish__Group__1__Impl
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
    // InternalRangoMode.g:2221:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2225:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2226:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2226:1: ( 'vanish' )
            // InternalRangoMode.g:2227:2: 'vanish'
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
    // InternalRangoMode.g:2237:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2241:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2242:2: rule__Split__Group__0__Impl rule__Split__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRangoMode.g:2249:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2253:1: ( ( 'split' ) )
            // InternalRangoMode.g:2254:1: ( 'split' )
            {
            // InternalRangoMode.g:2254:1: ( 'split' )
            // InternalRangoMode.g:2255:2: 'split'
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
    // InternalRangoMode.g:2264:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2268:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2269:2: rule__Split__Group__1__Impl rule__Split__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2276:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2280:1: ( ( 'into' ) )
            // InternalRangoMode.g:2281:1: ( 'into' )
            {
            // InternalRangoMode.g:2281:1: ( 'into' )
            // InternalRangoMode.g:2282:2: 'into'
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
    // InternalRangoMode.g:2291:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2295:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2296:2: rule__Split__Group__2__Impl rule__Split__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:2303:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2307:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2308:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2308:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2309:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2310:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2310:3: rule__Split__FragmentsAssignment_2
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
    // InternalRangoMode.g:2318:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2322:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2323:2: rule__Split__Group__3__Impl rule__Split__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRangoMode.g:2330:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2334:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2335:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2335:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2336:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2337:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRangoMode.g:2337:3: rule__Split__FragmentTypeAssignment_3
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
    // InternalRangoMode.g:2345:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2349:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2350:2: rule__Split__Group__4__Impl
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
    // InternalRangoMode.g:2356:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2360:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2361:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2361:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2362:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2363:2: ( rule__Split__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:2363:3: rule__Split__Group_4__0
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
    // InternalRangoMode.g:2372:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2376:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2377:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:2384:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2388:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2389:1: ( 'launched' )
            {
            // InternalRangoMode.g:2389:1: ( 'launched' )
            // InternalRangoMode.g:2390:2: 'launched'
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
    // InternalRangoMode.g:2399:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2403:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2404:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2411:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2415:1: ( ( 'at' ) )
            // InternalRangoMode.g:2416:1: ( 'at' )
            {
            // InternalRangoMode.g:2416:1: ( 'at' )
            // InternalRangoMode.g:2417:2: 'at'
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
    // InternalRangoMode.g:2426:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2430:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2431:2: rule__Split__Group_4__2__Impl
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
    // InternalRangoMode.g:2437:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2441:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2442:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2442:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2443:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2444:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2444:3: rule__Split__LaunchSpeedAssignment_4_2
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
    // InternalRangoMode.g:2453:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2457:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2458:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2465:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2469:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2470:1: ( 'damage' )
            {
            // InternalRangoMode.g:2470:1: ( 'damage' )
            // InternalRangoMode.g:2471:2: 'damage'
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
    // InternalRangoMode.g:2480:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2484:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2485:2: rule__Damage__Group__1__Impl
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
    // InternalRangoMode.g:2491:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2495:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2496:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2496:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2497:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2498:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2498:3: rule__Damage__AmountAssignment_1
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
    // InternalRangoMode.g:2507:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2511:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2512:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2519:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2523:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2524:1: ( 'heal' )
            {
            // InternalRangoMode.g:2524:1: ( 'heal' )
            // InternalRangoMode.g:2525:2: 'heal'
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
    // InternalRangoMode.g:2534:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2538:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2539:2: rule__Heal__Group__1__Impl
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
    // InternalRangoMode.g:2545:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2549:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2550:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2550:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2551:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2552:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2552:3: rule__Heal__AmountAssignment_1
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
    // InternalRangoMode.g:2561:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2565:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2566:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2573:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2577:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2578:1: ( 'shield' )
            {
            // InternalRangoMode.g:2578:1: ( 'shield' )
            // InternalRangoMode.g:2579:2: 'shield'
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
    // InternalRangoMode.g:2588:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2592:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2593:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2600:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2604:1: ( ( 'for' ) )
            // InternalRangoMode.g:2605:1: ( 'for' )
            {
            // InternalRangoMode.g:2605:1: ( 'for' )
            // InternalRangoMode.g:2606:2: 'for'
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
    // InternalRangoMode.g:2615:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2619:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2620:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:2627:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2631:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2632:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2632:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2633:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2634:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2634:3: rule__Shield__DurationAssignment_2
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
    // InternalRangoMode.g:2642:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2646:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2647:2: rule__Shield__Group__3__Impl
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
    // InternalRangoMode.g:2653:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2657:1: ( ( 's' ) )
            // InternalRangoMode.g:2658:1: ( 's' )
            {
            // InternalRangoMode.g:2658:1: ( 's' )
            // InternalRangoMode.g:2659:2: 's'
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
    // InternalRangoMode.g:2669:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2673:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:2674:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRangoMode.g:2681:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2685:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2686:1: ( 'speed' )
            {
            // InternalRangoMode.g:2686:1: ( 'speed' )
            // InternalRangoMode.g:2687:2: 'speed'
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
    // InternalRangoMode.g:2696:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2700:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:2701:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2708:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2712:1: ( ( '*' ) )
            // InternalRangoMode.g:2713:1: ( '*' )
            {
            // InternalRangoMode.g:2713:1: ( '*' )
            // InternalRangoMode.g:2714:2: '*'
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
    // InternalRangoMode.g:2723:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2727:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:2728:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2735:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2739:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:2740:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:2740:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:2741:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:2742:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:2742:3: rule__SpeedChange__FactorAssignment_2
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
    // InternalRangoMode.g:2750:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2754:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:2755:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2762:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2766:1: ( ( 'for' ) )
            // InternalRangoMode.g:2767:1: ( 'for' )
            {
            // InternalRangoMode.g:2767:1: ( 'for' )
            // InternalRangoMode.g:2768:2: 'for'
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
    // InternalRangoMode.g:2777:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2781:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:2782:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:2789:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2793:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:2794:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:2794:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:2795:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:2796:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:2796:3: rule__SpeedChange__DurationAssignment_4
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
    // InternalRangoMode.g:2804:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2808:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:2809:2: rule__SpeedChange__Group__5__Impl
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
    // InternalRangoMode.g:2815:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2819:1: ( ( 's' ) )
            // InternalRangoMode.g:2820:1: ( 's' )
            {
            // InternalRangoMode.g:2820:1: ( 's' )
            // InternalRangoMode.g:2821:2: 's'
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
    // InternalRangoMode.g:2831:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2835:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:2836:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2843:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2847:1: ( ( 'poison' ) )
            // InternalRangoMode.g:2848:1: ( 'poison' )
            {
            // InternalRangoMode.g:2848:1: ( 'poison' )
            // InternalRangoMode.g:2849:2: 'poison'
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
    // InternalRangoMode.g:2858:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2862:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:2863:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRangoMode.g:2870:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2874:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2875:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2875:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:2876:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2877:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:2877:3: rule__Poison__AmountAssignment_1
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
    // InternalRangoMode.g:2885:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2889:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:2890:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2897:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2901:1: ( ( 'every' ) )
            // InternalRangoMode.g:2902:1: ( 'every' )
            {
            // InternalRangoMode.g:2902:1: ( 'every' )
            // InternalRangoMode.g:2903:2: 'every'
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
    // InternalRangoMode.g:2912:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2916:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:2917:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:2924:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2928:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:2929:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:2929:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:2930:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:2931:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:2931:3: rule__Poison__IntervalAssignment_3
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
    // InternalRangoMode.g:2939:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2943:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:2944:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalRangoMode.g:2951:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2955:1: ( ( 's' ) )
            // InternalRangoMode.g:2956:1: ( 's' )
            {
            // InternalRangoMode.g:2956:1: ( 's' )
            // InternalRangoMode.g:2957:2: 's'
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
    // InternalRangoMode.g:2966:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2970:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:2971:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:2978:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2982:1: ( ( 'for' ) )
            // InternalRangoMode.g:2983:1: ( 'for' )
            {
            // InternalRangoMode.g:2983:1: ( 'for' )
            // InternalRangoMode.g:2984:2: 'for'
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
    // InternalRangoMode.g:2993:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2997:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:2998:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:3005:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3009:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:3010:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:3010:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:3011:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:3012:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:3012:3: rule__Poison__DurationAssignment_6
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
    // InternalRangoMode.g:3020:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3024:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:3025:2: rule__Poison__Group__7__Impl
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
    // InternalRangoMode.g:3031:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3035:1: ( ( 's' ) )
            // InternalRangoMode.g:3036:1: ( 's' )
            {
            // InternalRangoMode.g:3036:1: ( 's' )
            // InternalRangoMode.g:3037:2: 's'
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
    // InternalRangoMode.g:3047:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3051:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:3052:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
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
    // InternalRangoMode.g:3059:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3063:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:3064:1: ( 'powerup' )
            {
            // InternalRangoMode.g:3064:1: ( 'powerup' )
            // InternalRangoMode.g:3065:2: 'powerup'
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
    // InternalRangoMode.g:3074:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3078:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3079:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:3086:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3090:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3091:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3091:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3092:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3093:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3093:3: rule__PowerUp__NameAssignment_1
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
    // InternalRangoMode.g:3101:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3105:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3106:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalRangoMode.g:3113:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3117:1: ( ( '{' ) )
            // InternalRangoMode.g:3118:1: ( '{' )
            {
            // InternalRangoMode.g:3118:1: ( '{' )
            // InternalRangoMode.g:3119:2: '{'
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
    // InternalRangoMode.g:3128:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3132:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3133:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3140:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3144:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3145:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3145:1: ( 'sprite' )
            // InternalRangoMode.g:3146:2: 'sprite'
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
    // InternalRangoMode.g:3155:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3159:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3160:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalRangoMode.g:3167:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3171:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3172:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3172:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3173:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3174:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3174:3: rule__PowerUp__SpriteAssignment_4
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
    // InternalRangoMode.g:3182:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3186:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3187:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalRangoMode.g:3194:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3198:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3199:1: ( 'gives' )
            {
            // InternalRangoMode.g:3199:1: ( 'gives' )
            // InternalRangoMode.g:3200:2: 'gives'
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
    // InternalRangoMode.g:3209:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3213:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3214:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:3221:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3225:1: ( ( ':' ) )
            // InternalRangoMode.g:3226:1: ( ':' )
            {
            // InternalRangoMode.g:3226:1: ( ':' )
            // InternalRangoMode.g:3227:2: ':'
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
    // InternalRangoMode.g:3236:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3240:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3241:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:3248:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3252:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3253:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3253:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3254:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3255:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3255:3: rule__PowerUp__EffectsAssignment_7
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
    // InternalRangoMode.g:3263:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3267:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3268:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:3275:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3279:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3280:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3280:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3281:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3282:2: ( rule__PowerUp__Group_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRangoMode.g:3282:3: rule__PowerUp__Group_8__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__PowerUp__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRangoMode.g:3290:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3294:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3295:2: rule__PowerUp__Group__9__Impl
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
    // InternalRangoMode.g:3301:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3305:1: ( ( '}' ) )
            // InternalRangoMode.g:3306:1: ( '}' )
            {
            // InternalRangoMode.g:3306:1: ( '}' )
            // InternalRangoMode.g:3307:2: '}'
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
    // InternalRangoMode.g:3317:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3321:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3322:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRangoMode.g:3329:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3333:1: ( ( ',' ) )
            // InternalRangoMode.g:3334:1: ( ',' )
            {
            // InternalRangoMode.g:3334:1: ( ',' )
            // InternalRangoMode.g:3335:2: ','
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
    // InternalRangoMode.g:3344:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3348:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3349:2: rule__PowerUp__Group_8__1__Impl
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
    // InternalRangoMode.g:3355:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3359:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3360:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3360:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3361:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3362:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3362:3: rule__PowerUp__EffectsAssignment_8_1
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
    // InternalRangoMode.g:3371:1: rule__Material__Group__0 : rule__Material__Group__0__Impl rule__Material__Group__1 ;
    public final void rule__Material__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3375:1: ( rule__Material__Group__0__Impl rule__Material__Group__1 )
            // InternalRangoMode.g:3376:2: rule__Material__Group__0__Impl rule__Material__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:3383:1: rule__Material__Group__0__Impl : ( 'material' ) ;
    public final void rule__Material__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3387:1: ( ( 'material' ) )
            // InternalRangoMode.g:3388:1: ( 'material' )
            {
            // InternalRangoMode.g:3388:1: ( 'material' )
            // InternalRangoMode.g:3389:2: 'material'
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
    // InternalRangoMode.g:3398:1: rule__Material__Group__1 : rule__Material__Group__1__Impl rule__Material__Group__2 ;
    public final void rule__Material__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3402:1: ( rule__Material__Group__1__Impl rule__Material__Group__2 )
            // InternalRangoMode.g:3403:2: rule__Material__Group__1__Impl rule__Material__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:3410:1: rule__Material__Group__1__Impl : ( ( rule__Material__NameAssignment_1 ) ) ;
    public final void rule__Material__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3414:1: ( ( ( rule__Material__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3415:1: ( ( rule__Material__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3415:1: ( ( rule__Material__NameAssignment_1 ) )
            // InternalRangoMode.g:3416:2: ( rule__Material__NameAssignment_1 )
            {
             before(grammarAccess.getMaterialAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3417:2: ( rule__Material__NameAssignment_1 )
            // InternalRangoMode.g:3417:3: rule__Material__NameAssignment_1
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
    // InternalRangoMode.g:3425:1: rule__Material__Group__2 : rule__Material__Group__2__Impl rule__Material__Group__3 ;
    public final void rule__Material__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3429:1: ( rule__Material__Group__2__Impl rule__Material__Group__3 )
            // InternalRangoMode.g:3430:2: rule__Material__Group__2__Impl rule__Material__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:3437:1: rule__Material__Group__2__Impl : ( '{' ) ;
    public final void rule__Material__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3441:1: ( ( '{' ) )
            // InternalRangoMode.g:3442:1: ( '{' )
            {
            // InternalRangoMode.g:3442:1: ( '{' )
            // InternalRangoMode.g:3443:2: '{'
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
    // InternalRangoMode.g:3452:1: rule__Material__Group__3 : rule__Material__Group__3__Impl rule__Material__Group__4 ;
    public final void rule__Material__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3456:1: ( rule__Material__Group__3__Impl rule__Material__Group__4 )
            // InternalRangoMode.g:3457:2: rule__Material__Group__3__Impl rule__Material__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:3464:1: rule__Material__Group__3__Impl : ( ( rule__Material__UnorderedGroup_3 ) ) ;
    public final void rule__Material__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3468:1: ( ( ( rule__Material__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3469:1: ( ( rule__Material__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3469:1: ( ( rule__Material__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3470:2: ( rule__Material__UnorderedGroup_3 )
            {
             before(grammarAccess.getMaterialAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3471:2: ( rule__Material__UnorderedGroup_3 )
            // InternalRangoMode.g:3471:3: rule__Material__UnorderedGroup_3
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
    // InternalRangoMode.g:3479:1: rule__Material__Group__4 : rule__Material__Group__4__Impl ;
    public final void rule__Material__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3483:1: ( rule__Material__Group__4__Impl )
            // InternalRangoMode.g:3484:2: rule__Material__Group__4__Impl
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
    // InternalRangoMode.g:3490:1: rule__Material__Group__4__Impl : ( '}' ) ;
    public final void rule__Material__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3494:1: ( ( '}' ) )
            // InternalRangoMode.g:3495:1: ( '}' )
            {
            // InternalRangoMode.g:3495:1: ( '}' )
            // InternalRangoMode.g:3496:2: '}'
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
    // InternalRangoMode.g:3506:1: rule__Material__Group_3_0__0 : rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 ;
    public final void rule__Material__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3510:1: ( rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 )
            // InternalRangoMode.g:3511:2: rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:3518:1: rule__Material__Group_3_0__0__Impl : ( 'bounce' ) ;
    public final void rule__Material__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3522:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:3523:1: ( 'bounce' )
            {
            // InternalRangoMode.g:3523:1: ( 'bounce' )
            // InternalRangoMode.g:3524:2: 'bounce'
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
    // InternalRangoMode.g:3533:1: rule__Material__Group_3_0__1 : rule__Material__Group_3_0__1__Impl ;
    public final void rule__Material__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3537:1: ( rule__Material__Group_3_0__1__Impl )
            // InternalRangoMode.g:3538:2: rule__Material__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3544:1: rule__Material__Group_3_0__1__Impl : ( ( rule__Material__BounceAssignment_3_0_1 ) ) ;
    public final void rule__Material__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3548:1: ( ( ( rule__Material__BounceAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3549:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3549:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            // InternalRangoMode.g:3550:2: ( rule__Material__BounceAssignment_3_0_1 )
            {
             before(grammarAccess.getMaterialAccess().getBounceAssignment_3_0_1()); 
            // InternalRangoMode.g:3551:2: ( rule__Material__BounceAssignment_3_0_1 )
            // InternalRangoMode.g:3551:3: rule__Material__BounceAssignment_3_0_1
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
    // InternalRangoMode.g:3560:1: rule__Material__Group_3_1__0 : rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 ;
    public final void rule__Material__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3564:1: ( rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 )
            // InternalRangoMode.g:3565:2: rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3572:1: rule__Material__Group_3_1__0__Impl : ( 'sprite' ) ;
    public final void rule__Material__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3576:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3577:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3577:1: ( 'sprite' )
            // InternalRangoMode.g:3578:2: 'sprite'
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
    // InternalRangoMode.g:3587:1: rule__Material__Group_3_1__1 : rule__Material__Group_3_1__1__Impl ;
    public final void rule__Material__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3591:1: ( rule__Material__Group_3_1__1__Impl )
            // InternalRangoMode.g:3592:2: rule__Material__Group_3_1__1__Impl
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
    // InternalRangoMode.g:3598:1: rule__Material__Group_3_1__1__Impl : ( ( rule__Material__SpriteAssignment_3_1_1 ) ) ;
    public final void rule__Material__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3602:1: ( ( ( rule__Material__SpriteAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3603:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3603:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            // InternalRangoMode.g:3604:2: ( rule__Material__SpriteAssignment_3_1_1 )
            {
             before(grammarAccess.getMaterialAccess().getSpriteAssignment_3_1_1()); 
            // InternalRangoMode.g:3605:2: ( rule__Material__SpriteAssignment_3_1_1 )
            // InternalRangoMode.g:3605:3: rule__Material__SpriteAssignment_3_1_1
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
    // InternalRangoMode.g:3614:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3618:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3619:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
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
    // InternalRangoMode.g:3626:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3630:1: ( ( 'player' ) )
            // InternalRangoMode.g:3631:1: ( 'player' )
            {
            // InternalRangoMode.g:3631:1: ( 'player' )
            // InternalRangoMode.g:3632:2: 'player'
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
    // InternalRangoMode.g:3641:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3645:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3646:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:3653:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3657:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3658:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3658:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3659:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3660:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3660:3: rule__PlayerProfile__NameAssignment_1
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
    // InternalRangoMode.g:3668:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3672:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3673:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalRangoMode.g:3680:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3684:1: ( ( '{' ) )
            // InternalRangoMode.g:3685:1: ( '{' )
            {
            // InternalRangoMode.g:3685:1: ( '{' )
            // InternalRangoMode.g:3686:2: '{'
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
    // InternalRangoMode.g:3695:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3699:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3700:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:3707:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3711:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3712:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3712:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3713:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3714:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3714:3: rule__PlayerProfile__UnorderedGroup_3
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
    // InternalRangoMode.g:3722:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3726:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3727:2: rule__PlayerProfile__Group__4__Impl
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
    // InternalRangoMode.g:3733:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3737:1: ( ( '}' ) )
            // InternalRangoMode.g:3738:1: ( '}' )
            {
            // InternalRangoMode.g:3738:1: ( '}' )
            // InternalRangoMode.g:3739:2: '}'
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
    // InternalRangoMode.g:3749:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3753:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3754:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:3761:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3765:1: ( ( 'character' ) )
            // InternalRangoMode.g:3766:1: ( 'character' )
            {
            // InternalRangoMode.g:3766:1: ( 'character' )
            // InternalRangoMode.g:3767:2: 'character'
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
    // InternalRangoMode.g:3776:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3780:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3781:2: rule__PlayerProfile__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3787:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3791:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3792:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3792:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3793:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3794:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3794:3: rule__PlayerProfile__CharacterAssignment_3_0_1
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
    // InternalRangoMode.g:3803:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3807:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3808:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:3815:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3819:1: ( ( 'health' ) )
            // InternalRangoMode.g:3820:1: ( 'health' )
            {
            // InternalRangoMode.g:3820:1: ( 'health' )
            // InternalRangoMode.g:3821:2: 'health'
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
    // InternalRangoMode.g:3830:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3834:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3835:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRangoMode.g:3842:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3846:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3847:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3847:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:3848:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:3849:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:3849:3: rule__PlayerProfile__HealthAssignment_3_1_1
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
    // InternalRangoMode.g:3857:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3861:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:3862:2: rule__PlayerProfile__Group_3_1__2__Impl
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
    // InternalRangoMode.g:3868:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3872:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:3873:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:3873:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:3874:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:3875:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:3875:3: rule__PlayerProfile__Group_3_1_2__0
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
    // InternalRangoMode.g:3884:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3888:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:3889:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:3896:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3900:1: ( ( 'max' ) )
            // InternalRangoMode.g:3901:1: ( 'max' )
            {
            // InternalRangoMode.g:3901:1: ( 'max' )
            // InternalRangoMode.g:3902:2: 'max'
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
    // InternalRangoMode.g:3911:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3915:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:3916:2: rule__PlayerProfile__Group_3_1_2__1__Impl
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
    // InternalRangoMode.g:3922:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3926:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:3927:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:3927:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:3928:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:3929:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:3929:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
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
    // InternalRangoMode.g:3938:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3942:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:3943:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:3950:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3954:1: ( ( 'speed' ) )
            // InternalRangoMode.g:3955:1: ( 'speed' )
            {
            // InternalRangoMode.g:3955:1: ( 'speed' )
            // InternalRangoMode.g:3956:2: 'speed'
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
    // InternalRangoMode.g:3965:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3969:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:3970:2: rule__PlayerProfile__Group_3_2__1__Impl
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
    // InternalRangoMode.g:3976:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3980:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:3981:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:3981:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:3982:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:3983:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:3983:3: rule__PlayerProfile__SpeedAssignment_3_2_1
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
    // InternalRangoMode.g:3992:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3996:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:3997:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:4004:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4008:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:4009:1: ( 'tongue' )
            {
            // InternalRangoMode.g:4009:1: ( 'tongue' )
            // InternalRangoMode.g:4010:2: 'tongue'
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
    // InternalRangoMode.g:4019:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4023:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:4024:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:4031:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4035:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:4036:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:4036:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:4037:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:4038:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:4038:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
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
    // InternalRangoMode.g:4046:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4050:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:4051:2: rule__PlayerProfile__Group_3_3__2__Impl
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
    // InternalRangoMode.g:4057:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4061:1: ( ( 's' ) )
            // InternalRangoMode.g:4062:1: ( 's' )
            {
            // InternalRangoMode.g:4062:1: ( 's' )
            // InternalRangoMode.g:4063:2: 's'
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
    // InternalRangoMode.g:4073:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4077:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:4078:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:4085:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4089:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:4090:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:4090:1: ( 'cooldown' )
            // InternalRangoMode.g:4091:2: 'cooldown'
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
    // InternalRangoMode.g:4100:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4104:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:4105:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:4112:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4116:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:4117:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:4117:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:4118:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:4119:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:4119:3: rule__PlayerProfile__CooldownAssignment_3_4_1
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
    // InternalRangoMode.g:4127:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4131:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:4132:2: rule__PlayerProfile__Group_3_4__2__Impl
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
    // InternalRangoMode.g:4138:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4142:1: ( ( 's' ) )
            // InternalRangoMode.g:4143:1: ( 's' )
            {
            // InternalRangoMode.g:4143:1: ( 's' )
            // InternalRangoMode.g:4144:2: 's'
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
    // InternalRangoMode.g:4154:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4158:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:4159:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:4166:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4170:1: ( ( 'grace' ) )
            // InternalRangoMode.g:4171:1: ( 'grace' )
            {
            // InternalRangoMode.g:4171:1: ( 'grace' )
            // InternalRangoMode.g:4172:2: 'grace'
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
    // InternalRangoMode.g:4181:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4185:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:4186:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:4193:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4197:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:4198:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:4198:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:4199:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:4200:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:4200:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
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
    // InternalRangoMode.g:4208:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4212:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:4213:2: rule__PlayerProfile__Group_3_5__2__Impl
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
    // InternalRangoMode.g:4219:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4223:1: ( ( 's' ) )
            // InternalRangoMode.g:4224:1: ( 's' )
            {
            // InternalRangoMode.g:4224:1: ( 's' )
            // InternalRangoMode.g:4225:2: 's'
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
    // InternalRangoMode.g:4235:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4239:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:4240:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
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
    // InternalRangoMode.g:4247:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4251:1: ( ( 'mode' ) )
            // InternalRangoMode.g:4252:1: ( 'mode' )
            {
            // InternalRangoMode.g:4252:1: ( 'mode' )
            // InternalRangoMode.g:4253:2: 'mode'
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
    // InternalRangoMode.g:4262:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4266:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:4267:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:4274:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4278:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4279:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4279:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4280:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4281:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4281:3: rule__GameMode__NameAssignment_1
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
    // InternalRangoMode.g:4289:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4293:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4294:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:4301:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4305:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4306:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4306:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4307:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4308:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4308:3: rule__GameMode__TitleAssignment_2
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
    // InternalRangoMode.g:4316:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4320:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4321:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:4328:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4332:1: ( ( '{' ) )
            // InternalRangoMode.g:4333:1: ( '{' )
            {
            // InternalRangoMode.g:4333:1: ( '{' )
            // InternalRangoMode.g:4334:2: '{'
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
    // InternalRangoMode.g:4343:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4347:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4348:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:4355:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4359:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4360:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4360:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4361:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4362:2: ( rule__GameMode__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==55) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:4362:3: rule__GameMode__Group_4__0
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
    // InternalRangoMode.g:4370:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4374:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4375:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
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
    // InternalRangoMode.g:4382:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4386:1: ( ( 'player' ) )
            // InternalRangoMode.g:4387:1: ( 'player' )
            {
            // InternalRangoMode.g:4387:1: ( 'player' )
            // InternalRangoMode.g:4388:2: 'player'
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
    // InternalRangoMode.g:4397:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4401:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4402:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalRangoMode.g:4409:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4413:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4414:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4414:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4415:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4416:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4416:3: rule__GameMode__PlayerAssignment_6
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
    // InternalRangoMode.g:4424:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4428:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4429:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalRangoMode.g:4436:1: rule__GameMode__Group__7__Impl : ( ( rule__GameMode__UnorderedGroup_7 ) ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4440:1: ( ( ( rule__GameMode__UnorderedGroup_7 ) ) )
            // InternalRangoMode.g:4441:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            {
            // InternalRangoMode.g:4441:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            // InternalRangoMode.g:4442:2: ( rule__GameMode__UnorderedGroup_7 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 
            // InternalRangoMode.g:4443:2: ( rule__GameMode__UnorderedGroup_7 )
            // InternalRangoMode.g:4443:3: rule__GameMode__UnorderedGroup_7
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
    // InternalRangoMode.g:4451:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4455:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4456:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
            {
            pushFollow(FOLLOW_36);
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
    // InternalRangoMode.g:4463:1: rule__GameMode__Group__8__Impl : ( ( rule__GameMode__Alternatives_8 ) ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4467:1: ( ( ( rule__GameMode__Alternatives_8 ) ) )
            // InternalRangoMode.g:4468:1: ( ( rule__GameMode__Alternatives_8 ) )
            {
            // InternalRangoMode.g:4468:1: ( ( rule__GameMode__Alternatives_8 ) )
            // InternalRangoMode.g:4469:2: ( rule__GameMode__Alternatives_8 )
            {
             before(grammarAccess.getGameModeAccess().getAlternatives_8()); 
            // InternalRangoMode.g:4470:2: ( rule__GameMode__Alternatives_8 )
            // InternalRangoMode.g:4470:3: rule__GameMode__Alternatives_8
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
    // InternalRangoMode.g:4478:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4482:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4483:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
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
    // InternalRangoMode.g:4490:1: rule__GameMode__Group__9__Impl : ( ( ruleDrops )? ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4494:1: ( ( ( ruleDrops )? ) )
            // InternalRangoMode.g:4495:1: ( ( ruleDrops )? )
            {
            // InternalRangoMode.g:4495:1: ( ( ruleDrops )? )
            // InternalRangoMode.g:4496:2: ( ruleDrops )?
            {
             before(grammarAccess.getGameModeAccess().getDropsParserRuleCall_9()); 
            // InternalRangoMode.g:4497:2: ( ruleDrops )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==87) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:4497:3: ruleDrops
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
    // InternalRangoMode.g:4505:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl rule__GameMode__Group__11 ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4509:1: ( rule__GameMode__Group__10__Impl rule__GameMode__Group__11 )
            // InternalRangoMode.g:4510:2: rule__GameMode__Group__10__Impl rule__GameMode__Group__11
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
    // InternalRangoMode.g:4517:1: rule__GameMode__Group__10__Impl : ( ( rule__GameMode__Group_10__0 )? ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4521:1: ( ( ( rule__GameMode__Group_10__0 )? ) )
            // InternalRangoMode.g:4522:1: ( ( rule__GameMode__Group_10__0 )? )
            {
            // InternalRangoMode.g:4522:1: ( ( rule__GameMode__Group_10__0 )? )
            // InternalRangoMode.g:4523:2: ( rule__GameMode__Group_10__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_10()); 
            // InternalRangoMode.g:4524:2: ( rule__GameMode__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==57) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRangoMode.g:4524:3: rule__GameMode__Group_10__0
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
    // InternalRangoMode.g:4532:1: rule__GameMode__Group__11 : rule__GameMode__Group__11__Impl rule__GameMode__Group__12 ;
    public final void rule__GameMode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4536:1: ( rule__GameMode__Group__11__Impl rule__GameMode__Group__12 )
            // InternalRangoMode.g:4537:2: rule__GameMode__Group__11__Impl rule__GameMode__Group__12
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4544:1: rule__GameMode__Group__11__Impl : ( 'lose' ) ;
    public final void rule__GameMode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4548:1: ( ( 'lose' ) )
            // InternalRangoMode.g:4549:1: ( 'lose' )
            {
            // InternalRangoMode.g:4549:1: ( 'lose' )
            // InternalRangoMode.g:4550:2: 'lose'
            {
             before(grammarAccess.getGameModeAccess().getLoseKeyword_11()); 
            match(input,53,FOLLOW_2); 
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
    // InternalRangoMode.g:4559:1: rule__GameMode__Group__12 : rule__GameMode__Group__12__Impl rule__GameMode__Group__13 ;
    public final void rule__GameMode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4563:1: ( rule__GameMode__Group__12__Impl rule__GameMode__Group__13 )
            // InternalRangoMode.g:4564:2: rule__GameMode__Group__12__Impl rule__GameMode__Group__13
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4571:1: rule__GameMode__Group__12__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4575:1: ( ( 'when' ) )
            // InternalRangoMode.g:4576:1: ( 'when' )
            {
            // InternalRangoMode.g:4576:1: ( 'when' )
            // InternalRangoMode.g:4577:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_12()); 
            match(input,54,FOLLOW_2); 
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
    // InternalRangoMode.g:4586:1: rule__GameMode__Group__13 : rule__GameMode__Group__13__Impl rule__GameMode__Group__14 ;
    public final void rule__GameMode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4590:1: ( rule__GameMode__Group__13__Impl rule__GameMode__Group__14 )
            // InternalRangoMode.g:4591:2: rule__GameMode__Group__13__Impl rule__GameMode__Group__14
            {
            pushFollow(FOLLOW_39);
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
    // InternalRangoMode.g:4598:1: rule__GameMode__Group__13__Impl : ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) ;
    public final void rule__GameMode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4602:1: ( ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) )
            // InternalRangoMode.g:4603:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            {
            // InternalRangoMode.g:4603:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            // InternalRangoMode.g:4604:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_13()); 
            // InternalRangoMode.g:4605:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            // InternalRangoMode.g:4605:3: rule__GameMode__LoseConditionsAssignment_13
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
    // InternalRangoMode.g:4613:1: rule__GameMode__Group__14 : rule__GameMode__Group__14__Impl rule__GameMode__Group__15 ;
    public final void rule__GameMode__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4617:1: ( rule__GameMode__Group__14__Impl rule__GameMode__Group__15 )
            // InternalRangoMode.g:4618:2: rule__GameMode__Group__14__Impl rule__GameMode__Group__15
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
    // InternalRangoMode.g:4625:1: rule__GameMode__Group__14__Impl : ( ( rule__GameMode__Group_14__0 )* ) ;
    public final void rule__GameMode__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4629:1: ( ( ( rule__GameMode__Group_14__0 )* ) )
            // InternalRangoMode.g:4630:1: ( ( rule__GameMode__Group_14__0 )* )
            {
            // InternalRangoMode.g:4630:1: ( ( rule__GameMode__Group_14__0 )* )
            // InternalRangoMode.g:4631:2: ( rule__GameMode__Group_14__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_14()); 
            // InternalRangoMode.g:4632:2: ( rule__GameMode__Group_14__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRangoMode.g:4632:3: rule__GameMode__Group_14__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__GameMode__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRangoMode.g:4640:1: rule__GameMode__Group__15 : rule__GameMode__Group__15__Impl ;
    public final void rule__GameMode__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4644:1: ( rule__GameMode__Group__15__Impl )
            // InternalRangoMode.g:4645:2: rule__GameMode__Group__15__Impl
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
    // InternalRangoMode.g:4651:1: rule__GameMode__Group__15__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4655:1: ( ( '}' ) )
            // InternalRangoMode.g:4656:1: ( '}' )
            {
            // InternalRangoMode.g:4656:1: ( '}' )
            // InternalRangoMode.g:4657:2: '}'
            {
             before(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:4667:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4671:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4672:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:4679:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4683:1: ( ( 'description' ) )
            // InternalRangoMode.g:4684:1: ( 'description' )
            {
            // InternalRangoMode.g:4684:1: ( 'description' )
            // InternalRangoMode.g:4685:2: 'description'
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
    // InternalRangoMode.g:4694:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4698:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4699:2: rule__GameMode__Group_4__1__Impl
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
    // InternalRangoMode.g:4705:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4709:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4710:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4710:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4711:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4712:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4712:3: rule__GameMode__DescriptionAssignment_4_1
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
    // InternalRangoMode.g:4721:1: rule__GameMode__Group_7_0__0 : rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 ;
    public final void rule__GameMode__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4725:1: ( rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 )
            // InternalRangoMode.g:4726:2: rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:4733:1: rule__GameMode__Group_7_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4737:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:4738:1: ( 'gravity' )
            {
            // InternalRangoMode.g:4738:1: ( 'gravity' )
            // InternalRangoMode.g:4739:2: 'gravity'
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
    // InternalRangoMode.g:4748:1: rule__GameMode__Group_7_0__1 : rule__GameMode__Group_7_0__1__Impl ;
    public final void rule__GameMode__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4752:1: ( rule__GameMode__Group_7_0__1__Impl )
            // InternalRangoMode.g:4753:2: rule__GameMode__Group_7_0__1__Impl
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
    // InternalRangoMode.g:4759:1: rule__GameMode__Group_7_0__1__Impl : ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) ;
    public final void rule__GameMode__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4763:1: ( ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) )
            // InternalRangoMode.g:4764:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            {
            // InternalRangoMode.g:4764:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            // InternalRangoMode.g:4765:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 
            // InternalRangoMode.g:4766:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            // InternalRangoMode.g:4766:3: rule__GameMode__GravityAssignment_7_0_1
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
    // InternalRangoMode.g:4775:1: rule__GameMode__Group_10__0 : rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 ;
    public final void rule__GameMode__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4779:1: ( rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 )
            // InternalRangoMode.g:4780:2: rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4787:1: rule__GameMode__Group_10__0__Impl : ( 'win' ) ;
    public final void rule__GameMode__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4791:1: ( ( 'win' ) )
            // InternalRangoMode.g:4792:1: ( 'win' )
            {
            // InternalRangoMode.g:4792:1: ( 'win' )
            // InternalRangoMode.g:4793:2: 'win'
            {
             before(grammarAccess.getGameModeAccess().getWinKeyword_10_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalRangoMode.g:4802:1: rule__GameMode__Group_10__1 : rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 ;
    public final void rule__GameMode__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4806:1: ( rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 )
            // InternalRangoMode.g:4807:2: rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4814:1: rule__GameMode__Group_10__1__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4818:1: ( ( 'when' ) )
            // InternalRangoMode.g:4819:1: ( 'when' )
            {
            // InternalRangoMode.g:4819:1: ( 'when' )
            // InternalRangoMode.g:4820:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_10_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalRangoMode.g:4829:1: rule__GameMode__Group_10__2 : rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 ;
    public final void rule__GameMode__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4833:1: ( rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 )
            // InternalRangoMode.g:4834:2: rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalRangoMode.g:4841:1: rule__GameMode__Group_10__2__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) ;
    public final void rule__GameMode__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4845:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) )
            // InternalRangoMode.g:4846:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            {
            // InternalRangoMode.g:4846:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            // InternalRangoMode.g:4847:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_2()); 
            // InternalRangoMode.g:4848:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            // InternalRangoMode.g:4848:3: rule__GameMode__WinConditionsAssignment_10_2
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
    // InternalRangoMode.g:4856:1: rule__GameMode__Group_10__3 : rule__GameMode__Group_10__3__Impl ;
    public final void rule__GameMode__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4860:1: ( rule__GameMode__Group_10__3__Impl )
            // InternalRangoMode.g:4861:2: rule__GameMode__Group_10__3__Impl
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
    // InternalRangoMode.g:4867:1: rule__GameMode__Group_10__3__Impl : ( ( rule__GameMode__Group_10_3__0 )* ) ;
    public final void rule__GameMode__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4871:1: ( ( ( rule__GameMode__Group_10_3__0 )* ) )
            // InternalRangoMode.g:4872:1: ( ( rule__GameMode__Group_10_3__0 )* )
            {
            // InternalRangoMode.g:4872:1: ( ( rule__GameMode__Group_10_3__0 )* )
            // InternalRangoMode.g:4873:2: ( rule__GameMode__Group_10_3__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_10_3()); 
            // InternalRangoMode.g:4874:2: ( rule__GameMode__Group_10_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRangoMode.g:4874:3: rule__GameMode__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__GameMode__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRangoMode.g:4883:1: rule__GameMode__Group_10_3__0 : rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 ;
    public final void rule__GameMode__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4887:1: ( rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 )
            // InternalRangoMode.g:4888:2: rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4895:1: rule__GameMode__Group_10_3__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4899:1: ( ( 'or' ) )
            // InternalRangoMode.g:4900:1: ( 'or' )
            {
            // InternalRangoMode.g:4900:1: ( 'or' )
            // InternalRangoMode.g:4901:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_10_3_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalRangoMode.g:4910:1: rule__GameMode__Group_10_3__1 : rule__GameMode__Group_10_3__1__Impl ;
    public final void rule__GameMode__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4914:1: ( rule__GameMode__Group_10_3__1__Impl )
            // InternalRangoMode.g:4915:2: rule__GameMode__Group_10_3__1__Impl
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
    // InternalRangoMode.g:4921:1: rule__GameMode__Group_10_3__1__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) ;
    public final void rule__GameMode__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4925:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) )
            // InternalRangoMode.g:4926:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            {
            // InternalRangoMode.g:4926:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            // InternalRangoMode.g:4927:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_3_1()); 
            // InternalRangoMode.g:4928:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            // InternalRangoMode.g:4928:3: rule__GameMode__WinConditionsAssignment_10_3_1
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
    // InternalRangoMode.g:4937:1: rule__GameMode__Group_14__0 : rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 ;
    public final void rule__GameMode__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4941:1: ( rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 )
            // InternalRangoMode.g:4942:2: rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4949:1: rule__GameMode__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4953:1: ( ( 'or' ) )
            // InternalRangoMode.g:4954:1: ( 'or' )
            {
            // InternalRangoMode.g:4954:1: ( 'or' )
            // InternalRangoMode.g:4955:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_14_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalRangoMode.g:4964:1: rule__GameMode__Group_14__1 : rule__GameMode__Group_14__1__Impl ;
    public final void rule__GameMode__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4968:1: ( rule__GameMode__Group_14__1__Impl )
            // InternalRangoMode.g:4969:2: rule__GameMode__Group_14__1__Impl
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
    // InternalRangoMode.g:4975:1: rule__GameMode__Group_14__1__Impl : ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) ;
    public final void rule__GameMode__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4979:1: ( ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) )
            // InternalRangoMode.g:4980:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            {
            // InternalRangoMode.g:4980:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            // InternalRangoMode.g:4981:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14_1()); 
            // InternalRangoMode.g:4982:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            // InternalRangoMode.g:4982:3: rule__GameMode__LoseConditionsAssignment_14_1
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
    // InternalRangoMode.g:4991:1: rule__SingleLevel__Group__0 : rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 ;
    public final void rule__SingleLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4995:1: ( rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 )
            // InternalRangoMode.g:4996:2: rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalRangoMode.g:5003:1: rule__SingleLevel__Group__0__Impl : ( ( rule__SingleLevel__ArenaAssignment_0 ) ) ;
    public final void rule__SingleLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5007:1: ( ( ( rule__SingleLevel__ArenaAssignment_0 ) ) )
            // InternalRangoMode.g:5008:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            {
            // InternalRangoMode.g:5008:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            // InternalRangoMode.g:5009:2: ( rule__SingleLevel__ArenaAssignment_0 )
            {
             before(grammarAccess.getSingleLevelAccess().getArenaAssignment_0()); 
            // InternalRangoMode.g:5010:2: ( rule__SingleLevel__ArenaAssignment_0 )
            // InternalRangoMode.g:5010:3: rule__SingleLevel__ArenaAssignment_0
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
    // InternalRangoMode.g:5018:1: rule__SingleLevel__Group__1 : rule__SingleLevel__Group__1__Impl ;
    public final void rule__SingleLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5022:1: ( rule__SingleLevel__Group__1__Impl )
            // InternalRangoMode.g:5023:2: rule__SingleLevel__Group__1__Impl
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
    // InternalRangoMode.g:5029:1: rule__SingleLevel__Group__1__Impl : ( ( rule__SingleLevel__SpawningAssignment_1 ) ) ;
    public final void rule__SingleLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5033:1: ( ( ( rule__SingleLevel__SpawningAssignment_1 ) ) )
            // InternalRangoMode.g:5034:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            {
            // InternalRangoMode.g:5034:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            // InternalRangoMode.g:5035:2: ( rule__SingleLevel__SpawningAssignment_1 )
            {
             before(grammarAccess.getSingleLevelAccess().getSpawningAssignment_1()); 
            // InternalRangoMode.g:5036:2: ( rule__SingleLevel__SpawningAssignment_1 )
            // InternalRangoMode.g:5036:3: rule__SingleLevel__SpawningAssignment_1
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
    // InternalRangoMode.g:5045:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5049:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRangoMode.g:5050:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalRangoMode.g:5057:1: rule__Level__Group__0__Impl : ( 'level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5061:1: ( ( 'level' ) )
            // InternalRangoMode.g:5062:1: ( 'level' )
            {
            // InternalRangoMode.g:5062:1: ( 'level' )
            // InternalRangoMode.g:5063:2: 'level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalRangoMode.g:5072:1: rule__Level__Group__1 : rule__Level__Group__1__Impl rule__Level__Group__2 ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5076:1: ( rule__Level__Group__1__Impl rule__Level__Group__2 )
            // InternalRangoMode.g:5077:2: rule__Level__Group__1__Impl rule__Level__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalRangoMode.g:5084:1: rule__Level__Group__1__Impl : ( ( rule__Level__TitleAssignment_1 )? ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5088:1: ( ( ( rule__Level__TitleAssignment_1 )? ) )
            // InternalRangoMode.g:5089:1: ( ( rule__Level__TitleAssignment_1 )? )
            {
            // InternalRangoMode.g:5089:1: ( ( rule__Level__TitleAssignment_1 )? )
            // InternalRangoMode.g:5090:2: ( rule__Level__TitleAssignment_1 )?
            {
             before(grammarAccess.getLevelAccess().getTitleAssignment_1()); 
            // InternalRangoMode.g:5091:2: ( rule__Level__TitleAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:5091:3: rule__Level__TitleAssignment_1
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
    // InternalRangoMode.g:5099:1: rule__Level__Group__2 : rule__Level__Group__2__Impl rule__Level__Group__3 ;
    public final void rule__Level__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5103:1: ( rule__Level__Group__2__Impl rule__Level__Group__3 )
            // InternalRangoMode.g:5104:2: rule__Level__Group__2__Impl rule__Level__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalRangoMode.g:5111:1: rule__Level__Group__2__Impl : ( '{' ) ;
    public final void rule__Level__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5115:1: ( ( '{' ) )
            // InternalRangoMode.g:5116:1: ( '{' )
            {
            // InternalRangoMode.g:5116:1: ( '{' )
            // InternalRangoMode.g:5117:2: '{'
            {
             before(grammarAccess.getLevelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:5126:1: rule__Level__Group__3 : rule__Level__Group__3__Impl rule__Level__Group__4 ;
    public final void rule__Level__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5130:1: ( rule__Level__Group__3__Impl rule__Level__Group__4 )
            // InternalRangoMode.g:5131:2: rule__Level__Group__3__Impl rule__Level__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalRangoMode.g:5138:1: rule__Level__Group__3__Impl : ( ( rule__Level__ArenaAssignment_3 ) ) ;
    public final void rule__Level__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5142:1: ( ( ( rule__Level__ArenaAssignment_3 ) ) )
            // InternalRangoMode.g:5143:1: ( ( rule__Level__ArenaAssignment_3 ) )
            {
            // InternalRangoMode.g:5143:1: ( ( rule__Level__ArenaAssignment_3 ) )
            // InternalRangoMode.g:5144:2: ( rule__Level__ArenaAssignment_3 )
            {
             before(grammarAccess.getLevelAccess().getArenaAssignment_3()); 
            // InternalRangoMode.g:5145:2: ( rule__Level__ArenaAssignment_3 )
            // InternalRangoMode.g:5145:3: rule__Level__ArenaAssignment_3
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
    // InternalRangoMode.g:5153:1: rule__Level__Group__4 : rule__Level__Group__4__Impl rule__Level__Group__5 ;
    public final void rule__Level__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5157:1: ( rule__Level__Group__4__Impl rule__Level__Group__5 )
            // InternalRangoMode.g:5158:2: rule__Level__Group__4__Impl rule__Level__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:5165:1: rule__Level__Group__4__Impl : ( ( rule__Level__SpawningAssignment_4 ) ) ;
    public final void rule__Level__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5169:1: ( ( ( rule__Level__SpawningAssignment_4 ) ) )
            // InternalRangoMode.g:5170:1: ( ( rule__Level__SpawningAssignment_4 ) )
            {
            // InternalRangoMode.g:5170:1: ( ( rule__Level__SpawningAssignment_4 ) )
            // InternalRangoMode.g:5171:2: ( rule__Level__SpawningAssignment_4 )
            {
             before(grammarAccess.getLevelAccess().getSpawningAssignment_4()); 
            // InternalRangoMode.g:5172:2: ( rule__Level__SpawningAssignment_4 )
            // InternalRangoMode.g:5172:3: rule__Level__SpawningAssignment_4
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
    // InternalRangoMode.g:5180:1: rule__Level__Group__5 : rule__Level__Group__5__Impl ;
    public final void rule__Level__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5184:1: ( rule__Level__Group__5__Impl )
            // InternalRangoMode.g:5185:2: rule__Level__Group__5__Impl
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
    // InternalRangoMode.g:5191:1: rule__Level__Group__5__Impl : ( '}' ) ;
    public final void rule__Level__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5195:1: ( ( '}' ) )
            // InternalRangoMode.g:5196:1: ( '}' )
            {
            // InternalRangoMode.g:5196:1: ( '}' )
            // InternalRangoMode.g:5197:2: '}'
            {
             before(grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:5207:1: rule__SpeedBonus__Group__0 : rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 ;
    public final void rule__SpeedBonus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5211:1: ( rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 )
            // InternalRangoMode.g:5212:2: rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRangoMode.g:5219:1: rule__SpeedBonus__Group__0__Impl : ( () ) ;
    public final void rule__SpeedBonus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5223:1: ( ( () ) )
            // InternalRangoMode.g:5224:1: ( () )
            {
            // InternalRangoMode.g:5224:1: ( () )
            // InternalRangoMode.g:5225:2: ()
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 
            // InternalRangoMode.g:5226:2: ()
            // InternalRangoMode.g:5226:3: 
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
    // InternalRangoMode.g:5234:1: rule__SpeedBonus__Group__1 : rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 ;
    public final void rule__SpeedBonus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5238:1: ( rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 )
            // InternalRangoMode.g:5239:2: rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:5246:1: rule__SpeedBonus__Group__1__Impl : ( 'speed' ) ;
    public final void rule__SpeedBonus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5250:1: ( ( 'speed' ) )
            // InternalRangoMode.g:5251:1: ( 'speed' )
            {
            // InternalRangoMode.g:5251:1: ( 'speed' )
            // InternalRangoMode.g:5252:2: 'speed'
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
    // InternalRangoMode.g:5261:1: rule__SpeedBonus__Group__2 : rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 ;
    public final void rule__SpeedBonus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5265:1: ( rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 )
            // InternalRangoMode.g:5266:2: rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5273:1: rule__SpeedBonus__Group__2__Impl : ( 'bonus' ) ;
    public final void rule__SpeedBonus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5277:1: ( ( 'bonus' ) )
            // InternalRangoMode.g:5278:1: ( 'bonus' )
            {
            // InternalRangoMode.g:5278:1: ( 'bonus' )
            // InternalRangoMode.g:5279:2: 'bonus'
            {
             before(grammarAccess.getSpeedBonusAccess().getBonusKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalRangoMode.g:5288:1: rule__SpeedBonus__Group__3 : rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 ;
    public final void rule__SpeedBonus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5292:1: ( rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 )
            // InternalRangoMode.g:5293:2: rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5300:1: rule__SpeedBonus__Group__3__Impl : ( ( rule__SpeedBonus__Group_3__0 )? ) ;
    public final void rule__SpeedBonus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5304:1: ( ( ( rule__SpeedBonus__Group_3__0 )? ) )
            // InternalRangoMode.g:5305:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            {
            // InternalRangoMode.g:5305:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            // InternalRangoMode.g:5306:2: ( rule__SpeedBonus__Group_3__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_3()); 
            // InternalRangoMode.g:5307:2: ( rule__SpeedBonus__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==61) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:5307:3: rule__SpeedBonus__Group_3__0
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
    // InternalRangoMode.g:5315:1: rule__SpeedBonus__Group__4 : rule__SpeedBonus__Group__4__Impl ;
    public final void rule__SpeedBonus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5319:1: ( rule__SpeedBonus__Group__4__Impl )
            // InternalRangoMode.g:5320:2: rule__SpeedBonus__Group__4__Impl
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
    // InternalRangoMode.g:5326:1: rule__SpeedBonus__Group__4__Impl : ( ( rule__SpeedBonus__Group_4__0 )? ) ;
    public final void rule__SpeedBonus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5330:1: ( ( ( rule__SpeedBonus__Group_4__0 )? ) )
            // InternalRangoMode.g:5331:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            {
            // InternalRangoMode.g:5331:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            // InternalRangoMode.g:5332:2: ( rule__SpeedBonus__Group_4__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_4()); 
            // InternalRangoMode.g:5333:2: ( rule__SpeedBonus__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:5333:3: rule__SpeedBonus__Group_4__0
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
    // InternalRangoMode.g:5342:1: rule__SpeedBonus__Group_3__0 : rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 ;
    public final void rule__SpeedBonus__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5346:1: ( rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 )
            // InternalRangoMode.g:5347:2: rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalRangoMode.g:5354:1: rule__SpeedBonus__Group_3__0__Impl : ( 'up' ) ;
    public final void rule__SpeedBonus__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5358:1: ( ( 'up' ) )
            // InternalRangoMode.g:5359:1: ( 'up' )
            {
            // InternalRangoMode.g:5359:1: ( 'up' )
            // InternalRangoMode.g:5360:2: 'up'
            {
             before(grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalRangoMode.g:5369:1: rule__SpeedBonus__Group_3__1 : rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 ;
    public final void rule__SpeedBonus__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5373:1: ( rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 )
            // InternalRangoMode.g:5374:2: rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:5381:1: rule__SpeedBonus__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__SpeedBonus__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5385:1: ( ( 'to' ) )
            // InternalRangoMode.g:5386:1: ( 'to' )
            {
            // InternalRangoMode.g:5386:1: ( 'to' )
            // InternalRangoMode.g:5387:2: 'to'
            {
             before(grammarAccess.getSpeedBonusAccess().getToKeyword_3_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalRangoMode.g:5396:1: rule__SpeedBonus__Group_3__2 : rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 ;
    public final void rule__SpeedBonus__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5400:1: ( rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 )
            // InternalRangoMode.g:5401:2: rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5408:1: rule__SpeedBonus__Group_3__2__Impl : ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) ;
    public final void rule__SpeedBonus__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5412:1: ( ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) )
            // InternalRangoMode.g:5413:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            {
            // InternalRangoMode.g:5413:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            // InternalRangoMode.g:5414:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 
            // InternalRangoMode.g:5415:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            // InternalRangoMode.g:5415:3: rule__SpeedBonus__MaxFactorAssignment_3_2
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
    // InternalRangoMode.g:5423:1: rule__SpeedBonus__Group_3__3 : rule__SpeedBonus__Group_3__3__Impl ;
    public final void rule__SpeedBonus__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5427:1: ( rule__SpeedBonus__Group_3__3__Impl )
            // InternalRangoMode.g:5428:2: rule__SpeedBonus__Group_3__3__Impl
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
    // InternalRangoMode.g:5434:1: rule__SpeedBonus__Group_3__3__Impl : ( 'times' ) ;
    public final void rule__SpeedBonus__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5438:1: ( ( 'times' ) )
            // InternalRangoMode.g:5439:1: ( 'times' )
            {
            // InternalRangoMode.g:5439:1: ( 'times' )
            // InternalRangoMode.g:5440:2: 'times'
            {
             before(grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3()); 
            match(input,63,FOLLOW_2); 
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
    // InternalRangoMode.g:5450:1: rule__SpeedBonus__Group_4__0 : rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 ;
    public final void rule__SpeedBonus__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5454:1: ( rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 )
            // InternalRangoMode.g:5455:2: rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:5462:1: rule__SpeedBonus__Group_4__0__Impl : ( 'over' ) ;
    public final void rule__SpeedBonus__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5466:1: ( ( 'over' ) )
            // InternalRangoMode.g:5467:1: ( 'over' )
            {
            // InternalRangoMode.g:5467:1: ( 'over' )
            // InternalRangoMode.g:5468:2: 'over'
            {
             before(grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalRangoMode.g:5477:1: rule__SpeedBonus__Group_4__1 : rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 ;
    public final void rule__SpeedBonus__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5481:1: ( rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 )
            // InternalRangoMode.g:5482:2: rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:5489:1: rule__SpeedBonus__Group_4__1__Impl : ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) ;
    public final void rule__SpeedBonus__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5493:1: ( ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) )
            // InternalRangoMode.g:5494:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            {
            // InternalRangoMode.g:5494:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            // InternalRangoMode.g:5495:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 
            // InternalRangoMode.g:5496:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            // InternalRangoMode.g:5496:3: rule__SpeedBonus__DurationAssignment_4_1
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
    // InternalRangoMode.g:5504:1: rule__SpeedBonus__Group_4__2 : rule__SpeedBonus__Group_4__2__Impl ;
    public final void rule__SpeedBonus__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5508:1: ( rule__SpeedBonus__Group_4__2__Impl )
            // InternalRangoMode.g:5509:2: rule__SpeedBonus__Group_4__2__Impl
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
    // InternalRangoMode.g:5515:1: rule__SpeedBonus__Group_4__2__Impl : ( 's' ) ;
    public final void rule__SpeedBonus__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5519:1: ( ( 's' ) )
            // InternalRangoMode.g:5520:1: ( 's' )
            {
            // InternalRangoMode.g:5520:1: ( 's' )
            // InternalRangoMode.g:5521:2: 's'
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
    // InternalRangoMode.g:5531:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5535:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5536:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:5543:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5547:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5548:1: ( 'arena' )
            {
            // InternalRangoMode.g:5548:1: ( 'arena' )
            // InternalRangoMode.g:5549:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalRangoMode.g:5558:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5562:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5563:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5570:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5574:1: ( ( '{' ) )
            // InternalRangoMode.g:5575:1: ( '{' )
            {
            // InternalRangoMode.g:5575:1: ( '{' )
            // InternalRangoMode.g:5576:2: '{'
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
    // InternalRangoMode.g:5585:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5589:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5590:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRangoMode.g:5597:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5601:1: ( ( 'background' ) )
            // InternalRangoMode.g:5602:1: ( 'background' )
            {
            // InternalRangoMode.g:5602:1: ( 'background' )
            // InternalRangoMode.g:5603:2: 'background'
            {
             before(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalRangoMode.g:5612:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5616:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5617:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalRangoMode.g:5624:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5628:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5629:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5629:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5630:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5631:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5631:3: rule__Arena__BackgroundAssignment_3
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
    // InternalRangoMode.g:5639:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5643:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5644:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5651:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__UnorderedGroup_4 ) ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5655:1: ( ( ( rule__Arena__UnorderedGroup_4 ) ) )
            // InternalRangoMode.g:5656:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            {
            // InternalRangoMode.g:5656:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            // InternalRangoMode.g:5657:2: ( rule__Arena__UnorderedGroup_4 )
            {
             before(grammarAccess.getArenaAccess().getUnorderedGroup_4()); 
            // InternalRangoMode.g:5658:2: ( rule__Arena__UnorderedGroup_4 )
            // InternalRangoMode.g:5658:3: rule__Arena__UnorderedGroup_4
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
    // InternalRangoMode.g:5666:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5670:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5671:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5678:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5682:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5683:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5683:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5684:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5685:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==73||LA26_0==77||LA26_0==80) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRangoMode.g:5685:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRangoMode.g:5693:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5697:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5698:2: rule__Arena__Group__6__Impl
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
    // InternalRangoMode.g:5704:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5708:1: ( ( '}' ) )
            // InternalRangoMode.g:5709:1: ( '}' )
            {
            // InternalRangoMode.g:5709:1: ( '}' )
            // InternalRangoMode.g:5710:2: '}'
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
    // InternalRangoMode.g:5720:1: rule__Arena__Group_4_0__0 : rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 ;
    public final void rule__Arena__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5724:1: ( rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 )
            // InternalRangoMode.g:5725:2: rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:5732:1: rule__Arena__Group_4_0__0__Impl : ( 'floor' ) ;
    public final void rule__Arena__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5736:1: ( ( 'floor' ) )
            // InternalRangoMode.g:5737:1: ( 'floor' )
            {
            // InternalRangoMode.g:5737:1: ( 'floor' )
            // InternalRangoMode.g:5738:2: 'floor'
            {
             before(grammarAccess.getArenaAccess().getFloorKeyword_4_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:5747:1: rule__Arena__Group_4_0__1 : rule__Arena__Group_4_0__1__Impl ;
    public final void rule__Arena__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5751:1: ( rule__Arena__Group_4_0__1__Impl )
            // InternalRangoMode.g:5752:2: rule__Arena__Group_4_0__1__Impl
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
    // InternalRangoMode.g:5758:1: rule__Arena__Group_4_0__1__Impl : ( ( rule__Arena__FloorAssignment_4_0_1 ) ) ;
    public final void rule__Arena__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5762:1: ( ( ( rule__Arena__FloorAssignment_4_0_1 ) ) )
            // InternalRangoMode.g:5763:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            {
            // InternalRangoMode.g:5763:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            // InternalRangoMode.g:5764:2: ( rule__Arena__FloorAssignment_4_0_1 )
            {
             before(grammarAccess.getArenaAccess().getFloorAssignment_4_0_1()); 
            // InternalRangoMode.g:5765:2: ( rule__Arena__FloorAssignment_4_0_1 )
            // InternalRangoMode.g:5765:3: rule__Arena__FloorAssignment_4_0_1
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
    // InternalRangoMode.g:5774:1: rule__Arena__Group_4_1__0 : rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 ;
    public final void rule__Arena__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5778:1: ( rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 )
            // InternalRangoMode.g:5779:2: rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:5786:1: rule__Arena__Group_4_1__0__Impl : ( 'walls' ) ;
    public final void rule__Arena__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5790:1: ( ( 'walls' ) )
            // InternalRangoMode.g:5791:1: ( 'walls' )
            {
            // InternalRangoMode.g:5791:1: ( 'walls' )
            // InternalRangoMode.g:5792:2: 'walls'
            {
             before(grammarAccess.getArenaAccess().getWallsKeyword_4_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalRangoMode.g:5801:1: rule__Arena__Group_4_1__1 : rule__Arena__Group_4_1__1__Impl ;
    public final void rule__Arena__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5805:1: ( rule__Arena__Group_4_1__1__Impl )
            // InternalRangoMode.g:5806:2: rule__Arena__Group_4_1__1__Impl
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
    // InternalRangoMode.g:5812:1: rule__Arena__Group_4_1__1__Impl : ( ( rule__Arena__WallsAssignment_4_1_1 ) ) ;
    public final void rule__Arena__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5816:1: ( ( ( rule__Arena__WallsAssignment_4_1_1 ) ) )
            // InternalRangoMode.g:5817:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            {
            // InternalRangoMode.g:5817:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            // InternalRangoMode.g:5818:2: ( rule__Arena__WallsAssignment_4_1_1 )
            {
             before(grammarAccess.getArenaAccess().getWallsAssignment_4_1_1()); 
            // InternalRangoMode.g:5819:2: ( rule__Arena__WallsAssignment_4_1_1 )
            // InternalRangoMode.g:5819:3: rule__Arena__WallsAssignment_4_1_1
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
    // InternalRangoMode.g:5828:1: rule__Arena__Group_4_2__0 : rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 ;
    public final void rule__Arena__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5832:1: ( rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 )
            // InternalRangoMode.g:5833:2: rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalRangoMode.g:5840:1: rule__Arena__Group_4_2__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5844:1: ( ( 'player' ) )
            // InternalRangoMode.g:5845:1: ( 'player' )
            {
            // InternalRangoMode.g:5845:1: ( 'player' )
            // InternalRangoMode.g:5846:2: 'player'
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
    // InternalRangoMode.g:5855:1: rule__Arena__Group_4_2__1 : rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 ;
    public final void rule__Arena__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5859:1: ( rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 )
            // InternalRangoMode.g:5860:2: rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:5867:1: rule__Arena__Group_4_2__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5871:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5872:1: ( 'starts' )
            {
            // InternalRangoMode.g:5872:1: ( 'starts' )
            // InternalRangoMode.g:5873:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_2_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:5882:1: rule__Arena__Group_4_2__2 : rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 ;
    public final void rule__Arena__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5886:1: ( rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 )
            // InternalRangoMode.g:5887:2: rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:5894:1: rule__Arena__Group_4_2__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5898:1: ( ( 'at' ) )
            // InternalRangoMode.g:5899:1: ( 'at' )
            {
            // InternalRangoMode.g:5899:1: ( 'at' )
            // InternalRangoMode.g:5900:2: 'at'
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
    // InternalRangoMode.g:5909:1: rule__Arena__Group_4_2__3 : rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 ;
    public final void rule__Arena__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5913:1: ( rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 )
            // InternalRangoMode.g:5914:2: rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:5921:1: rule__Arena__Group_4_2__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) ;
    public final void rule__Arena__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5925:1: ( ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) )
            // InternalRangoMode.g:5926:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            {
            // InternalRangoMode.g:5926:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            // InternalRangoMode.g:5927:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_2_3()); 
            // InternalRangoMode.g:5928:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            // InternalRangoMode.g:5928:3: rule__Arena__PlayerStartAssignment_4_2_3
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
    // InternalRangoMode.g:5936:1: rule__Arena__Group_4_2__4 : rule__Arena__Group_4_2__4__Impl ;
    public final void rule__Arena__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5940:1: ( rule__Arena__Group_4_2__4__Impl )
            // InternalRangoMode.g:5941:2: rule__Arena__Group_4_2__4__Impl
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
    // InternalRangoMode.g:5947:1: rule__Arena__Group_4_2__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5951:1: ( ( '%' ) )
            // InternalRangoMode.g:5952:1: ( '%' )
            {
            // InternalRangoMode.g:5952:1: ( '%' )
            // InternalRangoMode.g:5953:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:5963:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5967:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5968:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:5975:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5979:1: ( ( 'at' ) )
            // InternalRangoMode.g:5980:1: ( 'at' )
            {
            // InternalRangoMode.g:5980:1: ( 'at' )
            // InternalRangoMode.g:5981:2: 'at'
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
    // InternalRangoMode.g:5990:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5994:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5995:2: rule__At__Group__1__Impl rule__At__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:6002:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6006:1: ( ( '(' ) )
            // InternalRangoMode.g:6007:1: ( '(' )
            {
            // InternalRangoMode.g:6007:1: ( '(' )
            // InternalRangoMode.g:6008:2: '('
            {
             before(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:6017:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6021:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:6022:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:6029:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6033:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:6034:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:6034:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:6035:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:6036:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:6036:3: rule__At__XAssignment_2
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
    // InternalRangoMode.g:6044:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6048:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:6049:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:6056:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6060:1: ( ( '%' ) )
            // InternalRangoMode.g:6061:1: ( '%' )
            {
            // InternalRangoMode.g:6061:1: ( '%' )
            // InternalRangoMode.g:6062:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:6071:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6075:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:6076:2: rule__At__Group__4__Impl rule__At__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:6083:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6087:1: ( ( ',' ) )
            // InternalRangoMode.g:6088:1: ( ',' )
            {
            // InternalRangoMode.g:6088:1: ( ',' )
            // InternalRangoMode.g:6089:2: ','
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
    // InternalRangoMode.g:6098:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6102:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:6103:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:6110:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6114:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:6115:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:6115:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:6116:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:6117:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:6117:3: rule__At__YAssignment_5
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
    // InternalRangoMode.g:6125:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6129:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:6130:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_57);
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
    // InternalRangoMode.g:6137:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6141:1: ( ( '%' ) )
            // InternalRangoMode.g:6142:1: ( '%' )
            {
            // InternalRangoMode.g:6142:1: ( '%' )
            // InternalRangoMode.g:6143:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:6152:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6156:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:6157:2: rule__At__Group__7__Impl
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
    // InternalRangoMode.g:6163:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6167:1: ( ( ')' ) )
            // InternalRangoMode.g:6168:1: ( ')' )
            {
            // InternalRangoMode.g:6168:1: ( ')' )
            // InternalRangoMode.g:6169:2: ')'
            {
             before(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 
            match(input,72,FOLLOW_2); 
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
    // InternalRangoMode.g:6179:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6183:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:6184:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRangoMode.g:6191:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6195:1: ( ( 'block' ) )
            // InternalRangoMode.g:6196:1: ( 'block' )
            {
            // InternalRangoMode.g:6196:1: ( 'block' )
            // InternalRangoMode.g:6197:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:6206:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6210:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:6211:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:6218:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6222:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6223:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6223:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:6224:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6225:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:6225:3: rule__Block__NameAssignment_1
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
    // InternalRangoMode.g:6233:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6237:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:6238:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_58);
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
    // InternalRangoMode.g:6245:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6249:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6250:1: ( ruleAt )
            {
            // InternalRangoMode.g:6250:1: ( ruleAt )
            // InternalRangoMode.g:6251:2: ruleAt
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
    // InternalRangoMode.g:6260:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6264:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:6265:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:6272:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6276:1: ( ( 'size' ) )
            // InternalRangoMode.g:6277:1: ( 'size' )
            {
            // InternalRangoMode.g:6277:1: ( 'size' )
            // InternalRangoMode.g:6278:2: 'size'
            {
             before(grammarAccess.getBlockAccess().getSizeKeyword_3()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:6287:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6291:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:6292:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:6299:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6303:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:6304:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:6304:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:6305:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:6306:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:6306:3: rule__Block__WidthAssignment_4
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
    // InternalRangoMode.g:6314:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6318:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:6319:2: rule__Block__Group__5__Impl rule__Block__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:6326:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6330:1: ( ( 'by' ) )
            // InternalRangoMode.g:6331:1: ( 'by' )
            {
            // InternalRangoMode.g:6331:1: ( 'by' )
            // InternalRangoMode.g:6332:2: 'by'
            {
             before(grammarAccess.getBlockAccess().getByKeyword_5()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:6341:1: rule__Block__Group__6 : rule__Block__Group__6__Impl rule__Block__Group__7 ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6345:1: ( rule__Block__Group__6__Impl rule__Block__Group__7 )
            // InternalRangoMode.g:6346:2: rule__Block__Group__6__Impl rule__Block__Group__7
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:6353:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6357:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:6358:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:6358:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:6359:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:6360:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:6360:3: rule__Block__HeightAssignment_6
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
    // InternalRangoMode.g:6368:1: rule__Block__Group__7 : rule__Block__Group__7__Impl ;
    public final void rule__Block__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6372:1: ( rule__Block__Group__7__Impl )
            // InternalRangoMode.g:6373:2: rule__Block__Group__7__Impl
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
    // InternalRangoMode.g:6379:1: rule__Block__Group__7__Impl : ( ( rule__Block__Group_7__0 )? ) ;
    public final void rule__Block__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6383:1: ( ( ( rule__Block__Group_7__0 )? ) )
            // InternalRangoMode.g:6384:1: ( ( rule__Block__Group_7__0 )? )
            {
            // InternalRangoMode.g:6384:1: ( ( rule__Block__Group_7__0 )? )
            // InternalRangoMode.g:6385:2: ( rule__Block__Group_7__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_7()); 
            // InternalRangoMode.g:6386:2: ( rule__Block__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==76) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:6386:3: rule__Block__Group_7__0
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
    // InternalRangoMode.g:6395:1: rule__Block__Group_7__0 : rule__Block__Group_7__0__Impl rule__Block__Group_7__1 ;
    public final void rule__Block__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6399:1: ( rule__Block__Group_7__0__Impl rule__Block__Group_7__1 )
            // InternalRangoMode.g:6400:2: rule__Block__Group_7__0__Impl rule__Block__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRangoMode.g:6407:1: rule__Block__Group_7__0__Impl : ( 'of' ) ;
    public final void rule__Block__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6411:1: ( ( 'of' ) )
            // InternalRangoMode.g:6412:1: ( 'of' )
            {
            // InternalRangoMode.g:6412:1: ( 'of' )
            // InternalRangoMode.g:6413:2: 'of'
            {
             before(grammarAccess.getBlockAccess().getOfKeyword_7_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:6422:1: rule__Block__Group_7__1 : rule__Block__Group_7__1__Impl ;
    public final void rule__Block__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6426:1: ( rule__Block__Group_7__1__Impl )
            // InternalRangoMode.g:6427:2: rule__Block__Group_7__1__Impl
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
    // InternalRangoMode.g:6433:1: rule__Block__Group_7__1__Impl : ( ( rule__Block__MaterialAssignment_7_1 ) ) ;
    public final void rule__Block__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6437:1: ( ( ( rule__Block__MaterialAssignment_7_1 ) ) )
            // InternalRangoMode.g:6438:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            {
            // InternalRangoMode.g:6438:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            // InternalRangoMode.g:6439:2: ( rule__Block__MaterialAssignment_7_1 )
            {
             before(grammarAccess.getBlockAccess().getMaterialAssignment_7_1()); 
            // InternalRangoMode.g:6440:2: ( rule__Block__MaterialAssignment_7_1 )
            // InternalRangoMode.g:6440:3: rule__Block__MaterialAssignment_7_1
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
    // InternalRangoMode.g:6449:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6453:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:6454:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
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
    // InternalRangoMode.g:6461:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6465:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6466:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6466:1: ( 'jumppad' )
            // InternalRangoMode.g:6467:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6476:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6480:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6481:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:6488:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6492:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6493:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6493:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6494:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6495:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6495:3: rule__JumpPad__NameAssignment_1
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
    // InternalRangoMode.g:6503:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6507:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6508:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
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
    // InternalRangoMode.g:6515:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6519:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6520:1: ( ruleAt )
            {
            // InternalRangoMode.g:6520:1: ( ruleAt )
            // InternalRangoMode.g:6521:2: ruleAt
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
    // InternalRangoMode.g:6530:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6534:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6535:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:6542:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6546:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6547:1: ( 'launch' )
            {
            // InternalRangoMode.g:6547:1: ( 'launch' )
            // InternalRangoMode.g:6548:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6557:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6561:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6562:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
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
    // InternalRangoMode.g:6569:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6573:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6574:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6574:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6575:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6576:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6576:3: rule__JumpPad__LaunchAssignment_4
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
    // InternalRangoMode.g:6584:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6588:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6589:2: rule__JumpPad__Group__5__Impl
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
    // InternalRangoMode.g:6595:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6599:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6600:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6600:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6601:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6602:2: ( rule__JumpPad__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==79) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:6602:3: rule__JumpPad__Group_5__0
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
    // InternalRangoMode.g:6611:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6615:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6616:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
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
    // InternalRangoMode.g:6623:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6627:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6628:1: ( 'affects' )
            {
            // InternalRangoMode.g:6628:1: ( 'affects' )
            // InternalRangoMode.g:6629:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6638:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6642:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6643:2: rule__JumpPad__Group_5__1__Impl
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
    // InternalRangoMode.g:6649:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6653:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6654:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6654:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6655:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6656:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6656:3: rule__JumpPad__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6665:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6669:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6670:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
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
    // InternalRangoMode.g:6677:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6681:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6682:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6682:1: ( 'teleporter' )
            // InternalRangoMode.g:6683:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:6692:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6696:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6697:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:6704:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6708:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6709:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6709:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6710:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6711:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6711:3: rule__Teleporter__NameAssignment_1
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
    // InternalRangoMode.g:6719:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6723:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6724:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalRangoMode.g:6731:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6735:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6736:1: ( ruleAt )
            {
            // InternalRangoMode.g:6736:1: ( ruleAt )
            // InternalRangoMode.g:6737:2: ruleAt
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
    // InternalRangoMode.g:6746:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6750:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6751:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
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
    // InternalRangoMode.g:6758:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6762:1: ( ( 'to' ) )
            // InternalRangoMode.g:6763:1: ( 'to' )
            {
            // InternalRangoMode.g:6763:1: ( 'to' )
            // InternalRangoMode.g:6764:2: 'to'
            {
             before(grammarAccess.getTeleporterAccess().getToKeyword_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalRangoMode.g:6773:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6777:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6778:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
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
    // InternalRangoMode.g:6785:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6789:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6790:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6790:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6791:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6792:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6792:3: rule__Teleporter__TargetAssignment_4
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
    // InternalRangoMode.g:6800:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6804:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6805:2: rule__Teleporter__Group__5__Impl
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
    // InternalRangoMode.g:6811:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6815:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6816:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6816:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6817:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6818:2: ( rule__Teleporter__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==79) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:6818:3: rule__Teleporter__Group_5__0
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
    // InternalRangoMode.g:6827:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6831:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6832:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
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
    // InternalRangoMode.g:6839:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6843:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6844:1: ( 'affects' )
            {
            // InternalRangoMode.g:6844:1: ( 'affects' )
            // InternalRangoMode.g:6845:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6854:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6858:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6859:2: rule__Teleporter__Group_5__1__Impl
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
    // InternalRangoMode.g:6865:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6869:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6870:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6870:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6871:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6872:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6872:3: rule__Teleporter__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6881:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6885:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6886:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:6893:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6897:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6898:1: ( 'layout' )
            {
            // InternalRangoMode.g:6898:1: ( 'layout' )
            // InternalRangoMode.g:6899:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:6908:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6912:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6913:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
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
    // InternalRangoMode.g:6920:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6924:1: ( ( '{' ) )
            // InternalRangoMode.g:6925:1: ( '{' )
            {
            // InternalRangoMode.g:6925:1: ( '{' )
            // InternalRangoMode.g:6926:2: '{'
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
    // InternalRangoMode.g:6935:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6939:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6940:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:6947:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6951:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6952:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6952:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6953:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6953:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6954:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6955:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6955:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_65);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6958:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6959:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6960:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRangoMode.g:6960:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__FixedLayout__SpawnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalRangoMode.g:6969:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6973:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6974:2: rule__FixedLayout__Group__3__Impl
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
    // InternalRangoMode.g:6980:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6984:1: ( ( '}' ) )
            // InternalRangoMode.g:6985:1: ( '}' )
            {
            // InternalRangoMode.g:6985:1: ( '}' )
            // InternalRangoMode.g:6986:2: '}'
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
    // InternalRangoMode.g:6996:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7000:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:7001:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
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
    // InternalRangoMode.g:7008:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7012:1: ( ( 'waves' ) )
            // InternalRangoMode.g:7013:1: ( 'waves' )
            {
            // InternalRangoMode.g:7013:1: ( 'waves' )
            // InternalRangoMode.g:7014:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:7023:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7027:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:7028:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
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
    // InternalRangoMode.g:7035:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7039:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:7040:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:7040:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:7041:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:7042:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==99) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRangoMode.g:7042:3: rule__WaveSchedule__Group_1__0
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
    // InternalRangoMode.g:7050:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7054:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:7055:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
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
    // InternalRangoMode.g:7062:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7066:1: ( ( '{' ) )
            // InternalRangoMode.g:7067:1: ( '{' )
            {
            // InternalRangoMode.g:7067:1: ( '{' )
            // InternalRangoMode.g:7068:2: '{'
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
    // InternalRangoMode.g:7077:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7081:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:7082:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:7089:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7093:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:7094:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7094:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:7095:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:7095:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:7096:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:7097:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:7097:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_68);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:7100:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:7101:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:7102:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==84) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRangoMode.g:7102:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__WaveSchedule__WavesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalRangoMode.g:7111:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7115:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:7116:2: rule__WaveSchedule__Group__4__Impl
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
    // InternalRangoMode.g:7122:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7126:1: ( ( '}' ) )
            // InternalRangoMode.g:7127:1: ( '}' )
            {
            // InternalRangoMode.g:7127:1: ( '}' )
            // InternalRangoMode.g:7128:2: '}'
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
    // InternalRangoMode.g:7138:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7142:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:7143:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
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
    // InternalRangoMode.g:7150:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7154:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:7155:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:7155:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:7156:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:7157:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:7157:3: rule__WaveSchedule__LoopAssignment_1_0
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
    // InternalRangoMode.g:7165:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7169:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:7170:2: rule__WaveSchedule__Group_1__1__Impl
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
    // InternalRangoMode.g:7176:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7180:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:7181:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:7181:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:7182:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:7183:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==83) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRangoMode.g:7183:3: rule__WaveSchedule__Group_1_1__0
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
    // InternalRangoMode.g:7192:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7196:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:7197:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:7204:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7208:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:7209:1: ( 'escalate' )
            {
            // InternalRangoMode.g:7209:1: ( 'escalate' )
            // InternalRangoMode.g:7210:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRangoMode.g:7219:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7223:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:7224:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:7231:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7235:1: ( ( 'by' ) )
            // InternalRangoMode.g:7236:1: ( 'by' )
            {
            // InternalRangoMode.g:7236:1: ( 'by' )
            // InternalRangoMode.g:7237:2: 'by'
            {
             before(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:7246:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7250:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:7251:2: rule__WaveSchedule__Group_1_1__2__Impl
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
    // InternalRangoMode.g:7257:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7261:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:7262:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:7262:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:7263:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:7264:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:7264:3: rule__WaveSchedule__EscalationAssignment_1_1_2
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
    // InternalRangoMode.g:7273:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7277:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:7278:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
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
    // InternalRangoMode.g:7285:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7289:1: ( ( 'wave' ) )
            // InternalRangoMode.g:7290:1: ( 'wave' )
            {
            // InternalRangoMode.g:7290:1: ( 'wave' )
            // InternalRangoMode.g:7291:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRangoMode.g:7300:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7304:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:7305:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
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
    // InternalRangoMode.g:7312:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7316:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:7317:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:7317:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:7318:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:7319:2: ( rule__Wave__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==85) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:7319:3: rule__Wave__Group_1__0
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
    // InternalRangoMode.g:7327:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7331:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:7332:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
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
    // InternalRangoMode.g:7339:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7343:1: ( ( '{' ) )
            // InternalRangoMode.g:7344:1: ( '{' )
            {
            // InternalRangoMode.g:7344:1: ( '{' )
            // InternalRangoMode.g:7345:2: '{'
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
    // InternalRangoMode.g:7354:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7358:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:7359:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:7366:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7370:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:7371:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7371:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:7372:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:7372:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:7373:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7374:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:7374:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_65);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:7377:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:7378:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7379:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_ID)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRangoMode.g:7379:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_65);
            	    rule__Wave__SpawnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalRangoMode.g:7388:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7392:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:7393:2: rule__Wave__Group__4__Impl
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
    // InternalRangoMode.g:7399:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7403:1: ( ( '}' ) )
            // InternalRangoMode.g:7404:1: ( '}' )
            {
            // InternalRangoMode.g:7404:1: ( '}' )
            // InternalRangoMode.g:7405:2: '}'
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
    // InternalRangoMode.g:7415:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7419:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:7420:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:7427:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7431:1: ( ( 'after' ) )
            // InternalRangoMode.g:7432:1: ( 'after' )
            {
            // InternalRangoMode.g:7432:1: ( 'after' )
            // InternalRangoMode.g:7433:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRangoMode.g:7442:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7446:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:7447:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:7454:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7458:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:7459:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7459:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:7460:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:7461:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:7461:3: rule__Wave__DelayAssignment_1_1
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
    // InternalRangoMode.g:7469:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7473:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7474:2: rule__Wave__Group_1__2__Impl
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
    // InternalRangoMode.g:7480:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7484:1: ( ( 's' ) )
            // InternalRangoMode.g:7485:1: ( 's' )
            {
            // InternalRangoMode.g:7485:1: ( 's' )
            // InternalRangoMode.g:7486:2: 's'
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
    // InternalRangoMode.g:7496:1: rule__EnemySpawn__Group__0 : rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 ;
    public final void rule__EnemySpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7500:1: ( rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 )
            // InternalRangoMode.g:7501:2: rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1
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
    // InternalRangoMode.g:7508:1: rule__EnemySpawn__Group__0__Impl : ( ( rule__EnemySpawn__Group_0__0 )? ) ;
    public final void rule__EnemySpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7512:1: ( ( ( rule__EnemySpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7513:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7513:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            // InternalRangoMode.g:7514:2: ( rule__EnemySpawn__Group_0__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7515:2: ( rule__EnemySpawn__Group_0__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:7515:3: rule__EnemySpawn__Group_0__0
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
    // InternalRangoMode.g:7523:1: rule__EnemySpawn__Group__1 : rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 ;
    public final void rule__EnemySpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7527:1: ( rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 )
            // InternalRangoMode.g:7528:2: rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2
            {
            pushFollow(FOLLOW_58);
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
    // InternalRangoMode.g:7535:1: rule__EnemySpawn__Group__1__Impl : ( ( rule__EnemySpawn__TypeAssignment_1 ) ) ;
    public final void rule__EnemySpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7539:1: ( ( ( rule__EnemySpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7540:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7540:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7541:2: ( rule__EnemySpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7542:2: ( rule__EnemySpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7542:3: rule__EnemySpawn__TypeAssignment_1
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
    // InternalRangoMode.g:7550:1: rule__EnemySpawn__Group__2 : rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 ;
    public final void rule__EnemySpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7554:1: ( rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 )
            // InternalRangoMode.g:7555:2: rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:7562:1: rule__EnemySpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__EnemySpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7566:1: ( ( 'size' ) )
            // InternalRangoMode.g:7567:1: ( 'size' )
            {
            // InternalRangoMode.g:7567:1: ( 'size' )
            // InternalRangoMode.g:7568:2: 'size'
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:7577:1: rule__EnemySpawn__Group__3 : rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 ;
    public final void rule__EnemySpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7581:1: ( rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 )
            // InternalRangoMode.g:7582:2: rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:7589:1: rule__EnemySpawn__Group__3__Impl : ( ( rule__EnemySpawn__SizeAssignment_3 ) ) ;
    public final void rule__EnemySpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7593:1: ( ( ( rule__EnemySpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7594:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7594:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7595:2: ( rule__EnemySpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7596:2: ( rule__EnemySpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7596:3: rule__EnemySpawn__SizeAssignment_3
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
    // InternalRangoMode.g:7604:1: rule__EnemySpawn__Group__4 : rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 ;
    public final void rule__EnemySpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7608:1: ( rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 )
            // InternalRangoMode.g:7609:2: rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5
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
    // InternalRangoMode.g:7616:1: rule__EnemySpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__EnemySpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7620:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7621:1: ( ruleAt )
            {
            // InternalRangoMode.g:7621:1: ( ruleAt )
            // InternalRangoMode.g:7622:2: ruleAt
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
    // InternalRangoMode.g:7631:1: rule__EnemySpawn__Group__5 : rule__EnemySpawn__Group__5__Impl ;
    public final void rule__EnemySpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7635:1: ( rule__EnemySpawn__Group__5__Impl )
            // InternalRangoMode.g:7636:2: rule__EnemySpawn__Group__5__Impl
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
    // InternalRangoMode.g:7642:1: rule__EnemySpawn__Group__5__Impl : ( ( rule__EnemySpawn__Group_5__0 )? ) ;
    public final void rule__EnemySpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7646:1: ( ( ( rule__EnemySpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7647:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7647:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            // InternalRangoMode.g:7648:2: ( rule__EnemySpawn__Group_5__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7649:2: ( rule__EnemySpawn__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==86) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:7649:3: rule__EnemySpawn__Group_5__0
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
    // InternalRangoMode.g:7658:1: rule__EnemySpawn__Group_0__0 : rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 ;
    public final void rule__EnemySpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7662:1: ( rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 )
            // InternalRangoMode.g:7663:2: rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRangoMode.g:7670:1: rule__EnemySpawn__Group_0__0__Impl : ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) ;
    public final void rule__EnemySpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7674:1: ( ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7675:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7675:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7676:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7677:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7677:3: rule__EnemySpawn__CountAssignment_0_0
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
    // InternalRangoMode.g:7685:1: rule__EnemySpawn__Group_0__1 : rule__EnemySpawn__Group_0__1__Impl ;
    public final void rule__EnemySpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7689:1: ( rule__EnemySpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7690:2: rule__EnemySpawn__Group_0__1__Impl
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
    // InternalRangoMode.g:7696:1: rule__EnemySpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__EnemySpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7700:1: ( ( '*' ) )
            // InternalRangoMode.g:7701:1: ( '*' )
            {
            // InternalRangoMode.g:7701:1: ( '*' )
            // InternalRangoMode.g:7702:2: '*'
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
    // InternalRangoMode.g:7712:1: rule__EnemySpawn__Group_5__0 : rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 ;
    public final void rule__EnemySpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7716:1: ( rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 )
            // InternalRangoMode.g:7717:2: rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1
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
    // InternalRangoMode.g:7724:1: rule__EnemySpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__EnemySpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7728:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7729:1: ( 'moving' )
            {
            // InternalRangoMode.g:7729:1: ( 'moving' )
            // InternalRangoMode.g:7730:2: 'moving'
            {
             before(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRangoMode.g:7739:1: rule__EnemySpawn__Group_5__1 : rule__EnemySpawn__Group_5__1__Impl ;
    public final void rule__EnemySpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7743:1: ( rule__EnemySpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7744:2: rule__EnemySpawn__Group_5__1__Impl
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
    // InternalRangoMode.g:7750:1: rule__EnemySpawn__Group_5__1__Impl : ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__EnemySpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7754:1: ( ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7755:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7755:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7756:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7757:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7757:3: rule__EnemySpawn__DirectionAssignment_5_1
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
    // InternalRangoMode.g:7766:1: rule__Drops__Group__0 : rule__Drops__Group__0__Impl rule__Drops__Group__1 ;
    public final void rule__Drops__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7770:1: ( rule__Drops__Group__0__Impl rule__Drops__Group__1 )
            // InternalRangoMode.g:7771:2: rule__Drops__Group__0__Impl rule__Drops__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:7778:1: rule__Drops__Group__0__Impl : ( 'drops' ) ;
    public final void rule__Drops__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7782:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7783:1: ( 'drops' )
            {
            // InternalRangoMode.g:7783:1: ( 'drops' )
            // InternalRangoMode.g:7784:2: 'drops'
            {
             before(grammarAccess.getDropsAccess().getDropsKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRangoMode.g:7793:1: rule__Drops__Group__1 : rule__Drops__Group__1__Impl rule__Drops__Group__2 ;
    public final void rule__Drops__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7797:1: ( rule__Drops__Group__1__Impl rule__Drops__Group__2 )
            // InternalRangoMode.g:7798:2: rule__Drops__Group__1__Impl rule__Drops__Group__2
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
    // InternalRangoMode.g:7805:1: rule__Drops__Group__1__Impl : ( '{' ) ;
    public final void rule__Drops__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7809:1: ( ( '{' ) )
            // InternalRangoMode.g:7810:1: ( '{' )
            {
            // InternalRangoMode.g:7810:1: ( '{' )
            // InternalRangoMode.g:7811:2: '{'
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
    // InternalRangoMode.g:7820:1: rule__Drops__Group__2 : rule__Drops__Group__2__Impl rule__Drops__Group__3 ;
    public final void rule__Drops__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7824:1: ( rule__Drops__Group__2__Impl rule__Drops__Group__3 )
            // InternalRangoMode.g:7825:2: rule__Drops__Group__2__Impl rule__Drops__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalRangoMode.g:7832:1: rule__Drops__Group__2__Impl : ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) ;
    public final void rule__Drops__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7836:1: ( ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) )
            // InternalRangoMode.g:7837:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:7837:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            // InternalRangoMode.g:7838:2: ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* )
            {
            // InternalRangoMode.g:7838:2: ( ( rule__Drops__DropsAssignment_2 ) )
            // InternalRangoMode.g:7839:3: ( rule__Drops__DropsAssignment_2 )
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7840:3: ( rule__Drops__DropsAssignment_2 )
            // InternalRangoMode.g:7840:4: rule__Drops__DropsAssignment_2
            {
            pushFollow(FOLLOW_73);
            rule__Drops__DropsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }

            // InternalRangoMode.g:7843:2: ( ( rule__Drops__DropsAssignment_2 )* )
            // InternalRangoMode.g:7844:3: ( rule__Drops__DropsAssignment_2 )*
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7845:3: ( rule__Drops__DropsAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRangoMode.g:7845:4: rule__Drops__DropsAssignment_2
            	    {
            	    pushFollow(FOLLOW_73);
            	    rule__Drops__DropsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalRangoMode.g:7854:1: rule__Drops__Group__3 : rule__Drops__Group__3__Impl ;
    public final void rule__Drops__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7858:1: ( rule__Drops__Group__3__Impl )
            // InternalRangoMode.g:7859:2: rule__Drops__Group__3__Impl
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
    // InternalRangoMode.g:7865:1: rule__Drops__Group__3__Impl : ( '}' ) ;
    public final void rule__Drops__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7869:1: ( ( '}' ) )
            // InternalRangoMode.g:7870:1: ( '}' )
            {
            // InternalRangoMode.g:7870:1: ( '}' )
            // InternalRangoMode.g:7871:2: '}'
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
    // InternalRangoMode.g:7881:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7885:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7886:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:7893:1: rule__DropTable__Group__0__Impl : ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7897:1: ( ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) )
            // InternalRangoMode.g:7898:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            {
            // InternalRangoMode.g:7898:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            // InternalRangoMode.g:7899:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 
            // InternalRangoMode.g:7900:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            // InternalRangoMode.g:7900:3: rule__DropTable__EnemyTypeAssignment_0
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
    // InternalRangoMode.g:7908:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7912:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7913:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:7920:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7924:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7925:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7925:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7926:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7927:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7927:3: rule__DropTable__ChanceAssignment_1
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
    // InternalRangoMode.g:7935:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7939:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7940:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRangoMode.g:7947:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7951:1: ( ( '%' ) )
            // InternalRangoMode.g:7952:1: ( '%' )
            {
            // InternalRangoMode.g:7952:1: ( '%' )
            // InternalRangoMode.g:7953:2: '%'
            {
             before(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:7962:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7966:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7967:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
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
    // InternalRangoMode.g:7974:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7978:1: ( ( '{' ) )
            // InternalRangoMode.g:7979:1: ( '{' )
            {
            // InternalRangoMode.g:7979:1: ( '{' )
            // InternalRangoMode.g:7980:2: '{'
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
    // InternalRangoMode.g:7989:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7993:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7994:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:8001:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8005:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:8006:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:8006:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:8007:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:8008:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:8008:3: rule__DropTable__EntriesAssignment_4
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
    // InternalRangoMode.g:8016:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8020:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:8021:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalRangoMode.g:8028:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8032:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:8033:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:8033:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:8034:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:8035:2: ( rule__DropTable__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==29) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRangoMode.g:8035:3: rule__DropTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DropTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalRangoMode.g:8043:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8047:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:8048:2: rule__DropTable__Group__6__Impl
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
    // InternalRangoMode.g:8054:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8058:1: ( ( '}' ) )
            // InternalRangoMode.g:8059:1: ( '}' )
            {
            // InternalRangoMode.g:8059:1: ( '}' )
            // InternalRangoMode.g:8060:2: '}'
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
    // InternalRangoMode.g:8070:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8074:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:8075:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
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
    // InternalRangoMode.g:8082:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8086:1: ( ( ',' ) )
            // InternalRangoMode.g:8087:1: ( ',' )
            {
            // InternalRangoMode.g:8087:1: ( ',' )
            // InternalRangoMode.g:8088:2: ','
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
    // InternalRangoMode.g:8097:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8101:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:8102:2: rule__DropTable__Group_5__1__Impl
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
    // InternalRangoMode.g:8108:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8112:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:8113:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:8113:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:8114:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:8115:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:8115:3: rule__DropTable__EntriesAssignment_5_1
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
    // InternalRangoMode.g:8124:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8128:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:8129:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalRangoMode.g:8136:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8140:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:8141:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:8141:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:8142:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:8143:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:8143:3: rule__Drop__PowerUpAssignment_0
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
    // InternalRangoMode.g:8151:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8155:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:8156:2: rule__Drop__Group__1__Impl
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
    // InternalRangoMode.g:8162:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8166:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:8167:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:8167:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:8168:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:8169:2: ( rule__Drop__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==88) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:8169:3: rule__Drop__Group_1__0
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
    // InternalRangoMode.g:8178:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8182:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:8183:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:8190:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8194:1: ( ( 'weight' ) )
            // InternalRangoMode.g:8195:1: ( 'weight' )
            {
            // InternalRangoMode.g:8195:1: ( 'weight' )
            // InternalRangoMode.g:8196:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:8205:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8209:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:8210:2: rule__Drop__Group_1__1__Impl
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
    // InternalRangoMode.g:8216:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8220:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:8221:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:8221:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:8222:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:8223:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:8223:3: rule__Drop__WeightAssignment_1_1
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
    // InternalRangoMode.g:8232:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8236:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:8237:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
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
    // InternalRangoMode.g:8244:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8248:1: ( ( () ) )
            // InternalRangoMode.g:8249:1: ( () )
            {
            // InternalRangoMode.g:8249:1: ( () )
            // InternalRangoMode.g:8250:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:8251:2: ()
            // InternalRangoMode.g:8251:3: 
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
    // InternalRangoMode.g:8259:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8263:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:8264:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
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
    // InternalRangoMode.g:8271:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8275:1: ( ( 'all' ) )
            // InternalRangoMode.g:8276:1: ( 'all' )
            {
            // InternalRangoMode.g:8276:1: ( 'all' )
            // InternalRangoMode.g:8277:2: 'all'
            {
             before(grammarAccess.getClearedAccess().getAllKeyword_1()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRangoMode.g:8286:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8290:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:8291:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
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
    // InternalRangoMode.g:8298:1: rule__Cleared__Group__2__Impl : ( 'enemies' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8302:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8303:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8303:1: ( 'enemies' )
            // InternalRangoMode.g:8304:2: 'enemies'
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
    // InternalRangoMode.g:8313:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8317:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:8318:2: rule__Cleared__Group__3__Impl
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
    // InternalRangoMode.g:8324:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8328:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:8329:1: ( 'cleared' )
            {
            // InternalRangoMode.g:8329:1: ( 'cleared' )
            // InternalRangoMode.g:8330:2: 'cleared'
            {
             before(grammarAccess.getClearedAccess().getClearedKeyword_3()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:8340:1: rule__TimeReached__Group__0 : rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 ;
    public final void rule__TimeReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8344:1: ( rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 )
            // InternalRangoMode.g:8345:2: rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1
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
    // InternalRangoMode.g:8352:1: rule__TimeReached__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8356:1: ( ( 'time' ) )
            // InternalRangoMode.g:8357:1: ( 'time' )
            {
            // InternalRangoMode.g:8357:1: ( 'time' )
            // InternalRangoMode.g:8358:2: 'time'
            {
             before(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:8367:1: rule__TimeReached__Group__1 : rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 ;
    public final void rule__TimeReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8371:1: ( rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 )
            // InternalRangoMode.g:8372:2: rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:8379:1: rule__TimeReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8383:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8384:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8384:1: ( 'reaches' )
            // InternalRangoMode.g:8385:2: 'reaches'
            {
             before(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 
            match(input,92,FOLLOW_2); 
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
    // InternalRangoMode.g:8394:1: rule__TimeReached__Group__2 : rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 ;
    public final void rule__TimeReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8398:1: ( rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 )
            // InternalRangoMode.g:8399:2: rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRangoMode.g:8406:1: rule__TimeReached__Group__2__Impl : ( ( rule__TimeReached__SecondsAssignment_2 ) ) ;
    public final void rule__TimeReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8410:1: ( ( ( rule__TimeReached__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8411:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8411:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8412:2: ( rule__TimeReached__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8413:2: ( rule__TimeReached__SecondsAssignment_2 )
            // InternalRangoMode.g:8413:3: rule__TimeReached__SecondsAssignment_2
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
    // InternalRangoMode.g:8421:1: rule__TimeReached__Group__3 : rule__TimeReached__Group__3__Impl ;
    public final void rule__TimeReached__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8425:1: ( rule__TimeReached__Group__3__Impl )
            // InternalRangoMode.g:8426:2: rule__TimeReached__Group__3__Impl
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
    // InternalRangoMode.g:8432:1: rule__TimeReached__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeReached__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8436:1: ( ( 's' ) )
            // InternalRangoMode.g:8437:1: ( 's' )
            {
            // InternalRangoMode.g:8437:1: ( 's' )
            // InternalRangoMode.g:8438:2: 's'
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
    // InternalRangoMode.g:8448:1: rule__ScoreReached__Group__0 : rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 ;
    public final void rule__ScoreReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8452:1: ( rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 )
            // InternalRangoMode.g:8453:2: rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1
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
    // InternalRangoMode.g:8460:1: rule__ScoreReached__Group__0__Impl : ( 'score' ) ;
    public final void rule__ScoreReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8464:1: ( ( 'score' ) )
            // InternalRangoMode.g:8465:1: ( 'score' )
            {
            // InternalRangoMode.g:8465:1: ( 'score' )
            // InternalRangoMode.g:8466:2: 'score'
            {
             before(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 
            match(input,93,FOLLOW_2); 
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
    // InternalRangoMode.g:8475:1: rule__ScoreReached__Group__1 : rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 ;
    public final void rule__ScoreReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8479:1: ( rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 )
            // InternalRangoMode.g:8480:2: rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:8487:1: rule__ScoreReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__ScoreReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8491:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8492:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8492:1: ( 'reaches' )
            // InternalRangoMode.g:8493:2: 'reaches'
            {
             before(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 
            match(input,92,FOLLOW_2); 
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
    // InternalRangoMode.g:8502:1: rule__ScoreReached__Group__2 : rule__ScoreReached__Group__2__Impl ;
    public final void rule__ScoreReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8506:1: ( rule__ScoreReached__Group__2__Impl )
            // InternalRangoMode.g:8507:2: rule__ScoreReached__Group__2__Impl
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
    // InternalRangoMode.g:8513:1: rule__ScoreReached__Group__2__Impl : ( ( rule__ScoreReached__PointsAssignment_2 ) ) ;
    public final void rule__ScoreReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8517:1: ( ( ( rule__ScoreReached__PointsAssignment_2 ) ) )
            // InternalRangoMode.g:8518:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            {
            // InternalRangoMode.g:8518:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            // InternalRangoMode.g:8519:2: ( rule__ScoreReached__PointsAssignment_2 )
            {
             before(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 
            // InternalRangoMode.g:8520:2: ( rule__ScoreReached__PointsAssignment_2 )
            // InternalRangoMode.g:8520:3: rule__ScoreReached__PointsAssignment_2
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
    // InternalRangoMode.g:8529:1: rule__EnemiesPopped__Group__0 : rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 ;
    public final void rule__EnemiesPopped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8533:1: ( rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 )
            // InternalRangoMode.g:8534:2: rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1
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
    // InternalRangoMode.g:8541:1: rule__EnemiesPopped__Group__0__Impl : ( ( rule__EnemiesPopped__CountAssignment_0 ) ) ;
    public final void rule__EnemiesPopped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8545:1: ( ( ( rule__EnemiesPopped__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8546:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8546:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            // InternalRangoMode.g:8547:2: ( rule__EnemiesPopped__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8548:2: ( rule__EnemiesPopped__CountAssignment_0 )
            // InternalRangoMode.g:8548:3: rule__EnemiesPopped__CountAssignment_0
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
    // InternalRangoMode.g:8556:1: rule__EnemiesPopped__Group__1 : rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 ;
    public final void rule__EnemiesPopped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8560:1: ( rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 )
            // InternalRangoMode.g:8561:2: rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2
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
    // InternalRangoMode.g:8568:1: rule__EnemiesPopped__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesPopped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8572:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8573:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8573:1: ( 'enemies' )
            // InternalRangoMode.g:8574:2: 'enemies'
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
    // InternalRangoMode.g:8583:1: rule__EnemiesPopped__Group__2 : rule__EnemiesPopped__Group__2__Impl ;
    public final void rule__EnemiesPopped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8587:1: ( rule__EnemiesPopped__Group__2__Impl )
            // InternalRangoMode.g:8588:2: rule__EnemiesPopped__Group__2__Impl
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
    // InternalRangoMode.g:8594:1: rule__EnemiesPopped__Group__2__Impl : ( 'popped' ) ;
    public final void rule__EnemiesPopped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8598:1: ( ( 'popped' ) )
            // InternalRangoMode.g:8599:1: ( 'popped' )
            {
            // InternalRangoMode.g:8599:1: ( 'popped' )
            // InternalRangoMode.g:8600:2: 'popped'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2()); 
            match(input,94,FOLLOW_2); 
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
    // InternalRangoMode.g:8610:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8614:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8615:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
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
    // InternalRangoMode.g:8622:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8626:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8627:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8627:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8628:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8629:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8629:3: rule__WavesSurvived__CountAssignment_0
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
    // InternalRangoMode.g:8637:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8641:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8642:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
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
    // InternalRangoMode.g:8649:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8653:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8654:1: ( 'waves' )
            {
            // InternalRangoMode.g:8654:1: ( 'waves' )
            // InternalRangoMode.g:8655:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:8664:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8668:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8669:2: rule__WavesSurvived__Group__2__Impl
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
    // InternalRangoMode.g:8675:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8679:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8680:1: ( 'survived' )
            {
            // InternalRangoMode.g:8680:1: ( 'survived' )
            // InternalRangoMode.g:8681:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,95,FOLLOW_2); 
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
    // InternalRangoMode.g:8691:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8695:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8696:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
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
    // InternalRangoMode.g:8703:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8707:1: ( ( () ) )
            // InternalRangoMode.g:8708:1: ( () )
            {
            // InternalRangoMode.g:8708:1: ( () )
            // InternalRangoMode.g:8709:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8710:2: ()
            // InternalRangoMode.g:8710:3: 
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
    // InternalRangoMode.g:8718:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8722:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8723:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
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
    // InternalRangoMode.g:8730:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8734:1: ( ( 'health' ) )
            // InternalRangoMode.g:8735:1: ( 'health' )
            {
            // InternalRangoMode.g:8735:1: ( 'health' )
            // InternalRangoMode.g:8736:2: 'health'
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
    // InternalRangoMode.g:8745:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8749:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8750:2: rule__HealthDepleted__Group__2__Impl
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
    // InternalRangoMode.g:8756:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8760:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8761:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8761:1: ( 'depleted' )
            // InternalRangoMode.g:8762:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,96,FOLLOW_2); 
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
    // InternalRangoMode.g:8772:1: rule__EnemiesAlive__Group__0 : rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 ;
    public final void rule__EnemiesAlive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8776:1: ( rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 )
            // InternalRangoMode.g:8777:2: rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1
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
    // InternalRangoMode.g:8784:1: rule__EnemiesAlive__Group__0__Impl : ( ( rule__EnemiesAlive__CountAssignment_0 ) ) ;
    public final void rule__EnemiesAlive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8788:1: ( ( ( rule__EnemiesAlive__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8789:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8789:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            // InternalRangoMode.g:8790:2: ( rule__EnemiesAlive__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8791:2: ( rule__EnemiesAlive__CountAssignment_0 )
            // InternalRangoMode.g:8791:3: rule__EnemiesAlive__CountAssignment_0
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
    // InternalRangoMode.g:8799:1: rule__EnemiesAlive__Group__1 : rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 ;
    public final void rule__EnemiesAlive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8803:1: ( rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 )
            // InternalRangoMode.g:8804:2: rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2
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
    // InternalRangoMode.g:8811:1: rule__EnemiesAlive__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesAlive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8815:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8816:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8816:1: ( 'enemies' )
            // InternalRangoMode.g:8817:2: 'enemies'
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
    // InternalRangoMode.g:8826:1: rule__EnemiesAlive__Group__2 : rule__EnemiesAlive__Group__2__Impl ;
    public final void rule__EnemiesAlive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8830:1: ( rule__EnemiesAlive__Group__2__Impl )
            // InternalRangoMode.g:8831:2: rule__EnemiesAlive__Group__2__Impl
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
    // InternalRangoMode.g:8837:1: rule__EnemiesAlive__Group__2__Impl : ( 'alive' ) ;
    public final void rule__EnemiesAlive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8841:1: ( ( 'alive' ) )
            // InternalRangoMode.g:8842:1: ( 'alive' )
            {
            // InternalRangoMode.g:8842:1: ( 'alive' )
            // InternalRangoMode.g:8843:2: 'alive'
            {
             before(grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2()); 
            match(input,97,FOLLOW_2); 
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
    // InternalRangoMode.g:8853:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8857:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8858:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
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
    // InternalRangoMode.g:8865:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8869:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8870:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8870:1: ( RULE_INT )
            // InternalRangoMode.g:8871:2: RULE_INT
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
    // InternalRangoMode.g:8880:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8884:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8885:2: rule__Decimal__Group__1__Impl
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
    // InternalRangoMode.g:8891:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8895:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8896:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8896:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8897:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8898:2: ( rule__Decimal__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==98) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:8898:3: rule__Decimal__Group_1__0
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
    // InternalRangoMode.g:8907:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8911:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8912:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:8919:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8923:1: ( ( '.' ) )
            // InternalRangoMode.g:8924:1: ( '.' )
            {
            // InternalRangoMode.g:8924:1: ( '.' )
            // InternalRangoMode.g:8925:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,98,FOLLOW_2); 
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
    // InternalRangoMode.g:8934:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8938:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8939:2: rule__Decimal__Group_1__1__Impl
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
    // InternalRangoMode.g:8945:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8949:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8950:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8950:1: ( RULE_INT )
            // InternalRangoMode.g:8951:2: RULE_INT
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
    // InternalRangoMode.g:8961:1: rule__EnemyType__UnorderedGroup_3 : rule__EnemyType__UnorderedGroup_3__0 {...}?;
    public final void rule__EnemyType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8966:1: ( rule__EnemyType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8967:2: rule__EnemyType__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8975:1: rule__EnemyType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__EnemyType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8980:1: ( ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8981:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8981:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            int alt42=5;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt42=2;
            }
            else if ( LA42_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt42=3;
            }
            else if ( LA42_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt42=4;
            }
            else if ( LA42_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt42=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:8982:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8982:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8983:4: {...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8983:105: ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8984:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8990:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8991:6: ( rule__EnemyType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8992:6: ( rule__EnemyType__Group_3_0__0 )
                    // InternalRangoMode.g:8992:7: rule__EnemyType__Group_3_0__0
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
                    // InternalRangoMode.g:8997:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8997:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8998:4: {...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8998:105: ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8999:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9005:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    // InternalRangoMode.g:9006:6: ( rule__EnemyType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:9007:6: ( rule__EnemyType__Group_3_1__0 )
                    // InternalRangoMode.g:9007:7: rule__EnemyType__Group_3_1__0
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
                    // InternalRangoMode.g:9012:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9012:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:9013:4: {...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:9013:105: ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:9014:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9020:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    // InternalRangoMode.g:9021:6: ( rule__EnemyType__Group_3_2__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:9022:6: ( rule__EnemyType__Group_3_2__0 )
                    // InternalRangoMode.g:9022:7: rule__EnemyType__Group_3_2__0
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
                    // InternalRangoMode.g:9027:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9027:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:9028:4: {...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:9028:105: ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:9029:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9035:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    // InternalRangoMode.g:9036:6: ( rule__EnemyType__Group_3_3__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9037:6: ( rule__EnemyType__Group_3_3__0 )
                    // InternalRangoMode.g:9037:7: rule__EnemyType__Group_3_3__0
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
                    // InternalRangoMode.g:9042:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9042:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9043:4: {...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9043:105: ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9044:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9050:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    // InternalRangoMode.g:9051:6: ( rule__EnemyType__Group_3_4__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9052:6: ( rule__EnemyType__Group_3_4__0 )
                    // InternalRangoMode.g:9052:7: rule__EnemyType__Group_3_4__0
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
    // InternalRangoMode.g:9065:1: rule__EnemyType__UnorderedGroup_3__0 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9069:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9070:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9071:2: ( rule__EnemyType__UnorderedGroup_3__1 )?
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
                    // InternalRangoMode.g:9071:2: rule__EnemyType__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9077:1: rule__EnemyType__UnorderedGroup_3__1 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9081:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9082:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9083:2: ( rule__EnemyType__UnorderedGroup_3__2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:9083:2: rule__EnemyType__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9089:1: rule__EnemyType__UnorderedGroup_3__2 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9093:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9094:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9095:2: ( rule__EnemyType__UnorderedGroup_3__3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:9095:2: rule__EnemyType__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9101:1: rule__EnemyType__UnorderedGroup_3__3 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9105:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9106:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_86);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9107:2: ( rule__EnemyType__UnorderedGroup_3__4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:9107:2: rule__EnemyType__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9113:1: rule__EnemyType__UnorderedGroup_3__4 : rule__EnemyType__UnorderedGroup_3__Impl ;
    public final void rule__EnemyType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9117:1: ( rule__EnemyType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9118:2: rule__EnemyType__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9125:1: rule__Material__UnorderedGroup_3 : ( rule__Material__UnorderedGroup_3__0 )? ;
    public final void rule__Material__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:9130:1: ( ( rule__Material__UnorderedGroup_3__0 )? )
            // InternalRangoMode.g:9131:2: ( rule__Material__UnorderedGroup_3__0 )?
            {
            // InternalRangoMode.g:9131:2: ( rule__Material__UnorderedGroup_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRangoMode.g:9131:2: rule__Material__UnorderedGroup_3__0
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
    // InternalRangoMode.g:9139:1: rule__Material__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__Material__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9144:1: ( ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) )
            // InternalRangoMode.g:9145:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9145:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalRangoMode.g:9146:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9146:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:9147:4: {...}? => ( ( ( rule__Material__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:9147:104: ( ( ( rule__Material__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:9148:5: ( ( rule__Material__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9154:5: ( ( rule__Material__Group_3_0__0 ) )
                    // InternalRangoMode.g:9155:6: ( rule__Material__Group_3_0__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:9156:6: ( rule__Material__Group_3_0__0 )
                    // InternalRangoMode.g:9156:7: rule__Material__Group_3_0__0
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
                    // InternalRangoMode.g:9161:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9161:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:9162:4: {...}? => ( ( ( rule__Material__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:9162:104: ( ( ( rule__Material__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:9163:5: ( ( rule__Material__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9169:5: ( ( rule__Material__Group_3_1__0 ) )
                    // InternalRangoMode.g:9170:6: ( rule__Material__Group_3_1__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:9171:6: ( rule__Material__Group_3_1__0 )
                    // InternalRangoMode.g:9171:7: rule__Material__Group_3_1__0
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
    // InternalRangoMode.g:9184:1: rule__Material__UnorderedGroup_3__0 : rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? ;
    public final void rule__Material__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9188:1: ( rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9189:2: rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_87);
            rule__Material__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9190:2: ( rule__Material__UnorderedGroup_3__1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRangoMode.g:9190:2: rule__Material__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9196:1: rule__Material__UnorderedGroup_3__1 : rule__Material__UnorderedGroup_3__Impl ;
    public final void rule__Material__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9200:1: ( rule__Material__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9201:2: rule__Material__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9208:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:9213:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:9214:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:9222:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9227:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:9228:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9228:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt50=6;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt50=2;
            }
            else if ( LA50_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt50=3;
            }
            else if ( LA50_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt50=4;
            }
            else if ( LA50_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt50=5;
            }
            else if ( LA50_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt50=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:9229:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9229:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:9230:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:9230:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:9231:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9237:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:9238:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:9239:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:9239:7: rule__PlayerProfile__Group_3_0__0
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
                    // InternalRangoMode.g:9244:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9244:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:9245:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:9245:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:9246:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9252:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:9253:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:9254:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:9254:7: rule__PlayerProfile__Group_3_1__0
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
                    // InternalRangoMode.g:9259:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9259:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:9260:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:9260:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:9261:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9267:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:9268:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:9269:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:9269:7: rule__PlayerProfile__Group_3_2__0
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
                    // InternalRangoMode.g:9274:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9274:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:9275:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:9275:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:9276:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9282:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:9283:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9284:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:9284:7: rule__PlayerProfile__Group_3_3__0
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
                    // InternalRangoMode.g:9289:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9289:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9290:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9290:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9291:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9297:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:9298:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9299:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:9299:7: rule__PlayerProfile__Group_3_4__0
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
                    // InternalRangoMode.g:9304:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9304:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:9305:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:9305:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:9306:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9312:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:9313:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:9314:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:9314:7: rule__PlayerProfile__Group_3_5__0
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
    // InternalRangoMode.g:9327:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9331:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9332:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_88);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9333:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
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
                    // InternalRangoMode.g:9333:2: rule__PlayerProfile__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9339:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9343:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9344:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_88);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9345:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
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
                    // InternalRangoMode.g:9345:2: rule__PlayerProfile__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9351:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9355:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9356:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_88);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9357:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt53=1;
            }
            else if ( LA53_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt53=1;
            }
            else if ( LA53_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt53=1;
            }
            else if ( LA53_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRangoMode.g:9357:2: rule__PlayerProfile__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9363:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9367:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9368:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_88);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9369:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt54=1;
            }
            else if ( LA54_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt54=1;
            }
            else if ( LA54_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt54=1;
            }
            else if ( LA54_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRangoMode.g:9369:2: rule__PlayerProfile__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9375:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9379:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:9380:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_88);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9381:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt55=1;
            }
            else if ( LA55_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt55=1;
            }
            else if ( LA55_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt55=1;
            }
            else if ( LA55_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt55=1;
            }
            else if ( LA55_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRangoMode.g:9381:2: rule__PlayerProfile__UnorderedGroup_3__5
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
    // InternalRangoMode.g:9387:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9391:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9392:2: rule__PlayerProfile__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:9399:1: rule__GameMode__UnorderedGroup_7 : ( rule__GameMode__UnorderedGroup_7__0 )? ;
    public final void rule__GameMode__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
        	
        try {
            // InternalRangoMode.g:9404:1: ( ( rule__GameMode__UnorderedGroup_7__0 )? )
            // InternalRangoMode.g:9405:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            {
            // InternalRangoMode.g:9405:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRangoMode.g:9405:2: rule__GameMode__UnorderedGroup_7__0
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
    // InternalRangoMode.g:9413:1: rule__GameMode__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9418:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) )
            // InternalRangoMode.g:9419:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            {
            // InternalRangoMode.g:9419:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalRangoMode.g:9420:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9420:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    // InternalRangoMode.g:9421:4: {...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalRangoMode.g:9421:104: ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    // InternalRangoMode.g:9422:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9428:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    // InternalRangoMode.g:9429:6: ( rule__GameMode__Group_7_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_7_0()); 
                    // InternalRangoMode.g:9430:6: ( rule__GameMode__Group_7_0__0 )
                    // InternalRangoMode.g:9430:7: rule__GameMode__Group_7_0__0
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
                    // InternalRangoMode.g:9435:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    {
                    // InternalRangoMode.g:9435:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    // InternalRangoMode.g:9436:4: {...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalRangoMode.g:9436:104: ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    // InternalRangoMode.g:9437:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9443:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    // InternalRangoMode.g:9444:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 
                    // InternalRangoMode.g:9445:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    // InternalRangoMode.g:9445:7: rule__GameMode__SpeedBonusAssignment_7_1
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
    // InternalRangoMode.g:9458:1: rule__GameMode__UnorderedGroup_7__0 : rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? ;
    public final void rule__GameMode__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9462:1: ( rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? )
            // InternalRangoMode.g:9463:2: rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_89);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalRangoMode.g:9464:2: ( rule__GameMode__UnorderedGroup_7__1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRangoMode.g:9464:2: rule__GameMode__UnorderedGroup_7__1
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
    // InternalRangoMode.g:9470:1: rule__GameMode__UnorderedGroup_7__1 : rule__GameMode__UnorderedGroup_7__Impl ;
    public final void rule__GameMode__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9474:1: ( rule__GameMode__UnorderedGroup_7__Impl )
            // InternalRangoMode.g:9475:2: rule__GameMode__UnorderedGroup_7__Impl
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
    // InternalRangoMode.g:9482:1: rule__Arena__UnorderedGroup_4 : ( rule__Arena__UnorderedGroup_4__0 )? ;
    public final void rule__Arena__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getArenaAccess().getUnorderedGroup_4());
        	
        try {
            // InternalRangoMode.g:9487:1: ( ( rule__Arena__UnorderedGroup_4__0 )? )
            // InternalRangoMode.g:9488:2: ( rule__Arena__UnorderedGroup_4__0 )?
            {
            // InternalRangoMode.g:9488:2: ( rule__Arena__UnorderedGroup_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt59=1;
            }
            else if ( LA59_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRangoMode.g:9488:2: rule__Arena__UnorderedGroup_4__0
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
    // InternalRangoMode.g:9496:1: rule__Arena__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Arena__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9501:1: ( ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) )
            // InternalRangoMode.g:9502:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9502:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( LA60_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt60=2;
            }
            else if ( LA60_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt60=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalRangoMode.g:9503:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9503:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    // InternalRangoMode.g:9504:4: {...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalRangoMode.g:9504:101: ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    // InternalRangoMode.g:9505:5: ( ( rule__Arena__Group_4_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9511:5: ( ( rule__Arena__Group_4_0__0 ) )
                    // InternalRangoMode.g:9512:6: ( rule__Arena__Group_4_0__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_0()); 
                    // InternalRangoMode.g:9513:6: ( rule__Arena__Group_4_0__0 )
                    // InternalRangoMode.g:9513:7: rule__Arena__Group_4_0__0
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
                    // InternalRangoMode.g:9518:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9518:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    // InternalRangoMode.g:9519:4: {...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalRangoMode.g:9519:101: ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    // InternalRangoMode.g:9520:5: ( ( rule__Arena__Group_4_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9526:5: ( ( rule__Arena__Group_4_1__0 ) )
                    // InternalRangoMode.g:9527:6: ( rule__Arena__Group_4_1__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_1()); 
                    // InternalRangoMode.g:9528:6: ( rule__Arena__Group_4_1__0 )
                    // InternalRangoMode.g:9528:7: rule__Arena__Group_4_1__0
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
                    // InternalRangoMode.g:9533:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9533:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    // InternalRangoMode.g:9534:4: {...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalRangoMode.g:9534:101: ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    // InternalRangoMode.g:9535:5: ( ( rule__Arena__Group_4_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9541:5: ( ( rule__Arena__Group_4_2__0 ) )
                    // InternalRangoMode.g:9542:6: ( rule__Arena__Group_4_2__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_2()); 
                    // InternalRangoMode.g:9543:6: ( rule__Arena__Group_4_2__0 )
                    // InternalRangoMode.g:9543:7: rule__Arena__Group_4_2__0
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
    // InternalRangoMode.g:9556:1: rule__Arena__UnorderedGroup_4__0 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? ;
    public final void rule__Arena__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9560:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? )
            // InternalRangoMode.g:9561:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_90);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9562:2: ( rule__Arena__UnorderedGroup_4__1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( LA61_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt61=1;
            }
            else if ( LA61_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRangoMode.g:9562:2: rule__Arena__UnorderedGroup_4__1
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
    // InternalRangoMode.g:9568:1: rule__Arena__UnorderedGroup_4__1 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? ;
    public final void rule__Arena__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9572:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? )
            // InternalRangoMode.g:9573:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_90);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9574:2: ( rule__Arena__UnorderedGroup_4__2 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt62=1;
            }
            else if ( LA62_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRangoMode.g:9574:2: rule__Arena__UnorderedGroup_4__2
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
    // InternalRangoMode.g:9580:1: rule__Arena__UnorderedGroup_4__2 : rule__Arena__UnorderedGroup_4__Impl ;
    public final void rule__Arena__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9584:1: ( rule__Arena__UnorderedGroup_4__Impl )
            // InternalRangoMode.g:9585:2: rule__Arena__UnorderedGroup_4__Impl
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
    // InternalRangoMode.g:9592:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9596:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9597:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9597:2: ( RULE_ID )
            // InternalRangoMode.g:9598:3: RULE_ID
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
    // InternalRangoMode.g:9607:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9611:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9612:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9612:2: ( RULE_STRING )
            // InternalRangoMode.g:9613:3: RULE_STRING
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
    // InternalRangoMode.g:9622:1: rule__Edition__EnemyTypesAssignment_3_0 : ( ruleEnemyType ) ;
    public final void rule__Edition__EnemyTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9626:1: ( ( ruleEnemyType ) )
            // InternalRangoMode.g:9627:2: ( ruleEnemyType )
            {
            // InternalRangoMode.g:9627:2: ( ruleEnemyType )
            // InternalRangoMode.g:9628:3: ruleEnemyType
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
    // InternalRangoMode.g:9637:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9641:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:9642:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:9642:2: ( rulePowerUp )
            // InternalRangoMode.g:9643:3: rulePowerUp
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
    // InternalRangoMode.g:9652:1: rule__Edition__MaterialsAssignment_3_2 : ( ruleMaterial ) ;
    public final void rule__Edition__MaterialsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9656:1: ( ( ruleMaterial ) )
            // InternalRangoMode.g:9657:2: ( ruleMaterial )
            {
            // InternalRangoMode.g:9657:2: ( ruleMaterial )
            // InternalRangoMode.g:9658:3: ruleMaterial
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
    // InternalRangoMode.g:9667:1: rule__Edition__PlayersAssignment_3_3 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9671:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9672:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9672:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9673:3: rulePlayerProfile
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
    // InternalRangoMode.g:9682:1: rule__Edition__ModesAssignment_3_5 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9686:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9687:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9687:2: ( ruleGameMode )
            // InternalRangoMode.g:9688:3: ruleGameMode
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
    // InternalRangoMode.g:9697:1: rule__EnemyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnemyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9701:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9702:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9702:2: ( RULE_ID )
            // InternalRangoMode.g:9703:3: RULE_ID
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
    // InternalRangoMode.g:9712:1: rule__EnemyType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__EnemyType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9716:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9717:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9717:2: ( RULE_STRING )
            // InternalRangoMode.g:9718:3: RULE_STRING
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
    // InternalRangoMode.g:9727:1: rule__EnemyType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9731:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9732:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9732:2: ( ruleDecimal )
            // InternalRangoMode.g:9733:3: ruleDecimal
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
    // InternalRangoMode.g:9742:1: rule__EnemyType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9746:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9747:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9747:2: ( ruleDecimal )
            // InternalRangoMode.g:9748:3: ruleDecimal
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
    // InternalRangoMode.g:9757:1: rule__EnemyType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9761:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9762:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9762:2: ( ruleDecimal )
            // InternalRangoMode.g:9763:3: ruleDecimal
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
    // InternalRangoMode.g:9772:1: rule__EnemyType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__EnemyType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9776:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9777:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9777:2: ( RULE_INT )
            // InternalRangoMode.g:9778:3: RULE_INT
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
    // InternalRangoMode.g:9787:1: rule__EnemyType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__EnemyType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9791:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9792:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9792:2: ( ruleSplitRule )
            // InternalRangoMode.g:9793:3: ruleSplitRule
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
    // InternalRangoMode.g:9802:1: rule__EnemyType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9806:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9807:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9807:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9808:3: rulePlayerEffect
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
    // InternalRangoMode.g:9817:1: rule__EnemyType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9821:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9822:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9822:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9823:3: rulePlayerEffect
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
    // InternalRangoMode.g:9832:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9836:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9837:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9837:2: ( RULE_INT )
            // InternalRangoMode.g:9838:3: RULE_INT
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
    // InternalRangoMode.g:9847:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9851:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9852:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9852:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9853:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9854:3: ( RULE_ID )
            // InternalRangoMode.g:9855:4: RULE_ID
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
    // InternalRangoMode.g:9866:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9870:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9871:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9871:2: ( ruleDecimal )
            // InternalRangoMode.g:9872:3: ruleDecimal
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
    // InternalRangoMode.g:9881:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9885:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9886:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9886:2: ( RULE_INT )
            // InternalRangoMode.g:9887:3: RULE_INT
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
    // InternalRangoMode.g:9896:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9900:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9901:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9901:2: ( RULE_INT )
            // InternalRangoMode.g:9902:3: RULE_INT
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
    // InternalRangoMode.g:9911:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9915:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9916:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9916:2: ( ruleDecimal )
            // InternalRangoMode.g:9917:3: ruleDecimal
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
    // InternalRangoMode.g:9926:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9930:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9931:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9931:2: ( ruleDecimal )
            // InternalRangoMode.g:9932:3: ruleDecimal
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
    // InternalRangoMode.g:9941:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9945:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9946:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9946:2: ( ruleDecimal )
            // InternalRangoMode.g:9947:3: ruleDecimal
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
    // InternalRangoMode.g:9956:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9960:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9961:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9961:2: ( RULE_INT )
            // InternalRangoMode.g:9962:3: RULE_INT
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
    // InternalRangoMode.g:9971:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9975:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9976:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9976:2: ( ruleDecimal )
            // InternalRangoMode.g:9977:3: ruleDecimal
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
    // InternalRangoMode.g:9986:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9990:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9991:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9991:2: ( ruleDecimal )
            // InternalRangoMode.g:9992:3: ruleDecimal
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
    // InternalRangoMode.g:10001:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10005:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10006:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10006:2: ( RULE_ID )
            // InternalRangoMode.g:10007:3: RULE_ID
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
    // InternalRangoMode.g:10016:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10020:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10021:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10021:2: ( RULE_STRING )
            // InternalRangoMode.g:10022:3: RULE_STRING
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
    // InternalRangoMode.g:10031:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10035:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:10036:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:10036:2: ( rulePlayerEffect )
            // InternalRangoMode.g:10037:3: rulePlayerEffect
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
    // InternalRangoMode.g:10046:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10050:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:10051:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:10051:2: ( rulePlayerEffect )
            // InternalRangoMode.g:10052:3: rulePlayerEffect
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
    // InternalRangoMode.g:10061:1: rule__Material__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Material__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10065:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10066:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10066:2: ( RULE_ID )
            // InternalRangoMode.g:10067:3: RULE_ID
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
    // InternalRangoMode.g:10076:1: rule__Material__BounceAssignment_3_0_1 : ( ruleDecimal ) ;
    public final void rule__Material__BounceAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10080:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10081:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10081:2: ( ruleDecimal )
            // InternalRangoMode.g:10082:3: ruleDecimal
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
    // InternalRangoMode.g:10091:1: rule__Material__SpriteAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Material__SpriteAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10095:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10096:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10096:2: ( RULE_STRING )
            // InternalRangoMode.g:10097:3: RULE_STRING
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
    // InternalRangoMode.g:10106:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10110:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10111:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10111:2: ( RULE_ID )
            // InternalRangoMode.g:10112:3: RULE_ID
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
    // InternalRangoMode.g:10121:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10125:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10126:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10126:2: ( RULE_STRING )
            // InternalRangoMode.g:10127:3: RULE_STRING
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
    // InternalRangoMode.g:10136:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10140:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10141:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10141:2: ( RULE_INT )
            // InternalRangoMode.g:10142:3: RULE_INT
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
    // InternalRangoMode.g:10151:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10155:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10156:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10156:2: ( RULE_INT )
            // InternalRangoMode.g:10157:3: RULE_INT
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
    // InternalRangoMode.g:10166:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10170:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10171:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10171:2: ( ruleDecimal )
            // InternalRangoMode.g:10172:3: ruleDecimal
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
    // InternalRangoMode.g:10181:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10185:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10186:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10186:2: ( ruleDecimal )
            // InternalRangoMode.g:10187:3: ruleDecimal
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
    // InternalRangoMode.g:10196:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10200:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10201:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10201:2: ( ruleDecimal )
            // InternalRangoMode.g:10202:3: ruleDecimal
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
    // InternalRangoMode.g:10211:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10215:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10216:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10216:2: ( ruleDecimal )
            // InternalRangoMode.g:10217:3: ruleDecimal
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
    // InternalRangoMode.g:10226:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10230:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10231:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10231:2: ( RULE_ID )
            // InternalRangoMode.g:10232:3: RULE_ID
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
    // InternalRangoMode.g:10241:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10245:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10246:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10246:2: ( RULE_STRING )
            // InternalRangoMode.g:10247:3: RULE_STRING
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
    // InternalRangoMode.g:10256:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10260:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10261:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10261:2: ( RULE_STRING )
            // InternalRangoMode.g:10262:3: RULE_STRING
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
    // InternalRangoMode.g:10271:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10275:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10276:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10276:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10277:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:10278:3: ( RULE_ID )
            // InternalRangoMode.g:10279:4: RULE_ID
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
    // InternalRangoMode.g:10290:1: rule__GameMode__GravityAssignment_7_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10294:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10295:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10295:2: ( ruleDecimal )
            // InternalRangoMode.g:10296:3: ruleDecimal
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
    // InternalRangoMode.g:10305:1: rule__GameMode__SpeedBonusAssignment_7_1 : ( ruleSpeedBonus ) ;
    public final void rule__GameMode__SpeedBonusAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10309:1: ( ( ruleSpeedBonus ) )
            // InternalRangoMode.g:10310:2: ( ruleSpeedBonus )
            {
            // InternalRangoMode.g:10310:2: ( ruleSpeedBonus )
            // InternalRangoMode.g:10311:3: ruleSpeedBonus
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
    // InternalRangoMode.g:10320:1: rule__GameMode__LevelsAssignment_8_0 : ( ruleSingleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10324:1: ( ( ruleSingleLevel ) )
            // InternalRangoMode.g:10325:2: ( ruleSingleLevel )
            {
            // InternalRangoMode.g:10325:2: ( ruleSingleLevel )
            // InternalRangoMode.g:10326:3: ruleSingleLevel
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
    // InternalRangoMode.g:10335:1: rule__GameMode__LevelsAssignment_8_1 : ( ruleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10339:1: ( ( ruleLevel ) )
            // InternalRangoMode.g:10340:2: ( ruleLevel )
            {
            // InternalRangoMode.g:10340:2: ( ruleLevel )
            // InternalRangoMode.g:10341:3: ruleLevel
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
    // InternalRangoMode.g:10350:1: rule__GameMode__WinConditionsAssignment_10_2 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10354:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10355:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10355:2: ( ruleEndCondition )
            // InternalRangoMode.g:10356:3: ruleEndCondition
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
    // InternalRangoMode.g:10365:1: rule__GameMode__WinConditionsAssignment_10_3_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10369:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10370:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10370:2: ( ruleEndCondition )
            // InternalRangoMode.g:10371:3: ruleEndCondition
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
    // InternalRangoMode.g:10380:1: rule__GameMode__LoseConditionsAssignment_13 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10384:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10385:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10385:2: ( ruleEndCondition )
            // InternalRangoMode.g:10386:3: ruleEndCondition
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
    // InternalRangoMode.g:10395:1: rule__GameMode__LoseConditionsAssignment_14_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10399:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10400:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10400:2: ( ruleEndCondition )
            // InternalRangoMode.g:10401:3: ruleEndCondition
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
    // InternalRangoMode.g:10410:1: rule__SingleLevel__ArenaAssignment_0 : ( ruleArena ) ;
    public final void rule__SingleLevel__ArenaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10414:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10415:2: ( ruleArena )
            {
            // InternalRangoMode.g:10415:2: ( ruleArena )
            // InternalRangoMode.g:10416:3: ruleArena
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
    // InternalRangoMode.g:10425:1: rule__SingleLevel__SpawningAssignment_1 : ( ruleSpawnStrategy ) ;
    public final void rule__SingleLevel__SpawningAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10429:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10430:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10430:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10431:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:10440:1: rule__Level__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Level__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10444:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10445:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10445:2: ( RULE_STRING )
            // InternalRangoMode.g:10446:3: RULE_STRING
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
    // InternalRangoMode.g:10455:1: rule__Level__ArenaAssignment_3 : ( ruleArena ) ;
    public final void rule__Level__ArenaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10459:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10460:2: ( ruleArena )
            {
            // InternalRangoMode.g:10460:2: ( ruleArena )
            // InternalRangoMode.g:10461:3: ruleArena
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
    // InternalRangoMode.g:10470:1: rule__Level__SpawningAssignment_4 : ( ruleSpawnStrategy ) ;
    public final void rule__Level__SpawningAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10474:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10475:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10475:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10476:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:10485:1: rule__SpeedBonus__MaxFactorAssignment_3_2 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__MaxFactorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10489:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10490:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10490:2: ( ruleDecimal )
            // InternalRangoMode.g:10491:3: ruleDecimal
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
    // InternalRangoMode.g:10500:1: rule__SpeedBonus__DurationAssignment_4_1 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10504:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10505:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10505:2: ( ruleDecimal )
            // InternalRangoMode.g:10506:3: ruleDecimal
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
    // InternalRangoMode.g:10515:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10519:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10520:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10520:2: ( RULE_STRING )
            // InternalRangoMode.g:10521:3: RULE_STRING
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
    // InternalRangoMode.g:10530:1: rule__Arena__FloorAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__FloorAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10534:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10535:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10535:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10536:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getFloorMaterialCrossReference_4_0_1_0()); 
            // InternalRangoMode.g:10537:3: ( RULE_ID )
            // InternalRangoMode.g:10538:4: RULE_ID
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
    // InternalRangoMode.g:10549:1: rule__Arena__WallsAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__WallsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10553:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10554:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10554:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10555:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getWallsMaterialCrossReference_4_1_1_0()); 
            // InternalRangoMode.g:10556:3: ( RULE_ID )
            // InternalRangoMode.g:10557:4: RULE_ID
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
    // InternalRangoMode.g:10568:1: rule__Arena__PlayerStartAssignment_4_2_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10572:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10573:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10573:2: ( ruleDecimal )
            // InternalRangoMode.g:10574:3: ruleDecimal
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
    // InternalRangoMode.g:10583:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10587:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:10588:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:10588:2: ( ruleObstacle )
            // InternalRangoMode.g:10589:3: ruleObstacle
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
    // InternalRangoMode.g:10598:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10602:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10603:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10603:2: ( ruleDecimal )
            // InternalRangoMode.g:10604:3: ruleDecimal
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
    // InternalRangoMode.g:10613:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10617:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10618:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10618:2: ( ruleDecimal )
            // InternalRangoMode.g:10619:3: ruleDecimal
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
    // InternalRangoMode.g:10628:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10632:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10633:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10633:2: ( RULE_ID )
            // InternalRangoMode.g:10634:3: RULE_ID
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
    // InternalRangoMode.g:10643:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10647:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10648:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10648:2: ( RULE_INT )
            // InternalRangoMode.g:10649:3: RULE_INT
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
    // InternalRangoMode.g:10658:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10662:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10663:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10663:2: ( RULE_INT )
            // InternalRangoMode.g:10664:3: RULE_INT
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
    // InternalRangoMode.g:10673:1: rule__Block__MaterialAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Block__MaterialAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10677:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10678:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10678:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10679:3: ( RULE_ID )
            {
             before(grammarAccess.getBlockAccess().getMaterialMaterialCrossReference_7_1_0()); 
            // InternalRangoMode.g:10680:3: ( RULE_ID )
            // InternalRangoMode.g:10681:4: RULE_ID
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
    // InternalRangoMode.g:10692:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10696:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10697:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10697:2: ( RULE_ID )
            // InternalRangoMode.g:10698:3: RULE_ID
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
    // InternalRangoMode.g:10707:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10711:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10712:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10712:2: ( ruleDecimal )
            // InternalRangoMode.g:10713:3: ruleDecimal
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
    // InternalRangoMode.g:10722:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10726:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10727:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10727:2: ( ruleTarget )
            // InternalRangoMode.g:10728:3: ruleTarget
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
    // InternalRangoMode.g:10737:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10741:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10742:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10742:2: ( RULE_ID )
            // InternalRangoMode.g:10743:3: RULE_ID
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
    // InternalRangoMode.g:10752:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10756:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10757:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10757:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10758:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:10759:3: ( RULE_ID )
            // InternalRangoMode.g:10760:4: RULE_ID
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
    // InternalRangoMode.g:10771:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10775:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10776:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10776:2: ( ruleTarget )
            // InternalRangoMode.g:10777:3: ruleTarget
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
    // InternalRangoMode.g:10786:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleEnemySpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10790:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10791:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10791:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10792:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10801:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10805:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10806:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10806:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10807:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10808:3: ( 'looping' )
            // InternalRangoMode.g:10809:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,99,FOLLOW_2); 
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
    // InternalRangoMode.g:10820:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10824:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10825:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10825:2: ( RULE_INT )
            // InternalRangoMode.g:10826:3: RULE_INT
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
    // InternalRangoMode.g:10835:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10839:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10840:2: ( ruleWave )
            {
            // InternalRangoMode.g:10840:2: ( ruleWave )
            // InternalRangoMode.g:10841:3: ruleWave
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
    // InternalRangoMode.g:10850:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10854:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10855:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10855:2: ( ruleDecimal )
            // InternalRangoMode.g:10856:3: ruleDecimal
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
    // InternalRangoMode.g:10865:1: rule__Wave__SpawnsAssignment_3 : ( ruleEnemySpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10869:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10870:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10870:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10871:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10880:1: rule__EnemySpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10884:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10885:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10885:2: ( RULE_INT )
            // InternalRangoMode.g:10886:3: RULE_INT
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
    // InternalRangoMode.g:10895:1: rule__EnemySpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnemySpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10899:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10900:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10900:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10901:3: ( RULE_ID )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10902:3: ( RULE_ID )
            // InternalRangoMode.g:10903:4: RULE_ID
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
    // InternalRangoMode.g:10914:1: rule__EnemySpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10918:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10919:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10919:2: ( RULE_INT )
            // InternalRangoMode.g:10920:3: RULE_INT
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
    // InternalRangoMode.g:10929:1: rule__EnemySpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__EnemySpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10933:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10934:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10934:2: ( ruleDirection )
            // InternalRangoMode.g:10935:3: ruleDirection
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
    // InternalRangoMode.g:10944:1: rule__Drops__DropsAssignment_2 : ( ruleDropTable ) ;
    public final void rule__Drops__DropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10948:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10949:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10949:2: ( ruleDropTable )
            // InternalRangoMode.g:10950:3: ruleDropTable
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
    // InternalRangoMode.g:10959:1: rule__DropTable__EnemyTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DropTable__EnemyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10963:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10964:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10964:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10965:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 
            // InternalRangoMode.g:10966:3: ( RULE_ID )
            // InternalRangoMode.g:10967:4: RULE_ID
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
    // InternalRangoMode.g:10978:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10982:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10983:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10983:2: ( ruleDecimal )
            // InternalRangoMode.g:10984:3: ruleDecimal
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
    // InternalRangoMode.g:10993:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10997:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10998:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10998:2: ( ruleDrop )
            // InternalRangoMode.g:10999:3: ruleDrop
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
    // InternalRangoMode.g:11008:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11012:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:11013:2: ( ruleDrop )
            {
            // InternalRangoMode.g:11013:2: ( ruleDrop )
            // InternalRangoMode.g:11014:3: ruleDrop
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
    // InternalRangoMode.g:11023:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11027:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:11028:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:11028:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:11029:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:11030:3: ( RULE_ID )
            // InternalRangoMode.g:11031:4: RULE_ID
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
    // InternalRangoMode.g:11042:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11046:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:11047:2: ( RULE_INT )
            {
            // InternalRangoMode.g:11047:2: ( RULE_INT )
            // InternalRangoMode.g:11048:3: RULE_INT
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
    // InternalRangoMode.g:11057:1: rule__TimeReached__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeReached__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11061:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:11062:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:11062:2: ( ruleDecimal )
            // InternalRangoMode.g:11063:3: ruleDecimal
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
    // InternalRangoMode.g:11072:1: rule__ScoreReached__PointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ScoreReached__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11076:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:11077:2: ( RULE_INT )
            {
            // InternalRangoMode.g:11077:2: ( RULE_INT )
            // InternalRangoMode.g:11078:3: RULE_INT
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
    // InternalRangoMode.g:11087:1: rule__EnemiesPopped__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesPopped__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11091:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:11092:2: ( RULE_INT )
            {
            // InternalRangoMode.g:11092:2: ( RULE_INT )
            // InternalRangoMode.g:11093:3: RULE_INT
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
    // InternalRangoMode.g:11102:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11106:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:11107:2: ( RULE_INT )
            {
            // InternalRangoMode.g:11107:2: ( RULE_INT )
            // InternalRangoMode.g:11108:3: RULE_INT
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
    // InternalRangoMode.g:11117:1: rule__EnemiesAlive__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesAlive__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:11121:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:11122:2: ( RULE_INT )
            {
            // InternalRangoMode.g:11122:2: ( RULE_INT )
            // InternalRangoMode.g:11123:3: RULE_INT
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
    static final String dfa_2s = "\1\4\3\uffff\1\14\2\uffff\1\136\2\uffff";
    static final String dfa_3s = "\1\135\3\uffff\1\122\2\uffff\1\141\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\1\uffff\1\7\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\52\uffff\1\5\51\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\105\uffff\1\6",
            "",
            "",
            "\1\11\2\uffff\1\10",
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
            return "1274:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010280000022040L,0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0010280000022002L,0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000023808000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000EC00008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0220000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000010L,0x000000002A000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000800000L,0x0000000000012200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000040000L,0x0000000800000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000040000L,0x0000000000200000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x000EC00008000002L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0100000008000002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000018L});

}
