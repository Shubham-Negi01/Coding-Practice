package lld.parkingLotSystem;

public class ParkingSlot {

    private String slotId;
    private VehicleType vehicleType;
    private boolean isVacant;

    public ParkingSlot(String slotId, VehicleType vehicleType, boolean isVacant) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isVacant = isVacant;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId='" + slotId + '\'' +
                ", vehicleType=" + vehicleType +
                ", isVacant=" + isVacant +
                '}';
    }
}
