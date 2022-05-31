package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumbersTest extends BaseIOTest {

    @Test
    void printFactorialRowUpToSeven() {
        FactorialNumbers factorialNumbers = new FactorialNumbers();

        factorialNumbers.printFactorialRow(7);

        assertOutEquals(
                "1\n" +
                "1\n" +
                "2\n" +
                "6\n" +
                "24\n" +
                "120\n" +
                "720\n" +
                "5040\n"
        );
    }

    @Test
    void printFactorialRowZero() {
        FactorialNumbers factorialNumbers = new FactorialNumbers();

        factorialNumbers.printFactorialRow(0);

        assertOutEquals("1\n");
    }
}