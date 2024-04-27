package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete Product
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox rendered.");
    }
}
