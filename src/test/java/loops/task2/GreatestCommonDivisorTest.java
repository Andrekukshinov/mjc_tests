package loops.task2;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest extends BaseIOTest {

    @Test
    void printGCDFirstIsBigger() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(30, 25);

        assertOutEquals("5\n");
    }

    @Test
    void printGCDSecondIsBigger() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(25, 30);

        assertOutEquals("5\n");
    }

    @Test
    void printGCDWhenEqual() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(30, 30);

        assertOutEquals("30\n");
    }

    @Test
    void printGCDWhenZero() {
        GreatestCommonDivisor divisor = new GreatestCommonDivisor();

        divisor.printGCD(0, 30);

        assertOutEquals("30\n");
    }
}