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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'everything'", "'enemies'", "'player'", "'left'", "'right'", "'edition'", "'enemy'", "'{'", "'on'", "'pop'", "':'", "'contact'", "'}'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'lose'", "'when'", "'description'", "'gravity'", "'win'", "'or'", "'level'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'looping'"
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


    // $ANTLR start "entryRulePlayerProfile"
    // InternalRangoMode.g:353:1: entryRulePlayerProfile : rulePlayerProfile EOF ;
    public final void entryRulePlayerProfile() throws RecognitionException {
        try {
            // InternalRangoMode.g:354:1: ( rulePlayerProfile EOF )
            // InternalRangoMode.g:355:1: rulePlayerProfile EOF
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
    // InternalRangoMode.g:362:1: rulePlayerProfile : ( ( rule__PlayerProfile__Group__0 ) ) ;
    public final void rulePlayerProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:366:2: ( ( ( rule__PlayerProfile__Group__0 ) ) )
            // InternalRangoMode.g:367:2: ( ( rule__PlayerProfile__Group__0 ) )
            {
            // InternalRangoMode.g:367:2: ( ( rule__PlayerProfile__Group__0 ) )
            // InternalRangoMode.g:368:3: ( rule__PlayerProfile__Group__0 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup()); 
            // InternalRangoMode.g:369:3: ( rule__PlayerProfile__Group__0 )
            // InternalRangoMode.g:369:4: rule__PlayerProfile__Group__0
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
    // InternalRangoMode.g:378:1: entryRuleGameMode : ruleGameMode EOF ;
    public final void entryRuleGameMode() throws RecognitionException {
        try {
            // InternalRangoMode.g:379:1: ( ruleGameMode EOF )
            // InternalRangoMode.g:380:1: ruleGameMode EOF
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
    // InternalRangoMode.g:387:1: ruleGameMode : ( ( rule__GameMode__Group__0 ) ) ;
    public final void ruleGameMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:391:2: ( ( ( rule__GameMode__Group__0 ) ) )
            // InternalRangoMode.g:392:2: ( ( rule__GameMode__Group__0 ) )
            {
            // InternalRangoMode.g:392:2: ( ( rule__GameMode__Group__0 ) )
            // InternalRangoMode.g:393:3: ( rule__GameMode__Group__0 )
            {
             before(grammarAccess.getGameModeAccess().getGroup()); 
            // InternalRangoMode.g:394:3: ( rule__GameMode__Group__0 )
            // InternalRangoMode.g:394:4: rule__GameMode__Group__0
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
    // InternalRangoMode.g:403:1: entryRuleSingleLevel : ruleSingleLevel EOF ;
    public final void entryRuleSingleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:404:1: ( ruleSingleLevel EOF )
            // InternalRangoMode.g:405:1: ruleSingleLevel EOF
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
    // InternalRangoMode.g:412:1: ruleSingleLevel : ( ( rule__SingleLevel__Group__0 ) ) ;
    public final void ruleSingleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:416:2: ( ( ( rule__SingleLevel__Group__0 ) ) )
            // InternalRangoMode.g:417:2: ( ( rule__SingleLevel__Group__0 ) )
            {
            // InternalRangoMode.g:417:2: ( ( rule__SingleLevel__Group__0 ) )
            // InternalRangoMode.g:418:3: ( rule__SingleLevel__Group__0 )
            {
             before(grammarAccess.getSingleLevelAccess().getGroup()); 
            // InternalRangoMode.g:419:3: ( rule__SingleLevel__Group__0 )
            // InternalRangoMode.g:419:4: rule__SingleLevel__Group__0
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
    // InternalRangoMode.g:428:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalRangoMode.g:429:1: ( ruleLevel EOF )
            // InternalRangoMode.g:430:1: ruleLevel EOF
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
    // InternalRangoMode.g:437:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:441:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalRangoMode.g:442:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalRangoMode.g:442:2: ( ( rule__Level__Group__0 ) )
            // InternalRangoMode.g:443:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalRangoMode.g:444:3: ( rule__Level__Group__0 )
            // InternalRangoMode.g:444:4: rule__Level__Group__0
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
    // InternalRangoMode.g:453:1: entryRuleSpeedBonus : ruleSpeedBonus EOF ;
    public final void entryRuleSpeedBonus() throws RecognitionException {
        try {
            // InternalRangoMode.g:454:1: ( ruleSpeedBonus EOF )
            // InternalRangoMode.g:455:1: ruleSpeedBonus EOF
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
    // InternalRangoMode.g:462:1: ruleSpeedBonus : ( ( rule__SpeedBonus__Group__0 ) ) ;
    public final void ruleSpeedBonus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:466:2: ( ( ( rule__SpeedBonus__Group__0 ) ) )
            // InternalRangoMode.g:467:2: ( ( rule__SpeedBonus__Group__0 ) )
            {
            // InternalRangoMode.g:467:2: ( ( rule__SpeedBonus__Group__0 ) )
            // InternalRangoMode.g:468:3: ( rule__SpeedBonus__Group__0 )
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup()); 
            // InternalRangoMode.g:469:3: ( rule__SpeedBonus__Group__0 )
            // InternalRangoMode.g:469:4: rule__SpeedBonus__Group__0
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
    // InternalRangoMode.g:478:1: entryRuleArena : ruleArena EOF ;
    public final void entryRuleArena() throws RecognitionException {
        try {
            // InternalRangoMode.g:479:1: ( ruleArena EOF )
            // InternalRangoMode.g:480:1: ruleArena EOF
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
    // InternalRangoMode.g:487:1: ruleArena : ( ( rule__Arena__Group__0 ) ) ;
    public final void ruleArena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:491:2: ( ( ( rule__Arena__Group__0 ) ) )
            // InternalRangoMode.g:492:2: ( ( rule__Arena__Group__0 ) )
            {
            // InternalRangoMode.g:492:2: ( ( rule__Arena__Group__0 ) )
            // InternalRangoMode.g:493:3: ( rule__Arena__Group__0 )
            {
             before(grammarAccess.getArenaAccess().getGroup()); 
            // InternalRangoMode.g:494:3: ( rule__Arena__Group__0 )
            // InternalRangoMode.g:494:4: rule__Arena__Group__0
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
    // InternalRangoMode.g:504:1: ruleAt : ( ( rule__At__Group__0 ) ) ;
    public final void ruleAt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:508:2: ( ( ( rule__At__Group__0 ) ) )
            // InternalRangoMode.g:509:2: ( ( rule__At__Group__0 ) )
            {
            // InternalRangoMode.g:509:2: ( ( rule__At__Group__0 ) )
            // InternalRangoMode.g:510:3: ( rule__At__Group__0 )
            {
             before(grammarAccess.getAtAccess().getGroup()); 
            // InternalRangoMode.g:511:3: ( rule__At__Group__0 )
            // InternalRangoMode.g:511:4: rule__At__Group__0
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
    // InternalRangoMode.g:520:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalRangoMode.g:521:1: ( ruleObstacle EOF )
            // InternalRangoMode.g:522:1: ruleObstacle EOF
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
    // InternalRangoMode.g:529:1: ruleObstacle : ( ( rule__Obstacle__Alternatives ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:533:2: ( ( ( rule__Obstacle__Alternatives ) ) )
            // InternalRangoMode.g:534:2: ( ( rule__Obstacle__Alternatives ) )
            {
            // InternalRangoMode.g:534:2: ( ( rule__Obstacle__Alternatives ) )
            // InternalRangoMode.g:535:3: ( rule__Obstacle__Alternatives )
            {
             before(grammarAccess.getObstacleAccess().getAlternatives()); 
            // InternalRangoMode.g:536:3: ( rule__Obstacle__Alternatives )
            // InternalRangoMode.g:536:4: rule__Obstacle__Alternatives
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
    // InternalRangoMode.g:545:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRangoMode.g:546:1: ( ruleBlock EOF )
            // InternalRangoMode.g:547:1: ruleBlock EOF
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
    // InternalRangoMode.g:554:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:558:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRangoMode.g:559:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRangoMode.g:559:2: ( ( rule__Block__Group__0 ) )
            // InternalRangoMode.g:560:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRangoMode.g:561:3: ( rule__Block__Group__0 )
            // InternalRangoMode.g:561:4: rule__Block__Group__0
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
    // InternalRangoMode.g:570:1: entryRuleJumpPad : ruleJumpPad EOF ;
    public final void entryRuleJumpPad() throws RecognitionException {
        try {
            // InternalRangoMode.g:571:1: ( ruleJumpPad EOF )
            // InternalRangoMode.g:572:1: ruleJumpPad EOF
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
    // InternalRangoMode.g:579:1: ruleJumpPad : ( ( rule__JumpPad__Group__0 ) ) ;
    public final void ruleJumpPad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:583:2: ( ( ( rule__JumpPad__Group__0 ) ) )
            // InternalRangoMode.g:584:2: ( ( rule__JumpPad__Group__0 ) )
            {
            // InternalRangoMode.g:584:2: ( ( rule__JumpPad__Group__0 ) )
            // InternalRangoMode.g:585:3: ( rule__JumpPad__Group__0 )
            {
             before(grammarAccess.getJumpPadAccess().getGroup()); 
            // InternalRangoMode.g:586:3: ( rule__JumpPad__Group__0 )
            // InternalRangoMode.g:586:4: rule__JumpPad__Group__0
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
    // InternalRangoMode.g:595:1: entryRuleTeleporter : ruleTeleporter EOF ;
    public final void entryRuleTeleporter() throws RecognitionException {
        try {
            // InternalRangoMode.g:596:1: ( ruleTeleporter EOF )
            // InternalRangoMode.g:597:1: ruleTeleporter EOF
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
    // InternalRangoMode.g:604:1: ruleTeleporter : ( ( rule__Teleporter__Group__0 ) ) ;
    public final void ruleTeleporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:608:2: ( ( ( rule__Teleporter__Group__0 ) ) )
            // InternalRangoMode.g:609:2: ( ( rule__Teleporter__Group__0 ) )
            {
            // InternalRangoMode.g:609:2: ( ( rule__Teleporter__Group__0 ) )
            // InternalRangoMode.g:610:3: ( rule__Teleporter__Group__0 )
            {
             before(grammarAccess.getTeleporterAccess().getGroup()); 
            // InternalRangoMode.g:611:3: ( rule__Teleporter__Group__0 )
            // InternalRangoMode.g:611:4: rule__Teleporter__Group__0
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
    // InternalRangoMode.g:620:1: entryRuleSpawnStrategy : ruleSpawnStrategy EOF ;
    public final void entryRuleSpawnStrategy() throws RecognitionException {
        try {
            // InternalRangoMode.g:621:1: ( ruleSpawnStrategy EOF )
            // InternalRangoMode.g:622:1: ruleSpawnStrategy EOF
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
    // InternalRangoMode.g:629:1: ruleSpawnStrategy : ( ( rule__SpawnStrategy__Alternatives ) ) ;
    public final void ruleSpawnStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:633:2: ( ( ( rule__SpawnStrategy__Alternatives ) ) )
            // InternalRangoMode.g:634:2: ( ( rule__SpawnStrategy__Alternatives ) )
            {
            // InternalRangoMode.g:634:2: ( ( rule__SpawnStrategy__Alternatives ) )
            // InternalRangoMode.g:635:3: ( rule__SpawnStrategy__Alternatives )
            {
             before(grammarAccess.getSpawnStrategyAccess().getAlternatives()); 
            // InternalRangoMode.g:636:3: ( rule__SpawnStrategy__Alternatives )
            // InternalRangoMode.g:636:4: rule__SpawnStrategy__Alternatives
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
    // InternalRangoMode.g:645:1: entryRuleFixedLayout : ruleFixedLayout EOF ;
    public final void entryRuleFixedLayout() throws RecognitionException {
        try {
            // InternalRangoMode.g:646:1: ( ruleFixedLayout EOF )
            // InternalRangoMode.g:647:1: ruleFixedLayout EOF
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
    // InternalRangoMode.g:654:1: ruleFixedLayout : ( ( rule__FixedLayout__Group__0 ) ) ;
    public final void ruleFixedLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:658:2: ( ( ( rule__FixedLayout__Group__0 ) ) )
            // InternalRangoMode.g:659:2: ( ( rule__FixedLayout__Group__0 ) )
            {
            // InternalRangoMode.g:659:2: ( ( rule__FixedLayout__Group__0 ) )
            // InternalRangoMode.g:660:3: ( rule__FixedLayout__Group__0 )
            {
             before(grammarAccess.getFixedLayoutAccess().getGroup()); 
            // InternalRangoMode.g:661:3: ( rule__FixedLayout__Group__0 )
            // InternalRangoMode.g:661:4: rule__FixedLayout__Group__0
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
    // InternalRangoMode.g:670:1: entryRuleWaveSchedule : ruleWaveSchedule EOF ;
    public final void entryRuleWaveSchedule() throws RecognitionException {
        try {
            // InternalRangoMode.g:671:1: ( ruleWaveSchedule EOF )
            // InternalRangoMode.g:672:1: ruleWaveSchedule EOF
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
    // InternalRangoMode.g:679:1: ruleWaveSchedule : ( ( rule__WaveSchedule__Group__0 ) ) ;
    public final void ruleWaveSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:683:2: ( ( ( rule__WaveSchedule__Group__0 ) ) )
            // InternalRangoMode.g:684:2: ( ( rule__WaveSchedule__Group__0 ) )
            {
            // InternalRangoMode.g:684:2: ( ( rule__WaveSchedule__Group__0 ) )
            // InternalRangoMode.g:685:3: ( rule__WaveSchedule__Group__0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup()); 
            // InternalRangoMode.g:686:3: ( rule__WaveSchedule__Group__0 )
            // InternalRangoMode.g:686:4: rule__WaveSchedule__Group__0
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
    // InternalRangoMode.g:695:1: entryRuleWave : ruleWave EOF ;
    public final void entryRuleWave() throws RecognitionException {
        try {
            // InternalRangoMode.g:696:1: ( ruleWave EOF )
            // InternalRangoMode.g:697:1: ruleWave EOF
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
    // InternalRangoMode.g:704:1: ruleWave : ( ( rule__Wave__Group__0 ) ) ;
    public final void ruleWave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:708:2: ( ( ( rule__Wave__Group__0 ) ) )
            // InternalRangoMode.g:709:2: ( ( rule__Wave__Group__0 ) )
            {
            // InternalRangoMode.g:709:2: ( ( rule__Wave__Group__0 ) )
            // InternalRangoMode.g:710:3: ( rule__Wave__Group__0 )
            {
             before(grammarAccess.getWaveAccess().getGroup()); 
            // InternalRangoMode.g:711:3: ( rule__Wave__Group__0 )
            // InternalRangoMode.g:711:4: rule__Wave__Group__0
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
    // InternalRangoMode.g:720:1: entryRuleEnemySpawn : ruleEnemySpawn EOF ;
    public final void entryRuleEnemySpawn() throws RecognitionException {
        try {
            // InternalRangoMode.g:721:1: ( ruleEnemySpawn EOF )
            // InternalRangoMode.g:722:1: ruleEnemySpawn EOF
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
    // InternalRangoMode.g:729:1: ruleEnemySpawn : ( ( rule__EnemySpawn__Group__0 ) ) ;
    public final void ruleEnemySpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:733:2: ( ( ( rule__EnemySpawn__Group__0 ) ) )
            // InternalRangoMode.g:734:2: ( ( rule__EnemySpawn__Group__0 ) )
            {
            // InternalRangoMode.g:734:2: ( ( rule__EnemySpawn__Group__0 ) )
            // InternalRangoMode.g:735:3: ( rule__EnemySpawn__Group__0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup()); 
            // InternalRangoMode.g:736:3: ( rule__EnemySpawn__Group__0 )
            // InternalRangoMode.g:736:4: rule__EnemySpawn__Group__0
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
    // InternalRangoMode.g:746:1: ruleDrops : ( ( rule__Drops__Group__0 ) ) ;
    public final void ruleDrops() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:750:2: ( ( ( rule__Drops__Group__0 ) ) )
            // InternalRangoMode.g:751:2: ( ( rule__Drops__Group__0 ) )
            {
            // InternalRangoMode.g:751:2: ( ( rule__Drops__Group__0 ) )
            // InternalRangoMode.g:752:3: ( rule__Drops__Group__0 )
            {
             before(grammarAccess.getDropsAccess().getGroup()); 
            // InternalRangoMode.g:753:3: ( rule__Drops__Group__0 )
            // InternalRangoMode.g:753:4: rule__Drops__Group__0
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
    // InternalRangoMode.g:762:1: entryRuleDropTable : ruleDropTable EOF ;
    public final void entryRuleDropTable() throws RecognitionException {
        try {
            // InternalRangoMode.g:763:1: ( ruleDropTable EOF )
            // InternalRangoMode.g:764:1: ruleDropTable EOF
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
    // InternalRangoMode.g:771:1: ruleDropTable : ( ( rule__DropTable__Group__0 ) ) ;
    public final void ruleDropTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:775:2: ( ( ( rule__DropTable__Group__0 ) ) )
            // InternalRangoMode.g:776:2: ( ( rule__DropTable__Group__0 ) )
            {
            // InternalRangoMode.g:776:2: ( ( rule__DropTable__Group__0 ) )
            // InternalRangoMode.g:777:3: ( rule__DropTable__Group__0 )
            {
             before(grammarAccess.getDropTableAccess().getGroup()); 
            // InternalRangoMode.g:778:3: ( rule__DropTable__Group__0 )
            // InternalRangoMode.g:778:4: rule__DropTable__Group__0
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
    // InternalRangoMode.g:787:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalRangoMode.g:788:1: ( ruleDrop EOF )
            // InternalRangoMode.g:789:1: ruleDrop EOF
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
    // InternalRangoMode.g:796:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:800:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalRangoMode.g:801:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalRangoMode.g:801:2: ( ( rule__Drop__Group__0 ) )
            // InternalRangoMode.g:802:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalRangoMode.g:803:3: ( rule__Drop__Group__0 )
            // InternalRangoMode.g:803:4: rule__Drop__Group__0
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
    // InternalRangoMode.g:812:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:813:1: ( ruleEndCondition EOF )
            // InternalRangoMode.g:814:1: ruleEndCondition EOF
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
    // InternalRangoMode.g:821:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:825:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalRangoMode.g:826:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalRangoMode.g:826:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalRangoMode.g:827:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:828:3: ( rule__EndCondition__Alternatives )
            // InternalRangoMode.g:828:4: rule__EndCondition__Alternatives
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
    // InternalRangoMode.g:837:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:838:1: ( ruleCleared EOF )
            // InternalRangoMode.g:839:1: ruleCleared EOF
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
    // InternalRangoMode.g:846:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:850:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:851:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:851:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:852:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:853:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:853:4: rule__Cleared__Group__0
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
    // InternalRangoMode.g:862:1: entryRuleTimeReached : ruleTimeReached EOF ;
    public final void entryRuleTimeReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:863:1: ( ruleTimeReached EOF )
            // InternalRangoMode.g:864:1: ruleTimeReached EOF
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
    // InternalRangoMode.g:871:1: ruleTimeReached : ( ( rule__TimeReached__Group__0 ) ) ;
    public final void ruleTimeReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:875:2: ( ( ( rule__TimeReached__Group__0 ) ) )
            // InternalRangoMode.g:876:2: ( ( rule__TimeReached__Group__0 ) )
            {
            // InternalRangoMode.g:876:2: ( ( rule__TimeReached__Group__0 ) )
            // InternalRangoMode.g:877:3: ( rule__TimeReached__Group__0 )
            {
             before(grammarAccess.getTimeReachedAccess().getGroup()); 
            // InternalRangoMode.g:878:3: ( rule__TimeReached__Group__0 )
            // InternalRangoMode.g:878:4: rule__TimeReached__Group__0
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
    // InternalRangoMode.g:887:1: entryRuleScoreReached : ruleScoreReached EOF ;
    public final void entryRuleScoreReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:888:1: ( ruleScoreReached EOF )
            // InternalRangoMode.g:889:1: ruleScoreReached EOF
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
    // InternalRangoMode.g:896:1: ruleScoreReached : ( ( rule__ScoreReached__Group__0 ) ) ;
    public final void ruleScoreReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:900:2: ( ( ( rule__ScoreReached__Group__0 ) ) )
            // InternalRangoMode.g:901:2: ( ( rule__ScoreReached__Group__0 ) )
            {
            // InternalRangoMode.g:901:2: ( ( rule__ScoreReached__Group__0 ) )
            // InternalRangoMode.g:902:3: ( rule__ScoreReached__Group__0 )
            {
             before(grammarAccess.getScoreReachedAccess().getGroup()); 
            // InternalRangoMode.g:903:3: ( rule__ScoreReached__Group__0 )
            // InternalRangoMode.g:903:4: rule__ScoreReached__Group__0
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
    // InternalRangoMode.g:912:1: entryRuleEnemiesPopped : ruleEnemiesPopped EOF ;
    public final void entryRuleEnemiesPopped() throws RecognitionException {
        try {
            // InternalRangoMode.g:913:1: ( ruleEnemiesPopped EOF )
            // InternalRangoMode.g:914:1: ruleEnemiesPopped EOF
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
    // InternalRangoMode.g:921:1: ruleEnemiesPopped : ( ( rule__EnemiesPopped__Group__0 ) ) ;
    public final void ruleEnemiesPopped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:925:2: ( ( ( rule__EnemiesPopped__Group__0 ) ) )
            // InternalRangoMode.g:926:2: ( ( rule__EnemiesPopped__Group__0 ) )
            {
            // InternalRangoMode.g:926:2: ( ( rule__EnemiesPopped__Group__0 ) )
            // InternalRangoMode.g:927:3: ( rule__EnemiesPopped__Group__0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getGroup()); 
            // InternalRangoMode.g:928:3: ( rule__EnemiesPopped__Group__0 )
            // InternalRangoMode.g:928:4: rule__EnemiesPopped__Group__0
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
    // InternalRangoMode.g:937:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:938:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:939:1: ruleWavesSurvived EOF
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
    // InternalRangoMode.g:946:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:950:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:951:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:951:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:952:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:953:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:953:4: rule__WavesSurvived__Group__0
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
    // InternalRangoMode.g:962:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:963:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:964:1: ruleHealthDepleted EOF
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
    // InternalRangoMode.g:971:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:975:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:976:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:976:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:977:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:978:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:978:4: rule__HealthDepleted__Group__0
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
    // InternalRangoMode.g:987:1: entryRuleEnemiesAlive : ruleEnemiesAlive EOF ;
    public final void entryRuleEnemiesAlive() throws RecognitionException {
        try {
            // InternalRangoMode.g:988:1: ( ruleEnemiesAlive EOF )
            // InternalRangoMode.g:989:1: ruleEnemiesAlive EOF
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
    // InternalRangoMode.g:996:1: ruleEnemiesAlive : ( ( rule__EnemiesAlive__Group__0 ) ) ;
    public final void ruleEnemiesAlive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1000:2: ( ( ( rule__EnemiesAlive__Group__0 ) ) )
            // InternalRangoMode.g:1001:2: ( ( rule__EnemiesAlive__Group__0 ) )
            {
            // InternalRangoMode.g:1001:2: ( ( rule__EnemiesAlive__Group__0 ) )
            // InternalRangoMode.g:1002:3: ( rule__EnemiesAlive__Group__0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getGroup()); 
            // InternalRangoMode.g:1003:3: ( rule__EnemiesAlive__Group__0 )
            // InternalRangoMode.g:1003:4: rule__EnemiesAlive__Group__0
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
    // InternalRangoMode.g:1012:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:1013:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:1014:1: ruleDecimal EOF
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
    // InternalRangoMode.g:1021:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1025:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:1026:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:1026:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:1027:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:1028:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:1028:4: rule__Decimal__Group__0
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
    // InternalRangoMode.g:1037:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1041:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1042:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1042:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1043:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1044:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1044:4: rule__Target__Alternatives
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
    // InternalRangoMode.g:1053:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1057:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1058:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1058:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1059:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1060:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1060:4: rule__Direction__Alternatives
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
    // InternalRangoMode.g:1068:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_4 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1072:1: ( ( ( rule__Edition__EnemyTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__PlayersAssignment_3_2 ) ) | ( ruleDrops ) | ( ( rule__Edition__ModesAssignment_3_4 ) ) )
            int alt1=5;
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
            case 13:
                {
                alt1=3;
                }
                break;
            case 83:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRangoMode.g:1073:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1073:2: ( ( rule__Edition__EnemyTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1074:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getEnemyTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1075:3: ( rule__Edition__EnemyTypesAssignment_3_0 )
                    // InternalRangoMode.g:1075:4: rule__Edition__EnemyTypesAssignment_3_0
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
                    // InternalRangoMode.g:1079:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1079:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1080:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1081:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1081:4: rule__Edition__PowerUpsAssignment_3_1
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
                    // InternalRangoMode.g:1085:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1085:2: ( ( rule__Edition__PlayersAssignment_3_2 ) )
                    // InternalRangoMode.g:1086:3: ( rule__Edition__PlayersAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_2()); 
                    // InternalRangoMode.g:1087:3: ( rule__Edition__PlayersAssignment_3_2 )
                    // InternalRangoMode.g:1087:4: rule__Edition__PlayersAssignment_3_2
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
                    // InternalRangoMode.g:1091:2: ( ruleDrops )
                    {
                    // InternalRangoMode.g:1091:2: ( ruleDrops )
                    // InternalRangoMode.g:1092:3: ruleDrops
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
                    // InternalRangoMode.g:1097:2: ( ( rule__Edition__ModesAssignment_3_4 ) )
                    {
                    // InternalRangoMode.g:1097:2: ( ( rule__Edition__ModesAssignment_3_4 ) )
                    // InternalRangoMode.g:1098:3: ( rule__Edition__ModesAssignment_3_4 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_4()); 
                    // InternalRangoMode.g:1099:3: ( rule__Edition__ModesAssignment_3_4 )
                    // InternalRangoMode.g:1099:4: rule__Edition__ModesAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__ModesAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getModesAssignment_3_4()); 

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
    // InternalRangoMode.g:1107:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1111:1: ( ( ruleVanish ) | ( ruleSplit ) )
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
                    // InternalRangoMode.g:1112:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1112:2: ( ruleVanish )
                    // InternalRangoMode.g:1113:3: ruleVanish
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
                    // InternalRangoMode.g:1118:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1118:2: ( ruleSplit )
                    // InternalRangoMode.g:1119:3: ruleSplit
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
    // InternalRangoMode.g:1128:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1132:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
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
                    // InternalRangoMode.g:1133:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1133:2: ( ruleDamage )
                    // InternalRangoMode.g:1134:3: ruleDamage
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
                    // InternalRangoMode.g:1139:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1139:2: ( ruleHeal )
                    // InternalRangoMode.g:1140:3: ruleHeal
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
                    // InternalRangoMode.g:1145:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1145:2: ( ruleShield )
                    // InternalRangoMode.g:1146:3: ruleShield
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
                    // InternalRangoMode.g:1151:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1151:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1152:3: ruleSpeedChange
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
                    // InternalRangoMode.g:1157:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1157:2: ( rulePoison )
                    // InternalRangoMode.g:1158:3: rulePoison
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
    // InternalRangoMode.g:1167:1: rule__GameMode__Alternatives_8 : ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) );
    public final void rule__GameMode__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1171:1: ( ( ( rule__GameMode__LevelsAssignment_8_0 ) ) | ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==64) ) {
                alt5=1;
            }
            else if ( (LA5_0==58) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1172:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    {
                    // InternalRangoMode.g:1172:2: ( ( rule__GameMode__LevelsAssignment_8_0 ) )
                    // InternalRangoMode.g:1173:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_0()); 
                    // InternalRangoMode.g:1174:3: ( rule__GameMode__LevelsAssignment_8_0 )
                    // InternalRangoMode.g:1174:4: rule__GameMode__LevelsAssignment_8_0
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
                    // InternalRangoMode.g:1178:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    {
                    // InternalRangoMode.g:1178:2: ( ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* ) )
                    // InternalRangoMode.g:1179:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) ) ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    {
                    // InternalRangoMode.g:1179:3: ( ( rule__GameMode__LevelsAssignment_8_1 ) )
                    // InternalRangoMode.g:1180:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1181:4: ( rule__GameMode__LevelsAssignment_8_1 )
                    // InternalRangoMode.g:1181:5: rule__GameMode__LevelsAssignment_8_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__GameMode__LevelsAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 

                    }

                    // InternalRangoMode.g:1184:3: ( ( rule__GameMode__LevelsAssignment_8_1 )* )
                    // InternalRangoMode.g:1185:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    {
                     before(grammarAccess.getGameModeAccess().getLevelsAssignment_8_1()); 
                    // InternalRangoMode.g:1186:4: ( rule__GameMode__LevelsAssignment_8_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==58) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRangoMode.g:1186:5: rule__GameMode__LevelsAssignment_8_1
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
    // InternalRangoMode.g:1195:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1199:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt6=1;
                }
                break;
            case 73:
                {
                alt6=2;
                }
                break;
            case 76:
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
                    // InternalRangoMode.g:1200:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1200:2: ( ruleBlock )
                    // InternalRangoMode.g:1201:3: ruleBlock
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
                    // InternalRangoMode.g:1206:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1206:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1207:3: ruleJumpPad
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
                    // InternalRangoMode.g:1212:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1212:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1213:3: ruleTeleporter
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
    // InternalRangoMode.g:1222:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1226:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==77) ) {
                alt7=1;
            }
            else if ( (LA7_0==78) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1227:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1227:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1228:3: ruleFixedLayout
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
                    // InternalRangoMode.g:1233:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1233:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1234:3: ruleWaveSchedule
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
    // InternalRangoMode.g:1243:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1247:1: ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:1248:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1248:2: ( ruleCleared )
                    // InternalRangoMode.g:1249:3: ruleCleared
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
                    // InternalRangoMode.g:1254:2: ( ruleTimeReached )
                    {
                    // InternalRangoMode.g:1254:2: ( ruleTimeReached )
                    // InternalRangoMode.g:1255:3: ruleTimeReached
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
                    // InternalRangoMode.g:1260:2: ( ruleScoreReached )
                    {
                    // InternalRangoMode.g:1260:2: ( ruleScoreReached )
                    // InternalRangoMode.g:1261:3: ruleScoreReached
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
                    // InternalRangoMode.g:1266:2: ( ruleEnemiesPopped )
                    {
                    // InternalRangoMode.g:1266:2: ( ruleEnemiesPopped )
                    // InternalRangoMode.g:1267:3: ruleEnemiesPopped
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
                    // InternalRangoMode.g:1272:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1272:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1273:3: ruleWavesSurvived
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
                    // InternalRangoMode.g:1278:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1278:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1279:3: ruleHealthDepleted
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
                    // InternalRangoMode.g:1284:2: ( ruleEnemiesAlive )
                    {
                    // InternalRangoMode.g:1284:2: ( ruleEnemiesAlive )
                    // InternalRangoMode.g:1285:3: ruleEnemiesAlive
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
    // InternalRangoMode.g:1294:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1298:1: ( ( ( 'everything' ) ) | ( ( 'enemies' ) ) | ( ( 'player' ) ) )
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
                    // InternalRangoMode.g:1299:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1299:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1300:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1301:3: ( 'everything' )
                    // InternalRangoMode.g:1301:4: 'everything'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1305:2: ( ( 'enemies' ) )
                    {
                    // InternalRangoMode.g:1305:2: ( ( 'enemies' ) )
                    // InternalRangoMode.g:1306:3: ( 'enemies' )
                    {
                     before(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1307:3: ( 'enemies' )
                    // InternalRangoMode.g:1307:4: 'enemies'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1311:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1311:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1312:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1313:3: ( 'player' )
                    // InternalRangoMode.g:1313:4: 'player'
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
    // InternalRangoMode.g:1321:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1325:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
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
                    // InternalRangoMode.g:1326:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1326:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1327:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1328:3: ( 'left' )
                    // InternalRangoMode.g:1328:4: 'left'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1332:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1332:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1333:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1334:3: ( 'right' )
                    // InternalRangoMode.g:1334:4: 'right'
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
    // InternalRangoMode.g:1342:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1346:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1347:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
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
    // InternalRangoMode.g:1354:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1358:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1359:1: ( 'edition' )
            {
            // InternalRangoMode.g:1359:1: ( 'edition' )
            // InternalRangoMode.g:1360:2: 'edition'
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
    // InternalRangoMode.g:1369:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1373:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1374:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
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
    // InternalRangoMode.g:1381:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1385:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1386:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1386:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1387:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1388:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1388:3: rule__Edition__NameAssignment_1
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
    // InternalRangoMode.g:1396:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1400:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1401:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
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
    // InternalRangoMode.g:1408:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1412:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1413:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1413:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1414:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1415:2: ( rule__Edition__TitleAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRangoMode.g:1415:3: rule__Edition__TitleAssignment_2
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
    // InternalRangoMode.g:1423:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1427:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1428:2: rule__Edition__Group__3__Impl
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
    // InternalRangoMode.g:1434:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1438:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1439:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1439:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1440:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1441:2: ( rule__Edition__Alternatives_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13||LA12_0==17||LA12_0==43||LA12_0==51||LA12_0==83) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRangoMode.g:1441:3: rule__Edition__Alternatives_3
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
    // InternalRangoMode.g:1450:1: rule__EnemyType__Group__0 : rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 ;
    public final void rule__EnemyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1454:1: ( rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1 )
            // InternalRangoMode.g:1455:2: rule__EnemyType__Group__0__Impl rule__EnemyType__Group__1
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
    // InternalRangoMode.g:1462:1: rule__EnemyType__Group__0__Impl : ( 'enemy' ) ;
    public final void rule__EnemyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1466:1: ( ( 'enemy' ) )
            // InternalRangoMode.g:1467:1: ( 'enemy' )
            {
            // InternalRangoMode.g:1467:1: ( 'enemy' )
            // InternalRangoMode.g:1468:2: 'enemy'
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
    // InternalRangoMode.g:1477:1: rule__EnemyType__Group__1 : rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 ;
    public final void rule__EnemyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1481:1: ( rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2 )
            // InternalRangoMode.g:1482:2: rule__EnemyType__Group__1__Impl rule__EnemyType__Group__2
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
    // InternalRangoMode.g:1489:1: rule__EnemyType__Group__1__Impl : ( ( rule__EnemyType__NameAssignment_1 ) ) ;
    public final void rule__EnemyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1493:1: ( ( ( rule__EnemyType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1494:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1494:1: ( ( rule__EnemyType__NameAssignment_1 ) )
            // InternalRangoMode.g:1495:2: ( rule__EnemyType__NameAssignment_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1496:2: ( rule__EnemyType__NameAssignment_1 )
            // InternalRangoMode.g:1496:3: rule__EnemyType__NameAssignment_1
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
    // InternalRangoMode.g:1504:1: rule__EnemyType__Group__2 : rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 ;
    public final void rule__EnemyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1508:1: ( rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3 )
            // InternalRangoMode.g:1509:2: rule__EnemyType__Group__2__Impl rule__EnemyType__Group__3
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
    // InternalRangoMode.g:1516:1: rule__EnemyType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnemyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1520:1: ( ( '{' ) )
            // InternalRangoMode.g:1521:1: ( '{' )
            {
            // InternalRangoMode.g:1521:1: ( '{' )
            // InternalRangoMode.g:1522:2: '{'
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
    // InternalRangoMode.g:1531:1: rule__EnemyType__Group__3 : rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 ;
    public final void rule__EnemyType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1535:1: ( rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4 )
            // InternalRangoMode.g:1536:2: rule__EnemyType__Group__3__Impl rule__EnemyType__Group__4
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
    // InternalRangoMode.g:1543:1: rule__EnemyType__Group__3__Impl : ( ( rule__EnemyType__UnorderedGroup_3 ) ) ;
    public final void rule__EnemyType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1547:1: ( ( ( rule__EnemyType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1548:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1548:1: ( ( rule__EnemyType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1549:2: ( rule__EnemyType__UnorderedGroup_3 )
            {
             before(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1550:2: ( rule__EnemyType__UnorderedGroup_3 )
            // InternalRangoMode.g:1550:3: rule__EnemyType__UnorderedGroup_3
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
    // InternalRangoMode.g:1558:1: rule__EnemyType__Group__4 : rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 ;
    public final void rule__EnemyType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1562:1: ( rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5 )
            // InternalRangoMode.g:1563:2: rule__EnemyType__Group__4__Impl rule__EnemyType__Group__5
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
    // InternalRangoMode.g:1570:1: rule__EnemyType__Group__4__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1574:1: ( ( 'on' ) )
            // InternalRangoMode.g:1575:1: ( 'on' )
            {
            // InternalRangoMode.g:1575:1: ( 'on' )
            // InternalRangoMode.g:1576:2: 'on'
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
    // InternalRangoMode.g:1585:1: rule__EnemyType__Group__5 : rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 ;
    public final void rule__EnemyType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1589:1: ( rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6 )
            // InternalRangoMode.g:1590:2: rule__EnemyType__Group__5__Impl rule__EnemyType__Group__6
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
    // InternalRangoMode.g:1597:1: rule__EnemyType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__EnemyType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1601:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1602:1: ( 'pop' )
            {
            // InternalRangoMode.g:1602:1: ( 'pop' )
            // InternalRangoMode.g:1603:2: 'pop'
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
    // InternalRangoMode.g:1612:1: rule__EnemyType__Group__6 : rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 ;
    public final void rule__EnemyType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1616:1: ( rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7 )
            // InternalRangoMode.g:1617:2: rule__EnemyType__Group__6__Impl rule__EnemyType__Group__7
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
    // InternalRangoMode.g:1624:1: rule__EnemyType__Group__6__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1628:1: ( ( ':' ) )
            // InternalRangoMode.g:1629:1: ( ':' )
            {
            // InternalRangoMode.g:1629:1: ( ':' )
            // InternalRangoMode.g:1630:2: ':'
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
    // InternalRangoMode.g:1639:1: rule__EnemyType__Group__7 : rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 ;
    public final void rule__EnemyType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1643:1: ( rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8 )
            // InternalRangoMode.g:1644:2: rule__EnemyType__Group__7__Impl rule__EnemyType__Group__8
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
    // InternalRangoMode.g:1651:1: rule__EnemyType__Group__7__Impl : ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) ;
    public final void rule__EnemyType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1655:1: ( ( ( rule__EnemyType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:1656:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:1656:1: ( ( rule__EnemyType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:1657:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:1658:2: ( rule__EnemyType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:1658:3: rule__EnemyType__SplitRuleAssignment_7
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
    // InternalRangoMode.g:1666:1: rule__EnemyType__Group__8 : rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 ;
    public final void rule__EnemyType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1670:1: ( rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9 )
            // InternalRangoMode.g:1671:2: rule__EnemyType__Group__8__Impl rule__EnemyType__Group__9
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
    // InternalRangoMode.g:1678:1: rule__EnemyType__Group__8__Impl : ( 'on' ) ;
    public final void rule__EnemyType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1682:1: ( ( 'on' ) )
            // InternalRangoMode.g:1683:1: ( 'on' )
            {
            // InternalRangoMode.g:1683:1: ( 'on' )
            // InternalRangoMode.g:1684:2: 'on'
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
    // InternalRangoMode.g:1693:1: rule__EnemyType__Group__9 : rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 ;
    public final void rule__EnemyType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1697:1: ( rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10 )
            // InternalRangoMode.g:1698:2: rule__EnemyType__Group__9__Impl rule__EnemyType__Group__10
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
    // InternalRangoMode.g:1705:1: rule__EnemyType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__EnemyType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1709:1: ( ( 'contact' ) )
            // InternalRangoMode.g:1710:1: ( 'contact' )
            {
            // InternalRangoMode.g:1710:1: ( 'contact' )
            // InternalRangoMode.g:1711:2: 'contact'
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
    // InternalRangoMode.g:1720:1: rule__EnemyType__Group__10 : rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 ;
    public final void rule__EnemyType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1724:1: ( rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11 )
            // InternalRangoMode.g:1725:2: rule__EnemyType__Group__10__Impl rule__EnemyType__Group__11
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
    // InternalRangoMode.g:1732:1: rule__EnemyType__Group__10__Impl : ( ':' ) ;
    public final void rule__EnemyType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1736:1: ( ( ':' ) )
            // InternalRangoMode.g:1737:1: ( ':' )
            {
            // InternalRangoMode.g:1737:1: ( ':' )
            // InternalRangoMode.g:1738:2: ':'
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
    // InternalRangoMode.g:1747:1: rule__EnemyType__Group__11 : rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 ;
    public final void rule__EnemyType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1751:1: ( rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12 )
            // InternalRangoMode.g:1752:2: rule__EnemyType__Group__11__Impl rule__EnemyType__Group__12
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
    // InternalRangoMode.g:1759:1: rule__EnemyType__Group__11__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__EnemyType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1763:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:1764:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:1764:1: ( ( rule__EnemyType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:1765:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:1766:2: ( rule__EnemyType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:1766:3: rule__EnemyType__ContactEffectsAssignment_11
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
    // InternalRangoMode.g:1774:1: rule__EnemyType__Group__12 : rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 ;
    public final void rule__EnemyType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1778:1: ( rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13 )
            // InternalRangoMode.g:1779:2: rule__EnemyType__Group__12__Impl rule__EnemyType__Group__13
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
    // InternalRangoMode.g:1786:1: rule__EnemyType__Group__12__Impl : ( ( rule__EnemyType__Group_12__0 )* ) ;
    public final void rule__EnemyType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1790:1: ( ( ( rule__EnemyType__Group_12__0 )* ) )
            // InternalRangoMode.g:1791:1: ( ( rule__EnemyType__Group_12__0 )* )
            {
            // InternalRangoMode.g:1791:1: ( ( rule__EnemyType__Group_12__0 )* )
            // InternalRangoMode.g:1792:2: ( rule__EnemyType__Group_12__0 )*
            {
             before(grammarAccess.getEnemyTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:1793:2: ( rule__EnemyType__Group_12__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRangoMode.g:1793:3: rule__EnemyType__Group_12__0
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
    // InternalRangoMode.g:1801:1: rule__EnemyType__Group__13 : rule__EnemyType__Group__13__Impl ;
    public final void rule__EnemyType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1805:1: ( rule__EnemyType__Group__13__Impl )
            // InternalRangoMode.g:1806:2: rule__EnemyType__Group__13__Impl
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
    // InternalRangoMode.g:1812:1: rule__EnemyType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnemyType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1816:1: ( ( '}' ) )
            // InternalRangoMode.g:1817:1: ( '}' )
            {
            // InternalRangoMode.g:1817:1: ( '}' )
            // InternalRangoMode.g:1818:2: '}'
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
    // InternalRangoMode.g:1828:1: rule__EnemyType__Group_3_0__0 : rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 ;
    public final void rule__EnemyType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1832:1: ( rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1 )
            // InternalRangoMode.g:1833:2: rule__EnemyType__Group_3_0__0__Impl rule__EnemyType__Group_3_0__1
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
    // InternalRangoMode.g:1840:1: rule__EnemyType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__EnemyType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1844:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:1845:1: ( 'sprite' )
            {
            // InternalRangoMode.g:1845:1: ( 'sprite' )
            // InternalRangoMode.g:1846:2: 'sprite'
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
    // InternalRangoMode.g:1855:1: rule__EnemyType__Group_3_0__1 : rule__EnemyType__Group_3_0__1__Impl ;
    public final void rule__EnemyType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1859:1: ( rule__EnemyType__Group_3_0__1__Impl )
            // InternalRangoMode.g:1860:2: rule__EnemyType__Group_3_0__1__Impl
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
    // InternalRangoMode.g:1866:1: rule__EnemyType__Group_3_0__1__Impl : ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__EnemyType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1870:1: ( ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:1871:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:1871:1: ( ( rule__EnemyType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:1872:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:1873:2: ( rule__EnemyType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:1873:3: rule__EnemyType__SpriteAssignment_3_0_1
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
    // InternalRangoMode.g:1882:1: rule__EnemyType__Group_3_1__0 : rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 ;
    public final void rule__EnemyType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1886:1: ( rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1 )
            // InternalRangoMode.g:1887:2: rule__EnemyType__Group_3_1__0__Impl rule__EnemyType__Group_3_1__1
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
    // InternalRangoMode.g:1894:1: rule__EnemyType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__EnemyType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1898:1: ( ( 'scale' ) )
            // InternalRangoMode.g:1899:1: ( 'scale' )
            {
            // InternalRangoMode.g:1899:1: ( 'scale' )
            // InternalRangoMode.g:1900:2: 'scale'
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
    // InternalRangoMode.g:1909:1: rule__EnemyType__Group_3_1__1 : rule__EnemyType__Group_3_1__1__Impl ;
    public final void rule__EnemyType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1913:1: ( rule__EnemyType__Group_3_1__1__Impl )
            // InternalRangoMode.g:1914:2: rule__EnemyType__Group_3_1__1__Impl
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
    // InternalRangoMode.g:1920:1: rule__EnemyType__Group_3_1__1__Impl : ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__EnemyType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1924:1: ( ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:1925:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:1925:1: ( ( rule__EnemyType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:1926:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:1927:2: ( rule__EnemyType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:1927:3: rule__EnemyType__ScaleAssignment_3_1_1
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
    // InternalRangoMode.g:1936:1: rule__EnemyType__Group_3_2__0 : rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 ;
    public final void rule__EnemyType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1940:1: ( rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1 )
            // InternalRangoMode.g:1941:2: rule__EnemyType__Group_3_2__0__Impl rule__EnemyType__Group_3_2__1
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
    // InternalRangoMode.g:1948:1: rule__EnemyType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__EnemyType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1952:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:1953:1: ( 'bounce' )
            {
            // InternalRangoMode.g:1953:1: ( 'bounce' )
            // InternalRangoMode.g:1954:2: 'bounce'
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
    // InternalRangoMode.g:1963:1: rule__EnemyType__Group_3_2__1 : rule__EnemyType__Group_3_2__1__Impl ;
    public final void rule__EnemyType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1967:1: ( rule__EnemyType__Group_3_2__1__Impl )
            // InternalRangoMode.g:1968:2: rule__EnemyType__Group_3_2__1__Impl
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
    // InternalRangoMode.g:1974:1: rule__EnemyType__Group_3_2__1__Impl : ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__EnemyType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1978:1: ( ( ( rule__EnemyType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:1979:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:1979:1: ( ( rule__EnemyType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:1980:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:1981:2: ( rule__EnemyType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:1981:3: rule__EnemyType__BounceAssignment_3_2_1
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
    // InternalRangoMode.g:1990:1: rule__EnemyType__Group_3_3__0 : rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 ;
    public final void rule__EnemyType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1994:1: ( rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1 )
            // InternalRangoMode.g:1995:2: rule__EnemyType__Group_3_3__0__Impl rule__EnemyType__Group_3_3__1
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
    // InternalRangoMode.g:2002:1: rule__EnemyType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__EnemyType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2006:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2007:1: ( 'speed' )
            {
            // InternalRangoMode.g:2007:1: ( 'speed' )
            // InternalRangoMode.g:2008:2: 'speed'
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
    // InternalRangoMode.g:2017:1: rule__EnemyType__Group_3_3__1 : rule__EnemyType__Group_3_3__1__Impl ;
    public final void rule__EnemyType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2021:1: ( rule__EnemyType__Group_3_3__1__Impl )
            // InternalRangoMode.g:2022:2: rule__EnemyType__Group_3_3__1__Impl
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
    // InternalRangoMode.g:2028:1: rule__EnemyType__Group_3_3__1__Impl : ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__EnemyType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2032:1: ( ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:2033:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:2033:1: ( ( rule__EnemyType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:2034:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:2035:2: ( rule__EnemyType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:2035:3: rule__EnemyType__SpeedAssignment_3_3_1
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
    // InternalRangoMode.g:2044:1: rule__EnemyType__Group_3_4__0 : rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 ;
    public final void rule__EnemyType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2048:1: ( rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1 )
            // InternalRangoMode.g:2049:2: rule__EnemyType__Group_3_4__0__Impl rule__EnemyType__Group_3_4__1
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
    // InternalRangoMode.g:2056:1: rule__EnemyType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__EnemyType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2060:1: ( ( 'points' ) )
            // InternalRangoMode.g:2061:1: ( 'points' )
            {
            // InternalRangoMode.g:2061:1: ( 'points' )
            // InternalRangoMode.g:2062:2: 'points'
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
    // InternalRangoMode.g:2071:1: rule__EnemyType__Group_3_4__1 : rule__EnemyType__Group_3_4__1__Impl ;
    public final void rule__EnemyType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2075:1: ( rule__EnemyType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2076:2: rule__EnemyType__Group_3_4__1__Impl
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
    // InternalRangoMode.g:2082:1: rule__EnemyType__Group_3_4__1__Impl : ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__EnemyType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2086:1: ( ( ( rule__EnemyType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2087:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2087:1: ( ( rule__EnemyType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2088:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2089:2: ( rule__EnemyType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2089:3: rule__EnemyType__PointsAssignment_3_4_1
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
    // InternalRangoMode.g:2098:1: rule__EnemyType__Group_12__0 : rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 ;
    public final void rule__EnemyType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2102:1: ( rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1 )
            // InternalRangoMode.g:2103:2: rule__EnemyType__Group_12__0__Impl rule__EnemyType__Group_12__1
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
    // InternalRangoMode.g:2110:1: rule__EnemyType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__EnemyType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2114:1: ( ( ',' ) )
            // InternalRangoMode.g:2115:1: ( ',' )
            {
            // InternalRangoMode.g:2115:1: ( ',' )
            // InternalRangoMode.g:2116:2: ','
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
    // InternalRangoMode.g:2125:1: rule__EnemyType__Group_12__1 : rule__EnemyType__Group_12__1__Impl ;
    public final void rule__EnemyType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2129:1: ( rule__EnemyType__Group_12__1__Impl )
            // InternalRangoMode.g:2130:2: rule__EnemyType__Group_12__1__Impl
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
    // InternalRangoMode.g:2136:1: rule__EnemyType__Group_12__1__Impl : ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__EnemyType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2140:1: ( ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2141:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2141:1: ( ( rule__EnemyType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2142:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getEnemyTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2143:2: ( rule__EnemyType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2143:3: rule__EnemyType__ContactEffectsAssignment_12_1
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
    // InternalRangoMode.g:2152:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2156:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2157:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
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
    // InternalRangoMode.g:2164:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2168:1: ( ( () ) )
            // InternalRangoMode.g:2169:1: ( () )
            {
            // InternalRangoMode.g:2169:1: ( () )
            // InternalRangoMode.g:2170:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2171:2: ()
            // InternalRangoMode.g:2171:3: 
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
    // InternalRangoMode.g:2179:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2183:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2184:2: rule__Vanish__Group__1__Impl
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
    // InternalRangoMode.g:2190:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2194:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2195:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2195:1: ( 'vanish' )
            // InternalRangoMode.g:2196:2: 'vanish'
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
    // InternalRangoMode.g:2206:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2210:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2211:2: rule__Split__Group__0__Impl rule__Split__Group__1
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
    // InternalRangoMode.g:2218:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2222:1: ( ( 'split' ) )
            // InternalRangoMode.g:2223:1: ( 'split' )
            {
            // InternalRangoMode.g:2223:1: ( 'split' )
            // InternalRangoMode.g:2224:2: 'split'
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
    // InternalRangoMode.g:2233:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2237:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2238:2: rule__Split__Group__1__Impl rule__Split__Group__2
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
    // InternalRangoMode.g:2245:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2249:1: ( ( 'into' ) )
            // InternalRangoMode.g:2250:1: ( 'into' )
            {
            // InternalRangoMode.g:2250:1: ( 'into' )
            // InternalRangoMode.g:2251:2: 'into'
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
    // InternalRangoMode.g:2260:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2264:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2265:2: rule__Split__Group__2__Impl rule__Split__Group__3
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
    // InternalRangoMode.g:2272:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2276:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2277:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2277:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2278:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2279:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2279:3: rule__Split__FragmentsAssignment_2
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
    // InternalRangoMode.g:2287:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2291:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2292:2: rule__Split__Group__3__Impl rule__Split__Group__4
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
    // InternalRangoMode.g:2299:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2303:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2304:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2304:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2305:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2306:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRangoMode.g:2306:3: rule__Split__FragmentTypeAssignment_3
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
    // InternalRangoMode.g:2314:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2318:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2319:2: rule__Split__Group__4__Impl
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
    // InternalRangoMode.g:2325:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2329:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2330:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2330:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2331:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2332:2: ( rule__Split__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:2332:3: rule__Split__Group_4__0
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
    // InternalRangoMode.g:2341:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2345:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2346:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
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
    // InternalRangoMode.g:2353:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2357:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2358:1: ( 'launched' )
            {
            // InternalRangoMode.g:2358:1: ( 'launched' )
            // InternalRangoMode.g:2359:2: 'launched'
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
    // InternalRangoMode.g:2368:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2372:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2373:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
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
    // InternalRangoMode.g:2380:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2384:1: ( ( 'at' ) )
            // InternalRangoMode.g:2385:1: ( 'at' )
            {
            // InternalRangoMode.g:2385:1: ( 'at' )
            // InternalRangoMode.g:2386:2: 'at'
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
    // InternalRangoMode.g:2395:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2399:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2400:2: rule__Split__Group_4__2__Impl
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
    // InternalRangoMode.g:2406:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2410:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2411:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2411:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2412:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2413:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2413:3: rule__Split__LaunchSpeedAssignment_4_2
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
    // InternalRangoMode.g:2422:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2426:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2427:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
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
    // InternalRangoMode.g:2434:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2438:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2439:1: ( 'damage' )
            {
            // InternalRangoMode.g:2439:1: ( 'damage' )
            // InternalRangoMode.g:2440:2: 'damage'
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
    // InternalRangoMode.g:2449:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2453:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2454:2: rule__Damage__Group__1__Impl
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
    // InternalRangoMode.g:2460:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2464:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2465:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2465:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2466:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2467:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2467:3: rule__Damage__AmountAssignment_1
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
    // InternalRangoMode.g:2476:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2480:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2481:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
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
    // InternalRangoMode.g:2488:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2492:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2493:1: ( 'heal' )
            {
            // InternalRangoMode.g:2493:1: ( 'heal' )
            // InternalRangoMode.g:2494:2: 'heal'
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
    // InternalRangoMode.g:2503:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2507:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2508:2: rule__Heal__Group__1__Impl
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
    // InternalRangoMode.g:2514:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2518:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2519:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2519:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2520:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2521:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2521:3: rule__Heal__AmountAssignment_1
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
    // InternalRangoMode.g:2530:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2534:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2535:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
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
    // InternalRangoMode.g:2542:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2546:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2547:1: ( 'shield' )
            {
            // InternalRangoMode.g:2547:1: ( 'shield' )
            // InternalRangoMode.g:2548:2: 'shield'
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
    // InternalRangoMode.g:2557:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2561:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2562:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
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
    // InternalRangoMode.g:2569:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2573:1: ( ( 'for' ) )
            // InternalRangoMode.g:2574:1: ( 'for' )
            {
            // InternalRangoMode.g:2574:1: ( 'for' )
            // InternalRangoMode.g:2575:2: 'for'
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
    // InternalRangoMode.g:2584:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2588:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2589:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
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
    // InternalRangoMode.g:2596:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2600:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2601:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2601:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2602:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2603:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2603:3: rule__Shield__DurationAssignment_2
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
    // InternalRangoMode.g:2611:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2615:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2616:2: rule__Shield__Group__3__Impl
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
    // InternalRangoMode.g:2622:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2626:1: ( ( 's' ) )
            // InternalRangoMode.g:2627:1: ( 's' )
            {
            // InternalRangoMode.g:2627:1: ( 's' )
            // InternalRangoMode.g:2628:2: 's'
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
    // InternalRangoMode.g:2638:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2642:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:2643:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
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
    // InternalRangoMode.g:2650:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2654:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2655:1: ( 'speed' )
            {
            // InternalRangoMode.g:2655:1: ( 'speed' )
            // InternalRangoMode.g:2656:2: 'speed'
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
    // InternalRangoMode.g:2665:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2669:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:2670:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
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
    // InternalRangoMode.g:2677:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2681:1: ( ( '*' ) )
            // InternalRangoMode.g:2682:1: ( '*' )
            {
            // InternalRangoMode.g:2682:1: ( '*' )
            // InternalRangoMode.g:2683:2: '*'
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
    // InternalRangoMode.g:2692:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2696:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:2697:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
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
    // InternalRangoMode.g:2704:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2708:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:2709:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:2709:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:2710:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:2711:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:2711:3: rule__SpeedChange__FactorAssignment_2
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
    // InternalRangoMode.g:2719:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2723:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:2724:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
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
    // InternalRangoMode.g:2731:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2735:1: ( ( 'for' ) )
            // InternalRangoMode.g:2736:1: ( 'for' )
            {
            // InternalRangoMode.g:2736:1: ( 'for' )
            // InternalRangoMode.g:2737:2: 'for'
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
    // InternalRangoMode.g:2746:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2750:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:2751:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
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
    // InternalRangoMode.g:2758:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2762:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:2763:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:2763:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:2764:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:2765:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:2765:3: rule__SpeedChange__DurationAssignment_4
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
    // InternalRangoMode.g:2773:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2777:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:2778:2: rule__SpeedChange__Group__5__Impl
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
    // InternalRangoMode.g:2784:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2788:1: ( ( 's' ) )
            // InternalRangoMode.g:2789:1: ( 's' )
            {
            // InternalRangoMode.g:2789:1: ( 's' )
            // InternalRangoMode.g:2790:2: 's'
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
    // InternalRangoMode.g:2800:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2804:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:2805:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
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
    // InternalRangoMode.g:2812:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2816:1: ( ( 'poison' ) )
            // InternalRangoMode.g:2817:1: ( 'poison' )
            {
            // InternalRangoMode.g:2817:1: ( 'poison' )
            // InternalRangoMode.g:2818:2: 'poison'
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
    // InternalRangoMode.g:2827:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2831:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:2832:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
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
    // InternalRangoMode.g:2839:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2843:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2844:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2844:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:2845:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2846:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:2846:3: rule__Poison__AmountAssignment_1
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
    // InternalRangoMode.g:2854:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2858:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:2859:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
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
    // InternalRangoMode.g:2866:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2870:1: ( ( 'every' ) )
            // InternalRangoMode.g:2871:1: ( 'every' )
            {
            // InternalRangoMode.g:2871:1: ( 'every' )
            // InternalRangoMode.g:2872:2: 'every'
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
    // InternalRangoMode.g:2881:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2885:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:2886:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
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
    // InternalRangoMode.g:2893:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2897:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:2898:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:2898:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:2899:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:2900:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:2900:3: rule__Poison__IntervalAssignment_3
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
    // InternalRangoMode.g:2908:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2912:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:2913:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
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
    // InternalRangoMode.g:2920:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2924:1: ( ( 's' ) )
            // InternalRangoMode.g:2925:1: ( 's' )
            {
            // InternalRangoMode.g:2925:1: ( 's' )
            // InternalRangoMode.g:2926:2: 's'
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
    // InternalRangoMode.g:2935:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2939:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:2940:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
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
    // InternalRangoMode.g:2947:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2951:1: ( ( 'for' ) )
            // InternalRangoMode.g:2952:1: ( 'for' )
            {
            // InternalRangoMode.g:2952:1: ( 'for' )
            // InternalRangoMode.g:2953:2: 'for'
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
    // InternalRangoMode.g:2962:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2966:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:2967:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
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
    // InternalRangoMode.g:2974:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2978:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:2979:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:2979:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:2980:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:2981:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:2981:3: rule__Poison__DurationAssignment_6
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
    // InternalRangoMode.g:2989:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2993:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:2994:2: rule__Poison__Group__7__Impl
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
    // InternalRangoMode.g:3000:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3004:1: ( ( 's' ) )
            // InternalRangoMode.g:3005:1: ( 's' )
            {
            // InternalRangoMode.g:3005:1: ( 's' )
            // InternalRangoMode.g:3006:2: 's'
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
    // InternalRangoMode.g:3016:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3020:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:3021:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
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
    // InternalRangoMode.g:3028:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3032:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:3033:1: ( 'powerup' )
            {
            // InternalRangoMode.g:3033:1: ( 'powerup' )
            // InternalRangoMode.g:3034:2: 'powerup'
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
    // InternalRangoMode.g:3043:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3047:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3048:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
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
    // InternalRangoMode.g:3055:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3059:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3060:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3060:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3061:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3062:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3062:3: rule__PowerUp__NameAssignment_1
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
    // InternalRangoMode.g:3070:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3074:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3075:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
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
    // InternalRangoMode.g:3082:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3086:1: ( ( '{' ) )
            // InternalRangoMode.g:3087:1: ( '{' )
            {
            // InternalRangoMode.g:3087:1: ( '{' )
            // InternalRangoMode.g:3088:2: '{'
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
    // InternalRangoMode.g:3097:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3101:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3102:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
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
    // InternalRangoMode.g:3109:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3113:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3114:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3114:1: ( 'sprite' )
            // InternalRangoMode.g:3115:2: 'sprite'
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
    // InternalRangoMode.g:3124:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3128:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3129:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
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
    // InternalRangoMode.g:3136:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3140:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3141:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3141:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3142:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3143:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3143:3: rule__PowerUp__SpriteAssignment_4
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
    // InternalRangoMode.g:3151:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3155:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3156:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
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
    // InternalRangoMode.g:3163:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3167:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3168:1: ( 'gives' )
            {
            // InternalRangoMode.g:3168:1: ( 'gives' )
            // InternalRangoMode.g:3169:2: 'gives'
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
    // InternalRangoMode.g:3178:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3182:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3183:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
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
    // InternalRangoMode.g:3190:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3194:1: ( ( ':' ) )
            // InternalRangoMode.g:3195:1: ( ':' )
            {
            // InternalRangoMode.g:3195:1: ( ':' )
            // InternalRangoMode.g:3196:2: ':'
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
    // InternalRangoMode.g:3205:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3209:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3210:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
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
    // InternalRangoMode.g:3217:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3221:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3222:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3222:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3223:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3224:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3224:3: rule__PowerUp__EffectsAssignment_7
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
    // InternalRangoMode.g:3232:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3236:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3237:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
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
    // InternalRangoMode.g:3244:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3248:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3249:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3249:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3250:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3251:2: ( rule__PowerUp__Group_8__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRangoMode.g:3251:3: rule__PowerUp__Group_8__0
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
    // InternalRangoMode.g:3259:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3263:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3264:2: rule__PowerUp__Group__9__Impl
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
    // InternalRangoMode.g:3270:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3274:1: ( ( '}' ) )
            // InternalRangoMode.g:3275:1: ( '}' )
            {
            // InternalRangoMode.g:3275:1: ( '}' )
            // InternalRangoMode.g:3276:2: '}'
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
    // InternalRangoMode.g:3286:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3290:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3291:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
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
    // InternalRangoMode.g:3298:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3302:1: ( ( ',' ) )
            // InternalRangoMode.g:3303:1: ( ',' )
            {
            // InternalRangoMode.g:3303:1: ( ',' )
            // InternalRangoMode.g:3304:2: ','
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
    // InternalRangoMode.g:3313:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3317:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3318:2: rule__PowerUp__Group_8__1__Impl
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
    // InternalRangoMode.g:3324:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3328:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3329:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3329:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3330:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3331:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3331:3: rule__PowerUp__EffectsAssignment_8_1
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
    // InternalRangoMode.g:3340:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3344:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3345:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
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
    // InternalRangoMode.g:3352:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3356:1: ( ( 'player' ) )
            // InternalRangoMode.g:3357:1: ( 'player' )
            {
            // InternalRangoMode.g:3357:1: ( 'player' )
            // InternalRangoMode.g:3358:2: 'player'
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
    // InternalRangoMode.g:3367:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3371:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3372:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
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
    // InternalRangoMode.g:3379:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3383:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3384:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3384:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3385:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3386:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3386:3: rule__PlayerProfile__NameAssignment_1
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
    // InternalRangoMode.g:3394:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3398:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3399:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRangoMode.g:3406:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3410:1: ( ( '{' ) )
            // InternalRangoMode.g:3411:1: ( '{' )
            {
            // InternalRangoMode.g:3411:1: ( '{' )
            // InternalRangoMode.g:3412:2: '{'
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
    // InternalRangoMode.g:3421:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3425:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3426:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
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
    // InternalRangoMode.g:3433:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3437:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3438:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3438:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3439:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3440:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3440:3: rule__PlayerProfile__UnorderedGroup_3
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
    // InternalRangoMode.g:3448:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3452:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3453:2: rule__PlayerProfile__Group__4__Impl
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
    // InternalRangoMode.g:3459:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3463:1: ( ( '}' ) )
            // InternalRangoMode.g:3464:1: ( '}' )
            {
            // InternalRangoMode.g:3464:1: ( '}' )
            // InternalRangoMode.g:3465:2: '}'
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
    // InternalRangoMode.g:3475:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3479:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3480:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
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
    // InternalRangoMode.g:3487:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3491:1: ( ( 'character' ) )
            // InternalRangoMode.g:3492:1: ( 'character' )
            {
            // InternalRangoMode.g:3492:1: ( 'character' )
            // InternalRangoMode.g:3493:2: 'character'
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRangoMode.g:3502:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3506:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3507:2: rule__PlayerProfile__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3513:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3517:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3518:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3518:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3519:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3520:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3520:3: rule__PlayerProfile__CharacterAssignment_3_0_1
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
    // InternalRangoMode.g:3529:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3533:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3534:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
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
    // InternalRangoMode.g:3541:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3545:1: ( ( 'health' ) )
            // InternalRangoMode.g:3546:1: ( 'health' )
            {
            // InternalRangoMode.g:3546:1: ( 'health' )
            // InternalRangoMode.g:3547:2: 'health'
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRangoMode.g:3556:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3560:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3561:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
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
    // InternalRangoMode.g:3568:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3572:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3573:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3573:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:3574:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:3575:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:3575:3: rule__PlayerProfile__HealthAssignment_3_1_1
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
    // InternalRangoMode.g:3583:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3587:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:3588:2: rule__PlayerProfile__Group_3_1__2__Impl
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
    // InternalRangoMode.g:3594:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3598:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:3599:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:3599:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:3600:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:3601:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:3601:3: rule__PlayerProfile__Group_3_1_2__0
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
    // InternalRangoMode.g:3610:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3614:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:3615:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
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
    // InternalRangoMode.g:3622:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3626:1: ( ( 'max' ) )
            // InternalRangoMode.g:3627:1: ( 'max' )
            {
            // InternalRangoMode.g:3627:1: ( 'max' )
            // InternalRangoMode.g:3628:2: 'max'
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRangoMode.g:3637:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3641:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:3642:2: rule__PlayerProfile__Group_3_1_2__1__Impl
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
    // InternalRangoMode.g:3648:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3652:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:3653:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:3653:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:3654:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:3655:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:3655:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
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
    // InternalRangoMode.g:3664:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3668:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:3669:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
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
    // InternalRangoMode.g:3676:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3680:1: ( ( 'speed' ) )
            // InternalRangoMode.g:3681:1: ( 'speed' )
            {
            // InternalRangoMode.g:3681:1: ( 'speed' )
            // InternalRangoMode.g:3682:2: 'speed'
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
    // InternalRangoMode.g:3691:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3695:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:3696:2: rule__PlayerProfile__Group_3_2__1__Impl
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
    // InternalRangoMode.g:3702:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3706:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:3707:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:3707:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:3708:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:3709:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:3709:3: rule__PlayerProfile__SpeedAssignment_3_2_1
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
    // InternalRangoMode.g:3718:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3722:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:3723:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
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
    // InternalRangoMode.g:3730:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3734:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:3735:1: ( 'tongue' )
            {
            // InternalRangoMode.g:3735:1: ( 'tongue' )
            // InternalRangoMode.g:3736:2: 'tongue'
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRangoMode.g:3745:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3749:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:3750:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
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
    // InternalRangoMode.g:3757:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3761:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:3762:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:3762:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:3763:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:3764:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:3764:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
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
    // InternalRangoMode.g:3772:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3776:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:3777:2: rule__PlayerProfile__Group_3_3__2__Impl
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
    // InternalRangoMode.g:3783:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3787:1: ( ( 's' ) )
            // InternalRangoMode.g:3788:1: ( 's' )
            {
            // InternalRangoMode.g:3788:1: ( 's' )
            // InternalRangoMode.g:3789:2: 's'
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
    // InternalRangoMode.g:3799:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3803:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:3804:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
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
    // InternalRangoMode.g:3811:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3815:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:3816:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:3816:1: ( 'cooldown' )
            // InternalRangoMode.g:3817:2: 'cooldown'
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRangoMode.g:3826:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3830:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:3831:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
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
    // InternalRangoMode.g:3838:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3842:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:3843:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:3843:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:3844:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:3845:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:3845:3: rule__PlayerProfile__CooldownAssignment_3_4_1
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
    // InternalRangoMode.g:3853:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3857:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:3858:2: rule__PlayerProfile__Group_3_4__2__Impl
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
    // InternalRangoMode.g:3864:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3868:1: ( ( 's' ) )
            // InternalRangoMode.g:3869:1: ( 's' )
            {
            // InternalRangoMode.g:3869:1: ( 's' )
            // InternalRangoMode.g:3870:2: 's'
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
    // InternalRangoMode.g:3880:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3884:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:3885:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
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
    // InternalRangoMode.g:3892:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3896:1: ( ( 'grace' ) )
            // InternalRangoMode.g:3897:1: ( 'grace' )
            {
            // InternalRangoMode.g:3897:1: ( 'grace' )
            // InternalRangoMode.g:3898:2: 'grace'
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalRangoMode.g:3907:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3911:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:3912:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
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
    // InternalRangoMode.g:3919:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3923:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:3924:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:3924:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:3925:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:3926:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:3926:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
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
    // InternalRangoMode.g:3934:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3938:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:3939:2: rule__PlayerProfile__Group_3_5__2__Impl
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
    // InternalRangoMode.g:3945:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3949:1: ( ( 's' ) )
            // InternalRangoMode.g:3950:1: ( 's' )
            {
            // InternalRangoMode.g:3950:1: ( 's' )
            // InternalRangoMode.g:3951:2: 's'
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
    // InternalRangoMode.g:3961:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3965:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:3966:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
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
    // InternalRangoMode.g:3973:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3977:1: ( ( 'mode' ) )
            // InternalRangoMode.g:3978:1: ( 'mode' )
            {
            // InternalRangoMode.g:3978:1: ( 'mode' )
            // InternalRangoMode.g:3979:2: 'mode'
            {
             before(grammarAccess.getGameModeAccess().getModeKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalRangoMode.g:3988:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3992:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:3993:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
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
    // InternalRangoMode.g:4000:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4004:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4005:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4005:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4006:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4007:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4007:3: rule__GameMode__NameAssignment_1
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
    // InternalRangoMode.g:4015:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4019:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4020:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
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
    // InternalRangoMode.g:4027:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4031:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4032:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4032:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4033:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4034:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4034:3: rule__GameMode__TitleAssignment_2
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
    // InternalRangoMode.g:4042:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4046:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4047:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
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
    // InternalRangoMode.g:4054:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4058:1: ( ( '{' ) )
            // InternalRangoMode.g:4059:1: ( '{' )
            {
            // InternalRangoMode.g:4059:1: ( '{' )
            // InternalRangoMode.g:4060:2: '{'
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
    // InternalRangoMode.g:4069:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4073:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4074:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
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
    // InternalRangoMode.g:4081:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4085:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4086:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4086:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4087:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4088:2: ( rule__GameMode__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:4088:3: rule__GameMode__Group_4__0
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
    // InternalRangoMode.g:4096:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4100:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4101:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
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
    // InternalRangoMode.g:4108:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4112:1: ( ( 'player' ) )
            // InternalRangoMode.g:4113:1: ( 'player' )
            {
            // InternalRangoMode.g:4113:1: ( 'player' )
            // InternalRangoMode.g:4114:2: 'player'
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
    // InternalRangoMode.g:4123:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4127:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4128:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
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
    // InternalRangoMode.g:4135:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4139:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4140:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4140:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4141:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4142:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4142:3: rule__GameMode__PlayerAssignment_6
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
    // InternalRangoMode.g:4150:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4154:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4155:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
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
    // InternalRangoMode.g:4162:1: rule__GameMode__Group__7__Impl : ( ( rule__GameMode__UnorderedGroup_7 ) ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4166:1: ( ( ( rule__GameMode__UnorderedGroup_7 ) ) )
            // InternalRangoMode.g:4167:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            {
            // InternalRangoMode.g:4167:1: ( ( rule__GameMode__UnorderedGroup_7 ) )
            // InternalRangoMode.g:4168:2: ( rule__GameMode__UnorderedGroup_7 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_7()); 
            // InternalRangoMode.g:4169:2: ( rule__GameMode__UnorderedGroup_7 )
            // InternalRangoMode.g:4169:3: rule__GameMode__UnorderedGroup_7
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
    // InternalRangoMode.g:4177:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4181:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4182:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
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
    // InternalRangoMode.g:4189:1: rule__GameMode__Group__8__Impl : ( ( rule__GameMode__Alternatives_8 ) ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4193:1: ( ( ( rule__GameMode__Alternatives_8 ) ) )
            // InternalRangoMode.g:4194:1: ( ( rule__GameMode__Alternatives_8 ) )
            {
            // InternalRangoMode.g:4194:1: ( ( rule__GameMode__Alternatives_8 ) )
            // InternalRangoMode.g:4195:2: ( rule__GameMode__Alternatives_8 )
            {
             before(grammarAccess.getGameModeAccess().getAlternatives_8()); 
            // InternalRangoMode.g:4196:2: ( rule__GameMode__Alternatives_8 )
            // InternalRangoMode.g:4196:3: rule__GameMode__Alternatives_8
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
    // InternalRangoMode.g:4204:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4208:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4209:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
            {
            pushFollow(FOLLOW_35);
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
    // InternalRangoMode.g:4216:1: rule__GameMode__Group__9__Impl : ( ( ruleDrops )? ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4220:1: ( ( ( ruleDrops )? ) )
            // InternalRangoMode.g:4221:1: ( ( ruleDrops )? )
            {
            // InternalRangoMode.g:4221:1: ( ( ruleDrops )? )
            // InternalRangoMode.g:4222:2: ( ruleDrops )?
            {
             before(grammarAccess.getGameModeAccess().getDropsParserRuleCall_9()); 
            // InternalRangoMode.g:4223:2: ( ruleDrops )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==83) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:4223:3: ruleDrops
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
    // InternalRangoMode.g:4231:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl rule__GameMode__Group__11 ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4235:1: ( rule__GameMode__Group__10__Impl rule__GameMode__Group__11 )
            // InternalRangoMode.g:4236:2: rule__GameMode__Group__10__Impl rule__GameMode__Group__11
            {
            pushFollow(FOLLOW_35);
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
    // InternalRangoMode.g:4243:1: rule__GameMode__Group__10__Impl : ( ( rule__GameMode__Group_10__0 )? ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4247:1: ( ( ( rule__GameMode__Group_10__0 )? ) )
            // InternalRangoMode.g:4248:1: ( ( rule__GameMode__Group_10__0 )? )
            {
            // InternalRangoMode.g:4248:1: ( ( rule__GameMode__Group_10__0 )? )
            // InternalRangoMode.g:4249:2: ( rule__GameMode__Group_10__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_10()); 
            // InternalRangoMode.g:4250:2: ( rule__GameMode__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRangoMode.g:4250:3: rule__GameMode__Group_10__0
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
    // InternalRangoMode.g:4258:1: rule__GameMode__Group__11 : rule__GameMode__Group__11__Impl rule__GameMode__Group__12 ;
    public final void rule__GameMode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4262:1: ( rule__GameMode__Group__11__Impl rule__GameMode__Group__12 )
            // InternalRangoMode.g:4263:2: rule__GameMode__Group__11__Impl rule__GameMode__Group__12
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
    // InternalRangoMode.g:4270:1: rule__GameMode__Group__11__Impl : ( 'lose' ) ;
    public final void rule__GameMode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4274:1: ( ( 'lose' ) )
            // InternalRangoMode.g:4275:1: ( 'lose' )
            {
            // InternalRangoMode.g:4275:1: ( 'lose' )
            // InternalRangoMode.g:4276:2: 'lose'
            {
             before(grammarAccess.getGameModeAccess().getLoseKeyword_11()); 
            match(input,52,FOLLOW_2); 
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
    // InternalRangoMode.g:4285:1: rule__GameMode__Group__12 : rule__GameMode__Group__12__Impl rule__GameMode__Group__13 ;
    public final void rule__GameMode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4289:1: ( rule__GameMode__Group__12__Impl rule__GameMode__Group__13 )
            // InternalRangoMode.g:4290:2: rule__GameMode__Group__12__Impl rule__GameMode__Group__13
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
    // InternalRangoMode.g:4297:1: rule__GameMode__Group__12__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4301:1: ( ( 'when' ) )
            // InternalRangoMode.g:4302:1: ( 'when' )
            {
            // InternalRangoMode.g:4302:1: ( 'when' )
            // InternalRangoMode.g:4303:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_12()); 
            match(input,53,FOLLOW_2); 
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
    // InternalRangoMode.g:4312:1: rule__GameMode__Group__13 : rule__GameMode__Group__13__Impl rule__GameMode__Group__14 ;
    public final void rule__GameMode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4316:1: ( rule__GameMode__Group__13__Impl rule__GameMode__Group__14 )
            // InternalRangoMode.g:4317:2: rule__GameMode__Group__13__Impl rule__GameMode__Group__14
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
    // InternalRangoMode.g:4324:1: rule__GameMode__Group__13__Impl : ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) ;
    public final void rule__GameMode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4328:1: ( ( ( rule__GameMode__LoseConditionsAssignment_13 ) ) )
            // InternalRangoMode.g:4329:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            {
            // InternalRangoMode.g:4329:1: ( ( rule__GameMode__LoseConditionsAssignment_13 ) )
            // InternalRangoMode.g:4330:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_13()); 
            // InternalRangoMode.g:4331:2: ( rule__GameMode__LoseConditionsAssignment_13 )
            // InternalRangoMode.g:4331:3: rule__GameMode__LoseConditionsAssignment_13
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
    // InternalRangoMode.g:4339:1: rule__GameMode__Group__14 : rule__GameMode__Group__14__Impl rule__GameMode__Group__15 ;
    public final void rule__GameMode__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4343:1: ( rule__GameMode__Group__14__Impl rule__GameMode__Group__15 )
            // InternalRangoMode.g:4344:2: rule__GameMode__Group__14__Impl rule__GameMode__Group__15
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4351:1: rule__GameMode__Group__14__Impl : ( ( rule__GameMode__Group_14__0 )* ) ;
    public final void rule__GameMode__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4355:1: ( ( ( rule__GameMode__Group_14__0 )* ) )
            // InternalRangoMode.g:4356:1: ( ( rule__GameMode__Group_14__0 )* )
            {
            // InternalRangoMode.g:4356:1: ( ( rule__GameMode__Group_14__0 )* )
            // InternalRangoMode.g:4357:2: ( rule__GameMode__Group_14__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_14()); 
            // InternalRangoMode.g:4358:2: ( rule__GameMode__Group_14__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==57) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRangoMode.g:4358:3: rule__GameMode__Group_14__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalRangoMode.g:4366:1: rule__GameMode__Group__15 : rule__GameMode__Group__15__Impl ;
    public final void rule__GameMode__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4370:1: ( rule__GameMode__Group__15__Impl )
            // InternalRangoMode.g:4371:2: rule__GameMode__Group__15__Impl
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
    // InternalRangoMode.g:4377:1: rule__GameMode__Group__15__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4381:1: ( ( '}' ) )
            // InternalRangoMode.g:4382:1: ( '}' )
            {
            // InternalRangoMode.g:4382:1: ( '}' )
            // InternalRangoMode.g:4383:2: '}'
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
    // InternalRangoMode.g:4393:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4397:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4398:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
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
    // InternalRangoMode.g:4405:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4409:1: ( ( 'description' ) )
            // InternalRangoMode.g:4410:1: ( 'description' )
            {
            // InternalRangoMode.g:4410:1: ( 'description' )
            // InternalRangoMode.g:4411:2: 'description'
            {
             before(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalRangoMode.g:4420:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4424:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4425:2: rule__GameMode__Group_4__1__Impl
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
    // InternalRangoMode.g:4431:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4435:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4436:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4436:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4437:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4438:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4438:3: rule__GameMode__DescriptionAssignment_4_1
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
    // InternalRangoMode.g:4447:1: rule__GameMode__Group_7_0__0 : rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 ;
    public final void rule__GameMode__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4451:1: ( rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1 )
            // InternalRangoMode.g:4452:2: rule__GameMode__Group_7_0__0__Impl rule__GameMode__Group_7_0__1
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
    // InternalRangoMode.g:4459:1: rule__GameMode__Group_7_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4463:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:4464:1: ( 'gravity' )
            {
            // InternalRangoMode.g:4464:1: ( 'gravity' )
            // InternalRangoMode.g:4465:2: 'gravity'
            {
             before(grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalRangoMode.g:4474:1: rule__GameMode__Group_7_0__1 : rule__GameMode__Group_7_0__1__Impl ;
    public final void rule__GameMode__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4478:1: ( rule__GameMode__Group_7_0__1__Impl )
            // InternalRangoMode.g:4479:2: rule__GameMode__Group_7_0__1__Impl
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
    // InternalRangoMode.g:4485:1: rule__GameMode__Group_7_0__1__Impl : ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) ;
    public final void rule__GameMode__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4489:1: ( ( ( rule__GameMode__GravityAssignment_7_0_1 ) ) )
            // InternalRangoMode.g:4490:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            {
            // InternalRangoMode.g:4490:1: ( ( rule__GameMode__GravityAssignment_7_0_1 ) )
            // InternalRangoMode.g:4491:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_7_0_1()); 
            // InternalRangoMode.g:4492:2: ( rule__GameMode__GravityAssignment_7_0_1 )
            // InternalRangoMode.g:4492:3: rule__GameMode__GravityAssignment_7_0_1
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
    // InternalRangoMode.g:4501:1: rule__GameMode__Group_10__0 : rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 ;
    public final void rule__GameMode__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4505:1: ( rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1 )
            // InternalRangoMode.g:4506:2: rule__GameMode__Group_10__0__Impl rule__GameMode__Group_10__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalRangoMode.g:4513:1: rule__GameMode__Group_10__0__Impl : ( 'win' ) ;
    public final void rule__GameMode__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4517:1: ( ( 'win' ) )
            // InternalRangoMode.g:4518:1: ( 'win' )
            {
            // InternalRangoMode.g:4518:1: ( 'win' )
            // InternalRangoMode.g:4519:2: 'win'
            {
             before(grammarAccess.getGameModeAccess().getWinKeyword_10_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalRangoMode.g:4528:1: rule__GameMode__Group_10__1 : rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 ;
    public final void rule__GameMode__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4532:1: ( rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2 )
            // InternalRangoMode.g:4533:2: rule__GameMode__Group_10__1__Impl rule__GameMode__Group_10__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4540:1: rule__GameMode__Group_10__1__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4544:1: ( ( 'when' ) )
            // InternalRangoMode.g:4545:1: ( 'when' )
            {
            // InternalRangoMode.g:4545:1: ( 'when' )
            // InternalRangoMode.g:4546:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_10_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalRangoMode.g:4555:1: rule__GameMode__Group_10__2 : rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 ;
    public final void rule__GameMode__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4559:1: ( rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3 )
            // InternalRangoMode.g:4560:2: rule__GameMode__Group_10__2__Impl rule__GameMode__Group_10__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalRangoMode.g:4567:1: rule__GameMode__Group_10__2__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) ;
    public final void rule__GameMode__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4571:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_2 ) ) )
            // InternalRangoMode.g:4572:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            {
            // InternalRangoMode.g:4572:1: ( ( rule__GameMode__WinConditionsAssignment_10_2 ) )
            // InternalRangoMode.g:4573:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_2()); 
            // InternalRangoMode.g:4574:2: ( rule__GameMode__WinConditionsAssignment_10_2 )
            // InternalRangoMode.g:4574:3: rule__GameMode__WinConditionsAssignment_10_2
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
    // InternalRangoMode.g:4582:1: rule__GameMode__Group_10__3 : rule__GameMode__Group_10__3__Impl ;
    public final void rule__GameMode__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4586:1: ( rule__GameMode__Group_10__3__Impl )
            // InternalRangoMode.g:4587:2: rule__GameMode__Group_10__3__Impl
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
    // InternalRangoMode.g:4593:1: rule__GameMode__Group_10__3__Impl : ( ( rule__GameMode__Group_10_3__0 )* ) ;
    public final void rule__GameMode__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4597:1: ( ( ( rule__GameMode__Group_10_3__0 )* ) )
            // InternalRangoMode.g:4598:1: ( ( rule__GameMode__Group_10_3__0 )* )
            {
            // InternalRangoMode.g:4598:1: ( ( rule__GameMode__Group_10_3__0 )* )
            // InternalRangoMode.g:4599:2: ( rule__GameMode__Group_10_3__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_10_3()); 
            // InternalRangoMode.g:4600:2: ( rule__GameMode__Group_10_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==57) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRangoMode.g:4600:3: rule__GameMode__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalRangoMode.g:4609:1: rule__GameMode__Group_10_3__0 : rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 ;
    public final void rule__GameMode__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4613:1: ( rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1 )
            // InternalRangoMode.g:4614:2: rule__GameMode__Group_10_3__0__Impl rule__GameMode__Group_10_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4621:1: rule__GameMode__Group_10_3__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4625:1: ( ( 'or' ) )
            // InternalRangoMode.g:4626:1: ( 'or' )
            {
            // InternalRangoMode.g:4626:1: ( 'or' )
            // InternalRangoMode.g:4627:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_10_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalRangoMode.g:4636:1: rule__GameMode__Group_10_3__1 : rule__GameMode__Group_10_3__1__Impl ;
    public final void rule__GameMode__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4640:1: ( rule__GameMode__Group_10_3__1__Impl )
            // InternalRangoMode.g:4641:2: rule__GameMode__Group_10_3__1__Impl
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
    // InternalRangoMode.g:4647:1: rule__GameMode__Group_10_3__1__Impl : ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) ;
    public final void rule__GameMode__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4651:1: ( ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) ) )
            // InternalRangoMode.g:4652:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            {
            // InternalRangoMode.g:4652:1: ( ( rule__GameMode__WinConditionsAssignment_10_3_1 ) )
            // InternalRangoMode.g:4653:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_10_3_1()); 
            // InternalRangoMode.g:4654:2: ( rule__GameMode__WinConditionsAssignment_10_3_1 )
            // InternalRangoMode.g:4654:3: rule__GameMode__WinConditionsAssignment_10_3_1
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
    // InternalRangoMode.g:4663:1: rule__GameMode__Group_14__0 : rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 ;
    public final void rule__GameMode__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4667:1: ( rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 )
            // InternalRangoMode.g:4668:2: rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4675:1: rule__GameMode__Group_14__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4679:1: ( ( 'or' ) )
            // InternalRangoMode.g:4680:1: ( 'or' )
            {
            // InternalRangoMode.g:4680:1: ( 'or' )
            // InternalRangoMode.g:4681:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_14_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalRangoMode.g:4690:1: rule__GameMode__Group_14__1 : rule__GameMode__Group_14__1__Impl ;
    public final void rule__GameMode__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4694:1: ( rule__GameMode__Group_14__1__Impl )
            // InternalRangoMode.g:4695:2: rule__GameMode__Group_14__1__Impl
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
    // InternalRangoMode.g:4701:1: rule__GameMode__Group_14__1__Impl : ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) ;
    public final void rule__GameMode__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4705:1: ( ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) ) )
            // InternalRangoMode.g:4706:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            {
            // InternalRangoMode.g:4706:1: ( ( rule__GameMode__LoseConditionsAssignment_14_1 ) )
            // InternalRangoMode.g:4707:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_14_1()); 
            // InternalRangoMode.g:4708:2: ( rule__GameMode__LoseConditionsAssignment_14_1 )
            // InternalRangoMode.g:4708:3: rule__GameMode__LoseConditionsAssignment_14_1
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
    // InternalRangoMode.g:4717:1: rule__SingleLevel__Group__0 : rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 ;
    public final void rule__SingleLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4721:1: ( rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1 )
            // InternalRangoMode.g:4722:2: rule__SingleLevel__Group__0__Impl rule__SingleLevel__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalRangoMode.g:4729:1: rule__SingleLevel__Group__0__Impl : ( ( rule__SingleLevel__ArenaAssignment_0 ) ) ;
    public final void rule__SingleLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4733:1: ( ( ( rule__SingleLevel__ArenaAssignment_0 ) ) )
            // InternalRangoMode.g:4734:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            {
            // InternalRangoMode.g:4734:1: ( ( rule__SingleLevel__ArenaAssignment_0 ) )
            // InternalRangoMode.g:4735:2: ( rule__SingleLevel__ArenaAssignment_0 )
            {
             before(grammarAccess.getSingleLevelAccess().getArenaAssignment_0()); 
            // InternalRangoMode.g:4736:2: ( rule__SingleLevel__ArenaAssignment_0 )
            // InternalRangoMode.g:4736:3: rule__SingleLevel__ArenaAssignment_0
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
    // InternalRangoMode.g:4744:1: rule__SingleLevel__Group__1 : rule__SingleLevel__Group__1__Impl ;
    public final void rule__SingleLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4748:1: ( rule__SingleLevel__Group__1__Impl )
            // InternalRangoMode.g:4749:2: rule__SingleLevel__Group__1__Impl
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
    // InternalRangoMode.g:4755:1: rule__SingleLevel__Group__1__Impl : ( ( rule__SingleLevel__SpawningAssignment_1 ) ) ;
    public final void rule__SingleLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4759:1: ( ( ( rule__SingleLevel__SpawningAssignment_1 ) ) )
            // InternalRangoMode.g:4760:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            {
            // InternalRangoMode.g:4760:1: ( ( rule__SingleLevel__SpawningAssignment_1 ) )
            // InternalRangoMode.g:4761:2: ( rule__SingleLevel__SpawningAssignment_1 )
            {
             before(grammarAccess.getSingleLevelAccess().getSpawningAssignment_1()); 
            // InternalRangoMode.g:4762:2: ( rule__SingleLevel__SpawningAssignment_1 )
            // InternalRangoMode.g:4762:3: rule__SingleLevel__SpawningAssignment_1
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
    // InternalRangoMode.g:4771:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4775:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRangoMode.g:4776:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalRangoMode.g:4783:1: rule__Level__Group__0__Impl : ( 'level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4787:1: ( ( 'level' ) )
            // InternalRangoMode.g:4788:1: ( 'level' )
            {
            // InternalRangoMode.g:4788:1: ( 'level' )
            // InternalRangoMode.g:4789:2: 'level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalRangoMode.g:4798:1: rule__Level__Group__1 : rule__Level__Group__1__Impl rule__Level__Group__2 ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4802:1: ( rule__Level__Group__1__Impl rule__Level__Group__2 )
            // InternalRangoMode.g:4803:2: rule__Level__Group__1__Impl rule__Level__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalRangoMode.g:4810:1: rule__Level__Group__1__Impl : ( ( rule__Level__TitleAssignment_1 )? ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4814:1: ( ( ( rule__Level__TitleAssignment_1 )? ) )
            // InternalRangoMode.g:4815:1: ( ( rule__Level__TitleAssignment_1 )? )
            {
            // InternalRangoMode.g:4815:1: ( ( rule__Level__TitleAssignment_1 )? )
            // InternalRangoMode.g:4816:2: ( rule__Level__TitleAssignment_1 )?
            {
             before(grammarAccess.getLevelAccess().getTitleAssignment_1()); 
            // InternalRangoMode.g:4817:2: ( rule__Level__TitleAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:4817:3: rule__Level__TitleAssignment_1
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
    // InternalRangoMode.g:4825:1: rule__Level__Group__2 : rule__Level__Group__2__Impl rule__Level__Group__3 ;
    public final void rule__Level__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4829:1: ( rule__Level__Group__2__Impl rule__Level__Group__3 )
            // InternalRangoMode.g:4830:2: rule__Level__Group__2__Impl rule__Level__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalRangoMode.g:4837:1: rule__Level__Group__2__Impl : ( '{' ) ;
    public final void rule__Level__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4841:1: ( ( '{' ) )
            // InternalRangoMode.g:4842:1: ( '{' )
            {
            // InternalRangoMode.g:4842:1: ( '{' )
            // InternalRangoMode.g:4843:2: '{'
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
    // InternalRangoMode.g:4852:1: rule__Level__Group__3 : rule__Level__Group__3__Impl rule__Level__Group__4 ;
    public final void rule__Level__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4856:1: ( rule__Level__Group__3__Impl rule__Level__Group__4 )
            // InternalRangoMode.g:4857:2: rule__Level__Group__3__Impl rule__Level__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalRangoMode.g:4864:1: rule__Level__Group__3__Impl : ( ( rule__Level__ArenaAssignment_3 ) ) ;
    public final void rule__Level__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4868:1: ( ( ( rule__Level__ArenaAssignment_3 ) ) )
            // InternalRangoMode.g:4869:1: ( ( rule__Level__ArenaAssignment_3 ) )
            {
            // InternalRangoMode.g:4869:1: ( ( rule__Level__ArenaAssignment_3 ) )
            // InternalRangoMode.g:4870:2: ( rule__Level__ArenaAssignment_3 )
            {
             before(grammarAccess.getLevelAccess().getArenaAssignment_3()); 
            // InternalRangoMode.g:4871:2: ( rule__Level__ArenaAssignment_3 )
            // InternalRangoMode.g:4871:3: rule__Level__ArenaAssignment_3
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
    // InternalRangoMode.g:4879:1: rule__Level__Group__4 : rule__Level__Group__4__Impl rule__Level__Group__5 ;
    public final void rule__Level__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4883:1: ( rule__Level__Group__4__Impl rule__Level__Group__5 )
            // InternalRangoMode.g:4884:2: rule__Level__Group__4__Impl rule__Level__Group__5
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
    // InternalRangoMode.g:4891:1: rule__Level__Group__4__Impl : ( ( rule__Level__SpawningAssignment_4 ) ) ;
    public final void rule__Level__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4895:1: ( ( ( rule__Level__SpawningAssignment_4 ) ) )
            // InternalRangoMode.g:4896:1: ( ( rule__Level__SpawningAssignment_4 ) )
            {
            // InternalRangoMode.g:4896:1: ( ( rule__Level__SpawningAssignment_4 ) )
            // InternalRangoMode.g:4897:2: ( rule__Level__SpawningAssignment_4 )
            {
             before(grammarAccess.getLevelAccess().getSpawningAssignment_4()); 
            // InternalRangoMode.g:4898:2: ( rule__Level__SpawningAssignment_4 )
            // InternalRangoMode.g:4898:3: rule__Level__SpawningAssignment_4
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
    // InternalRangoMode.g:4906:1: rule__Level__Group__5 : rule__Level__Group__5__Impl ;
    public final void rule__Level__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4910:1: ( rule__Level__Group__5__Impl )
            // InternalRangoMode.g:4911:2: rule__Level__Group__5__Impl
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
    // InternalRangoMode.g:4917:1: rule__Level__Group__5__Impl : ( '}' ) ;
    public final void rule__Level__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4921:1: ( ( '}' ) )
            // InternalRangoMode.g:4922:1: ( '}' )
            {
            // InternalRangoMode.g:4922:1: ( '}' )
            // InternalRangoMode.g:4923:2: '}'
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
    // InternalRangoMode.g:4933:1: rule__SpeedBonus__Group__0 : rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 ;
    public final void rule__SpeedBonus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4937:1: ( rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1 )
            // InternalRangoMode.g:4938:2: rule__SpeedBonus__Group__0__Impl rule__SpeedBonus__Group__1
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
    // InternalRangoMode.g:4945:1: rule__SpeedBonus__Group__0__Impl : ( () ) ;
    public final void rule__SpeedBonus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4949:1: ( ( () ) )
            // InternalRangoMode.g:4950:1: ( () )
            {
            // InternalRangoMode.g:4950:1: ( () )
            // InternalRangoMode.g:4951:2: ()
            {
             before(grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0()); 
            // InternalRangoMode.g:4952:2: ()
            // InternalRangoMode.g:4952:3: 
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
    // InternalRangoMode.g:4960:1: rule__SpeedBonus__Group__1 : rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 ;
    public final void rule__SpeedBonus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4964:1: ( rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2 )
            // InternalRangoMode.g:4965:2: rule__SpeedBonus__Group__1__Impl rule__SpeedBonus__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalRangoMode.g:4972:1: rule__SpeedBonus__Group__1__Impl : ( 'speed' ) ;
    public final void rule__SpeedBonus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4976:1: ( ( 'speed' ) )
            // InternalRangoMode.g:4977:1: ( 'speed' )
            {
            // InternalRangoMode.g:4977:1: ( 'speed' )
            // InternalRangoMode.g:4978:2: 'speed'
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
    // InternalRangoMode.g:4987:1: rule__SpeedBonus__Group__2 : rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 ;
    public final void rule__SpeedBonus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4991:1: ( rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3 )
            // InternalRangoMode.g:4992:2: rule__SpeedBonus__Group__2__Impl rule__SpeedBonus__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:4999:1: rule__SpeedBonus__Group__2__Impl : ( 'bonus' ) ;
    public final void rule__SpeedBonus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5003:1: ( ( 'bonus' ) )
            // InternalRangoMode.g:5004:1: ( 'bonus' )
            {
            // InternalRangoMode.g:5004:1: ( 'bonus' )
            // InternalRangoMode.g:5005:2: 'bonus'
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
    // InternalRangoMode.g:5014:1: rule__SpeedBonus__Group__3 : rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 ;
    public final void rule__SpeedBonus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5018:1: ( rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4 )
            // InternalRangoMode.g:5019:2: rule__SpeedBonus__Group__3__Impl rule__SpeedBonus__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:5026:1: rule__SpeedBonus__Group__3__Impl : ( ( rule__SpeedBonus__Group_3__0 )? ) ;
    public final void rule__SpeedBonus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5030:1: ( ( ( rule__SpeedBonus__Group_3__0 )? ) )
            // InternalRangoMode.g:5031:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            {
            // InternalRangoMode.g:5031:1: ( ( rule__SpeedBonus__Group_3__0 )? )
            // InternalRangoMode.g:5032:2: ( rule__SpeedBonus__Group_3__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_3()); 
            // InternalRangoMode.g:5033:2: ( rule__SpeedBonus__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:5033:3: rule__SpeedBonus__Group_3__0
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
    // InternalRangoMode.g:5041:1: rule__SpeedBonus__Group__4 : rule__SpeedBonus__Group__4__Impl ;
    public final void rule__SpeedBonus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5045:1: ( rule__SpeedBonus__Group__4__Impl )
            // InternalRangoMode.g:5046:2: rule__SpeedBonus__Group__4__Impl
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
    // InternalRangoMode.g:5052:1: rule__SpeedBonus__Group__4__Impl : ( ( rule__SpeedBonus__Group_4__0 )? ) ;
    public final void rule__SpeedBonus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5056:1: ( ( ( rule__SpeedBonus__Group_4__0 )? ) )
            // InternalRangoMode.g:5057:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            {
            // InternalRangoMode.g:5057:1: ( ( rule__SpeedBonus__Group_4__0 )? )
            // InternalRangoMode.g:5058:2: ( rule__SpeedBonus__Group_4__0 )?
            {
             before(grammarAccess.getSpeedBonusAccess().getGroup_4()); 
            // InternalRangoMode.g:5059:2: ( rule__SpeedBonus__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:5059:3: rule__SpeedBonus__Group_4__0
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
    // InternalRangoMode.g:5068:1: rule__SpeedBonus__Group_3__0 : rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 ;
    public final void rule__SpeedBonus__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5072:1: ( rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1 )
            // InternalRangoMode.g:5073:2: rule__SpeedBonus__Group_3__0__Impl rule__SpeedBonus__Group_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5080:1: rule__SpeedBonus__Group_3__0__Impl : ( 'up' ) ;
    public final void rule__SpeedBonus__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5084:1: ( ( 'up' ) )
            // InternalRangoMode.g:5085:1: ( 'up' )
            {
            // InternalRangoMode.g:5085:1: ( 'up' )
            // InternalRangoMode.g:5086:2: 'up'
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
    // InternalRangoMode.g:5095:1: rule__SpeedBonus__Group_3__1 : rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 ;
    public final void rule__SpeedBonus__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5099:1: ( rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2 )
            // InternalRangoMode.g:5100:2: rule__SpeedBonus__Group_3__1__Impl rule__SpeedBonus__Group_3__2
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
    // InternalRangoMode.g:5107:1: rule__SpeedBonus__Group_3__1__Impl : ( 'to' ) ;
    public final void rule__SpeedBonus__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5111:1: ( ( 'to' ) )
            // InternalRangoMode.g:5112:1: ( 'to' )
            {
            // InternalRangoMode.g:5112:1: ( 'to' )
            // InternalRangoMode.g:5113:2: 'to'
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
    // InternalRangoMode.g:5122:1: rule__SpeedBonus__Group_3__2 : rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 ;
    public final void rule__SpeedBonus__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5126:1: ( rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3 )
            // InternalRangoMode.g:5127:2: rule__SpeedBonus__Group_3__2__Impl rule__SpeedBonus__Group_3__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalRangoMode.g:5134:1: rule__SpeedBonus__Group_3__2__Impl : ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) ;
    public final void rule__SpeedBonus__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5138:1: ( ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) ) )
            // InternalRangoMode.g:5139:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            {
            // InternalRangoMode.g:5139:1: ( ( rule__SpeedBonus__MaxFactorAssignment_3_2 ) )
            // InternalRangoMode.g:5140:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            {
             before(grammarAccess.getSpeedBonusAccess().getMaxFactorAssignment_3_2()); 
            // InternalRangoMode.g:5141:2: ( rule__SpeedBonus__MaxFactorAssignment_3_2 )
            // InternalRangoMode.g:5141:3: rule__SpeedBonus__MaxFactorAssignment_3_2
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
    // InternalRangoMode.g:5149:1: rule__SpeedBonus__Group_3__3 : rule__SpeedBonus__Group_3__3__Impl ;
    public final void rule__SpeedBonus__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5153:1: ( rule__SpeedBonus__Group_3__3__Impl )
            // InternalRangoMode.g:5154:2: rule__SpeedBonus__Group_3__3__Impl
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
    // InternalRangoMode.g:5160:1: rule__SpeedBonus__Group_3__3__Impl : ( 'times' ) ;
    public final void rule__SpeedBonus__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5164:1: ( ( 'times' ) )
            // InternalRangoMode.g:5165:1: ( 'times' )
            {
            // InternalRangoMode.g:5165:1: ( 'times' )
            // InternalRangoMode.g:5166:2: 'times'
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
    // InternalRangoMode.g:5176:1: rule__SpeedBonus__Group_4__0 : rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 ;
    public final void rule__SpeedBonus__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5180:1: ( rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1 )
            // InternalRangoMode.g:5181:2: rule__SpeedBonus__Group_4__0__Impl rule__SpeedBonus__Group_4__1
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
    // InternalRangoMode.g:5188:1: rule__SpeedBonus__Group_4__0__Impl : ( 'over' ) ;
    public final void rule__SpeedBonus__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5192:1: ( ( 'over' ) )
            // InternalRangoMode.g:5193:1: ( 'over' )
            {
            // InternalRangoMode.g:5193:1: ( 'over' )
            // InternalRangoMode.g:5194:2: 'over'
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
    // InternalRangoMode.g:5203:1: rule__SpeedBonus__Group_4__1 : rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 ;
    public final void rule__SpeedBonus__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5207:1: ( rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2 )
            // InternalRangoMode.g:5208:2: rule__SpeedBonus__Group_4__1__Impl rule__SpeedBonus__Group_4__2
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
    // InternalRangoMode.g:5215:1: rule__SpeedBonus__Group_4__1__Impl : ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) ;
    public final void rule__SpeedBonus__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5219:1: ( ( ( rule__SpeedBonus__DurationAssignment_4_1 ) ) )
            // InternalRangoMode.g:5220:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            {
            // InternalRangoMode.g:5220:1: ( ( rule__SpeedBonus__DurationAssignment_4_1 ) )
            // InternalRangoMode.g:5221:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            {
             before(grammarAccess.getSpeedBonusAccess().getDurationAssignment_4_1()); 
            // InternalRangoMode.g:5222:2: ( rule__SpeedBonus__DurationAssignment_4_1 )
            // InternalRangoMode.g:5222:3: rule__SpeedBonus__DurationAssignment_4_1
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
    // InternalRangoMode.g:5230:1: rule__SpeedBonus__Group_4__2 : rule__SpeedBonus__Group_4__2__Impl ;
    public final void rule__SpeedBonus__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5234:1: ( rule__SpeedBonus__Group_4__2__Impl )
            // InternalRangoMode.g:5235:2: rule__SpeedBonus__Group_4__2__Impl
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
    // InternalRangoMode.g:5241:1: rule__SpeedBonus__Group_4__2__Impl : ( 's' ) ;
    public final void rule__SpeedBonus__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5245:1: ( ( 's' ) )
            // InternalRangoMode.g:5246:1: ( 's' )
            {
            // InternalRangoMode.g:5246:1: ( 's' )
            // InternalRangoMode.g:5247:2: 's'
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
    // InternalRangoMode.g:5257:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5261:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5262:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
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
    // InternalRangoMode.g:5269:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5273:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5274:1: ( 'arena' )
            {
            // InternalRangoMode.g:5274:1: ( 'arena' )
            // InternalRangoMode.g:5275:2: 'arena'
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
    // InternalRangoMode.g:5284:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5288:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5289:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5296:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5300:1: ( ( '{' ) )
            // InternalRangoMode.g:5301:1: ( '{' )
            {
            // InternalRangoMode.g:5301:1: ( '{' )
            // InternalRangoMode.g:5302:2: '{'
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
    // InternalRangoMode.g:5311:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5315:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5316:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
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
    // InternalRangoMode.g:5323:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5327:1: ( ( 'background' ) )
            // InternalRangoMode.g:5328:1: ( 'background' )
            {
            // InternalRangoMode.g:5328:1: ( 'background' )
            // InternalRangoMode.g:5329:2: 'background'
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
    // InternalRangoMode.g:5338:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5342:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5343:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5350:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5354:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5355:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5355:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5356:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5357:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5357:3: rule__Arena__BackgroundAssignment_3
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
    // InternalRangoMode.g:5365:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5369:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5370:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5377:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__Group_4__0 )? ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5381:1: ( ( ( rule__Arena__Group_4__0 )? ) )
            // InternalRangoMode.g:5382:1: ( ( rule__Arena__Group_4__0 )? )
            {
            // InternalRangoMode.g:5382:1: ( ( rule__Arena__Group_4__0 )? )
            // InternalRangoMode.g:5383:2: ( rule__Arena__Group_4__0 )?
            {
             before(grammarAccess.getArenaAccess().getGroup_4()); 
            // InternalRangoMode.g:5384:2: ( rule__Arena__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:5384:3: rule__Arena__Group_4__0
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
    // InternalRangoMode.g:5392:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5396:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5397:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5404:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5408:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5409:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5409:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5410:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5411:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==70||LA27_0==73||LA27_0==76) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRangoMode.g:5411:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalRangoMode.g:5419:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5423:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5424:2: rule__Arena__Group__6__Impl
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
    // InternalRangoMode.g:5430:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5434:1: ( ( '}' ) )
            // InternalRangoMode.g:5435:1: ( '}' )
            {
            // InternalRangoMode.g:5435:1: ( '}' )
            // InternalRangoMode.g:5436:2: '}'
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


    // $ANTLR start "rule__Arena__Group_4__0"
    // InternalRangoMode.g:5446:1: rule__Arena__Group_4__0 : rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 ;
    public final void rule__Arena__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5450:1: ( rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1 )
            // InternalRangoMode.g:5451:2: rule__Arena__Group_4__0__Impl rule__Arena__Group_4__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5458:1: rule__Arena__Group_4__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5462:1: ( ( 'player' ) )
            // InternalRangoMode.g:5463:1: ( 'player' )
            {
            // InternalRangoMode.g:5463:1: ( 'player' )
            // InternalRangoMode.g:5464:2: 'player'
            {
             before(grammarAccess.getArenaAccess().getPlayerKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalRangoMode.g:5473:1: rule__Arena__Group_4__1 : rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 ;
    public final void rule__Arena__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5477:1: ( rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2 )
            // InternalRangoMode.g:5478:2: rule__Arena__Group_4__1__Impl rule__Arena__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRangoMode.g:5485:1: rule__Arena__Group_4__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5489:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5490:1: ( 'starts' )
            {
            // InternalRangoMode.g:5490:1: ( 'starts' )
            // InternalRangoMode.g:5491:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalRangoMode.g:5500:1: rule__Arena__Group_4__2 : rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 ;
    public final void rule__Arena__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5504:1: ( rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3 )
            // InternalRangoMode.g:5505:2: rule__Arena__Group_4__2__Impl rule__Arena__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRangoMode.g:5512:1: rule__Arena__Group_4__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5516:1: ( ( 'at' ) )
            // InternalRangoMode.g:5517:1: ( 'at' )
            {
            // InternalRangoMode.g:5517:1: ( 'at' )
            // InternalRangoMode.g:5518:2: 'at'
            {
             before(grammarAccess.getArenaAccess().getAtKeyword_4_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRangoMode.g:5527:1: rule__Arena__Group_4__3 : rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 ;
    public final void rule__Arena__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5531:1: ( rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4 )
            // InternalRangoMode.g:5532:2: rule__Arena__Group_4__3__Impl rule__Arena__Group_4__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5539:1: rule__Arena__Group_4__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) ;
    public final void rule__Arena__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5543:1: ( ( ( rule__Arena__PlayerStartAssignment_4_3 ) ) )
            // InternalRangoMode.g:5544:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            {
            // InternalRangoMode.g:5544:1: ( ( rule__Arena__PlayerStartAssignment_4_3 ) )
            // InternalRangoMode.g:5545:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_3()); 
            // InternalRangoMode.g:5546:2: ( rule__Arena__PlayerStartAssignment_4_3 )
            // InternalRangoMode.g:5546:3: rule__Arena__PlayerStartAssignment_4_3
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
    // InternalRangoMode.g:5554:1: rule__Arena__Group_4__4 : rule__Arena__Group_4__4__Impl ;
    public final void rule__Arena__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5558:1: ( rule__Arena__Group_4__4__Impl )
            // InternalRangoMode.g:5559:2: rule__Arena__Group_4__4__Impl
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
    // InternalRangoMode.g:5565:1: rule__Arena__Group_4__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5569:1: ( ( '%' ) )
            // InternalRangoMode.g:5570:1: ( '%' )
            {
            // InternalRangoMode.g:5570:1: ( '%' )
            // InternalRangoMode.g:5571:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_4()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:5581:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5585:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5586:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalRangoMode.g:5593:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5597:1: ( ( 'at' ) )
            // InternalRangoMode.g:5598:1: ( 'at' )
            {
            // InternalRangoMode.g:5598:1: ( 'at' )
            // InternalRangoMode.g:5599:2: 'at'
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
    // InternalRangoMode.g:5608:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5612:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5613:2: rule__At__Group__1__Impl rule__At__Group__2
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
    // InternalRangoMode.g:5620:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5624:1: ( ( '(' ) )
            // InternalRangoMode.g:5625:1: ( '(' )
            {
            // InternalRangoMode.g:5625:1: ( '(' )
            // InternalRangoMode.g:5626:2: '('
            {
             before(grammarAccess.getAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalRangoMode.g:5635:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5639:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:5640:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5647:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5651:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:5652:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:5652:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:5653:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:5654:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:5654:3: rule__At__XAssignment_2
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
    // InternalRangoMode.g:5662:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5666:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:5667:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:5674:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5678:1: ( ( '%' ) )
            // InternalRangoMode.g:5679:1: ( '%' )
            {
            // InternalRangoMode.g:5679:1: ( '%' )
            // InternalRangoMode.g:5680:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:5689:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5693:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:5694:2: rule__At__Group__4__Impl rule__At__Group__5
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
    // InternalRangoMode.g:5701:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5705:1: ( ( ',' ) )
            // InternalRangoMode.g:5706:1: ( ',' )
            {
            // InternalRangoMode.g:5706:1: ( ',' )
            // InternalRangoMode.g:5707:2: ','
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
    // InternalRangoMode.g:5716:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5720:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:5721:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5728:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5732:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:5733:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:5733:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:5734:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:5735:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:5735:3: rule__At__YAssignment_5
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
    // InternalRangoMode.g:5743:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5747:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:5748:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:5755:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5759:1: ( ( '%' ) )
            // InternalRangoMode.g:5760:1: ( '%' )
            {
            // InternalRangoMode.g:5760:1: ( '%' )
            // InternalRangoMode.g:5761:2: '%'
            {
             before(grammarAccess.getAtAccess().getPercentSignKeyword_6()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:5770:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5774:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:5775:2: rule__At__Group__7__Impl
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
    // InternalRangoMode.g:5781:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5785:1: ( ( ')' ) )
            // InternalRangoMode.g:5786:1: ( ')' )
            {
            // InternalRangoMode.g:5786:1: ( ')' )
            // InternalRangoMode.g:5787:2: ')'
            {
             before(grammarAccess.getAtAccess().getRightParenthesisKeyword_7()); 
            match(input,69,FOLLOW_2); 
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
    // InternalRangoMode.g:5797:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5801:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:5802:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRangoMode.g:5809:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5813:1: ( ( 'block' ) )
            // InternalRangoMode.g:5814:1: ( 'block' )
            {
            // InternalRangoMode.g:5814:1: ( 'block' )
            // InternalRangoMode.g:5815:2: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalRangoMode.g:5824:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5828:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:5829:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRangoMode.g:5836:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5840:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:5841:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:5841:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:5842:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:5843:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:5843:3: rule__Block__NameAssignment_1
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
    // InternalRangoMode.g:5851:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5855:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:5856:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:5863:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5867:1: ( ( ruleAt ) )
            // InternalRangoMode.g:5868:1: ( ruleAt )
            {
            // InternalRangoMode.g:5868:1: ( ruleAt )
            // InternalRangoMode.g:5869:2: ruleAt
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
    // InternalRangoMode.g:5878:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5882:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:5883:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalRangoMode.g:5890:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5894:1: ( ( 'size' ) )
            // InternalRangoMode.g:5895:1: ( 'size' )
            {
            // InternalRangoMode.g:5895:1: ( 'size' )
            // InternalRangoMode.g:5896:2: 'size'
            {
             before(grammarAccess.getBlockAccess().getSizeKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:5905:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5909:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:5910:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_57);
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
    // InternalRangoMode.g:5917:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5921:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:5922:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:5922:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:5923:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:5924:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:5924:3: rule__Block__WidthAssignment_4
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
    // InternalRangoMode.g:5932:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5936:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:5937:2: rule__Block__Group__5__Impl rule__Block__Group__6
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
    // InternalRangoMode.g:5944:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5948:1: ( ( 'by' ) )
            // InternalRangoMode.g:5949:1: ( 'by' )
            {
            // InternalRangoMode.g:5949:1: ( 'by' )
            // InternalRangoMode.g:5950:2: 'by'
            {
             before(grammarAccess.getBlockAccess().getByKeyword_5()); 
            match(input,72,FOLLOW_2); 
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
    // InternalRangoMode.g:5959:1: rule__Block__Group__6 : rule__Block__Group__6__Impl ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5963:1: ( rule__Block__Group__6__Impl )
            // InternalRangoMode.g:5964:2: rule__Block__Group__6__Impl
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
    // InternalRangoMode.g:5970:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5974:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:5975:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:5975:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:5976:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:5977:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:5977:3: rule__Block__HeightAssignment_6
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
    // InternalRangoMode.g:5986:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5990:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:5991:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
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
    // InternalRangoMode.g:5998:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6002:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6003:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6003:1: ( 'jumppad' )
            // InternalRangoMode.g:6004:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:6013:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6017:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6018:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
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
    // InternalRangoMode.g:6025:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6029:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6030:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6030:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6031:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6032:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6032:3: rule__JumpPad__NameAssignment_1
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
    // InternalRangoMode.g:6040:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6044:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6045:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
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
    // InternalRangoMode.g:6052:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6056:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6057:1: ( ruleAt )
            {
            // InternalRangoMode.g:6057:1: ( ruleAt )
            // InternalRangoMode.g:6058:2: ruleAt
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
    // InternalRangoMode.g:6067:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6071:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6072:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
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
    // InternalRangoMode.g:6079:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6083:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6084:1: ( 'launch' )
            {
            // InternalRangoMode.g:6084:1: ( 'launch' )
            // InternalRangoMode.g:6085:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:6094:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6098:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6099:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
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
    // InternalRangoMode.g:6106:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6110:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6111:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6111:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6112:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6113:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6113:3: rule__JumpPad__LaunchAssignment_4
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
    // InternalRangoMode.g:6121:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6125:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6126:2: rule__JumpPad__Group__5__Impl
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
    // InternalRangoMode.g:6132:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6136:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6137:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6137:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6138:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6139:2: ( rule__JumpPad__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==75) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:6139:3: rule__JumpPad__Group_5__0
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
    // InternalRangoMode.g:6148:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6152:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6153:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
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
    // InternalRangoMode.g:6160:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6164:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6165:1: ( 'affects' )
            {
            // InternalRangoMode.g:6165:1: ( 'affects' )
            // InternalRangoMode.g:6166:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:6175:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6179:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6180:2: rule__JumpPad__Group_5__1__Impl
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
    // InternalRangoMode.g:6186:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6190:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6191:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6191:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6192:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6193:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6193:3: rule__JumpPad__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6202:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6206:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6207:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
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
    // InternalRangoMode.g:6214:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6218:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6219:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6219:1: ( 'teleporter' )
            // InternalRangoMode.g:6220:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:6229:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6233:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6234:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
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
    // InternalRangoMode.g:6241:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6245:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6246:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6246:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6247:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6248:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6248:3: rule__Teleporter__NameAssignment_1
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
    // InternalRangoMode.g:6256:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6260:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6261:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:6268:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6272:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6273:1: ( ruleAt )
            {
            // InternalRangoMode.g:6273:1: ( ruleAt )
            // InternalRangoMode.g:6274:2: ruleAt
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
    // InternalRangoMode.g:6283:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6287:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6288:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
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
    // InternalRangoMode.g:6295:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6299:1: ( ( 'to' ) )
            // InternalRangoMode.g:6300:1: ( 'to' )
            {
            // InternalRangoMode.g:6300:1: ( 'to' )
            // InternalRangoMode.g:6301:2: 'to'
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
    // InternalRangoMode.g:6310:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6314:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6315:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
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
    // InternalRangoMode.g:6322:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6326:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6327:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6327:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6328:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6329:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6329:3: rule__Teleporter__TargetAssignment_4
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
    // InternalRangoMode.g:6337:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6341:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6342:2: rule__Teleporter__Group__5__Impl
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
    // InternalRangoMode.g:6348:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6352:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6353:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6353:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6354:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6355:2: ( rule__Teleporter__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==75) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:6355:3: rule__Teleporter__Group_5__0
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
    // InternalRangoMode.g:6364:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6368:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6369:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
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
    // InternalRangoMode.g:6376:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6380:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6381:1: ( 'affects' )
            {
            // InternalRangoMode.g:6381:1: ( 'affects' )
            // InternalRangoMode.g:6382:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:6391:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6395:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6396:2: rule__Teleporter__Group_5__1__Impl
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
    // InternalRangoMode.g:6402:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6406:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6407:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6407:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6408:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6409:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6409:3: rule__Teleporter__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6418:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6422:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6423:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
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
    // InternalRangoMode.g:6430:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6434:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6435:1: ( 'layout' )
            {
            // InternalRangoMode.g:6435:1: ( 'layout' )
            // InternalRangoMode.g:6436:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6445:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6449:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6450:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
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
    // InternalRangoMode.g:6457:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6461:1: ( ( '{' ) )
            // InternalRangoMode.g:6462:1: ( '{' )
            {
            // InternalRangoMode.g:6462:1: ( '{' )
            // InternalRangoMode.g:6463:2: '{'
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
    // InternalRangoMode.g:6472:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6476:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6477:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
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
    // InternalRangoMode.g:6484:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6488:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6489:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6489:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6490:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6490:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6491:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6492:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6492:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_62);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6495:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6496:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6497:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRangoMode.g:6497:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6506:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6510:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6511:2: rule__FixedLayout__Group__3__Impl
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
    // InternalRangoMode.g:6517:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6521:1: ( ( '}' ) )
            // InternalRangoMode.g:6522:1: ( '}' )
            {
            // InternalRangoMode.g:6522:1: ( '}' )
            // InternalRangoMode.g:6523:2: '}'
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
    // InternalRangoMode.g:6533:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6537:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:6538:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
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
    // InternalRangoMode.g:6545:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6549:1: ( ( 'waves' ) )
            // InternalRangoMode.g:6550:1: ( 'waves' )
            {
            // InternalRangoMode.g:6550:1: ( 'waves' )
            // InternalRangoMode.g:6551:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6560:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6564:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:6565:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
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
    // InternalRangoMode.g:6572:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6576:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:6577:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:6577:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:6578:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:6579:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==95) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRangoMode.g:6579:3: rule__WaveSchedule__Group_1__0
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
    // InternalRangoMode.g:6587:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6591:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:6592:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
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
    // InternalRangoMode.g:6599:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6603:1: ( ( '{' ) )
            // InternalRangoMode.g:6604:1: ( '{' )
            {
            // InternalRangoMode.g:6604:1: ( '{' )
            // InternalRangoMode.g:6605:2: '{'
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
    // InternalRangoMode.g:6614:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6618:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:6619:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
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
    // InternalRangoMode.g:6626:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6630:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:6631:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6631:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:6632:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:6632:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:6633:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6634:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:6634:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_65);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:6637:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:6638:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6639:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==80) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRangoMode.g:6639:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_65);
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
    // InternalRangoMode.g:6648:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6652:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:6653:2: rule__WaveSchedule__Group__4__Impl
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
    // InternalRangoMode.g:6659:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6663:1: ( ( '}' ) )
            // InternalRangoMode.g:6664:1: ( '}' )
            {
            // InternalRangoMode.g:6664:1: ( '}' )
            // InternalRangoMode.g:6665:2: '}'
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
    // InternalRangoMode.g:6675:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6679:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:6680:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
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
    // InternalRangoMode.g:6687:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6691:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:6692:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:6692:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:6693:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:6694:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:6694:3: rule__WaveSchedule__LoopAssignment_1_0
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
    // InternalRangoMode.g:6702:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6706:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:6707:2: rule__WaveSchedule__Group_1__1__Impl
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
    // InternalRangoMode.g:6713:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6717:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:6718:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:6718:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:6719:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:6720:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRangoMode.g:6720:3: rule__WaveSchedule__Group_1_1__0
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
    // InternalRangoMode.g:6729:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6733:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:6734:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalRangoMode.g:6741:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6745:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:6746:1: ( 'escalate' )
            {
            // InternalRangoMode.g:6746:1: ( 'escalate' )
            // InternalRangoMode.g:6747:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6756:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6760:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:6761:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
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
    // InternalRangoMode.g:6768:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6772:1: ( ( 'by' ) )
            // InternalRangoMode.g:6773:1: ( 'by' )
            {
            // InternalRangoMode.g:6773:1: ( 'by' )
            // InternalRangoMode.g:6774:2: 'by'
            {
             before(grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalRangoMode.g:6783:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6787:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:6788:2: rule__WaveSchedule__Group_1_1__2__Impl
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
    // InternalRangoMode.g:6794:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6798:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:6799:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:6799:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:6800:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:6801:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:6801:3: rule__WaveSchedule__EscalationAssignment_1_1_2
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
    // InternalRangoMode.g:6810:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6814:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:6815:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
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
    // InternalRangoMode.g:6822:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6826:1: ( ( 'wave' ) )
            // InternalRangoMode.g:6827:1: ( 'wave' )
            {
            // InternalRangoMode.g:6827:1: ( 'wave' )
            // InternalRangoMode.g:6828:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:6837:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6841:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:6842:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
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
    // InternalRangoMode.g:6849:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6853:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:6854:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:6854:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:6855:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:6856:2: ( rule__Wave__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==81) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:6856:3: rule__Wave__Group_1__0
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
    // InternalRangoMode.g:6864:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6868:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:6869:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
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
    // InternalRangoMode.g:6876:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6880:1: ( ( '{' ) )
            // InternalRangoMode.g:6881:1: ( '{' )
            {
            // InternalRangoMode.g:6881:1: ( '{' )
            // InternalRangoMode.g:6882:2: '{'
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
    // InternalRangoMode.g:6891:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6895:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:6896:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
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
    // InternalRangoMode.g:6903:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6907:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:6908:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6908:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:6909:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:6909:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:6910:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:6911:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:6911:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_62);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:6914:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:6915:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:6916:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_ID)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRangoMode.g:6916:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6925:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6929:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:6930:2: rule__Wave__Group__4__Impl
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
    // InternalRangoMode.g:6936:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6940:1: ( ( '}' ) )
            // InternalRangoMode.g:6941:1: ( '}' )
            {
            // InternalRangoMode.g:6941:1: ( '}' )
            // InternalRangoMode.g:6942:2: '}'
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
    // InternalRangoMode.g:6952:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6956:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:6957:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
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
    // InternalRangoMode.g:6964:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6968:1: ( ( 'after' ) )
            // InternalRangoMode.g:6969:1: ( 'after' )
            {
            // InternalRangoMode.g:6969:1: ( 'after' )
            // InternalRangoMode.g:6970:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:6979:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6983:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:6984:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
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
    // InternalRangoMode.g:6991:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6995:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:6996:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:6996:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:6997:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:6998:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:6998:3: rule__Wave__DelayAssignment_1_1
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
    // InternalRangoMode.g:7006:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7010:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7011:2: rule__Wave__Group_1__2__Impl
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
    // InternalRangoMode.g:7017:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7021:1: ( ( 's' ) )
            // InternalRangoMode.g:7022:1: ( 's' )
            {
            // InternalRangoMode.g:7022:1: ( 's' )
            // InternalRangoMode.g:7023:2: 's'
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
    // InternalRangoMode.g:7033:1: rule__EnemySpawn__Group__0 : rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 ;
    public final void rule__EnemySpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7037:1: ( rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1 )
            // InternalRangoMode.g:7038:2: rule__EnemySpawn__Group__0__Impl rule__EnemySpawn__Group__1
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
    // InternalRangoMode.g:7045:1: rule__EnemySpawn__Group__0__Impl : ( ( rule__EnemySpawn__Group_0__0 )? ) ;
    public final void rule__EnemySpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7049:1: ( ( ( rule__EnemySpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7050:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7050:1: ( ( rule__EnemySpawn__Group_0__0 )? )
            // InternalRangoMode.g:7051:2: ( rule__EnemySpawn__Group_0__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7052:2: ( rule__EnemySpawn__Group_0__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:7052:3: rule__EnemySpawn__Group_0__0
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
    // InternalRangoMode.g:7060:1: rule__EnemySpawn__Group__1 : rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 ;
    public final void rule__EnemySpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7064:1: ( rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2 )
            // InternalRangoMode.g:7065:2: rule__EnemySpawn__Group__1__Impl rule__EnemySpawn__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalRangoMode.g:7072:1: rule__EnemySpawn__Group__1__Impl : ( ( rule__EnemySpawn__TypeAssignment_1 ) ) ;
    public final void rule__EnemySpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7076:1: ( ( ( rule__EnemySpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7077:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7077:1: ( ( rule__EnemySpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7078:2: ( rule__EnemySpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7079:2: ( rule__EnemySpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7079:3: rule__EnemySpawn__TypeAssignment_1
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
    // InternalRangoMode.g:7087:1: rule__EnemySpawn__Group__2 : rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 ;
    public final void rule__EnemySpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7091:1: ( rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3 )
            // InternalRangoMode.g:7092:2: rule__EnemySpawn__Group__2__Impl rule__EnemySpawn__Group__3
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
    // InternalRangoMode.g:7099:1: rule__EnemySpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__EnemySpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7103:1: ( ( 'size' ) )
            // InternalRangoMode.g:7104:1: ( 'size' )
            {
            // InternalRangoMode.g:7104:1: ( 'size' )
            // InternalRangoMode.g:7105:2: 'size'
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeKeyword_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalRangoMode.g:7114:1: rule__EnemySpawn__Group__3 : rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 ;
    public final void rule__EnemySpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7118:1: ( rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4 )
            // InternalRangoMode.g:7119:2: rule__EnemySpawn__Group__3__Impl rule__EnemySpawn__Group__4
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
    // InternalRangoMode.g:7126:1: rule__EnemySpawn__Group__3__Impl : ( ( rule__EnemySpawn__SizeAssignment_3 ) ) ;
    public final void rule__EnemySpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7130:1: ( ( ( rule__EnemySpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7131:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7131:1: ( ( rule__EnemySpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7132:2: ( rule__EnemySpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getEnemySpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7133:2: ( rule__EnemySpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7133:3: rule__EnemySpawn__SizeAssignment_3
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
    // InternalRangoMode.g:7141:1: rule__EnemySpawn__Group__4 : rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 ;
    public final void rule__EnemySpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7145:1: ( rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5 )
            // InternalRangoMode.g:7146:2: rule__EnemySpawn__Group__4__Impl rule__EnemySpawn__Group__5
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
    // InternalRangoMode.g:7153:1: rule__EnemySpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__EnemySpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7157:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7158:1: ( ruleAt )
            {
            // InternalRangoMode.g:7158:1: ( ruleAt )
            // InternalRangoMode.g:7159:2: ruleAt
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
    // InternalRangoMode.g:7168:1: rule__EnemySpawn__Group__5 : rule__EnemySpawn__Group__5__Impl ;
    public final void rule__EnemySpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7172:1: ( rule__EnemySpawn__Group__5__Impl )
            // InternalRangoMode.g:7173:2: rule__EnemySpawn__Group__5__Impl
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
    // InternalRangoMode.g:7179:1: rule__EnemySpawn__Group__5__Impl : ( ( rule__EnemySpawn__Group_5__0 )? ) ;
    public final void rule__EnemySpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7183:1: ( ( ( rule__EnemySpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7184:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7184:1: ( ( rule__EnemySpawn__Group_5__0 )? )
            // InternalRangoMode.g:7185:2: ( rule__EnemySpawn__Group_5__0 )?
            {
             before(grammarAccess.getEnemySpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7186:2: ( rule__EnemySpawn__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==82) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:7186:3: rule__EnemySpawn__Group_5__0
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
    // InternalRangoMode.g:7195:1: rule__EnemySpawn__Group_0__0 : rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 ;
    public final void rule__EnemySpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7199:1: ( rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1 )
            // InternalRangoMode.g:7200:2: rule__EnemySpawn__Group_0__0__Impl rule__EnemySpawn__Group_0__1
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
    // InternalRangoMode.g:7207:1: rule__EnemySpawn__Group_0__0__Impl : ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) ;
    public final void rule__EnemySpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7211:1: ( ( ( rule__EnemySpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7212:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7212:1: ( ( rule__EnemySpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7213:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getEnemySpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7214:2: ( rule__EnemySpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7214:3: rule__EnemySpawn__CountAssignment_0_0
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
    // InternalRangoMode.g:7222:1: rule__EnemySpawn__Group_0__1 : rule__EnemySpawn__Group_0__1__Impl ;
    public final void rule__EnemySpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7226:1: ( rule__EnemySpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7227:2: rule__EnemySpawn__Group_0__1__Impl
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
    // InternalRangoMode.g:7233:1: rule__EnemySpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__EnemySpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7237:1: ( ( '*' ) )
            // InternalRangoMode.g:7238:1: ( '*' )
            {
            // InternalRangoMode.g:7238:1: ( '*' )
            // InternalRangoMode.g:7239:2: '*'
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
    // InternalRangoMode.g:7249:1: rule__EnemySpawn__Group_5__0 : rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 ;
    public final void rule__EnemySpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7253:1: ( rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1 )
            // InternalRangoMode.g:7254:2: rule__EnemySpawn__Group_5__0__Impl rule__EnemySpawn__Group_5__1
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
    // InternalRangoMode.g:7261:1: rule__EnemySpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__EnemySpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7265:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7266:1: ( 'moving' )
            {
            // InternalRangoMode.g:7266:1: ( 'moving' )
            // InternalRangoMode.g:7267:2: 'moving'
            {
             before(grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:7276:1: rule__EnemySpawn__Group_5__1 : rule__EnemySpawn__Group_5__1__Impl ;
    public final void rule__EnemySpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7280:1: ( rule__EnemySpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7281:2: rule__EnemySpawn__Group_5__1__Impl
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
    // InternalRangoMode.g:7287:1: rule__EnemySpawn__Group_5__1__Impl : ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__EnemySpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7291:1: ( ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7292:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7292:1: ( ( rule__EnemySpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7293:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getEnemySpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7294:2: ( rule__EnemySpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7294:3: rule__EnemySpawn__DirectionAssignment_5_1
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
    // InternalRangoMode.g:7303:1: rule__Drops__Group__0 : rule__Drops__Group__0__Impl rule__Drops__Group__1 ;
    public final void rule__Drops__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7307:1: ( rule__Drops__Group__0__Impl rule__Drops__Group__1 )
            // InternalRangoMode.g:7308:2: rule__Drops__Group__0__Impl rule__Drops__Group__1
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
    // InternalRangoMode.g:7315:1: rule__Drops__Group__0__Impl : ( 'drops' ) ;
    public final void rule__Drops__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7319:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7320:1: ( 'drops' )
            {
            // InternalRangoMode.g:7320:1: ( 'drops' )
            // InternalRangoMode.g:7321:2: 'drops'
            {
             before(grammarAccess.getDropsAccess().getDropsKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRangoMode.g:7330:1: rule__Drops__Group__1 : rule__Drops__Group__1__Impl rule__Drops__Group__2 ;
    public final void rule__Drops__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7334:1: ( rule__Drops__Group__1__Impl rule__Drops__Group__2 )
            // InternalRangoMode.g:7335:2: rule__Drops__Group__1__Impl rule__Drops__Group__2
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
    // InternalRangoMode.g:7342:1: rule__Drops__Group__1__Impl : ( '{' ) ;
    public final void rule__Drops__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7346:1: ( ( '{' ) )
            // InternalRangoMode.g:7347:1: ( '{' )
            {
            // InternalRangoMode.g:7347:1: ( '{' )
            // InternalRangoMode.g:7348:2: '{'
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
    // InternalRangoMode.g:7357:1: rule__Drops__Group__2 : rule__Drops__Group__2__Impl rule__Drops__Group__3 ;
    public final void rule__Drops__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7361:1: ( rule__Drops__Group__2__Impl rule__Drops__Group__3 )
            // InternalRangoMode.g:7362:2: rule__Drops__Group__2__Impl rule__Drops__Group__3
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
    // InternalRangoMode.g:7369:1: rule__Drops__Group__2__Impl : ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) ;
    public final void rule__Drops__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7373:1: ( ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) ) )
            // InternalRangoMode.g:7374:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:7374:1: ( ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* ) )
            // InternalRangoMode.g:7375:2: ( ( rule__Drops__DropsAssignment_2 ) ) ( ( rule__Drops__DropsAssignment_2 )* )
            {
            // InternalRangoMode.g:7375:2: ( ( rule__Drops__DropsAssignment_2 ) )
            // InternalRangoMode.g:7376:3: ( rule__Drops__DropsAssignment_2 )
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7377:3: ( rule__Drops__DropsAssignment_2 )
            // InternalRangoMode.g:7377:4: rule__Drops__DropsAssignment_2
            {
            pushFollow(FOLLOW_70);
            rule__Drops__DropsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropsAccess().getDropsAssignment_2()); 

            }

            // InternalRangoMode.g:7380:2: ( ( rule__Drops__DropsAssignment_2 )* )
            // InternalRangoMode.g:7381:3: ( rule__Drops__DropsAssignment_2 )*
            {
             before(grammarAccess.getDropsAccess().getDropsAssignment_2()); 
            // InternalRangoMode.g:7382:3: ( rule__Drops__DropsAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRangoMode.g:7382:4: rule__Drops__DropsAssignment_2
            	    {
            	    pushFollow(FOLLOW_70);
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
    // InternalRangoMode.g:7391:1: rule__Drops__Group__3 : rule__Drops__Group__3__Impl ;
    public final void rule__Drops__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7395:1: ( rule__Drops__Group__3__Impl )
            // InternalRangoMode.g:7396:2: rule__Drops__Group__3__Impl
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
    // InternalRangoMode.g:7402:1: rule__Drops__Group__3__Impl : ( '}' ) ;
    public final void rule__Drops__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7406:1: ( ( '}' ) )
            // InternalRangoMode.g:7407:1: ( '}' )
            {
            // InternalRangoMode.g:7407:1: ( '}' )
            // InternalRangoMode.g:7408:2: '}'
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
    // InternalRangoMode.g:7418:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7422:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7423:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
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
    // InternalRangoMode.g:7430:1: rule__DropTable__Group__0__Impl : ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7434:1: ( ( ( rule__DropTable__EnemyTypeAssignment_0 ) ) )
            // InternalRangoMode.g:7435:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            {
            // InternalRangoMode.g:7435:1: ( ( rule__DropTable__EnemyTypeAssignment_0 ) )
            // InternalRangoMode.g:7436:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeAssignment_0()); 
            // InternalRangoMode.g:7437:2: ( rule__DropTable__EnemyTypeAssignment_0 )
            // InternalRangoMode.g:7437:3: rule__DropTable__EnemyTypeAssignment_0
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
    // InternalRangoMode.g:7445:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7449:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7450:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:7457:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7461:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7462:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7462:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7463:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7464:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7464:3: rule__DropTable__ChanceAssignment_1
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
    // InternalRangoMode.g:7472:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7476:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7477:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
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
    // InternalRangoMode.g:7484:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7488:1: ( ( '%' ) )
            // InternalRangoMode.g:7489:1: ( '%' )
            {
            // InternalRangoMode.g:7489:1: ( '%' )
            // InternalRangoMode.g:7490:2: '%'
            {
             before(grammarAccess.getDropTableAccess().getPercentSignKeyword_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:7499:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7503:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7504:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
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
    // InternalRangoMode.g:7511:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7515:1: ( ( '{' ) )
            // InternalRangoMode.g:7516:1: ( '{' )
            {
            // InternalRangoMode.g:7516:1: ( '{' )
            // InternalRangoMode.g:7517:2: '{'
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
    // InternalRangoMode.g:7526:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7530:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7531:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
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
    // InternalRangoMode.g:7538:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7542:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:7543:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:7543:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:7544:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:7545:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:7545:3: rule__DropTable__EntriesAssignment_4
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
    // InternalRangoMode.g:7553:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7557:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:7558:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
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
    // InternalRangoMode.g:7565:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7569:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:7570:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:7570:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:7571:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:7572:2: ( rule__DropTable__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==29) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRangoMode.g:7572:3: rule__DropTable__Group_5__0
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
    // InternalRangoMode.g:7580:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7584:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:7585:2: rule__DropTable__Group__6__Impl
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
    // InternalRangoMode.g:7591:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7595:1: ( ( '}' ) )
            // InternalRangoMode.g:7596:1: ( '}' )
            {
            // InternalRangoMode.g:7596:1: ( '}' )
            // InternalRangoMode.g:7597:2: '}'
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
    // InternalRangoMode.g:7607:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7611:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:7612:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
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
    // InternalRangoMode.g:7619:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7623:1: ( ( ',' ) )
            // InternalRangoMode.g:7624:1: ( ',' )
            {
            // InternalRangoMode.g:7624:1: ( ',' )
            // InternalRangoMode.g:7625:2: ','
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
    // InternalRangoMode.g:7634:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7638:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:7639:2: rule__DropTable__Group_5__1__Impl
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
    // InternalRangoMode.g:7645:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7649:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:7650:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7650:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:7651:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:7652:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:7652:3: rule__DropTable__EntriesAssignment_5_1
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
    // InternalRangoMode.g:7661:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7665:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:7666:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalRangoMode.g:7673:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7677:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:7678:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:7678:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:7679:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:7680:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:7680:3: rule__Drop__PowerUpAssignment_0
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
    // InternalRangoMode.g:7688:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7692:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:7693:2: rule__Drop__Group__1__Impl
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
    // InternalRangoMode.g:7699:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7703:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:7704:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:7704:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:7705:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:7706:2: ( rule__Drop__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:7706:3: rule__Drop__Group_1__0
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
    // InternalRangoMode.g:7715:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7719:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:7720:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
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
    // InternalRangoMode.g:7727:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7731:1: ( ( 'weight' ) )
            // InternalRangoMode.g:7732:1: ( 'weight' )
            {
            // InternalRangoMode.g:7732:1: ( 'weight' )
            // InternalRangoMode.g:7733:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRangoMode.g:7742:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7746:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:7747:2: rule__Drop__Group_1__1__Impl
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
    // InternalRangoMode.g:7753:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7757:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:7758:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7758:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:7759:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:7760:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:7760:3: rule__Drop__WeightAssignment_1_1
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
    // InternalRangoMode.g:7769:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7773:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:7774:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
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
    // InternalRangoMode.g:7781:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7785:1: ( ( () ) )
            // InternalRangoMode.g:7786:1: ( () )
            {
            // InternalRangoMode.g:7786:1: ( () )
            // InternalRangoMode.g:7787:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:7788:2: ()
            // InternalRangoMode.g:7788:3: 
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
    // InternalRangoMode.g:7796:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7800:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:7801:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
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
    // InternalRangoMode.g:7808:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7812:1: ( ( 'all' ) )
            // InternalRangoMode.g:7813:1: ( 'all' )
            {
            // InternalRangoMode.g:7813:1: ( 'all' )
            // InternalRangoMode.g:7814:2: 'all'
            {
             before(grammarAccess.getClearedAccess().getAllKeyword_1()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRangoMode.g:7823:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7827:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:7828:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
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
    // InternalRangoMode.g:7835:1: rule__Cleared__Group__2__Impl : ( 'enemies' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7839:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:7840:1: ( 'enemies' )
            {
            // InternalRangoMode.g:7840:1: ( 'enemies' )
            // InternalRangoMode.g:7841:2: 'enemies'
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
    // InternalRangoMode.g:7850:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7854:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:7855:2: rule__Cleared__Group__3__Impl
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
    // InternalRangoMode.g:7861:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7865:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:7866:1: ( 'cleared' )
            {
            // InternalRangoMode.g:7866:1: ( 'cleared' )
            // InternalRangoMode.g:7867:2: 'cleared'
            {
             before(grammarAccess.getClearedAccess().getClearedKeyword_3()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRangoMode.g:7877:1: rule__TimeReached__Group__0 : rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 ;
    public final void rule__TimeReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7881:1: ( rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 )
            // InternalRangoMode.g:7882:2: rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1
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
    // InternalRangoMode.g:7889:1: rule__TimeReached__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7893:1: ( ( 'time' ) )
            // InternalRangoMode.g:7894:1: ( 'time' )
            {
            // InternalRangoMode.g:7894:1: ( 'time' )
            // InternalRangoMode.g:7895:2: 'time'
            {
             before(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRangoMode.g:7904:1: rule__TimeReached__Group__1 : rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 ;
    public final void rule__TimeReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7908:1: ( rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 )
            // InternalRangoMode.g:7909:2: rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2
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
    // InternalRangoMode.g:7916:1: rule__TimeReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7920:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:7921:1: ( 'reaches' )
            {
            // InternalRangoMode.g:7921:1: ( 'reaches' )
            // InternalRangoMode.g:7922:2: 'reaches'
            {
             before(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:7931:1: rule__TimeReached__Group__2 : rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 ;
    public final void rule__TimeReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7935:1: ( rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 )
            // InternalRangoMode.g:7936:2: rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3
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
    // InternalRangoMode.g:7943:1: rule__TimeReached__Group__2__Impl : ( ( rule__TimeReached__SecondsAssignment_2 ) ) ;
    public final void rule__TimeReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7947:1: ( ( ( rule__TimeReached__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:7948:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:7948:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            // InternalRangoMode.g:7949:2: ( rule__TimeReached__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:7950:2: ( rule__TimeReached__SecondsAssignment_2 )
            // InternalRangoMode.g:7950:3: rule__TimeReached__SecondsAssignment_2
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
    // InternalRangoMode.g:7958:1: rule__TimeReached__Group__3 : rule__TimeReached__Group__3__Impl ;
    public final void rule__TimeReached__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7962:1: ( rule__TimeReached__Group__3__Impl )
            // InternalRangoMode.g:7963:2: rule__TimeReached__Group__3__Impl
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
    // InternalRangoMode.g:7969:1: rule__TimeReached__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeReached__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7973:1: ( ( 's' ) )
            // InternalRangoMode.g:7974:1: ( 's' )
            {
            // InternalRangoMode.g:7974:1: ( 's' )
            // InternalRangoMode.g:7975:2: 's'
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
    // InternalRangoMode.g:7985:1: rule__ScoreReached__Group__0 : rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 ;
    public final void rule__ScoreReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7989:1: ( rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 )
            // InternalRangoMode.g:7990:2: rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1
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
    // InternalRangoMode.g:7997:1: rule__ScoreReached__Group__0__Impl : ( 'score' ) ;
    public final void rule__ScoreReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8001:1: ( ( 'score' ) )
            // InternalRangoMode.g:8002:1: ( 'score' )
            {
            // InternalRangoMode.g:8002:1: ( 'score' )
            // InternalRangoMode.g:8003:2: 'score'
            {
             before(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRangoMode.g:8012:1: rule__ScoreReached__Group__1 : rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 ;
    public final void rule__ScoreReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8016:1: ( rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 )
            // InternalRangoMode.g:8017:2: rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2
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
    // InternalRangoMode.g:8024:1: rule__ScoreReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__ScoreReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8028:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8029:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8029:1: ( 'reaches' )
            // InternalRangoMode.g:8030:2: 'reaches'
            {
             before(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:8039:1: rule__ScoreReached__Group__2 : rule__ScoreReached__Group__2__Impl ;
    public final void rule__ScoreReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8043:1: ( rule__ScoreReached__Group__2__Impl )
            // InternalRangoMode.g:8044:2: rule__ScoreReached__Group__2__Impl
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
    // InternalRangoMode.g:8050:1: rule__ScoreReached__Group__2__Impl : ( ( rule__ScoreReached__PointsAssignment_2 ) ) ;
    public final void rule__ScoreReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8054:1: ( ( ( rule__ScoreReached__PointsAssignment_2 ) ) )
            // InternalRangoMode.g:8055:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            {
            // InternalRangoMode.g:8055:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            // InternalRangoMode.g:8056:2: ( rule__ScoreReached__PointsAssignment_2 )
            {
             before(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 
            // InternalRangoMode.g:8057:2: ( rule__ScoreReached__PointsAssignment_2 )
            // InternalRangoMode.g:8057:3: rule__ScoreReached__PointsAssignment_2
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
    // InternalRangoMode.g:8066:1: rule__EnemiesPopped__Group__0 : rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 ;
    public final void rule__EnemiesPopped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8070:1: ( rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1 )
            // InternalRangoMode.g:8071:2: rule__EnemiesPopped__Group__0__Impl rule__EnemiesPopped__Group__1
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
    // InternalRangoMode.g:8078:1: rule__EnemiesPopped__Group__0__Impl : ( ( rule__EnemiesPopped__CountAssignment_0 ) ) ;
    public final void rule__EnemiesPopped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8082:1: ( ( ( rule__EnemiesPopped__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8083:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8083:1: ( ( rule__EnemiesPopped__CountAssignment_0 ) )
            // InternalRangoMode.g:8084:2: ( rule__EnemiesPopped__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesPoppedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8085:2: ( rule__EnemiesPopped__CountAssignment_0 )
            // InternalRangoMode.g:8085:3: rule__EnemiesPopped__CountAssignment_0
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
    // InternalRangoMode.g:8093:1: rule__EnemiesPopped__Group__1 : rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 ;
    public final void rule__EnemiesPopped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8097:1: ( rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2 )
            // InternalRangoMode.g:8098:2: rule__EnemiesPopped__Group__1__Impl rule__EnemiesPopped__Group__2
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
    // InternalRangoMode.g:8105:1: rule__EnemiesPopped__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesPopped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8109:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8110:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8110:1: ( 'enemies' )
            // InternalRangoMode.g:8111:2: 'enemies'
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
    // InternalRangoMode.g:8120:1: rule__EnemiesPopped__Group__2 : rule__EnemiesPopped__Group__2__Impl ;
    public final void rule__EnemiesPopped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8124:1: ( rule__EnemiesPopped__Group__2__Impl )
            // InternalRangoMode.g:8125:2: rule__EnemiesPopped__Group__2__Impl
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
    // InternalRangoMode.g:8131:1: rule__EnemiesPopped__Group__2__Impl : ( 'popped' ) ;
    public final void rule__EnemiesPopped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8135:1: ( ( 'popped' ) )
            // InternalRangoMode.g:8136:1: ( 'popped' )
            {
            // InternalRangoMode.g:8136:1: ( 'popped' )
            // InternalRangoMode.g:8137:2: 'popped'
            {
             before(grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:8147:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8151:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8152:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
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
    // InternalRangoMode.g:8159:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8163:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8164:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8164:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8165:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8166:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8166:3: rule__WavesSurvived__CountAssignment_0
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
    // InternalRangoMode.g:8174:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8178:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8179:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
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
    // InternalRangoMode.g:8186:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8190:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8191:1: ( 'waves' )
            {
            // InternalRangoMode.g:8191:1: ( 'waves' )
            // InternalRangoMode.g:8192:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:8201:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8205:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8206:2: rule__WavesSurvived__Group__2__Impl
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
    // InternalRangoMode.g:8212:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8216:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8217:1: ( 'survived' )
            {
            // InternalRangoMode.g:8217:1: ( 'survived' )
            // InternalRangoMode.g:8218:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:8228:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8232:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8233:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
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
    // InternalRangoMode.g:8240:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8244:1: ( ( () ) )
            // InternalRangoMode.g:8245:1: ( () )
            {
            // InternalRangoMode.g:8245:1: ( () )
            // InternalRangoMode.g:8246:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8247:2: ()
            // InternalRangoMode.g:8247:3: 
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
    // InternalRangoMode.g:8255:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8259:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8260:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
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
    // InternalRangoMode.g:8267:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8271:1: ( ( 'health' ) )
            // InternalRangoMode.g:8272:1: ( 'health' )
            {
            // InternalRangoMode.g:8272:1: ( 'health' )
            // InternalRangoMode.g:8273:2: 'health'
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRangoMode.g:8282:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8286:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8287:2: rule__HealthDepleted__Group__2__Impl
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
    // InternalRangoMode.g:8293:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8297:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8298:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8298:1: ( 'depleted' )
            // InternalRangoMode.g:8299:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,92,FOLLOW_2); 
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
    // InternalRangoMode.g:8309:1: rule__EnemiesAlive__Group__0 : rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 ;
    public final void rule__EnemiesAlive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8313:1: ( rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1 )
            // InternalRangoMode.g:8314:2: rule__EnemiesAlive__Group__0__Impl rule__EnemiesAlive__Group__1
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
    // InternalRangoMode.g:8321:1: rule__EnemiesAlive__Group__0__Impl : ( ( rule__EnemiesAlive__CountAssignment_0 ) ) ;
    public final void rule__EnemiesAlive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8325:1: ( ( ( rule__EnemiesAlive__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8326:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8326:1: ( ( rule__EnemiesAlive__CountAssignment_0 ) )
            // InternalRangoMode.g:8327:2: ( rule__EnemiesAlive__CountAssignment_0 )
            {
             before(grammarAccess.getEnemiesAliveAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8328:2: ( rule__EnemiesAlive__CountAssignment_0 )
            // InternalRangoMode.g:8328:3: rule__EnemiesAlive__CountAssignment_0
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
    // InternalRangoMode.g:8336:1: rule__EnemiesAlive__Group__1 : rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 ;
    public final void rule__EnemiesAlive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8340:1: ( rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2 )
            // InternalRangoMode.g:8341:2: rule__EnemiesAlive__Group__1__Impl rule__EnemiesAlive__Group__2
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
    // InternalRangoMode.g:8348:1: rule__EnemiesAlive__Group__1__Impl : ( 'enemies' ) ;
    public final void rule__EnemiesAlive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8352:1: ( ( 'enemies' ) )
            // InternalRangoMode.g:8353:1: ( 'enemies' )
            {
            // InternalRangoMode.g:8353:1: ( 'enemies' )
            // InternalRangoMode.g:8354:2: 'enemies'
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
    // InternalRangoMode.g:8363:1: rule__EnemiesAlive__Group__2 : rule__EnemiesAlive__Group__2__Impl ;
    public final void rule__EnemiesAlive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8367:1: ( rule__EnemiesAlive__Group__2__Impl )
            // InternalRangoMode.g:8368:2: rule__EnemiesAlive__Group__2__Impl
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
    // InternalRangoMode.g:8374:1: rule__EnemiesAlive__Group__2__Impl : ( 'alive' ) ;
    public final void rule__EnemiesAlive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8378:1: ( ( 'alive' ) )
            // InternalRangoMode.g:8379:1: ( 'alive' )
            {
            // InternalRangoMode.g:8379:1: ( 'alive' )
            // InternalRangoMode.g:8380:2: 'alive'
            {
             before(grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2()); 
            match(input,93,FOLLOW_2); 
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
    // InternalRangoMode.g:8390:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8394:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8395:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
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
    // InternalRangoMode.g:8402:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8406:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8407:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8407:1: ( RULE_INT )
            // InternalRangoMode.g:8408:2: RULE_INT
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
    // InternalRangoMode.g:8417:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8421:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8422:2: rule__Decimal__Group__1__Impl
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
    // InternalRangoMode.g:8428:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8432:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8433:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8433:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8434:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8435:2: ( rule__Decimal__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==94) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:8435:3: rule__Decimal__Group_1__0
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
    // InternalRangoMode.g:8444:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8448:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8449:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
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
    // InternalRangoMode.g:8456:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8460:1: ( ( '.' ) )
            // InternalRangoMode.g:8461:1: ( '.' )
            {
            // InternalRangoMode.g:8461:1: ( '.' )
            // InternalRangoMode.g:8462:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,94,FOLLOW_2); 
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
    // InternalRangoMode.g:8471:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8475:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8476:2: rule__Decimal__Group_1__1__Impl
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
    // InternalRangoMode.g:8482:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8486:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8487:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8487:1: ( RULE_INT )
            // InternalRangoMode.g:8488:2: RULE_INT
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
    // InternalRangoMode.g:8498:1: rule__EnemyType__UnorderedGroup_3 : rule__EnemyType__UnorderedGroup_3__0 {...}?;
    public final void rule__EnemyType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8503:1: ( rule__EnemyType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8504:2: rule__EnemyType__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8512:1: rule__EnemyType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__EnemyType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8517:1: ( ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8518:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8518:3: ( ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) ) )
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
                    // InternalRangoMode.g:8519:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8519:3: ({...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8520:4: {...}? => ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8520:105: ( ( ( rule__EnemyType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8521:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8527:5: ( ( rule__EnemyType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8528:6: ( rule__EnemyType__Group_3_0__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8529:6: ( rule__EnemyType__Group_3_0__0 )
                    // InternalRangoMode.g:8529:7: rule__EnemyType__Group_3_0__0
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
                    // InternalRangoMode.g:8534:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8534:3: ({...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8535:4: {...}? => ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8535:105: ( ( ( rule__EnemyType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8536:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8542:5: ( ( rule__EnemyType__Group_3_1__0 ) )
                    // InternalRangoMode.g:8543:6: ( rule__EnemyType__Group_3_1__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8544:6: ( rule__EnemyType__Group_3_1__0 )
                    // InternalRangoMode.g:8544:7: rule__EnemyType__Group_3_1__0
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
                    // InternalRangoMode.g:8549:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8549:3: ({...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8550:4: {...}? => ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8550:105: ( ( ( rule__EnemyType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8551:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8557:5: ( ( rule__EnemyType__Group_3_2__0 ) )
                    // InternalRangoMode.g:8558:6: ( rule__EnemyType__Group_3_2__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8559:6: ( rule__EnemyType__Group_3_2__0 )
                    // InternalRangoMode.g:8559:7: rule__EnemyType__Group_3_2__0
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
                    // InternalRangoMode.g:8564:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8564:3: ({...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8565:4: {...}? => ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8565:105: ( ( ( rule__EnemyType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8566:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8572:5: ( ( rule__EnemyType__Group_3_3__0 ) )
                    // InternalRangoMode.g:8573:6: ( rule__EnemyType__Group_3_3__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8574:6: ( rule__EnemyType__Group_3_3__0 )
                    // InternalRangoMode.g:8574:7: rule__EnemyType__Group_3_3__0
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
                    // InternalRangoMode.g:8579:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8579:3: ({...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8580:4: {...}? => ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnemyType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8580:105: ( ( ( rule__EnemyType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8581:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8587:5: ( ( rule__EnemyType__Group_3_4__0 ) )
                    // InternalRangoMode.g:8588:6: ( rule__EnemyType__Group_3_4__0 )
                    {
                     before(grammarAccess.getEnemyTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8589:6: ( rule__EnemyType__Group_3_4__0 )
                    // InternalRangoMode.g:8589:7: rule__EnemyType__Group_3_4__0
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
    // InternalRangoMode.g:8602:1: rule__EnemyType__UnorderedGroup_3__0 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8606:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8607:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8608:2: ( rule__EnemyType__UnorderedGroup_3__1 )?
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
                    // InternalRangoMode.g:8608:2: rule__EnemyType__UnorderedGroup_3__1
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
    // InternalRangoMode.g:8614:1: rule__EnemyType__UnorderedGroup_3__1 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8618:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8619:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8620:2: ( rule__EnemyType__UnorderedGroup_3__2 )?
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
                    // InternalRangoMode.g:8620:2: rule__EnemyType__UnorderedGroup_3__2
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
    // InternalRangoMode.g:8626:1: rule__EnemyType__UnorderedGroup_3__2 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8630:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:8631:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8632:2: ( rule__EnemyType__UnorderedGroup_3__3 )?
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
                    // InternalRangoMode.g:8632:2: rule__EnemyType__UnorderedGroup_3__3
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
    // InternalRangoMode.g:8638:1: rule__EnemyType__UnorderedGroup_3__3 : rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? ;
    public final void rule__EnemyType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8642:1: ( rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:8643:2: rule__EnemyType__UnorderedGroup_3__Impl ( rule__EnemyType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_83);
            rule__EnemyType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8644:2: ( rule__EnemyType__UnorderedGroup_3__4 )?
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
                    // InternalRangoMode.g:8644:2: rule__EnemyType__UnorderedGroup_3__4
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
    // InternalRangoMode.g:8650:1: rule__EnemyType__UnorderedGroup_3__4 : rule__EnemyType__UnorderedGroup_3__Impl ;
    public final void rule__EnemyType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8654:1: ( rule__EnemyType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8655:2: rule__EnemyType__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:8662:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8667:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8668:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8676:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8681:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:8682:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8682:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt47=6;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt47=2;
            }
            else if ( LA47_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt47=3;
            }
            else if ( LA47_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt47=4;
            }
            else if ( LA47_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt47=5;
            }
            else if ( LA47_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt47=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalRangoMode.g:8683:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8683:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8684:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8684:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8685:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8691:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:8692:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8693:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:8693:7: rule__PlayerProfile__Group_3_0__0
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
                    // InternalRangoMode.g:8698:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8698:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8699:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8699:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8700:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8706:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:8707:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8708:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:8708:7: rule__PlayerProfile__Group_3_1__0
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
                    // InternalRangoMode.g:8713:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8713:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8714:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8714:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8715:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8721:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:8722:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8723:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:8723:7: rule__PlayerProfile__Group_3_2__0
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
                    // InternalRangoMode.g:8728:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8728:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8729:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8729:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8730:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8736:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:8737:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8738:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:8738:7: rule__PlayerProfile__Group_3_3__0
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
                    // InternalRangoMode.g:8743:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8743:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8744:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8744:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8745:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8751:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:8752:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8753:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:8753:7: rule__PlayerProfile__Group_3_4__0
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
                    // InternalRangoMode.g:8758:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8758:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:8759:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:8759:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:8760:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8766:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:8767:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:8768:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:8768:7: rule__PlayerProfile__Group_3_5__0
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
    // InternalRangoMode.g:8781:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8785:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8786:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_84);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8787:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt48=1;
            }
            else if ( LA48_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt48=1;
            }
            else if ( LA48_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt48=1;
            }
            else if ( LA48_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRangoMode.g:8787:2: rule__PlayerProfile__UnorderedGroup_3__1
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
    // InternalRangoMode.g:8793:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8797:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8798:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_84);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8799:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            else if ( LA49_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt49=1;
            }
            else if ( LA49_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt49=1;
            }
            else if ( LA49_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRangoMode.g:8799:2: rule__PlayerProfile__UnorderedGroup_3__2
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
    // InternalRangoMode.g:8805:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8809:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:8810:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_84);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8811:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt50=1;
            }
            else if ( LA50_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt50=1;
            }
            else if ( LA50_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt50=1;
            }
            else if ( LA50_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:8811:2: rule__PlayerProfile__UnorderedGroup_3__3
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
    // InternalRangoMode.g:8817:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8821:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:8822:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_84);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8823:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            else if ( LA51_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt51=1;
            }
            else if ( LA51_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt51=1;
            }
            else if ( LA51_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRangoMode.g:8823:2: rule__PlayerProfile__UnorderedGroup_3__4
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
    // InternalRangoMode.g:8829:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8833:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:8834:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_84);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8835:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            else if ( LA52_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt52=1;
            }
            else if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt52=1;
            }
            else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRangoMode.g:8835:2: rule__PlayerProfile__UnorderedGroup_3__5
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
    // InternalRangoMode.g:8841:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8845:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8846:2: rule__PlayerProfile__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:8853:1: rule__GameMode__UnorderedGroup_7 : ( rule__GameMode__UnorderedGroup_7__0 )? ;
    public final void rule__GameMode__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
        	
        try {
            // InternalRangoMode.g:8858:1: ( ( rule__GameMode__UnorderedGroup_7__0 )? )
            // InternalRangoMode.g:8859:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            {
            // InternalRangoMode.g:8859:2: ( rule__GameMode__UnorderedGroup_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRangoMode.g:8859:2: rule__GameMode__UnorderedGroup_7__0
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
    // InternalRangoMode.g:8867:1: rule__GameMode__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8872:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) ) )
            // InternalRangoMode.g:8873:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            {
            // InternalRangoMode.g:8873:3: ( ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
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
                    // InternalRangoMode.g:8874:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8874:3: ({...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) ) )
                    // InternalRangoMode.g:8875:4: {...}? => ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalRangoMode.g:8875:104: ( ( ( rule__GameMode__Group_7_0__0 ) ) )
                    // InternalRangoMode.g:8876:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8882:5: ( ( rule__GameMode__Group_7_0__0 ) )
                    // InternalRangoMode.g:8883:6: ( rule__GameMode__Group_7_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_7_0()); 
                    // InternalRangoMode.g:8884:6: ( rule__GameMode__Group_7_0__0 )
                    // InternalRangoMode.g:8884:7: rule__GameMode__Group_7_0__0
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
                    // InternalRangoMode.g:8889:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    {
                    // InternalRangoMode.g:8889:3: ({...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) ) )
                    // InternalRangoMode.g:8890:4: {...}? => ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalRangoMode.g:8890:104: ( ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) ) )
                    // InternalRangoMode.g:8891:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8897:5: ( ( rule__GameMode__SpeedBonusAssignment_7_1 ) )
                    // InternalRangoMode.g:8898:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    {
                     before(grammarAccess.getGameModeAccess().getSpeedBonusAssignment_7_1()); 
                    // InternalRangoMode.g:8899:6: ( rule__GameMode__SpeedBonusAssignment_7_1 )
                    // InternalRangoMode.g:8899:7: rule__GameMode__SpeedBonusAssignment_7_1
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
    // InternalRangoMode.g:8912:1: rule__GameMode__UnorderedGroup_7__0 : rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? ;
    public final void rule__GameMode__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8916:1: ( rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )? )
            // InternalRangoMode.g:8917:2: rule__GameMode__UnorderedGroup_7__Impl ( rule__GameMode__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_85);
            rule__GameMode__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalRangoMode.g:8918:2: ( rule__GameMode__UnorderedGroup_7__1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRangoMode.g:8918:2: rule__GameMode__UnorderedGroup_7__1
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
    // InternalRangoMode.g:8924:1: rule__GameMode__UnorderedGroup_7__1 : rule__GameMode__UnorderedGroup_7__Impl ;
    public final void rule__GameMode__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8928:1: ( rule__GameMode__UnorderedGroup_7__Impl )
            // InternalRangoMode.g:8929:2: rule__GameMode__UnorderedGroup_7__Impl
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
    // InternalRangoMode.g:8936:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8940:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:8941:2: ( RULE_ID )
            {
            // InternalRangoMode.g:8941:2: ( RULE_ID )
            // InternalRangoMode.g:8942:3: RULE_ID
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
    // InternalRangoMode.g:8951:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8955:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:8956:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:8956:2: ( RULE_STRING )
            // InternalRangoMode.g:8957:3: RULE_STRING
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
    // InternalRangoMode.g:8966:1: rule__Edition__EnemyTypesAssignment_3_0 : ( ruleEnemyType ) ;
    public final void rule__Edition__EnemyTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8970:1: ( ( ruleEnemyType ) )
            // InternalRangoMode.g:8971:2: ( ruleEnemyType )
            {
            // InternalRangoMode.g:8971:2: ( ruleEnemyType )
            // InternalRangoMode.g:8972:3: ruleEnemyType
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
    // InternalRangoMode.g:8981:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8985:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:8986:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:8986:2: ( rulePowerUp )
            // InternalRangoMode.g:8987:3: rulePowerUp
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
    // InternalRangoMode.g:8996:1: rule__Edition__PlayersAssignment_3_2 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9000:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9001:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9001:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9002:3: rulePlayerProfile
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


    // $ANTLR start "rule__Edition__ModesAssignment_3_4"
    // InternalRangoMode.g:9011:1: rule__Edition__ModesAssignment_3_4 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9015:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9016:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9016:2: ( ruleGameMode )
            // InternalRangoMode.g:9017:3: ruleGameMode
            {
             before(grammarAccess.getEditionAccess().getModesGameModeParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGameMode();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getModesGameModeParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__ModesAssignment_3_4"


    // $ANTLR start "rule__EnemyType__NameAssignment_1"
    // InternalRangoMode.g:9026:1: rule__EnemyType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnemyType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9030:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9031:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9031:2: ( RULE_ID )
            // InternalRangoMode.g:9032:3: RULE_ID
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
    // InternalRangoMode.g:9041:1: rule__EnemyType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__EnemyType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9045:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9046:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9046:2: ( RULE_STRING )
            // InternalRangoMode.g:9047:3: RULE_STRING
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
    // InternalRangoMode.g:9056:1: rule__EnemyType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9060:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9061:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9061:2: ( ruleDecimal )
            // InternalRangoMode.g:9062:3: ruleDecimal
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
    // InternalRangoMode.g:9071:1: rule__EnemyType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9075:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9076:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9076:2: ( ruleDecimal )
            // InternalRangoMode.g:9077:3: ruleDecimal
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
    // InternalRangoMode.g:9086:1: rule__EnemyType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__EnemyType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9090:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9091:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9091:2: ( ruleDecimal )
            // InternalRangoMode.g:9092:3: ruleDecimal
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
    // InternalRangoMode.g:9101:1: rule__EnemyType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__EnemyType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9105:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9106:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9106:2: ( RULE_INT )
            // InternalRangoMode.g:9107:3: RULE_INT
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
    // InternalRangoMode.g:9116:1: rule__EnemyType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__EnemyType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9120:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9121:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9121:2: ( ruleSplitRule )
            // InternalRangoMode.g:9122:3: ruleSplitRule
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
    // InternalRangoMode.g:9131:1: rule__EnemyType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9135:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9136:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9136:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9137:3: rulePlayerEffect
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
    // InternalRangoMode.g:9146:1: rule__EnemyType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__EnemyType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9150:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9151:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9151:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9152:3: rulePlayerEffect
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
    // InternalRangoMode.g:9161:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9165:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9166:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9166:2: ( RULE_INT )
            // InternalRangoMode.g:9167:3: RULE_INT
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
    // InternalRangoMode.g:9176:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9180:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9181:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9181:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9182:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9183:3: ( RULE_ID )
            // InternalRangoMode.g:9184:4: RULE_ID
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
    // InternalRangoMode.g:9195:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9199:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9200:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9200:2: ( ruleDecimal )
            // InternalRangoMode.g:9201:3: ruleDecimal
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
    // InternalRangoMode.g:9210:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9214:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9215:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9215:2: ( RULE_INT )
            // InternalRangoMode.g:9216:3: RULE_INT
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
    // InternalRangoMode.g:9225:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9229:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9230:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9230:2: ( RULE_INT )
            // InternalRangoMode.g:9231:3: RULE_INT
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
    // InternalRangoMode.g:9240:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9244:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9245:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9245:2: ( ruleDecimal )
            // InternalRangoMode.g:9246:3: ruleDecimal
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
    // InternalRangoMode.g:9255:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9259:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9260:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9260:2: ( ruleDecimal )
            // InternalRangoMode.g:9261:3: ruleDecimal
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
    // InternalRangoMode.g:9270:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9274:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9275:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9275:2: ( ruleDecimal )
            // InternalRangoMode.g:9276:3: ruleDecimal
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
    // InternalRangoMode.g:9285:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9289:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9290:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9290:2: ( RULE_INT )
            // InternalRangoMode.g:9291:3: RULE_INT
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
    // InternalRangoMode.g:9300:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9304:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9305:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9305:2: ( ruleDecimal )
            // InternalRangoMode.g:9306:3: ruleDecimal
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
    // InternalRangoMode.g:9315:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9319:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9320:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9320:2: ( ruleDecimal )
            // InternalRangoMode.g:9321:3: ruleDecimal
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
    // InternalRangoMode.g:9330:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9334:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9335:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9335:2: ( RULE_ID )
            // InternalRangoMode.g:9336:3: RULE_ID
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
    // InternalRangoMode.g:9345:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9349:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9350:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9350:2: ( RULE_STRING )
            // InternalRangoMode.g:9351:3: RULE_STRING
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
    // InternalRangoMode.g:9360:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9364:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9365:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9365:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9366:3: rulePlayerEffect
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
    // InternalRangoMode.g:9375:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9379:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9380:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9380:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9381:3: rulePlayerEffect
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
    // InternalRangoMode.g:9390:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9394:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9395:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9395:2: ( RULE_ID )
            // InternalRangoMode.g:9396:3: RULE_ID
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
    // InternalRangoMode.g:9405:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9409:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9410:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9410:2: ( RULE_STRING )
            // InternalRangoMode.g:9411:3: RULE_STRING
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
    // InternalRangoMode.g:9420:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9424:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9425:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9425:2: ( RULE_INT )
            // InternalRangoMode.g:9426:3: RULE_INT
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
    // InternalRangoMode.g:9435:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9439:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9440:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9440:2: ( RULE_INT )
            // InternalRangoMode.g:9441:3: RULE_INT
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
    // InternalRangoMode.g:9450:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9454:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9455:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9455:2: ( ruleDecimal )
            // InternalRangoMode.g:9456:3: ruleDecimal
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
    // InternalRangoMode.g:9465:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9469:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9470:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9470:2: ( ruleDecimal )
            // InternalRangoMode.g:9471:3: ruleDecimal
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
    // InternalRangoMode.g:9480:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9484:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9485:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9485:2: ( ruleDecimal )
            // InternalRangoMode.g:9486:3: ruleDecimal
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
    // InternalRangoMode.g:9495:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9499:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9500:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9500:2: ( ruleDecimal )
            // InternalRangoMode.g:9501:3: ruleDecimal
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
    // InternalRangoMode.g:9510:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9514:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9515:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9515:2: ( RULE_ID )
            // InternalRangoMode.g:9516:3: RULE_ID
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
    // InternalRangoMode.g:9525:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9529:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9530:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9530:2: ( RULE_STRING )
            // InternalRangoMode.g:9531:3: RULE_STRING
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
    // InternalRangoMode.g:9540:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9544:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9545:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9545:2: ( RULE_STRING )
            // InternalRangoMode.g:9546:3: RULE_STRING
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
    // InternalRangoMode.g:9555:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9559:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9560:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9560:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9561:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:9562:3: ( RULE_ID )
            // InternalRangoMode.g:9563:4: RULE_ID
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
    // InternalRangoMode.g:9574:1: rule__GameMode__GravityAssignment_7_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9578:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9579:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9579:2: ( ruleDecimal )
            // InternalRangoMode.g:9580:3: ruleDecimal
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
    // InternalRangoMode.g:9589:1: rule__GameMode__SpeedBonusAssignment_7_1 : ( ruleSpeedBonus ) ;
    public final void rule__GameMode__SpeedBonusAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9593:1: ( ( ruleSpeedBonus ) )
            // InternalRangoMode.g:9594:2: ( ruleSpeedBonus )
            {
            // InternalRangoMode.g:9594:2: ( ruleSpeedBonus )
            // InternalRangoMode.g:9595:3: ruleSpeedBonus
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
    // InternalRangoMode.g:9604:1: rule__GameMode__LevelsAssignment_8_0 : ( ruleSingleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9608:1: ( ( ruleSingleLevel ) )
            // InternalRangoMode.g:9609:2: ( ruleSingleLevel )
            {
            // InternalRangoMode.g:9609:2: ( ruleSingleLevel )
            // InternalRangoMode.g:9610:3: ruleSingleLevel
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
    // InternalRangoMode.g:9619:1: rule__GameMode__LevelsAssignment_8_1 : ( ruleLevel ) ;
    public final void rule__GameMode__LevelsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9623:1: ( ( ruleLevel ) )
            // InternalRangoMode.g:9624:2: ( ruleLevel )
            {
            // InternalRangoMode.g:9624:2: ( ruleLevel )
            // InternalRangoMode.g:9625:3: ruleLevel
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
    // InternalRangoMode.g:9634:1: rule__GameMode__WinConditionsAssignment_10_2 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9638:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:9639:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:9639:2: ( ruleEndCondition )
            // InternalRangoMode.g:9640:3: ruleEndCondition
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
    // InternalRangoMode.g:9649:1: rule__GameMode__WinConditionsAssignment_10_3_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9653:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:9654:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:9654:2: ( ruleEndCondition )
            // InternalRangoMode.g:9655:3: ruleEndCondition
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
    // InternalRangoMode.g:9664:1: rule__GameMode__LoseConditionsAssignment_13 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9668:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:9669:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:9669:2: ( ruleEndCondition )
            // InternalRangoMode.g:9670:3: ruleEndCondition
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
    // InternalRangoMode.g:9679:1: rule__GameMode__LoseConditionsAssignment_14_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9683:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:9684:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:9684:2: ( ruleEndCondition )
            // InternalRangoMode.g:9685:3: ruleEndCondition
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
    // InternalRangoMode.g:9694:1: rule__SingleLevel__ArenaAssignment_0 : ( ruleArena ) ;
    public final void rule__SingleLevel__ArenaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9698:1: ( ( ruleArena ) )
            // InternalRangoMode.g:9699:2: ( ruleArena )
            {
            // InternalRangoMode.g:9699:2: ( ruleArena )
            // InternalRangoMode.g:9700:3: ruleArena
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
    // InternalRangoMode.g:9709:1: rule__SingleLevel__SpawningAssignment_1 : ( ruleSpawnStrategy ) ;
    public final void rule__SingleLevel__SpawningAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9713:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:9714:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:9714:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:9715:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:9724:1: rule__Level__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Level__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9728:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9729:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9729:2: ( RULE_STRING )
            // InternalRangoMode.g:9730:3: RULE_STRING
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
    // InternalRangoMode.g:9739:1: rule__Level__ArenaAssignment_3 : ( ruleArena ) ;
    public final void rule__Level__ArenaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9743:1: ( ( ruleArena ) )
            // InternalRangoMode.g:9744:2: ( ruleArena )
            {
            // InternalRangoMode.g:9744:2: ( ruleArena )
            // InternalRangoMode.g:9745:3: ruleArena
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
    // InternalRangoMode.g:9754:1: rule__Level__SpawningAssignment_4 : ( ruleSpawnStrategy ) ;
    public final void rule__Level__SpawningAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9758:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:9759:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:9759:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:9760:3: ruleSpawnStrategy
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
    // InternalRangoMode.g:9769:1: rule__SpeedBonus__MaxFactorAssignment_3_2 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__MaxFactorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9773:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9774:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9774:2: ( ruleDecimal )
            // InternalRangoMode.g:9775:3: ruleDecimal
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
    // InternalRangoMode.g:9784:1: rule__SpeedBonus__DurationAssignment_4_1 : ( ruleDecimal ) ;
    public final void rule__SpeedBonus__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9788:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9789:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9789:2: ( ruleDecimal )
            // InternalRangoMode.g:9790:3: ruleDecimal
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
    // InternalRangoMode.g:9799:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9803:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9804:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9804:2: ( RULE_STRING )
            // InternalRangoMode.g:9805:3: RULE_STRING
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
    // InternalRangoMode.g:9814:1: rule__Arena__PlayerStartAssignment_4_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9818:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9819:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9819:2: ( ruleDecimal )
            // InternalRangoMode.g:9820:3: ruleDecimal
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
    // InternalRangoMode.g:9829:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9833:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:9834:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:9834:2: ( ruleObstacle )
            // InternalRangoMode.g:9835:3: ruleObstacle
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
    // InternalRangoMode.g:9844:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9848:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9849:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9849:2: ( ruleDecimal )
            // InternalRangoMode.g:9850:3: ruleDecimal
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
    // InternalRangoMode.g:9859:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9863:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9864:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9864:2: ( ruleDecimal )
            // InternalRangoMode.g:9865:3: ruleDecimal
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
    // InternalRangoMode.g:9874:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9878:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9879:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9879:2: ( RULE_ID )
            // InternalRangoMode.g:9880:3: RULE_ID
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
    // InternalRangoMode.g:9889:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9893:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9894:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9894:2: ( RULE_INT )
            // InternalRangoMode.g:9895:3: RULE_INT
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
    // InternalRangoMode.g:9904:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9908:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9909:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9909:2: ( RULE_INT )
            // InternalRangoMode.g:9910:3: RULE_INT
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
    // InternalRangoMode.g:9919:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9923:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9924:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9924:2: ( RULE_ID )
            // InternalRangoMode.g:9925:3: RULE_ID
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
    // InternalRangoMode.g:9934:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9938:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9939:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9939:2: ( ruleDecimal )
            // InternalRangoMode.g:9940:3: ruleDecimal
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
    // InternalRangoMode.g:9949:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9953:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:9954:2: ( ruleTarget )
            {
            // InternalRangoMode.g:9954:2: ( ruleTarget )
            // InternalRangoMode.g:9955:3: ruleTarget
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
    // InternalRangoMode.g:9964:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9968:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9969:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9969:2: ( RULE_ID )
            // InternalRangoMode.g:9970:3: RULE_ID
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
    // InternalRangoMode.g:9979:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9983:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9984:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9984:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9985:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:9986:3: ( RULE_ID )
            // InternalRangoMode.g:9987:4: RULE_ID
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
    // InternalRangoMode.g:9998:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10002:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10003:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10003:2: ( ruleTarget )
            // InternalRangoMode.g:10004:3: ruleTarget
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
    // InternalRangoMode.g:10013:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleEnemySpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10017:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10018:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10018:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10019:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10028:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10032:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10033:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10033:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10034:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10035:3: ( 'looping' )
            // InternalRangoMode.g:10036:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,95,FOLLOW_2); 
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
    // InternalRangoMode.g:10047:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10051:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10052:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10052:2: ( RULE_INT )
            // InternalRangoMode.g:10053:3: RULE_INT
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
    // InternalRangoMode.g:10062:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10066:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10067:2: ( ruleWave )
            {
            // InternalRangoMode.g:10067:2: ( ruleWave )
            // InternalRangoMode.g:10068:3: ruleWave
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
    // InternalRangoMode.g:10077:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10081:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10082:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10082:2: ( ruleDecimal )
            // InternalRangoMode.g:10083:3: ruleDecimal
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
    // InternalRangoMode.g:10092:1: rule__Wave__SpawnsAssignment_3 : ( ruleEnemySpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10096:1: ( ( ruleEnemySpawn ) )
            // InternalRangoMode.g:10097:2: ( ruleEnemySpawn )
            {
            // InternalRangoMode.g:10097:2: ( ruleEnemySpawn )
            // InternalRangoMode.g:10098:3: ruleEnemySpawn
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
    // InternalRangoMode.g:10107:1: rule__EnemySpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10111:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10112:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10112:2: ( RULE_INT )
            // InternalRangoMode.g:10113:3: RULE_INT
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
    // InternalRangoMode.g:10122:1: rule__EnemySpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnemySpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10126:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10127:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10127:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10128:3: ( RULE_ID )
            {
             before(grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10129:3: ( RULE_ID )
            // InternalRangoMode.g:10130:4: RULE_ID
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
    // InternalRangoMode.g:10141:1: rule__EnemySpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__EnemySpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10145:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10146:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10146:2: ( RULE_INT )
            // InternalRangoMode.g:10147:3: RULE_INT
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
    // InternalRangoMode.g:10156:1: rule__EnemySpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__EnemySpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10160:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10161:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10161:2: ( ruleDirection )
            // InternalRangoMode.g:10162:3: ruleDirection
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
    // InternalRangoMode.g:10171:1: rule__Drops__DropsAssignment_2 : ( ruleDropTable ) ;
    public final void rule__Drops__DropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10175:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10176:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10176:2: ( ruleDropTable )
            // InternalRangoMode.g:10177:3: ruleDropTable
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
    // InternalRangoMode.g:10186:1: rule__DropTable__EnemyTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DropTable__EnemyTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10190:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10191:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10191:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10192:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0()); 
            // InternalRangoMode.g:10193:3: ( RULE_ID )
            // InternalRangoMode.g:10194:4: RULE_ID
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
    // InternalRangoMode.g:10205:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10209:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10210:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10210:2: ( ruleDecimal )
            // InternalRangoMode.g:10211:3: ruleDecimal
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
    // InternalRangoMode.g:10220:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10224:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10225:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10225:2: ( ruleDrop )
            // InternalRangoMode.g:10226:3: ruleDrop
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
    // InternalRangoMode.g:10235:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10239:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10240:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10240:2: ( ruleDrop )
            // InternalRangoMode.g:10241:3: ruleDrop
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
    // InternalRangoMode.g:10250:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10254:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10255:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10255:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10256:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:10257:3: ( RULE_ID )
            // InternalRangoMode.g:10258:4: RULE_ID
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
    // InternalRangoMode.g:10269:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10273:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10274:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10274:2: ( RULE_INT )
            // InternalRangoMode.g:10275:3: RULE_INT
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
    // InternalRangoMode.g:10284:1: rule__TimeReached__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeReached__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10288:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10289:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10289:2: ( ruleDecimal )
            // InternalRangoMode.g:10290:3: ruleDecimal
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
    // InternalRangoMode.g:10299:1: rule__ScoreReached__PointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ScoreReached__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10303:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10304:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10304:2: ( RULE_INT )
            // InternalRangoMode.g:10305:3: RULE_INT
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
    // InternalRangoMode.g:10314:1: rule__EnemiesPopped__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesPopped__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10318:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10319:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10319:2: ( RULE_INT )
            // InternalRangoMode.g:10320:3: RULE_INT
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
    // InternalRangoMode.g:10329:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10333:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10334:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10334:2: ( RULE_INT )
            // InternalRangoMode.g:10335:3: RULE_INT
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
    // InternalRangoMode.g:10344:1: rule__EnemiesAlive__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__EnemiesAlive__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10348:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10349:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10349:2: ( RULE_INT )
            // InternalRangoMode.g:10350:3: RULE_INT
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
    static final String dfa_2s = "\1\4\3\uffff\1\14\2\uffff\1\132\2\uffff";
    static final String dfa_3s = "\1\131\3\uffff\1\116\2\uffff\1\135\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\1\uffff\1\4\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\51\uffff\1\5\46\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\101\uffff\1\6",
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
            return "1243:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleEnemiesPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleEnemiesAlive ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008080000022040L,0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0008080000022002L,0x0000000000080000L});
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0007600008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0110000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000010L,0x0000000002A00000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000802000L,0x0000000000001240L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001240L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000040000L,0x0000000080000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000040000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0007600008000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0080000008000002L});

}
