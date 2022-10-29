package OOPS_By_KK.InterfacesDemo;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void updateEngine(){
        engine =new ElectricEngine();
    }
}
