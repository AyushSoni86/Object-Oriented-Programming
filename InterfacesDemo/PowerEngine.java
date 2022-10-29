package OOPS_By_KK.InterfacesDemo;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine Accelerate");

    }
}
