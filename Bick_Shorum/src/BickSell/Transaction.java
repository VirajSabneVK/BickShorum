package BickSell;

public class Transaction {
    private Customer customer;
    private Bike bike;
    private Salesperson salesperson;
    private double totalAmount;
    private String date;

    public Transaction(Customer customer, Bike bike, Salesperson salesperson, double totalAmount, String date) {
        this.customer = customer;
        this.bike = bike;
        this.salesperson = salesperson;
        this.totalAmount = totalAmount;
        this.date = date;
    }

    public void processTransaction() {
        System.out.println("Transaction Details:");
        customer.displayDetails();
        bike.displayDetails();
        salesperson.displayDetails();
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Date of Purchase: " + date);
    }
}

