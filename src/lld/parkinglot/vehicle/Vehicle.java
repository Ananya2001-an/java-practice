package parkinglot.vehicle;

public abstract class Vehicle {
    private String licensePlate;
    private final VehicleType type;

    public Vehicle(String licensePlate, VehicleType type){
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }
}
