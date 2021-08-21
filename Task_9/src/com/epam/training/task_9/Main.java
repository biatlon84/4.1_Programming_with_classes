package com.epam.training.task_9;

import java.util.List;

//Create a Book class, the specification of which is given below. Define constructors, set- and get- methods, and
//toString () method. Create a second class aggregating an array of type Book with appropriate constructors and
//methods. Set the criteria for selecting data and display this data on the console.
// 
//Book: id, title, author (s), publisher, year of publication, number of pages, price, type of binding.
//Find and withdraw:
//a) a list of books by a given author;
//b) a list of books published by a given publisher;
//c) a list of books released after a given year.
public class Main {
	public static void main(String[] args) {

		Library l = new Library();
		List<String> au;
		int ti = 0;
		String stri = "";
		Scann sc = new Scann();
		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter 1 to get a list of books published by a given publisher");
			System.out.println("Enter 2 to get books from a certain author, and enter the required");
			System.out.println("Enter 3 for a list of books released after a given year");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			ti = sc.s(4);
			if (ti == 2) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter 1 to get a list of authors and enter the name");
				System.out.println("Enter 2 to get a list of authors,and enter the desired number");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ti = sc.s(3);
				if (ti == 1) {
					l.printAutors();
					stri = sc.str(64);
					l.printAutor(stri);
				} else {
					au = l.printAutors();
					ti = sc.s(l.AmountAutor() + 1);
					l.printAutor(au.get(ti - 1));
				}
			} else if (ti == 1) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter 1 for a list of books, by enter a publisher");
				System.out.println("Enter 2 to get a list of books,and enter the desired number");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ti = sc.s(3);
				if (ti == 1) {
					l.printPublish();
					stri = sc.str(64);
					l.printPublish(stri);
				} else {
					au = l.printPublish();
					ti = sc.s(l.AmountPublish() + 1);
					l.printPublish(au.get(ti - 1));
				}
			} else if (ti == 3) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter the year after which the books were published");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ti = sc.s(2050);
				l.printY((short) ti);
			}
		}
//		System.out.print("gr");
	}
}
