package com.example.gridview;

import java.util.ArrayList;

public class Movies {
    int id;
    String name;

    public Movies(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Movies> init() {
        ArrayList<Movies> arrayList = new ArrayList<>();
        arrayList.add(new Movies(R.drawable.img_01, "Image 01"));
        arrayList.add(new Movies(R.drawable.img_02, "Image 02"));
        arrayList.add(new Movies(R.drawable.img_03, "Image 03"));
        arrayList.add(new Movies(R.drawable.img_04, "Image 04"));
        arrayList.add(new Movies(R.drawable.img_05, "Image 05"));
        arrayList.add(new Movies(R.drawable.img_06, "Image 06"));
        arrayList.add(new Movies(R.drawable.img_07, "Image 07"));
        arrayList.add(new Movies(R.drawable.img_08, "Image 08"));
        arrayList.add(new Movies(R.drawable.img_09, "Image 09"));
        arrayList.add(new Movies(R.drawable.img_10, "Image 10"));
        return arrayList;
    }
}


