package OOPS_By_KK.Lecture2.Singleton_Class;

public class Main {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
        SingleTon obj4 = SingleTon.getInstance();


        System.out.println(obj1 == obj2);
        System.out.println(obj2 == obj3);
        System.out.println(obj3 == obj4);

//        A a = new A();
//        A a1 = new A();
//        A a2 = new A();
//        System.out.println(a==a1);
//        System.out.println(a1==a2);
    }
}
//class A{
//    A(){
//
//    }
//}