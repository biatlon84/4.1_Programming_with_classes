package com.epam.training.task_4;

import java.util.ArrayList;
import java.util.List;

public class Railway {

	private List<Station> station = new ArrayList<Station>();
	// private List<Train> train = new ArrayList<Train>();

	public Railway() {
		this.station.add(new Station("Brest-Yuzhniy (Southern), BEL"));
		this.station.add(new Station("Porechye, BEL"));
		this.station.add(new Station("Zakopytye, BEL"));
		this.station.add(new Station("Pinsk, BEL"));
		this.station.add(new Station("Saltanovka, BEL"));
		this.station.add(new Station("Benyakonye, BEL"));

		for (int i = 0; i < station.size(); i++) {
			for (int ii = 0; ii < 5; ii++) {// train arrival
				station.get(i).arriveTrain(new Train(station), station);
			}
		}
	}

	public Station getStation(String x) {
		for (int i = 0; i < station.size(); i++) {
			if (station.get(i).toString().equals(x)) {
				return station.get(i);
			}
		}
		return null;
	}

	public Station getStationIx(int i) {
		if (i < station.size()) {
			return station.get(i);
		}
		return null;
	}

	public void addStation(Station station) {
		this.station.add(station);
	}

	public int amount() {

		return station.size();
	}

}
