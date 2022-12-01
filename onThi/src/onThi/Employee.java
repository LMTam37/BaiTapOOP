package onThi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Employee {
	private String id;
	private FullName fullName;
	private LocalDate birthday;
	private String phone;

	public Employee() {
		this.id = "XXX";
		this.fullName = new FullName();
		this.birthday = LocalDate.now();
		this.phone = "XXX";
	}

	public Employee(String id, String fisrtName, String lastName, LocalDate birthday, String phone) {
		setId(id);
		this.fullName = new FullName(fisrtName, lastName);
		setBirthday(birthday);
		setPhone(phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.trim().equals("")) {
			this.id = "XXX";
		} else {
			this.id = id;
		}
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = new FullName(fullName.getFirstName(), fullName.getLastName());
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		int age = Period.between(birthday, LocalDate.now()).getYears();
		if (age < 20) {
			int year = LocalDate.now().getYear() - 20;
			int month = LocalDate.now().getMonthValue();
			int day = LocalDate.now().getDayOfMonth();
			this.birthday = LocalDate.of(year, month, day);
		} else {
			this.birthday = birthday;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone.trim().equals("") || phone.charAt(0) != 0 || phone.length() != 10) {
			this.phone = "0000000000";
		} else {
			this.phone = phone;
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s%-20s%-20s%-20s", id, fullName, dtf.format(birthday), phone);
	}

}
