package com.lasalle.second.part.quiz;

/**
 * Created by albert.denova on 17/01/17.
 */

public class SingletonSample {

    private static SingletonSample instance = null;

    public static SingletonSample getInstance() {
        if(instance == null)
        {
            instance = new SingletonSample();
        }

        return instance;
    }

    protected SingletonSample() {

    }

}
