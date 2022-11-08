package bai05;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle tamgiac1 = new Triangle(-5, 4, 8);
		Triangle tamgiac2 = new Triangle(7, 2, 3);
		Triangle tamgiac3 = new Triangle(5, 4, 8);
		Triangle tamgiac4 = new Triangle(2, 2, 3);
		Triangle tamgiac5 = new Triangle(3, 3, 3);
		System.out.println(Triangle.getTitle());
		System.out.println(tamgiac1.toString());
		System.out.println(tamgiac2.toString());
		System.out.println(tamgiac3.toString());
		System.out.println(tamgiac4.toString());
		System.out.println(tamgiac5.toString());
	}
}
