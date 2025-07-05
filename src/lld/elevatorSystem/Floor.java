package lld.elevatorSystem;

public class Floor {

    int floorNumber;
    ExternalButton extButton;

    public Floor(int floorNumber, ExternalButton extButton) {
        this.floorNumber = floorNumber;
        this.extButton = extButton;
    }
}
