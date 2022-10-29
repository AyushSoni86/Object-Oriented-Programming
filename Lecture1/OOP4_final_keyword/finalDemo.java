package OOPS_By_KK.Lecture1.OOP4_final_keyword;

public class finalDemo {
    public static void main(String[] args) {
//        int a = 30;
//        final int b = 49;
//        a = 3459;
////        b = 4534;   // this gives compile time error
//        System.out.println(a + " " + b);
        final A a1 = new A("Ayush");
        final A b1 = new A("Kunal");
        final A c1 = new A("Vaibhavi");
        System.out.println(a1.name);
        System.out.println(b1.name);
        System.out.println(c1.name);

        a1.name = "Somerthing";
        System.out.println(a1.name);
//        a1 = b1; we can't do that as our object is made final
    }
}

class A {
    String name;

    A(String name) {
        this.name = name;
    }
}