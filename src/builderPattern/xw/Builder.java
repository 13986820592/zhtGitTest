package builderPattern.xw;

import builderPattern.xw.House;

public abstract class Builder {
    protected House house = new House();
    public abstract void builderBasic(); //打地基
    public abstract void builderWalls();//砌墙
    public abstract void roofed();//做屋顶

    public House getHouse(){
        return house;
    }
}
