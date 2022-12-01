package onThi;

import java.time.LocalDate;

public class Intern extends Employee {
	private String major;
	private int semester;

	public Intern() {
		super();
		this.major = "XXX";
		this.semester = 6;
	}

	public Intern(String id, String fisrtName, String lastName, LocalDate birthday, String phone, String major,
			int semester) {
		super(id, fisrtName, lastName, birthday, phone);
		setMajor(major);
		setSemester(semester);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		if (major.trim().equals("")) {
			this.major = "XXX";
		} else {
			this.major = major;
		}
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		if (!(semester >= 6 && semester <= 10)) {
			this.semester = 6;
		} else {
			this.semester = semester;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s%-20d", major, semester);
	}

}
