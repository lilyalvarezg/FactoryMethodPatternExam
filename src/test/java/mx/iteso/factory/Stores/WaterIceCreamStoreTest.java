package mx.iteso.factory.Stores;

import mx.iteso.factory.Helados.*;
import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Lily on 23/10/2015.
 */
public class WaterIceCreamStoreTest {
    private IceCreamStore iceCreamStore;
    @Before
    public void setUp(){
        iceCreamStore= mock(IceCreamStore.class);
    }
    @Test
    public void TestMango(){
        iceCreamStore= new WaterIceCreamStore();
        IceCream mango= new MangoWaterIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Mango");
        assertEquals(mango.getBase(), iceCream.getBase());
    }
    @Test
    public void TestStrawberry(){
        iceCreamStore= new WaterIceCreamStore();
        IceCream strawberry= new StrawberryWaterIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Strawberry");
        assertEquals(strawberry.getBase(), iceCream.getBase());
    }
    @Test
    public void TestPinapple(){
        iceCreamStore= new WaterIceCreamStore();
        IceCream pineapple= new PineappleWaterIceCream();
        IceCream icecream= iceCreamStore.IceCreamOrder("Pineapple");
        assertEquals(pineapple.getBase(), icecream.getBase());
    }
    @Test
    public void TestGuava(){
        iceCreamStore= new WaterIceCreamStore();
        IceCream guava= new GuavaWaterIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Guava");
        assertEquals(guava.getBase(), iceCream.getBase());
    }
}
