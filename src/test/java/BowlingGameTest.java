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
        game.registerBallThrown(1);
        assertEquals(1, game.getScore());
    }
}
