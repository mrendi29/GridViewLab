package com.example.gridviewlab6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<GridItem> {
    public GridAdapter (Context context, ArrayList<GridItem> items){
        super(context,0,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        GridItem item= (GridItem) getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item,parent,false);
        }

        TextView txtTitle = convertView.findViewById(R.id.txtTitle);
        TextView txtDescription = convertView.findViewById(R.id.txtDescription);
        ImageView image = convertView.findViewById(R.id.imgMain);

        txtTitle.setText(item.title);
        txtDescription.setText(item.date);
        image.setImageBitmap(item.image);

        return convertView;
    }
}
