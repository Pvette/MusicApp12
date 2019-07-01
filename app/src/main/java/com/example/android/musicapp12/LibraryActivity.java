package com.example.android.musicapp12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    private Button library;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Blue Train","John Coltrane"));
        albums.add(new Album("The Sidewinder","Lee Morgan"));
        albums.add(new Album("The Turnaround!", "Hank Mobley"));
        albums.add(new Album("Be Good", "Gregory Porter"));
        albums.add(new Album("Moanin", "Art Blakely"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView wordView = new TextView(this);

        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link JazzActivity)
                Intent playIntent = new Intent(LibraryActivity.this, PlayerActivity.class);

                //Start the new activity
                startActivity(playIntent);
            }
        });

    }
}
