package com.example.recyclerview;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.ContactModel;
import com.example.recyclerview.R;
import com.example.recyclerview.RecyclerContactAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerContact;
    ArrayList<ContactModel> arrayContacts;
    FloatingActionButton actionButton;

    EditText updateName;
    EditText updateContactNumber;
    ImageView updateImage;
    Button submitButton;
    Button buttonUploadImage;

    // This is used for storeUpdated
    String nameInserted;
    String contactNumberInserted;
    int imageResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerContact = findViewById(R.id.recyclerContact);
        recyclerContact.setLayoutManager(new LinearLayoutManager(this));
        arrayContacts = new ArrayList<>();

        // Sample data
        ContactModel model1 = new ContactModel(R.drawable.a, "Naimur Rahman", "041788360952");
        ContactModel model2 = new ContactModel(R.drawable.b, "Mizanur Rahman", "041758360952");
        ContactModel model3 = new ContactModel(R.drawable.c, "Rahat Rahman", "041755360952");
        ContactModel model4 = new ContactModel(R.drawable.d, "Shamim Rahman", "041766360952");
        ContactModel model5 = new ContactModel(R.drawable.e, "Hamim Rahman", "041788360952");
        ContactModel model6 = new ContactModel(R.drawable.f, "Nahidur Rahman", "041788360952");

        arrayContacts.add(model1);
        arrayContacts.add(model2);
        arrayContacts.add(model3);
        arrayContacts.add(model4);
        arrayContacts.add(model5);
        arrayContacts.add(model6);

        RecyclerContactAdapter recyclerContactAdapter = new RecyclerContactAdapter(this, arrayContacts);
        recyclerContact.setAdapter(recyclerContactAdapter);

        actionButton = findViewById(R.id.floatingButton);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_layout);

                // Use dialog.findViewById() to get views inside the dialog
                updateName = dialog.findViewById(R.id.updateName);
                updateContactNumber = dialog.findViewById(R.id.updateContactNumber);
                updateImage = dialog.findViewById(R.id.updateImage);
                submitButton = dialog.findViewById(R.id.submitButton);
                buttonUploadImage = dialog.findViewById(R.id.buttonUploadImage);

                buttonUploadImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Implement your image upload logic here
                        // For example, show image in ImageView
                        updateImage.setImageResource(R.drawable.a);
                        updateImage.setVisibility(View.VISIBLE); // Show the image preview
                    }
                });

                submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nameInserted = updateName.getText().toString();
                        contactNumberInserted = updateContactNumber.getText().toString();
                        // Use the resource ID directly
                        imageResource = R.drawable.a;

                        ContactModel model_get = new ContactModel(imageResource, nameInserted, contactNumberInserted);
                        arrayContacts.add(model_get);

                        recyclerContactAdapter.notifyItemInserted(arrayContacts.size());
                        recyclerContact.scrollToPosition(arrayContacts.size() - 1);

                        dialog.dismiss(); // Close the dialog after adding the contact
                    }
                });

                dialog.show();
            }
        });
    }
}
