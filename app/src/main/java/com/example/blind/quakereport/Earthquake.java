package com.example.blind.quakereport;

import android.support.v4.content.ContextCompat;

public class Earthquake {

    private Double mMagnitude;

    private String mLocation;

    private Long mTimeInMilliseconds;

    public Earthquake(Double magnitude, String location, Long timeInMiliseconds){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMiliseconds;
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

}
