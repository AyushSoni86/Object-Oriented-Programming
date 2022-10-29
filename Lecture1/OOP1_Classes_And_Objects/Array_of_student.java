package OOPS_By_KK.Lecture1.OOP1_Classes_And_Objects;

import java.util.Arrays;

public class Array_of_student {
    public static void main(String[] args) {
        Student1[] students = new Student1[5];

        students[0] = new Student1();
        students[1] = new Student1();
        students[2] = new Student1();
        students[3] = new Student1();
        students[4] = new Student1();

        students[0].name = "Ayush Soni";
        students[1].name = "Khushi Soni";
        students[2].name = "Vaibhavi Deshpande";
        students[3].name = "Rutuja Chavan";
        students[4].name = "Amardeep Pawar";

        students[0].roll_No = 1;
        students[1].roll_No = 2;
        students[2].roll_No = 3;
        students[3].roll_No = 4;
        students[4].roll_No = 5;

        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(students));

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].roll_No + " " +students[i].name);
//        }
    }

}

class Student1 {
    int roll_No;
    String name ;
}
