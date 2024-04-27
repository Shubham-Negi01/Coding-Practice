package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete Product
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac checkbox rendered.");
    }
}
