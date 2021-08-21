package com.epam.training.task_4;

import java.text.SimpleDateFormat;

public class Print {
	private static SimpleDateFormat fo = new SimpleDateFormat("HH:mm EE");

	public static void print(Train[] train, int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.printf("Train №%06d Data : ", train[i].getNumber());
			System.out.print(train[i].getData() + " Time : ");
			System.out.print(fo.format(train[i].getData()) + " Destination : ");
			System.out.println(train[i].getDestinationName());
		}
	}

}
