package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GCSTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        GCD gcd = new GCD();

        gcd.findGCD(20, 155);
        gcd.findGCD(0, 0);
        gcd.findGCD(33, 189);
        gcd.findGCD(177, 83);

        assertOutEquals("5\n0\n3\n1\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/GCD.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
