package bai07;

import java.time.LocalDate;

public class TestTHangThucPham {
	public static void main(String []args) {
		try {
		HangThucPham product1 = new HangThucPham("001", "Gạo", 100000, LocalDate.of(2018, 7, 10), LocalDate.of(2017, 12, 25));
		HangThucPham product2 = new HangThucPham("002", "Mì", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2018, 9, 1));
		HangThucPham product3 = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017, 3, 1), LocalDate.of(2018, 3, 1));
		System.out.println(HangThucPham.getTitle());
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
