package protoPattern.deepClone_Serializable;

import java.io.Serializable;

public class Grass implements Serializable {
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
