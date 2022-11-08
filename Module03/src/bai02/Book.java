package bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Book {
	private String id;
	private LocalDate dayIn;
	private double price;
	private int qty;
	private String publisher;

	public Book() {
		this.id = "chưa xác định";
		this.dayIn = LocalDate.now();
		this.price = 0;
		this.qty = 0;
		this.publisher = "chưa xác định";
	}

	public Book(String id, LocalDate dayIn, double price, int qty, String publisher) {
		setId(id);
		setDayIn(dayIn);
		setPrice(price);
		setQty(qty);
		setPublisher(publisher);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.trim().equals("")) {
			id = "chưa xác định";
		}
		this.id = id;
	}

	public LocalDate getDayIn() {
		return dayIn;
	}

	public void setDayIn(LocalDate dayIn) {
		if (dayIn.isAfter(LocalDate.now()))
			dayIn = LocalDate.now();
		this.dayIn = dayIn;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			qty = 0;
		}
		this.qty = qty;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		if (publisher.trim().equals("")) {
			publisher = "chưa xác định";
		}
		this.publisher = publisher;
	}

	double calPrice() {
		return qty * price;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-20s%-20s%-20.2f%-20d%-20s", id, dtf.format(dayIn), price, qty, publisher);
	}


}
