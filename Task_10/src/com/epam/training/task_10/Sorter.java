package com.epam.training.task_10;

import java.util.Comparator;

public class Sorter {
	public static <TTT> void sort(TTT[] book, Comparator<TTT> comp) {
		int ii;
		TTT bu;
		for (int i = book.length - 2; i >= 0; i--) {
			bu = book[i];
			for (ii = i; (ii < book.length - 1) && comp.compare(book[ii + 1], bu) < 0; ii++) {
				book[ii] = book[ii + 1];
			}
			book[ii] = bu;
		}

	}

	public static <TTT extends Comparable<TTT>> void sortw(TTT[] book) {
		int ii;
		TTT bu;
		for (int i = book.length - 2; i >= 0; i--) {
			bu = book[i];
			for (ii = i; (ii < book.length - 1) && (book[ii + 1].compareTo(bu)) < 0; ii++) {
				book[ii] = book[ii + 1];
			}
			book[ii] = bu;
		}

	}

}
