package lang.print.gaps.task5;

import base.BaseIOTest;
import lang.print.gaps.task5.TimeConvertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConvertorTest extends BaseIOTest {

    @Test
    void convertConvertsToSeconds() {
        TimeConvertor convertor = new TimeConvertor();

        convertor.convert(11.5F);

        assertEquals("690.0\n", updateLineSpliterators(outContent.toString()));
    }
}