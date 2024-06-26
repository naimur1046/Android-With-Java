package com.example.intentunderstand;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private Intent fromMainActivity;
    private TextView showData;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        fromMainActivity=getIntent();
        String title= fromMainActivity.getStringExtra("title");
        String name= fromMainActivity.getStringExtra("name");
        int rollNumber=fromMainActivity.getIntExtra("rollNumber",0);

        showData=findViewById(R.id.showData);
        showData.setText(title+" "+name+" "+rollNumber);


    }
}