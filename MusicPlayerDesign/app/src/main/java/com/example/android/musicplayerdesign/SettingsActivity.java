package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_settings.xml layout file
        setContentView(R.layout.activity_settings);

        // Find the View that shows the player category
        TextView player = (TextView) findViewById(R.id.playerButton);
        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(SettingsActivity.this, PlayerActivity.class);
                if (playerIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playerIntent);
                    // Making the transition to be a slide type from left to right (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
            }
        });

        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlistButton);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SettingsActivity.this, PlaylistActivity.class);
                if (playlistIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playlistIntent);
                    // Making the transition to be a slide type from left to right (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
            }
        });

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.libraryButton);
        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(SettingsActivity.this, LibraryActivity.class);
                if (libraryIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(libraryIntent);
                    // Making the transition to be a slide type from left to right (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
            }
        });
    }
}
