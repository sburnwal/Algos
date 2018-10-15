package demos.problems.sorting;

import java.util.Random;

import org.testng.annotations.Test;

import demos.util.Logger;

public class QuickSortTest {
	@Test public void test10Nums() {
		Logger.log("################## QuickSortTest.test10Nums() ###########");
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(100);
			sb.append(data[i]).append(' ');
		}
		
		Logger.log("Numbers before sorting: " + sb.toString());
		long start = System.currentTimeMillis();
		QuickSort.sort(data);
		long end = System.currentTimeMillis();
		
		sb.setLength(0);
		for(int i = 0; i < data.length; i++) {
			sb.append(data[i]).append(' ');
		}
		Logger.log("Numbers after sorting: " + sb.toString());
		Logger.log("Time taken (msec): " + (end- start));
	}
	
	@Test public void test40Nums() {
		Logger.log("################## QuickSortTest.test40Nums() ###########");
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		int[] data = new int[40];
		for(int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(400);
			sb.append(data[i]).append(' ');
		}
		
		Logger.log("Numbers before sorting: " + sb.toString());
		long start = System.currentTimeMillis();
		QuickSort.sort(data);
		long end = System.currentTimeMillis();
		
		sb.setLength(0);
		for(int i = 0; i < data.length; i++) {
			sb.append(data[i]).append(' ');
		}
		Logger.log("Numbers after sorting: " + sb.toString());
		Logger.log("Time taken (msec): " + (end- start));
	}
}
