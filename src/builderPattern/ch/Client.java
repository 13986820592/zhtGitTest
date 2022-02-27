package builderPattern.ch;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        Computer computer = director.createComputer();
        computer.show();
        System.out.println("----------------------------");
        Director director02 = new Director(new ConcreteBuilder02());
        Computer computer02 = director02.createComputer();
        computer02.show();
        System.out.printf("he");
        System.out.println("hfsdf");
        ArrayList arrayList = new ArrayList();


    }

    public void testZht(){
        //hh;
    }
}
