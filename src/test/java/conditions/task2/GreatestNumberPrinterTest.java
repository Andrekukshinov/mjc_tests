package conditions.task2;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestNumberPrinterTest extends BaseIOTest {

    @Test
    void printGreatestFirstWhenBigger() {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();

        printer.printGreatest(12, -400);

        assertEquals("12\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void printGreatestSecondWhenBigger() {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();

        printer.printGreatest(-400, 1);

        assertEquals("1\n", updateLineSpliterators(outContent.toString()));
    }
}