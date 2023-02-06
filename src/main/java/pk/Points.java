package pk;


import java.util.*;

public class Points {
    // Method calculates points depending on dice roll and drawn cards
    public static int calculate(ArrayList<String> rolls, String cards) {
        int points = 0;
        ArrayList<String> listOccurrences = comboOccurrence(rolls);
        int combo3=Collections.frequency(listOccurrences,"3" );
        int combo4=Collections.frequency(listOccurrences,"4" );
        int combo5=Collections.frequency(listOccurrences,"5" );
        int combo6=Collections.frequency(listOccurrences,"6" );
        int combo7=Collections.frequency(listOccurrences,"7" );
        int combo8=Collections.frequency(listOccurrences,"8" );

        // checking if SEA BATTLE card is drawn and assigning points depending on version
        if (cards.equals("SEA BATTLE (2)")||cards.equals("SEA BATTLE (3)") ||cards.equals("SEA BATTLE (4)")) {
            int sCount=0;
            int sPoints=0;
            if(cards.equals("SEA BATTLE (2)")){ // >= 2 sabers
                sCount=2;
                sPoints=300;
            }else if (cards.equals("SEA BATTLE (3)")){ // >= 3 sabers
                sCount=3;
                sPoints=500;
            }else{ // >= 4 sabers
                sCount=4;
                sPoints=1000;
            }

            if (Collections.frequency(rolls, "SABER") >= sCount && Collections.frequency(rolls, "SKULL") < 3) {
                points += sPoints;
                int a= calculatePoints(rolls);
                points += a;
            } else {
                points -= sPoints;

            }
          // checking if MONKEY BUSINESS card is drawn and assigning points
        } else if (cards.equals("MONKEY BUSINESS")) {
            int monkeyCount = Collections.frequency(rolls, "MONKEY");
            int parrotCount = Collections.frequency(rolls, "PARROT");
            int monkeyBusinessCount = monkeyCount + parrotCount;
            if (Collections.frequency(rolls, "SKULL") < 3) {
                for (String face : Dice.FACES) {
                    int count = Collections.frequency(rolls, face);
                    if (face.equals("GOLD")) {
                        points += count * 100;
                    } else if (face.equals("DIAMOND")) {
                        points += count * 100;
                    }
                }
                if (monkeyBusinessCount >= 8) {
                    points += 4000;
                } else if (monkeyBusinessCount >= 7) {
                    points += 2000;
                } else if (monkeyBusinessCount >= 6) {
                    points += 1000;
                } else if (monkeyBusinessCount >= 5) {
                    points += 500;
                } else if (monkeyBusinessCount >= 4) {
                    points += 200;
                } else if (monkeyBusinessCount >= 3) {
                    points += 100;
                }
            } else {
                points -= 0;
            }
            // if NOP card is drawn, assigning points if roll contains less than 3 skulls
        } else{
            if (Collections.frequency(rolls, "SKULL") < 3){
            int c= calculatePoints(rolls);
            points += c;
            } else{
                points-=0;
            }
            }
        return points;
    }

    private static int calculatePoints(ArrayList<String> rolls) {
        ArrayList<String> listOccurrences = comboOccurrence(rolls);
        int combo3=Collections.frequency(listOccurrences,"3" );
        int combo4=Collections.frequency(listOccurrences,"4" );
        int combo5=Collections.frequency(listOccurrences,"5" );
        int combo6=Collections.frequency(listOccurrences,"6" );
        int combo7=Collections.frequency(listOccurrences,"7" );
        int combo8=Collections.frequency(listOccurrences,"8" );
        int points = 0;
        for (String face : Dice.FACES) {
            int count = Collections.frequency(rolls, face);
            if (face.equals("GOLD")) {
                points += count * 100;
            } else if (face.equals("DIAMOND")) {
                points += count * 100;
            }
        }
        if (combo8 == 1) {
            points += 4000;
        }
        if (combo7 == 1) {
            points += 2000;
        }
        if (combo6 == 1) {
            points += 1000;
        }
        if (combo5 == 1) {
            points += 500;
        }
        if (combo4 == 2) {
            points += 400;
        }
        if (combo4 == 1) {
            points += 200;
        }
        if (combo3 == 2) {
            points += 200;
        }
        if (combo3 == 1) {
            points += 100;
        }
        return points;
    }



    // method returns the occurrences of each dice face in an arraylist (8 dice roll)
    public static ArrayList<String> comboOccurrence(ArrayList<String> rolls){
        int monkeyCount = Collections.frequency(rolls, "MONKEY");
        int parrotCount = Collections.frequency(rolls, "PARROT");
        int saberCount = Collections.frequency(rolls, "SABER");
        int diamondCount = Collections.frequency(rolls, "DIAMOND");
        int goldCount = Collections.frequency(rolls, "GOLD");

        ArrayList<String> Occurrences = new ArrayList<>();
        Occurrences.add(String.valueOf(monkeyCount));
        Occurrences.add(String.valueOf(parrotCount));
        Occurrences.add(String.valueOf(saberCount));
        Occurrences.add(String.valueOf(diamondCount));
        Occurrences.add(String.valueOf(goldCount));

        return Occurrences;
    }



}




