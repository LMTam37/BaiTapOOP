package bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodCommodity extends Commodity {
	private String provider;
	private LocalDate prod;
	private LocalDate exp;

	public FoodCommodity() {
		super();
		this.provider = "chưa xác định";
		this.prod = LocalDate.now();
		this.exp = prod;
	}

	public FoodCommodity(String id, String name, double price, int inventory, String provider, LocalDate prod,
			LocalDate exp) {
		super(id, name, price, inventory);
		setProvider(provider);
		setProd(prod);
		setExp(exp);
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		if (provider.trim().equals("")) {
			this.provider = "chưa xác định";
		} else {
			this.provider = provider;
		}
	}

	public LocalDate getProd() {
		return prod;
	}

	public void setProd(LocalDate prod) {
		if (prod.isAfter(LocalDate.now())) {
			this.prod = LocalDate.now();
		} else {
			this.prod = prod;
		}
	}

	public LocalDate getExp() {
		return exp;
	}

	public void setExp(LocalDate exp) {
		if (exp.isBefore(prod)) {
			this.exp = prod;
		} else {
			this.exp = exp;
		}
	}

	@Override
	public String getSellStatus() {
		if (getInventory() > 0 && exp.isBefore(LocalDate.now())) {
			return "khó bán";
		}
		return "không đánh giá";
	}

	@Override
	public double calcVAT() {
		return getPrice() * 0.05;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%-20s%-20s%-20s", provider, dtf.format(prod), dtf.format(exp));
	}

}
