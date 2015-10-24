package mx.iteso.factory.Stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.Helados.GuavaMilkIceCream;
import mx.iteso.factory.Helados.MangoMilkIceCream;
import mx.iteso.factory.Helados.PineappleMilkIceCream;
import mx.iteso.factory.Helados.StrawberryMilkIceCream;

/**
 * Created by Lily on 23/10/2015.
 */
public class MilkIceCreamStore extends IceCreamStore {

    @Override
    protected IceCream createIceCream(String flavor) {
        if(flavor.equals("Strawberry"))
            return new StrawberryMilkIceCream();
        if(flavor.equals("Pineapple"))
            return new PineappleMilkIceCream();
        if(flavor.equals("Mango"))
            return new MangoMilkIceCream();
        if(flavor.equals("Guava"))
            return new GuavaMilkIceCream();
        return null;
    }
}
