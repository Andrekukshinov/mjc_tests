package lang.print.gaps.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeStuckVarsTest extends BaseIOTest {

    @Test
    void mainMakesCorrectOutput() {
        ThreeStuckVars.main(null);

        assertEquals("110100\n", updateLineSpliterators(outContent.toString()));
    }
}