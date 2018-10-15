package demos.problems.sorting;

import demos.util.Logger;

/**
 * Quicksort is a divide and conquer algorithm. Quicksort first divides a large array 
 * into two smaller sub-arrays: the low elements and the high elements. Quicksort can 
 * then recursively sort the sub-arrays. The steps are:
 * 
 * 1. Pick an element (start or end), called a pivot, from the array.
 * 2. Partitioning: reorder the array so that all elements with values less than the pivot 
 * come before the pivot, while all elements with values greater than the pivot come after it 
 * (equal values can go either way). After this partitioning, the pivot is in its final position. 
 * This is called the partition operation.
 * 3. Recursively apply the above steps to the sub-array of elements with smaller values and 
 * separately to the sub-array of elements with greater values.
 * 
 * This is one of the efficient sorting algos and for practical data sets (where elements are 
 * in random order), it works well. Worst case complexity is O(n2) and average case is O(n log n).
 */
public class QuickSort {
	public static void sort(int[] data) {
		quicksort(data, 0, data.length - 1);
	}
	
	private static void quicksort(int[] data, int start, int end) {
		if(start < end) {
			int pivotIndex = partition(data, start, end);
			log(data);
			quicksort(data, start, pivotIndex - 1);
			quicksort(data, pivotIndex + 1, end);
		}
	}
	
	private static int partition(int[] data, int start, int end) {
		int pivot = data[start];	//consider start element as the pivot element
		int i = start + 1;
		
		/* consider the array other than pivot (j = start+1). After the loop, you will 
		 * get the index i (actually i-1) where the pivot should be placed.  
		 */ 
		for(int j = start + 1; j <= end; j++) {
			if(data[j] < pivot) {
				// swap data[j] and data[i] and increment i
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				
				i = i + 1;
			}
		}
		
		//now keep pivot element at i - 1 (pivotIndex)
		int temp = data[i - 1];
		data[i - 1] = data[start];
		data[start] = temp;
		
		return i - 1;
	}
	
	private static void log(int[] data) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < data.length; i++) {
			sb.append(data[i]).append(' ');
		}
		Logger.log(sb.toString());
	}
}
