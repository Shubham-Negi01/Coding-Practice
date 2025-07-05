package lld.elevatorSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ElevatorSystemDriver {

    public static void main(String[] args) throws IOException {
        Map<Integer, Elevator> elevators= new HashMap<>();

        int numberOfElevators = 8;

        for(int i=1;i<=numberOfElevators;i++) {
            Elevator elevator = new Elevator(i);
            elevators.put(i, elevator);
        }

        ElevatorManager elevatorManager = new ElevatorManager(elevators);

        Building building = new Building(6, new OddEvenStrategy(elevatorManager));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        Direction direction = null;

        while(!input.equals("q")) {
            System.out.print("Enter Floor number in which you are present: ");
            int currentFloorNumber = Integer.parseInt(br.readLine());
            Floor f = building.floors.get(currentFloorNumber);
            System.out.print("Write Direction(UP or DOWN): ");
            String dir = br.readLine();
            if(dir.equalsIgnoreCase("UP")) {
                direction = Direction.UP;
            }
            else {
                direction = Direction.DOWN;
            }

            int selectedElevator = f.extButton.sendRequest(direction);

            Elevator elevator = elevatorManager.getElevators().get(selectedElevator);

            System.out.println("Elevator " + elevator.elevator_id + " selected");
            System.out.print("Select floor number: ");
            int destinationFloorNumber = Integer.parseInt(br.readLine());
            elevator.getButton().sendRequest(destinationFloorNumber);

            System.out.println("Elevator " + elevator.elevator_id + " is now on " + elevator.getCurrentFloor() + " floor.");
            System.out.print("Type q to quit or any key to continue: ");
            input = br.readLine();
        }

    }

}
