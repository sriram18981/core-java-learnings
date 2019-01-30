package learnings.sriram.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = { 1, 23, 12, 34, 56, 65, 43, 56, 78, 43, 54, 765, 5433, 234 };

		int[] sortedArr = bubbleSort(intArray);

		printArray(sortedArr);
	}

	private static int[] bubbleSort(int[] array) {

		boolean swap = false;
		
		do {
			swap = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swap = true;
				}
			}
			
		} while (swap);

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
