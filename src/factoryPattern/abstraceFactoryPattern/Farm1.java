package factoryPattern.abstraceFactoryPattern;

public class Farm1 implements  AbstractFactory{
    @Override
    public Animal createAnimal() {
        System.out.println("小马诞生....");
        return new Horse();
    }

    @Override
    public Plant createPlant() {
        System.out.println("小花盛开....");
        return new Flower();
    }

    @Override
    public Fruit createFruit() {
        System.out.println("采摘苹果...");
        return new Apple();
    }
}
