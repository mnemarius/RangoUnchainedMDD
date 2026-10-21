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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'edition'", "'enemy'", "'{'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "'on'", "'pop'", "':'", "'contact'", "','", "'}'", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'*'", "'poison'", "'every'", "'powerup'", "'gives'", "'material'", "'player'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'description'", "'gravity'", "'win'", "'when'", "'or'", "'lose'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'floor'", "'walls'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'of'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'looping'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'enemies'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'everything'", "'left'", "'right'"
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
    // InternalRangoMode.g:72:1: ruleEdition returns [EObject current=null] : (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* ) ;
    public final EObject ruleEdition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_enemyTypes_3_0 = null;

        EObject lv_powerUps_4_0 = null;

        EObject lv_materials_5_0 = null;

        EObject lv_players_6_0 = null;

        EObject this_Drops_7 = null;

        EObject lv_modes_8_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:78:2: ( (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* ) )
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            {
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            // InternalRangoMode.g:80:3: otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )*
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

            // InternalRangoMode.g:120:3: ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_materials_5_0= ruleMaterial ) ) | ( (lv_players_6_0= rulePlayerProfile ) ) | this_Drops_7= ruleDrops[$current] | ( (lv_modes_8_0= ruleGameMode ) ) )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 38:
                    {
                    alt2=2;
                    }
                    break;
                case 40:
                    {
                    alt2=3;
                    }
                    break;
                case 41:
                    {
                    alt2=4;
                    }
                    break;
                case 83:
                    {
                    alt2=5;
                    }
                    break;
                case 48:
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalRangoMode.g:121:4: ( (lv_enemyTypes_3_0= ruleEnemyType ) )
            	    {
            	    // InternalRangoMode.g:121:4: ( (lv_enemyTypes_3_0= ruleEnemyType ) )
            	    // InternalRangoMode.g:122:5: (lv_enemyTypes_3_0= ruleEnemyType )
            	    {
            	    // InternalRangoMode.g:122:5: (lv_enemyTypes_3_0= ruleEnemyType )
            	    // InternalRangoMode.g:123:6: lv_enemyTypes_3_0= ruleEnemyType
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getEnemyTypesEnemyTypeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_enemyTypes_3_0=ruleEnemyType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enemyTypes",
            	    							lv_enemyTypes_3_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EnemyType");
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


    // $ANTLR start "entryRuleEnemyType"
    // InternalRangoMode.g:237:1: entryRuleEnemyType returns [EObject current=null] : iv_ruleEnemyType= ruleEnemyType EOF ;
    public final EObject entryRuleEnemyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemyType = null;


        try {
            // InternalRangoMode.g:237:50: (iv_ruleEnemyType= ruleEnemyType EOF )
            // InternalRangoMode.g:238:2: iv_ruleEnemyType= ruleEnemyType EOF
            {
             newCompositeNode(grammarAccess.getEnemyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnemyType=ruleEnemyType();

            state._fsp--;

             current =iv_ruleEnemyType; 
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
    // $ANTLR end "entryRuleEnemyType"


    // $ANTLR start "ruleEnemyType"
    // InternalRangoMode.g:244:1: ruleEnemyType returns [EObject current=null] : (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) ;
    public final EObject ruleEnemyType() throws RecognitionException {
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
            // InternalRangoMode.g:250:2: ( (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) )
            // InternalRangoMode.g:251:2: (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            {
            // InternalRangoMode.g:251:2: (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            // InternalRangoMode.g:252:3: otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnemyTypeAccess().getEnemyKeyword_0());
            		
            // InternalRangoMode.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnemyTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemyTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEnemyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:278:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRangoMode.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRangoMode.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalRangoMode.g:280:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:283:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalRangoMode.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalRangoMode.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt3=5;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRangoMode.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:286:106: ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:287:6: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:290:9: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:290:10: {...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:290:19: (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:290:20: otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnemyTypeAccess().getSpriteKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:294:9: ( (lv_sprite_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:295:10: (lv_sprite_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:295:10: (lv_sprite_5_0= RULE_STRING )
            	    // InternalRangoMode.g:296:11: lv_sprite_5_0= RULE_STRING
            	    {
            	    lv_sprite_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    											newLeafNode(lv_sprite_5_0, grammarAccess.getEnemyTypeAccess().getSpriteSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEnemyTypeRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:319:106: ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:320:6: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:323:9: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:323:10: {...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:323:19: (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:323:20: otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnemyTypeAccess().getScaleKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:327:9: ( (lv_scale_7_0= ruleDecimal ) )
            	    // InternalRangoMode.g:328:10: (lv_scale_7_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:328:10: (lv_scale_7_0= ruleDecimal )
            	    // InternalRangoMode.g:329:11: lv_scale_7_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_scale_7_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRangoMode.g:353:106: ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:354:6: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRangoMode.g:357:9: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:357:10: {...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:357:19: (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:357:20: otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEnemyTypeAccess().getBounceKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:361:9: ( (lv_bounce_9_0= ruleDecimal ) )
            	    // InternalRangoMode.g:362:10: (lv_bounce_9_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:362:10: (lv_bounce_9_0= ruleDecimal )
            	    // InternalRangoMode.g:363:11: lv_bounce_9_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_bounce_9_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRangoMode.g:387:106: ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:388:6: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRangoMode.g:391:9: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:391:10: {...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:391:19: (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:391:20: otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEnemyTypeAccess().getSpeedKeyword_3_3_0());
            	    								
            	    // InternalRangoMode.g:395:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:396:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:396:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:397:11: lv_speed_11_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_speed_11_0=ruleDecimal();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalRangoMode.g:421:106: ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) )
            	    // InternalRangoMode.g:422:6: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalRangoMode.g:425:9: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    // InternalRangoMode.g:425:10: {...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:425:19: (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    // InternalRangoMode.g:425:20: otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getEnemyTypeAccess().getPointsKeyword_3_4_0());
            	    								
            	    // InternalRangoMode.g:429:9: ( (lv_points_13_0= RULE_INT ) )
            	    // InternalRangoMode.g:430:10: (lv_points_13_0= RULE_INT )
            	    {
            	    // InternalRangoMode.g:430:10: (lv_points_13_0= RULE_INT )
            	    // InternalRangoMode.g:431:11: lv_points_13_0= RULE_INT
            	    {
            	    lv_points_13_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    											newLeafNode(lv_points_13_0, grammarAccess.getEnemyTypeAccess().getPointsINTTerminalRuleCall_3_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEnemyTypeRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            				

            }

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getEnemyTypeAccess().getOnKeyword_4());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getEnemyTypeAccess().getPopKeyword_5());
            		
            otherlv_16=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getEnemyTypeAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:473:3: ( (lv_splitRule_17_0= ruleSplitRule ) )
            // InternalRangoMode.g:474:4: (lv_splitRule_17_0= ruleSplitRule )
            {
            // InternalRangoMode.g:474:4: (lv_splitRule_17_0= ruleSplitRule )
            // InternalRangoMode.g:475:5: lv_splitRule_17_0= ruleSplitRule
            {

            					newCompositeNode(grammarAccess.getEnemyTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_splitRule_17_0=ruleSplitRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            			newLeafNode(otherlv_18, grammarAccess.getEnemyTypeAccess().getOnKeyword_8());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getEnemyTypeAccess().getContactKeyword_9());
            		
            otherlv_20=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getEnemyTypeAccess().getColonKeyword_10());
            		
            // InternalRangoMode.g:504:3: ( (lv_contactEffects_21_0= rulePlayerEffect ) )
            // InternalRangoMode.g:505:4: (lv_contactEffects_21_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:505:4: (lv_contactEffects_21_0= rulePlayerEffect )
            // InternalRangoMode.g:506:5: lv_contactEffects_21_0= rulePlayerEffect
            {

            					newCompositeNode(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_contactEffects_21_0=rulePlayerEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            	    				newLeafNode(otherlv_22, grammarAccess.getEnemyTypeAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRangoMode.g:528:4: ( (lv_contactEffects_23_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:529:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:529:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    // InternalRangoMode.g:530:6: lv_contactEffects_23_0= rulePlayerEffect
            	    {

            	    						newCompositeNode(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_contactEffects_23_0=rulePlayerEffect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnemyTypeRule());
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

            			newLeafNode(otherlv_24, grammarAccess.getEnemyTypeAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleEnemyType"


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
    // InternalRangoMode.g:563:1: ruleSplitRule returns [EObject current=null] : (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit ) ;
    public final EObject ruleSplitRule() throws RecognitionException {
        EObject current = null;

        EObject this_Vanish_0 = null;

        EObject this_Split_1 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:569:2: ( (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit ) )
            // InternalRangoMode.g:570:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit )
            {
            // InternalRangoMode.g:570:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
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
    // InternalRangoMode.g:592:1: entryRuleVanish returns [EObject current=null] : iv_ruleVanish= ruleVanish EOF ;
    public final EObject entryRuleVanish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVanish = null;


        try {
            // InternalRangoMode.g:592:47: (iv_ruleVanish= ruleVanish EOF )
            // InternalRangoMode.g:593:2: iv_ruleVanish= ruleVanish EOF
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
    // InternalRangoMode.g:599:1: ruleVanish returns [EObject current=null] : ( () otherlv_1= 'vanish' ) ;
    public final EObject ruleVanish() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:605:2: ( ( () otherlv_1= 'vanish' ) )
            // InternalRangoMode.g:606:2: ( () otherlv_1= 'vanish' )
            {
            // InternalRangoMode.g:606:2: ( () otherlv_1= 'vanish' )
            // InternalRangoMode.g:607:3: () otherlv_1= 'vanish'
            {
            // InternalRangoMode.g:607:3: ()
            // InternalRangoMode.g:608:4: 
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
    // InternalRangoMode.g:622:1: entryRuleSplit returns [EObject current=null] : iv_ruleSplit= ruleSplit EOF ;
    public final EObject entryRuleSplit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplit = null;


        try {
            // InternalRangoMode.g:622:46: (iv_ruleSplit= ruleSplit EOF )
            // InternalRangoMode.g:623:2: iv_ruleSplit= ruleSplit EOF
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
    // InternalRangoMode.g:629:1: ruleSplit returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) ;
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
            // InternalRangoMode.g:635:2: ( (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) )
            // InternalRangoMode.g:636:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            {
            // InternalRangoMode.g:636:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            // InternalRangoMode.g:637:3: otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitAccess().getIntoKeyword_1());
            		
            // InternalRangoMode.g:645:3: ( (lv_fragments_2_0= RULE_INT ) )
            // InternalRangoMode.g:646:4: (lv_fragments_2_0= RULE_INT )
            {
            // InternalRangoMode.g:646:4: (lv_fragments_2_0= RULE_INT )
            // InternalRangoMode.g:647:5: lv_fragments_2_0= RULE_INT
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

            // InternalRangoMode.g:663:3: ( (otherlv_3= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:664:4: (otherlv_3= RULE_ID )
                    {
                    // InternalRangoMode.g:664:4: (otherlv_3= RULE_ID )
                    // InternalRangoMode.g:665:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalRangoMode.g:676:3: (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:677:4: otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSplitAccess().getLaunchedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitAccess().getAtKeyword_4_1());
                    			
                    // InternalRangoMode.g:685:4: ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    // InternalRangoMode.g:686:5: (lv_launchSpeed_6_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:686:5: (lv_launchSpeed_6_0= ruleDecimal )
                    // InternalRangoMode.g:687:6: lv_launchSpeed_6_0= ruleDecimal
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


    // $ANTLR start "entryRulePlayerEffect"
    // InternalRangoMode.g:709:1: entryRulePlayerEffect returns [EObject current=null] : iv_rulePlayerEffect= rulePlayerEffect EOF ;
    public final EObject entryRulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerEffect = null;


        try {
            // InternalRangoMode.g:709:53: (iv_rulePlayerEffect= rulePlayerEffect EOF )
            // InternalRangoMode.g:710:2: iv_rulePlayerEffect= rulePlayerEffect EOF
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
    // InternalRangoMode.g:716:1: rulePlayerEffect returns [EObject current=null] : (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) ;
    public final EObject rulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Damage_0 = null;

        EObject this_Heal_1 = null;

        EObject this_Shield_2 = null;

        EObject this_SpeedChange_3 = null;

        EObject this_Poison_4 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:722:2: ( (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) )
            // InternalRangoMode.g:723:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            {
            // InternalRangoMode.g:723:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:724:3: this_Damage_0= ruleDamage
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
                    // InternalRangoMode.g:733:3: this_Heal_1= ruleHeal
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
                    // InternalRangoMode.g:742:3: this_Shield_2= ruleShield
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
                    // InternalRangoMode.g:751:3: this_SpeedChange_3= ruleSpeedChange
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
                    // InternalRangoMode.g:760:3: this_Poison_4= rulePoison
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
    // InternalRangoMode.g:772:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalRangoMode.g:772:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalRangoMode.g:773:2: iv_ruleDamage= ruleDamage EOF
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
    // InternalRangoMode.g:779:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:785:2: ( (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:786:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:786:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:787:3: otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getDamageKeyword_0());
            		
            // InternalRangoMode.g:791:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:792:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:792:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:793:5: lv_amount_1_0= RULE_INT
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
    // InternalRangoMode.g:813:1: entryRuleHeal returns [EObject current=null] : iv_ruleHeal= ruleHeal EOF ;
    public final EObject entryRuleHeal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeal = null;


        try {
            // InternalRangoMode.g:813:45: (iv_ruleHeal= ruleHeal EOF )
            // InternalRangoMode.g:814:2: iv_ruleHeal= ruleHeal EOF
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
    // InternalRangoMode.g:820:1: ruleHeal returns [EObject current=null] : (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHeal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:826:2: ( (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:827:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:827:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:828:3: otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHealAccess().getHealKeyword_0());
            		
            // InternalRangoMode.g:832:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:833:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:833:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:834:5: lv_amount_1_0= RULE_INT
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
    // InternalRangoMode.g:854:1: entryRuleShield returns [EObject current=null] : iv_ruleShield= ruleShield EOF ;
    public final EObject entryRuleShield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShield = null;


        try {
            // InternalRangoMode.g:854:47: (iv_ruleShield= ruleShield EOF )
            // InternalRangoMode.g:855:2: iv_ruleShield= ruleShield EOF
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
    // InternalRangoMode.g:861:1: ruleShield returns [EObject current=null] : (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleShield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:867:2: ( (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:868:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:868:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:869:3: otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getShieldAccess().getShieldKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getShieldAccess().getForKeyword_1());
            		
            // InternalRangoMode.g:877:3: ( (lv_duration_2_0= ruleDecimal ) )
            // InternalRangoMode.g:878:4: (lv_duration_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:878:4: (lv_duration_2_0= ruleDecimal )
            // InternalRangoMode.g:879:5: lv_duration_2_0= ruleDecimal
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRangoMode.g:904:1: entryRuleSpeedChange returns [EObject current=null] : iv_ruleSpeedChange= ruleSpeedChange EOF ;
    public final EObject entryRuleSpeedChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedChange = null;


        try {
            // InternalRangoMode.g:904:52: (iv_ruleSpeedChange= ruleSpeedChange EOF )
            // InternalRangoMode.g:905:2: iv_ruleSpeedChange= ruleSpeedChange EOF
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
    // InternalRangoMode.g:911:1: ruleSpeedChange returns [EObject current=null] : (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) ;
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
            // InternalRangoMode.g:917:2: ( (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) )
            // InternalRangoMode.g:918:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            {
            // InternalRangoMode.g:918:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            // InternalRangoMode.g:919:3: otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1());
            		
            // InternalRangoMode.g:927:3: ( (lv_factor_2_0= ruleDecimal ) )
            // InternalRangoMode.g:928:4: (lv_factor_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:928:4: (lv_factor_2_0= ruleDecimal )
            // InternalRangoMode.g:929:5: lv_factor_2_0= ruleDecimal
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

            otherlv_3=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSpeedChangeAccess().getForKeyword_3());
            		
            // InternalRangoMode.g:950:3: ( (lv_duration_4_0= ruleDecimal ) )
            // InternalRangoMode.g:951:4: (lv_duration_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:951:4: (lv_duration_4_0= ruleDecimal )
            // InternalRangoMode.g:952:5: lv_duration_4_0= ruleDecimal
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

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRangoMode.g:977:1: entryRulePoison returns [EObject current=null] : iv_rulePoison= rulePoison EOF ;
    public final EObject entryRulePoison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoison = null;


        try {
            // InternalRangoMode.g:977:47: (iv_rulePoison= rulePoison EOF )
            // InternalRangoMode.g:978:2: iv_rulePoison= rulePoison EOF
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
    // InternalRangoMode.g:984:1: rulePoison returns [EObject current=null] : (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) ;
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
            // InternalRangoMode.g:990:2: ( (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) )
            // InternalRangoMode.g:991:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            {
            // InternalRangoMode.g:991:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            // InternalRangoMode.g:992:3: otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPoisonAccess().getPoisonKeyword_0());
            		
            // InternalRangoMode.g:996:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:997:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:997:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:998:5: lv_amount_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPoisonAccess().getEveryKeyword_2());
            		
            // InternalRangoMode.g:1018:3: ( (lv_interval_3_0= ruleDecimal ) )
            // InternalRangoMode.g:1019:4: (lv_interval_3_0= ruleDecimal )
            {
            // InternalRangoMode.g:1019:4: (lv_interval_3_0= ruleDecimal )
            // InternalRangoMode.g:1020:5: lv_interval_3_0= ruleDecimal
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

            otherlv_4=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPoisonAccess().getSKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPoisonAccess().getForKeyword_5());
            		
            // InternalRangoMode.g:1045:3: ( (lv_duration_6_0= ruleDecimal ) )
            // InternalRangoMode.g:1046:4: (lv_duration_6_0= ruleDecimal )
            {
            // InternalRangoMode.g:1046:4: (lv_duration_6_0= ruleDecimal )
            // InternalRangoMode.g:1047:5: lv_duration_6_0= ruleDecimal
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

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRangoMode.g:1072:1: entryRulePowerUp returns [EObject current=null] : iv_rulePowerUp= rulePowerUp EOF ;
    public final EObject entryRulePowerUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerUp = null;


        try {
            // InternalRangoMode.g:1072:48: (iv_rulePowerUp= rulePowerUp EOF )
            // InternalRangoMode.g:1073:2: iv_rulePowerUp= rulePowerUp EOF
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
    // InternalRangoMode.g:1079:1: rulePowerUp returns [EObject current=null] : (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) ;
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
            // InternalRangoMode.g:1085:2: ( (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) )
            // InternalRangoMode.g:1086:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            {
            // InternalRangoMode.g:1086:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            // InternalRangoMode.g:1087:3: otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerUpAccess().getPowerupKeyword_0());
            		
            // InternalRangoMode.g:1091:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1092:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1092:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1093:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRangoMode.g:1117:3: ( (lv_sprite_4_0= RULE_STRING ) )
            // InternalRangoMode.g:1118:4: (lv_sprite_4_0= RULE_STRING )
            {
            // InternalRangoMode.g:1118:4: (lv_sprite_4_0= RULE_STRING )
            // InternalRangoMode.g:1119:5: lv_sprite_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerUpAccess().getGivesKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPowerUpAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:1143:3: ( (lv_effects_7_0= rulePlayerEffect ) )
            // InternalRangoMode.g:1144:4: (lv_effects_7_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:1144:4: (lv_effects_7_0= rulePlayerEffect )
            // InternalRangoMode.g:1145:5: lv_effects_7_0= rulePlayerEffect
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

            // InternalRangoMode.g:1162:3: (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRangoMode.g:1163:4: otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPowerUpAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalRangoMode.g:1167:4: ( (lv_effects_9_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:1168:5: (lv_effects_9_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:1168:5: (lv_effects_9_0= rulePlayerEffect )
            	    // InternalRangoMode.g:1169:6: lv_effects_9_0= rulePlayerEffect
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
            	    break loop9;
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
    // InternalRangoMode.g:1195:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalRangoMode.g:1195:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalRangoMode.g:1196:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalRangoMode.g:1202:1: ruleMaterial returns [EObject current=null] : (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
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
            // InternalRangoMode.g:1208:2: ( (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRangoMode.g:1209:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRangoMode.g:1209:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRangoMode.g:1210:3: otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialAccess().getMaterialKeyword_0());
            		
            // InternalRangoMode.g:1214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1215:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1216:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRangoMode.g:1236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRangoMode.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRangoMode.g:1238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMaterialAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:1241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRangoMode.g:1242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRangoMode.g:1242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRangoMode.g:1243:4: ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1243:4: ({...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1244:5: {...}? => ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:1244:105: ( ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1245:6: ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:1248:9: ({...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1248:10: {...}? => (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "true");
            	    }
            	    // InternalRangoMode.g:1248:19: (otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1248:20: otherlv_4= 'bounce' ( (lv_bounce_5_0= ruleDecimal ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMaterialAccess().getBounceKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:1252:9: ( (lv_bounce_5_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1253:10: (lv_bounce_5_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1253:10: (lv_bounce_5_0= ruleDecimal )
            	    // InternalRangoMode.g:1254:11: lv_bounce_5_0= ruleDecimal
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
            	    // InternalRangoMode.g:1277:4: ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1277:4: ({...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:1278:5: {...}? => ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "getUnorderedGroupHelper().canSelect(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:1278:105: ( ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:1279:6: ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMaterialAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:1282:9: ({...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:1282:10: {...}? => (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMaterial", "true");
            	    }
            	    // InternalRangoMode.g:1282:19: (otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:1282:20: otherlv_6= 'sprite' ( (lv_sprite_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMaterialAccess().getSpriteKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:1286:9: ( (lv_sprite_7_0= RULE_STRING ) )
            	    // InternalRangoMode.g:1287:10: (lv_sprite_7_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:1287:10: (lv_sprite_7_0= RULE_STRING )
            	    // InternalRangoMode.g:1288:11: lv_sprite_7_0= RULE_STRING
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
            	    break loop10;
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
    // InternalRangoMode.g:1325:1: entryRulePlayerProfile returns [EObject current=null] : iv_rulePlayerProfile= rulePlayerProfile EOF ;
    public final EObject entryRulePlayerProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerProfile = null;


        try {
            // InternalRangoMode.g:1325:54: (iv_rulePlayerProfile= rulePlayerProfile EOF )
            // InternalRangoMode.g:1326:2: iv_rulePlayerProfile= rulePlayerProfile EOF
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
    // InternalRangoMode.g:1332:1: rulePlayerProfile returns [EObject current=null] : (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
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
            // InternalRangoMode.g:1338:2: ( (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // InternalRangoMode.g:1339:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // InternalRangoMode.g:1339:2: (otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // InternalRangoMode.g:1340:3: otherlv_0= 'player' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerProfileAccess().getPlayerKeyword_0());
            		
            // InternalRangoMode.g:1344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1345:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1346:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRangoMode.g:1366:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) ) )
            // InternalRangoMode.g:1367:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) )
            {
            // InternalRangoMode.g:1367:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?) )
            // InternalRangoMode.g:1368:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:1371:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?)
            // InternalRangoMode.g:1372:6: ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+ {...}?
            {
            // InternalRangoMode.g:1372:6: ( ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRangoMode.g:1373:4: ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1373:4: ({...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:1374:5: {...}? => ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:1374:110: ( ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:1375:6: ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:1378:9: ({...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:1378:10: {...}? => (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1378:19: (otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:1378:20: otherlv_4= 'character' ( (lv_character_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:1382:9: ( (lv_character_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:1383:10: (lv_character_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:1383:10: (lv_character_5_0= RULE_STRING )
            	    // InternalRangoMode.g:1384:11: lv_character_5_0= RULE_STRING
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
            	    // InternalRangoMode.g:1406:4: ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) )
            	    {
            	    // InternalRangoMode.g:1406:4: ({...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) ) )
            	    // InternalRangoMode.g:1407:5: {...}? => ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:1407:110: ( ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) ) )
            	    // InternalRangoMode.g:1408:6: ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:1411:9: ({...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? ) )
            	    // InternalRangoMode.g:1411:10: {...}? => (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1411:19: (otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )? )
            	    // InternalRangoMode.g:1411:20: otherlv_6= 'health' ( (lv_health_7_0= RULE_INT ) ) (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )?
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPlayerProfileAccess().getHealthKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:1415:9: ( (lv_health_7_0= RULE_INT ) )
            	    // InternalRangoMode.g:1416:10: (lv_health_7_0= RULE_INT )
            	    {
            	    // InternalRangoMode.g:1416:10: (lv_health_7_0= RULE_INT )
            	    // InternalRangoMode.g:1417:11: lv_health_7_0= RULE_INT
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

            	    // InternalRangoMode.g:1433:9: (otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==44) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalRangoMode.g:1434:10: otherlv_8= 'max' ( (lv_maxHealth_9_0= RULE_INT ) )
            	            {
            	            otherlv_8=(Token)match(input,44,FOLLOW_10); 

            	            										newLeafNode(otherlv_8, grammarAccess.getPlayerProfileAccess().getMaxKeyword_3_1_2_0());
            	            									
            	            // InternalRangoMode.g:1438:10: ( (lv_maxHealth_9_0= RULE_INT ) )
            	            // InternalRangoMode.g:1439:11: (lv_maxHealth_9_0= RULE_INT )
            	            {
            	            // InternalRangoMode.g:1439:11: (lv_maxHealth_9_0= RULE_INT )
            	            // InternalRangoMode.g:1440:12: lv_maxHealth_9_0= RULE_INT
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
            	    // InternalRangoMode.g:1463:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1463:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1464:5: {...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRangoMode.g:1464:110: ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1465:6: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRangoMode.g:1468:9: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1468:10: {...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1468:19: (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1468:20: otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:1472:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1473:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1473:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:1474:11: lv_speed_11_0= ruleDecimal
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
            	    // InternalRangoMode.g:1497:4: ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1497:4: ({...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) ) )
            	    // InternalRangoMode.g:1498:5: {...}? => ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRangoMode.g:1498:110: ( ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) ) )
            	    // InternalRangoMode.g:1499:6: ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRangoMode.g:1502:9: ({...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' ) )
            	    // InternalRangoMode.g:1502:10: {...}? => (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1502:19: (otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's' )
            	    // InternalRangoMode.g:1502:20: otherlv_12= 'tongue' ( (lv_tongueTime_13_0= ruleDecimal ) ) otherlv_14= 's'
            	    {
            	    otherlv_12=(Token)match(input,45,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPlayerProfileAccess().getTongueKeyword_3_3_0());
            	    								
            	    // InternalRangoMode.g:1506:9: ( (lv_tongueTime_13_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1507:10: (lv_tongueTime_13_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1507:10: (lv_tongueTime_13_0= ruleDecimal )
            	    // InternalRangoMode.g:1508:11: lv_tongueTime_13_0= ruleDecimal
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

            	    otherlv_14=(Token)match(input,34,FOLLOW_30); 

            	    									newLeafNode(otherlv_14, grammarAccess.getPlayerProfileAccess().getSKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRangoMode.g:1535:4: ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1535:4: ({...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) ) )
            	    // InternalRangoMode.g:1536:5: {...}? => ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalRangoMode.g:1536:110: ( ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) ) )
            	    // InternalRangoMode.g:1537:6: ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalRangoMode.g:1540:9: ({...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' ) )
            	    // InternalRangoMode.g:1540:10: {...}? => (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1540:19: (otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's' )
            	    // InternalRangoMode.g:1540:20: otherlv_15= 'cooldown' ( (lv_cooldown_16_0= ruleDecimal ) ) otherlv_17= 's'
            	    {
            	    otherlv_15=(Token)match(input,46,FOLLOW_10); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPlayerProfileAccess().getCooldownKeyword_3_4_0());
            	    								
            	    // InternalRangoMode.g:1544:9: ( (lv_cooldown_16_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1545:10: (lv_cooldown_16_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1545:10: (lv_cooldown_16_0= ruleDecimal )
            	    // InternalRangoMode.g:1546:11: lv_cooldown_16_0= ruleDecimal
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

            	    otherlv_17=(Token)match(input,34,FOLLOW_30); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPlayerProfileAccess().getSKeyword_3_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRangoMode.g:1573:4: ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) )
            	    {
            	    // InternalRangoMode.g:1573:4: ({...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) ) )
            	    // InternalRangoMode.g:1574:5: {...}? => ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalRangoMode.g:1574:110: ( ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) ) )
            	    // InternalRangoMode.g:1575:6: ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalRangoMode.g:1578:9: ({...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' ) )
            	    // InternalRangoMode.g:1578:10: {...}? => (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayerProfile", "true");
            	    }
            	    // InternalRangoMode.g:1578:19: (otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's' )
            	    // InternalRangoMode.g:1578:20: otherlv_18= 'grace' ( (lv_graceTime_19_0= ruleDecimal ) ) otherlv_20= 's'
            	    {
            	    otherlv_18=(Token)match(input,47,FOLLOW_10); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPlayerProfileAccess().getGraceKeyword_3_5_0());
            	    								
            	    // InternalRangoMode.g:1582:9: ( (lv_graceTime_19_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1583:10: (lv_graceTime_19_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1583:10: (lv_graceTime_19_0= ruleDecimal )
            	    // InternalRangoMode.g:1584:11: lv_graceTime_19_0= ruleDecimal
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

            	    otherlv_20=(Token)match(input,34,FOLLOW_30); 

            	    									newLeafNode(otherlv_20, grammarAccess.getPlayerProfileAccess().getSKeyword_3_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalRangoMode.g:1627:1: entryRuleGameMode returns [EObject current=null] : iv_ruleGameMode= ruleGameMode EOF ;
    public final EObject entryRuleGameMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameMode = null;


        try {
            // InternalRangoMode.g:1627:49: (iv_ruleGameMode= ruleGameMode EOF )
            // InternalRangoMode.g:1628:2: iv_ruleGameMode= ruleGameMode EOF
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
    // InternalRangoMode.g:1634:1: ruleGameMode returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) ;
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
            // InternalRangoMode.g:1640:2: ( (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) )
            // InternalRangoMode.g:1641:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            {
            // InternalRangoMode.g:1641:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            // InternalRangoMode.g:1642:3: otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( (lv_arena_12_0= ruleArena ) ) ( (lv_spawning_13_0= ruleSpawnStrategy ) ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameModeAccess().getModeKeyword_0());
            		
            // InternalRangoMode.g:1646:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1647:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1647:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1648:5: lv_name_1_0= RULE_ID
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

            // InternalRangoMode.g:1664:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalRangoMode.g:1665:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalRangoMode.g:1665:4: (lv_title_2_0= RULE_STRING )
            // InternalRangoMode.g:1666:5: lv_title_2_0= RULE_STRING
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
            		
            // InternalRangoMode.g:1686:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRangoMode.g:1687:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRangoMode.g:1691:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRangoMode.g:1692:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRangoMode.g:1692:5: (lv_description_5_0= RULE_STRING )
                    // InternalRangoMode.g:1693:6: lv_description_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGameModeAccess().getPlayerKeyword_5());
            		
            // InternalRangoMode.g:1714:3: ( (otherlv_7= RULE_ID ) )
            // InternalRangoMode.g:1715:4: (otherlv_7= RULE_ID )
            {
            // InternalRangoMode.g:1715:4: (otherlv_7= RULE_ID )
            // InternalRangoMode.g:1716:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameModeRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_7, grammarAccess.getGameModeAccess().getPlayerPlayerProfileCrossReference_6_0());
            				

            }


            }

            // InternalRangoMode.g:1727:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) )
            // InternalRangoMode.g:1728:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:1728:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) )
            // InternalRangoMode.g:1729:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            				
            // InternalRangoMode.g:1732:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* )
            // InternalRangoMode.g:1733:6: ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )*
            {
            // InternalRangoMode.g:1733:6: ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRangoMode.g:1734:4: ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1734:4: ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:1735:5: {...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalRangoMode.g:1735:105: ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:1736:6: ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalRangoMode.g:1739:9: ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:1739:10: {...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "true");
            	    }
            	    // InternalRangoMode.g:1739:19: (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:1739:20: otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) )
            	    {
            	    otherlv_9=(Token)match(input,50,FOLLOW_10); 

            	    									newLeafNode(otherlv_9, grammarAccess.getGameModeAccess().getGravityKeyword_7_0_0());
            	    								
            	    // InternalRangoMode.g:1743:9: ( (lv_gravity_10_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1744:10: (lv_gravity_10_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1744:10: (lv_gravity_10_0= ruleDecimal )
            	    // InternalRangoMode.g:1745:11: lv_gravity_10_0= ruleDecimal
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
            	    // InternalRangoMode.g:1768:4: ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:1768:4: ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) )
            	    // InternalRangoMode.g:1769:5: {...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalRangoMode.g:1769:105: ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) )
            	    // InternalRangoMode.g:1770:6: ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalRangoMode.g:1773:9: ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) )
            	    // InternalRangoMode.g:1773:10: {...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGameMode", "true");
            	    }
            	    // InternalRangoMode.g:1773:19: ( (lv_speedBonus_11_0= ruleSpeedBonus ) )
            	    // InternalRangoMode.g:1773:20: (lv_speedBonus_11_0= ruleSpeedBonus )
            	    {
            	    // InternalRangoMode.g:1773:20: (lv_speedBonus_11_0= ruleSpeedBonus )
            	    // InternalRangoMode.g:1774:10: lv_speedBonus_11_0= ruleSpeedBonus
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
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGameModeAccess().getUnorderedGroup_7());
            				

            }

            // InternalRangoMode.g:1803:3: ( (lv_arena_12_0= ruleArena ) )
            // InternalRangoMode.g:1804:4: (lv_arena_12_0= ruleArena )
            {
            // InternalRangoMode.g:1804:4: (lv_arena_12_0= ruleArena )
            // InternalRangoMode.g:1805:5: lv_arena_12_0= ruleArena
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

            // InternalRangoMode.g:1822:3: ( (lv_spawning_13_0= ruleSpawnStrategy ) )
            // InternalRangoMode.g:1823:4: (lv_spawning_13_0= ruleSpawnStrategy )
            {
            // InternalRangoMode.g:1823:4: (lv_spawning_13_0= ruleSpawnStrategy )
            // InternalRangoMode.g:1824:5: lv_spawning_13_0= ruleSpawnStrategy
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

            // InternalRangoMode.g:1841:3: (this_Drops_14= ruleDrops[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==83) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRangoMode.g:1842:4: this_Drops_14= ruleDrops[$current]
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

            // InternalRangoMode.g:1854:3: (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:1855:4: otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameModeAccess().getWinKeyword_11_0());
                    			
                    otherlv_16=(Token)match(input,52,FOLLOW_39); 

                    				newLeafNode(otherlv_16, grammarAccess.getGameModeAccess().getWhenKeyword_11_1());
                    			
                    // InternalRangoMode.g:1863:4: ( (lv_winConditions_17_0= ruleEndCondition ) )
                    // InternalRangoMode.g:1864:5: (lv_winConditions_17_0= ruleEndCondition )
                    {
                    // InternalRangoMode.g:1864:5: (lv_winConditions_17_0= ruleEndCondition )
                    // InternalRangoMode.g:1865:6: lv_winConditions_17_0= ruleEndCondition
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

                    // InternalRangoMode.g:1882:4: (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==53) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRangoMode.g:1883:5: otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    {
                    	    otherlv_18=(Token)match(input,53,FOLLOW_39); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGameModeAccess().getOrKeyword_11_3_0());
                    	    				
                    	    // InternalRangoMode.g:1887:5: ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    // InternalRangoMode.g:1888:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    {
                    	    // InternalRangoMode.g:1888:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    // InternalRangoMode.g:1889:7: lv_winConditions_19_0= ruleEndCondition
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,54,FOLLOW_38); 

            			newLeafNode(otherlv_20, grammarAccess.getGameModeAccess().getLoseKeyword_12());
            		
            otherlv_21=(Token)match(input,52,FOLLOW_39); 

            			newLeafNode(otherlv_21, grammarAccess.getGameModeAccess().getWhenKeyword_13());
            		
            // InternalRangoMode.g:1916:3: ( (lv_loseConditions_22_0= ruleEndCondition ) )
            // InternalRangoMode.g:1917:4: (lv_loseConditions_22_0= ruleEndCondition )
            {
            // InternalRangoMode.g:1917:4: (lv_loseConditions_22_0= ruleEndCondition )
            // InternalRangoMode.g:1918:5: lv_loseConditions_22_0= ruleEndCondition
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

            // InternalRangoMode.g:1935:3: (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRangoMode.g:1936:4: otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    {
            	    otherlv_23=(Token)match(input,53,FOLLOW_39); 

            	    				newLeafNode(otherlv_23, grammarAccess.getGameModeAccess().getOrKeyword_15_0());
            	    			
            	    // InternalRangoMode.g:1940:4: ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    // InternalRangoMode.g:1941:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    {
            	    // InternalRangoMode.g:1941:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    // InternalRangoMode.g:1942:6: lv_loseConditions_24_0= ruleEndCondition
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
            	    break loop18;
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
    // InternalRangoMode.g:1968:1: entryRuleSpeedBonus returns [EObject current=null] : iv_ruleSpeedBonus= ruleSpeedBonus EOF ;
    public final EObject entryRuleSpeedBonus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedBonus = null;


        try {
            // InternalRangoMode.g:1968:51: (iv_ruleSpeedBonus= ruleSpeedBonus EOF )
            // InternalRangoMode.g:1969:2: iv_ruleSpeedBonus= ruleSpeedBonus EOF
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
    // InternalRangoMode.g:1975:1: ruleSpeedBonus returns [EObject current=null] : ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) ;
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
            // InternalRangoMode.g:1981:2: ( ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) )
            // InternalRangoMode.g:1982:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            {
            // InternalRangoMode.g:1982:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            // InternalRangoMode.g:1983:3: () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            {
            // InternalRangoMode.g:1983:3: ()
            // InternalRangoMode.g:1984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getSpeedBonusAccess().getBonusKeyword_2());
            		
            // InternalRangoMode.g:1998:3: (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:1999:4: otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,57,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpeedBonusAccess().getToKeyword_3_1());
                    			
                    // InternalRangoMode.g:2007:4: ( (lv_maxFactor_5_0= ruleDecimal ) )
                    // InternalRangoMode.g:2008:5: (lv_maxFactor_5_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2008:5: (lv_maxFactor_5_0= ruleDecimal )
                    // InternalRangoMode.g:2009:6: lv_maxFactor_5_0= ruleDecimal
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

                    otherlv_6=(Token)match(input,58,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:2031:3: (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRangoMode.g:2032:4: otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's'
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0());
                    			
                    // InternalRangoMode.g:2036:4: ( (lv_duration_8_0= ruleDecimal ) )
                    // InternalRangoMode.g:2037:5: (lv_duration_8_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2037:5: (lv_duration_8_0= ruleDecimal )
                    // InternalRangoMode.g:2038:6: lv_duration_8_0= ruleDecimal
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

                    otherlv_9=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRangoMode.g:2064:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalRangoMode.g:2064:46: (iv_ruleArena= ruleArena EOF )
            // InternalRangoMode.g:2065:2: iv_ruleArena= ruleArena EOF
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
    // InternalRangoMode.g:2071:1: ruleArena returns [EObject current=null] : (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' ) ;
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
            // InternalRangoMode.g:2077:2: ( (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' ) )
            // InternalRangoMode.g:2078:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' )
            {
            // InternalRangoMode.g:2078:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}' )
            // InternalRangoMode.g:2079:3: otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) ) ( (lv_obstacles_14_0= ruleObstacle ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getArenaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getBackgroundKeyword_2());
            		
            // InternalRangoMode.g:2091:3: ( (lv_background_3_0= RULE_STRING ) )
            // InternalRangoMode.g:2092:4: (lv_background_3_0= RULE_STRING )
            {
            // InternalRangoMode.g:2092:4: (lv_background_3_0= RULE_STRING )
            // InternalRangoMode.g:2093:5: lv_background_3_0= RULE_STRING
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

            // InternalRangoMode.g:2109:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) ) )
            // InternalRangoMode.g:2110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) )
            {
            // InternalRangoMode.g:2110:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* ) )
            // InternalRangoMode.g:2111:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            				
            // InternalRangoMode.g:2114:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )* )
            // InternalRangoMode.g:2115:6: ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )*
            {
            // InternalRangoMode.g:2115:6: ( ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) ) )*
            loop21:
            do {
                int alt21=4;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
                    alt21=3;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRangoMode.g:2116:4: ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:2116:4: ({...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) ) )
            	    // InternalRangoMode.g:2117:5: {...}? => ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalRangoMode.g:2117:102: ( ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) ) )
            	    // InternalRangoMode.g:2118:6: ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalRangoMode.g:2121:9: ({...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) ) )
            	    // InternalRangoMode.g:2121:10: {...}? => (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2121:19: (otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) ) )
            	    // InternalRangoMode.g:2121:20: otherlv_5= 'floor' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getFloorKeyword_4_0_0());
            	    								
            	    // InternalRangoMode.g:2125:9: ( (otherlv_6= RULE_ID ) )
            	    // InternalRangoMode.g:2126:10: (otherlv_6= RULE_ID )
            	    {
            	    // InternalRangoMode.g:2126:10: (otherlv_6= RULE_ID )
            	    // InternalRangoMode.g:2127:11: otherlv_6= RULE_ID
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
            	    // InternalRangoMode.g:2144:4: ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:2144:4: ({...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) ) )
            	    // InternalRangoMode.g:2145:5: {...}? => ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalRangoMode.g:2145:102: ( ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) ) )
            	    // InternalRangoMode.g:2146:6: ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalRangoMode.g:2149:9: ({...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) ) )
            	    // InternalRangoMode.g:2149:10: {...}? => (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2149:19: (otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) ) )
            	    // InternalRangoMode.g:2149:20: otherlv_7= 'walls' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getArenaAccess().getWallsKeyword_4_1_0());
            	    								
            	    // InternalRangoMode.g:2153:9: ( (otherlv_8= RULE_ID ) )
            	    // InternalRangoMode.g:2154:10: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRangoMode.g:2154:10: (otherlv_8= RULE_ID )
            	    // InternalRangoMode.g:2155:11: otherlv_8= RULE_ID
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
            	    // InternalRangoMode.g:2172:4: ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) )
            	    {
            	    // InternalRangoMode.g:2172:4: ({...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) ) )
            	    // InternalRangoMode.g:2173:5: {...}? => ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "getUnorderedGroupHelper().canSelect(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalRangoMode.g:2173:102: ( ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) ) )
            	    // InternalRangoMode.g:2174:6: ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getArenaAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalRangoMode.g:2177:9: ({...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' ) )
            	    // InternalRangoMode.g:2177:10: {...}? => (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArena", "true");
            	    }
            	    // InternalRangoMode.g:2177:19: (otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%' )
            	    // InternalRangoMode.g:2177:20: otherlv_9= 'player' otherlv_10= 'starts' otherlv_11= 'at' ( (lv_playerStart_12_0= ruleDecimal ) ) otherlv_13= '%'
            	    {
            	    otherlv_9=(Token)match(input,41,FOLLOW_49); 

            	    									newLeafNode(otherlv_9, grammarAccess.getArenaAccess().getPlayerKeyword_4_2_0());
            	    								
            	    otherlv_10=(Token)match(input,64,FOLLOW_21); 

            	    									newLeafNode(otherlv_10, grammarAccess.getArenaAccess().getStartsKeyword_4_2_1());
            	    								
            	    otherlv_11=(Token)match(input,29,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getArenaAccess().getAtKeyword_4_2_2());
            	    								
            	    // InternalRangoMode.g:2189:9: ( (lv_playerStart_12_0= ruleDecimal ) )
            	    // InternalRangoMode.g:2190:10: (lv_playerStart_12_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:2190:10: (lv_playerStart_12_0= ruleDecimal )
            	    // InternalRangoMode.g:2191:11: lv_playerStart_12_0= ruleDecimal
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

            	    otherlv_13=(Token)match(input,65,FOLLOW_48); 

            	    									newLeafNode(otherlv_13, grammarAccess.getArenaAccess().getPercentSignKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getArenaAccess().getUnorderedGroup_4());
            				

            }

            // InternalRangoMode.g:2225:3: ( (lv_obstacles_14_0= ruleObstacle ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==68||LA22_0==72||LA22_0==75) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRangoMode.g:2226:4: (lv_obstacles_14_0= ruleObstacle )
            	    {
            	    // InternalRangoMode.g:2226:4: (lv_obstacles_14_0= ruleObstacle )
            	    // InternalRangoMode.g:2227:5: lv_obstacles_14_0= ruleObstacle
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
            	    break loop22;
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
    // InternalRangoMode.g:2253:1: ruleAt[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) ;
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
            // InternalRangoMode.g:2259:2: ( (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) )
            // InternalRangoMode.g:2260:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            {
            // InternalRangoMode.g:2260:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            // InternalRangoMode.g:2261:3: otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getAtKeyword_0());
            		
            otherlv_1=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRangoMode.g:2269:3: ( (lv_x_2_0= ruleDecimal ) )
            // InternalRangoMode.g:2270:4: (lv_x_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:2270:4: (lv_x_2_0= ruleDecimal )
            // InternalRangoMode.g:2271:5: lv_x_2_0= ruleDecimal
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

            otherlv_3=(Token)match(input,65,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getAtAccess().getPercentSignKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAtAccess().getCommaKeyword_4());
            		
            // InternalRangoMode.g:2296:3: ( (lv_y_5_0= ruleDecimal ) )
            // InternalRangoMode.g:2297:4: (lv_y_5_0= ruleDecimal )
            {
            // InternalRangoMode.g:2297:4: (lv_y_5_0= ruleDecimal )
            // InternalRangoMode.g:2298:5: lv_y_5_0= ruleDecimal
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

            otherlv_6=(Token)match(input,65,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getAtAccess().getPercentSignKeyword_6());
            		
            otherlv_7=(Token)match(input,67,FOLLOW_2); 

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
    // InternalRangoMode.g:2327:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRangoMode.g:2327:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRangoMode.g:2328:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalRangoMode.g:2334:1: ruleObstacle returns [EObject current=null] : (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_JumpPad_1 = null;

        EObject this_Teleporter_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2340:2: ( (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) )
            // InternalRangoMode.g:2341:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            {
            // InternalRangoMode.g:2341:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt23=1;
                }
                break;
            case 72:
                {
                alt23=2;
                }
                break;
            case 75:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:2342:3: this_Block_0= ruleBlock
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
                    // InternalRangoMode.g:2351:3: this_JumpPad_1= ruleJumpPad
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
                    // InternalRangoMode.g:2360:3: this_Teleporter_2= ruleTeleporter
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
    // InternalRangoMode.g:2372:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRangoMode.g:2372:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRangoMode.g:2373:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalRangoMode.g:2379:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? ) ;
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
            // InternalRangoMode.g:2385:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalRangoMode.g:2386:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalRangoMode.g:2386:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalRangoMode.g:2387:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalRangoMode.g:2391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2392:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2393:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSizeKeyword_3());
            		
            // InternalRangoMode.g:2424:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalRangoMode.g:2425:4: (lv_width_4_0= RULE_INT )
            {
            // InternalRangoMode.g:2425:4: (lv_width_4_0= RULE_INT )
            // InternalRangoMode.g:2426:5: lv_width_4_0= RULE_INT
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

            otherlv_5=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getByKeyword_5());
            		
            // InternalRangoMode.g:2446:3: ( (lv_height_6_0= RULE_INT ) )
            // InternalRangoMode.g:2447:4: (lv_height_6_0= RULE_INT )
            {
            // InternalRangoMode.g:2447:4: (lv_height_6_0= RULE_INT )
            // InternalRangoMode.g:2448:5: lv_height_6_0= RULE_INT
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

            // InternalRangoMode.g:2464:3: (otherlv_7= 'of' ( (otherlv_8= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==71) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:2465:4: otherlv_7= 'of' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getOfKeyword_7_0());
                    			
                    // InternalRangoMode.g:2469:4: ( (otherlv_8= RULE_ID ) )
                    // InternalRangoMode.g:2470:5: (otherlv_8= RULE_ID )
                    {
                    // InternalRangoMode.g:2470:5: (otherlv_8= RULE_ID )
                    // InternalRangoMode.g:2471:6: otherlv_8= RULE_ID
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
    // InternalRangoMode.g:2487:1: entryRuleJumpPad returns [EObject current=null] : iv_ruleJumpPad= ruleJumpPad EOF ;
    public final EObject entryRuleJumpPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpPad = null;


        try {
            // InternalRangoMode.g:2487:48: (iv_ruleJumpPad= ruleJumpPad EOF )
            // InternalRangoMode.g:2488:2: iv_ruleJumpPad= ruleJumpPad EOF
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
    // InternalRangoMode.g:2494:1: ruleJumpPad returns [EObject current=null] : (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
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
            // InternalRangoMode.g:2500:2: ( (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2501:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2501:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2502:3: otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJumpPadAccess().getJumppadKeyword_0());
            		
            // InternalRangoMode.g:2506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2507:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2508:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,73,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getJumpPadAccess().getLaunchKeyword_3());
            		
            // InternalRangoMode.g:2539:3: ( (lv_launch_4_0= ruleDecimal ) )
            // InternalRangoMode.g:2540:4: (lv_launch_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:2540:4: (lv_launch_4_0= ruleDecimal )
            // InternalRangoMode.g:2541:5: lv_launch_4_0= ruleDecimal
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

            // InternalRangoMode.g:2558:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==74) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRangoMode.g:2559:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2563:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2564:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2564:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2565:6: lv_affects_6_0= ruleTarget
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
    // InternalRangoMode.g:2587:1: entryRuleTeleporter returns [EObject current=null] : iv_ruleTeleporter= ruleTeleporter EOF ;
    public final EObject entryRuleTeleporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeleporter = null;


        try {
            // InternalRangoMode.g:2587:51: (iv_ruleTeleporter= ruleTeleporter EOF )
            // InternalRangoMode.g:2588:2: iv_ruleTeleporter= ruleTeleporter EOF
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
    // InternalRangoMode.g:2594:1: ruleTeleporter returns [EObject current=null] : (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
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
            // InternalRangoMode.g:2600:2: ( (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2601:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2601:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2602:3: otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeleporterAccess().getTeleporterKeyword_0());
            		
            // InternalRangoMode.g:2606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2607:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2608:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTeleporterAccess().getToKeyword_3());
            		
            // InternalRangoMode.g:2639:3: ( (otherlv_4= RULE_ID ) )
            // InternalRangoMode.g:2640:4: (otherlv_4= RULE_ID )
            {
            // InternalRangoMode.g:2640:4: (otherlv_4= RULE_ID )
            // InternalRangoMode.g:2641:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeleporterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(otherlv_4, grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0());
            				

            }


            }

            // InternalRangoMode.g:2652:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:2653:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2657:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2658:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2658:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2659:6: lv_affects_6_0= ruleTarget
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
    // InternalRangoMode.g:2681:1: entryRuleSpawnStrategy returns [EObject current=null] : iv_ruleSpawnStrategy= ruleSpawnStrategy EOF ;
    public final EObject entryRuleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpawnStrategy = null;


        try {
            // InternalRangoMode.g:2681:54: (iv_ruleSpawnStrategy= ruleSpawnStrategy EOF )
            // InternalRangoMode.g:2682:2: iv_ruleSpawnStrategy= ruleSpawnStrategy EOF
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
    // InternalRangoMode.g:2688:1: ruleSpawnStrategy returns [EObject current=null] : (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) ;
    public final EObject ruleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_FixedLayout_0 = null;

        EObject this_WaveSchedule_1 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2694:2: ( (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) )
            // InternalRangoMode.g:2695:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            {
            // InternalRangoMode.g:2695:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==76) ) {
                alt27=1;
            }
            else if ( (LA27_0==77) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:2696:3: this_FixedLayout_0= ruleFixedLayout
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
                    // InternalRangoMode.g:2705:3: this_WaveSchedule_1= ruleWaveSchedule
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
    // InternalRangoMode.g:2717:1: entryRuleFixedLayout returns [EObject current=null] : iv_ruleFixedLayout= ruleFixedLayout EOF ;
    public final EObject entryRuleFixedLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedLayout = null;


        try {
            // InternalRangoMode.g:2717:52: (iv_ruleFixedLayout= ruleFixedLayout EOF )
            // InternalRangoMode.g:2718:2: iv_ruleFixedLayout= ruleFixedLayout EOF
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
    // InternalRangoMode.g:2724:1: ruleFixedLayout returns [EObject current=null] : (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFixedLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_spawns_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2730:2: ( (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:2731:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:2731:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:2732:3: otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:2740:3: ( (lv_spawns_2_0= ruleEnemySpawn ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==RULE_INT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRangoMode.g:2741:4: (lv_spawns_2_0= ruleEnemySpawn )
            	    {
            	    // InternalRangoMode.g:2741:4: (lv_spawns_2_0= ruleEnemySpawn )
            	    // InternalRangoMode.g:2742:5: lv_spawns_2_0= ruleEnemySpawn
            	    {

            	    					newCompositeNode(grammarAccess.getFixedLayoutAccess().getSpawnsEnemySpawnParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_spawns_2_0=ruleEnemySpawn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFixedLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spawns",
            	    						lv_spawns_2_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EnemySpawn");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalRangoMode.g:2767:1: entryRuleWaveSchedule returns [EObject current=null] : iv_ruleWaveSchedule= ruleWaveSchedule EOF ;
    public final EObject entryRuleWaveSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaveSchedule = null;


        try {
            // InternalRangoMode.g:2767:53: (iv_ruleWaveSchedule= ruleWaveSchedule EOF )
            // InternalRangoMode.g:2768:2: iv_ruleWaveSchedule= ruleWaveSchedule EOF
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
    // InternalRangoMode.g:2774:1: ruleWaveSchedule returns [EObject current=null] : (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) ;
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
            // InternalRangoMode.g:2780:2: ( (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) )
            // InternalRangoMode.g:2781:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            {
            // InternalRangoMode.g:2781:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            // InternalRangoMode.g:2782:3: otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveScheduleAccess().getWavesKeyword_0());
            		
            // InternalRangoMode.g:2786:3: ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==78) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRangoMode.g:2787:4: ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    {
                    // InternalRangoMode.g:2787:4: ( (lv_loop_1_0= 'looping' ) )
                    // InternalRangoMode.g:2788:5: (lv_loop_1_0= 'looping' )
                    {
                    // InternalRangoMode.g:2788:5: (lv_loop_1_0= 'looping' )
                    // InternalRangoMode.g:2789:6: lv_loop_1_0= 'looping'
                    {
                    lv_loop_1_0=(Token)match(input,78,FOLLOW_64); 

                    						newLeafNode(lv_loop_1_0, grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaveScheduleRule());
                    						}
                    						setWithLastConsumed(current, "loop", lv_loop_1_0 != null, "looping");
                    					

                    }


                    }

                    // InternalRangoMode.g:2801:4: (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==79) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalRangoMode.g:2802:5: otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) )
                            {
                            otherlv_2=(Token)match(input,79,FOLLOW_56); 

                            					newLeafNode(otherlv_2, grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,70,FOLLOW_10); 

                            					newLeafNode(otherlv_3, grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1());
                            				
                            // InternalRangoMode.g:2810:5: ( (lv_escalation_4_0= RULE_INT ) )
                            // InternalRangoMode.g:2811:6: (lv_escalation_4_0= RULE_INT )
                            {
                            // InternalRangoMode.g:2811:6: (lv_escalation_4_0= RULE_INT )
                            // InternalRangoMode.g:2812:7: lv_escalation_4_0= RULE_INT
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
            		
            // InternalRangoMode.g:2834:3: ( (lv_waves_6_0= ruleWave ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==80) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRangoMode.g:2835:4: (lv_waves_6_0= ruleWave )
            	    {
            	    // InternalRangoMode.g:2835:4: (lv_waves_6_0= ruleWave )
            	    // InternalRangoMode.g:2836:5: lv_waves_6_0= ruleWave
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // InternalRangoMode.g:2861:1: entryRuleWave returns [EObject current=null] : iv_ruleWave= ruleWave EOF ;
    public final EObject entryRuleWave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWave = null;


        try {
            // InternalRangoMode.g:2861:45: (iv_ruleWave= ruleWave EOF )
            // InternalRangoMode.g:2862:2: iv_ruleWave= ruleWave EOF
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
    // InternalRangoMode.g:2868:1: ruleWave returns [EObject current=null] : (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' ) ;
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
            // InternalRangoMode.g:2874:2: ( (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' ) )
            // InternalRangoMode.g:2875:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' )
            {
            // InternalRangoMode.g:2875:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' )
            // InternalRangoMode.g:2876:3: otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveAccess().getWaveKeyword_0());
            		
            // InternalRangoMode.g:2880:3: (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:2881:4: otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's'
                    {
                    otherlv_1=(Token)match(input,81,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getWaveAccess().getAfterKeyword_1_0());
                    			
                    // InternalRangoMode.g:2885:4: ( (lv_delay_2_0= ruleDecimal ) )
                    // InternalRangoMode.g:2886:5: (lv_delay_2_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2886:5: (lv_delay_2_0= ruleDecimal )
                    // InternalRangoMode.g:2887:6: lv_delay_2_0= ruleDecimal
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

                    otherlv_3=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getWaveAccess().getSKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:2913:3: ( (lv_spawns_5_0= ruleEnemySpawn ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRangoMode.g:2914:4: (lv_spawns_5_0= ruleEnemySpawn )
            	    {
            	    // InternalRangoMode.g:2914:4: (lv_spawns_5_0= ruleEnemySpawn )
            	    // InternalRangoMode.g:2915:5: lv_spawns_5_0= ruleEnemySpawn
            	    {

            	    					newCompositeNode(grammarAccess.getWaveAccess().getSpawnsEnemySpawnParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_spawns_5_0=ruleEnemySpawn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spawns",
            	    						lv_spawns_5_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.EnemySpawn");
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


    // $ANTLR start "entryRuleEnemySpawn"
    // InternalRangoMode.g:2940:1: entryRuleEnemySpawn returns [EObject current=null] : iv_ruleEnemySpawn= ruleEnemySpawn EOF ;
    public final EObject entryRuleEnemySpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemySpawn = null;


        try {
            // InternalRangoMode.g:2940:51: (iv_ruleEnemySpawn= ruleEnemySpawn EOF )
            // InternalRangoMode.g:2941:2: iv_ruleEnemySpawn= ruleEnemySpawn EOF
            {
             newCompositeNode(grammarAccess.getEnemySpawnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnemySpawn=ruleEnemySpawn();

            state._fsp--;

             current =iv_ruleEnemySpawn; 
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
    // $ANTLR end "entryRuleEnemySpawn"


    // $ANTLR start "ruleEnemySpawn"
    // InternalRangoMode.g:2947:1: ruleEnemySpawn returns [EObject current=null] : ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) ;
    public final EObject ruleEnemySpawn() throws RecognitionException {
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
            // InternalRangoMode.g:2953:2: ( ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) )
            // InternalRangoMode.g:2954:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            {
            // InternalRangoMode.g:2954:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            // InternalRangoMode.g:2955:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            {
            // InternalRangoMode.g:2955:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:2956:4: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*'
                    {
                    // InternalRangoMode.g:2956:4: ( (lv_count_0_0= RULE_INT ) )
                    // InternalRangoMode.g:2957:5: (lv_count_0_0= RULE_INT )
                    {
                    // InternalRangoMode.g:2957:5: (lv_count_0_0= RULE_INT )
                    // InternalRangoMode.g:2958:6: lv_count_0_0= RULE_INT
                    {
                    lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_count_0_0, grammarAccess.getEnemySpawnAccess().getCountINTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnemySpawnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"count",
                    							lv_count_0_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnemySpawnAccess().getAsteriskKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:2979:3: ( (otherlv_2= RULE_ID ) )
            // InternalRangoMode.g:2980:4: (otherlv_2= RULE_ID )
            {
            // InternalRangoMode.g:2980:4: (otherlv_2= RULE_ID )
            // InternalRangoMode.g:2981:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemySpawnRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_2, grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEnemySpawnAccess().getSizeKeyword_2());
            		
            // InternalRangoMode.g:2996:3: ( (lv_size_4_0= RULE_INT ) )
            // InternalRangoMode.g:2997:4: (lv_size_4_0= RULE_INT )
            {
            // InternalRangoMode.g:2997:4: (lv_size_4_0= RULE_INT )
            // InternalRangoMode.g:2998:5: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_size_4_0, grammarAccess.getEnemySpawnAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemySpawnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getEnemySpawnRule());
            			}
            			newCompositeNode(grammarAccess.getEnemySpawnAccess().getAtParserRuleCall_4());
            		
            pushFollow(FOLLOW_68);
            this_At_5=ruleAt(current);

            state._fsp--;


            			current = this_At_5;
            			afterParserOrEnumRuleCall();
            		
            // InternalRangoMode.g:3025:3: (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==82) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRangoMode.g:3026:4: otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_69); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0());
                    			
                    // InternalRangoMode.g:3030:4: ( (lv_direction_7_0= ruleDirection ) )
                    // InternalRangoMode.g:3031:5: (lv_direction_7_0= ruleDirection )
                    {
                    // InternalRangoMode.g:3031:5: (lv_direction_7_0= ruleDirection )
                    // InternalRangoMode.g:3032:6: lv_direction_7_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getEnemySpawnAccess().getDirectionDirectionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_7_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnemySpawnRule());
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
    // $ANTLR end "ruleEnemySpawn"


    // $ANTLR start "ruleDrops"
    // InternalRangoMode.g:3055:1: ruleDrops[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDrops(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_drops_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3061:2: ( (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:3062:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:3062:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:3063:3: otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDropsAccess().getDropsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:3071:3: ( (lv_drops_2_0= ruleDropTable ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRangoMode.g:3072:4: (lv_drops_2_0= ruleDropTable )
            	    {
            	    // InternalRangoMode.g:3072:4: (lv_drops_2_0= ruleDropTable )
            	    // InternalRangoMode.g:3073:5: lv_drops_2_0= ruleDropTable
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalRangoMode.g:3098:1: entryRuleDropTable returns [EObject current=null] : iv_ruleDropTable= ruleDropTable EOF ;
    public final EObject entryRuleDropTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTable = null;


        try {
            // InternalRangoMode.g:3098:50: (iv_ruleDropTable= ruleDropTable EOF )
            // InternalRangoMode.g:3099:2: iv_ruleDropTable= ruleDropTable EOF
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
    // InternalRangoMode.g:3105:1: ruleDropTable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) ;
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
            // InternalRangoMode.g:3111:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) )
            // InternalRangoMode.g:3112:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            {
            // InternalRangoMode.g:3112:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            // InternalRangoMode.g:3113:3: ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}'
            {
            // InternalRangoMode.g:3113:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3114:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3114:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3115:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropTableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3126:3: ( (lv_chance_1_0= ruleDecimal ) )
            // InternalRangoMode.g:3127:4: (lv_chance_1_0= ruleDecimal )
            {
            // InternalRangoMode.g:3127:4: (lv_chance_1_0= ruleDecimal )
            // InternalRangoMode.g:3128:5: lv_chance_1_0= ruleDecimal
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

            otherlv_2=(Token)match(input,65,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDropTableAccess().getPercentSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRangoMode.g:3153:3: ( (lv_entries_4_0= ruleDrop ) )
            // InternalRangoMode.g:3154:4: (lv_entries_4_0= ruleDrop )
            {
            // InternalRangoMode.g:3154:4: (lv_entries_4_0= ruleDrop )
            // InternalRangoMode.g:3155:5: lv_entries_4_0= ruleDrop
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

            // InternalRangoMode.g:3172:3: (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRangoMode.g:3173:4: otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDropTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRangoMode.g:3177:4: ( (lv_entries_6_0= ruleDrop ) )
            	    // InternalRangoMode.g:3178:5: (lv_entries_6_0= ruleDrop )
            	    {
            	    // InternalRangoMode.g:3178:5: (lv_entries_6_0= ruleDrop )
            	    // InternalRangoMode.g:3179:6: lv_entries_6_0= ruleDrop
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
            	    break loop37;
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
    // InternalRangoMode.g:3205:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalRangoMode.g:3205:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalRangoMode.g:3206:2: iv_ruleDrop= ruleDrop EOF
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
    // InternalRangoMode.g:3212:1: ruleDrop returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_weight_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3218:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) )
            // InternalRangoMode.g:3219:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            {
            // InternalRangoMode.g:3219:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            // InternalRangoMode.g:3220:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            {
            // InternalRangoMode.g:3220:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3221:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3221:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3222:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(otherlv_0, grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3233:3: (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==84) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRangoMode.g:3234:4: otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,84,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getDropAccess().getWeightKeyword_1_0());
                    			
                    // InternalRangoMode.g:3238:4: ( (lv_weight_2_0= RULE_INT ) )
                    // InternalRangoMode.g:3239:5: (lv_weight_2_0= RULE_INT )
                    {
                    // InternalRangoMode.g:3239:5: (lv_weight_2_0= RULE_INT )
                    // InternalRangoMode.g:3240:6: lv_weight_2_0= RULE_INT
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
    // InternalRangoMode.g:3261:1: entryRuleEndCondition returns [EObject current=null] : iv_ruleEndCondition= ruleEndCondition EOF ;
    public final EObject entryRuleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndCondition = null;


        try {
            // InternalRangoMode.g:3261:53: (iv_ruleEndCondition= ruleEndCondition EOF )
            // InternalRangoMode.g:3262:2: iv_ruleEndCondition= ruleEndCondition EOF
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
    // InternalRangoMode.g:3268:1: ruleEndCondition returns [EObject current=null] : (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive ) ;
    public final EObject ruleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Cleared_0 = null;

        EObject this_TimeReached_1 = null;

        EObject this_ScoreReached_2 = null;

        EObject this_EnemiesPopped_3 = null;

        EObject this_WavesSurvived_4 = null;

        EObject this_HealthDepleted_5 = null;

        EObject this_EnemiesAlive_6 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3274:2: ( (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive ) )
            // InternalRangoMode.g:3275:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )
            {
            // InternalRangoMode.g:3275:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalRangoMode.g:3276:3: this_Cleared_0= ruleCleared
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
                    // InternalRangoMode.g:3285:3: this_TimeReached_1= ruleTimeReached
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
                    // InternalRangoMode.g:3294:3: this_ScoreReached_2= ruleScoreReached
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
                    // InternalRangoMode.g:3303:3: this_EnemiesPopped_3= ruleEnemiesPopped
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getEnemiesPoppedParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnemiesPopped_3=ruleEnemiesPopped();

                    state._fsp--;


                    			current = this_EnemiesPopped_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:3312:3: this_WavesSurvived_4= ruleWavesSurvived
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
                    // InternalRangoMode.g:3321:3: this_HealthDepleted_5= ruleHealthDepleted
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
                    // InternalRangoMode.g:3330:3: this_EnemiesAlive_6= ruleEnemiesAlive
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getEnemiesAliveParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnemiesAlive_6=ruleEnemiesAlive();

                    state._fsp--;


                    			current = this_EnemiesAlive_6;
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
    // InternalRangoMode.g:3342:1: entryRuleCleared returns [EObject current=null] : iv_ruleCleared= ruleCleared EOF ;
    public final EObject entryRuleCleared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCleared = null;


        try {
            // InternalRangoMode.g:3342:48: (iv_ruleCleared= ruleCleared EOF )
            // InternalRangoMode.g:3343:2: iv_ruleCleared= ruleCleared EOF
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
    // InternalRangoMode.g:3349:1: ruleCleared returns [EObject current=null] : ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' ) ;
    public final EObject ruleCleared() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3355:2: ( ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' ) )
            // InternalRangoMode.g:3356:2: ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' )
            {
            // InternalRangoMode.g:3356:2: ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' )
            // InternalRangoMode.g:3357:3: () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared'
            {
            // InternalRangoMode.g:3357:3: ()
            // InternalRangoMode.g:3358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearedAccess().getClearedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getClearedAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getClearedAccess().getEnemiesKeyword_2());
            		
            otherlv_3=(Token)match(input,87,FOLLOW_2); 

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
    // InternalRangoMode.g:3380:1: entryRuleTimeReached returns [EObject current=null] : iv_ruleTimeReached= ruleTimeReached EOF ;
    public final EObject entryRuleTimeReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeReached = null;


        try {
            // InternalRangoMode.g:3380:52: (iv_ruleTimeReached= ruleTimeReached EOF )
            // InternalRangoMode.g:3381:2: iv_ruleTimeReached= ruleTimeReached EOF
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
    // InternalRangoMode.g:3387:1: ruleTimeReached returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleTimeReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3393:2: ( (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:3394:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:3394:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:3395:3: otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeReachedAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,89,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3403:3: ( (lv_seconds_2_0= ruleDecimal ) )
            // InternalRangoMode.g:3404:4: (lv_seconds_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:3404:4: (lv_seconds_2_0= ruleDecimal )
            // InternalRangoMode.g:3405:5: lv_seconds_2_0= ruleDecimal
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRangoMode.g:3430:1: entryRuleScoreReached returns [EObject current=null] : iv_ruleScoreReached= ruleScoreReached EOF ;
    public final EObject entryRuleScoreReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreReached = null;


        try {
            // InternalRangoMode.g:3430:53: (iv_ruleScoreReached= ruleScoreReached EOF )
            // InternalRangoMode.g:3431:2: iv_ruleScoreReached= ruleScoreReached EOF
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
    // InternalRangoMode.g:3437:1: ruleScoreReached returns [EObject current=null] : (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) ;
    public final EObject ruleScoreReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_points_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3443:2: ( (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:3444:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:3444:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            // InternalRangoMode.g:3445:3: otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreReachedAccess().getScoreKeyword_0());
            		
            otherlv_1=(Token)match(input,89,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getScoreReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3453:3: ( (lv_points_2_0= RULE_INT ) )
            // InternalRangoMode.g:3454:4: (lv_points_2_0= RULE_INT )
            {
            // InternalRangoMode.g:3454:4: (lv_points_2_0= RULE_INT )
            // InternalRangoMode.g:3455:5: lv_points_2_0= RULE_INT
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


    // $ANTLR start "entryRuleEnemiesPopped"
    // InternalRangoMode.g:3475:1: entryRuleEnemiesPopped returns [EObject current=null] : iv_ruleEnemiesPopped= ruleEnemiesPopped EOF ;
    public final EObject entryRuleEnemiesPopped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemiesPopped = null;


        try {
            // InternalRangoMode.g:3475:54: (iv_ruleEnemiesPopped= ruleEnemiesPopped EOF )
            // InternalRangoMode.g:3476:2: iv_ruleEnemiesPopped= ruleEnemiesPopped EOF
            {
             newCompositeNode(grammarAccess.getEnemiesPoppedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnemiesPopped=ruleEnemiesPopped();

            state._fsp--;

             current =iv_ruleEnemiesPopped; 
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
    // $ANTLR end "entryRuleEnemiesPopped"


    // $ANTLR start "ruleEnemiesPopped"
    // InternalRangoMode.g:3482:1: ruleEnemiesPopped returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' ) ;
    public final EObject ruleEnemiesPopped() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3488:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' ) )
            // InternalRangoMode.g:3489:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' )
            {
            // InternalRangoMode.g:3489:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' )
            // InternalRangoMode.g:3490:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped'
            {
            // InternalRangoMode.g:3490:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3491:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3491:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3492:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_72); 

            					newLeafNode(lv_count_0_0, grammarAccess.getEnemiesPoppedAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemiesPoppedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,86,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getEnemiesPoppedAccess().getEnemiesKeyword_1());
            		
            otherlv_2=(Token)match(input,91,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnemiesPoppedAccess().getPoppedKeyword_2());
            		

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
    // $ANTLR end "ruleEnemiesPopped"


    // $ANTLR start "entryRuleWavesSurvived"
    // InternalRangoMode.g:3520:1: entryRuleWavesSurvived returns [EObject current=null] : iv_ruleWavesSurvived= ruleWavesSurvived EOF ;
    public final EObject entryRuleWavesSurvived() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWavesSurvived = null;


        try {
            // InternalRangoMode.g:3520:54: (iv_ruleWavesSurvived= ruleWavesSurvived EOF )
            // InternalRangoMode.g:3521:2: iv_ruleWavesSurvived= ruleWavesSurvived EOF
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
    // InternalRangoMode.g:3527:1: ruleWavesSurvived returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) ;
    public final EObject ruleWavesSurvived() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3533:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) )
            // InternalRangoMode.g:3534:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            {
            // InternalRangoMode.g:3534:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            // InternalRangoMode.g:3535:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived'
            {
            // InternalRangoMode.g:3535:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3536:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3536:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3537:5: lv_count_0_0= RULE_INT
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

            otherlv_1=(Token)match(input,77,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_2); 

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
    // InternalRangoMode.g:3565:1: entryRuleHealthDepleted returns [EObject current=null] : iv_ruleHealthDepleted= ruleHealthDepleted EOF ;
    public final EObject entryRuleHealthDepleted() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthDepleted = null;


        try {
            // InternalRangoMode.g:3565:55: (iv_ruleHealthDepleted= ruleHealthDepleted EOF )
            // InternalRangoMode.g:3566:2: iv_ruleHealthDepleted= ruleHealthDepleted EOF
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
    // InternalRangoMode.g:3572:1: ruleHealthDepleted returns [EObject current=null] : ( () otherlv_1= 'health' otherlv_2= 'depleted' ) ;
    public final EObject ruleHealthDepleted() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3578:2: ( ( () otherlv_1= 'health' otherlv_2= 'depleted' ) )
            // InternalRangoMode.g:3579:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            {
            // InternalRangoMode.g:3579:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            // InternalRangoMode.g:3580:3: () otherlv_1= 'health' otherlv_2= 'depleted'
            {
            // InternalRangoMode.g:3580:3: ()
            // InternalRangoMode.g:3581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthDepletedAccess().getHealthKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEnemiesAlive"
    // InternalRangoMode.g:3599:1: entryRuleEnemiesAlive returns [EObject current=null] : iv_ruleEnemiesAlive= ruleEnemiesAlive EOF ;
    public final EObject entryRuleEnemiesAlive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemiesAlive = null;


        try {
            // InternalRangoMode.g:3599:53: (iv_ruleEnemiesAlive= ruleEnemiesAlive EOF )
            // InternalRangoMode.g:3600:2: iv_ruleEnemiesAlive= ruleEnemiesAlive EOF
            {
             newCompositeNode(grammarAccess.getEnemiesAliveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnemiesAlive=ruleEnemiesAlive();

            state._fsp--;

             current =iv_ruleEnemiesAlive; 
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
    // $ANTLR end "entryRuleEnemiesAlive"


    // $ANTLR start "ruleEnemiesAlive"
    // InternalRangoMode.g:3606:1: ruleEnemiesAlive returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' ) ;
    public final EObject ruleEnemiesAlive() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3612:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' ) )
            // InternalRangoMode.g:3613:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' )
            {
            // InternalRangoMode.g:3613:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' )
            // InternalRangoMode.g:3614:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive'
            {
            // InternalRangoMode.g:3614:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3615:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3615:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3616:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_72); 

            					newLeafNode(lv_count_0_0, grammarAccess.getEnemiesAliveAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemiesAliveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,86,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getEnemiesAliveAccess().getEnemiesKeyword_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnemiesAliveAccess().getAliveKeyword_2());
            		

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
    // $ANTLR end "ruleEnemiesAlive"


    // $ANTLR start "entryRuleDecimal"
    // InternalRangoMode.g:3644:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalRangoMode.g:3644:47: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalRangoMode.g:3645:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalRangoMode.g:3651:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3657:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalRangoMode.g:3658:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalRangoMode.g:3658:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalRangoMode.g:3659:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_80); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
            		
            // InternalRangoMode.g:3666:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==95) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:3667:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,95,FOLLOW_10); 

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
    // InternalRangoMode.g:3684:1: ruleTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) ) ;
    public final Enumerator ruleTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3690:2: ( ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) ) )
            // InternalRangoMode.g:3691:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) )
            {
            // InternalRangoMode.g:3691:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt41=1;
                }
                break;
            case 86:
                {
                alt41=2;
                }
                break;
            case 41:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:3692:3: (enumLiteral_0= 'everything' )
                    {
                    // InternalRangoMode.g:3692:3: (enumLiteral_0= 'everything' )
                    // InternalRangoMode.g:3693:4: enumLiteral_0= 'everything'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3700:3: (enumLiteral_1= 'enemies' )
                    {
                    // InternalRangoMode.g:3700:3: (enumLiteral_1= 'enemies' )
                    // InternalRangoMode.g:3701:4: enumLiteral_1= 'enemies'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3708:3: (enumLiteral_2= 'player' )
                    {
                    // InternalRangoMode.g:3708:3: (enumLiteral_2= 'player' )
                    // InternalRangoMode.g:3709:4: enumLiteral_2= 'player'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalRangoMode.g:3719:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3725:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRangoMode.g:3726:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRangoMode.g:3726:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==97) ) {
                alt42=1;
            }
            else if ( (LA42_0==98) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:3727:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRangoMode.g:3727:3: (enumLiteral_0= 'left' )
                    // InternalRangoMode.g:3728:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3735:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRangoMode.g:3735:3: (enumLiteral_1= 'right' )
                    // InternalRangoMode.g:3736:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

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


    protected DFA39 dfa39 = new DFA39(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\3\uffff\1\115\1\uffff\1\133\3\uffff";
    static final String dfa_3s = "\1\132\3\uffff\1\126\1\uffff\1\136\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff\1\5\1\7\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\44\uffff\1\5\51\uffff\1\1\2\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "\1\7\10\uffff\1\6",
            "",
            "\1\11\2\uffff\1\10",
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

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3275:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001034000001022L,0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001034000001002L,0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000011C0020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000EC0000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000EC0001020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000FC0001020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1004000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0048000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000040L,0x0000000005200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0900000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xC000020001000000L,0x0000000000000910L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000910L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000000000L,0x0000000100400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000001000050L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000001000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000002000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});

}
