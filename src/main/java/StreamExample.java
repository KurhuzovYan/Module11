import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public void getOddIndexOfNames(List<String> str) {
        Map<Integer, String> namesMap = new HashMap<>();

        for (int i = 0; i < str.size(); i++) {
            namesMap.put(i, str.get(i));
        }

        Map<Integer, String> sortedNames = namesMap.entrySet().stream()
                .filter(n -> n.getKey() % 2 == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.print("List of odd names: ");

        sortedNames.entrySet().stream()
                .map(n -> n.getKey() + ". " + n.getValue() + ", ")
                .forEach(System.out::print);
    }

    public void getSortedNamesInUpperCase(List<String> str) {
        System.out.print("Sorted names in upper case: ");

        str.stream()
                .map(word -> word.toUpperCase() + ", ")
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }

    public String getSortedNumbers() {
            
        return "";
    }
}

