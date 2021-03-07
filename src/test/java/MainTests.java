import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTests {

    @Test
    void test_getText_success() throws IOException {
        List<String> lines = Main.getText("./src/test/java/data/data.json");
        assertEquals(lines.get(0), "{");
        assertEquals(lines.get(1), "  \"id\": 1,");
        assertEquals(lines.get(2), "  \"name\": \"mio imada\",");
    }

    @Test
    void test_getText_failure() throws IOException {
        assertThrows(IOException.class, () -> Main.getText("./path/to/not/exist/file"));
    }
}
