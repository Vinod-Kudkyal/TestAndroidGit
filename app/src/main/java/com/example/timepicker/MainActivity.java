package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker ampm , hour;

        ampm = findViewById(R.id.ampmspin);
        hour = findViewById(R.id.hourspin);

        ampm.setIs24HourView(false);
        hour.setIs24HourView(true);
    }
}