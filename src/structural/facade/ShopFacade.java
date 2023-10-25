package structural.facade;

public class ShopFacade {

    private static final ShopFacade INSTANCE = new ShopFacade();

    private PaymentService paymentService;

    private ShippingService shippingService;

    public static ShopFacade getInstance(){
        return INSTANCE;
    }

    public ShopFacade() {
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void buyProductPyParam(ParamDTO paramDTO){
        paymentService.pay(paramDTO.getPaymentType());
        shippingService.doShipping(paramDTO.getShippingType());
    }

}
