package com.example.learningzone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView animation_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        animation_view = findViewById(R.id.animation_view);



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                animation_view.setAnimation(R.raw.animation);
                finish();
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

            }
        },4000);



    }
}