package oops.properties.interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;

    public NiceCar(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void play() {
        media.play();
    }

    public void stopMedia() {
        media.stop();
    }
}
