package main;

public class Main {

    public static void main(String[] args) {

        Singleton singletonReference_1 = Singleton.getInstance();
        Singleton singletonReference_2 = Singleton.getInstance();
        Singleton singletonReference_3 = Singleton.getInstance();

        System.out.println(singletonReference_1.hashCode());
        System.out.println(singletonReference_2.hashCode());
        System.out.println(singletonReference_3.hashCode());




    }

}
