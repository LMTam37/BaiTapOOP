package bai07;

public class Test {
	public static void main(String []args) {
		Management list = new Management(50);
		list.addPerson(new Student("Nguyễn Văn D", "TP HCM", 9, 9));
		list.addPerson(new Student("Nguyễn Văn C", "Nam Định", 5, 6));
		list.addPerson(new Employee("Nguyễn Văn B", "HN", 1.5));
		list.addPerson(new Employee("Nguyễn Văn A", "An Giang", 0.5));
		list.addPerson(new Customer("Nguyễn Văn F", "Thanh Hóa", "ABC", 10000000, "tốt"));
		list.addPerson(new Customer("Nguyễn Văn E", "Quảng Ngãi", "AH", 50000000, "tốt"));
		list.delPerson("Nguyễn Văn C");
		list.sortName();
		System.out.println(list);
	}
}