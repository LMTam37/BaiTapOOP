package bai08;

import java.util.HashSet;
import java.util.Set;

public class Section {
	private String semester;
	private String sectionNbr;
	private String room;
	private Faculty facultyMember;
	private Set<Enrolment> listEnrolls;

	public Section() {
		this.semester = "chưa xác định";
		this.sectionNbr = "chưa xác định";
		this.room = "chưa xác định";
		this.facultyMember = new Faculty();
		this.listEnrolls = new HashSet<Enrolment>();
	}

	public Section(String semester, String sectionNbr, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
		this.semester = semester;
		this.sectionNbr = sectionNbr;
		this.room = room;
		this.facultyMember = facultyMember;
		this.listEnrolls = listEnrolls;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSectionNbr() {
		return sectionNbr;
	}

	public void setSectionNbr(String sectionNbr) {
		this.sectionNbr = sectionNbr;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getListEnrolls() {
		return listEnrolls.size();
	}

	@Override
	public String toString() {
		String s = "";
		s += "\t===== Thông tin học phần =====\n";
		s += "\tMã học phần: " + sectionNbr + "\n";
		s += "\tHọc kỳ: " + semester + "\n";
		s += "\tPhòng học: " + room + "\n";
		s += "\tGiảng Viên: " + facultyMember.toString() + "\n";
		s += "\t===== Danh sách sinh viên =====\n";
		s += String.format("\t%-11s%-18s%-15s%-20s\n", "Mã sv", "Họ tên", "Khóa năm", "Điểm");
		for (Enrolment enroll : listEnrolls) {
			s += "\t" + enroll.toString() + "\n";
		}
		return s;
	}

}