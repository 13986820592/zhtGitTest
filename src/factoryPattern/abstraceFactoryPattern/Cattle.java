package factoryPattern.abstraceFactoryPattern;

//牛类
public class Cattle implements Animal{
    @Override
    public void run() {
        System.out.println("两脚只直冲......");
    }
}
