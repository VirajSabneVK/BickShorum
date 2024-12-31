package BickSell;

import java.util.ArrayList;

public class Showroom {
    private String name;
    private String location;
    private ArrayList<Bike> bikes;

    public Showroom(String name, String location) {
        this.name = name;
        this.location = location;
        this.bikes = new ArrayList<>();
    }

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public void listBikes() {
        System.out.println("Bikes available in the showroom:");
        for (Bike bike : bikes) {
            bike.displayDetails();
        }
    }

    public Bike searchBike(String model) {
        for (Bike bike : bikes) {
            if (bike.getModel().equalsIgnoreCase(model)) {
                return bike;
            }
        }
        return null;
    }
}
