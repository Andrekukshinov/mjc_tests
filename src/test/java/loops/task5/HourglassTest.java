package loops.task5;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourglassTest extends BaseIOTest {

    @Test
    void printHourglassOfGivenSizePrintsHourglass() {
        String expected = "88888\n" +
                " 888 \n" +
                "  8  \n" +
                " 888 \n" +
                "88888\n";

        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(5);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsHourglassEven() {
        String expected = "888888\n" +
                " 8888 \n" +
                "  88  \n" +
                "  88  \n" +
                " 8888 \n" +
                "888888\n";


        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(6);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsSmallestHourglass() {
        String expected =  "888\n" +
                " 8 \n" +
                "888\n";


        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(3);

        assertOutEquals(expected);
    }

    @Test
    void printHourglassOfGivenSizePrintsNothing() {

        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(0);


        assertOutEquals("");
    }
}