package com.example.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class test1 extends AppCompatActivity {

    ImageButton n;
    ImageButton p;
    Button nxt,chck;
    TextView y,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        chck = findViewById(R.id.button2);
        nxt = findViewById(R.id.buttonn);
        y = findViewById(R.id.textView29);
        n = findViewById(R.id.imageButton);
        p = findViewById(R.id.imageButton2);
        ans = findViewById(R.id.textView32);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = (String)y.getText();
                char alphabet = s.charAt(0);
                int ascii = (int) alphabet;
                if(ascii<90)
                {
                    ascii++;
                }
                else
                {
                    ascii=65;
                }
                  alphabet =(char) ascii;
                  s = Character.toString(alphabet);
                  y.setText(s);

            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = (String)y.getText();
                char alphabet = s.charAt(0);
                int ascii = (int) alphabet;
                if(ascii>65)
                {
                    ascii--;
                }
                else
                {
                    ascii=90;
                }
                alphabet =(char) ascii;
                s = Character.toString(alphabet);
                y.setText(s);

            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(test1.this,test2.class);
                startActivity(intent);
            }
        });

        chck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = (String) y.getText();
                if(s.equals("G"))
                {
                    ans.setText("Correct");
                }
                else
                {
                    ans.setText("InCorrect");
                }
            }
        });

    }

}