package BickSell;

/*
 * Create By @Viraj
 * Create Customer Class To Perform Customers Operation
  */

public class Customer {

	// create instance variables name , contact , address
	private String name;
	private String contact;
	private String address;

	// Create constructor
	public Customer(String name, String contact, String address) {
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	/* Create DisplyaDetails Method To Display Details */
	public void displayDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Contact: " + contact);
		System.out.println("Address: " + address);
	}
}
