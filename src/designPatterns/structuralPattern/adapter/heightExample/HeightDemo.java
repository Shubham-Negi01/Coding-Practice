package designPatterns.structuralPattern.adapter.heightExample;

public class HeightDemo {

    public static void main(String[] args) {
        RollerCoaster rc = new RollerCoaster(155);
        IndianPerson person = new IndianPerson(160);
        //IndianPerson can be directly used by RollerCoaster
        System.out.println(rc.isAllowed(person));

        AmericanPerson ap = new AmericanPerson(5,1);
        //create adapter object which extends IndianPerson
        AmericanAdapter adapter = new AmericanAdapter(ap);
        //adapter can be used with data of AmericanPerson
        System.out.println(rc.isAllowed(adapter));
    }

}
