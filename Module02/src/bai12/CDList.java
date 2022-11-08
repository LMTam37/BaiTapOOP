package bai12;

import java.util.Arrays;

import java.util.Comparator;

public class CDList {
	private CD[] list;
	private int numCD;

	public CDList(int numCD) {
		this.list = new CD[numCD];
		this.numCD = 0;
	}

	public boolean addCD(CD newCD) {
		if (list.length <= numCD) {
			return false;
		}
		for (int i = 0; i < numCD; i++) {
			if (list[i].getId() == newCD.getId()) {
				return false;
			}
		}
		list[numCD] = newCD;
		numCD++;
		return true;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < numCD; i++) {
			s += list[i] + "\n";
		}
		return String.format(s);
	}

	public int getNumOfCD() {
		return numCD;
	}

	public double getSumCDPrice() {
		double sum = 0;
		for (int i = 0; i < numCD; i++) {
			sum += list[i].getPrice();
		}
		return sum;
	}

	private int getIdPos(int id) {
		for (int i = 0; i < numCD; i++) {
			if (list[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public void removeCD(int id) {
		int pos = getIdPos(id);
		for (int i = pos; i < numCD - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		numCD--;
	}

	public boolean findCD(int id) {
		int pos = getIdPos(id);
		if (pos == -1) {
			return false;
		}
		System.out.println(getTitle());
		System.out.println(list[pos]);
		return true;
	}

	public void sortPrice() {
		Arrays.sort(list, 0, numCD, new Comparator<CD>() {
			public int compare(CD o1, CD o2) {
				if(o2.getPrice() == o1.getPrice()) return 0;
				else if(o2.getPrice() > o1.getPrice()) return 1;
				else return -1;
			}
		});
	}

	public void sortTitle() {
		Arrays.sort(list, 0, numCD, new Comparator<CD>() {
			public int compare(CD o1, CD o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
	}

	public static String getTitle() {
		return String.format("%-10s %-15s %-10s %-15s", "Mã CD", "Tựa CD", "Số BH", "Giá Thành");
	}
}
