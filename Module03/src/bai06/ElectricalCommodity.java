package bai06;

public class ElectricalCommodity extends Commodity {
	private int warrantyPeriod;
	private double wattage;

	public ElectricalCommodity() {
		super();
		this.warrantyPeriod = 0;
		this.wattage = 0;
	}

	public ElectricalCommodity(String id, String name, double price, int inventory, int warrantyPeriod,
			double wattage) {
		super(id, name, price, inventory);
		setWarrantyPeriod(warrantyPeriod);
		setWattage(wattage);
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		if (warrantyPeriod < 0) {
			this.warrantyPeriod = 0;
		} else {
			this.warrantyPeriod = warrantyPeriod;
		}
	}

	public double getWattage() {
		return wattage;
	}

	public void setWattage(double wattage) {
		if (wattage < 0) {
			this.wattage = 0;
		} else {
			this.wattage = wattage;
		}
	}

	@Override
	public String getSellStatus() {
		if (getInventory() < 3) {
			return "bán được";
		}
		return "không đánh giá";
	}

	@Override
	public double calcVAT() {
		return getPrice() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20d%-20.2f", warrantyPeriod, wattage);
	}

}
