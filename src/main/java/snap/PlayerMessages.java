package snap;

public class PlayerMessages {

    public static void gameIntroduction(Player player1, Player player2) {
        System.out.println("Welcome to snap " + player1.getName() + " & " + player2.getName() + "  \n" +
                "Click enter to play your turn \n" +
                "If you draw a card with the same value as the last... you win \n" +
                "If the whole deck is dealt with no SNAPs we'll call it a draw \n" +
                "Have fun!\n");
    }
    public static void promptTakeTurn(Player player) {
        System.out.println(player.getName() + " deal your next card..");
    }

    public static void cardDrawn(String dealtCard, Player currentPlayer) {
        System.out.println(currentPlayer.getName() + " drew " + dealtCard + "\n");
    }

    public static void lastCardDealt() {System.out.println("Last card dealt");}

    public static void gameIsADraw() {
        System.out.println("NO SNAP....game is a draw");
    }

    public static void playerWon(Player currentPlayer) {
        System.out.println("SNAP! \n" + currentPlayer.getName().toUpperCase() + " WINS!");
    }

    public static void onlyPressEnter() {
        System.out.println("You need to press enter to take turn");
    }
}
