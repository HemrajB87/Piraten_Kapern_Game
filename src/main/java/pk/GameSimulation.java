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
        boolean canExecute = false;
        for(int i=0; i<2; i++){
            if(args[i].equals("combo")||args[i].equals("random")){
                canExecute = true;
            }
            else {
                canExecute = false;
                break;
            }
        }

        return canExecute;
    }
    public static void main(String[] args) {
        double player1wins=0;
        double player2wins=0;
        int player1Points = 0;
        int player2Points = 0;
        int player3Points = 0;
        int count =0;
        //CardDeck player1Deck = new CardDeck();
        //CardDeck player2Deck = new CardDeck();
        for (int i = 0; i < 42; i++) {
            CardDeck playerDeck = new CardDeck();
            playerDeck.addDeck();

            player1Points=0;
            player2Points=0;
            count=0;
            while (player1Points <= 6000 && player2Points <= 6000) {
                count++;
                System.out.println("Round " + count);

                String player1Card = playerDeck.drawCard();
                String player2Card = playerDeck.drawCard();
                if(player1Card==null||player2Card==null){
                    CardDeck.addDeck();
                    player1Card = playerDeck.drawCard();
                    player2Card = playerDeck.drawCard();

                }


                ArrayList<String> player1Rolls = Dice.roll();
                //Points.calculate(player1Rolls,  player1Card);
                System.out.println("Player 1 card: " + player1Card);
                System.out.println("Player 1 rolls: " + player1Rolls);
                //player1Points += Points.calculate(player1Rolls, player1Card);
                System.out.println("Player 1 Pre-Round Points: "+ player1Points);
                player1Rolls = Player.Decison(args[0],player1Rolls, player1Card);
                //player1Rolls = Strategy.comboReroll(player1Rolls,player1Card); // USING combo reroll (not random)
                System.out.println("Player 1 re-rolls: " + player1Rolls);
                System.out.println("Player 2 re-rolls size: " + player1Rolls.size());
                player1Points += Points.calculate(player1Rolls, player1Card);
                System.out.println("Player 1 Points: "+ player1Points);

                ArrayList<String> player2Rolls = Dice.roll();
                //Points.calculate(player1Rolls,  player1Card);
                System.out.println("Player 2 card: " + player2Card);
                System.out.println("Player 2 rolls: " + player2Rolls);
                //player1Points += Points.calculate(player1Rolls, player1Card);
                System.out.println("Player 2 Pre-Round: "+ player2Points);
                player1Rolls = Player.Decison(args[1],player2Rolls, player2Card);
                //player2Rolls = Strategy.comboReroll(player2Rolls,player2Card); // USING combo reroll (not random)
                System.out.println("Player 2 re-rolls: " + player2Rolls);
                System.out.println("Player 2 re-rolls size: " + player2Rolls.size());
                player2Points += Points.calculate(player2Rolls, player2Card);
                System.out.println("Player 2 Points: "+ player2Points);





            }
            if (player1Points > player2Points) {
                System.out.println("Player 1 wins with " + player1Points + " points!");
                player1wins++;
            } else {
                System.out.println("Player 2 wins with " + player2Points + " points!");
                player2wins++;
            }
        }
        System.out.println("Player 1 wins " + player1wins);
        System.out.println("Player 2 wins "+ player2wins);
        System.out.println("Player 1 wins percentage: " + ((player1wins)/42)*100);
        System.out.println("Player 2 wins percentage:"+ (((player2wins))/42)*100);


    }

    public void simulateGame(){
        if(checkValidity()){
            main(args);
        } else {
            System.out.println("Refer back to the README file on how to execute code");
        }
    }

}


