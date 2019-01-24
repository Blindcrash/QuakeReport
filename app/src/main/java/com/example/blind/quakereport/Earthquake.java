package com.example.blind.quakereport;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private Long mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, Long timeInMiliseconds){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMiliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }
}
