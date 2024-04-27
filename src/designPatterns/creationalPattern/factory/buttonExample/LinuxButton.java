package designPatterns.creationalPattern.factory.buttonExample;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Linux button.");
    }
}
