import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** The JSON <-> YAML converter ***");

        System.out.println("Enter a path to target file -> ");
        var sc = new Scanner(System.in);
        sc.next();
    }

    public static List<String> getText(String pathToFile) throws IOException {
        var path = Paths.get(pathToFile);
        try {
            return Files.lines(path, StandardCharsets.UTF_8)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("File doesnt exists.");
            throw e;
        }
    }
}