package com.epam.training.task_10;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Random;

public class AirlineCompany {

	Airline[] a;

	public AirlineCompany() {
		super();

		this.a = new Airline[] { new Airline(342, "Moscow", "DC-8", AirlineCompany.time(), dayW()),
				new Airline(761, "Berlin", "Airbus A320", AirlineCompany.time(), dayW()),
				new Airline(641, "Tokyo", "L-049 Constellations", AirlineCompany.time(), dayW()),
				new Airline(056, "London", "Boeing 747", AirlineCompany.time(), dayW()),
				new Airline(184, "Washington", "Tu-144", AirlineCompany.time(), dayW()) };

	}

	private static Clock time() {
		Clock t = new Clock((long) (Math.random() * 3600 * 24), 0);
		return t;
	}

	private static DayOfWeek dayW() {
		DayOfWeek d = randomEnum(DayOfWeek.class);
		return d;
	}

	private static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		Random random = new Random();
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

	public void print() {
		Sorter.sortw(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void printDestin(String s) {
		Sorter.sortw(a);
		for (int i = 0; i < a.length; i++) {
			if (s.equalsIgnoreCase(a[i].getDestination())) {
				System.out.println(a[i].getDestination());
			}
		}
	}

	public int printDestin() {
		int coun = 0;
		HashSet<String> set = new HashSet<String>();
		Sorter.sortw(a);
		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i].getDestination())) {
				System.out.println((i + 1) + " " + a[i].getDestination());
				coun++;
			}
		}
		return coun;
	}

	public void printDestin(int indx) {
		int count = 0;
		Sorter.sort(a, new ComparatorTime());

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i].getDestination())) {
				count++;
			}
			if (indx == count) {
				System.out.println(a[i]);
			}
		}
	}

	public void printWeekT(DayOfWeek d, Clock tim) {
		Sorter.sort(a, new ComparatorTime());
		for (int i = 0; i < a.length; i++) {
			if (d.equals(a[i].getDayOfWeek()) && (tim.getT() < a[i].getTime().getT())) {
				System.out.println(a[i].getTime() + " " + a[i].getDayOfWeek() + " " + a[i].getDestination());
			}
		}
	}

	public void printWeek(DayOfWeek d) {
		Sorter.sort(a, new ComparatorTime());
		for (int i = 0; i < a.length; i++) {
			if (d.equals(a[i].getDayOfWeek())) {
				System.out.println(a[i].getTime() + " " + a[i].getDayOfWeek() + " " + a[i].getDestination());
			}
		}
	}
}