package bai03;

import java.time.LocalDate;

public class CurrencyTrade extends Trancastion {
	private double rate;
	private String currencyType;

	public CurrencyTrade() {
		super();
		this.rate = 0;
		this.currencyType = "tiền Việt Nam";
	}

	public CurrencyTrade(String id, LocalDate tradeDay, double price, int qty, double rate, String currencyType) {
		super(id, tradeDay, price, qty);
		this.rate = rate;
		this.currencyType = currencyType;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if (rate < 0) {
			this.rate = 0;
		} else {
			this.rate = rate;
		}
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		if (currencyType.trim().equals("") || !currencyType.equalsIgnoreCase("tiền VND")
				|| !currencyType.equalsIgnoreCase("tiền USD") || !currencyType.equalsIgnoreCase("tiền Euro")) {
			this.currencyType = "tiền VND";
		} else {
			this.currencyType = currencyType;
		}
	}

	public double calPrice() {
		if (currencyType.equalsIgnoreCase("tiền VND")) {
			return getQty() * getPrice();
		} else {
			return getQty() * getPrice() * rate;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20f%-20s", rate, currencyType);
	}
}