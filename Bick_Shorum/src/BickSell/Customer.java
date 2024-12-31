package BickSell;

public class Customer {
    private String name;
    private String contact;
    private String address;

    public Customer(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
    }
}

