package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Movies> arrayList;
    MoviesAdapter mvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        arrayList = Movies.init();

        mvAdapter = new MoviesAdapter(MainActivity.this, R.layout.cell, arrayList);
        gridView.setAdapter(mvAdapter);
    }

}
