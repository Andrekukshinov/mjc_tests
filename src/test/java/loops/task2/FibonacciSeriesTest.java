package loops.task2;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest extends BaseIOTest {

    @Test
    void printFibonacciPrintsFirstThree() {
        FibonacciSeries fibonacci = new FibonacciSeries();

        fibonacci.printFibonacci(3);

        assertOutEquals("0\n1\n1\n");
    }

    @Test
    void printFibonacciPrintsFirstFive() {
        FibonacciSeries fibonacci = new FibonacciSeries();

        fibonacci.printFibonacci(5);

        assertOutEquals("0\n1\n1\n2\n3\n");
    }

    @Test
    public void containsNoRecursion() throws IOException {
        Path path = Paths.get("src/main/java/loops/task2/FibonacciSeries.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("printFibonacci"))
                .collect(Collectors.toList());

        assertEquals(1, result.size());
    }

}