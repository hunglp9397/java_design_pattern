package creational.abstract_factory.factory;

import creational.abstract_factory.chair.Chair;
import creational.abstract_factory.table.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair initChair();

    public abstract Table initTable();
}
