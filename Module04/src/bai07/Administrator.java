package bai07;

public class Administrator extends Employee {
	private String theDepartment;

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary * (1 + 0.4);
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s", theDepartment);
	}

}
