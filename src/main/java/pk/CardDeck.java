package pk;

import java.util.*;

public class CardDeck {
    public static final int DECK_SIZE = 35;
    public static final int SEA_BATTLE_COUNT = 6;
    public static final int MONKEY_BUSINESS_COUNT = 4;
    public static final int NOP_COUNT = 25;

    private ArrayList<String> cards;

    public CardDeck() {
        cards = new ArrayList<>(DECK_SIZE);
        for (int i = 0; i < SEA_BATTLE_COUNT; i++) {
            cards.add("SEA BATTLE");
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

