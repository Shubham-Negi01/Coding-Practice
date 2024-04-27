package designPatterns.creationalPattern.factory.buttonExample;

public class LinuxUI extends SystemUI {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
