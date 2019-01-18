package learnings.sriram.streams.collectors;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import learnings.sriram.enums.Month;

public class CollectorTester {
	public static void main(String[] args) {
		
		Set<Month> months = Arrays.stream(Month.values()).collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println( months); // Enums are sorted by the ordinal number
		
		
		
		// Filter the months 
		List<Month> filteredMonths = months.stream()
				.filter(month -> month.getDays() > 30)
				.collect(Collectors.toList());
		
		System.out.println(filteredMonths);
		
		
		// Group by the number of days in a month
		Map<Integer, List<Month>> groupedMonths = months.stream().collect(Collectors.groupingBy(Month::getDays));
		System.out.println(groupedMonths);
		
		// Group the months by the first letter of the month name
		Map<Object, List<Month>> groupByFirstChar = months.stream().collect(Collectors.groupingBy(month -> month.getName().charAt(0)) );
		System.out.println(groupByFirstChar);
		
		// Group the month names by the first letter
		Map<Character, List<String>> groupByFirstLetter = months.stream()
										.map(month -> month.getName())
										.collect(Collectors.groupingBy(name -> name.charAt(0)));
		
		System.out.println(groupByFirstLetter);
		
		
		
		EnumSet<Month> monthsSet = EnumSet.allOf(Month.class);
		System.out.println(monthsSet);
		
	}

}
