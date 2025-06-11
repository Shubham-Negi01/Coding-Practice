package lld.parkingLotSystem;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TicketManager {
    private AtomicInteger counter = new AtomicInteger(0);
    private Map<Integer,Ticket> activeTickets = new ConcurrentHashMap<>();

    private ParkingSlotManager parkingSlotManager;

    public TicketManager(ParkingSlotManager parkingSlotManager) {
        this.parkingSlotManager = parkingSlotManager;
    }

    public Ticket createTicket(Vehicle vehicle) {
        int ticketId = counter.incrementAndGet();
        ParkingSlot slot = parkingSlotManager.findAndReserveParkingSlot(vehicle.getType());
        if (slot == null) {
            throw  new RuntimeException("No slots available for " + vehicle.getType().name());
        }
        Ticket ticket = new Ticket(ticketId,vehicle,slot,new Timestamp(System.currentTimeMillis()));
        activeTickets.put(ticketId,ticket);
        return ticket;
    }

    public Ticket getTicket(int id) {
        return activeTickets.getOrDefault(id,null);
    }

    public void closeTicket(int id) {
        Ticket ticket = activeTickets.get(id);
        parkingSlotManager.releaseParkingSlot(ticket.getSlot());
        activeTickets.remove(id);
    }
}
