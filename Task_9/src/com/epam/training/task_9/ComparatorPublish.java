package com.epam.training.task_9;

import java.util.Comparator;

public class ComparatorPublish implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return arg0.getPublisher().compareTo(arg1.getPublisher());

	}

}
