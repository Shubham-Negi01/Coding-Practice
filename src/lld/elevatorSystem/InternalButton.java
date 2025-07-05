package lld.elevatorSystem;

public class InternalButton {

    Elevator elevator;

    public InternalButton(Elevator elevator) {
        this.elevator = elevator;
    }

    public void sendRequest(int floor) {
        elevator.setCurrentFloor(floor);
    }

}
