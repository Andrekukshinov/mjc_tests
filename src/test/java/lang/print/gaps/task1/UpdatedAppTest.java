package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpdatedAppTest extends BaseIOTest {

    @Test
    void mainUpdated() {
        UpdatedApp.main(null);

        Assertions.assertEquals("updated\n", updateLineSpliterators(outContent.toString()));
    }
}