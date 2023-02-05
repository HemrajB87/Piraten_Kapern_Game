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
        if(playerCard.equals("NOP")){
            newRollResults.removeAll(Collections.singleton("SABER"));
            newRollResults.removeAll(Collections.singleton("PARROT"));
            newRollResults.removeAll(Collections.singleton("MONKEY"));


            while (newRollResults.size()<8){
                newRollResults.add(String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
            }
            //return newRollResults;
        }


        if(playerCard.equals("MONKEY BUSINESS")){
            newRollResults.removeAll(Collections.singleton("SABER"));
            newRollResults.removeAll(Collections.singleton("GOLD"));
            newRollResults.removeAll(Collections.singleton("DIAMOND"));

            while (newRollResults.size()<8){
                newRollResults.add(String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
            }
            return newRollResults;
        }

        if(playerCard.equals("SEA BATTLE (2)") ||playerCard.equals("SEA BATTLE (3)")||playerCard.equals("SEA BATTLE (4)") ){
            newRollResults.removeAll(Collections.singleton("MONKEY"));
            newRollResults.removeAll(Collections.singleton("PARROT"));
            newRollResults.removeAll(Collections.singleton("GOLD"));
            newRollResults.removeAll(Collections.singleton("DIAMOND"));

            while (newRollResults.size()<8){
                newRollResults.add(String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
            }
            //return newRollResults;
        }


        return newRollResults;
    }


}


