package learnings.sriram.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = { 1, 23, 12, 34, 56, 65, 43, 56, 78, 43, 54, 765, 5433, 234 };

		int[] sortedArr = insertionSortIntegers(intArray);

		printArray(sortedArr);
	}

	private static int[] insertionSortIntegers(int[] array) {

		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				int currentElement = array[i];
				int k = i - 1;
				while (k != 0 && array[k] >= currentElement) {
					array[k+1] = array[k];
					array[k] = currentElement;
					k--;
				}

			}
		}

		return array;
	}

	public static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]).append(',');
		}

		System.out.println(sb);
	}
}
