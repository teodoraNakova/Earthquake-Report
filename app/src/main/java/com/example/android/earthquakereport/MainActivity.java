package com.example.android.earthquakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake(7.333, "42 km W of San Francisco", 1793459375));
        earthquakes.add(new Earthquake(7.333, "San Francisco", 1793459375));
        earthquakes.add(new Earthquake(1.0, "San Francisco", 1793459375));
        earthquakes.add(new Earthquake(5.2, "San Francisco", 1793459375));
        earthquakes.add(new Earthquake(3.2, "San Francisco", 1793459375));
        earthquakes.add(new Earthquake(4.2, "San Francisco", 1793459375));
        earthquakes.add(new Earthquake(10.2, "San Francisco", 1793459375));

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
