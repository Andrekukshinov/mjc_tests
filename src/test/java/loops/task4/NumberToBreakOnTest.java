package loops.task4;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NumberToBreakOnTest extends BaseIOTest {

    @Test
    void printNumbersUntilWithBreakOnPrintsNumbers() {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        numberToBreakOn.printNumbersUntilWithBreakOn(5, 10);

        assertOutEquals("1\n2\n3\n4\n5\n");
    }

    @Test
    void printNumbersUntilWithBreakOnIterateUntilBiggerThanBreakOn() {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        numberToBreakOn.printNumbersUntilWithBreakOn(11, 10);

        assertOutEquals("iterating till the end");
    }

    @Test
    public void containsInitialConfigAndBreak() throws IOException {
        Path path = Paths.get("src/main/java/loops/task4/NumberToBreakOn.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("break") || line.contains("int i = 0; i < numberToGoUntil; i++"))
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }
}