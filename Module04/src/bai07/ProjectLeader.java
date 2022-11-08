package bai07;

public class ProjectLeader extends Programmer {

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}

	public double getMonthlySalary() {
		return theBasicMonthlySalary * (1 + 0.2);
	}
}
