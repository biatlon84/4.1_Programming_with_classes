package com.epam.training.task_10;

import java.time.DayOfWeek;

//Create an Airline class, the specification of which is given below. Define constructors, set and get methods, and the toString () method.
//Create a second class that aggregates the Airline array with appropriate constructors and methods.
//Set the criteria for selecting data and display this data on the console.
//
//Airline: destination, flight number, aircraft type, departure time, days of the week.
//
//Find and withdraw:
//a) a list of flights for a given destination;
//b) a list of flights for a given day of the week;
//c) a list of flights for a given day of the week, the departure time for which is greater than the given one.
public class Main {
	public static void main(String[] args) {
		String stri;
		AirlineCompany c = new AirlineCompany();
		int e;
		int ti;
		Scann sc = new Scann();
		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter 1 a list of flights for a given destination");
			System.out.println("Enter 2 a list of flights for a given day of the week");
			System.out.println(
					"Enter 3 a list of flights for a given day of the week, the departure time for which is greater than the given one");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			ti = sc.s(4);
			if (ti == 1) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter 1 to get a list of flights and enter the destination");
				System.out.println("Enter 2 to get a list of flights,and enter the desired number");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ti = sc.s(3);
				if (ti == 1) {
					c.printDestin();
					stri = sc.str(64);
					c.printDestin(stri);
				} else {
					e = c.printDestin();
					c.printDestin(sc.s(e + 1));
				}
			} else if (ti == 3) {
				System.out.println("Enter the day of the week");
				Clock time = new Clock(0, 0);
				for (int i = 1; i <= 7; i++) {
					System.out.println(i + " " + DayOfWeek.of(i));
				}
				e = sc.s(8);
				System.out.println("Selected - " + DayOfWeek.of(e));
				System.out.println("Enter hours");
				time.setTHoursL(sc.s(24));
				System.out.println("Enter minunes");
				time.setTMinutes(sc.s(60));
				System.out.println(time);
				c.printWeekT(DayOfWeek.of(e), time);
			} else if (ti == 2) {
				;
				System.out.println("Enter the day of the week");
				for (int i = 1; i <= 7; i++) {
					System.out.println(i + " " + DayOfWeek.of(i));
				}
				e = sc.s(8);
				c.printWeek(DayOfWeek.of(e));

			}
		}
	}
}
