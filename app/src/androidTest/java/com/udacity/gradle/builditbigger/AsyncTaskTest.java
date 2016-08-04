package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

public class AsyncTaskTest extends AndroidTestCase {

    public void AsyncTest() {
        String result = null;
        AsyncTask<Pair<Context, String>, Void, String> endpointAsync = new EndpointsAsync.EndpointsAsyncTask()
                .execute(new Pair<Context, String>(getContext(), "Manfred"));
        try {
            result = endpointAsync.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
