package bai01;

import java.text.DecimalFormat;

public class Buses {
	private String id;
	private String driverName;
	private String busNum;
	private double turnover;

	public Buses() {
		this.id = "chưa xác định";
		this.driverName = "chưa xác định";
		this.busNum = "chưa xác định";
		this.turnover = 1;
	}

	public Buses(String id, String driverName, String busNum, double turnover) {
		this.id = id;
		this.driverName = driverName;
		this.busNum = busNum;
		this.turnover = turnover;
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

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		if (driverName.trim().equals("")) {
			this.driverName = "chưa xác định";
		} else {
			this.driverName = driverName;
		}
	}

	public String getBusNum() {
		return busNum;
	}

	public void setBusNum(String busNum) {
		if (busNum.trim().equals("")) {
			this.busNum = "chưa xác định";
		} else {
			this.busNum = busNum;
		}
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		if (turnover <= 0) {
			this.turnover = 1;
		} else {
			this.turnover = turnover;
		}
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00VND");
		return String.format("%-20s%-20s%-20s%-20s", id, driverName, busNum, df.format(turnover));
	}

}
