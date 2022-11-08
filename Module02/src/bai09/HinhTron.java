package bai09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	public HinhTron(ToaDo tam, double banKinh) {
		setTam(tam);
		setBanKinh(banKinh);
	}

	public HinhTron() {
		this.tam = new ToaDo();
		this.banKinh = 0;
	}

	public double tinhChuVi() {
		return 2 * 3.14 * banKinh;
	}

	public double tinhDienTich() {
		return 3.14 * banKinh * banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		if (banKinh < 0) {
			banKinh = 1;
		} else {
			this.banKinh = banKinh;
		}
	}

	public String toString() {
		return String.format("Diện tích và chu vi hình tròn tâm %s có bán kính %.1fm là %.2f và %.2f", tam.toString(),
				banKinh, tinhDienTich(), tinhChuVi());
	}
}
