package bai08;

public class Person {
	protected String lastName;
	protected String firstName;

	public Person() {
		this.lastName = "chưa xác định";
		this.firstName = "chưa xác định";
	}

	public Person(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
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

	@Override
	public String toString() {
		String name = firstName + " " + lastName;
		return String.format("%s", name);
	}
}