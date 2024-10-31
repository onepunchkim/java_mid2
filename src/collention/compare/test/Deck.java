package collention.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        suffle();
    }

    public void initCard() {
        for (int i = 1; i < 13; i++) {
            for (Suit suit : Suit.values()) {
               cards.add(new Card(i, suit));
            }
        }
    }

    public void suffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.removeFirst();
    }
}
