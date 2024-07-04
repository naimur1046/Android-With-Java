package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button buttonShare,buttonMessage,buttonEmail,buttonDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonDial=findViewById(R.id.btnCall);
        buttonShare=findViewById(R.id.btnShare);
        buttonEmail=findViewById(R.id.btnMail);
        buttonMessage=findViewById(R.id.btnMessage);

        buttonDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDial = new Intent(Intent.ACTION_DIAL);

                intentDial.setData(Uri.parse("tel : 01788360952"));
                startActivity(intentDial);
            }
        });

        buttonMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentMessage=new Intent(Intent.ACTION_SEND);

                intentMessage.setData(Uri.parse("smsto : "+Uri.encode("01788360952")));

                intentMessage.putExtra("sms_body","Hi! I am Rumel. How are you?");

                startActivity(intentMessage);
            }
        });

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEmail= new Intent(Intent.ACTION_SEND);
                intentEmail.setType("message/rfc822");

                intentEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{"naimurrahman1046@gmail.com","abc@gmail.com"});
                intentEmail.putExtra(Intent.EXTRA_SUBJECT,"I have some queries");
                intentEmail.putExtra(Intent.EXTRA_TEXT,"Hey Man I have some question! Please give me that questions answer");
                startActivity(Intent.createChooser(intentEmail,"Email Via"));

            }
        });

        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShare=new Intent(Intent.ACTION_SEND);

                intentShare.setType("text/plain");

                intentShare.putExtra(Intent.EXTRA_TEXT,"Please Download this amazing app");
                startActivity(Intent.createChooser(intentShare,"Share Via"));
            }
        });

    }
}