package bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trancastion {
	private String id;
	private LocalDate tradeDay;
	private double price;
	private int qty;

	public Trancastion() {
		this.id = "chưa xác định";
		this.tradeDay = LocalDate.now();
		this.price = 0;
		this.qty = 0;
	}

	public Trancastion(String id, LocalDate tradeDay, double price, int qty) {
		setId(id);
		setTradeDay(tradeDay);
		setPrice(price);
		setQty(qty);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.trim().equals("")) {
			this.id = "chưa xác định";
		} else {
			this.id = id;
		}
	}

	public LocalDate getTradeDay() {
		return tradeDay;
	}

	public void setTradeDay(LocalDate tradeDay) {
		if (tradeDay.isBefore(LocalDate.now())) {
			this.tradeDay = LocalDate.now();
		} else {
			this.tradeDay = tradeDay;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			this.qty = 0;
		} else {
			this.qty = qty;
		}
	}

	public double calPrice() {
		return qty * price;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-20s%-20s%-20s%-20s", id, dtf.format(tradeDay), price, qty);
	}

}
