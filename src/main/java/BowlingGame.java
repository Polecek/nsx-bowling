public class BowlingGame {

    private int[] ballsThrown = new int[9*2 + 3];
    private int currentBall;

    public int getScore() {
        int score = 0;
        for (int pinsKnockedDown : ballsThrown) {
            score += pinsKnockedDown;
        }
        return score;
    }

    public void registerBallThrown(int pinsKnockedDown) {
        ballsThrown[currentBall++] = pinsKnockedDown;
    }
}
