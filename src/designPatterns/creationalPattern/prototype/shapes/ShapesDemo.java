package designPatterns.creationalPattern.prototype.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4);
        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(3);
        rectangle.setLength(6);

        List<ShapesPrototype> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);

        for(ShapesPrototype shape: list){
            ShapesPrototype clone = shape.clone();
            System.out.println(shape.hashCode() + " " + shape);
            System.out.println(clone.hashCode() + " " + clone);
        }

    }

}
