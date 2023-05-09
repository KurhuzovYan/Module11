import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        StreamExample se = new StreamExample();
        List<String> list1 = Arrays.asList("Kolya", "Katya", "Zhenya", "Oleg", "Anya", "Sergey", "Pavel");
        List<String> list2 = Arrays.asList("Pavel", "Mikhail", "Zack", "Lina", "Alex", "Nika");

        System.out.println(se.getOddIndexOfNames(list1));
        System.out.println(se.getSortedNumbers(new String[]{"11, 22, 0", "4, 5"}));
        //se.infinityStream(25214903917l, 11, (long) Math.pow(2, 48), 1).forEach(System.out::println);
        System.out.println(se.zip(list1.stream(), list2.stream()).collect(Collectors.joining(", ")));
    }
}