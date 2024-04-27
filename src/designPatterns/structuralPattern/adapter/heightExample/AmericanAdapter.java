package designPatterns.structuralPattern.adapter.heightExample;

//this adapter will extend IndianPerson and will have AmericanPerson as its member.
//Override the IndianPerson methods which are used in RollerCoaster
public class AmericanAdapter extends IndianPerson {

    private AmericanPerson americanPerson;

    public AmericanAdapter(AmericanPerson americanPerson) {
        super();
        this.americanPerson = americanPerson;
    }

    @Override
    public int getHeight() {
        int totalInches = this.americanPerson.getHeightInFeet() * 12 + this.americanPerson.getHeightInInches();
        return (int)(totalInches * 2.54);
    }

}
