package com.epam.training.task_3;

import java.util.Arrays;

public class Student {

	String surname;
	String initials;
	int group;
	int[] performance = new int[5];

	public Student(String surname, String initials, int group, int[] performance) {
		super();
		this.surname = surname;
		this.initials = initials;
		this.group = group;
		this.performance = performance;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", initials=" + initials + ", group=" + group + ", performance="
				+ Arrays.toString(performance) + "]";
	}

	public String String() {
		return "Student " + surname + " " + initials + " group=" + group;
	}

}
