package com.epam.training.task_10;

import java.util.Comparator;

public class ComparatorDest implements Comparator<Airline> {

	@Override
	public int compare(Airline arg0, Airline arg1) {
		return arg0.getDestination().compareTo(arg1.getDestination());
	}

}
