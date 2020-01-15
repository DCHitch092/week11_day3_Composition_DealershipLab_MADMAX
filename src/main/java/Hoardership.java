import vehicles.Vehicle;

import java.util.ArrayList;

public class Hoardership {

    private double warChest;
    private String name;
    private ArrayList<Vehicle> theHoard;

    public Hoardership(double warChest, String name) {
        this.warChest = warChest;
        this.name = name;
        this.theHoard = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getStock() {
        return new ArrayList<Vehicle>(theHoard);
    }

    public void addStock(Vehicle vehicle) {
        theHoard.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public double getWarChest() {
        return warChest;
    }
}
