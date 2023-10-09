package creational.abstract_factory.chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Created Plastic Chair");
    }
}
