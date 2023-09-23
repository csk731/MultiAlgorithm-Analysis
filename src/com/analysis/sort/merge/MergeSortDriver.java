package com.analysis.sort.merge;

import com.analysis.generator.Generator;

public class MergeSortDriver {
	
	public void run() {
		int[] nValues = { 10, 25, 50, 100, 250, 500};
		

		long startTime = System.nanoTime();

		for(int n:nValues) {
			int array[] = new Generator().generateArray(n); // INPUT
		
			int N = array.length;

			new MergeSort().applySort(array, 0, N-1); // RECURSIVE CALL TO SORT

			// Print array
			//for(int a:array) System.out.print(a+" ");

			long endTime = System.nanoTime();

			long executionTime = endTime - startTime;

			System.out.println("Merge Sort Execution time for n=" + n + ": " + executionTime + " ms");
		}
	}

}
