package com.example.autocomplete;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteList;
    ArrayList<String> arrayLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        autoCompleteList=findViewById(R.id.autoCompleteList);
        arrayLanguages=new ArrayList<>();
        arrayLanguages.add("C");
        arrayLanguages.add("C++");
        arrayLanguages.add("Java");
        arrayLanguages.add("Python");
        arrayLanguages.add("Rubby");

        ArrayAdapter<String> autoCompleteAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayLanguages);
        autoCompleteList.setAdapter(autoCompleteAdapter);
    }
}