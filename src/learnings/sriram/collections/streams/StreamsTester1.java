package learnings.sriram.collections.streams;

import java.util.Arrays;

public class StreamsTester1 {
	static int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {
		Arrays.stream(integers).forEach(System.out::println);
	}

}