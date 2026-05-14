package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1.hashCode() == singleton2.hashCode()) {
            System.out.println("Singleton pattern implemented successfully");
        }
    }
}
