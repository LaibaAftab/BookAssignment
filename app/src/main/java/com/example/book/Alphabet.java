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
                startActivity(intent);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,b.class);
                startActivity(intent);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,c.class);
                startActivity(intent);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,d.class);
                startActivity(intent);
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,e.class);
                startActivity(intent);
            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,f.class);
                startActivity(intent);
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,g.class);
                startActivity(intent);
            }
        });

        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,h.class);
                startActivity(intent);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,i.class);
                startActivity(intent);
            }
        });

        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,j.class);
                startActivity(intent);
            }
        });

        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,k.class);
                startActivity(intent);
            }
        });

        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,l.class);
                startActivity(intent);
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,m.class);
                startActivity(intent);
            }
        });

        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,n.class);
                startActivity(intent);
            }
        });

        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,o.class);
                startActivity(intent);
            }
        });

        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,p.class);
                startActivity(intent);
            }
        });

        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,q.class);
                startActivity(intent);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,r.class);
                startActivity(intent);
            }
        });

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,s.class);
                startActivity(intent);
            }
        });

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,t.class);
                startActivity(intent);
            }
        });

        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,u.class);
                startActivity(intent);
            }
        });

        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,v.class);
                startActivity(intent);
            }
        });

        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,w.class);
                startActivity(intent);
            }
        });

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,x.class);
                startActivity(intent);
            }
        });

        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,y.class);
                startActivity(intent);
            }
        });

        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Alphabet.this,z.class);
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