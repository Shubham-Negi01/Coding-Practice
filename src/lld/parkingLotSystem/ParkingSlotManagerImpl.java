package lld.parkingLotSystem;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingSlotManagerImpl implements ParkingSlotManager{

    Map<VehicleType, Queue<ParkingSlot>> slotMap = new ConcurrentHashMap<>();
    Map<VehicleType, AtomicInteger> availability = new ConcurrentHashMap<>();

    public ParkingSlotManagerImpl(Map<VehicleType, Integer> slotConfig) {

        for(Map.Entry<VehicleType,Integer> entry: slotConfig.entrySet()) {
            VehicleType type = entry.getKey();
            int slotNumbers = entry.getValue();

            Queue<ParkingSlot> queue = new ConcurrentLinkedQueue<>();

            for(int i=1;i<=slotNumbers;i++) {
                ParkingSlot slot = new ParkingSlot(type.name()+"-"+i,type,true);
                queue.add(slot);
            }

            slotMap.put(type, queue);
            availability.put(type,new AtomicInteger(slotNumbers));
        }

    }

    @Override
    public ParkingSlot findAndReserveParkingSlot(VehicleType type) {
        Queue<ParkingSlot> queue = slotMap.get(type);
        for(ParkingSlot slot: queue) {
            if(slot.isVacant()) {
                availability.get(type).decrementAndGet();
                slot.setVacant(false);
                return slot;
            }
        }
        return null;
    }

    @Override
    public void releaseParkingSlot(ParkingSlot slot) {
        slot.setVacant(true);
        availability.get(slot.getVehicleType()).incrementAndGet();
    }

    @Override
    public int getAvailableSlots(VehicleType type) {
        return availability.get(type).get();
    }

    public void showMap() {
        System.out.println(slotMap);
    }


}
