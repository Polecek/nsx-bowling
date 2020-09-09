public class BowlingGame {

    private int score;

    public int getScore() {
        return score;
    }

    public void registerBallThrown(int pinsKnockedDown) {
        score = pinsKnockedDown;
    }
}
