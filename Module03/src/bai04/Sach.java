package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	private String maSo;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach() {
		super();
		this.maSo = "chưa xác định";
		this.ngayNhap = LocalDate.now();
		this.donGia = 0;
		this.soLuong = 0;
		this.nhaXuatBan = "chưa xác định";
	}

	public Sach(String maSo, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSo(maSo);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		if (maSo.trim().equals("")) {
			this.maSo = "chưa xác định";
		} else {
			this.maSo = maSo;
		}
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isBefore(LocalDate.now())) {
			this.ngayNhap = LocalDate.now();
		} else {
			this.ngayNhap = ngayNhap;
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (nhaXuatBan.trim().equals("")) {
			this.nhaXuatBan = "chưa xác định";
		} else {
			this.nhaXuatBan = nhaXuatBan;
		}
	}

	public double getThanhTien() {
		return soLuong * donGia;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-20s%-20s%-20s%-20d%-20s", maSo, dtf.format(ngayNhap), df.format(donGia), soLuong,
				nhaXuatBan);
	}

}
