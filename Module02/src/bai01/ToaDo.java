package bai01;

public class ToaDo {
	private double x;
	private double y;
	private String name;

	public ToaDo() {
		x = 0;
		y = 0;
		name = "O";
	}

	public ToaDo(double x, double y, String name) {
		setX(x);
		setY(y);
		setName(name);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("%s(%.2f, %.2f)", name, x, y);
	}
}
