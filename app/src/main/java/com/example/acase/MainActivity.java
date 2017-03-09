package com.example.acase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
RadioButton button1;
    RadioButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  button1 = (RadioButton) findViewById(R.id.radioButton);
        button2 = (RadioButton) findViewById(R.id.radioButton2);
        button1.setOnClickListener(this);
    button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.radioButton:
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
button2.setChecked(false);
                break;
            case R.id.radioButton2:
                Intent intent2 = new Intent(this,LoginActivity2.class);
                startActivity(intent2);
                button1.setChecked(false);
                break;
            default:


        }

    }
}
