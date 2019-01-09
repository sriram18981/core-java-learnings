package learnings.sriram.streams.collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import learnings.sriram.enums.Month;

public class CollectorTester {
	public static void main(String[] args) {
		Set<Month> months = Arrays.stream(Month.values()).collect(Collectors.toSet());
		
		System.out.println( new TreeSet<Month>(months)); // Enums are sorted by the ordinal number
	}

}
