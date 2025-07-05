package lld.elevatorSystem;

public class Elevator {
    int elevator_id;
    int currentFloor;
    InternalButton button;
    Display display;
    Status status;

    public Elevator(int elevator_id) {
        this.elevator_id = elevator_id;
        this.button = new InternalButton(this);
        this.display = new Display();
        this.status = Status.IDLE;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getElevator_id() {
        return elevator_id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public InternalButton getButton() {
        return button;
    }

    public Display getDisplay() {
        return display;
    }

    public Status getStatus() {
        return status;
    }
}
