package com.epam.training.task_9;

public class Book implements Comparable<Book> {
	private long id;
	private long price;
	private int amountP;
	private short year;
	private String name;
	private String author;
	private String publisher;
	private Cover cover;

	public Book(long id, long price, int amountP, short year, String name, String author, String publisher,
			Cover cover) {
		super();
		this.id = id;
		this.price = price;
		this.amountP = amountP;
		this.year = year;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.cover = cover;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getAmountP() {
		return amountP;
	}

	public void setAmountP(int amountP) {
		this.amountP = amountP;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", amountP=" + amountP + ", year=" + year + ", name=" + name
				+ ", author=" + author + ", publisher=" + publisher + ", cover=" + cover + "]";
	}

	@Override
	public int compareTo(Book arg0) {
		return author.compareTo(arg0.author);
	}

}
