package com.epam.training.task_9;

import java.util.Comparator;

public class ComparatorAutior implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {

		return arg0.getAuthor().compareTo(arg1.getAuthor());

	}

}
