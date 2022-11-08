package bai06;

import java.util.Objects;

public abstract class ClassRoom {
	private String id;
	private String buildings;
	private double area;
	private int numLightBulb;

	public ClassRoom() {
		this.id = "chưa xác định";
		this.buildings = "chưa xác định";
		this.area = 0;
		this.numLightBulb = 0;
	}

	public ClassRoom(String id, String buildings, double area, int numLightBulb) {
		this.id = id;
		this.buildings = buildings;
		this.area = area;
		this.numLightBulb = numLightBulb;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, buildings, id, numLightBulb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassRoom other = (ClassRoom) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(buildings, other.buildings) && Objects.equals(id, other.id)
				&& numLightBulb == other.numLightBulb;
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

	public String getBuildings() {
		return buildings;
	}

	public void setBuildings(String buildings) {
		if (buildings.trim().equals("")) {
			this.buildings = "chưa xác định";
		} else {
			this.buildings = buildings;
		}
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if (area < 0) {
			this.area = 0;
		} else {
			this.area = area;
		}
	}

	public int getNumLightBulb() {
		return numLightBulb;
	}

	public void setNumLightBulb(int numLightBulb) {
		if (numLightBulb < 0) {
			this.numLightBulb = 0;
		} else {
			this.numLightBulb = numLightBulb;
		}
	}

	public boolean isEnoughLight() {
		if (area / numLightBulb <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public abstract boolean isStandard();
	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20.2f%-20d", id, buildings, area, numLightBulb);
	}

}
