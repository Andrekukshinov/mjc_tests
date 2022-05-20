package conditions.task2;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFlipTest extends BaseIOTest {

    @Test
    void throwCoinPrintsEagleIfLessThan501() {
        CoinFlip flip = new CoinFlip();

        flip.throwCoin(500);

        assertEquals("Eagle\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void throwCoinPrintsEagleIfGreaterThan500() {
        CoinFlip flip = new CoinFlip();

        flip.throwCoin(501);

        assertEquals("Tail\n", updateLineSpliterators(outContent.toString()));
    }
}