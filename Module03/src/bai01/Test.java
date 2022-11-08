package bai01;

public class Test {
	public static double getTotalTurnOver(Buses[] bus) {
		double total = 0;
		for (Buses curBus : bus) {
			total += curBus.getTurnover();
		}
		return total;
	}

	public static double getSubUrbanTurnOver(Buses[] bus) {
		double total = 0;
		for (Buses curBus : bus) {
			if (curBus instanceof Urban) {
				total += curBus.getTurnover();
			}
		}
		return total;
	}

	public static double getUrbanTurnOver(Buses[] bus) {
		double total = 0;
		for (Buses curBus : bus) {
			if (curBus instanceof Suburban) {
				total += curBus.getTurnover();
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Buses[] list = new Buses[4];
		list[0] = new Urban("C1", "Nguyễn Văn A", "59N7523", 50000, 400, 7);
		list[1] = new Suburban("X1", "Nguyễn Văn C", "59A3312", 500, "TP HCM", 5);
		list[2] = new Suburban("X1", "Nguyễn Thi B", "59A3312", 500, "Ha Noi", 8);
		list[3] = new Urban("C1", "Nguyễn Thi D", "59N7523", 60000, 432, 15);
		System.out.format("%-20s%-20s%-20s%-20s\n","Mã chuyến","Họ Tên lái xe","số xe","doanh thu");
		for (Buses bus : list) {
			System.out.println(bus);
		}

		System.out.println("Tong doanh thu cac chuyen xe: " + getTotalTurnOver(list));
		System.out.println("Tong doanh thu cac chuyen xe noi thanh: " + getUrbanTurnOver(list));
		System.out.println("Tong doanh thu cac chuyen xe ngoai thanh: " + getSubUrbanTurnOver(list));
	}
}
