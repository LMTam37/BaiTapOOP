package bai05;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SSN;

	public Employee() {
		this.firstName = "chưa xác định";
		this.lastName = "chưa xác định";
		this.SSN = "chưa xác định";
	}

	public Employee(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.trim().equals("")) {
			this.firstName = "chưa xác định";
		} else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.trim().equals("")) {
			this.lastName = "chưa xác định";
		} else {
			this.lastName = lastName;
		}
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		if (SSN.trim().equals("")) {
			this.SSN = "chưa xác định";
		} else {
			this.SSN = SSN;
		}
	}

	public abstract double getSalary();
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number:%s\n", firstName, lastName, SSN);
	}

}
