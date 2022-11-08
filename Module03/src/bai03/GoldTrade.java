package bai03;

import java.time.LocalDate;

public class GoldTrade extends Trancastion {
	private String goldType;

	public GoldTrade() {
		super();
		this.goldType = "24K";
	}

	public GoldTrade(String id, LocalDate tradeDay, double price, int qty, String goldType) {
		super(id, tradeDay, price, qty);
		setGoldType(goldType);
	}

	public String getGoldType() {
		return goldType;
	}

	public void setGoldType(String goldType) {
		if (!(goldType == "10K" || goldType == "14K" || goldType == "18K" || goldType == "24K")) {
			this.goldType = "24K";
		} else {
			this.goldType = goldType;
		}
	}

	public double calPrice() {
		return super.calPrice();
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s", goldType);
	}

}
