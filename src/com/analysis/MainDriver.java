package com.analysis;

import com.analysis.sort.insertion.InsertionSortDriver;
import com.analysis.sort.merge.MergeSortDriver;

public class MainDriver {
	public static void main(String[] args) {

		new InsertionSortDriver().run();

		new MergeSortDriver().run();

	}

}
