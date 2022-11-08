package bai01;

public class Suburban extends Buses {
	private String destination;
	private int days;

	public Suburban() {
		super();
		this.destination = "chưa xác định";
		this.days = 1;
	}


	public Suburban(String id, String driverName, String busNum, double turnover, String destination, int days) {
		super(id, driverName, busNum, turnover);
		setDestination(destination);
		setDays(days);
	}


	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		if (destination.trim().equals("")) {
			this.destination = "chưa xác định";
		} else {
			this.destination = destination;
		}
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		if (days <= 0) {
			this.days = 1;
		} else {
			this.days = days;
		}
	}

	@Override
	public String toString() {
		return super.toString() +  String.format("%-20s%-10d", destination,days);
	}

}
