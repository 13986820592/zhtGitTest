package singleton;

public class Singleton05 {
    public static void main(String[] args) {
        SingletonBean05 singleton01 = SingletonBean05.getInstance();
        SingletonBean05 singleton02 = SingletonBean05.getInstance();
        System.out.println("第一次得到的单例对象"+singleton01);
        System.out.println("第二次得到的单例对象"+singleton02);
    }
}

class SingletonBean05{
    private SingletonBean05(){}
    private static SingletonBean05 instance;
    public static SingletonBean05 getInstance(){
        synchronized (SingletonBean05.class){
            if (instance == null){
                instance = new SingletonBean05();
            }
        }
        return instance;
    }
}
