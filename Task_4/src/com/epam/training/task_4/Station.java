package com.epam.training.task_4;

import java.util.List;

public class Station {

	Train[] train = new Train[5];
	String name;

	int amountT = 0;

	public Station(String string) {
		this.name = string;
	}

	public void printScheduleSortByDestination() {
		DestComparator comp = new DestComparator();
		Sorter.sort(train, comp);
		Print.print(train, amountT);
	}

	public void printScheduleSortByNumber() {
		NumberComparator ncom = new NumberComparator();
		Sorter.sort(train, ncom);
		Print.print(train, amountT);
	}

	public void arriveTrain(Train train, List<Station> station) {
		while (true) {// the train must not arrive at the current station
			if (!this.equals(train.getDestination())) {
				this.train[amountT] = train;
				amountT++;
				break;
			} else {
				train.setDestination(station.get((int) (Math.random() * station.size())));
			}
		}
	}

	@Override
	public String toString() {
		return name;
	}

	public String getStstionName() {
		return name;

	}

}
