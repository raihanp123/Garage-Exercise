package garage;

public class Car extends Vehicle {

	private int numberOfRadioStations;

	public Car(int id, int numberOfWheels, String colour, String make, int numberOfRadioStations) {
		super(id, numberOfWheels, colour, make);

		this.setNumberOfRadioStations(numberOfRadioStations);
	}

	public int getNumberOfRadioStations() {
		return numberOfRadioStations;
	}

	public void setNumberOfRadioStations(int numberOfRadioStations) {
		this.numberOfRadioStations = numberOfRadioStations;
	}

}
