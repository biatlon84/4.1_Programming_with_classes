package com.epam.training.task_1;

//Create class Test1 with two variables.
//Add a display method and methods for changing these
//variables. Add a method that finds the sum of
//the values of these variables and a method that finds
//the largest of these two variables.
public class Main {
	public static void main(String[] args) {

		Test1 test = new Test1();
		test.setVariable1(6.2778);
		test.setVariable2(8.4435);

		test.printVariable1(3);// 3 means 3 digits after the decimal point
		test.printVariable2(3);

		test.printMaxVariable(4);
		test.printSumVar(7);

	}
}
