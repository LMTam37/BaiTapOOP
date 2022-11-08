package bai08;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String courseNbr;
	private String courseTitle;
	private int credits;
	private Set<Section> sections;

	public void addSection(String sectionNbr, String semester, String room, Faculty facultyMember,
			Set<Enrolment> listEnrolls) {
		sections.add(new Section(semester, sectionNbr, room, facultyMember, listEnrolls));
	}

	public int getNbrStudents(String sectionNbr) {
		for (Section s : sections) {
			if (s.getSectionNbr().equalsIgnoreCase(sectionNbr)) {
				return s.getListEnrolls();
			}
		}
		return -1;
	}

	public Course() {
		this.sections = new HashSet<Section>();
	}

	public Course(String courseNbr, String courseTitle, int credits) {
		this.courseNbr = courseNbr;
		this.courseTitle = courseTitle;
		this.credits = credits;
		this.sections = new HashSet<Section>();
	}

	public String getCourseNbr() {
		return courseNbr;
	}

	public void setCourseNbr(String courseNbr) {
		if (courseNbr.trim().equals("")) {
			this.courseNbr = "chưa xác định";
		} else {
			this.courseNbr = courseNbr;
		}
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		if (courseTitle.trim().equals("")) {
			this.courseTitle = "chưa xác định";
		} else {
			this.courseTitle = courseTitle;
		}
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Khóa học : [" + courseTitle + " (" + credits + "TC)]" + "\n";
		for(Section section : sections) {
				s += section.toString();
				s += "\tTổng số sinh viên : " + getNbrStudents(section.getSectionNbr());
		}
		return s;
	}
}