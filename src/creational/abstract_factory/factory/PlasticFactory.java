package creational.abstract_factory.factory;

import creational.abstract_factory.chair.Chair;
import creational.abstract_factory.chair.PlasticChair;
import creational.abstract_factory.table.PlasticTable;
import creational.abstract_factory.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair initChair() {
        return new PlasticChair();
    }

    @Override
    public Table initTable() {
        return new PlasticTable();
    }
}
