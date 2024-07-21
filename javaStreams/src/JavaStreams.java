import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        // 1 . Integer stream
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();
        //using skip method
       IntStream.range(1,10).skip(5).forEach(x -> System.out.println(x));
        // Integer stream with sum
        System.out.println(IntStream.range(1,10).sum());
        // stream.of , sort and findFirst
        Stream.of("sou","dough","saw").sorted().findFirst().ifPresent(System.out::println);
        // Stream from an array , sort , filter ,print
        String[] names ={"ahmed","sidi ahmed ","anvar","khaled"};
        Arrays.stream(names) // we could use stream.of(names) instead
                .filter(x -> x.startsWith("a")).sorted().forEach(x-> System.out.println(x));
        // Average of squares
        Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10} ).map(x -> x * x).average().ifPresent(System.out::println);
        //stream from a list filter , sort , print
        List<String> people = Arrays.asList("AhmEd ","Sidi aHMed","khaLed","AnVar","DAH");
        people.stream()
                .map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);


    }
}
