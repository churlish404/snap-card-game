package snap;

import CardGame.CardGame;
import CardGame.Card;

import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

    Scanner playerTurn = new Scanner(System.in);
    private Card previousCard = null;

    public Snap(String name) {
        super(name);
        populateDeck();
        shuffleDeck();
    }

    public Card getPreviousCard() {
        return previousCard;
    }

    public void setPreviousCard(Card previousCard) {
        this.previousCard = previousCard;
    }

    public boolean checkWin(Card currentCard) {
        if (previousCard != null) {
            return currentCard.getValue() == previousCard.getValue();
        }
        return false;
    }

    public Card takeTurn() {
        PlayerMessages.promptTakeTurn();
        String input = playerTurn.nextLine();

        if (!input.isEmpty()) return null;

        Card dealtCard = dealCard();

        if (dealtCard != null) {
            PlayerMessages.cardDrawn(dealtCard.toString());
        } else {
            PlayerMessages.lastCardDealt();
        }
        return dealtCard;
    }

}