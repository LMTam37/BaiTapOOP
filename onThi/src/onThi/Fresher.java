package onThi;

import java.time.LocalDate;

public class Fresher extends Employee {
	private int gradYear;
	private String gradRank;

	public Fresher() {
		super();
		this.gradYear = LocalDate.now().getYear();
		this.gradRank = "C";
	}

	public Fresher(String id, String fisrtName, String lastName, LocalDate birthday, String phone, int gradYear,
			String gradRank) {
		super(id, fisrtName, lastName, birthday, phone);
		setGradYear(gradYear);
		setGradRank(gradRank);
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		if (gradYear < 1 || gradYear > LocalDate.now().getYear()) {
			this.gradYear = LocalDate.now().getYear();
		} else {
			this.gradYear = gradYear;
		}
	}

	public String getGradRank() {
		return gradRank;
	}

	public void setGradRank(String gradRank) {
		if (gradRank.trim().equals("") || !(gradRank.equals("A") || gradRank.equals("B") || gradRank.equals("C"))) {
			this.gradRank = "C";
		} else {
			this.gradRank = gradRank;
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20d%-20s", gradYear, gradRank);
	}
}
