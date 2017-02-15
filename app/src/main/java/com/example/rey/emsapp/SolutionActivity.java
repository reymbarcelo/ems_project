package com.example.rey.emsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class SolutionActivity extends AppCompatActivity {
    HashMap<String, String> checkUp = new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        initMap();
        displayText();

    }
    // This method will eventually be replaced by a database
    private void initMap(){
        checkUp.put("Back pain", "Surgery time");
        checkUp.put("Cough", "Cough drop");
        checkUp.put("Cold", "Don't drink more cold water!");
    }

    private void displayText(){
        Intent intent = getIntent();
        String solution = checkUp.get(intent.getStringExtra("symptom"));

        TextView res = (TextView) findViewById(R.id.txt_solution);
        res.setText(solution);
    }
}
