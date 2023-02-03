package pk;


import java.util.*;

public class Points {
    public static int calculate(ArrayList<String> rolls, String cards) {
        int points = 0;
        for (String face : Dice.FACES) {
            int count = Collections.frequency(rolls, face);
            if (face.equals("GOLD")) {
                points += count * 100;
            } else if (face.equals("DIAMOND")) {
                points += count * 100;
            } else if (count >= 8) {
                System.out.println("8 or more " + face + "'s, combo! Awarded 4000 points.");
                points += 4000;
            } else if (count >= 7) {
                System.out.println("7 or more " + face + "'s, combo! Awarded 2000 points.");
                points += 2000;
            } else if (count >= 6) {
                System.out.println("6 or more " + face + "'s, combo! Awarded 1000 points.");
                points += 1000;
            } else if (count >= 5) {
                System.out.println("5 or more " + face + "'s, combo! Awarded 500 points.");
                points += 500;
            } else if (count >= 4) {
                System.out.println("4 or more " + face + "'s, combo! Awarded 200 points.");
                points += 200;
            } else if (count >= 3) {
                System.out.println("3 or more " + face + "'s, combo! Awarded 100 points.");
                points += 100;
            }
        }

        if (cards.equals("SEA BATTLE")) {
            if (Collections.frequency(rolls, "TIGER") == 3) {
                points += 250;
            } else {
                points -= 250;
            }
        } else if (cards.equals("MONKEY BUSINESS")) {
            int monkeyCount = Collections.frequency(rolls, "MONKEY");
            int parrotCount = Collections.frequency(rolls, "PARROT");
            int monkeyBusinessCount = monkeyCount + parrotCount;
            if (monkeyBusinessCount >= 8) {
                System.out.println("8 or more MONKEY or PARROT, combo! Awarded 4000 points.");
                points += 4000;
            } else if (monkeyBusinessCount >= 7) {
                System.out.println("7 or more MONKEY or PARROT, combo! Awarded 2000 points.");
                points += 2000;
            } else if (monkeyBusinessCount >= 6) {
                System.out.println("6 or more MONKEY or PARROT, combo! Awarded 1000 points.");
                points += 1000;
            } else if (monkeyBusinessCount >= 5) {
                System.out.println("5 or more MONKEY or PARROT, combo! Awarded 500 points.");
                points += 500;
            } else if (monkeyBusinessCount >= 4) {
                System.out.println("4 or more MONKEY or PARROT, combo! Awarded 200 points.");
                points += 200;
            } else if (monkeyBusinessCount >= 3) {
                System.out.println("3 or more MONKEY or PARROT, combo! Awarded 100 points.");
                points += 100;
            }
        } else if(cards.equals("NOP")){
            points += 0;
        }

        return points;
    }
}




