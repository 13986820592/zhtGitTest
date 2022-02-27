package builderPattern.ch;

public class ConcreteBuilder extends Builder{
    @Override
    public void get_cpu() {
        computer.setCpu("最好的CPU");
    }

    @Override
    public void get_mainBoar() {
        computer.setMainBoard("最好的主板 ");
    }

    @Override
    public void get_Memory() {
        computer.setMemory("最好的内存");
    }

    @Override
    public void get_hardDisk() {
        computer.setHardDisk("最好的磁盘");
    }

    @Override
    public void get_graphics() {
        computer.setGraphicsCard("最好的显卡");
    }

    @Override
    public void get_chassis() {
        computer.setChassis("最好的机箱");
    }
}
