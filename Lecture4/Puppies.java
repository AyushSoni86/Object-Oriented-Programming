package OOPS_By_KK.Lecture4;

public class Puppies extends Dog{
    int cuteNess;

    public Puppies(int legs, int tail, String name, int weight, int cuteNess) {
        super(legs, tail, name, weight);
        this.cuteNess = cuteNess;
    }

    public Puppies(int legs, int tail, String name) {
        super(legs, tail, name);
    }

    void play(){
        System.out.println(" Puppies are playing ");
    }
}
