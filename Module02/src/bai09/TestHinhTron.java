package bai09;

public class TestHinhTron {
	public static void main(String[] args) {
		ToaDo coordinate = new ToaDo("P", 5, 5);
		HinhTron circle = new HinhTron(coordinate, 10.5);
		System.out.println(circle);
	}
}
