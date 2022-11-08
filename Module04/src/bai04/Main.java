package bai04;

public class Main {
	public static void main(String[] args) {
		Management list = new Management();
		list.add(new Student("C306", "Nguyễn Văn A",2003));
		list.add(new Student("B306", "Nguyễn Văn B", 2002));
		list.add(new Student("A306", "Nguyễn Văn C", 2001));
		list.update("A306", "Nguyễn Văn D", 2003);
		list.del("C306");
		list.sort();
		System.out.println(list);
	}
}