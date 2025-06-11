package lld.parkingLotSystem;

public interface ParkingSlotManager {

    ParkingSlot findAndReserveParkingSlot(VehicleType type);
    void releaseParkingSlot(ParkingSlot slot);

    int getAvailableSlots(VehicleType type);

    void showMap();

}
