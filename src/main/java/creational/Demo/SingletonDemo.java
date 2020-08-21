package creational.Demo;

import creational.singleton.design.pattern.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    }
}
