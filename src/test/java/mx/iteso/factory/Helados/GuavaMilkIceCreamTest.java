package mx.iteso.factory.Helados;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Lily on 23/10/2015.
 */
public class GuavaMilkIceCreamTest {
    IceCream iceCream;
    @Before
    public void setUp(){
        iceCream= mock(IceCream.class);
    }
    @Test
    public void GuavaMilkTest(){
        iceCream= new GuavaMilkIceCream();
        assertEquals(iceCream.getBase(), "Milk");
        assertEquals(iceCream.getFlavor(), "Guava");
    }


}
