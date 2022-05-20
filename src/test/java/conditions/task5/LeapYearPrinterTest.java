package conditions.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearPrinterTest extends BaseIOTest {

    @Test
    void isLeapYearPrintsLeapWhenTrue() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2004);

        assertOutEquals("leap\n");
    }

    @Test
    void isLeapYearPrintsNotLeapWhenFalse() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2000);

        assertOutEquals("not leap\n");
    }
}