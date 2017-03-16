package com.codeclan.citybreaks;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CityBreakAdapter extends ArrayAdapter<City>{

    public CityBreakAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            View listItemView = convertView;
            if(listItemView == null){
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.citybreak_item, parent, false);
            }
            City currentCity = getItem(position);

            TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
            ranking.setText(currentCity.getPosition().toString());

            TextView city = (TextView) listItemView.findViewById(R.id.city);
            city.setText(currentCity.getDestination().toString());

            TextView season = (TextView) listItemView.findViewById(R.id.season);
            season.setText(currentCity.getSeason().toString());

            return listItemView;


        }

}


