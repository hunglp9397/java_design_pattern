package creational.abstract_factory.factory;

import creational.abstract_factory.MaterialType;

public class FurnitureFactory {

    private FurnitureFactory(){

    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType){
        switch (materialType){
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
