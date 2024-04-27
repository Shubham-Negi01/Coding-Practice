package designPatterns.structuralPattern.composite.graphicExample;

//Leaf class. It will to all the actual work.
public class Dot implements Graphic {

    int x;
    int y;

    public Dot() {
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println("Move dot to (" + this.x + ", " + this.x + ")");
    }
}
