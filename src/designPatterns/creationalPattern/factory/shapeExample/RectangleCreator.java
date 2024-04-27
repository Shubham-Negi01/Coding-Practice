package designPatterns.creationalPattern.factory.shapeExample;

//Concrete creator class
public class RectangleCreator extends CreatorClass {

    int length;
    int breadth;

    public RectangleCreator(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    Shape createShape() {
        return new Rectangle(length, breadth);
    }
}
