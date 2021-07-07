package garage;

public class App {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Vehicle car1 = new Car(1, 4, "Black", "Nissan", 108);
		
		Vehicle motorbike1 = new Motorbike(2, 2, "Red", "Motor", 5);
		
		Vehicle bicycle1 = new Bicycle(3, 2, "Blue", "Bikey", 2);

		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
		garage.addVehicle(bicycle1);
		
		garage.listVehicles();
		
		System.out.println(garage.calculateBill(car1));
		System.out.println(garage.calculateBill(motorbike1));
		System.out.println(garage.calculateBill(bicycle1));
		
		garage.removeVehicle(car1);

	}

}
