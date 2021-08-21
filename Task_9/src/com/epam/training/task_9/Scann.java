package com.epam.training.task_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scann {
	public int s(int e) {

		int a = 0;
		boolean w = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (w) {
			w = false;
			while (!sc.hasNextInt()) {

				System.out.print(sc.next() + "is't int\n");
			}
			a = sc.nextInt();
			if (a >= e) {
				System.out.print("wrong volue\n");
				w = true;
			}

		}
		return a;
	}

	public double getDoub(int e) {

		double a = 0;
		boolean w = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (w) {
			w = false;
			while (!sc.hasNextDouble()) {

				System.out.print(sc.next() + " is't double\n");
			}
			a = sc.nextDouble();
			if (a >= e) {
				System.out.print("wrong volue\n");
				w = true;
			}

		}
		return a;
	}

	public String str(int e) {

		String a = "";
		boolean w = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (w) {
			w = false;

			while (!sc.hasNext()) {

				System.out.print(sc.next() + "is't str\n");
			}
			a = sc.nextLine();
			// a = sc.next();
			if (a.length() > e) {
				System.out.print("too long\n");
				w = true;
			}

		}
		return a;
	}

	public char chr() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferReader.readLine().charAt(0);
	}

}