package bai05;

public class BasePlusCommission extends Employee {
	private int grossSales;
	private double commisionRate;
	private double baseSalary;

	public BasePlusCommission() {
		super();
		this.grossSales = 0;
		this.commisionRate = 0;
		this.baseSalary = 0;
	}

	public BasePlusCommission(String firstName, String lastName, String SSN, int grossSales, double commisionRate,
			double baseSalary) {
		super(firstName, lastName, SSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		this.baseSalary = baseSalary;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		if (grossSales < 0) {
			this.grossSales = 0;
		} else {
			this.grossSales = grossSales;
		}
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		if (grossSales < 0) {
			this.commisionRate = 0;
		} else {
			this.commisionRate = commisionRate;
		}
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0) {
			this.baseSalary = 0;
		} else {
			this.baseSalary = baseSalary;
		}
	}

	@Override
	public double getSalary() {
		return (commisionRate * grossSales) + baseSalary;
	}

	@Override
	public String toString() {
		return String.format(
				"base salaried commision employee: %s %s\nsocial security number:%s\ngross sales: %d\ncommision rate: %.2f\nbase salary: %.2f\n",
				getFirstName(), getLastName(), getSSN(), grossSales, commisionRate, baseSalary);
	}

}