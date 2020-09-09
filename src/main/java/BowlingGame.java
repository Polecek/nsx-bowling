public class BowlingGame {

    private int[] ballsThrown = new int[9*2 + 3];
    private int currentBall;

    public int getScore() {
        int score = 0;
        for (int i = 0; i < currentBall; i++) {
            int pinsKnockedDown = ballsThrown[i];
            score += pinsKnockedDown;
            if (score == 10) {
                score += ballsThrown[i + 1];
            }
        }
        return score;
    }

    public void registerBallThrown(int pinsKnockedDown) {
        ballsThrown[currentBall++] = pinsKnockedDown;
    }
}
