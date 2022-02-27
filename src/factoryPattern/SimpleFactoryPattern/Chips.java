package factoryPattern.SimpleFactoryPattern;

public class Chips implements Food{
    @Override
    public void getFood() {
        System.out.println("我刚刚点了一份土豆条.....");
    }
}
