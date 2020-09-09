import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    private final BowlingGame game = new BowlingGame();

    @Test
    void emptyGame() {
        assertEquals(0, game.getScore());
    }

    @Test
    void firstThrow() {
        throwBalls(1);

        assertEquals(1, game.getScore());
    }

    @Test
    void secondThrow() {
        throwBalls(1, 1);

        assertEquals(2, game.getScore());
    }

    private void throwBalls(int... balls) {
        for (int pinsKnockedDown : balls) {
            game.registerBallThrown(pinsKnockedDown);
        }
    }
}
