package bai02;

import java.time.LocalDate;

public class Test {

	public static String calPrice(Book[] list) {
		double totalTextbookPrice = 0;
		double totalRefBookPrice = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof TextBook) {
				totalTextbookPrice += list[i].calPrice();
			}
			if (list[i] instanceof ReferenceBook) {
				totalRefBookPrice += list[i].calPrice();
			}
		}
		return "Tổng thành tiền của sách giáo khoa: " + totalTextbookPrice + "\nTổng thành tiền của sách tham khảo: "
				+ totalRefBookPrice;
	}

	public static void main(String[] args) {
		Book[] list = new Book[6];
		list[0] = new TextBook("A63", LocalDate.of(2022, 12, 13), 15000, 15, "Kim Đồng", "moi");
		list[1] = new ReferenceBook("KL7", LocalDate.of(2022, 12, 13), 20000, 100, "Thanh niên", 15);
		list[2] = new TextBook("AD6", LocalDate.of(2022, 12, 13), 30000, 52, "giáo dục", "cu");
		list[3] = new ReferenceBook("B273", LocalDate.of(2022, 12, 13), 10000, 25, "Hồng Đức", 5);
		list[4] = new TextBook("A76", LocalDate.of(2022, 12, 13), 28000, 48, "Kim Đồng", "cu");
		list[5] = new ReferenceBook("B273", LocalDate.of(2022, 12, 13), 10000, 37, "Lao động", 0);
		System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "Mã sách", "Ngày nhập", "Giá tiền", "Số lượng",
				"Nhà xuất bản");
		for (Book book : list) {
			System.out.println(book);
		}
		System.out.println(calPrice(list));
	}
}
