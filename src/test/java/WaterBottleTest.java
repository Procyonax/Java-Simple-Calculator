import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle = new WaterBottle();

    @Test
    public void hasStartVolume(){
        assertEquals(100, bottle.getDrink());
    }

    @Test
    public void canRemoveBy10(){
        bottle.drink();
        assertEquals(90, bottle.getDrink());
    }

    @Test
    public void canFillBottle(){
        bottle.full();
        assertEquals(100, bottle.getDrink());
    }

    @Test
    public void canEmptyBottle() {
        bottle.empty();
        assertEquals(0, bottle.getDrink());
    }
}
