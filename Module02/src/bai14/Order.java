package bai14;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;

	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		lineItems = new OrderDetail[20];
		count = 0;
	}

	public int getOrderID() {
		return orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public void addLineItem(Product p, int x) {
		if (count > 20) {
			System.out.println("hóa đơn không được quá 20 mặt hàng");
			return;
		}
		lineItems[count] = new OrderDetail(p, x);
		count++;
	}

	public double calcTotalCharge() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			total += lineItems[i].calcTotalPrice();
		}
		return total;
	}
	public String getTitle() {
		return String.format("%s | %-6s| %-15s| %9s | %10s | %14s\n", "STT", "Mã SP", "Mô tả", "Đơn Giá", "S Lượng","Thành Tiền");
	}
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		String s = "";
		s+= "Mã HD: " + orderID + "\n";
		s+= "Ngày lập hóa đơn " + dtf.format(orderDate) + "\n";
		s+= getTitle();
		
		for (int i = 0; i < count; i++) {
			if (i >= 9) {
				s += " " + (i + 1) + " | " + lineItems[i] + "\n";
			} else {
				s += "  " + (i + 1) + " | " + lineItems[i] + "\n";
			}
		}
		s += "Tổng tiền thanh toán: " + df.format(calcTotalCharge());
		return String.format(s);
	}

}
