package bai02;

import java.time.LocalDate;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		super();
		this.tax = 0;
	}

	public ReferenceBook(String id, LocalDate dayIn, double price, int qty, String publisher, double tax) {
		super(id, dayIn, price, qty, publisher);
		setTax(tax);
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		if (tax < 0) {
			tax = 0;
		}
		this.tax = tax;
	}

	public double calPrice() {
		return getQty() * getPrice() + tax;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20.2f", tax);
	}

}
