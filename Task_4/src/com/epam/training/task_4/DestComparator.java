package com.epam.training.task_4;

import java.util.Comparator;

public class DestComparator implements Comparator<Train> {

	@Override
	public int compare(Train arg0, Train arg1) {
		int w = arg0.getDestinationName().compareTo(arg1.getDestinationName());
		if (w == 0) {
			w = arg0.getData().compareTo(arg1.getData());
		}
		return w;
	}

}
