package OOPS_By_KK.Lecture2.StaticExample;

public class Main {
    public static void main(String[] args) {

        Human ayush = new Human(22,"Ayush",40000,false);
        Human vaibhavi = new Human(22,"Vaibhavi",40000,false);
        Human khushi = new Human(18,"Khushi",10000,false);

        System.out.println(ayush.age);
        System.out.println(vaibhavi.salary);

        System.out.println(ayush.population);
        System.out.println(vaibhavi.population);

        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
