package com.example.tito.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = findViewById(R.id.orientation);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.horizontal:
                        radioGroup.setOrientation(LinearLayout.HORIZONTAL);
                        break;
                    case R.id.vertical:
                        radioGroup.setOrientation(LinearLayout.VERTICAL);
                        break;
                }
            }
        });
    }

    public void onClick (View view){
        EditText input = findViewById(R.id.main_input);
        String string = input.getText().toString();

        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }
}
