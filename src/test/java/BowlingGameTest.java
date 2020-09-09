import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    @Test
    void emptyGame() {
        assertEquals(0, new BowlingGame().getScore());
    }
}
