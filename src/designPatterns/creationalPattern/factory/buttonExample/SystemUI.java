package designPatterns.creationalPattern.factory.buttonExample;

public abstract class SystemUI {

    void showButton() {
        Button button = createButton();
        button.render();
    }

    //factory method
    abstract Button createButton();

}
