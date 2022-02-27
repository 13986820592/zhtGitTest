package factoryPattern.SimpleFactoryPattern;

public class Pizza implements Food{
    @Override
    public void getFood() {
        System.out.println("我刚刚又点了一份披萨.....");
    }
}
