package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrintSentenceAppTest extends BaseIOTest {

    @Test
    void mainPrintSentence() {
        PrintSentenceApp.main(null);

        Assertions.assertEquals("This is my first java program\n", updateLineSpliterators(outContent.toString()));
    }
}