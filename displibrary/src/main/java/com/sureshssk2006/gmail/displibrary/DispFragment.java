package com.sureshssk2006.gmail.displibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DispFragment extends Fragment {


    public DispFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_disp, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(DispActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) root.findViewById(R.id.joke_textview);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return root;
    }


}
