package structural.facade;

public class ShippingService {

    public void doShipping(ShippingType shippingType){
        switch (shippingType){
            case EXPRESS:
                System.out.println("Shipping express!");
                break;
            case STANDARD:
                System.out.println("Shipping standard");
                break;
        }
    }
}
