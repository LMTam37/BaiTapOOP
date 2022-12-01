package onThi;

import java.time.LocalDate;

public class Experience extends Employee {
	private int expInYear;

	public Experience() {
		super();
		this.expInYear = 0;
	}

	public Experience(String id, String fisrtName, String lastName, LocalDate birthday, String phone, int expInYear) {
		super(id, fisrtName, lastName, birthday, phone);
		setExpInYear(expInYear);
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		if (expInYear < 1) {
			this.expInYear = 1;
		} else {
			this.expInYear = expInYear;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20d", expInYear);
	}

}
