package builderPattern.ch;

public class ConcreteBuilder02 extends Builder{
    @Override
    public void get_cpu() {
        computer.setCpu("最次的CPU");
    }

    @Override
    public void get_mainBoar() {
        computer.setMainBoard("最次的主板 ");
    }

    @Override
    public void get_Memory() {
        computer.setMemory("最次的内存");
    }

    @Override
    public void get_hardDisk() {
        computer.setHardDisk("最次的磁盘");
    }

    @Override
    public void get_graphics() {
        computer.setGraphicsCard("最次的显卡");
    }

    @Override
    public void get_chassis() {
        computer.setChassis("最次的机箱");
    }
}
