package com.example.utilisateur.letas;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView carte = (ImageView) findViewById(R.id.imageView);
        Drawable drawable = findViewById(R.drawable.carte);
        carte.setImageDrawable();
    }


}