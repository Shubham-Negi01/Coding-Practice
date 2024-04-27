package designPatterns.creationalPattern.abstractFactory.UIExample;

public class AbstractFactoryDemo {

    static AbstractFactory abstractFactory;
    static Button button;

    static Checkbox checkbox;

    AbstractFactoryDemo(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
        //create the products of the factory
        createUIComponents();
    }

    void createUIComponents(){
        button = abstractFactory.createButton();
        checkbox = abstractFactory.createCheckbox();
    }

    void showUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {

        double n = Math.random();
        System.out.println(n);

        //choose the factory so that we can create its products
        if(n > 0.5){
            abstractFactory = new WindowsFactory();
        }
        else{
            abstractFactory = new MacFactory();
        }

        AbstractFactoryDemo app = new AbstractFactoryDemo(abstractFactory);
        app.showUI();

    }

}
