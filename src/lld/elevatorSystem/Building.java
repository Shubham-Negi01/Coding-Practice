package lld.elevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floors;

    public Building(int noOfFloors, ElevatorSelectorStrategy strategy) {
        floors = new ArrayList<>();
        for(int i=0;i<noOfFloors;i++) {
            floors.add(new Floor(i, new ExternalButton(strategy)));
        }
    }
}
