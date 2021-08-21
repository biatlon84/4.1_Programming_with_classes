package com.epam.training.task_8;

import java.util.Comparator;

public class ComparatorLexicph implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		int w = arg0.getLastName().compareTo(arg1.getLastName());
		return w;
	}

}
