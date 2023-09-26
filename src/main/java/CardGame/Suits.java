package CardGame;

public enum Suits {
    HEART("♥"), DIAMOND("♦"), SPADE("♠"), CLUB("♣");

    private final String suit;

    private Suits(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void printSuit() {
        System.out.println(suit);
    }
}