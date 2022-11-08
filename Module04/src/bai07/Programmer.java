package bai07;

public class Programmer extends Employee {
	protected String theLanguage;

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}

	@Override
	public double getMonthlySalary() {
		if (theLanguage.equalsIgnoreCase("Java")) {
			return theBasicMonthlySalary * (1 + 0.2);
		} else {
			return theBasicMonthlySalary;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s", theLanguage);
	}

}
