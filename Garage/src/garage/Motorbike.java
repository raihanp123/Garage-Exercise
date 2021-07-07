package garage;

public class Motorbike extends Vehicle {

	private int handlebarMirrors;

	public Motorbike(int id, int numberOfWheels, String colour, String make, int numberOfRadioStations) {
		super(id, numberOfWheels, colour, make);

		this.setHandlebarMirrors(handlebarMirrors);
	}

	public int getHandlebarMirrors() {
		return handlebarMirrors;
	}

	public void setHandlebarMirrors(int handlebarMirrors) {
		this.handlebarMirrors = handlebarMirrors;
	}

}
