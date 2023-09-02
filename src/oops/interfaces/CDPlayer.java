package oops.interfaces;

public class CDPlayer implements Media{
    @Override
    public void play() {
        System.out.println("CD Player started");
    }

    @Override
    public void stop() {
        System.out.println("CD Player stopped");
    }
}
