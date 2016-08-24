package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button btnJoke;
    ProgressBar progressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        btnJoke = (Button) root.findViewById(R.id.telljoke_btn);
        progressBar = (ProgressBar) root.findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);

        btnJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                new EndpointsAsync.EndpointsAsyncTask().execute(new Pair<Context, String>(getActivity(), "Manfred"));
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(progressBar != null){
            progressBar.setVisibility(View.GONE);
        }
    }
}
