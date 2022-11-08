package bai15;

import java.time.LocalDate;

public class DanhSachHocVien {
	private DiemHocVien[] list;
	private int count = 0;

	public DanhSachHocVien(int count) {
		list = new DiemHocVien[count];
	}

	public void addHocVien(String name, LocalDate dob, double scoreSub1, double scoreSub2, double scoreSub3,
			double scoreSub4, double scoreSub5) {
		list[count] = new DiemHocVien(name, dob, scoreSub1, scoreSub2, scoreSub3, scoreSub4, scoreSub5);
		count++;
	}

	public double getAverage(int i) {
		return (list[i].getScoreSub1() + list[i].getScoreSub2() + list[i].getScoreSub3() + list[i].getScoreSub4()
				+ list[i].getScoreSub5()) / 5;
	}

	public boolean isBellow5(int i) {
		if (list[i].getScoreSub1() <= 5 || list[i].getScoreSub2() <= 5 || list[i].getScoreSub3() <= 5
				|| list[i].getScoreSub4() <= 5 || list[i].getScoreSub5() <= 5) {
			return true;
		}
		return false;
	}

	public int lamLuanVan() {
		int count = 0;
		for (int i = 0; i < count; i++) {
			if (getAverage(i) >= 7 && !isBellow5(i)) {
				count++;
			}
		}
		return count;
	}

	public int thiTotNghiep() {
		int count = 0;
		for (int i = 0; i < count; i++) {
			if (getAverage(i) <= 7 && !isBellow5(i)) {
				count++;
			}
		}
		return count;
	}

	public int thiLai() {
		int count = 0;
		for (int i = 0; i < count; i++) {
			if (isBellow5(i)) {
				count++;
			}
		}
		return count;
	}

	public String monThiLai(int i) {
		String s = "";
		
		if(list[i].getScoreSub1() <= 5) {
			s += "môn 1";
		}
		if(list[i].getScoreSub2() <= 5) {
			s += "môn 2";
		}
		if(list[i].getScoreSub3() <= 5) {
			s += "môn 3";
		}
		if(list[i].getScoreSub4() <= 5) {
			s += "môn 4";
		}
		if(list[i].getScoreSub5() <= 5) {
			s += "môn 5";
		}
		return s;
	}
	public String getResult(int i) {
		if (getAverage(i) > 7 && !(isBellow5(i))) {
			return "làm luận văn";
		} else if (getAverage(i) <= 7 && !(isBellow5(i))) {
			return "thi tốt nghiệp";
		} else if (isBellow5(i)) {
			return "thi lại";
		}
		return "chưa rõ";
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			String note = getResult(i);
			String thiLai = monThiLai(i);
			String average = String.valueOf(getAverage(i));
			s += list[i] + note + "	     " + thiLai +"\n";
		}
		return String.format(s);
	}
	public static String getTitle() {
		return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-20s%-15s", "tên", "ngày sinh", "điểm môn 1", "điểm môn 2",
				"điểm môn 3", "điểm môn 4", "điểm môn 5", "ghi chú", "môn thi lại");
	}
}