package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RevertStringTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        RevertString revertString = new RevertString();

        revertString.revert("a");
        revertString.revert("asdf ghjkl");
        revertString.revert("");

        assertOutEquals("a\nlkjhg fdsa\n\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/RevertString.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));
        boolean stringRevertIsUsed = strings.stream()
                .anyMatch(line -> line.contains("String.revert"));

        assertTrue(loopIsUsed);
        assertFalse(stringRevertIsUsed);
    }
}
