package main;

public class Singleton {

    private static Singleton singletonInstance = null;

    public String s;

    private Singleton(){
        s = "Private constructor of Singleton  was activated";
    }

    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
