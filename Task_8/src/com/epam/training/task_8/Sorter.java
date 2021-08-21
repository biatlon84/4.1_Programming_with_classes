package com.epam.training.task_8;

import java.util.Comparator;

public class Sorter {
	public static void sort(Customer[] train, Comparator<Customer> comp) {
		int ii;
		Customer bu;
		for (int i = train.length - 2; i >= 0; i--) {
			bu = train[i];
			for (ii = i; (ii < 4) && comp.compare(train[ii + 1], bu) < 0; ii++) {
				train[ii] = train[ii + 1];
			}
			train[ii] = bu;
		}

	}

}
