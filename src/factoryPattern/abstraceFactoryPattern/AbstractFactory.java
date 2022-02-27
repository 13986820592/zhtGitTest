package factoryPattern.abstraceFactoryPattern;

public interface AbstractFactory {
    Animal createAnimal();
    Plant createPlant();
    Fruit createFruit();
}
