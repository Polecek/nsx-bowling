import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    private final BowlingGame game = new BowlingGame();

    @Test
    void emptyGame() {
        assertScore(0);
    }

    @Test
    void firstThrow() {
        throwBalls(1);

        assertScore(1);
    }

    @Test
    void secondThrow() {
        throwBalls(1, 1);

        assertScore(2);
    }

    @Test
    void completeFrameAndOneMoreThrow() {
        throwBalls(3, 4, 9);

        assertScore(16);
    }

    @Test
    void finishedGameWithNoMark() {
        throwBalls(4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5);

        assertScore(90);
    }

    @Test
    void unfinishedSpare() {
        throwBalls(5, 5);

        assertScore(10);
    }

    @Test
    void finishedSpare() {
        throwBalls(5, 5, 1);

        assertScore(12);
    }


    @Test
    void finishedSpareAndOneMoreBall() {
        throwBalls(5, 5, 1, 8);

        assertScore(20);
    }

    @Test
    void finishedGameWithOnlySpares() {
        throwBalls(9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9);

        assertScore(190);
    }

    private void assertScore(int expectedScore) {
        assertEquals(expectedScore, game.getScore());
    }

    private void throwBalls(int... balls) {
        for (int pinsKnockedDown : balls) {
            game.registerBallThrown(pinsKnockedDown);
        }
    }
}
