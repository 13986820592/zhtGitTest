package factoryPattern.factoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        Produce newProduce = kfc.createNewProduce();
        new MDN().createNewProduce();
        new Shop().createNewProduce();
    }
}
