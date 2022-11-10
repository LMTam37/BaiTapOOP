package bai07;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Employee {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;

	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(thePayrollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return thePayrollNumber == other.thePayrollNumber;
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public abstract double getMonthlySalary();

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-20d%-20s%-20s", thePayrollNumber, theName, df.format(theBasicMonthlySalary));
	}

}
