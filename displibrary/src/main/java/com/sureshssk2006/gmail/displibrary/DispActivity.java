package com.sureshssk2006.gmail.displibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DispActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp);
    }
}
