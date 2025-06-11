package lld.parkingLotSystem;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotDriver {

    public static void main(String[] args) {

        Map<VehicleType,Integer> slotConfig = Map.of(VehicleType.TWO_WHEELER,2,VehicleType.FOUR_WHEELER,4);

        ParkingSlotManager parkingSlotManager = new ParkingSlotManagerImpl(slotConfig);

        TicketManager ticketManager = new TicketManager(parkingSlotManager);

        Ticket t1 = ticketManager.createTicket(new Vehicle("ka01w7895",VehicleType.TWO_WHEELER));
        Ticket t2 = ticketManager.createTicket(new Vehicle("k51s7877",VehicleType.TWO_WHEELER));
        Ticket t3 = ticketManager.createTicket(new Vehicle("ka53n7888",VehicleType.FOUR_WHEELER));
        Ticket t4 = ticketManager.createTicket(new Vehicle("ka03k8888",VehicleType.FOUR_WHEELER));

        parkingSlotManager.showMap();

        System.out.println(parkingSlotManager.getAvailableSlots(VehicleType.TWO_WHEELER));

        ticketManager.closeTicket(t2.getId());

        System.out.println(parkingSlotManager.getAvailableSlots(VehicleType.TWO_WHEELER));

        Ticket t5 = ticketManager.createTicket(new Vehicle("ka03k8888",VehicleType.TWO_WHEELER));
    }


}
