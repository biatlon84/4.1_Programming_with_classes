package com.epam.training.task_2;

public class Print {
	public static void matrix(int[][] array) {

		for (int ii = 0; ii < array.length; ii++) {
			for (int i = 0; i < array[0].length; i++) {
				System.out.printf("%2d", array[ii][i]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void array(int[] arra) {

		System.out.print("\n");
		for (int i = 0; i < arra.length; i++) {
			System.out.printf("%2d", arra[i]);
			System.out.print(" ");
		}
	}

	public static void doub(String s, double d, int c) {
		System.out.printf(s + "%5." + c + "f\n", d);
	}

}
