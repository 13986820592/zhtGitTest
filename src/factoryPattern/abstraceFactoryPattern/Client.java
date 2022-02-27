package factoryPattern.abstraceFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Farm1 farm = new Farm1();
        Animal animal = farm.createAnimal();
        animal.run();
        Plant plant = farm.createPlant();
        plant.show();
        Fruit fruit = farm.createFruit();
        fruit.eat();
        System.out.println("-------------------");
        Farm2 farm2 = new Farm2();
        Animal animal1 = farm2.createAnimal();
        animal1.run();
        Plant plant1 = farm2.createPlant();
        plant1.show();
        Fruit fruit1 = farm2.createFruit();
        fruit1.eat();
    }
}
