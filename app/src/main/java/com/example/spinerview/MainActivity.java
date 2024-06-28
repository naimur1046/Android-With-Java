package com.example.spinerview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerList;
    ArrayList<String> arrayId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinnerList=findViewById(R.id.spinnerList);
        arrayId= new ArrayList<>();

        arrayId.add("Adhar Card");
        arrayId.add("Voting Card");
        arrayId.add("Reson Card");
        arrayId.add("Electricity Card");
        arrayId.add("Gas Card");
        arrayId.add("Wifi Card");
        arrayId.add("Student Card");

        ArrayAdapter<String> spinerAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,arrayId);

        spinnerList.setAdapter(spinerAdapter);



    }
}