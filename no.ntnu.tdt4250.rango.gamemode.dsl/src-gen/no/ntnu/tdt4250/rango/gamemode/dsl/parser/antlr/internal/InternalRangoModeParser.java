package no.ntnu.tdt4250.rango.gamemode.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.ntnu.tdt4250.rango.gamemode.dsl.services.RangoModeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRangoModeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'edition'", "'ball'", "'{'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "'on'", "'pop'", "':'", "'contact'", "','", "'}'", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'burst'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'material'", "'player'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'description'", "'gravity'", "'win'", "'when'", "'or'", "'lose'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'floor'", "'walls'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'of'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'looping'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'balls'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'everything'", "'left'", "'right'"
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
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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

        public InternalRangoModeParser(TokenStream input, RangoModeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Edition";
       	}

       	@Override
       	protected RangoModeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEdition"
    // InternalRangoMode.g:65:1: entryRuleEdition returns [EObject current=null] : iv_ruleEdition= ruleEdition EOF ;
    public final EObject entryRuleEdition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdition = null;


        try {
            // InternalRangoMode.g:65:48: (iv_ruleEdition= ruleEdition EOF )
            // InternalRangoMode.g:66:2: iv_ruleEdition= ruleEdition EOF
            {
             newCompositeNode(grammarAccess.getEditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdition=ruleEdition();

            state._fsp--;

             current =iv_ruleEdition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdition"


    // $ANTLR start "ruleEdition"
    // InternalRangoMode.g:72:1: ruleEdition returns [EObject current=null] : (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* ) ;
    public final EObject ruleEdition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_ballTypes_3_0 = null;

        EObject lv_powerUps_4_0 = null;

        EObject lv_materials_5_0 = null;

        EObject lv_players_6_0 = null;

        EObject this_Drops_7 = null;

        EObject lv_modes_8_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:78:2: ( (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* ) )
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            {
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            // InternalRangoMode.g:80:3: otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEditionAccess().getEditionKeyword_0());
            		
            // InternalRangoMode.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRangoMode.g:102:3: ( (lv_title_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRangoMode.g:103:4: (lv_title_2_0= RULE_STRING )
                    {
                    // InternalRangoMode.g:103:4: (lv_title_2_0= RULE_STRING )
                    // InternalRangoMode.g:104:5: lv_title_2_0= RULE_STRING
                    {
                    lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_title_2_0, grammarAccess.getEditionAccess().getTitleSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"title",
                    						lv_title_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalRangoMode.g:120:3: ( ( (lv_ballTypes_3_0= ruleBallType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 41:
                    {
                    alt2=3;
                    }
                    break;
                case 42:
                    {
                    alt2=4;
                    }
                    break;
                case 84:
                    {
                    alt2=5;
                    }
                    break;
                case 49:
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalRangoMode.g:121:4: ( (lv_ballTypes_3_0= ruleBallType ) )
            	    {
            	    // InternalRangoMode.g:121:4: ( (lv_ballTypes_3_0= ruleBallType ) )
            	    // InternalRangoMode.g:122:5: (lv_ballTypes_3_0= ruleBallType )
            	    {
            	    // InternalRangoMode.g:122:5: (lv_ballTypes_3_0= ruleBallType )
            	    // InternalRangoMode.g:123:6: lv_ballTypes_3_0= ruleBallType
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getBallTypesBallTypeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_ballTypes_3_0=ruleBallType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ballTypes",
            	    							lv_ballTypes_3_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.BallType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:141:4: ( (lv_powerUps_4_0= rulePowerUp ) )
            	    {
            	    // InternalRangoMode.g:141:4: ( (lv_powerUps_4_0= rulePowerUp ) )
            	    // InternalRangoMode.g:142:5: (lv_powerUps_4_0= rulePowerUp )
            	    {
            	    // InternalRangoMode.g:142:5: (lv_powerUps_4_0= rulePowerUp )
            	    // InternalRangoMode.g:143:6: lv_powerUps_4_0= rulePowerUp
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getPowerUpsPowerUpParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_powerUps_4_0=rulePowerUp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"powerUps",
            	    							lv_powerUps_4_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PowerUp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRangoMode.g:161:4: ( (lv_materials_5_0= ruleMaterial ) )
            	    {
            	    // InternalRangoMode.g:161:4: ( (lv_materials_5_0= ruleMaterial ) )
            	    // InternalRangoMode.g:162:5: (lv_materials_5_0= ruleMaterial )
            	    {
            	    // InternalRangoMode.g:162:5: (lv_materials_5_0= ruleMaterial )
            	    // InternalRangoMode.g:163:6: lv_materials_5_0= ruleMaterial
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getMaterialsMaterialParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_materials_5_0=ruleMaterial();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"materials",
            	    							lv_materials_5_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Material");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRangoMode.g:181:4: ( (lv_players_6_0= rulePlayerProfile ) )
            	    {
            	    // InternalRangoMode.g:181:4: ( (lv_players_6_0= rulePlayerProfile ) )
            	    // InternalRangoMode.g:182:5: (lv_players_6_0= rulePlayerProfile )
            	    {
            	    // InternalRangoMode.g:182:5: (lv_players_6_0= rulePlayerProfile )
            	    // InternalRangoMode.g:183:6: lv_players_6_0= rulePlayerProfile
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_players_6_0=rulePlayerProfile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"players",
            	    							lv_players_6_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerProfile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRangoMode.g:201:4: this_Drops_7= ruleDrops[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getEditionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_4());
            	    			
            	    pushFollow(FOLLOW_5);
            	    this_Drops_7=ruleDrops(current);

            	    state._fsp--;


            	    				current = this_Drops_7;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalRangoMode.g:213:4: ( (lv_modes_8_0= ruleGameMode ) )
            	    {
            	    // InternalRangoMode.g:213:4: ( (lv_modes_8_0= ruleGameMode ) )
            	    // InternalRangoMode.g:214:5: (lv_modes_8_0= ruleGameMode )
            	    {
            	    // InternalRangoMode.g:214:5: (lv_modes_8_0= ruleGameMode )
            	    // InternalRangoMode.g:215:6: lv_modes_8_0= ruleGameMode
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getModesGameModeParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_modes_8_0=ruleGameMode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modes",
            	    							lv_modes_8_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.GameMode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdition"


    // $ANTLR start "entryRuleBallType"
    // InternalRangoMode.g:237:1: entryRuleBallType returns [EObject current=null] : iv_ruleBallType= ruleBallType EOF ;
    public final EObject entryRuleBallType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBallType = null;


        try {
            // InternalRangoMode.g:237:49: (iv_ruleBallType= ruleBallType EOF )
            // InternalRangoMode.g:238:2: iv_ruleBallType= ruleBallType EOF
            {
             newCompositeNode(grammarAccess.getBallTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBallType=ruleBallType();

            state._fsp--;

             current =iv_ruleBallType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBallType"


    // $ANTLR start "ruleBallType"
    // InternalRangoMode.g:244:1: ruleBallType returns [EObject current=null] : (otherlv_0= 'ball' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) ;
    public final EObject ruleBallType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_sprite_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_points_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_scale_7_0 = null;

        AntlrDatatypeRuleToken lv_bounce_9_0 = null;

        AntlrDatatypeRuleToken lv_speed_11_0 = null;

        EObject lv_splitRule_17_0 = null;

        EObject lv_contactEffects_21_0 = null;

        EObject lv_contactEffects_23_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:250:2: ( (otherlv_0= 'ball' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) )
            // InternalRangoMode.g:251:2: (otherlv_0= 'ball' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            {
            // InternalRangoMode.g:251:2: (otherlv_0= 'ball' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            // InternalRangoMode.g:252:3: otherlv_0= 'ball' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBallTypeAccess().getBallKeyword_0());
            		
            // InternalRangoMode.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBallTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBallTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBallTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:278:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRangoMode.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRangoMode.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalRangoMode.g:280:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:283:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalRangoMode.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalRangoMode.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt3=5;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRangoMode.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:286:105: ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:287:6: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:290:9: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:290:10: {...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "true");
            	    }
            	    // InternalRangoMode.g:290:19: (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:290:20: otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getBallTypeAccess().getSpriteKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:294:9: ( (lv_sprite_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:295:10: (lv_sprite_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:295:10: (lv_sprite_5_0= RULE_STRING )
            	    // InternalRangoMode.g:296:11: lv_sprite_5_0= RULE_STRING
            	    {
            	    lv_sprite_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    											newLeafNode(lv_sprite_5_0, grammarAccess.getBallTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBallTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"sprite",
            	    												lv_sprite_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:318:4: ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:318:4: ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:319:5: {...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:319:105: ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:320:6: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:323:9: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:323:10: {...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "true");
            	    }
            	    // InternalRangoMode.g:323:19: (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:323:20: otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getBallTypeAccess().getScaleKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:327:9: ( (lv_scale_7_0= ruleDecimal ) )
            	    // InternalRangoMode.g:328:10: (lv_scale_7_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:328:10: (lv_scale_7_0= ruleDecimal )
            	    // InternalRangoMode.g:329:11: lv_scale_7_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getBallTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_scale_7_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBallTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"scale",
            	    												lv_scale_7_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRangoMode.g:352:4: ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:352:4: ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:353:5: {...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRangoMode.g:353:105: ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:354:6: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRangoMode.g:357:9: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:357:10: {...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "true");
            	    }
            	    // InternalRangoMode.g:357:19: (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:357:20: otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBallTypeAccess().getBounceKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:361:9: ( (lv_bounce_9_0= ruleDecimal ) )
            	    // InternalRangoMode.g:362:10: (lv_bounce_9_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:362:10: (lv_bounce_9_0= ruleDecimal )
            	    // InternalRangoMode.g:363:11: lv_bounce_9_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getBallTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_bounce_9_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBallTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"bounce",
            	    												lv_bounce_9_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRangoMode.g:386:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:386:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:387:5: {...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRangoMode.g:387:105: ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:388:6: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRangoMode.g:391:9: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:391:10: {...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "true");
            	    }
            	    // InternalRangoMode.g:391:19: (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:391:20: otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getBallTypeAccess().getSpeedKeyword_3_3_0());
            	    								
            	    // InternalRangoMode.g:395:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:396:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:396:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:397:11: lv_speed_11_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getBallTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_speed_11_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBallTypeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"speed",
            	    												lv_speed_11_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRangoMode.g:420:4: ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:420:4: ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalRangoMode.g:421:5: {...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canSelect(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalRangoMode.g:421:105: ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) )
            	    // InternalRangoMode.g:422:6: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBallTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalRangoMode.g:425:9: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    // InternalRangoMode.g:425:10: {...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBallType", "true");
            	    }
            	    // InternalRangoMode.g:425:19: (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    // InternalRangoMode.g:425:20: otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getBallTypeAccess().getPointsKeyword_3_4_0());
            	    								
            	    // InternalRangoMode.g:429:9: ( (lv_points_13_0= RULE_INT ) )
            	    // InternalRangoMode.g:430:10: (lv_points_13_0= RULE_INT )
            	    {
            	    // InternalRangoMode.g:430:10: (lv_points_13_0= RULE_INT )
            	    // InternalRangoMode.g:431:11: lv_points_13_0= RULE_INT
            	    {
            	    lv_points_13_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    											newLeafNode(lv_points_13_0, grammarAccess.getBallTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBallTypeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"points",
            	    												lv_points_13_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBallType", "getUnorderedGroupHelper().canLeave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBallTypeAccess().getUnorderedGroup_3());
            				

            }

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getBallTypeAccess().getOnKeyword_4());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getBallTypeAccess().getPopKeyword_5());
            		
            otherlv_16=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getBallTypeAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:473:3: ( (lv_splitRule_17_0= ruleSplitRule ) )
            // InternalRangoMode.g:474:4: (lv_splitRule_17_0= ruleSplitRule )
            {
            // InternalRangoMode.g:474:4: (lv_splitRule_17_0= ruleSplitRule )
            // InternalRangoMode.g:475:5: lv_splitRule_17_0= ruleSplitRule
            {

            					newCompositeNode(grammarAccess.getBallTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_splitRule_17_0=ruleSplitRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBallTypeRule());
            					}
            					set(
            						current,
            						"splitRule",
            						lv_splitRule_17_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SplitRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_18, grammarAccess.getBallTypeAccess().getOnKeyword_8());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getBallTypeAccess().getContactKeyword_9());
            		
            otherlv_20=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getBallTypeAccess().getColonKeyword_10());
            		
            // InternalRangoMode.g:504:3: ( (lv_contactEffects_21_0= rulePlayerEffect ) )
            // InternalRangoMode.g:505:4: (lv_contactEffects_21_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:505:4: (lv_contactEffects_21_0= rulePlayerEffect )
            // InternalRangoMode.g:506:5: lv_contactEffects_21_0= rulePlayerEffect
            {

            					newCompositeNode(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_contactEffects_21_0=rulePlayerEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBallTypeRule());
            					}
            					add(
            						current,
            						"contactEffects",
            						lv_contactEffects_21_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerEffect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:523:3: (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRangoMode.g:524:4: otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) )
            	    {
            	    otherlv_22=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_22, grammarAccess.getBallTypeAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRangoMode.g:528:4: ( (lv_contactEffects_23_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:529:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:529:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    // InternalRangoMode.g:530:6: lv_contactEffects_23_0= rulePlayerEffect
            	    {

            	    						newCompositeNode(grammarAccess.getBallTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_contactEffects_23_0=rulePlayerEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBallTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contactEffects",
            	    							lv_contactEffects_23_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_24=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getBallTypeAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBallType"


    // $ANTLR start "entryRuleSplitRule"
    // InternalRangoMode.g:556:1: entryRuleSplitRule returns [EObject current=null] : iv_ruleSplitRule= ruleSplitRule EOF ;
    public final EObject entryRuleSplitRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitRule = null;


        try {
            // InternalRangoMode.g:556:50: (iv_ruleSplitRule= ruleSplitRule EOF )
            // InternalRangoMode.g:557:2: iv_ruleSplitRule= ruleSplitRule EOF
            {
             newCompositeNode(grammarAccess.getSplitRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitRule=ruleSplitRule();

            state._fsp--;

             current =iv_ruleSplitRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSplitRule"


    // $ANTLR start "ruleSplitRule"
    // InternalRangoMode.g:563:1: ruleSplitRule returns [EObject current=null] : (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit | this_Burst_2= ruleBurst ) ;
    public final EObject ruleSplitRule() throws RecognitionException {
        EObject current = null;

        EObject this_Vanish_0 = null;

        EObject this_Split_1 = null;

        EObject this_Burst_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:569:2: ( (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit | this_Burst_2= ruleBurst ) )
            // InternalRangoMode.g:570:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit | this_Burst_2= ruleBurst )
            {
            // InternalRangoMode.g:570:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit | this_Burst_2= ruleBurst )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRangoMode.g:571:3: this_Vanish_0= ruleVanish
                    {

                    			newCompositeNode(grammarAccess.getSplitRuleAccess().getVanishParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vanish_0=ruleVanish();

                    state._fsp--;


                    			current = this_Vanish_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:580:3: this_Split_1= ruleSplit
                    {

                    			newCompositeNode(grammarAccess.getSplitRuleAccess().getSplitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Split_1=ruleSplit();

                    state._fsp--;


                    			current = this_Split_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:589:3: this_Burst_2= ruleBurst
                    {

                    			newCompositeNode(grammarAccess.getSplitRuleAccess().getBurstParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Burst_2=ruleBurst();

                    state._fsp--;


                    			current = this_Burst_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSplitRule"


    // $ANTLR start "entryRuleVanish"
    // InternalRangoMode.g:601:1: entryRuleVanish returns [EObject current=null] : iv_ruleVanish= ruleVanish EOF ;
    public final EObject entryRuleVanish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVanish = null;


        try {
            // InternalRangoMode.g:601:47: (iv_ruleVanish= ruleVanish EOF )
            // InternalRangoMode.g:602:2: iv_ruleVanish= ruleVanish EOF
            {
             newCompositeNode(grammarAccess.getVanishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVanish=ruleVanish();

            state._fsp--;

             current =iv_ruleVanish; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVanish"


    // $ANTLR start "ruleVanish"
    // InternalRangoMode.g:608:1: ruleVanish returns [EObject current=null] : ( () otherlv_1= 'vanish' ) ;
    public final EObject ruleVanish() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:614:2: ( ( () otherlv_1= 'vanish' ) )
            // InternalRangoMode.g:615:2: ( () otherlv_1= 'vanish' )
            {
            // InternalRangoMode.g:615:2: ( () otherlv_1= 'vanish' )
            // InternalRangoMode.g:616:3: () otherlv_1= 'vanish'
            {
            // InternalRangoMode.g:616:3: ()
            // InternalRangoMode.g:617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVanishAccess().getVanishAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVanishAccess().getVanishKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVanish"


    // $ANTLR start "entryRuleSplit"
    // InternalRangoMode.g:631:1: entryRuleSplit returns [EObject current=null] : iv_ruleSplit= ruleSplit EOF ;
    public final EObject entryRuleSplit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplit = null;


        try {
            // InternalRangoMode.g:631:46: (iv_ruleSplit= ruleSplit EOF )
            // InternalRangoMode.g:632:2: iv_ruleSplit= ruleSplit EOF
            {
             newCompositeNode(grammarAccess.getSplitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplit=ruleSplit();

            state._fsp--;

             current =iv_ruleSplit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSplit"


    // $ANTLR start "ruleSplit"
    // InternalRangoMode.g:638:1: ruleSplit returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) ;
    public final EObject ruleSplit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_fragments_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_launchSpeed_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:644:2: ( (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) )
            // InternalRangoMode.g:645:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            {
            // InternalRangoMode.g:645:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            // InternalRangoMode.g:646:3: otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitAccess().getIntoKeyword_1());
            		
            // InternalRangoMode.g:654:3: ( (lv_fragments_2_0= RULE_INT ) )
            // InternalRangoMode.g:655:4: (lv_fragments_2_0= RULE_INT )
            {
            // InternalRangoMode.g:655:4: (lv_fragments_2_0= RULE_INT )
            // InternalRangoMode.g:656:5: lv_fragments_2_0= RULE_INT
            {
            lv_fragments_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_fragments_2_0, grammarAccess.getSplitAccess().getFragmentsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fragments",
            						lv_fragments_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRangoMode.g:672:3: ( (otherlv_3= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:673:4: (otherlv_3= RULE_ID )
                    {
                    // InternalRangoMode.g:673:4: (otherlv_3= RULE_ID )
                    // InternalRangoMode.g:674:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getSplitAccess().getFragmentTypeBallTypeCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalRangoMode.g:685:3: (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:686:4: otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSplitAccess().getLaunchedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitAccess().getAtKeyword_4_1());
                    			
                    // InternalRangoMode.g:694:4: ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    // InternalRangoMode.g:695:5: (lv_launchSpeed_6_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:695:5: (lv_launchSpeed_6_0= ruleDecimal )
                    // InternalRangoMode.g:696:6: lv_launchSpeed_6_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getSplitAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_launchSpeed_6_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSplitRule());
                    						}
                    						set(
                    							current,
                    							"launchSpeed",
                    							lv_launchSpeed_6_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSplit"


    // $ANTLR start "entryRuleBurst"
    // InternalRangoMode.g:718:1: entryRuleBurst returns [EObject current=null] : iv_ruleBurst= ruleBurst EOF ;
    public final EObject entryRuleBurst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBurst = null;


        try {
            // InternalRangoMode.g:718:46: (iv_ruleBurst= ruleBurst EOF )
            // InternalRangoMode.g:719:2: iv_ruleBurst= ruleBurst EOF
            {
             newCompositeNode(grammarAccess.getBurstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBurst=ruleBurst();

            state._fsp--;

             current =iv_ruleBurst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBurst"


    // $ANTLR start "ruleBurst"
    // InternalRangoMode.g:725:1: ruleBurst returns [EObject current=null] : (otherlv_0= 'burst' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) ;
    public final EObject ruleBurst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_fragments_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_launchSpeed_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:731:2: ( (otherlv_0= 'burst' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) )
            // InternalRangoMode.g:732:2: (otherlv_0= 'burst' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            {
            // InternalRangoMode.g:732:2: (otherlv_0= 'burst' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            // InternalRangoMode.g:733:3: otherlv_0= 'burst' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBurstAccess().getBurstKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBurstAccess().getIntoKeyword_1());
            		
            // InternalRangoMode.g:741:3: ( (lv_fragments_2_0= RULE_INT ) )
            // InternalRangoMode.g:742:4: (lv_fragments_2_0= RULE_INT )
            {
            // InternalRangoMode.g:742:4: (lv_fragments_2_0= RULE_INT )
            // InternalRangoMode.g:743:5: lv_fragments_2_0= RULE_INT
            {
            lv_fragments_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_fragments_2_0, grammarAccess.getBurstAccess().getFragmentsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBurstRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fragments",
            						lv_fragments_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRangoMode.g:759:3: ( (otherlv_3= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:760:4: (otherlv_3= RULE_ID )
                    {
                    // InternalRangoMode.g:760:4: (otherlv_3= RULE_ID )
                    // InternalRangoMode.g:761:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBurstRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getBurstAccess().getFragmentTypeBallTypeCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalRangoMode.g:772:3: (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:773:4: otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBurstAccess().getLaunchedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBurstAccess().getAtKeyword_4_1());
                    			
                    // InternalRangoMode.g:781:4: ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    // InternalRangoMode.g:782:5: (lv_launchSpeed_6_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:782:5: (lv_launchSpeed_6_0= ruleDecimal )
                    // InternalRangoMode.g:783:6: lv_launchSpeed_6_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getBurstAccess().getLaunchSpeedDecimalParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_launchSpeed_6_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBurstRule());
                    						}
                    						set(
                    							current,
                    							"launchSpeed",
                    							lv_launchSpeed_6_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBurst"


    // $ANTLR start "entryRulePlayerEffect"
    // InternalRangoMode.g:805:1: entryRulePlayerEffect returns [EObject current=null] : iv_rulePlayerEffect= rulePlayerEffect EOF ;
    public final EObject entryRulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerEffect = null;


        try {
            // InternalRangoMode.g:805:53: (iv_rulePlayerEffect= rulePlayerEffect EOF )
            // InternalRangoMode.g:806:2: iv_rulePlayerEffect= rulePlayerEffect EOF
            {
             newCompositeNode(grammarAccess.getPlayerEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayerEffect=rulePlayerEffect();

            state._fsp--;

             current =iv_rulePlayerEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayerEffect"


    // $ANTLR start "rulePlayerEffect"
    // InternalRangoMode.g:812:1: rulePlayerEffect returns [EObject current=null] : (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) ;
    public final EObject rulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Damage_0 = null;

        EObject this_Heal_1 = null;

        EObject this_Shield_2 = null;

        EObject this_SpeedChange_3 = null;

        EObject this_Poison_4 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:818:2: ( (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) )
            // InternalRangoMode.g:819:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            {
            // InternalRangoMode.g:819:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRangoMode.g:820:3: this_Damage_0= ruleDamage
                    {

                    			newCompositeNode(grammarAccess.getPlayerEffectAccess().getDamageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Damage_0=ruleDamage();

                    state._fsp--;


                    			current = this_Damage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:829:3: this_Heal_1= ruleHeal
                    {

                    			newCompositeNode(grammarAccess.getPlayerEffectAccess().getHealParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heal_1=ruleHeal();

                    state._fsp--;


                    			current = this_Heal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:838:3: this_Shield_2= ruleShield
                    {

                    			newCompositeNode(grammarAccess.getPlayerEffectAccess().getShieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shield_2=ruleShield();

                    state._fsp--;


                    			current = this_Shield_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:847:3: this_SpeedChange_3= ruleSpeedChange
                    {

                    			newCompositeNode(grammarAccess.getPlayerEffectAccess().getSpeedChangeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpeedChange_3=ruleSpeedChange();

                    state._fsp--;


                    			current = this_SpeedChange_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:856:3: this_Poison_4= rulePoison
                    {

                    			newCompositeNode(grammarAccess.getPlayerEffectAccess().getPoisonParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Poison_4=rulePoison();

                    state._fsp--;


                    			current = this_Poison_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerEffect"


    // $ANTLR start "entryRuleDamage"
    // InternalRangoMode.g:868:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalRangoMode.g:868:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalRangoMode.g:869:2: iv_ruleDamage= ruleDamage EOF
            {
             newCompositeNode(grammarAccess.getDamageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDamage=ruleDamage();

            state._fsp--;

             current =iv_ruleDamage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDamage"


    // $ANTLR start "ruleDamage"
    // InternalRangoMode.g:875:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:881:2: ( (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:882:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:882:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:883:3: otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getDamageKeyword_0());
            		
            // InternalRangoMode.g:887:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:888:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:888:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:889:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getDamageAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDamageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDamage"


    // $ANTLR start "entryRuleHeal"
    // InternalRangoMode.g:909:1: entryRuleHeal returns [EObject current=null] : iv_ruleHeal= ruleHeal EOF ;
    public final EObject entryRuleHeal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeal = null;


        try {
            // InternalRangoMode.g:909:45: (iv_ruleHeal= ruleHeal EOF )
            // InternalRangoMode.g:910:2: iv_ruleHeal= ruleHeal EOF
            {
             newCompositeNode(grammarAccess.getHealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeal=ruleHeal();

            state._fsp--;

             current =iv_ruleHeal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeal"


    // $ANTLR start "ruleHeal"
    // InternalRangoMode.g:916:1: ruleHeal returns [EObject current=null] : (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHeal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:922:2: ( (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:923:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:923:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:924:3: otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHealAccess().getHealKeyword_0());
            		
            // InternalRangoMode.g:928:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:929:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:929:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:930:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getHealAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeal"


    // $ANTLR start "entryRuleShield"
    // InternalRangoMode.g:950:1: entryRuleShield returns [EObject current=null] : iv_ruleShield= ruleShield EOF ;
    public final EObject entryRuleShield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShield = null;


        try {
            // InternalRangoMode.g:950:47: (iv_ruleShield= ruleShield EOF )
            // InternalRangoMode.g:951:2: iv_ruleShield= ruleShield EOF
            {
             newCompositeNode(grammarAccess.getShieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShield=ruleShield();

            state._fsp--;

             current =iv_ruleShield; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShield"


    // $ANTLR start "ruleShield"
    // InternalRangoMode.g:957:1: ruleShield returns [EObject current=null] : (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleShield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:963:2: ( (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:964:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:964:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:965:3: otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getShieldAccess().getShieldKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getShieldAccess().getForKeyword_1());
            		
            // InternalRangoMode.g:973:3: ( (lv_duration_2_0= ruleDecimal ) )
            // InternalRangoMode.g:974:4: (lv_duration_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:974:4: (lv_duration_2_0= ruleDecimal )
            // InternalRangoMode.g:975:5: lv_duration_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getShieldAccess().getDurationDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_duration_2_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShieldRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getShieldAccess().getSKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShield"


    // $ANTLR start "entryRuleSpeedChange"
    // InternalRangoMode.g:1000:1: entryRuleSpeedChange returns [EObject current=null] : iv_ruleSpeedChange= ruleSpeedChange EOF ;
    public final EObject entryRuleSpeedChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedChange = null;


        try {
            // InternalRangoMode.g:1000:52: (iv_ruleSpeedChange= ruleSpeedChange EOF )
            // InternalRangoMode.g:1001:2: iv_ruleSpeedChange= ruleSpeedChange EOF
            {
             newCompositeNode(grammarAccess.getSpeedChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeedChange=ruleSpeedChange();

            state._fsp--;

             current =iv_ruleSpeedChange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpeedChange"


    // $ANTLR start "ruleSpeedChange"
    // InternalRangoMode.g:1007:1: ruleSpeedChange returns [EObject current=null] : (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) ;
    public final EObject ruleSpeedChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_factor_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1013:2: ( (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) )
            // InternalRangoMode.g:1014:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            {
            // InternalRangoMode.g:1014:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            // InternalRangoMode.g:1015:3: otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1());
            		
            // InternalRangoMode.g:1023:3: ( (lv_factor_2_0= ruleDecimal ) )
            // InternalRangoMode.g:1024:4: (lv_factor_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:1024:4: (lv_factor_2_0= ruleDecimal )
            // InternalRangoMode.g:1025:5: lv_factor_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getSpeedChangeAccess().getFactorDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_factor_2_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpeedChangeRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_2_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSpeedChangeAccess().getForKeyword_3());
            		
            // InternalRangoMode.g:1046:3: ( (lv_duration_4_0= ruleDecimal ) )
            // InternalRangoMode.g:1047:4: (lv_duration_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:1047:4: (lv_duration_4_0= ruleDecimal )
            // InternalRangoMode.g:1048:5: lv_duration_4_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getSpeedChangeAccess().getDurationDecimalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_duration_4_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpeedChangeRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpeedChangeAccess().getSKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeedChange"


    // $ANTLR start "entryRulePoison"
    // InternalRangoMode.g:1073:1: entryRulePoison returns [EObject current=null] : iv_rulePoison= rulePoison EOF ;
    public final EObject entryRulePoison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoison = null;


        try {
            // InternalRangoMode.g:1073:47: (iv_rulePoison= rulePoison EOF )
            // InternalRangoMode.g:1074:2: iv_rulePoison= rulePoison EOF
            {
             newCompositeNode(grammarAccess.getPoisonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoison=rulePoison();

            state._fsp--;

             current =iv_rulePoison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoison"


    // $ANTLR start "rulePoison"
    // InternalRangoMode.g:1080:1: rulePoison returns [EObject current=null] : (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) ;
    public final EObject rulePoison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_interval_3_0 = null;

        AntlrDatatypeRuleToken lv_duration_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1086:2: ( (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) )
            // InternalRangoMode.g:1087:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            {
            // InternalRangoMode.g:1087:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            // InternalRangoMode.g:1088:3: otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPoisonAccess().getPoisonKeyword_0());
            		
            // InternalRangoMode.g:1092:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:1093:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:1093:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:1094:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getPoisonAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPoisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPoisonAccess().getEveryKeyword_2());
            		
            // InternalRangoMode.g:1114:3: ( (lv_interval_3_0= ruleDecimal ) )
            // InternalRangoMode.g:1115:4: (lv_interval_3_0= ruleDecimal )
            {
            // InternalRangoMode.g:1115:4: (lv_interval_3_0= ruleDecimal )
            // InternalRangoMode.g:1116:5: lv_interval_3_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getPoisonAccess().getIntervalDecimalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_interval_3_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoisonRule());
            					}
            					set(
            						current,
            						"interval",
            						lv_interval_3_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPoisonAccess().getSKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPoisonAccess().getForKeyword_5());
            		
            // InternalRangoMode.g:1141:3: ( (lv_duration_6_0= ruleDecimal ) )
            // InternalRangoMode.g:1142:4: (lv_duration_6_0= ruleDecimal )
            {
            // InternalRangoMode.g:1142:4: (lv_duration_6_0= ruleDecimal )
            // InternalRangoMode.g:1143:5: lv_duration_6_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getPoisonAccess().getDurationDecimalParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_duration_6_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoisonRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_6_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPoisonAccess().getSKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoison"


    // $ANTLR start "entryRulePowerUp"
    // InternalRangoMode.g:1168:1: entryRulePowerUp returns [EObject current=null] : iv_rulePowerUp= rulePowerUp EOF ;
    public final EObject entryRulePowerUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerUp = null;


        try {
            // InternalRangoMode.g:1168:48: (iv_rulePowerUp= rulePowerUp EOF )
            // InternalRangoMode.g:1169:2: iv_rulePowerUp= rulePowerUp EOF
            {
             newCompositeNode(grammarAccess.getPowerUpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerUp=rulePowerUp();

            state._fsp--;

             current =iv_rulePowerUp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerUp"


    // $ANTLR start "rulePowerUp"
    // InternalRangoMode.g:1175:1: rulePowerUp returns [EObject current=null] : (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) ;
    public final EObject rulePowerUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sprite_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_effects_7_0 = null;

        EObject lv_effects_9_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1181:2: ( (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) )
            // InternalRangoMode.g:1182:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            {
            // InternalRangoMode.g:1182:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            // InternalRangoMode.g:1183:3: otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerUpAccess().getPowerupKeyword_0());
            		
            // InternalRangoMode.g:1187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1188:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPowerUpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPowerUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerUpAccess().getSpriteKeyword_3());
            		
            // InternalRangoMode.g:1213:3: ( (lv_sprite_4_0= RULE_STRING ) )
            // InternalRangoMode.g:1214:4: (lv_sprite_4_0= RULE_STRING )
            {
            // InternalRangoMode.g:1214:4: (lv_sprite_4_0= RULE_STRING )
            // InternalRangoMode.g:1215:5: lv_sprite_4_0= RULE_STRING
            {
            lv_sprite_4_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_sprite_4_0, grammarAccess.getPowerUpAccess().getSpriteSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPowerUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sprite",
            						lv_sprite_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerUpAccess().getGivesKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPowerUpAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:1239:3: ( (lv_effects_7_0= rulePlayerEffect ) )
            // InternalRangoMode.g:1240:4: (lv_effects_7_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:1240:4: (lv_effects_7_0= rulePlayerEffect )
            // InternalRangoMode.g:1241:5: lv_effects_7_0= rulePlayerEffect
            {

            					newCompositeNode(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_effects_7_0=rulePlayerEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerUpRule());
            					}
            					add(
            						current,
            						"effects",
            						lv_effects_7_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerEffect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:1258:3: (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRangoMode.g:1259:4: otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPowerUpAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalRangoMode.g:1263:4: ( (lv_effects_9_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:1264:5: (lv_effects_9_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:1264:5: (lv_effects_9_0= rulePlayerEffect )
            	    // InternalRangoMode.g:1265:6: lv_effects_9_0= rulePlayerEffect
            	    {

            	    						newCompositeNode(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_effects_9_0=rulePlayerEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowerUpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"effects",
            	    							lv_effects_9_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerEffect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPowerUpAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerUp"


    // $ANTLR start "entryRuleMaterial"
    // InternalRangoMode.g:1291:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalRangoMode.g:1291:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalRangoMode.g:1292:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalRangoMode.g:1298:1: ruleMaterial returns [EObject current=null] : (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_sprite_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_bounce_5_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1304:2: ( (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRangoMode.g:1305:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRangoMode.g:1305:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRangoMode.g:1306:3: otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialAccess().getMaterialKeyword_0());
            		
            // InternalRangoMode.g:1310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1311:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMaterialAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaterialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:1332:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRangoMode.g:1333:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:1333:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRangoMode.g:1334:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:1337:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRangoMode.g:1338:6: ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRangoMode.g:1338:6: ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRangoMode.g:1339:4: ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1339:4: ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1340:5: {...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:1340:105: ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1341:6: ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:1344:9: ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1344:10: {...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "true");
            	    }
            	    // InternalRangoMode.g:1344:19: (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1344:20: otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMaterialAccess().getBounceKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:1348:9: ( (lv_bounce_5_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1349:10: (lv_bounce_5_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1349:10: (lv_bounce_5_0= ruleDecimal )
            	    // InternalRangoMode.g:1350:11: lv_bounce_5_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getMaterialAccess().getBounceDecimalParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_bounce_5_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMaterialRule());
            	    											}
            	    											set(
            	    												current,
            	    												"bounce",
            	    												lv_bounce_5_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:1373:4: ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1373:4: ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:1374:5: {...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:1374:105: ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:1375:6: ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:1378:9: ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:1378:10: {...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "true");
            	    }
            	    // InternalRangoMode.g:1378:19: (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:1378:20: otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMaterialAccess().getSpriteKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:1382:9: ( (lv_sprite_7_0= RULE_STRING ) )
            	    // InternalRangoMode.g:1383:10: (lv_sprite_7_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:1383:10: (lv_sprite_7_0= RULE_STRING )
            	    // InternalRangoMode.g:1384:11: lv_sprite_7_0= RULE_STRING
            	    {
            	    lv_sprite_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    											newLeafNode(lv_sprite_7_0, grammarAccess.getMaterialAccess().getSpriteSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMaterialRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"sprite",
            	    												lv_sprite_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            				

            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRulePlayerProfile"
    // InternalRangoMode.g:1421:1: entryRulePlayerProfile returns [EObject current=null] : iv_rulePlayerProfile= rulePlayerProfile EOF ;
    public final EObject entryRulePlayerProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerProfile = null;


        try {
            // InternalRangoMode.g:1421:54: (iv_rulePlayerProfile= rulePlayerProfile EOF )
            // InternalRangoMode.g:1422:2: iv_rulePlayerProfile= rulePlayerProfile EOF
            {
             newCompositeNode(grammarAccess.getPlayerProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayerProfile=rulePlayerProfile();

            state._fsp--;

             current =iv_rulePlayerProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayerProfile"


    // $ANTLR start "rulePlayerProfile"
    // InternalRangoMode.g:1428:1: rulePlayerProfile returns [EObject current=null] : (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
    public final EObject rulePlayerProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_character_5_0=null;
        Token otherlv_6=null;
        Token lv_health_7_0=null;
        Token otherlv_8=null;
        Token lv_maxHealth_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_speed_11_0 = null;

        AntlrDatatypeRuleToken lv_tongueTime_13_0 = null;

        AntlrDatatypeRuleToken lv_cooldown_16_0 = null;

        AntlrDatatypeRuleToken lv_graceTime_19_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1434:2: ( (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // InternalRangoMode.g:1435:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // InternalRangoMode.g:1435:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // InternalRangoMode.g:1436:3: otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0());
            		
            // InternalRangoMode.g:1440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1441:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlayerProfileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerProfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayerProfileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:1462:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) )
            // InternalRangoMode.g:1463:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) )
            {
            // InternalRangoMode.g:1463:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) )
            // InternalRangoMode.g:1464:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:1467:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?)
            // InternalRangoMode.g:1468:6: ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?
            {
            // InternalRangoMode.g:1468:6: ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRangoMode.g:1469:4: ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1469:4: ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:1470:5: {...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:1470:110: ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:1471:6: ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:1474:9: ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:1474:10: {...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1474:19: (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:1474:20: otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:1478:9: ( (lv_character_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:1479:10: (lv_character_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:1479:10: (lv_character_5_0= RULE_STRING )
            	    // InternalRangoMode.g:1480:11: lv_character_5_0= RULE_STRING
            	    {
            	    lv_character_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    											newLeafNode(lv_character_5_0, grammarAccess.getPlayerProfileAccess().getCharacterSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"character",
            	    												lv_character_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:1502:4: ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) )
            	    {
            	    // InternalRangoMode.g:1502:4: ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) )
            	    // InternalRangoMode.g:1503:5: {...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:1503:110: ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) )
            	    // InternalRangoMode.g:1504:6: ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:1507:9: ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) )
            	    // InternalRangoMode.g:1507:10: {...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1507:19: (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? )
            	    // InternalRangoMode.g:1507:20: otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )?
            	    {
            	    otherlv_6=(Token)match(input,44,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:1511:9: ( (lv_health_7_0= RULE_INT ) )
            	    // InternalRangoMode.g:1512:10: (lv_health_7_0= RULE_INT )
            	    {
            	    // InternalRangoMode.g:1512:10: (lv_health_7_0= RULE_INT )
            	    // InternalRangoMode.g:1513:11: lv_health_7_0= RULE_INT
            	    {
            	    lv_health_7_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    											newLeafNode(lv_health_7_0, grammarAccess.getPlayerProfileAccess().getHealthINTTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"health",
            	    												lv_health_7_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    // InternalRangoMode.g:1529:9: (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==45) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalRangoMode.g:1530:10: otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) )
            	            {
            	            otherlv_8=(Token)match(input,45,FOLLOW_10); 

            	            										newLeafNode(otherlv_8, grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0());
            	            									
            	            // InternalRangoMode.g:1534:10: ( (lv_maxHealth_9_0= RULE_INT ) )
            	            // InternalRangoMode.g:1535:11: (lv_maxHealth_9_0= RULE_INT )
            	            {
            	            // InternalRangoMode.g:1535:11: (lv_maxHealth_9_0= RULE_INT )
            	            // InternalRangoMode.g:1536:12: lv_maxHealth_9_0= RULE_INT
            	            {
            	            lv_maxHealth_9_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            	            												newLeafNode(lv_maxHealth_9_0, grammarAccess.getPlayerProfileAccess().getMaxHealthINTTerminalRuleCall_3_1_2_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPlayerProfileRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"maxHealth",
            	            													lv_maxHealth_9_0,
            	            													"org.eclipse.xtext.common.Terminals.INT");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRangoMode.g:1559:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1559:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1560:5: {...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRangoMode.g:1560:110: ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1561:6: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRangoMode.g:1564:9: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1564:10: {...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1564:19: (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1564:20: otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:1568:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1569:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1569:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:1570:11: lv_speed_11_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getPlayerProfileAccess().getSpeedDecimalParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_speed_11_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											set(
            	    												current,
            	    												"speed",
            	    												lv_speed_11_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRangoMode.g:1593:4: ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1593:4: ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) )
            	    // InternalRangoMode.g:1594:5: {...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRangoMode.g:1594:110: ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) )
            	    // InternalRangoMode.g:1595:6: ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRangoMode.g:1598:9: ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) )
            	    // InternalRangoMode.g:1598:10: {...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1598:19: (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' )
            	    // InternalRangoMode.g:1598:20: otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's'
            	    {
            	    otherlv_12=(Token)match(input,46,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0());
            	    								
            	    // InternalRangoMode.g:1602:9: ( (lv_tongueTime_13_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1603:10: (lv_tongueTime_13_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1603:10: (lv_tongueTime_13_0= ruleDecimal )
            	    // InternalRangoMode.g:1604:11: lv_tongueTime_13_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getPlayerProfileAccess().getTongueTimeDecimalParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_tongueTime_13_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											set(
            	    												current,
            	    												"tongueTime",
            	    												lv_tongueTime_13_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_14=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_14, grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRangoMode.g:1631:4: ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1631:4: ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) )
            	    // InternalRangoMode.g:1632:5: {...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalRangoMode.g:1632:110: ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) )
            	    // InternalRangoMode.g:1633:6: ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalRangoMode.g:1636:9: ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) )
            	    // InternalRangoMode.g:1636:10: {...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1636:19: (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' )
            	    // InternalRangoMode.g:1636:20: otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's'
            	    {
            	    otherlv_15=(Token)match(input,47,FOLLOW_10); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0());
            	    								
            	    // InternalRangoMode.g:1640:9: ( (lv_cooldown_16_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1641:10: (lv_cooldown_16_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1641:10: (lv_cooldown_16_0= ruleDecimal )
            	    // InternalRangoMode.g:1642:11: lv_cooldown_16_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getPlayerProfileAccess().getCooldownDecimalParserRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_cooldown_16_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cooldown",
            	    												lv_cooldown_16_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_17=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRangoMode.g:1669:4: ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1669:4: ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) )
            	    // InternalRangoMode.g:1670:5: {...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalRangoMode.g:1670:110: ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) )
            	    // InternalRangoMode.g:1671:6: ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalRangoMode.g:1674:9: ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) )
            	    // InternalRangoMode.g:1674:10: {...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1674:19: (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' )
            	    // InternalRangoMode.g:1674:20: otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's'
            	    {
            	    otherlv_18=(Token)match(input,48,FOLLOW_10); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0());
            	    								
            	    // InternalRangoMode.g:1678:9: ( (lv_graceTime_19_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1679:10: (lv_graceTime_19_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1679:10: (lv_graceTime_19_0= ruleDecimal )
            	    // InternalRangoMode.g:1680:11: lv_graceTime_19_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getPlayerProfileAccess().getGraceTimeDecimalParserRuleCall_3_5_1_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_graceTime_19_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPlayerProfileRule());
            	    											}
            	    											set(
            	    												current,
            	    												"graceTime",
            	    												lv_graceTime_19_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,35,FOLLOW_30); 

            	    									newLeafNode(otherlv_20, grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canLeave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            				

            }

            otherlv_21=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPlayerProfileAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerProfile"


    // $ANTLR start "entryRuleGameMode"
    // InternalRangoMode.g:1723:1: entryRuleGameMode returns [EObject current=null] : iv_ruleGameMode= ruleGameMode EOF ;
    public final EObject entryRuleGameMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameMode = null;


        try {
            // InternalRangoMode.g:1723:49: (iv_ruleGameMode= ruleGameMode EOF )
            // InternalRangoMode.g:1724:2: iv_ruleGameMode= ruleGameMode EOF
            {
             newCompositeNode(grammarAccess.getGameModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameMode=ruleGameMode();

            state._fsp--;

             current =iv_ruleGameMode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameMode"


    // $ANTLR start "ruleGameMode"
    // InternalRangoMode.g:1730:1: ruleGameMode returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) ;
    public final EObject ruleGameMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_gravity_10_0 = null;

        EObject lv_speedBonus_11_0 = null;

        EObject lv_arena_12_0 = null;

        EObject lv_spawning_13_0 = null;

        EObject this_Drops_14 = null;

        EObject lv_winConditions_17_0 = null;

        EObject lv_winConditions_19_0 = null;

        EObject lv_loseConditions_22_0 = null;

        EObject lv_loseConditions_24_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1736:2: ( (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) )
            // InternalRangoMode.g:1737:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            {
            // InternalRangoMode.g:1737:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            // InternalRangoMode.g:1738:3: otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameModeAccess().getModeKeyword_0());
            		
            // InternalRangoMode.g:1742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1743:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameModeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameModeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRangoMode.g:1760:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalRangoMode.g:1761:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalRangoMode.g:1761:4: (lv_title_2_0= RULE_STRING )
            // InternalRangoMode.g:1762:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_title_2_0, grammarAccess.getGameModeAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameModeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getGameModeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRangoMode.g:1782:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:1783:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRangoMode.g:1787:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRangoMode.g:1788:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRangoMode.g:1788:5: (lv_description_5_0= RULE_STRING )
                    // InternalRangoMode.g:1789:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getGameModeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGameModeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGameModeAccess().getPlayerKeyword_5());
            		
            // InternalRangoMode.g:1810:3: ( (otherlv_7= RULE_ID ) )
            // InternalRangoMode.g:1811:4: (otherlv_7= RULE_ID )
            {
            // InternalRangoMode.g:1811:4: (otherlv_7= RULE_ID )
            // InternalRangoMode.g:1812:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameModeRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_7, grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0());
            				

            }


            }

            // InternalRangoMode.g:1823:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) )
            // InternalRangoMode.g:1824:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:1824:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) )
            // InternalRangoMode.g:1825:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            				
            // InternalRangoMode.g:1828:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* )
            // InternalRangoMode.g:1829:6: ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )*
            {
            // InternalRangoMode.g:1829:6: ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRangoMode.g:1830:4: ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1830:4: ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1831:5: {...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalRangoMode.g:1831:105: ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1832:6: ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalRangoMode.g:1835:9: ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1835:10: {...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "true");
            	    }
            	    // InternalRangoMode.g:1835:19: (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1835:20: otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) )
            	    {
            	    otherlv_9=(Token)match(input,51,FOLLOW_10); 

            	    									newLeafNode(otherlv_9, grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0());
            	    								
            	    // InternalRangoMode.g:1839:9: ( (lv_gravity_10_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1840:10: (lv_gravity_10_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1840:10: (lv_gravity_10_0= ruleDecimal )
            	    // InternalRangoMode.g:1841:11: lv_gravity_10_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getGameModeAccess().getGravityDecimalParserRuleCall_7_0_1_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_gravity_10_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGameModeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"gravity",
            	    												lv_gravity_10_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:1864:4: ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1864:4: ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) )
            	    // InternalRangoMode.g:1865:5: {...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalRangoMode.g:1865:105: ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) )
            	    // InternalRangoMode.g:1866:6: ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalRangoMode.g:1869:9: ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) )
            	    // InternalRangoMode.g:1869:10: {...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "true");
            	    }
            	    // InternalRangoMode.g:1869:19: ( (lv_speedBonus_11_0= ruleSpeedBonus ) )
            	    // InternalRangoMode.g:1869:20: (lv_speedBonus_11_0= ruleSpeedBonus )
            	    {
            	    // InternalRangoMode.g:1869:20: (lv_speedBonus_11_0= ruleSpeedBonus )
            	    // InternalRangoMode.g:1870:10: lv_speedBonus_11_0= ruleSpeedBonus
            	    {

            	    										newCompositeNode(grammarAccess.getGameModeAccess().getSpeedBonusSpeedBonusParserRuleCall_7_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    lv_speedBonus_11_0=ruleSpeedBonus();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGameModeRule());
            	    										}
            	    										set(
            	    											current,
            	    											"speedBonus",
            	    											lv_speedBonus_11_0,
            	    											"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SpeedBonus");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            				

            }

            // InternalRangoMode.g:1899:3: ( (lv_arena_12_0= ruleArena ) )
            // InternalRangoMode.g:1900:4: (lv_arena_12_0= ruleArena )
            {
            // InternalRangoMode.g:1900:4: (lv_arena_12_0= ruleArena )
            // InternalRangoMode.g:1901:5: lv_arena_12_0= ruleArena
            {

            					newCompositeNode(grammarAccess.getGameModeAccess().getArenaArenaParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_35);
            lv_arena_12_0=ruleArena();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameModeRule());
            					}
            					set(
            						current,
            						"arena",
            						lv_arena_12_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Arena");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:1918:3: ( (lv_spawning_13_0= ruleSpawnStrategy ) )
            // InternalRangoMode.g:1919:4: (lv_spawning_13_0= ruleSpawnStrategy )
            {
            // InternalRangoMode.g:1919:4: (lv_spawning_13_0= ruleSpawnStrategy )
            // InternalRangoMode.g:1920:5: lv_spawning_13_0= ruleSpawnStrategy
            {

            					newCompositeNode(grammarAccess.getGameModeAccess().getSpawningSpawnStrategyParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_36);
            lv_spawning_13_0=ruleSpawnStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameModeRule());
            					}
            					set(
            						current,
            						"spawning",
            						lv_spawning_13_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SpawnStrategy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:1937:3: (this_Drops_14= ruleDrops[$current] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==84) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:1938:4: this_Drops_14= ruleDrops[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getGameModeRule());
                    				}
                    				newCompositeNode(grammarAccess.getGameModeAccess().getDropsParserRuleCall_10());
                    			
                    pushFollow(FOLLOW_37);
                    this_Drops_14=ruleDrops(current);

                    state._fsp--;


                    				current = this_Drops_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:1950:3: (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:1951:4: otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    {
                    otherlv_15=(Token)match(input,52,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameModeAccess().getWinKeyword_11_0());
                    			
                    otherlv_16=(Token)match(input,53,FOLLOW_39); 

                    				newLeafNode(otherlv_16, grammarAccess.getGameModeAccess().getWhenKeyword_11_1());
                    			
                    // InternalRangoMode.g:1959:4: ( (lv_winConditions_17_0= ruleEndCondition ) )
                    // InternalRangoMode.g:1960:5: (lv_winConditions_17_0= ruleEndCondition )
                    {
                    // InternalRangoMode.g:1960:5: (lv_winConditions_17_0= ruleEndCondition )
                    // InternalRangoMode.g:1961:6: lv_winConditions_17_0= ruleEndCondition
                    {

                    						newCompositeNode(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_winConditions_17_0=ruleEndCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameModeRule());
                    						}
                    						add(
                    							current,
                    							"winConditions",
                    							lv_winConditions_17_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EndCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRangoMode.g:1978:4: (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==54) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRangoMode.g:1979:5: otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    {
                    	    otherlv_18=(Token)match(input,54,FOLLOW_39); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGameModeAccess().getOrKeyword_11_3_0());
                    	    				
                    	    // InternalRangoMode.g:1983:5: ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    // InternalRangoMode.g:1984:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    {
                    	    // InternalRangoMode.g:1984:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    // InternalRangoMode.g:1985:7: lv_winConditions_19_0= ruleEndCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_winConditions_19_0=ruleEndCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameModeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"winConditions",
                    	    								lv_winConditions_19_0,
                    	    								"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EndCondition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,55,FOLLOW_38); 

            			newLeafNode(otherlv_20, grammarAccess.getGameModeAccess().getLoseKeyword_12());
            		
            otherlv_21=(Token)match(input,53,FOLLOW_39); 

            			newLeafNode(otherlv_21, grammarAccess.getGameModeAccess().getWhenKeyword_13());
            		
            // InternalRangoMode.g:2012:3: ( (lv_loseConditions_22_0= ruleEndCondition ) )
            // InternalRangoMode.g:2013:4: (lv_loseConditions_22_0= ruleEndCondition )
            {
            // InternalRangoMode.g:2013:4: (lv_loseConditions_22_0= ruleEndCondition )
            // InternalRangoMode.g:2014:5: lv_loseConditions_22_0= ruleEndCondition
            {

            					newCompositeNode(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_41);
            lv_loseConditions_22_0=ruleEndCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameModeRule());
            					}
            					add(
            						current,
            						"loseConditions",
            						lv_loseConditions_22_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EndCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:2031:3: (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==54) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRangoMode.g:2032:4: otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    {
            	    otherlv_23=(Token)match(input,54,FOLLOW_39); 

            	    				newLeafNode(otherlv_23, grammarAccess.getGameModeAccess().getOrKeyword_15_0());
            	    			
            	    // InternalRangoMode.g:2036:4: ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    // InternalRangoMode.g:2037:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    {
            	    // InternalRangoMode.g:2037:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    // InternalRangoMode.g:2038:6: lv_loseConditions_24_0= ruleEndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_loseConditions_24_0=ruleEndCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameModeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loseConditions",
            	    							lv_loseConditions_24_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EndCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_25=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameMode"


    // $ANTLR start "entryRuleSpeedBonus"
    // InternalRangoMode.g:2064:1: entryRuleSpeedBonus returns [EObject current=null] : iv_ruleSpeedBonus= ruleSpeedBonus EOF ;
    public final EObject entryRuleSpeedBonus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedBonus = null;


        try {
            // InternalRangoMode.g:2064:51: (iv_ruleSpeedBonus= ruleSpeedBonus EOF )
            // InternalRangoMode.g:2065:2: iv_ruleSpeedBonus= ruleSpeedBonus EOF
            {
             newCompositeNode(grammarAccess.getSpeedBonusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeedBonus=ruleSpeedBonus();

            state._fsp--;

             current =iv_ruleSpeedBonus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpeedBonus"


    // $ANTLR start "ruleSpeedBonus"
    // InternalRangoMode.g:2071:1: ruleSpeedBonus returns [EObject current=null] : ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) ;
    public final EObject ruleSpeedBonus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_maxFactor_5_0 = null;

        AntlrDatatypeRuleToken lv_duration_8_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2077:2: ( ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) )
            // InternalRangoMode.g:2078:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            {
            // InternalRangoMode.g:2078:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            // InternalRangoMode.g:2079:3: () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            {
            // InternalRangoMode.g:2079:3: ()
            // InternalRangoMode.g:2080:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getSpeedBonusAccess().getBonusKeyword_2());
            		
            // InternalRangoMode.g:2094:3: (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:2095:4: otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times'
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpeedBonusAccess().getToKeyword_3_1());
                    			
                    // InternalRangoMode.g:2103:4: ( (lv_maxFactor_5_0= ruleDecimal ) )
                    // InternalRangoMode.g:2104:5: (lv_maxFactor_5_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2104:5: (lv_maxFactor_5_0= ruleDecimal )
                    // InternalRangoMode.g:2105:6: lv_maxFactor_5_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getSpeedBonusAccess().getMaxFactorDecimalParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_maxFactor_5_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpeedBonusRule());
                    						}
                    						set(
                    							current,
                    							"maxFactor",
                    							lv_maxFactor_5_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,59,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:2127:3: (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:2128:4: otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0());
                    			
                    // InternalRangoMode.g:2132:4: ( (lv_duration_8_0= ruleDecimal ) )
                    // InternalRangoMode.g:2133:5: (lv_duration_8_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2133:5: (lv_duration_8_0= ruleDecimal )
                    // InternalRangoMode.g:2134:6: lv_duration_8_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getSpeedBonusAccess().getDurationDecimalParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_duration_8_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpeedBonusRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_8_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSpeedBonusAccess().getSKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpeedBonus"


    // $ANTLR start "entryRuleArena"
    // InternalRangoMode.g:2160:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalRangoMode.g:2160:46: (iv_ruleArena= ruleArena EOF )
            // InternalRangoMode.g:2161:2: iv_ruleArena= ruleArena EOF
            {
             newCompositeNode(grammarAccess.getArenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArena=ruleArena();

            state._fsp--;

             current =iv_ruleArena; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArena"


    // $ANTLR start "ruleArena"
    // InternalRangoMode.g:2167:1: ruleArena returns [EObject current=null] : (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_background_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_playerStart_12_0 = null;

        EObject lv_obstacles_14_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2173:2: ( (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' ) )
            // InternalRangoMode.g:2174:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' )
            {
            // InternalRangoMode.g:2174:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' )
            // InternalRangoMode.g:2175:3: otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getArenaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getBackgroundKeyword_2());
            		
            // InternalRangoMode.g:2187:3: ( (lv_background_3_0= RULE_STRING ) )
            // InternalRangoMode.g:2188:4: (lv_background_3_0= RULE_STRING )
            {
            // InternalRangoMode.g:2188:4: (lv_background_3_0= RULE_STRING )
            // InternalRangoMode.g:2189:5: lv_background_3_0= RULE_STRING
            {
            lv_background_3_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_background_3_0, grammarAccess.getArenaAccess().getBackgroundSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArenaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"background",
            						lv_background_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRangoMode.g:2205:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) )
            // InternalRangoMode.g:2206:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:2206:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) )
            // InternalRangoMode.g:2207:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            				
            // InternalRangoMode.g:2210:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* )
            // InternalRangoMode.g:2211:6: ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )*
            {
            // InternalRangoMode.g:2211:6: ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )*
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRangoMode.g:2212:4: ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:2212:4: ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) )
            	    // InternalRangoMode.g:2213:5: {...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalRangoMode.g:2213:102: ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) )
            	    // InternalRangoMode.g:2214:6: ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalRangoMode.g:2217:9: ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) )
            	    // InternalRangoMode.g:2217:10: {...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2217:19: (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) )
            	    // InternalRangoMode.g:2217:20: otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getFloorKeyword_4_0_0());
            	    								
            	    // InternalRangoMode.g:2221:9: ( (otherlv_6= RULE_ID ) )
            	    // InternalRangoMode.g:2222:10: (otherlv_6= RULE_ID )
            	    {
            	    // InternalRangoMode.g:2222:10: (otherlv_6= RULE_ID )
            	    // InternalRangoMode.g:2223:11: otherlv_6= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getArenaRule());
            	    											}
            	    										
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    											newLeafNode(otherlv_6, grammarAccess.getArenaAccess().getFloorMaterialCrossReference_4_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRangoMode.g:2240:4: ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:2240:4: ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) )
            	    // InternalRangoMode.g:2241:5: {...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalRangoMode.g:2241:102: ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) )
            	    // InternalRangoMode.g:2242:6: ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalRangoMode.g:2245:9: ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) )
            	    // InternalRangoMode.g:2245:10: {...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2245:19: (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) )
            	    // InternalRangoMode.g:2245:20: otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getArenaAccess().getWallsKeyword_4_1_0());
            	    								
            	    // InternalRangoMode.g:2249:9: ( (otherlv_8= RULE_ID ) )
            	    // InternalRangoMode.g:2250:10: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRangoMode.g:2250:10: (otherlv_8= RULE_ID )
            	    // InternalRangoMode.g:2251:11: otherlv_8= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getArenaRule());
            	    											}
            	    										
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    											newLeafNode(otherlv_8, grammarAccess.getArenaAccess().getWallsMaterialCrossReference_4_1_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRangoMode.g:2268:4: ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) )
            	    {
            	    // InternalRangoMode.g:2268:4: ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) )
            	    // InternalRangoMode.g:2269:5: {...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalRangoMode.g:2269:102: ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) )
            	    // InternalRangoMode.g:2270:6: ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalRangoMode.g:2273:9: ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) )
            	    // InternalRangoMode.g:2273:10: {...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2273:19: (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' )
            	    // InternalRangoMode.g:2273:20: otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%'
            	    {
            	    otherlv_9=(Token)match(input,42,FOLLOW_49); 

            	    									newLeafNode(otherlv_9, grammarAccess.getArenaAccess().getPlayerKeyword_4_2_0());
            	    								
            	    otherlv_10=(Token)match(input,65,FOLLOW_21); 

            	    									newLeafNode(otherlv_10, grammarAccess.getArenaAccess().getStartsKeyword_4_2_1());
            	    								
            	    otherlv_11=(Token)match(input,29,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getArenaAccess().getAtKeyword_4_2_2());
            	    								
            	    // InternalRangoMode.g:2285:9: ( (lv_playerStart_12_0= ruleDecimal ) )
            	    // InternalRangoMode.g:2286:10: (lv_playerStart_12_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:2286:10: (lv_playerStart_12_0= ruleDecimal )
            	    // InternalRangoMode.g:2287:11: lv_playerStart_12_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_2_3_0());
            	    										
            	    pushFollow(FOLLOW_50);
            	    lv_playerStart_12_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getArenaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"playerStart",
            	    												lv_playerStart_12_0,
            	    												"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_13=(Token)match(input,66,FOLLOW_48); 

            	    									newLeafNode(otherlv_13, grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            				

            }

            // InternalRangoMode.g:2321:3: ( (lv_obstacles_14_0= ruleObstacle ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==69||LA24_0==73||LA24_0==76) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRangoMode.g:2322:4: (lv_obstacles_14_0= ruleObstacle )
            	    {
            	    // InternalRangoMode.g:2322:4: (lv_obstacles_14_0= ruleObstacle )
            	    // InternalRangoMode.g:2323:5: lv_obstacles_14_0= ruleObstacle
            	    {

            	    					newCompositeNode(grammarAccess.getArenaAccess().getObstaclesObstacleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_obstacles_14_0=ruleObstacle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArenaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"obstacles",
            	    						lv_obstacles_14_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Obstacle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArena"


    // $ANTLR start "ruleAt"
    // InternalRangoMode.g:2349:1: ruleAt[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) ;
    public final EObject ruleAt(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2355:2: ( (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) )
            // InternalRangoMode.g:2356:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            {
            // InternalRangoMode.g:2356:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            // InternalRangoMode.g:2357:3: otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getAtKeyword_0());
            		
            otherlv_1=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRangoMode.g:2365:3: ( (lv_x_2_0= ruleDecimal ) )
            // InternalRangoMode.g:2366:4: (lv_x_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:2366:4: (lv_x_2_0= ruleDecimal )
            // InternalRangoMode.g:2367:5: lv_x_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getAtAccess().getXDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_x_2_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getAtAccess().getPercentSignKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAtAccess().getCommaKeyword_4());
            		
            // InternalRangoMode.g:2392:3: ( (lv_y_5_0= ruleDecimal ) )
            // InternalRangoMode.g:2393:4: (lv_y_5_0= ruleDecimal )
            {
            // InternalRangoMode.g:2393:4: (lv_y_5_0= ruleDecimal )
            // InternalRangoMode.g:2394:5: lv_y_5_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getAtAccess().getYDecimalParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_50);
            lv_y_5_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,66,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getAtAccess().getPercentSignKeyword_6());
            		
            otherlv_7=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAtAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAt"


    // $ANTLR start "entryRuleObstacle"
    // InternalRangoMode.g:2423:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRangoMode.g:2423:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRangoMode.g:2424:2: iv_ruleObstacle= ruleObstacle EOF
            {
             newCompositeNode(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacle=ruleObstacle();

            state._fsp--;

             current =iv_ruleObstacle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalRangoMode.g:2430:1: ruleObstacle returns [EObject current=null] : (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_JumpPad_1 = null;

        EObject this_Teleporter_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2436:2: ( (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) )
            // InternalRangoMode.g:2437:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            {
            // InternalRangoMode.g:2437:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt25=1;
                }
                break;
            case 73:
                {
                alt25=2;
                }
                break;
            case 76:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:2438:3: this_Block_0= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getObstacleAccess().getBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;


                    			current = this_Block_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:2447:3: this_JumpPad_1= ruleJumpPad
                    {

                    			newCompositeNode(grammarAccess.getObstacleAccess().getJumpPadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JumpPad_1=ruleJumpPad();

                    state._fsp--;


                    			current = this_JumpPad_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:2456:3: this_Teleporter_2= ruleTeleporter
                    {

                    			newCompositeNode(grammarAccess.getObstacleAccess().getTeleporterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teleporter_2=ruleTeleporter();

                    state._fsp--;


                    			current = this_Teleporter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleBlock"
    // InternalRangoMode.g:2468:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRangoMode.g:2468:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRangoMode.g:2469:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRangoMode.g:2475:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token lv_height_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_At_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2481:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalRangoMode.g:2482:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalRangoMode.g:2482:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalRangoMode.g:2483:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalRangoMode.g:2487:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2488:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2488:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2489:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getBlockRule());
            			}
            			newCompositeNode(grammarAccess.getBlockAccess().getAtParserRuleCall_2());
            		
            pushFollow(FOLLOW_55);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSizeKeyword_3());
            		
            // InternalRangoMode.g:2520:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalRangoMode.g:2521:4: (lv_width_4_0= RULE_INT )
            {
            // InternalRangoMode.g:2521:4: (lv_width_4_0= RULE_INT )
            // InternalRangoMode.g:2522:5: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_56); 

            					newLeafNode(lv_width_4_0, grammarAccess.getBlockAccess().getWidthINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getByKeyword_5());
            		
            // InternalRangoMode.g:2542:3: ( (lv_height_6_0= RULE_INT ) )
            // InternalRangoMode.g:2543:4: (lv_height_6_0= RULE_INT )
            {
            // InternalRangoMode.g:2543:4: (lv_height_6_0= RULE_INT )
            // InternalRangoMode.g:2544:5: lv_height_6_0= RULE_INT
            {
            lv_height_6_0=(Token)match(input,RULE_INT,FOLLOW_57); 

            					newLeafNode(lv_height_6_0, grammarAccess.getBlockAccess().getHeightINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRangoMode.g:2560:3: (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==72) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:2561:4: otherlv_7= 'of' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getOfKeyword_7_0());
                    			
                    // InternalRangoMode.g:2565:4: ( (otherlv_8= RULE_ID ) )
                    // InternalRangoMode.g:2566:5: (otherlv_8= RULE_ID )
                    {
                    // InternalRangoMode.g:2566:5: (otherlv_8= RULE_ID )
                    // InternalRangoMode.g:2567:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlockRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getMaterialMaterialCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleJumpPad"
    // InternalRangoMode.g:2583:1: entryRuleJumpPad returns [EObject current=null] : iv_ruleJumpPad= ruleJumpPad EOF ;
    public final EObject entryRuleJumpPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpPad = null;


        try {
            // InternalRangoMode.g:2583:48: (iv_ruleJumpPad= ruleJumpPad EOF )
            // InternalRangoMode.g:2584:2: iv_ruleJumpPad= ruleJumpPad EOF
            {
             newCompositeNode(grammarAccess.getJumpPadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJumpPad=ruleJumpPad();

            state._fsp--;

             current =iv_ruleJumpPad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJumpPad"


    // $ANTLR start "ruleJumpPad"
    // InternalRangoMode.g:2590:1: ruleJumpPad returns [EObject current=null] : (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
    public final EObject ruleJumpPad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_At_2 = null;

        AntlrDatatypeRuleToken lv_launch_4_0 = null;

        Enumerator lv_affects_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2596:2: ( (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2597:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2597:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2598:3: otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJumpPadAccess().getJumppadKeyword_0());
            		
            // InternalRangoMode.g:2602:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2603:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2603:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2604:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJumpPadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJumpPadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getJumpPadRule());
            			}
            			newCompositeNode(grammarAccess.getJumpPadAccess().getAtParserRuleCall_2());
            		
            pushFollow(FOLLOW_58);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,74,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getJumpPadAccess().getLaunchKeyword_3());
            		
            // InternalRangoMode.g:2635:3: ( (lv_launch_4_0= ruleDecimal ) )
            // InternalRangoMode.g:2636:4: (lv_launch_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:2636:4: (lv_launch_4_0= ruleDecimal )
            // InternalRangoMode.g:2637:5: lv_launch_4_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getJumpPadAccess().getLaunchDecimalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_59);
            lv_launch_4_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJumpPadRule());
            					}
            					set(
            						current,
            						"launch",
            						lv_launch_4_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:2654:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:2655:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2659:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2660:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2660:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2661:6: lv_affects_6_0= ruleTarget
                    {

                    						newCompositeNode(grammarAccess.getJumpPadAccess().getAffectsTargetEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_affects_6_0=ruleTarget();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJumpPadRule());
                    						}
                    						set(
                    							current,
                    							"affects",
                    							lv_affects_6_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Target");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJumpPad"


    // $ANTLR start "entryRuleTeleporter"
    // InternalRangoMode.g:2683:1: entryRuleTeleporter returns [EObject current=null] : iv_ruleTeleporter= ruleTeleporter EOF ;
    public final EObject entryRuleTeleporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeleporter = null;


        try {
            // InternalRangoMode.g:2683:51: (iv_ruleTeleporter= ruleTeleporter EOF )
            // InternalRangoMode.g:2684:2: iv_ruleTeleporter= ruleTeleporter EOF
            {
             newCompositeNode(grammarAccess.getTeleporterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeleporter=ruleTeleporter();

            state._fsp--;

             current =iv_ruleTeleporter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeleporter"


    // $ANTLR start "ruleTeleporter"
    // InternalRangoMode.g:2690:1: ruleTeleporter returns [EObject current=null] : (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
    public final EObject ruleTeleporter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_At_2 = null;

        Enumerator lv_affects_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2696:2: ( (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2697:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2697:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2698:3: otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeleporterAccess().getTeleporterKeyword_0());
            		
            // InternalRangoMode.g:2702:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2703:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2703:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2704:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeleporterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeleporterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getTeleporterRule());
            			}
            			newCompositeNode(grammarAccess.getTeleporterAccess().getAtParserRuleCall_2());
            		
            pushFollow(FOLLOW_44);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTeleporterAccess().getToKeyword_3());
            		
            // InternalRangoMode.g:2735:3: ( (otherlv_4= RULE_ID ) )
            // InternalRangoMode.g:2736:4: (otherlv_4= RULE_ID )
            {
            // InternalRangoMode.g:2736:4: (otherlv_4= RULE_ID )
            // InternalRangoMode.g:2737:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeleporterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(otherlv_4, grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0());
            				

            }


            }

            // InternalRangoMode.g:2748:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==75) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:2749:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2753:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2754:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2754:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2755:6: lv_affects_6_0= ruleTarget
                    {

                    						newCompositeNode(grammarAccess.getTeleporterAccess().getAffectsTargetEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_affects_6_0=ruleTarget();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeleporterRule());
                    						}
                    						set(
                    							current,
                    							"affects",
                    							lv_affects_6_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Target");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeleporter"


    // $ANTLR start "entryRuleSpawnStrategy"
    // InternalRangoMode.g:2777:1: entryRuleSpawnStrategy returns [EObject current=null] : iv_ruleSpawnStrategy= ruleSpawnStrategy EOF ;
    public final EObject entryRuleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpawnStrategy = null;


        try {
            // InternalRangoMode.g:2777:54: (iv_ruleSpawnStrategy= ruleSpawnStrategy EOF )
            // InternalRangoMode.g:2778:2: iv_ruleSpawnStrategy= ruleSpawnStrategy EOF
            {
             newCompositeNode(grammarAccess.getSpawnStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpawnStrategy=ruleSpawnStrategy();

            state._fsp--;

             current =iv_ruleSpawnStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpawnStrategy"


    // $ANTLR start "ruleSpawnStrategy"
    // InternalRangoMode.g:2784:1: ruleSpawnStrategy returns [EObject current=null] : (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) ;
    public final EObject ruleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_FixedLayout_0 = null;

        EObject this_WaveSchedule_1 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2790:2: ( (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) )
            // InternalRangoMode.g:2791:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            {
            // InternalRangoMode.g:2791:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==77) ) {
                alt29=1;
            }
            else if ( (LA29_0==78) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:2792:3: this_FixedLayout_0= ruleFixedLayout
                    {

                    			newCompositeNode(grammarAccess.getSpawnStrategyAccess().getFixedLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FixedLayout_0=ruleFixedLayout();

                    state._fsp--;


                    			current = this_FixedLayout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:2801:3: this_WaveSchedule_1= ruleWaveSchedule
                    {

                    			newCompositeNode(grammarAccess.getSpawnStrategyAccess().getWaveScheduleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaveSchedule_1=ruleWaveSchedule();

                    state._fsp--;


                    			current = this_WaveSchedule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpawnStrategy"


    // $ANTLR start "entryRuleFixedLayout"
    // InternalRangoMode.g:2813:1: entryRuleFixedLayout returns [EObject current=null] : iv_ruleFixedLayout= ruleFixedLayout EOF ;
    public final EObject entryRuleFixedLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedLayout = null;


        try {
            // InternalRangoMode.g:2813:52: (iv_ruleFixedLayout= ruleFixedLayout EOF )
            // InternalRangoMode.g:2814:2: iv_ruleFixedLayout= ruleFixedLayout EOF
            {
             newCompositeNode(grammarAccess.getFixedLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFixedLayout=ruleFixedLayout();

            state._fsp--;

             current =iv_ruleFixedLayout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFixedLayout"


    // $ANTLR start "ruleFixedLayout"
    // InternalRangoMode.g:2820:1: ruleFixedLayout returns [EObject current=null] : (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleBallSpawn ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFixedLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_spawns_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2826:2: ( (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleBallSpawn ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:2827:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleBallSpawn ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:2827:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleBallSpawn ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:2828:3: otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleBallSpawn ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:2836:3: ( (lv_spawns_2_0= ruleBallSpawn ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_INT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRangoMode.g:2837:4: (lv_spawns_2_0= ruleBallSpawn )
            	    {
            	    // InternalRangoMode.g:2837:4: (lv_spawns_2_0= ruleBallSpawn )
            	    // InternalRangoMode.g:2838:5: lv_spawns_2_0= ruleBallSpawn
            	    {

            	    					newCompositeNode(grammarAccess.getFixedLayoutAccess().getSpawnsBallSpawnParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_spawns_2_0=ruleBallSpawn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFixedLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spawns",
            	    						lv_spawns_2_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.BallSpawn");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFixedLayoutAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFixedLayout"


    // $ANTLR start "entryRuleWaveSchedule"
    // InternalRangoMode.g:2863:1: entryRuleWaveSchedule returns [EObject current=null] : iv_ruleWaveSchedule= ruleWaveSchedule EOF ;
    public final EObject entryRuleWaveSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaveSchedule = null;


        try {
            // InternalRangoMode.g:2863:53: (iv_ruleWaveSchedule= ruleWaveSchedule EOF )
            // InternalRangoMode.g:2864:2: iv_ruleWaveSchedule= ruleWaveSchedule EOF
            {
             newCompositeNode(grammarAccess.getWaveScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaveSchedule=ruleWaveSchedule();

            state._fsp--;

             current =iv_ruleWaveSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaveSchedule"


    // $ANTLR start "ruleWaveSchedule"
    // InternalRangoMode.g:2870:1: ruleWaveSchedule returns [EObject current=null] : (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) ;
    public final EObject ruleWaveSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_loop_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_escalation_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_waves_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2876:2: ( (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) )
            // InternalRangoMode.g:2877:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            {
            // InternalRangoMode.g:2877:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            // InternalRangoMode.g:2878:3: otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveScheduleAccess().getWavesKeyword_0());
            		
            // InternalRangoMode.g:2882:3: ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==79) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:2883:4: ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    {
                    // InternalRangoMode.g:2883:4: ( (lv_loop_1_0= 'looping' ) )
                    // InternalRangoMode.g:2884:5: (lv_loop_1_0= 'looping' )
                    {
                    // InternalRangoMode.g:2884:5: (lv_loop_1_0= 'looping' )
                    // InternalRangoMode.g:2885:6: lv_loop_1_0= 'looping'
                    {
                    lv_loop_1_0=(Token)match(input,79,FOLLOW_64); 

                    						newLeafNode(lv_loop_1_0, grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaveScheduleRule());
                    						}
                    						setWithLastConsumed(current, "loop", lv_loop_1_0 != null, "looping");
                    					

                    }


                    }

                    // InternalRangoMode.g:2897:4: (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==80) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalRangoMode.g:2898:5: otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) )
                            {
                            otherlv_2=(Token)match(input,80,FOLLOW_56); 

                            					newLeafNode(otherlv_2, grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,71,FOLLOW_10); 

                            					newLeafNode(otherlv_3, grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1());
                            				
                            // InternalRangoMode.g:2906:5: ( (lv_escalation_4_0= RULE_INT ) )
                            // InternalRangoMode.g:2907:6: (lv_escalation_4_0= RULE_INT )
                            {
                            // InternalRangoMode.g:2907:6: (lv_escalation_4_0= RULE_INT )
                            // InternalRangoMode.g:2908:7: lv_escalation_4_0= RULE_INT
                            {
                            lv_escalation_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                            							newLeafNode(lv_escalation_4_0, grammarAccess.getWaveScheduleAccess().getEscalationINTTerminalRuleCall_1_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getWaveScheduleRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"escalation",
                            								lv_escalation_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:2930:3: ( (lv_waves_6_0= ruleWave ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==81) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRangoMode.g:2931:4: (lv_waves_6_0= ruleWave )
            	    {
            	    // InternalRangoMode.g:2931:4: (lv_waves_6_0= ruleWave )
            	    // InternalRangoMode.g:2932:5: lv_waves_6_0= ruleWave
            	    {

            	    					newCompositeNode(grammarAccess.getWaveScheduleAccess().getWavesWaveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_66);
            	    lv_waves_6_0=ruleWave();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaveScheduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"waves",
            	    						lv_waves_6_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Wave");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWaveScheduleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaveSchedule"


    // $ANTLR start "entryRuleWave"
    // InternalRangoMode.g:2957:1: entryRuleWave returns [EObject current=null] : iv_ruleWave= ruleWave EOF ;
    public final EObject entryRuleWave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWave = null;


        try {
            // InternalRangoMode.g:2957:45: (iv_ruleWave= ruleWave EOF )
            // InternalRangoMode.g:2958:2: iv_ruleWave= ruleWave EOF
            {
             newCompositeNode(grammarAccess.getWaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWave=ruleWave();

            state._fsp--;

             current =iv_ruleWave; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWave"


    // $ANTLR start "ruleWave"
    // InternalRangoMode.g:2964:1: ruleWave returns [EObject current=null] : (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleBallSpawn ) )+ otherlv_6= '}' ) ;
    public final EObject ruleWave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_delay_2_0 = null;

        EObject lv_spawns_5_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2970:2: ( (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleBallSpawn ) )+ otherlv_6= '}' ) )
            // InternalRangoMode.g:2971:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleBallSpawn ) )+ otherlv_6= '}' )
            {
            // InternalRangoMode.g:2971:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleBallSpawn ) )+ otherlv_6= '}' )
            // InternalRangoMode.g:2972:3: otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleBallSpawn ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveAccess().getWaveKeyword_0());
            		
            // InternalRangoMode.g:2976:3: (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==82) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:2977:4: otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's'
                    {
                    otherlv_1=(Token)match(input,82,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getWaveAccess().getAfterKeyword_1_0());
                    			
                    // InternalRangoMode.g:2981:4: ( (lv_delay_2_0= ruleDecimal ) )
                    // InternalRangoMode.g:2982:5: (lv_delay_2_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2982:5: (lv_delay_2_0= ruleDecimal )
                    // InternalRangoMode.g:2983:6: lv_delay_2_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getWaveAccess().getDelayDecimalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_delay_2_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWaveRule());
                    						}
                    						set(
                    							current,
                    							"delay",
                    							lv_delay_2_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getWaveAccess().getSKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:3009:3: ( (lv_spawns_5_0= ruleBallSpawn ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==RULE_INT) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRangoMode.g:3010:4: (lv_spawns_5_0= ruleBallSpawn )
            	    {
            	    // InternalRangoMode.g:3010:4: (lv_spawns_5_0= ruleBallSpawn )
            	    // InternalRangoMode.g:3011:5: lv_spawns_5_0= ruleBallSpawn
            	    {

            	    					newCompositeNode(grammarAccess.getWaveAccess().getSpawnsBallSpawnParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_spawns_5_0=ruleBallSpawn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spawns",
            	    						lv_spawns_5_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.BallSpawn");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWaveAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWave"


    // $ANTLR start "entryRuleBallSpawn"
    // InternalRangoMode.g:3036:1: entryRuleBallSpawn returns [EObject current=null] : iv_ruleBallSpawn= ruleBallSpawn EOF ;
    public final EObject entryRuleBallSpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBallSpawn = null;


        try {
            // InternalRangoMode.g:3036:50: (iv_ruleBallSpawn= ruleBallSpawn EOF )
            // InternalRangoMode.g:3037:2: iv_ruleBallSpawn= ruleBallSpawn EOF
            {
             newCompositeNode(grammarAccess.getBallSpawnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBallSpawn=ruleBallSpawn();

            state._fsp--;

             current =iv_ruleBallSpawn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBallSpawn"


    // $ANTLR start "ruleBallSpawn"
    // InternalRangoMode.g:3043:1: ruleBallSpawn returns [EObject current=null] : ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) ;
    public final EObject ruleBallSpawn() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_size_4_0=null;
        Token otherlv_6=null;
        EObject this_At_5 = null;

        Enumerator lv_direction_7_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3049:2: ( ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) )
            // InternalRangoMode.g:3050:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            {
            // InternalRangoMode.g:3050:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            // InternalRangoMode.g:3051:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            {
            // InternalRangoMode.g:3051:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:3052:4: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*'
                    {
                    // InternalRangoMode.g:3052:4: ( (lv_count_0_0= RULE_INT ) )
                    // InternalRangoMode.g:3053:5: (lv_count_0_0= RULE_INT )
                    {
                    // InternalRangoMode.g:3053:5: (lv_count_0_0= RULE_INT )
                    // InternalRangoMode.g:3054:6: lv_count_0_0= RULE_INT
                    {
                    lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_count_0_0, grammarAccess.getBallSpawnAccess().getCountINTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBallSpawnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"count",
                    							lv_count_0_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getBallSpawnAccess().getAsteriskKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:3075:3: ( (otherlv_2= RULE_ID ) )
            // InternalRangoMode.g:3076:4: (otherlv_2= RULE_ID )
            {
            // InternalRangoMode.g:3076:4: (otherlv_2= RULE_ID )
            // InternalRangoMode.g:3077:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBallSpawnRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_2, grammarAccess.getBallSpawnAccess().getTypeBallTypeCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBallSpawnAccess().getSizeKeyword_2());
            		
            // InternalRangoMode.g:3092:3: ( (lv_size_4_0= RULE_INT ) )
            // InternalRangoMode.g:3093:4: (lv_size_4_0= RULE_INT )
            {
            // InternalRangoMode.g:3093:4: (lv_size_4_0= RULE_INT )
            // InternalRangoMode.g:3094:5: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_size_4_0, grammarAccess.getBallSpawnAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBallSpawnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getBallSpawnRule());
            			}
            			newCompositeNode(grammarAccess.getBallSpawnAccess().getAtParserRuleCall_4());
            		
            pushFollow(FOLLOW_68);
            this_At_5=ruleAt(current);

            state._fsp--;


            			current = this_At_5;
            			afterParserOrEnumRuleCall();
            		
            // InternalRangoMode.g:3121:3: (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==83) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:3122:4: otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getBallSpawnAccess().getMovingKeyword_5_0());
                    			
                    // InternalRangoMode.g:3126:4: ( (lv_direction_7_0= ruleDirection ) )
                    // InternalRangoMode.g:3127:5: (lv_direction_7_0= ruleDirection )
                    {
                    // InternalRangoMode.g:3127:5: (lv_direction_7_0= ruleDirection )
                    // InternalRangoMode.g:3128:6: lv_direction_7_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getBallSpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_7_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBallSpawnRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_7_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBallSpawn"


    // $ANTLR start "ruleDrops"
    // InternalRangoMode.g:3151:1: ruleDrops[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDrops(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_drops_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3157:2: ( (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:3158:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:3158:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:3159:3: otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDropsAccess().getDropsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:3167:3: ( (lv_drops_2_0= ruleDropTable ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRangoMode.g:3168:4: (lv_drops_2_0= ruleDropTable )
            	    {
            	    // InternalRangoMode.g:3168:4: (lv_drops_2_0= ruleDropTable )
            	    // InternalRangoMode.g:3169:5: lv_drops_2_0= ruleDropTable
            	    {

            	    					newCompositeNode(grammarAccess.getDropsAccess().getDropsDropTableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_70);
            	    lv_drops_2_0=ruleDropTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDropsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"drops",
            	    						lv_drops_2_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.DropTable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDropsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrops"


    // $ANTLR start "entryRuleDropTable"
    // InternalRangoMode.g:3194:1: entryRuleDropTable returns [EObject current=null] : iv_ruleDropTable= ruleDropTable EOF ;
    public final EObject entryRuleDropTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTable = null;


        try {
            // InternalRangoMode.g:3194:50: (iv_ruleDropTable= ruleDropTable EOF )
            // InternalRangoMode.g:3195:2: iv_ruleDropTable= ruleDropTable EOF
            {
             newCompositeNode(grammarAccess.getDropTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropTable=ruleDropTable();

            state._fsp--;

             current =iv_ruleDropTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropTable"


    // $ANTLR start "ruleDropTable"
    // InternalRangoMode.g:3201:1: ruleDropTable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDropTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_chance_1_0 = null;

        EObject lv_entries_4_0 = null;

        EObject lv_entries_6_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3207:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) )
            // InternalRangoMode.g:3208:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            {
            // InternalRangoMode.g:3208:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            // InternalRangoMode.g:3209:3: ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}'
            {
            // InternalRangoMode.g:3209:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3210:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3210:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3211:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropTableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getDropTableAccess().getBallTypeBallTypeCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3222:3: ( (lv_chance_1_0= ruleDecimal ) )
            // InternalRangoMode.g:3223:4: (lv_chance_1_0= ruleDecimal )
            {
            // InternalRangoMode.g:3223:4: (lv_chance_1_0= ruleDecimal )
            // InternalRangoMode.g:3224:5: lv_chance_1_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getDropTableAccess().getChanceDecimalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_chance_1_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropTableRule());
            					}
            					set(
            						current,
            						"chance",
            						lv_chance_1_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDropTableAccess().getPercentSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRangoMode.g:3249:3: ( (lv_entries_4_0= ruleDrop ) )
            // InternalRangoMode.g:3250:4: (lv_entries_4_0= ruleDrop )
            {
            // InternalRangoMode.g:3250:4: (lv_entries_4_0= ruleDrop )
            // InternalRangoMode.g:3251:5: lv_entries_4_0= ruleDrop
            {

            					newCompositeNode(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_entries_4_0=ruleDrop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropTableRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_4_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Drop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:3268:3: (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==23) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRangoMode.g:3269:4: otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDropTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRangoMode.g:3273:4: ( (lv_entries_6_0= ruleDrop ) )
            	    // InternalRangoMode.g:3274:5: (lv_entries_6_0= ruleDrop )
            	    {
            	    // InternalRangoMode.g:3274:5: (lv_entries_6_0= ruleDrop )
            	    // InternalRangoMode.g:3275:6: lv_entries_6_0= ruleDrop
            	    {

            	    						newCompositeNode(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_entries_6_0=ruleDrop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDropTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entries",
            	    							lv_entries_6_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Drop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDropTableAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropTable"


    // $ANTLR start "entryRuleDrop"
    // InternalRangoMode.g:3301:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalRangoMode.g:3301:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalRangoMode.g:3302:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalRangoMode.g:3308:1: ruleDrop returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_weight_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3314:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) )
            // InternalRangoMode.g:3315:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            {
            // InternalRangoMode.g:3315:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            // InternalRangoMode.g:3316:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            {
            // InternalRangoMode.g:3316:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3317:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3317:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3318:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(otherlv_0, grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3329:3: (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==85) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:3330:4: otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,85,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getDropAccess().getWeightKeyword_1_0());
                    			
                    // InternalRangoMode.g:3334:4: ( (lv_weight_2_0= RULE_INT ) )
                    // InternalRangoMode.g:3335:5: (lv_weight_2_0= RULE_INT )
                    {
                    // InternalRangoMode.g:3335:5: (lv_weight_2_0= RULE_INT )
                    // InternalRangoMode.g:3336:6: lv_weight_2_0= RULE_INT
                    {
                    lv_weight_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_weight_2_0, grammarAccess.getDropAccess().getWeightINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"weight",
                    							lv_weight_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleEndCondition"
    // InternalRangoMode.g:3357:1: entryRuleEndCondition returns [EObject current=null] : iv_ruleEndCondition= ruleEndCondition EOF ;
    public final EObject entryRuleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndCondition = null;


        try {
            // InternalRangoMode.g:3357:53: (iv_ruleEndCondition= ruleEndCondition EOF )
            // InternalRangoMode.g:3358:2: iv_ruleEndCondition= ruleEndCondition EOF
            {
             newCompositeNode(grammarAccess.getEndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndCondition=ruleEndCondition();

            state._fsp--;

             current =iv_ruleEndCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndCondition"


    // $ANTLR start "ruleEndCondition"
    // InternalRangoMode.g:3364:1: ruleEndCondition returns [EObject current=null] : (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_BallsPopped_3= ruleBallsPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_BallsAlive_6= ruleBallsAlive ) ;
    public final EObject ruleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Cleared_0 = null;

        EObject this_TimeReached_1 = null;

        EObject this_ScoreReached_2 = null;

        EObject this_BallsPopped_3 = null;

        EObject this_WavesSurvived_4 = null;

        EObject this_HealthDepleted_5 = null;

        EObject this_BallsAlive_6 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3370:2: ( (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_BallsPopped_3= ruleBallsPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_BallsAlive_6= ruleBallsAlive ) )
            // InternalRangoMode.g:3371:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_BallsPopped_3= ruleBallsPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_BallsAlive_6= ruleBallsAlive )
            {
            // InternalRangoMode.g:3371:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_BallsPopped_3= ruleBallsPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_BallsAlive_6= ruleBallsAlive )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:3372:3: this_Cleared_0= ruleCleared
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getClearedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cleared_0=ruleCleared();

                    state._fsp--;


                    			current = this_Cleared_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3381:3: this_TimeReached_1= ruleTimeReached
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getTimeReachedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeReached_1=ruleTimeReached();

                    state._fsp--;


                    			current = this_TimeReached_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3390:3: this_ScoreReached_2= ruleScoreReached
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getScoreReachedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScoreReached_2=ruleScoreReached();

                    state._fsp--;


                    			current = this_ScoreReached_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:3399:3: this_BallsPopped_3= ruleBallsPopped
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getBallsPoppedParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BallsPopped_3=ruleBallsPopped();

                    state._fsp--;


                    			current = this_BallsPopped_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:3408:3: this_WavesSurvived_4= ruleWavesSurvived
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getWavesSurvivedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WavesSurvived_4=ruleWavesSurvived();

                    state._fsp--;


                    			current = this_WavesSurvived_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:3417:3: this_HealthDepleted_5= ruleHealthDepleted
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getHealthDepletedParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_HealthDepleted_5=ruleHealthDepleted();

                    state._fsp--;


                    			current = this_HealthDepleted_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRangoMode.g:3426:3: this_BallsAlive_6= ruleBallsAlive
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getBallsAliveParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BallsAlive_6=ruleBallsAlive();

                    state._fsp--;


                    			current = this_BallsAlive_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndCondition"


    // $ANTLR start "entryRuleCleared"
    // InternalRangoMode.g:3438:1: entryRuleCleared returns [EObject current=null] : iv_ruleCleared= ruleCleared EOF ;
    public final EObject entryRuleCleared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCleared = null;


        try {
            // InternalRangoMode.g:3438:48: (iv_ruleCleared= ruleCleared EOF )
            // InternalRangoMode.g:3439:2: iv_ruleCleared= ruleCleared EOF
            {
             newCompositeNode(grammarAccess.getClearedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCleared=ruleCleared();

            state._fsp--;

             current =iv_ruleCleared; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCleared"


    // $ANTLR start "ruleCleared"
    // InternalRangoMode.g:3445:1: ruleCleared returns [EObject current=null] : ( () otherlv_1= 'all' otherlv_2= 'balls' otherlv_3= 'cleared' ) ;
    public final EObject ruleCleared() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3451:2: ( ( () otherlv_1= 'all' otherlv_2= 'balls' otherlv_3= 'cleared' ) )
            // InternalRangoMode.g:3452:2: ( () otherlv_1= 'all' otherlv_2= 'balls' otherlv_3= 'cleared' )
            {
            // InternalRangoMode.g:3452:2: ( () otherlv_1= 'all' otherlv_2= 'balls' otherlv_3= 'cleared' )
            // InternalRangoMode.g:3453:3: () otherlv_1= 'all' otherlv_2= 'balls' otherlv_3= 'cleared'
            {
            // InternalRangoMode.g:3453:3: ()
            // InternalRangoMode.g:3454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearedAccess().getClearedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getClearedAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getClearedAccess().getBallsKeyword_2());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClearedAccess().getClearedKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCleared"


    // $ANTLR start "entryRuleTimeReached"
    // InternalRangoMode.g:3476:1: entryRuleTimeReached returns [EObject current=null] : iv_ruleTimeReached= ruleTimeReached EOF ;
    public final EObject entryRuleTimeReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeReached = null;


        try {
            // InternalRangoMode.g:3476:52: (iv_ruleTimeReached= ruleTimeReached EOF )
            // InternalRangoMode.g:3477:2: iv_ruleTimeReached= ruleTimeReached EOF
            {
             newCompositeNode(grammarAccess.getTimeReachedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeReached=ruleTimeReached();

            state._fsp--;

             current =iv_ruleTimeReached; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeReached"


    // $ANTLR start "ruleTimeReached"
    // InternalRangoMode.g:3483:1: ruleTimeReached returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleTimeReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3489:2: ( (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:3490:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:3490:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:3491:3: otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeReachedAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,90,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3499:3: ( (lv_seconds_2_0= ruleDecimal ) )
            // InternalRangoMode.g:3500:4: (lv_seconds_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:3500:4: (lv_seconds_2_0= ruleDecimal )
            // InternalRangoMode.g:3501:5: lv_seconds_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getTimeReachedAccess().getSecondsDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_seconds_2_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeReachedRule());
            					}
            					set(
            						current,
            						"seconds",
            						lv_seconds_2_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeReachedAccess().getSKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeReached"


    // $ANTLR start "entryRuleScoreReached"
    // InternalRangoMode.g:3526:1: entryRuleScoreReached returns [EObject current=null] : iv_ruleScoreReached= ruleScoreReached EOF ;
    public final EObject entryRuleScoreReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreReached = null;


        try {
            // InternalRangoMode.g:3526:53: (iv_ruleScoreReached= ruleScoreReached EOF )
            // InternalRangoMode.g:3527:2: iv_ruleScoreReached= ruleScoreReached EOF
            {
             newCompositeNode(grammarAccess.getScoreReachedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScoreReached=ruleScoreReached();

            state._fsp--;

             current =iv_ruleScoreReached; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScoreReached"


    // $ANTLR start "ruleScoreReached"
    // InternalRangoMode.g:3533:1: ruleScoreReached returns [EObject current=null] : (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) ;
    public final EObject ruleScoreReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_points_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3539:2: ( (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:3540:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:3540:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            // InternalRangoMode.g:3541:3: otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreReachedAccess().getScoreKeyword_0());
            		
            otherlv_1=(Token)match(input,90,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getScoreReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3549:3: ( (lv_points_2_0= RULE_INT ) )
            // InternalRangoMode.g:3550:4: (lv_points_2_0= RULE_INT )
            {
            // InternalRangoMode.g:3550:4: (lv_points_2_0= RULE_INT )
            // InternalRangoMode.g:3551:5: lv_points_2_0= RULE_INT
            {
            lv_points_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_points_2_0, grammarAccess.getScoreReachedAccess().getPointsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScoreReachedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"points",
            						lv_points_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScoreReached"


    // $ANTLR start "entryRuleBallsPopped"
    // InternalRangoMode.g:3571:1: entryRuleBallsPopped returns [EObject current=null] : iv_ruleBallsPopped= ruleBallsPopped EOF ;
    public final EObject entryRuleBallsPopped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBallsPopped = null;


        try {
            // InternalRangoMode.g:3571:52: (iv_ruleBallsPopped= ruleBallsPopped EOF )
            // InternalRangoMode.g:3572:2: iv_ruleBallsPopped= ruleBallsPopped EOF
            {
             newCompositeNode(grammarAccess.getBallsPoppedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBallsPopped=ruleBallsPopped();

            state._fsp--;

             current =iv_ruleBallsPopped; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBallsPopped"


    // $ANTLR start "ruleBallsPopped"
    // InternalRangoMode.g:3578:1: ruleBallsPopped returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'popped' ) ;
    public final EObject ruleBallsPopped() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3584:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'popped' ) )
            // InternalRangoMode.g:3585:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'popped' )
            {
            // InternalRangoMode.g:3585:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'popped' )
            // InternalRangoMode.g:3586:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'popped'
            {
            // InternalRangoMode.g:3586:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3587:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3587:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3588:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_72); 

            					newLeafNode(lv_count_0_0, grammarAccess.getBallsPoppedAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBallsPoppedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,87,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getBallsPoppedAccess().getBallsKeyword_1());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBallsPoppedAccess().getPoppedKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBallsPopped"


    // $ANTLR start "entryRuleWavesSurvived"
    // InternalRangoMode.g:3616:1: entryRuleWavesSurvived returns [EObject current=null] : iv_ruleWavesSurvived= ruleWavesSurvived EOF ;
    public final EObject entryRuleWavesSurvived() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWavesSurvived = null;


        try {
            // InternalRangoMode.g:3616:54: (iv_ruleWavesSurvived= ruleWavesSurvived EOF )
            // InternalRangoMode.g:3617:2: iv_ruleWavesSurvived= ruleWavesSurvived EOF
            {
             newCompositeNode(grammarAccess.getWavesSurvivedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWavesSurvived=ruleWavesSurvived();

            state._fsp--;

             current =iv_ruleWavesSurvived; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWavesSurvived"


    // $ANTLR start "ruleWavesSurvived"
    // InternalRangoMode.g:3623:1: ruleWavesSurvived returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) ;
    public final EObject ruleWavesSurvived() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3629:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) )
            // InternalRangoMode.g:3630:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            {
            // InternalRangoMode.g:3630:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            // InternalRangoMode.g:3631:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived'
            {
            // InternalRangoMode.g:3631:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3632:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3632:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3633:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_76); 

            					newLeafNode(lv_count_0_0, grammarAccess.getWavesSurvivedAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWavesSurvivedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,78,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWavesSurvivedAccess().getSurvivedKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWavesSurvived"


    // $ANTLR start "entryRuleHealthDepleted"
    // InternalRangoMode.g:3661:1: entryRuleHealthDepleted returns [EObject current=null] : iv_ruleHealthDepleted= ruleHealthDepleted EOF ;
    public final EObject entryRuleHealthDepleted() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthDepleted = null;


        try {
            // InternalRangoMode.g:3661:55: (iv_ruleHealthDepleted= ruleHealthDepleted EOF )
            // InternalRangoMode.g:3662:2: iv_ruleHealthDepleted= ruleHealthDepleted EOF
            {
             newCompositeNode(grammarAccess.getHealthDepletedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthDepleted=ruleHealthDepleted();

            state._fsp--;

             current =iv_ruleHealthDepleted; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHealthDepleted"


    // $ANTLR start "ruleHealthDepleted"
    // InternalRangoMode.g:3668:1: ruleHealthDepleted returns [EObject current=null] : ( () otherlv_1= 'health' otherlv_2= 'depleted' ) ;
    public final EObject ruleHealthDepleted() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3674:2: ( ( () otherlv_1= 'health' otherlv_2= 'depleted' ) )
            // InternalRangoMode.g:3675:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            {
            // InternalRangoMode.g:3675:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            // InternalRangoMode.g:3676:3: () otherlv_1= 'health' otherlv_2= 'depleted'
            {
            // InternalRangoMode.g:3676:3: ()
            // InternalRangoMode.g:3677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthDepletedAccess().getHealthKeyword_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getHealthDepletedAccess().getDepletedKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHealthDepleted"


    // $ANTLR start "entryRuleBallsAlive"
    // InternalRangoMode.g:3695:1: entryRuleBallsAlive returns [EObject current=null] : iv_ruleBallsAlive= ruleBallsAlive EOF ;
    public final EObject entryRuleBallsAlive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBallsAlive = null;


        try {
            // InternalRangoMode.g:3695:51: (iv_ruleBallsAlive= ruleBallsAlive EOF )
            // InternalRangoMode.g:3696:2: iv_ruleBallsAlive= ruleBallsAlive EOF
            {
             newCompositeNode(grammarAccess.getBallsAliveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBallsAlive=ruleBallsAlive();

            state._fsp--;

             current =iv_ruleBallsAlive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBallsAlive"


    // $ANTLR start "ruleBallsAlive"
    // InternalRangoMode.g:3702:1: ruleBallsAlive returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'alive' ) ;
    public final EObject ruleBallsAlive() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3708:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'alive' ) )
            // InternalRangoMode.g:3709:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'alive' )
            {
            // InternalRangoMode.g:3709:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'alive' )
            // InternalRangoMode.g:3710:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'balls' otherlv_2= 'alive'
            {
            // InternalRangoMode.g:3710:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3711:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3711:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3712:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_72); 

            					newLeafNode(lv_count_0_0, grammarAccess.getBallsAliveAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBallsAliveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,87,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getBallsAliveAccess().getBallsKeyword_1());
            		
            otherlv_2=(Token)match(input,95,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBallsAliveAccess().getAliveKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBallsAlive"


    // $ANTLR start "entryRuleDecimal"
    // InternalRangoMode.g:3740:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalRangoMode.g:3740:47: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalRangoMode.g:3741:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalRangoMode.g:3747:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3753:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalRangoMode.g:3754:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalRangoMode.g:3754:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalRangoMode.g:3755:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_80); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
            		
            // InternalRangoMode.g:3762:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==96) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:3763:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,96,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "ruleTarget"
    // InternalRangoMode.g:3780:1: ruleTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'balls' ) | (enumLiteral_2= 'player' ) ) ;
    public final Enumerator ruleTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3786:2: ( ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'balls' ) | (enumLiteral_2= 'player' ) ) )
            // InternalRangoMode.g:3787:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'balls' ) | (enumLiteral_2= 'player' ) )
            {
            // InternalRangoMode.g:3787:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'balls' ) | (enumLiteral_2= 'player' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt43=1;
                }
                break;
            case 87:
                {
                alt43=2;
                }
                break;
            case 42:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalRangoMode.g:3788:3: (enumLiteral_0= 'everything' )
                    {
                    // InternalRangoMode.g:3788:3: (enumLiteral_0= 'everything' )
                    // InternalRangoMode.g:3789:4: enumLiteral_0= 'everything'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3796:3: (enumLiteral_1= 'balls' )
                    {
                    // InternalRangoMode.g:3796:3: (enumLiteral_1= 'balls' )
                    // InternalRangoMode.g:3797:4: enumLiteral_1= 'balls'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getBALLSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetAccess().getBALLSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3804:3: (enumLiteral_2= 'player' )
                    {
                    // InternalRangoMode.g:3804:3: (enumLiteral_2= 'player' )
                    // InternalRangoMode.g:3805:4: enumLiteral_2= 'player'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTargetAccess().getPLAYEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "ruleDirection"
    // InternalRangoMode.g:3815:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3821:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRangoMode.g:3822:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRangoMode.g:3822:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==98) ) {
                alt44=1;
            }
            else if ( (LA44_0==99) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:3823:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRangoMode.g:3823:3: (enumLiteral_0= 'left' )
                    // InternalRangoMode.g:3824:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3831:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRangoMode.g:3831:3: (enumLiteral_1= 'right' )
                    // InternalRangoMode.g:3832:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\3\uffff\1\116\1\uffff\1\134\3\uffff";
    static final String dfa_3s = "\1\133\3\uffff\1\127\1\uffff\1\137\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff\1\5\1\4\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\45\uffff\1\5\51\uffff\1\1\2\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\10\uffff\1\6",
            "",
            "\1\10\2\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3371:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_BallsPopped_3= ruleBallsPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_BallsAlive_6= ruleBallsAlive )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002068000001022L,0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002068000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000046000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002380020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001D80000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001D80001020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001F80001020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2008000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0090000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000040L,0x000000000A400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1200000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000040001000000L,0x0000000000001221L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001220L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000040000000000L,0x0000000200800000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000001000050L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000001000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000002000L,0x0000000000040000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});

}
