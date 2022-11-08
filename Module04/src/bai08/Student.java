package bai08;

public class Student extends Person {
	private String studentID;
	private int yearMatriculated;

	public Student() {
		super();
		this.studentID = "chưa xác định";
		this.yearMatriculated = 0;
	}

	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setStudentID(studentID);
		setYearMatriculated(yearMatriculated);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		if (studentID.trim().equals("")) {
			this.studentID = "chưa xác định";
		} else {
			this.studentID = studentID;
		}
	}

	public int getYearMatriculated() {
		return yearMatriculated;
	}

	public void setYearMatriculated(int yearMatriculated) {
		this.yearMatriculated = yearMatriculated;
	}

	@Override
	public String toString() {
		return String.format("%-11s%-22s%-13d", studentID,super.toString(), yearMatriculated);
	}
}