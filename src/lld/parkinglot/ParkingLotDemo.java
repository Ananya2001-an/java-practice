package parkinglot;

//diff package so need to write import statement
import parkinglot.vehicle.*;

/**
 * Requirements:
 * The parking lot should have multiple levels, each level with a certain number of parking spots.
 * The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
 * Each parking spot should be able to accommodate a specific type of vehicle.
 * The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
 * The system should track the availability of parking spots and provide real-time information to customers.
 * The system should handle multiple entry and exit points and support concurrent access.
 */

/**
 * Parking Lot Class (Singleton) -> Level Class -> Parking Spot Class
 * Vehicle Class (Abstract)
 * Vehicle type enum to define the different types of vehicles
 * Multi-threading is achieved through the use of synchronized keyword on critical sections to ensure thread safety.
 */

public class ParkingLotDemo {
    public static void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
