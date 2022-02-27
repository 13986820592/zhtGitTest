package factoryPattern.abstraceFactoryPattern;

public class Farm2 implements AbstractFactory{
    @Override
    public Animal createAnimal() {
        System.out.println("小牛诞生了....");
        return new Cattle();
    }

    @Override
    public Plant createPlant() {
        System.out.println("小草悠悠...");
        return new Grass();
    }

    @Override
    public Fruit createFruit() {
        System.out.println("采摘苹果...");
        return new Apple();
    }
}
