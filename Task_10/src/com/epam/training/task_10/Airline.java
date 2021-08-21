package com.epam.training.task_10;

import java.time.DayOfWeek;

public class Airline implements Comparable<Airline> {
	private long flightNumber;
	private String destination;
	private String type;
	private Clock time;
	private DayOfWeek dayOfWeek;

	public Airline(long flightNumber, String destination, String type, Clock time, DayOfWeek dayOfWeek) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.type = type;
		this.time = time;
		this.dayOfWeek = dayOfWeek;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Clock getTime() {
		return time;
	}

	public void setTime(Clock time) {
		this.time = time;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Flight[Number=" + flightNumber + ", destination=" + destination + ", type=" + type + ", time=" + time
				+ ", dayOfWeek=" + dayOfWeek + "]";
	}

	@Override
	public int compareTo(Airline arg0) {

		return this.getTime().compareTo(arg0.getTime());
	}

}
