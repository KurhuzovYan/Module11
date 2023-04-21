import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public void getOddIndexOfNames(List<String> str) {
        Map<Integer, String> namesMap = new HashMap<>();

        for (int i = 0; i < str.size(); i++) {
            namesMap.put(i, str.get(i));
        }

        Map<Integer, String> sortedNames = namesMap.entrySet().stream()
                .filter(n -> n.getKey() % 2 == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        String res = sortedNames.entrySet().stream()
                .map(n -> n.getKey() + ". " + n.getValue())
                .collect(Collectors.joining(", "));

        System.out.println(res);
    }

    public void getSortedNamesInUpperCase(List<String> str) {
        String res = str.stream()
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));

        System.out.println(res);
    }

    public void getSortedNumbers(String[] num) {
        String collect = Arrays.stream(num)
                .collect(Collectors.joining(", "));

        String res = Arrays.stream(collect.split(" "))
                .sorted()
                .map(n -> n + " ")
                .collect(Collectors.joining());

        System.out.println(res);
    }

    public Stream<Long> infinityStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            list.add(iteratorFirst.next());
            list.add(iteratorSecond.next());
        }
        return list.stream();
    }
}