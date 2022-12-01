package onThi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Management {
	private List<Employee> list;

	public Management() {
		this.list = new ArrayList<Employee>();
	}

	public boolean add(Employee e) {
		if (!(list.contains(e))) {
			list.add(e);
			return true;
		}
		return false;
	}

	public int getNumGradEmpThisYear() {
		int count = 0;
		for (Employee curEmp : list) {
			if (curEmp instanceof Fresher) {
				if (((Fresher) curEmp).getGradYear() == LocalDate.now().getYear()) {
					count++;
				}
			}
		}
		return count;
	}

	public boolean setBirthById(String id, LocalDate newBirth) {
		for (Employee curEmp : list) {
			if (curEmp.getId().equalsIgnoreCase(id)) {
				curEmp.setBirthday(newBirth);
				return true;
			}
		}
		return false;
	}

	public Management getListEmp5Exp() {
		Management result = new Management();
		for (Employee curEmp : list) {
			if (curEmp instanceof Experience) {
				if (((Experience) curEmp).getExpInYear() >= 5) {
					result.add(curEmp);
				}
			}
		}
		return result;
	}

	public void sortAscByName() {
		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				String o1Name = o1.getFullName().getFirstName() + " " + o1.getFullName().getLastName();
				String o2Name = o2.getFullName().getFirstName() + " " + o2.getFullName().getLastName();
				return o1Name.compareToIgnoreCase(o2Name);
			}
		});
	}
	public String getTitle() {
		return String.format("%-10s%-20s%-20s%-20s\n","mã","họ tên","ngày sinh","số điện thoại");
	}
	@Override
	public String toString() {
		String s = getTitle();
		for (Employee curEmp : list) {
			s += curEmp + "\n";
		}
		return s;
	}
}
