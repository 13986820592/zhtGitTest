package factoryPattern.factoryMethodPattern;

public class KFC implements AbstractFactory{
    @Override
    public Produce createNewProduce() {
        System.out.println("我点了一份麦香鸡......");
        return new McChicken();
    }
}
