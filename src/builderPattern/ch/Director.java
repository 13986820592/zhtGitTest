package builderPattern.ch;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(){
        builder.get_cpu();
        builder.get_chassis();
        builder.getComputer();
        builder.get_hardDisk();
        builder.get_graphics();
        builder.get_mainBoar();
        builder.get_Memory();
        return builder.getComputer();
    }
}
