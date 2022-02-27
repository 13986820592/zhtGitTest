package protoPattern.deepClone_Serializable;

public class TestMain {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", new Grass("red"));
        System.out.println(sheep);
        Sheep sheep1 =(Sheep) sheep.deepClone();
        sheep1.grass.name = "yellow";
        System.out.println(sheep1);
    }
}
