package OOPS_By_KK.InterfacesDemo;

import jdk.dynalink.NamedOperation;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();
        NiceCar car = new NiceCar(new PowerEngine());
        car.startEngine();
        car.startMusic();
        car.updateEngine();
        car.stopEngine();
    }
}
