package learnings.sriram.collections.streams;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class StreamsTester {

    public static void main(String[] args) {
	List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	// Find all even numbers, double each number and add all numbers
	Integer sum = integers.stream()
			      .filter(e -> e % 2 == 0)
			      .map(e -> e * 2)
			      .reduce(0, (a, b) -> a + b);

	System.out.println(sum);

	int sum2 = integers.stream()
			   .filter(StreamsTester::isEven)
			   .map(StreamsTester::doubleTheNumber)
			   .reduce(0, (a, b) -> a + b);

	System.out.println(sum2);

	int sum3 = integers.stream()
			   .filter(StreamsTester::isEven)
			   .mapToInt(StreamsTester::doubleTheNumber)
			   .sum();

	System.out.println(sum3);

	// Find all numbers are even or not
	boolean allEvenNumbers = integers.stream()
					 .allMatch(StreamsTester::isEven);
	System.out.println("All are even numbers :: " + allEvenNumbers);

	// Find at least one even number exists in the list
	boolean anyEvenNumber = integers.stream()
					.anyMatch(StreamsTester::isEven);

	System.out.println("Atleaset one even number :: " + anyEvenNumber);

	List<Integer> integers2 = List.of(2, 3, 1, 6, 4, 7, 7, 9, 8, 10, 5, 2, 54);

	// find the ANY occurrence of an element in the list. Result behavior is not
	// guaranteed. Varies again with parallelism
	integers2.parallelStream()
//	integers2.stream()
		 .filter(StreamsTester::isEven)
		 .findAny()
		 .ifPresent(System.out::println);

	integers2.stream()
		 .filter(e -> e > 12)
		 .findAny()
		 .ifPresentOrElse(e -> System.out.println("Found!!" + e), () -> System.out.println("Not Found!!!@@@"));

	// skip the elements till element with value 10 is found and return the
	// remaining elements
	System.out.println(integers2.stream()
				    .dropWhile(e -> e < 7)
				    .collect(toList()));

	System.out.println(integers2.stream()
				    .dropWhile(e -> e < 7)
				    .collect(toSet()));

	// skip all elements till element greater than 10 is found, again from the
	// resulting
	// list, skip all elements which are present till element less than7 is found
	System.out.println(integers2.stream()
				    .takeWhile(e -> e < 10)
				    .dropWhile(e -> e < 7)
				    .collect(toList()));
	
	
	System.out.println("******************************************************************************");

	List<Integer> randomIntegers = new ArrayList<>(10000);
	Random random = new Random();
	
	
	randomIntegers = Stream.iterate(1, e -> e < 10000, e -> e+=1).map(e -> random.nextInt()).collect(toList());
	
	// find the maximum element in the given stream
	System.out.println(randomIntegers.parallelStream()
				    .max((a, b) -> a - b));

	System.out.println(randomIntegers.parallelStream()
				    .collect(maxBy(Comparator.naturalOrder())));

	System.out.println("******************************************************************************");

	// find the minimum element in the given stream
	long start = System.currentTimeMillis();
	System.out.println(randomIntegers.parallelStream()
				    .min((a, b) -> a - b));
	System.out.println(System.currentTimeMillis() - start);

	start = System.currentTimeMillis();
	System.out.println(randomIntegers.stream()
				    .min((a, b) -> a - b));
	System.out.println(System.currentTimeMillis() - start);

	start = System.currentTimeMillis();
	System.out.println(randomIntegers.parallelStream()
				    .collect(minBy(Comparator.naturalOrder())));
	System.out.println(System.currentTimeMillis() - start);

	start = System.currentTimeMillis();
	System.out.println(randomIntegers.stream()
				    .collect(minBy(Comparator.naturalOrder())));
	System.out.println(System.currentTimeMillis() - start);
	
	System.out.println("Sorting**********************************" +  randomIntegers.get(100));
	
	start = System.currentTimeMillis();
	List<Integer> sortedList = randomIntegers.stream().sorted().limit(1000).collect(toList());
	System.out.println(System.currentTimeMillis() - start);
	System.out.println("Sorting**********************************" +  sortedList.get(100));
	
	System.out.println("parallel Sorting**********************************" +  randomIntegers.get(100));
	
	start = System.currentTimeMillis();
	sortedList = randomIntegers.parallelStream().sorted().limit(1000).collect(toList());
	System.out.println(System.currentTimeMillis() - start);
	System.out.println("parallel Sorting**********************************" +  sortedList.get(100));
	

    }

    /**
     * Find out whether the given number is even or not
     * 
     * @param i
     * @return
     */
    public static boolean isEven(int i) {
	return i % 2 == 0;
    }

    /**
     * Double the given number
     * 
     * @param i
     * @return
     */
    public static int doubleTheNumber(int i) {
	return i * 2;
    }

}
