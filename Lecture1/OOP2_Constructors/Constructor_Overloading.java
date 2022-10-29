package OOPS_By_KK.Lecture1.OOP2_Constructors;

public class Constructor_Overloading {
    public static void main(String[] args) {
//        Students kunal = new Students(13,"Kunal", 98.76f);
//
//        System.out.println(kunal.roll);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//        Students random = new Students(kunal);
//
//        System.out.println(random.roll);
//        System.out.println(random.name);
//        System.out.println(random.marks);

        Students kush = new Students();
        System.out.println(kush.roll);
        System.out.println(kush.marks);
        System.out.println(kush.name);
    }
}

class Students{
    int roll;
    String name;
    float marks;

    Students(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Students(Students other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }

    //calling constructor from another constructor
    Students(){
        this(13,"Ayush",34.32f);

    }
}
