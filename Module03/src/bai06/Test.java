package bai06;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		ListCommodity list = new ListCommodity(10);
		list.add(new FoodCommodity("A673", "Cơm", 100000, 50, "Phúc Lộc", LocalDate.of(2020, 10, 20), LocalDate.of(2025, 12, 20)));
		list.add(new ElectricalCommodity("A543", "Nồi cơm", 150000, 10, 5, 200));
		list.add(new CrockeryCommodity("B524", "Lọ cấm hoa", 200000, 4, "SPV", LocalDate.of(2020, 1, 12)));
		list.add(new FoodCommodity("A123", "Thịt sườn", 100000, 50, "Phúc Lộc", LocalDate.of(2020, 2, 22), LocalDate.of(2025, 2, 12)));
		list.add(new ElectricalCommodity("A896", "Bàn ủi", 70000, 13, 6, 200));
		list.add(new CrockeryCommodity("B522", "Chén sứ", 100000, 7, "Bát Tràng", LocalDate.of(2020, 5, 10)));
		list.sortInventoryDESC();
		System.out.println(list.getInforList());
	}
}
