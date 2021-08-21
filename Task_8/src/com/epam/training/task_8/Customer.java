package com.epam.training.task_8;

public class Customer {

	long id = 0;
	long creditCN;
	long bankAN;
	String patronymic;
	String firstName;
	String lastName;
	String address;

	public Customer(long id, long creditCN, long bankAN, String lastName, String firstName, String patronymic,
			String address) {
		super();
		this.id = id;
		this.creditCN = creditCN;
		this.bankAN = bankAN;
		this.patronymic = patronymic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreditCN() {
		return creditCN;
	}

	public void setCreditCN(long creditCN) {
		this.creditCN = creditCN;
	}

	public long getBankAN() {
		return bankAN;
	}

	public void setBankAN(long bankAN) {
		this.bankAN = bankAN;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "" + lastName + " " + firstName + " " + patronymic + " " + address + " " + creditCN + " " + bankAN;
	}
}
