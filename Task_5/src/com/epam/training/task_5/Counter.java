package com.epam.training.task_5;

public class Counter {

	long counter = 0;
	long maxVal = 1000;
	long minVal = 0;

	public Counter(long counter, long maxVal, long minVal) throws CounterException {
		super();
		if (maxVal < minVal) {
			throw new CounterException("maxVal < minVal");
		}
		if ((counter < minVal) || (counter > maxVal)) {
			throw new CounterException("invalid counter", counter);
		}
		this.counter = counter;
		this.maxVal = maxVal;
		this.minVal = minVal;
	}

	public Counter(long maxVal, long minVal) throws CounterException {
		super();
		if (maxVal < minVal) {
			throw new CounterException("maxVal < minVal");
		}
		this.counter = 0;
		this.maxVal = maxVal;
		this.minVal = minVal;
	}

	public Counter(long counter) {
		super();
		this.counter = counter;
		this.maxVal = 1000;
		this.minVal = 0;
	}

	public Counter() {
		super();
		this.counter = 0;
		this.maxVal = 1000;
		this.minVal = 0;
	}

	public void increment() {
		if (counter < maxVal) {
			counter++;
		}
	}

	public void decrement() {
		if (counter > minVal) {
			counter--;
		}
	}

	public long getCounter() {
		return counter;
	}

	public void increas(long f) {
		counter += f;
		if (counter > maxVal) {
			this.counter = maxVal;
		}
	}

	public void decreas(long f) {
		counter -= f;
		if (counter < minVal) {
			this.counter = minVal;
		}
	}
}
