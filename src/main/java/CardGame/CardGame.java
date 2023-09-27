package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CardGame {
    private String name;
    private List<Card> deck;

    public CardGame(String name) {
        this.name = name;
        deck = new ArrayList<>();
        populateDeck();
    }
    public void getDeck() {
        System.out.println(deck);
    }
    public void populateDeck() {
        for(Suits suit : Suits.values()) {
            for(Ranks card : Ranks.values()) {
                deck.add(new Card(suit, card));
            }
        }
    }

    public Card dealCard(){
        if (!deck.isEmpty()) {
            Card card = deck.get(0);
            deck.remove(0);
            return card;
        } else {
            return null;
        }
    }

    public List<Card> sortDeckInNumberOrder() {
        deck = deck.stream().sorted((a, b) -> a.getValue() - b.getValue()).collect(Collectors.toList());
        return deck;
    }

    public List<Card> sortDeckIntoSuits() {
        deck = deck.stream().sorted((a, b) -> a.getSuit().compareTo(b.getSuit())).collect(Collectors.toList());
        return deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
