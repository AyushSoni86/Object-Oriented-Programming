package OOPS_By_KK.Lecture3.Inheritance;

class Child extends Parent{
    int age;

    Child(){
        this.age = -1;
    }

    public Child(int l, int b, int h, int age) {
//        this.l = l;
//        this.b = b;
//        this.h = h;
        super(l,b,h); // calling the parent class constructor
        this.age = age;
    }
}
