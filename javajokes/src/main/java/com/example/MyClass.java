package com.example;

import java.util.Random;

public class MyClass {

    public static String getJoke(){
        String[] jokeArray = {"A", "B", "C"};
        int random = new Random().nextInt(jokeArray.length);
        String str = jokeArray[random];
        return str;
    }
}
