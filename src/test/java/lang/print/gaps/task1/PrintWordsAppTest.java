package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrintWordsAppTest extends BaseIOTest {

    @Test
    void mainPrintsLine() {
        PrintWordsApp.main(null);

        Assertions.assertEquals("java\nis\nsmth\n", updateLineSpliterators(outContent.toString()));
    }
}