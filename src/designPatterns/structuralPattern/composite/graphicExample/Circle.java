package designPatterns.structuralPattern.composite.graphicExample;

public class Circle extends Dot {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println("Move circle to (" + this.x + ", " + this.x + ")");
    }
}
