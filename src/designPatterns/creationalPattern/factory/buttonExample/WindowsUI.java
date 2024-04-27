package designPatterns.creationalPattern.factory.buttonExample;

public class WindowsUI extends SystemUI {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
