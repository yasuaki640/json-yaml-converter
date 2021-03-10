import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("*** The JSON <-> YAML converter ***");
        System.out.println("Enter a path to target file -> ");

        var sc = new Scanner(System.in);
        String path = sc.next();
        List<String> texts = getText(path);
    }

    public static List<String> getText(String pathToFile) throws IOException {
        return Files
                .lines(Paths.get(pathToFile), StandardCharsets.UTF_8)
                .collect(Collectors.toList());
    }
}