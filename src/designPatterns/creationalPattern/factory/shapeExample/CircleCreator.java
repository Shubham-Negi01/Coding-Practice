package designPatterns.creationalPattern.factory.shapeExample;

//Concrete creator class
public class CircleCreator extends CreatorClass {

    int radius;

    public CircleCreator(int radius) {
        this.radius = radius;
    }

    @Override
    Shape createShape() {
        return new Circle(radius);
    }
}
