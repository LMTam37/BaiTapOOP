package bai04;

public class DanhSachSach {
	private Sach[] list;
	private int count;

	public DanhSachSach(int n) {
		list = new Sach[n];
		count = 0;
	}

	public boolean them(Sach sach) {
		if (list.length > count) {
			list[count] = sach;
			count++;
			return true;
		} else {
			return false;
		}
	}

	public double tinhTongThanhTienSGK() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachGiaoKhoa) {
				total += list[i].getThanhTien();
			}
		}
		return total;
	}

	public double tinhTongThanhTienSTK() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachThamKhao) {
				total += list[i].getThanhTien();
			}
		}
		return total;
	}

	public Sach[] timSachGiaoKhoaTheoNXB(String tenNXB) {
		Sach[] listSGK = new Sach[count];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachGiaoKhoa) {
				listSGK[index] = list[i];
				index++;
			}
		}
		return list;
	}

	public double timThanhTienCaoNhat() {
		double max = list[0].getThanhTien();
		for (int i = 1; i < count; i++) {
			if (list[i].getThanhTien() > max) {
				max = list[i].getThanhTien();
			}
		}
		return max;
	}

	public static String tieuDe() {
		return String.format("%-20s%-20s%-20s%-20s%-20s%-20s\n","mã số","ngày nhập","thành tiền","số lượng","nhà xuất bản","thuế hoặc tình trạng");
	}
	
	@Override
	public String toString() {
		String s = tieuDe();
		for (int i = 0; i < count; i++) {
			s+= list[i] + "\n";
		}
		return s;
	}
}
