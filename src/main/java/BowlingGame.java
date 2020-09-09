public class BowlingGame {

    private int[] ballsThrown = new int[9*2 + 3];
    private int currentBall;

    public int getScore() {
        int score = 0;
        for (int i = 0; i < currentBall; i += 2) {
            int twoBallsInFrame = ballsThrown[i] + ballsThrown[i + 1];
            if (twoBallsInFrame == 10) {
                score += 10 + ballsThrown[i + 2];
            } else {
                score += twoBallsInFrame;
            }
        }
        return score;
    }

    public void registerBallThrown(int pinsKnockedDown) {
        ballsThrown[currentBall++] = pinsKnockedDown;
    }
}
