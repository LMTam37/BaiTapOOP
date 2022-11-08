package bai04;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao() {
		super();
		this.thue = 0;
	}

	public SachThamKhao(String maSo, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSo, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public double getThanhTien() {
		return getSoLuong() * getDonGia() + thue;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20.2f", thue);
	}

}
