package bai05;

public class Main {
	public static void main(String[] args) {
		Employee[] list = new Employee[4];
		list[0] = new SalariedEmployee("Nguyễn", "Văn A", "05A679", 1000000);
		list[1] = new HourlyEmployee("Nguyễn", "Văn B", "05A680", 25, 100);
		list[2] = new CommissionEmployee("Nguyễn", "Văn C", "05A681", 500, 0.2);
		list[3] = new BasePlusCommission("Nguyễn", "Văn D", "05A623", 500000, 0.5, 5000000);
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}