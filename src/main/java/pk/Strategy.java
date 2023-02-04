package pk;

import java.util.*;



import static pk.Faces.*;
import static pk.Faces.PARROT;

public class Strategy {

    public static ArrayList<String> reroll(ArrayList<String> rollResults) {
        int skullCount = 0;
        for (String face : rollResults) {
            if (face.equals("SKULL")) {
                skullCount++;
            }
        }
        if (skullCount >= 3) {
            return rollResults;
        }

        Random rand = new Random();
        int howManyFaces = Faces.values().length;
        ArrayList<String> newRollResults = new ArrayList<>(rollResults);
        for (int i = 0; i < newRollResults.size(); i++) {
            if (!newRollResults.get(i).equals("SKULL")) {
                int randomIndex = rand.nextInt(newRollResults.size());
                newRollResults.set(i, String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
            }
        }
        return newRollResults;
    }

    public static ArrayList<String> comboReroll(ArrayList<String> rollResults, String playerCard) {

        //System.out.println(playerCard.getCardType());
        Random rand = new Random();
        int howManyFaces = Faces.values().length;
        ArrayList<String> newRollResults = rollResults;

        int skullCount = 0;
        for (String face : rollResults) {
            if (face.equals("SKULL")) {
                skullCount++;
            }
        }
        if (skullCount >= 3) {
            return rollResults;
        }


        return rollResults;
    }


}


