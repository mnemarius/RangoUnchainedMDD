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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'edition'", "'difficulty'", "'{'", "'}'", "'*'", "'enemy'", "'sprite'", "'scale'", "'bounce'", "'speed'", "'points'", "'on'", "'pop'", "':'", "'contact'", "','", "'vanish'", "'split'", "'into'", "'launched'", "'at'", "'damage'", "'heal'", "'shield'", "'for'", "'s'", "'poison'", "'every'", "'powerup'", "'gives'", "'player'", "'character'", "'health'", "'max'", "'tongue'", "'cooldown'", "'grace'", "'mode'", "'description'", "'gravity'", "'win'", "'when'", "'or'", "'lose'", "'level'", "'bonus'", "'up'", "'to'", "'times'", "'over'", "'arena'", "'background'", "'starts'", "'%'", "'('", "')'", "'block'", "'size'", "'by'", "'jumppad'", "'launch'", "'affects'", "'teleporter'", "'layout'", "'waves'", "'looping'", "'escalate'", "'wave'", "'after'", "'moving'", "'drops'", "'weight'", "'all'", "'enemies'", "'cleared'", "'time'", "'reaches'", "'score'", "'popped'", "'survived'", "'depleted'", "'alive'", "'.'", "'easy'", "'medium'", "'hard'", "'enemy.speed'", "'enemy.points'", "'player.health'", "'player.speed'", "'drop.chance'", "'wave.delay'", "'everything'", "'left'", "'right'"
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
    // InternalRangoMode.g:72:1: ruleEdition returns [EObject current=null] : (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )* ) ;
    public final EObject ruleEdition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_enemyTypes_3_0 = null;

        EObject lv_powerUps_4_0 = null;

        EObject lv_players_5_0 = null;

        EObject this_Drops_6 = null;

        EObject lv_difficulties_7_0 = null;

        EObject lv_modes_8_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:78:2: ( (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )* ) )
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            {
            // InternalRangoMode.g:79:2: (otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )* )
            // InternalRangoMode.g:80:3: otherlv_0= 'edition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) )? ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )*
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

            // InternalRangoMode.g:120:3: ( ( (lv_enemyTypes_3_0= ruleEnemyType ) ) | ( (lv_powerUps_4_0= rulePowerUp ) ) | ( (lv_players_5_0= rulePlayerProfile ) ) | this_Drops_6= ruleDrops[$current] | ( (lv_difficulties_7_0= ruleDifficulty ) ) | ( (lv_modes_8_0= ruleGameMode ) ) )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case 16:
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
                case 81:
                    {
                    alt2=4;
                    }
                    break;
                case 12:
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
            	    // InternalRangoMode.g:161:4: ( (lv_players_5_0= rulePlayerProfile ) )
            	    {
            	    // InternalRangoMode.g:161:4: ( (lv_players_5_0= rulePlayerProfile ) )
            	    // InternalRangoMode.g:162:5: (lv_players_5_0= rulePlayerProfile )
            	    {
            	    // InternalRangoMode.g:162:5: (lv_players_5_0= rulePlayerProfile )
            	    // InternalRangoMode.g:163:6: lv_players_5_0= rulePlayerProfile
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getPlayersPlayerProfileParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_players_5_0=rulePlayerProfile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"players",
            	    							lv_players_5_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.PlayerProfile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRangoMode.g:181:4: this_Drops_6= ruleDrops[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getEditionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getEditionAccess().getDropsParserRuleCall_3_3());
            	    			
            	    pushFollow(FOLLOW_5);
            	    this_Drops_6=ruleDrops(current);

            	    state._fsp--;


            	    				current = this_Drops_6;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalRangoMode.g:193:4: ( (lv_difficulties_7_0= ruleDifficulty ) )
            	    {
            	    // InternalRangoMode.g:193:4: ( (lv_difficulties_7_0= ruleDifficulty ) )
            	    // InternalRangoMode.g:194:5: (lv_difficulties_7_0= ruleDifficulty )
            	    {
            	    // InternalRangoMode.g:194:5: (lv_difficulties_7_0= ruleDifficulty )
            	    // InternalRangoMode.g:195:6: lv_difficulties_7_0= ruleDifficulty
            	    {

            	    						newCompositeNode(grammarAccess.getEditionAccess().getDifficultiesDifficultyParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_difficulties_7_0=ruleDifficulty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"difficulties",
            	    							lv_difficulties_7_0,
            	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Difficulty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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


    // $ANTLR start "entryRuleDifficulty"
    // InternalRangoMode.g:237:1: entryRuleDifficulty returns [EObject current=null] : iv_ruleDifficulty= ruleDifficulty EOF ;
    public final EObject entryRuleDifficulty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifficulty = null;


        try {
            // InternalRangoMode.g:237:51: (iv_ruleDifficulty= ruleDifficulty EOF )
            // InternalRangoMode.g:238:2: iv_ruleDifficulty= ruleDifficulty EOF
            {
             newCompositeNode(grammarAccess.getDifficultyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifficulty=ruleDifficulty();

            state._fsp--;

             current =iv_ruleDifficulty; 
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
    // $ANTLR end "entryRuleDifficulty"


    // $ANTLR start "ruleDifficulty"
    // InternalRangoMode.g:244:1: ruleDifficulty returns [EObject current=null] : (otherlv_0= 'difficulty' ( (lv_tier_1_0= ruleDifficultyTier ) ) otherlv_2= '{' ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= '}' ) ;
    public final EObject ruleDifficulty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_tier_1_0 = null;

        EObject lv_modifiers_3_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:250:2: ( (otherlv_0= 'difficulty' ( (lv_tier_1_0= ruleDifficultyTier ) ) otherlv_2= '{' ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= '}' ) )
            // InternalRangoMode.g:251:2: (otherlv_0= 'difficulty' ( (lv_tier_1_0= ruleDifficultyTier ) ) otherlv_2= '{' ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= '}' )
            {
            // InternalRangoMode.g:251:2: (otherlv_0= 'difficulty' ( (lv_tier_1_0= ruleDifficultyTier ) ) otherlv_2= '{' ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= '}' )
            // InternalRangoMode.g:252:3: otherlv_0= 'difficulty' ( (lv_tier_1_0= ruleDifficultyTier ) ) otherlv_2= '{' ( (lv_modifiers_3_0= ruleModifier ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDifficultyAccess().getDifficultyKeyword_0());
            		
            // InternalRangoMode.g:256:3: ( (lv_tier_1_0= ruleDifficultyTier ) )
            // InternalRangoMode.g:257:4: (lv_tier_1_0= ruleDifficultyTier )
            {
            // InternalRangoMode.g:257:4: (lv_tier_1_0= ruleDifficultyTier )
            // InternalRangoMode.g:258:5: lv_tier_1_0= ruleDifficultyTier
            {

            					newCompositeNode(grammarAccess.getDifficultyAccess().getTierDifficultyTierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_tier_1_0=ruleDifficultyTier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDifficultyRule());
            					}
            					set(
            						current,
            						"tier",
            						lv_tier_1_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.DifficultyTier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDifficultyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:279:3: ( (lv_modifiers_3_0= ruleModifier ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=97 && LA3_0<=102)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRangoMode.g:280:4: (lv_modifiers_3_0= ruleModifier )
            	    {
            	    // InternalRangoMode.g:280:4: (lv_modifiers_3_0= ruleModifier )
            	    // InternalRangoMode.g:281:5: lv_modifiers_3_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getDifficultyAccess().getModifiersModifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_modifiers_3_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDifficultyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_3_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDifficultyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDifficulty"


    // $ANTLR start "entryRuleModifier"
    // InternalRangoMode.g:306:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalRangoMode.g:306:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalRangoMode.g:307:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalRangoMode.g:313:1: ruleModifier returns [EObject current=null] : ( ( (lv_target_0_0= ruleModifierTarget ) ) otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_target_0_0 = null;

        AntlrDatatypeRuleToken lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:319:2: ( ( ( (lv_target_0_0= ruleModifierTarget ) ) otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) ) )
            // InternalRangoMode.g:320:2: ( ( (lv_target_0_0= ruleModifierTarget ) ) otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) )
            {
            // InternalRangoMode.g:320:2: ( ( (lv_target_0_0= ruleModifierTarget ) ) otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) )
            // InternalRangoMode.g:321:3: ( (lv_target_0_0= ruleModifierTarget ) ) otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) )
            {
            // InternalRangoMode.g:321:3: ( (lv_target_0_0= ruleModifierTarget ) )
            // InternalRangoMode.g:322:4: (lv_target_0_0= ruleModifierTarget )
            {
            // InternalRangoMode.g:322:4: (lv_target_0_0= ruleModifierTarget )
            // InternalRangoMode.g:323:5: lv_target_0_0= ruleModifierTarget
            {

            					newCompositeNode(grammarAccess.getModifierAccess().getTargetModifierTargetEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_target_0_0=ruleModifierTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifierRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.ModifierTarget");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getModifierAccess().getAsteriskKeyword_1());
            		
            // InternalRangoMode.g:344:3: ( (lv_factor_2_0= ruleDecimal ) )
            // InternalRangoMode.g:345:4: (lv_factor_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:345:4: (lv_factor_2_0= ruleDecimal )
            // InternalRangoMode.g:346:5: lv_factor_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getModifierAccess().getFactorDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_2_0=ruleDecimal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifierRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_2_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleEnemyType"
    // InternalRangoMode.g:367:1: entryRuleEnemyType returns [EObject current=null] : iv_ruleEnemyType= ruleEnemyType EOF ;
    public final EObject entryRuleEnemyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemyType = null;


        try {
            // InternalRangoMode.g:367:50: (iv_ruleEnemyType= ruleEnemyType EOF )
            // InternalRangoMode.g:368:2: iv_ruleEnemyType= ruleEnemyType EOF
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
    // InternalRangoMode.g:374:1: ruleEnemyType returns [EObject current=null] : (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) ;
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
            // InternalRangoMode.g:380:2: ( (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' ) )
            // InternalRangoMode.g:381:2: (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            {
            // InternalRangoMode.g:381:2: (otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}' )
            // InternalRangoMode.g:382:3: otherlv_0= 'enemy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_14= 'on' otherlv_15= 'pop' otherlv_16= ':' ( (lv_splitRule_17_0= ruleSplitRule ) ) otherlv_18= 'on' otherlv_19= 'contact' otherlv_20= ':' ( (lv_contactEffects_21_0= rulePlayerEffect ) ) (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnemyTypeAccess().getEnemyKeyword_0());
            		
            // InternalRangoMode.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:387:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnemyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:408:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRangoMode.g:409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRangoMode.g:409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalRangoMode.g:410:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            				
            // InternalRangoMode.g:413:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalRangoMode.g:414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalRangoMode.g:414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=6;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt4=4;
                }
                else if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt4=5;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRangoMode.g:415:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:415:4: ({...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRangoMode.g:416:5: {...}? => ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalRangoMode.g:416:106: ( ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRangoMode.g:417:6: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalRangoMode.g:420:9: ({...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) ) )
            	    // InternalRangoMode.g:420:10: {...}? => (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:420:19: (otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) ) )
            	    // InternalRangoMode.g:420:20: otherlv_4= 'sprite' ( (lv_sprite_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnemyTypeAccess().getSpriteKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:424:9: ( (lv_sprite_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:425:10: (lv_sprite_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:425:10: (lv_sprite_5_0= RULE_STRING )
            	    // InternalRangoMode.g:426:11: lv_sprite_5_0= RULE_STRING
            	    {
            	    lv_sprite_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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
            	    // InternalRangoMode.g:448:4: ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:448:4: ({...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:449:5: {...}? => ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalRangoMode.g:449:106: ( ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:450:6: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalRangoMode.g:453:9: ({...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:453:10: {...}? => (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:453:19: (otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:453:20: otherlv_6= 'scale' ( (lv_scale_7_0= ruleDecimal ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnemyTypeAccess().getScaleKeyword_3_1_0());
            	    								
            	    // InternalRangoMode.g:457:9: ( (lv_scale_7_0= ruleDecimal ) )
            	    // InternalRangoMode.g:458:10: (lv_scale_7_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:458:10: (lv_scale_7_0= ruleDecimal )
            	    // InternalRangoMode.g:459:11: lv_scale_7_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getScaleDecimalParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
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
            	    // InternalRangoMode.g:482:4: ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:482:4: ({...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:483:5: {...}? => ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalRangoMode.g:483:106: ( ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:484:6: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalRangoMode.g:487:9: ({...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:487:10: {...}? => (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:487:19: (otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:487:20: otherlv_8= 'bounce' ( (lv_bounce_9_0= ruleDecimal ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEnemyTypeAccess().getBounceKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:491:9: ( (lv_bounce_9_0= ruleDecimal ) )
            	    // InternalRangoMode.g:492:10: (lv_bounce_9_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:492:10: (lv_bounce_9_0= ruleDecimal )
            	    // InternalRangoMode.g:493:11: lv_bounce_9_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getBounceDecimalParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
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
            	    // InternalRangoMode.g:516:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:516:4: ({...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) ) )
            	    // InternalRangoMode.g:517:5: {...}? => ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalRangoMode.g:517:106: ( ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) ) )
            	    // InternalRangoMode.g:518:6: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalRangoMode.g:521:9: ({...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) ) )
            	    // InternalRangoMode.g:521:10: {...}? => (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:521:19: (otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) ) )
            	    // InternalRangoMode.g:521:20: otherlv_10= 'speed' ( (lv_speed_11_0= ruleDecimal ) )
            	    {
            	    otherlv_10=(Token)match(input,20,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEnemyTypeAccess().getSpeedKeyword_3_3_0());
            	    								
            	    // InternalRangoMode.g:525:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:526:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:526:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:527:11: lv_speed_11_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getEnemyTypeAccess().getSpeedDecimalParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
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
            	    // InternalRangoMode.g:550:4: ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalRangoMode.g:550:4: ({...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalRangoMode.g:551:5: {...}? => ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalRangoMode.g:551:106: ( ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) ) )
            	    // InternalRangoMode.g:552:6: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalRangoMode.g:555:9: ({...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) ) )
            	    // InternalRangoMode.g:555:10: {...}? => (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnemyType", "true");
            	    }
            	    // InternalRangoMode.g:555:19: (otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) ) )
            	    // InternalRangoMode.g:555:20: otherlv_12= 'points' ( (lv_points_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getEnemyTypeAccess().getPointsKeyword_3_4_0());
            	    								
            	    // InternalRangoMode.g:559:9: ( (lv_points_13_0= RULE_INT ) )
            	    // InternalRangoMode.g:560:10: (lv_points_13_0= RULE_INT )
            	    {
            	    // InternalRangoMode.g:560:10: (lv_points_13_0= RULE_INT )
            	    // InternalRangoMode.g:561:11: lv_points_13_0= RULE_INT
            	    {
            	    lv_points_13_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEnemyType", "getUnorderedGroupHelper().canLeave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnemyTypeAccess().getUnorderedGroup_3());
            				

            }

            otherlv_14=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getEnemyTypeAccess().getOnKeyword_4());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getEnemyTypeAccess().getPopKeyword_5());
            		
            otherlv_16=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_16, grammarAccess.getEnemyTypeAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:603:3: ( (lv_splitRule_17_0= ruleSplitRule ) )
            // InternalRangoMode.g:604:4: (lv_splitRule_17_0= ruleSplitRule )
            {
            // InternalRangoMode.g:604:4: (lv_splitRule_17_0= ruleSplitRule )
            // InternalRangoMode.g:605:5: lv_splitRule_17_0= ruleSplitRule
            {

            					newCompositeNode(grammarAccess.getEnemyTypeAccess().getSplitRuleSplitRuleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_18=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getEnemyTypeAccess().getOnKeyword_8());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_19, grammarAccess.getEnemyTypeAccess().getContactKeyword_9());
            		
            otherlv_20=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_20, grammarAccess.getEnemyTypeAccess().getColonKeyword_10());
            		
            // InternalRangoMode.g:634:3: ( (lv_contactEffects_21_0= rulePlayerEffect ) )
            // InternalRangoMode.g:635:4: (lv_contactEffects_21_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:635:4: (lv_contactEffects_21_0= rulePlayerEffect )
            // InternalRangoMode.g:636:5: lv_contactEffects_21_0= rulePlayerEffect
            {

            					newCompositeNode(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalRangoMode.g:653:3: (otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRangoMode.g:654:4: otherlv_22= ',' ( (lv_contactEffects_23_0= rulePlayerEffect ) )
            	    {
            	    otherlv_22=(Token)match(input,26,FOLLOW_19); 

            	    				newLeafNode(otherlv_22, grammarAccess.getEnemyTypeAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRangoMode.g:658:4: ( (lv_contactEffects_23_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:659:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:659:5: (lv_contactEffects_23_0= rulePlayerEffect )
            	    // InternalRangoMode.g:660:6: lv_contactEffects_23_0= rulePlayerEffect
            	    {

            	    						newCompositeNode(grammarAccess.getEnemyTypeAccess().getContactEffectsPlayerEffectParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop5;
                }
            } while (true);

            otherlv_24=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:686:1: entryRuleSplitRule returns [EObject current=null] : iv_ruleSplitRule= ruleSplitRule EOF ;
    public final EObject entryRuleSplitRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitRule = null;


        try {
            // InternalRangoMode.g:686:50: (iv_ruleSplitRule= ruleSplitRule EOF )
            // InternalRangoMode.g:687:2: iv_ruleSplitRule= ruleSplitRule EOF
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
    // InternalRangoMode.g:693:1: ruleSplitRule returns [EObject current=null] : (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit ) ;
    public final EObject ruleSplitRule() throws RecognitionException {
        EObject current = null;

        EObject this_Vanish_0 = null;

        EObject this_Split_1 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:699:2: ( (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit ) )
            // InternalRangoMode.g:700:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit )
            {
            // InternalRangoMode.g:700:2: (this_Vanish_0= ruleVanish | this_Split_1= ruleSplit )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRangoMode.g:701:3: this_Vanish_0= ruleVanish
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
                    // InternalRangoMode.g:710:3: this_Split_1= ruleSplit
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
    // InternalRangoMode.g:722:1: entryRuleVanish returns [EObject current=null] : iv_ruleVanish= ruleVanish EOF ;
    public final EObject entryRuleVanish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVanish = null;


        try {
            // InternalRangoMode.g:722:47: (iv_ruleVanish= ruleVanish EOF )
            // InternalRangoMode.g:723:2: iv_ruleVanish= ruleVanish EOF
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
    // InternalRangoMode.g:729:1: ruleVanish returns [EObject current=null] : ( () otherlv_1= 'vanish' ) ;
    public final EObject ruleVanish() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:735:2: ( ( () otherlv_1= 'vanish' ) )
            // InternalRangoMode.g:736:2: ( () otherlv_1= 'vanish' )
            {
            // InternalRangoMode.g:736:2: ( () otherlv_1= 'vanish' )
            // InternalRangoMode.g:737:3: () otherlv_1= 'vanish'
            {
            // InternalRangoMode.g:737:3: ()
            // InternalRangoMode.g:738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVanishAccess().getVanishAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

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
    // InternalRangoMode.g:752:1: entryRuleSplit returns [EObject current=null] : iv_ruleSplit= ruleSplit EOF ;
    public final EObject entryRuleSplit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplit = null;


        try {
            // InternalRangoMode.g:752:46: (iv_ruleSplit= ruleSplit EOF )
            // InternalRangoMode.g:753:2: iv_ruleSplit= ruleSplit EOF
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
    // InternalRangoMode.g:759:1: ruleSplit returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) ;
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
            // InternalRangoMode.g:765:2: ( (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? ) )
            // InternalRangoMode.g:766:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            {
            // InternalRangoMode.g:766:2: (otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )? )
            // InternalRangoMode.g:767:3: otherlv_0= 'split' otherlv_1= 'into' ( (lv_fragments_2_0= RULE_INT ) ) ( (otherlv_3= RULE_ID ) )? (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitAccess().getIntoKeyword_1());
            		
            // InternalRangoMode.g:775:3: ( (lv_fragments_2_0= RULE_INT ) )
            // InternalRangoMode.g:776:4: (lv_fragments_2_0= RULE_INT )
            {
            // InternalRangoMode.g:776:4: (lv_fragments_2_0= RULE_INT )
            // InternalRangoMode.g:777:5: lv_fragments_2_0= RULE_INT
            {
            lv_fragments_2_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

            // InternalRangoMode.g:793:3: ( (otherlv_3= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRangoMode.g:794:4: (otherlv_3= RULE_ID )
                    {
                    // InternalRangoMode.g:794:4: (otherlv_3= RULE_ID )
                    // InternalRangoMode.g:795:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    					newLeafNode(otherlv_3, grammarAccess.getSplitAccess().getFragmentTypeEnemyTypeCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalRangoMode.g:806:3: (otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRangoMode.g:807:4: otherlv_4= 'launched' otherlv_5= 'at' ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getSplitAccess().getLaunchedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitAccess().getAtKeyword_4_1());
                    			
                    // InternalRangoMode.g:815:4: ( (lv_launchSpeed_6_0= ruleDecimal ) )
                    // InternalRangoMode.g:816:5: (lv_launchSpeed_6_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:816:5: (lv_launchSpeed_6_0= ruleDecimal )
                    // InternalRangoMode.g:817:6: lv_launchSpeed_6_0= ruleDecimal
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
    // InternalRangoMode.g:839:1: entryRulePlayerEffect returns [EObject current=null] : iv_rulePlayerEffect= rulePlayerEffect EOF ;
    public final EObject entryRulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerEffect = null;


        try {
            // InternalRangoMode.g:839:53: (iv_rulePlayerEffect= rulePlayerEffect EOF )
            // InternalRangoMode.g:840:2: iv_rulePlayerEffect= rulePlayerEffect EOF
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
    // InternalRangoMode.g:846:1: rulePlayerEffect returns [EObject current=null] : (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) ;
    public final EObject rulePlayerEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Damage_0 = null;

        EObject this_Heal_1 = null;

        EObject this_Shield_2 = null;

        EObject this_SpeedChange_3 = null;

        EObject this_Poison_4 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:852:2: ( (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison ) )
            // InternalRangoMode.g:853:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            {
            // InternalRangoMode.g:853:2: (this_Damage_0= ruleDamage | this_Heal_1= ruleHeal | this_Shield_2= ruleShield | this_SpeedChange_3= ruleSpeedChange | this_Poison_4= rulePoison )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            case 37:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRangoMode.g:854:3: this_Damage_0= ruleDamage
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
                    // InternalRangoMode.g:863:3: this_Heal_1= ruleHeal
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
                    // InternalRangoMode.g:872:3: this_Shield_2= ruleShield
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
                    // InternalRangoMode.g:881:3: this_SpeedChange_3= ruleSpeedChange
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
                    // InternalRangoMode.g:890:3: this_Poison_4= rulePoison
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
    // InternalRangoMode.g:902:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalRangoMode.g:902:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalRangoMode.g:903:2: iv_ruleDamage= ruleDamage EOF
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
    // InternalRangoMode.g:909:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:915:2: ( (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:916:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:916:2: (otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:917:3: otherlv_0= 'damage' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getDamageKeyword_0());
            		
            // InternalRangoMode.g:921:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:922:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:922:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:923:5: lv_amount_1_0= RULE_INT
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
    // InternalRangoMode.g:943:1: entryRuleHeal returns [EObject current=null] : iv_ruleHeal= ruleHeal EOF ;
    public final EObject entryRuleHeal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeal = null;


        try {
            // InternalRangoMode.g:943:45: (iv_ruleHeal= ruleHeal EOF )
            // InternalRangoMode.g:944:2: iv_ruleHeal= ruleHeal EOF
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
    // InternalRangoMode.g:950:1: ruleHeal returns [EObject current=null] : (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHeal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:956:2: ( (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:957:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:957:2: (otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalRangoMode.g:958:3: otherlv_0= 'heal' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHealAccess().getHealKeyword_0());
            		
            // InternalRangoMode.g:962:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:963:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:963:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:964:5: lv_amount_1_0= RULE_INT
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
    // InternalRangoMode.g:984:1: entryRuleShield returns [EObject current=null] : iv_ruleShield= ruleShield EOF ;
    public final EObject entryRuleShield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShield = null;


        try {
            // InternalRangoMode.g:984:47: (iv_ruleShield= ruleShield EOF )
            // InternalRangoMode.g:985:2: iv_ruleShield= ruleShield EOF
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
    // InternalRangoMode.g:991:1: ruleShield returns [EObject current=null] : (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleShield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:997:2: ( (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:998:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:998:2: (otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:999:3: otherlv_0= 'shield' otherlv_1= 'for' ( (lv_duration_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getShieldAccess().getShieldKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getShieldAccess().getForKeyword_1());
            		
            // InternalRangoMode.g:1007:3: ( (lv_duration_2_0= ruleDecimal ) )
            // InternalRangoMode.g:1008:4: (lv_duration_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:1008:4: (lv_duration_2_0= ruleDecimal )
            // InternalRangoMode.g:1009:5: lv_duration_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getShieldAccess().getDurationDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRangoMode.g:1034:1: entryRuleSpeedChange returns [EObject current=null] : iv_ruleSpeedChange= ruleSpeedChange EOF ;
    public final EObject entryRuleSpeedChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedChange = null;


        try {
            // InternalRangoMode.g:1034:52: (iv_ruleSpeedChange= ruleSpeedChange EOF )
            // InternalRangoMode.g:1035:2: iv_ruleSpeedChange= ruleSpeedChange EOF
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
    // InternalRangoMode.g:1041:1: ruleSpeedChange returns [EObject current=null] : (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) ;
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
            // InternalRangoMode.g:1047:2: ( (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' ) )
            // InternalRangoMode.g:1048:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            {
            // InternalRangoMode.g:1048:2: (otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's' )
            // InternalRangoMode.g:1049:3: otherlv_0= 'speed' otherlv_1= '*' ( (lv_factor_2_0= ruleDecimal ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleDecimal ) ) otherlv_5= 's'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpeedChangeAccess().getSpeedKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedChangeAccess().getAsteriskKeyword_1());
            		
            // InternalRangoMode.g:1057:3: ( (lv_factor_2_0= ruleDecimal ) )
            // InternalRangoMode.g:1058:4: (lv_factor_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:1058:4: (lv_factor_2_0= ruleDecimal )
            // InternalRangoMode.g:1059:5: lv_factor_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getSpeedChangeAccess().getFactorDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSpeedChangeAccess().getForKeyword_3());
            		
            // InternalRangoMode.g:1080:3: ( (lv_duration_4_0= ruleDecimal ) )
            // InternalRangoMode.g:1081:4: (lv_duration_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:1081:4: (lv_duration_4_0= ruleDecimal )
            // InternalRangoMode.g:1082:5: lv_duration_4_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getSpeedChangeAccess().getDurationDecimalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRangoMode.g:1107:1: entryRulePoison returns [EObject current=null] : iv_rulePoison= rulePoison EOF ;
    public final EObject entryRulePoison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoison = null;


        try {
            // InternalRangoMode.g:1107:47: (iv_rulePoison= rulePoison EOF )
            // InternalRangoMode.g:1108:2: iv_rulePoison= rulePoison EOF
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
    // InternalRangoMode.g:1114:1: rulePoison returns [EObject current=null] : (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) ;
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
            // InternalRangoMode.g:1120:2: ( (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' ) )
            // InternalRangoMode.g:1121:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            {
            // InternalRangoMode.g:1121:2: (otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's' )
            // InternalRangoMode.g:1122:3: otherlv_0= 'poison' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'every' ( (lv_interval_3_0= ruleDecimal ) ) otherlv_4= 's' otherlv_5= 'for' ( (lv_duration_6_0= ruleDecimal ) ) otherlv_7= 's'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPoisonAccess().getPoisonKeyword_0());
            		
            // InternalRangoMode.g:1126:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalRangoMode.g:1127:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalRangoMode.g:1127:4: (lv_amount_1_0= RULE_INT )
            // InternalRangoMode.g:1128:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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
            		
            // InternalRangoMode.g:1148:3: ( (lv_interval_3_0= ruleDecimal ) )
            // InternalRangoMode.g:1149:4: (lv_interval_3_0= ruleDecimal )
            {
            // InternalRangoMode.g:1149:4: (lv_interval_3_0= ruleDecimal )
            // InternalRangoMode.g:1150:5: lv_interval_3_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getPoisonAccess().getIntervalDecimalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getPoisonAccess().getSKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPoisonAccess().getForKeyword_5());
            		
            // InternalRangoMode.g:1175:3: ( (lv_duration_6_0= ruleDecimal ) )
            // InternalRangoMode.g:1176:4: (lv_duration_6_0= ruleDecimal )
            {
            // InternalRangoMode.g:1176:4: (lv_duration_6_0= ruleDecimal )
            // InternalRangoMode.g:1177:5: lv_duration_6_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getPoisonAccess().getDurationDecimalParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRangoMode.g:1202:1: entryRulePowerUp returns [EObject current=null] : iv_rulePowerUp= rulePowerUp EOF ;
    public final EObject entryRulePowerUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerUp = null;


        try {
            // InternalRangoMode.g:1202:48: (iv_rulePowerUp= rulePowerUp EOF )
            // InternalRangoMode.g:1203:2: iv_rulePowerUp= rulePowerUp EOF
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
    // InternalRangoMode.g:1209:1: rulePowerUp returns [EObject current=null] : (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) ;
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
            // InternalRangoMode.g:1215:2: ( (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' ) )
            // InternalRangoMode.g:1216:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            {
            // InternalRangoMode.g:1216:2: (otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}' )
            // InternalRangoMode.g:1217:3: otherlv_0= 'powerup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'sprite' ( (lv_sprite_4_0= RULE_STRING ) ) otherlv_5= 'gives' otherlv_6= ':' ( (lv_effects_7_0= rulePlayerEffect ) ) (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerUpAccess().getPowerupKeyword_0());
            		
            // InternalRangoMode.g:1221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1222:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getPowerUpAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerUpAccess().getSpriteKeyword_3());
            		
            // InternalRangoMode.g:1247:3: ( (lv_sprite_4_0= RULE_STRING ) )
            // InternalRangoMode.g:1248:4: (lv_sprite_4_0= RULE_STRING )
            {
            // InternalRangoMode.g:1248:4: (lv_sprite_4_0= RULE_STRING )
            // InternalRangoMode.g:1249:5: lv_sprite_4_0= RULE_STRING
            {
            lv_sprite_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_5=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerUpAccess().getGivesKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getPowerUpAccess().getColonKeyword_6());
            		
            // InternalRangoMode.g:1273:3: ( (lv_effects_7_0= rulePlayerEffect ) )
            // InternalRangoMode.g:1274:4: (lv_effects_7_0= rulePlayerEffect )
            {
            // InternalRangoMode.g:1274:4: (lv_effects_7_0= rulePlayerEffect )
            // InternalRangoMode.g:1275:5: lv_effects_7_0= rulePlayerEffect
            {

            					newCompositeNode(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalRangoMode.g:1292:3: (otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRangoMode.g:1293:4: otherlv_8= ',' ( (lv_effects_9_0= rulePlayerEffect ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_19); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPowerUpAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalRangoMode.g:1297:4: ( (lv_effects_9_0= rulePlayerEffect ) )
            	    // InternalRangoMode.g:1298:5: (lv_effects_9_0= rulePlayerEffect )
            	    {
            	    // InternalRangoMode.g:1298:5: (lv_effects_9_0= rulePlayerEffect )
            	    // InternalRangoMode.g:1299:6: lv_effects_9_0= rulePlayerEffect
            	    {

            	    						newCompositeNode(grammarAccess.getPowerUpAccess().getEffectsPlayerEffectParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_30); 

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
                else if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayerProfileAccess().getUnorderedGroup_3(), 2) ) {
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
            	    otherlv_4=(Token)match(input,42,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPlayerProfileAccess().getCharacterKeyword_3_0_0());
            	    								
            	    // InternalRangoMode.g:1382:9: ( (lv_character_5_0= RULE_STRING ) )
            	    // InternalRangoMode.g:1383:10: (lv_character_5_0= RULE_STRING )
            	    {
            	    // InternalRangoMode.g:1383:10: (lv_character_5_0= RULE_STRING )
            	    // InternalRangoMode.g:1384:11: lv_character_5_0= RULE_STRING
            	    {
            	    lv_character_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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
            	    lv_health_7_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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
            	            lv_maxHealth_9_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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
            	    otherlv_10=(Token)match(input,20,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPlayerProfileAccess().getSpeedKeyword_3_2_0());
            	    								
            	    // InternalRangoMode.g:1472:9: ( (lv_speed_11_0= ruleDecimal ) )
            	    // InternalRangoMode.g:1473:10: (lv_speed_11_0= ruleDecimal )
            	    {
            	    // InternalRangoMode.g:1473:10: (lv_speed_11_0= ruleDecimal )
            	    // InternalRangoMode.g:1474:11: lv_speed_11_0= ruleDecimal
            	    {

            	    											newCompositeNode(grammarAccess.getPlayerProfileAccess().getSpeedDecimalParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
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
            	    										
            	    pushFollow(FOLLOW_26);
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

            	    otherlv_14=(Token)match(input,36,FOLLOW_31); 

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
            	    										
            	    pushFollow(FOLLOW_26);
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

            	    otherlv_17=(Token)match(input,36,FOLLOW_31); 

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
            	    										
            	    pushFollow(FOLLOW_26);
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

            	    otherlv_20=(Token)match(input,36,FOLLOW_31); 

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

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:1634:1: ruleGameMode returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) ;
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

        EObject lv_levels_12_0 = null;

        EObject lv_levels_13_0 = null;

        EObject this_Drops_14 = null;

        EObject lv_winConditions_17_0 = null;

        EObject lv_winConditions_19_0 = null;

        EObject lv_loseConditions_22_0 = null;

        EObject lv_loseConditions_24_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1640:2: ( (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' ) )
            // InternalRangoMode.g:1641:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            {
            // InternalRangoMode.g:1641:2: (otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}' )
            // InternalRangoMode.g:1642:3: otherlv_0= 'mode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'player' ( (otherlv_7= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'gravity' ( (lv_gravity_10_0= ruleDecimal ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_speedBonus_11_0= ruleSpeedBonus ) ) ) ) ) )* ) ) ) ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ ) (this_Drops_14= ruleDrops[$current] )? (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )? otherlv_20= 'lose' otherlv_21= 'when' ( (lv_loseConditions_22_0= ruleEndCondition ) ) (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameModeAccess().getModeKeyword_0());
            		
            // InternalRangoMode.g:1646:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:1647:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:1647:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:1648:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_33); 

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
                    otherlv_4=(Token)match(input,49,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getGameModeAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRangoMode.g:1691:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRangoMode.g:1692:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRangoMode.g:1692:5: (lv_description_5_0= RULE_STRING )
                    // InternalRangoMode.g:1693:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_35); 

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
                else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameModeAccess().getUnorderedGroup_7(), 1) ) {
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
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    									
            	    pushFollow(FOLLOW_35);
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

            // InternalRangoMode.g:1803:3: ( ( (lv_levels_12_0= ruleSingleLevel ) ) | ( (lv_levels_13_0= ruleLevel ) )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==61) ) {
                alt16=1;
            }
            else if ( (LA16_0==55) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRangoMode.g:1804:4: ( (lv_levels_12_0= ruleSingleLevel ) )
                    {
                    // InternalRangoMode.g:1804:4: ( (lv_levels_12_0= ruleSingleLevel ) )
                    // InternalRangoMode.g:1805:5: (lv_levels_12_0= ruleSingleLevel )
                    {
                    // InternalRangoMode.g:1805:5: (lv_levels_12_0= ruleSingleLevel )
                    // InternalRangoMode.g:1806:6: lv_levels_12_0= ruleSingleLevel
                    {

                    						newCompositeNode(grammarAccess.getGameModeAccess().getLevelsSingleLevelParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_levels_12_0=ruleSingleLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameModeRule());
                    						}
                    						add(
                    							current,
                    							"levels",
                    							lv_levels_12_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SingleLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:1824:4: ( (lv_levels_13_0= ruleLevel ) )+
                    {
                    // InternalRangoMode.g:1824:4: ( (lv_levels_13_0= ruleLevel ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==55) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRangoMode.g:1825:5: (lv_levels_13_0= ruleLevel )
                    	    {
                    	    // InternalRangoMode.g:1825:5: (lv_levels_13_0= ruleLevel )
                    	    // InternalRangoMode.g:1826:6: lv_levels_13_0= ruleLevel
                    	    {

                    	    						newCompositeNode(grammarAccess.getGameModeAccess().getLevelsLevelParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_levels_13_0=ruleLevel();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGameModeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"levels",
                    	    							lv_levels_13_0,
                    	    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Level");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            // InternalRangoMode.g:1844:3: (this_Drops_14= ruleDrops[$current] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==81) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRangoMode.g:1845:4: this_Drops_14= ruleDrops[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getGameModeRule());
                    				}
                    				newCompositeNode(grammarAccess.getGameModeAccess().getDropsParserRuleCall_9());
                    			
                    pushFollow(FOLLOW_38);
                    this_Drops_14=ruleDrops(current);

                    state._fsp--;


                    				current = this_Drops_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:1857:3: (otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRangoMode.g:1858:4: otherlv_15= 'win' otherlv_16= 'when' ( (lv_winConditions_17_0= ruleEndCondition ) ) (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_39); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameModeAccess().getWinKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,52,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getGameModeAccess().getWhenKeyword_10_1());
                    			
                    // InternalRangoMode.g:1866:4: ( (lv_winConditions_17_0= ruleEndCondition ) )
                    // InternalRangoMode.g:1867:5: (lv_winConditions_17_0= ruleEndCondition )
                    {
                    // InternalRangoMode.g:1867:5: (lv_winConditions_17_0= ruleEndCondition )
                    // InternalRangoMode.g:1868:6: lv_winConditions_17_0= ruleEndCondition
                    {

                    						newCompositeNode(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalRangoMode.g:1885:4: (otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==53) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRangoMode.g:1886:5: otherlv_18= 'or' ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    {
                    	    otherlv_18=(Token)match(input,53,FOLLOW_40); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGameModeAccess().getOrKeyword_10_3_0());
                    	    				
                    	    // InternalRangoMode.g:1890:5: ( (lv_winConditions_19_0= ruleEndCondition ) )
                    	    // InternalRangoMode.g:1891:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    {
                    	    // InternalRangoMode.g:1891:6: (lv_winConditions_19_0= ruleEndCondition )
                    	    // InternalRangoMode.g:1892:7: lv_winConditions_19_0= ruleEndCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameModeAccess().getWinConditionsEndConditionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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

            otherlv_20=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_20, grammarAccess.getGameModeAccess().getLoseKeyword_11());
            		
            otherlv_21=(Token)match(input,52,FOLLOW_40); 

            			newLeafNode(otherlv_21, grammarAccess.getGameModeAccess().getWhenKeyword_12());
            		
            // InternalRangoMode.g:1919:3: ( (lv_loseConditions_22_0= ruleEndCondition ) )
            // InternalRangoMode.g:1920:4: (lv_loseConditions_22_0= ruleEndCondition )
            {
            // InternalRangoMode.g:1920:4: (lv_loseConditions_22_0= ruleEndCondition )
            // InternalRangoMode.g:1921:5: lv_loseConditions_22_0= ruleEndCondition
            {

            					newCompositeNode(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalRangoMode.g:1938:3: (otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==53) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRangoMode.g:1939:4: otherlv_23= 'or' ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    {
            	    otherlv_23=(Token)match(input,53,FOLLOW_40); 

            	    				newLeafNode(otherlv_23, grammarAccess.getGameModeAccess().getOrKeyword_14_0());
            	    			
            	    // InternalRangoMode.g:1943:4: ( (lv_loseConditions_24_0= ruleEndCondition ) )
            	    // InternalRangoMode.g:1944:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    {
            	    // InternalRangoMode.g:1944:5: (lv_loseConditions_24_0= ruleEndCondition )
            	    // InternalRangoMode.g:1945:6: lv_loseConditions_24_0= ruleEndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getGameModeAccess().getLoseConditionsEndConditionParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
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

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getGameModeAccess().getRightCurlyBracketKeyword_15());
            		

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


    // $ANTLR start "entryRuleSingleLevel"
    // InternalRangoMode.g:1971:1: entryRuleSingleLevel returns [EObject current=null] : iv_ruleSingleLevel= ruleSingleLevel EOF ;
    public final EObject entryRuleSingleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleLevel = null;


        try {
            // InternalRangoMode.g:1971:52: (iv_ruleSingleLevel= ruleSingleLevel EOF )
            // InternalRangoMode.g:1972:2: iv_ruleSingleLevel= ruleSingleLevel EOF
            {
             newCompositeNode(grammarAccess.getSingleLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleLevel=ruleSingleLevel();

            state._fsp--;

             current =iv_ruleSingleLevel; 
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
    // $ANTLR end "entryRuleSingleLevel"


    // $ANTLR start "ruleSingleLevel"
    // InternalRangoMode.g:1978:1: ruleSingleLevel returns [EObject current=null] : ( ( (lv_arena_0_0= ruleArena ) ) ( (lv_spawning_1_0= ruleSpawnStrategy ) ) ) ;
    public final EObject ruleSingleLevel() throws RecognitionException {
        EObject current = null;

        EObject lv_arena_0_0 = null;

        EObject lv_spawning_1_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:1984:2: ( ( ( (lv_arena_0_0= ruleArena ) ) ( (lv_spawning_1_0= ruleSpawnStrategy ) ) ) )
            // InternalRangoMode.g:1985:2: ( ( (lv_arena_0_0= ruleArena ) ) ( (lv_spawning_1_0= ruleSpawnStrategy ) ) )
            {
            // InternalRangoMode.g:1985:2: ( ( (lv_arena_0_0= ruleArena ) ) ( (lv_spawning_1_0= ruleSpawnStrategy ) ) )
            // InternalRangoMode.g:1986:3: ( (lv_arena_0_0= ruleArena ) ) ( (lv_spawning_1_0= ruleSpawnStrategy ) )
            {
            // InternalRangoMode.g:1986:3: ( (lv_arena_0_0= ruleArena ) )
            // InternalRangoMode.g:1987:4: (lv_arena_0_0= ruleArena )
            {
            // InternalRangoMode.g:1987:4: (lv_arena_0_0= ruleArena )
            // InternalRangoMode.g:1988:5: lv_arena_0_0= ruleArena
            {

            					newCompositeNode(grammarAccess.getSingleLevelAccess().getArenaArenaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_arena_0_0=ruleArena();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleLevelRule());
            					}
            					set(
            						current,
            						"arena",
            						lv_arena_0_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Arena");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:2005:3: ( (lv_spawning_1_0= ruleSpawnStrategy ) )
            // InternalRangoMode.g:2006:4: (lv_spawning_1_0= ruleSpawnStrategy )
            {
            // InternalRangoMode.g:2006:4: (lv_spawning_1_0= ruleSpawnStrategy )
            // InternalRangoMode.g:2007:5: lv_spawning_1_0= ruleSpawnStrategy
            {

            					newCompositeNode(grammarAccess.getSingleLevelAccess().getSpawningSpawnStrategyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_spawning_1_0=ruleSpawnStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleLevelRule());
            					}
            					set(
            						current,
            						"spawning",
            						lv_spawning_1_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SpawnStrategy");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSingleLevel"


    // $ANTLR start "entryRuleLevel"
    // InternalRangoMode.g:2028:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // InternalRangoMode.g:2028:46: (iv_ruleLevel= ruleLevel EOF )
            // InternalRangoMode.g:2029:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalRangoMode.g:2035:1: ruleLevel returns [EObject current=null] : (otherlv_0= 'level' ( (lv_title_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_arena_3_0= ruleArena ) ) ( (lv_spawning_4_0= ruleSpawnStrategy ) ) otherlv_5= '}' ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_arena_3_0 = null;

        EObject lv_spawning_4_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2041:2: ( (otherlv_0= 'level' ( (lv_title_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_arena_3_0= ruleArena ) ) ( (lv_spawning_4_0= ruleSpawnStrategy ) ) otherlv_5= '}' ) )
            // InternalRangoMode.g:2042:2: (otherlv_0= 'level' ( (lv_title_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_arena_3_0= ruleArena ) ) ( (lv_spawning_4_0= ruleSpawnStrategy ) ) otherlv_5= '}' )
            {
            // InternalRangoMode.g:2042:2: (otherlv_0= 'level' ( (lv_title_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_arena_3_0= ruleArena ) ) ( (lv_spawning_4_0= ruleSpawnStrategy ) ) otherlv_5= '}' )
            // InternalRangoMode.g:2043:3: otherlv_0= 'level' ( (lv_title_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_arena_3_0= ruleArena ) ) ( (lv_spawning_4_0= ruleSpawnStrategy ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLevelKeyword_0());
            		
            // InternalRangoMode.g:2047:3: ( (lv_title_1_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRangoMode.g:2048:4: (lv_title_1_0= RULE_STRING )
                    {
                    // InternalRangoMode.g:2048:4: (lv_title_1_0= RULE_STRING )
                    // InternalRangoMode.g:2049:5: lv_title_1_0= RULE_STRING
                    {
                    lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    					newLeafNode(lv_title_1_0, grammarAccess.getLevelAccess().getTitleSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLevelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"title",
                    						lv_title_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:2069:3: ( (lv_arena_3_0= ruleArena ) )
            // InternalRangoMode.g:2070:4: (lv_arena_3_0= ruleArena )
            {
            // InternalRangoMode.g:2070:4: (lv_arena_3_0= ruleArena )
            // InternalRangoMode.g:2071:5: lv_arena_3_0= ruleArena
            {

            					newCompositeNode(grammarAccess.getLevelAccess().getArenaArenaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_arena_3_0=ruleArena();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelRule());
            					}
            					set(
            						current,
            						"arena",
            						lv_arena_3_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Arena");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRangoMode.g:2088:3: ( (lv_spawning_4_0= ruleSpawnStrategy ) )
            // InternalRangoMode.g:2089:4: (lv_spawning_4_0= ruleSpawnStrategy )
            {
            // InternalRangoMode.g:2089:4: (lv_spawning_4_0= ruleSpawnStrategy )
            // InternalRangoMode.g:2090:5: lv_spawning_4_0= ruleSpawnStrategy
            {

            					newCompositeNode(grammarAccess.getLevelAccess().getSpawningSpawnStrategyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
            lv_spawning_4_0=ruleSpawnStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelRule());
            					}
            					set(
            						current,
            						"spawning",
            						lv_spawning_4_0,
            						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.SpawnStrategy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleSpeedBonus"
    // InternalRangoMode.g:2115:1: entryRuleSpeedBonus returns [EObject current=null] : iv_ruleSpeedBonus= ruleSpeedBonus EOF ;
    public final EObject entryRuleSpeedBonus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedBonus = null;


        try {
            // InternalRangoMode.g:2115:51: (iv_ruleSpeedBonus= ruleSpeedBonus EOF )
            // InternalRangoMode.g:2116:2: iv_ruleSpeedBonus= ruleSpeedBonus EOF
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
    // InternalRangoMode.g:2122:1: ruleSpeedBonus returns [EObject current=null] : ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) ;
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
            // InternalRangoMode.g:2128:2: ( ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? ) )
            // InternalRangoMode.g:2129:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            {
            // InternalRangoMode.g:2129:2: ( () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )? )
            // InternalRangoMode.g:2130:3: () otherlv_1= 'speed' otherlv_2= 'bonus' (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )? (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            {
            // InternalRangoMode.g:2130:3: ()
            // InternalRangoMode.g:2131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedBonusAccess().getSpeedBonusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedBonusAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getSpeedBonusAccess().getBonusKeyword_2());
            		
            // InternalRangoMode.g:2145:3: (otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRangoMode.g:2146:4: otherlv_3= 'up' otherlv_4= 'to' ( (lv_maxFactor_5_0= ruleDecimal ) ) otherlv_6= 'times'
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_49); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpeedBonusAccess().getUpKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpeedBonusAccess().getToKeyword_3_1());
                    			
                    // InternalRangoMode.g:2154:4: ( (lv_maxFactor_5_0= ruleDecimal ) )
                    // InternalRangoMode.g:2155:5: (lv_maxFactor_5_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2155:5: (lv_maxFactor_5_0= ruleDecimal )
                    // InternalRangoMode.g:2156:6: lv_maxFactor_5_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getSpeedBonusAccess().getMaxFactorDecimalParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    otherlv_6=(Token)match(input,59,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpeedBonusAccess().getTimesKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:2178:3: (otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRangoMode.g:2179:4: otherlv_7= 'over' ( (lv_duration_8_0= ruleDecimal ) ) otherlv_9= 's'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getSpeedBonusAccess().getOverKeyword_4_0());
                    			
                    // InternalRangoMode.g:2183:4: ( (lv_duration_8_0= ruleDecimal ) )
                    // InternalRangoMode.g:2184:5: (lv_duration_8_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2184:5: (lv_duration_8_0= ruleDecimal )
                    // InternalRangoMode.g:2185:6: lv_duration_8_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getSpeedBonusAccess().getDurationDecimalParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    otherlv_9=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRangoMode.g:2211:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalRangoMode.g:2211:46: (iv_ruleArena= ruleArena EOF )
            // InternalRangoMode.g:2212:2: iv_ruleArena= ruleArena EOF
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
    // InternalRangoMode.g:2218:1: ruleArena returns [EObject current=null] : (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )? ( (lv_obstacles_9_0= ruleObstacle ) )* otherlv_10= '}' ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_background_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_playerStart_7_0 = null;

        EObject lv_obstacles_9_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2224:2: ( (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )? ( (lv_obstacles_9_0= ruleObstacle ) )* otherlv_10= '}' ) )
            // InternalRangoMode.g:2225:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )? ( (lv_obstacles_9_0= ruleObstacle ) )* otherlv_10= '}' )
            {
            // InternalRangoMode.g:2225:2: (otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )? ( (lv_obstacles_9_0= ruleObstacle ) )* otherlv_10= '}' )
            // InternalRangoMode.g:2226:3: otherlv_0= 'arena' otherlv_1= '{' otherlv_2= 'background' ( (lv_background_3_0= RULE_STRING ) ) (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )? ( (lv_obstacles_9_0= ruleObstacle ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getArenaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getBackgroundKeyword_2());
            		
            // InternalRangoMode.g:2238:3: ( (lv_background_3_0= RULE_STRING ) )
            // InternalRangoMode.g:2239:4: (lv_background_3_0= RULE_STRING )
            {
            // InternalRangoMode.g:2239:4: (lv_background_3_0= RULE_STRING )
            // InternalRangoMode.g:2240:5: lv_background_3_0= RULE_STRING
            {
            lv_background_3_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

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

            // InternalRangoMode.g:2256:3: (otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRangoMode.g:2257:4: otherlv_4= 'player' otherlv_5= 'starts' otherlv_6= 'at' ( (lv_playerStart_7_0= ruleDecimal ) ) otherlv_8= '%'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getArenaAccess().getPlayerKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,63,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getStartsKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getArenaAccess().getAtKeyword_4_2());
                    			
                    // InternalRangoMode.g:2269:4: ( (lv_playerStart_7_0= ruleDecimal ) )
                    // InternalRangoMode.g:2270:5: (lv_playerStart_7_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2270:5: (lv_playerStart_7_0= ruleDecimal )
                    // InternalRangoMode.g:2271:6: lv_playerStart_7_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getArenaAccess().getPlayerStartDecimalParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_playerStart_7_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArenaRule());
                    						}
                    						set(
                    							current,
                    							"playerStart",
                    							lv_playerStart_7_0,
                    							"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,64,FOLLOW_56); 

                    				newLeafNode(otherlv_8, grammarAccess.getArenaAccess().getPercentSignKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:2293:3: ( (lv_obstacles_9_0= ruleObstacle ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==67||LA25_0==70||LA25_0==73) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRangoMode.g:2294:4: (lv_obstacles_9_0= ruleObstacle )
            	    {
            	    // InternalRangoMode.g:2294:4: (lv_obstacles_9_0= ruleObstacle )
            	    // InternalRangoMode.g:2295:5: lv_obstacles_9_0= ruleObstacle
            	    {

            	    					newCompositeNode(grammarAccess.getArenaAccess().getObstaclesObstacleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_obstacles_9_0=ruleObstacle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArenaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"obstacles",
            	    						lv_obstacles_9_0,
            	    						"no.ntnu.tdt4250.rango.gamemode.dsl.RangoMode.Obstacle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getArenaAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRangoMode.g:2321:1: ruleAt[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) ;
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
            // InternalRangoMode.g:2327:2: ( (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' ) )
            // InternalRangoMode.g:2328:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            {
            // InternalRangoMode.g:2328:2: (otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')' )
            // InternalRangoMode.g:2329:3: otherlv_0= 'at' otherlv_1= '(' ( (lv_x_2_0= ruleDecimal ) ) otherlv_3= '%' otherlv_4= ',' ( (lv_y_5_0= ruleDecimal ) ) otherlv_6= '%' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getAtAccess().getAtKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRangoMode.g:2337:3: ( (lv_x_2_0= ruleDecimal ) )
            // InternalRangoMode.g:2338:4: (lv_x_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:2338:4: (lv_x_2_0= ruleDecimal )
            // InternalRangoMode.g:2339:5: lv_x_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getAtAccess().getXDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_3=(Token)match(input,64,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getAtAccess().getPercentSignKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAtAccess().getCommaKeyword_4());
            		
            // InternalRangoMode.g:2364:3: ( (lv_y_5_0= ruleDecimal ) )
            // InternalRangoMode.g:2365:4: (lv_y_5_0= ruleDecimal )
            {
            // InternalRangoMode.g:2365:4: (lv_y_5_0= ruleDecimal )
            // InternalRangoMode.g:2366:5: lv_y_5_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getAtAccess().getYDecimalParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_6=(Token)match(input,64,FOLLOW_59); 

            			newLeafNode(otherlv_6, grammarAccess.getAtAccess().getPercentSignKeyword_6());
            		
            otherlv_7=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRangoMode.g:2395:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRangoMode.g:2395:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRangoMode.g:2396:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalRangoMode.g:2402:1: ruleObstacle returns [EObject current=null] : (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_JumpPad_1 = null;

        EObject this_Teleporter_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2408:2: ( (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter ) )
            // InternalRangoMode.g:2409:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            {
            // InternalRangoMode.g:2409:2: (this_Block_0= ruleBlock | this_JumpPad_1= ruleJumpPad | this_Teleporter_2= ruleTeleporter )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt26=1;
                }
                break;
            case 70:
                {
                alt26=2;
                }
                break;
            case 73:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRangoMode.g:2410:3: this_Block_0= ruleBlock
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
                    // InternalRangoMode.g:2419:3: this_JumpPad_1= ruleJumpPad
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
                    // InternalRangoMode.g:2428:3: this_Teleporter_2= ruleTeleporter
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
    // InternalRangoMode.g:2440:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRangoMode.g:2440:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRangoMode.g:2441:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalRangoMode.g:2447:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token lv_height_6_0=null;
        EObject this_At_2 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2453:2: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:2454:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:2454:2: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) ) )
            // InternalRangoMode.g:2455:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'size' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'by' ( (lv_height_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
            		
            // InternalRangoMode.g:2459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2460:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            		
            pushFollow(FOLLOW_60);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSizeKeyword_3());
            		
            // InternalRangoMode.g:2492:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalRangoMode.g:2493:4: (lv_width_4_0= RULE_INT )
            {
            // InternalRangoMode.g:2493:4: (lv_width_4_0= RULE_INT )
            // InternalRangoMode.g:2494:5: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_61); 

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

            otherlv_5=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getByKeyword_5());
            		
            // InternalRangoMode.g:2514:3: ( (lv_height_6_0= RULE_INT ) )
            // InternalRangoMode.g:2515:4: (lv_height_6_0= RULE_INT )
            {
            // InternalRangoMode.g:2515:4: (lv_height_6_0= RULE_INT )
            // InternalRangoMode.g:2516:5: lv_height_6_0= RULE_INT
            {
            lv_height_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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
    // InternalRangoMode.g:2536:1: entryRuleJumpPad returns [EObject current=null] : iv_ruleJumpPad= ruleJumpPad EOF ;
    public final EObject entryRuleJumpPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpPad = null;


        try {
            // InternalRangoMode.g:2536:48: (iv_ruleJumpPad= ruleJumpPad EOF )
            // InternalRangoMode.g:2537:2: iv_ruleJumpPad= ruleJumpPad EOF
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
    // InternalRangoMode.g:2543:1: ruleJumpPad returns [EObject current=null] : (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
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
            // InternalRangoMode.g:2549:2: ( (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2550:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2550:2: (otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2551:3: otherlv_0= 'jumppad' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'launch' ( (lv_launch_4_0= ruleDecimal ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJumpPadAccess().getJumppadKeyword_0());
            		
            // InternalRangoMode.g:2555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2556:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            		
            pushFollow(FOLLOW_62);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getJumpPadAccess().getLaunchKeyword_3());
            		
            // InternalRangoMode.g:2588:3: ( (lv_launch_4_0= ruleDecimal ) )
            // InternalRangoMode.g:2589:4: (lv_launch_4_0= ruleDecimal )
            {
            // InternalRangoMode.g:2589:4: (lv_launch_4_0= ruleDecimal )
            // InternalRangoMode.g:2590:5: lv_launch_4_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getJumpPadAccess().getLaunchDecimalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_63);
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

            // InternalRangoMode.g:2607:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==72) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRangoMode.g:2608:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_64); 

                    				newLeafNode(otherlv_5, grammarAccess.getJumpPadAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2612:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2613:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2613:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2614:6: lv_affects_6_0= ruleTarget
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
    // InternalRangoMode.g:2636:1: entryRuleTeleporter returns [EObject current=null] : iv_ruleTeleporter= ruleTeleporter EOF ;
    public final EObject entryRuleTeleporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeleporter = null;


        try {
            // InternalRangoMode.g:2636:51: (iv_ruleTeleporter= ruleTeleporter EOF )
            // InternalRangoMode.g:2637:2: iv_ruleTeleporter= ruleTeleporter EOF
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
    // InternalRangoMode.g:2643:1: ruleTeleporter returns [EObject current=null] : (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) ;
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
            // InternalRangoMode.g:2649:2: ( (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? ) )
            // InternalRangoMode.g:2650:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            {
            // InternalRangoMode.g:2650:2: (otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )? )
            // InternalRangoMode.g:2651:3: otherlv_0= 'teleporter' ( (lv_name_1_0= RULE_ID ) ) this_At_2= ruleAt[$current] otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeleporterAccess().getTeleporterKeyword_0());
            		
            // InternalRangoMode.g:2655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRangoMode.g:2656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRangoMode.g:2656:4: (lv_name_1_0= RULE_ID )
            // InternalRangoMode.g:2657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            		
            pushFollow(FOLLOW_49);
            this_At_2=ruleAt(current);

            state._fsp--;


            			current = this_At_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTeleporterAccess().getToKeyword_3());
            		
            // InternalRangoMode.g:2688:3: ( (otherlv_4= RULE_ID ) )
            // InternalRangoMode.g:2689:4: (otherlv_4= RULE_ID )
            {
            // InternalRangoMode.g:2689:4: (otherlv_4= RULE_ID )
            // InternalRangoMode.g:2690:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeleporterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_4, grammarAccess.getTeleporterAccess().getTargetTeleporterCrossReference_4_0());
            				

            }


            }

            // InternalRangoMode.g:2701:3: (otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==72) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRangoMode.g:2702:4: otherlv_5= 'affects' ( (lv_affects_6_0= ruleTarget ) )
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_64); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeleporterAccess().getAffectsKeyword_5_0());
                    			
                    // InternalRangoMode.g:2706:4: ( (lv_affects_6_0= ruleTarget ) )
                    // InternalRangoMode.g:2707:5: (lv_affects_6_0= ruleTarget )
                    {
                    // InternalRangoMode.g:2707:5: (lv_affects_6_0= ruleTarget )
                    // InternalRangoMode.g:2708:6: lv_affects_6_0= ruleTarget
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
    // InternalRangoMode.g:2730:1: entryRuleSpawnStrategy returns [EObject current=null] : iv_ruleSpawnStrategy= ruleSpawnStrategy EOF ;
    public final EObject entryRuleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpawnStrategy = null;


        try {
            // InternalRangoMode.g:2730:54: (iv_ruleSpawnStrategy= ruleSpawnStrategy EOF )
            // InternalRangoMode.g:2731:2: iv_ruleSpawnStrategy= ruleSpawnStrategy EOF
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
    // InternalRangoMode.g:2737:1: ruleSpawnStrategy returns [EObject current=null] : (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) ;
    public final EObject ruleSpawnStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_FixedLayout_0 = null;

        EObject this_WaveSchedule_1 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2743:2: ( (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule ) )
            // InternalRangoMode.g:2744:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            {
            // InternalRangoMode.g:2744:2: (this_FixedLayout_0= ruleFixedLayout | this_WaveSchedule_1= ruleWaveSchedule )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==74) ) {
                alt29=1;
            }
            else if ( (LA29_0==75) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRangoMode.g:2745:3: this_FixedLayout_0= ruleFixedLayout
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
                    // InternalRangoMode.g:2754:3: this_WaveSchedule_1= ruleWaveSchedule
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
    // InternalRangoMode.g:2766:1: entryRuleFixedLayout returns [EObject current=null] : iv_ruleFixedLayout= ruleFixedLayout EOF ;
    public final EObject entryRuleFixedLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedLayout = null;


        try {
            // InternalRangoMode.g:2766:52: (iv_ruleFixedLayout= ruleFixedLayout EOF )
            // InternalRangoMode.g:2767:2: iv_ruleFixedLayout= ruleFixedLayout EOF
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
    // InternalRangoMode.g:2773:1: ruleFixedLayout returns [EObject current=null] : (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFixedLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_spawns_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:2779:2: ( (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:2780:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:2780:2: (otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:2781:3: otherlv_0= 'layout' otherlv_1= '{' ( (lv_spawns_2_0= ruleEnemySpawn ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFixedLayoutAccess().getLayoutKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedLayoutAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:2789:3: ( (lv_spawns_2_0= ruleEnemySpawn ) )+
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
            	    // InternalRangoMode.g:2790:4: (lv_spawns_2_0= ruleEnemySpawn )
            	    {
            	    // InternalRangoMode.g:2790:4: (lv_spawns_2_0= ruleEnemySpawn )
            	    // InternalRangoMode.g:2791:5: lv_spawns_2_0= ruleEnemySpawn
            	    {

            	    					newCompositeNode(grammarAccess.getFixedLayoutAccess().getSpawnsEnemySpawnParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_66);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:2816:1: entryRuleWaveSchedule returns [EObject current=null] : iv_ruleWaveSchedule= ruleWaveSchedule EOF ;
    public final EObject entryRuleWaveSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaveSchedule = null;


        try {
            // InternalRangoMode.g:2816:53: (iv_ruleWaveSchedule= ruleWaveSchedule EOF )
            // InternalRangoMode.g:2817:2: iv_ruleWaveSchedule= ruleWaveSchedule EOF
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
    // InternalRangoMode.g:2823:1: ruleWaveSchedule returns [EObject current=null] : (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) ;
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
            // InternalRangoMode.g:2829:2: ( (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' ) )
            // InternalRangoMode.g:2830:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            {
            // InternalRangoMode.g:2830:2: (otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}' )
            // InternalRangoMode.g:2831:3: otherlv_0= 'waves' ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )? otherlv_5= '{' ( (lv_waves_6_0= ruleWave ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveScheduleAccess().getWavesKeyword_0());
            		
            // InternalRangoMode.g:2835:3: ( ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==76) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRangoMode.g:2836:4: ( (lv_loop_1_0= 'looping' ) ) (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    {
                    // InternalRangoMode.g:2836:4: ( (lv_loop_1_0= 'looping' ) )
                    // InternalRangoMode.g:2837:5: (lv_loop_1_0= 'looping' )
                    {
                    // InternalRangoMode.g:2837:5: (lv_loop_1_0= 'looping' )
                    // InternalRangoMode.g:2838:6: lv_loop_1_0= 'looping'
                    {
                    lv_loop_1_0=(Token)match(input,76,FOLLOW_68); 

                    						newLeafNode(lv_loop_1_0, grammarAccess.getWaveScheduleAccess().getLoopLoopingKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaveScheduleRule());
                    						}
                    						setWithLastConsumed(current, "loop", lv_loop_1_0 != null, "looping");
                    					

                    }


                    }

                    // InternalRangoMode.g:2850:4: (otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==77) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalRangoMode.g:2851:5: otherlv_2= 'escalate' otherlv_3= 'by' ( (lv_escalation_4_0= RULE_INT ) )
                            {
                            otherlv_2=(Token)match(input,77,FOLLOW_61); 

                            					newLeafNode(otherlv_2, grammarAccess.getWaveScheduleAccess().getEscalateKeyword_1_1_0());
                            				
                            otherlv_3=(Token)match(input,69,FOLLOW_10); 

                            					newLeafNode(otherlv_3, grammarAccess.getWaveScheduleAccess().getByKeyword_1_1_1());
                            				
                            // InternalRangoMode.g:2859:5: ( (lv_escalation_4_0= RULE_INT ) )
                            // InternalRangoMode.g:2860:6: (lv_escalation_4_0= RULE_INT )
                            {
                            // InternalRangoMode.g:2860:6: (lv_escalation_4_0= RULE_INT )
                            // InternalRangoMode.g:2861:7: lv_escalation_4_0= RULE_INT
                            {
                            lv_escalation_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

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

            otherlv_5=(Token)match(input,13,FOLLOW_69); 

            			newLeafNode(otherlv_5, grammarAccess.getWaveScheduleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:2883:3: ( (lv_waves_6_0= ruleWave ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==78) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRangoMode.g:2884:4: (lv_waves_6_0= ruleWave )
            	    {
            	    // InternalRangoMode.g:2884:4: (lv_waves_6_0= ruleWave )
            	    // InternalRangoMode.g:2885:5: lv_waves_6_0= ruleWave
            	    {

            	    					newCompositeNode(grammarAccess.getWaveScheduleAccess().getWavesWaveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_70);
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:2910:1: entryRuleWave returns [EObject current=null] : iv_ruleWave= ruleWave EOF ;
    public final EObject entryRuleWave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWave = null;


        try {
            // InternalRangoMode.g:2910:45: (iv_ruleWave= ruleWave EOF )
            // InternalRangoMode.g:2911:2: iv_ruleWave= ruleWave EOF
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
    // InternalRangoMode.g:2917:1: ruleWave returns [EObject current=null] : (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' ) ;
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
            // InternalRangoMode.g:2923:2: ( (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' ) )
            // InternalRangoMode.g:2924:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' )
            {
            // InternalRangoMode.g:2924:2: (otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}' )
            // InternalRangoMode.g:2925:3: otherlv_0= 'wave' (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )? otherlv_4= '{' ( (lv_spawns_5_0= ruleEnemySpawn ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getWaveAccess().getWaveKeyword_0());
            		
            // InternalRangoMode.g:2929:3: (otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==79) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRangoMode.g:2930:4: otherlv_1= 'after' ( (lv_delay_2_0= ruleDecimal ) ) otherlv_3= 's'
                    {
                    otherlv_1=(Token)match(input,79,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getWaveAccess().getAfterKeyword_1_0());
                    			
                    // InternalRangoMode.g:2934:4: ( (lv_delay_2_0= ruleDecimal ) )
                    // InternalRangoMode.g:2935:5: (lv_delay_2_0= ruleDecimal )
                    {
                    // InternalRangoMode.g:2935:5: (lv_delay_2_0= ruleDecimal )
                    // InternalRangoMode.g:2936:6: lv_delay_2_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getWaveAccess().getDelayDecimalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    otherlv_3=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWaveAccess().getSKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_65); 

            			newLeafNode(otherlv_4, grammarAccess.getWaveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRangoMode.g:2962:3: ( (lv_spawns_5_0= ruleEnemySpawn ) )+
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
            	    // InternalRangoMode.g:2963:4: (lv_spawns_5_0= ruleEnemySpawn )
            	    {
            	    // InternalRangoMode.g:2963:4: (lv_spawns_5_0= ruleEnemySpawn )
            	    // InternalRangoMode.g:2964:5: lv_spawns_5_0= ruleEnemySpawn
            	    {

            	    					newCompositeNode(grammarAccess.getWaveAccess().getSpawnsEnemySpawnParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_66);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:2989:1: entryRuleEnemySpawn returns [EObject current=null] : iv_ruleEnemySpawn= ruleEnemySpawn EOF ;
    public final EObject entryRuleEnemySpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemySpawn = null;


        try {
            // InternalRangoMode.g:2989:51: (iv_ruleEnemySpawn= ruleEnemySpawn EOF )
            // InternalRangoMode.g:2990:2: iv_ruleEnemySpawn= ruleEnemySpawn EOF
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
    // InternalRangoMode.g:2996:1: ruleEnemySpawn returns [EObject current=null] : ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) ;
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
            // InternalRangoMode.g:3002:2: ( ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? ) )
            // InternalRangoMode.g:3003:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            {
            // InternalRangoMode.g:3003:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )? )
            // InternalRangoMode.g:3004:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= 'size' ( (lv_size_4_0= RULE_INT ) ) this_At_5= ruleAt[$current] (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            {
            // InternalRangoMode.g:3004:3: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRangoMode.g:3005:4: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= '*'
                    {
                    // InternalRangoMode.g:3005:4: ( (lv_count_0_0= RULE_INT ) )
                    // InternalRangoMode.g:3006:5: (lv_count_0_0= RULE_INT )
                    {
                    // InternalRangoMode.g:3006:5: (lv_count_0_0= RULE_INT )
                    // InternalRangoMode.g:3007:6: lv_count_0_0= RULE_INT
                    {
                    lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnemySpawnAccess().getAsteriskKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRangoMode.g:3028:3: ( (otherlv_2= RULE_ID ) )
            // InternalRangoMode.g:3029:4: (otherlv_2= RULE_ID )
            {
            // InternalRangoMode.g:3029:4: (otherlv_2= RULE_ID )
            // InternalRangoMode.g:3030:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnemySpawnRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_2, grammarAccess.getEnemySpawnAccess().getTypeEnemyTypeCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEnemySpawnAccess().getSizeKeyword_2());
            		
            // InternalRangoMode.g:3045:3: ( (lv_size_4_0= RULE_INT ) )
            // InternalRangoMode.g:3046:4: (lv_size_4_0= RULE_INT )
            {
            // InternalRangoMode.g:3046:4: (lv_size_4_0= RULE_INT )
            // InternalRangoMode.g:3047:5: lv_size_4_0= RULE_INT
            {
            lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_24); 

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
            		
            pushFollow(FOLLOW_72);
            this_At_5=ruleAt(current);

            state._fsp--;


            			current = this_At_5;
            			afterParserOrEnumRuleCall();
            		
            // InternalRangoMode.g:3074:3: (otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==80) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRangoMode.g:3075:4: otherlv_6= 'moving' ( (lv_direction_7_0= ruleDirection ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_73); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnemySpawnAccess().getMovingKeyword_5_0());
                    			
                    // InternalRangoMode.g:3079:4: ( (lv_direction_7_0= ruleDirection ) )
                    // InternalRangoMode.g:3080:5: (lv_direction_7_0= ruleDirection )
                    {
                    // InternalRangoMode.g:3080:5: (lv_direction_7_0= ruleDirection )
                    // InternalRangoMode.g:3081:6: lv_direction_7_0= ruleDirection
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
    // InternalRangoMode.g:3104:1: ruleDrops[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDrops(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_drops_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3110:2: ( (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' ) )
            // InternalRangoMode.g:3111:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            {
            // InternalRangoMode.g:3111:2: (otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}' )
            // InternalRangoMode.g:3112:3: otherlv_0= 'drops' otherlv_1= '{' ( (lv_drops_2_0= ruleDropTable ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDropsAccess().getDropsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDropsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRangoMode.g:3120:3: ( (lv_drops_2_0= ruleDropTable ) )+
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
            	    // InternalRangoMode.g:3121:4: (lv_drops_2_0= ruleDropTable )
            	    {
            	    // InternalRangoMode.g:3121:4: (lv_drops_2_0= ruleDropTable )
            	    // InternalRangoMode.g:3122:5: lv_drops_2_0= ruleDropTable
            	    {

            	    					newCompositeNode(grammarAccess.getDropsAccess().getDropsDropTableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_74);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:3147:1: entryRuleDropTable returns [EObject current=null] : iv_ruleDropTable= ruleDropTable EOF ;
    public final EObject entryRuleDropTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTable = null;


        try {
            // InternalRangoMode.g:3147:50: (iv_ruleDropTable= ruleDropTable EOF )
            // InternalRangoMode.g:3148:2: iv_ruleDropTable= ruleDropTable EOF
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
    // InternalRangoMode.g:3154:1: ruleDropTable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) ;
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
            // InternalRangoMode.g:3160:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' ) )
            // InternalRangoMode.g:3161:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            {
            // InternalRangoMode.g:3161:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}' )
            // InternalRangoMode.g:3162:3: ( (otherlv_0= RULE_ID ) ) ( (lv_chance_1_0= ruleDecimal ) ) otherlv_2= '%' otherlv_3= '{' ( (lv_entries_4_0= ruleDrop ) ) (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )* otherlv_7= '}'
            {
            // InternalRangoMode.g:3162:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3163:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3163:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3164:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropTableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getDropTableAccess().getEnemyTypeEnemyTypeCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3175:3: ( (lv_chance_1_0= ruleDecimal ) )
            // InternalRangoMode.g:3176:4: (lv_chance_1_0= ruleDecimal )
            {
            // InternalRangoMode.g:3176:4: (lv_chance_1_0= ruleDecimal )
            // InternalRangoMode.g:3177:5: lv_chance_1_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getDropTableAccess().getChanceDecimalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_2=(Token)match(input,64,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDropTableAccess().getPercentSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDropTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRangoMode.g:3202:3: ( (lv_entries_4_0= ruleDrop ) )
            // InternalRangoMode.g:3203:4: (lv_entries_4_0= ruleDrop )
            {
            // InternalRangoMode.g:3203:4: (lv_entries_4_0= ruleDrop )
            // InternalRangoMode.g:3204:5: lv_entries_4_0= ruleDrop
            {

            					newCompositeNode(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalRangoMode.g:3221:3: (otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRangoMode.g:3222:4: otherlv_5= ',' ( (lv_entries_6_0= ruleDrop ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDropTableAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRangoMode.g:3226:4: ( (lv_entries_6_0= ruleDrop ) )
            	    // InternalRangoMode.g:3227:5: (lv_entries_6_0= ruleDrop )
            	    {
            	    // InternalRangoMode.g:3227:5: (lv_entries_6_0= ruleDrop )
            	    // InternalRangoMode.g:3228:6: lv_entries_6_0= ruleDrop
            	    {

            	    						newCompositeNode(grammarAccess.getDropTableAccess().getEntriesDropParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRangoMode.g:3254:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalRangoMode.g:3254:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalRangoMode.g:3255:2: iv_ruleDrop= ruleDrop EOF
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
    // InternalRangoMode.g:3261:1: ruleDrop returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_weight_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3267:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? ) )
            // InternalRangoMode.g:3268:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            {
            // InternalRangoMode.g:3268:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )? )
            // InternalRangoMode.g:3269:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            {
            // InternalRangoMode.g:3269:3: ( (otherlv_0= RULE_ID ) )
            // InternalRangoMode.g:3270:4: (otherlv_0= RULE_ID )
            {
            // InternalRangoMode.g:3270:4: (otherlv_0= RULE_ID )
            // InternalRangoMode.g:3271:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_75); 

            					newLeafNode(otherlv_0, grammarAccess.getDropAccess().getPowerUpPowerUpCrossReference_0_0());
            				

            }


            }

            // InternalRangoMode.g:3282:3: (otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==82) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRangoMode.g:3283:4: otherlv_1= 'weight' ( (lv_weight_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,82,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getDropAccess().getWeightKeyword_1_0());
                    			
                    // InternalRangoMode.g:3287:4: ( (lv_weight_2_0= RULE_INT ) )
                    // InternalRangoMode.g:3288:5: (lv_weight_2_0= RULE_INT )
                    {
                    // InternalRangoMode.g:3288:5: (lv_weight_2_0= RULE_INT )
                    // InternalRangoMode.g:3289:6: lv_weight_2_0= RULE_INT
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
    // InternalRangoMode.g:3310:1: entryRuleEndCondition returns [EObject current=null] : iv_ruleEndCondition= ruleEndCondition EOF ;
    public final EObject entryRuleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndCondition = null;


        try {
            // InternalRangoMode.g:3310:53: (iv_ruleEndCondition= ruleEndCondition EOF )
            // InternalRangoMode.g:3311:2: iv_ruleEndCondition= ruleEndCondition EOF
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
    // InternalRangoMode.g:3317:1: ruleEndCondition returns [EObject current=null] : (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive ) ;
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
            // InternalRangoMode.g:3323:2: ( (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive ) )
            // InternalRangoMode.g:3324:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )
            {
            // InternalRangoMode.g:3324:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalRangoMode.g:3325:3: this_Cleared_0= ruleCleared
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
                    // InternalRangoMode.g:3334:3: this_TimeReached_1= ruleTimeReached
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
                    // InternalRangoMode.g:3343:3: this_ScoreReached_2= ruleScoreReached
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
                    // InternalRangoMode.g:3352:3: this_EnemiesPopped_3= ruleEnemiesPopped
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
                    // InternalRangoMode.g:3361:3: this_WavesSurvived_4= ruleWavesSurvived
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
                    // InternalRangoMode.g:3370:3: this_HealthDepleted_5= ruleHealthDepleted
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
                    // InternalRangoMode.g:3379:3: this_EnemiesAlive_6= ruleEnemiesAlive
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
    // InternalRangoMode.g:3391:1: entryRuleCleared returns [EObject current=null] : iv_ruleCleared= ruleCleared EOF ;
    public final EObject entryRuleCleared() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCleared = null;


        try {
            // InternalRangoMode.g:3391:48: (iv_ruleCleared= ruleCleared EOF )
            // InternalRangoMode.g:3392:2: iv_ruleCleared= ruleCleared EOF
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
    // InternalRangoMode.g:3398:1: ruleCleared returns [EObject current=null] : ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' ) ;
    public final EObject ruleCleared() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3404:2: ( ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' ) )
            // InternalRangoMode.g:3405:2: ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' )
            {
            // InternalRangoMode.g:3405:2: ( () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared' )
            // InternalRangoMode.g:3406:3: () otherlv_1= 'all' otherlv_2= 'enemies' otherlv_3= 'cleared'
            {
            // InternalRangoMode.g:3406:3: ()
            // InternalRangoMode.g:3407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearedAccess().getClearedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_76); 

            			newLeafNode(otherlv_1, grammarAccess.getClearedAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,84,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getClearedAccess().getEnemiesKeyword_2());
            		
            otherlv_3=(Token)match(input,85,FOLLOW_2); 

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
    // InternalRangoMode.g:3429:1: entryRuleTimeReached returns [EObject current=null] : iv_ruleTimeReached= ruleTimeReached EOF ;
    public final EObject entryRuleTimeReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeReached = null;


        try {
            // InternalRangoMode.g:3429:52: (iv_ruleTimeReached= ruleTimeReached EOF )
            // InternalRangoMode.g:3430:2: iv_ruleTimeReached= ruleTimeReached EOF
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
    // InternalRangoMode.g:3436:1: ruleTimeReached returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) ;
    public final EObject ruleTimeReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalRangoMode.g:3442:2: ( (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' ) )
            // InternalRangoMode.g:3443:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            {
            // InternalRangoMode.g:3443:2: (otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's' )
            // InternalRangoMode.g:3444:3: otherlv_0= 'time' otherlv_1= 'reaches' ( (lv_seconds_2_0= ruleDecimal ) ) otherlv_3= 's'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeReachedAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,87,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3452:3: ( (lv_seconds_2_0= ruleDecimal ) )
            // InternalRangoMode.g:3453:4: (lv_seconds_2_0= ruleDecimal )
            {
            // InternalRangoMode.g:3453:4: (lv_seconds_2_0= ruleDecimal )
            // InternalRangoMode.g:3454:5: lv_seconds_2_0= ruleDecimal
            {

            					newCompositeNode(grammarAccess.getTimeReachedAccess().getSecondsDecimalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRangoMode.g:3479:1: entryRuleScoreReached returns [EObject current=null] : iv_ruleScoreReached= ruleScoreReached EOF ;
    public final EObject entryRuleScoreReached() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreReached = null;


        try {
            // InternalRangoMode.g:3479:53: (iv_ruleScoreReached= ruleScoreReached EOF )
            // InternalRangoMode.g:3480:2: iv_ruleScoreReached= ruleScoreReached EOF
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
    // InternalRangoMode.g:3486:1: ruleScoreReached returns [EObject current=null] : (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) ;
    public final EObject ruleScoreReached() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_points_2_0=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3492:2: ( (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) ) )
            // InternalRangoMode.g:3493:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            {
            // InternalRangoMode.g:3493:2: (otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) ) )
            // InternalRangoMode.g:3494:3: otherlv_0= 'score' otherlv_1= 'reaches' ( (lv_points_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,88,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreReachedAccess().getScoreKeyword_0());
            		
            otherlv_1=(Token)match(input,87,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getScoreReachedAccess().getReachesKeyword_1());
            		
            // InternalRangoMode.g:3502:3: ( (lv_points_2_0= RULE_INT ) )
            // InternalRangoMode.g:3503:4: (lv_points_2_0= RULE_INT )
            {
            // InternalRangoMode.g:3503:4: (lv_points_2_0= RULE_INT )
            // InternalRangoMode.g:3504:5: lv_points_2_0= RULE_INT
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
    // InternalRangoMode.g:3524:1: entryRuleEnemiesPopped returns [EObject current=null] : iv_ruleEnemiesPopped= ruleEnemiesPopped EOF ;
    public final EObject entryRuleEnemiesPopped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemiesPopped = null;


        try {
            // InternalRangoMode.g:3524:54: (iv_ruleEnemiesPopped= ruleEnemiesPopped EOF )
            // InternalRangoMode.g:3525:2: iv_ruleEnemiesPopped= ruleEnemiesPopped EOF
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
    // InternalRangoMode.g:3531:1: ruleEnemiesPopped returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' ) ;
    public final EObject ruleEnemiesPopped() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3537:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' ) )
            // InternalRangoMode.g:3538:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' )
            {
            // InternalRangoMode.g:3538:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped' )
            // InternalRangoMode.g:3539:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'popped'
            {
            // InternalRangoMode.g:3539:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3540:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3540:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3541:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_76); 

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

            otherlv_1=(Token)match(input,84,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getEnemiesPoppedAccess().getEnemiesKeyword_1());
            		
            otherlv_2=(Token)match(input,89,FOLLOW_2); 

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
    // InternalRangoMode.g:3569:1: entryRuleWavesSurvived returns [EObject current=null] : iv_ruleWavesSurvived= ruleWavesSurvived EOF ;
    public final EObject entryRuleWavesSurvived() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWavesSurvived = null;


        try {
            // InternalRangoMode.g:3569:54: (iv_ruleWavesSurvived= ruleWavesSurvived EOF )
            // InternalRangoMode.g:3570:2: iv_ruleWavesSurvived= ruleWavesSurvived EOF
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
    // InternalRangoMode.g:3576:1: ruleWavesSurvived returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) ;
    public final EObject ruleWavesSurvived() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3582:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' ) )
            // InternalRangoMode.g:3583:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            {
            // InternalRangoMode.g:3583:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived' )
            // InternalRangoMode.g:3584:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'waves' otherlv_2= 'survived'
            {
            // InternalRangoMode.g:3584:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3585:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3585:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3586:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_80); 

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

            otherlv_1=(Token)match(input,75,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getWavesSurvivedAccess().getWavesKeyword_1());
            		
            otherlv_2=(Token)match(input,90,FOLLOW_2); 

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
    // InternalRangoMode.g:3614:1: entryRuleHealthDepleted returns [EObject current=null] : iv_ruleHealthDepleted= ruleHealthDepleted EOF ;
    public final EObject entryRuleHealthDepleted() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthDepleted = null;


        try {
            // InternalRangoMode.g:3614:55: (iv_ruleHealthDepleted= ruleHealthDepleted EOF )
            // InternalRangoMode.g:3615:2: iv_ruleHealthDepleted= ruleHealthDepleted EOF
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
    // InternalRangoMode.g:3621:1: ruleHealthDepleted returns [EObject current=null] : ( () otherlv_1= 'health' otherlv_2= 'depleted' ) ;
    public final EObject ruleHealthDepleted() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3627:2: ( ( () otherlv_1= 'health' otherlv_2= 'depleted' ) )
            // InternalRangoMode.g:3628:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            {
            // InternalRangoMode.g:3628:2: ( () otherlv_1= 'health' otherlv_2= 'depleted' )
            // InternalRangoMode.g:3629:3: () otherlv_1= 'health' otherlv_2= 'depleted'
            {
            // InternalRangoMode.g:3629:3: ()
            // InternalRangoMode.g:3630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthDepletedAccess().getHealthDepletedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_82); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthDepletedAccess().getHealthKeyword_1());
            		
            otherlv_2=(Token)match(input,91,FOLLOW_2); 

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
    // InternalRangoMode.g:3648:1: entryRuleEnemiesAlive returns [EObject current=null] : iv_ruleEnemiesAlive= ruleEnemiesAlive EOF ;
    public final EObject entryRuleEnemiesAlive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnemiesAlive = null;


        try {
            // InternalRangoMode.g:3648:53: (iv_ruleEnemiesAlive= ruleEnemiesAlive EOF )
            // InternalRangoMode.g:3649:2: iv_ruleEnemiesAlive= ruleEnemiesAlive EOF
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
    // InternalRangoMode.g:3655:1: ruleEnemiesAlive returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' ) ;
    public final EObject ruleEnemiesAlive() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3661:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' ) )
            // InternalRangoMode.g:3662:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' )
            {
            // InternalRangoMode.g:3662:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive' )
            // InternalRangoMode.g:3663:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'enemies' otherlv_2= 'alive'
            {
            // InternalRangoMode.g:3663:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRangoMode.g:3664:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRangoMode.g:3664:4: (lv_count_0_0= RULE_INT )
            // InternalRangoMode.g:3665:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_76); 

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

            otherlv_1=(Token)match(input,84,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getEnemiesAliveAccess().getEnemiesKeyword_1());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_2); 

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
    // InternalRangoMode.g:3693:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalRangoMode.g:3693:47: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalRangoMode.g:3694:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalRangoMode.g:3700:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3706:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalRangoMode.g:3707:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalRangoMode.g:3707:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalRangoMode.g:3708:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_84); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
            		
            // InternalRangoMode.g:3715:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==93) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRangoMode.g:3716:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,93,FOLLOW_10); 

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


    // $ANTLR start "ruleDifficultyTier"
    // InternalRangoMode.g:3733:1: ruleDifficultyTier returns [Enumerator current=null] : ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'hard' ) ) ;
    public final Enumerator ruleDifficultyTier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3739:2: ( ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'hard' ) ) )
            // InternalRangoMode.g:3740:2: ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'hard' ) )
            {
            // InternalRangoMode.g:3740:2: ( (enumLiteral_0= 'easy' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'hard' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt43=1;
                }
                break;
            case 95:
                {
                alt43=2;
                }
                break;
            case 96:
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
                    // InternalRangoMode.g:3741:3: (enumLiteral_0= 'easy' )
                    {
                    // InternalRangoMode.g:3741:3: (enumLiteral_0= 'easy' )
                    // InternalRangoMode.g:3742:4: enumLiteral_0= 'easy'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDifficultyTierAccess().getEASYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3749:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalRangoMode.g:3749:3: (enumLiteral_1= 'medium' )
                    // InternalRangoMode.g:3750:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDifficultyTierAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3757:3: (enumLiteral_2= 'hard' )
                    {
                    // InternalRangoMode.g:3757:3: (enumLiteral_2= 'hard' )
                    // InternalRangoMode.g:3758:4: enumLiteral_2= 'hard'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getDifficultyTierAccess().getHARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDifficultyTierAccess().getHARDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDifficultyTier"


    // $ANTLR start "ruleModifierTarget"
    // InternalRangoMode.g:3768:1: ruleModifierTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'enemy.speed' ) | (enumLiteral_1= 'enemy.points' ) | (enumLiteral_2= 'player.health' ) | (enumLiteral_3= 'player.speed' ) | (enumLiteral_4= 'drop.chance' ) | (enumLiteral_5= 'wave.delay' ) ) ;
    public final Enumerator ruleModifierTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3774:2: ( ( (enumLiteral_0= 'enemy.speed' ) | (enumLiteral_1= 'enemy.points' ) | (enumLiteral_2= 'player.health' ) | (enumLiteral_3= 'player.speed' ) | (enumLiteral_4= 'drop.chance' ) | (enumLiteral_5= 'wave.delay' ) ) )
            // InternalRangoMode.g:3775:2: ( (enumLiteral_0= 'enemy.speed' ) | (enumLiteral_1= 'enemy.points' ) | (enumLiteral_2= 'player.health' ) | (enumLiteral_3= 'player.speed' ) | (enumLiteral_4= 'drop.chance' ) | (enumLiteral_5= 'wave.delay' ) )
            {
            // InternalRangoMode.g:3775:2: ( (enumLiteral_0= 'enemy.speed' ) | (enumLiteral_1= 'enemy.points' ) | (enumLiteral_2= 'player.health' ) | (enumLiteral_3= 'player.speed' ) | (enumLiteral_4= 'drop.chance' ) | (enumLiteral_5= 'wave.delay' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt44=1;
                }
                break;
            case 98:
                {
                alt44=2;
                }
                break;
            case 99:
                {
                alt44=3;
                }
                break;
            case 100:
                {
                alt44=4;
                }
                break;
            case 101:
                {
                alt44=5;
                }
                break;
            case 102:
                {
                alt44=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalRangoMode.g:3776:3: (enumLiteral_0= 'enemy.speed' )
                    {
                    // InternalRangoMode.g:3776:3: (enumLiteral_0= 'enemy.speed' )
                    // InternalRangoMode.g:3777:4: enumLiteral_0= 'enemy.speed'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModifierTargetAccess().getENEMY_SPEEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3784:3: (enumLiteral_1= 'enemy.points' )
                    {
                    // InternalRangoMode.g:3784:3: (enumLiteral_1= 'enemy.points' )
                    // InternalRangoMode.g:3785:4: enumLiteral_1= 'enemy.points'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModifierTargetAccess().getENEMY_POINTSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3792:3: (enumLiteral_2= 'player.health' )
                    {
                    // InternalRangoMode.g:3792:3: (enumLiteral_2= 'player.health' )
                    // InternalRangoMode.g:3793:4: enumLiteral_2= 'player.health'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModifierTargetAccess().getPLAYER_HEALTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRangoMode.g:3800:3: (enumLiteral_3= 'player.speed' )
                    {
                    // InternalRangoMode.g:3800:3: (enumLiteral_3= 'player.speed' )
                    // InternalRangoMode.g:3801:4: enumLiteral_3= 'player.speed'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModifierTargetAccess().getPLAYER_SPEEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRangoMode.g:3808:3: (enumLiteral_4= 'drop.chance' )
                    {
                    // InternalRangoMode.g:3808:3: (enumLiteral_4= 'drop.chance' )
                    // InternalRangoMode.g:3809:4: enumLiteral_4= 'drop.chance'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModifierTargetAccess().getDROP_CHANCEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRangoMode.g:3816:3: (enumLiteral_5= 'wave.delay' )
                    {
                    // InternalRangoMode.g:3816:3: (enumLiteral_5= 'wave.delay' )
                    // InternalRangoMode.g:3817:4: enumLiteral_5= 'wave.delay'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getModifierTargetAccess().getWAVE_DELAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getModifierTargetAccess().getWAVE_DELAYEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleModifierTarget"


    // $ANTLR start "ruleTarget"
    // InternalRangoMode.g:3827:1: ruleTarget returns [Enumerator current=null] : ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) ) ;
    public final Enumerator ruleTarget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3833:2: ( ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) ) )
            // InternalRangoMode.g:3834:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) )
            {
            // InternalRangoMode.g:3834:2: ( (enumLiteral_0= 'everything' ) | (enumLiteral_1= 'enemies' ) | (enumLiteral_2= 'player' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt45=1;
                }
                break;
            case 84:
                {
                alt45=2;
                }
                break;
            case 41:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalRangoMode.g:3835:3: (enumLiteral_0= 'everything' )
                    {
                    // InternalRangoMode.g:3835:3: (enumLiteral_0= 'everything' )
                    // InternalRangoMode.g:3836:4: enumLiteral_0= 'everything'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTargetAccess().getALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3843:3: (enumLiteral_1= 'enemies' )
                    {
                    // InternalRangoMode.g:3843:3: (enumLiteral_1= 'enemies' )
                    // InternalRangoMode.g:3844:4: enumLiteral_1= 'enemies'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTargetAccess().getENEMIESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRangoMode.g:3851:3: (enumLiteral_2= 'player' )
                    {
                    // InternalRangoMode.g:3851:3: (enumLiteral_2= 'player' )
                    // InternalRangoMode.g:3852:4: enumLiteral_2= 'player'
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
    // InternalRangoMode.g:3862:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRangoMode.g:3868:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRangoMode.g:3869:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRangoMode.g:3869:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==104) ) {
                alt46=1;
            }
            else if ( (LA46_0==105) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalRangoMode.g:3870:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRangoMode.g:3870:3: (enumLiteral_0= 'left' )
                    // InternalRangoMode.g:3871:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRangoMode.g:3878:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRangoMode.g:3878:3: (enumLiteral_1= 'right' )
                    // InternalRangoMode.g:3879:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

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
    static final String dfa_2s = "\1\6\3\uffff\1\113\1\uffff\1\131\3\uffff";
    static final String dfa_3s = "\1\130\3\uffff\1\124\1\uffff\1\134\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\uffff\1\5\1\4\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\44\uffff\1\5\47\uffff\1\1\2\uffff\1\2\1\uffff\1\3",
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
            return "3324:2: (this_Cleared_0= ruleCleared | this_TimeReached_1= ruleTimeReached | this_ScoreReached_2= ruleScoreReached | this_EnemiesPopped_3= ruleEnemiesPopped | this_WavesSurvived_4= ruleWavesSurvived | this_HealthDepleted_5= ruleHealthDepleted | this_EnemiesAlive_6= ruleEnemiesAlive )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001028000011022L,0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001028000011002L,0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L,0x0000007E00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002700100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000EC0000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000EC0000104000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000FC0000104000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2084000000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0048000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x20CC000000100000L,0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000040L,0x0000000001480000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1200000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000004000L,0x0000000000000248L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000248L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000020000000000L,0x0000008000100000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000004050L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000002000L,0x0000000000001000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000002000L,0x0000000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});

}
