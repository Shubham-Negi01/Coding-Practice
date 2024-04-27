package designPatterns.structuralPattern.composite.graphicExample;

import java.util.ArrayList;
import java.util.List;

public class GraphicMain {

    public static void main(String[] args) {
        CompoundGraphic list = new CompoundGraphic();
        list.addChild(new CompoundGraphic());
        list.addChild(new Circle(5));
        list.addChild(new Dot(3,6));

        for (Graphic g: list.children){
            g.move(2,8);
        }
    }

}
