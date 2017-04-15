package com.fpt.safetyrescue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SmokeCalcActivity extends AppCompatActivity implements OnClickListener {

Button btnTimeExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smoke_calc_activity);

        btnTimeExit = (Button) findViewById(R.id.btnTimeExit);
        btnTimeExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTimeExit:
                Intent intent = new Intent(this, TimeExitActivity.class);
                startActivity(intent);
                break;
        }
    }
}
