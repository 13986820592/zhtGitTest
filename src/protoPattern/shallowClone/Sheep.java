package protoPattern.shallowClone;

public class Sheep implements Cloneable{
    public String name;
    public int age;
    public Sheep friend;

    public Sheep(String name, int age, Sheep sheep) {
        this.name = name;
        this.age = age;
        this.friend = sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
