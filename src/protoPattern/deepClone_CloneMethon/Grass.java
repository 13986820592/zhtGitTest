package protoPattern.deepClone_CloneMethon;

public class Grass implements Cloneable{
    public String name;

    public Grass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
