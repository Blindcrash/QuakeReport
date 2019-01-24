package com.example.blind.quakereport;

import android.support.v4.content.ContextCompat;

public class Earthquake {

    private Double mMagnitude;

    private String mLocation;

    private Long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(Double magnitude, String location, Long timeInMiliseconds, String url){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMiliseconds;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
