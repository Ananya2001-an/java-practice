package oops.properties.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.apply();
//        car.release();
//        car.play();
//        car.stop();

        NiceCar niceCar = new NiceCar(new PetrolEngine(), new CDPlayer());
        niceCar.start();
        niceCar.play();
        niceCar.stopMedia();
        niceCar.stop();

        Engine engine = new PetrolEngine();
        engine.start();
    }
}
