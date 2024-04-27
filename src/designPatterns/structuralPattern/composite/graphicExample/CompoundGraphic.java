package designPatterns.structuralPattern.composite.graphicExample;

import java.util.ArrayList;
import java.util.List;

//Composite class which can have its children as a composite class or a leaf class.
// It delegates its work to its children.
public class CompoundGraphic implements Graphic {

    List<Graphic> children = new ArrayList<>();

    public void addChild(Graphic g){
        children.add(g);
    }

    public void removeChild(Graphic g){
        if(children.contains(g))
            children.remove(g);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Delegating to child");
        for(Graphic child : this.children){
            child.move(x, y);
        }
    }
}
