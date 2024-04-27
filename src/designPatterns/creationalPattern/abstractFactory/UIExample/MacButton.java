package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete Product
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button rendered.");
    }
}
