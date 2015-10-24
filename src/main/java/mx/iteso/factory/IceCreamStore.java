package mx.iteso.factory;

/**
 * Created by Lily on 23/10/2015.
 */
public abstract class IceCreamStore {
   protected abstract IceCream createIceCream(String flavor);
    public IceCream IceCreamOrder(String flavor){
       IceCream iceCream;
       iceCream= createIceCream(flavor);
       iceCream.prepare();
       iceCream.serve();
       return iceCream;
   }


}
