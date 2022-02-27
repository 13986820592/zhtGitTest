package singleton;

public class Singleton03 {
    public static void main(String[] args) {
        SingletonBean03 singleton01 = SingletonBean03.getInstance();
        SingletonBean03 singleton02 = SingletonBean03.getInstance();
        System.out.println(singleton01);
        System.out.println(singleton02);
    }
}

class SingletonBean03{
    private SingletonBean03(){}
    private static SingletonBean03 instance;
    public static SingletonBean03 getInstance(){
        if (instance == null){
            instance = new SingletonBean03();
        }
        return instance;
    }
}
