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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'points'", "'speed-bonus'", "'everything'", "'balls'", "'player'", "'left'", "'right'", "'edition'", "'ball'", "'{'", "'on'", "'pop'", "':'", "'contact'", "'}'", "'sprite'", "'scale'", "'bounce'", "'speed'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'burst'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'material'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'lose'", "'when'", "'description'", "'gravity'", "'scoring'", "'win'", "'or'", "'arena'", "'background'", "'floor'", "'walls'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'of'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'to'", "'layout'", "'waves'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'looping'"
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


    // $ANTLR start "entryRuleBallType"
    // InternalRangoMode.g:78:1: entryRuleBallType : ruleBallType EOF ;
    public final void entryRuleBallType() throws RecognitionException {
        try {
            // InternalRangoMode.g:79:1: ( ruleBallType EOF )
            // InternalRangoMode.g:80:1: ruleBallType EOF
            {
             before(grammarAccess.getBallTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBallType();

            state._fsp--;

             after(grammarAccess.getBallTypeRule()); 
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
    // $ANTLR end "entryRuleBallType"


    // $ANTLR start "ruleBallType"
    // InternalRangoMode.g:87:1: ruleBallType : ( ( rule__BallType__Group__0 ) ) ;
    public final void ruleBallType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:91:2: ( ( ( rule__BallType__Group__0 ) ) )
            // InternalRangoMode.g:92:2: ( ( rule__BallType__Group__0 ) )
            {
            // InternalRangoMode.g:92:2: ( ( rule__BallType__Group__0 ) )
            // InternalRangoMode.g:93:3: ( rule__BallType__Group__0 )
            {
             before(grammarAccess.getBallTypeAccess().getGroup()); 
            // InternalRangoMode.g:94:3: ( rule__BallType__Group__0 )
            // InternalRangoMode.g:94:4: rule__BallType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBallType"


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


    // $ANTLR start "entryRuleBurst"
    // InternalRangoMode.g:178:1: entryRuleBurst : ruleBurst EOF ;
    public final void entryRuleBurst() throws RecognitionException {
        try {
            // InternalRangoMode.g:179:1: ( ruleBurst EOF )
            // InternalRangoMode.g:180:1: ruleBurst EOF
            {
             before(grammarAccess.getBurstRule()); 
            pushFollow(FOLLOW_1);
            ruleBurst();

            state._fsp--;

             after(grammarAccess.getBurstRule()); 
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
    // $ANTLR end "entryRuleBurst"


    // $ANTLR start "ruleBurst"
    // InternalRangoMode.g:187:1: ruleBurst : ( ( rule__Burst__Group__0 ) ) ;
    public final void ruleBurst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:191:2: ( ( ( rule__Burst__Group__0 ) ) )
            // InternalRangoMode.g:192:2: ( ( rule__Burst__Group__0 ) )
            {
            // InternalRangoMode.g:192:2: ( ( rule__Burst__Group__0 ) )
            // InternalRangoMode.g:193:3: ( rule__Burst__Group__0 )
            {
             before(grammarAccess.getBurstAccess().getGroup()); 
            // InternalRangoMode.g:194:3: ( rule__Burst__Group__0 )
            // InternalRangoMode.g:194:4: rule__Burst__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Burst__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBurstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBurst"


    // $ANTLR start "entryRulePlayerEffect"
    // InternalRangoMode.g:203:1: entryRulePlayerEffect : rulePlayerEffect EOF ;
    public final void entryRulePlayerEffect() throws RecognitionException {
        try {
            // InternalRangoMode.g:204:1: ( rulePlayerEffect EOF )
            // InternalRangoMode.g:205:1: rulePlayerEffect EOF
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
    // InternalRangoMode.g:212:1: rulePlayerEffect : ( ( rule__PlayerEffect__Alternatives ) ) ;
    public final void rulePlayerEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:216:2: ( ( ( rule__PlayerEffect__Alternatives ) ) )
            // InternalRangoMode.g:217:2: ( ( rule__PlayerEffect__Alternatives ) )
            {
            // InternalRangoMode.g:217:2: ( ( rule__PlayerEffect__Alternatives ) )
            // InternalRangoMode.g:218:3: ( rule__PlayerEffect__Alternatives )
            {
             before(grammarAccess.getPlayerEffectAccess().getAlternatives()); 
            // InternalRangoMode.g:219:3: ( rule__PlayerEffect__Alternatives )
            // InternalRangoMode.g:219:4: rule__PlayerEffect__Alternatives
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
    // InternalRangoMode.g:228:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalRangoMode.g:229:1: ( ruleDamage EOF )
            // InternalRangoMode.g:230:1: ruleDamage EOF
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
    // InternalRangoMode.g:237:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:241:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalRangoMode.g:242:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalRangoMode.g:242:2: ( ( rule__Damage__Group__0 ) )
            // InternalRangoMode.g:243:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalRangoMode.g:244:3: ( rule__Damage__Group__0 )
            // InternalRangoMode.g:244:4: rule__Damage__Group__0
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
    // InternalRangoMode.g:253:1: entryRuleHeal : ruleHeal EOF ;
    public final void entryRuleHeal() throws RecognitionException {
        try {
            // InternalRangoMode.g:254:1: ( ruleHeal EOF )
            // InternalRangoMode.g:255:1: ruleHeal EOF
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
    // InternalRangoMode.g:262:1: ruleHeal : ( ( rule__Heal__Group__0 ) ) ;
    public final void ruleHeal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:266:2: ( ( ( rule__Heal__Group__0 ) ) )
            // InternalRangoMode.g:267:2: ( ( rule__Heal__Group__0 ) )
            {
            // InternalRangoMode.g:267:2: ( ( rule__Heal__Group__0 ) )
            // InternalRangoMode.g:268:3: ( rule__Heal__Group__0 )
            {
             before(grammarAccess.getHealAccess().getGroup()); 
            // InternalRangoMode.g:269:3: ( rule__Heal__Group__0 )
            // InternalRangoMode.g:269:4: rule__Heal__Group__0
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
    // InternalRangoMode.g:278:1: entryRuleShield : ruleShield EOF ;
    public final void entryRuleShield() throws RecognitionException {
        try {
            // InternalRangoMode.g:279:1: ( ruleShield EOF )
            // InternalRangoMode.g:280:1: ruleShield EOF
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
    // InternalRangoMode.g:287:1: ruleShield : ( ( rule__Shield__Group__0 ) ) ;
    public final void ruleShield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:291:2: ( ( ( rule__Shield__Group__0 ) ) )
            // InternalRangoMode.g:292:2: ( ( rule__Shield__Group__0 ) )
            {
            // InternalRangoMode.g:292:2: ( ( rule__Shield__Group__0 ) )
            // InternalRangoMode.g:293:3: ( rule__Shield__Group__0 )
            {
             before(grammarAccess.getShieldAccess().getGroup()); 
            // InternalRangoMode.g:294:3: ( rule__Shield__Group__0 )
            // InternalRangoMode.g:294:4: rule__Shield__Group__0
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
    // InternalRangoMode.g:303:1: entryRuleSpeedChange : ruleSpeedChange EOF ;
    public final void entryRuleSpeedChange() throws RecognitionException {
        try {
            // InternalRangoMode.g:304:1: ( ruleSpeedChange EOF )
            // InternalRangoMode.g:305:1: ruleSpeedChange EOF
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
    // InternalRangoMode.g:312:1: ruleSpeedChange : ( ( rule__SpeedChange__Group__0 ) ) ;
    public final void ruleSpeedChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:316:2: ( ( ( rule__SpeedChange__Group__0 ) ) )
            // InternalRangoMode.g:317:2: ( ( rule__SpeedChange__Group__0 ) )
            {
            // InternalRangoMode.g:317:2: ( ( rule__SpeedChange__Group__0 ) )
            // InternalRangoMode.g:318:3: ( rule__SpeedChange__Group__0 )
            {
             before(grammarAccess.getSpeedChangeAccess().getGroup()); 
            // InternalRangoMode.g:319:3: ( rule__SpeedChange__Group__0 )
            // InternalRangoMode.g:319:4: rule__SpeedChange__Group__0
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
    // InternalRangoMode.g:328:1: entryRulePoison : rulePoison EOF ;
    public final void entryRulePoison() throws RecognitionException {
        try {
            // InternalRangoMode.g:329:1: ( rulePoison EOF )
            // InternalRangoMode.g:330:1: rulePoison EOF
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
    // InternalRangoMode.g:337:1: rulePoison : ( ( rule__Poison__Group__0 ) ) ;
    public final void rulePoison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:341:2: ( ( ( rule__Poison__Group__0 ) ) )
            // InternalRangoMode.g:342:2: ( ( rule__Poison__Group__0 ) )
            {
            // InternalRangoMode.g:342:2: ( ( rule__Poison__Group__0 ) )
            // InternalRangoMode.g:343:3: ( rule__Poison__Group__0 )
            {
             before(grammarAccess.getPoisonAccess().getGroup()); 
            // InternalRangoMode.g:344:3: ( rule__Poison__Group__0 )
            // InternalRangoMode.g:344:4: rule__Poison__Group__0
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
    // InternalRangoMode.g:353:1: entryRulePowerUp : rulePowerUp EOF ;
    public final void entryRulePowerUp() throws RecognitionException {
        try {
            // InternalRangoMode.g:354:1: ( rulePowerUp EOF )
            // InternalRangoMode.g:355:1: rulePowerUp EOF
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
    // InternalRangoMode.g:362:1: rulePowerUp : ( ( rule__PowerUp__Group__0 ) ) ;
    public final void rulePowerUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:366:2: ( ( ( rule__PowerUp__Group__0 ) ) )
            // InternalRangoMode.g:367:2: ( ( rule__PowerUp__Group__0 ) )
            {
            // InternalRangoMode.g:367:2: ( ( rule__PowerUp__Group__0 ) )
            // InternalRangoMode.g:368:3: ( rule__PowerUp__Group__0 )
            {
             before(grammarAccess.getPowerUpAccess().getGroup()); 
            // InternalRangoMode.g:369:3: ( rule__PowerUp__Group__0 )
            // InternalRangoMode.g:369:4: rule__PowerUp__Group__0
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
    // InternalRangoMode.g:378:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalRangoMode.g:379:1: ( ruleMaterial EOF )
            // InternalRangoMode.g:380:1: ruleMaterial EOF
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
    // InternalRangoMode.g:387:1: ruleMaterial : ( ( rule__Material__Group__0 ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:391:2: ( ( ( rule__Material__Group__0 ) ) )
            // InternalRangoMode.g:392:2: ( ( rule__Material__Group__0 ) )
            {
            // InternalRangoMode.g:392:2: ( ( rule__Material__Group__0 ) )
            // InternalRangoMode.g:393:3: ( rule__Material__Group__0 )
            {
             before(grammarAccess.getMaterialAccess().getGroup()); 
            // InternalRangoMode.g:394:3: ( rule__Material__Group__0 )
            // InternalRangoMode.g:394:4: rule__Material__Group__0
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


    // $ANTLR start "entryRuleBallSpawn"
    // InternalRangoMode.g:695:1: entryRuleBallSpawn : ruleBallSpawn EOF ;
    public final void entryRuleBallSpawn() throws RecognitionException {
        try {
            // InternalRangoMode.g:696:1: ( ruleBallSpawn EOF )
            // InternalRangoMode.g:697:1: ruleBallSpawn EOF
            {
             before(grammarAccess.getBallSpawnRule()); 
            pushFollow(FOLLOW_1);
            ruleBallSpawn();

            state._fsp--;

             after(grammarAccess.getBallSpawnRule()); 
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
    // $ANTLR end "entryRuleBallSpawn"


    // $ANTLR start "ruleBallSpawn"
    // InternalRangoMode.g:704:1: ruleBallSpawn : ( ( rule__BallSpawn__Group__0 ) ) ;
    public final void ruleBallSpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:708:2: ( ( ( rule__BallSpawn__Group__0 ) ) )
            // InternalRangoMode.g:709:2: ( ( rule__BallSpawn__Group__0 ) )
            {
            // InternalRangoMode.g:709:2: ( ( rule__BallSpawn__Group__0 ) )
            // InternalRangoMode.g:710:3: ( rule__BallSpawn__Group__0 )
            {
             before(grammarAccess.getBallSpawnAccess().getGroup()); 
            // InternalRangoMode.g:711:3: ( rule__BallSpawn__Group__0 )
            // InternalRangoMode.g:711:4: rule__BallSpawn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBallSpawnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBallSpawn"


    // $ANTLR start "entryRuleDropTable"
    // InternalRangoMode.g:720:1: entryRuleDropTable : ruleDropTable EOF ;
    public final void entryRuleDropTable() throws RecognitionException {
        try {
            // InternalRangoMode.g:721:1: ( ruleDropTable EOF )
            // InternalRangoMode.g:722:1: ruleDropTable EOF
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
    // InternalRangoMode.g:729:1: ruleDropTable : ( ( rule__DropTable__Group__0 ) ) ;
    public final void ruleDropTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:733:2: ( ( ( rule__DropTable__Group__0 ) ) )
            // InternalRangoMode.g:734:2: ( ( rule__DropTable__Group__0 ) )
            {
            // InternalRangoMode.g:734:2: ( ( rule__DropTable__Group__0 ) )
            // InternalRangoMode.g:735:3: ( rule__DropTable__Group__0 )
            {
             before(grammarAccess.getDropTableAccess().getGroup()); 
            // InternalRangoMode.g:736:3: ( rule__DropTable__Group__0 )
            // InternalRangoMode.g:736:4: rule__DropTable__Group__0
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
    // InternalRangoMode.g:745:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalRangoMode.g:746:1: ( ruleDrop EOF )
            // InternalRangoMode.g:747:1: ruleDrop EOF
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
    // InternalRangoMode.g:754:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:758:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalRangoMode.g:759:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalRangoMode.g:759:2: ( ( rule__Drop__Group__0 ) )
            // InternalRangoMode.g:760:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalRangoMode.g:761:3: ( rule__Drop__Group__0 )
            // InternalRangoMode.g:761:4: rule__Drop__Group__0
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
    // InternalRangoMode.g:770:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalRangoMode.g:771:1: ( ruleEndCondition EOF )
            // InternalRangoMode.g:772:1: ruleEndCondition EOF
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
    // InternalRangoMode.g:779:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:783:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalRangoMode.g:784:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalRangoMode.g:784:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalRangoMode.g:785:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalRangoMode.g:786:3: ( rule__EndCondition__Alternatives )
            // InternalRangoMode.g:786:4: rule__EndCondition__Alternatives
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
    // InternalRangoMode.g:795:1: entryRuleCleared : ruleCleared EOF ;
    public final void entryRuleCleared() throws RecognitionException {
        try {
            // InternalRangoMode.g:796:1: ( ruleCleared EOF )
            // InternalRangoMode.g:797:1: ruleCleared EOF
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
    // InternalRangoMode.g:804:1: ruleCleared : ( ( rule__Cleared__Group__0 ) ) ;
    public final void ruleCleared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:808:2: ( ( ( rule__Cleared__Group__0 ) ) )
            // InternalRangoMode.g:809:2: ( ( rule__Cleared__Group__0 ) )
            {
            // InternalRangoMode.g:809:2: ( ( rule__Cleared__Group__0 ) )
            // InternalRangoMode.g:810:3: ( rule__Cleared__Group__0 )
            {
             before(grammarAccess.getClearedAccess().getGroup()); 
            // InternalRangoMode.g:811:3: ( rule__Cleared__Group__0 )
            // InternalRangoMode.g:811:4: rule__Cleared__Group__0
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
    // InternalRangoMode.g:820:1: entryRuleTimeReached : ruleTimeReached EOF ;
    public final void entryRuleTimeReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:821:1: ( ruleTimeReached EOF )
            // InternalRangoMode.g:822:1: ruleTimeReached EOF
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
    // InternalRangoMode.g:829:1: ruleTimeReached : ( ( rule__TimeReached__Group__0 ) ) ;
    public final void ruleTimeReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:833:2: ( ( ( rule__TimeReached__Group__0 ) ) )
            // InternalRangoMode.g:834:2: ( ( rule__TimeReached__Group__0 ) )
            {
            // InternalRangoMode.g:834:2: ( ( rule__TimeReached__Group__0 ) )
            // InternalRangoMode.g:835:3: ( rule__TimeReached__Group__0 )
            {
             before(grammarAccess.getTimeReachedAccess().getGroup()); 
            // InternalRangoMode.g:836:3: ( rule__TimeReached__Group__0 )
            // InternalRangoMode.g:836:4: rule__TimeReached__Group__0
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
    // InternalRangoMode.g:845:1: entryRuleScoreReached : ruleScoreReached EOF ;
    public final void entryRuleScoreReached() throws RecognitionException {
        try {
            // InternalRangoMode.g:846:1: ( ruleScoreReached EOF )
            // InternalRangoMode.g:847:1: ruleScoreReached EOF
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
    // InternalRangoMode.g:854:1: ruleScoreReached : ( ( rule__ScoreReached__Group__0 ) ) ;
    public final void ruleScoreReached() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:858:2: ( ( ( rule__ScoreReached__Group__0 ) ) )
            // InternalRangoMode.g:859:2: ( ( rule__ScoreReached__Group__0 ) )
            {
            // InternalRangoMode.g:859:2: ( ( rule__ScoreReached__Group__0 ) )
            // InternalRangoMode.g:860:3: ( rule__ScoreReached__Group__0 )
            {
             before(grammarAccess.getScoreReachedAccess().getGroup()); 
            // InternalRangoMode.g:861:3: ( rule__ScoreReached__Group__0 )
            // InternalRangoMode.g:861:4: rule__ScoreReached__Group__0
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


    // $ANTLR start "entryRuleBallsPopped"
    // InternalRangoMode.g:870:1: entryRuleBallsPopped : ruleBallsPopped EOF ;
    public final void entryRuleBallsPopped() throws RecognitionException {
        try {
            // InternalRangoMode.g:871:1: ( ruleBallsPopped EOF )
            // InternalRangoMode.g:872:1: ruleBallsPopped EOF
            {
             before(grammarAccess.getBallsPoppedRule()); 
            pushFollow(FOLLOW_1);
            ruleBallsPopped();

            state._fsp--;

             after(grammarAccess.getBallsPoppedRule()); 
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
    // $ANTLR end "entryRuleBallsPopped"


    // $ANTLR start "ruleBallsPopped"
    // InternalRangoMode.g:879:1: ruleBallsPopped : ( ( rule__BallsPopped__Group__0 ) ) ;
    public final void ruleBallsPopped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:883:2: ( ( ( rule__BallsPopped__Group__0 ) ) )
            // InternalRangoMode.g:884:2: ( ( rule__BallsPopped__Group__0 ) )
            {
            // InternalRangoMode.g:884:2: ( ( rule__BallsPopped__Group__0 ) )
            // InternalRangoMode.g:885:3: ( rule__BallsPopped__Group__0 )
            {
             before(grammarAccess.getBallsPoppedAccess().getGroup()); 
            // InternalRangoMode.g:886:3: ( rule__BallsPopped__Group__0 )
            // InternalRangoMode.g:886:4: rule__BallsPopped__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BallsPopped__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBallsPoppedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBallsPopped"


    // $ANTLR start "entryRuleWavesSurvived"
    // InternalRangoMode.g:895:1: entryRuleWavesSurvived : ruleWavesSurvived EOF ;
    public final void entryRuleWavesSurvived() throws RecognitionException {
        try {
            // InternalRangoMode.g:896:1: ( ruleWavesSurvived EOF )
            // InternalRangoMode.g:897:1: ruleWavesSurvived EOF
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
    // InternalRangoMode.g:904:1: ruleWavesSurvived : ( ( rule__WavesSurvived__Group__0 ) ) ;
    public final void ruleWavesSurvived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:908:2: ( ( ( rule__WavesSurvived__Group__0 ) ) )
            // InternalRangoMode.g:909:2: ( ( rule__WavesSurvived__Group__0 ) )
            {
            // InternalRangoMode.g:909:2: ( ( rule__WavesSurvived__Group__0 ) )
            // InternalRangoMode.g:910:3: ( rule__WavesSurvived__Group__0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getGroup()); 
            // InternalRangoMode.g:911:3: ( rule__WavesSurvived__Group__0 )
            // InternalRangoMode.g:911:4: rule__WavesSurvived__Group__0
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
    // InternalRangoMode.g:920:1: entryRuleHealthDepleted : ruleHealthDepleted EOF ;
    public final void entryRuleHealthDepleted() throws RecognitionException {
        try {
            // InternalRangoMode.g:921:1: ( ruleHealthDepleted EOF )
            // InternalRangoMode.g:922:1: ruleHealthDepleted EOF
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
    // InternalRangoMode.g:929:1: ruleHealthDepleted : ( ( rule__HealthDepleted__Group__0 ) ) ;
    public final void ruleHealthDepleted() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:933:2: ( ( ( rule__HealthDepleted__Group__0 ) ) )
            // InternalRangoMode.g:934:2: ( ( rule__HealthDepleted__Group__0 ) )
            {
            // InternalRangoMode.g:934:2: ( ( rule__HealthDepleted__Group__0 ) )
            // InternalRangoMode.g:935:3: ( rule__HealthDepleted__Group__0 )
            {
             before(grammarAccess.getHealthDepletedAccess().getGroup()); 
            // InternalRangoMode.g:936:3: ( rule__HealthDepleted__Group__0 )
            // InternalRangoMode.g:936:4: rule__HealthDepleted__Group__0
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


    // $ANTLR start "entryRuleBallsAlive"
    // InternalRangoMode.g:945:1: entryRuleBallsAlive : ruleBallsAlive EOF ;
    public final void entryRuleBallsAlive() throws RecognitionException {
        try {
            // InternalRangoMode.g:946:1: ( ruleBallsAlive EOF )
            // InternalRangoMode.g:947:1: ruleBallsAlive EOF
            {
             before(grammarAccess.getBallsAliveRule()); 
            pushFollow(FOLLOW_1);
            ruleBallsAlive();

            state._fsp--;

             after(grammarAccess.getBallsAliveRule()); 
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
    // $ANTLR end "entryRuleBallsAlive"


    // $ANTLR start "ruleBallsAlive"
    // InternalRangoMode.g:954:1: ruleBallsAlive : ( ( rule__BallsAlive__Group__0 ) ) ;
    public final void ruleBallsAlive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:958:2: ( ( ( rule__BallsAlive__Group__0 ) ) )
            // InternalRangoMode.g:959:2: ( ( rule__BallsAlive__Group__0 ) )
            {
            // InternalRangoMode.g:959:2: ( ( rule__BallsAlive__Group__0 ) )
            // InternalRangoMode.g:960:3: ( rule__BallsAlive__Group__0 )
            {
             before(grammarAccess.getBallsAliveAccess().getGroup()); 
            // InternalRangoMode.g:961:3: ( rule__BallsAlive__Group__0 )
            // InternalRangoMode.g:961:4: rule__BallsAlive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BallsAlive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBallsAliveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBallsAlive"


    // $ANTLR start "entryRuleDecimal"
    // InternalRangoMode.g:970:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalRangoMode.g:971:1: ( ruleDecimal EOF )
            // InternalRangoMode.g:972:1: ruleDecimal EOF
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
    // InternalRangoMode.g:979:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:983:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalRangoMode.g:984:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalRangoMode.g:984:2: ( ( rule__Decimal__Group__0 ) )
            // InternalRangoMode.g:985:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalRangoMode.g:986:3: ( rule__Decimal__Group__0 )
            // InternalRangoMode.g:986:4: rule__Decimal__Group__0
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


    // $ANTLR start "ruleScoring"
    // InternalRangoMode.g:995:1: ruleScoring : ( ( rule__Scoring__Alternatives ) ) ;
    public final void ruleScoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:999:1: ( ( ( rule__Scoring__Alternatives ) ) )
            // InternalRangoMode.g:1000:2: ( ( rule__Scoring__Alternatives ) )
            {
            // InternalRangoMode.g:1000:2: ( ( rule__Scoring__Alternatives ) )
            // InternalRangoMode.g:1001:3: ( rule__Scoring__Alternatives )
            {
             before(grammarAccess.getScoringAccess().getAlternatives()); 
            // InternalRangoMode.g:1002:3: ( rule__Scoring__Alternatives )
            // InternalRangoMode.g:1002:4: rule__Scoring__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scoring__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScoringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScoring"


    // $ANTLR start "ruleTarget"
    // InternalRangoMode.g:1011:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1015:1: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRangoMode.g:1016:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRangoMode.g:1016:2: ( ( rule__Target__Alternatives ) )
            // InternalRangoMode.g:1017:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRangoMode.g:1018:3: ( rule__Target__Alternatives )
            // InternalRangoMode.g:1018:4: rule__Target__Alternatives
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
    // InternalRangoMode.g:1027:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1031:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRangoMode.g:1032:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRangoMode.g:1032:2: ( ( rule__Direction__Alternatives ) )
            // InternalRangoMode.g:1033:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRangoMode.g:1034:3: ( rule__Direction__Alternatives )
            // InternalRangoMode.g:1034:4: rule__Direction__Alternatives
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
    // InternalRangoMode.g:1042:1: rule__Edition__Alternatives_3 : ( ( ( rule__Edition__BallTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ( rule__Edition__ModesAssignment_3_4 ) ) );
    public final void rule__Edition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1046:1: ( ( ( rule__Edition__BallTypesAssignment_3_0 ) ) | ( ( rule__Edition__PowerUpsAssignment_3_1 ) ) | ( ( rule__Edition__MaterialsAssignment_3_2 ) ) | ( ( rule__Edition__PlayersAssignment_3_3 ) ) | ( ( rule__Edition__ModesAssignment_3_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 54:
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
                    // InternalRangoMode.g:1047:2: ( ( rule__Edition__BallTypesAssignment_3_0 ) )
                    {
                    // InternalRangoMode.g:1047:2: ( ( rule__Edition__BallTypesAssignment_3_0 ) )
                    // InternalRangoMode.g:1048:3: ( rule__Edition__BallTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getEditionAccess().getBallTypesAssignment_3_0()); 
                    // InternalRangoMode.g:1049:3: ( rule__Edition__BallTypesAssignment_3_0 )
                    // InternalRangoMode.g:1049:4: rule__Edition__BallTypesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edition__BallTypesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEditionAccess().getBallTypesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1053:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    {
                    // InternalRangoMode.g:1053:2: ( ( rule__Edition__PowerUpsAssignment_3_1 ) )
                    // InternalRangoMode.g:1054:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    {
                     before(grammarAccess.getEditionAccess().getPowerUpsAssignment_3_1()); 
                    // InternalRangoMode.g:1055:3: ( rule__Edition__PowerUpsAssignment_3_1 )
                    // InternalRangoMode.g:1055:4: rule__Edition__PowerUpsAssignment_3_1
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
                    // InternalRangoMode.g:1059:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    {
                    // InternalRangoMode.g:1059:2: ( ( rule__Edition__MaterialsAssignment_3_2 ) )
                    // InternalRangoMode.g:1060:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    {
                     before(grammarAccess.getEditionAccess().getMaterialsAssignment_3_2()); 
                    // InternalRangoMode.g:1061:3: ( rule__Edition__MaterialsAssignment_3_2 )
                    // InternalRangoMode.g:1061:4: rule__Edition__MaterialsAssignment_3_2
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
                    // InternalRangoMode.g:1065:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    {
                    // InternalRangoMode.g:1065:2: ( ( rule__Edition__PlayersAssignment_3_3 ) )
                    // InternalRangoMode.g:1066:3: ( rule__Edition__PlayersAssignment_3_3 )
                    {
                     before(grammarAccess.getEditionAccess().getPlayersAssignment_3_3()); 
                    // InternalRangoMode.g:1067:3: ( rule__Edition__PlayersAssignment_3_3 )
                    // InternalRangoMode.g:1067:4: rule__Edition__PlayersAssignment_3_3
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
                    // InternalRangoMode.g:1071:2: ( ( rule__Edition__ModesAssignment_3_4 ) )
                    {
                    // InternalRangoMode.g:1071:2: ( ( rule__Edition__ModesAssignment_3_4 ) )
                    // InternalRangoMode.g:1072:3: ( rule__Edition__ModesAssignment_3_4 )
                    {
                     before(grammarAccess.getEditionAccess().getModesAssignment_3_4()); 
                    // InternalRangoMode.g:1073:3: ( rule__Edition__ModesAssignment_3_4 )
                    // InternalRangoMode.g:1073:4: rule__Edition__ModesAssignment_3_4
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
    // InternalRangoMode.g:1081:1: rule__SplitRule__Alternatives : ( ( ruleVanish ) | ( ruleSplit ) | ( ruleBurst ) );
    public final void rule__SplitRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1085:1: ( ( ruleVanish ) | ( ruleSplit ) | ( ruleBurst ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRangoMode.g:1086:2: ( ruleVanish )
                    {
                    // InternalRangoMode.g:1086:2: ( ruleVanish )
                    // InternalRangoMode.g:1087:3: ruleVanish
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
                    // InternalRangoMode.g:1092:2: ( ruleSplit )
                    {
                    // InternalRangoMode.g:1092:2: ( ruleSplit )
                    // InternalRangoMode.g:1093:3: ruleSplit
                    {
                     before(grammarAccess.getSplitRuleAccess().getSplitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSplit();

                    state._fsp--;

                     after(grammarAccess.getSplitRuleAccess().getSplitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1098:2: ( ruleBurst )
                    {
                    // InternalRangoMode.g:1098:2: ( ruleBurst )
                    // InternalRangoMode.g:1099:3: ruleBurst
                    {
                     before(grammarAccess.getSplitRuleAccess().getBurstParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBurst();

                    state._fsp--;

                     after(grammarAccess.getSplitRuleAccess().getBurstParserRuleCall_2()); 

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
    // InternalRangoMode.g:1108:1: rule__PlayerEffect__Alternatives : ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) );
    public final void rule__PlayerEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1112:1: ( ( ruleDamage ) | ( ruleHeal ) | ( ruleShield ) | ( ruleSpeedChange ) | ( rulePoison ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 43:
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
                    // InternalRangoMode.g:1113:2: ( ruleDamage )
                    {
                    // InternalRangoMode.g:1113:2: ( ruleDamage )
                    // InternalRangoMode.g:1114:3: ruleDamage
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
                    // InternalRangoMode.g:1119:2: ( ruleHeal )
                    {
                    // InternalRangoMode.g:1119:2: ( ruleHeal )
                    // InternalRangoMode.g:1120:3: ruleHeal
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
                    // InternalRangoMode.g:1125:2: ( ruleShield )
                    {
                    // InternalRangoMode.g:1125:2: ( ruleShield )
                    // InternalRangoMode.g:1126:3: ruleShield
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
                    // InternalRangoMode.g:1131:2: ( ruleSpeedChange )
                    {
                    // InternalRangoMode.g:1131:2: ( ruleSpeedChange )
                    // InternalRangoMode.g:1132:3: ruleSpeedChange
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
                    // InternalRangoMode.g:1137:2: ( rulePoison )
                    {
                    // InternalRangoMode.g:1137:2: ( rulePoison )
                    // InternalRangoMode.g:1138:3: rulePoison
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
    // InternalRangoMode.g:1147:1: rule__Obstacle__Alternatives : ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) );
    public final void rule__Obstacle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1151:1: ( ( ruleBlock ) | ( ruleJumpPad ) | ( ruleTeleporter ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt4=1;
                }
                break;
            case 74:
                {
                alt4=2;
                }
                break;
            case 77:
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
                    // InternalRangoMode.g:1152:2: ( ruleBlock )
                    {
                    // InternalRangoMode.g:1152:2: ( ruleBlock )
                    // InternalRangoMode.g:1153:3: ruleBlock
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
                    // InternalRangoMode.g:1158:2: ( ruleJumpPad )
                    {
                    // InternalRangoMode.g:1158:2: ( ruleJumpPad )
                    // InternalRangoMode.g:1159:3: ruleJumpPad
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
                    // InternalRangoMode.g:1164:2: ( ruleTeleporter )
                    {
                    // InternalRangoMode.g:1164:2: ( ruleTeleporter )
                    // InternalRangoMode.g:1165:3: ruleTeleporter
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
    // InternalRangoMode.g:1174:1: rule__SpawnStrategy__Alternatives : ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) );
    public final void rule__SpawnStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1178:1: ( ( ruleFixedLayout ) | ( ruleWaveSchedule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==79) ) {
                alt5=1;
            }
            else if ( (LA5_0==80) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:1179:2: ( ruleFixedLayout )
                    {
                    // InternalRangoMode.g:1179:2: ( ruleFixedLayout )
                    // InternalRangoMode.g:1180:3: ruleFixedLayout
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
                    // InternalRangoMode.g:1185:2: ( ruleWaveSchedule )
                    {
                    // InternalRangoMode.g:1185:2: ( ruleWaveSchedule )
                    // InternalRangoMode.g:1186:3: ruleWaveSchedule
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
    // InternalRangoMode.g:1195:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleBallsPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleBallsAlive ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1199:1: ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleBallsPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleBallsAlive ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:1200:2: ( ruleCleared )
                    {
                    // InternalRangoMode.g:1200:2: ( ruleCleared )
                    // InternalRangoMode.g:1201:3: ruleCleared
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
                    // InternalRangoMode.g:1206:2: ( ruleTimeReached )
                    {
                    // InternalRangoMode.g:1206:2: ( ruleTimeReached )
                    // InternalRangoMode.g:1207:3: ruleTimeReached
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
                    // InternalRangoMode.g:1212:2: ( ruleScoreReached )
                    {
                    // InternalRangoMode.g:1212:2: ( ruleScoreReached )
                    // InternalRangoMode.g:1213:3: ruleScoreReached
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
                    // InternalRangoMode.g:1218:2: ( ruleBallsPopped )
                    {
                    // InternalRangoMode.g:1218:2: ( ruleBallsPopped )
                    // InternalRangoMode.g:1219:3: ruleBallsPopped
                    {
                     before(grammarAccess.getEndConditionAccess().getBallsPoppedParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBallsPopped();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getBallsPoppedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:1224:2: ( ruleWavesSurvived )
                    {
                    // InternalRangoMode.g:1224:2: ( ruleWavesSurvived )
                    // InternalRangoMode.g:1225:3: ruleWavesSurvived
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
                    // InternalRangoMode.g:1230:2: ( ruleHealthDepleted )
                    {
                    // InternalRangoMode.g:1230:2: ( ruleHealthDepleted )
                    // InternalRangoMode.g:1231:3: ruleHealthDepleted
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
                    // InternalRangoMode.g:1236:2: ( ruleBallsAlive )
                    {
                    // InternalRangoMode.g:1236:2: ( ruleBallsAlive )
                    // InternalRangoMode.g:1237:3: ruleBallsAlive
                    {
                     before(grammarAccess.getEndConditionAccess().getBallsAliveParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBallsAlive();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getBallsAliveParserRuleCall_6()); 

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


    // $ANTLR start "rule__Scoring__Alternatives"
    // InternalRangoMode.g:1246:1: rule__Scoring__Alternatives : ( ( ( 'points' ) ) | ( ( 'speed-bonus' ) ) );
    public final void rule__Scoring__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1250:1: ( ( ( 'points' ) ) | ( ( 'speed-bonus' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:1251:2: ( ( 'points' ) )
                    {
                    // InternalRangoMode.g:1251:2: ( ( 'points' ) )
                    // InternalRangoMode.g:1252:3: ( 'points' )
                    {
                     before(grammarAccess.getScoringAccess().getPOINTSEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1253:3: ( 'points' )
                    // InternalRangoMode.g:1253:4: 'points'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getScoringAccess().getPOINTSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1257:2: ( ( 'speed-bonus' ) )
                    {
                    // InternalRangoMode.g:1257:2: ( ( 'speed-bonus' ) )
                    // InternalRangoMode.g:1258:3: ( 'speed-bonus' )
                    {
                     before(grammarAccess.getScoringAccess().getSPEED_BONUSEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1259:3: ( 'speed-bonus' )
                    // InternalRangoMode.g:1259:4: 'speed-bonus'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getScoringAccess().getSPEED_BONUSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Scoring__Alternatives"


    // $ANTLR start "rule__Target__Alternatives"
    // InternalRangoMode.g:1267:1: rule__Target__Alternatives : ( ( ( 'everything' ) ) | ( ( 'balls' ) ) | ( ( 'player' ) ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1271:1: ( ( ( 'everything' ) ) | ( ( 'balls' ) ) | ( ( 'player' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
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
                    // InternalRangoMode.g:1272:2: ( ( 'everything' ) )
                    {
                    // InternalRangoMode.g:1272:2: ( ( 'everything' ) )
                    // InternalRangoMode.g:1273:3: ( 'everything' )
                    {
                     before(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1274:3: ( 'everything' )
                    // InternalRangoMode.g:1274:4: 'everything'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1278:2: ( ( 'balls' ) )
                    {
                    // InternalRangoMode.g:1278:2: ( ( 'balls' ) )
                    // InternalRangoMode.g:1279:3: ( 'balls' )
                    {
                     before(grammarAccess.getTargetAccess().getBALLSEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1280:3: ( 'balls' )
                    // InternalRangoMode.g:1280:4: 'balls'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTargetAccess().getBALLSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:1284:2: ( ( 'player' ) )
                    {
                    // InternalRangoMode.g:1284:2: ( ( 'player' ) )
                    // InternalRangoMode.g:1285:3: ( 'player' )
                    {
                     before(grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2()); 
                    // InternalRangoMode.g:1286:3: ( 'player' )
                    // InternalRangoMode.g:1286:4: 'player'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalRangoMode.g:1294:1: rule__Direction__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1298:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:1299:2: ( ( 'left' ) )
                    {
                    // InternalRangoMode.g:1299:2: ( ( 'left' ) )
                    // InternalRangoMode.g:1300:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRangoMode.g:1301:3: ( 'left' )
                    // InternalRangoMode.g:1301:4: 'left'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1305:2: ( ( 'right' ) )
                    {
                    // InternalRangoMode.g:1305:2: ( ( 'right' ) )
                    // InternalRangoMode.g:1306:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRangoMode.g:1307:3: ( 'right' )
                    // InternalRangoMode.g:1307:4: 'right'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalRangoMode.g:1315:1: rule__Edition__Group__0 : rule__Edition__Group__0__Impl rule__Edition__Group__1 ;
    public final void rule__Edition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1319:1: ( rule__Edition__Group__0__Impl rule__Edition__Group__1 )
            // InternalRangoMode.g:1320:2: rule__Edition__Group__0__Impl rule__Edition__Group__1
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
    // InternalRangoMode.g:1327:1: rule__Edition__Group__0__Impl : ( 'edition' ) ;
    public final void rule__Edition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1331:1: ( ( 'edition' ) )
            // InternalRangoMode.g:1332:1: ( 'edition' )
            {
            // InternalRangoMode.g:1332:1: ( 'edition' )
            // InternalRangoMode.g:1333:2: 'edition'
            {
             before(grammarAccess.getEditionAccess().getEditionKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRangoMode.g:1342:1: rule__Edition__Group__1 : rule__Edition__Group__1__Impl rule__Edition__Group__2 ;
    public final void rule__Edition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1346:1: ( rule__Edition__Group__1__Impl rule__Edition__Group__2 )
            // InternalRangoMode.g:1347:2: rule__Edition__Group__1__Impl rule__Edition__Group__2
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
    // InternalRangoMode.g:1354:1: rule__Edition__Group__1__Impl : ( ( rule__Edition__NameAssignment_1 ) ) ;
    public final void rule__Edition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1358:1: ( ( ( rule__Edition__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1359:1: ( ( rule__Edition__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1359:1: ( ( rule__Edition__NameAssignment_1 ) )
            // InternalRangoMode.g:1360:2: ( rule__Edition__NameAssignment_1 )
            {
             before(grammarAccess.getEditionAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1361:2: ( rule__Edition__NameAssignment_1 )
            // InternalRangoMode.g:1361:3: rule__Edition__NameAssignment_1
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
    // InternalRangoMode.g:1369:1: rule__Edition__Group__2 : rule__Edition__Group__2__Impl rule__Edition__Group__3 ;
    public final void rule__Edition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1373:1: ( rule__Edition__Group__2__Impl rule__Edition__Group__3 )
            // InternalRangoMode.g:1374:2: rule__Edition__Group__2__Impl rule__Edition__Group__3
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
    // InternalRangoMode.g:1381:1: rule__Edition__Group__2__Impl : ( ( rule__Edition__TitleAssignment_2 )? ) ;
    public final void rule__Edition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1385:1: ( ( ( rule__Edition__TitleAssignment_2 )? ) )
            // InternalRangoMode.g:1386:1: ( ( rule__Edition__TitleAssignment_2 )? )
            {
            // InternalRangoMode.g:1386:1: ( ( rule__Edition__TitleAssignment_2 )? )
            // InternalRangoMode.g:1387:2: ( rule__Edition__TitleAssignment_2 )?
            {
             before(grammarAccess.getEditionAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:1388:2: ( rule__Edition__TitleAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRangoMode.g:1388:3: rule__Edition__TitleAssignment_2
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
    // InternalRangoMode.g:1396:1: rule__Edition__Group__3 : rule__Edition__Group__3__Impl ;
    public final void rule__Edition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1400:1: ( rule__Edition__Group__3__Impl )
            // InternalRangoMode.g:1401:2: rule__Edition__Group__3__Impl
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
    // InternalRangoMode.g:1407:1: rule__Edition__Group__3__Impl : ( ( rule__Edition__Alternatives_3 )* ) ;
    public final void rule__Edition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1411:1: ( ( ( rule__Edition__Alternatives_3 )* ) )
            // InternalRangoMode.g:1412:1: ( ( rule__Edition__Alternatives_3 )* )
            {
            // InternalRangoMode.g:1412:1: ( ( rule__Edition__Alternatives_3 )* )
            // InternalRangoMode.g:1413:2: ( rule__Edition__Alternatives_3 )*
            {
             before(grammarAccess.getEditionAccess().getAlternatives_3()); 
            // InternalRangoMode.g:1414:2: ( rule__Edition__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15||LA11_0==19||LA11_0==45||LA11_0==47||LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRangoMode.g:1414:3: rule__Edition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Edition__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "rule__BallType__Group__0"
    // InternalRangoMode.g:1423:1: rule__BallType__Group__0 : rule__BallType__Group__0__Impl rule__BallType__Group__1 ;
    public final void rule__BallType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1427:1: ( rule__BallType__Group__0__Impl rule__BallType__Group__1 )
            // InternalRangoMode.g:1428:2: rule__BallType__Group__0__Impl rule__BallType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BallType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__0"


    // $ANTLR start "rule__BallType__Group__0__Impl"
    // InternalRangoMode.g:1435:1: rule__BallType__Group__0__Impl : ( 'ball' ) ;
    public final void rule__BallType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1439:1: ( ( 'ball' ) )
            // InternalRangoMode.g:1440:1: ( 'ball' )
            {
            // InternalRangoMode.g:1440:1: ( 'ball' )
            // InternalRangoMode.g:1441:2: 'ball'
            {
             before(grammarAccess.getBallTypeAccess().getBallKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getBallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__0__Impl"


    // $ANTLR start "rule__BallType__Group__1"
    // InternalRangoMode.g:1450:1: rule__BallType__Group__1 : rule__BallType__Group__1__Impl rule__BallType__Group__2 ;
    public final void rule__BallType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1454:1: ( rule__BallType__Group__1__Impl rule__BallType__Group__2 )
            // InternalRangoMode.g:1455:2: rule__BallType__Group__1__Impl rule__BallType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BallType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__1"


    // $ANTLR start "rule__BallType__Group__1__Impl"
    // InternalRangoMode.g:1462:1: rule__BallType__Group__1__Impl : ( ( rule__BallType__NameAssignment_1 ) ) ;
    public final void rule__BallType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1466:1: ( ( ( rule__BallType__NameAssignment_1 ) ) )
            // InternalRangoMode.g:1467:1: ( ( rule__BallType__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:1467:1: ( ( rule__BallType__NameAssignment_1 ) )
            // InternalRangoMode.g:1468:2: ( rule__BallType__NameAssignment_1 )
            {
             before(grammarAccess.getBallTypeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:1469:2: ( rule__BallType__NameAssignment_1 )
            // InternalRangoMode.g:1469:3: rule__BallType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__1__Impl"


    // $ANTLR start "rule__BallType__Group__2"
    // InternalRangoMode.g:1477:1: rule__BallType__Group__2 : rule__BallType__Group__2__Impl rule__BallType__Group__3 ;
    public final void rule__BallType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1481:1: ( rule__BallType__Group__2__Impl rule__BallType__Group__3 )
            // InternalRangoMode.g:1482:2: rule__BallType__Group__2__Impl rule__BallType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__BallType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__2"


    // $ANTLR start "rule__BallType__Group__2__Impl"
    // InternalRangoMode.g:1489:1: rule__BallType__Group__2__Impl : ( '{' ) ;
    public final void rule__BallType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1493:1: ( ( '{' ) )
            // InternalRangoMode.g:1494:1: ( '{' )
            {
            // InternalRangoMode.g:1494:1: ( '{' )
            // InternalRangoMode.g:1495:2: '{'
            {
             before(grammarAccess.getBallTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__2__Impl"


    // $ANTLR start "rule__BallType__Group__3"
    // InternalRangoMode.g:1504:1: rule__BallType__Group__3 : rule__BallType__Group__3__Impl rule__BallType__Group__4 ;
    public final void rule__BallType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1508:1: ( rule__BallType__Group__3__Impl rule__BallType__Group__4 )
            // InternalRangoMode.g:1509:2: rule__BallType__Group__3__Impl rule__BallType__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__BallType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__3"


    // $ANTLR start "rule__BallType__Group__3__Impl"
    // InternalRangoMode.g:1516:1: rule__BallType__Group__3__Impl : ( ( rule__BallType__UnorderedGroup_3 ) ) ;
    public final void rule__BallType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1520:1: ( ( ( rule__BallType__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:1521:1: ( ( rule__BallType__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:1521:1: ( ( rule__BallType__UnorderedGroup_3 ) )
            // InternalRangoMode.g:1522:2: ( rule__BallType__UnorderedGroup_3 )
            {
             before(grammarAccess.getBallTypeAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:1523:2: ( rule__BallType__UnorderedGroup_3 )
            // InternalRangoMode.g:1523:3: rule__BallType__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__BallType__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__3__Impl"


    // $ANTLR start "rule__BallType__Group__4"
    // InternalRangoMode.g:1531:1: rule__BallType__Group__4 : rule__BallType__Group__4__Impl rule__BallType__Group__5 ;
    public final void rule__BallType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1535:1: ( rule__BallType__Group__4__Impl rule__BallType__Group__5 )
            // InternalRangoMode.g:1536:2: rule__BallType__Group__4__Impl rule__BallType__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__BallType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__4"


    // $ANTLR start "rule__BallType__Group__4__Impl"
    // InternalRangoMode.g:1543:1: rule__BallType__Group__4__Impl : ( 'on' ) ;
    public final void rule__BallType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1547:1: ( ( 'on' ) )
            // InternalRangoMode.g:1548:1: ( 'on' )
            {
            // InternalRangoMode.g:1548:1: ( 'on' )
            // InternalRangoMode.g:1549:2: 'on'
            {
             before(grammarAccess.getBallTypeAccess().getOnKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__4__Impl"


    // $ANTLR start "rule__BallType__Group__5"
    // InternalRangoMode.g:1558:1: rule__BallType__Group__5 : rule__BallType__Group__5__Impl rule__BallType__Group__6 ;
    public final void rule__BallType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1562:1: ( rule__BallType__Group__5__Impl rule__BallType__Group__6 )
            // InternalRangoMode.g:1563:2: rule__BallType__Group__5__Impl rule__BallType__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__BallType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__5"


    // $ANTLR start "rule__BallType__Group__5__Impl"
    // InternalRangoMode.g:1570:1: rule__BallType__Group__5__Impl : ( 'pop' ) ;
    public final void rule__BallType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1574:1: ( ( 'pop' ) )
            // InternalRangoMode.g:1575:1: ( 'pop' )
            {
            // InternalRangoMode.g:1575:1: ( 'pop' )
            // InternalRangoMode.g:1576:2: 'pop'
            {
             before(grammarAccess.getBallTypeAccess().getPopKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getPopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__5__Impl"


    // $ANTLR start "rule__BallType__Group__6"
    // InternalRangoMode.g:1585:1: rule__BallType__Group__6 : rule__BallType__Group__6__Impl rule__BallType__Group__7 ;
    public final void rule__BallType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1589:1: ( rule__BallType__Group__6__Impl rule__BallType__Group__7 )
            // InternalRangoMode.g:1590:2: rule__BallType__Group__6__Impl rule__BallType__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__BallType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__6"


    // $ANTLR start "rule__BallType__Group__6__Impl"
    // InternalRangoMode.g:1597:1: rule__BallType__Group__6__Impl : ( ':' ) ;
    public final void rule__BallType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1601:1: ( ( ':' ) )
            // InternalRangoMode.g:1602:1: ( ':' )
            {
            // InternalRangoMode.g:1602:1: ( ':' )
            // InternalRangoMode.g:1603:2: ':'
            {
             before(grammarAccess.getBallTypeAccess().getColonKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__6__Impl"


    // $ANTLR start "rule__BallType__Group__7"
    // InternalRangoMode.g:1612:1: rule__BallType__Group__7 : rule__BallType__Group__7__Impl rule__BallType__Group__8 ;
    public final void rule__BallType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1616:1: ( rule__BallType__Group__7__Impl rule__BallType__Group__8 )
            // InternalRangoMode.g:1617:2: rule__BallType__Group__7__Impl rule__BallType__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__BallType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__7"


    // $ANTLR start "rule__BallType__Group__7__Impl"
    // InternalRangoMode.g:1624:1: rule__BallType__Group__7__Impl : ( ( rule__BallType__SplitRuleAssignment_7 ) ) ;
    public final void rule__BallType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1628:1: ( ( ( rule__BallType__SplitRuleAssignment_7 ) ) )
            // InternalRangoMode.g:1629:1: ( ( rule__BallType__SplitRuleAssignment_7 ) )
            {
            // InternalRangoMode.g:1629:1: ( ( rule__BallType__SplitRuleAssignment_7 ) )
            // InternalRangoMode.g:1630:2: ( rule__BallType__SplitRuleAssignment_7 )
            {
             before(grammarAccess.getBallTypeAccess().getSplitRuleAssignment_7()); 
            // InternalRangoMode.g:1631:2: ( rule__BallType__SplitRuleAssignment_7 )
            // InternalRangoMode.g:1631:3: rule__BallType__SplitRuleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BallType__SplitRuleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getSplitRuleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__7__Impl"


    // $ANTLR start "rule__BallType__Group__8"
    // InternalRangoMode.g:1639:1: rule__BallType__Group__8 : rule__BallType__Group__8__Impl rule__BallType__Group__9 ;
    public final void rule__BallType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1643:1: ( rule__BallType__Group__8__Impl rule__BallType__Group__9 )
            // InternalRangoMode.g:1644:2: rule__BallType__Group__8__Impl rule__BallType__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__BallType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__8"


    // $ANTLR start "rule__BallType__Group__8__Impl"
    // InternalRangoMode.g:1651:1: rule__BallType__Group__8__Impl : ( 'on' ) ;
    public final void rule__BallType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1655:1: ( ( 'on' ) )
            // InternalRangoMode.g:1656:1: ( 'on' )
            {
            // InternalRangoMode.g:1656:1: ( 'on' )
            // InternalRangoMode.g:1657:2: 'on'
            {
             before(grammarAccess.getBallTypeAccess().getOnKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getOnKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__8__Impl"


    // $ANTLR start "rule__BallType__Group__9"
    // InternalRangoMode.g:1666:1: rule__BallType__Group__9 : rule__BallType__Group__9__Impl rule__BallType__Group__10 ;
    public final void rule__BallType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1670:1: ( rule__BallType__Group__9__Impl rule__BallType__Group__10 )
            // InternalRangoMode.g:1671:2: rule__BallType__Group__9__Impl rule__BallType__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__BallType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__9"


    // $ANTLR start "rule__BallType__Group__9__Impl"
    // InternalRangoMode.g:1678:1: rule__BallType__Group__9__Impl : ( 'contact' ) ;
    public final void rule__BallType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1682:1: ( ( 'contact' ) )
            // InternalRangoMode.g:1683:1: ( 'contact' )
            {
            // InternalRangoMode.g:1683:1: ( 'contact' )
            // InternalRangoMode.g:1684:2: 'contact'
            {
             before(grammarAccess.getBallTypeAccess().getContactKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getContactKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__9__Impl"


    // $ANTLR start "rule__BallType__Group__10"
    // InternalRangoMode.g:1693:1: rule__BallType__Group__10 : rule__BallType__Group__10__Impl rule__BallType__Group__11 ;
    public final void rule__BallType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1697:1: ( rule__BallType__Group__10__Impl rule__BallType__Group__11 )
            // InternalRangoMode.g:1698:2: rule__BallType__Group__10__Impl rule__BallType__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__BallType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__10"


    // $ANTLR start "rule__BallType__Group__10__Impl"
    // InternalRangoMode.g:1705:1: rule__BallType__Group__10__Impl : ( ':' ) ;
    public final void rule__BallType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1709:1: ( ( ':' ) )
            // InternalRangoMode.g:1710:1: ( ':' )
            {
            // InternalRangoMode.g:1710:1: ( ':' )
            // InternalRangoMode.g:1711:2: ':'
            {
             before(grammarAccess.getBallTypeAccess().getColonKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__10__Impl"


    // $ANTLR start "rule__BallType__Group__11"
    // InternalRangoMode.g:1720:1: rule__BallType__Group__11 : rule__BallType__Group__11__Impl rule__BallType__Group__12 ;
    public final void rule__BallType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1724:1: ( rule__BallType__Group__11__Impl rule__BallType__Group__12 )
            // InternalRangoMode.g:1725:2: rule__BallType__Group__11__Impl rule__BallType__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__BallType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__11"


    // $ANTLR start "rule__BallType__Group__11__Impl"
    // InternalRangoMode.g:1732:1: rule__BallType__Group__11__Impl : ( ( rule__BallType__ContactEffectsAssignment_11 ) ) ;
    public final void rule__BallType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1736:1: ( ( ( rule__BallType__ContactEffectsAssignment_11 ) ) )
            // InternalRangoMode.g:1737:1: ( ( rule__BallType__ContactEffectsAssignment_11 ) )
            {
            // InternalRangoMode.g:1737:1: ( ( rule__BallType__ContactEffectsAssignment_11 ) )
            // InternalRangoMode.g:1738:2: ( rule__BallType__ContactEffectsAssignment_11 )
            {
             before(grammarAccess.getBallTypeAccess().getContactEffectsAssignment_11()); 
            // InternalRangoMode.g:1739:2: ( rule__BallType__ContactEffectsAssignment_11 )
            // InternalRangoMode.g:1739:3: rule__BallType__ContactEffectsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__BallType__ContactEffectsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getContactEffectsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__11__Impl"


    // $ANTLR start "rule__BallType__Group__12"
    // InternalRangoMode.g:1747:1: rule__BallType__Group__12 : rule__BallType__Group__12__Impl rule__BallType__Group__13 ;
    public final void rule__BallType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1751:1: ( rule__BallType__Group__12__Impl rule__BallType__Group__13 )
            // InternalRangoMode.g:1752:2: rule__BallType__Group__12__Impl rule__BallType__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__BallType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__12"


    // $ANTLR start "rule__BallType__Group__12__Impl"
    // InternalRangoMode.g:1759:1: rule__BallType__Group__12__Impl : ( ( rule__BallType__Group_12__0 )* ) ;
    public final void rule__BallType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1763:1: ( ( ( rule__BallType__Group_12__0 )* ) )
            // InternalRangoMode.g:1764:1: ( ( rule__BallType__Group_12__0 )* )
            {
            // InternalRangoMode.g:1764:1: ( ( rule__BallType__Group_12__0 )* )
            // InternalRangoMode.g:1765:2: ( rule__BallType__Group_12__0 )*
            {
             before(grammarAccess.getBallTypeAccess().getGroup_12()); 
            // InternalRangoMode.g:1766:2: ( rule__BallType__Group_12__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRangoMode.g:1766:3: rule__BallType__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__BallType__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBallTypeAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__12__Impl"


    // $ANTLR start "rule__BallType__Group__13"
    // InternalRangoMode.g:1774:1: rule__BallType__Group__13 : rule__BallType__Group__13__Impl ;
    public final void rule__BallType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1778:1: ( rule__BallType__Group__13__Impl )
            // InternalRangoMode.g:1779:2: rule__BallType__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__13"


    // $ANTLR start "rule__BallType__Group__13__Impl"
    // InternalRangoMode.g:1785:1: rule__BallType__Group__13__Impl : ( '}' ) ;
    public final void rule__BallType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1789:1: ( ( '}' ) )
            // InternalRangoMode.g:1790:1: ( '}' )
            {
            // InternalRangoMode.g:1790:1: ( '}' )
            // InternalRangoMode.g:1791:2: '}'
            {
             before(grammarAccess.getBallTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group__13__Impl"


    // $ANTLR start "rule__BallType__Group_3_0__0"
    // InternalRangoMode.g:1801:1: rule__BallType__Group_3_0__0 : rule__BallType__Group_3_0__0__Impl rule__BallType__Group_3_0__1 ;
    public final void rule__BallType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1805:1: ( rule__BallType__Group_3_0__0__Impl rule__BallType__Group_3_0__1 )
            // InternalRangoMode.g:1806:2: rule__BallType__Group_3_0__0__Impl rule__BallType__Group_3_0__1
            {
            pushFollow(FOLLOW_16);
            rule__BallType__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_0__0"


    // $ANTLR start "rule__BallType__Group_3_0__0__Impl"
    // InternalRangoMode.g:1813:1: rule__BallType__Group_3_0__0__Impl : ( 'sprite' ) ;
    public final void rule__BallType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1817:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:1818:1: ( 'sprite' )
            {
            // InternalRangoMode.g:1818:1: ( 'sprite' )
            // InternalRangoMode.g:1819:2: 'sprite'
            {
             before(grammarAccess.getBallTypeAccess().getSpriteKeyword_3_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getSpriteKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_0__0__Impl"


    // $ANTLR start "rule__BallType__Group_3_0__1"
    // InternalRangoMode.g:1828:1: rule__BallType__Group_3_0__1 : rule__BallType__Group_3_0__1__Impl ;
    public final void rule__BallType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1832:1: ( rule__BallType__Group_3_0__1__Impl )
            // InternalRangoMode.g:1833:2: rule__BallType__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_0__1"


    // $ANTLR start "rule__BallType__Group_3_0__1__Impl"
    // InternalRangoMode.g:1839:1: rule__BallType__Group_3_0__1__Impl : ( ( rule__BallType__SpriteAssignment_3_0_1 ) ) ;
    public final void rule__BallType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1843:1: ( ( ( rule__BallType__SpriteAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:1844:1: ( ( rule__BallType__SpriteAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:1844:1: ( ( rule__BallType__SpriteAssignment_3_0_1 ) )
            // InternalRangoMode.g:1845:2: ( rule__BallType__SpriteAssignment_3_0_1 )
            {
             before(grammarAccess.getBallTypeAccess().getSpriteAssignment_3_0_1()); 
            // InternalRangoMode.g:1846:2: ( rule__BallType__SpriteAssignment_3_0_1 )
            // InternalRangoMode.g:1846:3: rule__BallType__SpriteAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__SpriteAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getSpriteAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_0__1__Impl"


    // $ANTLR start "rule__BallType__Group_3_1__0"
    // InternalRangoMode.g:1855:1: rule__BallType__Group_3_1__0 : rule__BallType__Group_3_1__0__Impl rule__BallType__Group_3_1__1 ;
    public final void rule__BallType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1859:1: ( rule__BallType__Group_3_1__0__Impl rule__BallType__Group_3_1__1 )
            // InternalRangoMode.g:1860:2: rule__BallType__Group_3_1__0__Impl rule__BallType__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BallType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_1__0"


    // $ANTLR start "rule__BallType__Group_3_1__0__Impl"
    // InternalRangoMode.g:1867:1: rule__BallType__Group_3_1__0__Impl : ( 'scale' ) ;
    public final void rule__BallType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1871:1: ( ( 'scale' ) )
            // InternalRangoMode.g:1872:1: ( 'scale' )
            {
            // InternalRangoMode.g:1872:1: ( 'scale' )
            // InternalRangoMode.g:1873:2: 'scale'
            {
             before(grammarAccess.getBallTypeAccess().getScaleKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getScaleKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_1__0__Impl"


    // $ANTLR start "rule__BallType__Group_3_1__1"
    // InternalRangoMode.g:1882:1: rule__BallType__Group_3_1__1 : rule__BallType__Group_3_1__1__Impl ;
    public final void rule__BallType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1886:1: ( rule__BallType__Group_3_1__1__Impl )
            // InternalRangoMode.g:1887:2: rule__BallType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_1__1"


    // $ANTLR start "rule__BallType__Group_3_1__1__Impl"
    // InternalRangoMode.g:1893:1: rule__BallType__Group_3_1__1__Impl : ( ( rule__BallType__ScaleAssignment_3_1_1 ) ) ;
    public final void rule__BallType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1897:1: ( ( ( rule__BallType__ScaleAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:1898:1: ( ( rule__BallType__ScaleAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:1898:1: ( ( rule__BallType__ScaleAssignment_3_1_1 ) )
            // InternalRangoMode.g:1899:2: ( rule__BallType__ScaleAssignment_3_1_1 )
            {
             before(grammarAccess.getBallTypeAccess().getScaleAssignment_3_1_1()); 
            // InternalRangoMode.g:1900:2: ( rule__BallType__ScaleAssignment_3_1_1 )
            // InternalRangoMode.g:1900:3: rule__BallType__ScaleAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__ScaleAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getScaleAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_1__1__Impl"


    // $ANTLR start "rule__BallType__Group_3_2__0"
    // InternalRangoMode.g:1909:1: rule__BallType__Group_3_2__0 : rule__BallType__Group_3_2__0__Impl rule__BallType__Group_3_2__1 ;
    public final void rule__BallType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1913:1: ( rule__BallType__Group_3_2__0__Impl rule__BallType__Group_3_2__1 )
            // InternalRangoMode.g:1914:2: rule__BallType__Group_3_2__0__Impl rule__BallType__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
            rule__BallType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_2__0"


    // $ANTLR start "rule__BallType__Group_3_2__0__Impl"
    // InternalRangoMode.g:1921:1: rule__BallType__Group_3_2__0__Impl : ( 'bounce' ) ;
    public final void rule__BallType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1925:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:1926:1: ( 'bounce' )
            {
            // InternalRangoMode.g:1926:1: ( 'bounce' )
            // InternalRangoMode.g:1927:2: 'bounce'
            {
             before(grammarAccess.getBallTypeAccess().getBounceKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getBounceKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_2__0__Impl"


    // $ANTLR start "rule__BallType__Group_3_2__1"
    // InternalRangoMode.g:1936:1: rule__BallType__Group_3_2__1 : rule__BallType__Group_3_2__1__Impl ;
    public final void rule__BallType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1940:1: ( rule__BallType__Group_3_2__1__Impl )
            // InternalRangoMode.g:1941:2: rule__BallType__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_2__1"


    // $ANTLR start "rule__BallType__Group_3_2__1__Impl"
    // InternalRangoMode.g:1947:1: rule__BallType__Group_3_2__1__Impl : ( ( rule__BallType__BounceAssignment_3_2_1 ) ) ;
    public final void rule__BallType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1951:1: ( ( ( rule__BallType__BounceAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:1952:1: ( ( rule__BallType__BounceAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:1952:1: ( ( rule__BallType__BounceAssignment_3_2_1 ) )
            // InternalRangoMode.g:1953:2: ( rule__BallType__BounceAssignment_3_2_1 )
            {
             before(grammarAccess.getBallTypeAccess().getBounceAssignment_3_2_1()); 
            // InternalRangoMode.g:1954:2: ( rule__BallType__BounceAssignment_3_2_1 )
            // InternalRangoMode.g:1954:3: rule__BallType__BounceAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__BounceAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getBounceAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_2__1__Impl"


    // $ANTLR start "rule__BallType__Group_3_3__0"
    // InternalRangoMode.g:1963:1: rule__BallType__Group_3_3__0 : rule__BallType__Group_3_3__0__Impl rule__BallType__Group_3_3__1 ;
    public final void rule__BallType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1967:1: ( rule__BallType__Group_3_3__0__Impl rule__BallType__Group_3_3__1 )
            // InternalRangoMode.g:1968:2: rule__BallType__Group_3_3__0__Impl rule__BallType__Group_3_3__1
            {
            pushFollow(FOLLOW_17);
            rule__BallType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_3__0"


    // $ANTLR start "rule__BallType__Group_3_3__0__Impl"
    // InternalRangoMode.g:1975:1: rule__BallType__Group_3_3__0__Impl : ( 'speed' ) ;
    public final void rule__BallType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1979:1: ( ( 'speed' ) )
            // InternalRangoMode.g:1980:1: ( 'speed' )
            {
            // InternalRangoMode.g:1980:1: ( 'speed' )
            // InternalRangoMode.g:1981:2: 'speed'
            {
             before(grammarAccess.getBallTypeAccess().getSpeedKeyword_3_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getSpeedKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_3__0__Impl"


    // $ANTLR start "rule__BallType__Group_3_3__1"
    // InternalRangoMode.g:1990:1: rule__BallType__Group_3_3__1 : rule__BallType__Group_3_3__1__Impl ;
    public final void rule__BallType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:1994:1: ( rule__BallType__Group_3_3__1__Impl )
            // InternalRangoMode.g:1995:2: rule__BallType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_3__1"


    // $ANTLR start "rule__BallType__Group_3_3__1__Impl"
    // InternalRangoMode.g:2001:1: rule__BallType__Group_3_3__1__Impl : ( ( rule__BallType__SpeedAssignment_3_3_1 ) ) ;
    public final void rule__BallType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2005:1: ( ( ( rule__BallType__SpeedAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:2006:1: ( ( rule__BallType__SpeedAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:2006:1: ( ( rule__BallType__SpeedAssignment_3_3_1 ) )
            // InternalRangoMode.g:2007:2: ( rule__BallType__SpeedAssignment_3_3_1 )
            {
             before(grammarAccess.getBallTypeAccess().getSpeedAssignment_3_3_1()); 
            // InternalRangoMode.g:2008:2: ( rule__BallType__SpeedAssignment_3_3_1 )
            // InternalRangoMode.g:2008:3: rule__BallType__SpeedAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__SpeedAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getSpeedAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_3__1__Impl"


    // $ANTLR start "rule__BallType__Group_3_4__0"
    // InternalRangoMode.g:2017:1: rule__BallType__Group_3_4__0 : rule__BallType__Group_3_4__0__Impl rule__BallType__Group_3_4__1 ;
    public final void rule__BallType__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2021:1: ( rule__BallType__Group_3_4__0__Impl rule__BallType__Group_3_4__1 )
            // InternalRangoMode.g:2022:2: rule__BallType__Group_3_4__0__Impl rule__BallType__Group_3_4__1
            {
            pushFollow(FOLLOW_17);
            rule__BallType__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_4__0"


    // $ANTLR start "rule__BallType__Group_3_4__0__Impl"
    // InternalRangoMode.g:2029:1: rule__BallType__Group_3_4__0__Impl : ( 'points' ) ;
    public final void rule__BallType__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2033:1: ( ( 'points' ) )
            // InternalRangoMode.g:2034:1: ( 'points' )
            {
            // InternalRangoMode.g:2034:1: ( 'points' )
            // InternalRangoMode.g:2035:2: 'points'
            {
             before(grammarAccess.getBallTypeAccess().getPointsKeyword_3_4_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getPointsKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_4__0__Impl"


    // $ANTLR start "rule__BallType__Group_3_4__1"
    // InternalRangoMode.g:2044:1: rule__BallType__Group_3_4__1 : rule__BallType__Group_3_4__1__Impl ;
    public final void rule__BallType__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2048:1: ( rule__BallType__Group_3_4__1__Impl )
            // InternalRangoMode.g:2049:2: rule__BallType__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_4__1"


    // $ANTLR start "rule__BallType__Group_3_4__1__Impl"
    // InternalRangoMode.g:2055:1: rule__BallType__Group_3_4__1__Impl : ( ( rule__BallType__PointsAssignment_3_4_1 ) ) ;
    public final void rule__BallType__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2059:1: ( ( ( rule__BallType__PointsAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:2060:1: ( ( rule__BallType__PointsAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:2060:1: ( ( rule__BallType__PointsAssignment_3_4_1 ) )
            // InternalRangoMode.g:2061:2: ( rule__BallType__PointsAssignment_3_4_1 )
            {
             before(grammarAccess.getBallTypeAccess().getPointsAssignment_3_4_1()); 
            // InternalRangoMode.g:2062:2: ( rule__BallType__PointsAssignment_3_4_1 )
            // InternalRangoMode.g:2062:3: rule__BallType__PointsAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__PointsAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getPointsAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_3_4__1__Impl"


    // $ANTLR start "rule__BallType__Group_12__0"
    // InternalRangoMode.g:2071:1: rule__BallType__Group_12__0 : rule__BallType__Group_12__0__Impl rule__BallType__Group_12__1 ;
    public final void rule__BallType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2075:1: ( rule__BallType__Group_12__0__Impl rule__BallType__Group_12__1 )
            // InternalRangoMode.g:2076:2: rule__BallType__Group_12__0__Impl rule__BallType__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__BallType__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallType__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_12__0"


    // $ANTLR start "rule__BallType__Group_12__0__Impl"
    // InternalRangoMode.g:2083:1: rule__BallType__Group_12__0__Impl : ( ',' ) ;
    public final void rule__BallType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2087:1: ( ( ',' ) )
            // InternalRangoMode.g:2088:1: ( ',' )
            {
            // InternalRangoMode.g:2088:1: ( ',' )
            // InternalRangoMode.g:2089:2: ','
            {
             before(grammarAccess.getBallTypeAccess().getCommaKeyword_12_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_12__0__Impl"


    // $ANTLR start "rule__BallType__Group_12__1"
    // InternalRangoMode.g:2098:1: rule__BallType__Group_12__1 : rule__BallType__Group_12__1__Impl ;
    public final void rule__BallType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2102:1: ( rule__BallType__Group_12__1__Impl )
            // InternalRangoMode.g:2103:2: rule__BallType__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_12__1"


    // $ANTLR start "rule__BallType__Group_12__1__Impl"
    // InternalRangoMode.g:2109:1: rule__BallType__Group_12__1__Impl : ( ( rule__BallType__ContactEffectsAssignment_12_1 ) ) ;
    public final void rule__BallType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2113:1: ( ( ( rule__BallType__ContactEffectsAssignment_12_1 ) ) )
            // InternalRangoMode.g:2114:1: ( ( rule__BallType__ContactEffectsAssignment_12_1 ) )
            {
            // InternalRangoMode.g:2114:1: ( ( rule__BallType__ContactEffectsAssignment_12_1 ) )
            // InternalRangoMode.g:2115:2: ( rule__BallType__ContactEffectsAssignment_12_1 )
            {
             before(grammarAccess.getBallTypeAccess().getContactEffectsAssignment_12_1()); 
            // InternalRangoMode.g:2116:2: ( rule__BallType__ContactEffectsAssignment_12_1 )
            // InternalRangoMode.g:2116:3: rule__BallType__ContactEffectsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__BallType__ContactEffectsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBallTypeAccess().getContactEffectsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__Group_12__1__Impl"


    // $ANTLR start "rule__Vanish__Group__0"
    // InternalRangoMode.g:2125:1: rule__Vanish__Group__0 : rule__Vanish__Group__0__Impl rule__Vanish__Group__1 ;
    public final void rule__Vanish__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2129:1: ( rule__Vanish__Group__0__Impl rule__Vanish__Group__1 )
            // InternalRangoMode.g:2130:2: rule__Vanish__Group__0__Impl rule__Vanish__Group__1
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
    // InternalRangoMode.g:2137:1: rule__Vanish__Group__0__Impl : ( () ) ;
    public final void rule__Vanish__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2141:1: ( ( () ) )
            // InternalRangoMode.g:2142:1: ( () )
            {
            // InternalRangoMode.g:2142:1: ( () )
            // InternalRangoMode.g:2143:2: ()
            {
             before(grammarAccess.getVanishAccess().getVanishAction_0()); 
            // InternalRangoMode.g:2144:2: ()
            // InternalRangoMode.g:2144:3: 
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
    // InternalRangoMode.g:2152:1: rule__Vanish__Group__1 : rule__Vanish__Group__1__Impl ;
    public final void rule__Vanish__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2156:1: ( rule__Vanish__Group__1__Impl )
            // InternalRangoMode.g:2157:2: rule__Vanish__Group__1__Impl
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
    // InternalRangoMode.g:2163:1: rule__Vanish__Group__1__Impl : ( 'vanish' ) ;
    public final void rule__Vanish__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2167:1: ( ( 'vanish' ) )
            // InternalRangoMode.g:2168:1: ( 'vanish' )
            {
            // InternalRangoMode.g:2168:1: ( 'vanish' )
            // InternalRangoMode.g:2169:2: 'vanish'
            {
             before(grammarAccess.getVanishAccess().getVanishKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRangoMode.g:2179:1: rule__Split__Group__0 : rule__Split__Group__0__Impl rule__Split__Group__1 ;
    public final void rule__Split__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2183:1: ( rule__Split__Group__0__Impl rule__Split__Group__1 )
            // InternalRangoMode.g:2184:2: rule__Split__Group__0__Impl rule__Split__Group__1
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
    // InternalRangoMode.g:2191:1: rule__Split__Group__0__Impl : ( 'split' ) ;
    public final void rule__Split__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2195:1: ( ( 'split' ) )
            // InternalRangoMode.g:2196:1: ( 'split' )
            {
            // InternalRangoMode.g:2196:1: ( 'split' )
            // InternalRangoMode.g:2197:2: 'split'
            {
             before(grammarAccess.getSplitAccess().getSplitKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRangoMode.g:2206:1: rule__Split__Group__1 : rule__Split__Group__1__Impl rule__Split__Group__2 ;
    public final void rule__Split__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2210:1: ( rule__Split__Group__1__Impl rule__Split__Group__2 )
            // InternalRangoMode.g:2211:2: rule__Split__Group__1__Impl rule__Split__Group__2
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
    // InternalRangoMode.g:2218:1: rule__Split__Group__1__Impl : ( 'into' ) ;
    public final void rule__Split__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2222:1: ( ( 'into' ) )
            // InternalRangoMode.g:2223:1: ( 'into' )
            {
            // InternalRangoMode.g:2223:1: ( 'into' )
            // InternalRangoMode.g:2224:2: 'into'
            {
             before(grammarAccess.getSplitAccess().getIntoKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRangoMode.g:2233:1: rule__Split__Group__2 : rule__Split__Group__2__Impl rule__Split__Group__3 ;
    public final void rule__Split__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2237:1: ( rule__Split__Group__2__Impl rule__Split__Group__3 )
            // InternalRangoMode.g:2238:2: rule__Split__Group__2__Impl rule__Split__Group__3
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
    // InternalRangoMode.g:2245:1: rule__Split__Group__2__Impl : ( ( rule__Split__FragmentsAssignment_2 ) ) ;
    public final void rule__Split__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2249:1: ( ( ( rule__Split__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2250:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2250:1: ( ( rule__Split__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2251:2: ( rule__Split__FragmentsAssignment_2 )
            {
             before(grammarAccess.getSplitAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2252:2: ( rule__Split__FragmentsAssignment_2 )
            // InternalRangoMode.g:2252:3: rule__Split__FragmentsAssignment_2
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
    // InternalRangoMode.g:2260:1: rule__Split__Group__3 : rule__Split__Group__3__Impl rule__Split__Group__4 ;
    public final void rule__Split__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2264:1: ( rule__Split__Group__3__Impl rule__Split__Group__4 )
            // InternalRangoMode.g:2265:2: rule__Split__Group__3__Impl rule__Split__Group__4
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
    // InternalRangoMode.g:2272:1: rule__Split__Group__3__Impl : ( ( rule__Split__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Split__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2276:1: ( ( ( rule__Split__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2277:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2277:1: ( ( rule__Split__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2278:2: ( rule__Split__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2279:2: ( rule__Split__FragmentTypeAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRangoMode.g:2279:3: rule__Split__FragmentTypeAssignment_3
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
    // InternalRangoMode.g:2287:1: rule__Split__Group__4 : rule__Split__Group__4__Impl ;
    public final void rule__Split__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2291:1: ( rule__Split__Group__4__Impl )
            // InternalRangoMode.g:2292:2: rule__Split__Group__4__Impl
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
    // InternalRangoMode.g:2298:1: rule__Split__Group__4__Impl : ( ( rule__Split__Group_4__0 )? ) ;
    public final void rule__Split__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2302:1: ( ( ( rule__Split__Group_4__0 )? ) )
            // InternalRangoMode.g:2303:1: ( ( rule__Split__Group_4__0 )? )
            {
            // InternalRangoMode.g:2303:1: ( ( rule__Split__Group_4__0 )? )
            // InternalRangoMode.g:2304:2: ( rule__Split__Group_4__0 )?
            {
             before(grammarAccess.getSplitAccess().getGroup_4()); 
            // InternalRangoMode.g:2305:2: ( rule__Split__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRangoMode.g:2305:3: rule__Split__Group_4__0
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
    // InternalRangoMode.g:2314:1: rule__Split__Group_4__0 : rule__Split__Group_4__0__Impl rule__Split__Group_4__1 ;
    public final void rule__Split__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2318:1: ( rule__Split__Group_4__0__Impl rule__Split__Group_4__1 )
            // InternalRangoMode.g:2319:2: rule__Split__Group_4__0__Impl rule__Split__Group_4__1
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
    // InternalRangoMode.g:2326:1: rule__Split__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Split__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2330:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2331:1: ( 'launched' )
            {
            // InternalRangoMode.g:2331:1: ( 'launched' )
            // InternalRangoMode.g:2332:2: 'launched'
            {
             before(grammarAccess.getSplitAccess().getLaunchedKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRangoMode.g:2341:1: rule__Split__Group_4__1 : rule__Split__Group_4__1__Impl rule__Split__Group_4__2 ;
    public final void rule__Split__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2345:1: ( rule__Split__Group_4__1__Impl rule__Split__Group_4__2 )
            // InternalRangoMode.g:2346:2: rule__Split__Group_4__1__Impl rule__Split__Group_4__2
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
    // InternalRangoMode.g:2353:1: rule__Split__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Split__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2357:1: ( ( 'at' ) )
            // InternalRangoMode.g:2358:1: ( 'at' )
            {
            // InternalRangoMode.g:2358:1: ( 'at' )
            // InternalRangoMode.g:2359:2: 'at'
            {
             before(grammarAccess.getSplitAccess().getAtKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRangoMode.g:2368:1: rule__Split__Group_4__2 : rule__Split__Group_4__2__Impl ;
    public final void rule__Split__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2372:1: ( rule__Split__Group_4__2__Impl )
            // InternalRangoMode.g:2373:2: rule__Split__Group_4__2__Impl
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
    // InternalRangoMode.g:2379:1: rule__Split__Group_4__2__Impl : ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Split__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2383:1: ( ( ( rule__Split__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2384:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2384:1: ( ( rule__Split__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2385:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getSplitAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2386:2: ( rule__Split__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2386:3: rule__Split__LaunchSpeedAssignment_4_2
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


    // $ANTLR start "rule__Burst__Group__0"
    // InternalRangoMode.g:2395:1: rule__Burst__Group__0 : rule__Burst__Group__0__Impl rule__Burst__Group__1 ;
    public final void rule__Burst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2399:1: ( rule__Burst__Group__0__Impl rule__Burst__Group__1 )
            // InternalRangoMode.g:2400:2: rule__Burst__Group__0__Impl rule__Burst__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Burst__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__0"


    // $ANTLR start "rule__Burst__Group__0__Impl"
    // InternalRangoMode.g:2407:1: rule__Burst__Group__0__Impl : ( 'burst' ) ;
    public final void rule__Burst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2411:1: ( ( 'burst' ) )
            // InternalRangoMode.g:2412:1: ( 'burst' )
            {
            // InternalRangoMode.g:2412:1: ( 'burst' )
            // InternalRangoMode.g:2413:2: 'burst'
            {
             before(grammarAccess.getBurstAccess().getBurstKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getBurstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__0__Impl"


    // $ANTLR start "rule__Burst__Group__1"
    // InternalRangoMode.g:2422:1: rule__Burst__Group__1 : rule__Burst__Group__1__Impl rule__Burst__Group__2 ;
    public final void rule__Burst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2426:1: ( rule__Burst__Group__1__Impl rule__Burst__Group__2 )
            // InternalRangoMode.g:2427:2: rule__Burst__Group__1__Impl rule__Burst__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Burst__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__1"


    // $ANTLR start "rule__Burst__Group__1__Impl"
    // InternalRangoMode.g:2434:1: rule__Burst__Group__1__Impl : ( 'into' ) ;
    public final void rule__Burst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2438:1: ( ( 'into' ) )
            // InternalRangoMode.g:2439:1: ( 'into' )
            {
            // InternalRangoMode.g:2439:1: ( 'into' )
            // InternalRangoMode.g:2440:2: 'into'
            {
             before(grammarAccess.getBurstAccess().getIntoKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getIntoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__1__Impl"


    // $ANTLR start "rule__Burst__Group__2"
    // InternalRangoMode.g:2449:1: rule__Burst__Group__2 : rule__Burst__Group__2__Impl rule__Burst__Group__3 ;
    public final void rule__Burst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2453:1: ( rule__Burst__Group__2__Impl rule__Burst__Group__3 )
            // InternalRangoMode.g:2454:2: rule__Burst__Group__2__Impl rule__Burst__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Burst__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__2"


    // $ANTLR start "rule__Burst__Group__2__Impl"
    // InternalRangoMode.g:2461:1: rule__Burst__Group__2__Impl : ( ( rule__Burst__FragmentsAssignment_2 ) ) ;
    public final void rule__Burst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2465:1: ( ( ( rule__Burst__FragmentsAssignment_2 ) ) )
            // InternalRangoMode.g:2466:1: ( ( rule__Burst__FragmentsAssignment_2 ) )
            {
            // InternalRangoMode.g:2466:1: ( ( rule__Burst__FragmentsAssignment_2 ) )
            // InternalRangoMode.g:2467:2: ( rule__Burst__FragmentsAssignment_2 )
            {
             before(grammarAccess.getBurstAccess().getFragmentsAssignment_2()); 
            // InternalRangoMode.g:2468:2: ( rule__Burst__FragmentsAssignment_2 )
            // InternalRangoMode.g:2468:3: rule__Burst__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Burst__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBurstAccess().getFragmentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__2__Impl"


    // $ANTLR start "rule__Burst__Group__3"
    // InternalRangoMode.g:2476:1: rule__Burst__Group__3 : rule__Burst__Group__3__Impl rule__Burst__Group__4 ;
    public final void rule__Burst__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2480:1: ( rule__Burst__Group__3__Impl rule__Burst__Group__4 )
            // InternalRangoMode.g:2481:2: rule__Burst__Group__3__Impl rule__Burst__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Burst__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__3"


    // $ANTLR start "rule__Burst__Group__3__Impl"
    // InternalRangoMode.g:2488:1: rule__Burst__Group__3__Impl : ( ( rule__Burst__FragmentTypeAssignment_3 )? ) ;
    public final void rule__Burst__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2492:1: ( ( ( rule__Burst__FragmentTypeAssignment_3 )? ) )
            // InternalRangoMode.g:2493:1: ( ( rule__Burst__FragmentTypeAssignment_3 )? )
            {
            // InternalRangoMode.g:2493:1: ( ( rule__Burst__FragmentTypeAssignment_3 )? )
            // InternalRangoMode.g:2494:2: ( rule__Burst__FragmentTypeAssignment_3 )?
            {
             before(grammarAccess.getBurstAccess().getFragmentTypeAssignment_3()); 
            // InternalRangoMode.g:2495:2: ( rule__Burst__FragmentTypeAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:2495:3: rule__Burst__FragmentTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Burst__FragmentTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBurstAccess().getFragmentTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__3__Impl"


    // $ANTLR start "rule__Burst__Group__4"
    // InternalRangoMode.g:2503:1: rule__Burst__Group__4 : rule__Burst__Group__4__Impl ;
    public final void rule__Burst__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2507:1: ( rule__Burst__Group__4__Impl )
            // InternalRangoMode.g:2508:2: rule__Burst__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Burst__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__4"


    // $ANTLR start "rule__Burst__Group__4__Impl"
    // InternalRangoMode.g:2514:1: rule__Burst__Group__4__Impl : ( ( rule__Burst__Group_4__0 )? ) ;
    public final void rule__Burst__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2518:1: ( ( ( rule__Burst__Group_4__0 )? ) )
            // InternalRangoMode.g:2519:1: ( ( rule__Burst__Group_4__0 )? )
            {
            // InternalRangoMode.g:2519:1: ( ( rule__Burst__Group_4__0 )? )
            // InternalRangoMode.g:2520:2: ( rule__Burst__Group_4__0 )?
            {
             before(grammarAccess.getBurstAccess().getGroup_4()); 
            // InternalRangoMode.g:2521:2: ( rule__Burst__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRangoMode.g:2521:3: rule__Burst__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Burst__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBurstAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group__4__Impl"


    // $ANTLR start "rule__Burst__Group_4__0"
    // InternalRangoMode.g:2530:1: rule__Burst__Group_4__0 : rule__Burst__Group_4__0__Impl rule__Burst__Group_4__1 ;
    public final void rule__Burst__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2534:1: ( rule__Burst__Group_4__0__Impl rule__Burst__Group_4__1 )
            // InternalRangoMode.g:2535:2: rule__Burst__Group_4__0__Impl rule__Burst__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Burst__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__0"


    // $ANTLR start "rule__Burst__Group_4__0__Impl"
    // InternalRangoMode.g:2542:1: rule__Burst__Group_4__0__Impl : ( 'launched' ) ;
    public final void rule__Burst__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2546:1: ( ( 'launched' ) )
            // InternalRangoMode.g:2547:1: ( 'launched' )
            {
            // InternalRangoMode.g:2547:1: ( 'launched' )
            // InternalRangoMode.g:2548:2: 'launched'
            {
             before(grammarAccess.getBurstAccess().getLaunchedKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getLaunchedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__0__Impl"


    // $ANTLR start "rule__Burst__Group_4__1"
    // InternalRangoMode.g:2557:1: rule__Burst__Group_4__1 : rule__Burst__Group_4__1__Impl rule__Burst__Group_4__2 ;
    public final void rule__Burst__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2561:1: ( rule__Burst__Group_4__1__Impl rule__Burst__Group_4__2 )
            // InternalRangoMode.g:2562:2: rule__Burst__Group_4__1__Impl rule__Burst__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Burst__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Burst__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__1"


    // $ANTLR start "rule__Burst__Group_4__1__Impl"
    // InternalRangoMode.g:2569:1: rule__Burst__Group_4__1__Impl : ( 'at' ) ;
    public final void rule__Burst__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2573:1: ( ( 'at' ) )
            // InternalRangoMode.g:2574:1: ( 'at' )
            {
            // InternalRangoMode.g:2574:1: ( 'at' )
            // InternalRangoMode.g:2575:2: 'at'
            {
             before(grammarAccess.getBurstAccess().getAtKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getAtKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__1__Impl"


    // $ANTLR start "rule__Burst__Group_4__2"
    // InternalRangoMode.g:2584:1: rule__Burst__Group_4__2 : rule__Burst__Group_4__2__Impl ;
    public final void rule__Burst__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2588:1: ( rule__Burst__Group_4__2__Impl )
            // InternalRangoMode.g:2589:2: rule__Burst__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Burst__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__2"


    // $ANTLR start "rule__Burst__Group_4__2__Impl"
    // InternalRangoMode.g:2595:1: rule__Burst__Group_4__2__Impl : ( ( rule__Burst__LaunchSpeedAssignment_4_2 ) ) ;
    public final void rule__Burst__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2599:1: ( ( ( rule__Burst__LaunchSpeedAssignment_4_2 ) ) )
            // InternalRangoMode.g:2600:1: ( ( rule__Burst__LaunchSpeedAssignment_4_2 ) )
            {
            // InternalRangoMode.g:2600:1: ( ( rule__Burst__LaunchSpeedAssignment_4_2 ) )
            // InternalRangoMode.g:2601:2: ( rule__Burst__LaunchSpeedAssignment_4_2 )
            {
             before(grammarAccess.getBurstAccess().getLaunchSpeedAssignment_4_2()); 
            // InternalRangoMode.g:2602:2: ( rule__Burst__LaunchSpeedAssignment_4_2 )
            // InternalRangoMode.g:2602:3: rule__Burst__LaunchSpeedAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Burst__LaunchSpeedAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBurstAccess().getLaunchSpeedAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__Group_4__2__Impl"


    // $ANTLR start "rule__Damage__Group__0"
    // InternalRangoMode.g:2611:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2615:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalRangoMode.g:2616:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
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
    // InternalRangoMode.g:2623:1: rule__Damage__Group__0__Impl : ( 'damage' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2627:1: ( ( 'damage' ) )
            // InternalRangoMode.g:2628:1: ( 'damage' )
            {
            // InternalRangoMode.g:2628:1: ( 'damage' )
            // InternalRangoMode.g:2629:2: 'damage'
            {
             before(grammarAccess.getDamageAccess().getDamageKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRangoMode.g:2638:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2642:1: ( rule__Damage__Group__1__Impl )
            // InternalRangoMode.g:2643:2: rule__Damage__Group__1__Impl
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
    // InternalRangoMode.g:2649:1: rule__Damage__Group__1__Impl : ( ( rule__Damage__AmountAssignment_1 ) ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2653:1: ( ( ( rule__Damage__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2654:1: ( ( rule__Damage__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2654:1: ( ( rule__Damage__AmountAssignment_1 ) )
            // InternalRangoMode.g:2655:2: ( rule__Damage__AmountAssignment_1 )
            {
             before(grammarAccess.getDamageAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2656:2: ( rule__Damage__AmountAssignment_1 )
            // InternalRangoMode.g:2656:3: rule__Damage__AmountAssignment_1
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
    // InternalRangoMode.g:2665:1: rule__Heal__Group__0 : rule__Heal__Group__0__Impl rule__Heal__Group__1 ;
    public final void rule__Heal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2669:1: ( rule__Heal__Group__0__Impl rule__Heal__Group__1 )
            // InternalRangoMode.g:2670:2: rule__Heal__Group__0__Impl rule__Heal__Group__1
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
    // InternalRangoMode.g:2677:1: rule__Heal__Group__0__Impl : ( 'heal' ) ;
    public final void rule__Heal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2681:1: ( ( 'heal' ) )
            // InternalRangoMode.g:2682:1: ( 'heal' )
            {
            // InternalRangoMode.g:2682:1: ( 'heal' )
            // InternalRangoMode.g:2683:2: 'heal'
            {
             before(grammarAccess.getHealAccess().getHealKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRangoMode.g:2692:1: rule__Heal__Group__1 : rule__Heal__Group__1__Impl ;
    public final void rule__Heal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2696:1: ( rule__Heal__Group__1__Impl )
            // InternalRangoMode.g:2697:2: rule__Heal__Group__1__Impl
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
    // InternalRangoMode.g:2703:1: rule__Heal__Group__1__Impl : ( ( rule__Heal__AmountAssignment_1 ) ) ;
    public final void rule__Heal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2707:1: ( ( ( rule__Heal__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:2708:1: ( ( rule__Heal__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:2708:1: ( ( rule__Heal__AmountAssignment_1 ) )
            // InternalRangoMode.g:2709:2: ( rule__Heal__AmountAssignment_1 )
            {
             before(grammarAccess.getHealAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:2710:2: ( rule__Heal__AmountAssignment_1 )
            // InternalRangoMode.g:2710:3: rule__Heal__AmountAssignment_1
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
    // InternalRangoMode.g:2719:1: rule__Shield__Group__0 : rule__Shield__Group__0__Impl rule__Shield__Group__1 ;
    public final void rule__Shield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2723:1: ( rule__Shield__Group__0__Impl rule__Shield__Group__1 )
            // InternalRangoMode.g:2724:2: rule__Shield__Group__0__Impl rule__Shield__Group__1
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
    // InternalRangoMode.g:2731:1: rule__Shield__Group__0__Impl : ( 'shield' ) ;
    public final void rule__Shield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2735:1: ( ( 'shield' ) )
            // InternalRangoMode.g:2736:1: ( 'shield' )
            {
            // InternalRangoMode.g:2736:1: ( 'shield' )
            // InternalRangoMode.g:2737:2: 'shield'
            {
             before(grammarAccess.getShieldAccess().getShieldKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRangoMode.g:2746:1: rule__Shield__Group__1 : rule__Shield__Group__1__Impl rule__Shield__Group__2 ;
    public final void rule__Shield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2750:1: ( rule__Shield__Group__1__Impl rule__Shield__Group__2 )
            // InternalRangoMode.g:2751:2: rule__Shield__Group__1__Impl rule__Shield__Group__2
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
    // InternalRangoMode.g:2758:1: rule__Shield__Group__1__Impl : ( 'for' ) ;
    public final void rule__Shield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2762:1: ( ( 'for' ) )
            // InternalRangoMode.g:2763:1: ( 'for' )
            {
            // InternalRangoMode.g:2763:1: ( 'for' )
            // InternalRangoMode.g:2764:2: 'for'
            {
             before(grammarAccess.getShieldAccess().getForKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRangoMode.g:2773:1: rule__Shield__Group__2 : rule__Shield__Group__2__Impl rule__Shield__Group__3 ;
    public final void rule__Shield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2777:1: ( rule__Shield__Group__2__Impl rule__Shield__Group__3 )
            // InternalRangoMode.g:2778:2: rule__Shield__Group__2__Impl rule__Shield__Group__3
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
    // InternalRangoMode.g:2785:1: rule__Shield__Group__2__Impl : ( ( rule__Shield__DurationAssignment_2 ) ) ;
    public final void rule__Shield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2789:1: ( ( ( rule__Shield__DurationAssignment_2 ) ) )
            // InternalRangoMode.g:2790:1: ( ( rule__Shield__DurationAssignment_2 ) )
            {
            // InternalRangoMode.g:2790:1: ( ( rule__Shield__DurationAssignment_2 ) )
            // InternalRangoMode.g:2791:2: ( rule__Shield__DurationAssignment_2 )
            {
             before(grammarAccess.getShieldAccess().getDurationAssignment_2()); 
            // InternalRangoMode.g:2792:2: ( rule__Shield__DurationAssignment_2 )
            // InternalRangoMode.g:2792:3: rule__Shield__DurationAssignment_2
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
    // InternalRangoMode.g:2800:1: rule__Shield__Group__3 : rule__Shield__Group__3__Impl ;
    public final void rule__Shield__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2804:1: ( rule__Shield__Group__3__Impl )
            // InternalRangoMode.g:2805:2: rule__Shield__Group__3__Impl
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
    // InternalRangoMode.g:2811:1: rule__Shield__Group__3__Impl : ( 's' ) ;
    public final void rule__Shield__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2815:1: ( ( 's' ) )
            // InternalRangoMode.g:2816:1: ( 's' )
            {
            // InternalRangoMode.g:2816:1: ( 's' )
            // InternalRangoMode.g:2817:2: 's'
            {
             before(grammarAccess.getShieldAccess().getSKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:2827:1: rule__SpeedChange__Group__0 : rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 ;
    public final void rule__SpeedChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2831:1: ( rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1 )
            // InternalRangoMode.g:2832:2: rule__SpeedChange__Group__0__Impl rule__SpeedChange__Group__1
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
    // InternalRangoMode.g:2839:1: rule__SpeedChange__Group__0__Impl : ( 'speed' ) ;
    public final void rule__SpeedChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2843:1: ( ( 'speed' ) )
            // InternalRangoMode.g:2844:1: ( 'speed' )
            {
            // InternalRangoMode.g:2844:1: ( 'speed' )
            // InternalRangoMode.g:2845:2: 'speed'
            {
             before(grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:2854:1: rule__SpeedChange__Group__1 : rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 ;
    public final void rule__SpeedChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2858:1: ( rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2 )
            // InternalRangoMode.g:2859:2: rule__SpeedChange__Group__1__Impl rule__SpeedChange__Group__2
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
    // InternalRangoMode.g:2866:1: rule__SpeedChange__Group__1__Impl : ( '*' ) ;
    public final void rule__SpeedChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2870:1: ( ( '*' ) )
            // InternalRangoMode.g:2871:1: ( '*' )
            {
            // InternalRangoMode.g:2871:1: ( '*' )
            // InternalRangoMode.g:2872:2: '*'
            {
             before(grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRangoMode.g:2881:1: rule__SpeedChange__Group__2 : rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 ;
    public final void rule__SpeedChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2885:1: ( rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3 )
            // InternalRangoMode.g:2886:2: rule__SpeedChange__Group__2__Impl rule__SpeedChange__Group__3
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
    // InternalRangoMode.g:2893:1: rule__SpeedChange__Group__2__Impl : ( ( rule__SpeedChange__FactorAssignment_2 ) ) ;
    public final void rule__SpeedChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2897:1: ( ( ( rule__SpeedChange__FactorAssignment_2 ) ) )
            // InternalRangoMode.g:2898:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            {
            // InternalRangoMode.g:2898:1: ( ( rule__SpeedChange__FactorAssignment_2 ) )
            // InternalRangoMode.g:2899:2: ( rule__SpeedChange__FactorAssignment_2 )
            {
             before(grammarAccess.getSpeedChangeAccess().getFactorAssignment_2()); 
            // InternalRangoMode.g:2900:2: ( rule__SpeedChange__FactorAssignment_2 )
            // InternalRangoMode.g:2900:3: rule__SpeedChange__FactorAssignment_2
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
    // InternalRangoMode.g:2908:1: rule__SpeedChange__Group__3 : rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 ;
    public final void rule__SpeedChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2912:1: ( rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4 )
            // InternalRangoMode.g:2913:2: rule__SpeedChange__Group__3__Impl rule__SpeedChange__Group__4
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
    // InternalRangoMode.g:2920:1: rule__SpeedChange__Group__3__Impl : ( 'for' ) ;
    public final void rule__SpeedChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2924:1: ( ( 'for' ) )
            // InternalRangoMode.g:2925:1: ( 'for' )
            {
            // InternalRangoMode.g:2925:1: ( 'for' )
            // InternalRangoMode.g:2926:2: 'for'
            {
             before(grammarAccess.getSpeedChangeAccess().getForKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRangoMode.g:2935:1: rule__SpeedChange__Group__4 : rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 ;
    public final void rule__SpeedChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2939:1: ( rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5 )
            // InternalRangoMode.g:2940:2: rule__SpeedChange__Group__4__Impl rule__SpeedChange__Group__5
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
    // InternalRangoMode.g:2947:1: rule__SpeedChange__Group__4__Impl : ( ( rule__SpeedChange__DurationAssignment_4 ) ) ;
    public final void rule__SpeedChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2951:1: ( ( ( rule__SpeedChange__DurationAssignment_4 ) ) )
            // InternalRangoMode.g:2952:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            {
            // InternalRangoMode.g:2952:1: ( ( rule__SpeedChange__DurationAssignment_4 ) )
            // InternalRangoMode.g:2953:2: ( rule__SpeedChange__DurationAssignment_4 )
            {
             before(grammarAccess.getSpeedChangeAccess().getDurationAssignment_4()); 
            // InternalRangoMode.g:2954:2: ( rule__SpeedChange__DurationAssignment_4 )
            // InternalRangoMode.g:2954:3: rule__SpeedChange__DurationAssignment_4
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
    // InternalRangoMode.g:2962:1: rule__SpeedChange__Group__5 : rule__SpeedChange__Group__5__Impl ;
    public final void rule__SpeedChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2966:1: ( rule__SpeedChange__Group__5__Impl )
            // InternalRangoMode.g:2967:2: rule__SpeedChange__Group__5__Impl
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
    // InternalRangoMode.g:2973:1: rule__SpeedChange__Group__5__Impl : ( 's' ) ;
    public final void rule__SpeedChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2977:1: ( ( 's' ) )
            // InternalRangoMode.g:2978:1: ( 's' )
            {
            // InternalRangoMode.g:2978:1: ( 's' )
            // InternalRangoMode.g:2979:2: 's'
            {
             before(grammarAccess.getSpeedChangeAccess().getSKeyword_5()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:2989:1: rule__Poison__Group__0 : rule__Poison__Group__0__Impl rule__Poison__Group__1 ;
    public final void rule__Poison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:2993:1: ( rule__Poison__Group__0__Impl rule__Poison__Group__1 )
            // InternalRangoMode.g:2994:2: rule__Poison__Group__0__Impl rule__Poison__Group__1
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
    // InternalRangoMode.g:3001:1: rule__Poison__Group__0__Impl : ( 'poison' ) ;
    public final void rule__Poison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3005:1: ( ( 'poison' ) )
            // InternalRangoMode.g:3006:1: ( 'poison' )
            {
            // InternalRangoMode.g:3006:1: ( 'poison' )
            // InternalRangoMode.g:3007:2: 'poison'
            {
             before(grammarAccess.getPoisonAccess().getPoisonKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRangoMode.g:3016:1: rule__Poison__Group__1 : rule__Poison__Group__1__Impl rule__Poison__Group__2 ;
    public final void rule__Poison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3020:1: ( rule__Poison__Group__1__Impl rule__Poison__Group__2 )
            // InternalRangoMode.g:3021:2: rule__Poison__Group__1__Impl rule__Poison__Group__2
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
    // InternalRangoMode.g:3028:1: rule__Poison__Group__1__Impl : ( ( rule__Poison__AmountAssignment_1 ) ) ;
    public final void rule__Poison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3032:1: ( ( ( rule__Poison__AmountAssignment_1 ) ) )
            // InternalRangoMode.g:3033:1: ( ( rule__Poison__AmountAssignment_1 ) )
            {
            // InternalRangoMode.g:3033:1: ( ( rule__Poison__AmountAssignment_1 ) )
            // InternalRangoMode.g:3034:2: ( rule__Poison__AmountAssignment_1 )
            {
             before(grammarAccess.getPoisonAccess().getAmountAssignment_1()); 
            // InternalRangoMode.g:3035:2: ( rule__Poison__AmountAssignment_1 )
            // InternalRangoMode.g:3035:3: rule__Poison__AmountAssignment_1
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
    // InternalRangoMode.g:3043:1: rule__Poison__Group__2 : rule__Poison__Group__2__Impl rule__Poison__Group__3 ;
    public final void rule__Poison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3047:1: ( rule__Poison__Group__2__Impl rule__Poison__Group__3 )
            // InternalRangoMode.g:3048:2: rule__Poison__Group__2__Impl rule__Poison__Group__3
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
    // InternalRangoMode.g:3055:1: rule__Poison__Group__2__Impl : ( 'every' ) ;
    public final void rule__Poison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3059:1: ( ( 'every' ) )
            // InternalRangoMode.g:3060:1: ( 'every' )
            {
            // InternalRangoMode.g:3060:1: ( 'every' )
            // InternalRangoMode.g:3061:2: 'every'
            {
             before(grammarAccess.getPoisonAccess().getEveryKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRangoMode.g:3070:1: rule__Poison__Group__3 : rule__Poison__Group__3__Impl rule__Poison__Group__4 ;
    public final void rule__Poison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3074:1: ( rule__Poison__Group__3__Impl rule__Poison__Group__4 )
            // InternalRangoMode.g:3075:2: rule__Poison__Group__3__Impl rule__Poison__Group__4
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
    // InternalRangoMode.g:3082:1: rule__Poison__Group__3__Impl : ( ( rule__Poison__IntervalAssignment_3 ) ) ;
    public final void rule__Poison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3086:1: ( ( ( rule__Poison__IntervalAssignment_3 ) ) )
            // InternalRangoMode.g:3087:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            {
            // InternalRangoMode.g:3087:1: ( ( rule__Poison__IntervalAssignment_3 ) )
            // InternalRangoMode.g:3088:2: ( rule__Poison__IntervalAssignment_3 )
            {
             before(grammarAccess.getPoisonAccess().getIntervalAssignment_3()); 
            // InternalRangoMode.g:3089:2: ( rule__Poison__IntervalAssignment_3 )
            // InternalRangoMode.g:3089:3: rule__Poison__IntervalAssignment_3
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
    // InternalRangoMode.g:3097:1: rule__Poison__Group__4 : rule__Poison__Group__4__Impl rule__Poison__Group__5 ;
    public final void rule__Poison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3101:1: ( rule__Poison__Group__4__Impl rule__Poison__Group__5 )
            // InternalRangoMode.g:3102:2: rule__Poison__Group__4__Impl rule__Poison__Group__5
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
    // InternalRangoMode.g:3109:1: rule__Poison__Group__4__Impl : ( 's' ) ;
    public final void rule__Poison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3113:1: ( ( 's' ) )
            // InternalRangoMode.g:3114:1: ( 's' )
            {
            // InternalRangoMode.g:3114:1: ( 's' )
            // InternalRangoMode.g:3115:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:3124:1: rule__Poison__Group__5 : rule__Poison__Group__5__Impl rule__Poison__Group__6 ;
    public final void rule__Poison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3128:1: ( rule__Poison__Group__5__Impl rule__Poison__Group__6 )
            // InternalRangoMode.g:3129:2: rule__Poison__Group__5__Impl rule__Poison__Group__6
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
    // InternalRangoMode.g:3136:1: rule__Poison__Group__5__Impl : ( 'for' ) ;
    public final void rule__Poison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3140:1: ( ( 'for' ) )
            // InternalRangoMode.g:3141:1: ( 'for' )
            {
            // InternalRangoMode.g:3141:1: ( 'for' )
            // InternalRangoMode.g:3142:2: 'for'
            {
             before(grammarAccess.getPoisonAccess().getForKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRangoMode.g:3151:1: rule__Poison__Group__6 : rule__Poison__Group__6__Impl rule__Poison__Group__7 ;
    public final void rule__Poison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3155:1: ( rule__Poison__Group__6__Impl rule__Poison__Group__7 )
            // InternalRangoMode.g:3156:2: rule__Poison__Group__6__Impl rule__Poison__Group__7
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
    // InternalRangoMode.g:3163:1: rule__Poison__Group__6__Impl : ( ( rule__Poison__DurationAssignment_6 ) ) ;
    public final void rule__Poison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3167:1: ( ( ( rule__Poison__DurationAssignment_6 ) ) )
            // InternalRangoMode.g:3168:1: ( ( rule__Poison__DurationAssignment_6 ) )
            {
            // InternalRangoMode.g:3168:1: ( ( rule__Poison__DurationAssignment_6 ) )
            // InternalRangoMode.g:3169:2: ( rule__Poison__DurationAssignment_6 )
            {
             before(grammarAccess.getPoisonAccess().getDurationAssignment_6()); 
            // InternalRangoMode.g:3170:2: ( rule__Poison__DurationAssignment_6 )
            // InternalRangoMode.g:3170:3: rule__Poison__DurationAssignment_6
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
    // InternalRangoMode.g:3178:1: rule__Poison__Group__7 : rule__Poison__Group__7__Impl ;
    public final void rule__Poison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3182:1: ( rule__Poison__Group__7__Impl )
            // InternalRangoMode.g:3183:2: rule__Poison__Group__7__Impl
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
    // InternalRangoMode.g:3189:1: rule__Poison__Group__7__Impl : ( 's' ) ;
    public final void rule__Poison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3193:1: ( ( 's' ) )
            // InternalRangoMode.g:3194:1: ( 's' )
            {
            // InternalRangoMode.g:3194:1: ( 's' )
            // InternalRangoMode.g:3195:2: 's'
            {
             before(grammarAccess.getPoisonAccess().getSKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:3205:1: rule__PowerUp__Group__0 : rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 ;
    public final void rule__PowerUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3209:1: ( rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1 )
            // InternalRangoMode.g:3210:2: rule__PowerUp__Group__0__Impl rule__PowerUp__Group__1
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
    // InternalRangoMode.g:3217:1: rule__PowerUp__Group__0__Impl : ( 'powerup' ) ;
    public final void rule__PowerUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3221:1: ( ( 'powerup' ) )
            // InternalRangoMode.g:3222:1: ( 'powerup' )
            {
            // InternalRangoMode.g:3222:1: ( 'powerup' )
            // InternalRangoMode.g:3223:2: 'powerup'
            {
             before(grammarAccess.getPowerUpAccess().getPowerupKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRangoMode.g:3232:1: rule__PowerUp__Group__1 : rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 ;
    public final void rule__PowerUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3236:1: ( rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2 )
            // InternalRangoMode.g:3237:2: rule__PowerUp__Group__1__Impl rule__PowerUp__Group__2
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
    // InternalRangoMode.g:3244:1: rule__PowerUp__Group__1__Impl : ( ( rule__PowerUp__NameAssignment_1 ) ) ;
    public final void rule__PowerUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3248:1: ( ( ( rule__PowerUp__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3249:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3249:1: ( ( rule__PowerUp__NameAssignment_1 ) )
            // InternalRangoMode.g:3250:2: ( rule__PowerUp__NameAssignment_1 )
            {
             before(grammarAccess.getPowerUpAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3251:2: ( rule__PowerUp__NameAssignment_1 )
            // InternalRangoMode.g:3251:3: rule__PowerUp__NameAssignment_1
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
    // InternalRangoMode.g:3259:1: rule__PowerUp__Group__2 : rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 ;
    public final void rule__PowerUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3263:1: ( rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3 )
            // InternalRangoMode.g:3264:2: rule__PowerUp__Group__2__Impl rule__PowerUp__Group__3
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
    // InternalRangoMode.g:3271:1: rule__PowerUp__Group__2__Impl : ( '{' ) ;
    public final void rule__PowerUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3275:1: ( ( '{' ) )
            // InternalRangoMode.g:3276:1: ( '{' )
            {
            // InternalRangoMode.g:3276:1: ( '{' )
            // InternalRangoMode.g:3277:2: '{'
            {
             before(grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:3286:1: rule__PowerUp__Group__3 : rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 ;
    public final void rule__PowerUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3290:1: ( rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4 )
            // InternalRangoMode.g:3291:2: rule__PowerUp__Group__3__Impl rule__PowerUp__Group__4
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
    // InternalRangoMode.g:3298:1: rule__PowerUp__Group__3__Impl : ( 'sprite' ) ;
    public final void rule__PowerUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3302:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3303:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3303:1: ( 'sprite' )
            // InternalRangoMode.g:3304:2: 'sprite'
            {
             before(grammarAccess.getPowerUpAccess().getSpriteKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRangoMode.g:3313:1: rule__PowerUp__Group__4 : rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 ;
    public final void rule__PowerUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3317:1: ( rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5 )
            // InternalRangoMode.g:3318:2: rule__PowerUp__Group__4__Impl rule__PowerUp__Group__5
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
    // InternalRangoMode.g:3325:1: rule__PowerUp__Group__4__Impl : ( ( rule__PowerUp__SpriteAssignment_4 ) ) ;
    public final void rule__PowerUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3329:1: ( ( ( rule__PowerUp__SpriteAssignment_4 ) ) )
            // InternalRangoMode.g:3330:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            {
            // InternalRangoMode.g:3330:1: ( ( rule__PowerUp__SpriteAssignment_4 ) )
            // InternalRangoMode.g:3331:2: ( rule__PowerUp__SpriteAssignment_4 )
            {
             before(grammarAccess.getPowerUpAccess().getSpriteAssignment_4()); 
            // InternalRangoMode.g:3332:2: ( rule__PowerUp__SpriteAssignment_4 )
            // InternalRangoMode.g:3332:3: rule__PowerUp__SpriteAssignment_4
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
    // InternalRangoMode.g:3340:1: rule__PowerUp__Group__5 : rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 ;
    public final void rule__PowerUp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3344:1: ( rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6 )
            // InternalRangoMode.g:3345:2: rule__PowerUp__Group__5__Impl rule__PowerUp__Group__6
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
    // InternalRangoMode.g:3352:1: rule__PowerUp__Group__5__Impl : ( 'gives' ) ;
    public final void rule__PowerUp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3356:1: ( ( 'gives' ) )
            // InternalRangoMode.g:3357:1: ( 'gives' )
            {
            // InternalRangoMode.g:3357:1: ( 'gives' )
            // InternalRangoMode.g:3358:2: 'gives'
            {
             before(grammarAccess.getPowerUpAccess().getGivesKeyword_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRangoMode.g:3367:1: rule__PowerUp__Group__6 : rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 ;
    public final void rule__PowerUp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3371:1: ( rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7 )
            // InternalRangoMode.g:3372:2: rule__PowerUp__Group__6__Impl rule__PowerUp__Group__7
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
    // InternalRangoMode.g:3379:1: rule__PowerUp__Group__6__Impl : ( ':' ) ;
    public final void rule__PowerUp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3383:1: ( ( ':' ) )
            // InternalRangoMode.g:3384:1: ( ':' )
            {
            // InternalRangoMode.g:3384:1: ( ':' )
            // InternalRangoMode.g:3385:2: ':'
            {
             before(grammarAccess.getPowerUpAccess().getColonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRangoMode.g:3394:1: rule__PowerUp__Group__7 : rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 ;
    public final void rule__PowerUp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3398:1: ( rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8 )
            // InternalRangoMode.g:3399:2: rule__PowerUp__Group__7__Impl rule__PowerUp__Group__8
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
    // InternalRangoMode.g:3406:1: rule__PowerUp__Group__7__Impl : ( ( rule__PowerUp__EffectsAssignment_7 ) ) ;
    public final void rule__PowerUp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3410:1: ( ( ( rule__PowerUp__EffectsAssignment_7 ) ) )
            // InternalRangoMode.g:3411:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            {
            // InternalRangoMode.g:3411:1: ( ( rule__PowerUp__EffectsAssignment_7 ) )
            // InternalRangoMode.g:3412:2: ( rule__PowerUp__EffectsAssignment_7 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_7()); 
            // InternalRangoMode.g:3413:2: ( rule__PowerUp__EffectsAssignment_7 )
            // InternalRangoMode.g:3413:3: rule__PowerUp__EffectsAssignment_7
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
    // InternalRangoMode.g:3421:1: rule__PowerUp__Group__8 : rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 ;
    public final void rule__PowerUp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3425:1: ( rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9 )
            // InternalRangoMode.g:3426:2: rule__PowerUp__Group__8__Impl rule__PowerUp__Group__9
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
    // InternalRangoMode.g:3433:1: rule__PowerUp__Group__8__Impl : ( ( rule__PowerUp__Group_8__0 )* ) ;
    public final void rule__PowerUp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3437:1: ( ( ( rule__PowerUp__Group_8__0 )* ) )
            // InternalRangoMode.g:3438:1: ( ( rule__PowerUp__Group_8__0 )* )
            {
            // InternalRangoMode.g:3438:1: ( ( rule__PowerUp__Group_8__0 )* )
            // InternalRangoMode.g:3439:2: ( rule__PowerUp__Group_8__0 )*
            {
             before(grammarAccess.getPowerUpAccess().getGroup_8()); 
            // InternalRangoMode.g:3440:2: ( rule__PowerUp__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRangoMode.g:3440:3: rule__PowerUp__Group_8__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PowerUp__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRangoMode.g:3448:1: rule__PowerUp__Group__9 : rule__PowerUp__Group__9__Impl ;
    public final void rule__PowerUp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3452:1: ( rule__PowerUp__Group__9__Impl )
            // InternalRangoMode.g:3453:2: rule__PowerUp__Group__9__Impl
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
    // InternalRangoMode.g:3459:1: rule__PowerUp__Group__9__Impl : ( '}' ) ;
    public final void rule__PowerUp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3463:1: ( ( '}' ) )
            // InternalRangoMode.g:3464:1: ( '}' )
            {
            // InternalRangoMode.g:3464:1: ( '}' )
            // InternalRangoMode.g:3465:2: '}'
            {
             before(grammarAccess.getPowerUpAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:3475:1: rule__PowerUp__Group_8__0 : rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 ;
    public final void rule__PowerUp__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3479:1: ( rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1 )
            // InternalRangoMode.g:3480:2: rule__PowerUp__Group_8__0__Impl rule__PowerUp__Group_8__1
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
    // InternalRangoMode.g:3487:1: rule__PowerUp__Group_8__0__Impl : ( ',' ) ;
    public final void rule__PowerUp__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3491:1: ( ( ',' ) )
            // InternalRangoMode.g:3492:1: ( ',' )
            {
            // InternalRangoMode.g:3492:1: ( ',' )
            // InternalRangoMode.g:3493:2: ','
            {
             before(grammarAccess.getPowerUpAccess().getCommaKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRangoMode.g:3502:1: rule__PowerUp__Group_8__1 : rule__PowerUp__Group_8__1__Impl ;
    public final void rule__PowerUp__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3506:1: ( rule__PowerUp__Group_8__1__Impl )
            // InternalRangoMode.g:3507:2: rule__PowerUp__Group_8__1__Impl
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
    // InternalRangoMode.g:3513:1: rule__PowerUp__Group_8__1__Impl : ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) ;
    public final void rule__PowerUp__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3517:1: ( ( ( rule__PowerUp__EffectsAssignment_8_1 ) ) )
            // InternalRangoMode.g:3518:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            {
            // InternalRangoMode.g:3518:1: ( ( rule__PowerUp__EffectsAssignment_8_1 ) )
            // InternalRangoMode.g:3519:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            {
             before(grammarAccess.getPowerUpAccess().getEffectsAssignment_8_1()); 
            // InternalRangoMode.g:3520:2: ( rule__PowerUp__EffectsAssignment_8_1 )
            // InternalRangoMode.g:3520:3: rule__PowerUp__EffectsAssignment_8_1
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
    // InternalRangoMode.g:3529:1: rule__Material__Group__0 : rule__Material__Group__0__Impl rule__Material__Group__1 ;
    public final void rule__Material__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3533:1: ( rule__Material__Group__0__Impl rule__Material__Group__1 )
            // InternalRangoMode.g:3534:2: rule__Material__Group__0__Impl rule__Material__Group__1
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
    // InternalRangoMode.g:3541:1: rule__Material__Group__0__Impl : ( 'material' ) ;
    public final void rule__Material__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3545:1: ( ( 'material' ) )
            // InternalRangoMode.g:3546:1: ( 'material' )
            {
            // InternalRangoMode.g:3546:1: ( 'material' )
            // InternalRangoMode.g:3547:2: 'material'
            {
             before(grammarAccess.getMaterialAccess().getMaterialKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRangoMode.g:3556:1: rule__Material__Group__1 : rule__Material__Group__1__Impl rule__Material__Group__2 ;
    public final void rule__Material__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3560:1: ( rule__Material__Group__1__Impl rule__Material__Group__2 )
            // InternalRangoMode.g:3561:2: rule__Material__Group__1__Impl rule__Material__Group__2
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
    // InternalRangoMode.g:3568:1: rule__Material__Group__1__Impl : ( ( rule__Material__NameAssignment_1 ) ) ;
    public final void rule__Material__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3572:1: ( ( ( rule__Material__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3573:1: ( ( rule__Material__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3573:1: ( ( rule__Material__NameAssignment_1 ) )
            // InternalRangoMode.g:3574:2: ( rule__Material__NameAssignment_1 )
            {
             before(grammarAccess.getMaterialAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3575:2: ( rule__Material__NameAssignment_1 )
            // InternalRangoMode.g:3575:3: rule__Material__NameAssignment_1
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
    // InternalRangoMode.g:3583:1: rule__Material__Group__2 : rule__Material__Group__2__Impl rule__Material__Group__3 ;
    public final void rule__Material__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3587:1: ( rule__Material__Group__2__Impl rule__Material__Group__3 )
            // InternalRangoMode.g:3588:2: rule__Material__Group__2__Impl rule__Material__Group__3
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
    // InternalRangoMode.g:3595:1: rule__Material__Group__2__Impl : ( '{' ) ;
    public final void rule__Material__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3599:1: ( ( '{' ) )
            // InternalRangoMode.g:3600:1: ( '{' )
            {
            // InternalRangoMode.g:3600:1: ( '{' )
            // InternalRangoMode.g:3601:2: '{'
            {
             before(grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:3610:1: rule__Material__Group__3 : rule__Material__Group__3__Impl rule__Material__Group__4 ;
    public final void rule__Material__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3614:1: ( rule__Material__Group__3__Impl rule__Material__Group__4 )
            // InternalRangoMode.g:3615:2: rule__Material__Group__3__Impl rule__Material__Group__4
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
    // InternalRangoMode.g:3622:1: rule__Material__Group__3__Impl : ( ( rule__Material__UnorderedGroup_3 ) ) ;
    public final void rule__Material__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3626:1: ( ( ( rule__Material__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3627:1: ( ( rule__Material__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3627:1: ( ( rule__Material__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3628:2: ( rule__Material__UnorderedGroup_3 )
            {
             before(grammarAccess.getMaterialAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3629:2: ( rule__Material__UnorderedGroup_3 )
            // InternalRangoMode.g:3629:3: rule__Material__UnorderedGroup_3
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
    // InternalRangoMode.g:3637:1: rule__Material__Group__4 : rule__Material__Group__4__Impl ;
    public final void rule__Material__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3641:1: ( rule__Material__Group__4__Impl )
            // InternalRangoMode.g:3642:2: rule__Material__Group__4__Impl
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
    // InternalRangoMode.g:3648:1: rule__Material__Group__4__Impl : ( '}' ) ;
    public final void rule__Material__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3652:1: ( ( '}' ) )
            // InternalRangoMode.g:3653:1: ( '}' )
            {
            // InternalRangoMode.g:3653:1: ( '}' )
            // InternalRangoMode.g:3654:2: '}'
            {
             before(grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:3664:1: rule__Material__Group_3_0__0 : rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 ;
    public final void rule__Material__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3668:1: ( rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1 )
            // InternalRangoMode.g:3669:2: rule__Material__Group_3_0__0__Impl rule__Material__Group_3_0__1
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
    // InternalRangoMode.g:3676:1: rule__Material__Group_3_0__0__Impl : ( 'bounce' ) ;
    public final void rule__Material__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3680:1: ( ( 'bounce' ) )
            // InternalRangoMode.g:3681:1: ( 'bounce' )
            {
            // InternalRangoMode.g:3681:1: ( 'bounce' )
            // InternalRangoMode.g:3682:2: 'bounce'
            {
             before(grammarAccess.getMaterialAccess().getBounceKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRangoMode.g:3691:1: rule__Material__Group_3_0__1 : rule__Material__Group_3_0__1__Impl ;
    public final void rule__Material__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3695:1: ( rule__Material__Group_3_0__1__Impl )
            // InternalRangoMode.g:3696:2: rule__Material__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3702:1: rule__Material__Group_3_0__1__Impl : ( ( rule__Material__BounceAssignment_3_0_1 ) ) ;
    public final void rule__Material__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3706:1: ( ( ( rule__Material__BounceAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3707:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3707:1: ( ( rule__Material__BounceAssignment_3_0_1 ) )
            // InternalRangoMode.g:3708:2: ( rule__Material__BounceAssignment_3_0_1 )
            {
             before(grammarAccess.getMaterialAccess().getBounceAssignment_3_0_1()); 
            // InternalRangoMode.g:3709:2: ( rule__Material__BounceAssignment_3_0_1 )
            // InternalRangoMode.g:3709:3: rule__Material__BounceAssignment_3_0_1
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
    // InternalRangoMode.g:3718:1: rule__Material__Group_3_1__0 : rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 ;
    public final void rule__Material__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3722:1: ( rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1 )
            // InternalRangoMode.g:3723:2: rule__Material__Group_3_1__0__Impl rule__Material__Group_3_1__1
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
    // InternalRangoMode.g:3730:1: rule__Material__Group_3_1__0__Impl : ( 'sprite' ) ;
    public final void rule__Material__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3734:1: ( ( 'sprite' ) )
            // InternalRangoMode.g:3735:1: ( 'sprite' )
            {
            // InternalRangoMode.g:3735:1: ( 'sprite' )
            // InternalRangoMode.g:3736:2: 'sprite'
            {
             before(grammarAccess.getMaterialAccess().getSpriteKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRangoMode.g:3745:1: rule__Material__Group_3_1__1 : rule__Material__Group_3_1__1__Impl ;
    public final void rule__Material__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3749:1: ( rule__Material__Group_3_1__1__Impl )
            // InternalRangoMode.g:3750:2: rule__Material__Group_3_1__1__Impl
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
    // InternalRangoMode.g:3756:1: rule__Material__Group_3_1__1__Impl : ( ( rule__Material__SpriteAssignment_3_1_1 ) ) ;
    public final void rule__Material__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3760:1: ( ( ( rule__Material__SpriteAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:3761:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:3761:1: ( ( rule__Material__SpriteAssignment_3_1_1 ) )
            // InternalRangoMode.g:3762:2: ( rule__Material__SpriteAssignment_3_1_1 )
            {
             before(grammarAccess.getMaterialAccess().getSpriteAssignment_3_1_1()); 
            // InternalRangoMode.g:3763:2: ( rule__Material__SpriteAssignment_3_1_1 )
            // InternalRangoMode.g:3763:3: rule__Material__SpriteAssignment_3_1_1
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
    // InternalRangoMode.g:3772:1: rule__PlayerProfile__Group__0 : rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 ;
    public final void rule__PlayerProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3776:1: ( rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1 )
            // InternalRangoMode.g:3777:2: rule__PlayerProfile__Group__0__Impl rule__PlayerProfile__Group__1
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
    // InternalRangoMode.g:3784:1: rule__PlayerProfile__Group__0__Impl : ( 'player' ) ;
    public final void rule__PlayerProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3788:1: ( ( 'player' ) )
            // InternalRangoMode.g:3789:1: ( 'player' )
            {
            // InternalRangoMode.g:3789:1: ( 'player' )
            // InternalRangoMode.g:3790:2: 'player'
            {
             before(grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalRangoMode.g:3799:1: rule__PlayerProfile__Group__1 : rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 ;
    public final void rule__PlayerProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3803:1: ( rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2 )
            // InternalRangoMode.g:3804:2: rule__PlayerProfile__Group__1__Impl rule__PlayerProfile__Group__2
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
    // InternalRangoMode.g:3811:1: rule__PlayerProfile__Group__1__Impl : ( ( rule__PlayerProfile__NameAssignment_1 ) ) ;
    public final void rule__PlayerProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3815:1: ( ( ( rule__PlayerProfile__NameAssignment_1 ) ) )
            // InternalRangoMode.g:3816:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:3816:1: ( ( rule__PlayerProfile__NameAssignment_1 ) )
            // InternalRangoMode.g:3817:2: ( rule__PlayerProfile__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:3818:2: ( rule__PlayerProfile__NameAssignment_1 )
            // InternalRangoMode.g:3818:3: rule__PlayerProfile__NameAssignment_1
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
    // InternalRangoMode.g:3826:1: rule__PlayerProfile__Group__2 : rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 ;
    public final void rule__PlayerProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3830:1: ( rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3 )
            // InternalRangoMode.g:3831:2: rule__PlayerProfile__Group__2__Impl rule__PlayerProfile__Group__3
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
    // InternalRangoMode.g:3838:1: rule__PlayerProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__PlayerProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3842:1: ( ( '{' ) )
            // InternalRangoMode.g:3843:1: ( '{' )
            {
            // InternalRangoMode.g:3843:1: ( '{' )
            // InternalRangoMode.g:3844:2: '{'
            {
             before(grammarAccess.getPlayerProfileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:3853:1: rule__PlayerProfile__Group__3 : rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 ;
    public final void rule__PlayerProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3857:1: ( rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4 )
            // InternalRangoMode.g:3858:2: rule__PlayerProfile__Group__3__Impl rule__PlayerProfile__Group__4
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
    // InternalRangoMode.g:3865:1: rule__PlayerProfile__Group__3__Impl : ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) ;
    public final void rule__PlayerProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3869:1: ( ( ( rule__PlayerProfile__UnorderedGroup_3 ) ) )
            // InternalRangoMode.g:3870:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            {
            // InternalRangoMode.g:3870:1: ( ( rule__PlayerProfile__UnorderedGroup_3 ) )
            // InternalRangoMode.g:3871:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            {
             before(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()); 
            // InternalRangoMode.g:3872:2: ( rule__PlayerProfile__UnorderedGroup_3 )
            // InternalRangoMode.g:3872:3: rule__PlayerProfile__UnorderedGroup_3
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
    // InternalRangoMode.g:3880:1: rule__PlayerProfile__Group__4 : rule__PlayerProfile__Group__4__Impl ;
    public final void rule__PlayerProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3884:1: ( rule__PlayerProfile__Group__4__Impl )
            // InternalRangoMode.g:3885:2: rule__PlayerProfile__Group__4__Impl
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
    // InternalRangoMode.g:3891:1: rule__PlayerProfile__Group__4__Impl : ( '}' ) ;
    public final void rule__PlayerProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3895:1: ( ( '}' ) )
            // InternalRangoMode.g:3896:1: ( '}' )
            {
            // InternalRangoMode.g:3896:1: ( '}' )
            // InternalRangoMode.g:3897:2: '}'
            {
             before(grammarAccess.getPlayerProfileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:3907:1: rule__PlayerProfile__Group_3_0__0 : rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 ;
    public final void rule__PlayerProfile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3911:1: ( rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1 )
            // InternalRangoMode.g:3912:2: rule__PlayerProfile__Group_3_0__0__Impl rule__PlayerProfile__Group_3_0__1
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
    // InternalRangoMode.g:3919:1: rule__PlayerProfile__Group_3_0__0__Impl : ( 'character' ) ;
    public final void rule__PlayerProfile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3923:1: ( ( 'character' ) )
            // InternalRangoMode.g:3924:1: ( 'character' )
            {
            // InternalRangoMode.g:3924:1: ( 'character' )
            // InternalRangoMode.g:3925:2: 'character'
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRangoMode.g:3934:1: rule__PlayerProfile__Group_3_0__1 : rule__PlayerProfile__Group_3_0__1__Impl ;
    public final void rule__PlayerProfile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3938:1: ( rule__PlayerProfile__Group_3_0__1__Impl )
            // InternalRangoMode.g:3939:2: rule__PlayerProfile__Group_3_0__1__Impl
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
    // InternalRangoMode.g:3945:1: rule__PlayerProfile__Group_3_0__1__Impl : ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3949:1: ( ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) ) )
            // InternalRangoMode.g:3950:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            {
            // InternalRangoMode.g:3950:1: ( ( rule__PlayerProfile__CharacterAssignment_3_0_1 ) )
            // InternalRangoMode.g:3951:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCharacterAssignment_3_0_1()); 
            // InternalRangoMode.g:3952:2: ( rule__PlayerProfile__CharacterAssignment_3_0_1 )
            // InternalRangoMode.g:3952:3: rule__PlayerProfile__CharacterAssignment_3_0_1
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
    // InternalRangoMode.g:3961:1: rule__PlayerProfile__Group_3_1__0 : rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 ;
    public final void rule__PlayerProfile__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3965:1: ( rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1 )
            // InternalRangoMode.g:3966:2: rule__PlayerProfile__Group_3_1__0__Impl rule__PlayerProfile__Group_3_1__1
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
    // InternalRangoMode.g:3973:1: rule__PlayerProfile__Group_3_1__0__Impl : ( 'health' ) ;
    public final void rule__PlayerProfile__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3977:1: ( ( 'health' ) )
            // InternalRangoMode.g:3978:1: ( 'health' )
            {
            // InternalRangoMode.g:3978:1: ( 'health' )
            // InternalRangoMode.g:3979:2: 'health'
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRangoMode.g:3988:1: rule__PlayerProfile__Group_3_1__1 : rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 ;
    public final void rule__PlayerProfile__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:3992:1: ( rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2 )
            // InternalRangoMode.g:3993:2: rule__PlayerProfile__Group_3_1__1__Impl rule__PlayerProfile__Group_3_1__2
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
    // InternalRangoMode.g:4000:1: rule__PlayerProfile__Group_3_1__1__Impl : ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4004:1: ( ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) ) )
            // InternalRangoMode.g:4005:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            {
            // InternalRangoMode.g:4005:1: ( ( rule__PlayerProfile__HealthAssignment_3_1_1 ) )
            // InternalRangoMode.g:4006:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getHealthAssignment_3_1_1()); 
            // InternalRangoMode.g:4007:2: ( rule__PlayerProfile__HealthAssignment_3_1_1 )
            // InternalRangoMode.g:4007:3: rule__PlayerProfile__HealthAssignment_3_1_1
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
    // InternalRangoMode.g:4015:1: rule__PlayerProfile__Group_3_1__2 : rule__PlayerProfile__Group_3_1__2__Impl ;
    public final void rule__PlayerProfile__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4019:1: ( rule__PlayerProfile__Group_3_1__2__Impl )
            // InternalRangoMode.g:4020:2: rule__PlayerProfile__Group_3_1__2__Impl
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
    // InternalRangoMode.g:4026:1: rule__PlayerProfile__Group_3_1__2__Impl : ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) ;
    public final void rule__PlayerProfile__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4030:1: ( ( ( rule__PlayerProfile__Group_3_1_2__0 )? ) )
            // InternalRangoMode.g:4031:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            {
            // InternalRangoMode.g:4031:1: ( ( rule__PlayerProfile__Group_3_1_2__0 )? )
            // InternalRangoMode.g:4032:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            {
             before(grammarAccess.getPlayerProfileAccess().getGroup_3_1_2()); 
            // InternalRangoMode.g:4033:2: ( rule__PlayerProfile__Group_3_1_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRangoMode.g:4033:3: rule__PlayerProfile__Group_3_1_2__0
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
    // InternalRangoMode.g:4042:1: rule__PlayerProfile__Group_3_1_2__0 : rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 ;
    public final void rule__PlayerProfile__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4046:1: ( rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1 )
            // InternalRangoMode.g:4047:2: rule__PlayerProfile__Group_3_1_2__0__Impl rule__PlayerProfile__Group_3_1_2__1
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
    // InternalRangoMode.g:4054:1: rule__PlayerProfile__Group_3_1_2__0__Impl : ( 'max' ) ;
    public final void rule__PlayerProfile__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4058:1: ( ( 'max' ) )
            // InternalRangoMode.g:4059:1: ( 'max' )
            {
            // InternalRangoMode.g:4059:1: ( 'max' )
            // InternalRangoMode.g:4060:2: 'max'
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalRangoMode.g:4069:1: rule__PlayerProfile__Group_3_1_2__1 : rule__PlayerProfile__Group_3_1_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4073:1: ( rule__PlayerProfile__Group_3_1_2__1__Impl )
            // InternalRangoMode.g:4074:2: rule__PlayerProfile__Group_3_1_2__1__Impl
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
    // InternalRangoMode.g:4080:1: rule__PlayerProfile__Group_3_1_2__1__Impl : ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4084:1: ( ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) ) )
            // InternalRangoMode.g:4085:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            {
            // InternalRangoMode.g:4085:1: ( ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 ) )
            // InternalRangoMode.g:4086:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getMaxHealthAssignment_3_1_2_1()); 
            // InternalRangoMode.g:4087:2: ( rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 )
            // InternalRangoMode.g:4087:3: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1
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
    // InternalRangoMode.g:4096:1: rule__PlayerProfile__Group_3_2__0 : rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 ;
    public final void rule__PlayerProfile__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4100:1: ( rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1 )
            // InternalRangoMode.g:4101:2: rule__PlayerProfile__Group_3_2__0__Impl rule__PlayerProfile__Group_3_2__1
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
    // InternalRangoMode.g:4108:1: rule__PlayerProfile__Group_3_2__0__Impl : ( 'speed' ) ;
    public final void rule__PlayerProfile__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4112:1: ( ( 'speed' ) )
            // InternalRangoMode.g:4113:1: ( 'speed' )
            {
            // InternalRangoMode.g:4113:1: ( 'speed' )
            // InternalRangoMode.g:4114:2: 'speed'
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRangoMode.g:4123:1: rule__PlayerProfile__Group_3_2__1 : rule__PlayerProfile__Group_3_2__1__Impl ;
    public final void rule__PlayerProfile__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4127:1: ( rule__PlayerProfile__Group_3_2__1__Impl )
            // InternalRangoMode.g:4128:2: rule__PlayerProfile__Group_3_2__1__Impl
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
    // InternalRangoMode.g:4134:1: rule__PlayerProfile__Group_3_2__1__Impl : ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4138:1: ( ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) ) )
            // InternalRangoMode.g:4139:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            {
            // InternalRangoMode.g:4139:1: ( ( rule__PlayerProfile__SpeedAssignment_3_2_1 ) )
            // InternalRangoMode.g:4140:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getSpeedAssignment_3_2_1()); 
            // InternalRangoMode.g:4141:2: ( rule__PlayerProfile__SpeedAssignment_3_2_1 )
            // InternalRangoMode.g:4141:3: rule__PlayerProfile__SpeedAssignment_3_2_1
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
    // InternalRangoMode.g:4150:1: rule__PlayerProfile__Group_3_3__0 : rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 ;
    public final void rule__PlayerProfile__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4154:1: ( rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1 )
            // InternalRangoMode.g:4155:2: rule__PlayerProfile__Group_3_3__0__Impl rule__PlayerProfile__Group_3_3__1
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
    // InternalRangoMode.g:4162:1: rule__PlayerProfile__Group_3_3__0__Impl : ( 'tongue' ) ;
    public final void rule__PlayerProfile__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4166:1: ( ( 'tongue' ) )
            // InternalRangoMode.g:4167:1: ( 'tongue' )
            {
            // InternalRangoMode.g:4167:1: ( 'tongue' )
            // InternalRangoMode.g:4168:2: 'tongue'
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalRangoMode.g:4177:1: rule__PlayerProfile__Group_3_3__1 : rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 ;
    public final void rule__PlayerProfile__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4181:1: ( rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2 )
            // InternalRangoMode.g:4182:2: rule__PlayerProfile__Group_3_3__1__Impl rule__PlayerProfile__Group_3_3__2
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
    // InternalRangoMode.g:4189:1: rule__PlayerProfile__Group_3_3__1__Impl : ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4193:1: ( ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) ) )
            // InternalRangoMode.g:4194:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            {
            // InternalRangoMode.g:4194:1: ( ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 ) )
            // InternalRangoMode.g:4195:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getTongueTimeAssignment_3_3_1()); 
            // InternalRangoMode.g:4196:2: ( rule__PlayerProfile__TongueTimeAssignment_3_3_1 )
            // InternalRangoMode.g:4196:3: rule__PlayerProfile__TongueTimeAssignment_3_3_1
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
    // InternalRangoMode.g:4204:1: rule__PlayerProfile__Group_3_3__2 : rule__PlayerProfile__Group_3_3__2__Impl ;
    public final void rule__PlayerProfile__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4208:1: ( rule__PlayerProfile__Group_3_3__2__Impl )
            // InternalRangoMode.g:4209:2: rule__PlayerProfile__Group_3_3__2__Impl
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
    // InternalRangoMode.g:4215:1: rule__PlayerProfile__Group_3_3__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4219:1: ( ( 's' ) )
            // InternalRangoMode.g:4220:1: ( 's' )
            {
            // InternalRangoMode.g:4220:1: ( 's' )
            // InternalRangoMode.g:4221:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:4231:1: rule__PlayerProfile__Group_3_4__0 : rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 ;
    public final void rule__PlayerProfile__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4235:1: ( rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1 )
            // InternalRangoMode.g:4236:2: rule__PlayerProfile__Group_3_4__0__Impl rule__PlayerProfile__Group_3_4__1
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
    // InternalRangoMode.g:4243:1: rule__PlayerProfile__Group_3_4__0__Impl : ( 'cooldown' ) ;
    public final void rule__PlayerProfile__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4247:1: ( ( 'cooldown' ) )
            // InternalRangoMode.g:4248:1: ( 'cooldown' )
            {
            // InternalRangoMode.g:4248:1: ( 'cooldown' )
            // InternalRangoMode.g:4249:2: 'cooldown'
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalRangoMode.g:4258:1: rule__PlayerProfile__Group_3_4__1 : rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 ;
    public final void rule__PlayerProfile__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4262:1: ( rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2 )
            // InternalRangoMode.g:4263:2: rule__PlayerProfile__Group_3_4__1__Impl rule__PlayerProfile__Group_3_4__2
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
    // InternalRangoMode.g:4270:1: rule__PlayerProfile__Group_3_4__1__Impl : ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4274:1: ( ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) ) )
            // InternalRangoMode.g:4275:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            {
            // InternalRangoMode.g:4275:1: ( ( rule__PlayerProfile__CooldownAssignment_3_4_1 ) )
            // InternalRangoMode.g:4276:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getCooldownAssignment_3_4_1()); 
            // InternalRangoMode.g:4277:2: ( rule__PlayerProfile__CooldownAssignment_3_4_1 )
            // InternalRangoMode.g:4277:3: rule__PlayerProfile__CooldownAssignment_3_4_1
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
    // InternalRangoMode.g:4285:1: rule__PlayerProfile__Group_3_4__2 : rule__PlayerProfile__Group_3_4__2__Impl ;
    public final void rule__PlayerProfile__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4289:1: ( rule__PlayerProfile__Group_3_4__2__Impl )
            // InternalRangoMode.g:4290:2: rule__PlayerProfile__Group_3_4__2__Impl
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
    // InternalRangoMode.g:4296:1: rule__PlayerProfile__Group_3_4__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4300:1: ( ( 's' ) )
            // InternalRangoMode.g:4301:1: ( 's' )
            {
            // InternalRangoMode.g:4301:1: ( 's' )
            // InternalRangoMode.g:4302:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:4312:1: rule__PlayerProfile__Group_3_5__0 : rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 ;
    public final void rule__PlayerProfile__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4316:1: ( rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1 )
            // InternalRangoMode.g:4317:2: rule__PlayerProfile__Group_3_5__0__Impl rule__PlayerProfile__Group_3_5__1
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
    // InternalRangoMode.g:4324:1: rule__PlayerProfile__Group_3_5__0__Impl : ( 'grace' ) ;
    public final void rule__PlayerProfile__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4328:1: ( ( 'grace' ) )
            // InternalRangoMode.g:4329:1: ( 'grace' )
            {
            // InternalRangoMode.g:4329:1: ( 'grace' )
            // InternalRangoMode.g:4330:2: 'grace'
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalRangoMode.g:4339:1: rule__PlayerProfile__Group_3_5__1 : rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 ;
    public final void rule__PlayerProfile__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4343:1: ( rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2 )
            // InternalRangoMode.g:4344:2: rule__PlayerProfile__Group_3_5__1__Impl rule__PlayerProfile__Group_3_5__2
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
    // InternalRangoMode.g:4351:1: rule__PlayerProfile__Group_3_5__1__Impl : ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) ;
    public final void rule__PlayerProfile__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4355:1: ( ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) ) )
            // InternalRangoMode.g:4356:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            {
            // InternalRangoMode.g:4356:1: ( ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 ) )
            // InternalRangoMode.g:4357:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            {
             before(grammarAccess.getPlayerProfileAccess().getGraceTimeAssignment_3_5_1()); 
            // InternalRangoMode.g:4358:2: ( rule__PlayerProfile__GraceTimeAssignment_3_5_1 )
            // InternalRangoMode.g:4358:3: rule__PlayerProfile__GraceTimeAssignment_3_5_1
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
    // InternalRangoMode.g:4366:1: rule__PlayerProfile__Group_3_5__2 : rule__PlayerProfile__Group_3_5__2__Impl ;
    public final void rule__PlayerProfile__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4370:1: ( rule__PlayerProfile__Group_3_5__2__Impl )
            // InternalRangoMode.g:4371:2: rule__PlayerProfile__Group_3_5__2__Impl
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
    // InternalRangoMode.g:4377:1: rule__PlayerProfile__Group_3_5__2__Impl : ( 's' ) ;
    public final void rule__PlayerProfile__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4381:1: ( ( 's' ) )
            // InternalRangoMode.g:4382:1: ( 's' )
            {
            // InternalRangoMode.g:4382:1: ( 's' )
            // InternalRangoMode.g:4383:2: 's'
            {
             before(grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:4393:1: rule__GameMode__Group__0 : rule__GameMode__Group__0__Impl rule__GameMode__Group__1 ;
    public final void rule__GameMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4397:1: ( rule__GameMode__Group__0__Impl rule__GameMode__Group__1 )
            // InternalRangoMode.g:4398:2: rule__GameMode__Group__0__Impl rule__GameMode__Group__1
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
    // InternalRangoMode.g:4405:1: rule__GameMode__Group__0__Impl : ( 'mode' ) ;
    public final void rule__GameMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4409:1: ( ( 'mode' ) )
            // InternalRangoMode.g:4410:1: ( 'mode' )
            {
            // InternalRangoMode.g:4410:1: ( 'mode' )
            // InternalRangoMode.g:4411:2: 'mode'
            {
             before(grammarAccess.getGameModeAccess().getModeKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalRangoMode.g:4420:1: rule__GameMode__Group__1 : rule__GameMode__Group__1__Impl rule__GameMode__Group__2 ;
    public final void rule__GameMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4424:1: ( rule__GameMode__Group__1__Impl rule__GameMode__Group__2 )
            // InternalRangoMode.g:4425:2: rule__GameMode__Group__1__Impl rule__GameMode__Group__2
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
    // InternalRangoMode.g:4432:1: rule__GameMode__Group__1__Impl : ( ( rule__GameMode__NameAssignment_1 ) ) ;
    public final void rule__GameMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4436:1: ( ( ( rule__GameMode__NameAssignment_1 ) ) )
            // InternalRangoMode.g:4437:1: ( ( rule__GameMode__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:4437:1: ( ( rule__GameMode__NameAssignment_1 ) )
            // InternalRangoMode.g:4438:2: ( rule__GameMode__NameAssignment_1 )
            {
             before(grammarAccess.getGameModeAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:4439:2: ( rule__GameMode__NameAssignment_1 )
            // InternalRangoMode.g:4439:3: rule__GameMode__NameAssignment_1
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
    // InternalRangoMode.g:4447:1: rule__GameMode__Group__2 : rule__GameMode__Group__2__Impl rule__GameMode__Group__3 ;
    public final void rule__GameMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4451:1: ( rule__GameMode__Group__2__Impl rule__GameMode__Group__3 )
            // InternalRangoMode.g:4452:2: rule__GameMode__Group__2__Impl rule__GameMode__Group__3
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
    // InternalRangoMode.g:4459:1: rule__GameMode__Group__2__Impl : ( ( rule__GameMode__TitleAssignment_2 ) ) ;
    public final void rule__GameMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4463:1: ( ( ( rule__GameMode__TitleAssignment_2 ) ) )
            // InternalRangoMode.g:4464:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            {
            // InternalRangoMode.g:4464:1: ( ( rule__GameMode__TitleAssignment_2 ) )
            // InternalRangoMode.g:4465:2: ( rule__GameMode__TitleAssignment_2 )
            {
             before(grammarAccess.getGameModeAccess().getTitleAssignment_2()); 
            // InternalRangoMode.g:4466:2: ( rule__GameMode__TitleAssignment_2 )
            // InternalRangoMode.g:4466:3: rule__GameMode__TitleAssignment_2
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
    // InternalRangoMode.g:4474:1: rule__GameMode__Group__3 : rule__GameMode__Group__3__Impl rule__GameMode__Group__4 ;
    public final void rule__GameMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4478:1: ( rule__GameMode__Group__3__Impl rule__GameMode__Group__4 )
            // InternalRangoMode.g:4479:2: rule__GameMode__Group__3__Impl rule__GameMode__Group__4
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
    // InternalRangoMode.g:4486:1: rule__GameMode__Group__3__Impl : ( '{' ) ;
    public final void rule__GameMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4490:1: ( ( '{' ) )
            // InternalRangoMode.g:4491:1: ( '{' )
            {
            // InternalRangoMode.g:4491:1: ( '{' )
            // InternalRangoMode.g:4492:2: '{'
            {
             before(grammarAccess.getGameModeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:4501:1: rule__GameMode__Group__4 : rule__GameMode__Group__4__Impl rule__GameMode__Group__5 ;
    public final void rule__GameMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4505:1: ( rule__GameMode__Group__4__Impl rule__GameMode__Group__5 )
            // InternalRangoMode.g:4506:2: rule__GameMode__Group__4__Impl rule__GameMode__Group__5
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
    // InternalRangoMode.g:4513:1: rule__GameMode__Group__4__Impl : ( ( rule__GameMode__Group_4__0 )? ) ;
    public final void rule__GameMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4517:1: ( ( ( rule__GameMode__Group_4__0 )? ) )
            // InternalRangoMode.g:4518:1: ( ( rule__GameMode__Group_4__0 )? )
            {
            // InternalRangoMode.g:4518:1: ( ( rule__GameMode__Group_4__0 )? )
            // InternalRangoMode.g:4519:2: ( rule__GameMode__Group_4__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_4()); 
            // InternalRangoMode.g:4520:2: ( rule__GameMode__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:4520:3: rule__GameMode__Group_4__0
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
    // InternalRangoMode.g:4528:1: rule__GameMode__Group__5 : rule__GameMode__Group__5__Impl rule__GameMode__Group__6 ;
    public final void rule__GameMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4532:1: ( rule__GameMode__Group__5__Impl rule__GameMode__Group__6 )
            // InternalRangoMode.g:4533:2: rule__GameMode__Group__5__Impl rule__GameMode__Group__6
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
    // InternalRangoMode.g:4540:1: rule__GameMode__Group__5__Impl : ( 'player' ) ;
    public final void rule__GameMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4544:1: ( ( 'player' ) )
            // InternalRangoMode.g:4545:1: ( 'player' )
            {
            // InternalRangoMode.g:4545:1: ( 'player' )
            // InternalRangoMode.g:4546:2: 'player'
            {
             before(grammarAccess.getGameModeAccess().getPlayerKeyword_5()); 
            match(input,15,FOLLOW_2); 
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
    // InternalRangoMode.g:4555:1: rule__GameMode__Group__6 : rule__GameMode__Group__6__Impl rule__GameMode__Group__7 ;
    public final void rule__GameMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4559:1: ( rule__GameMode__Group__6__Impl rule__GameMode__Group__7 )
            // InternalRangoMode.g:4560:2: rule__GameMode__Group__6__Impl rule__GameMode__Group__7
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
    // InternalRangoMode.g:4567:1: rule__GameMode__Group__6__Impl : ( ( rule__GameMode__PlayerAssignment_6 ) ) ;
    public final void rule__GameMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4571:1: ( ( ( rule__GameMode__PlayerAssignment_6 ) ) )
            // InternalRangoMode.g:4572:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            {
            // InternalRangoMode.g:4572:1: ( ( rule__GameMode__PlayerAssignment_6 ) )
            // InternalRangoMode.g:4573:2: ( rule__GameMode__PlayerAssignment_6 )
            {
             before(grammarAccess.getGameModeAccess().getPlayerAssignment_6()); 
            // InternalRangoMode.g:4574:2: ( rule__GameMode__PlayerAssignment_6 )
            // InternalRangoMode.g:4574:3: rule__GameMode__PlayerAssignment_6
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
    // InternalRangoMode.g:4582:1: rule__GameMode__Group__7 : rule__GameMode__Group__7__Impl rule__GameMode__Group__8 ;
    public final void rule__GameMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4586:1: ( rule__GameMode__Group__7__Impl rule__GameMode__Group__8 )
            // InternalRangoMode.g:4587:2: rule__GameMode__Group__7__Impl rule__GameMode__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalRangoMode.g:4594:1: rule__GameMode__Group__7__Impl : ( 'balls' ) ;
    public final void rule__GameMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4598:1: ( ( 'balls' ) )
            // InternalRangoMode.g:4599:1: ( 'balls' )
            {
            // InternalRangoMode.g:4599:1: ( 'balls' )
            // InternalRangoMode.g:4600:2: 'balls'
            {
             before(grammarAccess.getGameModeAccess().getBallsKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getBallsKeyword_7()); 

            }


            }

        }
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
    // InternalRangoMode.g:4609:1: rule__GameMode__Group__8 : rule__GameMode__Group__8__Impl rule__GameMode__Group__9 ;
    public final void rule__GameMode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4613:1: ( rule__GameMode__Group__8__Impl rule__GameMode__Group__9 )
            // InternalRangoMode.g:4614:2: rule__GameMode__Group__8__Impl rule__GameMode__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalRangoMode.g:4621:1: rule__GameMode__Group__8__Impl : ( ( rule__GameMode__BallTypesAssignment_8 ) ) ;
    public final void rule__GameMode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4625:1: ( ( ( rule__GameMode__BallTypesAssignment_8 ) ) )
            // InternalRangoMode.g:4626:1: ( ( rule__GameMode__BallTypesAssignment_8 ) )
            {
            // InternalRangoMode.g:4626:1: ( ( rule__GameMode__BallTypesAssignment_8 ) )
            // InternalRangoMode.g:4627:2: ( rule__GameMode__BallTypesAssignment_8 )
            {
             before(grammarAccess.getGameModeAccess().getBallTypesAssignment_8()); 
            // InternalRangoMode.g:4628:2: ( rule__GameMode__BallTypesAssignment_8 )
            // InternalRangoMode.g:4628:3: rule__GameMode__BallTypesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__BallTypesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getBallTypesAssignment_8()); 

            }


            }

        }
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
    // InternalRangoMode.g:4636:1: rule__GameMode__Group__9 : rule__GameMode__Group__9__Impl rule__GameMode__Group__10 ;
    public final void rule__GameMode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4640:1: ( rule__GameMode__Group__9__Impl rule__GameMode__Group__10 )
            // InternalRangoMode.g:4641:2: rule__GameMode__Group__9__Impl rule__GameMode__Group__10
            {
            pushFollow(FOLLOW_34);
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
    // InternalRangoMode.g:4648:1: rule__GameMode__Group__9__Impl : ( ( rule__GameMode__Group_9__0 )* ) ;
    public final void rule__GameMode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4652:1: ( ( ( rule__GameMode__Group_9__0 )* ) )
            // InternalRangoMode.g:4653:1: ( ( rule__GameMode__Group_9__0 )* )
            {
            // InternalRangoMode.g:4653:1: ( ( rule__GameMode__Group_9__0 )* )
            // InternalRangoMode.g:4654:2: ( rule__GameMode__Group_9__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_9()); 
            // InternalRangoMode.g:4655:2: ( rule__GameMode__Group_9__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRangoMode.g:4655:3: rule__GameMode__Group_9__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GameMode__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalRangoMode.g:4663:1: rule__GameMode__Group__10 : rule__GameMode__Group__10__Impl rule__GameMode__Group__11 ;
    public final void rule__GameMode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4667:1: ( rule__GameMode__Group__10__Impl rule__GameMode__Group__11 )
            // InternalRangoMode.g:4668:2: rule__GameMode__Group__10__Impl rule__GameMode__Group__11
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
    // InternalRangoMode.g:4675:1: rule__GameMode__Group__10__Impl : ( ( rule__GameMode__UnorderedGroup_10 ) ) ;
    public final void rule__GameMode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4679:1: ( ( ( rule__GameMode__UnorderedGroup_10 ) ) )
            // InternalRangoMode.g:4680:1: ( ( rule__GameMode__UnorderedGroup_10 ) )
            {
            // InternalRangoMode.g:4680:1: ( ( rule__GameMode__UnorderedGroup_10 ) )
            // InternalRangoMode.g:4681:2: ( rule__GameMode__UnorderedGroup_10 )
            {
             before(grammarAccess.getGameModeAccess().getUnorderedGroup_10()); 
            // InternalRangoMode.g:4682:2: ( rule__GameMode__UnorderedGroup_10 )
            // InternalRangoMode.g:4682:3: rule__GameMode__UnorderedGroup_10
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__UnorderedGroup_10();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getUnorderedGroup_10()); 

            }


            }

        }
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
    // InternalRangoMode.g:4690:1: rule__GameMode__Group__11 : rule__GameMode__Group__11__Impl rule__GameMode__Group__12 ;
    public final void rule__GameMode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4694:1: ( rule__GameMode__Group__11__Impl rule__GameMode__Group__12 )
            // InternalRangoMode.g:4695:2: rule__GameMode__Group__11__Impl rule__GameMode__Group__12
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
    // InternalRangoMode.g:4702:1: rule__GameMode__Group__11__Impl : ( ( rule__GameMode__ArenaAssignment_11 ) ) ;
    public final void rule__GameMode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4706:1: ( ( ( rule__GameMode__ArenaAssignment_11 ) ) )
            // InternalRangoMode.g:4707:1: ( ( rule__GameMode__ArenaAssignment_11 ) )
            {
            // InternalRangoMode.g:4707:1: ( ( rule__GameMode__ArenaAssignment_11 ) )
            // InternalRangoMode.g:4708:2: ( rule__GameMode__ArenaAssignment_11 )
            {
             before(grammarAccess.getGameModeAccess().getArenaAssignment_11()); 
            // InternalRangoMode.g:4709:2: ( rule__GameMode__ArenaAssignment_11 )
            // InternalRangoMode.g:4709:3: rule__GameMode__ArenaAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__ArenaAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getArenaAssignment_11()); 

            }


            }

        }
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
    // InternalRangoMode.g:4717:1: rule__GameMode__Group__12 : rule__GameMode__Group__12__Impl rule__GameMode__Group__13 ;
    public final void rule__GameMode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4721:1: ( rule__GameMode__Group__12__Impl rule__GameMode__Group__13 )
            // InternalRangoMode.g:4722:2: rule__GameMode__Group__12__Impl rule__GameMode__Group__13
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
    // InternalRangoMode.g:4729:1: rule__GameMode__Group__12__Impl : ( ( rule__GameMode__SpawningAssignment_12 ) ) ;
    public final void rule__GameMode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4733:1: ( ( ( rule__GameMode__SpawningAssignment_12 ) ) )
            // InternalRangoMode.g:4734:1: ( ( rule__GameMode__SpawningAssignment_12 ) )
            {
            // InternalRangoMode.g:4734:1: ( ( rule__GameMode__SpawningAssignment_12 ) )
            // InternalRangoMode.g:4735:2: ( rule__GameMode__SpawningAssignment_12 )
            {
             before(grammarAccess.getGameModeAccess().getSpawningAssignment_12()); 
            // InternalRangoMode.g:4736:2: ( rule__GameMode__SpawningAssignment_12 )
            // InternalRangoMode.g:4736:3: rule__GameMode__SpawningAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__SpawningAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getSpawningAssignment_12()); 

            }


            }

        }
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
    // InternalRangoMode.g:4744:1: rule__GameMode__Group__13 : rule__GameMode__Group__13__Impl rule__GameMode__Group__14 ;
    public final void rule__GameMode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4748:1: ( rule__GameMode__Group__13__Impl rule__GameMode__Group__14 )
            // InternalRangoMode.g:4749:2: rule__GameMode__Group__13__Impl rule__GameMode__Group__14
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4756:1: rule__GameMode__Group__13__Impl : ( ( rule__GameMode__DropsAssignment_13 )? ) ;
    public final void rule__GameMode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4760:1: ( ( ( rule__GameMode__DropsAssignment_13 )? ) )
            // InternalRangoMode.g:4761:1: ( ( rule__GameMode__DropsAssignment_13 )? )
            {
            // InternalRangoMode.g:4761:1: ( ( rule__GameMode__DropsAssignment_13 )? )
            // InternalRangoMode.g:4762:2: ( rule__GameMode__DropsAssignment_13 )?
            {
             before(grammarAccess.getGameModeAccess().getDropsAssignment_13()); 
            // InternalRangoMode.g:4763:2: ( rule__GameMode__DropsAssignment_13 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==85) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:4763:3: rule__GameMode__DropsAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__DropsAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameModeAccess().getDropsAssignment_13()); 

            }


            }

        }
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
    // InternalRangoMode.g:4771:1: rule__GameMode__Group__14 : rule__GameMode__Group__14__Impl rule__GameMode__Group__15 ;
    public final void rule__GameMode__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4775:1: ( rule__GameMode__Group__14__Impl rule__GameMode__Group__15 )
            // InternalRangoMode.g:4776:2: rule__GameMode__Group__14__Impl rule__GameMode__Group__15
            {
            pushFollow(FOLLOW_37);
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
    // InternalRangoMode.g:4783:1: rule__GameMode__Group__14__Impl : ( ( rule__GameMode__Group_14__0 )? ) ;
    public final void rule__GameMode__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4787:1: ( ( ( rule__GameMode__Group_14__0 )? ) )
            // InternalRangoMode.g:4788:1: ( ( rule__GameMode__Group_14__0 )? )
            {
            // InternalRangoMode.g:4788:1: ( ( rule__GameMode__Group_14__0 )? )
            // InternalRangoMode.g:4789:2: ( rule__GameMode__Group_14__0 )?
            {
             before(grammarAccess.getGameModeAccess().getGroup_14()); 
            // InternalRangoMode.g:4790:2: ( rule__GameMode__Group_14__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:4790:3: rule__GameMode__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalRangoMode.g:4798:1: rule__GameMode__Group__15 : rule__GameMode__Group__15__Impl rule__GameMode__Group__16 ;
    public final void rule__GameMode__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4802:1: ( rule__GameMode__Group__15__Impl rule__GameMode__Group__16 )
            // InternalRangoMode.g:4803:2: rule__GameMode__Group__15__Impl rule__GameMode__Group__16
            {
            pushFollow(FOLLOW_38);
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
    // InternalRangoMode.g:4810:1: rule__GameMode__Group__15__Impl : ( 'lose' ) ;
    public final void rule__GameMode__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4814:1: ( ( 'lose' ) )
            // InternalRangoMode.g:4815:1: ( 'lose' )
            {
            // InternalRangoMode.g:4815:1: ( 'lose' )
            // InternalRangoMode.g:4816:2: 'lose'
            {
             before(grammarAccess.getGameModeAccess().getLoseKeyword_15()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getLoseKeyword_15()); 

            }


            }

        }
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
    // InternalRangoMode.g:4825:1: rule__GameMode__Group__16 : rule__GameMode__Group__16__Impl rule__GameMode__Group__17 ;
    public final void rule__GameMode__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4829:1: ( rule__GameMode__Group__16__Impl rule__GameMode__Group__17 )
            // InternalRangoMode.g:4830:2: rule__GameMode__Group__16__Impl rule__GameMode__Group__17
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__17();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:4837:1: rule__GameMode__Group__16__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4841:1: ( ( 'when' ) )
            // InternalRangoMode.g:4842:1: ( 'when' )
            {
            // InternalRangoMode.g:4842:1: ( 'when' )
            // InternalRangoMode.g:4843:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_16()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__GameMode__Group__17"
    // InternalRangoMode.g:4852:1: rule__GameMode__Group__17 : rule__GameMode__Group__17__Impl rule__GameMode__Group__18 ;
    public final void rule__GameMode__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4856:1: ( rule__GameMode__Group__17__Impl rule__GameMode__Group__18 )
            // InternalRangoMode.g:4857:2: rule__GameMode__Group__17__Impl rule__GameMode__Group__18
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__17"


    // $ANTLR start "rule__GameMode__Group__17__Impl"
    // InternalRangoMode.g:4864:1: rule__GameMode__Group__17__Impl : ( ( rule__GameMode__LoseConditionsAssignment_17 ) ) ;
    public final void rule__GameMode__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4868:1: ( ( ( rule__GameMode__LoseConditionsAssignment_17 ) ) )
            // InternalRangoMode.g:4869:1: ( ( rule__GameMode__LoseConditionsAssignment_17 ) )
            {
            // InternalRangoMode.g:4869:1: ( ( rule__GameMode__LoseConditionsAssignment_17 ) )
            // InternalRangoMode.g:4870:2: ( rule__GameMode__LoseConditionsAssignment_17 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_17()); 
            // InternalRangoMode.g:4871:2: ( rule__GameMode__LoseConditionsAssignment_17 )
            // InternalRangoMode.g:4871:3: rule__GameMode__LoseConditionsAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__17__Impl"


    // $ANTLR start "rule__GameMode__Group__18"
    // InternalRangoMode.g:4879:1: rule__GameMode__Group__18 : rule__GameMode__Group__18__Impl rule__GameMode__Group__19 ;
    public final void rule__GameMode__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4883:1: ( rule__GameMode__Group__18__Impl rule__GameMode__Group__19 )
            // InternalRangoMode.g:4884:2: rule__GameMode__Group__18__Impl rule__GameMode__Group__19
            {
            pushFollow(FOLLOW_40);
            rule__GameMode__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__18"


    // $ANTLR start "rule__GameMode__Group__18__Impl"
    // InternalRangoMode.g:4891:1: rule__GameMode__Group__18__Impl : ( ( rule__GameMode__Group_18__0 )* ) ;
    public final void rule__GameMode__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4895:1: ( ( ( rule__GameMode__Group_18__0 )* ) )
            // InternalRangoMode.g:4896:1: ( ( rule__GameMode__Group_18__0 )* )
            {
            // InternalRangoMode.g:4896:1: ( ( rule__GameMode__Group_18__0 )* )
            // InternalRangoMode.g:4897:2: ( rule__GameMode__Group_18__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_18()); 
            // InternalRangoMode.g:4898:2: ( rule__GameMode__Group_18__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRangoMode.g:4898:3: rule__GameMode__Group_18__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__GameMode__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__18__Impl"


    // $ANTLR start "rule__GameMode__Group__19"
    // InternalRangoMode.g:4906:1: rule__GameMode__Group__19 : rule__GameMode__Group__19__Impl ;
    public final void rule__GameMode__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4910:1: ( rule__GameMode__Group__19__Impl )
            // InternalRangoMode.g:4911:2: rule__GameMode__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__19"


    // $ANTLR start "rule__GameMode__Group__19__Impl"
    // InternalRangoMode.g:4917:1: rule__GameMode__Group__19__Impl : ( '}' ) ;
    public final void rule__GameMode__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4921:1: ( ( '}' ) )
            // InternalRangoMode.g:4922:1: ( '}' )
            {
            // InternalRangoMode.g:4922:1: ( '}' )
            // InternalRangoMode.g:4923:2: '}'
            {
             before(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group__19__Impl"


    // $ANTLR start "rule__GameMode__Group_4__0"
    // InternalRangoMode.g:4933:1: rule__GameMode__Group_4__0 : rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 ;
    public final void rule__GameMode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4937:1: ( rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1 )
            // InternalRangoMode.g:4938:2: rule__GameMode__Group_4__0__Impl rule__GameMode__Group_4__1
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
    // InternalRangoMode.g:4945:1: rule__GameMode__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__GameMode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4949:1: ( ( 'description' ) )
            // InternalRangoMode.g:4950:1: ( 'description' )
            {
            // InternalRangoMode.g:4950:1: ( 'description' )
            // InternalRangoMode.g:4951:2: 'description'
            {
             before(grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalRangoMode.g:4960:1: rule__GameMode__Group_4__1 : rule__GameMode__Group_4__1__Impl ;
    public final void rule__GameMode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4964:1: ( rule__GameMode__Group_4__1__Impl )
            // InternalRangoMode.g:4965:2: rule__GameMode__Group_4__1__Impl
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
    // InternalRangoMode.g:4971:1: rule__GameMode__Group_4__1__Impl : ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) ;
    public final void rule__GameMode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4975:1: ( ( ( rule__GameMode__DescriptionAssignment_4_1 ) ) )
            // InternalRangoMode.g:4976:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            {
            // InternalRangoMode.g:4976:1: ( ( rule__GameMode__DescriptionAssignment_4_1 ) )
            // InternalRangoMode.g:4977:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGameModeAccess().getDescriptionAssignment_4_1()); 
            // InternalRangoMode.g:4978:2: ( rule__GameMode__DescriptionAssignment_4_1 )
            // InternalRangoMode.g:4978:3: rule__GameMode__DescriptionAssignment_4_1
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


    // $ANTLR start "rule__GameMode__Group_9__0"
    // InternalRangoMode.g:4987:1: rule__GameMode__Group_9__0 : rule__GameMode__Group_9__0__Impl rule__GameMode__Group_9__1 ;
    public final void rule__GameMode__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:4991:1: ( rule__GameMode__Group_9__0__Impl rule__GameMode__Group_9__1 )
            // InternalRangoMode.g:4992:2: rule__GameMode__Group_9__0__Impl rule__GameMode__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__GameMode__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_9__0"


    // $ANTLR start "rule__GameMode__Group_9__0__Impl"
    // InternalRangoMode.g:4999:1: rule__GameMode__Group_9__0__Impl : ( ',' ) ;
    public final void rule__GameMode__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5003:1: ( ( ',' ) )
            // InternalRangoMode.g:5004:1: ( ',' )
            {
            // InternalRangoMode.g:5004:1: ( ',' )
            // InternalRangoMode.g:5005:2: ','
            {
             before(grammarAccess.getGameModeAccess().getCommaKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_9__0__Impl"


    // $ANTLR start "rule__GameMode__Group_9__1"
    // InternalRangoMode.g:5014:1: rule__GameMode__Group_9__1 : rule__GameMode__Group_9__1__Impl ;
    public final void rule__GameMode__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5018:1: ( rule__GameMode__Group_9__1__Impl )
            // InternalRangoMode.g:5019:2: rule__GameMode__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_9__1"


    // $ANTLR start "rule__GameMode__Group_9__1__Impl"
    // InternalRangoMode.g:5025:1: rule__GameMode__Group_9__1__Impl : ( ( rule__GameMode__BallTypesAssignment_9_1 ) ) ;
    public final void rule__GameMode__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5029:1: ( ( ( rule__GameMode__BallTypesAssignment_9_1 ) ) )
            // InternalRangoMode.g:5030:1: ( ( rule__GameMode__BallTypesAssignment_9_1 ) )
            {
            // InternalRangoMode.g:5030:1: ( ( rule__GameMode__BallTypesAssignment_9_1 ) )
            // InternalRangoMode.g:5031:2: ( rule__GameMode__BallTypesAssignment_9_1 )
            {
             before(grammarAccess.getGameModeAccess().getBallTypesAssignment_9_1()); 
            // InternalRangoMode.g:5032:2: ( rule__GameMode__BallTypesAssignment_9_1 )
            // InternalRangoMode.g:5032:3: rule__GameMode__BallTypesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__BallTypesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getBallTypesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_9__1__Impl"


    // $ANTLR start "rule__GameMode__Group_10_0__0"
    // InternalRangoMode.g:5041:1: rule__GameMode__Group_10_0__0 : rule__GameMode__Group_10_0__0__Impl rule__GameMode__Group_10_0__1 ;
    public final void rule__GameMode__Group_10_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5045:1: ( rule__GameMode__Group_10_0__0__Impl rule__GameMode__Group_10_0__1 )
            // InternalRangoMode.g:5046:2: rule__GameMode__Group_10_0__0__Impl rule__GameMode__Group_10_0__1
            {
            pushFollow(FOLLOW_17);
            rule__GameMode__Group_10_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_0__0"


    // $ANTLR start "rule__GameMode__Group_10_0__0__Impl"
    // InternalRangoMode.g:5053:1: rule__GameMode__Group_10_0__0__Impl : ( 'gravity' ) ;
    public final void rule__GameMode__Group_10_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5057:1: ( ( 'gravity' ) )
            // InternalRangoMode.g:5058:1: ( 'gravity' )
            {
            // InternalRangoMode.g:5058:1: ( 'gravity' )
            // InternalRangoMode.g:5059:2: 'gravity'
            {
             before(grammarAccess.getGameModeAccess().getGravityKeyword_10_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getGravityKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_0__0__Impl"


    // $ANTLR start "rule__GameMode__Group_10_0__1"
    // InternalRangoMode.g:5068:1: rule__GameMode__Group_10_0__1 : rule__GameMode__Group_10_0__1__Impl ;
    public final void rule__GameMode__Group_10_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5072:1: ( rule__GameMode__Group_10_0__1__Impl )
            // InternalRangoMode.g:5073:2: rule__GameMode__Group_10_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_0__1"


    // $ANTLR start "rule__GameMode__Group_10_0__1__Impl"
    // InternalRangoMode.g:5079:1: rule__GameMode__Group_10_0__1__Impl : ( ( rule__GameMode__GravityAssignment_10_0_1 ) ) ;
    public final void rule__GameMode__Group_10_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5083:1: ( ( ( rule__GameMode__GravityAssignment_10_0_1 ) ) )
            // InternalRangoMode.g:5084:1: ( ( rule__GameMode__GravityAssignment_10_0_1 ) )
            {
            // InternalRangoMode.g:5084:1: ( ( rule__GameMode__GravityAssignment_10_0_1 ) )
            // InternalRangoMode.g:5085:2: ( rule__GameMode__GravityAssignment_10_0_1 )
            {
             before(grammarAccess.getGameModeAccess().getGravityAssignment_10_0_1()); 
            // InternalRangoMode.g:5086:2: ( rule__GameMode__GravityAssignment_10_0_1 )
            // InternalRangoMode.g:5086:3: rule__GameMode__GravityAssignment_10_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__GravityAssignment_10_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getGravityAssignment_10_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_0__1__Impl"


    // $ANTLR start "rule__GameMode__Group_10_1__0"
    // InternalRangoMode.g:5095:1: rule__GameMode__Group_10_1__0 : rule__GameMode__Group_10_1__0__Impl rule__GameMode__Group_10_1__1 ;
    public final void rule__GameMode__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5099:1: ( rule__GameMode__Group_10_1__0__Impl rule__GameMode__Group_10_1__1 )
            // InternalRangoMode.g:5100:2: rule__GameMode__Group_10_1__0__Impl rule__GameMode__Group_10_1__1
            {
            pushFollow(FOLLOW_42);
            rule__GameMode__Group_10_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_1__0"


    // $ANTLR start "rule__GameMode__Group_10_1__0__Impl"
    // InternalRangoMode.g:5107:1: rule__GameMode__Group_10_1__0__Impl : ( 'scoring' ) ;
    public final void rule__GameMode__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5111:1: ( ( 'scoring' ) )
            // InternalRangoMode.g:5112:1: ( 'scoring' )
            {
            // InternalRangoMode.g:5112:1: ( 'scoring' )
            // InternalRangoMode.g:5113:2: 'scoring'
            {
             before(grammarAccess.getGameModeAccess().getScoringKeyword_10_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getScoringKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_1__0__Impl"


    // $ANTLR start "rule__GameMode__Group_10_1__1"
    // InternalRangoMode.g:5122:1: rule__GameMode__Group_10_1__1 : rule__GameMode__Group_10_1__1__Impl ;
    public final void rule__GameMode__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5126:1: ( rule__GameMode__Group_10_1__1__Impl )
            // InternalRangoMode.g:5127:2: rule__GameMode__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_10_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_1__1"


    // $ANTLR start "rule__GameMode__Group_10_1__1__Impl"
    // InternalRangoMode.g:5133:1: rule__GameMode__Group_10_1__1__Impl : ( ( rule__GameMode__ScoringAssignment_10_1_1 ) ) ;
    public final void rule__GameMode__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5137:1: ( ( ( rule__GameMode__ScoringAssignment_10_1_1 ) ) )
            // InternalRangoMode.g:5138:1: ( ( rule__GameMode__ScoringAssignment_10_1_1 ) )
            {
            // InternalRangoMode.g:5138:1: ( ( rule__GameMode__ScoringAssignment_10_1_1 ) )
            // InternalRangoMode.g:5139:2: ( rule__GameMode__ScoringAssignment_10_1_1 )
            {
             before(grammarAccess.getGameModeAccess().getScoringAssignment_10_1_1()); 
            // InternalRangoMode.g:5140:2: ( rule__GameMode__ScoringAssignment_10_1_1 )
            // InternalRangoMode.g:5140:3: rule__GameMode__ScoringAssignment_10_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__ScoringAssignment_10_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getScoringAssignment_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_10_1__1__Impl"


    // $ANTLR start "rule__GameMode__Group_14__0"
    // InternalRangoMode.g:5149:1: rule__GameMode__Group_14__0 : rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 ;
    public final void rule__GameMode__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5153:1: ( rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1 )
            // InternalRangoMode.g:5154:2: rule__GameMode__Group_14__0__Impl rule__GameMode__Group_14__1
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
    // InternalRangoMode.g:5161:1: rule__GameMode__Group_14__0__Impl : ( 'win' ) ;
    public final void rule__GameMode__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5165:1: ( ( 'win' ) )
            // InternalRangoMode.g:5166:1: ( 'win' )
            {
            // InternalRangoMode.g:5166:1: ( 'win' )
            // InternalRangoMode.g:5167:2: 'win'
            {
             before(grammarAccess.getGameModeAccess().getWinKeyword_14_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWinKeyword_14_0()); 

            }


            }

        }
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
    // InternalRangoMode.g:5176:1: rule__GameMode__Group_14__1 : rule__GameMode__Group_14__1__Impl rule__GameMode__Group_14__2 ;
    public final void rule__GameMode__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5180:1: ( rule__GameMode__Group_14__1__Impl rule__GameMode__Group_14__2 )
            // InternalRangoMode.g:5181:2: rule__GameMode__Group_14__1__Impl rule__GameMode__Group_14__2
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14__2();

            state._fsp--;


            }

        }
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
    // InternalRangoMode.g:5188:1: rule__GameMode__Group_14__1__Impl : ( 'when' ) ;
    public final void rule__GameMode__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5192:1: ( ( 'when' ) )
            // InternalRangoMode.g:5193:1: ( 'when' )
            {
            // InternalRangoMode.g:5193:1: ( 'when' )
            // InternalRangoMode.g:5194:2: 'when'
            {
             before(grammarAccess.getGameModeAccess().getWhenKeyword_14_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getWhenKeyword_14_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GameMode__Group_14__2"
    // InternalRangoMode.g:5203:1: rule__GameMode__Group_14__2 : rule__GameMode__Group_14__2__Impl rule__GameMode__Group_14__3 ;
    public final void rule__GameMode__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5207:1: ( rule__GameMode__Group_14__2__Impl rule__GameMode__Group_14__3 )
            // InternalRangoMode.g:5208:2: rule__GameMode__Group_14__2__Impl rule__GameMode__Group_14__3
            {
            pushFollow(FOLLOW_43);
            rule__GameMode__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__2"


    // $ANTLR start "rule__GameMode__Group_14__2__Impl"
    // InternalRangoMode.g:5215:1: rule__GameMode__Group_14__2__Impl : ( ( rule__GameMode__WinConditionsAssignment_14_2 ) ) ;
    public final void rule__GameMode__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5219:1: ( ( ( rule__GameMode__WinConditionsAssignment_14_2 ) ) )
            // InternalRangoMode.g:5220:1: ( ( rule__GameMode__WinConditionsAssignment_14_2 ) )
            {
            // InternalRangoMode.g:5220:1: ( ( rule__GameMode__WinConditionsAssignment_14_2 ) )
            // InternalRangoMode.g:5221:2: ( rule__GameMode__WinConditionsAssignment_14_2 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_14_2()); 
            // InternalRangoMode.g:5222:2: ( rule__GameMode__WinConditionsAssignment_14_2 )
            // InternalRangoMode.g:5222:3: rule__GameMode__WinConditionsAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__2__Impl"


    // $ANTLR start "rule__GameMode__Group_14__3"
    // InternalRangoMode.g:5230:1: rule__GameMode__Group_14__3 : rule__GameMode__Group_14__3__Impl ;
    public final void rule__GameMode__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5234:1: ( rule__GameMode__Group_14__3__Impl )
            // InternalRangoMode.g:5235:2: rule__GameMode__Group_14__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__3"


    // $ANTLR start "rule__GameMode__Group_14__3__Impl"
    // InternalRangoMode.g:5241:1: rule__GameMode__Group_14__3__Impl : ( ( rule__GameMode__Group_14_3__0 )* ) ;
    public final void rule__GameMode__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5245:1: ( ( ( rule__GameMode__Group_14_3__0 )* ) )
            // InternalRangoMode.g:5246:1: ( ( rule__GameMode__Group_14_3__0 )* )
            {
            // InternalRangoMode.g:5246:1: ( ( rule__GameMode__Group_14_3__0 )* )
            // InternalRangoMode.g:5247:2: ( rule__GameMode__Group_14_3__0 )*
            {
             before(grammarAccess.getGameModeAccess().getGroup_14_3()); 
            // InternalRangoMode.g:5248:2: ( rule__GameMode__Group_14_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==61) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRangoMode.g:5248:3: rule__GameMode__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__GameMode__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGameModeAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14__3__Impl"


    // $ANTLR start "rule__GameMode__Group_14_3__0"
    // InternalRangoMode.g:5257:1: rule__GameMode__Group_14_3__0 : rule__GameMode__Group_14_3__0__Impl rule__GameMode__Group_14_3__1 ;
    public final void rule__GameMode__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5261:1: ( rule__GameMode__Group_14_3__0__Impl rule__GameMode__Group_14_3__1 )
            // InternalRangoMode.g:5262:2: rule__GameMode__Group_14_3__0__Impl rule__GameMode__Group_14_3__1
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14_3__0"


    // $ANTLR start "rule__GameMode__Group_14_3__0__Impl"
    // InternalRangoMode.g:5269:1: rule__GameMode__Group_14_3__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5273:1: ( ( 'or' ) )
            // InternalRangoMode.g:5274:1: ( 'or' )
            {
            // InternalRangoMode.g:5274:1: ( 'or' )
            // InternalRangoMode.g:5275:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_14_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14_3__0__Impl"


    // $ANTLR start "rule__GameMode__Group_14_3__1"
    // InternalRangoMode.g:5284:1: rule__GameMode__Group_14_3__1 : rule__GameMode__Group_14_3__1__Impl ;
    public final void rule__GameMode__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5288:1: ( rule__GameMode__Group_14_3__1__Impl )
            // InternalRangoMode.g:5289:2: rule__GameMode__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14_3__1"


    // $ANTLR start "rule__GameMode__Group_14_3__1__Impl"
    // InternalRangoMode.g:5295:1: rule__GameMode__Group_14_3__1__Impl : ( ( rule__GameMode__WinConditionsAssignment_14_3_1 ) ) ;
    public final void rule__GameMode__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5299:1: ( ( ( rule__GameMode__WinConditionsAssignment_14_3_1 ) ) )
            // InternalRangoMode.g:5300:1: ( ( rule__GameMode__WinConditionsAssignment_14_3_1 ) )
            {
            // InternalRangoMode.g:5300:1: ( ( rule__GameMode__WinConditionsAssignment_14_3_1 ) )
            // InternalRangoMode.g:5301:2: ( rule__GameMode__WinConditionsAssignment_14_3_1 )
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsAssignment_14_3_1()); 
            // InternalRangoMode.g:5302:2: ( rule__GameMode__WinConditionsAssignment_14_3_1 )
            // InternalRangoMode.g:5302:3: rule__GameMode__WinConditionsAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__WinConditionsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getWinConditionsAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_14_3__1__Impl"


    // $ANTLR start "rule__GameMode__Group_18__0"
    // InternalRangoMode.g:5311:1: rule__GameMode__Group_18__0 : rule__GameMode__Group_18__0__Impl rule__GameMode__Group_18__1 ;
    public final void rule__GameMode__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5315:1: ( rule__GameMode__Group_18__0__Impl rule__GameMode__Group_18__1 )
            // InternalRangoMode.g:5316:2: rule__GameMode__Group_18__0__Impl rule__GameMode__Group_18__1
            {
            pushFollow(FOLLOW_39);
            rule__GameMode__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameMode__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_18__0"


    // $ANTLR start "rule__GameMode__Group_18__0__Impl"
    // InternalRangoMode.g:5323:1: rule__GameMode__Group_18__0__Impl : ( 'or' ) ;
    public final void rule__GameMode__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5327:1: ( ( 'or' ) )
            // InternalRangoMode.g:5328:1: ( 'or' )
            {
            // InternalRangoMode.g:5328:1: ( 'or' )
            // InternalRangoMode.g:5329:2: 'or'
            {
             before(grammarAccess.getGameModeAccess().getOrKeyword_18_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getOrKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_18__0__Impl"


    // $ANTLR start "rule__GameMode__Group_18__1"
    // InternalRangoMode.g:5338:1: rule__GameMode__Group_18__1 : rule__GameMode__Group_18__1__Impl ;
    public final void rule__GameMode__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5342:1: ( rule__GameMode__Group_18__1__Impl )
            // InternalRangoMode.g:5343:2: rule__GameMode__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_18__1"


    // $ANTLR start "rule__GameMode__Group_18__1__Impl"
    // InternalRangoMode.g:5349:1: rule__GameMode__Group_18__1__Impl : ( ( rule__GameMode__LoseConditionsAssignment_18_1 ) ) ;
    public final void rule__GameMode__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5353:1: ( ( ( rule__GameMode__LoseConditionsAssignment_18_1 ) ) )
            // InternalRangoMode.g:5354:1: ( ( rule__GameMode__LoseConditionsAssignment_18_1 ) )
            {
            // InternalRangoMode.g:5354:1: ( ( rule__GameMode__LoseConditionsAssignment_18_1 ) )
            // InternalRangoMode.g:5355:2: ( rule__GameMode__LoseConditionsAssignment_18_1 )
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_18_1()); 
            // InternalRangoMode.g:5356:2: ( rule__GameMode__LoseConditionsAssignment_18_1 )
            // InternalRangoMode.g:5356:3: rule__GameMode__LoseConditionsAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__LoseConditionsAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getGameModeAccess().getLoseConditionsAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__Group_18__1__Impl"


    // $ANTLR start "rule__Arena__Group__0"
    // InternalRangoMode.g:5365:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5369:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalRangoMode.g:5370:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
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
    // InternalRangoMode.g:5377:1: rule__Arena__Group__0__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5381:1: ( ( 'arena' ) )
            // InternalRangoMode.g:5382:1: ( 'arena' )
            {
            // InternalRangoMode.g:5382:1: ( 'arena' )
            // InternalRangoMode.g:5383:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalRangoMode.g:5392:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5396:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalRangoMode.g:5397:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalRangoMode.g:5404:1: rule__Arena__Group__1__Impl : ( '{' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5408:1: ( ( '{' ) )
            // InternalRangoMode.g:5409:1: ( '{' )
            {
            // InternalRangoMode.g:5409:1: ( '{' )
            // InternalRangoMode.g:5410:2: '{'
            {
             before(grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:5419:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5423:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalRangoMode.g:5424:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
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
    // InternalRangoMode.g:5431:1: rule__Arena__Group__2__Impl : ( 'background' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5435:1: ( ( 'background' ) )
            // InternalRangoMode.g:5436:1: ( 'background' )
            {
            // InternalRangoMode.g:5436:1: ( 'background' )
            // InternalRangoMode.g:5437:2: 'background'
            {
             before(grammarAccess.getArenaAccess().getBackgroundKeyword_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalRangoMode.g:5446:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5450:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalRangoMode.g:5451:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalRangoMode.g:5458:1: rule__Arena__Group__3__Impl : ( ( rule__Arena__BackgroundAssignment_3 ) ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5462:1: ( ( ( rule__Arena__BackgroundAssignment_3 ) ) )
            // InternalRangoMode.g:5463:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            {
            // InternalRangoMode.g:5463:1: ( ( rule__Arena__BackgroundAssignment_3 ) )
            // InternalRangoMode.g:5464:2: ( rule__Arena__BackgroundAssignment_3 )
            {
             before(grammarAccess.getArenaAccess().getBackgroundAssignment_3()); 
            // InternalRangoMode.g:5465:2: ( rule__Arena__BackgroundAssignment_3 )
            // InternalRangoMode.g:5465:3: rule__Arena__BackgroundAssignment_3
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
    // InternalRangoMode.g:5473:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl rule__Arena__Group__5 ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5477:1: ( rule__Arena__Group__4__Impl rule__Arena__Group__5 )
            // InternalRangoMode.g:5478:2: rule__Arena__Group__4__Impl rule__Arena__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5485:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__UnorderedGroup_4 ) ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5489:1: ( ( ( rule__Arena__UnorderedGroup_4 ) ) )
            // InternalRangoMode.g:5490:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            {
            // InternalRangoMode.g:5490:1: ( ( rule__Arena__UnorderedGroup_4 ) )
            // InternalRangoMode.g:5491:2: ( rule__Arena__UnorderedGroup_4 )
            {
             before(grammarAccess.getArenaAccess().getUnorderedGroup_4()); 
            // InternalRangoMode.g:5492:2: ( rule__Arena__UnorderedGroup_4 )
            // InternalRangoMode.g:5492:3: rule__Arena__UnorderedGroup_4
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
    // InternalRangoMode.g:5500:1: rule__Arena__Group__5 : rule__Arena__Group__5__Impl rule__Arena__Group__6 ;
    public final void rule__Arena__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5504:1: ( rule__Arena__Group__5__Impl rule__Arena__Group__6 )
            // InternalRangoMode.g:5505:2: rule__Arena__Group__5__Impl rule__Arena__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalRangoMode.g:5512:1: rule__Arena__Group__5__Impl : ( ( rule__Arena__ObstaclesAssignment_5 )* ) ;
    public final void rule__Arena__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5516:1: ( ( ( rule__Arena__ObstaclesAssignment_5 )* ) )
            // InternalRangoMode.g:5517:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            {
            // InternalRangoMode.g:5517:1: ( ( rule__Arena__ObstaclesAssignment_5 )* )
            // InternalRangoMode.g:5518:2: ( rule__Arena__ObstaclesAssignment_5 )*
            {
             before(grammarAccess.getArenaAccess().getObstaclesAssignment_5()); 
            // InternalRangoMode.g:5519:2: ( rule__Arena__ObstaclesAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==70||LA25_0==74||LA25_0==77) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRangoMode.g:5519:3: rule__Arena__ObstaclesAssignment_5
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Arena__ObstaclesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRangoMode.g:5527:1: rule__Arena__Group__6 : rule__Arena__Group__6__Impl ;
    public final void rule__Arena__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5531:1: ( rule__Arena__Group__6__Impl )
            // InternalRangoMode.g:5532:2: rule__Arena__Group__6__Impl
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
    // InternalRangoMode.g:5538:1: rule__Arena__Group__6__Impl : ( '}' ) ;
    public final void rule__Arena__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5542:1: ( ( '}' ) )
            // InternalRangoMode.g:5543:1: ( '}' )
            {
            // InternalRangoMode.g:5543:1: ( '}' )
            // InternalRangoMode.g:5544:2: '}'
            {
             before(grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:5554:1: rule__Arena__Group_4_0__0 : rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 ;
    public final void rule__Arena__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5558:1: ( rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1 )
            // InternalRangoMode.g:5559:2: rule__Arena__Group_4_0__0__Impl rule__Arena__Group_4_0__1
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
    // InternalRangoMode.g:5566:1: rule__Arena__Group_4_0__0__Impl : ( 'floor' ) ;
    public final void rule__Arena__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5570:1: ( ( 'floor' ) )
            // InternalRangoMode.g:5571:1: ( 'floor' )
            {
            // InternalRangoMode.g:5571:1: ( 'floor' )
            // InternalRangoMode.g:5572:2: 'floor'
            {
             before(grammarAccess.getArenaAccess().getFloorKeyword_4_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalRangoMode.g:5581:1: rule__Arena__Group_4_0__1 : rule__Arena__Group_4_0__1__Impl ;
    public final void rule__Arena__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5585:1: ( rule__Arena__Group_4_0__1__Impl )
            // InternalRangoMode.g:5586:2: rule__Arena__Group_4_0__1__Impl
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
    // InternalRangoMode.g:5592:1: rule__Arena__Group_4_0__1__Impl : ( ( rule__Arena__FloorAssignment_4_0_1 ) ) ;
    public final void rule__Arena__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5596:1: ( ( ( rule__Arena__FloorAssignment_4_0_1 ) ) )
            // InternalRangoMode.g:5597:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            {
            // InternalRangoMode.g:5597:1: ( ( rule__Arena__FloorAssignment_4_0_1 ) )
            // InternalRangoMode.g:5598:2: ( rule__Arena__FloorAssignment_4_0_1 )
            {
             before(grammarAccess.getArenaAccess().getFloorAssignment_4_0_1()); 
            // InternalRangoMode.g:5599:2: ( rule__Arena__FloorAssignment_4_0_1 )
            // InternalRangoMode.g:5599:3: rule__Arena__FloorAssignment_4_0_1
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
    // InternalRangoMode.g:5608:1: rule__Arena__Group_4_1__0 : rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 ;
    public final void rule__Arena__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5612:1: ( rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1 )
            // InternalRangoMode.g:5613:2: rule__Arena__Group_4_1__0__Impl rule__Arena__Group_4_1__1
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
    // InternalRangoMode.g:5620:1: rule__Arena__Group_4_1__0__Impl : ( 'walls' ) ;
    public final void rule__Arena__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5624:1: ( ( 'walls' ) )
            // InternalRangoMode.g:5625:1: ( 'walls' )
            {
            // InternalRangoMode.g:5625:1: ( 'walls' )
            // InternalRangoMode.g:5626:2: 'walls'
            {
             before(grammarAccess.getArenaAccess().getWallsKeyword_4_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalRangoMode.g:5635:1: rule__Arena__Group_4_1__1 : rule__Arena__Group_4_1__1__Impl ;
    public final void rule__Arena__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5639:1: ( rule__Arena__Group_4_1__1__Impl )
            // InternalRangoMode.g:5640:2: rule__Arena__Group_4_1__1__Impl
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
    // InternalRangoMode.g:5646:1: rule__Arena__Group_4_1__1__Impl : ( ( rule__Arena__WallsAssignment_4_1_1 ) ) ;
    public final void rule__Arena__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5650:1: ( ( ( rule__Arena__WallsAssignment_4_1_1 ) ) )
            // InternalRangoMode.g:5651:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            {
            // InternalRangoMode.g:5651:1: ( ( rule__Arena__WallsAssignment_4_1_1 ) )
            // InternalRangoMode.g:5652:2: ( rule__Arena__WallsAssignment_4_1_1 )
            {
             before(grammarAccess.getArenaAccess().getWallsAssignment_4_1_1()); 
            // InternalRangoMode.g:5653:2: ( rule__Arena__WallsAssignment_4_1_1 )
            // InternalRangoMode.g:5653:3: rule__Arena__WallsAssignment_4_1_1
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
    // InternalRangoMode.g:5662:1: rule__Arena__Group_4_2__0 : rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 ;
    public final void rule__Arena__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5666:1: ( rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1 )
            // InternalRangoMode.g:5667:2: rule__Arena__Group_4_2__0__Impl rule__Arena__Group_4_2__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalRangoMode.g:5674:1: rule__Arena__Group_4_2__0__Impl : ( 'player' ) ;
    public final void rule__Arena__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5678:1: ( ( 'player' ) )
            // InternalRangoMode.g:5679:1: ( 'player' )
            {
            // InternalRangoMode.g:5679:1: ( 'player' )
            // InternalRangoMode.g:5680:2: 'player'
            {
             before(grammarAccess.getArenaAccess().getPlayerKeyword_4_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalRangoMode.g:5689:1: rule__Arena__Group_4_2__1 : rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 ;
    public final void rule__Arena__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5693:1: ( rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2 )
            // InternalRangoMode.g:5694:2: rule__Arena__Group_4_2__1__Impl rule__Arena__Group_4_2__2
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
    // InternalRangoMode.g:5701:1: rule__Arena__Group_4_2__1__Impl : ( 'starts' ) ;
    public final void rule__Arena__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5705:1: ( ( 'starts' ) )
            // InternalRangoMode.g:5706:1: ( 'starts' )
            {
            // InternalRangoMode.g:5706:1: ( 'starts' )
            // InternalRangoMode.g:5707:2: 'starts'
            {
             before(grammarAccess.getArenaAccess().getStartsKeyword_4_2_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalRangoMode.g:5716:1: rule__Arena__Group_4_2__2 : rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 ;
    public final void rule__Arena__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5720:1: ( rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3 )
            // InternalRangoMode.g:5721:2: rule__Arena__Group_4_2__2__Impl rule__Arena__Group_4_2__3
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
    // InternalRangoMode.g:5728:1: rule__Arena__Group_4_2__2__Impl : ( 'at' ) ;
    public final void rule__Arena__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5732:1: ( ( 'at' ) )
            // InternalRangoMode.g:5733:1: ( 'at' )
            {
            // InternalRangoMode.g:5733:1: ( 'at' )
            // InternalRangoMode.g:5734:2: 'at'
            {
             before(grammarAccess.getArenaAccess().getAtKeyword_4_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRangoMode.g:5743:1: rule__Arena__Group_4_2__3 : rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 ;
    public final void rule__Arena__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5747:1: ( rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4 )
            // InternalRangoMode.g:5748:2: rule__Arena__Group_4_2__3__Impl rule__Arena__Group_4_2__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5755:1: rule__Arena__Group_4_2__3__Impl : ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) ;
    public final void rule__Arena__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5759:1: ( ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) ) )
            // InternalRangoMode.g:5760:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            {
            // InternalRangoMode.g:5760:1: ( ( rule__Arena__PlayerStartAssignment_4_2_3 ) )
            // InternalRangoMode.g:5761:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            {
             before(grammarAccess.getArenaAccess().getPlayerStartAssignment_4_2_3()); 
            // InternalRangoMode.g:5762:2: ( rule__Arena__PlayerStartAssignment_4_2_3 )
            // InternalRangoMode.g:5762:3: rule__Arena__PlayerStartAssignment_4_2_3
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
    // InternalRangoMode.g:5770:1: rule__Arena__Group_4_2__4 : rule__Arena__Group_4_2__4__Impl ;
    public final void rule__Arena__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5774:1: ( rule__Arena__Group_4_2__4__Impl )
            // InternalRangoMode.g:5775:2: rule__Arena__Group_4_2__4__Impl
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
    // InternalRangoMode.g:5781:1: rule__Arena__Group_4_2__4__Impl : ( '%' ) ;
    public final void rule__Arena__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5785:1: ( ( '%' ) )
            // InternalRangoMode.g:5786:1: ( '%' )
            {
            // InternalRangoMode.g:5786:1: ( '%' )
            // InternalRangoMode.g:5787:2: '%'
            {
             before(grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4()); 
            match(input,67,FOLLOW_2); 
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
    // InternalRangoMode.g:5797:1: rule__At__Group__0 : rule__At__Group__0__Impl rule__At__Group__1 ;
    public final void rule__At__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5801:1: ( rule__At__Group__0__Impl rule__At__Group__1 )
            // InternalRangoMode.g:5802:2: rule__At__Group__0__Impl rule__At__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalRangoMode.g:5809:1: rule__At__Group__0__Impl : ( 'at' ) ;
    public final void rule__At__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5813:1: ( ( 'at' ) )
            // InternalRangoMode.g:5814:1: ( 'at' )
            {
            // InternalRangoMode.g:5814:1: ( 'at' )
            // InternalRangoMode.g:5815:2: 'at'
            {
             before(grammarAccess.getAtAccess().getAtKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRangoMode.g:5824:1: rule__At__Group__1 : rule__At__Group__1__Impl rule__At__Group__2 ;
    public final void rule__At__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5828:1: ( rule__At__Group__1__Impl rule__At__Group__2 )
            // InternalRangoMode.g:5829:2: rule__At__Group__1__Impl rule__At__Group__2
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
    // InternalRangoMode.g:5836:1: rule__At__Group__1__Impl : ( '(' ) ;
    public final void rule__At__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5840:1: ( ( '(' ) )
            // InternalRangoMode.g:5841:1: ( '(' )
            {
            // InternalRangoMode.g:5841:1: ( '(' )
            // InternalRangoMode.g:5842:2: '('
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
    // InternalRangoMode.g:5851:1: rule__At__Group__2 : rule__At__Group__2__Impl rule__At__Group__3 ;
    public final void rule__At__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5855:1: ( rule__At__Group__2__Impl rule__At__Group__3 )
            // InternalRangoMode.g:5856:2: rule__At__Group__2__Impl rule__At__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5863:1: rule__At__Group__2__Impl : ( ( rule__At__XAssignment_2 ) ) ;
    public final void rule__At__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5867:1: ( ( ( rule__At__XAssignment_2 ) ) )
            // InternalRangoMode.g:5868:1: ( ( rule__At__XAssignment_2 ) )
            {
            // InternalRangoMode.g:5868:1: ( ( rule__At__XAssignment_2 ) )
            // InternalRangoMode.g:5869:2: ( rule__At__XAssignment_2 )
            {
             before(grammarAccess.getAtAccess().getXAssignment_2()); 
            // InternalRangoMode.g:5870:2: ( rule__At__XAssignment_2 )
            // InternalRangoMode.g:5870:3: rule__At__XAssignment_2
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
    // InternalRangoMode.g:5878:1: rule__At__Group__3 : rule__At__Group__3__Impl rule__At__Group__4 ;
    public final void rule__At__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5882:1: ( rule__At__Group__3__Impl rule__At__Group__4 )
            // InternalRangoMode.g:5883:2: rule__At__Group__3__Impl rule__At__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalRangoMode.g:5890:1: rule__At__Group__3__Impl : ( '%' ) ;
    public final void rule__At__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5894:1: ( ( '%' ) )
            // InternalRangoMode.g:5895:1: ( '%' )
            {
            // InternalRangoMode.g:5895:1: ( '%' )
            // InternalRangoMode.g:5896:2: '%'
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
    // InternalRangoMode.g:5905:1: rule__At__Group__4 : rule__At__Group__4__Impl rule__At__Group__5 ;
    public final void rule__At__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5909:1: ( rule__At__Group__4__Impl rule__At__Group__5 )
            // InternalRangoMode.g:5910:2: rule__At__Group__4__Impl rule__At__Group__5
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
    // InternalRangoMode.g:5917:1: rule__At__Group__4__Impl : ( ',' ) ;
    public final void rule__At__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5921:1: ( ( ',' ) )
            // InternalRangoMode.g:5922:1: ( ',' )
            {
            // InternalRangoMode.g:5922:1: ( ',' )
            // InternalRangoMode.g:5923:2: ','
            {
             before(grammarAccess.getAtAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRangoMode.g:5932:1: rule__At__Group__5 : rule__At__Group__5__Impl rule__At__Group__6 ;
    public final void rule__At__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5936:1: ( rule__At__Group__5__Impl rule__At__Group__6 )
            // InternalRangoMode.g:5937:2: rule__At__Group__5__Impl rule__At__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:5944:1: rule__At__Group__5__Impl : ( ( rule__At__YAssignment_5 ) ) ;
    public final void rule__At__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5948:1: ( ( ( rule__At__YAssignment_5 ) ) )
            // InternalRangoMode.g:5949:1: ( ( rule__At__YAssignment_5 ) )
            {
            // InternalRangoMode.g:5949:1: ( ( rule__At__YAssignment_5 ) )
            // InternalRangoMode.g:5950:2: ( rule__At__YAssignment_5 )
            {
             before(grammarAccess.getAtAccess().getYAssignment_5()); 
            // InternalRangoMode.g:5951:2: ( rule__At__YAssignment_5 )
            // InternalRangoMode.g:5951:3: rule__At__YAssignment_5
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
    // InternalRangoMode.g:5959:1: rule__At__Group__6 : rule__At__Group__6__Impl rule__At__Group__7 ;
    public final void rule__At__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5963:1: ( rule__At__Group__6__Impl rule__At__Group__7 )
            // InternalRangoMode.g:5964:2: rule__At__Group__6__Impl rule__At__Group__7
            {
            pushFollow(FOLLOW_52);
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
    // InternalRangoMode.g:5971:1: rule__At__Group__6__Impl : ( '%' ) ;
    public final void rule__At__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5975:1: ( ( '%' ) )
            // InternalRangoMode.g:5976:1: ( '%' )
            {
            // InternalRangoMode.g:5976:1: ( '%' )
            // InternalRangoMode.g:5977:2: '%'
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
    // InternalRangoMode.g:5986:1: rule__At__Group__7 : rule__At__Group__7__Impl ;
    public final void rule__At__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:5990:1: ( rule__At__Group__7__Impl )
            // InternalRangoMode.g:5991:2: rule__At__Group__7__Impl
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
    // InternalRangoMode.g:5997:1: rule__At__Group__7__Impl : ( ')' ) ;
    public final void rule__At__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6001:1: ( ( ')' ) )
            // InternalRangoMode.g:6002:1: ( ')' )
            {
            // InternalRangoMode.g:6002:1: ( ')' )
            // InternalRangoMode.g:6003:2: ')'
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
    // InternalRangoMode.g:6013:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6017:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRangoMode.g:6018:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRangoMode.g:6025:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6029:1: ( ( 'block' ) )
            // InternalRangoMode.g:6030:1: ( 'block' )
            {
            // InternalRangoMode.g:6030:1: ( 'block' )
            // InternalRangoMode.g:6031:2: 'block'
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
    // InternalRangoMode.g:6040:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6044:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRangoMode.g:6045:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRangoMode.g:6052:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6056:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6057:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6057:1: ( ( rule__Block__NameAssignment_1 ) )
            // InternalRangoMode.g:6058:2: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6059:2: ( rule__Block__NameAssignment_1 )
            // InternalRangoMode.g:6059:3: rule__Block__NameAssignment_1
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
    // InternalRangoMode.g:6067:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6071:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalRangoMode.g:6072:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalRangoMode.g:6079:1: rule__Block__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6083:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6084:1: ( ruleAt )
            {
            // InternalRangoMode.g:6084:1: ( ruleAt )
            // InternalRangoMode.g:6085:2: ruleAt
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
    // InternalRangoMode.g:6094:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6098:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalRangoMode.g:6099:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalRangoMode.g:6106:1: rule__Block__Group__3__Impl : ( 'size' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6110:1: ( ( 'size' ) )
            // InternalRangoMode.g:6111:1: ( 'size' )
            {
            // InternalRangoMode.g:6111:1: ( 'size' )
            // InternalRangoMode.g:6112:2: 'size'
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
    // InternalRangoMode.g:6121:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6125:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalRangoMode.g:6126:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:6133:1: rule__Block__Group__4__Impl : ( ( rule__Block__WidthAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6137:1: ( ( ( rule__Block__WidthAssignment_4 ) ) )
            // InternalRangoMode.g:6138:1: ( ( rule__Block__WidthAssignment_4 ) )
            {
            // InternalRangoMode.g:6138:1: ( ( rule__Block__WidthAssignment_4 ) )
            // InternalRangoMode.g:6139:2: ( rule__Block__WidthAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getWidthAssignment_4()); 
            // InternalRangoMode.g:6140:2: ( rule__Block__WidthAssignment_4 )
            // InternalRangoMode.g:6140:3: rule__Block__WidthAssignment_4
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
    // InternalRangoMode.g:6148:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6152:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalRangoMode.g:6153:2: rule__Block__Group__5__Impl rule__Block__Group__6
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
    // InternalRangoMode.g:6160:1: rule__Block__Group__5__Impl : ( 'by' ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6164:1: ( ( 'by' ) )
            // InternalRangoMode.g:6165:1: ( 'by' )
            {
            // InternalRangoMode.g:6165:1: ( 'by' )
            // InternalRangoMode.g:6166:2: 'by'
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
    // InternalRangoMode.g:6175:1: rule__Block__Group__6 : rule__Block__Group__6__Impl rule__Block__Group__7 ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6179:1: ( rule__Block__Group__6__Impl rule__Block__Group__7 )
            // InternalRangoMode.g:6180:2: rule__Block__Group__6__Impl rule__Block__Group__7
            {
            pushFollow(FOLLOW_55);
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
    // InternalRangoMode.g:6187:1: rule__Block__Group__6__Impl : ( ( rule__Block__HeightAssignment_6 ) ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6191:1: ( ( ( rule__Block__HeightAssignment_6 ) ) )
            // InternalRangoMode.g:6192:1: ( ( rule__Block__HeightAssignment_6 ) )
            {
            // InternalRangoMode.g:6192:1: ( ( rule__Block__HeightAssignment_6 ) )
            // InternalRangoMode.g:6193:2: ( rule__Block__HeightAssignment_6 )
            {
             before(grammarAccess.getBlockAccess().getHeightAssignment_6()); 
            // InternalRangoMode.g:6194:2: ( rule__Block__HeightAssignment_6 )
            // InternalRangoMode.g:6194:3: rule__Block__HeightAssignment_6
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
    // InternalRangoMode.g:6202:1: rule__Block__Group__7 : rule__Block__Group__7__Impl ;
    public final void rule__Block__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6206:1: ( rule__Block__Group__7__Impl )
            // InternalRangoMode.g:6207:2: rule__Block__Group__7__Impl
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
    // InternalRangoMode.g:6213:1: rule__Block__Group__7__Impl : ( ( rule__Block__Group_7__0 )? ) ;
    public final void rule__Block__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6217:1: ( ( ( rule__Block__Group_7__0 )? ) )
            // InternalRangoMode.g:6218:1: ( ( rule__Block__Group_7__0 )? )
            {
            // InternalRangoMode.g:6218:1: ( ( rule__Block__Group_7__0 )? )
            // InternalRangoMode.g:6219:2: ( rule__Block__Group_7__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_7()); 
            // InternalRangoMode.g:6220:2: ( rule__Block__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==73) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:6220:3: rule__Block__Group_7__0
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
    // InternalRangoMode.g:6229:1: rule__Block__Group_7__0 : rule__Block__Group_7__0__Impl rule__Block__Group_7__1 ;
    public final void rule__Block__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6233:1: ( rule__Block__Group_7__0__Impl rule__Block__Group_7__1 )
            // InternalRangoMode.g:6234:2: rule__Block__Group_7__0__Impl rule__Block__Group_7__1
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
    // InternalRangoMode.g:6241:1: rule__Block__Group_7__0__Impl : ( 'of' ) ;
    public final void rule__Block__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6245:1: ( ( 'of' ) )
            // InternalRangoMode.g:6246:1: ( 'of' )
            {
            // InternalRangoMode.g:6246:1: ( 'of' )
            // InternalRangoMode.g:6247:2: 'of'
            {
             before(grammarAccess.getBlockAccess().getOfKeyword_7_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalRangoMode.g:6256:1: rule__Block__Group_7__1 : rule__Block__Group_7__1__Impl ;
    public final void rule__Block__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6260:1: ( rule__Block__Group_7__1__Impl )
            // InternalRangoMode.g:6261:2: rule__Block__Group_7__1__Impl
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
    // InternalRangoMode.g:6267:1: rule__Block__Group_7__1__Impl : ( ( rule__Block__MaterialAssignment_7_1 ) ) ;
    public final void rule__Block__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6271:1: ( ( ( rule__Block__MaterialAssignment_7_1 ) ) )
            // InternalRangoMode.g:6272:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            {
            // InternalRangoMode.g:6272:1: ( ( rule__Block__MaterialAssignment_7_1 ) )
            // InternalRangoMode.g:6273:2: ( rule__Block__MaterialAssignment_7_1 )
            {
             before(grammarAccess.getBlockAccess().getMaterialAssignment_7_1()); 
            // InternalRangoMode.g:6274:2: ( rule__Block__MaterialAssignment_7_1 )
            // InternalRangoMode.g:6274:3: rule__Block__MaterialAssignment_7_1
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
    // InternalRangoMode.g:6283:1: rule__JumpPad__Group__0 : rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 ;
    public final void rule__JumpPad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6287:1: ( rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1 )
            // InternalRangoMode.g:6288:2: rule__JumpPad__Group__0__Impl rule__JumpPad__Group__1
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
    // InternalRangoMode.g:6295:1: rule__JumpPad__Group__0__Impl : ( 'jumppad' ) ;
    public final void rule__JumpPad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6299:1: ( ( 'jumppad' ) )
            // InternalRangoMode.g:6300:1: ( 'jumppad' )
            {
            // InternalRangoMode.g:6300:1: ( 'jumppad' )
            // InternalRangoMode.g:6301:2: 'jumppad'
            {
             before(grammarAccess.getJumpPadAccess().getJumppadKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRangoMode.g:6310:1: rule__JumpPad__Group__1 : rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 ;
    public final void rule__JumpPad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6314:1: ( rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2 )
            // InternalRangoMode.g:6315:2: rule__JumpPad__Group__1__Impl rule__JumpPad__Group__2
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
    // InternalRangoMode.g:6322:1: rule__JumpPad__Group__1__Impl : ( ( rule__JumpPad__NameAssignment_1 ) ) ;
    public final void rule__JumpPad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6326:1: ( ( ( rule__JumpPad__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6327:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6327:1: ( ( rule__JumpPad__NameAssignment_1 ) )
            // InternalRangoMode.g:6328:2: ( rule__JumpPad__NameAssignment_1 )
            {
             before(grammarAccess.getJumpPadAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6329:2: ( rule__JumpPad__NameAssignment_1 )
            // InternalRangoMode.g:6329:3: rule__JumpPad__NameAssignment_1
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
    // InternalRangoMode.g:6337:1: rule__JumpPad__Group__2 : rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 ;
    public final void rule__JumpPad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6341:1: ( rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3 )
            // InternalRangoMode.g:6342:2: rule__JumpPad__Group__2__Impl rule__JumpPad__Group__3
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
    // InternalRangoMode.g:6349:1: rule__JumpPad__Group__2__Impl : ( ruleAt ) ;
    public final void rule__JumpPad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6353:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6354:1: ( ruleAt )
            {
            // InternalRangoMode.g:6354:1: ( ruleAt )
            // InternalRangoMode.g:6355:2: ruleAt
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
    // InternalRangoMode.g:6364:1: rule__JumpPad__Group__3 : rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 ;
    public final void rule__JumpPad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6368:1: ( rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4 )
            // InternalRangoMode.g:6369:2: rule__JumpPad__Group__3__Impl rule__JumpPad__Group__4
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
    // InternalRangoMode.g:6376:1: rule__JumpPad__Group__3__Impl : ( 'launch' ) ;
    public final void rule__JumpPad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6380:1: ( ( 'launch' ) )
            // InternalRangoMode.g:6381:1: ( 'launch' )
            {
            // InternalRangoMode.g:6381:1: ( 'launch' )
            // InternalRangoMode.g:6382:2: 'launch'
            {
             before(grammarAccess.getJumpPadAccess().getLaunchKeyword_3()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRangoMode.g:6391:1: rule__JumpPad__Group__4 : rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 ;
    public final void rule__JumpPad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6395:1: ( rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5 )
            // InternalRangoMode.g:6396:2: rule__JumpPad__Group__4__Impl rule__JumpPad__Group__5
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
    // InternalRangoMode.g:6403:1: rule__JumpPad__Group__4__Impl : ( ( rule__JumpPad__LaunchAssignment_4 ) ) ;
    public final void rule__JumpPad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6407:1: ( ( ( rule__JumpPad__LaunchAssignment_4 ) ) )
            // InternalRangoMode.g:6408:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            {
            // InternalRangoMode.g:6408:1: ( ( rule__JumpPad__LaunchAssignment_4 ) )
            // InternalRangoMode.g:6409:2: ( rule__JumpPad__LaunchAssignment_4 )
            {
             before(grammarAccess.getJumpPadAccess().getLaunchAssignment_4()); 
            // InternalRangoMode.g:6410:2: ( rule__JumpPad__LaunchAssignment_4 )
            // InternalRangoMode.g:6410:3: rule__JumpPad__LaunchAssignment_4
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
    // InternalRangoMode.g:6418:1: rule__JumpPad__Group__5 : rule__JumpPad__Group__5__Impl ;
    public final void rule__JumpPad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6422:1: ( rule__JumpPad__Group__5__Impl )
            // InternalRangoMode.g:6423:2: rule__JumpPad__Group__5__Impl
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
    // InternalRangoMode.g:6429:1: rule__JumpPad__Group__5__Impl : ( ( rule__JumpPad__Group_5__0 )? ) ;
    public final void rule__JumpPad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6433:1: ( ( ( rule__JumpPad__Group_5__0 )? ) )
            // InternalRangoMode.g:6434:1: ( ( rule__JumpPad__Group_5__0 )? )
            {
            // InternalRangoMode.g:6434:1: ( ( rule__JumpPad__Group_5__0 )? )
            // InternalRangoMode.g:6435:2: ( rule__JumpPad__Group_5__0 )?
            {
             before(grammarAccess.getJumpPadAccess().getGroup_5()); 
            // InternalRangoMode.g:6436:2: ( rule__JumpPad__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==76) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:6436:3: rule__JumpPad__Group_5__0
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
    // InternalRangoMode.g:6445:1: rule__JumpPad__Group_5__0 : rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 ;
    public final void rule__JumpPad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6449:1: ( rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1 )
            // InternalRangoMode.g:6450:2: rule__JumpPad__Group_5__0__Impl rule__JumpPad__Group_5__1
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
    // InternalRangoMode.g:6457:1: rule__JumpPad__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__JumpPad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6461:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6462:1: ( 'affects' )
            {
            // InternalRangoMode.g:6462:1: ( 'affects' )
            // InternalRangoMode.g:6463:2: 'affects'
            {
             before(grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:6472:1: rule__JumpPad__Group_5__1 : rule__JumpPad__Group_5__1__Impl ;
    public final void rule__JumpPad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6476:1: ( rule__JumpPad__Group_5__1__Impl )
            // InternalRangoMode.g:6477:2: rule__JumpPad__Group_5__1__Impl
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
    // InternalRangoMode.g:6483:1: rule__JumpPad__Group_5__1__Impl : ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) ;
    public final void rule__JumpPad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6487:1: ( ( ( rule__JumpPad__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6488:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6488:1: ( ( rule__JumpPad__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6489:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getJumpPadAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6490:2: ( rule__JumpPad__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6490:3: rule__JumpPad__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6499:1: rule__Teleporter__Group__0 : rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 ;
    public final void rule__Teleporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6503:1: ( rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1 )
            // InternalRangoMode.g:6504:2: rule__Teleporter__Group__0__Impl rule__Teleporter__Group__1
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
    // InternalRangoMode.g:6511:1: rule__Teleporter__Group__0__Impl : ( 'teleporter' ) ;
    public final void rule__Teleporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6515:1: ( ( 'teleporter' ) )
            // InternalRangoMode.g:6516:1: ( 'teleporter' )
            {
            // InternalRangoMode.g:6516:1: ( 'teleporter' )
            // InternalRangoMode.g:6517:2: 'teleporter'
            {
             before(grammarAccess.getTeleporterAccess().getTeleporterKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRangoMode.g:6526:1: rule__Teleporter__Group__1 : rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 ;
    public final void rule__Teleporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6530:1: ( rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2 )
            // InternalRangoMode.g:6531:2: rule__Teleporter__Group__1__Impl rule__Teleporter__Group__2
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
    // InternalRangoMode.g:6538:1: rule__Teleporter__Group__1__Impl : ( ( rule__Teleporter__NameAssignment_1 ) ) ;
    public final void rule__Teleporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6542:1: ( ( ( rule__Teleporter__NameAssignment_1 ) ) )
            // InternalRangoMode.g:6543:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            {
            // InternalRangoMode.g:6543:1: ( ( rule__Teleporter__NameAssignment_1 ) )
            // InternalRangoMode.g:6544:2: ( rule__Teleporter__NameAssignment_1 )
            {
             before(grammarAccess.getTeleporterAccess().getNameAssignment_1()); 
            // InternalRangoMode.g:6545:2: ( rule__Teleporter__NameAssignment_1 )
            // InternalRangoMode.g:6545:3: rule__Teleporter__NameAssignment_1
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
    // InternalRangoMode.g:6553:1: rule__Teleporter__Group__2 : rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 ;
    public final void rule__Teleporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6557:1: ( rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3 )
            // InternalRangoMode.g:6558:2: rule__Teleporter__Group__2__Impl rule__Teleporter__Group__3
            {
            pushFollow(FOLLOW_59);
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
    // InternalRangoMode.g:6565:1: rule__Teleporter__Group__2__Impl : ( ruleAt ) ;
    public final void rule__Teleporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6569:1: ( ( ruleAt ) )
            // InternalRangoMode.g:6570:1: ( ruleAt )
            {
            // InternalRangoMode.g:6570:1: ( ruleAt )
            // InternalRangoMode.g:6571:2: ruleAt
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
    // InternalRangoMode.g:6580:1: rule__Teleporter__Group__3 : rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 ;
    public final void rule__Teleporter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6584:1: ( rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4 )
            // InternalRangoMode.g:6585:2: rule__Teleporter__Group__3__Impl rule__Teleporter__Group__4
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
    // InternalRangoMode.g:6592:1: rule__Teleporter__Group__3__Impl : ( 'to' ) ;
    public final void rule__Teleporter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6596:1: ( ( 'to' ) )
            // InternalRangoMode.g:6597:1: ( 'to' )
            {
            // InternalRangoMode.g:6597:1: ( 'to' )
            // InternalRangoMode.g:6598:2: 'to'
            {
             before(grammarAccess.getTeleporterAccess().getToKeyword_3()); 
            match(input,78,FOLLOW_2); 
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
    // InternalRangoMode.g:6607:1: rule__Teleporter__Group__4 : rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 ;
    public final void rule__Teleporter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6611:1: ( rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5 )
            // InternalRangoMode.g:6612:2: rule__Teleporter__Group__4__Impl rule__Teleporter__Group__5
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
    // InternalRangoMode.g:6619:1: rule__Teleporter__Group__4__Impl : ( ( rule__Teleporter__TargetAssignment_4 ) ) ;
    public final void rule__Teleporter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6623:1: ( ( ( rule__Teleporter__TargetAssignment_4 ) ) )
            // InternalRangoMode.g:6624:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            {
            // InternalRangoMode.g:6624:1: ( ( rule__Teleporter__TargetAssignment_4 ) )
            // InternalRangoMode.g:6625:2: ( rule__Teleporter__TargetAssignment_4 )
            {
             before(grammarAccess.getTeleporterAccess().getTargetAssignment_4()); 
            // InternalRangoMode.g:6626:2: ( rule__Teleporter__TargetAssignment_4 )
            // InternalRangoMode.g:6626:3: rule__Teleporter__TargetAssignment_4
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
    // InternalRangoMode.g:6634:1: rule__Teleporter__Group__5 : rule__Teleporter__Group__5__Impl ;
    public final void rule__Teleporter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6638:1: ( rule__Teleporter__Group__5__Impl )
            // InternalRangoMode.g:6639:2: rule__Teleporter__Group__5__Impl
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
    // InternalRangoMode.g:6645:1: rule__Teleporter__Group__5__Impl : ( ( rule__Teleporter__Group_5__0 )? ) ;
    public final void rule__Teleporter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6649:1: ( ( ( rule__Teleporter__Group_5__0 )? ) )
            // InternalRangoMode.g:6650:1: ( ( rule__Teleporter__Group_5__0 )? )
            {
            // InternalRangoMode.g:6650:1: ( ( rule__Teleporter__Group_5__0 )? )
            // InternalRangoMode.g:6651:2: ( rule__Teleporter__Group_5__0 )?
            {
             before(grammarAccess.getTeleporterAccess().getGroup_5()); 
            // InternalRangoMode.g:6652:2: ( rule__Teleporter__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==76) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:6652:3: rule__Teleporter__Group_5__0
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
    // InternalRangoMode.g:6661:1: rule__Teleporter__Group_5__0 : rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 ;
    public final void rule__Teleporter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6665:1: ( rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1 )
            // InternalRangoMode.g:6666:2: rule__Teleporter__Group_5__0__Impl rule__Teleporter__Group_5__1
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
    // InternalRangoMode.g:6673:1: rule__Teleporter__Group_5__0__Impl : ( 'affects' ) ;
    public final void rule__Teleporter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6677:1: ( ( 'affects' ) )
            // InternalRangoMode.g:6678:1: ( 'affects' )
            {
            // InternalRangoMode.g:6678:1: ( 'affects' )
            // InternalRangoMode.g:6679:2: 'affects'
            {
             before(grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRangoMode.g:6688:1: rule__Teleporter__Group_5__1 : rule__Teleporter__Group_5__1__Impl ;
    public final void rule__Teleporter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6692:1: ( rule__Teleporter__Group_5__1__Impl )
            // InternalRangoMode.g:6693:2: rule__Teleporter__Group_5__1__Impl
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
    // InternalRangoMode.g:6699:1: rule__Teleporter__Group_5__1__Impl : ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) ;
    public final void rule__Teleporter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6703:1: ( ( ( rule__Teleporter__AffectsAssignment_5_1 ) ) )
            // InternalRangoMode.g:6704:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            {
            // InternalRangoMode.g:6704:1: ( ( rule__Teleporter__AffectsAssignment_5_1 ) )
            // InternalRangoMode.g:6705:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            {
             before(grammarAccess.getTeleporterAccess().getAffectsAssignment_5_1()); 
            // InternalRangoMode.g:6706:2: ( rule__Teleporter__AffectsAssignment_5_1 )
            // InternalRangoMode.g:6706:3: rule__Teleporter__AffectsAssignment_5_1
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
    // InternalRangoMode.g:6715:1: rule__FixedLayout__Group__0 : rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 ;
    public final void rule__FixedLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6719:1: ( rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1 )
            // InternalRangoMode.g:6720:2: rule__FixedLayout__Group__0__Impl rule__FixedLayout__Group__1
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
    // InternalRangoMode.g:6727:1: rule__FixedLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__FixedLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6731:1: ( ( 'layout' ) )
            // InternalRangoMode.g:6732:1: ( 'layout' )
            {
            // InternalRangoMode.g:6732:1: ( 'layout' )
            // InternalRangoMode.g:6733:2: 'layout'
            {
             before(grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRangoMode.g:6742:1: rule__FixedLayout__Group__1 : rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 ;
    public final void rule__FixedLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6746:1: ( rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2 )
            // InternalRangoMode.g:6747:2: rule__FixedLayout__Group__1__Impl rule__FixedLayout__Group__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:6754:1: rule__FixedLayout__Group__1__Impl : ( '{' ) ;
    public final void rule__FixedLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6758:1: ( ( '{' ) )
            // InternalRangoMode.g:6759:1: ( '{' )
            {
            // InternalRangoMode.g:6759:1: ( '{' )
            // InternalRangoMode.g:6760:2: '{'
            {
             before(grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:6769:1: rule__FixedLayout__Group__2 : rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 ;
    public final void rule__FixedLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6773:1: ( rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3 )
            // InternalRangoMode.g:6774:2: rule__FixedLayout__Group__2__Impl rule__FixedLayout__Group__3
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
    // InternalRangoMode.g:6781:1: rule__FixedLayout__Group__2__Impl : ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) ;
    public final void rule__FixedLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6785:1: ( ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) ) )
            // InternalRangoMode.g:6786:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            {
            // InternalRangoMode.g:6786:1: ( ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* ) )
            // InternalRangoMode.g:6787:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) ) ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            {
            // InternalRangoMode.g:6787:2: ( ( rule__FixedLayout__SpawnsAssignment_2 ) )
            // InternalRangoMode.g:6788:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6789:3: ( rule__FixedLayout__SpawnsAssignment_2 )
            // InternalRangoMode.g:6789:4: rule__FixedLayout__SpawnsAssignment_2
            {
            pushFollow(FOLLOW_61);
            rule__FixedLayout__SpawnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 

            }

            // InternalRangoMode.g:6792:2: ( ( rule__FixedLayout__SpawnsAssignment_2 )* )
            // InternalRangoMode.g:6793:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsAssignment_2()); 
            // InternalRangoMode.g:6794:3: ( rule__FixedLayout__SpawnsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_ID)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRangoMode.g:6794:4: rule__FixedLayout__SpawnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__FixedLayout__SpawnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalRangoMode.g:6803:1: rule__FixedLayout__Group__3 : rule__FixedLayout__Group__3__Impl ;
    public final void rule__FixedLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6807:1: ( rule__FixedLayout__Group__3__Impl )
            // InternalRangoMode.g:6808:2: rule__FixedLayout__Group__3__Impl
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
    // InternalRangoMode.g:6814:1: rule__FixedLayout__Group__3__Impl : ( '}' ) ;
    public final void rule__FixedLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6818:1: ( ( '}' ) )
            // InternalRangoMode.g:6819:1: ( '}' )
            {
            // InternalRangoMode.g:6819:1: ( '}' )
            // InternalRangoMode.g:6820:2: '}'
            {
             before(grammarAccess.getFixedLayoutAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:6830:1: rule__WaveSchedule__Group__0 : rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 ;
    public final void rule__WaveSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6834:1: ( rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1 )
            // InternalRangoMode.g:6835:2: rule__WaveSchedule__Group__0__Impl rule__WaveSchedule__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6842:1: rule__WaveSchedule__Group__0__Impl : ( 'waves' ) ;
    public final void rule__WaveSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6846:1: ( ( 'waves' ) )
            // InternalRangoMode.g:6847:1: ( 'waves' )
            {
            // InternalRangoMode.g:6847:1: ( 'waves' )
            // InternalRangoMode.g:6848:2: 'waves'
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:6857:1: rule__WaveSchedule__Group__1 : rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 ;
    public final void rule__WaveSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6861:1: ( rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2 )
            // InternalRangoMode.g:6862:2: rule__WaveSchedule__Group__1__Impl rule__WaveSchedule__Group__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalRangoMode.g:6869:1: rule__WaveSchedule__Group__1__Impl : ( ( rule__WaveSchedule__Group_1__0 )? ) ;
    public final void rule__WaveSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6873:1: ( ( ( rule__WaveSchedule__Group_1__0 )? ) )
            // InternalRangoMode.g:6874:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            {
            // InternalRangoMode.g:6874:1: ( ( rule__WaveSchedule__Group_1__0 )? )
            // InternalRangoMode.g:6875:2: ( rule__WaveSchedule__Group_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1()); 
            // InternalRangoMode.g:6876:2: ( rule__WaveSchedule__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==97) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRangoMode.g:6876:3: rule__WaveSchedule__Group_1__0
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
    // InternalRangoMode.g:6884:1: rule__WaveSchedule__Group__2 : rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 ;
    public final void rule__WaveSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6888:1: ( rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3 )
            // InternalRangoMode.g:6889:2: rule__WaveSchedule__Group__2__Impl rule__WaveSchedule__Group__3
            {
            pushFollow(FOLLOW_63);
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
    // InternalRangoMode.g:6896:1: rule__WaveSchedule__Group__2__Impl : ( '{' ) ;
    public final void rule__WaveSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6900:1: ( ( '{' ) )
            // InternalRangoMode.g:6901:1: ( '{' )
            {
            // InternalRangoMode.g:6901:1: ( '{' )
            // InternalRangoMode.g:6902:2: '{'
            {
             before(grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:6911:1: rule__WaveSchedule__Group__3 : rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 ;
    public final void rule__WaveSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6915:1: ( rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4 )
            // InternalRangoMode.g:6916:2: rule__WaveSchedule__Group__3__Impl rule__WaveSchedule__Group__4
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
    // InternalRangoMode.g:6923:1: rule__WaveSchedule__Group__3__Impl : ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) ;
    public final void rule__WaveSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6927:1: ( ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) ) )
            // InternalRangoMode.g:6928:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            {
            // InternalRangoMode.g:6928:1: ( ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* ) )
            // InternalRangoMode.g:6929:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) ) ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            {
            // InternalRangoMode.g:6929:2: ( ( rule__WaveSchedule__WavesAssignment_3 ) )
            // InternalRangoMode.g:6930:3: ( rule__WaveSchedule__WavesAssignment_3 )
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6931:3: ( rule__WaveSchedule__WavesAssignment_3 )
            // InternalRangoMode.g:6931:4: rule__WaveSchedule__WavesAssignment_3
            {
            pushFollow(FOLLOW_64);
            rule__WaveSchedule__WavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 

            }

            // InternalRangoMode.g:6934:2: ( ( rule__WaveSchedule__WavesAssignment_3 )* )
            // InternalRangoMode.g:6935:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            {
             before(grammarAccess.getWaveScheduleAccess().getWavesAssignment_3()); 
            // InternalRangoMode.g:6936:3: ( rule__WaveSchedule__WavesAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==82) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRangoMode.g:6936:4: rule__WaveSchedule__WavesAssignment_3
            	    {
            	    pushFollow(FOLLOW_64);
            	    rule__WaveSchedule__WavesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalRangoMode.g:6945:1: rule__WaveSchedule__Group__4 : rule__WaveSchedule__Group__4__Impl ;
    public final void rule__WaveSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6949:1: ( rule__WaveSchedule__Group__4__Impl )
            // InternalRangoMode.g:6950:2: rule__WaveSchedule__Group__4__Impl
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
    // InternalRangoMode.g:6956:1: rule__WaveSchedule__Group__4__Impl : ( '}' ) ;
    public final void rule__WaveSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6960:1: ( ( '}' ) )
            // InternalRangoMode.g:6961:1: ( '}' )
            {
            // InternalRangoMode.g:6961:1: ( '}' )
            // InternalRangoMode.g:6962:2: '}'
            {
             before(grammarAccess.getWaveScheduleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:6972:1: rule__WaveSchedule__Group_1__0 : rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 ;
    public final void rule__WaveSchedule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6976:1: ( rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1 )
            // InternalRangoMode.g:6977:2: rule__WaveSchedule__Group_1__0__Impl rule__WaveSchedule__Group_1__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalRangoMode.g:6984:1: rule__WaveSchedule__Group_1__0__Impl : ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) ;
    public final void rule__WaveSchedule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:6988:1: ( ( ( rule__WaveSchedule__LoopAssignment_1_0 ) ) )
            // InternalRangoMode.g:6989:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            {
            // InternalRangoMode.g:6989:1: ( ( rule__WaveSchedule__LoopAssignment_1_0 ) )
            // InternalRangoMode.g:6990:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopAssignment_1_0()); 
            // InternalRangoMode.g:6991:2: ( rule__WaveSchedule__LoopAssignment_1_0 )
            // InternalRangoMode.g:6991:3: rule__WaveSchedule__LoopAssignment_1_0
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
    // InternalRangoMode.g:6999:1: rule__WaveSchedule__Group_1__1 : rule__WaveSchedule__Group_1__1__Impl ;
    public final void rule__WaveSchedule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7003:1: ( rule__WaveSchedule__Group_1__1__Impl )
            // InternalRangoMode.g:7004:2: rule__WaveSchedule__Group_1__1__Impl
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
    // InternalRangoMode.g:7010:1: rule__WaveSchedule__Group_1__1__Impl : ( ( rule__WaveSchedule__Group_1_1__0 )? ) ;
    public final void rule__WaveSchedule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7014:1: ( ( ( rule__WaveSchedule__Group_1_1__0 )? ) )
            // InternalRangoMode.g:7015:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            {
            // InternalRangoMode.g:7015:1: ( ( rule__WaveSchedule__Group_1_1__0 )? )
            // InternalRangoMode.g:7016:2: ( rule__WaveSchedule__Group_1_1__0 )?
            {
             before(grammarAccess.getWaveScheduleAccess().getGroup_1_1()); 
            // InternalRangoMode.g:7017:2: ( rule__WaveSchedule__Group_1_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:7017:3: rule__WaveSchedule__Group_1_1__0
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
    // InternalRangoMode.g:7026:1: rule__WaveSchedule__Group_1_1__0 : rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 ;
    public final void rule__WaveSchedule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7030:1: ( rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1 )
            // InternalRangoMode.g:7031:2: rule__WaveSchedule__Group_1_1__0__Impl rule__WaveSchedule__Group_1_1__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalRangoMode.g:7038:1: rule__WaveSchedule__Group_1_1__0__Impl : ( 'escalate' ) ;
    public final void rule__WaveSchedule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7042:1: ( ( 'escalate' ) )
            // InternalRangoMode.g:7043:1: ( 'escalate' )
            {
            // InternalRangoMode.g:7043:1: ( 'escalate' )
            // InternalRangoMode.g:7044:2: 'escalate'
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalRangoMode.g:7053:1: rule__WaveSchedule__Group_1_1__1 : rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 ;
    public final void rule__WaveSchedule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7057:1: ( rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2 )
            // InternalRangoMode.g:7058:2: rule__WaveSchedule__Group_1_1__1__Impl rule__WaveSchedule__Group_1_1__2
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
    // InternalRangoMode.g:7065:1: rule__WaveSchedule__Group_1_1__1__Impl : ( 'by' ) ;
    public final void rule__WaveSchedule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7069:1: ( ( 'by' ) )
            // InternalRangoMode.g:7070:1: ( 'by' )
            {
            // InternalRangoMode.g:7070:1: ( 'by' )
            // InternalRangoMode.g:7071:2: 'by'
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
    // InternalRangoMode.g:7080:1: rule__WaveSchedule__Group_1_1__2 : rule__WaveSchedule__Group_1_1__2__Impl ;
    public final void rule__WaveSchedule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7084:1: ( rule__WaveSchedule__Group_1_1__2__Impl )
            // InternalRangoMode.g:7085:2: rule__WaveSchedule__Group_1_1__2__Impl
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
    // InternalRangoMode.g:7091:1: rule__WaveSchedule__Group_1_1__2__Impl : ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) ;
    public final void rule__WaveSchedule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7095:1: ( ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) ) )
            // InternalRangoMode.g:7096:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            {
            // InternalRangoMode.g:7096:1: ( ( rule__WaveSchedule__EscalationAssignment_1_1_2 ) )
            // InternalRangoMode.g:7097:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            {
             before(grammarAccess.getWaveScheduleAccess().getEscalationAssignment_1_1_2()); 
            // InternalRangoMode.g:7098:2: ( rule__WaveSchedule__EscalationAssignment_1_1_2 )
            // InternalRangoMode.g:7098:3: rule__WaveSchedule__EscalationAssignment_1_1_2
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
    // InternalRangoMode.g:7107:1: rule__Wave__Group__0 : rule__Wave__Group__0__Impl rule__Wave__Group__1 ;
    public final void rule__Wave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7111:1: ( rule__Wave__Group__0__Impl rule__Wave__Group__1 )
            // InternalRangoMode.g:7112:2: rule__Wave__Group__0__Impl rule__Wave__Group__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalRangoMode.g:7119:1: rule__Wave__Group__0__Impl : ( 'wave' ) ;
    public final void rule__Wave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7123:1: ( ( 'wave' ) )
            // InternalRangoMode.g:7124:1: ( 'wave' )
            {
            // InternalRangoMode.g:7124:1: ( 'wave' )
            // InternalRangoMode.g:7125:2: 'wave'
            {
             before(grammarAccess.getWaveAccess().getWaveKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRangoMode.g:7134:1: rule__Wave__Group__1 : rule__Wave__Group__1__Impl rule__Wave__Group__2 ;
    public final void rule__Wave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7138:1: ( rule__Wave__Group__1__Impl rule__Wave__Group__2 )
            // InternalRangoMode.g:7139:2: rule__Wave__Group__1__Impl rule__Wave__Group__2
            {
            pushFollow(FOLLOW_66);
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
    // InternalRangoMode.g:7146:1: rule__Wave__Group__1__Impl : ( ( rule__Wave__Group_1__0 )? ) ;
    public final void rule__Wave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7150:1: ( ( ( rule__Wave__Group_1__0 )? ) )
            // InternalRangoMode.g:7151:1: ( ( rule__Wave__Group_1__0 )? )
            {
            // InternalRangoMode.g:7151:1: ( ( rule__Wave__Group_1__0 )? )
            // InternalRangoMode.g:7152:2: ( rule__Wave__Group_1__0 )?
            {
             before(grammarAccess.getWaveAccess().getGroup_1()); 
            // InternalRangoMode.g:7153:2: ( rule__Wave__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==83) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRangoMode.g:7153:3: rule__Wave__Group_1__0
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
    // InternalRangoMode.g:7161:1: rule__Wave__Group__2 : rule__Wave__Group__2__Impl rule__Wave__Group__3 ;
    public final void rule__Wave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7165:1: ( rule__Wave__Group__2__Impl rule__Wave__Group__3 )
            // InternalRangoMode.g:7166:2: rule__Wave__Group__2__Impl rule__Wave__Group__3
            {
            pushFollow(FOLLOW_60);
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
    // InternalRangoMode.g:7173:1: rule__Wave__Group__2__Impl : ( '{' ) ;
    public final void rule__Wave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7177:1: ( ( '{' ) )
            // InternalRangoMode.g:7178:1: ( '{' )
            {
            // InternalRangoMode.g:7178:1: ( '{' )
            // InternalRangoMode.g:7179:2: '{'
            {
             before(grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:7188:1: rule__Wave__Group__3 : rule__Wave__Group__3__Impl rule__Wave__Group__4 ;
    public final void rule__Wave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7192:1: ( rule__Wave__Group__3__Impl rule__Wave__Group__4 )
            // InternalRangoMode.g:7193:2: rule__Wave__Group__3__Impl rule__Wave__Group__4
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
    // InternalRangoMode.g:7200:1: rule__Wave__Group__3__Impl : ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) ;
    public final void rule__Wave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7204:1: ( ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) ) )
            // InternalRangoMode.g:7205:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            {
            // InternalRangoMode.g:7205:1: ( ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* ) )
            // InternalRangoMode.g:7206:2: ( ( rule__Wave__SpawnsAssignment_3 ) ) ( ( rule__Wave__SpawnsAssignment_3 )* )
            {
            // InternalRangoMode.g:7206:2: ( ( rule__Wave__SpawnsAssignment_3 ) )
            // InternalRangoMode.g:7207:3: ( rule__Wave__SpawnsAssignment_3 )
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7208:3: ( rule__Wave__SpawnsAssignment_3 )
            // InternalRangoMode.g:7208:4: rule__Wave__SpawnsAssignment_3
            {
            pushFollow(FOLLOW_61);
            rule__Wave__SpawnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 

            }

            // InternalRangoMode.g:7211:2: ( ( rule__Wave__SpawnsAssignment_3 )* )
            // InternalRangoMode.g:7212:3: ( rule__Wave__SpawnsAssignment_3 )*
            {
             before(grammarAccess.getWaveAccess().getSpawnsAssignment_3()); 
            // InternalRangoMode.g:7213:3: ( rule__Wave__SpawnsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_ID)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRangoMode.g:7213:4: rule__Wave__SpawnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__Wave__SpawnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalRangoMode.g:7222:1: rule__Wave__Group__4 : rule__Wave__Group__4__Impl ;
    public final void rule__Wave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7226:1: ( rule__Wave__Group__4__Impl )
            // InternalRangoMode.g:7227:2: rule__Wave__Group__4__Impl
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
    // InternalRangoMode.g:7233:1: rule__Wave__Group__4__Impl : ( '}' ) ;
    public final void rule__Wave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7237:1: ( ( '}' ) )
            // InternalRangoMode.g:7238:1: ( '}' )
            {
            // InternalRangoMode.g:7238:1: ( '}' )
            // InternalRangoMode.g:7239:2: '}'
            {
             before(grammarAccess.getWaveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:7249:1: rule__Wave__Group_1__0 : rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 ;
    public final void rule__Wave__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7253:1: ( rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1 )
            // InternalRangoMode.g:7254:2: rule__Wave__Group_1__0__Impl rule__Wave__Group_1__1
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
    // InternalRangoMode.g:7261:1: rule__Wave__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Wave__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7265:1: ( ( 'after' ) )
            // InternalRangoMode.g:7266:1: ( 'after' )
            {
            // InternalRangoMode.g:7266:1: ( 'after' )
            // InternalRangoMode.g:7267:2: 'after'
            {
             before(grammarAccess.getWaveAccess().getAfterKeyword_1_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRangoMode.g:7276:1: rule__Wave__Group_1__1 : rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 ;
    public final void rule__Wave__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7280:1: ( rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2 )
            // InternalRangoMode.g:7281:2: rule__Wave__Group_1__1__Impl rule__Wave__Group_1__2
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
    // InternalRangoMode.g:7288:1: rule__Wave__Group_1__1__Impl : ( ( rule__Wave__DelayAssignment_1_1 ) ) ;
    public final void rule__Wave__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7292:1: ( ( ( rule__Wave__DelayAssignment_1_1 ) ) )
            // InternalRangoMode.g:7293:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7293:1: ( ( rule__Wave__DelayAssignment_1_1 ) )
            // InternalRangoMode.g:7294:2: ( rule__Wave__DelayAssignment_1_1 )
            {
             before(grammarAccess.getWaveAccess().getDelayAssignment_1_1()); 
            // InternalRangoMode.g:7295:2: ( rule__Wave__DelayAssignment_1_1 )
            // InternalRangoMode.g:7295:3: rule__Wave__DelayAssignment_1_1
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
    // InternalRangoMode.g:7303:1: rule__Wave__Group_1__2 : rule__Wave__Group_1__2__Impl ;
    public final void rule__Wave__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7307:1: ( rule__Wave__Group_1__2__Impl )
            // InternalRangoMode.g:7308:2: rule__Wave__Group_1__2__Impl
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
    // InternalRangoMode.g:7314:1: rule__Wave__Group_1__2__Impl : ( 's' ) ;
    public final void rule__Wave__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7318:1: ( ( 's' ) )
            // InternalRangoMode.g:7319:1: ( 's' )
            {
            // InternalRangoMode.g:7319:1: ( 's' )
            // InternalRangoMode.g:7320:2: 's'
            {
             before(grammarAccess.getWaveAccess().getSKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__BallSpawn__Group__0"
    // InternalRangoMode.g:7330:1: rule__BallSpawn__Group__0 : rule__BallSpawn__Group__0__Impl rule__BallSpawn__Group__1 ;
    public final void rule__BallSpawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7334:1: ( rule__BallSpawn__Group__0__Impl rule__BallSpawn__Group__1 )
            // InternalRangoMode.g:7335:2: rule__BallSpawn__Group__0__Impl rule__BallSpawn__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__BallSpawn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__0"


    // $ANTLR start "rule__BallSpawn__Group__0__Impl"
    // InternalRangoMode.g:7342:1: rule__BallSpawn__Group__0__Impl : ( ( rule__BallSpawn__Group_0__0 )? ) ;
    public final void rule__BallSpawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7346:1: ( ( ( rule__BallSpawn__Group_0__0 )? ) )
            // InternalRangoMode.g:7347:1: ( ( rule__BallSpawn__Group_0__0 )? )
            {
            // InternalRangoMode.g:7347:1: ( ( rule__BallSpawn__Group_0__0 )? )
            // InternalRangoMode.g:7348:2: ( rule__BallSpawn__Group_0__0 )?
            {
             before(grammarAccess.getBallSpawnAccess().getGroup_0()); 
            // InternalRangoMode.g:7349:2: ( rule__BallSpawn__Group_0__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRangoMode.g:7349:3: rule__BallSpawn__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallSpawn__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBallSpawnAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__0__Impl"


    // $ANTLR start "rule__BallSpawn__Group__1"
    // InternalRangoMode.g:7357:1: rule__BallSpawn__Group__1 : rule__BallSpawn__Group__1__Impl rule__BallSpawn__Group__2 ;
    public final void rule__BallSpawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7361:1: ( rule__BallSpawn__Group__1__Impl rule__BallSpawn__Group__2 )
            // InternalRangoMode.g:7362:2: rule__BallSpawn__Group__1__Impl rule__BallSpawn__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__BallSpawn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__1"


    // $ANTLR start "rule__BallSpawn__Group__1__Impl"
    // InternalRangoMode.g:7369:1: rule__BallSpawn__Group__1__Impl : ( ( rule__BallSpawn__TypeAssignment_1 ) ) ;
    public final void rule__BallSpawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7373:1: ( ( ( rule__BallSpawn__TypeAssignment_1 ) ) )
            // InternalRangoMode.g:7374:1: ( ( rule__BallSpawn__TypeAssignment_1 ) )
            {
            // InternalRangoMode.g:7374:1: ( ( rule__BallSpawn__TypeAssignment_1 ) )
            // InternalRangoMode.g:7375:2: ( rule__BallSpawn__TypeAssignment_1 )
            {
             before(grammarAccess.getBallSpawnAccess().getTypeAssignment_1()); 
            // InternalRangoMode.g:7376:2: ( rule__BallSpawn__TypeAssignment_1 )
            // InternalRangoMode.g:7376:3: rule__BallSpawn__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBallSpawnAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__1__Impl"


    // $ANTLR start "rule__BallSpawn__Group__2"
    // InternalRangoMode.g:7384:1: rule__BallSpawn__Group__2 : rule__BallSpawn__Group__2__Impl rule__BallSpawn__Group__3 ;
    public final void rule__BallSpawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7388:1: ( rule__BallSpawn__Group__2__Impl rule__BallSpawn__Group__3 )
            // InternalRangoMode.g:7389:2: rule__BallSpawn__Group__2__Impl rule__BallSpawn__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__BallSpawn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__2"


    // $ANTLR start "rule__BallSpawn__Group__2__Impl"
    // InternalRangoMode.g:7396:1: rule__BallSpawn__Group__2__Impl : ( 'size' ) ;
    public final void rule__BallSpawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7400:1: ( ( 'size' ) )
            // InternalRangoMode.g:7401:1: ( 'size' )
            {
            // InternalRangoMode.g:7401:1: ( 'size' )
            // InternalRangoMode.g:7402:2: 'size'
            {
             before(grammarAccess.getBallSpawnAccess().getSizeKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__2__Impl"


    // $ANTLR start "rule__BallSpawn__Group__3"
    // InternalRangoMode.g:7411:1: rule__BallSpawn__Group__3 : rule__BallSpawn__Group__3__Impl rule__BallSpawn__Group__4 ;
    public final void rule__BallSpawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7415:1: ( rule__BallSpawn__Group__3__Impl rule__BallSpawn__Group__4 )
            // InternalRangoMode.g:7416:2: rule__BallSpawn__Group__3__Impl rule__BallSpawn__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__BallSpawn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__3"


    // $ANTLR start "rule__BallSpawn__Group__3__Impl"
    // InternalRangoMode.g:7423:1: rule__BallSpawn__Group__3__Impl : ( ( rule__BallSpawn__SizeAssignment_3 ) ) ;
    public final void rule__BallSpawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7427:1: ( ( ( rule__BallSpawn__SizeAssignment_3 ) ) )
            // InternalRangoMode.g:7428:1: ( ( rule__BallSpawn__SizeAssignment_3 ) )
            {
            // InternalRangoMode.g:7428:1: ( ( rule__BallSpawn__SizeAssignment_3 ) )
            // InternalRangoMode.g:7429:2: ( rule__BallSpawn__SizeAssignment_3 )
            {
             before(grammarAccess.getBallSpawnAccess().getSizeAssignment_3()); 
            // InternalRangoMode.g:7430:2: ( rule__BallSpawn__SizeAssignment_3 )
            // InternalRangoMode.g:7430:3: rule__BallSpawn__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBallSpawnAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__3__Impl"


    // $ANTLR start "rule__BallSpawn__Group__4"
    // InternalRangoMode.g:7438:1: rule__BallSpawn__Group__4 : rule__BallSpawn__Group__4__Impl rule__BallSpawn__Group__5 ;
    public final void rule__BallSpawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7442:1: ( rule__BallSpawn__Group__4__Impl rule__BallSpawn__Group__5 )
            // InternalRangoMode.g:7443:2: rule__BallSpawn__Group__4__Impl rule__BallSpawn__Group__5
            {
            pushFollow(FOLLOW_67);
            rule__BallSpawn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__4"


    // $ANTLR start "rule__BallSpawn__Group__4__Impl"
    // InternalRangoMode.g:7450:1: rule__BallSpawn__Group__4__Impl : ( ruleAt ) ;
    public final void rule__BallSpawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7454:1: ( ( ruleAt ) )
            // InternalRangoMode.g:7455:1: ( ruleAt )
            {
            // InternalRangoMode.g:7455:1: ( ruleAt )
            // InternalRangoMode.g:7456:2: ruleAt
            {
             before(grammarAccess.getBallSpawnAccess().getAtParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleAt();

            state._fsp--;

             after(grammarAccess.getBallSpawnAccess().getAtParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__4__Impl"


    // $ANTLR start "rule__BallSpawn__Group__5"
    // InternalRangoMode.g:7465:1: rule__BallSpawn__Group__5 : rule__BallSpawn__Group__5__Impl ;
    public final void rule__BallSpawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7469:1: ( rule__BallSpawn__Group__5__Impl )
            // InternalRangoMode.g:7470:2: rule__BallSpawn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__5"


    // $ANTLR start "rule__BallSpawn__Group__5__Impl"
    // InternalRangoMode.g:7476:1: rule__BallSpawn__Group__5__Impl : ( ( rule__BallSpawn__Group_5__0 )? ) ;
    public final void rule__BallSpawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7480:1: ( ( ( rule__BallSpawn__Group_5__0 )? ) )
            // InternalRangoMode.g:7481:1: ( ( rule__BallSpawn__Group_5__0 )? )
            {
            // InternalRangoMode.g:7481:1: ( ( rule__BallSpawn__Group_5__0 )? )
            // InternalRangoMode.g:7482:2: ( rule__BallSpawn__Group_5__0 )?
            {
             before(grammarAccess.getBallSpawnAccess().getGroup_5()); 
            // InternalRangoMode.g:7483:2: ( rule__BallSpawn__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==84) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:7483:3: rule__BallSpawn__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallSpawn__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBallSpawnAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group__5__Impl"


    // $ANTLR start "rule__BallSpawn__Group_0__0"
    // InternalRangoMode.g:7492:1: rule__BallSpawn__Group_0__0 : rule__BallSpawn__Group_0__0__Impl rule__BallSpawn__Group_0__1 ;
    public final void rule__BallSpawn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7496:1: ( rule__BallSpawn__Group_0__0__Impl rule__BallSpawn__Group_0__1 )
            // InternalRangoMode.g:7497:2: rule__BallSpawn__Group_0__0__Impl rule__BallSpawn__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__BallSpawn__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_0__0"


    // $ANTLR start "rule__BallSpawn__Group_0__0__Impl"
    // InternalRangoMode.g:7504:1: rule__BallSpawn__Group_0__0__Impl : ( ( rule__BallSpawn__CountAssignment_0_0 ) ) ;
    public final void rule__BallSpawn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7508:1: ( ( ( rule__BallSpawn__CountAssignment_0_0 ) ) )
            // InternalRangoMode.g:7509:1: ( ( rule__BallSpawn__CountAssignment_0_0 ) )
            {
            // InternalRangoMode.g:7509:1: ( ( rule__BallSpawn__CountAssignment_0_0 ) )
            // InternalRangoMode.g:7510:2: ( rule__BallSpawn__CountAssignment_0_0 )
            {
             before(grammarAccess.getBallSpawnAccess().getCountAssignment_0_0()); 
            // InternalRangoMode.g:7511:2: ( rule__BallSpawn__CountAssignment_0_0 )
            // InternalRangoMode.g:7511:3: rule__BallSpawn__CountAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__CountAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBallSpawnAccess().getCountAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_0__0__Impl"


    // $ANTLR start "rule__BallSpawn__Group_0__1"
    // InternalRangoMode.g:7519:1: rule__BallSpawn__Group_0__1 : rule__BallSpawn__Group_0__1__Impl ;
    public final void rule__BallSpawn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7523:1: ( rule__BallSpawn__Group_0__1__Impl )
            // InternalRangoMode.g:7524:2: rule__BallSpawn__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_0__1"


    // $ANTLR start "rule__BallSpawn__Group_0__1__Impl"
    // InternalRangoMode.g:7530:1: rule__BallSpawn__Group_0__1__Impl : ( '*' ) ;
    public final void rule__BallSpawn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7534:1: ( ( '*' ) )
            // InternalRangoMode.g:7535:1: ( '*' )
            {
            // InternalRangoMode.g:7535:1: ( '*' )
            // InternalRangoMode.g:7536:2: '*'
            {
             before(grammarAccess.getBallSpawnAccess().getAsteriskKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getAsteriskKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_0__1__Impl"


    // $ANTLR start "rule__BallSpawn__Group_5__0"
    // InternalRangoMode.g:7546:1: rule__BallSpawn__Group_5__0 : rule__BallSpawn__Group_5__0__Impl rule__BallSpawn__Group_5__1 ;
    public final void rule__BallSpawn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7550:1: ( rule__BallSpawn__Group_5__0__Impl rule__BallSpawn__Group_5__1 )
            // InternalRangoMode.g:7551:2: rule__BallSpawn__Group_5__0__Impl rule__BallSpawn__Group_5__1
            {
            pushFollow(FOLLOW_68);
            rule__BallSpawn__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_5__0"


    // $ANTLR start "rule__BallSpawn__Group_5__0__Impl"
    // InternalRangoMode.g:7558:1: rule__BallSpawn__Group_5__0__Impl : ( 'moving' ) ;
    public final void rule__BallSpawn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7562:1: ( ( 'moving' ) )
            // InternalRangoMode.g:7563:1: ( 'moving' )
            {
            // InternalRangoMode.g:7563:1: ( 'moving' )
            // InternalRangoMode.g:7564:2: 'moving'
            {
             before(grammarAccess.getBallSpawnAccess().getMovingKeyword_5_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getMovingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_5__0__Impl"


    // $ANTLR start "rule__BallSpawn__Group_5__1"
    // InternalRangoMode.g:7573:1: rule__BallSpawn__Group_5__1 : rule__BallSpawn__Group_5__1__Impl ;
    public final void rule__BallSpawn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7577:1: ( rule__BallSpawn__Group_5__1__Impl )
            // InternalRangoMode.g:7578:2: rule__BallSpawn__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_5__1"


    // $ANTLR start "rule__BallSpawn__Group_5__1__Impl"
    // InternalRangoMode.g:7584:1: rule__BallSpawn__Group_5__1__Impl : ( ( rule__BallSpawn__DirectionAssignment_5_1 ) ) ;
    public final void rule__BallSpawn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7588:1: ( ( ( rule__BallSpawn__DirectionAssignment_5_1 ) ) )
            // InternalRangoMode.g:7589:1: ( ( rule__BallSpawn__DirectionAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7589:1: ( ( rule__BallSpawn__DirectionAssignment_5_1 ) )
            // InternalRangoMode.g:7590:2: ( rule__BallSpawn__DirectionAssignment_5_1 )
            {
             before(grammarAccess.getBallSpawnAccess().getDirectionAssignment_5_1()); 
            // InternalRangoMode.g:7591:2: ( rule__BallSpawn__DirectionAssignment_5_1 )
            // InternalRangoMode.g:7591:3: rule__BallSpawn__DirectionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BallSpawn__DirectionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBallSpawnAccess().getDirectionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__Group_5__1__Impl"


    // $ANTLR start "rule__DropTable__Group__0"
    // InternalRangoMode.g:7600:1: rule__DropTable__Group__0 : rule__DropTable__Group__0__Impl rule__DropTable__Group__1 ;
    public final void rule__DropTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7604:1: ( rule__DropTable__Group__0__Impl rule__DropTable__Group__1 )
            // InternalRangoMode.g:7605:2: rule__DropTable__Group__0__Impl rule__DropTable__Group__1
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
    // InternalRangoMode.g:7612:1: rule__DropTable__Group__0__Impl : ( 'drops' ) ;
    public final void rule__DropTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7616:1: ( ( 'drops' ) )
            // InternalRangoMode.g:7617:1: ( 'drops' )
            {
            // InternalRangoMode.g:7617:1: ( 'drops' )
            // InternalRangoMode.g:7618:2: 'drops'
            {
             before(grammarAccess.getDropTableAccess().getDropsKeyword_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getDropTableAccess().getDropsKeyword_0()); 

            }


            }

        }
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
    // InternalRangoMode.g:7627:1: rule__DropTable__Group__1 : rule__DropTable__Group__1__Impl rule__DropTable__Group__2 ;
    public final void rule__DropTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7631:1: ( rule__DropTable__Group__1__Impl rule__DropTable__Group__2 )
            // InternalRangoMode.g:7632:2: rule__DropTable__Group__1__Impl rule__DropTable__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalRangoMode.g:7639:1: rule__DropTable__Group__1__Impl : ( ( rule__DropTable__ChanceAssignment_1 ) ) ;
    public final void rule__DropTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7643:1: ( ( ( rule__DropTable__ChanceAssignment_1 ) ) )
            // InternalRangoMode.g:7644:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            {
            // InternalRangoMode.g:7644:1: ( ( rule__DropTable__ChanceAssignment_1 ) )
            // InternalRangoMode.g:7645:2: ( rule__DropTable__ChanceAssignment_1 )
            {
             before(grammarAccess.getDropTableAccess().getChanceAssignment_1()); 
            // InternalRangoMode.g:7646:2: ( rule__DropTable__ChanceAssignment_1 )
            // InternalRangoMode.g:7646:3: rule__DropTable__ChanceAssignment_1
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
    // InternalRangoMode.g:7654:1: rule__DropTable__Group__2 : rule__DropTable__Group__2__Impl rule__DropTable__Group__3 ;
    public final void rule__DropTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7658:1: ( rule__DropTable__Group__2__Impl rule__DropTable__Group__3 )
            // InternalRangoMode.g:7659:2: rule__DropTable__Group__2__Impl rule__DropTable__Group__3
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
    // InternalRangoMode.g:7666:1: rule__DropTable__Group__2__Impl : ( '%' ) ;
    public final void rule__DropTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7670:1: ( ( '%' ) )
            // InternalRangoMode.g:7671:1: ( '%' )
            {
            // InternalRangoMode.g:7671:1: ( '%' )
            // InternalRangoMode.g:7672:2: '%'
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
    // InternalRangoMode.g:7681:1: rule__DropTable__Group__3 : rule__DropTable__Group__3__Impl rule__DropTable__Group__4 ;
    public final void rule__DropTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7685:1: ( rule__DropTable__Group__3__Impl rule__DropTable__Group__4 )
            // InternalRangoMode.g:7686:2: rule__DropTable__Group__3__Impl rule__DropTable__Group__4
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
    // InternalRangoMode.g:7693:1: rule__DropTable__Group__3__Impl : ( '{' ) ;
    public final void rule__DropTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7697:1: ( ( '{' ) )
            // InternalRangoMode.g:7698:1: ( '{' )
            {
            // InternalRangoMode.g:7698:1: ( '{' )
            // InternalRangoMode.g:7699:2: '{'
            {
             before(grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRangoMode.g:7708:1: rule__DropTable__Group__4 : rule__DropTable__Group__4__Impl rule__DropTable__Group__5 ;
    public final void rule__DropTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7712:1: ( rule__DropTable__Group__4__Impl rule__DropTable__Group__5 )
            // InternalRangoMode.g:7713:2: rule__DropTable__Group__4__Impl rule__DropTable__Group__5
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
    // InternalRangoMode.g:7720:1: rule__DropTable__Group__4__Impl : ( ( rule__DropTable__EntriesAssignment_4 ) ) ;
    public final void rule__DropTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7724:1: ( ( ( rule__DropTable__EntriesAssignment_4 ) ) )
            // InternalRangoMode.g:7725:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            {
            // InternalRangoMode.g:7725:1: ( ( rule__DropTable__EntriesAssignment_4 ) )
            // InternalRangoMode.g:7726:2: ( rule__DropTable__EntriesAssignment_4 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_4()); 
            // InternalRangoMode.g:7727:2: ( rule__DropTable__EntriesAssignment_4 )
            // InternalRangoMode.g:7727:3: rule__DropTable__EntriesAssignment_4
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
    // InternalRangoMode.g:7735:1: rule__DropTable__Group__5 : rule__DropTable__Group__5__Impl rule__DropTable__Group__6 ;
    public final void rule__DropTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7739:1: ( rule__DropTable__Group__5__Impl rule__DropTable__Group__6 )
            // InternalRangoMode.g:7740:2: rule__DropTable__Group__5__Impl rule__DropTable__Group__6
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
    // InternalRangoMode.g:7747:1: rule__DropTable__Group__5__Impl : ( ( rule__DropTable__Group_5__0 )* ) ;
    public final void rule__DropTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7751:1: ( ( ( rule__DropTable__Group_5__0 )* ) )
            // InternalRangoMode.g:7752:1: ( ( rule__DropTable__Group_5__0 )* )
            {
            // InternalRangoMode.g:7752:1: ( ( rule__DropTable__Group_5__0 )* )
            // InternalRangoMode.g:7753:2: ( rule__DropTable__Group_5__0 )*
            {
             before(grammarAccess.getDropTableAccess().getGroup_5()); 
            // InternalRangoMode.g:7754:2: ( rule__DropTable__Group_5__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==30) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRangoMode.g:7754:3: rule__DropTable__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DropTable__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalRangoMode.g:7762:1: rule__DropTable__Group__6 : rule__DropTable__Group__6__Impl ;
    public final void rule__DropTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7766:1: ( rule__DropTable__Group__6__Impl )
            // InternalRangoMode.g:7767:2: rule__DropTable__Group__6__Impl
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
    // InternalRangoMode.g:7773:1: rule__DropTable__Group__6__Impl : ( '}' ) ;
    public final void rule__DropTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7777:1: ( ( '}' ) )
            // InternalRangoMode.g:7778:1: ( '}' )
            {
            // InternalRangoMode.g:7778:1: ( '}' )
            // InternalRangoMode.g:7779:2: '}'
            {
             before(grammarAccess.getDropTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRangoMode.g:7789:1: rule__DropTable__Group_5__0 : rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 ;
    public final void rule__DropTable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7793:1: ( rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1 )
            // InternalRangoMode.g:7794:2: rule__DropTable__Group_5__0__Impl rule__DropTable__Group_5__1
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
    // InternalRangoMode.g:7801:1: rule__DropTable__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DropTable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7805:1: ( ( ',' ) )
            // InternalRangoMode.g:7806:1: ( ',' )
            {
            // InternalRangoMode.g:7806:1: ( ',' )
            // InternalRangoMode.g:7807:2: ','
            {
             before(grammarAccess.getDropTableAccess().getCommaKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRangoMode.g:7816:1: rule__DropTable__Group_5__1 : rule__DropTable__Group_5__1__Impl ;
    public final void rule__DropTable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7820:1: ( rule__DropTable__Group_5__1__Impl )
            // InternalRangoMode.g:7821:2: rule__DropTable__Group_5__1__Impl
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
    // InternalRangoMode.g:7827:1: rule__DropTable__Group_5__1__Impl : ( ( rule__DropTable__EntriesAssignment_5_1 ) ) ;
    public final void rule__DropTable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7831:1: ( ( ( rule__DropTable__EntriesAssignment_5_1 ) ) )
            // InternalRangoMode.g:7832:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            {
            // InternalRangoMode.g:7832:1: ( ( rule__DropTable__EntriesAssignment_5_1 ) )
            // InternalRangoMode.g:7833:2: ( rule__DropTable__EntriesAssignment_5_1 )
            {
             before(grammarAccess.getDropTableAccess().getEntriesAssignment_5_1()); 
            // InternalRangoMode.g:7834:2: ( rule__DropTable__EntriesAssignment_5_1 )
            // InternalRangoMode.g:7834:3: rule__DropTable__EntriesAssignment_5_1
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
    // InternalRangoMode.g:7843:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7847:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalRangoMode.g:7848:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
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
    // InternalRangoMode.g:7855:1: rule__Drop__Group__0__Impl : ( ( rule__Drop__PowerUpAssignment_0 ) ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7859:1: ( ( ( rule__Drop__PowerUpAssignment_0 ) ) )
            // InternalRangoMode.g:7860:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            {
            // InternalRangoMode.g:7860:1: ( ( rule__Drop__PowerUpAssignment_0 ) )
            // InternalRangoMode.g:7861:2: ( rule__Drop__PowerUpAssignment_0 )
            {
             before(grammarAccess.getDropAccess().getPowerUpAssignment_0()); 
            // InternalRangoMode.g:7862:2: ( rule__Drop__PowerUpAssignment_0 )
            // InternalRangoMode.g:7862:3: rule__Drop__PowerUpAssignment_0
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
    // InternalRangoMode.g:7870:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7874:1: ( rule__Drop__Group__1__Impl )
            // InternalRangoMode.g:7875:2: rule__Drop__Group__1__Impl
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
    // InternalRangoMode.g:7881:1: rule__Drop__Group__1__Impl : ( ( rule__Drop__Group_1__0 )? ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7885:1: ( ( ( rule__Drop__Group_1__0 )? ) )
            // InternalRangoMode.g:7886:1: ( ( rule__Drop__Group_1__0 )? )
            {
            // InternalRangoMode.g:7886:1: ( ( rule__Drop__Group_1__0 )? )
            // InternalRangoMode.g:7887:2: ( rule__Drop__Group_1__0 )?
            {
             before(grammarAccess.getDropAccess().getGroup_1()); 
            // InternalRangoMode.g:7888:2: ( rule__Drop__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==86) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRangoMode.g:7888:3: rule__Drop__Group_1__0
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
    // InternalRangoMode.g:7897:1: rule__Drop__Group_1__0 : rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 ;
    public final void rule__Drop__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7901:1: ( rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1 )
            // InternalRangoMode.g:7902:2: rule__Drop__Group_1__0__Impl rule__Drop__Group_1__1
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
    // InternalRangoMode.g:7909:1: rule__Drop__Group_1__0__Impl : ( 'weight' ) ;
    public final void rule__Drop__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7913:1: ( ( 'weight' ) )
            // InternalRangoMode.g:7914:1: ( 'weight' )
            {
            // InternalRangoMode.g:7914:1: ( 'weight' )
            // InternalRangoMode.g:7915:2: 'weight'
            {
             before(grammarAccess.getDropAccess().getWeightKeyword_1_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRangoMode.g:7924:1: rule__Drop__Group_1__1 : rule__Drop__Group_1__1__Impl ;
    public final void rule__Drop__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7928:1: ( rule__Drop__Group_1__1__Impl )
            // InternalRangoMode.g:7929:2: rule__Drop__Group_1__1__Impl
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
    // InternalRangoMode.g:7935:1: rule__Drop__Group_1__1__Impl : ( ( rule__Drop__WeightAssignment_1_1 ) ) ;
    public final void rule__Drop__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7939:1: ( ( ( rule__Drop__WeightAssignment_1_1 ) ) )
            // InternalRangoMode.g:7940:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            {
            // InternalRangoMode.g:7940:1: ( ( rule__Drop__WeightAssignment_1_1 ) )
            // InternalRangoMode.g:7941:2: ( rule__Drop__WeightAssignment_1_1 )
            {
             before(grammarAccess.getDropAccess().getWeightAssignment_1_1()); 
            // InternalRangoMode.g:7942:2: ( rule__Drop__WeightAssignment_1_1 )
            // InternalRangoMode.g:7942:3: rule__Drop__WeightAssignment_1_1
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
    // InternalRangoMode.g:7951:1: rule__Cleared__Group__0 : rule__Cleared__Group__0__Impl rule__Cleared__Group__1 ;
    public final void rule__Cleared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7955:1: ( rule__Cleared__Group__0__Impl rule__Cleared__Group__1 )
            // InternalRangoMode.g:7956:2: rule__Cleared__Group__0__Impl rule__Cleared__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalRangoMode.g:7963:1: rule__Cleared__Group__0__Impl : ( () ) ;
    public final void rule__Cleared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7967:1: ( ( () ) )
            // InternalRangoMode.g:7968:1: ( () )
            {
            // InternalRangoMode.g:7968:1: ( () )
            // InternalRangoMode.g:7969:2: ()
            {
             before(grammarAccess.getClearedAccess().getClearedAction_0()); 
            // InternalRangoMode.g:7970:2: ()
            // InternalRangoMode.g:7970:3: 
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
    // InternalRangoMode.g:7978:1: rule__Cleared__Group__1 : rule__Cleared__Group__1__Impl rule__Cleared__Group__2 ;
    public final void rule__Cleared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7982:1: ( rule__Cleared__Group__1__Impl rule__Cleared__Group__2 )
            // InternalRangoMode.g:7983:2: rule__Cleared__Group__1__Impl rule__Cleared__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRangoMode.g:7990:1: rule__Cleared__Group__1__Impl : ( 'all' ) ;
    public final void rule__Cleared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:7994:1: ( ( 'all' ) )
            // InternalRangoMode.g:7995:1: ( 'all' )
            {
            // InternalRangoMode.g:7995:1: ( 'all' )
            // InternalRangoMode.g:7996:2: 'all'
            {
             before(grammarAccess.getClearedAccess().getAllKeyword_1()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRangoMode.g:8005:1: rule__Cleared__Group__2 : rule__Cleared__Group__2__Impl rule__Cleared__Group__3 ;
    public final void rule__Cleared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8009:1: ( rule__Cleared__Group__2__Impl rule__Cleared__Group__3 )
            // InternalRangoMode.g:8010:2: rule__Cleared__Group__2__Impl rule__Cleared__Group__3
            {
            pushFollow(FOLLOW_71);
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
    // InternalRangoMode.g:8017:1: rule__Cleared__Group__2__Impl : ( 'balls' ) ;
    public final void rule__Cleared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8021:1: ( ( 'balls' ) )
            // InternalRangoMode.g:8022:1: ( 'balls' )
            {
            // InternalRangoMode.g:8022:1: ( 'balls' )
            // InternalRangoMode.g:8023:2: 'balls'
            {
             before(grammarAccess.getClearedAccess().getBallsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClearedAccess().getBallsKeyword_2()); 

            }


            }

        }
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
    // InternalRangoMode.g:8032:1: rule__Cleared__Group__3 : rule__Cleared__Group__3__Impl ;
    public final void rule__Cleared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8036:1: ( rule__Cleared__Group__3__Impl )
            // InternalRangoMode.g:8037:2: rule__Cleared__Group__3__Impl
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
    // InternalRangoMode.g:8043:1: rule__Cleared__Group__3__Impl : ( 'cleared' ) ;
    public final void rule__Cleared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8047:1: ( ( 'cleared' ) )
            // InternalRangoMode.g:8048:1: ( 'cleared' )
            {
            // InternalRangoMode.g:8048:1: ( 'cleared' )
            // InternalRangoMode.g:8049:2: 'cleared'
            {
             before(grammarAccess.getClearedAccess().getClearedKeyword_3()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRangoMode.g:8059:1: rule__TimeReached__Group__0 : rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 ;
    public final void rule__TimeReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8063:1: ( rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1 )
            // InternalRangoMode.g:8064:2: rule__TimeReached__Group__0__Impl rule__TimeReached__Group__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRangoMode.g:8071:1: rule__TimeReached__Group__0__Impl : ( 'time' ) ;
    public final void rule__TimeReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8075:1: ( ( 'time' ) )
            // InternalRangoMode.g:8076:1: ( 'time' )
            {
            // InternalRangoMode.g:8076:1: ( 'time' )
            // InternalRangoMode.g:8077:2: 'time'
            {
             before(grammarAccess.getTimeReachedAccess().getTimeKeyword_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRangoMode.g:8086:1: rule__TimeReached__Group__1 : rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 ;
    public final void rule__TimeReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8090:1: ( rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2 )
            // InternalRangoMode.g:8091:2: rule__TimeReached__Group__1__Impl rule__TimeReached__Group__2
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
    // InternalRangoMode.g:8098:1: rule__TimeReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__TimeReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8102:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8103:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8103:1: ( 'reaches' )
            // InternalRangoMode.g:8104:2: 'reaches'
            {
             before(grammarAccess.getTimeReachedAccess().getReachesKeyword_1()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:8113:1: rule__TimeReached__Group__2 : rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 ;
    public final void rule__TimeReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8117:1: ( rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3 )
            // InternalRangoMode.g:8118:2: rule__TimeReached__Group__2__Impl rule__TimeReached__Group__3
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
    // InternalRangoMode.g:8125:1: rule__TimeReached__Group__2__Impl : ( ( rule__TimeReached__SecondsAssignment_2 ) ) ;
    public final void rule__TimeReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8129:1: ( ( ( rule__TimeReached__SecondsAssignment_2 ) ) )
            // InternalRangoMode.g:8130:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            {
            // InternalRangoMode.g:8130:1: ( ( rule__TimeReached__SecondsAssignment_2 ) )
            // InternalRangoMode.g:8131:2: ( rule__TimeReached__SecondsAssignment_2 )
            {
             before(grammarAccess.getTimeReachedAccess().getSecondsAssignment_2()); 
            // InternalRangoMode.g:8132:2: ( rule__TimeReached__SecondsAssignment_2 )
            // InternalRangoMode.g:8132:3: rule__TimeReached__SecondsAssignment_2
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
    // InternalRangoMode.g:8140:1: rule__TimeReached__Group__3 : rule__TimeReached__Group__3__Impl ;
    public final void rule__TimeReached__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8144:1: ( rule__TimeReached__Group__3__Impl )
            // InternalRangoMode.g:8145:2: rule__TimeReached__Group__3__Impl
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
    // InternalRangoMode.g:8151:1: rule__TimeReached__Group__3__Impl : ( 's' ) ;
    public final void rule__TimeReached__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8155:1: ( ( 's' ) )
            // InternalRangoMode.g:8156:1: ( 's' )
            {
            // InternalRangoMode.g:8156:1: ( 's' )
            // InternalRangoMode.g:8157:2: 's'
            {
             before(grammarAccess.getTimeReachedAccess().getSKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRangoMode.g:8167:1: rule__ScoreReached__Group__0 : rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 ;
    public final void rule__ScoreReached__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8171:1: ( rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1 )
            // InternalRangoMode.g:8172:2: rule__ScoreReached__Group__0__Impl rule__ScoreReached__Group__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRangoMode.g:8179:1: rule__ScoreReached__Group__0__Impl : ( 'score' ) ;
    public final void rule__ScoreReached__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8183:1: ( ( 'score' ) )
            // InternalRangoMode.g:8184:1: ( 'score' )
            {
            // InternalRangoMode.g:8184:1: ( 'score' )
            // InternalRangoMode.g:8185:2: 'score'
            {
             before(grammarAccess.getScoreReachedAccess().getScoreKeyword_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalRangoMode.g:8194:1: rule__ScoreReached__Group__1 : rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 ;
    public final void rule__ScoreReached__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8198:1: ( rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2 )
            // InternalRangoMode.g:8199:2: rule__ScoreReached__Group__1__Impl rule__ScoreReached__Group__2
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
    // InternalRangoMode.g:8206:1: rule__ScoreReached__Group__1__Impl : ( 'reaches' ) ;
    public final void rule__ScoreReached__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8210:1: ( ( 'reaches' ) )
            // InternalRangoMode.g:8211:1: ( 'reaches' )
            {
            // InternalRangoMode.g:8211:1: ( 'reaches' )
            // InternalRangoMode.g:8212:2: 'reaches'
            {
             before(grammarAccess.getScoreReachedAccess().getReachesKeyword_1()); 
            match(input,90,FOLLOW_2); 
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
    // InternalRangoMode.g:8221:1: rule__ScoreReached__Group__2 : rule__ScoreReached__Group__2__Impl ;
    public final void rule__ScoreReached__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8225:1: ( rule__ScoreReached__Group__2__Impl )
            // InternalRangoMode.g:8226:2: rule__ScoreReached__Group__2__Impl
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
    // InternalRangoMode.g:8232:1: rule__ScoreReached__Group__2__Impl : ( ( rule__ScoreReached__PointsAssignment_2 ) ) ;
    public final void rule__ScoreReached__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8236:1: ( ( ( rule__ScoreReached__PointsAssignment_2 ) ) )
            // InternalRangoMode.g:8237:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            {
            // InternalRangoMode.g:8237:1: ( ( rule__ScoreReached__PointsAssignment_2 ) )
            // InternalRangoMode.g:8238:2: ( rule__ScoreReached__PointsAssignment_2 )
            {
             before(grammarAccess.getScoreReachedAccess().getPointsAssignment_2()); 
            // InternalRangoMode.g:8239:2: ( rule__ScoreReached__PointsAssignment_2 )
            // InternalRangoMode.g:8239:3: rule__ScoreReached__PointsAssignment_2
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


    // $ANTLR start "rule__BallsPopped__Group__0"
    // InternalRangoMode.g:8248:1: rule__BallsPopped__Group__0 : rule__BallsPopped__Group__0__Impl rule__BallsPopped__Group__1 ;
    public final void rule__BallsPopped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8252:1: ( rule__BallsPopped__Group__0__Impl rule__BallsPopped__Group__1 )
            // InternalRangoMode.g:8253:2: rule__BallsPopped__Group__0__Impl rule__BallsPopped__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__BallsPopped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallsPopped__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__0"


    // $ANTLR start "rule__BallsPopped__Group__0__Impl"
    // InternalRangoMode.g:8260:1: rule__BallsPopped__Group__0__Impl : ( ( rule__BallsPopped__CountAssignment_0 ) ) ;
    public final void rule__BallsPopped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8264:1: ( ( ( rule__BallsPopped__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8265:1: ( ( rule__BallsPopped__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8265:1: ( ( rule__BallsPopped__CountAssignment_0 ) )
            // InternalRangoMode.g:8266:2: ( rule__BallsPopped__CountAssignment_0 )
            {
             before(grammarAccess.getBallsPoppedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8267:2: ( rule__BallsPopped__CountAssignment_0 )
            // InternalRangoMode.g:8267:3: rule__BallsPopped__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BallsPopped__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBallsPoppedAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__0__Impl"


    // $ANTLR start "rule__BallsPopped__Group__1"
    // InternalRangoMode.g:8275:1: rule__BallsPopped__Group__1 : rule__BallsPopped__Group__1__Impl rule__BallsPopped__Group__2 ;
    public final void rule__BallsPopped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8279:1: ( rule__BallsPopped__Group__1__Impl rule__BallsPopped__Group__2 )
            // InternalRangoMode.g:8280:2: rule__BallsPopped__Group__1__Impl rule__BallsPopped__Group__2
            {
            pushFollow(FOLLOW_73);
            rule__BallsPopped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallsPopped__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__1"


    // $ANTLR start "rule__BallsPopped__Group__1__Impl"
    // InternalRangoMode.g:8287:1: rule__BallsPopped__Group__1__Impl : ( 'balls' ) ;
    public final void rule__BallsPopped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8291:1: ( ( 'balls' ) )
            // InternalRangoMode.g:8292:1: ( 'balls' )
            {
            // InternalRangoMode.g:8292:1: ( 'balls' )
            // InternalRangoMode.g:8293:2: 'balls'
            {
             before(grammarAccess.getBallsPoppedAccess().getBallsKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBallsPoppedAccess().getBallsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__1__Impl"


    // $ANTLR start "rule__BallsPopped__Group__2"
    // InternalRangoMode.g:8302:1: rule__BallsPopped__Group__2 : rule__BallsPopped__Group__2__Impl ;
    public final void rule__BallsPopped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8306:1: ( rule__BallsPopped__Group__2__Impl )
            // InternalRangoMode.g:8307:2: rule__BallsPopped__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallsPopped__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__2"


    // $ANTLR start "rule__BallsPopped__Group__2__Impl"
    // InternalRangoMode.g:8313:1: rule__BallsPopped__Group__2__Impl : ( 'popped' ) ;
    public final void rule__BallsPopped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8317:1: ( ( 'popped' ) )
            // InternalRangoMode.g:8318:1: ( 'popped' )
            {
            // InternalRangoMode.g:8318:1: ( 'popped' )
            // InternalRangoMode.g:8319:2: 'popped'
            {
             before(grammarAccess.getBallsPoppedAccess().getPoppedKeyword_2()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getBallsPoppedAccess().getPoppedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__Group__2__Impl"


    // $ANTLR start "rule__WavesSurvived__Group__0"
    // InternalRangoMode.g:8329:1: rule__WavesSurvived__Group__0 : rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 ;
    public final void rule__WavesSurvived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8333:1: ( rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1 )
            // InternalRangoMode.g:8334:2: rule__WavesSurvived__Group__0__Impl rule__WavesSurvived__Group__1
            {
            pushFollow(FOLLOW_74);
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
    // InternalRangoMode.g:8341:1: rule__WavesSurvived__Group__0__Impl : ( ( rule__WavesSurvived__CountAssignment_0 ) ) ;
    public final void rule__WavesSurvived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8345:1: ( ( ( rule__WavesSurvived__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8346:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8346:1: ( ( rule__WavesSurvived__CountAssignment_0 ) )
            // InternalRangoMode.g:8347:2: ( rule__WavesSurvived__CountAssignment_0 )
            {
             before(grammarAccess.getWavesSurvivedAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8348:2: ( rule__WavesSurvived__CountAssignment_0 )
            // InternalRangoMode.g:8348:3: rule__WavesSurvived__CountAssignment_0
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
    // InternalRangoMode.g:8356:1: rule__WavesSurvived__Group__1 : rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 ;
    public final void rule__WavesSurvived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8360:1: ( rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2 )
            // InternalRangoMode.g:8361:2: rule__WavesSurvived__Group__1__Impl rule__WavesSurvived__Group__2
            {
            pushFollow(FOLLOW_75);
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
    // InternalRangoMode.g:8368:1: rule__WavesSurvived__Group__1__Impl : ( 'waves' ) ;
    public final void rule__WavesSurvived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8372:1: ( ( 'waves' ) )
            // InternalRangoMode.g:8373:1: ( 'waves' )
            {
            // InternalRangoMode.g:8373:1: ( 'waves' )
            // InternalRangoMode.g:8374:2: 'waves'
            {
             before(grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRangoMode.g:8383:1: rule__WavesSurvived__Group__2 : rule__WavesSurvived__Group__2__Impl ;
    public final void rule__WavesSurvived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8387:1: ( rule__WavesSurvived__Group__2__Impl )
            // InternalRangoMode.g:8388:2: rule__WavesSurvived__Group__2__Impl
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
    // InternalRangoMode.g:8394:1: rule__WavesSurvived__Group__2__Impl : ( 'survived' ) ;
    public final void rule__WavesSurvived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8398:1: ( ( 'survived' ) )
            // InternalRangoMode.g:8399:1: ( 'survived' )
            {
            // InternalRangoMode.g:8399:1: ( 'survived' )
            // InternalRangoMode.g:8400:2: 'survived'
            {
             before(grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2()); 
            match(input,93,FOLLOW_2); 
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
    // InternalRangoMode.g:8410:1: rule__HealthDepleted__Group__0 : rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 ;
    public final void rule__HealthDepleted__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8414:1: ( rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1 )
            // InternalRangoMode.g:8415:2: rule__HealthDepleted__Group__0__Impl rule__HealthDepleted__Group__1
            {
            pushFollow(FOLLOW_76);
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
    // InternalRangoMode.g:8422:1: rule__HealthDepleted__Group__0__Impl : ( () ) ;
    public final void rule__HealthDepleted__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8426:1: ( ( () ) )
            // InternalRangoMode.g:8427:1: ( () )
            {
            // InternalRangoMode.g:8427:1: ( () )
            // InternalRangoMode.g:8428:2: ()
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0()); 
            // InternalRangoMode.g:8429:2: ()
            // InternalRangoMode.g:8429:3: 
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
    // InternalRangoMode.g:8437:1: rule__HealthDepleted__Group__1 : rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 ;
    public final void rule__HealthDepleted__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8441:1: ( rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2 )
            // InternalRangoMode.g:8442:2: rule__HealthDepleted__Group__1__Impl rule__HealthDepleted__Group__2
            {
            pushFollow(FOLLOW_77);
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
    // InternalRangoMode.g:8449:1: rule__HealthDepleted__Group__1__Impl : ( 'health' ) ;
    public final void rule__HealthDepleted__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8453:1: ( ( 'health' ) )
            // InternalRangoMode.g:8454:1: ( 'health' )
            {
            // InternalRangoMode.g:8454:1: ( 'health' )
            // InternalRangoMode.g:8455:2: 'health'
            {
             before(grammarAccess.getHealthDepletedAccess().getHealthKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRangoMode.g:8464:1: rule__HealthDepleted__Group__2 : rule__HealthDepleted__Group__2__Impl ;
    public final void rule__HealthDepleted__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8468:1: ( rule__HealthDepleted__Group__2__Impl )
            // InternalRangoMode.g:8469:2: rule__HealthDepleted__Group__2__Impl
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
    // InternalRangoMode.g:8475:1: rule__HealthDepleted__Group__2__Impl : ( 'depleted' ) ;
    public final void rule__HealthDepleted__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8479:1: ( ( 'depleted' ) )
            // InternalRangoMode.g:8480:1: ( 'depleted' )
            {
            // InternalRangoMode.g:8480:1: ( 'depleted' )
            // InternalRangoMode.g:8481:2: 'depleted'
            {
             before(grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2()); 
            match(input,94,FOLLOW_2); 
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


    // $ANTLR start "rule__BallsAlive__Group__0"
    // InternalRangoMode.g:8491:1: rule__BallsAlive__Group__0 : rule__BallsAlive__Group__0__Impl rule__BallsAlive__Group__1 ;
    public final void rule__BallsAlive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8495:1: ( rule__BallsAlive__Group__0__Impl rule__BallsAlive__Group__1 )
            // InternalRangoMode.g:8496:2: rule__BallsAlive__Group__0__Impl rule__BallsAlive__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__BallsAlive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallsAlive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__0"


    // $ANTLR start "rule__BallsAlive__Group__0__Impl"
    // InternalRangoMode.g:8503:1: rule__BallsAlive__Group__0__Impl : ( ( rule__BallsAlive__CountAssignment_0 ) ) ;
    public final void rule__BallsAlive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8507:1: ( ( ( rule__BallsAlive__CountAssignment_0 ) ) )
            // InternalRangoMode.g:8508:1: ( ( rule__BallsAlive__CountAssignment_0 ) )
            {
            // InternalRangoMode.g:8508:1: ( ( rule__BallsAlive__CountAssignment_0 ) )
            // InternalRangoMode.g:8509:2: ( rule__BallsAlive__CountAssignment_0 )
            {
             before(grammarAccess.getBallsAliveAccess().getCountAssignment_0()); 
            // InternalRangoMode.g:8510:2: ( rule__BallsAlive__CountAssignment_0 )
            // InternalRangoMode.g:8510:3: rule__BallsAlive__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BallsAlive__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBallsAliveAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__0__Impl"


    // $ANTLR start "rule__BallsAlive__Group__1"
    // InternalRangoMode.g:8518:1: rule__BallsAlive__Group__1 : rule__BallsAlive__Group__1__Impl rule__BallsAlive__Group__2 ;
    public final void rule__BallsAlive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8522:1: ( rule__BallsAlive__Group__1__Impl rule__BallsAlive__Group__2 )
            // InternalRangoMode.g:8523:2: rule__BallsAlive__Group__1__Impl rule__BallsAlive__Group__2
            {
            pushFollow(FOLLOW_78);
            rule__BallsAlive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BallsAlive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__1"


    // $ANTLR start "rule__BallsAlive__Group__1__Impl"
    // InternalRangoMode.g:8530:1: rule__BallsAlive__Group__1__Impl : ( 'balls' ) ;
    public final void rule__BallsAlive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8534:1: ( ( 'balls' ) )
            // InternalRangoMode.g:8535:1: ( 'balls' )
            {
            // InternalRangoMode.g:8535:1: ( 'balls' )
            // InternalRangoMode.g:8536:2: 'balls'
            {
             before(grammarAccess.getBallsAliveAccess().getBallsKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBallsAliveAccess().getBallsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__1__Impl"


    // $ANTLR start "rule__BallsAlive__Group__2"
    // InternalRangoMode.g:8545:1: rule__BallsAlive__Group__2 : rule__BallsAlive__Group__2__Impl ;
    public final void rule__BallsAlive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8549:1: ( rule__BallsAlive__Group__2__Impl )
            // InternalRangoMode.g:8550:2: rule__BallsAlive__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallsAlive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__2"


    // $ANTLR start "rule__BallsAlive__Group__2__Impl"
    // InternalRangoMode.g:8556:1: rule__BallsAlive__Group__2__Impl : ( 'alive' ) ;
    public final void rule__BallsAlive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8560:1: ( ( 'alive' ) )
            // InternalRangoMode.g:8561:1: ( 'alive' )
            {
            // InternalRangoMode.g:8561:1: ( 'alive' )
            // InternalRangoMode.g:8562:2: 'alive'
            {
             before(grammarAccess.getBallsAliveAccess().getAliveKeyword_2()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getBallsAliveAccess().getAliveKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__Group__2__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalRangoMode.g:8572:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8576:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalRangoMode.g:8577:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_79);
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
    // InternalRangoMode.g:8584:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8588:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8589:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8589:1: ( RULE_INT )
            // InternalRangoMode.g:8590:2: RULE_INT
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
    // InternalRangoMode.g:8599:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8603:1: ( rule__Decimal__Group__1__Impl )
            // InternalRangoMode.g:8604:2: rule__Decimal__Group__1__Impl
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
    // InternalRangoMode.g:8610:1: rule__Decimal__Group__1__Impl : ( ( rule__Decimal__Group_1__0 )? ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8614:1: ( ( ( rule__Decimal__Group_1__0 )? ) )
            // InternalRangoMode.g:8615:1: ( ( rule__Decimal__Group_1__0 )? )
            {
            // InternalRangoMode.g:8615:1: ( ( rule__Decimal__Group_1__0 )? )
            // InternalRangoMode.g:8616:2: ( rule__Decimal__Group_1__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_1()); 
            // InternalRangoMode.g:8617:2: ( rule__Decimal__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==96) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRangoMode.g:8617:3: rule__Decimal__Group_1__0
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
    // InternalRangoMode.g:8626:1: rule__Decimal__Group_1__0 : rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 ;
    public final void rule__Decimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8630:1: ( rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1 )
            // InternalRangoMode.g:8631:2: rule__Decimal__Group_1__0__Impl rule__Decimal__Group_1__1
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
    // InternalRangoMode.g:8638:1: rule__Decimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8642:1: ( ( '.' ) )
            // InternalRangoMode.g:8643:1: ( '.' )
            {
            // InternalRangoMode.g:8643:1: ( '.' )
            // InternalRangoMode.g:8644:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,96,FOLLOW_2); 
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
    // InternalRangoMode.g:8653:1: rule__Decimal__Group_1__1 : rule__Decimal__Group_1__1__Impl ;
    public final void rule__Decimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8657:1: ( rule__Decimal__Group_1__1__Impl )
            // InternalRangoMode.g:8658:2: rule__Decimal__Group_1__1__Impl
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
    // InternalRangoMode.g:8664:1: rule__Decimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8668:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:8669:1: ( RULE_INT )
            {
            // InternalRangoMode.g:8669:1: ( RULE_INT )
            // InternalRangoMode.g:8670:2: RULE_INT
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


    // $ANTLR start "rule__BallType__UnorderedGroup_3"
    // InternalRangoMode.g:8680:1: rule__BallType__UnorderedGroup_3 : rule__BallType__UnorderedGroup_3__0 {...}?;
    public final void rule__BallType__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8685:1: ( rule__BallType__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8686:2: rule__BallType__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__BallType__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__UnorderedGroup_3"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__Impl"
    // InternalRangoMode.g:8694:1: rule__BallType__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) ) ) ;
    public final void rule__BallType__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8699:1: ( ( ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) ) ) )
            // InternalRangoMode.g:8700:3: ( ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8700:3: ( ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) ) )
            int alt40=5;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt40=2;
            }
            else if ( LA40_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt40=3;
            }
            else if ( LA40_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt40=4;
            }
            else if ( LA40_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt40=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:8701:3: ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8701:3: ({...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8702:4: {...}? => ( ( ( rule__BallType__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8702:104: ( ( ( rule__BallType__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8703:5: ( ( rule__BallType__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8709:5: ( ( rule__BallType__Group_3_0__0 ) )
                    // InternalRangoMode.g:8710:6: ( rule__BallType__Group_3_0__0 )
                    {
                     before(grammarAccess.getBallTypeAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8711:6: ( rule__BallType__Group_3_0__0 )
                    // InternalRangoMode.g:8711:7: rule__BallType__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBallTypeAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:8716:3: ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8716:3: ({...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8717:4: {...}? => ( ( ( rule__BallType__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8717:104: ( ( ( rule__BallType__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8718:5: ( ( rule__BallType__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8724:5: ( ( rule__BallType__Group_3_1__0 ) )
                    // InternalRangoMode.g:8725:6: ( rule__BallType__Group_3_1__0 )
                    {
                     before(grammarAccess.getBallTypeAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8726:6: ( rule__BallType__Group_3_1__0 )
                    // InternalRangoMode.g:8726:7: rule__BallType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBallTypeAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:8731:3: ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8731:3: ({...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8732:4: {...}? => ( ( ( rule__BallType__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8732:104: ( ( ( rule__BallType__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8733:5: ( ( rule__BallType__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8739:5: ( ( rule__BallType__Group_3_2__0 ) )
                    // InternalRangoMode.g:8740:6: ( rule__BallType__Group_3_2__0 )
                    {
                     before(grammarAccess.getBallTypeAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8741:6: ( rule__BallType__Group_3_2__0 )
                    // InternalRangoMode.g:8741:7: rule__BallType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBallTypeAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:8746:3: ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8746:3: ({...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8747:4: {...}? => ( ( ( rule__BallType__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8747:104: ( ( ( rule__BallType__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8748:5: ( ( rule__BallType__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8754:5: ( ( rule__BallType__Group_3_3__0 ) )
                    // InternalRangoMode.g:8755:6: ( rule__BallType__Group_3_3__0 )
                    {
                     before(grammarAccess.getBallTypeAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:8756:6: ( rule__BallType__Group_3_3__0 )
                    // InternalRangoMode.g:8756:7: rule__BallType__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBallTypeAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:8761:3: ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8761:3: ({...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:8762:4: {...}? => ( ( ( rule__BallType__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__BallType__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:8762:104: ( ( ( rule__BallType__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:8763:5: ( ( rule__BallType__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8769:5: ( ( rule__BallType__Group_3_4__0 ) )
                    // InternalRangoMode.g:8770:6: ( rule__BallType__Group_3_4__0 )
                    {
                     before(grammarAccess.getBallTypeAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:8771:6: ( rule__BallType__Group_3_4__0 )
                    // InternalRangoMode.g:8771:7: rule__BallType__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBallTypeAccess().getGroup_3_4()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__0"
    // InternalRangoMode.g:8784:1: rule__BallType__UnorderedGroup_3__0 : rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__1 )? ;
    public final void rule__BallType__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8788:1: ( rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8789:2: rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_80);
            rule__BallType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8790:2: ( rule__BallType__UnorderedGroup_3__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:8790:2: rule__BallType__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__BallType__UnorderedGroup_3__0"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__1"
    // InternalRangoMode.g:8796:1: rule__BallType__UnorderedGroup_3__1 : rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__2 )? ;
    public final void rule__BallType__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8800:1: ( rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:8801:2: rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_80);
            rule__BallType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8802:2: ( rule__BallType__UnorderedGroup_3__2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:8802:2: rule__BallType__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__BallType__UnorderedGroup_3__1"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__2"
    // InternalRangoMode.g:8808:1: rule__BallType__UnorderedGroup_3__2 : rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__3 )? ;
    public final void rule__BallType__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8812:1: ( rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:8813:2: rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_80);
            rule__BallType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8814:2: ( rule__BallType__UnorderedGroup_3__3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRangoMode.g:8814:2: rule__BallType__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__BallType__UnorderedGroup_3__2"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__3"
    // InternalRangoMode.g:8820:1: rule__BallType__UnorderedGroup_3__3 : rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__4 )? ;
    public final void rule__BallType__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8824:1: ( rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:8825:2: rule__BallType__UnorderedGroup_3__Impl ( rule__BallType__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_80);
            rule__BallType__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8826:2: ( rule__BallType__UnorderedGroup_3__4 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:8826:2: rule__BallType__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__BallType__UnorderedGroup_3__4();

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
    // $ANTLR end "rule__BallType__UnorderedGroup_3__3"


    // $ANTLR start "rule__BallType__UnorderedGroup_3__4"
    // InternalRangoMode.g:8832:1: rule__BallType__UnorderedGroup_3__4 : rule__BallType__UnorderedGroup_3__Impl ;
    public final void rule__BallType__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8836:1: ( rule__BallType__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8837:2: rule__BallType__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BallType__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__UnorderedGroup_3__4"


    // $ANTLR start "rule__Material__UnorderedGroup_3"
    // InternalRangoMode.g:8844:1: rule__Material__UnorderedGroup_3 : ( rule__Material__UnorderedGroup_3__0 )? ;
    public final void rule__Material__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8849:1: ( ( rule__Material__UnorderedGroup_3__0 )? )
            // InternalRangoMode.g:8850:2: ( rule__Material__UnorderedGroup_3__0 )?
            {
            // InternalRangoMode.g:8850:2: ( rule__Material__UnorderedGroup_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:8850:2: rule__Material__UnorderedGroup_3__0
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
    // InternalRangoMode.g:8858:1: rule__Material__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__Material__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8863:1: ( ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) ) )
            // InternalRangoMode.g:8864:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8864:3: ( ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:8865:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8865:3: ({...}? => ( ( ( rule__Material__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8866:4: {...}? => ( ( ( rule__Material__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8866:104: ( ( ( rule__Material__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8867:5: ( ( rule__Material__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8873:5: ( ( rule__Material__Group_3_0__0 ) )
                    // InternalRangoMode.g:8874:6: ( rule__Material__Group_3_0__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8875:6: ( rule__Material__Group_3_0__0 )
                    // InternalRangoMode.g:8875:7: rule__Material__Group_3_0__0
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
                    // InternalRangoMode.g:8880:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8880:3: ({...}? => ( ( ( rule__Material__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8881:4: {...}? => ( ( ( rule__Material__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Material__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8881:104: ( ( ( rule__Material__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8882:5: ( ( rule__Material__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8888:5: ( ( rule__Material__Group_3_1__0 ) )
                    // InternalRangoMode.g:8889:6: ( rule__Material__Group_3_1__0 )
                    {
                     before(grammarAccess.getMaterialAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8890:6: ( rule__Material__Group_3_1__0 )
                    // InternalRangoMode.g:8890:7: rule__Material__Group_3_1__0
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
    // InternalRangoMode.g:8903:1: rule__Material__UnorderedGroup_3__0 : rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? ;
    public final void rule__Material__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8907:1: ( rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:8908:2: rule__Material__UnorderedGroup_3__Impl ( rule__Material__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_81);
            rule__Material__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:8909:2: ( rule__Material__UnorderedGroup_3__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRangoMode.g:8909:2: rule__Material__UnorderedGroup_3__1
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
    // InternalRangoMode.g:8915:1: rule__Material__UnorderedGroup_3__1 : rule__Material__UnorderedGroup_3__Impl ;
    public final void rule__Material__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:8919:1: ( rule__Material__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:8920:2: rule__Material__UnorderedGroup_3__Impl
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
    // InternalRangoMode.g:8927:1: rule__PlayerProfile__UnorderedGroup_3 : rule__PlayerProfile__UnorderedGroup_3__0 {...}?;
    public final void rule__PlayerProfile__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
        	
        try {
            // InternalRangoMode.g:8932:1: ( rule__PlayerProfile__UnorderedGroup_3__0 {...}?)
            // InternalRangoMode.g:8933:2: rule__PlayerProfile__UnorderedGroup_3__0 {...}?
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
    // InternalRangoMode.g:8941:1: rule__PlayerProfile__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) ;
    public final void rule__PlayerProfile__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:8946:1: ( ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) ) )
            // InternalRangoMode.g:8947:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            {
            // InternalRangoMode.g:8947:3: ( ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) ) )
            int alt48=6;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt48=2;
            }
            else if ( LA48_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt48=3;
            }
            else if ( LA48_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt48=4;
            }
            else if ( LA48_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt48=5;
            }
            else if ( LA48_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt48=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalRangoMode.g:8948:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8948:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) ) )
                    // InternalRangoMode.g:8949:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalRangoMode.g:8949:109: ( ( ( rule__PlayerProfile__Group_3_0__0 ) ) )
                    // InternalRangoMode.g:8950:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8956:5: ( ( rule__PlayerProfile__Group_3_0__0 ) )
                    // InternalRangoMode.g:8957:6: ( rule__PlayerProfile__Group_3_0__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_0()); 
                    // InternalRangoMode.g:8958:6: ( rule__PlayerProfile__Group_3_0__0 )
                    // InternalRangoMode.g:8958:7: rule__PlayerProfile__Group_3_0__0
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
                    // InternalRangoMode.g:8963:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8963:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) ) )
                    // InternalRangoMode.g:8964:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalRangoMode.g:8964:109: ( ( ( rule__PlayerProfile__Group_3_1__0 ) ) )
                    // InternalRangoMode.g:8965:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8971:5: ( ( rule__PlayerProfile__Group_3_1__0 ) )
                    // InternalRangoMode.g:8972:6: ( rule__PlayerProfile__Group_3_1__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_1()); 
                    // InternalRangoMode.g:8973:6: ( rule__PlayerProfile__Group_3_1__0 )
                    // InternalRangoMode.g:8973:7: rule__PlayerProfile__Group_3_1__0
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
                    // InternalRangoMode.g:8978:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8978:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) ) )
                    // InternalRangoMode.g:8979:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalRangoMode.g:8979:109: ( ( ( rule__PlayerProfile__Group_3_2__0 ) ) )
                    // InternalRangoMode.g:8980:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:8986:5: ( ( rule__PlayerProfile__Group_3_2__0 ) )
                    // InternalRangoMode.g:8987:6: ( rule__PlayerProfile__Group_3_2__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_2()); 
                    // InternalRangoMode.g:8988:6: ( rule__PlayerProfile__Group_3_2__0 )
                    // InternalRangoMode.g:8988:7: rule__PlayerProfile__Group_3_2__0
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
                    // InternalRangoMode.g:8993:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    {
                    // InternalRangoMode.g:8993:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) ) )
                    // InternalRangoMode.g:8994:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalRangoMode.g:8994:109: ( ( ( rule__PlayerProfile__Group_3_3__0 ) ) )
                    // InternalRangoMode.g:8995:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9001:5: ( ( rule__PlayerProfile__Group_3_3__0 ) )
                    // InternalRangoMode.g:9002:6: ( rule__PlayerProfile__Group_3_3__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_3()); 
                    // InternalRangoMode.g:9003:6: ( rule__PlayerProfile__Group_3_3__0 )
                    // InternalRangoMode.g:9003:7: rule__PlayerProfile__Group_3_3__0
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
                    // InternalRangoMode.g:9008:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9008:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) ) )
                    // InternalRangoMode.g:9009:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalRangoMode.g:9009:109: ( ( ( rule__PlayerProfile__Group_3_4__0 ) ) )
                    // InternalRangoMode.g:9010:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9016:5: ( ( rule__PlayerProfile__Group_3_4__0 ) )
                    // InternalRangoMode.g:9017:6: ( rule__PlayerProfile__Group_3_4__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_4()); 
                    // InternalRangoMode.g:9018:6: ( rule__PlayerProfile__Group_3_4__0 )
                    // InternalRangoMode.g:9018:7: rule__PlayerProfile__Group_3_4__0
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
                    // InternalRangoMode.g:9023:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9023:3: ({...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) ) )
                    // InternalRangoMode.g:9024:4: {...}? => ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PlayerProfile__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalRangoMode.g:9024:109: ( ( ( rule__PlayerProfile__Group_3_5__0 ) ) )
                    // InternalRangoMode.g:9025:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9031:5: ( ( rule__PlayerProfile__Group_3_5__0 ) )
                    // InternalRangoMode.g:9032:6: ( rule__PlayerProfile__Group_3_5__0 )
                    {
                     before(grammarAccess.getPlayerProfileAccess().getGroup_3_5()); 
                    // InternalRangoMode.g:9033:6: ( rule__PlayerProfile__Group_3_5__0 )
                    // InternalRangoMode.g:9033:7: rule__PlayerProfile__Group_3_5__0
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
    // InternalRangoMode.g:9046:1: rule__PlayerProfile__UnorderedGroup_3__0 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9050:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )? )
            // InternalRangoMode.g:9051:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_82);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9052:2: ( rule__PlayerProfile__UnorderedGroup_3__1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt49=1;
            }
            else if ( LA49_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt49=1;
            }
            else if ( LA49_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt49=1;
            }
            else if ( LA49_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRangoMode.g:9052:2: rule__PlayerProfile__UnorderedGroup_3__1
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
    // InternalRangoMode.g:9058:1: rule__PlayerProfile__UnorderedGroup_3__1 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9062:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )? )
            // InternalRangoMode.g:9063:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_82);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9064:2: ( rule__PlayerProfile__UnorderedGroup_3__2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt50=1;
            }
            else if ( LA50_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt50=1;
            }
            else if ( LA50_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt50=1;
            }
            else if ( LA50_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRangoMode.g:9064:2: rule__PlayerProfile__UnorderedGroup_3__2
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
    // InternalRangoMode.g:9070:1: rule__PlayerProfile__UnorderedGroup_3__2 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9074:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )? )
            // InternalRangoMode.g:9075:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_82);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9076:2: ( rule__PlayerProfile__UnorderedGroup_3__3 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt51=1;
            }
            else if ( LA51_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt51=1;
            }
            else if ( LA51_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt51=1;
            }
            else if ( LA51_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRangoMode.g:9076:2: rule__PlayerProfile__UnorderedGroup_3__3
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
    // InternalRangoMode.g:9082:1: rule__PlayerProfile__UnorderedGroup_3__3 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9086:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )? )
            // InternalRangoMode.g:9087:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_82);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9088:2: ( rule__PlayerProfile__UnorderedGroup_3__4 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt52=1;
            }
            else if ( LA52_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt52=1;
            }
            else if ( LA52_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt52=1;
            }
            else if ( LA52_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRangoMode.g:9088:2: rule__PlayerProfile__UnorderedGroup_3__4
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
    // InternalRangoMode.g:9094:1: rule__PlayerProfile__UnorderedGroup_3__4 : rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? ;
    public final void rule__PlayerProfile__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9098:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )? )
            // InternalRangoMode.g:9099:2: rule__PlayerProfile__UnorderedGroup_3__Impl ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_82);
            rule__PlayerProfile__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalRangoMode.g:9100:2: ( rule__PlayerProfile__UnorderedGroup_3__5 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                alt53=1;
            }
            else if ( LA53_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                alt53=1;
            }
            else if ( LA53_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                alt53=1;
            }
            else if ( LA53_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                alt53=1;
            }
            else if ( LA53_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRangoMode.g:9100:2: rule__PlayerProfile__UnorderedGroup_3__5
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
    // InternalRangoMode.g:9106:1: rule__PlayerProfile__UnorderedGroup_3__5 : rule__PlayerProfile__UnorderedGroup_3__Impl ;
    public final void rule__PlayerProfile__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9110:1: ( rule__PlayerProfile__UnorderedGroup_3__Impl )
            // InternalRangoMode.g:9111:2: rule__PlayerProfile__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__GameMode__UnorderedGroup_10"
    // InternalRangoMode.g:9118:1: rule__GameMode__UnorderedGroup_10 : ( rule__GameMode__UnorderedGroup_10__0 )? ;
    public final void rule__GameMode__UnorderedGroup_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_10());
        	
        try {
            // InternalRangoMode.g:9123:1: ( ( rule__GameMode__UnorderedGroup_10__0 )? )
            // InternalRangoMode.g:9124:2: ( rule__GameMode__UnorderedGroup_10__0 )?
            {
            // InternalRangoMode.g:9124:2: ( rule__GameMode__UnorderedGroup_10__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRangoMode.g:9124:2: rule__GameMode__UnorderedGroup_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__UnorderedGroup_10__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getGameModeAccess().getUnorderedGroup_10());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_10"


    // $ANTLR start "rule__GameMode__UnorderedGroup_10__Impl"
    // InternalRangoMode.g:9132:1: rule__GameMode__UnorderedGroup_10__Impl : ( ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) ) ) ;
    public final void rule__GameMode__UnorderedGroup_10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9137:1: ( ( ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) ) ) )
            // InternalRangoMode.g:9138:3: ( ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9138:3: ( ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalRangoMode.g:9139:3: ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9139:3: ({...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) ) )
                    // InternalRangoMode.g:9140:4: {...}? => ( ( ( rule__GameMode__Group_10_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_10__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0)");
                    }
                    // InternalRangoMode.g:9140:105: ( ( ( rule__GameMode__Group_10_0__0 ) ) )
                    // InternalRangoMode.g:9141:5: ( ( rule__GameMode__Group_10_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9147:5: ( ( rule__GameMode__Group_10_0__0 ) )
                    // InternalRangoMode.g:9148:6: ( rule__GameMode__Group_10_0__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_10_0()); 
                    // InternalRangoMode.g:9149:6: ( rule__GameMode__Group_10_0__0 )
                    // InternalRangoMode.g:9149:7: rule__GameMode__Group_10_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_10_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getGroup_10_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:9154:3: ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9154:3: ({...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) ) )
                    // InternalRangoMode.g:9155:4: {...}? => ( ( ( rule__GameMode__Group_10_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GameMode__UnorderedGroup_10__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1)");
                    }
                    // InternalRangoMode.g:9155:105: ( ( ( rule__GameMode__Group_10_1__0 ) ) )
                    // InternalRangoMode.g:9156:5: ( ( rule__GameMode__Group_10_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9162:5: ( ( rule__GameMode__Group_10_1__0 ) )
                    // InternalRangoMode.g:9163:6: ( rule__GameMode__Group_10_1__0 )
                    {
                     before(grammarAccess.getGameModeAccess().getGroup_10_1()); 
                    // InternalRangoMode.g:9164:6: ( rule__GameMode__Group_10_1__0 )
                    // InternalRangoMode.g:9164:7: rule__GameMode__Group_10_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__Group_10_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGameModeAccess().getGroup_10_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameModeAccess().getUnorderedGroup_10());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_10__Impl"


    // $ANTLR start "rule__GameMode__UnorderedGroup_10__0"
    // InternalRangoMode.g:9177:1: rule__GameMode__UnorderedGroup_10__0 : rule__GameMode__UnorderedGroup_10__Impl ( rule__GameMode__UnorderedGroup_10__1 )? ;
    public final void rule__GameMode__UnorderedGroup_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9181:1: ( rule__GameMode__UnorderedGroup_10__Impl ( rule__GameMode__UnorderedGroup_10__1 )? )
            // InternalRangoMode.g:9182:2: rule__GameMode__UnorderedGroup_10__Impl ( rule__GameMode__UnorderedGroup_10__1 )?
            {
            pushFollow(FOLLOW_83);
            rule__GameMode__UnorderedGroup_10__Impl();

            state._fsp--;

            // InternalRangoMode.g:9183:2: ( rule__GameMode__UnorderedGroup_10__1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_10(), 1) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRangoMode.g:9183:2: rule__GameMode__UnorderedGroup_10__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GameMode__UnorderedGroup_10__1();

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
    // $ANTLR end "rule__GameMode__UnorderedGroup_10__0"


    // $ANTLR start "rule__GameMode__UnorderedGroup_10__1"
    // InternalRangoMode.g:9189:1: rule__GameMode__UnorderedGroup_10__1 : rule__GameMode__UnorderedGroup_10__Impl ;
    public final void rule__GameMode__UnorderedGroup_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9193:1: ( rule__GameMode__UnorderedGroup_10__Impl )
            // InternalRangoMode.g:9194:2: rule__GameMode__UnorderedGroup_10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMode__UnorderedGroup_10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__UnorderedGroup_10__1"


    // $ANTLR start "rule__Arena__UnorderedGroup_4"
    // InternalRangoMode.g:9201:1: rule__Arena__UnorderedGroup_4 : ( rule__Arena__UnorderedGroup_4__0 )? ;
    public final void rule__Arena__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getArenaAccess().getUnorderedGroup_4());
        	
        try {
            // InternalRangoMode.g:9206:1: ( ( rule__Arena__UnorderedGroup_4__0 )? )
            // InternalRangoMode.g:9207:2: ( rule__Arena__UnorderedGroup_4__0 )?
            {
            // InternalRangoMode.g:9207:2: ( rule__Arena__UnorderedGroup_4__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt57=1;
            }
            else if ( LA57_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRangoMode.g:9207:2: rule__Arena__UnorderedGroup_4__0
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
    // InternalRangoMode.g:9215:1: rule__Arena__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Arena__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRangoMode.g:9220:1: ( ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) ) )
            // InternalRangoMode.g:9221:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            {
            // InternalRangoMode.g:9221:3: ( ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) ) )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt58=2;
            }
            else if ( LA58_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt58=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalRangoMode.g:9222:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9222:3: ({...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) ) )
                    // InternalRangoMode.g:9223:4: {...}? => ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalRangoMode.g:9223:101: ( ( ( rule__Arena__Group_4_0__0 ) ) )
                    // InternalRangoMode.g:9224:5: ( ( rule__Arena__Group_4_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9230:5: ( ( rule__Arena__Group_4_0__0 ) )
                    // InternalRangoMode.g:9231:6: ( rule__Arena__Group_4_0__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_0()); 
                    // InternalRangoMode.g:9232:6: ( rule__Arena__Group_4_0__0 )
                    // InternalRangoMode.g:9232:7: rule__Arena__Group_4_0__0
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
                    // InternalRangoMode.g:9237:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9237:3: ({...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) ) )
                    // InternalRangoMode.g:9238:4: {...}? => ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalRangoMode.g:9238:101: ( ( ( rule__Arena__Group_4_1__0 ) ) )
                    // InternalRangoMode.g:9239:5: ( ( rule__Arena__Group_4_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9245:5: ( ( rule__Arena__Group_4_1__0 ) )
                    // InternalRangoMode.g:9246:6: ( rule__Arena__Group_4_1__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_1()); 
                    // InternalRangoMode.g:9247:6: ( rule__Arena__Group_4_1__0 )
                    // InternalRangoMode.g:9247:7: rule__Arena__Group_4_1__0
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
                    // InternalRangoMode.g:9252:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    {
                    // InternalRangoMode.g:9252:3: ({...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) ) )
                    // InternalRangoMode.g:9253:4: {...}? => ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Arena__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalRangoMode.g:9253:101: ( ( ( rule__Arena__Group_4_2__0 ) ) )
                    // InternalRangoMode.g:9254:5: ( ( rule__Arena__Group_4_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRangoMode.g:9260:5: ( ( rule__Arena__Group_4_2__0 ) )
                    // InternalRangoMode.g:9261:6: ( rule__Arena__Group_4_2__0 )
                    {
                     before(grammarAccess.getArenaAccess().getGroup_4_2()); 
                    // InternalRangoMode.g:9262:6: ( rule__Arena__Group_4_2__0 )
                    // InternalRangoMode.g:9262:7: rule__Arena__Group_4_2__0
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
    // InternalRangoMode.g:9275:1: rule__Arena__UnorderedGroup_4__0 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? ;
    public final void rule__Arena__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9279:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )? )
            // InternalRangoMode.g:9280:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_84);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9281:2: ( rule__Arena__UnorderedGroup_4__1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt59=1;
            }
            else if ( LA59_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRangoMode.g:9281:2: rule__Arena__UnorderedGroup_4__1
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
    // InternalRangoMode.g:9287:1: rule__Arena__UnorderedGroup_4__1 : rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? ;
    public final void rule__Arena__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9291:1: ( rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )? )
            // InternalRangoMode.g:9292:2: rule__Arena__UnorderedGroup_4__Impl ( rule__Arena__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_84);
            rule__Arena__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalRangoMode.g:9293:2: ( rule__Arena__UnorderedGroup_4__2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                alt60=1;
            }
            else if ( LA60_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRangoMode.g:9293:2: rule__Arena__UnorderedGroup_4__2
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
    // InternalRangoMode.g:9299:1: rule__Arena__UnorderedGroup_4__2 : rule__Arena__UnorderedGroup_4__Impl ;
    public final void rule__Arena__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9303:1: ( rule__Arena__UnorderedGroup_4__Impl )
            // InternalRangoMode.g:9304:2: rule__Arena__UnorderedGroup_4__Impl
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
    // InternalRangoMode.g:9311:1: rule__Edition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Edition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9315:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9316:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9316:2: ( RULE_ID )
            // InternalRangoMode.g:9317:3: RULE_ID
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
    // InternalRangoMode.g:9326:1: rule__Edition__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Edition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9330:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9331:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9331:2: ( RULE_STRING )
            // InternalRangoMode.g:9332:3: RULE_STRING
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


    // $ANTLR start "rule__Edition__BallTypesAssignment_3_0"
    // InternalRangoMode.g:9341:1: rule__Edition__BallTypesAssignment_3_0 : ( ruleBallType ) ;
    public final void rule__Edition__BallTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9345:1: ( ( ruleBallType ) )
            // InternalRangoMode.g:9346:2: ( ruleBallType )
            {
            // InternalRangoMode.g:9346:2: ( ruleBallType )
            // InternalRangoMode.g:9347:3: ruleBallType
            {
             before(grammarAccess.getEditionAccess().getBallTypesBallTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBallType();

            state._fsp--;

             after(grammarAccess.getEditionAccess().getBallTypesBallTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edition__BallTypesAssignment_3_0"


    // $ANTLR start "rule__Edition__PowerUpsAssignment_3_1"
    // InternalRangoMode.g:9356:1: rule__Edition__PowerUpsAssignment_3_1 : ( rulePowerUp ) ;
    public final void rule__Edition__PowerUpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9360:1: ( ( rulePowerUp ) )
            // InternalRangoMode.g:9361:2: ( rulePowerUp )
            {
            // InternalRangoMode.g:9361:2: ( rulePowerUp )
            // InternalRangoMode.g:9362:3: rulePowerUp
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
    // InternalRangoMode.g:9371:1: rule__Edition__MaterialsAssignment_3_2 : ( ruleMaterial ) ;
    public final void rule__Edition__MaterialsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9375:1: ( ( ruleMaterial ) )
            // InternalRangoMode.g:9376:2: ( ruleMaterial )
            {
            // InternalRangoMode.g:9376:2: ( ruleMaterial )
            // InternalRangoMode.g:9377:3: ruleMaterial
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
    // InternalRangoMode.g:9386:1: rule__Edition__PlayersAssignment_3_3 : ( rulePlayerProfile ) ;
    public final void rule__Edition__PlayersAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9390:1: ( ( rulePlayerProfile ) )
            // InternalRangoMode.g:9391:2: ( rulePlayerProfile )
            {
            // InternalRangoMode.g:9391:2: ( rulePlayerProfile )
            // InternalRangoMode.g:9392:3: rulePlayerProfile
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


    // $ANTLR start "rule__Edition__ModesAssignment_3_4"
    // InternalRangoMode.g:9401:1: rule__Edition__ModesAssignment_3_4 : ( ruleGameMode ) ;
    public final void rule__Edition__ModesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9405:1: ( ( ruleGameMode ) )
            // InternalRangoMode.g:9406:2: ( ruleGameMode )
            {
            // InternalRangoMode.g:9406:2: ( ruleGameMode )
            // InternalRangoMode.g:9407:3: ruleGameMode
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


    // $ANTLR start "rule__BallType__NameAssignment_1"
    // InternalRangoMode.g:9416:1: rule__BallType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BallType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9420:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9421:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9421:2: ( RULE_ID )
            // InternalRangoMode.g:9422:3: RULE_ID
            {
             before(grammarAccess.getBallTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__NameAssignment_1"


    // $ANTLR start "rule__BallType__SpriteAssignment_3_0_1"
    // InternalRangoMode.g:9431:1: rule__BallType__SpriteAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__BallType__SpriteAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9435:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9436:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9436:2: ( RULE_STRING )
            // InternalRangoMode.g:9437:3: RULE_STRING
            {
             before(grammarAccess.getBallTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__SpriteAssignment_3_0_1"


    // $ANTLR start "rule__BallType__ScaleAssignment_3_1_1"
    // InternalRangoMode.g:9446:1: rule__BallType__ScaleAssignment_3_1_1 : ( ruleDecimal ) ;
    public final void rule__BallType__ScaleAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9450:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9451:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9451:2: ( ruleDecimal )
            // InternalRangoMode.g:9452:3: ruleDecimal
            {
             before(grammarAccess.getBallTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__ScaleAssignment_3_1_1"


    // $ANTLR start "rule__BallType__BounceAssignment_3_2_1"
    // InternalRangoMode.g:9461:1: rule__BallType__BounceAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__BallType__BounceAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9465:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9466:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9466:2: ( ruleDecimal )
            // InternalRangoMode.g:9467:3: ruleDecimal
            {
             before(grammarAccess.getBallTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__BounceAssignment_3_2_1"


    // $ANTLR start "rule__BallType__SpeedAssignment_3_3_1"
    // InternalRangoMode.g:9476:1: rule__BallType__SpeedAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__BallType__SpeedAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9480:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9481:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9481:2: ( ruleDecimal )
            // InternalRangoMode.g:9482:3: ruleDecimal
            {
             before(grammarAccess.getBallTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__SpeedAssignment_3_3_1"


    // $ANTLR start "rule__BallType__PointsAssignment_3_4_1"
    // InternalRangoMode.g:9491:1: rule__BallType__PointsAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__BallType__PointsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9495:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9496:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9496:2: ( RULE_INT )
            // InternalRangoMode.g:9497:3: RULE_INT
            {
             before(grammarAccess.getBallTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBallTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__PointsAssignment_3_4_1"


    // $ANTLR start "rule__BallType__SplitRuleAssignment_7"
    // InternalRangoMode.g:9506:1: rule__BallType__SplitRuleAssignment_7 : ( ruleSplitRule ) ;
    public final void rule__BallType__SplitRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9510:1: ( ( ruleSplitRule ) )
            // InternalRangoMode.g:9511:2: ( ruleSplitRule )
            {
            // InternalRangoMode.g:9511:2: ( ruleSplitRule )
            // InternalRangoMode.g:9512:3: ruleSplitRule
            {
             before(grammarAccess.getBallTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSplitRule();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__SplitRuleAssignment_7"


    // $ANTLR start "rule__BallType__ContactEffectsAssignment_11"
    // InternalRangoMode.g:9521:1: rule__BallType__ContactEffectsAssignment_11 : ( rulePlayerEffect ) ;
    public final void rule__BallType__ContactEffectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9525:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9526:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9526:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9527:3: rulePlayerEffect
            {
             before(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__ContactEffectsAssignment_11"


    // $ANTLR start "rule__BallType__ContactEffectsAssignment_12_1"
    // InternalRangoMode.g:9536:1: rule__BallType__ContactEffectsAssignment_12_1 : ( rulePlayerEffect ) ;
    public final void rule__BallType__ContactEffectsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9540:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9541:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9541:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9542:3: rulePlayerEffect
            {
             before(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerEffect();

            state._fsp--;

             after(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallType__ContactEffectsAssignment_12_1"


    // $ANTLR start "rule__Split__FragmentsAssignment_2"
    // InternalRangoMode.g:9551:1: rule__Split__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Split__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9555:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9556:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9556:2: ( RULE_INT )
            // InternalRangoMode.g:9557:3: RULE_INT
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
    // InternalRangoMode.g:9566:1: rule__Split__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Split__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9570:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9571:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9571:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9572:3: ( RULE_ID )
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeBallTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9573:3: ( RULE_ID )
            // InternalRangoMode.g:9574:4: RULE_ID
            {
             before(grammarAccess.getSplitAccess().getFragmentTypeBallTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSplitAccess().getFragmentTypeBallTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSplitAccess().getFragmentTypeBallTypeCrossReference_3_0()); 

            }


            }

        }
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
    // InternalRangoMode.g:9585:1: rule__Split__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Split__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9589:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9590:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9590:2: ( ruleDecimal )
            // InternalRangoMode.g:9591:3: ruleDecimal
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


    // $ANTLR start "rule__Burst__FragmentsAssignment_2"
    // InternalRangoMode.g:9600:1: rule__Burst__FragmentsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Burst__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9604:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9605:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9605:2: ( RULE_INT )
            // InternalRangoMode.g:9606:3: RULE_INT
            {
             before(grammarAccess.getBurstAccess().getFragmentsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getFragmentsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__FragmentsAssignment_2"


    // $ANTLR start "rule__Burst__FragmentTypeAssignment_3"
    // InternalRangoMode.g:9615:1: rule__Burst__FragmentTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Burst__FragmentTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9619:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:9620:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:9620:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:9621:3: ( RULE_ID )
            {
             before(grammarAccess.getBurstAccess().getFragmentTypeBallTypeCrossReference_3_0()); 
            // InternalRangoMode.g:9622:3: ( RULE_ID )
            // InternalRangoMode.g:9623:4: RULE_ID
            {
             before(grammarAccess.getBurstAccess().getFragmentTypeBallTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBurstAccess().getFragmentTypeBallTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBurstAccess().getFragmentTypeBallTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__FragmentTypeAssignment_3"


    // $ANTLR start "rule__Burst__LaunchSpeedAssignment_4_2"
    // InternalRangoMode.g:9634:1: rule__Burst__LaunchSpeedAssignment_4_2 : ( ruleDecimal ) ;
    public final void rule__Burst__LaunchSpeedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9638:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9639:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9639:2: ( ruleDecimal )
            // InternalRangoMode.g:9640:3: ruleDecimal
            {
             before(grammarAccess.getBurstAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getBurstAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Burst__LaunchSpeedAssignment_4_2"


    // $ANTLR start "rule__Damage__AmountAssignment_1"
    // InternalRangoMode.g:9649:1: rule__Damage__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Damage__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9653:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9654:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9654:2: ( RULE_INT )
            // InternalRangoMode.g:9655:3: RULE_INT
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
    // InternalRangoMode.g:9664:1: rule__Heal__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Heal__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9668:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9669:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9669:2: ( RULE_INT )
            // InternalRangoMode.g:9670:3: RULE_INT
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
    // InternalRangoMode.g:9679:1: rule__Shield__DurationAssignment_2 : ( ruleDecimal ) ;
    public final void rule__Shield__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9683:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9684:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9684:2: ( ruleDecimal )
            // InternalRangoMode.g:9685:3: ruleDecimal
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
    // InternalRangoMode.g:9694:1: rule__SpeedChange__FactorAssignment_2 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9698:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9699:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9699:2: ( ruleDecimal )
            // InternalRangoMode.g:9700:3: ruleDecimal
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
    // InternalRangoMode.g:9709:1: rule__SpeedChange__DurationAssignment_4 : ( ruleDecimal ) ;
    public final void rule__SpeedChange__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9713:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9714:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9714:2: ( ruleDecimal )
            // InternalRangoMode.g:9715:3: ruleDecimal
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
    // InternalRangoMode.g:9724:1: rule__Poison__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Poison__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9728:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9729:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9729:2: ( RULE_INT )
            // InternalRangoMode.g:9730:3: RULE_INT
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
    // InternalRangoMode.g:9739:1: rule__Poison__IntervalAssignment_3 : ( ruleDecimal ) ;
    public final void rule__Poison__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9743:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9744:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9744:2: ( ruleDecimal )
            // InternalRangoMode.g:9745:3: ruleDecimal
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
    // InternalRangoMode.g:9754:1: rule__Poison__DurationAssignment_6 : ( ruleDecimal ) ;
    public final void rule__Poison__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9758:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9759:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9759:2: ( ruleDecimal )
            // InternalRangoMode.g:9760:3: ruleDecimal
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
    // InternalRangoMode.g:9769:1: rule__PowerUp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PowerUp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9773:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9774:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9774:2: ( RULE_ID )
            // InternalRangoMode.g:9775:3: RULE_ID
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
    // InternalRangoMode.g:9784:1: rule__PowerUp__SpriteAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PowerUp__SpriteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9788:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9789:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9789:2: ( RULE_STRING )
            // InternalRangoMode.g:9790:3: RULE_STRING
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
    // InternalRangoMode.g:9799:1: rule__PowerUp__EffectsAssignment_7 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9803:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9804:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9804:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9805:3: rulePlayerEffect
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
    // InternalRangoMode.g:9814:1: rule__PowerUp__EffectsAssignment_8_1 : ( rulePlayerEffect ) ;
    public final void rule__PowerUp__EffectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9818:1: ( ( rulePlayerEffect ) )
            // InternalRangoMode.g:9819:2: ( rulePlayerEffect )
            {
            // InternalRangoMode.g:9819:2: ( rulePlayerEffect )
            // InternalRangoMode.g:9820:3: rulePlayerEffect
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
    // InternalRangoMode.g:9829:1: rule__Material__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Material__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9833:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9834:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9834:2: ( RULE_ID )
            // InternalRangoMode.g:9835:3: RULE_ID
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
    // InternalRangoMode.g:9844:1: rule__Material__BounceAssignment_3_0_1 : ( ruleDecimal ) ;
    public final void rule__Material__BounceAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9848:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9849:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9849:2: ( ruleDecimal )
            // InternalRangoMode.g:9850:3: ruleDecimal
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
    // InternalRangoMode.g:9859:1: rule__Material__SpriteAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Material__SpriteAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9863:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9864:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9864:2: ( RULE_STRING )
            // InternalRangoMode.g:9865:3: RULE_STRING
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
    // InternalRangoMode.g:9874:1: rule__PlayerProfile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PlayerProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9878:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9879:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9879:2: ( RULE_ID )
            // InternalRangoMode.g:9880:3: RULE_ID
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
    // InternalRangoMode.g:9889:1: rule__PlayerProfile__CharacterAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PlayerProfile__CharacterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9893:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:9894:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:9894:2: ( RULE_STRING )
            // InternalRangoMode.g:9895:3: RULE_STRING
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
    // InternalRangoMode.g:9904:1: rule__PlayerProfile__HealthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__HealthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9908:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9909:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9909:2: ( RULE_INT )
            // InternalRangoMode.g:9910:3: RULE_INT
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
    // InternalRangoMode.g:9919:1: rule__PlayerProfile__MaxHealthAssignment_3_1_2_1 : ( RULE_INT ) ;
    public final void rule__PlayerProfile__MaxHealthAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9923:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:9924:2: ( RULE_INT )
            {
            // InternalRangoMode.g:9924:2: ( RULE_INT )
            // InternalRangoMode.g:9925:3: RULE_INT
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
    // InternalRangoMode.g:9934:1: rule__PlayerProfile__SpeedAssignment_3_2_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__SpeedAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9938:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9939:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9939:2: ( ruleDecimal )
            // InternalRangoMode.g:9940:3: ruleDecimal
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
    // InternalRangoMode.g:9949:1: rule__PlayerProfile__TongueTimeAssignment_3_3_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__TongueTimeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9953:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9954:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9954:2: ( ruleDecimal )
            // InternalRangoMode.g:9955:3: ruleDecimal
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
    // InternalRangoMode.g:9964:1: rule__PlayerProfile__CooldownAssignment_3_4_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__CooldownAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9968:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9969:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9969:2: ( ruleDecimal )
            // InternalRangoMode.g:9970:3: ruleDecimal
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
    // InternalRangoMode.g:9979:1: rule__PlayerProfile__GraceTimeAssignment_3_5_1 : ( ruleDecimal ) ;
    public final void rule__PlayerProfile__GraceTimeAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9983:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:9984:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:9984:2: ( ruleDecimal )
            // InternalRangoMode.g:9985:3: ruleDecimal
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
    // InternalRangoMode.g:9994:1: rule__GameMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:9998:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:9999:2: ( RULE_ID )
            {
            // InternalRangoMode.g:9999:2: ( RULE_ID )
            // InternalRangoMode.g:10000:3: RULE_ID
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
    // InternalRangoMode.g:10009:1: rule__GameMode__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GameMode__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10013:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10014:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10014:2: ( RULE_STRING )
            // InternalRangoMode.g:10015:3: RULE_STRING
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
    // InternalRangoMode.g:10024:1: rule__GameMode__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__GameMode__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10028:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10029:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10029:2: ( RULE_STRING )
            // InternalRangoMode.g:10030:3: RULE_STRING
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
    // InternalRangoMode.g:10039:1: rule__GameMode__PlayerAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__PlayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10043:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10044:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10044:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10045:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0()); 
            // InternalRangoMode.g:10046:3: ( RULE_ID )
            // InternalRangoMode.g:10047:4: RULE_ID
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


    // $ANTLR start "rule__GameMode__BallTypesAssignment_8"
    // InternalRangoMode.g:10058:1: rule__GameMode__BallTypesAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__BallTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10062:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10063:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10063:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10064:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getBallTypesBallTypeCrossReference_8_0()); 
            // InternalRangoMode.g:10065:3: ( RULE_ID )
            // InternalRangoMode.g:10066:4: RULE_ID
            {
             before(grammarAccess.getGameModeAccess().getBallTypesBallTypeIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getBallTypesBallTypeIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getGameModeAccess().getBallTypesBallTypeCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__BallTypesAssignment_8"


    // $ANTLR start "rule__GameMode__BallTypesAssignment_9_1"
    // InternalRangoMode.g:10077:1: rule__GameMode__BallTypesAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__GameMode__BallTypesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10081:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10082:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10082:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10083:3: ( RULE_ID )
            {
             before(grammarAccess.getGameModeAccess().getBallTypesBallTypeCrossReference_9_1_0()); 
            // InternalRangoMode.g:10084:3: ( RULE_ID )
            // InternalRangoMode.g:10085:4: RULE_ID
            {
             before(grammarAccess.getGameModeAccess().getBallTypesBallTypeIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameModeAccess().getBallTypesBallTypeIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getGameModeAccess().getBallTypesBallTypeCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__BallTypesAssignment_9_1"


    // $ANTLR start "rule__GameMode__GravityAssignment_10_0_1"
    // InternalRangoMode.g:10096:1: rule__GameMode__GravityAssignment_10_0_1 : ( ruleDecimal ) ;
    public final void rule__GameMode__GravityAssignment_10_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10100:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10101:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10101:2: ( ruleDecimal )
            // InternalRangoMode.g:10102:3: ruleDecimal
            {
             before(grammarAccess.getGameModeAccess().getGravityDecimalParserRuleCall_10_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getGravityDecimalParserRuleCall_10_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__GravityAssignment_10_0_1"


    // $ANTLR start "rule__GameMode__ScoringAssignment_10_1_1"
    // InternalRangoMode.g:10111:1: rule__GameMode__ScoringAssignment_10_1_1 : ( ruleScoring ) ;
    public final void rule__GameMode__ScoringAssignment_10_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10115:1: ( ( ruleScoring ) )
            // InternalRangoMode.g:10116:2: ( ruleScoring )
            {
            // InternalRangoMode.g:10116:2: ( ruleScoring )
            // InternalRangoMode.g:10117:3: ruleScoring
            {
             before(grammarAccess.getGameModeAccess().getScoringScoringEnumRuleCall_10_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScoring();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getScoringScoringEnumRuleCall_10_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__ScoringAssignment_10_1_1"


    // $ANTLR start "rule__GameMode__ArenaAssignment_11"
    // InternalRangoMode.g:10126:1: rule__GameMode__ArenaAssignment_11 : ( ruleArena ) ;
    public final void rule__GameMode__ArenaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10130:1: ( ( ruleArena ) )
            // InternalRangoMode.g:10131:2: ( ruleArena )
            {
            // InternalRangoMode.g:10131:2: ( ruleArena )
            // InternalRangoMode.g:10132:3: ruleArena
            {
             before(grammarAccess.getGameModeAccess().getArenaArenaParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getArenaArenaParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__ArenaAssignment_11"


    // $ANTLR start "rule__GameMode__SpawningAssignment_12"
    // InternalRangoMode.g:10141:1: rule__GameMode__SpawningAssignment_12 : ( ruleSpawnStrategy ) ;
    public final void rule__GameMode__SpawningAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10145:1: ( ( ruleSpawnStrategy ) )
            // InternalRangoMode.g:10146:2: ( ruleSpawnStrategy )
            {
            // InternalRangoMode.g:10146:2: ( ruleSpawnStrategy )
            // InternalRangoMode.g:10147:3: ruleSpawnStrategy
            {
             before(grammarAccess.getGameModeAccess().getSpawningSpawnStrategyParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleSpawnStrategy();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getSpawningSpawnStrategyParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__SpawningAssignment_12"


    // $ANTLR start "rule__GameMode__DropsAssignment_13"
    // InternalRangoMode.g:10156:1: rule__GameMode__DropsAssignment_13 : ( ruleDropTable ) ;
    public final void rule__GameMode__DropsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10160:1: ( ( ruleDropTable ) )
            // InternalRangoMode.g:10161:2: ( ruleDropTable )
            {
            // InternalRangoMode.g:10161:2: ( ruleDropTable )
            // InternalRangoMode.g:10162:3: ruleDropTable
            {
             before(grammarAccess.getGameModeAccess().getDropsDropTableParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleDropTable();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getDropsDropTableParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__DropsAssignment_13"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_14_2"
    // InternalRangoMode.g:10171:1: rule__GameMode__WinConditionsAssignment_14_2 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10175:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10176:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10176:2: ( ruleEndCondition )
            // InternalRangoMode.g:10177:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_14_2"


    // $ANTLR start "rule__GameMode__WinConditionsAssignment_14_3_1"
    // InternalRangoMode.g:10186:1: rule__GameMode__WinConditionsAssignment_14_3_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__WinConditionsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10190:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10191:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10191:2: ( ruleEndCondition )
            // InternalRangoMode.g:10192:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__WinConditionsAssignment_14_3_1"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_17"
    // InternalRangoMode.g:10201:1: rule__GameMode__LoseConditionsAssignment_17 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10205:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10206:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10206:2: ( ruleEndCondition )
            // InternalRangoMode.g:10207:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_17"


    // $ANTLR start "rule__GameMode__LoseConditionsAssignment_18_1"
    // InternalRangoMode.g:10216:1: rule__GameMode__LoseConditionsAssignment_18_1 : ( ruleEndCondition ) ;
    public final void rule__GameMode__LoseConditionsAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10220:1: ( ( ruleEndCondition ) )
            // InternalRangoMode.g:10221:2: ( ruleEndCondition )
            {
            // InternalRangoMode.g:10221:2: ( ruleEndCondition )
            // InternalRangoMode.g:10222:3: ruleEndCondition
            {
             before(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMode__LoseConditionsAssignment_18_1"


    // $ANTLR start "rule__Arena__BackgroundAssignment_3"
    // InternalRangoMode.g:10231:1: rule__Arena__BackgroundAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Arena__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10235:1: ( ( RULE_STRING ) )
            // InternalRangoMode.g:10236:2: ( RULE_STRING )
            {
            // InternalRangoMode.g:10236:2: ( RULE_STRING )
            // InternalRangoMode.g:10237:3: RULE_STRING
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
    // InternalRangoMode.g:10246:1: rule__Arena__FloorAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__FloorAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10250:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10251:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10251:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10252:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getFloorMaterialCrossReference_4_0_1_0()); 
            // InternalRangoMode.g:10253:3: ( RULE_ID )
            // InternalRangoMode.g:10254:4: RULE_ID
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
    // InternalRangoMode.g:10265:1: rule__Arena__WallsAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Arena__WallsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10269:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10270:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10270:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10271:3: ( RULE_ID )
            {
             before(grammarAccess.getArenaAccess().getWallsMaterialCrossReference_4_1_1_0()); 
            // InternalRangoMode.g:10272:3: ( RULE_ID )
            // InternalRangoMode.g:10273:4: RULE_ID
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
    // InternalRangoMode.g:10284:1: rule__Arena__PlayerStartAssignment_4_2_3 : ( ruleDecimal ) ;
    public final void rule__Arena__PlayerStartAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10288:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10289:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10289:2: ( ruleDecimal )
            // InternalRangoMode.g:10290:3: ruleDecimal
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
    // InternalRangoMode.g:10299:1: rule__Arena__ObstaclesAssignment_5 : ( ruleObstacle ) ;
    public final void rule__Arena__ObstaclesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10303:1: ( ( ruleObstacle ) )
            // InternalRangoMode.g:10304:2: ( ruleObstacle )
            {
            // InternalRangoMode.g:10304:2: ( ruleObstacle )
            // InternalRangoMode.g:10305:3: ruleObstacle
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
    // InternalRangoMode.g:10314:1: rule__At__XAssignment_2 : ( ruleDecimal ) ;
    public final void rule__At__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10318:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10319:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10319:2: ( ruleDecimal )
            // InternalRangoMode.g:10320:3: ruleDecimal
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
    // InternalRangoMode.g:10329:1: rule__At__YAssignment_5 : ( ruleDecimal ) ;
    public final void rule__At__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10333:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10334:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10334:2: ( ruleDecimal )
            // InternalRangoMode.g:10335:3: ruleDecimal
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
    // InternalRangoMode.g:10344:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10348:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10349:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10349:2: ( RULE_ID )
            // InternalRangoMode.g:10350:3: RULE_ID
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
    // InternalRangoMode.g:10359:1: rule__Block__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__Block__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10363:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10364:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10364:2: ( RULE_INT )
            // InternalRangoMode.g:10365:3: RULE_INT
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
    // InternalRangoMode.g:10374:1: rule__Block__HeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__Block__HeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10378:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10379:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10379:2: ( RULE_INT )
            // InternalRangoMode.g:10380:3: RULE_INT
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
    // InternalRangoMode.g:10389:1: rule__Block__MaterialAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Block__MaterialAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10393:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10394:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10394:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10395:3: ( RULE_ID )
            {
             before(grammarAccess.getBlockAccess().getMaterialMaterialCrossReference_7_1_0()); 
            // InternalRangoMode.g:10396:3: ( RULE_ID )
            // InternalRangoMode.g:10397:4: RULE_ID
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
    // InternalRangoMode.g:10408:1: rule__JumpPad__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JumpPad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10412:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10413:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10413:2: ( RULE_ID )
            // InternalRangoMode.g:10414:3: RULE_ID
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
    // InternalRangoMode.g:10423:1: rule__JumpPad__LaunchAssignment_4 : ( ruleDecimal ) ;
    public final void rule__JumpPad__LaunchAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10427:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10428:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10428:2: ( ruleDecimal )
            // InternalRangoMode.g:10429:3: ruleDecimal
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
    // InternalRangoMode.g:10438:1: rule__JumpPad__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__JumpPad__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10442:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10443:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10443:2: ( ruleTarget )
            // InternalRangoMode.g:10444:3: ruleTarget
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
    // InternalRangoMode.g:10453:1: rule__Teleporter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Teleporter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10457:1: ( ( RULE_ID ) )
            // InternalRangoMode.g:10458:2: ( RULE_ID )
            {
            // InternalRangoMode.g:10458:2: ( RULE_ID )
            // InternalRangoMode.g:10459:3: RULE_ID
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
    // InternalRangoMode.g:10468:1: rule__Teleporter__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Teleporter__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10472:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10473:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10473:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10474:3: ( RULE_ID )
            {
             before(grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0()); 
            // InternalRangoMode.g:10475:3: ( RULE_ID )
            // InternalRangoMode.g:10476:4: RULE_ID
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
    // InternalRangoMode.g:10487:1: rule__Teleporter__AffectsAssignment_5_1 : ( ruleTarget ) ;
    public final void rule__Teleporter__AffectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10491:1: ( ( ruleTarget ) )
            // InternalRangoMode.g:10492:2: ( ruleTarget )
            {
            // InternalRangoMode.g:10492:2: ( ruleTarget )
            // InternalRangoMode.g:10493:3: ruleTarget
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
    // InternalRangoMode.g:10502:1: rule__FixedLayout__SpawnsAssignment_2 : ( ruleBallSpawn ) ;
    public final void rule__FixedLayout__SpawnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10506:1: ( ( ruleBallSpawn ) )
            // InternalRangoMode.g:10507:2: ( ruleBallSpawn )
            {
            // InternalRangoMode.g:10507:2: ( ruleBallSpawn )
            // InternalRangoMode.g:10508:3: ruleBallSpawn
            {
             before(grammarAccess.getFixedLayoutAccess().getSpawnsBallSpawnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBallSpawn();

            state._fsp--;

             after(grammarAccess.getFixedLayoutAccess().getSpawnsBallSpawnParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalRangoMode.g:10517:1: rule__WaveSchedule__LoopAssignment_1_0 : ( ( 'looping' ) ) ;
    public final void rule__WaveSchedule__LoopAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10521:1: ( ( ( 'looping' ) ) )
            // InternalRangoMode.g:10522:2: ( ( 'looping' ) )
            {
            // InternalRangoMode.g:10522:2: ( ( 'looping' ) )
            // InternalRangoMode.g:10523:3: ( 'looping' )
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            // InternalRangoMode.g:10524:3: ( 'looping' )
            // InternalRangoMode.g:10525:4: 'looping'
            {
             before(grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0()); 
            match(input,97,FOLLOW_2); 
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
    // InternalRangoMode.g:10536:1: rule__WaveSchedule__EscalationAssignment_1_1_2 : ( RULE_INT ) ;
    public final void rule__WaveSchedule__EscalationAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10540:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10541:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10541:2: ( RULE_INT )
            // InternalRangoMode.g:10542:3: RULE_INT
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
    // InternalRangoMode.g:10551:1: rule__WaveSchedule__WavesAssignment_3 : ( ruleWave ) ;
    public final void rule__WaveSchedule__WavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10555:1: ( ( ruleWave ) )
            // InternalRangoMode.g:10556:2: ( ruleWave )
            {
            // InternalRangoMode.g:10556:2: ( ruleWave )
            // InternalRangoMode.g:10557:3: ruleWave
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
    // InternalRangoMode.g:10566:1: rule__Wave__DelayAssignment_1_1 : ( ruleDecimal ) ;
    public final void rule__Wave__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10570:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10571:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10571:2: ( ruleDecimal )
            // InternalRangoMode.g:10572:3: ruleDecimal
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
    // InternalRangoMode.g:10581:1: rule__Wave__SpawnsAssignment_3 : ( ruleBallSpawn ) ;
    public final void rule__Wave__SpawnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10585:1: ( ( ruleBallSpawn ) )
            // InternalRangoMode.g:10586:2: ( ruleBallSpawn )
            {
            // InternalRangoMode.g:10586:2: ( ruleBallSpawn )
            // InternalRangoMode.g:10587:3: ruleBallSpawn
            {
             before(grammarAccess.getWaveAccess().getSpawnsBallSpawnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBallSpawn();

            state._fsp--;

             after(grammarAccess.getWaveAccess().getSpawnsBallSpawnParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BallSpawn__CountAssignment_0_0"
    // InternalRangoMode.g:10596:1: rule__BallSpawn__CountAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__BallSpawn__CountAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10600:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10601:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10601:2: ( RULE_INT )
            // InternalRangoMode.g:10602:3: RULE_INT
            {
             before(grammarAccess.getBallSpawnAccess().getCountINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getCountINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__CountAssignment_0_0"


    // $ANTLR start "rule__BallSpawn__TypeAssignment_1"
    // InternalRangoMode.g:10611:1: rule__BallSpawn__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BallSpawn__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10615:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10616:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10616:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10617:3: ( RULE_ID )
            {
             before(grammarAccess.getBallSpawnAccess().getTypeBallTypeCrossReference_1_0()); 
            // InternalRangoMode.g:10618:3: ( RULE_ID )
            // InternalRangoMode.g:10619:4: RULE_ID
            {
             before(grammarAccess.getBallSpawnAccess().getTypeBallTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getTypeBallTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBallSpawnAccess().getTypeBallTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__TypeAssignment_1"


    // $ANTLR start "rule__BallSpawn__SizeAssignment_3"
    // InternalRangoMode.g:10630:1: rule__BallSpawn__SizeAssignment_3 : ( RULE_INT ) ;
    public final void rule__BallSpawn__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10634:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10635:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10635:2: ( RULE_INT )
            // InternalRangoMode.g:10636:3: RULE_INT
            {
             before(grammarAccess.getBallSpawnAccess().getSizeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBallSpawnAccess().getSizeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__SizeAssignment_3"


    // $ANTLR start "rule__BallSpawn__DirectionAssignment_5_1"
    // InternalRangoMode.g:10645:1: rule__BallSpawn__DirectionAssignment_5_1 : ( ruleDirection ) ;
    public final void rule__BallSpawn__DirectionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10649:1: ( ( ruleDirection ) )
            // InternalRangoMode.g:10650:2: ( ruleDirection )
            {
            // InternalRangoMode.g:10650:2: ( ruleDirection )
            // InternalRangoMode.g:10651:3: ruleDirection
            {
             before(grammarAccess.getBallSpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getBallSpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallSpawn__DirectionAssignment_5_1"


    // $ANTLR start "rule__DropTable__ChanceAssignment_1"
    // InternalRangoMode.g:10660:1: rule__DropTable__ChanceAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DropTable__ChanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10664:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10665:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10665:2: ( ruleDecimal )
            // InternalRangoMode.g:10666:3: ruleDecimal
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
    // InternalRangoMode.g:10675:1: rule__DropTable__EntriesAssignment_4 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10679:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10680:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10680:2: ( ruleDrop )
            // InternalRangoMode.g:10681:3: ruleDrop
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
    // InternalRangoMode.g:10690:1: rule__DropTable__EntriesAssignment_5_1 : ( ruleDrop ) ;
    public final void rule__DropTable__EntriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10694:1: ( ( ruleDrop ) )
            // InternalRangoMode.g:10695:2: ( ruleDrop )
            {
            // InternalRangoMode.g:10695:2: ( ruleDrop )
            // InternalRangoMode.g:10696:3: ruleDrop
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
    // InternalRangoMode.g:10705:1: rule__Drop__PowerUpAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Drop__PowerUpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10709:1: ( ( ( RULE_ID ) ) )
            // InternalRangoMode.g:10710:2: ( ( RULE_ID ) )
            {
            // InternalRangoMode.g:10710:2: ( ( RULE_ID ) )
            // InternalRangoMode.g:10711:3: ( RULE_ID )
            {
             before(grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0()); 
            // InternalRangoMode.g:10712:3: ( RULE_ID )
            // InternalRangoMode.g:10713:4: RULE_ID
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
    // InternalRangoMode.g:10724:1: rule__Drop__WeightAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Drop__WeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10728:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10729:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10729:2: ( RULE_INT )
            // InternalRangoMode.g:10730:3: RULE_INT
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
    // InternalRangoMode.g:10739:1: rule__TimeReached__SecondsAssignment_2 : ( ruleDecimal ) ;
    public final void rule__TimeReached__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10743:1: ( ( ruleDecimal ) )
            // InternalRangoMode.g:10744:2: ( ruleDecimal )
            {
            // InternalRangoMode.g:10744:2: ( ruleDecimal )
            // InternalRangoMode.g:10745:3: ruleDecimal
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
    // InternalRangoMode.g:10754:1: rule__ScoreReached__PointsAssignment_2 : ( RULE_INT ) ;
    public final void rule__ScoreReached__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10758:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10759:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10759:2: ( RULE_INT )
            // InternalRangoMode.g:10760:3: RULE_INT
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


    // $ANTLR start "rule__BallsPopped__CountAssignment_0"
    // InternalRangoMode.g:10769:1: rule__BallsPopped__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__BallsPopped__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10773:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10774:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10774:2: ( RULE_INT )
            // InternalRangoMode.g:10775:3: RULE_INT
            {
             before(grammarAccess.getBallsPoppedAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBallsPoppedAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsPopped__CountAssignment_0"


    // $ANTLR start "rule__WavesSurvived__CountAssignment_0"
    // InternalRangoMode.g:10784:1: rule__WavesSurvived__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__WavesSurvived__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10788:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10789:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10789:2: ( RULE_INT )
            // InternalRangoMode.g:10790:3: RULE_INT
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


    // $ANTLR start "rule__BallsAlive__CountAssignment_0"
    // InternalRangoMode.g:10799:1: rule__BallsAlive__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__BallsAlive__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRangoMode.g:10803:1: ( ( RULE_INT ) )
            // InternalRangoMode.g:10804:2: ( RULE_INT )
            {
            // InternalRangoMode.g:10804:2: ( RULE_INT )
            // InternalRangoMode.g:10805:3: RULE_INT
            {
             before(grammarAccess.getBallsAliveAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBallsAliveAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BallsAlive__CountAssignment_0"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\16\2\uffff\1\134\2\uffff";
    static final String dfa_3s = "\1\133\3\uffff\1\120\2\uffff\1\137\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\1\uffff\1\7\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\54\uffff\1\5\45\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\101\uffff\1\6",
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
            return "1195:1: rule__EndCondition__Alternatives : ( ( ruleCleared ) | ( ruleTimeReached ) | ( ruleScoreReached ) | ( ruleBallsPopped ) | ( ruleWavesSurvived ) | ( ruleHealthDepleted ) | ( ruleBallsAlive ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040A00000088040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0040A00000088002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003C000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001180000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000008E020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x003B000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0C00000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000010L,0x000000000A800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000002000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002440L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002440L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000100000L,0x0000000200000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000100000L,0x0000000000080000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x000000003C000802L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x003B000020000002L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000003L});

}
