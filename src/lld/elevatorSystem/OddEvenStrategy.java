package lld.elevatorSystem;

public class OddEvenStrategy implements ElevatorSelectorStrategy {

    ElevatorManager elevatorManager;

    public OddEvenStrategy(ElevatorManager elevatorManager) {
        this.elevatorManager = elevatorManager;
    }

    @Override
    public int selectElevator() {
        return 5;
    }
}
