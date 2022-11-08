package bai15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiemHocVien {
	private String name;
	private LocalDate dob;
	private double scoreSub1;
	private double scoreSub2;
	private double scoreSub3;
	private double scoreSub4;
	private double scoreSub5;
	public DiemHocVien(String name, LocalDate dob, double scoreSub1, double scoreSub2, double scoreSub3,
			double scoreSub4, double scoreSub5) {
		this.name = name;
		this.dob = dob;
		this.scoreSub1 = scoreSub1;
		this.scoreSub2 = scoreSub2;
		this.scoreSub3 = scoreSub3;
		this.scoreSub4 = scoreSub4;
		this.scoreSub5 = scoreSub5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getScoreSub1() {
		return scoreSub1;
	}
	public void setScoreSub1(double scoreSub1) {
		this.scoreSub1 = scoreSub1;
	}
	public double getScoreSub2() {
		return scoreSub2;
	}
	public void setScoreSub2(double scoreSub2) {
		this.scoreSub2 = scoreSub2;
	}
	public double getScoreSub3() {
		return scoreSub3;
	}
	public void setScoreSub3(double scoreSub3) {
		this.scoreSub3 = scoreSub3;
	}
	public double getScoreSub4() {
		return scoreSub4;
	}
	public void setScoreSub4(double scoreSub4) {
		this.scoreSub4 = scoreSub4;
	}
	public double getScoreSub5() {
		return scoreSub5;
	}
	public void setScoreSub5(double scoreSub5) {
		this.scoreSub5 = scoreSub5;
	}
	
	public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f", name, dtf.format(dob),scoreSub1,scoreSub2,scoreSub3,scoreSub4,scoreSub5);
	}
	
}
