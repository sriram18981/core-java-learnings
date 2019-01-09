package learnings.sriram.enums;

import java.util.Arrays;

public class EnumTester {

	public static void main(String[] args) {

		Arrays.stream(Month.values()).forEach(month -> {

			System.out.println(month + " :: " + month.getDays());
		});

		Arrays.stream(Month.values()).filter(month -> {
			return month.days < 31;
		}).forEach(EnumTester::doSomething);

		int daysInyear = Arrays.stream(Month.values())
								.mapToInt(Month::getDays)
								.sum();
		int days30s = Arrays.stream(Month.values())
							.filter(Month::has30Days)
							.mapToInt(Month::getDays)
							.sum();
		
		int days31s = Arrays.stream(Month.values())
				.filter(Month::has31Days)
				.mapToInt(Month::getDays)
				.sum();
		
		//Arrays.stream(Month.values()).

		System.out.println(String.format("OH!! the total number of days in an year :: %d", daysInyear));
		System.out.println(String
				.format("OH!! the total number of days in an year for months which have only 30 days :: %d", days30s));
		System.out.println(String
				.format("OH!! the total number of days in an year for months which have only 31 days :: %d", days31s));

	}

	static void doSomething(Month month) {
		System.out.println(month);
		switch (month) {
		case APR:
			System.out.println("Special month April");
			break;
		default:
			System.out.println("Nothing special");
		}
	}

}
