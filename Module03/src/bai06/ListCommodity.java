package bai06;

import java.util.Arrays;
import java.util.Comparator;

public class ListCommodity {
	private Commodity[] list;
	private int count;

	public ListCommodity(int n) {
		list = new Commodity[n];
		this.count = 0;
	}

	public Commodity find(Commodity temp) {
		for (int i = 0; i < count; i++) {
			if (temp.getId().equalsIgnoreCase(list[i].getId())) {
				return list[i];
			}
		}
		return null;
	}

	public boolean add(Commodity temp) {
		if (list.length > count || find(temp) == null) {
			list[count] = temp;
			count++;
			return true;
		}
		return false;
	}

	public String getInforList() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof FoodCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof ElectricalCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof CrockeryCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}

	public String getInfoFoodCom() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof FoodCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}

	public String getInfoElectricCom() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof ElectricalCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}

	public String getInfoCrockeryCom() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof CrockeryCommodity) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}

	public void sortNameASC() {
		Arrays.sort(list, 0, count, new Comparator<Commodity>() {
			public int compare(Commodity o1, Commodity o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
	}

	public void sortInventoryDESC() {
		Arrays.sort(list, 0, count, new Comparator<Commodity>() {
			public int compare(Commodity o1, Commodity o2) {
				return Integer.compare(o2.getInventory(), o1.getInventory());
			}
		});
	}

	public String getFoodComHardToSell() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof FoodCommodity) {
				if (list[i].getSellStatus().equalsIgnoreCase("khó bán")) {
					s += list[i].toString() + "\n";
				}
			}
		}
		return s;
	}

	public int getPosIdInArray(String id) {
		for (int i = 0; i < count; i++) {
			if (list[i].getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}

	public boolean delCom(String id) {
		int pos = getPosIdInArray(id);
		if (pos != -1) {
			for (int i = pos; i < count - 1; i++) {
				list[i] = list[i + 1];
			}
			count--;
			return true;
		}
		return false;
	}

	public boolean changeCommodity(Commodity temp) {
		int pos = getPosIdInArray(temp.getId());
		if (pos != -1) {
			list[pos] = temp;
			return true;
		}
		return false;
	}
}
