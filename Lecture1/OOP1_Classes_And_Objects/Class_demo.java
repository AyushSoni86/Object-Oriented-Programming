package OOPS_By_KK.Lecture1.OOP1_Classes_And_Objects;

public class Class_demo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Ayush Soni";
        s1.roll_no = 1;
        s2.name = "Khushi Soni";
        s2.roll_no = 2;
        s3.name = "Kunal Kushwaha";
        s3.roll_no = 3;

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);

    }


}

class Student {
    String name;
    int roll_no;
}
