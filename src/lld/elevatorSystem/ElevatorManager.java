package lld.elevatorSystem;

import java.util.Map;

public class ElevatorManager {

    Map<Integer,Elevator> elevators;

    public ElevatorManager(Map<Integer, Elevator> elevators) {
        this.elevators = elevators;
    }

    public Map<Integer, Elevator> getElevators() {
        return elevators;
    }

    public void submitNewRequest(int floor, int elevatorId) {

    }

}
