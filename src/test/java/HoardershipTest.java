import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoardershipTest {

    Hoardership hoardership;
    Vehicle vehicle;

    @Before
    public void before(){
        hoardership = new Hoardership("The Citadel");
        vehicle = new Vehicle();
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
