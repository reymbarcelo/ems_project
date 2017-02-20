package com.example.rey.emsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // This method starts another Activity to search for the solution to the symptom
    public void check(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.symptomList);
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("symptom", String.valueOf(spinner.getSelectedItem()));
        Toast.makeText(this, String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void checkSymptom(View view) {
        TextView tv = (TextView)findViewById(R.id.button);
        String str = tv.getText().toString();
        if (str.equals("yay!")){
            tv.setText("woo!");
        } else tv.setText("yay!");
    }
}