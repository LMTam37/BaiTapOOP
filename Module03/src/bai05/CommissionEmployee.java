package bai05;

public class CommissionEmployee extends Employee {
	private int grossSales;
	private double commisionRate;

	public CommissionEmployee() {
		super();
		this.grossSales = 0;
		this.commisionRate = 0;
	}

	public CommissionEmployee(String firstName, String lastName, String SSN, int grossSales, double commisionRate) {
		super(firstName, lastName, SSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	@Override
	public double getSalary() {
		return grossSales * commisionRate;
	}

	@Override
	public String toString() {
		return String.format("commission employee: %s %s\nsocial security number: %s\ngross sales: %d\n"
				+ "commision rate: %.2f\n", getFirstName(), getLastName(), getSSN(), grossSales, commisionRate);
	}

}
