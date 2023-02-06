package pk;

import java.util.ArrayList;

public class Player {

    // this method determines the strategy that the player is going to play depending on user input
    public static ArrayList<String> Decison(String arg, ArrayList<String> playerRolls, String playerCard) {
        // if random, strategy.reroll is called
        if(arg.equals("random")){
            return Strategy.reroll(playerRolls);
        }
        // if combo, strategy.comboReroll is called
        if(arg.equals("combo")){
            return Strategy.comboReroll(playerRolls,playerCard);
        }

        return playerRolls;
    }
}
