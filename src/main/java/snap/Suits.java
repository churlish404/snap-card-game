package snap;

public enum Suits {
    HEART("U+2665"), DIAMOND("U+2666"), SPADE("U+2660"), CLUB("U+2663");

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
