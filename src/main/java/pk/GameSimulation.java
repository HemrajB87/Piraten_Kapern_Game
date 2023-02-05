package pk;

import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class GameSimulation {


    private final String[] args;
    public static final Logger logger = LogManager.getLogger(GameSimulation.class);
    public GameSimulation(String[] args) {
        this.args = args;
    }


    public boolean checkValidity(){
        boolean Execute = false;
        for(int i=0; i<2; i++){
            if(args[i].equals("combo")||args[i].equals("random")){
                Execute = true;
            }
            else {
                Execute = false;
                break;
            }
        }
        return Execute;
    }
    public static void main(String[] args) {
        double player1wins=0;
        double player2wins=0;
        int player1Points = 0;
        int player2Points = 0;

        for (int i = 0; i < 42; i++) {
            CardDeck playerDeck = new CardDeck();
            playerDeck.addDeck();

            player1Points=0;
            player2Points=0;


            boolean traceFound = false;
            if(args[2].equals("trace")||args[2].equals("true")){
                traceFound = true;
            }
            if(traceFound) {
                logger.info("GAME " + (i + 1));
            }

            while (player1Points <= 6000 && player2Points <= 6000) {
                //count++;
                //System.out.println("Round " + count);

                String player1Card = playerDeck.drawCard();
                String player2Card = playerDeck.drawCard();
                if(player1Card==null||player2Card==null){
                    CardDeck.addDeck();
                    player1Card = playerDeck.drawCard();
                    player2Card = playerDeck.drawCard();

                }

                if(traceFound) {
                    ArrayList<String> player1Rolls = Dice.roll();
                    logger.info("Player 1 card: " + player1Card);
                    logger.info("Player 1 rolls: " + player1Rolls);
                    logger.info("Player 1 Pre-Round Points: " + player1Points);
                    player1Rolls = Player.Decison(args[0], player1Rolls, player1Card);
                    logger.info("Player 1 re-rolls: " + player1Rolls);
                    logger.info("Player 2 re-rolls size: " + player1Rolls.size());
                    player1Points += Points.calculate(player1Rolls, player1Card);
                    logger.info("Player 1 Points: " + player1Points);
                    logger.info("***************************************************" );
                    ArrayList<String> player2Rolls = Dice.roll();
                    logger.info("Player 2 card: " + player2Card);
                    logger.info("Player 2 rolls: " + player2Rolls);
                    logger.info("Player 2 Pre-Round: " + player2Points);
                    player2Rolls = Player.Decison(args[1], player2Rolls, player2Card);
                    logger.info("Player 2 re-rolls: " + player2Rolls);
                    logger.info("Player 2 re-rolls size: " + player2Rolls.size());
                    player2Points += Points.calculate(player2Rolls, player2Card);
                    logger.info("Player 2 Points: " + player2Points);
                } else{
                    ArrayList<String> player1Rolls = Dice.roll();
                    player1Rolls = Player.Decison(args[0], player1Rolls, player1Card);
                    player1Points += Points.calculate(player1Rolls, player1Card);

                    ArrayList<String> player2Rolls = Dice.roll();
                    player2Rolls = Player.Decison(args[1], player2Rolls, player2Card);
                    player2Points += Points.calculate(player2Rolls, player2Card);

                }

            }
            if (player1Points > player2Points) {
                if(traceFound) {
                    logger.info("Player 1 wins with " + player1Points + " points!");
                }
                player1wins++;
            } else {
                if(traceFound) {
                    logger.info("Player 2 wins with " + player2Points + " points!");
                }
                player2wins++;
            }
        }
        System.out.println("Player 1 wins percentage: " + ((player1wins)/42)*100);
        System.out.println("Player 2 wins percentage:"+ (((player2wins))/42)*100);


    }

    public void simulateGame(){
        if(checkValidity()){
            main(args);
        } else {
            System.out.println("Refer to README file");
        }
    }
}


