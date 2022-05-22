package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitSumTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        DigitSum digitSum = new DigitSum();

        digitSum.countSum(0);
        digitSum.countSum(63874624);

        assertOutEquals("0\n40\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/DigitSum.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
