package bai06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String tempId = "";
		int numComputer = 0;
		ListClassRoom list = new ListClassRoom();
		list.add(new TheoryClass("3.5", "A", 20, 1, false));
		list.add(new TheoryClass("2.3", "B", 28, 3, true));
		list.add(new TheoryClass("4.1", "A", 20, 2, true));
		list.add(new ComputerLab("5.1", "H", 30, 4, 60));
		list.add(new ComputerLab("1.12", "B", 20, 2, 80));
		list.add(new ComputerLab("2.5", "C", 30, 4, 30));
		list.add(new labClass("1.5", "F", 30, 3, "CN Thực Phẩm", 60, true));
		list.add(new labClass("1.2", "F", 20, 3, "Sinh", 30, true));
		list.add(new labClass("1.7", "F", 20, 1, "Hóa", 60, false));
		System.out.println(list.getTitle());
		System.out.println(list);

		System.out.println("\ndanh sách sau khi sắp xếp theo diện tích");
		System.out.println(list.getTitle());
		list.sortArea();
		System.out.println(list);

		System.out.println("\ndanh sách sau khi sắp xếp theo dãy nhà");
		System.out.println(list.getTitle());
		list.sortBuildingASC();
		System.out.println(list);

		System.out.println("\ndanh sách sau khi sắp xếp theo số bóng đèn");
		System.out.println(list.getTitle());
		list.sortLightBulb();
		System.out.println(list);

		System.out.println("số phòng học: " + list.calcTotalClassRoom());

		System.out.println("nhập vào mã phòng muốn xóa");
		Scanner sc = new Scanner(System.in);
		tempId = sc.nextLine();
		list.delClassRoom(tempId);
		System.out.println("\ndanh sách sau khi xóa phòng " + tempId);
		System.out.println(list.getTitle());
		System.out.println(list);

		System.out.println("nhập vào mã phòng muốn cập nhật lại số máy tính");
		tempId = sc.next();
		System.out.println("nhập vào mã phòng muốn cập nhật lại số máy tính");
		numComputer = sc.nextInt();
		list.upateNumComputer(tempId, numComputer);
		System.out.println("\ndanh sách sau khi cập nhật " + tempId);
		System.out.println(list.getTitle());
		System.out.println(list);
	}
}
