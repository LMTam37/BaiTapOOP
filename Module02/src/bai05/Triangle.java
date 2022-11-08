package bai05;

public class Triangle {
	private double ma;
	private double mb;
	private double mc;

	private boolean isTriangle(double ma, double mb, double mc) {
		if (ma + mb > mc && ma + mc > mb && mb + mc > ma) {
			return true;
		}
		return false;
	}

	public Triangle() {
		ma = 0;
		mb = 0;
		mc = 0;
	}

	public Triangle(double ma, double mb, double mc) {
		if ((ma > 0 || mb > 0 || mc > 0) && isTriangle(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		if (ma > 0 && isTriangle(ma, mb, mc)) {
			this.ma = ma;
		}
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		if (mb > 0 && isTriangle(ma, mb, mc)) {
			this.mb = mb;
		}
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) {
		if (mc > 0 && isTriangle(ma, mb, mc)) {
			this.mc = mc;
		}
	}

	public double getPerimeter() {
		return ma + mb + mc;
	}

	public double getArea() {
		double p = (ma + mb + mc) / 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public String getTriangleType() {
		if ((ma != 0 && mb != 0 && mc != 0)) {
			if ((ma == mb && mb == mc)) {
				return "deu";
			} else if (ma == mb || ma == mb || mb == mc) {
				return "can";
			} else if (isTriangle(ma, mb, mc)) {
				return "thuong";
			}
		}
		return "khong phai tam giac";
	}

	public static String getTitle() {
		return (String.format("%-10s%-10s%-10s%-25s%-10s%-15s", "ma", "mb", "mc", "kieu tam giac", "chu vi",
				"dien tich"));
	}

	public String toString() {
		return String.format("%-10.2f%-10.2f%-10.2f%-25s%-10.2f%-15.2f", ma, mb, mc, getTriangleType(), getPerimeter(),
				getArea());
	}
}
