package loops.task2;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinesSumTest extends BaseIOTest {

    @Test
    void calculateSumForRowOf5() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(5);

        assertOutEquals("111105\n");
    }

    @Test
    void calculateSumForRowOf6() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(6);

        assertOutEquals("1111104\n");
    }

    @Test
    void calculateSumForNegative() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(-6);

        assertOutEquals("0\n");
    }

    @Test
    void calculateSumForZero() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(0);

        assertOutEquals("0\n");
    }
}