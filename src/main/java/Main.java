import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Kolya");
        names.add("Katya");
        names.add("Zhenya");
        names.add("Oleg");
        names.add("Anya");
        names.add("Sergey");
        names.add("Pavel");

        StreamExample se = new StreamExample();
        System.out.println(names);
        se.getOddIndexOfNames(names);
        System.out.println();
        se.getSortedNamesInUpperCase(names);


    }
}