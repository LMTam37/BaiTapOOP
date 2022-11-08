package bai10;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;

	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHoc(thongTinLopHoc);
		setDsSV(dsSV);
	}

	public String getMaLHP() {
		return maLHP;
	}

	public void setMaLHP(String maLHP) {
		if (maLHP.trim().equals("")) {
			this.maLHP = "chưa rõ";
		} else {
			this.maLHP = maLHP;
		}
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		if (tenLHP.trim().equals("")) {
			this.tenLHP = "chưa xác định";
		} else {
			this.tenLHP = tenLHP;
		}
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		if (tenGV.trim().equals("")) {
			this.tenGV = "chưa xác định";
		} else {
			this.tenGV = tenGV;
		}
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc) {
		if (thongTinLopHoc.trim().equals("")) {
			this.thongTinLopHoc = "chưa xác định";
		} else {
			this.thongTinLopHoc = thongTinLopHoc;
		}
	}

	public SinhVien[] getDsSV() {
		return dsSV;
	}

	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}

	public int getSoLuongSV() {
		return dsSV.length;
	}

	public String toString() {
		String s = "";
		s += "- Mã LHP: " + maLHP + "\n";
		s += "- Tên LHP: " + tenLHP + "\n";
		s += "- GV giảng dạy: " + tenGV + "\n";
		s += "- Thông tin buổi học: " + thongTinLopHoc + "\n";
		s += "- Danh sách sinh viên" + "\n";
		for (SinhVien sv : dsSV) {
			s += sv + "\n";
		}
		s += "Tổng số sinh viên: " + getSoLuongSV();
		return s;
	}

}
