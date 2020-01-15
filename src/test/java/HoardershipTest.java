import org.junit.Before;
import org.junit.Test;
import types.CamoType;
import vehicles.Transport;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class HoardershipTest {

    Hoardership hoardership;
    Vehicle vehicle;

    @Before
    public void before(){
        hoardership = new Hoardership(10000, "The Citadel");
        vehicle = new Transport("The Doof Wagon", CamoType.DESERT, 11, 100, 80, 1000);
    }

    @Test
    public void hasStock(){
        assertEquals(0, hoardership.getStock().size());
    }

    @Test
    public void canAddStock(){
        hoardership.addStock(vehicle);
        assertEquals(1, hoardership.getStock().size());
    }

    @Test
    public void hasName(){
        assertEquals("The Citadel", hoardership.getName());
    }

    @Test
    public void hasWarChest(){
        assertEquals(10000, hoardership.getWarChest(), 0.01 );
    }

}
