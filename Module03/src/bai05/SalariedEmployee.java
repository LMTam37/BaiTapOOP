package bai05;

public class SalariedEmployee extends Employee {
	private double weekSalary;

	public SalariedEmployee() {
		super();
		this.weekSalary = 0;
	}

	public SalariedEmployee(String firstName, String lastName, String SSN, double weekSalary) {
		super(firstName, lastName, SSN);
		this.weekSalary = weekSalary;
	}

	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if (weekSalary < 0) {
			this.weekSalary = 0;
		} else {
			this.weekSalary = weekSalary;
		}
	}

	@Override
	public double getSalary() {
		return weekSalary;
	}
}
