package bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CrockeryCommodity extends Commodity {
	private String manufacturer;
	private LocalDate inputDay;

	public CrockeryCommodity() {
		super();
		this.manufacturer = "chưa xác định";
		this.inputDay = LocalDate.now();
	}

	public CrockeryCommodity(String id, String name, double price, int inventory, String manufacturer,
			LocalDate inputDay) {
		super(id, name, price, inventory);
		setManufacturer(manufacturer);
		setInputDay(inputDay);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public LocalDate getInputDay() {
		return inputDay;
	}

	public void setInputDay(LocalDate inputDay) {
		this.inputDay = inputDay;
	}

	@Override
	public String getSellStatus() {
		if (LocalDate.now().until(inputDay, ChronoUnit.DAYS) > 10 && getInventory() > 50) {
			return "bán chậm";
		}
		return "không đánh giá";
	}

	@Override
	public double calcVAT() {
		return 0.1 * getPrice();
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("%-20s%-20s", manufacturer, dtf.format(inputDay));
	}

}
