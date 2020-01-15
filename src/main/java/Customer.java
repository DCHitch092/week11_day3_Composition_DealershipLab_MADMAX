import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private String name;
    private String rank;
    private double loot;
    private ArrayList<Vehicle> fleet;

    public Customer(String name, String rank, double loot) {
        this.name = name;
        this.rank = rank;
        this.loot = loot;
        this.fleet = new ArrayList<Vehicle>();
    }


    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public double getLoot() {
        return loot;
    }

    public ArrayList<Vehicle> getFleet() {
        return new ArrayList<Vehicle>(fleet);
    }

    public void addToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }
}
