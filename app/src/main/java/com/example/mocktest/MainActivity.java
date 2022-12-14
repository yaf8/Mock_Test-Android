package com.example.mocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkN1;
    private RadioButton rbMale, rbFemale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnN1 = findViewById(R.id.btnN1);
        checkN1 = findViewById(R.id.checkboxN1);
        RadioGroup radioGroup = findViewById(R.id.radioGroupGender);
        rbMale = findViewById(R.id.radioMale);
        rbFemale = findViewById(R.id.radioFemale);

        btnN1.setOnClickListener(v -> {
            if (checkN1.isChecked())
                Toast.makeText(this, "N1 Checked!", Toast.LENGTH_SHORT).show();
            else if (!checkN1.isChecked())
                Toast.makeText(this, "N1 Unchecked!", Toast.LENGTH_SHORT).show();
        });

        checkN1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked)
                Toast.makeText(MainActivity.this, "N1 Checked!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "N1 Unchecked!", Toast.LENGTH_SHORT).show();
        });

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch(checkedId){
                case (R.id.radioMale):
                    Toast.makeText(MainActivity.this, rbMale.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case (R.id.radioFemale):
                    Toast.makeText(MainActivity.this, rbFemale.getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        });


    }
}