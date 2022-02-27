package protoPattern.deepClone_CloneMethon;

public class Sheep implements Cloneable{
    public String name;
    public Grass grass;

    public Sheep(String name, Grass grass) {
        this.name = name;
        this.grass = grass;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", grass=" + grass +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            sheep.grass = (Grass) grass.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
