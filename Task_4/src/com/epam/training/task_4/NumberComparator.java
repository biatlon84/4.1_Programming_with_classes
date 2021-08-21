package com.epam.training.task_4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Train> {

	@Override
	public int compare(Train arg0, Train arg1) {
		long di = arg0.getNumber() - arg1.getNumber();
		di = di < 0 ? -1 : (di > 0 ? 1 : 0);
		return (int) di;
	}

}
