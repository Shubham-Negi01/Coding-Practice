package designPatterns.structuralPattern.bridge.remoteExample;

//concrete abstraction
public class BasicRemote implements Remote {

    //composition of implementation layer in abstraction layer
    private Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume()+1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel()+1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void power() {
        if(device.isEnabled()){
            device.disable();
        }
        else{
            device.enable();
        }
    }
}
