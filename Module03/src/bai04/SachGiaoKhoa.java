package bai04;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang = true;
	}

	public SachGiaoKhoa(String maSo, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSo, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double getThanhTien() {
		if (tinhTrang) {
			return getDonGia() * getSoLuong();
		} else {
			return getDonGia() * getSoLuong() * 0.5;
		}
	}

	@Override
	public String toString() {
		String s = super.toString();
		if (tinhTrang) {
			s += "moi";
		} else {
			s += "cu";
		}
		return s;
	}

}
