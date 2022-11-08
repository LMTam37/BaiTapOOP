package bai11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;

	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}

	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0) {
			return soThangGoi;
		} else {
			return soThangGoi / kyHan * kyHan;
		}
	}

	public double tinhTienLai() {
		return soTienGoi * laiSuat * (tinhSoThangGoiThuc() / kyHan);
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngayMoSoFormated = dtf.format(ngayMoSo);
		String toDay = dtf.format(LocalDate.now());
		return String.format(
				"STK %s[%s-%s]KH %d tháng, số tháng tính lãi: %d, ls %.3f, số tiền:%.2f --> Tiền lãi: %.3f", maSo,
				ngayMoSoFormated, toDay, kyHan, tinhSoThangGoiThuc(), laiSuat, soTienGoi, tinhTienLai());
	}
}
