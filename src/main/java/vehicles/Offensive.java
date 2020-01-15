package vehicles;

import behaviours.IHoldable;
import types.CamoType;

public class Offensive extends Vehicle implements IHoldable {

    private int weight;

    public Offensive(String name, CamoType camo, double price, int capacity, int speed, int weight) {
        super(name, camo, price, capacity, speed);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
