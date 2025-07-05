package lld.elevatorSystem;

public class ExternalButton {

    ElevatorSelectorStrategy strategy;

    public ExternalButton(ElevatorSelectorStrategy strategy) {
        this.strategy = strategy;
    }

    public int sendRequest(Direction direction) {
        return strategy.selectElevator();
    }
}
