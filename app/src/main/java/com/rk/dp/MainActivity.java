package com.rk.dp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker DP_1_IDJAVA;
    TextView TV_1_IDJAVA;

    Calendar Kalender = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DP_1_IDJAVA = findViewById(R.id.DP_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);

        DP_1_IDJAVA.init(Kalender.get(Calendar.YEAR), Kalender.get(Calendar.MONTH), Kalender.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                TV_1_IDJAVA.setText(dayOfMonth + " - " + monthOfYear + " - " + year);
            }
        });

    }
}
