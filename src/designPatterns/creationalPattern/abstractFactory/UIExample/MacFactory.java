package designPatterns.creationalPattern.abstractFactory.UIExample;

//concrete factory to create concrete products
public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
