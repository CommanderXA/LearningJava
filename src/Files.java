import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Files {

    public static LinkedList<String> names = new LinkedList<>();
    public static List<String> names_a = new ArrayList<>();

    static void namesToList() throws FileNotFoundException {
        File file = new File("hello.txt");
        Scanner scanner = new Scanner(file);

        int i = 0;
        while (scanner.hasNextLine()) {
            names_a.add(scanner.nextLine());
            names.push(names_a.get(i));
            i++;
        }
        scanner.close();
    }
}
