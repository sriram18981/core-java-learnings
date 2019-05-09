package learnings.sriram.puzzle.timeConversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	private static final Scanner scan = new Scanner(System.in);

	static String timeConversion(String s) {
		String[] tokens = s.split("\\:");
		String formattedStr = "";

		boolean isPM = tokens[2].contains("PM");
		int hours = Integer.parseInt(tokens[0]);

		if (isPM) {
			formattedStr = hours == 12 ? "12" : Integer.toString(hours + 12);

		} else {
			formattedStr = hours == 12 ? "00" : Integer.toString(hours);
			formattedStr = (formattedStr.length() == 1) ? "0".concat(formattedStr) : formattedStr;
		}

		formattedStr = formattedStr.concat(":").concat(tokens[1]).concat(":").concat(tokens[2].substring(0, 2));

		System.out.println(formattedStr);
		return formattedStr;
	}

	public static void main(String[] args) throws IOException {
		timeConversion("07:05:45PM");
		timeConversion("12:00:00AM");
		timeConversion("12:12:57PM");
		timeConversion("03:12:57PM");
		timeConversion("11:12:57AM");
		timeConversion("01:00:00AM");
		
	}

	public static void main1(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		bw.write(result);
		bw.newLine();

		bw.close();
	}
}
