package bai01;

public class Urban extends Buses {
	private double kmsNum;
	private int busLineNum;

	public Urban() {
		super();
		this.kmsNum = 1;
		this.busLineNum = 1;
	}

	public Urban(String id, String driverName, String busNum, double turnover, double kmsNum, int busLineNum) {
		super(id, driverName, busNum, turnover);
		setKmsNum(kmsNum);;
		setBusLineNum(busLineNum);
	}

	public double getKmsNum() {
		return kmsNum;
	}

	public void setKmsNum(double kmsNum) {
		if (kmsNum <= 0) {
			this.kmsNum = 1;
		} else {
			this.kmsNum = kmsNum;
		}
	}

	public int getBusLineNum() {
		return busLineNum;
	}

	public void setBusLineNum(int busLineNum) {
		if (busLineNum <= 0) {
			this.busLineNum = 1;
		} else {
			this.busLineNum = busLineNum;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20.2f%-10d", kmsNum, busLineNum);
	}

}
