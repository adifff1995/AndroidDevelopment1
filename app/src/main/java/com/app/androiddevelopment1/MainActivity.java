package com.app.androiddevelopment1;


import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    StringBuilder sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
        CheckBox cb_1 = findViewById(R.id.cb_1);
        CheckBox cb_2 = findViewById(R.id.cb_2);
        CheckBox cb_3 = findViewById(R.id.cb_3);
        Spinner sp = findViewById(R.id.sp);
        sb = new StringBuilder();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb.delete(0,sb.length());
                if (cb_1.isChecked())
                    sb.append(cb_1.getText().toString());
                if (cb_2.isChecked())
                    sb.append(cb_2.getText().toString());
                if (cb_3.isChecked())
                    sb.append(cb_3.getText().toString());

                Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();

            }
        });
//        RadioGroup rg = findViewById(R.id.rg);
//        RadioButton rb_male  = findViewById(R.id.rb_male);
//        RadioButton rb_female  = findViewById(R.id.rb_female);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int id = rg.getCheckedRadioButtonId();
//                RadioButton rb = rg.findViewById(id);
//                if (id == -1)
//                    Toast.makeText(MainActivity.this, "Nothing Selected!", Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(MainActivity.this, rb.getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              if (rb_male.isChecked())
//                  Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
//              else if (rb_female.isChecked())
//                  Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show();
//              else
//                  Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show();
//
//            }
//        });

//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int id) {
//                switch (id){
//                    case R.id.rb_male:
//                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.rb_female:
//                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//
//            }
//        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
               switch (position){
                   case 0:
                       Toast.makeText(MainActivity.this, "Palestine", Toast.LENGTH_SHORT).show();
                       break;

                   case 1:
                       Toast.makeText(MainActivity.this, "Egypt", Toast.LENGTH_SHORT).show();
                       break;
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

}