package creational.abstract_factory;

import creational.abstract_factory.chair.Chair;
import creational.abstract_factory.chair.PlasticChair;
import creational.abstract_factory.factory.FurnitureAbstractFactory;
import creational.abstract_factory.factory.FurnitureFactory;
import creational.abstract_factory.table.Table;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair plasticChair = factory.initChair();
        plasticChair.create();

        Table plasticTable = factory.initTable();
        plasticTable.create();

    }
}
