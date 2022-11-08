package bai06;

public class ComputerLab extends ClassRoom {
	private int numComputer;

	public ComputerLab() {
		super();
		this.numComputer = 0;
	}

	public ComputerLab(String id, String buildings, double area, int numLightBulb, int numComputer) {
		super(id, buildings, area, numLightBulb);
		setNumComputer(numComputer);
	}

	public int getNumComputer() {
		return numComputer;
	}

	public void setNumComputer(int numComputer) {
		if (numComputer < 0) {
			this.numComputer = 0;
		} else {
			this.numComputer = numComputer;
		}
	}

	public boolean isEnoughComputer() {
		if (getArea() / numComputer <= 1.5) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isStandard() {
		if (isEnoughLight() && isEnoughComputer()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-20d", numComputer);
	}

}
