package BickSell;

public class Salesperson {
    private String name;
    private String employeeId;

    public Salesperson(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Salesperson Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

