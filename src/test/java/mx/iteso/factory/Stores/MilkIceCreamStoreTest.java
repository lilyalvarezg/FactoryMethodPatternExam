package mx.iteso.factory.Stores;

import mx.iteso.factory.Helados.GuavaMilkIceCream;
import mx.iteso.factory.Helados.MangoMilkIceCream;
import mx.iteso.factory.Helados.PineappleMilkIceCream;
import mx.iteso.factory.Helados.StrawberryMilkIceCream;
import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Lily on 23/10/2015.
 */
public class MilkIceCreamStoreTest {
    private IceCreamStore iceCreamStore;
    @Before
    public void setUp(){
        iceCreamStore= mock(IceCreamStore.class);
    }
    @Test
    public void TestMango(){
        iceCreamStore= new MilkIceCreamStore();
        IceCream mango= new MangoMilkIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Mango");
        assertEquals(mango.getBase(), iceCream.getBase());
    }
    @Test
    public void TestStrawberry(){
        iceCreamStore= new MilkIceCreamStore();
        IceCream strawberry= new StrawberryMilkIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Strawberry");
        assertEquals(strawberry.getBase(), iceCream.getBase());
    }
    @Test
    public void TestPinapple(){
        iceCreamStore= new MilkIceCreamStore();
        IceCream pineapple= new PineappleMilkIceCream();
        IceCream icecream= iceCreamStore.IceCreamOrder("Pineapple");
        assertEquals(pineapple.getBase(), icecream.getBase());
    }
    @Test
    public void TestGuava(){
        iceCreamStore= new MilkIceCreamStore();
        IceCream guava= new GuavaMilkIceCream();
        IceCream iceCream= iceCreamStore.IceCreamOrder("Guava");
        assertEquals(guava.getBase(), iceCream.getBase());
    }
}
