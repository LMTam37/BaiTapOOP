package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String id;
	private String name;
	private double price;
	private LocalDate prod;
	private LocalDate exp;

	public HangThucPham(String id, String name, double price, LocalDate prod, LocalDate exp) throws Exception {
		if (id.trim().equals("")) {
			throw new Exception("Lỗi: Mã hàng rỗng!");
		} else {
			this.id = id;
		}
		setName(name);
		setPrice(price);
		setProd(prod);
		setExp(exp);
	}

	public HangThucPham(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			this.name = "xxx";
		} else {
			this.name = name;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public LocalDate getProd() {
		return prod;
	}

	public void setProd(LocalDate prod) {
		if (prod.isAfter(LocalDate.now())) {
			this.prod = LocalDate.now();
		} else {
			this.prod = prod;
		}
	}

	public LocalDate getExp() {
		return exp;
	}

	public void setExp(LocalDate exp) {
		if (exp.isBefore(prod)) {
			this.exp = prod;
		} else {
			this.exp = exp;
		}
	}

	public boolean isExp() {
		return (exp.isBefore(LocalDate.now()) ? true : false);
	}

	public static String getTitle() {
		return String.format("%-10s%-10s%15s%20s%20s%13s"
				+ "\n---------------------------------------------------------------------------------------------", 
				"Mã_Hàng", "Tên_Hàng", "Đơn_Giá", "Ngày_Sản_Xuất","Ngày_Hết_Hàn", "Ghi_Chú");
	}

	public String toString() {
		String note = "";
		if (isExp()) {
			note = "Hàng hết hạn";
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String prodDay = dtf.format(prod);
		String expDay = dtf.format(exp);
		DecimalFormat df = new DecimalFormat("#,###.00VND");
		return String.format("%-10s%-10s%15s%17s%21s%20s", id, name, df.format(price), prodDay, expDay, note);
	}
}