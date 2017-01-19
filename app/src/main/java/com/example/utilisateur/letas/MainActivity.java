package com.example.utilisateur.letas;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {



    int i = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageContainer = (ImageView) findViewById(R.id.imageView);
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.carte);
        list.add(R.drawable.human_reference);
        Collections.shuffle(list);
        imageContainer.setImageResource(list.get(0));

        imageContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == list.size() + 1) {
                    i = 0;
                }
                imageContainer.setImageResource(list.get(i));
            }
        });


    }


}
