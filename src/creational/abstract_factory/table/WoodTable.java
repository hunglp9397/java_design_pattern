package creational.abstract_factory.table;

public class WoodTable implements Table{
    @Override
    public void create() {
        System.out.println("Created Wood Table");
    }
}
