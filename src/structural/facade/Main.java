package structural.facade;

public class Main {

    public static void main(String[] args) {

        ParamDTO paramDTO = new ParamDTO(PaymentType.BANK, ShippingType.STANDARD);
        ShopFacade shopFacade = ShopFacade.getInstance();
        shopFacade.buyProductPyParam(paramDTO);

    }
}
