package bai06;

public class labClass extends ClassRoom {
	private String major;
	private int capacity;
	private boolean sink;

	public labClass() {
		super();
		this.major = "chưa xác định";
		this.capacity = 0;
		this.sink = false;
	}

	public labClass(String id, String buildings, double area, int numLightBulb, String major, int capacity,
			boolean sink) {
		super(id, buildings, area, numLightBulb);
		setMajor(major);
		setCapacity(capacity);
		setSink(sink);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		if (major.trim().equals("")) {
			this.major = "chưa xác định";
		} else {
			this.major = major;
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity < 0) {
			this.capacity = 0;
		} else {
			this.capacity = capacity;
		}
	}

	public boolean isSink() {
		return sink;
	}

	public void setSink(boolean sink) {
		this.sink = sink;
	}

	@Override
	public boolean isStandard() {
		if (isEnoughLight() && sink) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String note = "";
		if (sink) {
			note = "có";
		} else {
			note = "không";
		}
		return super.toString() + String.format("%-20s%-20d%-20s", major, capacity, note);
	}

}
