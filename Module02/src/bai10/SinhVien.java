package bai10;

public class SinhVien {
	private String maSV;
	private String hoTen;

	public SinhVien(String maSV, String hoTen) {
		setMaSv(maSV);
		setHoTen(hoTen);
	}

	public SinhVien() {
		this.maSV = "001";
		this.hoTen = "chưa rõ";
	}

	public String getMaSv() {
		return maSV;
	}

	public void setMaSv(String maSV) {
		if (maSV.trim().equals(""))
			this.maSV = "001";
		else {
			this.maSV = maSV;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen.trim().equals("")) {
			this.hoTen = "chưa rõ";
		} else {
			this.hoTen = hoTen;
		}
	}

	public String toString() {
		return String.format("%8s| %s", maSV, hoTen);
	}

}
