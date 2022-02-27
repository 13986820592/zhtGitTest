package builderPattern.xw;

public class ConcreteBuilder extends Builder{
    protected String type ;

    public ConcreteBuilder(String type) {
        this.type = type;
    }

    @Override
    public void builderBasic() {
        house.setName(type);
        System.out.println(house.getName() + "打个5m的地基");
    }

    @Override
    public void builderWalls() {
        System.out.println("砌墙10m");
    }

    @Override
    public void roofed() {
        System.out.println("搞一个红瓦屋顶");
    }
}
