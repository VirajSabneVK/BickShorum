package BickSell;

public class Bike {
	private String brand;
	private String model;
	private double price;
	private String type; // E.g., Sports, Cruiser, etc.

	public Bike(String brand, String model, double price, String type) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.type = type;
	}

	// get Brand Value
	public String getBrand() {
		return brand;
	}

	// get Model Value
	public String getModel() {
		return model;
	}

	// get price
	public double getPrice() {
		return price;
	}

	// Get Type
	public String getType() {
		return type;
	}

	/*Create DisplyaDetails Method To Display Details*/
	public void displayDetails() {
		System.out.println("Bike Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Type: " + type);
	}
}
