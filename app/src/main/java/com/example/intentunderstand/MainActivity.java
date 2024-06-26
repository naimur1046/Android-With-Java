package com.example.intentunderstand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button clickToNext;
    private Intent nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        clickToNext=findViewById(R.id.nextActivity);
        clickToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity= new Intent(getApplicationContext(),SecondActivity.class);
                nextActivity.putExtra("title","Home");
                nextActivity.putExtra("name","Naimur Rahman");
                nextActivity.putExtra("rollNumber",10);

                startActivity(nextActivity);

            }
        });
    }
}