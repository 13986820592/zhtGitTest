package builderPattern.xw;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder("农村");//具体建造者
        Director director = new Director(builder);
        House house = director.construct();
        house.show();
    }
}
