package bai02;

import java.time.LocalDate;

public class TextBook extends Book {
	private String status;

	public TextBook(String id, LocalDate dayIn, double price, int qty, String publisher, String status) {
		super(id, dayIn, price, qty, publisher);
		this.status = status;
	}

	public TextBook() {
		super();
		this.status = "mới";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (!(status.equalsIgnoreCase("moi") || status.equalsIgnoreCase("cu"))) {
			status = "moi";
		}
		this.status = status;
	}

	public double calPrice() {
		if (status.equalsIgnoreCase("moi")) {
			return getQty() * getPrice();
		} else {
			return getQty() * getPrice() * 0.5;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s",status);
	}

}
