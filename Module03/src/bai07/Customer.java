package bai07;

public class Customer extends Person {
	private String companyName;
	private double billFee;
	private String evaluate;

	public Customer() {
		super();
		this.companyName = "chưa xác định";
		this.billFee = 0;
		this.evaluate = "chưa xác định";
	}

	public Customer(String name, String address, String companyName, double billFee, String evaluate) {
		super(name, address);
		this.companyName = companyName;
		this.billFee = billFee;
		this.evaluate = evaluate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		if (companyName.trim().equals("")) {
			this.companyName = "chưa xác định";
		} else {
			this.companyName = companyName;
		}
	}

	public double getBillFee() {
		return billFee;
	}

	public void setBillFee(double billFee) {
		if (billFee < 0) {
			this.billFee = 0;
		} else {
			this.billFee = billFee;
		}
	}

	public String getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(String evaluate) {
		if (evaluate.trim().equals("") || !evaluate.equalsIgnoreCase("tốt") || !evaluate.equalsIgnoreCase("chưa tốt")) {
			this.evaluate = "tốt";
		} else {
			this.evaluate = evaluate;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s%-20.2f%-20s", companyName, billFee, evaluate);
	}

}