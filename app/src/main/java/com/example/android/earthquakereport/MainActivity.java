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
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake(7.2, "San Francisco", "Feb 2, 2016"));

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
