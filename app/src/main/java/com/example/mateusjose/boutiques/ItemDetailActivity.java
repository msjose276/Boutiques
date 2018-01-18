package com.example.mateusjose.boutiques;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

    }

    public void Back(View view){
        ImageView imageView=(ImageView) findViewById(R.id.ivItemImage);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.calca));
    }

    public void Front(View view){
        ImageView imageView=(ImageView) findViewById(R.id.ivItemImage);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.acessorio));

    }






}
