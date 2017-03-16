package com.codeclan.citybreaks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String destination = extras.getString("result");

        CityBreak cityBreak = new CityBreak();
        City city = cityBreak.findCityByCityString(destination);
        String topSight =city.getTopSight();
        String topRestaurant = city.getBestRestaurant();
        resultText= (TextView)findViewById(R.id.result_text);
        resultText.setText("Best Sight: " + topSight + ",\n" +
                "Best Restaurant: " + topRestaurant + ".");
    }
}
