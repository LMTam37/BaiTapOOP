package bai06;

public class ThongTinDangKyXe {
	private String owner;
	private String type;
	private double price;
	private int capacity;

	public ThongTinDangKyXe() {
		owner = "chưa rõ";
		type = " ";
		price = 0;
		capacity = 0;
	}

	public ThongTinDangKyXe(String owner, String type, double price, int capacity) throws Exception {
		setOwner(owner);
		setType(type);
		setPrice(price);
		setCapacity(capacity);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price < 0) {
			throw new Exception("hãy nhập vào trị giá xe lớn hơn 0");
		} else {
			this.price = price;
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) throws Exception {
		if (capacity < 0) {
			throw new Exception("hãy nhập vào dung tích xylanh lớn hơn 0");
		} else {
			this.capacity = capacity;
		}
	}

	public double getTax() {
		if (capacity < 100) {
			return price * 0.01;
		} else if (capacity >= 100 && capacity < 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}
	public static String getTitle() {
		return String.format("%-25s%-15s%-15s%-20s%-10s", "Tên chủ xe","Loại xe","Dung tích","Trị giá", "Thuế phải nộp");
	}
	public String toString() {
		return String.format("%-25s%-15s%-15d%-20.2f%-10.2f", owner, type, capacity, price, getTax());
	}

}
