import org.junit.Before;
import org.junit.Test;
import types.CamoType;
import vehicles.Offensive;
import vehicles.Transport;

import static org.junit.Assert.assertEquals;

public class TransportTest {

    Transport vehicle;
    Offensive warhog;


    @Before
    public void before(){
        vehicle = new Transport("The Doof Wagon", CamoType.DESERT, 11, 100, 80, 1000);
        warhog = new Offensive("The War Rig", CamoType.MAROONSNOW, 15, 5, 120, 100);
    }

    @Test
    public void hasName(){
        assertEquals("The Doof Wagon", vehicle.getName());
    }

    @Test
    public void hasCamo(){
        assertEquals(CamoType.DESERT, vehicle.getCamo());
    }

    @Test
    public void hasPrice(){
        assertEquals(11., vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, vehicle.getCapacity());
    }

    @Test
    public void hasSpeed(){
        assertEquals(80, vehicle.getSpeed());
    }

    @Test
    public void hasHold(){
        assertEquals(0, vehicle.getHold().size());
    }

    @Test
    public void hasHoldLimit(){
        assertEquals(1000, vehicle.getHoldLimit());
    }

    @Test
    public void canAddToHold(){
        vehicle.addToHold(warhog);
        assertEquals(1, vehicle.getHold().size());
    }

    @Test
    public void canGetHoldWeight(){
        vehicle.addToHold(warhog);
        assertEquals(100, vehicle.getHoldWeight());
    }

}
