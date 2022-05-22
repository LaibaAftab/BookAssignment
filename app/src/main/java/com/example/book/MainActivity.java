package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button learn,test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn = findViewById(R.id.learn);
        test = findViewById(R.id.Test);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this,test1.class);
              startActivity(intent);
            }
        });

    }

    public void gotorepo(View view) {
            Uri uri = Uri.parse("https://github.com/LaibaAftab/BookAssignment");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
    }


    public void learn(View view) {
        Intent intent = new Intent(MainActivity.this,Alphabet.class);
        startActivity(intent);
    }
}