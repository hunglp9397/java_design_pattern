package creational.abstract_factory.factory;

import creational.abstract_factory.chair.Chair;
import creational.abstract_factory.chair.WoodChair;
import creational.abstract_factory.table.Table;
import creational.abstract_factory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Chair initChair() {
        return new WoodChair();
    }

    @Override
    public Table initTable() {
        return new WoodTable();
    }
}
