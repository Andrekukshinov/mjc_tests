package loops.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

class SquareTest extends BaseIOTest {

    @Test
    void printSquareFrom8sPrintsSquare() {
        String expected = "88888\n" +
                "8   8\n" +
                "8   8\n" +
                "8   8\n" +
                "88888\n";

        Square square = new Square();

        square.printSquareFrom8s(5);

        assertOutEquals(expected);
    }

    @Test
    void printSquareFrom8sPrintsSmallestSquare() {
        String expected = "88\n" +
                "88\n";

        Square square = new Square();

        square.printSquareFrom8s(2);

        assertOutEquals(expected);
    }

    @Test
    void printSquareFrom8sPrintsNothing() {
        Square square = new Square();

        square.printSquareFrom8s(0);

        assertOutEquals("");
    }
}