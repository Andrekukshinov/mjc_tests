package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        Fibonacci fibonacci = new Fibonacci();

        fibonacci.printFibonacci(0);
        fibonacci.printFibonacci(1);
        fibonacci.printFibonacci(2);
        fibonacci.printFibonacci(10);

        assertOutEquals("0\n0\n1\n0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/Fibonacci.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
