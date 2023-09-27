package CardGame;

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
        String WHITE_BG = "\u001B[47m";
        String RED_TEXT = "\u001B[31m";
        String RESET = "\u001B[0m";
        String BLACK_TEXT = "\u001B[30m";

        if(suit.getSuit().equals( "♦")) {
            return WHITE_BG + RED_TEXT + rank.getSymbol() + " " + suit.getSuit() + RESET;
        } else if (suit.getSuit().equals("♥")) {
            return WHITE_BG + RED_TEXT + rank.getSymbol() + " " + suit.getSuit() + " " + RESET;
        } else {
            return WHITE_BG + BLACK_TEXT + rank.getSymbol() + " " + suit.getSuit()
                    + RESET;
        }
    }
}

