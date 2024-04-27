package designPatterns.creationalPattern.prototype.shapes;

public class Circle implements ShapesPrototype {

    private int radius;

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public Circle() {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public ShapesPrototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
