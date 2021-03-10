import org.junit.jupiter.api.Test;
import util.FileType;

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

    @Test
    void test_discriminateFileType_json() throws Exception {
        FileType type = Main.discriminateFileType("./src/test/java/data/data.json");
        assertEquals(type, FileType.JSON);
    }

    @Test
    void test_discriminateFileType_yml() throws Exception {
        FileType ymlType = Main.discriminateFileType("./src/test/java/data/data.yml");
        assertEquals(ymlType, FileType.YAML);
    }

    @Test
    void test_discriminateFileType_yaml() throws Exception {
        FileType yamlType = Main.discriminateFileType("./src/test/java/data/data.yaml");
        assertEquals(yamlType, FileType.YAML);
    }

    @Test
    void test_discriminateFileType_unsupported() throws Exception {
        assertThrows(
                Exception.class,
                () -> Main.discriminateFileType("./unsupported.filetype"),
                "unsupported file type detected"
        );
    }

}
