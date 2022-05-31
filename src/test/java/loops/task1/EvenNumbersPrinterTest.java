package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersPrinterTest extends BaseIOTest {
    @Test
    void printEvenNumbersPrinterPrintsTill9() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(9);

        assertOutEquals("2\n4\n6\n8\n");
    }

    @Test
    void printEvenNumbersPrinterPrintsTill20() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(20);

        assertOutEquals("2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n");
    }

    @Test
    void printEvenNumbersPrinterPrintsNothing() {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();

        evenNumbersPrinter.printEvenNumbers(0);

        assertOutEquals("");
    }
}