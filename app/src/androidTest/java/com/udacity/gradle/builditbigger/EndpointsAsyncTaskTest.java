package com.udacity.gradle.builditbigger;

import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by tobi on 07.03.18.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {

    public void test() throws ExecutionException, InterruptedException {
        String joke;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<>(getContext(), "Joke"));

        joke = endpointsAsyncTask.get();

        Log.d(EndpointsAsyncTask.class.getSimpleName(), joke);
        Assert.assertNotNull(joke);
        Assert.assertNotSame("", joke);
    }

}