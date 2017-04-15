package com.fpt.safetyrescue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SmokeActivity extends AppCompatActivity implements OnClickListener{

    Button btnSmokeCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smoke_activity);

        btnSmokeCalc = (Button) findViewById(R.id.btnSmokeCalc);
        btnSmokeCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSmokeCalc:
                Intent intent = new Intent(this, SmokeCalcActivity.class);
                startActivity(intent);
                break;
        }

    }
}
