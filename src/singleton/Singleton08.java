package singleton;

public class Singleton08 {
    public static void main(String[] args) {
        Singleton singleton = SingletonBean08.getInstance();
        Singleton singleton1 = SingletonBean08.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}

enum SingletonBean08{
    SINGLETON_BEAN_08;
    private Singleton singleton;

    SingletonBean08() {
        this.singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonBean08.SINGLETON_BEAN_08.singleton;
    }
}

class Singleton{

}
