package com.epam.training.task_5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

//The code that demonstrates all the capabilities of the class.
public class TestCounter {

	@Test
	public void testDecrementT() {
		try {
			Counter cou = new Counter(11, 11, 7);
			cou.decrement();
			assertEquals(10, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testDecrementF() {
		try {
			Counter cou = new Counter(33, 40, 33);
			cou.decrement();
			assertEquals(33, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testDecreasF() {
		try {
			Counter cou = new Counter(11, 11, 7);
			cou.decreas(45);
			assertEquals(7, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testDecreasT() {
		try {
			Counter cou = new Counter(30, 33, -17);
			cou.decreas(45);
			assertEquals(-15, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testIncrementT() {
		try {
			Counter cou = new Counter(30, 33, -17);
			cou.increment();
			assertEquals(31, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testIncrementF() {
		try {
			Counter cou = new Counter(30, 30, -17);
			cou.increment();
			assertEquals(30, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testIncreasF() {
		try {
			Counter cou = new Counter(30, 50, 9);
			cou.increas(70);
			assertEquals(50, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testIncreasT() {
		try {
			Counter cou = new Counter(30, 50, 9);
			cou.increas(14);
			assertEquals(44, cou.getCounter());
		} catch (CounterException e) {
			e.printStackTrace();
		}

	}

	@Test(expected = CounterException.class)
	public void testExceptionBord() throws CounterException {

		Counter cou = new Counter(11, 11, 17);
		cou.decreas(45);
		assertEquals(7, cou.getCounter());
		fail("Not yet implemented");

	}

	@Test(expected = CounterException.class)
	public void testExceptionValue() throws CounterException {

		Counter cou = new Counter(11, 5, 7);
		cou.decreas(45);
		assertEquals(7, cou.getCounter());

	}

}
