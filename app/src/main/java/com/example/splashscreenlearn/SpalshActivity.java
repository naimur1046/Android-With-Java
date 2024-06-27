package com.example.splashscreenlearn;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpalshActivity extends AppCompatActivity {
    private Intent nextActivity;
    private Button goToNextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spalsh);

        nextActivity=new Intent(getApplicationContext(),MainActivity.class);

        goToNextActivity=findViewById(R.id.button);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(nextActivity);
            }
        },4000);


        goToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hi");
            }
        });



    }
}