package factoryPattern.factoryMethodPattern;

public class McChicken implements Produce{
    @Override
    public void makeProduce() {
        System.out.println("麦香鸡");
    }
}
