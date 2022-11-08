package bai11;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		KhachHang kh = new KhachHang("KH001", "Nguyen Van A", 50);
		kh.themSoTietKiem("111", LocalDate.of(2020, 05, 01), 1000000, 3, 0.005f);
		kh.themSoTietKiem("112", LocalDate.of(2019, 12, 10), 10000000, 6, 0.006f);
		System.out.println(kh);
	}
}