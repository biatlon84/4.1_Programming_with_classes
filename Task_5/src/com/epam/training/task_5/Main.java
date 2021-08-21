package com.epam.training.task_5;

//Describe a class that implements a decimal counter
//that can increment or decrement its value
//per unit in the specified range. Consider initializing 
//the counter with default values and
//arbitrary values. The counter has methods for increasing 
//and decreasing state, and a method that allows
//get its current state. Write code that demonstrates all 
//the capabilities of the class.
//With JUnit 4
public class Main {
	public static void main(String[] args) throws CounterException {

		Counter cou = new Counter(11, 11, 7);
		cou.increment();
		cou.increment();
		cou.decreas(6);
		System.out.println(cou.getCounter());
	}
}
