package com.example.android.deeplearningnews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NewsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);

        final ArrayList<News> location = new ArrayList<News>();

        location.add(new News("In today's world...", "George Washington", "04/07/77","The Section"));
        location.add(new News("In tomorrows world...", "Alien 243", "08/25/99","The Section X"));


        mAdapter = new NewsAdapter(this, location);

        listView.setAdapter(mAdapter);


    }
}

