package com.epam.training.task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clock {

	private long T = System.currentTimeMillis() / 1000;
	private long locT = 3600 * 3;// MSK

	public Clock() {
		super();
	}

	public Clock(long t, int lo) {
		super();
		T = t;
		this.locT = lo * 3600;
	}

	public long getT() {
		return T;
	}

	public String getTSring() {
		Pattern patt = Pattern.compile("Local");
		long w = locT;
		locT = 0;
		Matcher m = patt.matcher(toString());
		locT = w;
		return m.replaceFirst("UTC");
	}

	public void setT(long t) {
		T = t;
	}

	public void setTL(long t) {
		T = t - locT;
	}

	public boolean setTHours(int t) {
		boolean w = true;
		if ((t < 0) || (t >= 24)) {
			t = 0;
			w = false;
		}
		T -= (T % (3600 * 24));
		T += t * 3600;
		return w;
	}

	public boolean setTHoursL(int t) {
		boolean w = true;
		if ((t < 0) || (t >= 24)) {
			t = 0;
			w = false;
		}
		T -= (T % (3600 * 24));
		T += t * 3600;
		T -= locT;
		return w;
	}

	public boolean setTMinutes(int t) {
		boolean w = true;
		if ((t < 0) || (t >= 60)) {
			t = 0;
			w = false;
		}
		T -= (T % 3600);
		T += t * 60;
		return w;
	}

	public boolean setTSeconds(int t) {
		boolean w = true;
		if ((t < 0) || (t >= 60)) {
			t = 0;
			w = false;
		}
		T -= (T % 60);
		T += t;
		return w;
	}

	public boolean setT(int h, int m, int s) {
		boolean w = true;
		w = w && setTHours(h);
		w = w && setTMinutes(m);
		w = w && setTSeconds(s);
		return w;
	}

	public boolean setTL(int h, int m, int s) {
		boolean w = setT(h, m, s);
		T -= locT;
		return w;
	}

	@Override
	public String toString() {

		int h = 0;
		int m = 0;
		int s = 0;
		long t = T;
		t += locT;
		t = t % (3600 * 24);
		h = (int) (t / 3600);
		m = (int) (t % (3600) / 60);
		s = (int) t % 60;
		return "Local time is : " + h + "h " + m + "m " + s + "s";
	}

	public long getLocT() {
		return locT;
	}

	public void setLocT(int lo) {
		this.locT = lo * 3600;
	}

	public void changeHours(int hh) {
		T += hh * 3600;
	}

	public void changeMinutes(int mm) {
		T += mm * 60;
	}

	public void changeSeconds(int ss) {
		T += ss;
	}
}
