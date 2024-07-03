package com.example.notificationbar;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    public static final String ChannelId = "MyChannel";
    public static final int NotificationId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the drawable and convert it to a bitmap
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.database);
        if (drawable == null) {
            // Handle error case if drawable is null
            return;
        }
        Bitmap largeIcon = ((BitmapDrawable) drawable).getBitmap();

        // Get notification manager
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // Create notification channel for API 26+ (Android Oreo and newer)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    ChannelId,
                    "My Channel",
                    NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(channel);
        }

        // Build the notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, ChannelId)
                .setSmallIcon(R.drawable.database)  // Set your small icon here
                .setLargeIcon(largeIcon)
                .setContentTitle("New Message")
                .setContentText("New Message from Rumel")
                .setSubText("New Message Subtext")
                .setPriority(NotificationCompat.PRIORITY_HIGH); // Ensure priority is set

        // Notify using the notification manager
        notificationManager.notify(NotificationId, builder.build());
    }
}
