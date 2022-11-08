package bai11;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo;

	public KhachHang(String maKH, String hoTenKH, int soLuongSoHienCo) {
		this.maKH = maKH;
		setHoTenKH(hoTenKH);
		this.dsSoTietKiem = new SoTietKiem[soLuongSoHienCo];
		this.soLuongSoHienCo = 0;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public String getMaKH() {
		return maKH;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}

	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		if (maSo.trim().equals("") || soTienGoi <= 0 || kyHan <= 0 || laiSuat <= 0) {
			return false;
		}
		if (soLuongSoHienCo < dsSoTietKiem.length) {
			dsSoTietKiem[soLuongSoHienCo] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
			soLuongSoHienCo++;
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < soLuongSoHienCo; i++) {
			s += dsSoTietKiem[i].toString() + "\n";
		}
		return String.format("Khách Hàng: %s - %s\n%s", maKH, hoTenKH, s);
	}

}