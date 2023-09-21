package snap;

import snap.Card;

import java.util.List;

public class CardGame {
    private final String name = "myDeck";
    private List<Card> deck;
    public CardGame() {
        this.deck = new Deck();
        this.name = name;
    }


}
