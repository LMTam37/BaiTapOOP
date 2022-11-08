package bai06;

import java.util.Objects;

public abstract class Commodity {
	private String id;
	private String name;
	private double price;
	private int inventory;

	public Commodity() {
		this.id = "chưa xác định";
		this.name = "xxx";
		this.price = 0;
		this.inventory = 0;
	}

	public Commodity(String id, String name, double price, int inventory) {
		setId(id);
		setName(name);
		setPrice(price);
		setInventory(inventory);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, inventory, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		return Objects.equals(id, other.id) && inventory == other.inventory && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			this.name = "xxx";
		} else {
			this.name = name;
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

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		if (inventory < 0) {
			this.inventory = 0;
		} else {
			this.inventory = inventory;
		}
	}

	public abstract String getSellStatus();

	public abstract double calcVAT();

	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20.2f%-20d", id, name, price, inventory);
	}

}
