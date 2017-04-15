package com.fpt.safetyrescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btnFire;
    Button btnTech;
    Button btnTimer;
    Button btnTruck;
    Button btnSmoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTimer = (Button) findViewById(R.id.btnTimer);
        btnTimer.setOnClickListener(this);
        btnSmoke = (Button) findViewById(R.id.btnSmoke);
        btnSmoke.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTimer:
                Intent intent = new Intent(this, TimerActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSmoke:
                Intent intentSmoke = new Intent(this, SmokeActivity.class);
                startActivity(intentSmoke);
                break;
        }

    }
}
