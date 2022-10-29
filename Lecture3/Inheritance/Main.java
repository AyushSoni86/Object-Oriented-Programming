package OOPS_By_KK.Lecture3.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Parent p1 = new Parent();
//        Parent p2 = new Parent(12,23,45);
//        Parent p3 = new Parent(p2);
//        Parent p4 = new Parent(34);
//
//        System.out.println(p1.l + "  " + p1.b + "  " + p1.h);
//        System.out.println(p2.l + "  " + p2.b + "  " + p2.h);
//        System.out.println(p3.l + "  " + p3.b + "  " + p3.h);
//        System.out.println(p4.l + "  " + p4.b + "  " + p4.h);

        Child c1 = new Child();
        Child c2 = new Child(12,23,34,1);
        System.out.println(c1.age + "  " + c1.l + "  " + c1.b + "  " + c1.h);
        System.out.println(c2.age + "  " + c2.l + "  " + c2.b + "  " + c2.h);
    }
}
