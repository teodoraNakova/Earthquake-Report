package com.example.android.earthquakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake (double magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getmagnitude() {
        return String.valueOf(mMagnitude);
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
