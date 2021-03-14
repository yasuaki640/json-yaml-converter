package util;

import java.util.Locale;

public class FileTypeDiscriminator {

    public static FileType discriminateFileType(String path) throws Exception {
        path = path.toLowerCase(Locale.ROOT);

        if (path.matches(".*\\.json")) {
            return FileType.JSON;
        } else if (path.matches(".*\\.ya*ml")) {
            return FileType.YAML;
        }

        throw new Exception("unsupported file type detected");
    }
}
