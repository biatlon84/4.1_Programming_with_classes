package com.epam.training.task_6;

//Write a class description to represent time. 
//Provide the possibility of setting the time and changing it
//separate fields (hour, minute, second) with validation of the entered values. 
//In case of invalid values fields, the field is set to 0.
//Create methods for changing the time by the specified number of hours, minutes and seconds.
public class Main {
	public static void main(String[] args) {
		int ti = 0;
		boolean w = false;
		Scann sc = new Scann();
		Clock c = new Clock();
		c.setLocT(5);// setting local time (for example +5 UTC hours)
		while (true) {
			if (w == false) {
				System.out.println("Type hours (UTC)");
				ti = sc.s(24);
				c.setTHours(ti);
				w = true;
			} else {
				System.out.println("Type hours (Local)");
				ti = sc.s(24);
				c.setTHoursL(ti);
				w = false;
			}
			System.out.println("Type minutes");
			ti = sc.s(60);
			c.setTMinutes(ti);
			System.out.println("Type seconds");
			ti = sc.s(60);
			c.setTSeconds(ti);
			System.out.println(c);// When you call toString it'll return the Local time
			System.out.println(c.getTSring());
			c.changeHours(-3);
			c.changeMinutes(-40);
			c.changeSeconds(-32);
			System.out.println(c);
		}

	}
}
