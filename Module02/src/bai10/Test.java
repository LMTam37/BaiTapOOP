package bai10;

public class Test {
	public static void main(String []args) {
		SinhVien sv[] = new SinhVien[3];
		sv[0] = new SinhVien("123", "Nguyen Van A");
		sv[1] = new SinhVien("543", "Le Thi B");
		sv[2] = new SinhVien("321", "Luong Van C");
		LopHocPhan LHP = new LopHocPhan("123456", "LT Hướng đối tượng", "Cô Hà", "Thứ 7, Tiết 4-6, Phòng A1.1", sv);
		System.out.println(LHP);
	}
}