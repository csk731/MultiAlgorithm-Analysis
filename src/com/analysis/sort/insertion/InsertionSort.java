package com.analysis.sort.insertion;

public class InsertionSort {

	public void applySort(int[] randomArray) {
		int array[] = randomArray; // Input
		int N = array.length;

		for (int i = 0; i < N; i++) {
			int temp = array[i];
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > temp) {
					array[j + 1] = array[j];
				} else {
					array[j + 1] = temp;
					break;
				}
			}
		}
	}
}
