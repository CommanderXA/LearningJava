import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators{
    public static void iterators() {

        try {
            Files.namesToList();
        } catch (Exception e) {
            System.out.println(e);
        }

        LinkedList<String> names = Files.names;
        List<String> names_a = Files.names_a;
        Iterator<String> iterator = names_a.iterator();
        ListIterator<String> it = names.listIterator();
        it.add("Amber");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String name : names) {
            // System.out.println(name);
        }
        System.out.println(names);
        System.out.println(iterator.hasNext());
    }
}
