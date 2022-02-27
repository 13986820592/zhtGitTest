package factoryPattern.SimpleFactoryPattern;

public class Cola implements Food{
    @Override
    public void getFood() {
        System.out.println("我要一杯可乐......");
    }
}
