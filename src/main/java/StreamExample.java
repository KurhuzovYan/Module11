import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public String getOddIndexOfNames(List<String> str) {
        return IntStream.range(0, str.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + "." + str.get(i))
                .collect(Collectors.joining(", "));
    }

    public List<String> getSortedNamesInUpperCase(List<String> str) {
        return str.stream()
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public String getSortedNumbers(String[] num) {
        return Arrays.stream(num)
                .map(x -> x.replaceAll("\\s+", "").split(","))
                .flatMap(x -> Arrays.stream(x))
                .sorted()
                .collect(Collectors.joining(", "));
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