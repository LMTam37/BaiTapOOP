package bai07;

public class Student extends Person {
	private double scoreSub1;
	private double scoreSub2;

	public Student() {
		super();
		this.scoreSub1 = 0;
		this.scoreSub2 = 0;
	}

	public Student(String name, String address, double scoreSub1, double scoreSub2) {
		super(name, address);
		setScoreSub1(scoreSub1);
		setScoreSub2(scoreSub2);
	}

	public double getScoreSub1() {
		return scoreSub1;
	}

	public void setScoreSub1(double scoreSub1) {
		if (scoreSub1 < 0) {
			this.scoreSub1 = 0;
		} else {
			this.scoreSub1 = scoreSub1;
		}
	}

	public double getScoreSub2() {
		return scoreSub2;
	}

	public void setScoreSub2(double scoreSub2) {
		if (scoreSub2 < 0) {
			this.scoreSub2 = 0;
		} else {
			this.scoreSub2 = scoreSub2;
		}
	}

	public double getAvg() {
		return (scoreSub1 + scoreSub2) / 2;
	}

	public String getEvaluate() {
		double avg = getAvg();
		if (avg >= 8) {
			return "giỏi";
		} else if (avg >= 6.5) {
			return "khá";
		} else if (avg >= 5) {
			return "trung bình";
		} else {
			return "yếu";
		}
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20.2f%-20.2f", scoreSub1, scoreSub2);
	}

}
