package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeSumTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        RangeSum rangeSum = new RangeSum();

        rangeSum.countSum(-50, 50);
        rangeSum.countSum(10, 10);
        rangeSum.countSum(20, 25);
        assertOutEquals("0\n10\n135\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/RangeSum.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
