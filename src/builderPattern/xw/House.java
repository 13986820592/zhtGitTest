package builderPattern.xw;

public class House {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println(name + "类型的房子盖好了......");
    }
}
