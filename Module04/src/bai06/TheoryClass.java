package bai06;

public class TheoryClass extends ClassRoom {
	private boolean projector;

	public TheoryClass() {
		super();
		this.projector = false;
	}

	public TheoryClass(String id, String buildings, double area, int numLightBulb, boolean projector) {
		super(id, buildings, area, numLightBulb);
		setProjector(projector);
	}

	public boolean isProjector() {
		return projector;
	}

	public void setProjector(boolean projector) {
		this.projector = projector;
	}

	@Override
	public boolean isStandard() {
		if (isEnoughLight() && projector) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String note = "";
		if (projector) {
			note = "có";
		} else {
			note = "không";
		}
		return super.toString() + String.format("%-20s", note);
	}
}
