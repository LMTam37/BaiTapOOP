package bai13;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachCongNhan {
	private CongNhan[] list;
	private int count;

	public DanhSachCongNhan(int count) {
		this.list = new CongNhan[count];
		this.count = 0;
	}

	public boolean themCN(CongNhan cn) {
		if (count >= list.length)
			return false;
		list[count] = cn;
		count++;
		return true;
	}

	public int getSoLuongCN() {
		return count;
	}

	public void dsCNHon200() {
		for (int i = 0; i < count; i++) {
			if (list[i].getmSoSP() >= 200) {
				System.out.println(list[i]);
			}
		}
	}

	public static String getTitle() {
		return String.format("%-15s%-10s%-20s%-10s", "Họ", "Tên", "Số sản phẩm", "lương");
	}

	public void sortCN() {
		Arrays.sort(list, 0, count, new Comparator<CongNhan>() {
			public int compare(CongNhan o1, CongNhan o2) {
				return Double.compare(o2.getmSoSP(), o1.getmSoSP());
			}
		});
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += list[i].toString() + "\n";
		}
		return String.format(s);
	}

}
