package designPatterns.creationalPattern.builder.carExample;

public class CarDemo {

    public static void main(String[] args) {
        ManualCarBuilder builder = new ManualCarBuilder();
        builder.setChassis("abc");
        builder.setDoors(4);

        System.out.println(builder.build());

    }

}
