import CardGame.Card;
import snap.Player;
import snap.PlayerMessages;
import snap.Snap;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Snap snapGame = new Snap("myGame");
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        PlayerMessages.gameIntroduction(player1, player2);
        Player currentPlayer = player1;


        while (true) {
            Card currentTurnCard = snapGame.takeTurn(currentPlayer);

            if (currentTurnCard == null) {
                PlayerMessages.gameIsADraw();
                break;
            }

            if(snapGame.checkWin(currentTurnCard)) {
                PlayerMessages.playerWon(currentPlayer);
                break;
            }
            snapGame.setPreviousCard(currentTurnCard);
            if(currentPlayer == player1) {
                currentPlayer = player2;
            }
            else {
                currentPlayer = player1;
            }
        }
    }
}