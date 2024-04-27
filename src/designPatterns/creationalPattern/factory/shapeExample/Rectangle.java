package designPatterns.creationalPattern.factory.shapeExample;

//Product concrete class
public class Rectangle implements Shape {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
