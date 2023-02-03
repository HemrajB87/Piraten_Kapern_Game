package pk;

import java.util.ArrayList;

public class GameSimulation {

    public static void main(String[] args) {
        int player1wins=0;
        int player2wins=0;
        int player1Points = 0;
        int player2Points = 0;
        //CardDeck player1Deck = new CardDeck();
        //CardDeck player2Deck = new CardDeck();
        for (int i = 0; i < 42; i++) {
            CardDeck player1Deck = new CardDeck();
            CardDeck player2Deck = new CardDeck();
            player1Points=0;
            player2Points=0;
            while (player1Points <= 3000 || player2Points <= 3000) {
                String player1Card = player1Deck.drawCard();
                ArrayList<String> player1Rolls = Dice.roll();
                Points.calculate(player1Rolls,  player1Card);
                System.out.println("Player 1 card: " + player1Card);
                System.out.println("Player 1 rolls: " + player1Rolls);
                player1Points += Points.calculate(player1Rolls, player1Card);
                player1Rolls = Strategy.reroll(player1Rolls);
                player1Points += Points.calculate(player1Rolls, player1Card);
                ArrayList<String> player2Rolls = Dice.roll();
                //ArrayList<String> player3Rolls = player2Rolls;
                String player2Card = player2Deck.drawCard();
                Points.calculate(player2Rolls,player2Card);
                System.out.println("Player 2 card: " + player2Card);
                System.out.println("Player 2 rolls: " + player2Rolls);
                player2Points += Points.calculate(player2Rolls,player2Card);
                System.out.println("Player 2 Points: "+ player2Points);
                player2Rolls = Strategy.reroll(player2Rolls);
                //player3Rolls = ComboStrategy.reroll(player3Rolls);
                System.out.println("Player 2 re-rolls: " + player2Rolls);
               // System.out.println("Player 2 re-rolls: " + player3Rolls);
                player2Points += Points.calculate(player2Rolls,player2Card);
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
    }

}


