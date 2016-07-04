package com.example;

import java.util.Random;

public class MyClass {

    public String getJoke(){
        String[] jokeArray = {"What\'s orange and sounds like a parrot?\n" + "A carrot.",
                "I used to be indecisive. Now I\'m not sure.",
                "When tempted to fight fire with fire, remember that the Fire Department usually uses water.",
        "If you keep your feet firmly on the ground, you\'ll have trouble putting on your pants.",
        "A diplomat is someone who can tell you to go to hell in such a way that you will look forward to the trip."};
        int random = new Random().nextInt(jokeArray.length);
        String str = jokeArray[random];
        return str;
    }
}
