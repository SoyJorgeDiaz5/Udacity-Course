package com.example.android.quakereport;

/**
 * Created by joluditru on 4/12/2016.
 */

public class Earthquake {

    private float mMagnitude;
    private String mLocation;
    private long mTime;
    private String mUrl;

    public Earthquake(float magnitude, String place, long time, String url) {
        mMagnitude = magnitude;
        mLocation = place;
        mTime = time;
        mUrl = url;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(float magnitude) {
        mMagnitude = magnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String place) {
        mLocation = place;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
