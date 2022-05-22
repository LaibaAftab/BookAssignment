package com.example.book;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class test2 extends AppCompatActivity {


    ImageButton n;
    ImageButton p;
    Button chck;
    TextView y,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        chck = findViewById(R.id.button3);
        ans = findViewById(R.id.textView34);
        y = findViewById(R.id.textView31);
        n = findViewById(R.id.imageButton3);
        p = findViewById(R.id.imageButton4);

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

         chck.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String s =(String) y.getText();
                 if(s.equals("J"))
                 {
                     ans.setText("Correct");
                 }
                 else
                 {
                     ans.setText("Incorrect");
                 }
             }
         });


    }

}