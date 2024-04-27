package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete factory to create concrete products
public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
