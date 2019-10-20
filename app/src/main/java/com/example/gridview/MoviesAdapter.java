package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MoviesAdapter extends ArrayAdapter<Movies> {
    Context context;
    ArrayList<Movies> arrayList;
    int layout;

    public MoviesAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Movies> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Movies mv = arrayList.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }

        ImageView img = convertView.findViewById(R.id.imageFlag);
        img.setImageResource(mv.getId());


        return convertView;

    }
}
