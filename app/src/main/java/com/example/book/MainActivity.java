package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

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

    public void list(View view) {
        Intent intent2 = new Intent(MainActivity.this,listviewbtnshow.class);
        startActivity(intent2);
//        ListView Book;
//        ArrayList<alphaList> learn = new ArrayList<alphaList>();
//        learn.add(new alphaList("A",R.drawable.ant));
//        learn.add(new alphaList("B",R.drawable.balloon));
//        learn.add(new alphaList("C",R.drawable.cat));
//        learn.add(new alphaList("D",R.drawable.duck));
//        learn.add(new alphaList("E",R.drawable.egg));
//        learn.add(new alphaList("F",R.drawable.fish));
//        alphAdapter adapter = new alphAdapter(this,learn);
//        Book = findViewById(R.id.listView);
//        Book.setAdapter(adapter);
    }
}