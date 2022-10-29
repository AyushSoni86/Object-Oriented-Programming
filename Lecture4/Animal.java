package OOPS_By_KK.Lecture4;

public class Animal {
    private int legs;
    int tail;
    String name;

    public Animal(int legs, int tail, String name) {
        this.legs = legs;
        this.tail = tail;
        this.name = name;
    }

    public Animal(int legs) {
        this.legs = legs;

    }

    public Animal(Animal animal) {
        this.legs = animal.legs;
        this.tail = animal.tail;
        this.name = animal.name;
    }

    void walk() {
        System.out.println(" Animal is walking");
    }

    void walk(int legs) {
        System.out.println(" Animal is walking on " + legs + " legs ");
    }
}
