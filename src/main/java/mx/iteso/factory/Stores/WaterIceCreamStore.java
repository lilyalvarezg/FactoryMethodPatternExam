package mx.iteso.factory.Stores;

import mx.iteso.factory.Helados.GuavaWaterIceCream;
import mx.iteso.factory.Helados.MangoWaterIceCream;
import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.Helados.PineappleWaterIceCream;
import mx.iteso.factory.Helados.StrawberryWaterIceCream;


/**
 * Created by Lily on 23/10/2015.
 */
public class WaterIceCreamStore extends IceCreamStore {
    @Override
    protected IceCream createIceCream(String flavor) {
        if(flavor.equals("Strawberry"))
            return new StrawberryWaterIceCream();
        if(flavor.equals("Pineapple"))
            return new PineappleWaterIceCream();
        if(flavor.equals("Mango"))
            return new MangoWaterIceCream();
        if(flavor.equals("Guava"))
            return new GuavaWaterIceCream();
        return null;
    }
}
