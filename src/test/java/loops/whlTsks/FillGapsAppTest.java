package loops.whlTsks;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FillGapsAppTest extends BaseIOTest {

    @Test
    public void powerOfTwoTest() {
        String expected =
                "1\n" +
                "2\n" +
                "4\n" +
                "8\n" +
                "16\n";
        Main main = new Main();

        main.powerOfTwo(4);

        assertEquals(expected, updateLineSpliterators(outContent.toString()));
    }

    @Test
    public void containsWhileLoops() throws IOException {
        Path path = Paths.get("src/main/java/loops/whlTsks/Main.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line -> line.contains("while") && !line.contains("->") && !line.contains("for"))
                .collect(Collectors.toList());

        assertEquals(1, result.size());
    }
}