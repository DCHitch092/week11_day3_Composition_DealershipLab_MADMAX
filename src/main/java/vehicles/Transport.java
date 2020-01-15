package vehicles;

import behaviours.IHoldable;
import types.CamoType;

import java.util.ArrayList;

public class Transport extends Vehicle{

    private ArrayList<IHoldable> hold;
    private int holdLimit;

    public Transport(String name, CamoType camo, double price, int capacity, int speed, int holdLimit) {
        super(name, camo, price, capacity, speed);
        this.hold = new ArrayList<IHoldable>();
        this.holdLimit = holdLimit;
    }

    public ArrayList<IHoldable> getHold() {
        return new ArrayList<IHoldable>(hold);
    }

    public int getHoldLimit(){
        return holdLimit;
    }

    public void addToHold(IHoldable vehicle){
        hold.add(vehicle);
    }

    public int getHoldWeight(){
        int totalWeight = 0;

        for( IHoldable vehicle : hold){
            totalWeight += vehicle.getWeight();
        }

        return totalWeight;
    }
}

