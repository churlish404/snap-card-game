package snap;

import java.util.Scanner;

public class Player {
    private int playerNumber;
    private String name;
    private Scanner playerNameScanner = new Scanner(System.in);
    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.name = promptForName(playerNumber);
    }
    public String getName() {
        return name;
    }
    public String promptForName(int playerNumber) {
        System.out.println("Player " + playerNumber +" ... enter your name");
       return playerNameScanner.nextLine();
    }
}
