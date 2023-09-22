package snap;

import snap.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {
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
        return deck.get(0);
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
