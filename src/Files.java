import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {
    public static void namesToList() throws FileNotFoundException {
        File file = new File("hello.txt");
        Scanner scanner = new Scanner(file);

        List<String> names_a = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            names_a.add(scanner.nextLine());
        }
        scanner.close();
        System.out.println(names_a);
    }
}
