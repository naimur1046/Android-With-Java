package com.example.customalertdialogbox;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button showDialogBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        showDialogBox = findViewById(R.id.btnShowDialogBox);
        showDialogBox.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       Dialog dialog = new Dialog(MainActivity.this);
                       dialog.setContentView(R.layout.custom_dialog_layout);
                       dialog.show();


                    }
                }
        );

    }
}