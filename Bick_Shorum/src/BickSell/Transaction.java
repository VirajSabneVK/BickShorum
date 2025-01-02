package BickSell;

/*Create Transaction class to perform Transaction Details */
public class Transaction {

	// Create Instance Variable
	private Customer customer;
	private Bike bike;
	private Salesperson salesperson;
	private double totalAmount;
	private String date;

	// Create constructor
	public Transaction(Customer customer, Bike bike, Salesperson salesperson, double totalAmount, String date) {
		this.customer = customer;
		this.bike = bike;
		this.salesperson = salesperson;
		this.totalAmount = totalAmount;
		this.date = date;
	}

	// Create processTransaction method to perform Transaction operation
	public void processTransaction() {
		System.out.println("Transaction Details:");
		customer.displayDetails();
		bike.displayDetails();
		salesperson.displayDetails();

		// Print total amount and date
		System.out.println("Total Amount: " + totalAmount);
		System.out.println("Date of Purchase: " + date);
	}
}
