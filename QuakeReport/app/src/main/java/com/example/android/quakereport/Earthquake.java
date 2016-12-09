package com.example.android.quakereport;

/**
 * Created by joluditru on 4/12/2016.
 */

public class Earthquake {

    private float mMagnitude;
    private String mLocation;
    private long mTime;

    public Earthquake(float magnitude, String place, long time) {
        this.mMagnitude = magnitude;
        this.mLocation = place;
        this.mTime = time;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(float magnitude) {
        this.mMagnitude = magnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String place) {
        this.mLocation = place;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        this.mTime = time;
    }
}
