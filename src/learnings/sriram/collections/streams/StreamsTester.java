package learnings.sriram.collections.streams;

import java.util.List;

public class StreamsTester {

    public static void main(String[] args) {
	List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	Integer sum = integers.stream()
			      .filter(e -> e % 2 == 0)
			      .map(e -> e * 2)
			      .reduce(0, (a, b) -> a + b);

	System.out.println(sum);
    }
}
