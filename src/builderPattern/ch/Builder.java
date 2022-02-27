package builderPattern.ch;

public abstract class Builder {
    protected Computer computer = new Computer();
    public abstract void get_cpu();
    public abstract void get_mainBoar();
    public abstract void get_Memory();
    public abstract void get_hardDisk();
    public abstract void get_graphics();
    public abstract void get_chassis();
    public Computer getComputer(){
        return computer;
    }
}
