package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

class PrimeNumbersTest extends BaseIOTest {

    @Test
    void printPrimeNumbersTill33() {
        PrimeNumbers simpleNumbers = new PrimeNumbers();

        simpleNumbers.printPrimeNumbers(33);

        assertOutEquals("2\n3\n5\n7\n11\n13\n17\n19\n23\n29\n31\n");
    }

    @Test
    void printPrimeNumbers0() {
        PrimeNumbers simpleNumbers = new PrimeNumbers();

        simpleNumbers.printPrimeNumbers(0);

        assertOutEquals("");
    }
}