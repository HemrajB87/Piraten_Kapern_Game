package pk;

import java.util.*;

public class Strategy {

    public static ArrayList<String> reroll(ArrayList<String> rollResults) {
        ArrayList<String> firstHalf = new ArrayList<String>(rollResults.subList(0, 4));
        ArrayList<String> secondHalf = new ArrayList<String>(rollResults.subList(4, 8));
        // reroll the first half
        Random rand = new Random();
        int howManyFaces = Faces.values().length;
        for (int i = 0; i < firstHalf.size(); i++) {
            firstHalf.set(i, String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
        }
        // combine the two halves
        ArrayList<String> newResults = new ArrayList<String>();
        newResults.addAll(firstHalf);
        newResults.addAll(secondHalf);
        // check if the new results contain three SKULL
        int skullCount = 0;
        for (String face : newResults) {
            if (face.equals("SKULL")) {
                skullCount++;
            }
        }
        if (skullCount >= 3) {
            return newResults;
        } else {
            return rollResults;
        }
    }

    // calculate points by iterating through the arraylist to get the occurrences of GOLD and DIAMOND
    public static int calculatePoints(ArrayList<String> rollResults) {
        int points = 0;
        int goldCount = 0;
        int diamondCount = 0;
        for (String face : rollResults) {
            if (face.equals("GOLD")) {
                goldCount++;
            } else if (face.equals("DIAMOND")) {
                diamondCount++;
            }
        }
        points = goldCount * 100 + diamondCount * 100;
        return points;
    }


}


