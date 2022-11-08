package bai05;

public class HourlyEmployee extends Employee {
	private double wage;
	private int hours;

	public HourlyEmployee() {
		super();
		this.wage = 0;
		this.hours = 0;
	}

	public HourlyEmployee(String firstName, String lastName, String SSN, double wage, int hours) {
		super(firstName, lastName, SSN);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSalary() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return 40 * wage + (hours - 40) * wage * 1.5;
		}
	}

	@Override
	public String toString() {
		return String.format(
				"hourly employee: %s %s\nsocial security number:%s\nhourly wage: %f; hours worked: %d\n",
				getFirstName(), getLastName(), getSSN(), wage, hours);
	}

}
