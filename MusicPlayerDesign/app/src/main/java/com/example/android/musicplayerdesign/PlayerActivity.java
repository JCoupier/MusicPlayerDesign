package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    private boolean isPlayPressed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_player.xml layout file
        setContentView(R.layout.activity_player);

        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlistButton);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PlayerActivity.this, PlaylistActivity.class);
                if (playlistIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playlistIntent);
                    // Making the transition to be a slide type from right to left (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
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
                Intent libraryIntent = new Intent(PlayerActivity.this, LibraryActivity.class);
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
                Intent settingsIntent = new Intent(PlayerActivity.this, SettingsActivity.class);
                if (settingsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(settingsIntent);
                    // Making the transition to be a slide type from right to left (see @anim folder)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });

        // Find the View that shows the playPauseButton category
        final ImageView bt_play_pause = (ImageView) findViewById(R.id.playPauseButton);
        // Set a click listener on that View
        bt_play_pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playPauseButton View is clicked on.
            @Override
            public void onClick(View view) {
                if (isPlayPressed) {
                    bt_play_pause.setImageResource(R.drawable.ic_pause_white);
                    isPlayPressed = false;
                } else {
                    bt_play_pause.setImageResource(R.drawable.ic_play_arrow_white);
                    isPlayPressed = true;
                }
            }
        });
    }
}
