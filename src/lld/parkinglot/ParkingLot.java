package parkinglot;

import parkinglot.vehicle.Vehicle;

import java.util.*;

public class ParkingLot {
    private List<Level> levels;
    private static ParkingLot instance;

    private ParkingLot(){
        levels = new ArrayList<>();
    }

    // singleton class
    public static synchronized ParkingLot getInstance(){
        if(instance == null) instance = new ParkingLot();
        return instance;
    }

    public void addLevel(Level level){
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(Level level: levels){
            if(level.parkVehicle(vehicle)){
                System.out.println("Vehicle " + vehicle.getType() + " parked successfully!");
//                System.out.printf("Vehicle %s parked successfully!", vehicle.getType());
                return true;
            }
        }
        System.out.println("Vehicle " + vehicle.getType() + " couldn't be parked!");
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(Level level: levels){
            if(level.unparkVehicle(vehicle)){
                System.out.println("Vehicle " + vehicle.getType() + " unparked successfully!");
                return true;
            }
        }
        System.out.println("Vehicle " + vehicle.getType() + " couldn't be unparked!");
        return false;
    }

    public void displayAvailability(){
        for(Level level: levels){
            level.displayAvailability();
        }
    }
}
