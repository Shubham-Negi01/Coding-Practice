package designPatterns.structuralPattern.bridge.remoteExample;

//abstraction layer - delegates work to implementation layer
//we can directly use concrete class instead of creating an interface for abstraction layer
public interface Remote {

    void volumeUp();
    void volumeDown();

    void channelUp();
    void channelDown();

    void power();

}
