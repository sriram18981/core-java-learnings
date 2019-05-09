package learnings.sriram.puzzle.rounded_grades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GradesRounded {

	static int[] gradingStudents(int[] grades) {
		return Arrays
				.stream(grades)
				.map(GradesRounded::round)
				.toArray();
	}

	private static int round(int i) {
		return i < 38 ? i : ((i % 5) > 2 ? i + 5 - i % 5 : i);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		gradingStudents(new int[] { 73, 67, 38, 33 });

	}

	public static void main1(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write("\n");
			}
		}

		bw.newLine();

		bw.close();
	}
}
