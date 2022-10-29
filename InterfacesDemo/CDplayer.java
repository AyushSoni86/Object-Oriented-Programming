package OOPS_By_KK.InterfacesDemo;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
}
