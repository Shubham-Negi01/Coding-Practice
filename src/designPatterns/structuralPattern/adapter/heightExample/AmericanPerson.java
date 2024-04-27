package designPatterns.structuralPattern.adapter.heightExample;

//this class cannot be directly used in RollerCoaster class to check the eligibility.
//so we create an adapter class for this.
public class AmericanPerson {

    private int heightInFeet;
    private int heightInInches;

    public AmericanPerson(int heightInFeet, int heightInInches) {
        this.heightInFeet = heightInFeet;
        this.heightInInches = heightInInches;
    }

    public int getHeightInFeet() {
        return heightInFeet;
    }

    public void setHeightInFeet(int heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }
}
