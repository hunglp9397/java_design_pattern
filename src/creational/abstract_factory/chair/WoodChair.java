package creational.abstract_factory.chair;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Created Wood Chair");
    }
}
