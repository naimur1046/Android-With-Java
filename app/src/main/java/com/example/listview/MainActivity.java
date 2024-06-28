package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String>  arryNames;
    ArrayAdapter<String> adapterForNames ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        arryNames=new ArrayList<>();
        listView = findViewById(R.id.list1);

        arryNames.add("Naimur");
        arryNames.add("Sayem");
        arryNames.add("Sakib");
        arryNames.add("Naimur");
        arryNames.add("Sayem");
        arryNames.add("Sakib");
        arryNames.add("Sahid");
        arryNames.add("Tahsin");
        arryNames.add("Emon");
        arryNames.add("Naimur");
        arryNames.add("Sayem");
        arryNames.add("Sakib");
        arryNames.add("Naimur");
        arryNames.add("Sayem");
        arryNames.add("Sakib");
        arryNames.add("Sahid");
        arryNames.add("Tahsin");
        arryNames.add("Emon");

        adapterForNames=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arryNames);
        listView.setAdapter(adapterForNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==2)
                {
                    Toast.makeText(getApplicationContext(), "Your message here", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}