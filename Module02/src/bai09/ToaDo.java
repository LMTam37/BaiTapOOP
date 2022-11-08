package bai09;

public class ToaDo {
	private String ten;
	private float x;
	private float y;

	public String toString() {
		return String.format("%s(%.2f,%.2f)", ten, x, y);
	}

	public ToaDo(String ten, float x, float y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public ToaDo() {
		this.ten = "O";
		this.x = 0;
		this.y = 0;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if (ten.trim().equals("")) {
			this.ten = "O";
		} else {
			this.ten = ten;
		}
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
