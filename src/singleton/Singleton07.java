package singleton;

public class Singleton07 {
    public static void main(String[] args) {
        SingletonBean07 singleton01 = SingletonBean07.getInstance();
        SingletonBean07 singleton02 = SingletonBean07.getInstance();
        System.out.println("第一次得到的单例对象"+singleton01);
        System.out.println("第二次得到的单例对象"+singleton02);
    }
}

class SingletonBean07{
    private SingletonBean07(){}
    private static class SingletonBeanInstance{
        private static final SingletonBean07 instance = new SingletonBean07();
    }

    public static SingletonBean07 getInstance(){
        return SingletonBeanInstance.instance;
    }
}
