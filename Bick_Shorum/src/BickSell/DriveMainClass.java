package BickSell;

import java.util.Scanner;

// Create DriveMainClass class to perform main operation 
public class DriveMainClass {
	public static void main(String[] args) {
		
		// Create Scanner Class Object to Accept Input For User 
		Scanner scanner = new Scanner(System.in);
		Showroom showroom = new Showroom("SuperBikes Showroom", "Downtown");

		// Add some bikes to the showroom
		showroom.addBike(new Bike("Yamaha", "R15", 150000, "Sports"));
		showroom.addBike(new Bike("Honda", "CBR 250R", 200000, "Sports"));
		showroom.addBike(new Bike("Bajaj", "Pulsar 150", 100000, "Commuter"));

		// Using While loop to print main menu
		while (true) {
			System.out.println("\n Welcome To VirajVsBick shorum ");
			System.out.println("*******************************");
			System.out.println("1. View Available Bikes");
			System.out.println("2. Add a Bike to Showroom");
			System.out.println("3. Process Transaction");
			System.out.println("Type 'Exit' to quit");
			System.out.print("\n Enter your choice ..!: ");
			System.out.println("\n");
			String choice = scanner.nextLine().trim();

			if (choice.equalsIgnoreCase("1")) {
				showroom.listBikes();
			} else if (choice.equalsIgnoreCase("2")) {
				// Add a new bike to showroom
				System.out.print("\nEnter Bike Brand: ");
				String brand = scanner.nextLine();
				System.out.print("Enter Bike Model: ");
				String model = scanner.nextLine();
				System.out.print("Enter Bike Price: ");
				double price = scanner.nextDouble();
				scanner.nextLine(); // Consume newline left-over
				System.out.print("Enter Bike Type (e.g, Sports, Cruiser): ");
				String type = scanner.nextLine();
				System.out.println("*******************************");

				showroom.addBike(new Bike(brand, model, price, type));
				System.out.println("Bike added to showroom!");
			} else if (choice.equalsIgnoreCase("3")) {
				// Process a transaction
				System.out.println("\nEnter Customer Details:");
				System.out.print("Enter Name: ");
				String customerName = scanner.nextLine();
				System.out.print("Enter Contact Number: ");
				String contactNumber = scanner.nextLine();
				System.out.print("Enter Address: ");
				String address = scanner.nextLine();

				Customer customer = new Customer(customerName, contactNumber, address);

				// Get the bike choice
				System.out.print("\nEnter the model of the bike you want to purchase: ");
				String bikeModel = scanner.nextLine();
				Bike selectedBike = showroom.searchBike(bikeModel);

				if (selectedBike != null) {
					System.out.println("\nYou have selected:");
					selectedBike.displayDetails();

					// Salesperson details
					System.out.print("\nEnter Salesperson Name: ");
					String salespersonName = scanner.nextLine();
					System.out.print("Enter Salesperson Employee ID: ");
					String salespersonId = scanner.nextLine();

					Salesperson salesperson = new Salesperson(salespersonName, salespersonId);

					// Process the transaction
					Transaction transaction = new Transaction(customer, selectedBike, salesperson,
							selectedBike.getPrice(), "2024-12-30");
					transaction.processTransaction();
				} else {
					System.out.println("Sorry, the bike model " + bikeModel + " is not available.");
				}
			} else if (choice.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the program...");
				break;
			} else {
				System.out.println("Invalid choice! Please try again.");
			}
		}

	}
}
