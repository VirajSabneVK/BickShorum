package BickSell;

import java.util.ArrayList;

// Create Showroom Class
// Show Showroom Details
public class Showroom {

	// Create instance Variables
	// Create ArrayList Variable To Store Bike List
	private String name;
	private String location;
	private ArrayList<Bike> bikes;

	// Create Constructor
	public Showroom(String name, String location) {
		this.name = name;
		this.location = location;
		this.bikes = new ArrayList<>();
	}

	// Create AddBike Method To Add New Bike
	public void addBike(Bike bike) {
		bikes.add(bike);
	}

	// Create ListBike Method To Show List Of Bike
	public void listBikes() {
		System.out.println("Bikes available in the showroom:");
		for (Bike bike : bikes) {
			bike.displayDetails();
		}
	}

	// Create searchBike Method To Search Bike With Model Number
	public Bike searchBike(String model) {
		for (Bike bike : bikes) {
			if (bike.getModel().equalsIgnoreCase(model)) {
				return bike;
			}
		}
		return null;
	}
}
