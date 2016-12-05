package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joluditru on 4/12/2016.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the earthquake_list_item.xml layout with the ID tv_magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.tv_magnitude);

        // Get the magnitude value from the current Earthquake object and
        // set this text on the name TextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the earthquake_list_item.xml layout with the ID tv_city
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.tv_city);

        // Get the city name from the current Earthquake object and
        // set this text on the name TextView
        cityTextView.setText(currentEarthquake.getCity());

        // Find the TextView in the earthquake_list_item.xml layout with the ID tv_date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.tv_date);

        // Get the date from the current Earthquake object and
        // set this text on the name TextView
        dateTextView.setText(currentEarthquake.getDate());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
