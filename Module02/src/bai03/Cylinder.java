package bai03;

public class Cylinder {
	private double r;
	private double h;

	public Cylinder() {
		r = 0;
		h = 0;
	}

	public Cylinder(double r, double h) {
		setR(r);
		setH(h);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getSurArea() {
		return 2 * 3.14 * r * h;
	}

	public double getTotalSurArea() {
		return 2 * 3.14 * r * (r + h);
	}

	public double getVolume() {
		return 3.14 * r * r * h;
	}

	public String toString() {
		return String.format("chu vi = %.2f, chieu cao = %.2f", r, h);
	}
}
