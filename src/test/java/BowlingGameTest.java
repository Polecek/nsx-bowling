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

    private void assertScore(int expectedScore) {
        assertEquals(expectedScore, game.getScore());
    }

    private void throwBalls(int... balls) {
        for (int pinsKnockedDown : balls) {
            game.registerBallThrown(pinsKnockedDown);
        }
    }
}
