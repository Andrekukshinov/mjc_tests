package loops.loopsFor;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlphabetTest extends BaseIOTest {

    @Test
    public void mainFunctionalityWorkCorrectly() {
        Alphabet alphabet = new Alphabet();

        alphabet.printAlphabet();

        assertOutEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ\n");
    }

    @Test
    public void requirementsMet() throws IOException {
        Path path = Paths.get("src/main/java/loops/loopsFor/Alphabet.java");
        List<String> strings = Files.readAllLines(path);
        boolean loopIsUsed = strings.stream()
                .anyMatch(line -> line.contains("while") || line.contains("for"));

        assertTrue(loopIsUsed);
    }
}
