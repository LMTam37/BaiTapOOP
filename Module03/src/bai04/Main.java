package bai04;

import java.time.LocalDate;

public class Main {
	public static void main(String []args) {
		DanhSachSach list = new DanhSachSach(50);
		list.them(new SachGiaoKhoa("GK01", LocalDate.of(2023, 5, 23), 10000, 10, "Kim Đồng", true));
		list.them(new SachGiaoKhoa("GK02", LocalDate.of(2024, 2, 13), 10000, 10, "Kim Đồng", true));
		list.them(new SachGiaoKhoa("GK03", LocalDate.of(2023, 7, 27), 10000, 10, "Giáo Dục", true));
		list.them(new SachThamKhao("TK01", LocalDate.of(2023, 1, 5), 20000, 25, "Trẻ", 3000));
		list.them(new SachThamKhao("TK02", LocalDate.of(2023, 7, 15), 25000, 25, "Kim Đồng", 5000));
		list.them(new SachThamKhao("TK03", LocalDate.of(2025, 4, 20), 15000, 25, "Trẻ", 2000));
		System.out.println(list);
		System.out.println("tổng thành tiền sách giáo khoa " + list.tinhTongThanhTienSGK());
		System.out.println("tổng thành tiền sách tham khảo " + list.tinhTongThanhTienSTK());
		System.out.println("thành tiền cao nhất " + list.timThanhTienCaoNhat());
	}
}
