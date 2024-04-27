package designPatterns.creationalPattern.builder.carExample;

public interface CarBuilder {

    void setDoors(int n);
    void setChassis(String ch);
    void setTires(int n);

}
