package garage;

public class Bicycle extends Vehicle {

	private int pedals;

	public Bicycle(int id, int numberOfWheels, String colour, String make, int pedals) {
		super(id, numberOfWheels, colour, make);

		this.setPedals(pedals);
	}

	public int getPedals() {
		return pedals;
	}

	public void setPedals(int pedals) {
		this.pedals = pedals;
	}

}
