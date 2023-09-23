package com.analysis.sort.insertion;

import com.analysis.generator.Generator;

public class InsertionSortDriver {
	
	public void run() {
		
		int[] nValues = { 10, 25, 50, 100, 250, 500};
		
		long startTime = System.nanoTime();

		for(int n:nValues) {
			int array[] = new Generator().generateArray(n); // INPUT

			new InsertionSort().applySort(array);

			// Print array
			//for(int a:array) System.out.print(a+" ");

			long endTime = System.nanoTime();

			long executionTime = endTime - startTime;

			System.out.println("Insertion Sort Execution time for n=" + n + ": " + executionTime + " ms");
		}
	}

}
