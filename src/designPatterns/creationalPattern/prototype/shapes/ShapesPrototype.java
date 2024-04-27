package designPatterns.creationalPattern.prototype.shapes;

//this is the prototype class which will be implemented by all the classes which needs to be cloning their objects.
public interface ShapesPrototype {

    ShapesPrototype clone();

}
