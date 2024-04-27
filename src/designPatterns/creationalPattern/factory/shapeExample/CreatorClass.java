package designPatterns.creationalPattern.factory.shapeExample;

//Creator abstract class
public abstract class CreatorClass {

    //factory method
    abstract Shape createShape();

    public double calculateTotalArea(int units){
        Shape s = createShape();
        return units * s.area();
    }

}
