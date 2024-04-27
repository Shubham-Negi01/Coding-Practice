package designPatterns.structuralPattern.adapter.heightExample;

//this class uses IndianPerson to check eligibility
public class RollerCoaster {

    int seatHeightInCms;

    public RollerCoaster(int seatHeightInCms) {
        this.seatHeightInCms = seatHeightInCms;
    }

    public boolean isAllowed(IndianPerson person){
        return person.getHeight() >= seatHeightInCms;
    }
}
