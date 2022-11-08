package bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListClassRoom {
	private ArrayList<ClassRoom> list;

	public ListClassRoom() {
		this.list = new ArrayList<ClassRoom>();
	}

	public boolean add(ClassRoom room) {
		if (list.contains(room)) {
			return false;
		}
		list.add(room);
		return true;
	}

	public ClassRoom find(String id) {
		for (ClassRoom room : list) {
			if (room.getId().equalsIgnoreCase(id)) {
				return room;
			}
		}
		return null;
	}

	public String getTitle() {
		return String.format("%-20s%-20s%-20s%-20s%-20s", "Mã Phòng", "Dãy Nhà", "Diện tích", "Số Bóng Đèn",
				"Số máy tính/Sức chứa");
	}

	@Override
	public String toString() {
		String s = "";
		for (ClassRoom room : list) {
			s += room.toString() + "\n";
		}
		return s;
	}

	public ArrayList<ClassRoom> getListStandardRoom() {
		ArrayList<ClassRoom> tempList = new ArrayList<ClassRoom>();
		for (ClassRoom room : list) {
			if (room.isStandard()) {
				tempList.add(room);
			}
		}
		return tempList;
	}

	public void sortBuildingASC() {
		Collections.sort(list, new Comparator<ClassRoom>() {
			public int compare(ClassRoom o1, ClassRoom o2) {
				return o1.getBuildings().compareToIgnoreCase(o2.getBuildings());
			}
		});
	}

	public void sortArea() {
		Collections.sort(list, new Comparator<ClassRoom>() {
			public int compare(ClassRoom o1, ClassRoom o2) {
				return Double.compare(o1.getArea(), o2.getArea());
			}
		});
	}

	public void sortLightBulb() {
		Collections.sort(list, new Comparator<ClassRoom>() {
			public int compare(ClassRoom o1, ClassRoom o2) {
				return Integer.compare(o1.getNumLightBulb(), o2.getNumLightBulb());
			}
		});
	}

	public boolean upateNumComputer(String id, int numComputer) {
		for (ClassRoom room : list) {
			if (room instanceof ComputerLab) {
				if (room.getId().equalsIgnoreCase(id)) {
					((ComputerLab) room).setNumComputer(numComputer);
					return true;
				}
			}
		}
		return false;
	}

	public boolean delClassRoom(String id) {
		for (ClassRoom room : list) {
			if (room.getId().equalsIgnoreCase(id)) {
				list.remove(room);
				return true;
			}
		}
		return false;
	}

	public int calcTotalClassRoom() {
		return list.size();
	}

	public ArrayList<ClassRoom> getListClassRoom60Computer() {
		ArrayList<ClassRoom> tempList = new ArrayList<ClassRoom>();
		for (ClassRoom room : list) {
			if (room instanceof ComputerLab) {
				if (((ComputerLab) room).getNumComputer() > 60) {
					tempList.add(room);
				}
			}
		}
		return tempList;
	}
}
