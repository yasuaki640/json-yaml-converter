package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTypeDiscriminatorTests {

    @Test
    void test_discriminateFileType_json() throws Exception {
        FileType type = FileTypeDiscriminator.discriminateFileType("./src/test/java/data/data.json");
        assertEquals(type, FileType.JSON);
    }

    @Test
    void test_discriminateFileType_yml() throws Exception {
        FileType ymlType = FileTypeDiscriminator.discriminateFileType("./src/test/java/data/data.yml");
        assertEquals(ymlType, FileType.YAML);
    }

    @Test
    void test_discriminateFileType_yaml() throws Exception {
        FileType yamlType = FileTypeDiscriminator.discriminateFileType("./src/test/java/data/data.yaml");
        assertEquals(yamlType, FileType.YAML);
    }

    @Test
    void test_discriminateFileType_unsupported() throws Exception {
        assertThrows(
                Exception.class,
                () -> FileTypeDiscriminator.discriminateFileType("./unsupported.filetype"),
                "unsupported file type detected"
        );
    }
}