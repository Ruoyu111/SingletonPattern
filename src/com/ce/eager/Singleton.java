package com.ce.eager;

/**
 * @author Ruoyu Chen
 * Created on 8/17/2018
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
