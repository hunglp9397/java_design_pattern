package creational.abstract_factory.table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Created Plastic Table");
    }
}
