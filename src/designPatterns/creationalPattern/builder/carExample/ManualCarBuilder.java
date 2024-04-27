package designPatterns.creationalPattern.builder.carExample;

public class ManualCarBuilder implements CarBuilder {

    private ManualCar car = new ManualCar();

    void setEngine(String eng){
        this.car.setEngine(eng);
    }

    void setGearbox(int n){
        this.car.setGearBox(n);
    }


    @Override
    public void setDoors(int n) {
        this.car.setDoors(n);
    }

    @Override
    public void setChassis(String ch) {
        this.car.setChassis(ch);
    }

    @Override
    public void setTires(int n) {
        this.car.setTires(n);
    }

    public ManualCar build() {
        ManualCar car = this.car;
        reset();
        return car;
    }

    public void reset(){
        this.car = new ManualCar();
    }
}
