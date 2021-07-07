package garage;

public class Vehicle {

	private int id;
	private int numberOfWheels;
	private String colour;
	private String make;

	public Vehicle(int id, int numberOfWheels, String colour, String make) {
		super();
		this.setId(id);
		this.setNumberOfWheels(numberOfWheels);
		this.setColour(colour);
		this.setMake(make);

	}

	public Vehicle() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getNumberOfWheels() {
		return this.numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void print() {
		System.out.print("ID: ");
		System.out.print(this.id);
		System.out.print("NumberOfWheels:");
		System.out.print(this.numberOfWheels);
		System.out.print("Colour: ");
		System.out.print(this.colour);
		System.out.print("Make: ");
		System.out.print(this.make);

	}

}
