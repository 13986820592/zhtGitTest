package protoPattern.deepClone_Serializable;

import java.io.*;

public class Sheep implements Serializable {
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

    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep copyObj = (Sheep) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bos.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }
}
