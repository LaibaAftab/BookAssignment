package com.example.book;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Alphabet extends AppCompatActivity {
    Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z,HOME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabets);

        A = findViewById(R.id.buttonA);
        B = findViewById(R.id.buttonB);
        C = findViewById(R.id.buttonC);
        D = findViewById(R.id.buttonD);
        E = findViewById(R.id.buttonE);
        F = findViewById(R.id.buttonF);
        G = findViewById(R.id.buttonG);
        H = findViewById(R.id.buttonH);
        I = findViewById(R.id.buttonI);
        J = findViewById(R.id.buttonJ);
        K = findViewById(R.id.buttonK);
        L = findViewById(R.id.buttonL);
        M = findViewById(R.id.buttonM);
        N = findViewById(R.id.buttonN);
        O = findViewById(R.id.buttonO);
        P = findViewById(R.id.buttonP);
        Q = findViewById(R.id.buttonQ);
        r = findViewById(R.id.buttonR);
        S = findViewById(R.id.buttonS);
        T = findViewById(R.id.buttonT);
        U = findViewById(R.id.buttonU);
        V = findViewById(R.id.buttonV);
        W = findViewById(R.id.buttonW);
        X = findViewById(R.id.buttonX);
        Y = findViewById(R.id.buttonY);
        Z = findViewById(R.id.buttonZ);
        HOME = findViewById(R.id.buttonF18);


        //creating instances

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","A");
                startActivity(intent);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","B");
                startActivity(intent);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","C");
                startActivity(intent);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","D");
                startActivity(intent);
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","E");
                startActivity(intent);
            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","F");
                startActivity(intent);
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","G");
                startActivity(intent);
            }
        });

        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","H");
                startActivity(intent);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","I");
                startActivity(intent);
            }
        });

        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","J");
                startActivity(intent);
            }
        });

        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","K");
                startActivity(intent);
            }
        });

        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","L");
                startActivity(intent);
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","M");
                startActivity(intent);
            }
        });

        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","N");
                startActivity(intent);
            }
        });

        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","O");
                startActivity(intent);
            }
        });

        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","P");
                startActivity(intent);
            }
        });

        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","Q");
                startActivity(intent);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","R");
                startActivity(intent);
            }
        });

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","S");
                startActivity(intent);
            }
        });

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","T");
                startActivity(intent);
            }
        });

        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","U");
                startActivity(intent);
            }
        });

        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","V");
                startActivity(intent);
            }
        });

        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","W");
                startActivity(intent);
            }
        });

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","X");
                startActivity(intent);
            }
        });

        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","Y");
                startActivity(intent);
            }
        });

        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,a.class);
                intent.putExtra("Alphabet","Z");
                startActivity(intent);
            }
        });


        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }

}