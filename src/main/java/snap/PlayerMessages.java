package snap;

public class PlayerMessages {

    public static void gameIntroduction() {
        System.out.println("Welcome to snap \n" +
                "Click enter to play your turn \n" +
                "If you draw a card with the same value as the last... you win \n" +
                "If the whole deck is dealt with no SNAPs we'll call it a draw \n" +
                "Have fun!\n");
    }
    public static void promptTakeTurn() {
        System.out.println("Deal next card..");
    }

    public static void cardDrawn(String dealtCard) {
        System.out.println("You drew " + dealtCard + "\n");
    }

    public static void lastCardDealt() {System.out.println("Last card dealt");}
}