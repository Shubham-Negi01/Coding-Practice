package designPatterns.structuralPattern.bridge.remoteExample;

public class RemoteDemo {

    public static void main(String[] args) {

        Television tv = new Television();
        System.out.println(tv);
        BasicRemote remote = new BasicRemote(tv);
        remote.volumeUp();
        remote.channelDown();
        remote.power();
        System.out.println(tv);
    }

}
