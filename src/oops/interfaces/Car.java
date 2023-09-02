package oops.interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void apply() {
        System.out.println("Brake applied");
    }

    @Override
    public void release() {
        System.out.println("Brake released");
    }

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void play() {
        System.out.println("Media playing");
    }

//    same method name but no confusion as they are in different interfaces and implemented here only once
    @Override
    public void stop() {
        System.out.println("Media stopped");
    }
}
