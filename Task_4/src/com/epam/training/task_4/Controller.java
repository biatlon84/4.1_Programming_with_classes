package com.epam.training.task_4;

public class Controller {

	Railway r;

	public Controller(Railway r) {
		super();
		this.r = r;
	}

	public void s() {

		int e;
		int st;
		Scann s = new Scann();

		while (true) {
			System.out.println("Enter the station number you will be traveling from");
			for (int i = 0; i < r.amount(); i++) {
				System.out.println(i + " " + r.getStationIx(i).getStstionName());
			}
			st = s.s(r.amount());
			System.out.println("you chose " + r.getStationIx(st).getStstionName() + " station");
			System.out.println("Enter 1 to order by train number. Enter 2 to order by destination.");
			e = s.s(3);
			if (e == 1) {
				r.getStationIx(st).printScheduleSortByNumber();
			} else if (e == 2) {
				r.getStationIx(st).printScheduleSortByDestination();

			}
		}

	}

}
