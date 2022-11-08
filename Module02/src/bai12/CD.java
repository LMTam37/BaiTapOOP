package bai12;

public class CD {
	private int id;
	private String title;
	private int songNum;
	private double price;

	public CD(int id, String title, int songNum, double price) {
		setId(id);
		setTitle(title);
		setSongNum(songNum);
		setPrice(price);
	}

	public CD() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			this.id = 999999;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.trim().equals("")) {
			this.title = "chưa xác định";
		} else {
			this.title = title;
		}
	}

	public int getSongNum() {
		return songNum;
	}

	public void setSongNum(int songNum) {
		if (songNum > 0) {
			this.songNum = songNum;
		} else {
			this.songNum = 1;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 1;
		}
	}

	public String toString() {
		return String.format("%-10d %-15s %-10d %-20.2f", id, title, songNum, price);
	}

}