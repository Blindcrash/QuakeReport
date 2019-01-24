package com.example.blind.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0 , earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View lisItemView = convertView;
        if (lisItemView == null){
            lisItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeView = (TextView) lisItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView locationView = (TextView) lisItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getLocation());


        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        TextView dateView = (TextView) lisItemView.findViewById(R.id.date);
        String formattedDate = formatDate (dateObject);
        dateView.setText(formattedDate);

        TextView timeView =(TextView) lisItemView.findViewById(R.id.time);
        String formattedTime = formatTime (dateObject);
        timeView.setText(formattedTime);
        return  lisItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
