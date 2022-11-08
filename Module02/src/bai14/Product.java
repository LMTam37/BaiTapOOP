package bai14;

import java.text.DecimalFormat;

public class Product {
	private String description;
	private String productID;
	private double price;

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format(" %-5s| %-15s|%10s", productID, description, df.format(price));
	}

	public Product(String description, String productID, double price) {
		this.description = description;
		this.productID = productID;
		this.price = price;
	}

	public Product() {
		this.description = "chưa rõ";
		this.productID = "chưa rõ";
		this.price = 0;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
