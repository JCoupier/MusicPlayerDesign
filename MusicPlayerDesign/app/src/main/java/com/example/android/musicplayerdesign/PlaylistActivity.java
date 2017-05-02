package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_playlist.xml layout file
        setContentView(R.layout.activity_playlist);

        // Find the View that shows the player category
        TextView player = (TextView) findViewById(R.id.playerButton);
        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(PlaylistActivity.this, PlayerActivity.class);
                if (playerIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playerIntent);
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
                Intent libraryIntent = new Intent(PlaylistActivity.this, LibraryActivity.class);
                if (libraryIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(libraryIntent);
                    // Making the transition to be a slide type from right to left (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });

        // Find the View that shows the settings category
        TextView settings = (TextView) findViewById(R.id.settingsButton);
        // Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the settings View is clicked on.
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(PlaylistActivity.this, SettingsActivity.class);
                if (settingsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(settingsIntent);
                    // Making the transition to be a slide type from right to left (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });
    }
}
