package com.epam.training.task_5;

public class CounterException extends Exception {
	private static final long serialVersionUID = 2294831948729188461L;
	private long number = 0;

	public int getNumber() {
		return (int) number;
	}

	public CounterException(String message, long num) {
		super(message);
		number = num;
	}

	public CounterException(String message) {
		super(message);
	}
}
