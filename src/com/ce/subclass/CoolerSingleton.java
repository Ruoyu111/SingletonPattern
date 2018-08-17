package com.ce.subclass;

/**
 * @author Ruoyu Chen
 * Created on 8/17/2018
 */
public class CoolerSingleton extends Singleton {
    // useful instance variables here
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }

    // useful methods here
}
