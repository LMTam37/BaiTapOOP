package bai04;

public class DiemSinhVien {
	private int rollNum;
	private String name;
	private double theoryMark;
	private double practiceMark;

	public DiemSinhVien() {
		rollNum = 1;
		name = "chưa rõ";
		theoryMark = 0;
		practiceMark = 0;
	}

	public DiemSinhVien(int rollNum, String name, double theoryMark, double practiceMark) throws Exception {
		setRollNum(rollNum);
		setName(name);
		setTheoryMark(theoryMark);
		setPracticeMark(practiceMark);
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) throws Exception {
		if (rollNum >= 0) {
			this.rollNum = rollNum;
		} else {
			throw new Exception("hay nhap vao ma so sinh vien lon hon 0");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.trim().equals("")) {
			this.name = "chưa rõ";
		} else {
			this.name = name;
		}
	}

	public double getTheoryMark() {
		return theoryMark;
	}

	public void setTheoryMark(double theoryMark) throws Exception {
		if (theoryMark >= 0 && theoryMark <= 10) {
			this.theoryMark = theoryMark;
		} else {
			throw new Exception("hay nhap vao diem trong khoang [0,10]");
		}
	}

	public double getPracticeMark() {
		return practiceMark;
	}

	public void setPracticeMark(double practiceMark) throws Exception {
		if (practiceMark >= 0 && practiceMark <= 10) {
			this.practiceMark = practiceMark;
		} else {
			throw new Exception("hay nhap vao diem trong khoang [0,10]");
		}
	}

	public double getAverageMark() {
		return (practiceMark + theoryMark) / 2;
	}
	public static String getTitle() {
		return String.format("%-10s%-20s%-10s%-10s%-10s", "masv", "Hoten", "diemLT", "diemTH", "diemtb");
	}
	public String toString() {
		return String.format("%-10d%-20s%-10.2f%-10.2f%-10.2f", rollNum, name, theoryMark, practiceMark,
				getAverageMark());
	}
}
