package factoryPattern.factoryMethodPattern;

public class Shop implements AbstractFactory{
    @Override
    public Produce createNewProduce() {
        System.out.println("我买了一瓶可乐...");
        return new Cole();
    }
}
