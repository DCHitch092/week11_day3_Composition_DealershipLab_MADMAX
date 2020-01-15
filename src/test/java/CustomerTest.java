import org.junit.Before;
import org.junit.Test;
import types.CamoType;
import vehicles.Transport;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;

    @Before
    public void before(){
        customer = new Customer("Furiosa", "Imperator", 25);
        vehicle = new Transport("The Doof Wagon", CamoType.DESERT, 11, 100, 80, 1000);
    }

    @Test
    public void hasName(){
        assertEquals("Furiosa", customer.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Imperator", customer.getRank());
    }

    @Test
    public void hasLoot(){
        assertEquals(25, customer.getLoot(), 0.01);
    }

    @Test
    public void hasFleet(){
        assertEquals(0, customer.getFleet().size());
    }

    @Test
    public void canAddToFleet(){
        customer.addToFleet(vehicle);
        assertEquals(1, customer.getFleet().size());
    }

}
