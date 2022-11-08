package bai07;

public class Person {
	private String name;
	private String address;

	public Person() {
		this.name = "chưa xác định";
		this.address = "chưa xác định";
	}

	public Person(String name, String address) {
		super();
		setName(name);
		setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			this.name = "chưa xác định";
		} else {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.trim().equals("")) {
			this.address = "chưa xác định";
		} else {
			this.address = address;
		}
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s", name, address);
	}

}
