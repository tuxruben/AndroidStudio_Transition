package com.example.transition;


import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
        @Override public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                ImageView image = new ImageView(this);
                setContentView(image);
                TransitionDrawable transition = (TransitionDrawable)getResources().getDrawable(R.drawable.transicion);
                image.setImageDrawable(transition);
                transition.startTransition(2000);
        }

}
