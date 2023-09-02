package oops.interfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine stopped");
    }
}
