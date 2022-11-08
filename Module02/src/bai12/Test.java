package bai12;

import java.util.Scanner;

public class Test {
	private static Scanner sc = new Scanner(System.in);

	public static CD input() {
		System.out.println("Nhập Thông Tin CD Mới\n");
		sc = new Scanner(System.in);
		System.out.print("Nhập mã CD: ");
		int id = sc.nextInt();
		System.out.print("Nhập tên CD: ");
		sc = new Scanner(System.in);
		String title = sc.nextLine();
		System.out.print("Nhập số bài hát: ");
		int numSong = sc.nextInt();
		System.out.print("Nhập giá thành: ");
		double price = sc.nextDouble();
		CD cd;
		cd = new CD(id, title, numSong, price);
		return cd;
	}

	public static void main(String[] args) {
		int id;
		CDList list = new CDList(0);
		int luaChon;
		do {
			System.out.println("========== MENU ==========");
			System.out.println("1. khởi tạo phần tử cho danh sách CD");
			System.out.println("2. thêm CD");
			System.out.println("3. Xuất danh sách CD");
			System.out.println("4. Xuất số lượng CD");
			System.out.println("5. xóa CD");
			System.out.println("6. Tính tổng giá thành");
			System.out.println("7. Tìm kiếm theo Mã CD");
			System.out.println("8. Sắp xếp danh sách giảm dần theo giá thành");
			System.out.println("9. Sắp xếp danh sách tăng dần theo tựa CD");
			System.out.println("0. Thoát Chương Trình");
			System.out.print("Nhập lựa chọn: ");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.print("Nhập số lượng CD cần thêm: ");
				int n = sc.nextInt();
				list = new CDList(n);
				break;
			case 2:
				list.addCD(input());
				break;
			case 3:
				System.out.println("Danh Sách:");
				System.out.println(CDList.getTitle());
				System.out.println(list);
				break;
			case 4:
				System.out.println("số lượng CD " + list.getNumOfCD());
				break;
			case 5:
				System.out.println("nhập vào mã CD muốn xóa");
				id = sc.nextInt();
				list.removeCD(id);
				break;
			case 6:
				System.out.println("tổng giá thành " + list.getSumCDPrice());
				break;
			case 7:
				System.out.println("nhập vào mã CD cần tìm");
				id = sc.nextInt();
				if (list.findCD(id)) {
					System.out.println("tồn tại mã CD");
				} else {
					System.out.println("không tồn tại mã CD");
				}
				break;
			case 8:
				System.out.println("sắp xếp giảm dần theo giá thành");
				list.sortPrice();
				break;
			case 9:
				System.out.println("Sắp xếp danh sách tăng dần theo tựa CD");
				list.sortTitle();
				break;
			default:
				break;
			}
		} while (luaChon != 0);
	}
}
