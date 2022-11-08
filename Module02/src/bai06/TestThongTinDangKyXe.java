package bai06;

public class TestThongTinDangKyXe {
	public static void main(String[] args) {
		try {
			ThongTinDangKyXe x1 = new ThongTinDangKyXe("Nguyễn Thu Loan", "Future Neo", 35000000, 100);
			ThongTinDangKyXe x2 = new ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger", 250000000, 3000);
			ThongTinDangKyXe x3 = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1000000000, 1500);
			System.out.println(ThongTinDangKyXe.getTitle());
			System.out.println(x1.toString());
			System.out.println(x2.toString());
			System.out.println(x3.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
	}
}
