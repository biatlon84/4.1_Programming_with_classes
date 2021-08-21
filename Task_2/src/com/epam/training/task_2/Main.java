package com.epam.training.task_2;

//Create class Test2 with two variables. 

//Add a constructor with input parameters.
//Add a constructor that initializes the default
//members of the class. Add set- and get- methods 
//for instance fields

public class Main {
	public static void main(String[] args) {
		int c;
		double d = 0;
		Test2 test = new Test2();
		scann sc = new scann();
		System.out.println("Press 1 for set Variable1. Press 2 for set Variable2");
		c = sc.s(50);
		if (c == 1) {
			System.out.println("Variable1 >>");
			d = sc.getDoub(Integer.MAX_VALUE);
			test.setVariable1(d);
		}
		if (c == 2) {
			System.out.println("Variable2 >>");
			d = sc.getDoub(Integer.MAX_VALUE);
			test.setVariable2(d);
		}
		test.printVariable1(3);// 3 means 3 digits after the decimal point
		test.printVariable2(3);

		test.printMaxVariable(4);
		test.printSumVar(7);
		System.out.println(test.getVariable1());
		System.out.println(test.getVariable2());
	}
}
