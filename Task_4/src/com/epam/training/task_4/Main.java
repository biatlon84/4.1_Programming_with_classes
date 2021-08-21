package com.epam.training.task_4;

//Create a class Train, containing the field: 
//name of the destination point, number of the train, time of delivery.
//Create data in the masses from the elements of the Train type,
//add the capacity of the system elements
//by train numbers. Add the capacity of 
//the input information about beforehand, 
//the number of which is entered by the user.
//Add the capacity of the mass alignment 
//according to the destination point, if not with the same signal timing
//Longer the order according to the dispatch time.
public class Main {
	public static void main(String[] args) {
		Railway r = new Railway();
		Controller cn = new Controller(r);
		cn.s();
	}
}
