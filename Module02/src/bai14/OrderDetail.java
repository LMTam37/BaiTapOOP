package bai14;

import java.text.DecimalFormat;

public class OrderDetail {
	private int quantity;
	private Product product;

	public OrderDetail(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calcTotalPrice() {
		return product.getPrice() * quantity;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return String.format("%-10s |%11d |%15s", product, quantity, df.format(calcTotalPrice()));
	}

}
