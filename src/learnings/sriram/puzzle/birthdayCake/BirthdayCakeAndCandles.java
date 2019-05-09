package learnings.sriram.puzzle.birthdayCake;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BirthdayCakeAndCandles {


    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
		int highestElement = 0;
		int occurances = 0;

		for (int i = 0; i < ar.length; i++) {
			if (highestElement < ar[i]) {
				highestElement = ar[i];
				occurances = 1;
			} else if (highestElement == ar[i]) {
				occurances++;
			}
    	}
    	System.out.println("Highest number :: "+highestElement);
    	return occurances;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
		int number = birthdayCakeCandles(new int[] {2,3,2,1,4,5,4,3,2,4});
		System.out.println(number);
	}

    public static void main1(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
