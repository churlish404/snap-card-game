package snap;

public class Timer extends Thread {
    private Player currentPlayer;

    public Timer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    @Override
    public void run() {
        try {
            sleep(5000);
            if(isInterrupted()) {
                if(currentPlayer.checkSnapInput()) {
                    PlayerMessages.playerWon(currentPlayer);
                }
            }
            else {
                PlayerMessages.timerExpired(currentPlayer);
                currentPlayer.loseSnap();
            }
        }
        catch (InterruptedException exception) {
            if(!currentPlayer.checkSnapInput()) {
                PlayerMessages.incorrectSnapInput(currentPlayer);
                currentPlayer.loseSnap();
            }
            PlayerMessages.playerWon(currentPlayer);
        }
    }
}
