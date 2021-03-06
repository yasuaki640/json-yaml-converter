import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {

    @Test
    void test_getText() {
        List<String> lines = Main.getText("./data/data.json");
        assertFalse(lines.isEmpty());
    }
}
