package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NinthSumTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        NinthSum ninthSum = new NinthSum();

        ninthSum.countSum(0);
        ninthSum.countSum(1);
        ninthSum.countSum(5);

        assertOutEquals("0\n9\n111105\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/NinthSum.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
