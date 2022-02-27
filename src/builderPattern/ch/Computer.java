package builderPattern.ch;

public class Computer {
    //由cpu、主板、内存、硬盘、显卡、机箱
    private String cpu;
    private String mainBoard;
    private String Memory;
    private String hardDisk;
    private String graphicsCard;
    private String chassis;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", Memory='" + Memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", chassis='" + chassis + '\'' +
                '}';
    }

    public void show(){
        System.out.println(this);
    }
}

