package pk;

import java.util.*;

public class ComboStrategy extends Strategy {

    public static ArrayList<String> reroll(ArrayList<String> rollResults) {
        HashMap<String, Integer> faceCount = new HashMap<>();
        for (String face : rollResults) {
            faceCount.put(face, faceCount.getOrDefault(face, 0) + 1);
        }

        int maxCount = 0;
        String maxFace = "";
        for (Map.Entry<String, Integer> entry : faceCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxFace = entry.getKey();
            }
        }

        if (maxCount >= 3) {
            return rollResults;
        }

        Random rand = new Random();
        int howManyFaces = Faces.values().length;
        ArrayList<String> newRollResults = new ArrayList<>(rollResults);
        for (int i = 0; i < newRollResults.size(); i++) {
            if (!newRollResults.get(i).equals(maxFace)) {
                int randomIndex = rand.nextInt(newRollResults.size());
                newRollResults.set(i, String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
            }
        }
        return newRollResults;
    }

}
