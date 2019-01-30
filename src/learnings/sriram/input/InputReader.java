package learnings.sriram.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

	public static void main(String[] args) throws IOException {
		System.out.println("please enter some string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		System.out.println(str);

		InputStreamReader isr = new InputStreamReader(System.in);
		char[] cbuf = new char[100];
		int numberOfChars = isr.read(cbuf);

		System.out.println(numberOfChars + " chars entered");

	}

}
