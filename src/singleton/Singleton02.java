package singleton;

public class Singleton02 {
    public static void main(String[] args) {
        SingletonBean02 singleton01 = SingletonBean02.getInstance();
        SingletonBean02 singleton02 = SingletonBean02.getInstance();
        System.out.println("第一次SingletonBean02对象：" + singleton01);
        System.out.println("第二次SingletonBean02对象：" + singleton02);
    }
}

class SingletonBean02{
    private SingletonBean02(){}
    private static SingletonBean02 instance;
    static{
        instance = new SingletonBean02();
    }
    public static SingletonBean02 getInstance(){
        return instance;
    }
}
