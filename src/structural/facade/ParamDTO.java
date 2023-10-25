package structural.facade;

public class ParamDTO {

    private PaymentType paymentType;

    private ShippingType shippingType;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    public ParamDTO(PaymentType paymentType, ShippingType shippingType) {
        this.paymentType = paymentType;
        this.shippingType = shippingType;
    }
}
