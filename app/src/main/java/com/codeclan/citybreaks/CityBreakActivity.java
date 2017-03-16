package com.codeclan.citybreaks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;

import static com.codeclan.citybreaks.R.styleable.View;

public class CityBreakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.citybreak_list);

        CityBreak cityBreak = new CityBreak();
        ArrayList<City> list = cityBreak.getList();

        CityBreakAdapter cityBreakAdapter = new CityBreakAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(cityBreakAdapter);
    }

    public void onCityClick(View textView) {
        TextView city = (TextView) textView;
        Log.d("City Clicked", city.getText().toString());

        String destination = city.getText().toString();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", destination);

        startActivity(intent);
    }

}
