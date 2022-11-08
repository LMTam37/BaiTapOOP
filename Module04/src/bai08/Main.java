package bai08;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String []args) {
		Set<Enrolment> enrolmentList = new HashSet<Enrolment>();
		enrolmentList.add(new Enrolment(new Student("Hoàng", "Dũng","140211" , 2014),"", "A", 8.5f));
		enrolmentList.add(new Enrolment(new Student("Trần", "Bình","140511" , 2014),"", "A", 9.5f));
		enrolmentList.add(new Enrolment(new Student("Lê", "Huynh","140811" , 2014),"", "B", 7f));
		enrolmentList.add(new Enrolment(new Student("Hồ", "Huyền","140611" , 2013),"", "C", 5.5f));
		Faculty faculty = new Faculty("Lê", "Kim Khánh", "CNTT", "");
		Course course = new Course("", "OOP - Lập trình hướng đối tượng", 4);
		course.addSection("0602", "I (2015 - 2016)", "H5.01" , faculty, enrolmentList);
		System.out.println(course);
	}
}
