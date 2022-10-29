package OOPS_By_KK.Lecture2.Singleton_Class;

public class SingleTon {

    private SingleTon(){

    }
    private  static SingleTon instance;

    public static SingleTon getInstance(){
        if (instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
