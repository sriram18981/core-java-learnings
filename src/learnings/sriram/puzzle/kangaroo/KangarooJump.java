package learnings.sriram.puzzle.kangaroo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KangarooJump {

	private static final String YES = "YES";
	private static final String NO = "NO";

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {

		if (x1 < x2 && v1 < v2) {
			return NO;
		}

		int k1Location = 0;
		int k2Location = 0;

		for (int step = 1; step < 10_000; step++) {
			k1Location = x1 + v1 * step;
			k2Location = x2 + v2 * step;

			if (k1Location == k2Location) {
				return YES;
			}
			if (k1Location > k2Location) {
				return NO;
			}
			if (x2 - x1 < k2Location - k1Location) {
				return NO;
			}

		}

		return NO;
	}

	public static void main(String[] args) {

		System.out.println(kangaroo(0, 2, 5, 3));
		System.out.println(kangaroo(0, 3, 4 ,2));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main1(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
