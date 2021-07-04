package com.example.gridviewlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.GridView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap defaultImage;
        defaultImage =
                BitmapFactory.decodeResource(getResources(), R.mipmap.cookie_foreground);

        ArrayList<GridItem> items =   new ArrayList<GridItem>();
        for (int i = 0 ; i< 50; ++i){
            items.add(new GridItem(
                    defaultImage,
                    String.format("Title-%d",i),
                    new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date())
            ));
        }
        GridAdapter adapter = new GridAdapter(this, items);
        GridView view = findViewById(R.id.gridView);
        view.setAdapter(adapter);
    }


}