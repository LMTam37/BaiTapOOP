package bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SoftwareHouse {
	private String theName;
	private ArrayList<Employee> list;

	public SoftwareHouse(String theName) {
		this.theName = theName;
		list = new ArrayList<Employee>();
	}

	public String getTitle() {
		return "Công ty " + theName + "\n" + String.format("%-20s%-20s%-20s", "Mã số", "Tên nhân viên", "Lương cơ bản");
	}

	public boolean addEmployee(Employee emp) {
		if (!list.contains(emp)) {
			list.add(emp);
			return true;
		} else {
			return false;
		}
	}

	public String displayAllStaff() {
		String s = "";
		for (Employee emp : list) {
			s += emp.toString() + "\n";
		}
		return s;
	}

	public double getMonthlySalaryBill() {
		double total = 0;
		for (Employee emp : list) {
			total += emp.getMonthlySalary();
		}
		return total;
	}

	public void sortAllStaffByName() {
		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareToIgnoreCase(o2.getTheName());
			}
		});
	}

	public String displayListProgrammers() {
		String s = "";
		for (Employee emp : list) {
			if (emp instanceof Programmer) {
				s += emp.toString() + "\n";
			}
		}
		return s;
	}

	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for (Employee emp : list) {
			if (emp instanceof Administrator) {
				if (aPayrollNo == emp.getThePayrollNumber()) {
					((Administrator) emp).setTheDepartment(deptNew);
					return true;
				}
			}
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		for (Employee emp : list) {
			if (emp.getThePayrollNumber() == id) {
				list.remove(emp);
				return true;
			}
		}
		return false;
	}
}
