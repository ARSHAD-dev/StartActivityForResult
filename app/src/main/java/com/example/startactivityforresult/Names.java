package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
/*
created by Arshad Khan....
 */

public class Names extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton rb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);
        rg1 = (RadioGroup) findViewById(R.id.radiogroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int id = rg1.getCheckedRadioButtonId();
                rb1 = (RadioButton) findViewById(id);
                String name = rb1.getText().toString();
                Intent in1 = new Intent();
                in1.putExtra("name1", name);
                setResult(RESULT_OK, in1);
                finish();
            }

        });

    }
    }
