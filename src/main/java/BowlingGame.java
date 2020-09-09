public class BowlingGame {

    private int[] ballsThrown = new int[9*2 + 3];
    private int currentBall;

    public int getScore() {
        int score = 0;
        for (int i = 0; i < currentBall; i++) {
            int pinsKnockedDown = ballsThrown[i];
            score += pinsKnockedDown;
        }
        return score;
    }

    public void registerBallThrown(int pinsKnockedDown) {
        ballsThrown[currentBall++] = pinsKnockedDown;
    }
}
