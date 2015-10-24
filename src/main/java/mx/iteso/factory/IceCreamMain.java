package mx.iteso.factory;

import mx.iteso.factory.Stores.MilkIceCreamStore;
import mx.iteso.factory.Stores.WaterIceCreamStore;

/**
 * Created by Lily on 23/10/2015.
 */
public class IceCreamMain {
    public static void main(String[] args){
        IceCreamStore waterIceCream= new WaterIceCreamStore();
        IceCreamStore milkIceCream= new MilkIceCreamStore();

        IceCream iceCream= waterIceCream.IceCreamOrder("Mango");
        System.out.println("Orden numero 1.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");

        iceCream= waterIceCream.IceCreamOrder("Guava");
        System.out.println("Orden numero 2.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");

        iceCream= waterIceCream.IceCreamOrder("Strawberry");
        System.out.println("Orden numero 3.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");

        iceCream= milkIceCream.IceCreamOrder("Mango");
        System.out.println("Orden numero 4.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");

        iceCream= milkIceCream.IceCreamOrder("Guava");
        System.out.println("Orden numero 5.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");

        iceCream= milkIceCream.IceCreamOrder("Pineapple");
        System.out.println("Orden numero 6.- Base of= "+ iceCream.getBase()+ "...Flavor of= "+ iceCream.getFlavor());
        System.out.println("");


    }
}
