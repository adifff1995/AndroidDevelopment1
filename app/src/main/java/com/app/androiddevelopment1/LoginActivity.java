package com.app.androiddevelopment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Context context = LoginActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.button3);
        Button share = findViewById(R.id.button5);
        Button open = findViewById(R.id.button6);
        EditText ed_name = findViewById(R.id.ed_name);
        EditText ed_email = findViewById(R.id.ed_email);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HomeActivity.class);
                intent.putExtra("name", ed_name.getText().toString());
                intent.putExtra("email", ed_email.getText().toString());
                startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent  = new Intent();
               intent.setAction(Intent.ACTION_SEND);
               intent.putExtra(Intent.EXTRA_TEXT,ed_name.getText().toString());
               intent.setType("text/plain");
               startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,ed_name.getText().toString());
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.ps/"));
                startActivity(intent);
            }
        });
    }
}