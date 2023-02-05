package pk;

import java.util.ArrayList;

public class Player {


    public static ArrayList<String> Decison(String arg, ArrayList<String> playerRolls, String playerCard) {
        if(arg.equals("random")){
            return Strategy.reroll(playerRolls);
        }
        if(arg.equals("combo")){
            return Strategy.comboReroll(playerRolls,playerCard);
        }

        return playerRolls;
    }
}
