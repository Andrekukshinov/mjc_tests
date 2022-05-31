package loops.finalTask;

import base.BaseIOTest;
import loops.finalTask.LeastCommonMultiple;
import org.junit.jupiter.api.Test;

class LeastCommonMultipleTest extends BaseIOTest {
    @Test
    void printLCMTestPrintsLMC5() {
        LeastCommonMultiple commonMultiple = new LeastCommonMultiple();

        commonMultiple.printLCM(30, 25);

        assertOutEquals("5\n");
    }

    @Test
    void printLCMTestPrintsLMC10() {
        LeastCommonMultiple commonMultiple = new LeastCommonMultiple();

        commonMultiple.printLCM(30, 25);

        assertOutEquals("5\n");
    }

}