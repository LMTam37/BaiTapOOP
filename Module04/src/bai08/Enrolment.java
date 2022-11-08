package bai08;

public class Enrolment {
	private String status;
	private String grade;
	private float numGrade;
	private Student student;

	public Enrolment(Student student, String status, String grade, float numGrade) {
		this.student = student;
		this.status = status;
		this.grade = grade;
		this.numGrade = numGrade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status.trim().equals("")) {
			this.status = "chưa xác định";
		} else {
			this.status = status;
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if (grade.trim().equals("")) {
			this.grade = "chưa xác định";
		} else {
			this.grade = grade;
		}
	}

	public float getNumGrace() {
		return numGrade;
	}

	public void setNumGrace(float numGrace) {
		if (numGrace < 0 || numGrace > 10) {
			this.numGrade = 0;
		} else {
			this.numGrade = numGrace;
		}
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20.1f", student, numGrade);
	}

}