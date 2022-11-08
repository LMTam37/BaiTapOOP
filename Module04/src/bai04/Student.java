package bai04;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private int yob;

	public Student() {
		this.id = "chưa xác định";
		this.name = "chưa xác định";
		this.yob = 0;
	}
	public Student(String id, String name, int yob) {
		this.id = id;
		this.name = name;
		this.yob = yob;
	}

	public String getId() {
		return id;
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
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20d", id, name, yob);
	}

}
