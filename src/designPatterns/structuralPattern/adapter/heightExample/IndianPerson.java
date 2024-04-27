package designPatterns.structuralPattern.adapter.heightExample;

//this class is being used for eligibility in RollerCoaster class
public class IndianPerson {

    private int height;

    public IndianPerson() {
    }

    public IndianPerson(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
