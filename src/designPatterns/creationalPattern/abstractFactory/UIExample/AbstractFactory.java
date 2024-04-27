package designPatterns.creationalPattern.abstractFactory.UIExample;

//factory interface to create product
public interface AbstractFactory {

    Button createButton();
    Checkbox createCheckbox();

}
