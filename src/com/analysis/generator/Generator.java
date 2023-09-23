package com.analysis.generator;

import java.util.Random;

public class Generator {
	public int[] generateArray(int size) {

		// Create a Random object
		Random random = new Random();

		// Create array and populate them with random data for each value of n
		int[] randomArray = new int[size];

		for (int i = 0; i < size; i++) {
			// Generates random integers from 0 to 1000
			randomArray[i] = random.nextInt(1001);
		}
		return randomArray;

	}
}
