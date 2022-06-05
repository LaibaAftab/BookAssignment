package com.example.book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class alphAdapter extends ArrayAdapter<alphaList>{
    public alphAdapter(@NonNull Context context, @NonNull ArrayList<alphaList> list)
    {
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        alphaList book = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview1, parent, false);
        TextView textViewName = convertView.findViewById(R.id.zz);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        textViewName.setText(book.alphabet);
        imageView.setImageResource(book.imageID);
        return convertView;
    }
}
