package singleton;

public class Singleton01 {
    public static void main(String[] args) {
        SingletonBean01 singleTonBean01= SingletonBean01.getSingleton();
        SingletonBean01 singletonBean02 = SingletonBean01.getSingleton();
        System.out.println(singleTonBean01);
        System.out.println(singletonBean02);
    }
}

class SingletonBean01{
    private SingletonBean01() {
    }
    private final static  SingletonBean01 singleton = new SingletonBean01();

    public static SingletonBean01 getSingleton(){
        return singleton;
    }
}
