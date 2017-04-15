package com.fpt.safetyrescue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TimeExitActivity extends AppCompatActivity implements OnClickListener {

    Button button3;
    EditText minPressure;
    EditText savePressure;
    EditText volBal;
    TextView textView17;

    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_exit_activity);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        minPressure = (EditText) findViewById(R.id.minPressure);
        minPressure.setOnClickListener(this);
        savePressure = (EditText) findViewById(R.id.savePressure);
        savePressure.setOnClickListener(this);
        volBal = (EditText) findViewById(R.id.volBal);
        volBal.setOnClickListener(this);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(this);

    }

    //добавить обработку пустых ячеек
    @Override
    public void onClick(View v) {
        int num1 = 0;
        int num2 = 0;
        float num3 = 0;
        float result = 0;

        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(minPressure.getText().toString())
                || TextUtils.isEmpty(savePressure.getText().toString())
                || TextUtils.isEmpty(volBal.getText().toString())) {
            return;
        }

        num1 = Integer.parseInt(minPressure.getText().toString());
        num2 = Integer.parseInt(savePressure.getText().toString());
        num3 = Float.parseFloat(volBal.getText().toString());


        switch (v.getId()) {
            case R.id.button3:
                result = (num1 - num2) * num3 / 40;
                sPref = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor ed = sPref.edit();
                break;

        }
        textView17.setText(String.valueOf(result));
    }

}


