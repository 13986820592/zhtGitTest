package singleton;

public class Singleton04 {
    public static void main(String[] args) {
        SingletonBean04 singleton01 = SingletonBean04.getInstance();
        SingletonBean04 singleton02 = SingletonBean04.getInstance();
        System.out.println("第一次得到的单例对象"+singleton01);
        System.out.println("第二次得到的单例对象"+singleton02);
    }
}

class SingletonBean04{
    private SingletonBean04(){}
    private static SingletonBean04 instance;
    public static synchronized SingletonBean04 getInstance(){
        if (instance == null){
            instance = new SingletonBean04();
        }
        return instance;
    }
}
