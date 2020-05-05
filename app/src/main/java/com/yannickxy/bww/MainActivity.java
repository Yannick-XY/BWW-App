package com.yannickxy.bww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        float densityFactor = getResources().getDisplayMetrics().density;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //als neue App für Telefonnnumern hinterlegen
        Intent DialIntent = new Intent(Intent.ACTION_DIAL);

        TextView hello = findViewById(R.id.hello);
        hello.setText("Haha");
    }
}
