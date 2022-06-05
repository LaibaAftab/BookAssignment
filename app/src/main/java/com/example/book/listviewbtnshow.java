package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class listviewbtnshow extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewbtnshow);
        list = findViewById(R.id.listview2);

        ArrayList<alphaList> learn = new ArrayList<alphaList>();
        learn.add(new alphaList("A",R.drawable.ant));
        learn.add(new alphaList("B",R.drawable.balloon));
        learn.add(new alphaList("C",R.drawable.cat));
        learn.add(new alphaList("D",R.drawable.duck));
        learn.add(new alphaList("E",R.drawable.egg));
        learn.add(new alphaList("F",R.drawable.fish));
        learn.add(new alphaList("G",R.drawable.goat));
        learn.add(new alphaList("H",R.drawable.hammer));
        learn.add(new alphaList("I",R.drawable.icecream));
        learn.add(new alphaList("J",R.drawable.juice));
        learn.add(new alphaList("K",R.drawable.kite));
        learn.add(new alphaList("L",R.drawable.leaf));
        learn.add(new alphaList("M",R.drawable.mango));
        learn.add(new alphaList("N",R.drawable.nest));
        learn.add(new alphaList("O",R.drawable.owl));
        learn.add(new alphaList("P",R.drawable.parrot));
        learn.add(new alphaList("Q",R.drawable.ques));
        learn.add(new alphaList("R",R.drawable.rat));
        learn.add(new alphaList("S",R.drawable.sun));
        learn.add(new alphaList("T",R.drawable.tree));
        learn.add(new alphaList("U",R.drawable.umbrella));
        learn.add(new alphaList("V",R.drawable.violin));
        learn.add(new alphaList("W",R.drawable.watch));
        learn.add(new alphaList("X",R.drawable.xx));
        learn.add(new alphaList("Y",R.drawable.yoyo));
        learn.add(new alphaList("Z",R.drawable.zebra));
        alphAdapter adapter = new alphAdapter(this,learn);
        list.setAdapter(adapter);
    }
}