package factoryPattern.SimpleFactoryPattern;

public class McChicken implements Food{
    @Override
    public void getFood() {
        System.out.println("我刚刚点了一个麦香鸡......");
    }
}
