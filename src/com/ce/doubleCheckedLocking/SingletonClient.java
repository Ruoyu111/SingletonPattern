package com.ce.doubleCheckedLocking;

/**
 * @author Ruoyu Chen
 * Created on 8/17/2018
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
