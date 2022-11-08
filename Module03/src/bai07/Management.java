package bai07;

import java.util.Arrays;
import java.util.Comparator;

public class Management {
	private Person[] list;
	private int count;

	public Management(int n) {
		this.list = new Person[n];
		this.count = 0;
	}

	public boolean addPerson(Person p) {
		if (list.length > count) {
			list[count] = p;
			count++;
			return true;
		} else {
			return false;
		}
	}

	public int getPos(String name) {
		for (int i = 0; i < count; i++) {
			if (list[i].getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}

	public boolean delPerson(String name) {
		int pos = getPos(name);
		if (pos != -1) {
			for (int i = pos; i < count - 1; i++) {

				list[i] = list[i + 1];
			}
			count--;
			return true;
		}
		return false;
	}

	public void sortName() {
		Arrays.sort(list, 0, count, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
	}

	@Override
	public String toString() {
		String s = String.format("%-20s%-20s\n", "Tên", "Địa chỉ");
		for (int i = 0; i < count; i++) {
			s += list[i].toString() + "\n";
		}
		return s;
	}
}