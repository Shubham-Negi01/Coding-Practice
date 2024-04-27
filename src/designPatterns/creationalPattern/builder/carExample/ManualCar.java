package designPatterns.creationalPattern.builder.carExample;

public class ManualCar {

    private int doors;
    private String chassis;
    private int tires;
    private int gearBox;
    private String engine;

    public ManualCar(){}

    public ManualCar(int doors, String chassis, int tires, int gearBox, String engine) {
        this.doors = doors;
        this.chassis = chassis;
        this.tires = tires;
        this.gearBox = gearBox;
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public void setGearBox(int gearBox) {
        this.gearBox = gearBox;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "doors=" + doors +
                ", chassis='" + chassis + '\'' +
                ", tires=" + tires +
                ", gearBox=" + gearBox +
                ", engine='" + engine + '\'' +
                '}';
    }
}
