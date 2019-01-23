import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTester1{
    static int[] integers = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args){
       Stream<int[]> stream = Stream.of(integers);
       stream.forEach(System.out::println);
    }

    
}