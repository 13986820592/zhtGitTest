package singleton;

public class Singleton06 {
    public static void main(String[] args) {
        SingletonBean06 singleton01 = SingletonBean06.getInstance();
        SingletonBean06 singleton02 = SingletonBean06.getInstance();
        System.out.println("第一次得到的单例对象"+singleton01);
        System.out.println("第二次得到的单例对象"+singleton02);
    }
}

class SingletonBean06{
    private SingletonBean06() {}
    private static SingletonBean06 instance;
    public static SingletonBean06 getInstance(){
        if (instance == null){
            synchronized (SingletonBean06.class){
                if (instance == null){
                    instance = new SingletonBean06();
                }
            }
        }
        return instance;
    }
}
