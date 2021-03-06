import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** The JSON <-> YAML converter ***");

        System.out.println("Enter a path to target file -> ");
        var sc = new Scanner(System.in);
        sc.next();
    }

    public static List<String> getText(String pathToFile) {
        Paths.get(pathToFile);
        return new ArrayList<String>(Arrays.asList("string", "aaa"));
    }
}