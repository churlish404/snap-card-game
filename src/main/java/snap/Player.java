package snap;

import java.util.Scanner;

public class Player {
    private int playerNumber;
    private String name;
    private Scanner playerNameScanner = new Scanner(System.in);
    private Scanner snapVerifier = new Scanner(System.in);
    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.name = promptForName(playerNumber);
    }
    public String getName() {
        return name;
    }
    public String promptForName(int playerNumber) {
        System.out.println("Player " + playerNumber + " ... enter your name");
       return playerNameScanner.nextLine();
    }
    public boolean checkSnapInput() {
        System.out.println(this.name + ", enter 'snap' to win!");
        String input = snapVerifier.nextLine();
        return "snap".equalsIgnoreCase(input.trim());
    }
    public void loseSnap() {
        System.out.println(name.toUpperCase() + " you lose!");
    }
}
