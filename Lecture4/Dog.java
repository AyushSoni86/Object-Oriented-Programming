package OOPS_By_KK.Lecture4;

public class Dog extends Animal {

    int weight;

    public Dog(int legs, int tail, String name, int weight) {
        super(legs, tail, name);
        this.weight = weight;
    }


    public Dog(int legs, int tail, String name) {
        super(legs, tail, name);
    }

    void bark(){
        System.out.println(" Dogs Barks ");
    }
}
