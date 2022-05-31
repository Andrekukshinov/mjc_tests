package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest extends BaseIOTest {

    @Test
    void printMultipliedPositive() {
        Multiplication multiplication = new Multiplication();

        multiplication.printMultiplied(5);

        assertOutEquals("0\n5\n10\n15\n20\n25\n");
    }

    @Test
    void printMultipliedNegative() {
        Multiplication multiplication = new Multiplication();

        multiplication.printMultiplied(-5);

        assertOutEquals("0\n-5\n-10\n-15\n-20\n-25\n");
    }

    @Test
    void printMultipliedZero() {
        Multiplication multiplication = new Multiplication();

        multiplication.printMultiplied(-5);

        assertOutEquals("");
    }
}