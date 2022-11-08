package bai03;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder a = new Cylinder(50, 100);
		System.out.println(a);
		System.out.println("dien tich xung quanh cua hinh " + a.getSurArea());
		System.out.println("dien tich toan phan cua hinh " + a.getTotalSurArea());
		System.out.println("the tich cua hinh " + a.getVolume());

		a.setR(100);
		System.out.println(a);
		System.out.println("dien tich xung quanh cua hinh " + a.getSurArea());
		System.out.println("dien tich toan phan cua hinh " + a.getTotalSurArea());
		System.out.println("the tich cua hinh " + a.getVolume());
	}
}
