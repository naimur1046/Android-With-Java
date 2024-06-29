package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerContact;
    ArrayList<ContactModel> arrayContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        recyclerContact= findViewById(R.id.recyclerContact);
        recyclerContact.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        arrayContacts=new ArrayList<>();

        ContactModel model1=new ContactModel(R.drawable.a,"Naimur Rahman","041788360952");
        ContactModel model2=new ContactModel(R.drawable.b,"Mizanur Rahman","041758360952");
        ContactModel model3=new ContactModel(R.drawable.c,"Rahat Rahman","041755360952");
        ContactModel model4=new ContactModel(R.drawable.d,"Shamim Rahman","041766360952");
        ContactModel model5=new ContactModel(R.drawable.e,"Hamim Rahman","041788360952");
        ContactModel model6=new ContactModel(R.drawable.f,"Nahidur Rahman","041788360952");

        arrayContacts.add(model1);
        arrayContacts.add(model2);
        arrayContacts.add(model3);
        arrayContacts.add(model4);
        arrayContacts.add(model5);
        arrayContacts.add(model6);

        RecyclerContactAdapter recyclerContactAdapter = new RecyclerContactAdapter(getApplicationContext(),arrayContacts);
        recyclerContact.setAdapter(recyclerContactAdapter);

    }
}