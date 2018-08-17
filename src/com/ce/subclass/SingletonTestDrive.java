package com.ce.subclass;

/**
 * @author Ruoyu Chen
 * Created on 8/17/2018
 */
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo.hashCode());
        System.out.println(bar.hashCode());
        System.out.println(foo == bar);
        System.out.println(foo.equals(bar));

        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob2));
    }
}
