package designPatterns.structuralPattern.bridge.remoteExample;

//concrete implementation
public class Television implements Device {

    private boolean on = false;
    private int channel = 1;
    private int volume = 50;

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public String toString() {
        return "Television{" +
                "on=" + on +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
