package builderPattern.xw;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public House construct(){
        builder.builderBasic();
        builder.builderWalls();
        builder.roofed();
        return builder.getHouse();
    }
}
