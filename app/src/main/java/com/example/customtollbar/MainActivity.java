package com.example.customtollbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1: Use the correct Toolbar class
        toolbar = findViewById(R.id.tollbar);

        // Set the Toolbar as the Action Bar
        setSupportActionBar(toolbar);

        // Step 2: Set up the Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Health App");
        }

        toolbar.setSubtitle("Committed to providing better service");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.optionNew) {
            Toast.makeText(this, "New Button Clicked", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.optOpen) {
            Toast.makeText(this, "Open Button Clicked", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.optSave) {
            Toast.makeText(this, "Save Button Clicked", Toast.LENGTH_SHORT).show();
        } else if (itemId == android.R.id.home) {
            Toast.makeText(this, "Home Button Clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
