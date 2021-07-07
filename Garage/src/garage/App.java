package garage;

public class App {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Vehicle vehicle1 = new Vehicle(1, 4, "Black", "Nissan");

		garage.listVehicles();

	}

}
