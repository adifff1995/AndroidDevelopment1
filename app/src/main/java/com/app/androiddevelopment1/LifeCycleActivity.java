package com.app.androiddevelopment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {
    int count = 0;
    TextView tv_count;
    Context context = LifeCycleActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e( "onCreate: ","onCreate" );
        Button btn_increment = findViewById(R.id.btn_increment);
        Button btn_decrement = findViewById(R.id.btn_decrement);
        tv_count = findViewById(R.id.tv_counter);

        btn_increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv_count.setText(String.valueOf(count));
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
            }
        });
        btn_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tv_count.setText(String.valueOf(count));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e( "onStart: ","onStart" );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e( "onResume: ","onResume" );

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e( "onPause: ","onPause" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e( "onStop: ","onStop" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e( "onRestart: ","onRestart" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("data",count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("data");
//        tv_count.setText(String.valueOf(count));
    }
}