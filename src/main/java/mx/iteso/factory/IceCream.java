package mx.iteso.factory;

/**
 * Created by Lily on 23/10/2015.
 */
public abstract class IceCream {
    public String base;
    public String flavor;

    public String getBase(){
        return base;
    }
    public String getFlavor(){
        return flavor;
    }
    public void prepare(){
        System.out.println("Preparing a cone...");
    }
    public void serve(){
        System.out.println("Serving a cone...");
    }
}
