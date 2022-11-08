package bai08;

public class Faculty extends Person {
	private String facultyID;
	private String office;

	public Faculty() {
		super();
		this.facultyID = "chưa xác định";
		this.office = "chưa xác định";
	}

	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		this.facultyID = facultyID;
		this.office = office;
	}

	public String getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(String facultyID) {
		if (facultyID.trim().equals("")) {
			this.facultyID = "chưa xác định";
		} else {
			this.facultyID = facultyID;
		}
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		if (office.trim().equals("")) {
			this.office = "chưa xác định";
		} else {
			this.office = office;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" (Khoa : %s)", facultyID);
	}

}