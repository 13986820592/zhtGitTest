package protoPattern.shallowClone;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("zs",23,null);
        sheep1.friend = new Sheep("li",24,null);

        Sheep sheep2 = (Sheep) sheep1.clone();
        sheep2.friend.friend = new Sheep("ww",25,null);
        sheep2.age = 223;
        System.out.println("sheep2:" + sheep2);
        System.out.println("--------------------------------");
        System.out.println("sheep1:" + sheep1);
        System.out.println("sheep1 和 sheep2 是一个对象：" +  (sheep1 == sheep2));
    }
}

