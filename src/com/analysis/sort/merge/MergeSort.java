package com.analysis.sort.merge;

public class MergeSort {

	public void applySort(int array[], int s, int e) {
		if (s >= e)
			return;
		int mid = (s + e) / 2;
		applySort(array, s, mid);
		applySort(array, mid + 1, e);
		merge(array, s, mid, e);
	}

	public void merge(int array[], int s, int mid, int e) {
		int aLength = mid - s + 1;
		int bLength = e - mid;
		int a[] = new int[aLength];
		int b[] = new int[bLength];
		for (int i = s; i <= mid; i++) {
			a[i - s] = array[i];
		}
		for (int j = mid + 1; j <= e; j++) {
			b[j - mid - 1] = array[j];
		}
		int pointer1 = 0, pointer2 = 0, p3 = s;
		while (pointer1 < aLength && pointer2 < bLength) {
			if (a[pointer1] <= b[pointer2]) {
				array[p3++] = a[pointer1++];
			} else {
				array[p3++] = b[pointer2++];
			}
		}
		while (pointer1 < aLength) {
			array[p3++] = a[pointer1++];
		}
		while (pointer2 < bLength) {
			array[p3++] = b[pointer2++];
		}
	}
}
