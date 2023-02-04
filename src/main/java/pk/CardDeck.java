package pk;

import java.util.*;



public class CardDeck {
    public static final int DECK_SIZE = 35;
    public static final int SEA_BATTLE_COUNT = 2;
    public static final int MONKEY_BUSINESS_COUNT = 4;
    public static final int NOP_COUNT = 25;

    private static ArrayList<String> cards;

    public CardDeck() {
        cards = new ArrayList<String>();;
    }

    public static void addDeck(){

        for (int i = 0; i < SEA_BATTLE_COUNT; i++) {
            cards.add("SEA BATTLE (2)");
            cards.add("SEA BATTLE (3)");
            cards.add("SEA BATTLE (4)");
        }
        for (int i = 0; i < MONKEY_BUSINESS_COUNT; i++) {
            cards.add("MONKEY BUSINESS");
        }
        for (int i = 0; i < NOP_COUNT; i++) {
            cards.add("NOP");
        }
        Collections.shuffle(cards);
    }




    public String drawCard() {
        Random rand = new Random();
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}

