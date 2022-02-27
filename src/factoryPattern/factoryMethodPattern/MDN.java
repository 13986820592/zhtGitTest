package factoryPattern.factoryMethodPattern;

public class MDN implements AbstractFactory{

    @Override
    public Produce createNewProduce() {
        System.out.println("点了一个披萨....");
        return new Pizza();
    }
}
