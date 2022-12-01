package onThi;

public class FullName {
	private String lastName;
	private String firstName;

	public FullName() {
		this.lastName = "XXX";
		this.firstName = "XXX";
	}

	public FullName(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.trim().equals("")) {
			this.lastName = "XXX";
		} else {
			this.lastName = lastName;
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.trim().equals("")) {
			this.firstName = "XXX";
		} else {
			this.firstName = firstName;
		}
	}

	@Override
	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}

}
