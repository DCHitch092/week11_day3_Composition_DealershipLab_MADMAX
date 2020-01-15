package vehicles;

import behaviours.IHoldable;
import behaviours.IScrappable;
import types.CamoType;

import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
    private CamoType camo;
    private double price;
    private int capacity;
    private int speed;
    private boolean operational;
    private ArrayList<IScrappable> components;

    public Vehicle(String name, CamoType camo, double price, int capacity, int speed) {
        this.name = name;
        this.camo = camo;
        this.price = price;
        this.capacity = capacity;
        this.speed = speed;
        this.operational = true;
        this.components = new ArrayList<IScrappable>();
    }

    public String getName() {
        return name;
    }

    public CamoType getCamo() {
        return camo;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOperational() {
        return operational;
    }

    public ArrayList<IScrappable> getComponents() {
        return new ArrayList<IScrappable>(components);
    }
}
