package learnings.sriram.puzzle;

import java.util.ArrayList;
import java.util.List;

public class StringPrinter {

	public static void main(String[] args) {
		String str = "abc";
		printAllStrings(str);

	}

	private static void printAllStrings(String baseStr) {
		System.out.println(baseStr.length());
		List<String> strings = new ArrayList<>();

		getAllPossibleStrings(strings, "", baseStr);

		System.out.println(strings);
		System.out.println(strings.size());

	}

	private static void getAllPossibleStrings(List<String> strings, String baseStr, String rotateStr) {
		if (rotateStr.length() == 0) {
			strings.add(baseStr);
			return;
		}

		for (int rotation = 0; rotation < rotateStr.length(); rotation++) {

			String rebaseStr = baseStr + rotateStr.charAt(rotation);
			String rtrStr = rotateStr.substring(0, rotation) + rotateStr.substring(rotation + 1, rotateStr.length());
			getAllPossibleStrings(strings, rebaseStr, rtrStr);
		}

	}

}
