package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete Product
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button rendered.");
    }
}
