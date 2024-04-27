package designPatterns.structuralPattern.bridge.remoteExample;

//implementation layer - used in abstraction layer to do the actual work
public interface Device {

    void enable();
    void disable();
    boolean isEnabled();
    void setVolume(int volume);
    void setChannel(int channel);
    int getVolume();
    int getChannel();

}
