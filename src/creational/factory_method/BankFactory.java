package creational.factory_method;

public class BankFactory {

    private BankFactory(){

    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException();
        }
    }
}
