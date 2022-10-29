package OOPS_By_KK.Lecture1.OOP2_Constructors;

public class Demo_Constructor {


    public static void main(String[] args) {
        // here we are performing repetitive task
//        Student s1 = new Student();
//        s1.marks = 24.23f;
//        s1.name = "Ayush Soni";
//        s1.rollNo = 13;


        Student s1 = new Student();
        Student s2 = new Student(13, "Khushi Soni");
        Student s3 = new Student(11, "Ayush Soni", 34.56f);
        System.out.println(s2.name + " " + s2.rollNo);
        //  System.out.println(s1.rollNo + " " + s1.marks + " " + s1.name);
//        System.out.println(s3);
        System.out.println(s3.rollNo + " " + s3.marks + " " + s3.name);
    }
}

class Student {
    int rollNo;
    String name;
    float marks;

    Student() {
        this.rollNo = 12;
        this.name = "Ayush Soni";
        this.marks = 88.65f;
    }

    Student(int roll_num, String naam) {
        rollNo = roll_num;
        name = naam;

    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
