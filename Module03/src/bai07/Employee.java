package bai07;

public class Employee extends Person {
	private double rateWage;

	public Employee(String name, String address, double rateWage) {
		super(name, address);
		setAddress(address);
	}

	public double getRateWage() {
		return rateWage;
	}

	public void setRateWage(double rateWage) {
		if (rateWage < 0) {
			this.rateWage = 0;
		} else {
			this.rateWage = rateWage;
		}
	}

	public double calcSalary() {
		return 1000000 * rateWage;
	}

	public String getEvaluate() {
		if (rateWage > 1) {
			return "lương trên trung bính";
		} else if (rateWage < 1) {
			return "lương dưới trung bình";
		} else {
			return "lương trung bình";
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20.2f", rateWage);
	}

}
