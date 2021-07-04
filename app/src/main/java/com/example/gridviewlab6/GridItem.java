package com.example.gridviewlab6;

import android.graphics.Bitmap;

public class GridItem {
    public Bitmap image;
    public String title;
    public String date;

    public GridItem(Bitmap image,String title,String date){
        this.image = image;
        this.title = title;
        this.date = date;
    }
}
