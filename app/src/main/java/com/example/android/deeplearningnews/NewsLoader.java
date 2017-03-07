package com.example.android.deeplearningnews;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by sal on 3/7/17.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final String LOG_TAG = NewsLoader.class.getName();
    private String mUrl;


    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> earthquakes = QueryUtils.fetchNewsArticle(mUrl);
        Log.i(LOG_TAG, "Returning earthquake list");
        return earthquakes;
    }
}

