package structural.facade;

public class PaymentService {

   public void pay(PaymentType type){
         switch (type){
            case BANK:
               System.out.println("Payment by Bank");
               break;
            case CASH:
                System.out.println("Payment by cash");
                break;
         }
   }

}
