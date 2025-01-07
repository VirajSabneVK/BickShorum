package BickSell;

/*Create class SalePerson To Perform SalesPerson  operation using Constructor & Display Method  */
public class Salesperson {

	// Create Instance Method
	private String name;
	private String employeeId;

	// Create Constructor
	public Salesperson(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	/* Create DisplyaDetails Method To Display Details */
	public void displayDetails() {
		System.out.println("Salesperson Name: " + name);
		System.out.println("Employee ID: " + employeeId);
	}
}
