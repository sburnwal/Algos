package demos.problems.sorting;

import demos.util.Logger;

/**
 * One of the easy sort algos - at any time you have 2 lists, one sorted and
 * another unsorted. you pick (i.e. select) the smallest element from the 
 * unsorted list and place it at the end of the sorted list. Good for small data sets 
 * (less than 20 elements)
 * 
 * Complexity is O(n2) in the worst case
 */
public class SelectionSort {
	public static void sort(int[] data) {
		for(int i = 0; i < data.length; i++) {
			
			int smallIndex = i; int small = data[i];
			for(int j = i; j < data.length; j++ ) {
				if ( data[j] < small ) {
					small = data[j];
					smallIndex = j;
				}
			}
			
			//found the smallest element in the remaining list - exchange it with the last element of sorted list
			//Logger.log("Exchanging data[" + i + "] " + data[i] + " with data[" + smallIndex + "] " + data[smallIndex]);
			int temp = data[smallIndex];
			data[smallIndex] = data[i];
			data[i] = temp;
		}
	}
}
