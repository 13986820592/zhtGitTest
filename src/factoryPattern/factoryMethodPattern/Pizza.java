package factoryPattern.factoryMethodPattern;

public class Pizza implements Produce{
    @Override
    public void makeProduce() {
        System.out.println("披萨");
    }
}
