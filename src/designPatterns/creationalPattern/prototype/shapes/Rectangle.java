package designPatterns.creationalPattern.prototype.shapes;

public class Rectangle implements ShapesPrototype {

    private int length;
    private int breadth;

    public Rectangle(){}

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.breadth = rectangle.breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public ShapesPrototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
