package loops.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsBuilderTest extends BaseIOTest {

    @Test
    void buildPhraseBuildsAPhrase() {
        WordsBuilder builder = new WordsBuilder();

        builder.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');

        assertOutEquals("loops are cool");
    }
}