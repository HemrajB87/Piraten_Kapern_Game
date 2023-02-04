package pk;


import java.util.*;

public class Points {
    public static int calculate(ArrayList<String> rolls, String cards) {
        int points = 0;
        ArrayList<String> listOccurrences = comboOccurrence(rolls);
        int combo3=Collections.frequency(listOccurrences,"3" );
        int combo4=Collections.frequency(listOccurrences,"4" );
        int combo5=Collections.frequency(listOccurrences,"5" );
        int combo6=Collections.frequency(listOccurrences,"6" );
        int combo7=Collections.frequency(listOccurrences,"7" );
        int combo8=Collections.frequency(listOccurrences,"8" );

//        if(Collections.frequency(rolls, "SKULL") >=3){
//            points+=0;
//            return points;
//        }

//            for (String face : Dice.FACES) {
//                int count = Collections.frequency(rolls, face);
//                if (face.equals("GOLD")) {
//                    points += count * 100;
//                } else if (face.equals("DIAMOND")) {
//                    points += count * 100;
//                }
//            }
//            if (combo8 == 1) {
//                System.out.println("8 combo! Awarded 4000 points.");
//                points += 4000;
//            }
//            if (combo7 == 1) {
//                System.out.println("7 combo! Awarded 2000 points.");
//                points += 2000;
//            }
//            if (combo6 == 1) {
//                System.out.println("6  combo! Awarded 1000 points.");
//                points += 1000;
//            }
//            if (combo5 == 1) {
//                System.out.println("5  combo! Awarded 500 points.");
//                points += 500;
//            }
//            if (combo4 == 2) {
//                System.out.println("2, 4 combo! Awarded 400 points.");
//                points += 400;
//            }
//            if (combo4 == 1) {
//                System.out.println(" 4 combo! Awarded 200 points.");
//                points += 200;
//            }
//            if (combo3 == 2) {
//                System.out.println("2,3 combo! Awarded 200 points.");
//                points += 200;
//            }
//            if (combo3 == 1) {
//                System.out.println("3 combo! Awarded 100 points.");
//                points += 100;
//            }



            if (Collections.frequency(rolls, "SKULL") <3) {
                for (String face : Dice.FACES) {
                    int count = Collections.frequency(rolls, face);
                    if (face.equals("GOLD")) {
                        points += count * 100;
                    } else if (face.equals("DIAMOND")) {
                        points += count * 100;
                    }
                }
                if (combo8 == 1) {
                    System.out.println("8 combo! Awarded 4000 points.");
                    points += 4000;
                }
                if (combo7 == 1) {
                    System.out.println("7 combo! Awarded 2000 points.");
                    points += 2000;
                }
                if (combo6 == 1) {
                    System.out.println("6  combo! Awarded 1000 points.");
                    points += 1000;
                }
                if (combo5 == 1) {
                    System.out.println("5  combo! Awarded 500 points.");
                    points += 500;
                }
                if (combo4 == 2) {
                    System.out.println("2, 4 combo! Awarded 400 points.");
                    points += 400;
                }
                if (combo4 == 1) {
                    System.out.println(" 4 combo! Awarded 200 points.");
                    points += 200;
                }
                if (combo3 == 2) {
                    System.out.println("2,3 combo! Awarded 200 points.");
                    points += 200;
                }
                if (combo3 == 1) {
                    System.out.println("3 combo! Awarded 100 points.");
                    points += 100;
                }
            } else{
                points-=0;
            }
        return points;
    }



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




