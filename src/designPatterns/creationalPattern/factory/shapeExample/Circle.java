package designPatterns.creationalPattern.factory.shapeExample;

//Product concrete class
public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
