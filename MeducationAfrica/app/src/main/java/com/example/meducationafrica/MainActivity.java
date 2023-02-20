package com.example.meducationafrica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button symptomsButton = (Button) findViewById(R.id.symptomsButton);
        Button treatmentButton = (Button) findViewById(R.id.treatmentButton);
        Button firstAidButton = (Button) findViewById(R.id.firstAidButton);
        Button profileButton = (Button) findViewById(R.id.profileButton);


    }
}