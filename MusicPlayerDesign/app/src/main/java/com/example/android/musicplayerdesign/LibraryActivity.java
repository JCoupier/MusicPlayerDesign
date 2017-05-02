package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_library.xml layout file
        setContentView(R.layout.activity_library);

        // Find the View that shows the player category
        TextView player = (TextView) findViewById(R.id.playerButton);
        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(LibraryActivity.this, PlayerActivity.class);
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
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                if (playlistIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playlistIntent);
                    // Making the transition to be a slide type from left to right (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
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
                Intent settingsIntent = new Intent(LibraryActivity.this, SettingsActivity.class);
                if (settingsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(settingsIntent);
                    // Making the transition to be a slide type from right to left (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });
    }
}
