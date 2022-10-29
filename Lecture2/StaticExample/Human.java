package OOPS_By_KK.Lecture2.StaticExample;

public class Human {
    static long population;
    int age;
    String name;
    int salary;
    Boolean married;

    public Human(int age, String name, int salary, Boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;
        population += 1;
    }

}
