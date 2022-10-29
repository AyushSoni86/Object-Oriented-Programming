package OOPS_By_KK.Lecture3.Inheritance;

public class Parent {
    int l;
    int b;
    int h;

    Parent() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Parent(int size) {
        this.l = size;
        this.b = size;
        this.h = size;
    }

    Parent(Parent other) {
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
    }

    Parent(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}
