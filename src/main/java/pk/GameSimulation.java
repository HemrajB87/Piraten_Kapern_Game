package pk;

import java.util.ArrayList;

public class GameSimulation {

    public static void main(String[] args) {
        int player1wins=0;
        int player2wins=0;
        int player1Points = 0;
        int player2Points = 0;
        for (int i = 0; i < 42; i++) {
        player1Points=0;
        player2Points=0;
            while (player1Points <= 3000 || player2Points <= 3000) {
                ArrayList<String> player1Rolls = Dice.roll();
                player1Rolls = Strategy.reroll(player1Rolls);
                player1Points += Strategy.calculatePoints(player1Rolls);
                ArrayList<String> player2Rolls = Dice.roll();
                player2Rolls = Strategy.reroll(player2Rolls);
                player2Points += Strategy.calculatePoints(player2Rolls);
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



