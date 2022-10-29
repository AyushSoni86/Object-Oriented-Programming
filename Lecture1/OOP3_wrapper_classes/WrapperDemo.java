package OOPS_By_KK.Lecture1.OOP3_wrapper_classes;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer a= 34;
        Integer b= 134;
        System.out.println(a + " " + b);
        Integer c = a;
        System.out.println(c);
        System.out.println(a);
        swap(a,b);
        System.out.println(a + " " + b);
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
