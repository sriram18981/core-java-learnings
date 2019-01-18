package learnings.sriram.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTester1 {

	public static void main(String[] args) {
		int[] intArray = { 1, 23, 12, 34, 56, 65, 43, 56, 78, 43, 54, 765, 5433, 234 };

		int[] sortedArr = mergeSortIntegers(intArray);
		
		printArray(sortedArr);

	}

	private static int[] mergeSortIntegers(int[] intArray) {
		// 0. if the array has only one element, it is already sorted
		if (intArray.length == 1) {
			return intArray;
		}

		// 1. Split the array into two halves
		int middle = intArray.length / 2;
		int[] left = copySubArray(intArray, 0, middle);
		printArray(left);

		int[] right = copySubArray(intArray, middle, intArray.length);
		printArray(right);

		// 2. Sort each half
		left = mergeSortIntegers(left);
		right = mergeSortIntegers(right);

		// 3. Merge the halves
		int[] sortedArr = mergeArrays(left, right);

		// 4. return merged array
		return sortedArr;

	}

	private static int[] mergeArrays(int[] left, int[] right) {
		int[] mergedArr = new int[left.length + right.length];

		int l = 0, r = 0, m = 0;
		for (m = 0; m < mergedArr.length; m++) {
			if ((l < left.length && r < right.length)) {
				if (left[l] < right[r]) {
					mergedArr[m] = left[l];
					l++;
				} else {
					mergedArr[m] = right[r];
					r++;
				}
			} else { break; }
		}

		if (l == left.length) {
			for (; r < right.length; r++) {
				mergedArr[m++] = right[r];
			}
		} else {
			for (; l < left.length; l++) {
				mergedArr[m++] = left[l];
			}
		}

		return mergedArr;
	}

	private static int[] copySubArray(int[] intArray, int begin, int end) {
		int[] arr = new int[end - begin];

		for (int i = 0, itr = begin; i < arr.length; i++, itr++) {
			arr[i] = intArray[itr];
		}

		return arr;
	}

	public static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]).append(',');
		}

		System.out.println(sb);
	}

}
