package protoPattern.deepClone_CloneMethon;

public class TestMain {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", new Grass("red"));
        System.out.println(sheep);
        Sheep sheep1 =(Sheep) sheep.clone();
        sheep1.grass.name = "yellow";
        System.out.println(sheep1);
        System.out.println("git  out");
    }
}
