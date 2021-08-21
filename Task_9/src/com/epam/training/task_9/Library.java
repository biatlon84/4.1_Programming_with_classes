package com.epam.training.task_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library {

	Book[] bArr = new Book[] {
			new Book(2286, 8888, 426, (short) 1993, "On LISP: Advanced Techniques for Common LISP", "Paul Graham",
					"Prentice Hall", Cover.HARDCOVER),
			new Book(6567, 16610, 234, (short) 1987, "Programming in Pascal. A practical guide.", "D. Price", "Peter",
					Cover.SOFTCOVER),
			new Book(1347, 15088, 192, (short) 1991, "Pascal in illustrations", "D. Alcock.", "Peter", Cover.HARDCOVER),
			new Book(6420, 10000, 160, (short) 1981, "Selected sketches by Kaminer and Liburkin", "Kofman R.M.",
					"Physical Culture and Sports", Cover.HARDCOVER),
			new Book(5672, 11060, 384, (short) 1987, "Service dog breeding", "Zubko Valerian Nikitovich", "DOSAAF",
					Cover.SOFTCOVER),
			new Book(8353, 20099, 1168, (short) 2019, "Thinking in Java", "Eckel Bruce", "Peter", Cover.DUST_JACKET),
			new Book(234, 20099, 1168, (short) 2011, "Thinking in Java", "Eckel Bruce", "Peter", Cover.DUST_JACKET), };

	public void printY(short y) {
		Sorter.sortw(bArr);
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getYear() >= y) {
				System.out.println(bArr[i]);
			}
		}
	}

	public void printAutor(String s) {
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getAuthor().equalsIgnoreCase(s))
				System.out.println(bArr[i]);
		}
	}

	public List<String> printAutors() {
		int co = 1;
		List<String> li = new ArrayList<String>();
		Sorter.sort(bArr, new ComparatorPublish());
		HashSet<String> au = new HashSet<String>();
		for (int i = 0; i < bArr.length; i++) {
			if (au.add(bArr[i].getAuthor())) {
				System.out.println(co + " " + bArr[i].getAuthor());
				li.add(bArr[i].getAuthor());
				co++;
			}
		}
		return li;
	}

	public List<String> printPublish() {
		int co = 1;
		List<String> li = new ArrayList<String>();
		Sorter.sort(bArr, new ComparatorAutior());
		HashSet<String> au = new HashSet<String>();
		for (int i = 0; i < bArr.length; i++) {
			if (au.add(bArr[i].getPublisher())) {
				System.out.println(co + " " + bArr[i].getPublisher());
				li.add(bArr[i].getPublisher());
				co++;
			}
		}
		return li;
	}

	public void printPublish(String s) {
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getPublisher().equalsIgnoreCase(s))
				System.out.println(bArr[i]);
		}

	}

	public int AmountAutor() {
		HashSet<String> au = new HashSet<String>();
		for (int i = 0; i < bArr.length; i++) {
			au.add(bArr[i].getAuthor());
		}
		return au.size();
	}

	public int AmountPublish() {
		HashSet<String> au = new HashSet<String>();
		for (int i = 0; i < bArr.length; i++) {
			au.add(bArr[i].getPublisher());
		}
		return au.size();
	}
}
