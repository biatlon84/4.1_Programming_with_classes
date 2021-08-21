package com.epam.training.task_3;

public class University {

	Student[] university;

	public University() {

		this.university = new Student[] { new Student("Sidorov", "S.U.", 75, new int[] { 9, 8, 9, 10, 8 }),
				new Student("Petrov", "T.C.", 15, new int[] { 9, 8, 9, 7, 7 }),
				new Student("Smirnov", "I.H.", 66, new int[] { 9, 10, 9, 10, 9 }),
				new Student("Ivanov", "O.E.", 45, new int[] { 9, 9, 9, 10, 9 }),
				new Student("Swallow", "A.R.", 29, new int[] { 9, 10, 9, 10, 10 }),
				new Student("Vasiliev", "K.R.", 36, new int[] { 7, 8, 9, 6, 7 }),
				new Student("Korovin", "W.R.", 25, new int[] { 9, 8, 7, 10, 7 }),
				new Student("Anatolyev", "H.S.", 15, new int[] { 9, 8, 6, 10, 7 }),
				new Student("Kopachev", "U.I.", 59, new int[] { 8, 8, 8, 10, 7 }),
				new Student("Terekhov", "P.F.", 45, new int[] { 9, 8, 9, 10, 8 }), };
	}

	public void print() {

		for (int i = 0; i < university.length; i++) {
			System.out.println(university[i]);
		}

	}

	public void printSucces(int p) {

		for (int i = 0; i < university.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < university[i].performance.length; j++) {
				min = university[i].performance[j] < min ? min = university[i].performance[j] : min;
			}
			if (p <= min) {
				System.out.println(university[i].String());
			}
		}

	}

}
