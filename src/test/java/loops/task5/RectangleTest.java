package loops.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest extends BaseIOTest {
    @Test
    void printRectangleFrom8sPrintsRectangleDifHeightAndLength() {
        String expected = "88888\n" +
                "8   8\n" +
                "8   8\n" +
                "8   8\n" +
                "8   8\n" +
                "88888\n";

        Rectangle rectangle = new Rectangle();

        rectangle.printRectangleFrom8s(5, 6);

        assertOutEquals(expected);
    }

    @Test
    void printRectangleFrom8sPrintsRectangleSameHeightAndLength() {
        String expected = "88888\n" +
                "8   8\n" +
                "8   8\n" +
                "8   8\n" +
                "88888\n";

        Rectangle rectangle = new Rectangle();

        rectangle.printRectangleFrom8s(5, 5);

        assertOutEquals(expected);
    }

    @Test
    void printRectangleFrom8sPrintsWideRectangle() {
        String expected = "888888\n" +
                "8    8\n" +
                "8    8\n" +
                "8    8\n" +
                "888888\n";

        Rectangle rectangle = new Rectangle();

        rectangle.printRectangleFrom8s(6, 5);

        assertOutEquals(expected);
    }

    @Test
    void printSquareFrom8sPrintsNothing() {
        Rectangle rectangle = new Rectangle();

        rectangle.printRectangleFrom8s(0, 0);

        assertOutEquals("");
    }
}