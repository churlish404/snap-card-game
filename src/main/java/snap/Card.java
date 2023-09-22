package snap;

public class Card {

    private Suits suit;
    private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String getSuit() {
        return suit.getSuit();
    }

    @Override
    public String toString() {
        return suit.getSuit() + rank.getSymbol();
    }
}