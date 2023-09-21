package snap;

public enum Ranks {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String value;
    private Ranks(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void printValue() {
        System.out.println(value);
    }
}
