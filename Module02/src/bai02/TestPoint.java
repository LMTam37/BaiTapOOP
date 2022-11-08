package bai02;

public class TestPoint {
	public static void main(String[] args) {
		Point a = new Point(5, 6);
		System.out.println(a);
		System.out.println("khoang cach tu diem " + a + " den O " + a.getDistance());

		a.setX(10);
		System.out.println(a);
		System.out.println("khoang cach tu diem " + a + " den O " + a.getDistance());
	}
}
