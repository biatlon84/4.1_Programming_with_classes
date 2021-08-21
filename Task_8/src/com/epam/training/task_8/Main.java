package com.epam.training.task_8;

public class Main {
//	Create a Customer class, the specification of which is given below. Define Constructors, Set- and Get- Methods
//	and the toString () method. Create a second class aggregating an array of type Customer with appropriate constructors
//	and methods. Set the criteria for selecting data and display this data on the console.
//	 
//	Customer class: id, last name, first name, patronymic, address, credit card number, bank account number.
//	Find and withdraw:
//	a) a list of buyers in alphabetical order;
//	b) a list of customers whose credit card number is in a given interval

	public static void main(String[] args) {
		long from = 3748689492363966L;
		long to = 6986935578504673L;
		CustomerArray c = new CustomerArray();

		int ti = 0;
		Scann sc = new Scann();
		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter 1 for the list of customers in alphabetical order");
			System.out.println("Enter 2 for the list of customers whose credit card number is in a given interval");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			ti = sc.s(5);
			if (ti == 2) {
				c.printD(from, to);
			} else {
				c.printLex();
			}
		}
	}

}
