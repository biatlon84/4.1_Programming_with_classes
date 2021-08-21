package com.epam.training.task_4;

import java.sql.Date;
import java.util.List;

public class Train implements Comparable<Train> {

	private long number;
	private Station destination;
	private String destinationName;// this field is not needed
	private Date data = new Date(System.currentTimeMillis());

	public Train(List<Station> r) {
		super();
		this.number = (long) (Math.random() * 604800);
		int i = (int) (Math.random() * r.size());
		this.destination = r.get(i);
		this.destinationName = this.destination.getStstionName();
		this.data = new Date(System.currentTimeMillis() + (long) (Math.random() * 604800 * 1000));
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Station getDestination() {
		return destination;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
		this.destinationName = destination.name;
	}

	@Override
	public int compareTo(Train arg0) {
		return destinationName.compareTo(arg0.getDestinationName());
	}

}
