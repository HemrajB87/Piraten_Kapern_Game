package pk;
import java.util.ArrayList;
import java.util.Random;

public class Dice {

    public static final String[] FACES = {"MONKEY", "GOLD", "DIAMOND", "SKULL", "PARROT", "SABER"};

    // roll the dice and return the result as an ArrayList
    public static ArrayList<String> roll() {
        int howManyFaces = Faces.values().length;
        ArrayList<String> rollResults = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            rollResults.add(String.valueOf(Faces.values()[rand.nextInt(howManyFaces)]));
        }
        return rollResults;
    }
}

