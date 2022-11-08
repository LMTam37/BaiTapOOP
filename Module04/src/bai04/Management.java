package bai04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Management {
	private ArrayList<Student> list;

	public Management() {
		this.list = new ArrayList<Student>();
	}

	public boolean add(Student object) {
		if (list.contains(object)) {
			return false;
		}
		list.add(object);
		return true;
	}

	public boolean del(String id) {
		Student delStudent = new Student(id, "", 0);
		return list.remove(delStudent);
	}

	public boolean update(String id, String name, int yob) {
		Student temp = new Student(id, "", 0);
		if (!list.contains(temp)) {
			return false;
		}
		Student studentToUpdate = list.get(list.indexOf(temp));
		studentToUpdate.setName(name);
		studentToUpdate.setYob(yob);
		return true;
	}

	public Student findWithId(String id) {
		Student student = new Student(id, "", 0);
		if (list.indexOf(student) == -1) {
			return null;
		}
		return list.get(list.indexOf(student));
	}

	public Management findWithName(String name) {
		Management result = new Management();
		for (Student curStudent : list) {
			if (curStudent.getName().equalsIgnoreCase(name)) {
				result.add(curStudent);
			}
		}
		return result;
	}

	public void sort() {
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getId().compareToIgnoreCase(o2.getName());
			}
		});
	}

	@Override
	public String toString() {
		String s = "";
		for (Student student : list) {
			s += student + "\n";
		}
		return s;
	}

}
