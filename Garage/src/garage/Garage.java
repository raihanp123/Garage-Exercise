package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public ArrayList<Vehicle> getVehicles() {

		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {

		this.vehicles = vehicles;
	}

	public void listVehicles() {

		for (int i = 0; i < vehicles.size(); i++) {

			System.out.print(vehicles.get(i).getId());
			System.out.print(vehicles.get(i).getNumberOfWheels());
			System.out.print(vehicles.get(i).getColour());
			System.out.print(vehicles.get(i).getMake());

		}

	}

	public void print() {
		System.out.println("Vehicles: [");
		for (Vehicle v : this.vehicles) {
			v.print();
		}
		System.out.println("]");

	}

}