package pk;

import java.util.ArrayList;

public class Player {


    public static ArrayList<String> Decison(String arg, ArrayList<String> player1Rolls, String player1Card) {
        if(arg == "random"){
            return Strategy.reroll(player1Rolls);
        }
        if(arg == "combo"){
            return Strategy.comboReroll(player1Rolls,player1Card);
        }

        return player1Rolls;
    }
}
