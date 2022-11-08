package bai15;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		DanhSachHocVien list = new DanhSachHocVien(3);
		list.addHocVien("Nguyễn Văn A", LocalDate.of(2003, 4, 6), 7, 7, 7, 7, 7);
		list.addHocVien("Nguyễn Văn B", LocalDate.of(2003, 4, 6), 8, 9, 7, 10, 6);
		list.addHocVien("Nguyễn Văn C", LocalDate.of(2003, 4, 6), 8, 9, 7, 10, 5);
		System.out.println(DanhSachHocVien.getTitle());
		System.out.println(list);
	}
}
