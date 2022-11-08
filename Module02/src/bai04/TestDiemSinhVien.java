package bai04;

import java.util.Scanner;

public class TestDiemSinhVien {
	public static void main(String[] args) {
		try {
			DiemSinhVien sv1 = new DiemSinhVien(21023911, "La Minh Tam", 9, 9);
			DiemSinhVien sv2 = new DiemSinhVien();
			sv2.setRollNum(21001861);
			sv2.setName("Tran Trung Tien");
			sv2.setTheoryMark(10);
			sv2.setPracticeMark(10);
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ma so sinh vien sv3:");
			int sv3RollNum = sc.nextInt();
			System.out.println("nhap vao ho ten cua sinh vien sv3:");
			sc.nextLine();
			String sv3Name = sc.nextLine();
			System.out.println("nhap diem ly thuyet cua sinh vien sv3:");
			int sv3TheoryMark = sc.nextInt();
			System.out.println("nhap diem thuc hanh cua sinh vien sv3:");
			int sv3PracticeMark = sc.nextInt();
			DiemSinhVien sv3 = new DiemSinhVien(sv3RollNum, sv3Name, sv3TheoryMark, sv3PracticeMark);
			System.out.println(DiemSinhVien.getTitle());
			System.out.println(sv1);
			System.out.println(sv2);
			System.out.println(sv3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
