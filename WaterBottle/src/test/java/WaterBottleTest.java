import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100,waterBottle.getVolume());
    }

    @Test
    public void hasDrinkVolume(){
        assertEquals(10,waterBottle.getDrinkVolume());
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void canDrinkMore(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80,waterBottle.getVolume());
    }

    @Test
    public void canDrinkAll(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void canFillUpAgain(){
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume());
    }

}
