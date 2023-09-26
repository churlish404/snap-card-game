import CardGame.Card;
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
//        String RESET = "\u001B[0m";
//        String RED_TEXT = "\u001B[31m";
//        String BLACK_TEXT = "\u001B[30m";
//        String BLACK_BG = "\u001B[40m";
//        String WHITE_BG = "\u001B[47m";

        Snap snapGame = new Snap("snap");
        PlayerMessages.gameIntroduction();

        while (true) {
            Card currentTurnCard = snapGame.takeTurn();

            if (currentTurnCard == null) {
                PlayerMessages.gameIsADraw();
                break;
            }

            if(snapGame.checkWin(currentTurnCard)) {
                PlayerMessages.playerWon();
                break;
            }
            snapGame.setPreviousCard(currentTurnCard);
            snapGame.sortDeckInNumberOrder();
            snapGame.getDeck();
        }
    }
}