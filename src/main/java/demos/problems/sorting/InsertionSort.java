package demos.problems.sorting;

/**
 * Insertion sort is also one of the easy sort algorithms that works well
 * for small data sets (10 elements or so). Algo has 2 lists - noe sorted 
 * and another unsorted. You pick one element from the unsorted list and
 * put it at the right place in the sorted list. 
 *
 * Order is O(n2) and also involves as many swaps in the worst case
 */
public class InsertionSort {
	public static void sort(int[] data) {
		
		for(int i = 0; i < data.length; i++) {	
			/* if you start comparing from the left, after you find the correct position
			 * for the picked element, you will need to shift the elements right of its
			 * correct position. So do the comparison from the right.  
			 */
			for(int k = i; k > 0; k--) {
				if(data[k] < data[k-1]) {
					//swap the elements
					int temp = data[k-1];
					data[k-1] = data[k];
					data[k] = temp;
				}
			}
		}
	}
}
