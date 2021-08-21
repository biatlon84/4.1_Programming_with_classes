package com.epam.training.task_8;

public class CustomerArray {
	Customer[] array;

	public CustomerArray() {
		this.array = new Customer[] {
				new Customer(926942, 7329032745196534L, 38941043, "Artemiev", "Ruslan", "Ivanovich",
						"322 Powell St, Woodbury, TN, 37190"),
				new Customer(247962, 7465014658385757L, 65839465, "Korolev", "Nikita", "Vadimovich",
						"2951 W 61st Hwy, Grand Marais, MN, 55604"),
				new Customer(642268, 1838693558504673L, 65836593, "Orlova", "Faina", "Yukhimovna",
						"133 3rd Ave, Hawthorne, NJ, 07506"),
				new Customer(764453, 3848689492363966L, 74791066, "Belyakov", "Elisey", "Viktorovich",
						"2 03 Barnes Station Rd, Iva, SC, 29655"),
				new Customer(147874, 6474838475949384L, 83829567, "Kostina", "Lyudmila", "Mikhailovna",
						"Po Box 7137, Monroe, LA, 71211"), };
	}

	public void printD(long refL, long refH) {
		ComparatorLexicph t = new ComparatorLexicph();
		Sorter.sort(array, t);
		for (int i = 0; array.length > i; i++) {
			if ((array[i].getCreditCN() < refH) && (array[i].getCreditCN() > refL))
				System.out.println(array[i]);
		}

	}

	public void printLex() {
		ComparatorLexicph t = new ComparatorLexicph();
		Sorter.sort(array, t);
		for (int i = 0; array.length > i; i++) {

			System.out.println(array[i]);

		}
	}

}
