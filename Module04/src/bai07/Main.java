package bai07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	static Employee inputEmp(int choice) {
		Employee result;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào mã số nhân viên");
		int payRollNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("nhập vào tên nhân viên");
		String name = sc.nextLine();
		System.out.println("nhập vào lương nhân viên");
		double salary = sc.nextDouble();
		sc.nextLine();
		if (choice == 1) {
			System.out.println("nhập vào ngôn ngữ lập trình");
			String language = sc.nextLine();
			result = new Programmer(payRollNumber, name, salary, language);
		} else if (choice == 2) {
			System.out.println("nhập vào ngôn ngữ lập trình");
			String language = sc.nextLine();
			result = new ProjectLeader(payRollNumber, name, salary, language);
		} else {
			System.out.println("nhập vào phòng ban");
			String dept = sc.nextLine();
			result = new Administrator(payRollNumber, name, salary, dept);
		}
		return result;
	}

	static void outputMenu() {
		System.out.println("1. Tạo công ty");
		System.out.println("2. Thêm nhân viên");
		System.out.println("3. Xuất ra thông tin các nhân viên");
		System.out.println("4. Tổng tiền phải trả cho tất cả nhân viên");
		System.out.println("5. Sắp xếp danh sách nhân viên theo tên");
		System.out.println("6. Xuất thông tin các lập trình viên");
		System.out.println("7. Cập nhật phòng ban cho người quản lý");
		System.out.println("8. xóa nhân viên");
		System.out.println("0. Kết thúc chương trình");
	}

	public static void main(String[] args) {
		int choice = 0;
		String s = "";
		int rollNumber = 0;
		String newDept = "";
		Scanner sc = new Scanner(System.in);
		SoftwareHouse list = null;
		do {
			outputMenu();
			System.out.println("nhập vào lựa chọn");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("nhập vào tên công ty muốn tạo");
				sc.nextLine();
				s = sc.nextLine();
				list = new SoftwareHouse(s);
				break;
			case 2:
				int empChoice;
				System.out.println("1. Lập trình viên");
				System.out.println("2. Người trưởng dự án");
				System.out.println("3. Người quản lý");
				System.out.println("nhập vào lựa chọn");
				do {
					empChoice = sc.nextInt();
				} while (empChoice > 3 || empChoice < 1);
				Employee e = inputEmp(empChoice);
				list.addEmployee(e);
				break;
			case 3:
				System.out.println(list.getTitle());
				System.out.println(list.displayAllStaff());
				break;
			case 4:
				DecimalFormat df = new DecimalFormat("#,###.00");
				System.out.format("Tổng số tiền phải trả %s\n", df.format(list.getMonthlySalaryBill()));
				break;
			case 5:
				list.sortAllStaffByName();
				System.out.println("Sắp xếp thành công");
			case 6:
				System.out.println(list.displayListProgrammers());
				break;
			case 7:
				System.out.println("Nhập vào mã số của nhân viên cần cập nhật phong bàn");
				rollNumber= sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập vào phòng ban mới cho nhân viên");
				newDept = sc.nextLine();
				list.updateDepartmentForAdmin(rollNumber, newDept);
				break;
			case 8:
				System.out.println("Nhập vào mã số của nhân viên cần cập nhật phong bàn");
				rollNumber = sc.nextInt();
				list.deleteEmployee(rollNumber);
				break;
			}
		} while (choice != 0);
	}
}
