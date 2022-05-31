package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaturalNumbersTest extends BaseIOTest {

    @Test
    void naturalNumbersPrinterPrintsTill9() {
        NaturalNumbers naturalNumbers = new NaturalNumbers();

        naturalNumbers.naturalNumbersPrinter(9);

        assertOutEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n");
    }

    @Test
    void naturalNumbersPrinterPrintsTill20() {
        NaturalNumbers naturalNumbers = new NaturalNumbers();

        naturalNumbers.naturalNumbersPrinter(20);

        assertOutEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n");
    }

    @Test
    void naturalNumbersPrinterPrintsNothing() {
        NaturalNumbers naturalNumbers = new NaturalNumbers();

        naturalNumbers.naturalNumbersPrinter(0);

        assertOutEquals("");
    }
}